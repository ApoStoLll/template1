package frog.company.app13june;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.PersistableBundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;

import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class WActivity extends AppCompatActivity {

    WebView we;
    public ValueCallback<Uri[]> mFilePathCallback;
    Uri calback;
    private String lerfi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        we = findViewById(R.id.wfwe);
        lerfi = getIntent().getExtras().getString(Config.sharedStr);
        sett();
    }

    void sett(){
        we.getSettings().setAllowContentAccess(true);
        we.getSettings().setAllowFileAccess(true);
        we.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        we.getSettings().setAllowFileAccessFromFileURLs(true);
        we.getSettings().setMixedContentMode(0);
        we.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        String usrAgent = we.getSettings().getUserAgentString();
        we.getSettings().setUserAgentString(usrAgent.replace("; wv", ""));
        we.getSettings().setAppCacheEnabled(true);
        we.getSettings().setDomStorageEnabled(true);
        we.getSettings().setJavaScriptEnabled(true);
        we.getSettings().setDatabaseEnabled(true);
        we.getSettings().setAllowUniversalAccessFromFileURLs(true);
        we.getSettings().setUseWideViewPort(true);
        we.getSettings().setLoadWithOverviewMode(true);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(we, true);
        we.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
                requestPermissionLauncher.launch(Manifest.permission.CAMERA);
                mFilePathCallback = filePathCallback;
                return true;
            }
        });
        we.setWebViewClient(new Client());
        we.loadUrl(lerfi);
    }

    public class Client extends WebViewClient{

        Boolean content;
        String method;

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            String uri = request.getUrl().toString();
            if(uri.contains("/")) {
                Log.e("Uri", uri);
                if(uri.contains("intent://ti/p/") && uri.contains("#")){
                    String newUr = "line://ti/p/@";
                    newUr += uri.split("@")[1].split("#Inten")[0];
                    Log.e("newUr", newUr);
                    Log.e("parsing", Uri.parse(newUr).toString());
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(newUr)));
                    return true;
                } else {
                    if(uri.contains("http")){
                        content = false;
                        return content;
                    }
                    else {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)));
                        return true;
                    }
                }
            }
            else return true;
        }

        @Override
        public void onReceivedLoginRequest(WebView view, String realm, @Nullable String account, String args) {
            method = "OnReceivedLoginReq";
            super.onReceivedLoginRequest(view, realm, account, args);
        }
    }

    final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File photoFile = null;
                try {
                    photoFile = File.createTempFile("file", ".jpg",getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                } catch (IOException ex) {
                    Log.e("PhotoFile","Unable to cre",ex);
                }

                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(photoFile));
                calback = Uri.fromFile(photoFile);

                Intent old = new Intent(Intent.ACTION_GET_CONTENT);
                old.addCategory(Intent.CATEGORY_OPENABLE);
                old.setType("*/*");

                Intent[] intentArray = new Intent[]{takePictureIntent};
                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                chooserIntent.putExtra(Intent.EXTRA_INTENT,old);
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,intentArray);
                startActivityForResult(chooserIntent,1);
            });

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (mFilePathCallback == null) return;
        if (resultCode == -1) {
            if (data != null) {
                String d = data.getDataString();
                if (d != null) {
                    Uri u = Uri.parse(d);
                    mFilePathCallback.onReceiveValue(new Uri[]{u});
                } else {
                    if (calback != null) {
                        mFilePathCallback.onReceiveValue(new Uri[]{calback});
                    } else {
                        mFilePathCallback.onReceiveValue(null);
                    }
                }
            } else {
                if (calback != null) {
                    mFilePathCallback.onReceiveValue(new Uri[]{calback});
                } else {
                    mFilePathCallback.onReceiveValue(null);
                }
            }
        } else {
            mFilePathCallback.onReceiveValue(null);
        }
        mFilePathCallback = null;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        we.saveState(outState);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == 4) && we.canGoBack()) {
            we.goBack();
            return true;
        }
        return false;
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        we.restoreState(savedInstanceState);
    }
}
