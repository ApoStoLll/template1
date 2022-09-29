package frog.company.app13june;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;

public class Client extends WebViewClient {

    Boolean content;
    String method;
    Activity tsgtrg;

    Client(Activity greg){
        tsgtrg = greg;
    }

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
                tsgtrg.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(newUr)));
                return true;
            } else {
                if(uri.contains("http")){
                    content = false;
                    return content;
                }
                else {
                    tsgtrg.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)));
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