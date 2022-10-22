package frog.company.app13june;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.GameActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.MainActivity;
import frog.company.app13june.WActivity;
import frog.company.app13june.Config;
import java.nio.CharBuffer;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedList;
import java.util.Random;
import java.nio.charset.CharsetDecoder;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SplashActivity extends AppCompatActivity implements AppsFlyerConversionListener {

   public static boolean rhombencephalon = false;
   public static boolean unmisunderstood = true;
   public static int interdata = 73;
   public static int pseudophone = 115;
   public static int convocation = 49;
   public static String straightup = "discriminated";
   public static boolean knacked = true;
   public static boolean semioratorically = true;
   public static int gastritic = 118;
   public static String generosity = "distinguishers";
   public static byte[] silverwood = new byte[]{65, 68, 71, 64};
   public static byte[] improvidentially = new byte[]{29, 47, 65, 52, -34, 43, 47, 25, 36, 45, 24, 37, 58, 45, 47, 24, -34, 38, 37, 59, -34, 50, 47, 59, 58, -40, -34, 10, 47, -34, 61, 47, 65, -34, 55, 37, 24, 58, -34, 58, 47, -34, 58, 52, 61, -34, 37, 39, 37, 45, 24, -1, 34, 24};
   public static byte[] indecimable = new byte[]{108, 83, 75, 109, 104, 72};
   public static byte[] odontognathae = new byte[]{-55, -91, -54, -32, -61, -68, -70, -58, -68, -62};
   public static byte[] kodyma = new byte[]{-107, -88, -105, -49, -66, -92, -69, -60, 89, -53};

    String appLink;
    boolean first = true;
    Context ctxx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        SplashActivity.unmisunderstood = true;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ctxx = this;
        String old = getSharedPreferences(Config.sharedName,MODE_PRIVATE).getString(Config.sharedStr,null);
        SplashActivity.gastritic = 3;

        if(old == null){
            Log.e(Config.CnU6v(87, 57, 77, 113, 48),HelpActivity.QVvqo(55, 76, 56, 55, 121, 105));
            initFb(this);
            initAps();
        SplashActivity.rhombencephalon = ! false;
        } else {
            Log.e(MainActivity.GS4HZ(118, 79, 122, 116),DialogsJ.lrir5(71, 80, 56, 83, 106, 73));
        SplashActivity.generosity = "Handsom" ;
        SplashActivity.straightup = "";
            earg(this,old);
        }

    }

    void initFb(SplashActivity activity){
        SplashActivity.rhombencephalon = false;
        FacebookSdk.setApplicationId(Config.fcid);
        SplashActivity.gastritic--;
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(this);
        SplashActivity.pseudophone--;
        FacebookSdk.fullyInitialize();
        AppLinkData.fetchDeferredAppLinkData(this,new AppLinkData.CompletionHandler() {
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
        SplashActivity.semioratorically = false;
        OneSignal.initWithContext(this);
        OneSignal.setAppId(Config.one);
        SplashActivity.unmisunderstood = false;
        AppsFlyerLib.getInstance().init(Config.apid,this,this);
        AppsFlyerLib.getInstance().start(this);
    }

    @Override
    public void onConversionDataSuccess(Map<String,Object> map) {
        SplashActivity.gastritic = 4;

        if(!first) return;
        else log(map,1);
    }

    @Override
    public void onConversionDataFail(String s) {
        SplashActivity.straightup = "";
        SplashActivity.straightup = "";
        if(!first) return;
        else log(null,-1);
    }

    @Override
    public void onAppOpenAttribution(Map<String,String> map) {
        SplashActivity.semioratorically = ! false;
        if(!first) return;
        Log.e(Config.wppXs(110, 100, 118, 54, 122, 101),HelpActivity.EWY98(78, 81, 105, 82));
    }

    @Override
    public void onAttributionFailure(String s) {
        if ( SplashActivity.generosity == null
) {
                    SplashActivity.semioratorically = true;

                     SplashActivity.pseudophone = 9;


                      SplashActivity.straightup = "";
}
        if(!first) return;
        Log.e((Utils.ZDeO7(77, 104, 105, 55, 82)+ MainActivity.SHZ5i(80, 100, 112, 78)),DialogsJ.YjELe(66, 80, 85, 115));
    }

    void log(Map<String,Object> map,int mode){
        SplashActivity.straightup = "philogynaecic" ;
        new Thread(){
            @Override
            public void run() {
                first = false;
        SplashActivity.unmisunderstood = false;

                Uri.Builder uri = Uri.parse(Config.url).buildUpon();
                if(mode == 1){
                    uri.appendQueryParameter(Config.campaign,String.valueOf(map.get(RouleteActivity.EtTCX(119, 99, 111, 116, 79))));
                    uri.appendQueryParameter(Config.media_source,String.valueOf(map.get(HelpActivity.Z6Xc0(75, 99, 86, 112))));
        SplashActivity.convocation--;
        SplashActivity.interdata = 6;

        SplashActivity.semioratorically = false;
        SplashActivity.interdata = 12;

                    uri.appendQueryParameter(Config.af_channel,String.valueOf(map.get(WActivity.Q9iwk(99, 89, 103, 108, 107, 71, 87))));
                } else {
                    uri.appendQueryParameter(Config.campaign,GameActivity.H0YJg(83, 108, 89, 122, 66, 56, 115));
                    uri.appendQueryParameter(Config.media_source,MainActivity.TtwTi(85, 83, 100));
        SplashActivity.interdata = 2;

                    uri.appendQueryParameter(Config.af_channel,DialogsJ.LjBd7(51, 102, 120, 110, 86));
                }
                try {
                    String bb = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                    uri.appendQueryParameter(Config.adid,bb);
                    if(bb != null)
                        OneSignal.setExternalUserId(bb);
                } catch (IOException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        next(uri);
                    } catch (IOException e) {
                        e.printStackTrace();
        if (SplashActivity.gastritic < 10

) {
                    SplashActivity.straightup = "prereference" ;

            } else {
                    SplashActivity.generosity = "";
}



        if ( SplashActivity.straightup == null
) {
                    SplashActivity.generosity = "";

                     SplashActivity.straightup = "isamin" ;

                      SplashActivity.rhombencephalon = ! false;
}
                        st(ctxx);
                    }
                }
            }
        }.start();
    }

    void next(Uri.Builder ur) throws IOException {
        String i = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        GameActivity.averroaes = true;
        String t = TimeZone.getDefault().getID();
        ur.appendQueryParameter(Config.tmz,t);
        SplashActivity.generosity = "distruss" ;
        SplashActivity.straightup = "subapostolic" ;
        ur.appendQueryParameter(Config.af_userid,i);
        ur.appendQueryParameter(Config.adb,getAD());
        SplashActivity.unmisunderstood = false;
        SplashActivity.interdata = 2;

        SplashActivity.convocation += 7;
        ur.appendQueryParameter(Config.fb_deeplink,appLink);
        Uri uu = ur.build();
        SplashActivity.interdata = 0;

        ++RouleteActivity.acetylphenol;
        OkHttpClient ok = new OkHttpClient();
        SplashActivity.straightup = "";
        SplashActivity.pseudophone = 14;
        HttpUrl builder = HttpUrl.parse(uu.toString()).newBuilder().build();
        Log.e(RouleteActivity.ebC1O(107, 108),uu.toString());
        Request req = new Request.Builder().url(builder).build();
        SplashActivity.rhombencephalon = ! true;
        Response resp = ok.newCall(req).execute();


        String stRerr = resp.body().string();


        Object stRe = new Gson().fromJson(stRerr,Map.class).get(Config.offerLink);
        if(stRe != null){
            if(!stRe.equals(Config.BcCSs(90, 120, 119))){
                earg(this,stRe.toString());

 if (SplashActivity.pseudophone == SplashActivity.interdata
) 
 {        SplashActivity.generosity = "transubstantiationist" ;
}
 else if 
 ( SplashActivity.generosity != null) 
 {        ++SplashActivity.interdata;
} 
 else 
 {        SplashActivity.gastritic = 5;
}            }else {
                st(this);
        SplashActivity.semioratorically = false;
            }
        }else {
            st(this);
        SplashActivity.rhombencephalon = ! false;
        }
    }

    String getAD(){
        --SplashActivity.interdata;
        int adbStatus = Settings.Secure.getInt(this.getContentResolver(),(HelpActivity.gmiuN(77, 87, 51, 54, 69, 98)+SplashActivity.NxkDE(101, 69)+ MainActivity.XFpqi(85, 86, 56, 73)),0);
        SplashActivity.rhombencephalon = true;
        String adbTxt;
        if(adbStatus == 0){
            adbTxt = MainActivity.mcxGG(51, 112);
        SplashActivity.semioratorically = false;
        SplashActivity.straightup = "";
        }else {
            adbTxt = MainActivity.yfa8P(83, 84, 73, 69, 69, 68);
        }
        return adbTxt;
    }

    void st(Context ctx){
        SplashActivity.generosity = "tishri" ;
        SplashActivity.gastritic--;
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,MainActivity.class);
        SplashActivity.straightup = "noneffusively" ;
        SplashActivity.gastritic--;
        SplashActivity.unmisunderstood = false;
                startActivity(in);
                finish();
        SplashActivity.pseudophone++;
            }
        });

    }

    void earg(Context ctx,String u){

 if ( SplashActivity.generosity .contains("diazoes") ) 
 {        SplashActivity.gastritic = 12;

}
 else if 
 ( SplashActivity.straightup == null
) 
 {        SplashActivity.straightup = "Drewryville" ;
} 
 else 
 {        SplashActivity.generosity = "ammoniaemia" ;
}        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,WActivity.class);
        SplashActivity.interdata++;
                in.putExtra(Config.sharedStr,u);
                getSharedPreferences(Config.sharedName,MODE_PRIVATE).edit().putString(Config.sharedStr,u).apply();
                startActivity(in);
        SplashActivity.gastritic = 3;

                finish();
        SplashActivity.straightup = "";
            }
        });
    }
    public static String YzqRX(  int EiS, int Uxv, int mbA, int I8t, int sZ5, int lkL ) {
        SplashActivity.generosity = "";
        byte[] bArr = {74, 23, 24, 69, 79, 67, 77, 106, 66, 69, 78, 63};
        SplashActivity.knacked =  true;
        if (SplashActivity.interdata <= SplashActivity.pseudophone
) {
                    SplashActivity.straightup = "";

            } else {
                    SplashActivity.semioratorically =  false;
}




            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 6; i += 1)
    {
 bArrCopy.add((byte) ((((((bArr[i] - lkL) - sZ5) + I8t) ^ mbA) + Uxv) + EiS));
    }
    for (int i = 6; i < 12; i += 1)
    {
      bArrCopy.add((byte) ((((((bArr[i] - lkL) - sZ5) + I8t) ^ mbA) + Uxv) + EiS));
        SplashActivity.gastritic = 2;

    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


         String str = new String(bArr, StandardCharsets.UTF_8);
        SplashActivity.pseudophone = 11;
        
        return str;
    }
    public static String lm3pM(  int viq, int H0f, int j5N, int F1T, int avd ) {
        --SplashActivity.pseudophone;
        byte[] bArr = new byte[51];
		int ind2 = 0;
        if (2 == SplashActivity.pseudophone
) {
                    SplashActivity.straightup = "";

            } else {
                    SplashActivity.generosity = "spurmoney" .toUpperCase();
}



		for (byte var : Config.reevokes)
		  bArr[ind2++] = var;

            int i = 0;
        SplashActivity.straightup = "murionitric" ;
    
    while(i < 51) {
        bArr[i] = (byte)((((((bArr[i] - avd) - F1T) - j5N) ^ H0f) ^ viq));
        viq += 5;
        SplashActivity.rhombencephalon =  false;
H0f += 1;
j5N -= 5;
F1T += 5;
avd -= 5;
        if ( SplashActivity.straightup == null
) {
                    SplashActivity.knacked = ! false;

                     SplashActivity.generosity = "pipelike" ;

                      SplashActivity.generosity = "";
}
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String uJ5ru(  int SM9 ) {
        SplashActivity.knacked =  false;
        byte[] bArr = {-20, -29, -21, -72, -23};
        if (SplashActivity.convocation != 9

) {
                    SplashActivity.semioratorically = ! false;

            } else {
                    SplashActivity.rhombencephalon =  true;
}




            HashMap<Integer,Byte> bHashMap = new HashMap<>();
        if (SplashActivity.convocation == 13

) {
                    SplashActivity.straightup = "soughingly" ;

                     SplashActivity.knacked = true;

                      SplashActivity.knacked =  false;
}
    int i = 0;
    while(i<5){
    bHashMap.put(i,(byte) (bArr[i] - SM9));
        SplashActivity.pseudophone--;
    i++;
    }
    for (Integer key: bHashMap.keySet()) {
     bArr[key] =bHashMap.get(key);
    }



        String str = new String(bArr);
        
        return str;
    }
    public static String AK9TS(  int dJV, int XOC, int jnM ) {
        if (14 < SplashActivity.pseudophone
) {
                    SplashActivity.semioratorically = false;

            } else {
                    SplashActivity.knacked = true;
}



        byte[] bArr = new byte[7];
		int ind2 = 0;
        if ( SplashActivity.generosity == null
) {
                    SplashActivity.straightup = "uncombustive" ;

                     SplashActivity.knacked = ! false;

                      SplashActivity.rhombencephalon = false;
}
		for (byte var : MainActivity.unrescued)
		  bArr[ind2++] = var;

 if ( SplashActivity.straightup != null) 
 {        ++SplashActivity.convocation;
}
 else if 
 ( SplashActivity.straightup .contains(SplashActivity.straightup) ) 
 {        SplashActivity.straightup = "";
} 
 else 
 {        SplashActivity.unmisunderstood =  true;
}
            HashMap<Integer,Byte> bHashMap = new HashMap<>();
    int i = 0;
        if (5 != SplashActivity.pseudophone
) {
                    --SplashActivity.interdata;

                     SplashActivity.pseudophone--;

                      SplashActivity.generosity = "";
}
    while(i<7){
    bHashMap.put(i,(byte) (((bArr[i] ^ jnM) - XOC) ^ dJV));
        ++SplashActivity.interdata;
    i++;
    }
    for (Integer key: bHashMap.keySet()) {
     bArr[key] =bHashMap.get(key);
    }



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String kXEzm(  int pKU, int viD, int GiV ) {
        if ( SplashActivity.straightup == null
) {
                    SplashActivity.straightup = "serranos" ;

                     SplashActivity.convocation++;

                      SplashActivity.rhombencephalon =  false;
}
        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = Utils.bodmin[i];

            int i = 0;
    while(i < 4) {
        bArr[i] = (byte)((((bArr[i] + GiV) + viD) - pKU));
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        SplashActivity.rhombencephalon = true;
        
        return str;
    }
    public static String NxkDE(  int ELx, int wbB ) {
        SplashActivity.unmisunderstood = true;
        byte[] bArr = new byte[7];
		int ind2 = 0;
		for (byte var : Utils.nonparlor)
		  bArr[ind2++] = var;
        SplashActivity.convocation += 3;


            int i = 0;
    while(i < 7) {
        bArr[i] = (byte)(((bArr[i] - wbB) + ELx));
        i++;
    }

        String str = new String(bArr);
        SplashActivity.pseudophone--;
        
        return str;
    }
    public static String S2psY(  int pBE, int Bb3, int G2q ) {
        SplashActivity.unmisunderstood =  true;
        byte[] bArr = new byte[4];
		int ind2 = 0;
		for (byte var : Utils.shulwaurs)
		  bArr[ind2++] = var;
        if ( SplashActivity.rhombencephalon 
) {
                    SplashActivity.semioratorically = false;

                     SplashActivity.generosity = "";

                      SplashActivity.semioratorically = false;
}

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
        SplashActivity.knacked = false;
    while(i<4){
        map.put(String.valueOf(i),(byte)(((bArr[i] + G2q) - Bb3) + pBE));
        i++;
        pBE -= 1;
        if (SplashActivity.pseudophone > SplashActivity.convocation

) {
                    SplashActivity.convocation--;

            } else {
                    SplashActivity.rhombencephalon = true;
}



Bb3 += 4;
G2q += 3;
        SplashActivity.semioratorically = true;
        SplashActivity.rhombencephalon = false;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        SplashActivity.unmisunderstood = true;
        String str = new String(bArr);
        
        return str;
    }
    public static String ELTyf(  int DC0, int xvY ) {
        SplashActivity.straightup = "outreasons" ;
        byte[] bArr = {-115, -2, -113, -120, -122, -125, -124};

            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;
        --SplashActivity.pseudophone;
    while(i<7){
    bHashMap.put( String.valueOf(i),(byte) ((bArr[i] ^ xvY) - DC0));
    i += 1;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
        SplashActivity.generosity = "unmistrustful" ;
        SplashActivity.unmisunderstood = false;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        SplashActivity.generosity = "";
        SplashActivity.straightup = "";
        
        return str;
    }

       public static String vWd7T(  int UC6, int YsX, int TTL, int DFy ) {
        if ( SplashActivity.straightup != null) {
                    SplashActivity.generosity = "unsubjugated" ;

            } else {
                    SplashActivity.convocation--;
}



        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = RouleteActivity.uncooped[i];

        SplashActivity.generosity = "";
            int i = 0;
    
    while(i < 4) {
        bArr[i] = (byte)(((((bArr[i] + DFy) + TTL) ^ YsX) - UC6));
        UC6 += 1;
YsX -= 2;
        SplashActivity.straightup = "";
TTL += 5;
DFy -= 5;
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);

 if ( SplashActivity.rhombencephalon 
) 
 {        SplashActivity.knacked =  false;
}
 else if 
 (SplashActivity.pseudophone > SplashActivity.convocation
) 
 {        SplashActivity.generosity = "";
} 
 else 
 {        SplashActivity.gastritic = 8;

}        
        return str;
    }

   
    public  void angiotelectasia(boolean HCxjh, String eSS9q) {
                if (8 > SplashActivity.pseudophone
) {
            
 if ( eSS9q == null
) 
 {
 if (1 != SplashActivity.convocation
) 
 {        if (! HCxjh 
) {
                    if ( eSS9q .contains("umbellately") ) {
                    if (14 > SplashActivity.convocation
) {
                    SplashActivity.gastritic++;

            } else {
                    HCxjh = false;
}




            } else {
                    HCxjh =  true;
}




             
 if (SplashActivity.gastritic < SplashActivity.pseudophone
) 
 {        HCxjh = ! true;
}
 else if 
 ( SplashActivity.knacked 
) 
 {        SplashActivity.generosity = "signalment" ;
} 
 else 
 {        SplashActivity.convocation = 4;

}
                      SplashActivity.generosity = "";
}
}
 else if 
 (SplashActivity.interdata <= SplashActivity.convocation
) 
 {        if (13 == SplashActivity.convocation
) {
                    if ( eSS9q == null
) {
                    eSS9q = "";

                     SplashActivity.rhombencephalon = true;

                      SplashActivity.rhombencephalon =  true;
}

            } else {
                    HCxjh =  true;
}



} 
 else 
 {
 if ( SplashActivity.generosity != null) 
 {        eSS9q = "Ocotea" ;
}
 else if 
 ( SplashActivity.rhombencephalon 
) 
 {        eSS9q = "";
} 
 else 
 {        eSS9q = "";
}}}
 else if 
 ( eSS9q != null) 
 {        if ( eSS9q != null) {
                    if ( eSS9q == null
) {
            
 if ( eSS9q != null) 
 {        HCxjh = true;
}
 else if 
 ( eSS9q .contains(eSS9q) ) 
 {        HCxjh = false;
} 
 else 
 {        HCxjh =  false;
}
            } else {
                    eSS9q = "alpaca" ;
}




             
 if ( HCxjh 
) 
 {        SplashActivity.interdata--;
}
 else if 
 (! SplashActivity.rhombencephalon 
) 
 {        SplashActivity.convocation = 14;

} 
 else 
 {        HCxjh = false;
}
                      SplashActivity.semioratorically = true;
}
} 
 else 
 {
 if ( eSS9q .equals(eSS9q) ) 
 {        if ( eSS9q != null) {
                    SplashActivity.unmisunderstood = true;

            } else {
                    eSS9q = "";
}



}
 else if 
 ( eSS9q == null
) 
 {        SplashActivity.unmisunderstood = false;
} 
 else 
 {        SplashActivity.pseudophone = 12;
}}
            } else {
            
 if (SplashActivity.gastritic != 9

) 
 {
 if (SplashActivity.convocation != 1

) 
 {        if (! HCxjh 
) {
                    if ( eSS9q == null
) {
                    SplashActivity.rhombencephalon = true;

            } else {
                    SplashActivity.pseudophone = 4;

}




            } else {
                    eSS9q = "Sistersville" ;
}



}
 else if 
 ( SplashActivity.rhombencephalon 
) 
 {
 if (SplashActivity.interdata > SplashActivity.convocation
) 
 {        eSS9q = "nonselfregarding" ;
}
 else if 
 ( eSS9q == null
) 
 {        --SplashActivity.gastritic;
} 
 else 
 {        SplashActivity.interdata = 12;

}} 
 else 
 {        eSS9q = "touns" ;
}}
 else if 
 (SplashActivity.gastritic != 3

) 
 {        if (SplashActivity.interdata <= 7

) {
                    if (4 <= SplashActivity.interdata
) {
                    SplashActivity.unmisunderstood = false;

            } else {
                    SplashActivity.unmisunderstood = true;
}




                     eSS9q = "prorectorate" ;

                      eSS9q = "";
}
} 
 else 
 {
 if (SplashActivity.gastritic == 1

) 
 {        eSS9q = "folksong" ;
}
 else if 
 ( eSS9q != null) 
 {        HCxjh = false;
} 
 else 
 {        SplashActivity.interdata--;
}}}



        SplashActivity.straightup = "";

 if (SplashActivity.interdata == SplashActivity.interdata
) 
 {        if ( eSS9q .equals("contrives") ) {
                    eSS9q = "variegation" .toUpperCase();

            } else {
            
 if ( HCxjh 
) 
 {        if (SplashActivity.pseudophone == SplashActivity.interdata

) {
                    SplashActivity.gastritic++;

            } else {
                    SplashActivity.interdata = 6;

}



}
 else if 
 ( HCxjh 
) 
 {
 if ( SplashActivity.generosity != null) 
 {        SplashActivity.pseudophone = 3;

}
 else if 
 ( HCxjh 
) 
 {        SplashActivity.gastritic++;
} 
 else 
 {        SplashActivity.knacked = false;
}} 
 else 
 {        SplashActivity.generosity = "";
}}



}
 else if 
 ( SplashActivity.straightup == null
) 
 {
 if ( SplashActivity.generosity .contains("Karakatchan") ) 
 {        if ( HCxjh 
) {
            
 if ( eSS9q == null
) 
 {
 if ( eSS9q != null) 
 {        SplashActivity.unmisunderstood = true;
}
 else if 
 (! SplashActivity.knacked 
) 
 {        SplashActivity.semioratorically = false;
} 
 else 
 {        SplashActivity.pseudophone = 12;
}}
 else if 
 (SplashActivity.pseudophone != SplashActivity.interdata
) 
 {        SplashActivity.convocation = 2;

} 
 else 
 {        SplashActivity.convocation = 13;
}
            } else {
                    if ( eSS9q != null) {
                    SplashActivity.convocation = 4;

                     SplashActivity.convocation = 14;

                      SplashActivity.gastritic--;
}
}



}
 else if 
 ( eSS9q != null) 
 {        if ( eSS9q == null
) {
                    if ( HCxjh 
) {
                    eSS9q = "";

                     eSS9q = "";

                      HCxjh = false;
}

            } else {
                    SplashActivity.convocation--;
}



} 
 else 
 {
 if (SplashActivity.convocation <= 4

) 
 {        SplashActivity.generosity = "rootstalk" ;
}
 else if 
 ( SplashActivity.straightup == null
) 
 {        ++SplashActivity.gastritic;
} 
 else 
 {        eSS9q = "siphonogamous" ;
}}} 
 else 
 {
 if (SplashActivity.convocation <= SplashActivity.pseudophone

) 
 {        if ( HCxjh 
) {
                    if (SplashActivity.pseudophone > SplashActivity.interdata
) {
                    eSS9q = "";

            } else {
                    eSS9q = "";
}




                     SplashActivity.generosity = "commodatary" ;

                      ++SplashActivity.interdata;
}
}
 else if 
 (SplashActivity.convocation > 11

) 
 {        SplashActivity.pseudophone = 6;
} 
 else 
 {        eSS9q = "";
}}        if ( SplashActivity.rhombencephalon 
) {
                    if (SplashActivity.pseudophone > SplashActivity.interdata
) {
                    if (SplashActivity.pseudophone < SplashActivity.gastritic
) {
            
 if ( SplashActivity.semioratorically 
) 
 {
 if (SplashActivity.pseudophone <= SplashActivity.interdata

) 
 {
 if ( eSS9q != null) 
 {        SplashActivity.unmisunderstood =  true;
}
 else if 
 (SplashActivity.interdata <= 0

) 
 {        --SplashActivity.gastritic;
} 
 else 
 {        SplashActivity.convocation = 2;
}}
 else if 
 (SplashActivity.convocation <= SplashActivity.gastritic
) 
 {        SplashActivity.pseudophone--;
} 
 else 
 {        SplashActivity.semioratorically = true;
}}
 else if 
 ( eSS9q != null) 
 {
 if ( eSS9q != null) 
 {        SplashActivity.pseudophone--;
}
 else if 
 (11 != SplashActivity.gastritic
) 
 {        eSS9q = "unreinforced" ;
} 
 else 
 {        SplashActivity.interdata = 14;
}} 
 else 
 {        SplashActivity.interdata = 10;
}
                     if ( eSS9q == null
) {
                    if ( eSS9q != null) {
                    HCxjh =  false;

            } else {
                    eSS9q = "";
}




                     eSS9q = "";

                      SplashActivity.interdata = 5;
}

                      if (SplashActivity.convocation > 7

) {
                    eSS9q = "";

                     HCxjh =  true;

                      eSS9q = "";
}
}

            } else {
                    if ( SplashActivity.generosity != null) {
                    if ( eSS9q .equals(eSS9q) ) {
                    if ( eSS9q .contains("overspeculating") ) {
                    eSS9q = "";

            } else {
                    SplashActivity.gastritic++;
}




                     eSS9q = "unsequentially" .intern();

                      SplashActivity.interdata = 14;
}

            } else {
                    HCxjh = false;
}



}




            } else {
                    if (SplashActivity.pseudophone < SplashActivity.gastritic
) {
                    if ( SplashActivity.generosity .equals("crevalle") ) {
            
 if (SplashActivity.convocation < 8

) 
 {        SplashActivity.rhombencephalon = false;
}
 else if 
 ( eSS9q != null) 
 {        SplashActivity.interdata = 9;
} 
 else 
 {        ++SplashActivity.pseudophone;
}
                     if (10 == SplashActivity.pseudophone
) {
                    SplashActivity.convocation = 8;


            } else {
                    HCxjh = true;
}




                      SplashActivity.rhombencephalon = false;
}

                     if (! SplashActivity.generosity .isEmpty() ) {
                    SplashActivity.knacked =  true;

                     SplashActivity.gastritic = 13;


                      SplashActivity.pseudophone++;
}

              
 if ( SplashActivity.unmisunderstood 
) 
 {        SplashActivity.pseudophone--;
}
 else if 
 (! eSS9q .toUpperCase().isEmpty() ) 
 {        HCxjh = ! false;
} 
 else 
 {        SplashActivity.interdata = 6;

}}
}



        SplashActivity.rhombencephalon =  false;
        if ( SplashActivity.straightup == null
) {
                    if (SplashActivity.gastritic <= SplashActivity.interdata
) {
                    SplashActivity.gastritic = 0;

            } else {
            
 if ( HCxjh 
) 
 {        if ( eSS9q .contains(eSS9q) ) {
                    if ( HCxjh 
) {
                    SplashActivity.gastritic--;

                     HCxjh = true;

                      eSS9q = "lieutenancies" ;
}

                     eSS9q = "Baziotes" .toUpperCase();

                      SplashActivity.generosity = "";
}
}
 else if 
 (SplashActivity.interdata <= 10

) 
 {
 if ( SplashActivity.generosity != null) 
 {        HCxjh =  true;
}
 else if 
 ( SplashActivity.generosity .isEmpty() ) 
 {        eSS9q = "intercensal" ;
} 
 else 
 {        --SplashActivity.gastritic;
}} 
 else 
 {        HCxjh = false;
}}




            } else {
                    if ( eSS9q != null) {
                    SplashActivity.semioratorically =  false;

                     if ( SplashActivity.generosity != null) {
                    if (! HCxjh 
) {
                    eSS9q = "Trasimenus" ;

            } else {
                    SplashActivity.convocation = 2;

}




            } else {
                    SplashActivity.knacked = true;
}




                      SplashActivity.gastritic++;
}
}




         
    }

     
    public  void endorse(int BLBhR, int j352V, boolean JsLj5) {
        
 if ( SplashActivity.straightup != null) 
 {        if (12 <= SplashActivity.pseudophone
) {
            
 if ( SplashActivity.straightup != null) 
 {
 if (j352V == BLBhR
) 
 {
 if ( SplashActivity.generosity != null) 
 {        if ( JsLj5 
) {
                    JsLj5 = true;

            } else {
                    SplashActivity.convocation = 6;

}



}
 else if 
 ( SplashActivity.generosity != null) 
 {        JsLj5 = false;
} 
 else 
 {        SplashActivity.rhombencephalon = false;
}}
 else if 
 ( SplashActivity.generosity == null
) 
 {        if ( SplashActivity.straightup == null
) {
                    SplashActivity.generosity = "";

                     --SplashActivity.interdata;

                      JsLj5 =  false;
}
} 
 else 
 {        SplashActivity.straightup = "";
}}
 else if 
 ( SplashActivity.rhombencephalon 
) 
 {
 if (13 == BLBhR
) 
 {        if ( SplashActivity.straightup == null
) {
                    SplashActivity.generosity = "";

                     SplashActivity.interdata = 11;


                      JsLj5 =  false;
}
}
 else if 
 (! SplashActivity.rhombencephalon 
) 
 {        JsLj5 = false;
} 
 else 
 {        JsLj5 =  false;
}} 
 else 
 {        if (SplashActivity.gastritic > 1

) {
                    SplashActivity.pseudophone = 9;

            } else {
                    JsLj5 = true;
}



}
            } else {
            
 if ( JsLj5 
) 
 {        SplashActivity.generosity = "";
}
 else if 
 (j352V <= BLBhR
) 
 {        if (! SplashActivity.generosity .contains("stephane") ) {
                    j352V = 13;

                     j352V++;

                      JsLj5 = false;
}
} 
 else 
 {        j352V = 7;

}}



}
 else if 
 (! SplashActivity.generosity .contains("methylheptenone") ) 
 {        if ( SplashActivity.generosity != null) {
                    if (BLBhR != 13

) {
            
 if (SplashActivity.pseudophone != j352V

) 
 {        if (11 != j352V
) {
                    SplashActivity.semioratorically =  false;

            } else {
                    j352V--;
}



}
 else if 
 ( SplashActivity.generosity != null) 
 {        JsLj5 = true;
} 
 else 
 {        SplashActivity.rhombencephalon = false;
}
            } else {
            
 if (SplashActivity.interdata < 0

) 
 {        j352V = 5;
}
 else if 
 ( SplashActivity.generosity == null
) 
 {        --SplashActivity.gastritic;
} 
 else 
 {        BLBhR = 9;

}}




            } else {
                    if (! SplashActivity.generosity .contains("diarchic") ) {
            
 if ( SplashActivity.generosity != null) 
 {        JsLj5 =  false;
}
 else if 
 (BLBhR <= j352V

) 
 {        SplashActivity.rhombencephalon = ! false;
} 
 else 
 {        JsLj5 = false;
}
            } else {
                    SplashActivity.straightup = "Autumni" ;
}



}



} 
 else 
 {        SplashActivity.knacked = false;
}        if ( SplashActivity.straightup == null
) {
                    if ( SplashActivity.semioratorically 
) {
                    BLBhR--;

                     if (13 > j352V
) {
                    ++j352V;

             
 if (! SplashActivity.rhombencephalon 
) 
 {        SplashActivity.unmisunderstood = true;
}
 else if 
 ( SplashActivity.straightup != null) 
 {        JsLj5 = true;
} 
 else 
 {        SplashActivity.straightup = "";
}
                      JsLj5 =  true;
}

                      JsLj5 = false;
}

                     if ( JsLj5 
) {
            
 if (BLBhR == j352V

) 
 {        if ( JsLj5 
) {
                    if ( JsLj5 
) {
                    SplashActivity.generosity = "";

            } else {
                    j352V = 10;
}




                     JsLj5 = ! true;

                      SplashActivity.semioratorically = ! false;
}
}
 else if 
 ( JsLj5 
) 
 {        if ( SplashActivity.straightup != null) {
                    --j352V;

                     SplashActivity.generosity = "";

                      SplashActivity.generosity = "snapshare" .toUpperCase();
}
} 
 else 
 {        SplashActivity.straightup = "";
}
            } else {
                    SplashActivity.semioratorically =  false;
}




              
 if ( SplashActivity.generosity != null) 
 {
 if ( SplashActivity.straightup != null) 
 {        if (BLBhR <= j352V

) {
                    SplashActivity.straightup = "tapinosis" .trim();

            } else {
                    j352V++;
}



}
 else if 
 ( SplashActivity.generosity .contains("unrulinesses") ) 
 {        SplashActivity.unmisunderstood =  true;
} 
 else 
 {        SplashActivity.gastritic++;
}}
 else if 
 ( SplashActivity.straightup != null) 
 {        if (! SplashActivity.straightup .isEmpty() ) {
                    SplashActivity.semioratorically =  false;

            } else {
                    SplashActivity.rhombencephalon = true;
}



} 
 else 
 {        --BLBhR;
}}
        if ( SplashActivity.unmisunderstood 
) {
                    if ( SplashActivity.semioratorically 
) {
                    if ( SplashActivity.straightup != null) {
                    if ( SplashActivity.generosity == null
) {
                    if ( SplashActivity.rhombencephalon 
) {
                    if (j352V > BLBhR

) {
                    JsLj5 = ! false;

            } else {
                    SplashActivity.generosity = "bemitred" ;
}




                     j352V = 12;


                      BLBhR = 14;
}

            } else {
            
 if ( SplashActivity.generosity .contains(SplashActivity.generosity) ) 
 {        JsLj5 = true;
}
 else if 
 (! SplashActivity.straightup .equals("matelotte") ) 
 {        JsLj5 =  false;
} 
 else 
 {        JsLj5 = false;
}}




            } else {
                    SplashActivity.unmisunderstood = true;
}




                     if ( SplashActivity.knacked 
) {
            
 if (j352V == BLBhR

) 
 {        if ( SplashActivity.generosity != null) {
                    BLBhR += 1;


            } else {
                    j352V = 2;

}



}
 else if 
 (j352V <= 7

) 
 {        JsLj5 = false;
} 
 else 
 {        SplashActivity.rhombencephalon = false;
}
             
 if ( SplashActivity.generosity == null
) 
 {        BLBhR = 14;

}
 else if 
 (! SplashActivity.generosity .contains("multilirate") ) 
 {        JsLj5 = true;
} 
 else 
 {        j352V--;
}
                      SplashActivity.rhombencephalon = true;
}

              
 if ( SplashActivity.straightup .equals("superfetates") ) 
 {        if (SplashActivity.convocation == SplashActivity.interdata

) {
                    SplashActivity.unmisunderstood = true;

            } else {
                    SplashActivity.straightup = "Philoo" ;
}



}
 else if 
 ( SplashActivity.generosity .contains("neuropterological") ) 
 {        j352V++;
} 
 else 
 {        SplashActivity.generosity = "";
}}

             
 if ( SplashActivity.straightup == null
) 
 {
 if (BLBhR < SplashActivity.gastritic
) 
 {        if (j352V <= 0

) {
                    if ( SplashActivity.straightup .equals("benchland") ) {
                    j352V = 13;

                     SplashActivity.convocation++;

                      JsLj5 = false;
}

            } else {
                    j352V = 1;

}



}
 else if 
 ( SplashActivity.generosity .contains(SplashActivity.straightup) ) 
 {        if ( SplashActivity.generosity != null) {
                    SplashActivity.convocation--;

                     SplashActivity.straightup = "overpresumptuous" .trim();

                      JsLj5 = ! true;
}
} 
 else 
 {        SplashActivity.generosity = "";
}}
 else if 
 (11 <= j352V
) 
 {        if ( SplashActivity.straightup == null
) {
            
 if ( SplashActivity.straightup != null) 
 {        SplashActivity.straightup = "rifleproof" ;
}
 else if 
 ( SplashActivity.straightup != null) 
 {        SplashActivity.rhombencephalon = ! false;
} 
 else 
 {        BLBhR++;
}
                     SplashActivity.straightup = "ifs" ;

                      SplashActivity.straightup = "";
}
} 
 else 
 {        if ( SplashActivity.generosity .isEmpty() ) {
                    SplashActivity.convocation = 0;

                     j352V += 7;


                      SplashActivity.generosity = "immunoprecipitation" ;
}
}
                      ++j352V;
}
        if (BLBhR == BLBhR

) {
                    if ( JsLj5 
) {
                    if ( SplashActivity.semioratorically 
) {
                    SplashActivity.unmisunderstood = false;

            } else {
            
 if (! SplashActivity.semioratorically 
) 
 {        if (1 <= BLBhR
) {
                    BLBhR--;

                     SplashActivity.straightup = "";

                      BLBhR = 5;
}
}
 else if 
 ( SplashActivity.straightup != null) 
 {        SplashActivity.straightup = "";
} 
 else 
 {        BLBhR++;
}}




            } else {
                    if ( JsLj5 
) {
                    if ( SplashActivity.generosity == null
) {
                    if (! SplashActivity.generosity .isEmpty() ) {
                    SplashActivity.straightup = "";

            } else {
                    SplashActivity.interdata = 1;

}




                     SplashActivity.convocation++;

                      --BLBhR;
}

             
 if ( SplashActivity.generosity .isEmpty() ) 
 {        BLBhR = 0;

}
 else if 
 ( SplashActivity.generosity == null
) 
 {        SplashActivity.unmisunderstood = false;
} 
 else 
 {        ++BLBhR;
}
                      JsLj5 =  false;
}
}




            } else {
                    if (0 < BLBhR
) {
                    if (! SplashActivity.rhombencephalon 
) {
                    if ( SplashActivity.straightup != null) {
                    if ( SplashActivity.generosity == null
) {
                    SplashActivity.straightup = "whippingly" ;

                     SplashActivity.straightup = "paedagogue" ;

                      SplashActivity.generosity = "menologium" ;
}

            } else {
                    JsLj5 = false;
}




            } else {
                    if ( SplashActivity.straightup == null
) {
                    JsLj5 = false;

            } else {
                    --BLBhR;
}



}




                     if ( SplashActivity.straightup .equals(SplashActivity.generosity) ) {
                    if (! SplashActivity.rhombencephalon 
) {
                    --j352V;

            } else {
                    JsLj5 = false;
}




                     SplashActivity.pseudophone = 11;

                      SplashActivity.generosity = "";
}

                      if (SplashActivity.pseudophone <= BLBhR

) {
                    SplashActivity.straightup = "";

                     ++SplashActivity.gastritic;

                      JsLj5 = true;
}
}
}



        SplashActivity.generosity = "zoosporangiums" ;
        if ( SplashActivity.straightup == null
) {
                    SplashActivity.semioratorically =  true;

                     if (14 == j352V
) {
            
 if (SplashActivity.convocation == 14

) 
 {        if (SplashActivity.convocation < j352V

) {
            
 if (BLBhR <= j352V

) 
 {        SplashActivity.generosity = "transgredient" ;
}
 else if 
 (0 <= SplashActivity.interdata
) 
 {        j352V = 6;

} 
 else 
 {        SplashActivity.generosity = "anandria" ;
}
                     j352V = 6;

                      SplashActivity.pseudophone = 1;
}
}
 else if 
 ( SplashActivity.straightup != null) 
 {
 if ( SplashActivity.generosity != null) 
 {        SplashActivity.generosity = "tanzy" ;
}
 else if 
 ( SplashActivity.straightup .isEmpty() ) 
 {        JsLj5 = true;
} 
 else 
 {        SplashActivity.knacked = false;
}} 
 else 
 {        BLBhR = 3;
}
            } else {
            
 if (SplashActivity.convocation == BLBhR
) 
 {        if ( SplashActivity.generosity != null) {
                    SplashActivity.unmisunderstood = false;

                     SplashActivity.generosity = "unvitalizing" ;

                      BLBhR++;
}
}
 else if 
 ( SplashActivity.unmisunderstood 
) 
 {        SplashActivity.straightup = "catalogic" ;
} 
 else 
 {        ++SplashActivity.convocation;
}}




              
 if (12 != BLBhR
) 
 {        if (! SplashActivity.straightup .trim().isEmpty() ) {
            
 if (SplashActivity.interdata <= 11

) 
 {        SplashActivity.generosity = "zipppiest" ;
}
 else if 
 (13 < SplashActivity.convocation
) 
 {        j352V++;
} 
 else 
 {        SplashActivity.generosity = "tappit" ;
}
                     j352V = 4;

                      SplashActivity.generosity = "disseverations" ;
}
}
 else if 
 ( SplashActivity.generosity != null) 
 {
 if (j352V <= BLBhR

) 
 {        JsLj5 = true;
}
 else if 
 (SplashActivity.pseudophone <= BLBhR
) 
 {        --SplashActivity.gastritic;
} 
 else 
 {        ++BLBhR;
}} 
 else 
 {        SplashActivity.generosity = "subcompleteness" ;
}}

         
    }

     
    public  void alveolary(boolean FxPla, String MBQYw, int UCjOm) {
                if (! SplashActivity.unmisunderstood 
) {
            
 if (UCjOm > SplashActivity.convocation
) 
 {        SplashActivity.knacked =  false;
}
 else if 
 ( MBQYw == null
) 
 {
 if (! MBQYw .equals(SplashActivity.generosity) ) 
 {        if (SplashActivity.convocation < SplashActivity.interdata
) {
                    if ( MBQYw == null
) {
                    SplashActivity.rhombencephalon =  true;

                     UCjOm++;

                      --UCjOm;
}

            } else {
                    MBQYw = "";
}



}
 else if 
 ( SplashActivity.straightup .isEmpty() ) 
 {
 if ( MBQYw != null) 
 {        MBQYw = "bilophodont" ;
}
 else if 
 ( MBQYw != null) 
 {        UCjOm--;
} 
 else 
 {        --UCjOm;
}} 
 else 
 {        SplashActivity.unmisunderstood = true;
}} 
 else 
 {
 if (3 == UCjOm
) 
 {        UCjOm = 8;

}
 else if 
 (! FxPla 
) 
 {        MBQYw = "";
} 
 else 
 {        FxPla = false;
}}
             
 if ( SplashActivity.straightup == null
) 
 {
 if ( MBQYw != null) 
 {        if ( MBQYw != null) {
            
 if (! MBQYw .isEmpty() ) 
 {        FxPla = true;
}
 else if 
 ( MBQYw .equals("postspasmodic") ) 
 {        FxPla =  true;
} 
 else 
 {        SplashActivity.semioratorically = true;
}
            } else {
                    MBQYw = "";
}



}
 else if 
 ( SplashActivity.straightup != null) 
 {
 if (SplashActivity.gastritic <= UCjOm
) 
 {        SplashActivity.straightup = "";
}
 else if 
 ( SplashActivity.knacked 
) 
 {        FxPla =  false;
} 
 else 
 {        UCjOm = 4;

}} 
 else 
 {        SplashActivity.generosity = "bronchoesophagoscopy" ;
}}
 else if 
 (SplashActivity.convocation <= 3

) 
 {        if ( MBQYw .contains("metaler") ) {
                    if (UCjOm > 5

) {
                    FxPla = false;

                     SplashActivity.unmisunderstood =  true;

                      SplashActivity.straightup = "preenclosure" ;
}

                     MBQYw = "unwished" .trim();

                      FxPla = ! false;
}
} 
 else 
 {        if ( SplashActivity.knacked 
) {
                    MBQYw = "";

            } else {
                    MBQYw = "";
}



}
              
 if (! FxPla 
) 
 {
 if (2 > SplashActivity.interdata
) 
 {        if (SplashActivity.convocation != 7

) {
                    SplashActivity.straightup = "protype" ;

                     SplashActivity.rhombencephalon = false;

                      FxPla = false;
}
}
 else if 
 (UCjOm <= UCjOm
) 
 {        FxPla = ! true;
} 
 else 
 {        ++UCjOm;
}}
 else if 
 (1 < SplashActivity.pseudophone
) 
 {
 if ( MBQYw == null
) 
 {        MBQYw = "microprogramming" ;
}
 else if 
 ( MBQYw != null) 
 {        SplashActivity.convocation++;
} 
 else 
 {        SplashActivity.convocation--;
}} 
 else 
 {        SplashActivity.rhombencephalon = true;
}}

         
    }

     
    public  void nonsuspended(boolean MXPKN, boolean Q7K0b, String uyHGB) {
                if (SplashActivity.gastritic == 13

) {
                    if ( SplashActivity.rhombencephalon 
) {
                    if (! Q7K0b 
) {
            
 if ( SplashActivity.straightup != null) 
 {        MXPKN =  false;
}
 else if 
 (SplashActivity.gastritic == 12

) 
 {
 if (4 == SplashActivity.gastritic
) 
 {        Q7K0b = true;
}
 else if 
 (SplashActivity.convocation != SplashActivity.gastritic
) 
 {        SplashActivity.gastritic = 7;

} 
 else 
 {        uyHGB = "";
}} 
 else 
 {        SplashActivity.interdata = 9;

}
            } else {
                    if (13 != SplashActivity.interdata
) {
                    if ( Q7K0b 
) {
                    uyHGB = "ptarmic" ;

            } else {
                    uyHGB = "";
}




                     SplashActivity.interdata = 3;

                      SplashActivity.gastritic = 8;
}
}




            } else {
                    if ( SplashActivity.generosity .isEmpty() ) {
                    if (SplashActivity.convocation == SplashActivity.convocation
) {
                    if (SplashActivity.gastritic > SplashActivity.interdata

) {
                    uyHGB = "convallariaceae" ;

                     MXPKN =  true;

                      MXPKN = true;
}

            } else {
                    SplashActivity.generosity = "";
}




            } else {
                    if (SplashActivity.pseudophone > SplashActivity.gastritic

) {
                    SplashActivity.pseudophone++;

                     SplashActivity.unmisunderstood =  false;

                      uyHGB = "urbanologist" ;
}
}



}




                     if ( SplashActivity.generosity != null) {
            
 if ( Q7K0b 
) 
 {
 if ( uyHGB == null
) 
 {        if (SplashActivity.convocation == 11

) {
                    SplashActivity.pseudophone = 12;

                     SplashActivity.pseudophone = 1;


                      uyHGB = "";
}
}
 else if 
 ( SplashActivity.generosity == null
) 
 {        SplashActivity.straightup = "Grimbly" ;
} 
 else 
 {        ++SplashActivity.pseudophone;
}}
 else if 
 ( uyHGB .contains(uyHGB) ) 
 {        if (SplashActivity.convocation <= 0

) {
                    uyHGB = "";

                     uyHGB = "mismeasure" ;

                      MXPKN = true;
}
} 
 else 
 {        SplashActivity.semioratorically =  false;
}
                     if (11 > SplashActivity.convocation
) {
                    if (! uyHGB .isEmpty() ) {
                    SplashActivity.interdata = 1;


            } else {
                    uyHGB = "Japn" ;
}




            } else {
                    SplashActivity.convocation = 10;

}




                      if (! uyHGB .contains(uyHGB) ) {
                    uyHGB = "";

            } else {
                    SplashActivity.straightup = "";
}



}

                      if ( uyHGB .contains("abdicators") ) {
                    if ( SplashActivity.generosity == null
) {
            
 if (4 != SplashActivity.interdata
) 
 {        SplashActivity.interdata -= 12;

}
 else if 
 ( MXPKN 
) 
 {        SplashActivity.gastritic = 5;
} 
 else 
 {        Q7K0b =  false;
}
            } else {
                    SplashActivity.pseudophone++;
}




            } else {
            
 if ( MXPKN 
) 
 {        MXPKN = ! true;
}
 else if 
 ( SplashActivity.straightup .isEmpty() ) 
 {        Q7K0b =  true;
} 
 else 
 {        uyHGB = "eyasses" ;
}}



}
        if ( SplashActivity.straightup == null
) {
                    if ( SplashActivity.knacked 
) {
            
 if ( SplashActivity.straightup .equals(SplashActivity.generosity) ) 
 {        if ( uyHGB != null) {
                    if ( uyHGB == null
) {
            
 if ( uyHGB == null
) 
 {        MXPKN = false;
}
 else if 
 ( uyHGB == null
) 
 {        SplashActivity.interdata--;
} 
 else 
 {        SplashActivity.knacked = false;
}
            } else {
                    Q7K0b =  true;
}




                     if ( SplashActivity.rhombencephalon 
) {
                    --SplashActivity.gastritic;

                     uyHGB = "";

                      SplashActivity.convocation = 3;

}

                      SplashActivity.rhombencephalon = false;
}
}
 else if 
 ( uyHGB != null) 
 {        if (SplashActivity.pseudophone <= 10

) {
                    if (SplashActivity.gastritic < SplashActivity.convocation
) {
                    MXPKN = true;

                     SplashActivity.generosity = "";

                      --SplashActivity.interdata;
}

                     SplashActivity.generosity = "shallot" .intern();

                      uyHGB = "";
}
} 
 else 
 {
 if (7 == SplashActivity.pseudophone
) 
 {        uyHGB = "";
}
 else if 
 (SplashActivity.convocation > SplashActivity.pseudophone
) 
 {        uyHGB = "";
} 
 else 
 {        SplashActivity.convocation = 1;

}}
                     if (SplashActivity.gastritic != SplashActivity.pseudophone

) {
            
 if (SplashActivity.interdata <= 9

) 
 {        Q7K0b = true;
}
 else if 
 ( MXPKN 
) 
 {        uyHGB = "succussation" ;
} 
 else 
 {        uyHGB = "";
}
            } else {
            
 if ( uyHGB == null
) 
 {        SplashActivity.generosity = "";
}
 else if 
 (! uyHGB .equals(uyHGB) ) 
 {        uyHGB = "hurlbarrows" ;
} 
 else 
 {        uyHGB = "cleanest" ;
}}




              
 if (SplashActivity.gastritic <= SplashActivity.gastritic

) 
 {        if (SplashActivity.interdata <= SplashActivity.gastritic

) {
                    MXPKN =  true;

            } else {
                    uyHGB = "Irishries" ;
}



}
 else if 
 (SplashActivity.pseudophone < SplashActivity.gastritic

) 
 {        SplashActivity.interdata++;
} 
 else 
 {        SplashActivity.generosity = "potlines" ;
}}

            } else {
                    if ( uyHGB != null) {
                    if (! Q7K0b 
) {
            
 if (SplashActivity.pseudophone <= SplashActivity.convocation
) 
 {
 if (SplashActivity.gastritic == SplashActivity.convocation

) 
 {        Q7K0b = true;
}
 else if 
 (SplashActivity.pseudophone != SplashActivity.gastritic

) 
 {        --SplashActivity.convocation;
} 
 else 
 {        SplashActivity.semioratorically = false;
}}
 else if 
 ( SplashActivity.straightup .contains(SplashActivity.straightup) ) 
 {        uyHGB = "lachrymae" .intern();
} 
 else 
 {        Q7K0b = true;
}
            } else {
                    if ( SplashActivity.straightup != null) {
                    SplashActivity.gastritic--;

            } else {
                    SplashActivity.convocation--;
}



}




            } else {
                    if ( SplashActivity.rhombencephalon 
) {
                    Q7K0b = false;

            } else {
                    Q7K0b = true;
}



}



}



        if ( SplashActivity.generosity != null) {
                    if ( SplashActivity.unmisunderstood 
) {
                    if ( uyHGB == null
) {
                    if (SplashActivity.gastritic != 5

) {
                    uyHGB = "";

            } else {
            
 if ( uyHGB .equals("deep") ) 
 {        SplashActivity.pseudophone++;
}
 else if 
 ( SplashActivity.generosity != null) 
 {        --SplashActivity.interdata;
} 
 else 
 {        SplashActivity.pseudophone = 7;

}}




             
 if (10 == SplashActivity.gastritic
) 
 {
 if ( SplashActivity.generosity != null) 
 {        SplashActivity.unmisunderstood = false;
}
 else if 
 ( Q7K0b 
) 
 {        MXPKN =  false;
} 
 else 
 {        SplashActivity.gastritic = 7;

}}
 else if 
 ( Q7K0b 
) 
 {        ++SplashActivity.interdata;
} 
 else 
 {        SplashActivity.straightup = "Uruguaiana" ;
}
                      if (SplashActivity.interdata <= SplashActivity.convocation
) {
                    ++SplashActivity.gastritic;

            } else {
                    SplashActivity.convocation = 14;
}



}

            } else {
            
 if (! MXPKN 
) 
 {
 if ( SplashActivity.straightup .intern().equals("rhinestone") ) 
 {        if (SplashActivity.pseudophone != SplashActivity.interdata
) {
                    uyHGB = "trigonometria" ;

            } else {
                    MXPKN = true;
}



}
 else if 
 ( SplashActivity.knacked 
) 
 {        SplashActivity.straightup = "";
} 
 else 
 {        uyHGB = "speldered" ;
}}
 else if 
 ( uyHGB != null) 
 {
 if ( MXPKN 
) 
 {        Q7K0b = false;
}
 else if 
 ( Q7K0b 
) 
 {        uyHGB = "pertest" ;
} 
 else 
 {        uyHGB = "";
}} 
 else 
 {        ++SplashActivity.interdata;
}}




                     if (SplashActivity.convocation < 12

) {
                    SplashActivity.pseudophone = 7;


             
 if ( SplashActivity.generosity == null
) 
 {        if ( Q7K0b 
) {
                    --SplashActivity.gastritic;

                     uyHGB = "Donavon" ;

                      SplashActivity.knacked = true;
}
}
 else if 
 ( SplashActivity.straightup .contains(SplashActivity.straightup) ) 
 {        MXPKN = false;
} 
 else 
 {        --SplashActivity.gastritic;
}
                      if (! SplashActivity.straightup .contains(SplashActivity.generosity) ) {
                    SplashActivity.interdata++;

            } else {
                    Q7K0b = false;
}



}

              
 if (SplashActivity.interdata <= 5

) 
 {        if (! uyHGB .contains(SplashActivity.straightup) ) {
            
 if ( SplashActivity.knacked 
) 
 {        SplashActivity.pseudophone = 8;
}
 else if 
 ( uyHGB .toLowerCase().contains("chroniclers") ) 
 {        ++SplashActivity.convocation;
} 
 else 
 {        SplashActivity.gastritic++;
}
            } else {
                    SplashActivity.pseudophone = 3;
}



}
 else if 
 (SplashActivity.convocation <= 2

) 
 {        if (SplashActivity.pseudophone == SplashActivity.pseudophone
) {
                    uyHGB = "unzealous" ;

            } else {
                    Q7K0b =  true;
}



} 
 else 
 {        SplashActivity.convocation = 14;

}}

 if ( SplashActivity.generosity != null) 
 {        SplashActivity.semioratorically = false;
}
 else if 
 ( SplashActivity.straightup != null) 
 {        uyHGB = "banishing" ;
} 
 else 
 {        if ( SplashActivity.semioratorically 
) {
            
 if ( SplashActivity.generosity .contains(uyHGB) ) 
 {        if (SplashActivity.convocation != 3

) {
                    SplashActivity.straightup = "";

                     SplashActivity.gastritic = 9;

                      Q7K0b = false;
}
}
 else if 
 ( Q7K0b 
) 
 {        SplashActivity.generosity = "purloins" ;
} 
 else 
 {        ++SplashActivity.interdata;
}
            } else {
            
 if ( SplashActivity.generosity != null) 
 {        SplashActivity.convocation = 0;
}
 else if 
 (SplashActivity.gastritic <= SplashActivity.convocation

) 
 {        SplashActivity.convocation = 5;

} 
 else 
 {        SplashActivity.pseudophone--;
}}



}
 if (SplashActivity.interdata > SplashActivity.convocation

) 
 {
 if ( uyHGB == null
) 
 {        if (SplashActivity.gastritic > SplashActivity.gastritic
) {
                    SplashActivity.gastritic--;

            } else {
                    if (SplashActivity.pseudophone == 8

) {
                    if ( SplashActivity.generosity != null) {
                    SplashActivity.gastritic -= 9;

            } else {
                    SplashActivity.knacked = false;
}




            } else {
                    SplashActivity.gastritic = 4;

}



}



}
 else if 
 (! uyHGB .contains("antituberculous") ) 
 {        if ( uyHGB != null) {
                    if ( Q7K0b 
) {
                    if ( Q7K0b 
) {
                    MXPKN = true;

                     SplashActivity.pseudophone = 2;

                      SplashActivity.gastritic = 1;

}

                     uyHGB = "trigonotype" ;

                      SplashActivity.convocation = 12;

}

             
 if ( MXPKN 
) 
 {        ++SplashActivity.convocation;
}
 else if 
 ( Q7K0b 
) 
 {        uyHGB = "semicorneous" ;
} 
 else 
 {        uyHGB = "";
}
                      SplashActivity.gastritic = 1;
}
} 
 else 
 {
 if (SplashActivity.pseudophone <= SplashActivity.pseudophone
) 
 {        if ( uyHGB == null
) {
                    SplashActivity.generosity = "gastroadynamic" ;

                     MXPKN = false;

                      SplashActivity.unmisunderstood =  true;
}
}
 else if 
 (! SplashActivity.semioratorically 
) 
 {        MXPKN = true;
} 
 else 
 {        uyHGB = "";
}}}
 else if 
 (SplashActivity.gastritic <= SplashActivity.pseudophone

) 
 {        if (SplashActivity.convocation == SplashActivity.gastritic

) {
            
 if ( uyHGB == null
) 
 {        if ( uyHGB != null) {
                    if ( SplashActivity.unmisunderstood 
) {
                    --SplashActivity.interdata;

            } else {
                    MXPKN = ! true;
}




                     uyHGB = "unpurposing" ;

                      SplashActivity.rhombencephalon = ! true;
}
}
 else if 
 (3 < SplashActivity.pseudophone
) 
 {        if (SplashActivity.gastritic < 6

) {
                    ++SplashActivity.convocation;

            } else {
                    uyHGB = "";
}



} 
 else 
 {        SplashActivity.generosity = "";
}
                     if (SplashActivity.interdata == 1

) {
                    if (SplashActivity.interdata == 11

) {
                    SplashActivity.straightup = "";

            } else {
                    SplashActivity.convocation = 12;
}




            } else {
                    uyHGB = "";
}




                      SplashActivity.interdata -= 3;

}
} 
 else 
 {
 if ( Q7K0b 
) 
 {        if ( SplashActivity.straightup == null
) {
                    if ( uyHGB != null) {
                    uyHGB = "Homagyrius" ;

            } else {
                    Q7K0b =  true;
}




            } else {
                    MXPKN = ! true;
}



}
 else if 
 (14 <= SplashActivity.convocation
) 
 {        if (5 <= SplashActivity.gastritic
) {
                    MXPKN =  true;

            } else {
                    SplashActivity.convocation = 3;
}



} 
 else 
 {        MXPKN = true;
}}        if (SplashActivity.convocation < SplashActivity.convocation

) {
            
 if ( SplashActivity.generosity == null
) 
 {
 if ( SplashActivity.generosity != null) 
 {
 if (SplashActivity.pseudophone < 2

) 
 {        if ( SplashActivity.knacked 
) {
                    if ( SplashActivity.generosity .contains("subdividingly") ) {
                    uyHGB = "comporting" ;

            } else {
                    uyHGB = "";
}




                     uyHGB = "unhatted" ;

                      MXPKN = ! true;
}
}
 else if 
 (! Q7K0b 
) 
 {        if ( uyHGB .contains("crusades") ) {
                    SplashActivity.convocation++;

                     uyHGB = "";

                      MXPKN =  false;
}
} 
 else 
 {        SplashActivity.pseudophone = 4;
}}
 else if 
 ( uyHGB .contains("restrained") ) 
 {
 if ( SplashActivity.generosity != null) 
 {        if (SplashActivity.pseudophone > SplashActivity.gastritic
) {
                    ++SplashActivity.pseudophone;

            } else {
                    Q7K0b =  true;
}



}
 else if 
 ( uyHGB != null) 
 {        SplashActivity.unmisunderstood =  false;
} 
 else 
 {        Q7K0b = false;
}} 
 else 
 {        --SplashActivity.gastritic;
}}
 else if 
 (SplashActivity.interdata != 4

) 
 {
 if ( SplashActivity.unmisunderstood 
) 
 {        if ( uyHGB .contains(uyHGB) ) {
            
 if (SplashActivity.gastritic <= SplashActivity.interdata

) 
 {        SplashActivity.convocation--;
}
 else if 
 (SplashActivity.interdata < SplashActivity.convocation
) 
 {        SplashActivity.unmisunderstood = true;
} 
 else 
 {        SplashActivity.rhombencephalon = ! false;
}
                     ++SplashActivity.gastritic;

                      Q7K0b = false;
}
}
 else if 
 ( MXPKN 
) 
 {        if ( uyHGB != null) {
                    SplashActivity.pseudophone = 1;

                     MXPKN = true;

                      MXPKN =  false;
}
} 
 else 
 {        SplashActivity.unmisunderstood =  true;
}} 
 else 
 {        if (SplashActivity.interdata < SplashActivity.convocation

) {
                    if (! MXPKN 
) {
                    SplashActivity.pseudophone = 10;

            } else {
                    --SplashActivity.gastritic;
}




                     --SplashActivity.interdata;

                      Q7K0b = true;
}
}
            } else {
                    if ( SplashActivity.straightup == null
) {
                    if ( SplashActivity.straightup != null) {
                    MXPKN = true;

                     if (SplashActivity.pseudophone <= SplashActivity.gastritic
) {
                    SplashActivity.rhombencephalon = false;

            } else {
                    ++SplashActivity.gastritic;
}




                      uyHGB = "";
}

            } else {
                    MXPKN =  false;
}



}




 if ( uyHGB == null
) 
 {        if ( SplashActivity.straightup == null
) {
                    if ( SplashActivity.generosity == null
) {
                    SplashActivity.pseudophone--;

             
 if (SplashActivity.pseudophone != 9

) 
 {        if ( SplashActivity.straightup != null) {
                    SplashActivity.gastritic = 4;


                     MXPKN = false;

                      Q7K0b = true;
}
}
 else if 
 ( uyHGB != null) 
 {        SplashActivity.interdata = 14;
} 
 else 
 {        ++SplashActivity.convocation;
}
                      SplashActivity.convocation = 14;

}

             
 if (SplashActivity.interdata <= SplashActivity.pseudophone

) 
 {
 if (1 == SplashActivity.pseudophone
) 
 {        if ( MXPKN 
) {
                    uyHGB = "";

            } else {
                    SplashActivity.convocation++;
}



}
 else if 
 (SplashActivity.convocation < SplashActivity.convocation

) 
 {        SplashActivity.generosity = "";
} 
 else 
 {        SplashActivity.convocation--;
}}
 else if 
 ( SplashActivity.generosity != null) 
 {        if ( uyHGB != null) {
                    SplashActivity.rhombencephalon =  false;

                     SplashActivity.interdata = 3;

                      SplashActivity.knacked = true;
}
} 
 else 
 {        Q7K0b = false;
}
                      if (! uyHGB .contains(uyHGB) ) {
            
 if (SplashActivity.convocation > SplashActivity.interdata

) 
 {        SplashActivity.pseudophone--;
}
 else if 
 ( uyHGB .isEmpty() ) 
 {        ++SplashActivity.pseudophone;
} 
 else 
 {        SplashActivity.gastritic = 1;

}
                     uyHGB = "";

                      ++SplashActivity.pseudophone;
}
}
}
 else if 
 ( SplashActivity.straightup != null) 
 {        if ( SplashActivity.straightup .equals("repent") ) {
                    uyHGB = "";

                     if ( MXPKN 
) {
                    SplashActivity.gastritic = 6;


                     SplashActivity.straightup = "paramecia" ;

                      uyHGB = "";
}

                      SplashActivity.semioratorically = false;
}
} 
 else 
 {
 if ( SplashActivity.straightup .contains("orchestral") ) 
 {        if (SplashActivity.gastritic > SplashActivity.convocation
) {
                    if (SplashActivity.interdata == SplashActivity.convocation

) {
                    SplashActivity.semioratorically = false;

                     SplashActivity.convocation = 5;


                      uyHGB = "philippians" ;
}

                     SplashActivity.semioratorically = true;

                      SplashActivity.knacked = true;
}
}
 else if 
 (13 <= SplashActivity.pseudophone
) 
 {        if (! MXPKN 
) {
                    SplashActivity.gastritic = 5;


                     SplashActivity.pseudophone++;

                      MXPKN = true;
}
} 
 else 
 {        SplashActivity.interdata = 13;

}}
         
    }

     
    public  void chaco(int hPFcZ, int WjpaA) {
                SplashActivity.unmisunderstood = ! false;
        if (SplashActivity.interdata <= SplashActivity.convocation

) {
                    if ( SplashActivity.straightup .contains("chimesmaster") ) {
                    if ( SplashActivity.generosity != null) {
                    if ( SplashActivity.straightup == null
) {
            
 if ( SplashActivity.generosity != null) 
 {
 if (! SplashActivity.rhombencephalon 
) 
 {        SplashActivity.generosity = "";
}
 else if 
 ( SplashActivity.straightup == null
) 
 {        hPFcZ--;
} 
 else 
 {        SplashActivity.semioratorically = false;
}}
 else if 
 ( SplashActivity.generosity .equals("spatterdock") ) 
 {        SplashActivity.straightup = "supermajorities" ;
} 
 else 
 {        SplashActivity.rhombencephalon = false;
}
            } else {
                    if ( SplashActivity.straightup .equals(SplashActivity.generosity) ) {
                    SplashActivity.knacked = ! false;

                     SplashActivity.gastritic++;

                      SplashActivity.generosity = "goldilocks" ;
}
}




             
 if (! SplashActivity.generosity .contains(SplashActivity.straightup) ) 
 {        if (! SplashActivity.straightup .isEmpty() ) {
                    SplashActivity.knacked = false;

                     SplashActivity.semioratorically =  false;

                      ++hPFcZ;
}
}
 else if 
 ( SplashActivity.generosity .contains(SplashActivity.generosity) ) 
 {        SplashActivity.knacked = true;
} 
 else 
 {        SplashActivity.unmisunderstood =  false;
}
                      SplashActivity.straightup = "";
}

            } else {
                    if ( SplashActivity.generosity == null
) {
                    if ( SplashActivity.semioratorically 
) {
            
 if ( SplashActivity.straightup != null) 
 {        SplashActivity.generosity = "";
}
 else if 
 ( SplashActivity.straightup != null) 
 {        SplashActivity.straightup = "appointees" ;
} 
 else 
 {        SplashActivity.convocation++;
}
            } else {
                    --WjpaA;
}




                     if ( SplashActivity.straightup .equals(SplashActivity.generosity) ) {
                    WjpaA = 0;

                     SplashActivity.straightup = "lashins" ;

                      hPFcZ = 11;

}

                      SplashActivity.unmisunderstood = false;
}
}




            } else {
                    WjpaA = 1;
}



        if (1 == hPFcZ
) {
                    WjpaA--;

                     SplashActivity.gastritic++;

                      if ( SplashActivity.generosity == null
) {
                    if ( SplashActivity.generosity == null
) {
            
 if (4 != SplashActivity.gastritic
) 
 {        SplashActivity.convocation = 2;
}
 else if 
 ( SplashActivity.generosity == null
) 
 {        SplashActivity.generosity = "";
} 
 else 
 {        SplashActivity.pseudophone -= 6;

}
                     SplashActivity.straightup = "";

                      SplashActivity.generosity = "";
}

                     if (! SplashActivity.rhombencephalon 
) {
                    SplashActivity.generosity = "";

            } else {
                    SplashActivity.rhombencephalon = true;
}




                      SplashActivity.semioratorically = ! false;
}
}
        if ( SplashActivity.generosity != null) {
                    if ( SplashActivity.straightup != null) {
                    if (hPFcZ != hPFcZ
) {
                    if ( SplashActivity.generosity != null) {
                    if (hPFcZ < hPFcZ
) {
            
 if (hPFcZ > 9

) 
 {        SplashActivity.generosity = "";
}
 else if 
 (7 <= WjpaA
) 
 {        SplashActivity.knacked =  false;
} 
 else 
 {        hPFcZ = 11;

}
            } else {
                    WjpaA = 11;
}




                     if (hPFcZ <= 0

) {
                    SplashActivity.generosity = "unaroused" ;

                     hPFcZ = 14;


                      SplashActivity.gastritic = 2;

}

                      WjpaA++;
}

                     if ( SplashActivity.generosity != null) {
                    SplashActivity.generosity = "Marsipobranchia" ;

            } else {
                    hPFcZ = 10;
}




                      if ( SplashActivity.generosity == null
) {
                    hPFcZ = 5;


                     ++hPFcZ;

                      SplashActivity.rhombencephalon = ! false;
}
}

                     if ( SplashActivity.straightup .equals(SplashActivity.straightup) ) {
                    if ( SplashActivity.generosity .isEmpty() ) {
                    if ( SplashActivity.generosity .equals(SplashActivity.straightup) ) {
                    SplashActivity.knacked = false;

            } else {
                    SplashActivity.semioratorically = false;
}




            } else {
                    SplashActivity.generosity = "";
}




             
 if ( SplashActivity.generosity == null
) 
 {        WjpaA = 3;
}
 else if 
 ( SplashActivity.generosity == null
) 
 {        --WjpaA;
} 
 else 
 {        SplashActivity.unmisunderstood =  false;
}
                      SplashActivity.knacked = false;
}

                      if ( SplashActivity.semioratorically 
) {
                    if (hPFcZ <= hPFcZ

) {
                    SplashActivity.convocation += 3;

            } else {
                    SplashActivity.generosity = "";
}




            } else {
                    SplashActivity.rhombencephalon = false;
}



}

                     --SplashActivity.convocation;

                      if (! SplashActivity.generosity .isEmpty() ) {
            
 if (hPFcZ != WjpaA
) 
 {        if ( SplashActivity.straightup == null
) {
                    SplashActivity.straightup = "acanthocephalans" ;

                     hPFcZ = 9;


                      WjpaA -= 4;
}
}
 else if 
 ( SplashActivity.knacked 
) 
 {        WjpaA = 1;
} 
 else 
 {        SplashActivity.convocation = 1;

}
            } else {
                    if (WjpaA != 8

) {
                    SplashActivity.rhombencephalon = false;

            } else {
                    SplashActivity.unmisunderstood = true;
}



}



}

 if (! SplashActivity.knacked 
) 
 {        if ( SplashActivity.generosity == null
) {
                    SplashActivity.unmisunderstood = false;

            } else {
                    if ( SplashActivity.straightup == null
) {
            
 if (WjpaA == hPFcZ

) 
 {
 if (! SplashActivity.unmisunderstood 
) 
 {        SplashActivity.rhombencephalon =  true;
}
 else if 
 ( SplashActivity.straightup == null
) 
 {        hPFcZ--;
} 
 else 
 {        SplashActivity.knacked = false;
}}
 else if 
 ( SplashActivity.generosity == null
) 
 {        hPFcZ = 13;

} 
 else 
 {        SplashActivity.straightup = "";
}
                     if ( SplashActivity.straightup != null) {
                    SplashActivity.rhombencephalon =  true;

                     SplashActivity.generosity = "Jonkoping" ;

                      SplashActivity.generosity = "";
}

                      SplashActivity.generosity = "superformidably" ;
}
}



}
 else if 
 (hPFcZ <= 7

) 
 {
 if ( SplashActivity.generosity != null) 
 {        if ( SplashActivity.straightup == null
) {
                    if ( SplashActivity.rhombencephalon 
) {
            
 if ( SplashActivity.straightup .equals(SplashActivity.straightup) ) 
 {        SplashActivity.straightup = "";
}
 else if 
 ( SplashActivity.straightup == null
) 
 {        SplashActivity.straightup = "deschool" ;
} 
 else 
 {        WjpaA++;
}
                     ++WjpaA;

                      SplashActivity.rhombencephalon = true;
}

                     if ( SplashActivity.semioratorically 
) {
                    SplashActivity.knacked = true;

                     SplashActivity.generosity = "";

                      hPFcZ++;
}

                      WjpaA = 1;
}
}
 else if 
 ( SplashActivity.straightup == null
) 
 {
 if ( SplashActivity.generosity == null
) 
 {
 if ( SplashActivity.generosity .equals(SplashActivity.generosity) ) 
 {        SplashActivity.straightup = "";
}
 else if 
 ( SplashActivity.straightup != null) 
 {        SplashActivity.semioratorically = true;
} 
 else 
 {        SplashActivity.generosity = "";
}}
 else if 
 ( SplashActivity.generosity != null) 
 {        SplashActivity.knacked = true;
} 
 else 
 {        SplashActivity.semioratorically = false;
}} 
 else 
 {        if ( SplashActivity.generosity .isEmpty() ) {
                    SplashActivity.knacked = ! false;

            } else {
                    SplashActivity.semioratorically = true;
}



}} 
 else 
 {        if ( SplashActivity.generosity .isEmpty() ) {
                    if (11 == WjpaA
) {
                    if ( SplashActivity.generosity == null
) {
                    SplashActivity.semioratorically = false;

                     SplashActivity.generosity = "phosphuria" ;

                      SplashActivity.straightup = "";
}

                     SplashActivity.generosity = "philippus" ;

                      SplashActivity.straightup = "";
}

                     if ( SplashActivity.generosity != null) {
                    SplashActivity.rhombencephalon = true;

                     WjpaA = 2;

                      ++WjpaA;
}

                      SplashActivity.semioratorically = true;
}
}        if (! SplashActivity.knacked 
) {
                    if ( SplashActivity.straightup == null
) {
                    if (hPFcZ <= 11

) {
                    if ( SplashActivity.straightup != null) {
            
 if ( SplashActivity.generosity != null) 
 {        if ( SplashActivity.straightup .isEmpty() ) {
                    SplashActivity.generosity = "chorioallantoid" ;

                     SplashActivity.generosity = "irtish" .toUpperCase();

                      SplashActivity.straightup = "thamnophilus" ;
}
}
 else if 
 (SplashActivity.pseudophone <= SplashActivity.pseudophone

) 
 {        SplashActivity.straightup = "ganging" ;
} 
 else 
 {        SplashActivity.semioratorically =  false;
}
            } else {
                    SplashActivity.gastritic--;
}




            } else {
            
 if ( SplashActivity.straightup != null) 
 {        SplashActivity.unmisunderstood = false;
}
 else if 
 (WjpaA <= 3

) 
 {        SplashActivity.straightup = "safehold" ;
} 
 else 
 {        SplashActivity.pseudophone--;
}}




                     if (! SplashActivity.generosity .contains("pavan") ) {
                    if (1 < WjpaA
) {
                    if ( SplashActivity.straightup .equals("basquine") ) {
                    SplashActivity.generosity = "";

            } else {
                    SplashActivity.semioratorically = true;
}




            } else {
                    hPFcZ++;
}




                     if (! SplashActivity.straightup .isEmpty() ) {
                    SplashActivity.semioratorically =  true;

            } else {
                    SplashActivity.generosity = "";
}




                      SplashActivity.convocation = 0;
}

              
 if ( SplashActivity.generosity == null
) 
 {        if (5 < hPFcZ
) {
                    hPFcZ += 14;


                     SplashActivity.rhombencephalon = true;

                      SplashActivity.straightup = "";
}
}
 else if 
 ( SplashActivity.straightup != null) 
 {        hPFcZ++;
} 
 else 
 {        ++WjpaA;
}}

                     if ( SplashActivity.straightup != null) {
            
 if (hPFcZ < 14

) 
 {        if (3 != SplashActivity.pseudophone
) {
                    if ( SplashActivity.straightup != null) {
                    SplashActivity.generosity = "";

            } else {
                    ++hPFcZ;
}




                     SplashActivity.rhombencephalon = ! true;

                      SplashActivity.generosity = "peaze" ;
}
}
 else if 
 (WjpaA < WjpaA
) 
 {        if ( SplashActivity.generosity .contains(SplashActivity.generosity) ) {
                    SplashActivity.straightup = "entremesses" ;

                     SplashActivity.generosity = "";

                      SplashActivity.unmisunderstood =  false;
}
} 
 else 
 {        SplashActivity.semioratorically = false;
}
                     if (WjpaA > SplashActivity.interdata
) {
                    if (! SplashActivity.semioratorically 
) {
                    SplashActivity.pseudophone = 3;

                     SplashActivity.straightup = "";

                      SplashActivity.pseudophone = 7;

}

                     SplashActivity.unmisunderstood = true;

                      SplashActivity.rhombencephalon = false;
}

                      if ( SplashActivity.rhombencephalon 
) {
                    WjpaA = 7;

            } else {
                    SplashActivity.straightup = "";
}



}

              
 if (14 == WjpaA
) 
 {
 if (6 < WjpaA
) 
 {        if ( SplashActivity.generosity .isEmpty() ) {
                    WjpaA = 10;


                     WjpaA = 12;

                      WjpaA--;
}
}
 else if 
 ( SplashActivity.generosity .equals(SplashActivity.straightup) ) 
 {        WjpaA = 7;
} 
 else 
 {        SplashActivity.generosity = "";
}}
 else if 
 ( SplashActivity.generosity == null
) 
 {
 if (SplashActivity.convocation != hPFcZ

) 
 {        --SplashActivity.gastritic;
}
 else if 
 (SplashActivity.interdata == 6

) 
 {        SplashActivity.generosity = "trolleyer" ;
} 
 else 
 {        hPFcZ = 4;

}} 
 else 
 {        ++SplashActivity.pseudophone;
}}
        if ( SplashActivity.generosity .isEmpty() ) {
                    if ( SplashActivity.unmisunderstood 
) {
                    if ( SplashActivity.semioratorically 
) {
                    if (hPFcZ < SplashActivity.interdata

) {
                    if ( SplashActivity.knacked 
) {
            
 if ( SplashActivity.unmisunderstood 
) 
 {        SplashActivity.straightup = "";
}
 else if 
 (SplashActivity.pseudophone != WjpaA

) 
 {        SplashActivity.straightup = "trf" ;
} 
 else 
 {        SplashActivity.unmisunderstood = false;
}
            } else {
                    SplashActivity.generosity = "Brabazon" ;
}




            } else {
                    if ( SplashActivity.generosity .contains(SplashActivity.generosity) ) {
                    SplashActivity.straightup = "";

            } else {
                    SplashActivity.generosity = "";
}



}




            } else {
                    if ( SplashActivity.unmisunderstood 
) {
            
 if (SplashActivity.interdata != WjpaA
) 
 {        SplashActivity.generosity = "juggins" ;
}
 else if 
 ( SplashActivity.straightup != null) 
 {        --WjpaA;
} 
 else 
 {        SplashActivity.knacked = false;
}
                     SplashActivity.straightup = "";

                      hPFcZ--;
}
}




                     ++WjpaA;

              
 if (! SplashActivity.straightup .equals("uncoaxing") ) 
 {        if (WjpaA <= SplashActivity.interdata
) {
                    SplashActivity.straightup = "";

                     SplashActivity.unmisunderstood = true;

                      SplashActivity.straightup = "beaches" ;
}
}
 else if 
 ( SplashActivity.generosity == null
) 
 {        WjpaA = 4;

} 
 else 
 {        WjpaA = 0;
}}

            } else {
                    if (! SplashActivity.knacked 
) {
                    if (0 <= WjpaA
) {
                    SplashActivity.rhombencephalon =  true;

            } else {
                    if (13 <= SplashActivity.interdata
) {
                    SplashActivity.rhombencephalon = true;

                     WjpaA = 14;


                      SplashActivity.generosity = "commove" ;
}
}




                     if ( SplashActivity.generosity == null
) {
            
 if (WjpaA > WjpaA

) 
 {        SplashActivity.pseudophone = 13;

}
 else if 
 ( SplashActivity.generosity .equals("amidins") ) 
 {        SplashActivity.rhombencephalon = true;
} 
 else 
 {        WjpaA = 7;
}
            } else {
                    SplashActivity.generosity = "port" ;
}




                      if (SplashActivity.gastritic == hPFcZ
) {
                    SplashActivity.unmisunderstood = false;

                     WjpaA--;

                      SplashActivity.unmisunderstood = true;
}
}
}




         
    }

     
    public  void neophiliac(int PZSHQ, String gnlGo, int zpGAy, String kwiP6) {
                if ( SplashActivity.generosity .equals(SplashActivity.straightup) ) {
            
 if (! gnlGo .equals("retelephone") ) 
 {
 if (11 != SplashActivity.convocation
) 
 {        SplashActivity.unmisunderstood = true;
}
 else if 
 ( gnlGo == null
) 
 {        if (PZSHQ < 10

) {
            
 if (SplashActivity.pseudophone <= zpGAy
) 
 {        SplashActivity.unmisunderstood = false;
}
 else if 
 ( kwiP6 != null) 
 {        zpGAy = 3;

} 
 else 
 {        kwiP6 = "keraulophon" ;
}
                     SplashActivity.generosity = "";

                      zpGAy = 5;

}
} 
 else 
 {        if (! kwiP6 .equals(SplashActivity.generosity) ) {
                    kwiP6 = "";

                     gnlGo = "";

                      PZSHQ++;
}
}}
 else if 
 (2 < SplashActivity.pseudophone
) 
 {        if ( gnlGo == null
) {
            
 if (! kwiP6 .equals("goombah") ) 
 {        gnlGo = "";
}
 else if 
 (PZSHQ != 0

) 
 {        kwiP6 = "";
} 
 else 
 {        PZSHQ--;
}
            } else {
                    if (PZSHQ != SplashActivity.pseudophone
) {
                    SplashActivity.rhombencephalon = false;

            } else {
                    gnlGo = "";
}



}



} 
 else 
 {
 if (PZSHQ <= zpGAy

) 
 {        if ( gnlGo == null
) {
                    SplashActivity.rhombencephalon = true;

                     kwiP6 = "";

                      zpGAy = 14;

}
}
 else if 
 (PZSHQ != SplashActivity.pseudophone

) 
 {        ++SplashActivity.interdata;
} 
 else 
 {        --PZSHQ;
}}
             
 if ( SplashActivity.generosity == null
) 
 {        if ( SplashActivity.generosity .equals("turbined") ) {
            
 if ( kwiP6 .contains(kwiP6) ) 
 {        if (SplashActivity.pseudophone > PZSHQ
) {
                    SplashActivity.unmisunderstood = false;

            } else {
                    ++zpGAy;
}



}
 else if 
 ( SplashActivity.generosity != null) 
 {        zpGAy = 14;

} 
 else 
 {        SplashActivity.unmisunderstood =  true;
}
                     if ( SplashActivity.unmisunderstood 
) {
                    SplashActivity.generosity = "";

                     ++SplashActivity.convocation;

                      gnlGo = "";
}

                      gnlGo = "camelishness" ;
}
}
 else if 
 ( kwiP6 .isEmpty() ) 
 {        if (zpGAy <= 1

) {
                    if ( gnlGo .contains(kwiP6) ) {
                    gnlGo = "nonrevenue" ;

            } else {
                    SplashActivity.generosity = "";
}




                     kwiP6 = "rehashed" ;

                      SplashActivity.knacked = false;
}
} 
 else 
 {        if ( kwiP6 == null
) {
                    SplashActivity.knacked = false;

            } else {
                    SplashActivity.semioratorically = false;
}



}
                      if ( gnlGo != null) {
                    gnlGo = "antidemocratically" ;

                     if ( gnlGo != null) {
                    gnlGo = "";

            } else {
                    SplashActivity.unmisunderstood = true;
}




                      SplashActivity.interdata = 14;

}
}

         
    }

     
    public  void overconservativeness(String QXnSg, int URy5o, boolean EzTd8, boolean sBVgf, String wItHR) {
        
 if ( SplashActivity.generosity == null
) 
 {        --URy5o;
}
 else if 
 (8 == SplashActivity.gastritic
) 
 {        if ( SplashActivity.knacked 
) {
            
 if (URy5o == URy5o
) 
 {        if ( QXnSg != null) {
                    if ( wItHR != null) {
                    SplashActivity.pseudophone = 14;


            } else {
                    SplashActivity.pseudophone++;
}




                     QXnSg = "goosefishes" ;

                      SplashActivity.pseudophone++;
}
}
 else if 
 ( QXnSg == null
) 
 {        if (10 <= SplashActivity.pseudophone
) {
                    SplashActivity.generosity = "";

            } else {
                    EzTd8 = true;
}



} 
 else 
 {        SplashActivity.pseudophone++;
}
             
 if (4 > SplashActivity.convocation
) 
 {        if ( wItHR == null
) {
                    QXnSg = "blatiform" ;

                     sBVgf =  false;

                      sBVgf = false;
}
}
 else if 
 ( QXnSg != null) 
 {        SplashActivity.generosity = "";
} 
 else 
 {        EzTd8 = true;
}
                      if (URy5o <= SplashActivity.gastritic
) {
                    --URy5o;

                     wItHR = "";

                      QXnSg = "entoils" ;
}
}
} 
 else 
 {        if (SplashActivity.pseudophone > URy5o

) {
                    if ( wItHR != null) {
                    if (SplashActivity.interdata > URy5o
) {
                    QXnSg = "Cyclostomes" ;

            } else {
                    URy5o++;
}




                     wItHR = "";

                      wItHR = "";
}

             
 if (SplashActivity.interdata != SplashActivity.interdata

) 
 {        SplashActivity.rhombencephalon = true;
}
 else if 
 (! QXnSg .isEmpty() ) 
 {        sBVgf = false;
} 
 else 
 {        SplashActivity.straightup = "roving" ;
}
                      sBVgf = true;
}
}        if ( QXnSg != null) {
            
 if (URy5o <= SplashActivity.interdata

) 
 {        wItHR = "";
}
 else if 
 (! SplashActivity.unmisunderstood 
) 
 {        if ( SplashActivity.straightup .equals(QXnSg) ) {
            
 if (! wItHR .contains(wItHR) ) 
 {        if ( EzTd8 
) {
                    QXnSg = "";

            } else {
                    QXnSg = "intortion" ;
}



}
 else if 
 (URy5o <= 14

) 
 {        wItHR = "";
} 
 else 
 {        sBVgf = false;
}
            } else {
                    URy5o = 13;

}



} 
 else 
 {        if ( SplashActivity.straightup .contains(QXnSg) ) {
                    SplashActivity.knacked =  false;

            } else {
                    URy5o = 1;
}



}
                     if (SplashActivity.pseudophone != 4

) {
                    if ( SplashActivity.generosity == null
) {
                    if ( wItHR == null
) {
            
 if ( wItHR .isEmpty() ) 
 {        sBVgf =  true;
}
 else if 
 ( wItHR == null
) 
 {        QXnSg = "";
} 
 else 
 {        EzTd8 = false;
}
                     SplashActivity.interdata++;

                      wItHR = "act" ;
}

            } else {
            
 if (! QXnSg .contains("tangrams") ) 
 {        SplashActivity.gastritic--;
}
 else if 
 ( QXnSg != null) 
 {        sBVgf = true;
} 
 else 
 {        sBVgf = false;
}}




            } else {
                    if (SplashActivity.gastritic > URy5o

) {
                    if ( QXnSg != null) {
                    SplashActivity.gastritic--;

                     URy5o = 13;


                      EzTd8 = false;
}

                     SplashActivity.pseudophone += 8;


                      sBVgf =  false;
}
}




                      if ( SplashActivity.generosity == null
) {
                    SplashActivity.interdata = 3;


                     if (SplashActivity.pseudophone < URy5o

) {
                    SplashActivity.straightup = "";

                     SplashActivity.pseudophone = 10;

                      SplashActivity.convocation = 5;
}

                      SplashActivity.knacked = false;
}
}
        if (SplashActivity.pseudophone < SplashActivity.convocation
) {
            
 if (! SplashActivity.unmisunderstood 
) 
 {        if (11 <= SplashActivity.gastritic
) {
            
 if (URy5o < SplashActivity.convocation
) 
 {        if ( sBVgf 
) {
                    if ( sBVgf 
) {
                    SplashActivity.gastritic++;

            } else {
                    SplashActivity.straightup = "entrenched" ;
}




            } else {
                    SplashActivity.unmisunderstood =  true;
}



}
 else if 
 ( QXnSg != null) 
 {
 if ( QXnSg .contains(wItHR) ) 
 {        URy5o = 10;

}
 else if 
 ( SplashActivity.unmisunderstood 
) 
 {        wItHR = "inchling" ;
} 
 else 
 {        SplashActivity.interdata = 10;
}} 
 else 
 {        sBVgf =  true;
}
            } else {
                    wItHR = "";
}



}
 else if 
 ( QXnSg != null) 
 {        SplashActivity.knacked = false;
} 
 else 
 {        if ( wItHR != null) {
                    if ( wItHR .contains(QXnSg) ) {
                    sBVgf = ! false;

            } else {
                    --SplashActivity.interdata;
}




                     URy5o = 5;

                      SplashActivity.knacked =  false;
}
}
            } else {
                    if (SplashActivity.interdata < SplashActivity.pseudophone
) {
            
 if ( QXnSg != null) 
 {        if ( wItHR == null
) {
            
 if ( SplashActivity.straightup == null
) 
 {        EzTd8 =  false;
}
 else if 
 ( QXnSg == null
) 
 {        wItHR = "leukocytopenia" ;
} 
 else 
 {        URy5o -= 6;
}
                     sBVgf = false;

                      QXnSg = "";
}
}
 else if 
 ( QXnSg .equals(wItHR) ) 
 {        if (SplashActivity.interdata < SplashActivity.interdata
) {
                    ++SplashActivity.convocation;

                     sBVgf = true;

                      SplashActivity.generosity = "jampanis" ;
}
} 
 else 
 {        wItHR = "";
}
            } else {
                    if ( sBVgf 
) {
            
 if ( EzTd8 
) 
 {        SplashActivity.unmisunderstood =  true;
}
 else if 
 ( wItHR == null
) 
 {        QXnSg = "";
} 
 else 
 {        EzTd8 =  false;
}
            } else {
                    URy5o -= 12;

}



}



}




         
    }

     
    public  void embezzled(String UPlqV, boolean byGqU, int tjwYm, int BpBHS) {
                if (! UPlqV .equals(SplashActivity.generosity) ) {
            
 if (SplashActivity.convocation <= SplashActivity.pseudophone
) 
 {        if ( byGqU 
) {
                    if ( SplashActivity.straightup == null
) {
            
 if (! UPlqV .equals("somatotropism") ) 
 {
 if ( SplashActivity.generosity == null
) 
 {        SplashActivity.unmisunderstood = true;
}
 else if 
 ( UPlqV != null) 
 {        byGqU = true;
} 
 else 
 {        UPlqV = "";
}}
 else if 
 (BpBHS <= SplashActivity.gastritic
) 
 {        UPlqV = "nondispersion" ;
} 
 else 
 {        byGqU =  true;
}
                     SplashActivity.pseudophone = 11;

                      tjwYm--;
}

            } else {
                    if ( SplashActivity.knacked 
) {
                    if (SplashActivity.convocation > BpBHS

) {
                    tjwYm = 1;


            } else {
                    --tjwYm;
}




            } else {
                    tjwYm = 9;
}



}



}
 else if 
 (SplashActivity.gastritic <= SplashActivity.pseudophone
) 
 {        if ( SplashActivity.straightup == null
) {
                    if ( UPlqV == null
) {
                    if ( UPlqV == null
) {
                    UPlqV = "acetaldol" ;

                     BpBHS = 7;


                      SplashActivity.unmisunderstood = true;
}

                     byGqU =  false;

                      SplashActivity.unmisunderstood = false;
}

             
 if ( UPlqV != null) 
 {        BpBHS++;
}
 else if 
 ( SplashActivity.knacked 
) 
 {        SplashActivity.generosity = "bloosme" ;
} 
 else 
 {        tjwYm = 9;
}
                      SplashActivity.gastritic++;
}
} 
 else 
 {        --BpBHS;
}
            } else {
                    if ( UPlqV != null) {
                    if ( SplashActivity.straightup .isEmpty() ) {
            
 if (! SplashActivity.unmisunderstood 
) 
 {        if (SplashActivity.gastritic == tjwYm
) {
                    byGqU = true;

                     tjwYm++;

                      UPlqV = "pleuronect" ;
}
}
 else if 
 ( UPlqV .equals(UPlqV) ) 
 {        ++SplashActivity.convocation;
} 
 else 
 {        SplashActivity.pseudophone -= 10;
}
            } else {
                    if ( UPlqV != null) {
                    UPlqV = "impoverishing" ;

                     SplashActivity.gastritic--;

                      SplashActivity.generosity = "practicalist" ;
}
}




            } else {
                    if (SplashActivity.interdata != tjwYm
) {
                    if ( SplashActivity.generosity .contains(SplashActivity.straightup) ) {
                    byGqU = false;

                     SplashActivity.knacked = false;

                      BpBHS--;
}

                     byGqU = true;

                      byGqU = false;
}
}



}




 if (SplashActivity.interdata <= BpBHS

) 
 {
 if ( UPlqV != null) 
 {        if (BpBHS > SplashActivity.pseudophone
) {
                    if ( UPlqV != null) {
            
 if (! SplashActivity.semioratorically 
) 
 {        if ( SplashActivity.generosity == null
) {
                    UPlqV = "";

                     tjwYm--;

                      SplashActivity.straightup = "considerative" ;
}
}
 else if 
 ( UPlqV .equals(UPlqV) ) 
 {        tjwYm--;
} 
 else 
 {        byGqU =  false;
}
             
 if ( UPlqV .equals("undeposed") ) 
 {        SplashActivity.unmisunderstood = false;
}
 else if 
 (tjwYm == SplashActivity.pseudophone
) 
 {        tjwYm = 2;
} 
 else 
 {        ++tjwYm;
}
                      tjwYm = 11;
}

            } else {
                    if (SplashActivity.pseudophone <= tjwYm

) {
                    if ( UPlqV != null) {
                    tjwYm = 2;


                     byGqU = false;

                      byGqU = false;
}

            } else {
                    SplashActivity.semioratorically = true;
}



}



}
 else if 
 (SplashActivity.gastritic <= tjwYm
) 
 {
 if (tjwYm <= BpBHS

) 
 {        if (BpBHS <= tjwYm
) {
                    if ( UPlqV == null
) {
                    tjwYm++;

                     SplashActivity.unmisunderstood = false;

                      UPlqV = "ammoniuria" ;
}

                     SplashActivity.rhombencephalon = true;

                      SplashActivity.pseudophone = 9;
}
}
 else if 
 (BpBHS < SplashActivity.gastritic
) 
 {        UPlqV = "ascospores" ;
} 
 else 
 {        tjwYm = 8;
}} 
 else 
 {        if ( SplashActivity.generosity != null) {
            
 if ( UPlqV == null
) 
 {        BpBHS = 11;
}
 else if 
 ( UPlqV == null
) 
 {        --SplashActivity.pseudophone;
} 
 else 
 {        SplashActivity.unmisunderstood =  false;
}
            } else {
                    tjwYm = 8;
}



}}
 else if 
 ( UPlqV .isEmpty() ) 
 {        if (! byGqU 
) {
            
 if ( UPlqV == null
) 
 {
 if ( UPlqV == null
) 
 {
 if (tjwYm <= tjwYm
) 
 {        ++tjwYm;
}
 else if 
 (BpBHS <= BpBHS
) 
 {        byGqU = true;
} 
 else 
 {        UPlqV = "dimmock" ;
}}
 else if 
 (tjwYm != SplashActivity.convocation

) 
 {        BpBHS = 11;
} 
 else 
 {        SplashActivity.semioratorically =  false;
}}
 else if 
 (SplashActivity.interdata < SplashActivity.pseudophone
) 
 {        if ( SplashActivity.semioratorically 
) {
                    SplashActivity.gastritic = 14;

            } else {
                    ++BpBHS;
}



} 
 else 
 {        UPlqV = "Phocinae" ;
}
                     if (tjwYm < 3

) {
            
 if (BpBHS <= 5

) 
 {        byGqU =  false;
}
 else if 
 ( UPlqV .equals(UPlqV) ) 
 {        --tjwYm;
} 
 else 
 {        UPlqV = "";
}
            } else {
                    byGqU =  false;
}




                      if (! SplashActivity.generosity .contains("AMLS") ) {
                    BpBHS = 8;


                     SplashActivity.straightup = "uproariously" ;

                      UPlqV = "unbiassedness" ;
}
}
} 
 else 
 {        if ( SplashActivity.generosity == null
) {
                    if ( byGqU 
) {
                    if (! SplashActivity.knacked 
) {
                    SplashActivity.straightup = "";

            } else {
                    byGqU =  true;
}




                     SplashActivity.knacked = true;

                      ++SplashActivity.interdata;
}

                     if ( UPlqV == null
) {
                    BpBHS--;

                     tjwYm = 3;


                      UPlqV = "algerian" ;
}

                      tjwYm = 12;
}
}        if (SplashActivity.gastritic <= 6

) {
                    if ( SplashActivity.semioratorically 
) {
                    if ( UPlqV != null) {
                    ++tjwYm;

             
 if (12 != SplashActivity.gastritic
) 
 {        SplashActivity.convocation = 0;

}
 else if 
 ( UPlqV != null) 
 {        SplashActivity.rhombencephalon = true;
} 
 else 
 {        SplashActivity.unmisunderstood = false;
}
                      UPlqV = "";
}

                     SplashActivity.semioratorically =  true;

                      UPlqV = "";
}

             
 if (tjwYm == SplashActivity.pseudophone
) 
 {        if ( byGqU 
) {
                    if (! SplashActivity.semioratorically 
) {
                    if ( byGqU 
) {
                    SplashActivity.unmisunderstood = false;

            } else {
                    UPlqV = "";
}




                     BpBHS++;

                      SplashActivity.semioratorically = true;
}

                     if (BpBHS != BpBHS

) {
                    BpBHS = 6;


            } else {
                    tjwYm = 6;
}




                      byGqU =  false;
}
}
 else if 
 ( SplashActivity.generosity .isEmpty() ) 
 {
 if ( UPlqV == null
) 
 {        if (SplashActivity.pseudophone > 0

) {
                    --tjwYm;

                     SplashActivity.pseudophone--;

                      UPlqV = "";
}
}
 else if 
 (! byGqU 
) 
 {        tjwYm = 11;
} 
 else 
 {        SplashActivity.straightup = "transubstantiator" ;
}} 
 else 
 {
 if ( UPlqV .contains(UPlqV) ) 
 {        tjwYm = 4;
}
 else if 
 (tjwYm <= tjwYm
) 
 {        byGqU = false;
} 
 else 
 {        --tjwYm;
}}
              
 if ( SplashActivity.straightup != null) 
 {        if ( UPlqV != null) {
                    if (13 <= SplashActivity.convocation
) {
                    byGqU =  true;

            } else {
                    SplashActivity.generosity = "unreeler" ;
}




            } else {
                    SplashActivity.semioratorically = true;
}



}
 else if 
 (5 < SplashActivity.gastritic
) 
 {        if ( SplashActivity.generosity .equals("vulgarizations") ) {
                    byGqU = true;

            } else {
                    SplashActivity.unmisunderstood = true;
}



} 
 else 
 {        SplashActivity.gastritic -= 0;
}}

 if ( SplashActivity.straightup == null
) 
 {
 if (tjwYm < tjwYm

) 
 {        if (tjwYm > tjwYm
) {
                    if ( UPlqV != null) {
            
 if ( byGqU 
) 
 {
 if (8 < SplashActivity.gastritic
) 
 {        UPlqV = "";
}
 else if 
 ( byGqU 
) 
 {        ++BpBHS;
} 
 else 
 {        byGqU = true;
}}
 else if 
 (tjwYm != tjwYm
) 
 {        --tjwYm;
} 
 else 
 {        SplashActivity.unmisunderstood = ! true;
}
                     if (SplashActivity.gastritic != tjwYm
) {
                    UPlqV = "";

            } else {
                    UPlqV = "";
}




                      SplashActivity.unmisunderstood = true;
}

                     if ( byGqU 
) {
                    if ( UPlqV == null
) {
                    tjwYm = 7;


                     --tjwYm;

                      UPlqV = "abalienate" ;
}

            } else {
                    byGqU = true;
}




                      if ( UPlqV != null) {
                    SplashActivity.generosity = "cafuso" ;

            } else {
                    SplashActivity.semioratorically = false;
}



}
}
 else if 
 (tjwYm != 1

) 
 {
 if ( byGqU 
) 
 {
 if ( SplashActivity.generosity != null) 
 {        if ( SplashActivity.knacked 
) {
                    byGqU = true;

            } else {
                    UPlqV = "trio" ;
}



}
 else if 
 (SplashActivity.pseudophone <= 5

) 
 {        tjwYm++;
} 
 else 
 {        byGqU = true;
}}
 else if 
 (tjwYm == tjwYm
) 
 {        if (SplashActivity.interdata > BpBHS

) {
                    SplashActivity.generosity = "Gymnadenia" ;

            } else {
                    UPlqV = "";
}



} 
 else 
 {        UPlqV = "convolution" ;
}} 
 else 
 {
 if (5 != tjwYm
) 
 {        if ( UPlqV == null
) {
                    UPlqV = "musquashroot" ;

            } else {
                    byGqU = true;
}



}
 else if 
 ( SplashActivity.semioratorically 
) 
 {        byGqU = true;
} 
 else 
 {        SplashActivity.unmisunderstood =  true;
}}}
 else if 
 (SplashActivity.pseudophone < SplashActivity.gastritic

) 
 {        if (! byGqU 
) {
                    if ( SplashActivity.generosity != null) {
            
 if ( UPlqV != null) 
 {        if ( SplashActivity.straightup .contains(UPlqV) ) {
                    byGqU = false;

                     UPlqV = "";

                      SplashActivity.unmisunderstood =  false;
}
}
 else if 
 ( byGqU 
) 
 {        byGqU = true;
} 
 else 
 {        UPlqV = "Tangerine" .intern();
}
            } else {
                    UPlqV = "";
}




            } else {
            
 if ( UPlqV == null
) 
 {
 if (! UPlqV .isEmpty() ) 
 {        UPlqV = "";
}
 else if 
 ( UPlqV == null
) 
 {        ++BpBHS;
} 
 else 
 {        --tjwYm;
}}
 else if 
 (SplashActivity.pseudophone == SplashActivity.convocation

) 
 {        UPlqV = "";
} 
 else 
 {        --tjwYm;
}}



} 
 else 
 {        UPlqV = "";
}        if ( SplashActivity.straightup == null
) {
                    if ( SplashActivity.generosity != null) {
                    SplashActivity.rhombencephalon = ! false;

            } else {
                    if ( UPlqV != null) {
            
 if (SplashActivity.interdata != tjwYm
) 
 {        if ( UPlqV == null
) {
                    UPlqV = "anglepoise" ;

            } else {
                    UPlqV = "forsung" ;
}



}
 else if 
 (! SplashActivity.knacked 
) 
 {        SplashActivity.rhombencephalon =  false;
} 
 else 
 {        --SplashActivity.convocation;
}
                     if (tjwYm != 11

) {
                    --SplashActivity.convocation;

            } else {
                    SplashActivity.unmisunderstood = true;
}




                      UPlqV = "";
}
}




                     if (SplashActivity.pseudophone < BpBHS

) {
                    if ( UPlqV != null) {
            
 if ( UPlqV != null) 
 {        if ( SplashActivity.rhombencephalon 
) {
                    SplashActivity.generosity = "hypocrystalline" ;

            } else {
                    SplashActivity.convocation--;
}



}
 else if 
 ( SplashActivity.generosity .contains(SplashActivity.generosity) ) 
 {        UPlqV = "";
} 
 else 
 {        tjwYm--;
}
            } else {
                    if ( SplashActivity.generosity == null
) {
                    UPlqV = "";

            } else {
                    BpBHS--;
}



}




            } else {
                    if ( UPlqV != null) {
                    if ( UPlqV != null) {
                    tjwYm--;

            } else {
                    UPlqV = "holydame" ;
}




            } else {
                    ++BpBHS;
}



}




                      if (SplashActivity.pseudophone == SplashActivity.interdata

) {
                    if ( SplashActivity.generosity == null
) {
                    if ( UPlqV == null
) {
                    SplashActivity.interdata = 5;


                     SplashActivity.generosity = "makeworks" ;

                      SplashActivity.rhombencephalon = false;
}

            } else {
                    SplashActivity.unmisunderstood = true;
}




            } else {
            
 if (SplashActivity.gastritic <= 9

) 
 {        UPlqV = "cynocephalous" ;
}
 else if 
 (BpBHS == BpBHS
) 
 {        UPlqV = "";
} 
 else 
 {        tjwYm = 3;

}}



}
        if ( SplashActivity.generosity .isEmpty() ) {
            
 if ( UPlqV != null) 
 {
 if ( SplashActivity.straightup .contains("funicles") ) 
 {
 if ( UPlqV == null
) 
 {
 if ( UPlqV .isEmpty() ) 
 {        if ( UPlqV == null
) {
                    tjwYm = 7;

            } else {
                    UPlqV = "";
}



}
 else if 
 ( SplashActivity.generosity .contains("describable") ) 
 {        SplashActivity.unmisunderstood = false;
} 
 else 
 {        SplashActivity.interdata = 13;
}}
 else if 
 ( SplashActivity.semioratorically 
) 
 {        if ( SplashActivity.straightup != null) {
                    tjwYm--;

            } else {
                    SplashActivity.semioratorically =  false;
}



} 
 else 
 {        SplashActivity.gastritic = 2;
}}
 else if 
 ( UPlqV != null) 
 {        if ( UPlqV .isEmpty() ) {
                    ++tjwYm;

            } else {
                    SplashActivity.semioratorically = true;
}



} 
 else 
 {
 if ( UPlqV != null) 
 {        SplashActivity.generosity = "Michelina" .toUpperCase();
}
 else if 
 (SplashActivity.convocation != 3

) 
 {        byGqU = false;
} 
 else 
 {        --BpBHS;
}}}
 else if 
 (BpBHS <= BpBHS
) 
 {        if ( UPlqV .equals(SplashActivity.straightup) ) {
                    if ( UPlqV == null
) {
                    UPlqV = "";

                     UPlqV = "musicologists" ;

                      SplashActivity.knacked = false;
}

            } else {
                    if (13 != tjwYm
) {
                    SplashActivity.gastritic = 10;


            } else {
                    BpBHS = 1;

}



}



} 
 else 
 {        SplashActivity.semioratorically = true;
}
            } else {
                    SplashActivity.generosity = "";
}



        if (! SplashActivity.straightup .isEmpty() ) {
            
 if ( byGqU 
) 
 {
 if ( SplashActivity.generosity != null) 
 {        if ( UPlqV != null) {
            
 if ( UPlqV .toUpperCase().isEmpty() ) 
 {        if ( UPlqV != null) {
                    UPlqV = "";

                     UPlqV = "";

                      SplashActivity.gastritic += 14;
}
}
 else if 
 ( SplashActivity.straightup != null) 
 {        SplashActivity.knacked =  false;
} 
 else 
 {        byGqU = false;
}
            } else {
                    if (! SplashActivity.straightup .contains("eudaimonisms") ) {
                    byGqU = false;

            } else {
                    SplashActivity.convocation += 5;

}



}



}
 else if 
 ( UPlqV == null
) 
 {        SplashActivity.semioratorically = false;
} 
 else 
 {        if (! UPlqV .equals("fremdness") ) {
                    tjwYm -= 5;


                     byGqU = false;

                      SplashActivity.interdata--;
}
}}
 else if 
 (! SplashActivity.straightup .equals("unadjustment") ) 
 {        if ( UPlqV .contains(UPlqV) ) {
                    if ( byGqU 
) {
            
 if ( UPlqV != null) 
 {        SplashActivity.knacked = true;
}
 else if 
 (tjwYm == SplashActivity.pseudophone

) 
 {        byGqU =  true;
} 
 else 
 {        SplashActivity.semioratorically = true;
}
            } else {
                    UPlqV = "";
}




                     byGqU = true;

                      SplashActivity.semioratorically = false;
}
} 
 else 
 {
 if ( UPlqV != null) 
 {
 if (tjwYm == BpBHS
) 
 {        tjwYm = 14;

}
 else if 
 ( UPlqV .equals("semiconcealed") ) 
 {        byGqU = true;
} 
 else 
 {        SplashActivity.straightup = "";
}}
 else if 
 (tjwYm <= 0

) 
 {        byGqU = true;
} 
 else 
 {        BpBHS = 6;
}}
            } else {
            
 if (SplashActivity.gastritic < BpBHS

) 
 {        if (BpBHS <= 2

) {
                    if (SplashActivity.interdata != 13

) {
                    if (SplashActivity.interdata <= 9

) {
                    byGqU = true;

            } else {
                    SplashActivity.semioratorically = false;
}




            } else {
                    SplashActivity.convocation = 10;

}




            } else {
            
 if ( SplashActivity.semioratorically 
) 
 {        UPlqV = "";
}
 else if 
 (! byGqU 
) 
 {        BpBHS -= 6;
} 
 else 
 {        ++BpBHS;
}}



}
 else if 
 ( UPlqV == null
) 
 {
 if (2 <= SplashActivity.convocation
) 
 {        if (SplashActivity.pseudophone <= 3

) {
                    tjwYm++;

                     SplashActivity.rhombencephalon =  true;

                      BpBHS++;
}
}
 else if 
 (SplashActivity.interdata != SplashActivity.interdata

) 
 {        UPlqV = "Dasycladaceae" ;
} 
 else 
 {        UPlqV = "";
}} 
 else 
 {
 if ( UPlqV != null) 
 {        byGqU = true;
}
 else if 
 (! UPlqV .equals("unverdurous") ) 
 {        byGqU = ! false;
} 
 else 
 {        byGqU = false;
}}}




         
    }

     }


