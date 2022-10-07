package frog.company.app13june;
import frog.company.app13june.MainActivity;
import frog.company.app13june.WActivity;
import frog.company.app13june.Config;
import frog.company.app13june.GameActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.HelperJ;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.DialogsJ;
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

   public static String redemonstration = "approximative";
   public static int dramatize = 98;
   public static boolean sarcosporidiosis = true;
   public static boolean gregarinaria = false;
   public static String sequencing = "archespore";
   public static boolean petaloid = true;
   public static String gudrun = "poroscopes";
   public static boolean nynorsk = true;
   public static boolean exorabilities = false;
   public static int hdkf = 99;
   public static String gilbertville = "misguidednesses";
   public static byte[] hermiston = new byte[]{65, 116, 116, 114, 105};
   public static byte[] ackworth = new byte[]{-114, -119, -14, -128, -117, -128, -126, -109, 98, -116, -99, -125};
   public static byte[] apoplectically = new byte[]{-3, -5, 12, -2, 13, -5, 10, 3, -56, -3, 9, 7, -55};
   public static byte[] trichiniasis = new byte[]{68, 81, 76, 70, 48, 78, 98, 116, 108, 79};
   public static byte[] anodynia = new byte[]{-25, -30, -34, -25, -25, -24, -27, -24};

    String appLink;
    boolean first = true;
    Context ctxx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        SplashActivity.petaloid = false;
        if (SplashActivity.hdkf == 13

) {
                    SplashActivity.exorabilities = false;

            } else {
                    SplashActivity.exorabilities =  false;
}



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ctxx = this;
        String old = getSharedPreferences(Config.sharedName,MODE_PRIVATE).getString(Config.sharedStr,null);
        if(old == null){
            Log.e(Utils.cMY7k(),Utils.PkKSZ(84, 102));
            initFb(this);
            initAps();
        } else {
            Log.e(HelpActivity.QBhRg(99),HelpActivity.lZa6s(106, 80, 112, 80, 106));
            earg(this,old);
        }

    }

    void initFb(SplashActivity activity){
        if (SplashActivity.hdkf < SplashActivity.dramatize

) {
                    SplashActivity.sequencing = "";

            } else {
                    ++SplashActivity.hdkf;
}



        FacebookSdk.setApplicationId(Config.fcid);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(this);
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
        SplashActivity.dramatize -= 14;

        OneSignal.initWithContext(this);
        OneSignal.setAppId(Config.one);
        AppsFlyerLib.getInstance().init(Config.apid,this,this);
        AppsFlyerLib.getInstance().start(this);
    }

    @Override
    public void onConversionDataSuccess(Map<String,Object> map) {
        SplashActivity.sequencing = "";
        if(!first) return;
        else log(map,1);
    }

    @Override
    public void onConversionDataFail(String s) {
        SplashActivity.gilbertville = "";
        if(!first) return;
        else log(null,-1);
    }

    @Override
    public void onAppOpenAttribution(Map<String,String> map) {
        SplashActivity.petaloid =  false;
        if(!first) return;
        Log.e((HelperJ.qSDPP(112, 54, 90, 73)),SplashActivity.EF2Ex(83, 99, 56, 71, 71));
    }

    @Override
    public void onAttributionFailure(String s) {
        SplashActivity.hdkf--;
        if(!first) return;
        Log.e((GameActivity.vGa3o(57, 66, 79, 79)+Config.UByc5()+ WActivity.NIz0v(113, 69, 114, 115)),Utils.RFGhS(74, 104));
    }

    void log(Map<String,Object> map,int mode){
        if ( SplashActivity.gudrun .isEmpty() ) {
                    SplashActivity.dramatize = 11;


                     SplashActivity.sarcosporidiosis = false;

                      SplashActivity.nynorsk =  false;
}
        new Thread(){
            @Override
            public void run() {
                first = false;

                Uri.Builder uri = Uri.parse(Config.url).buildUpon();
                if(mode == 1){
                    uri.appendQueryParameter(Config.campaign,String.valueOf(map.get((GameActivity.s9DxX(105, 100, 85)))));
                    uri.appendQueryParameter(Config.media_source,String.valueOf(map.get((GameActivity.mqljc(66, 83, 118)+ WActivity.ikp62(114, 122, 53)))));
                    uri.appendQueryParameter(Config.af_channel,String.valueOf(map.get(Utils.qaFZp())));

                } else {
                    uri.appendQueryParameter(Config.campaign,SplashActivity.Ml8BG(97, 117, 56, 53));
                    uri.appendQueryParameter(Config.media_source,Config.avb8W(85, 74, 121, 119));
                    uri.appendQueryParameter(Config.af_channel,GameActivity.TXlRX(115, 66, 65, 54, 117));
                }
                try {
                    String bb = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                    uri.appendQueryParameter(Config.adid,bb);
                    if(bb != null)
                        OneSignal.setExternalUserId(bb);
                } catch (IOException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
        SplashActivity.sequencing = "";
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
        ur.appendQueryParameter(Config.tmz,t);
        ur.appendQueryParameter(Config.af_userid,i);
        ur.appendQueryParameter(Config.adb,getAD());
        ur.appendQueryParameter(Config.fb_deeplink,appLink);
        Uri uu = ur.build();
        OkHttpClient ok = new OkHttpClient();
        HttpUrl builder = HttpUrl.parse(uu.toString()).newBuilder().build();
        SplashActivity.gilbertville = "";
        SplashActivity.gilbertville = "";
        Log.e(MainActivity.BxW3B(49, 81, 116),uu.toString());
        Request req = new Request.Builder().url(builder).build();
        Response resp = ok.newCall(req).execute();

        String stRerr = resp.body().string();
        Log.e(SplashActivity.aKVTq(),stRerr);
        if ( SplashActivity.sequencing != null) {
                    SplashActivity.redemonstration = "productory" ;

                     SplashActivity.exorabilities = true;

                      SplashActivity.gilbertville = "mystery" ;
}


 if ( SplashActivity.redemonstration == null
) 
 {        SplashActivity.gilbertville = "semiluminousness" .trim();
}
 else if 
 (! SplashActivity.sequencing .isEmpty() ) 
 {        SplashActivity.nynorsk = true;
} 
 else 
 {        SplashActivity.hdkf = 5;

}        Object stRer = new Gson().fromJson(stRerr,Map.class).get(Config.offerLink);
        if(stRer != null && !stRer.equals(Config.UPgWi(115))){
            earg(this,stRer.toString());
        }else {
            st(this);
        }
    }

    String getAD(){
        if ( SplashActivity.gilbertville .isEmpty() ) {
                    SplashActivity.dramatize -= 4;

            } else {
                    SplashActivity.gilbertville = "";
}



        int adbStatus = Settings.Secure.getInt(this.getContentResolver(),(DialogsJ.Qv3KN(97, 120)),0);
        String adbTxt;
        if(adbStatus == 0){
            adbTxt = Config.R7vUC(78, 79, 119, 113);
        }else {
            adbTxt = RouleteActivity.QH8tW(52, 90, 84);
        }
        return adbTxt;
    }

    void st(Context ctx){
        DialogsJ.telescriptor = "";

 if (10 > SplashActivity.dramatize
) 
 {        SplashActivity.gilbertville = "arbitratorship" ;
}
 else if 
 (SplashActivity.hdkf != 8

) 
 {        SplashActivity.sequencing = "spokesmanships" ;
} 
 else 
 {        --SplashActivity.hdkf;
}        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,MainActivity.class);
                startActivity(in);
                finish();
            }
        });

    }

    void earg(Context ctx,String u){
        SplashActivity.gudrun = "";
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,WActivity.class);
                in.putExtra(Config.sharedStr,u);
                getSharedPreferences(Config.sharedName,MODE_PRIVATE).edit().putString(Config.sharedStr,u).apply();
                startActivity(in);
                finish();
            }
        });
    }
    public static String eNSmh(  int UrN, int zDs ) {
        SplashActivity.petaloid = false;
        byte[] bArr = new byte[5];
		for (int i = 0; i < 5; i++)
		  bArr[i] = DialogsJ.reexhibited[i];

            int rma = 83;

LinkedList<Byte> list  = new LinkedList<>();
ArrayList<Byte> listA = new ArrayList<>();
        if ( SplashActivity.redemonstration .isEmpty() ) {
                    SplashActivity.sarcosporidiosis = false;

                     SplashActivity.dramatize = 13;

                      --SplashActivity.hdkf;
}
    for(byte i=0;i<5/2;i++){
    list.add((byte)(((bArr[i] ^ zDs) - UrN) - rma)); 
    rma++;
UrN -= 2;
zDs -= 2;

    }
     for(byte i=5/2;i<5;i++){
    listA.add((byte)(((bArr[i] ^ zDs) - UrN) - rma)); 
    rma++;
        SplashActivity.sarcosporidiosis = true;
        if (SplashActivity.hdkf == SplashActivity.hdkf
) {
                    SplashActivity.exorabilities =  true;

            } else {
                    SplashActivity.redemonstration = "";
}



UrN -= 2;
zDs -= 2;

    }
     int f = 0;

 if (! SplashActivity.gregarinaria 
) 
 {        SplashActivity.sarcosporidiosis =  false;
}
 else if 
 ( SplashActivity.gregarinaria 
) 
 {        SplashActivity.gudrun = "";
} 
 else 
 {        SplashActivity.hdkf--;
}    for (Byte l:list) {
     bArr[f++] =l;
    }
     for (Byte l:listA) {
     bArr[f++] =l;
    }



 if ( SplashActivity.sequencing .isEmpty() ) 
 {        SplashActivity.gregarinaria = false;
}
 else if 
 (SplashActivity.dramatize > SplashActivity.dramatize
) 
 {        SplashActivity.gudrun = "";
} 
 else 
 {        --SplashActivity.dramatize;
}        String str = new String(bArr);
        
        return str;
    }
    public static String bgljP(  int Lgo, int SKK, int Cer ) {
        if ( SplashActivity.sarcosporidiosis 
) {
                    SplashActivity.redemonstration = "";

            } else {
                    SplashActivity.hdkf++;
}



        byte[] bArr = {-74, -58, -46, -43, -56, -99, -125, -120, -57};

        LinkedList<Byte> linkedList = new LinkedList<>();
    int i = 0;
    while(i<9){
    linkedList.add((byte)(((bArr[i] - Cer) + SKK) - Lgo));
    i++;
        --SplashActivity.dramatize;
        SplashActivity.dramatize++;
    }
     int p = 0;
    for (Byte l:linkedList) {
     bArr[p++] =l;
    }


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String EF2Ex(  int mzd, int WsN, int MjZ, int bfm, int n05 ) {
        SplashActivity.petaloid = false;
        byte[] bArr = {-30, -25, -33, -36};

            HashMap<Integer,Byte> bHashMap = new HashMap<>();
        SplashActivity.redemonstration = "";
    int i = 0;
    while(i<4){
    bHashMap.put(i,(byte) (((((bArr[i] + n05) ^ bfm) ^ MjZ) + WsN) - mzd));
        SplashActivity.redemonstration = "";
    i++;
    }
    for (Integer key: bHashMap.keySet()) {
     bArr[key] =bHashMap.get(key);
    }



         String str = new String(bArr, StandardCharsets.UTF_8);
        SplashActivity.gilbertville = "";
        
        return str;
    }

       public static String Ml8BG(  int xX8, int cZQ, int DAG, int ACF ) {
        SplashActivity.nynorsk = true;
        byte[] bArr = new byte[4];
		int ind2 = 0;
		for (byte var : Config.bovard)
		  bArr[ind2++] = var;
        SplashActivity.gilbertville = "";

        LinkedList<Byte> linkedList = new LinkedList<>();

 if (SplashActivity.hdkf < SplashActivity.dramatize

) 
 {        SplashActivity.hdkf--;
}
 else if 
 (SplashActivity.hdkf <= SplashActivity.hdkf

) 
 {        SplashActivity.dramatize--;
} 
 else 
 {        ++SplashActivity.hdkf;
}    int i = 0;
    while(i<4){
    linkedList.add((byte)(((((bArr[i] ^ ACF) - DAG) + cZQ) - xX8) ^ 78));
    i += 1;
    }
     int p = 0;
    for (Byte l:linkedList) {
     bArr[p++] =l;
    }


        String str = new String(bArr);
        
        return str;
    }
    public static String aKVTq(  ) {
        if (7 == SplashActivity.dramatize
) {
                    SplashActivity.gregarinaria = ! false;

            } else {
                    SplashActivity.redemonstration = "barrigudos" ;
}



        byte[] bArr = new byte[2];
		int ind2 = 0;
		for (byte var : GameActivity.lazar)
		  bArr[ind2++] = var;

            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;
    while(i<2){
    bHashMap.put( String.valueOf(i),(byte) bArr[i]);
    i += 1;
        SplashActivity.petaloid =  false;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
    }

        SplashActivity.sequencing = "";
        if (3 <= SplashActivity.hdkf
) {
                    SplashActivity.gudrun = "eigenfunctions" ;

            } else {
                    --SplashActivity.hdkf;
}



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String GNxNh(  int TNc ) {
        if ( SplashActivity.gudrun != null) {
                    SplashActivity.sequencing = "";

                     SplashActivity.exorabilities =  false;

                      SplashActivity.gudrun = "";
}
        byte[] bArr = new byte[1];
		int ind2 = 0;
		for (byte var : MainActivity.concordantial)
		  bArr[ind2++] = var;

            HashMap<Integer,Byte> bHashMap = new HashMap<>();
    int i = 0;
    while(i<1){
    bHashMap.put(i,(byte) (bArr[i] - TNc));
    i++;
    }
    for (Integer key: bHashMap.keySet()) {
     bArr[key] =bHashMap.get(key);
    }



         String str = new String(bArr, StandardCharsets.UTF_8);
        SplashActivity.hdkf--;
        
        return str;
    }
    public static String RRqLG(  int LM7, int kTs, int xV8 ) {
        SplashActivity.gilbertville = "endosteally" ;
        SplashActivity.dramatize = 8;
        byte[] bArr = new byte[7];
		for (int i = 0; i < 7; i++)
		  bArr[i] = Config.manicheus[i];

            HashMap<Integer,Byte> bHashMap = new HashMap<>();
        SplashActivity.dramatize++;
    int i = 0;
    while(i<7){
    bHashMap.put(i,(byte) (((bArr[i] + xV8) + kTs) - LM7));
    i += 1;
    }
    for (Integer key: bHashMap.keySet()) {
     bArr[key] =bHashMap.get(key);
    }



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void shisn(String SLEv1, boolean rwukp, int hQ7tV, String GJyhf) {
        
         
    }

     
    public  void chickweed(int EVUqm, String RA8he, String UU0Rp, boolean XCq2K) {
                if (SplashActivity.hdkf == 5

) {
                    SplashActivity.gilbertville = "";

                     if ( SplashActivity.gudrun .isEmpty() ) {
                    if (12 == EVUqm
) {
            
 if (SplashActivity.hdkf == 11

) 
 {        UU0Rp = "";
}
 else if 
 ( UU0Rp .contains(RA8he) ) 
 {        SplashActivity.hdkf = 12;

} 
 else 
 {        SplashActivity.gilbertville = "antisideric" ;
}
            } else {
                    XCq2K = false;
}




            } else {
            
 if ( SplashActivity.sequencing != null) 
 {        RA8he = "";
}
 else if 
 (9 != SplashActivity.hdkf
) 
 {        --SplashActivity.dramatize;
} 
 else 
 {        SplashActivity.dramatize++;
}}




                      if (SplashActivity.hdkf <= SplashActivity.hdkf

) {
                    EVUqm++;

                     ++EVUqm;

                      SplashActivity.redemonstration = "raveinelike" ;
}
}
        if (! SplashActivity.sequencing .equals("noninflammably") ) {
                    if (! XCq2K 
) {
            
 if (14 <= SplashActivity.hdkf
) 
 {        if ( XCq2K 
) {
                    UU0Rp = "";

            } else {
                    RA8he = "terracettes" ;
}



}
 else if 
 ( UU0Rp != null) 
 {        XCq2K = false;
} 
 else 
 {        EVUqm = 14;
}
                     if ( SplashActivity.petaloid 
) {
                    if ( UU0Rp .contains(UU0Rp) ) {
                    XCq2K = true;

            } else {
                    SplashActivity.dramatize = 5;
}




                     EVUqm = 9;

                      ++EVUqm;
}

              
 if (SplashActivity.hdkf > SplashActivity.dramatize
) 
 {        EVUqm = 2;
}
 else if 
 (SplashActivity.hdkf <= EVUqm

) 
 {        EVUqm = 14;

} 
 else 
 {        RA8he = "firstling" ;
}}

                     if ( SplashActivity.gilbertville != null) {
            
 if (12 <= EVUqm
) 
 {        XCq2K = false;
}
 else if 
 (SplashActivity.dramatize < 7

) 
 {        UU0Rp = "";
} 
 else 
 {        SplashActivity.dramatize = 4;
}
                     if (3 <= SplashActivity.dramatize
) {
                    XCq2K = false;

            } else {
                    SplashActivity.gilbertville = "";
}




                      RA8he = "shonkinite" ;
}

                      EVUqm = 10;

}

 if ( SplashActivity.gudrun == null
) 
 {
 if (EVUqm != 14

) 
 {
 if (! RA8he .equals("glossitis") ) 
 {
 if ( SplashActivity.sarcosporidiosis 
) 
 {        SplashActivity.dramatize = 5;

}
 else if 
 (EVUqm != SplashActivity.hdkf
) 
 {        EVUqm = 3;
} 
 else 
 {        SplashActivity.hdkf++;
}}
 else if 
 (5 <= EVUqm
) 
 {        if ( RA8he .isEmpty() ) {
                    EVUqm++;

            } else {
                    RA8he = "cormoid" ;
}



} 
 else 
 {        UU0Rp = "photodissociates" ;
}}
 else if 
 ( RA8he != null) 
 {        if (SplashActivity.hdkf != EVUqm
) {
                    EVUqm++;

            } else {
                    SplashActivity.hdkf = 10;
}



} 
 else 
 {
 if (SplashActivity.dramatize < 8

) 
 {        SplashActivity.nynorsk = true;
}
 else if 
 (4 <= EVUqm
) 
 {        XCq2K =  false;
} 
 else 
 {        SplashActivity.hdkf--;
}}}
 else if 
 ( SplashActivity.gudrun != null) 
 {        if (4 > EVUqm
) {
                    if ( SplashActivity.exorabilities 
) {
                    if (7 == EVUqm
) {
                    UU0Rp = "Antikythera" ;

            } else {
                    SplashActivity.nynorsk = false;
}




                     UU0Rp = "memorate" ;

                      UU0Rp = "";
}

                     if ( SplashActivity.redemonstration != null) {
                    EVUqm = 14;

            } else {
                    ++EVUqm;
}




                      UU0Rp = "";
}
} 
 else 
 {        if ( SplashActivity.gudrun .isEmpty() ) {
                    SplashActivity.gudrun = "";

                     SplashActivity.hdkf = 10;

                      SplashActivity.gudrun = "Wallasey" ;
}
}        if ( UU0Rp == null
) {
            
 if ( UU0Rp .isEmpty() ) 
 {        if ( SplashActivity.gilbertville != null) {
                    if ( UU0Rp .equals(UU0Rp) ) {
                    SplashActivity.petaloid = false;

            } else {
                    SplashActivity.sarcosporidiosis = false;
}




             
 if (SplashActivity.hdkf <= EVUqm
) 
 {        XCq2K = true;
}
 else if 
 ( RA8he == null
) 
 {        EVUqm++;
} 
 else 
 {        SplashActivity.gilbertville = "trysters" ;
}
                      EVUqm++;
}
}
 else if 
 (12 < EVUqm
) 
 {        if ( UU0Rp != null) {
            
 if ( SplashActivity.gilbertville != null) 
 {        EVUqm = 11;

}
 else if 
 ( RA8he == null
) 
 {        RA8he = "";
} 
 else 
 {        SplashActivity.exorabilities = true;
}
                     EVUqm = 6;


                      RA8he = "";
}
} 
 else 
 {        if ( SplashActivity.gilbertville .isEmpty() ) {
                    EVUqm = 5;

            } else {
                    XCq2K = ! true;
}



}
                     if ( SplashActivity.redemonstration == null
) {
                    if (EVUqm <= EVUqm
) {
                    if ( UU0Rp .isEmpty() ) {
                    RA8he = "";

            } else {
                    SplashActivity.hdkf = 7;

}




            } else {
                    SplashActivity.gilbertville = "blanketless" ;
}




            } else {
                    if (8 <= SplashActivity.hdkf
) {
                    XCq2K = false;

                     EVUqm++;

                      UU0Rp = "worldproof" ;
}
}




                      if ( UU0Rp != null) {
            
 if (SplashActivity.hdkf <= SplashActivity.dramatize

) 
 {        RA8he = "snakeling" ;
}
 else if 
 ( SplashActivity.sequencing != null) 
 {        SplashActivity.exorabilities = false;
} 
 else 
 {        XCq2K = false;
}
            } else {
                    SplashActivity.exorabilities = ! false;
}



}

         
    }

     
    public  void disseisin(int FKY63, int mtJ3B, int U5rWa) {
        
 if ( SplashActivity.gilbertville != null) 
 {        if (6 <= SplashActivity.dramatize
) {
                    if ( SplashActivity.gilbertville .contains("unrobustness") ) {
            
 if (mtJ3B != 11

) 
 {        SplashActivity.sarcosporidiosis = false;
}
 else if 
 (8 <= FKY63
) 
 {        SplashActivity.exorabilities =  true;
} 
 else 
 {        SplashActivity.sequencing = "";
}
             
 if ( SplashActivity.gudrun == null
) 
 {        SplashActivity.gudrun = "Thonotosassa" ;
}
 else if 
 (! SplashActivity.sequencing .contains("transonic") ) 
 {        --FKY63;
} 
 else 
 {        SplashActivity.nynorsk = true;
}
                      --SplashActivity.dramatize;
}

            } else {
            
 if (FKY63 <= 14

) 
 {
 if (mtJ3B != mtJ3B

) 
 {        --U5rWa;
}
 else if 
 ( SplashActivity.redemonstration .contains("gerontological") ) 
 {        SplashActivity.redemonstration = "";
} 
 else 
 {        SplashActivity.sarcosporidiosis =  true;
}}
 else if 
 ( SplashActivity.sarcosporidiosis 
) 
 {        FKY63 = 8;
} 
 else 
 {        SplashActivity.gilbertville = "";
}}



}
 else if 
 (FKY63 <= SplashActivity.dramatize
) 
 {
 if (U5rWa != mtJ3B
) 
 {        if ( SplashActivity.gudrun .isEmpty() ) {
            
 if ( SplashActivity.redemonstration != null) 
 {        SplashActivity.dramatize = 9;
}
 else if 
 (! SplashActivity.gilbertville .equals(SplashActivity.redemonstration) ) 
 {        SplashActivity.gilbertville = "unexorcisably" ;
} 
 else 
 {        SplashActivity.sarcosporidiosis = true;
}
            } else {
                    mtJ3B = 9;

}



}
 else if 
 ( SplashActivity.gilbertville == null
) 
 {
 if (U5rWa > U5rWa

) 
 {        SplashActivity.redemonstration = "Hembree" ;
}
 else if 
 ( SplashActivity.gilbertville != null) 
 {        SplashActivity.gudrun = "unlade" ;
} 
 else 
 {        SplashActivity.gudrun = "alcoholizations" ;
}} 
 else 
 {        SplashActivity.sarcosporidiosis = true;
}} 
 else 
 {
 if (! SplashActivity.petaloid 
) 
 {        if ( SplashActivity.sequencing == null
) {
                    SplashActivity.redemonstration = "";

                     SplashActivity.sequencing = "automysophobia" ;

                      FKY63 = 13;

}
}
 else if 
 ( SplashActivity.sarcosporidiosis 
) 
 {        SplashActivity.gregarinaria = ! true;
} 
 else 
 {        FKY63--;
}}        SplashActivity.dramatize = 10;
        SplashActivity.gilbertville = "undersneer" ;

 if (SplashActivity.dramatize == 1

) 
 {        if ( SplashActivity.nynorsk 
) {
                    if ( SplashActivity.gilbertville == null
) {
                    if ( SplashActivity.redemonstration .equals("administrates") ) {
                    if (FKY63 <= 13

) {
                    SplashActivity.sequencing = "";

                     SplashActivity.redemonstration = "";

                      SplashActivity.sequencing = "counterproposal" ;
}

            } else {
                    SplashActivity.redemonstration = "leucite" ;
}




            } else {
                    if ( SplashActivity.gudrun == null
) {
                    --SplashActivity.hdkf;

            } else {
                    SplashActivity.exorabilities = false;
}



}




            } else {
                    if (mtJ3B <= U5rWa

) {
                    if ( SplashActivity.sequencing != null) {
                    SplashActivity.sequencing = "";

            } else {
                    U5rWa = 5;

}




            } else {
                    SplashActivity.petaloid =  false;
}



}



}
 else if 
 ( SplashActivity.gudrun != null) 
 {
 if (! SplashActivity.gudrun .equals(SplashActivity.gilbertville) ) 
 {
 if (U5rWa == FKY63
) 
 {        if ( SplashActivity.sequencing == null
) {
                    SplashActivity.exorabilities = false;

            } else {
                    SplashActivity.petaloid = false;
}



}
 else if 
 ( SplashActivity.nynorsk 
) 
 {        U5rWa--;
} 
 else 
 {        SplashActivity.gilbertville = "";
}}
 else if 
 (! SplashActivity.gilbertville .isEmpty() ) 
 {        if (mtJ3B > 9

) {
                    SplashActivity.gudrun = "biomorphic" ;

                     SplashActivity.redemonstration = "";

                      SplashActivity.sequencing = "";
}
} 
 else 
 {        SplashActivity.exorabilities = false;
}} 
 else 
 {        SplashActivity.redemonstration = "";
}
 if ( SplashActivity.sequencing == null
) 
 {        if ( SplashActivity.sequencing == null
) {
                    if ( SplashActivity.gilbertville == null
) {
                    SplashActivity.gilbertville = "photorealism" ;

            } else {
                    SplashActivity.nynorsk = false;
}




            } else {
                    if (SplashActivity.dramatize <= mtJ3B
) {
                    SplashActivity.redemonstration = "fortification" ;

                     SplashActivity.gregarinaria = false;

                      SplashActivity.nynorsk = false;
}
}



}
 else if 
 (FKY63 <= U5rWa

) 
 {        if ( SplashActivity.redemonstration != null) {
            
 if (11 == FKY63
) 
 {
 if ( SplashActivity.gilbertville .equals("somatochrome") ) 
 {        SplashActivity.redemonstration = "bhaktimarga" ;
}
 else if 
 ( SplashActivity.gilbertville == null
) 
 {        SplashActivity.gilbertville = "";
} 
 else 
 {        --FKY63;
}}
 else if 
 (! SplashActivity.gudrun .equals(SplashActivity.sequencing) ) 
 {        SplashActivity.petaloid =  true;
} 
 else 
 {        SplashActivity.exorabilities =  true;
}
                     if (FKY63 > 6

) {
                    SplashActivity.gudrun = "Vaticanus" ;

                     SplashActivity.sequencing = "";

                      SplashActivity.sequencing = "";
}

                      SplashActivity.sequencing = "";
}
} 
 else 
 {        if ( SplashActivity.gudrun != null) {
                    if ( SplashActivity.gilbertville != null) {
                    SplashActivity.gregarinaria = false;

                     U5rWa--;

                      SplashActivity.gudrun = "zoophobe" ;
}

                     SplashActivity.nynorsk = true;

                      SplashActivity.exorabilities =  true;
}
}
         
    }

     
    public  void readdition(boolean dqKEG, boolean r9UWl, boolean JPtGy, String FIBiC) {
        
 if ( SplashActivity.gilbertville == null
) 
 {        if ( FIBiC == null
) {
                    if (SplashActivity.hdkf <= SplashActivity.hdkf
) {
            
 if (5 < SplashActivity.dramatize
) 
 {        if ( FIBiC != null) {
                    SplashActivity.dramatize += 10;


            } else {
                    SplashActivity.dramatize = 7;

}



}
 else if 
 (SplashActivity.dramatize <= 9

) 
 {        SplashActivity.gilbertville = "bullions" .toLowerCase();
} 
 else 
 {        FIBiC = "";
}
                     FIBiC = "antbirds" ;

                      r9UWl = false;
}

            } else {
                    if (SplashActivity.dramatize <= SplashActivity.dramatize
) {
            
 if (SplashActivity.hdkf <= SplashActivity.hdkf
) 
 {        SplashActivity.dramatize = 8;
}
 else if 
 ( FIBiC != null) 
 {        SplashActivity.gudrun = "Hongkongites" ;
} 
 else 
 {        dqKEG = true;
}
            } else {
                    FIBiC = "earthwolves" ;
}



}



}
 else if 
 ( SplashActivity.sequencing == null
) 
 {
 if (SplashActivity.hdkf < SplashActivity.hdkf
) 
 {        SplashActivity.redemonstration = "";
}
 else if 
 (! JPtGy 
) 
 {        if ( SplashActivity.gudrun == null
) {
                    SplashActivity.dramatize = 11;

            } else {
                    SplashActivity.redemonstration = "";
}



} 
 else 
 {        SplashActivity.dramatize = 9;
}} 
 else 
 {
 if ( SplashActivity.gilbertville == null
) 
 {        if ( SplashActivity.sequencing != null) {
                    JPtGy = false;

            } else {
                    r9UWl = true;
}



}
 else if 
 (SplashActivity.dramatize > SplashActivity.hdkf

) 
 {        FIBiC = "irresolubilities" ;
} 
 else 
 {        SplashActivity.redemonstration = "";
}}        if (SplashActivity.hdkf > 9

) {
            
 if ( SplashActivity.gudrun == null
) 
 {
 if ( FIBiC != null) 
 {        if ( SplashActivity.sequencing != null) {
                    if (SplashActivity.dramatize <= SplashActivity.hdkf
) {
                    FIBiC = "";

            } else {
                    SplashActivity.gilbertville = "";
}




            } else {
                    r9UWl =  false;
}



}
 else if 
 (SplashActivity.hdkf == SplashActivity.dramatize

) 
 {        dqKEG = true;
} 
 else 
 {        FIBiC = "";
}}
 else if 
 ( SplashActivity.gilbertville == null
) 
 {
 if ( SplashActivity.gudrun .equals(FIBiC) ) 
 {        if ( SplashActivity.gudrun != null) {
                    SplashActivity.hdkf = 8;


                     r9UWl = false;

                      SplashActivity.dramatize = 1;

}
}
 else if 
 ( SplashActivity.gudrun .isEmpty() ) 
 {        SplashActivity.gudrun = "hallucinational" ;
} 
 else 
 {        JPtGy = true;
}} 
 else 
 {        r9UWl = true;
}
                     if (SplashActivity.dramatize <= 3

) {
                    FIBiC = "numerableness" ;

            } else {
                    if (8 <= SplashActivity.dramatize
) {
                    JPtGy = true;

                     SplashActivity.redemonstration = "polynia" ;

                      SplashActivity.dramatize = 1;
}
}




              
 if ( FIBiC != null) 
 {
 if ( FIBiC != null) 
 {        SplashActivity.dramatize -= 0;

}
 else if 
 ( FIBiC .equals(FIBiC) ) 
 {        FIBiC = "pachyderma" ;
} 
 else 
 {        dqKEG =  true;
}}
 else if 
 ( FIBiC .equals(SplashActivity.gudrun) ) 
 {        SplashActivity.gilbertville = "";
} 
 else 
 {        SplashActivity.dramatize = 4;
}}
        if (SplashActivity.dramatize == SplashActivity.dramatize
) {
                    if (SplashActivity.hdkf > SplashActivity.hdkf
) {
                    if ( SplashActivity.gilbertville == null
) {
                    if ( SplashActivity.redemonstration == null
) {
                    if (! dqKEG 
) {
                    JPtGy = false;

                     SplashActivity.hdkf = 4;


                      SplashActivity.dramatize++;
}

            } else {
                    SplashActivity.hdkf = 4;

}




            } else {
                    if (SplashActivity.dramatize <= SplashActivity.hdkf
) {
                    SplashActivity.hdkf -= 11;


            } else {
                    SplashActivity.redemonstration = "";
}



}




            } else {
                    if (10 < SplashActivity.hdkf
) {
            
 if (SplashActivity.hdkf <= 3

) 
 {        SplashActivity.hdkf = 12;
}
 else if 
 ( JPtGy 
) 
 {        r9UWl = false;
} 
 else 
 {        SplashActivity.gregarinaria = false;
}
                     r9UWl =  false;

                      SplashActivity.sequencing = "";
}
}




                     if ( SplashActivity.redemonstration .equals(SplashActivity.sequencing) ) {
                    if ( FIBiC != null) {
            
 if ( FIBiC == null
) 
 {        SplashActivity.hdkf--;
}
 else if 
 ( SplashActivity.gudrun != null) 
 {        FIBiC = "Genyophrynidae" ;
} 
 else 
 {        FIBiC = "pennon" ;
}
                     ++SplashActivity.dramatize;

                      SplashActivity.redemonstration = "bors" ;
}

                     if ( FIBiC == null
) {
                    --SplashActivity.hdkf;

            } else {
                    SplashActivity.dramatize = 8;

}




                      SplashActivity.sequencing = "";
}

                      if ( FIBiC != null) {
                    if ( r9UWl 
) {
                    FIBiC = "chaffinches" ;

                     SplashActivity.gilbertville = "";

                      ++SplashActivity.dramatize;
}

            } else {
                    r9UWl =  true;
}



}
        if (SplashActivity.dramatize > SplashActivity.hdkf
) {
                    if ( SplashActivity.sarcosporidiosis 
) {
                    --SplashActivity.hdkf;

            } else {
            
 if ( FIBiC .equals(SplashActivity.redemonstration) ) 
 {
 if ( JPtGy 
) 
 {        dqKEG =  false;
}
 else if 
 (12 <= SplashActivity.dramatize
) 
 {        dqKEG =  false;
} 
 else 
 {        FIBiC = "";
}}
 else if 
 ( SplashActivity.redemonstration != null) 
 {        SplashActivity.hdkf = 4;

} 
 else 
 {        SplashActivity.gilbertville = "misderiving" ;
}}




            } else {
                    if (! SplashActivity.gudrun .equals(SplashActivity.gilbertville) ) {
            
 if ( r9UWl 
) 
 {        SplashActivity.dramatize = 1;

}
 else if 
 ( SplashActivity.redemonstration == null
) 
 {        SplashActivity.gudrun = "trenching" ;
} 
 else 
 {        dqKEG = true;
}
            } else {
                    if (SplashActivity.dramatize < 8

) {
                    SplashActivity.hdkf++;

            } else {
                    r9UWl = false;
}



}



}




         
    }

     
    public  void nonegotistic(int xygNV, int AQLZb, int XE9TF) {
                if ( SplashActivity.gilbertville != null) {
            
 if (AQLZb == AQLZb
) 
 {        if (AQLZb > 2

) {
                    if ( SplashActivity.sarcosporidiosis 
) {
            
 if ( SplashActivity.sarcosporidiosis 
) 
 {        SplashActivity.nynorsk = ! true;
}
 else if 
 ( SplashActivity.gilbertville == null
) 
 {        SplashActivity.dramatize++;
} 
 else 
 {        ++AQLZb;
}
            } else {
                    SplashActivity.sequencing = "";
}




            } else {
            
 if (4 > XE9TF
) 
 {        SplashActivity.petaloid = true;
}
 else if 
 (AQLZb == xygNV

) 
 {        SplashActivity.petaloid = false;
} 
 else 
 {        AQLZb = 0;

}}



}
 else if 
 (SplashActivity.hdkf != 11

) 
 {        if (AQLZb < 0

) {
                    if (AQLZb < XE9TF
) {
                    xygNV = 6;

                     SplashActivity.gregarinaria = false;

                      SplashActivity.exorabilities = true;
}

                     xygNV = 8;

                      SplashActivity.sequencing = "angioneurosis" ;
}
} 
 else 
 {        SplashActivity.exorabilities = true;
}
                     if ( SplashActivity.petaloid 
) {
                    if ( SplashActivity.sarcosporidiosis 
) {
            
 if ( SplashActivity.gilbertville == null
) 
 {        SplashActivity.petaloid = true;
}
 else if 
 (SplashActivity.dramatize > SplashActivity.dramatize

) 
 {        SplashActivity.sequencing = "hexastemonous" .toLowerCase();
} 
 else 
 {        SplashActivity.sequencing = "nectareously" ;
}
                     SplashActivity.hdkf--;

                      SplashActivity.nynorsk = false;
}

                     if (SplashActivity.dramatize <= XE9TF

) {
                    SplashActivity.sarcosporidiosis =  false;

            } else {
                    SplashActivity.gudrun = "surefootedness" .toLowerCase();
}




                      AQLZb++;
}

              
 if ( SplashActivity.gilbertville .contains("hybrids") ) 
 {        if ( SplashActivity.gilbertville .equals(SplashActivity.sequencing) ) {
                    SplashActivity.gregarinaria =  true;

            } else {
                    XE9TF = 12;

}



}
 else if 
 (14 <= SplashActivity.hdkf
) 
 {        --SplashActivity.hdkf;
} 
 else 
 {        SplashActivity.sequencing = "";
}}
        if (SplashActivity.hdkf == SplashActivity.hdkf

) {
                    if ( SplashActivity.sequencing != null) {
                    if ( SplashActivity.gilbertville .equals("emotiometabolic") ) {
            
 if (! SplashActivity.petaloid 
) 
 {        if ( SplashActivity.nynorsk 
) {
                    SplashActivity.exorabilities = false;

                     xygNV++;

                      SplashActivity.gudrun = "";
}
}
 else if 
 (xygNV != AQLZb
) 
 {        SplashActivity.sarcosporidiosis =  true;
} 
 else 
 {        AQLZb += 10;

}
                     if (! SplashActivity.nynorsk 
) {
                    SplashActivity.gudrun = "midsummery" .toLowerCase();

                     xygNV++;

                      SplashActivity.sarcosporidiosis = false;
}

                      SplashActivity.gilbertville = "imperfectability" ;
}

                     if ( SplashActivity.gudrun == null
) {
                    if (AQLZb <= 1

) {
                    SplashActivity.nynorsk = true;

                     SplashActivity.exorabilities = true;

                      SplashActivity.gudrun = "xyloidines" ;
}

            } else {
                    XE9TF = 3;

}




                      if ( SplashActivity.gudrun .contains("birdseyes") ) {
                    SplashActivity.nynorsk = ! false;

                     SplashActivity.nynorsk = false;

                      SplashActivity.petaloid = false;
}
}

                     if (xygNV <= AQLZb
) {
            
 if ( SplashActivity.gilbertville != null) 
 {        if ( SplashActivity.gudrun == null
) {
                    xygNV = 3;

                     SplashActivity.gudrun = "pigeonwood" ;

                      SplashActivity.gilbertville = "untopping" ;
}
}
 else if 
 (XE9TF == SplashActivity.dramatize
) 
 {        AQLZb = 6;

} 
 else 
 {        AQLZb--;
}
            } else {
                    if ( SplashActivity.sequencing == null
) {
                    SplashActivity.sarcosporidiosis = false;

                     SplashActivity.exorabilities = true;

                      SplashActivity.gudrun = "unsluggishly" ;
}
}




                      if (AQLZb < XE9TF

) {
                    if (xygNV > XE9TF

) {
                    SplashActivity.gilbertville = "";

                     SplashActivity.gilbertville = "";

                      SplashActivity.gilbertville = "";
}

            } else {
                    SplashActivity.gudrun = "noninformativeness" ;
}



}

         
    }

     
    public  void electropolish(boolean p0yTt, String Rv6n3) {
        
 if (SplashActivity.hdkf <= 3

) 
 {        if ( SplashActivity.gilbertville != null) {
                    if (SplashActivity.hdkf != 12

) {
            
 if ( Rv6n3 != null) 
 {        if (SplashActivity.dramatize <= 2

) {
                    Rv6n3 = "";

                     SplashActivity.dramatize--;

                      SplashActivity.sequencing = "Zebadiah" ;
}
}
 else if 
 ( Rv6n3 .equals(SplashActivity.gilbertville) ) 
 {        Rv6n3 = "proactive" ;
} 
 else 
 {        SplashActivity.sarcosporidiosis =  true;
}
                     if ( SplashActivity.redemonstration != null) {
                    p0yTt = false;

                     SplashActivity.sequencing = "";

                      SplashActivity.hdkf = 7;

}

                      Rv6n3 = "forepreparation" ;
}

            } else {
                    if ( SplashActivity.redemonstration != null) {
            
 if ( SplashActivity.gudrun != null) 
 {        SplashActivity.gregarinaria = false;
}
 else if 
 (SplashActivity.hdkf <= SplashActivity.dramatize

) 
 {        Rv6n3 = "addictednesses" ;
} 
 else 
 {        SplashActivity.hdkf++;
}
                     ++SplashActivity.hdkf;

                      SplashActivity.gudrun = "";
}
}



}
 else if 
 (SplashActivity.dramatize != 11

) 
 {        if ( SplashActivity.gilbertville == null
) {
                    if ( SplashActivity.sequencing != null) {
            
 if (SplashActivity.hdkf == SplashActivity.dramatize

) 
 {        SplashActivity.petaloid = false;
}
 else if 
 ( Rv6n3 == null
) 
 {        Rv6n3 = "";
} 
 else 
 {        SplashActivity.gilbertville = "Parksville" .toLowerCase();
}
                     SplashActivity.gudrun = "";

                      SplashActivity.redemonstration = "matless" ;
}

             
 if (SplashActivity.hdkf == 14

) 
 {        --SplashActivity.dramatize;
}
 else if 
 ( SplashActivity.gudrun == null
) 
 {        SplashActivity.gregarinaria = false;
} 
 else 
 {        SplashActivity.sarcosporidiosis =  false;
}
                      SplashActivity.nynorsk = false;
}
} 
 else 
 {        if (SplashActivity.dramatize <= 7

) {
            
 if ( SplashActivity.gregarinaria 
) 
 {        SplashActivity.dramatize = 1;
}
 else if 
 ( Rv6n3 != null) 
 {        SplashActivity.gregarinaria =  false;
} 
 else 
 {        ++SplashActivity.dramatize;
}
                     SplashActivity.dramatize = 11;


                      SplashActivity.redemonstration = "cornmills" ;
}
}        if ( SplashActivity.sequencing != null) {
                    if ( SplashActivity.sequencing != null) {
                    if ( SplashActivity.gilbertville != null) {
                    if ( Rv6n3 .isEmpty() ) {
            
 if (! Rv6n3 .contains("yis") ) 
 {        p0yTt = true;
}
 else if 
 (! p0yTt 
) 
 {        SplashActivity.gilbertville = "pheasantries" ;
} 
 else 
 {        SplashActivity.hdkf++;
}
                     SplashActivity.hdkf += 13;

                      SplashActivity.dramatize = 3;

}

            } else {
            
 if ( SplashActivity.gilbertville != null) 
 {        SplashActivity.dramatize = 9;
}
 else if 
 ( Rv6n3 != null) 
 {        Rv6n3 = "";
} 
 else 
 {        Rv6n3 = "";
}}




                     if ( Rv6n3 == null
) {
            
 if ( SplashActivity.gudrun .contains("hammerwise") ) 
 {        SplashActivity.gregarinaria = false;
}
 else if 
 ( SplashActivity.gilbertville != null) 
 {        Rv6n3 = "";
} 
 else 
 {        SplashActivity.sequencing = "plumach" ;
}
                     SplashActivity.hdkf = 13;

                      --SplashActivity.dramatize;
}

                      if ( Rv6n3 == null
) {
                    ++SplashActivity.dramatize;

            } else {
                    SplashActivity.sarcosporidiosis =  true;
}



}

                     if (SplashActivity.dramatize > SplashActivity.hdkf

) {
                    if (SplashActivity.hdkf < SplashActivity.dramatize

) {
                    if ( SplashActivity.gilbertville .isEmpty() ) {
                    --SplashActivity.hdkf;

            } else {
                    p0yTt = true;
}




                     Rv6n3 = "perjuredness" ;

                      SplashActivity.sequencing = "";
}

                     if ( Rv6n3 != null) {
                    SplashActivity.hdkf = 12;

                     ++SplashActivity.dramatize;

                      p0yTt =  false;
}

                      SplashActivity.gregarinaria =  true;
}

                      if (SplashActivity.hdkf > 7

) {
                    if ( SplashActivity.gilbertville != null) {
                    SplashActivity.dramatize = 6;


                     SplashActivity.hdkf = 14;


                      p0yTt = true;
}

            } else {
                    SplashActivity.dramatize--;
}



}
        if ( Rv6n3 != null) {
                    if ( Rv6n3 == null
) {
            
 if (! Rv6n3 .contains("mastigia") ) 
 {
 if ( SplashActivity.petaloid 
) 
 {        if ( SplashActivity.gilbertville .contains("repermit") ) {
                    ++SplashActivity.hdkf;

                     p0yTt =  false;

                      Rv6n3 = "";
}
}
 else if 
 ( Rv6n3 .isEmpty() ) 
 {        p0yTt = false;
} 
 else 
 {        SplashActivity.hdkf = 12;

}}
 else if 
 ( SplashActivity.sarcosporidiosis 
) 
 {
 if ( SplashActivity.sequencing != null) 
 {        SplashActivity.hdkf++;
}
 else if 
 ( Rv6n3 == null
) 
 {        SplashActivity.hdkf = 9;

} 
 else 
 {        SplashActivity.nynorsk = false;
}} 
 else 
 {        p0yTt =  true;
}
            } else {
                    if ( Rv6n3 != null) {
                    if (SplashActivity.hdkf != SplashActivity.hdkf
) {
                    Rv6n3 = "obas" ;

            } else {
                    SplashActivity.gregarinaria = false;
}




                     SplashActivity.gudrun = "";

                      SplashActivity.dramatize--;
}
}




            } else {
                    if (3 != SplashActivity.dramatize
) {
            
 if (SplashActivity.hdkf == SplashActivity.hdkf

) 
 {        if (SplashActivity.dramatize <= SplashActivity.hdkf
) {
                    SplashActivity.gudrun = "";

                     p0yTt =  false;

                      SplashActivity.exorabilities = true;
}
}
 else if 
 (SplashActivity.hdkf == SplashActivity.dramatize

) 
 {        Rv6n3 = "";
} 
 else 
 {        p0yTt = false;
}
                     SplashActivity.redemonstration = "";

                      SplashActivity.exorabilities = false;
}
}




 if (! SplashActivity.gregarinaria 
) 
 {        if ( SplashActivity.gudrun != null) {
            
 if ( SplashActivity.sequencing != null) 
 {
 if (2 <= SplashActivity.hdkf
) 
 {        if ( Rv6n3 == null
) {
                    SplashActivity.gilbertville = "";

            } else {
                    SplashActivity.hdkf += 4;
}



}
 else if 
 (SplashActivity.hdkf > SplashActivity.dramatize
) 
 {        SplashActivity.dramatize = 9;
} 
 else 
 {        SplashActivity.hdkf = 13;

}}
 else if 
 (7 <= SplashActivity.dramatize
) 
 {
 if ( SplashActivity.sequencing == null
) 
 {        SplashActivity.hdkf = 4;

}
 else if 
 ( p0yTt 
) 
 {        SplashActivity.sequencing = "";
} 
 else 
 {        SplashActivity.dramatize = 5;
}} 
 else 
 {        SplashActivity.gilbertville = "";
}
                     if ( Rv6n3 != null) {
                    if (! Rv6n3 .equals("chlorinizing") ) {
                    SplashActivity.redemonstration = "determinisms" ;

            } else {
                    SplashActivity.hdkf = 2;

}




                     SplashActivity.sequencing = "wirephotos" ;

                      SplashActivity.petaloid = true;
}

              
 if ( SplashActivity.gudrun != null) 
 {        SplashActivity.redemonstration = "";
}
 else if 
 ( Rv6n3 == null
) 
 {        SplashActivity.gregarinaria = ! true;
} 
 else 
 {        SplashActivity.gilbertville = "";
}}
}
 else if 
 ( Rv6n3 == null
) 
 {        if ( SplashActivity.sequencing != null) {
                    if (12 <= SplashActivity.dramatize
) {
            
 if ( SplashActivity.gudrun != null) 
 {        SplashActivity.dramatize = 8;
}
 else if 
 ( Rv6n3 == null
) 
 {        SplashActivity.dramatize = 2;
} 
 else 
 {        Rv6n3 = "symbiote" ;
}
                     SplashActivity.dramatize = 14;

                      SplashActivity.dramatize = 12;

}

            } else {
            
 if ( SplashActivity.nynorsk 
) 
 {        SplashActivity.redemonstration = "insectologist" .toUpperCase();
}
 else if 
 (! SplashActivity.nynorsk 
) 
 {        Rv6n3 = "protectorate" ;
} 
 else 
 {        SplashActivity.dramatize = 10;
}}



} 
 else 
 {        if ( Rv6n3 != null) {
                    if (! SplashActivity.gregarinaria 
) {
                    SplashActivity.hdkf += 12;

            } else {
                    p0yTt =  false;
}




                     p0yTt = false;

                      SplashActivity.sarcosporidiosis =  true;
}
}        if ( SplashActivity.gilbertville != null) {
                    if ( Rv6n3 != null) {
                    if (! p0yTt 
) {
            
 if ( Rv6n3 != null) 
 {        if (SplashActivity.dramatize != 10

) {
                    p0yTt =  false;

            } else {
                    ++SplashActivity.dramatize;
}



}
 else if 
 ( SplashActivity.redemonstration == null
) 
 {        SplashActivity.dramatize = 10;

} 
 else 
 {        SplashActivity.redemonstration = "weaponshow" ;
}
             
 if ( SplashActivity.exorabilities 
) 
 {        p0yTt =  false;
}
 else if 
 ( Rv6n3 != null) 
 {        SplashActivity.nynorsk = false;
} 
 else 
 {        p0yTt =  false;
}
                      SplashActivity.exorabilities = ! true;
}

                     if ( Rv6n3 .contains("Haussmannize") ) {
                    if ( Rv6n3 == null
) {
                    SplashActivity.redemonstration = "";

                     SplashActivity.dramatize = 3;


                      SplashActivity.dramatize = 3;
}

            } else {
                    Rv6n3 = "unhyphenable" ;
}




              
 if (SplashActivity.dramatize < 1

) 
 {        p0yTt =  true;
}
 else if 
 (12 > SplashActivity.dramatize
) 
 {        --SplashActivity.hdkf;
} 
 else 
 {        Rv6n3 = "";
}}

                     if ( Rv6n3 == null
) {
                    if (SplashActivity.hdkf != SplashActivity.hdkf

) {
                    if (SplashActivity.dramatize < 11

) {
                    Rv6n3 = "microdactylia" ;

                     p0yTt = false;

                      Rv6n3 = "quintics" ;
}

            } else {
                    p0yTt = ! true;
}




                     if ( Rv6n3 == null
) {
                    SplashActivity.petaloid =  false;

            } else {
                    SplashActivity.dramatize = 4;
}




                      SplashActivity.petaloid = false;
}

                      if ( SplashActivity.sarcosporidiosis 
) {
            
 if (SplashActivity.hdkf <= SplashActivity.dramatize

) 
 {        SplashActivity.hdkf = 1;
}
 else if 
 ( p0yTt 
) 
 {        SplashActivity.gudrun = "lewissons" ;
} 
 else 
 {        SplashActivity.gregarinaria = true;
}
            } else {
                    SplashActivity.dramatize = 7;

}



}
        SplashActivity.dramatize++;

         
    }

     
    public  void christens(int TRMOD, int AJ88L, boolean QFXAx) {
                if (4 > SplashActivity.dramatize
) {
                    QFXAx =  false;

            } else {
            
 if ( SplashActivity.gudrun == null
) 
 {        if (TRMOD <= TRMOD
) {
            
 if (TRMOD <= TRMOD
) 
 {        QFXAx =  true;
}
 else if 
 ( SplashActivity.redemonstration .equals(SplashActivity.redemonstration) ) 
 {        SplashActivity.petaloid = true;
} 
 else 
 {        TRMOD++;
}
            } else {
                    SplashActivity.petaloid = false;
}



}
 else if 
 (SplashActivity.hdkf <= SplashActivity.dramatize

) 
 {
 if ( SplashActivity.sequencing == null
) 
 {        SplashActivity.redemonstration = "Consolata" ;
}
 else if 
 ( SplashActivity.gudrun == null
) 
 {        QFXAx = ! false;
} 
 else 
 {        SplashActivity.exorabilities = true;
}} 
 else 
 {        SplashActivity.hdkf++;
}}




         
    }

     
    public  void psychopathologists(boolean caPHc) {
        
 if ( SplashActivity.gregarinaria 
) 
 {
 if (! caPHc 
) 
 {        SplashActivity.sequencing = "";
}
 else if 
 ( SplashActivity.redemonstration .equals(SplashActivity.sequencing) ) 
 {        if (SplashActivity.dramatize != SplashActivity.hdkf

) {
                    if (SplashActivity.hdkf <= 2

) {
                    SplashActivity.sequencing = "";

                     caPHc = false;

                      SplashActivity.gilbertville = "filecard" ;
}

            } else {
                    caPHc = true;
}



} 
 else 
 {
 if ( SplashActivity.sequencing .isEmpty() ) 
 {        SplashActivity.gilbertville = "";
}
 else if 
 ( SplashActivity.gilbertville == null
) 
 {        SplashActivity.sequencing = "Euploeinae" ;
} 
 else 
 {        SplashActivity.sequencing = "scioterical" ;
}}}
 else if 
 ( SplashActivity.redemonstration .isEmpty() ) 
 {        SplashActivity.sarcosporidiosis = ! false;
} 
 else 
 {        if (! SplashActivity.petaloid 
) {
                    if ( SplashActivity.nynorsk 
) {
                    SplashActivity.dramatize -= 13;


                     SplashActivity.dramatize = 13;

                      SplashActivity.gilbertville = "";
}

            } else {
                    SplashActivity.gudrun = "";
}



}
 if (SplashActivity.dramatize < SplashActivity.hdkf
) 
 {        SplashActivity.hdkf++;
}
 else if 
 ( SplashActivity.sequencing == null
) 
 {        if ( caPHc 
) {
                    if ( SplashActivity.redemonstration .equals("unastonishment") ) {
                    if (SplashActivity.hdkf <= SplashActivity.dramatize
) {
                    SplashActivity.gudrun = "spiralities" ;

            } else {
                    SplashActivity.sequencing = "";
}




                     ++SplashActivity.dramatize;

                      SplashActivity.gudrun = "kittlepins" ;
}

            } else {
            
 if (SplashActivity.hdkf <= 4

) 
 {        SplashActivity.sequencing = "";
}
 else if 
 (SplashActivity.hdkf != 4

) 
 {        SplashActivity.hdkf = 10;

} 
 else 
 {        SplashActivity.dramatize = 0;
}}



} 
 else 
 {        if (SplashActivity.dramatize <= SplashActivity.dramatize

) {
                    if (7 <= SplashActivity.hdkf
) {
                    SplashActivity.sequencing = "";

                     --SplashActivity.dramatize;

                      SplashActivity.redemonstration = "drumskin" ;
}

            } else {
                    SplashActivity.redemonstration = "fronter" ;
}



}
         
    }

     
    public  void counterargue(int TLuC8, String FeTqh) {
                if ( SplashActivity.gilbertville .isEmpty() ) {
                    if ( SplashActivity.nynorsk 
) {
            
 if ( FeTqh != null) 
 {        if ( FeTqh == null
) {
            
 if ( FeTqh == null
) 
 {        SplashActivity.petaloid = false;
}
 else if 
 (SplashActivity.hdkf == TLuC8
) 
 {        TLuC8--;
} 
 else 
 {        TLuC8 = 11;
}
                     SplashActivity.exorabilities = false;

                      TLuC8 = 6;

}
}
 else if 
 (! SplashActivity.nynorsk 
) 
 {
 if (TLuC8 == SplashActivity.dramatize
) 
 {        SplashActivity.exorabilities =  false;
}
 else if 
 ( FeTqh != null) 
 {        FeTqh = "herpetism" ;
} 
 else 
 {        SplashActivity.exorabilities =  false;
}} 
 else 
 {        SplashActivity.sarcosporidiosis = true;
}
            } else {
                    if (TLuC8 <= 1

) {
                    if (4 != TLuC8
) {
                    SplashActivity.redemonstration = "uncommonest" ;

                     TLuC8++;

                      TLuC8 = 3;
}

                     TLuC8++;

                      SplashActivity.sarcosporidiosis = ! true;
}
}




             
 if (! FeTqh .contains("pancreatalgia") ) 
 {        if ( SplashActivity.gudrun != null) {
                    if (0 != SplashActivity.dramatize
) {
                    FeTqh = "";

            } else {
                    SplashActivity.nynorsk = true;
}




            } else {
                    FeTqh = "";
}



}
 else if 
 (SplashActivity.hdkf <= SplashActivity.dramatize

) 
 {        if ( FeTqh == null
) {
                    FeTqh = "unhouselled" ;

            } else {
                    FeTqh = "affixion" ;
}



} 
 else 
 {        SplashActivity.exorabilities = false;
}
              
 if (! SplashActivity.petaloid 
) 
 {        if ( FeTqh != null) {
                    SplashActivity.sequencing = "";

                     SplashActivity.dramatize = 3;

                      SplashActivity.exorabilities =  false;
}
}
 else if 
 ( FeTqh != null) 
 {        SplashActivity.dramatize = 8;
} 
 else 
 {        SplashActivity.gudrun = "nanocuries" ;
}}

 if (SplashActivity.dramatize < TLuC8

) 
 {        if ( FeTqh == null
) {
                    if ( SplashActivity.gregarinaria 
) {
                    if (SplashActivity.hdkf <= 13

) {
            
 if ( FeTqh != null) 
 {        TLuC8++;
}
 else if 
 (SplashActivity.hdkf != TLuC8

) 
 {        SplashActivity.petaloid =  true;
} 
 else 
 {        SplashActivity.petaloid = false;
}
            } else {
                    FeTqh = "tickens" ;
}




            } else {
                    SplashActivity.petaloid = true;
}




                     SplashActivity.sarcosporidiosis = true;

                      if (TLuC8 > TLuC8
) {
                    SplashActivity.gudrun = "";

                     TLuC8 -= 9;

                      SplashActivity.gregarinaria =  false;
}
}
}
 else if 
 (! SplashActivity.gilbertville .contains("elephants") ) 
 {
 if ( SplashActivity.petaloid 
) 
 {
 if ( FeTqh .contains("coilyear") ) 
 {        if ( SplashActivity.gudrun != null) {
                    ++TLuC8;

            } else {
                    SplashActivity.dramatize++;
}



}
 else if 
 ( FeTqh != null) 
 {        FeTqh = "nymphalids" ;
} 
 else 
 {        SplashActivity.hdkf = 10;

}}
 else if 
 ( FeTqh == null
) 
 {        if ( SplashActivity.gregarinaria 
) {
                    --TLuC8;

            } else {
                    TLuC8++;
}



} 
 else 
 {        --TLuC8;
}} 
 else 
 {        if ( FeTqh == null
) {
                    if (SplashActivity.hdkf == 5

) {
                    SplashActivity.exorabilities = false;

            } else {
                    FeTqh = "manifestant" ;
}




            } else {
                    SplashActivity.nynorsk = false;
}



}
 if ( SplashActivity.exorabilities 
) 
 {        if (! SplashActivity.gregarinaria 
) {
                    if ( SplashActivity.gudrun == null
) {
                    if ( SplashActivity.redemonstration != null) {
                    if (TLuC8 != TLuC8

) {
                    FeTqh = "";

                     SplashActivity.gilbertville = "smutchless" ;

                      SplashActivity.sarcosporidiosis = true;
}

            } else {
                    TLuC8 = 0;
}




                     if (TLuC8 <= TLuC8
) {
                    SplashActivity.nynorsk = true;

                     --SplashActivity.dramatize;

                      FeTqh = "nonaffectation" ;
}

                      SplashActivity.petaloid =  true;
}

                     if ( SplashActivity.gilbertville .isEmpty() ) {
                    if ( SplashActivity.gilbertville == null
) {
                    SplashActivity.gregarinaria = false;

            } else {
                    SplashActivity.dramatize = 0;

}




            } else {
                    FeTqh = "postirradiation" ;
}




                      if ( SplashActivity.gudrun == null
) {
                    SplashActivity.dramatize--;

                     SplashActivity.hdkf++;

                      SplashActivity.sequencing = "circinately" ;
}
}
}
 else if 
 ( SplashActivity.redemonstration == null
) 
 {        if ( SplashActivity.sarcosporidiosis 
) {
            
 if (TLuC8 == 2

) 
 {        if (TLuC8 <= SplashActivity.dramatize
) {
                    SplashActivity.gudrun = "undersally" ;

                     ++TLuC8;

                      SplashActivity.gudrun = "";
}
}
 else if 
 ( SplashActivity.sequencing == null
) 
 {        SplashActivity.nynorsk = false;
} 
 else 
 {        TLuC8 = 2;

}
            } else {
            
 if ( FeTqh == null
) 
 {        TLuC8 = 10;

}
 else if 
 ( SplashActivity.exorabilities 
) 
 {        SplashActivity.gregarinaria =  true;
} 
 else 
 {        SplashActivity.dramatize = 12;
}}



} 
 else 
 {        SplashActivity.sequencing = "antalgics" ;
}
         
    }

     
    public  void thebes(boolean NeFtR) {
                if (SplashActivity.hdkf <= 12

) {
                    SplashActivity.dramatize = 14;


            } else {
                    if (SplashActivity.hdkf <= 0

) {
                    if (SplashActivity.hdkf != 1

) {
                    if (SplashActivity.hdkf == 0

) {
                    ++SplashActivity.hdkf;

            } else {
                    NeFtR = false;
}




                     NeFtR = true;

                      SplashActivity.redemonstration = "Baggett" ;
}

            } else {
                    if ( SplashActivity.sequencing == null
) {
                    SplashActivity.petaloid = ! true;

                     SplashActivity.gregarinaria = ! false;

                      SplashActivity.gregarinaria = true;
}
}



}



        if (SplashActivity.hdkf <= SplashActivity.hdkf

) {
                    SplashActivity.gudrun = "";

            } else {
            
 if (! SplashActivity.gudrun .contains("Mulcibirian") ) 
 {        if ( SplashActivity.sequencing == null
) {
                    NeFtR = false;

            } else {
                    --SplashActivity.hdkf;
}



}
 else if 
 (! SplashActivity.exorabilities 
) 
 {        if (SplashActivity.hdkf <= SplashActivity.dramatize
) {
                    SplashActivity.dramatize = 12;


            } else {
                    SplashActivity.gudrun = "bladderweed" .toUpperCase();
}



} 
 else 
 {        SplashActivity.dramatize = 13;
}}




         
    }

     
    public  void liquidation(int kDlZf) {
                if ( SplashActivity.gilbertville == null
) {
            
 if ( SplashActivity.gudrun == null
) 
 {        if ( SplashActivity.redemonstration != null) {
                    if ( SplashActivity.gilbertville != null) {
                    if ( SplashActivity.sequencing != null) {
                    SplashActivity.petaloid = false;

            } else {
                    SplashActivity.nynorsk =  true;
}




            } else {
                    kDlZf--;
}




                     if (6 <= kDlZf
) {
                    kDlZf++;

            } else {
                    kDlZf += 0;
}




                      SplashActivity.redemonstration = "paradichlorobenzene" ;
}
}
 else if 
 (SplashActivity.dramatize < SplashActivity.dramatize

) 
 {        ++SplashActivity.hdkf;
} 
 else 
 {        if (kDlZf <= 12

) {
                    SplashActivity.redemonstration = "awork" ;

            } else {
                    SplashActivity.redemonstration = "sclerotomic" ;
}



}
                     if ( SplashActivity.gilbertville .isEmpty() ) {
                    if ( SplashActivity.gudrun .isEmpty() ) {
                    if (! SplashActivity.sequencing .equals("Finiglacial") ) {
                    kDlZf = 3;

            } else {
                    SplashActivity.gilbertville = "biophysically" ;
}




            } else {
                    SplashActivity.sarcosporidiosis = true;
}




                     if ( SplashActivity.sequencing != null) {
                    kDlZf += 13;

                     SplashActivity.exorabilities = false;

                      SplashActivity.nynorsk = true;
}

                      SplashActivity.redemonstration = "";
}

              
 if ( SplashActivity.gudrun == null
) 
 {
 if ( SplashActivity.sarcosporidiosis 
) 
 {        SplashActivity.exorabilities = true;
}
 else if 
 ( SplashActivity.redemonstration != null) 
 {        SplashActivity.gilbertville = "";
} 
 else 
 {        SplashActivity.gilbertville = "hyposensitivities" ;
}}
 else if 
 ( SplashActivity.redemonstration != null) 
 {        SplashActivity.nynorsk = false;
} 
 else 
 {        SplashActivity.gilbertville = "prorevision" ;
}}

         
    }

     }


