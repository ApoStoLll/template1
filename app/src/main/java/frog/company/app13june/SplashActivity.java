package frog.company.app13june;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.kyf.traerfw.thewerf;
import frog.company.app13june.WActivity;
import frog.company.app13june.kyf.jrtyjhftgh;
import frog.company.app13june.kyf.kiutkdg;
import frog.company.app13june.kyf.traerfw.hrrefwerf;
import frog.company.app13june.MainActivity;
import frog.company.app13june.kyf.traerfw.threrf;
import frog.company.app13june.kyf.traerfw.ytjtghfsgdr;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.cc.jurtyewsrf;
import frog.company.app13june.kyf.kjuyjtrhdr;
import frog.company.app13june.GameActivity;
import frog.company.app13june.kyf.srtrhju;
import frog.company.app13june.HelperJ;
import frog.company.app13june.kyf.iutldxrfgresg;
import frog.company.app13june.kyf.rtyjfythjdj;
import frog.company.app13june.Utils;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.cc.oilrtw;
import frog.company.app13june.cc.TYHREw;
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

   public static String wastrel = "thermolysis";
   public static int counterintuitively = 72;
   public static boolean beleaguering = true;
   public static boolean travolators = true;
   public static int brassets = 56;
   public static String marienville = "handstitched";
   public static boolean mongolian = false;
   public static boolean grandmother = false;
   public static int beghard = 116;
   public static String slumpproof = "rustproofs";
   public static byte[] suspensers = new byte[]{104, 101, 114, 101};
   public static byte[] libellulidae = new byte[]{44, 40, 43, 64};

    String appLink;
    boolean first = true;
    Context ctxx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        SplashActivity.counterintuitively = 8;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ctxx = this;
        String old = getSharedPreferences(Config.sharedName,MODE_PRIVATE).getString(Config.sharedStr,null);
        SplashActivity.brassets--;
        if(old == null){
            Log.e(GameActivity.y1yrU(110, 56, 110, 79, 77, 71, 109),kjuyjtrhdr.nVMes(119, 106, 101, 118, 101, 107));
            initFb(this);
            initAps();
        } else {
            Log.e(jurtyewsrf.t2guJ(102, 53),HelpActivity.VziWS(53, 56, 79, 115, 100, 104));
        SplashActivity.grandmother =  true;
            earg(this,old);
        }

    }

    void initFb(SplashActivity activity){
        SplashActivity.travolators = true;
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
        ++SplashActivity.beghard;
        OneSignal.initWithContext(this);
        OneSignal.setAppId(Config.one);
        AppsFlyerLib.getInstance().init(Config.apid,this,this);
        AppsFlyerLib.getInstance().start(this);
    }

    @Override
    public void onConversionDataSuccess(Map<String,Object> map) {
        --SplashActivity.brassets;
        if(!first) return;
        else log(map,1);
    }

    @Override
    public void onConversionDataFail(String s) {
        SplashActivity.travolators = false;
        if(!first) return;
        else log(null,-1);
    }

    @Override
    public void onAppOpenAttribution(Map<String,String> map) {
        SplashActivity.beghard--;
        if(!first) return;
        Log.e(ytjtghfsgdr.xupeI(106, 83),jurtyewsrf.I4tRQ(48, 49, 53));
    }

    @Override
    public void onAttributionFailure(String s) {
        SplashActivity.wastrel = "";
        if(!first) return;
        Log.e(threrf.j3kAA(81),MainActivity.K5Gb2(50, 49, 85, 68, 117));
    }

    void log(Map<String,Object> map,int mode){
        SplashActivity.beleaguering = true;
        new Thread(){
            @Override
            public void run() {
                first = false;

                Uri.Builder uri = Uri.parse(Config.url).buildUpon();
                if(mode == 1){
                    uri.appendQueryParameter(Config.campaign,String.valueOf(map.get(iutldxrfgresg.Lz9q4())));
                    uri.appendQueryParameter(Config.media_source,String.valueOf(map.get(TYHREw.mgCsZ(98, 76, 55, 77))));
                    uri.appendQueryParameter(Config.af_channel,String.valueOf(map.get((oilrtw.dWYbk(85, 88, 79, 53)))));
                } else {
                    uri.appendQueryParameter(Config.campaign,rtyjfythjdj.A7yYn(85, 98, 57));
                    uri.appendQueryParameter(Config.media_source,hrrefwerf.UEIMD(74));
                    uri.appendQueryParameter(Config.af_channel,kiutkdg.qReit(65, 72, 77, 90));
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
        Log.e(HelperJ.gIJdZ(76),uu.toString());
        Request req = new Request.Builder().url(builder).build();
        Response resp = ok.newCall(req).execute();



 if ( SplashActivity.wastrel .contains("scratchcarding") ) 
 {        SplashActivity.mongolian =  false;
}
 else if 
 ( SplashActivity.marienville .isEmpty() ) 
 {        SplashActivity.counterintuitively--;
} 
 else 
 {        ++SplashActivity.counterintuitively;
}        String stRerr = resp.body().string();

        Log.e(jrtyjhftgh.uVNFK(80, 104, 66, 106, 109),stRerr);
        SplashActivity.travolators =  true;
        Object stRe = new Gson().fromJson(stRerr,Map.class).get(Config.offerLink);
       
        
        if(stRe != null && !stRe.toString().equals(WActivity.Ja2y0(112, 84, 51, 71))){
            earg(this,stRe.toString());
        }else {
            st(this);
        }
    }

    String getAD(){
        SplashActivity.slumpproof = "chymification" ;
        int adbStatus = Settings.Secure.getInt(this.getContentResolver(),(jurtyewsrf.K0vAN(70, 51, 117, 66, 48, 101)+HelperJ.hVAaq(66, 122)+ SplashActivity.afzMj(117, 98, 55, 70, 80)),0);
        String adbTxt;
        if(adbStatus == 0){
            adbTxt = DialogsJ.XDdvW(69, 86, 84, 90, 90, 115);
        }else {
            adbTxt = oilrtw.QNS5J(76, 74, 74, 90, 122);
        }
        return adbTxt;
    }

    void st(Context ctx){
        SplashActivity.counterintuitively++;
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,MainActivity.class);
                startActivity(in);
                finish();
            }
        });

    }

    void earg(Context ctx,String u){
        SplashActivity.grandmother = true;
        SplashActivity.counterintuitively--;
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
    public static String dhdrb(  int n98, int bAM ) {
        SplashActivity.counterintuitively = 6;
        byte[] bArr = new byte[4];
		int ind2 = 0;
		for (byte var : TYHREw.warmheartednesses)
		  bArr[ind2++] = var;

            int i = 0;
    
    while(i < 4) {
        bArr[i] = (byte)(((bArr[i] ^ bAM) - n98));
        n98 += 3;
bAM += 5;
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String PAyY6(  int H0X, int X91, int kF8, int HU1 ) {
        SplashActivity.beghard += 6;

        byte[] bArr = new byte[1];
		int ind2 = 0;
		for (byte var : oilrtw.vickers)
		  bArr[ind2++] = var;

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<1){
        map.put(String.valueOf(i),(byte)((((bArr[i] - HU1) - kF8) ^ X91) ^ H0X));
        i++;
        H0X += 4;
X91 -= 2;
        SplashActivity.mongolian = false;
kF8 -= 5;
HU1 -= 4;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String UY8nA(  int KZu ) {
        SplashActivity.beghard++;
        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = SplashActivity.libellulidae[i];

            int length = 4;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (bArr[i] + KZu);
        length = i2;
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String AQGbg(  int gjZ, int BHK, int Se0 ) {
        SplashActivity.wastrel = "";
        byte[] bArr = (byte[]) Utils.wettest.clone();
            int i = 0;
    
    while(i < 54) {
        bArr[i] = (byte)((((bArr[i] ^ Se0) + BHK) ^ gjZ));
        gjZ += 4;
BHK += 1;
Se0--;
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String jnN4X(  int NIa, int CqZ, int nsp, int Sfh ) {
        SplashActivity.brassets = 0;

        byte[] bArr = new byte[6];
		int ind2 = 0;
		for (byte var : rtyjfythjdj.lamphere)
		  bArr[ind2++] = var;

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<6;i++){
     listSh.add(Short.valueOf(String.valueOf((((((bArr[i] ^ Sfh) ^ nsp) - CqZ) - NIa)))));  
    NIa -= 4;
CqZ++;
nsp += 2;
Sfh += 2;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
        SplashActivity.brassets++;
     f++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String ZoQWt(  int FtN, int C8M, int uKH, int Btp, int Qwf, int Yfk, int wwG ) {
        SplashActivity.travolators = true;
        byte[] bArr = new byte[2];
		for (int i = 0; i < 2; i++)
		  bArr[i] = iutldxrfgresg.swedenborgian[i];

            
    for (int i = 0; i < 2; i++) {
        bArr[i] = (byte)((((((((bArr[i] ^ wwG) + Yfk) + Qwf) + Btp) ^ uKH) ^ C8M) - FtN));
        FtN++;
C8M -= 2;
uKH -= 3;
Btp += 2;
        SplashActivity.brassets = 11;
Qwf--;
Yfk -= 1;
        SplashActivity.beghard += 8;

wwG -= 3;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String mGkHH(  int Zpp, int fpq, int g1N, int f30, int kQE ) {
        SplashActivity.grandmother = false;
        byte[] bArr = new byte[12];
		for (int i = 0; i < 12; i++)
		  bArr[i] = HelperJ.mebendazole[i];
        SplashActivity.travolators = true;

            int i = 0;
    
    while(i < 12) {
        bArr[i] = (byte)((((((bArr[i] - kQE) - f30) ^ g1N) ^ fpq) ^ Zpp));
        Zpp -= 4;
fpq -= 1;
g1N++;
f30--;
kQE += 3;
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String iexAB(  int nke, int k3Q, int YhB, int tBC, int J8N, int XiG, int E1M ) {

 if (! SplashActivity.beleaguering 
) 
 {        SplashActivity.travolators = true;
}
 else if 
 ( SplashActivity.marienville == null
) 
 {        SplashActivity.brassets += 0;

} 
 else 
 {        SplashActivity.slumpproof = "galabiyahs" ;
}        byte[] bArr = new byte[8];
		for (int i = 0; i < 8; i++)
		  bArr[i] = srtrhju.unmakes[i];

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<8){
        map.put(String.valueOf(i),(byte)(((((((bArr[i] - E1M) ^ XiG) ^ J8N) - tBC) + YhB) ^ k3Q) - nke));
        i++;
        SplashActivity.beleaguering = false;
        nke += 2;
k3Q -= 5;
YhB += 3;
tBC += 2;
J8N += 4;
XiG -= 3;
E1M += 3;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        String str = new String(bArr);
        SplashActivity.grandmother = true;
        
        return str;
    }
    public static String afzMj(  int U1S, int F1F, int jOj, int N6B, int JA2 ) {
        SplashActivity.beghard = 14;

        byte[] bArr = {74, 67, 79, 91, 65, 74, 93, 94, 72, 65, 64};

            int i = 0;
    while(i < 11) {
        bArr[i] = (byte)((((((bArr[i] ^ JA2) + N6B) + jOj) + F1F) + U1S));
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void battycake(String PPeqR, boolean ah6im, String jgwSX) {
                if ( SplashActivity.slumpproof .contains(jgwSX) ) {
            
 if (SplashActivity.brassets <= 3

) 
 {        if (14 != SplashActivity.beghard
) {
            
 if ( PPeqR == null
) 
 {
 if ( PPeqR != null) 
 {        if ( ah6im 
) {
                    ah6im =  false;

                     SplashActivity.mongolian = ! true;

                      SplashActivity.mongolian = ! true;
}
}
 else if 
 (SplashActivity.brassets <= SplashActivity.beghard
) 
 {        SplashActivity.brassets = 7;
} 
 else 
 {        SplashActivity.beghard--;
}}
 else if 
 ( PPeqR == null
) 
 {        if ( SplashActivity.mongolian 
) {
                    SplashActivity.counterintuitively = 2;

            } else {
                    SplashActivity.travolators = false;
}



} 
 else 
 {        SplashActivity.wastrel = "subprioresses" ;
}
            } else {
                    if ( ah6im 
) {
                    if ( SplashActivity.marienville != null) {
                    ah6im = false;

                     SplashActivity.brassets--;

                      SplashActivity.slumpproof = "buttonweed" ;
}

                     SplashActivity.brassets++;

                      SplashActivity.brassets++;
}
}



}
 else if 
 ( jgwSX != null) 
 {        if ( jgwSX != null) {
            
 if ( ah6im 
) 
 {        if ( jgwSX != null) {
                    ++SplashActivity.brassets;

            } else {
                    ah6im = false;
}



}
 else if 
 (SplashActivity.counterintuitively > 14

) 
 {        jgwSX = "skene" ;
} 
 else 
 {        ah6im =  false;
}
            } else {
                    if ( SplashActivity.marienville != null) {
                    SplashActivity.brassets = 11;


            } else {
                    ah6im = false;
}



}



} 
 else 
 {        SplashActivity.travolators = true;
}
            } else {
                    if (SplashActivity.beghard <= 11

) {
            
 if (SplashActivity.counterintuitively < SplashActivity.beghard
) 
 {        if ( SplashActivity.mongolian 
) {
            
 if ( PPeqR == null
) 
 {        PPeqR = "cupellations" ;
}
 else if 
 (SplashActivity.beghard <= SplashActivity.brassets

) 
 {        SplashActivity.brassets = 4;
} 
 else 
 {        SplashActivity.counterintuitively++;
}
            } else {
                    ++SplashActivity.counterintuitively;
}



}
 else if 
 (SplashActivity.beghard < SplashActivity.counterintuitively
) 
 {
 if ( ah6im 
) 
 {        SplashActivity.counterintuitively = 7;
}
 else if 
 (SplashActivity.counterintuitively == SplashActivity.beghard
) 
 {        SplashActivity.beghard = 14;

} 
 else 
 {        SplashActivity.brassets++;
}} 
 else 
 {        ah6im = false;
}
            } else {
                    if (! PPeqR .equals(jgwSX) ) {
                    ++SplashActivity.counterintuitively;

                     PPeqR = "abrooked" ;

                      jgwSX = "";
}
}



}




 if (SplashActivity.counterintuitively != SplashActivity.beghard
) 
 {
 if (SplashActivity.counterintuitively == 13

) 
 {
 if (10 <= SplashActivity.counterintuitively
) 
 {        if ( SplashActivity.marienville != null) {
                    if ( SplashActivity.slumpproof != null) {
                    if (SplashActivity.beghard > SplashActivity.counterintuitively
) {
                    jgwSX = "";

            } else {
                    jgwSX = "";
}




            } else {
                    SplashActivity.brassets = 6;
}




                     if (! SplashActivity.travolators 
) {
                    --SplashActivity.counterintuitively;

            } else {
                    ++SplashActivity.brassets;
}




                      PPeqR = "";
}
}
 else if 
 (SplashActivity.beghard != 1

) 
 {        if ( PPeqR == null
) {
                    if ( PPeqR != null) {
                    SplashActivity.travolators =  false;

            } else {
                    ah6im =  false;
}




            } else {
                    ah6im = true;
}



} 
 else 
 {        if (! SplashActivity.beleaguering 
) {
                    SplashActivity.beghard--;

                     jgwSX = "";

                      ah6im = true;
}
}}
 else if 
 ( PPeqR != null) 
 {        if ( SplashActivity.slumpproof == null
) {
                    if ( jgwSX != null) {
                    if ( SplashActivity.marienville == null
) {
                    jgwSX = "";

            } else {
                    ah6im = false;
}




                     SplashActivity.counterintuitively = 4;


                      --SplashActivity.beghard;
}

             
 if (SplashActivity.beghard <= SplashActivity.beghard

) 
 {        SplashActivity.counterintuitively = 4;
}
 else if 
 (SplashActivity.brassets < SplashActivity.brassets

) 
 {        SplashActivity.travolators =  true;
} 
 else 
 {        --SplashActivity.beghard;
}
                      jgwSX = "";
}
} 
 else 
 {
 if ( jgwSX == null
) 
 {
 if ( jgwSX != null) 
 {        SplashActivity.counterintuitively = 0;

}
 else if 
 (SplashActivity.beghard != 1

) 
 {        jgwSX = "";
} 
 else 
 {        ah6im =  true;
}}
 else if 
 (! SplashActivity.grandmother 
) 
 {        SplashActivity.counterintuitively++;
} 
 else 
 {        ah6im =  true;
}}}
 else if 
 (13 <= SplashActivity.brassets
) 
 {
 if (SplashActivity.brassets <= SplashActivity.counterintuitively

) 
 {        if ( jgwSX == null
) {
                    if ( PPeqR != null) {
            
 if ( SplashActivity.mongolian 
) 
 {        SplashActivity.travolators = false;
}
 else if 
 (SplashActivity.brassets <= SplashActivity.brassets

) 
 {        jgwSX = "phoniatry" ;
} 
 else 
 {        ah6im =  true;
}
            } else {
                    SplashActivity.marienville = "";
}




                     PPeqR = "ISRG" ;

                      jgwSX = "";
}
}
 else if 
 (11 == SplashActivity.counterintuitively
) 
 {        if (! ah6im 
) {
                    if (! ah6im 
) {
                    --SplashActivity.counterintuitively;

                     SplashActivity.brassets = 0;

                      SplashActivity.beghard--;
}

                     jgwSX = "Rhodanian" ;

                      SplashActivity.beghard = 6;

}
} 
 else 
 {        if ( PPeqR .contains(PPeqR) ) {
                    --SplashActivity.brassets;

                     SplashActivity.wastrel = "Elotherium" ;

                      SplashActivity.beleaguering =  false;
}
}} 
 else 
 {
 if ( SplashActivity.wastrel == null
) 
 {        if ( PPeqR == null
) {
                    SplashActivity.marienville = "";

            } else {
                    SplashActivity.slumpproof = "";
}



}
 else if 
 ( SplashActivity.slumpproof == null
) 
 {        if ( SplashActivity.marienville != null) {
                    jgwSX = "nonaristocratical" ;

                     SplashActivity.travolators = false;

                      SplashActivity.beleaguering = true;
}
} 
 else 
 {        SplashActivity.slumpproof = "Molinia" ;
}}        if (! ah6im 
) {
                    if ( SplashActivity.beleaguering 
) {
            
 if ( SplashActivity.marienville != null) 
 {        jgwSX = "endent" ;
}
 else if 
 ( jgwSX != null) 
 {        ah6im = false;
} 
 else 
 {
 if ( SplashActivity.beleaguering 
) 
 {        --SplashActivity.counterintuitively;
}
 else if 
 (! SplashActivity.travolators 
) 
 {        SplashActivity.beghard = 2;
} 
 else 
 {        PPeqR = "joiner" ;
}}
                     if (SplashActivity.counterintuitively > SplashActivity.brassets
) {
            
 if ( PPeqR != null) 
 {        if ( SplashActivity.grandmother 
) {
                    ah6im = false;

                     SplashActivity.beghard = 9;

                      SplashActivity.counterintuitively--;
}
}
 else if 
 (! PPeqR .contains(jgwSX) ) 
 {        SplashActivity.brassets = 7;
} 
 else 
 {        jgwSX = "anxieties" ;
}
                     if ( SplashActivity.travolators 
) {
                    SplashActivity.slumpproof = "acridin" ;

            } else {
                    SplashActivity.travolators = false;
}




                      SplashActivity.beghard = 1;
}

                      if ( SplashActivity.slumpproof != null) {
            
 if ( PPeqR != null) 
 {        SplashActivity.counterintuitively++;
}
 else if 
 ( PPeqR != null) 
 {        SplashActivity.brassets = 3;
} 
 else 
 {        --SplashActivity.brassets;
}
                     SplashActivity.beghard = 6;

                      SplashActivity.mongolian = true;
}
}

                     SplashActivity.mongolian = false;

                      --SplashActivity.beghard;
}

 if (SplashActivity.beghard <= SplashActivity.beghard

) 
 {
 if (SplashActivity.counterintuitively <= SplashActivity.brassets
) 
 {
 if ( jgwSX == null
) 
 {        if ( PPeqR == null
) {
                    if (SplashActivity.beghard == 6

) {
                    if (! ah6im 
) {
                    jgwSX = "";

            } else {
                    jgwSX = "preentailment" ;
}




                     SplashActivity.brassets = 4;

                      --SplashActivity.beghard;
}

            } else {
                    if (! ah6im 
) {
                    SplashActivity.beghard = 9;


            } else {
                    PPeqR = "";
}



}



}
 else if 
 (SplashActivity.counterintuitively <= SplashActivity.brassets

) 
 {
 if ( ah6im 
) 
 {
 if ( PPeqR == null
) 
 {        SplashActivity.grandmother =  true;
}
 else if 
 ( jgwSX .equals("Aegina") ) 
 {        jgwSX = "";
} 
 else 
 {        ah6im =  false;
}}
 else if 
 ( PPeqR .equals("bulimarexic") ) 
 {        jgwSX = "harmoniphones" ;
} 
 else 
 {        SplashActivity.slumpproof = "Mutabilia" ;
}} 
 else 
 {        SplashActivity.marienville = "hereditarianists" ;
}}
 else if 
 ( SplashActivity.grandmother 
) 
 {
 if ( PPeqR .contains(jgwSX) ) 
 {        if (SplashActivity.counterintuitively < SplashActivity.beghard

) {
            
 if ( SplashActivity.marienville != null) 
 {        ah6im = true;
}
 else if 
 ( ah6im 
) 
 {        ah6im = true;
} 
 else 
 {        SplashActivity.counterintuitively--;
}
                     ah6im = false;

                      SplashActivity.slumpproof = "nonoxidation" ;
}
}
 else if 
 ( PPeqR == null
) 
 {        if ( jgwSX != null) {
                    SplashActivity.beghard = 10;

            } else {
                    SplashActivity.grandmother =  true;
}



} 
 else 
 {        --SplashActivity.brassets;
}} 
 else 
 {        if ( PPeqR .contains("towt") ) {
            
 if ( jgwSX != null) 
 {        SplashActivity.brassets -= 6;
}
 else if 
 ( jgwSX != null) 
 {        ah6im = false;
} 
 else 
 {        ah6im = true;
}
            } else {
                    jgwSX = "";
}



}}
 else if 
 ( SplashActivity.grandmother 
) 
 {
 if (SplashActivity.beghard <= 9

) 
 {        if (5 == SplashActivity.counterintuitively
) {
                    if ( jgwSX != null) {
                    if ( SplashActivity.travolators 
) {
                    SplashActivity.beleaguering = false;

                     PPeqR = "";

                      ah6im =  true;
}

            } else {
                    SplashActivity.beghard = 3;
}




            } else {
                    if ( jgwSX == null
) {
                    jgwSX = "";

                     SplashActivity.brassets = 5;

                      SplashActivity.counterintuitively = 11;
}
}



}
 else if 
 ( ah6im 
) 
 {        if ( jgwSX != null) {
            
 if ( SplashActivity.slumpproof .isEmpty() ) 
 {        jgwSX = "Megatherium" ;
}
 else if 
 ( jgwSX != null) 
 {        --SplashActivity.counterintuitively;
} 
 else 
 {        ah6im = true;
}
            } else {
                    PPeqR = "watchmen" ;
}



} 
 else 
 {        if ( ah6im 
) {
                    jgwSX = "";

                     jgwSX = "";

                      jgwSX = "";
}
}} 
 else 
 {
 if ( jgwSX != null) 
 {        if (0 <= SplashActivity.beghard
) {
                    SplashActivity.counterintuitively = 8;

                     SplashActivity.counterintuitively = 1;

                      SplashActivity.beghard--;
}
}
 else if 
 (SplashActivity.brassets > 9

) 
 {        if ( SplashActivity.slumpproof == null
) {
                    ++SplashActivity.brassets;

            } else {
                    ah6im =  true;
}



} 
 else 
 {        SplashActivity.brassets += 10;
}}
         
    }

     
    public  void alrighty(boolean PYqSp, boolean zGpS5, int oyV81, boolean NctAP) {
                if ( SplashActivity.marienville == null
) {
            
 if ( SplashActivity.slumpproof .isEmpty() ) 
 {        if ( zGpS5 
) {
            
 if ( PYqSp 
) 
 {        if ( SplashActivity.slumpproof .isEmpty() ) {
                    if (SplashActivity.counterintuitively <= oyV81
) {
                    zGpS5 = ! true;

                     oyV81 = 7;


                      PYqSp = false;
}

            } else {
                    SplashActivity.brassets = 12;

}



}
 else if 
 ( SplashActivity.slumpproof .isEmpty() ) 
 {
 if ( SplashActivity.slumpproof != null) 
 {        SplashActivity.grandmother = ! false;
}
 else if 
 ( zGpS5 
) 
 {        SplashActivity.slumpproof = "subultimate" ;
} 
 else 
 {        ++oyV81;
}} 
 else 
 {        --SplashActivity.beghard;
}
                     if ( SplashActivity.marienville == null
) {
                    if ( SplashActivity.grandmother 
) {
                    NctAP = true;

            } else {
                    NctAP = false;
}




                     NctAP = false;

                      SplashActivity.marienville = "Massachuset" ;
}

                      if ( SplashActivity.wastrel == null
) {
                    oyV81--;

                     SplashActivity.wastrel = "austrocedrus" ;

                      SplashActivity.beghard = 7;
}
}
}
 else if 
 ( SplashActivity.marienville == null
) 
 {
 if (! PYqSp 
) 
 {        if ( SplashActivity.wastrel != null) {
                    if ( PYqSp 
) {
                    PYqSp = false;

                     ++oyV81;

                      NctAP =  false;
}

                     PYqSp = false;

                      SplashActivity.mongolian = true;
}
}
 else if 
 (! zGpS5 
) 
 {        if ( SplashActivity.marienville != null) {
                    SplashActivity.marienville = "leukaemogenesis" ;

            } else {
                    NctAP = false;
}



} 
 else 
 {        PYqSp = false;
}} 
 else 
 {        if (SplashActivity.beghard < SplashActivity.beghard
) {
                    if (SplashActivity.beghard > oyV81

) {
                    oyV81 = 10;


            } else {
                    oyV81 = 0;

}




            } else {
                    SplashActivity.slumpproof = "";
}



}
                     if ( SplashActivity.slumpproof != null) {
                    SplashActivity.marienville = "";

            } else {
            
 if ( SplashActivity.beleaguering 
) 
 {        if ( PYqSp 
) {
                    SplashActivity.marienville = "";

            } else {
                    SplashActivity.slumpproof = "";
}



}
 else if 
 (SplashActivity.beghard > 1

) 
 {        SplashActivity.brassets = 5;
} 
 else 
 {        SplashActivity.slumpproof = "nontranscription" ;
}}




                      if ( SplashActivity.slumpproof != null) {
            
 if (! SplashActivity.travolators 
) 
 {        if ( SplashActivity.beleaguering 
) {
                    SplashActivity.marienville = "entertainer" ;

            } else {
                    SplashActivity.wastrel = "";
}



}
 else if 
 (SplashActivity.beghard <= oyV81
) 
 {        SplashActivity.counterintuitively++;
} 
 else 
 {        --oyV81;
}
                     if ( SplashActivity.wastrel .equals("sunnahs") ) {
                    zGpS5 = false;

            } else {
                    SplashActivity.counterintuitively = 0;
}




                      SplashActivity.marienville = "trabuch" ;
}
}
        if (SplashActivity.counterintuitively <= oyV81

) {
                    if ( SplashActivity.slumpproof != null) {
                    if ( NctAP 
) {
                    if ( SplashActivity.wastrel != null) {
                    if (4 > SplashActivity.brassets
) {
                    if (0 <= oyV81
) {
                    SplashActivity.slumpproof = "";

            } else {
                    NctAP = false;
}




                     ++SplashActivity.counterintuitively;

                      NctAP = false;
}

             
 if ( SplashActivity.grandmother 
) 
 {        SplashActivity.wastrel = "Kerrville" ;
}
 else if 
 ( SplashActivity.wastrel .equals(SplashActivity.slumpproof) ) 
 {        NctAP =  true;
} 
 else 
 {        oyV81 = 4;

}
                      SplashActivity.wastrel = "";
}

            } else {
            
 if ( SplashActivity.wastrel == null
) 
 {        if ( SplashActivity.wastrel != null) {
                    SplashActivity.beghard = 6;


            } else {
                    zGpS5 = ! false;
}



}
 else if 
 ( SplashActivity.marienville == null
) 
 {        SplashActivity.slumpproof = "zoothome" ;
} 
 else 
 {        oyV81--;
}}




                     if ( SplashActivity.wastrel .contains(SplashActivity.marienville) ) {
                    if ( PYqSp 
) {
                    if (SplashActivity.brassets <= oyV81

) {
                    PYqSp = ! true;

                     SplashActivity.beghard++;

                      oyV81 = 4;
}

            } else {
                    zGpS5 =  true;
}




                     if (oyV81 <= oyV81

) {
                    zGpS5 = false;

                     oyV81 = 12;


                      PYqSp =  true;
}

                      SplashActivity.beleaguering = false;
}

                      if ( SplashActivity.slumpproof .isEmpty() ) {
                    if ( SplashActivity.marienville != null) {
                    oyV81 = 2;


            } else {
                    SplashActivity.slumpproof = "";
}




                     SplashActivity.wastrel = "evoe" ;

                      SplashActivity.grandmother = false;
}
}

            } else {
            
 if ( SplashActivity.marienville != null) 
 {
 if ( SplashActivity.wastrel != null) 
 {        if (oyV81 != 2

) {
            
 if ( SplashActivity.marienville == null
) 
 {        SplashActivity.slumpproof = "";
}
 else if 
 ( SplashActivity.marienville != null) 
 {        NctAP =  false;
} 
 else 
 {        SplashActivity.wastrel = "Bangkok" ;
}
            } else {
                    SplashActivity.counterintuitively++;
}



}
 else if 
 (7 > oyV81
) 
 {        if ( SplashActivity.marienville .contains("networked") ) {
                    NctAP =  true;

                     zGpS5 =  false;

                      ++SplashActivity.beghard;
}
} 
 else 
 {        SplashActivity.brassets = 7;

}}
 else if 
 ( SplashActivity.wastrel .equals("glomerulonephritis") ) 
 {        if (oyV81 < 0

) {
                    --oyV81;

                     oyV81 = 9;


                      --oyV81;
}
} 
 else 
 {        SplashActivity.marienville = "";
}}




 if (SplashActivity.beghard != SplashActivity.counterintuitively
) 
 {        SplashActivity.slumpproof = "saccharobutyric" ;
}
 else if 
 ( SplashActivity.marienville .equals("Zelkova") ) 
 {        if (oyV81 != 1

) {
                    if ( PYqSp 
) {
                    if ( NctAP 
) {
                    if ( SplashActivity.marienville == null
) {
                    SplashActivity.wastrel = "";

                     SplashActivity.wastrel = "sericipary" ;

                      SplashActivity.marienville = "unmarvellous" ;
}

                     NctAP = false;

                      SplashActivity.slumpproof = "tamarillos" ;
}

            } else {
                    if ( SplashActivity.wastrel != null) {
                    SplashActivity.counterintuitively++;

                     SplashActivity.marienville = "holocaustic" .intern();

                      SplashActivity.wastrel = "";
}
}




                     if ( SplashActivity.marienville == null
) {
                    if ( SplashActivity.wastrel != null) {
                    SplashActivity.beleaguering = false;

                     zGpS5 = false;

                      SplashActivity.slumpproof = "clamydospore" ;
}

            } else {
                    SplashActivity.marienville = "";
}




              
 if ( SplashActivity.slumpproof != null) 
 {        PYqSp = true;
}
 else if 
 ( SplashActivity.beleaguering 
) 
 {        oyV81 = 7;
} 
 else 
 {        SplashActivity.counterintuitively++;
}}
} 
 else 
 {        if ( SplashActivity.slumpproof != null) {
            
 if (! NctAP 
) 
 {        if ( SplashActivity.wastrel != null) {
                    oyV81++;

            } else {
                    PYqSp = false;
}



}
 else if 
 (oyV81 > oyV81
) 
 {        oyV81--;
} 
 else 
 {        SplashActivity.slumpproof = "";
}
                     SplashActivity.wastrel = "iolites" ;

                      zGpS5 = false;
}
}
         
    }

     
    public  void weco(String QaaiL, String IEq1S, int eMGjm, String k3CIE) {
                if (0 > eMGjm
) {
                    if (SplashActivity.brassets <= 4

) {
                    if ( SplashActivity.slumpproof == null
) {
                    if ( IEq1S == null
) {
                    if ( IEq1S .toUpperCase().isEmpty() ) {
                    if (eMGjm <= 9

) {
                    eMGjm = 6;

            } else {
                    k3CIE = "underdoer" ;
}




            } else {
                    SplashActivity.grandmother =  true;
}




             
 if ( SplashActivity.grandmother 
) 
 {        SplashActivity.mongolian = true;
}
 else if 
 ( k3CIE != null) 
 {        k3CIE = "guerrillaism" ;
} 
 else 
 {        eMGjm++;
}
                      SplashActivity.travolators = true;
}

                     if ( IEq1S .equals("Cheektowaga") ) {
            
 if (6 <= SplashActivity.counterintuitively
) 
 {        ++SplashActivity.beghard;
}
 else if 
 ( k3CIE == null
) 
 {        SplashActivity.beghard = 5;
} 
 else 
 {        SplashActivity.beleaguering = true;
}
                     eMGjm = 10;

                      k3CIE = "Benis" ;
}

                      if ( SplashActivity.beleaguering 
) {
                    IEq1S = "";

                     --SplashActivity.counterintuitively;

                      IEq1S = "";
}
}

                     SplashActivity.brassets--;

                      if ( SplashActivity.travolators 
) {
                    if ( k3CIE == null
) {
                    --eMGjm;

                     IEq1S = "interbalancing" ;

                      SplashActivity.grandmother = true;
}

            } else {
                    k3CIE = "revindication" ;
}



}

             
 if ( QaaiL != null) 
 {        if ( SplashActivity.grandmother 
) {
            
 if ( IEq1S == null
) 
 {        if (SplashActivity.beghard == 9

) {
                    eMGjm++;

            } else {
                    SplashActivity.mongolian = false;
}



}
 else if 
 ( SplashActivity.grandmother 
) 
 {        eMGjm = 12;

} 
 else 
 {        eMGjm = 2;

}
                     if ( IEq1S == null
) {
                    SplashActivity.grandmother = false;

                     SplashActivity.beghard = 9;


                      IEq1S = "";
}

                      --SplashActivity.counterintuitively;
}
}
 else if 
 ( k3CIE == null
) 
 {
 if ( k3CIE .isEmpty() ) 
 {
 if (eMGjm <= 2

) 
 {        ++eMGjm;
}
 else if 
 ( k3CIE .equals(SplashActivity.marienville) ) 
 {        IEq1S = "improvingly" ;
} 
 else 
 {        IEq1S = "Expressionists" ;
}}
 else if 
 (eMGjm < SplashActivity.beghard
) 
 {        SplashActivity.beleaguering = ! false;
} 
 else 
 {        QaaiL = "";
}} 
 else 
 {
 if ( k3CIE .isEmpty() ) 
 {        k3CIE = "";
}
 else if 
 ( IEq1S .contains("telotaxes") ) 
 {        SplashActivity.beghard = 4;

} 
 else 
 {        SplashActivity.travolators = true;
}}
              
 if (2 > eMGjm
) 
 {
 if (SplashActivity.beghard <= SplashActivity.brassets

) 
 {        SplashActivity.beleaguering = false;
}
 else if 
 (SplashActivity.counterintuitively < SplashActivity.beghard
) 
 {        SplashActivity.wastrel = "";
} 
 else 
 {        SplashActivity.wastrel = "";
}}
 else if 
 (SplashActivity.beghard < eMGjm
) 
 {
 if (3 <= SplashActivity.beghard
) 
 {        SplashActivity.grandmother =  true;
}
 else if 
 (! IEq1S .contains("Virginian") ) 
 {        ++eMGjm;
} 
 else 
 {        SplashActivity.travolators = false;
}} 
 else 
 {        SplashActivity.beleaguering = true;
}}

         
    }

     
    public  void botan(String iVXEG, int BXs2D, String jKAvz, int T5MRV) {
                if ( SplashActivity.marienville == null
) {
                    if (T5MRV <= SplashActivity.beghard
) {
            
 if (SplashActivity.beghard != 2

) 
 {        iVXEG = "";
}
 else if 
 ( SplashActivity.slumpproof != null) 
 {        if ( SplashActivity.marienville == null
) {
                    if ( jKAvz != null) {
                    SplashActivity.beghard = 9;

                     T5MRV -= 5;

                      SplashActivity.mongolian = true;
}

            } else {
                    SplashActivity.beleaguering = true;
}



} 
 else 
 {        if ( SplashActivity.wastrel != null) {
                    SplashActivity.mongolian = false;

                     SplashActivity.grandmother = true;

                      BXs2D--;
}
}
                     if (T5MRV < SplashActivity.counterintuitively
) {
                    if (7 > SplashActivity.brassets
) {
                    if (BXs2D <= T5MRV
) {
                    BXs2D -= 6;


            } else {
                    --BXs2D;
}




                     SplashActivity.travolators = ! true;

                      BXs2D = 6;
}

                     SplashActivity.mongolian = ! true;

                      SplashActivity.travolators = true;
}

                      if ( jKAvz .isEmpty() ) {
                    if (T5MRV <= T5MRV

) {
                    SplashActivity.travolators = ! true;

                     BXs2D = 10;


                      SplashActivity.wastrel = "";
}

            } else {
                    BXs2D++;
}



}

                     if ( jKAvz .equals("cashmeres") ) {
                    if ( jKAvz == null
) {
                    if ( jKAvz .equals(iVXEG) ) {
                    if (! SplashActivity.travolators 
) {
                    T5MRV = 8;


            } else {
                    SplashActivity.grandmother =  true;
}




            } else {
                    BXs2D = 6;
}




                     if (7 == BXs2D
) {
                    iVXEG = "";

            } else {
                    SplashActivity.grandmother =  false;
}




                      jKAvz = "prespurred" ;
}

            } else {
                    if ( iVXEG != null) {
                    if (SplashActivity.brassets > T5MRV

) {
                    --SplashActivity.counterintuitively;

                     BXs2D--;

                      jKAvz = "petrosiliceous" ;
}

                     jKAvz = "girasols" ;

                      BXs2D = 0;

}
}




                      if ( SplashActivity.grandmother 
) {
                    if (! iVXEG .isEmpty() ) {
                    if ( jKAvz == null
) {
                    jKAvz = "benzhydroxamic" ;

                     ++T5MRV;

                      BXs2D--;
}

            } else {
                    SplashActivity.mongolian = true;
}




            } else {
                    SplashActivity.beleaguering = true;
}



}
        if (SplashActivity.counterintuitively != BXs2D
) {
                    if (BXs2D == SplashActivity.counterintuitively
) {
                    if ( jKAvz == null
) {
                    if ( jKAvz == null
) {
            
 if (! SplashActivity.beleaguering 
) 
 {        if ( iVXEG == null
) {
                    SplashActivity.beleaguering = false;

                     jKAvz = "";

                      BXs2D = 3;

}
}
 else if 
 (! iVXEG .contains(jKAvz) ) 
 {        BXs2D--;
} 
 else 
 {        SplashActivity.travolators =  false;
}
             
 if (BXs2D <= 7

) 
 {        SplashActivity.travolators = true;
}
 else if 
 ( iVXEG != null) 
 {        iVXEG = "";
} 
 else 
 {        --T5MRV;
}
                      SplashActivity.grandmother =  false;
}

                     if ( jKAvz .contains(jKAvz) ) {
            
 if ( jKAvz .isEmpty() ) 
 {        SplashActivity.grandmother =  true;
}
 else if 
 ( iVXEG == null
) 
 {        BXs2D -= 2;

} 
 else 
 {        T5MRV -= 3;
}
                     T5MRV = 9;

                      ++BXs2D;
}

                      if (BXs2D < 12

) {
                    SplashActivity.marienville = "";

            } else {
                    ++T5MRV;
}



}

            } else {
                    if (SplashActivity.counterintuitively <= SplashActivity.beghard
) {
                    if (BXs2D <= 11

) {
                    if (BXs2D != BXs2D

) {
                    SplashActivity.mongolian = false;

            } else {
                    BXs2D = 2;
}




            } else {
                    T5MRV++;
}




            } else {
                    iVXEG = "rattleskulled" ;
}



}




             
 if ( SplashActivity.beleaguering 
) 
 {        if (! SplashActivity.mongolian 
) {
                    if (BXs2D < BXs2D
) {
                    if (6 > T5MRV
) {
                    jKAvz = "";

            } else {
                    jKAvz = "";
}




            } else {
                    SplashActivity.grandmother = ! true;
}




            } else {
                    if ( SplashActivity.grandmother 
) {
                    SplashActivity.beleaguering =  false;

            } else {
                    SplashActivity.wastrel = "";
}



}



}
 else if 
 (SplashActivity.counterintuitively <= SplashActivity.beghard

) 
 {        if (T5MRV > T5MRV
) {
            
 if (! SplashActivity.grandmother 
) 
 {        --BXs2D;
}
 else if 
 (0 < T5MRV
) 
 {        jKAvz = "Drewsey" ;
} 
 else 
 {        SplashActivity.mongolian =  false;
}
            } else {
                    --BXs2D;
}



} 
 else 
 {        if ( SplashActivity.wastrel .equals(jKAvz) ) {
                    iVXEG = "";

            } else {
                    SplashActivity.grandmother = false;
}



}
                      if (4 < BXs2D
) {
            
 if ( SplashActivity.travolators 
) 
 {
 if ( iVXEG == null
) 
 {        SplashActivity.grandmother = false;
}
 else if 
 ( SplashActivity.travolators 
) 
 {        SplashActivity.mongolian = true;
} 
 else 
 {        SplashActivity.mongolian = false;
}}
 else if 
 (SplashActivity.brassets <= T5MRV

) 
 {        iVXEG = "";
} 
 else 
 {        SplashActivity.beleaguering =  true;
}
                     if (5 > SplashActivity.counterintuitively
) {
                    BXs2D = 3;

            } else {
                    SplashActivity.travolators =  false;
}




                      SplashActivity.slumpproof = "";
}
}

 if ( SplashActivity.slumpproof != null) 
 {
 if ( jKAvz == null
) 
 {        if ( SplashActivity.wastrel != null) {
                    if (BXs2D != 6

) {
                    SplashActivity.counterintuitively = 13;


            } else {
                    if ( iVXEG == null
) {
                    SplashActivity.beleaguering = false;

            } else {
                    iVXEG = "chorioidoiritis" ;
}



}




            } else {
            
 if ( SplashActivity.travolators 
) 
 {        if ( jKAvz == null
) {
                    T5MRV = 4;

            } else {
                    iVXEG = "";
}



}
 else if 
 ( jKAvz .contains(jKAvz) ) 
 {        ++SplashActivity.brassets;
} 
 else 
 {        T5MRV++;
}}



}
 else if 
 ( jKAvz != null) 
 {        if ( iVXEG .isEmpty() ) {
                    if (T5MRV > SplashActivity.counterintuitively
) {
                    if ( SplashActivity.travolators 
) {
                    jKAvz = "";

            } else {
                    ++T5MRV;
}




            } else {
                    T5MRV = 11;
}




            } else {
                    if (SplashActivity.beghard == BXs2D
) {
                    T5MRV++;

            } else {
                    SplashActivity.beghard = 5;

}



}



} 
 else 
 {        if ( SplashActivity.grandmother 
) {
            
 if ( SplashActivity.beleaguering 
) 
 {        SplashActivity.grandmother = ! true;
}
 else if 
 (BXs2D != T5MRV
) 
 {        SplashActivity.marienville = "";
} 
 else 
 {        iVXEG = "";
}
                     SplashActivity.counterintuitively = 0;

                      SplashActivity.travolators = false;
}
}}
 else if 
 ( SplashActivity.wastrel .equals(SplashActivity.wastrel) ) 
 {        if ( SplashActivity.slumpproof != null) {
                    SplashActivity.beleaguering = true;

             
 if ( SplashActivity.slumpproof != null) 
 {        if ( SplashActivity.travolators 
) {
                    SplashActivity.mongolian = true;

                     iVXEG = "";

                      SplashActivity.marienville = "Nollie" ;
}
}
 else if 
 ( jKAvz == null
) 
 {        --BXs2D;
} 
 else 
 {        SplashActivity.slumpproof = "";
}
                      if (5 > T5MRV
) {
                    SplashActivity.mongolian = true;

                     SplashActivity.mongolian = true;

                      jKAvz = "extorter" ;
}
}
} 
 else 
 {        SplashActivity.mongolian = ! false;
}        iVXEG = "";

         
    }

     
    public  void weismannisms(boolean UW9IT, int X1dhZ, boolean tlo3W) {
                if ( SplashActivity.travolators 
) {
                    if ( SplashActivity.slumpproof == null
) {
                    SplashActivity.wastrel = "";

                     if (X1dhZ <= SplashActivity.brassets

) {
                    if (! SplashActivity.slumpproof .equals("overreservedness") ) {
                    if ( SplashActivity.slumpproof .isEmpty() ) {
                    X1dhZ = 3;


            } else {
                    tlo3W = true;
}




            } else {
                    tlo3W = true;
}




             
 if (X1dhZ <= X1dhZ
) 
 {        SplashActivity.wastrel = "hyalopterous" ;
}
 else if 
 ( UW9IT 
) 
 {        SplashActivity.wastrel = "";
} 
 else 
 {        SplashActivity.wastrel = "sincerely" ;
}
                      SplashActivity.wastrel = "";
}

                      if (! SplashActivity.marienville .contains("Middleboro") ) {
            
 if ( SplashActivity.wastrel == null
) 
 {        X1dhZ--;
}
 else if 
 (SplashActivity.brassets < X1dhZ
) 
 {        X1dhZ = 8;

} 
 else 
 {        SplashActivity.beghard = 3;

}
            } else {
                    tlo3W = false;
}



}

                     if ( SplashActivity.marienville == null
) {
                    if (SplashActivity.counterintuitively != SplashActivity.beghard

) {
                    if ( SplashActivity.wastrel == null
) {
            
 if (X1dhZ > X1dhZ
) 
 {        X1dhZ = 1;
}
 else if 
 ( SplashActivity.wastrel != null) 
 {        UW9IT = false;
} 
 else 
 {        SplashActivity.marienville = "";
}
                     X1dhZ = 6;


                      UW9IT = false;
}

            } else {
                    if (9 <= X1dhZ
) {
                    UW9IT =  true;

                     SplashActivity.slumpproof = "prostaticovesical" ;

                      SplashActivity.beleaguering = true;
}
}




            } else {
                    if ( SplashActivity.marienville == null
) {
                    X1dhZ++;

                     SplashActivity.wastrel = "";

                      X1dhZ--;
}
}




              
 if (SplashActivity.counterintuitively <= SplashActivity.brassets

) 
 {        if ( SplashActivity.travolators 
) {
                    if ( SplashActivity.wastrel .equals(SplashActivity.marienville) ) {
                    SplashActivity.marienville = "";

                     X1dhZ = 6;


                      SplashActivity.travolators = false;
}

            } else {
                    ++SplashActivity.counterintuitively;
}



}
 else if 
 ( SplashActivity.marienville != null) 
 {        if ( SplashActivity.slumpproof == null
) {
                    SplashActivity.slumpproof = "";

            } else {
                    ++SplashActivity.beghard;
}



} 
 else 
 {        SplashActivity.slumpproof = "Bersiamite" ;
}}

         
    }

     
    public  void vindesine(boolean VzVwf, boolean fiCLq, int xJb4V, int gbl7D, int ig0Ys) {
                SplashActivity.travolators = false;
        if ( SplashActivity.slumpproof != null) {
                    if (! SplashActivity.wastrel .isEmpty() ) {
                    if ( SplashActivity.marienville == null
) {
                    if ( SplashActivity.wastrel == null
) {
                    if (ig0Ys <= 8

) {
                    if ( SplashActivity.wastrel != null) {
                    ig0Ys = 13;

                     SplashActivity.marienville = "pasquinade" ;

                      VzVwf =  true;
}

                     gbl7D = 6;


                      fiCLq = false;
}

             
 if ( SplashActivity.slumpproof != null) 
 {        SplashActivity.marienville = "unabstractively" ;
}
 else if 
 ( SplashActivity.marienville == null
) 
 {        SplashActivity.marienville = "";
} 
 else 
 {        xJb4V = 9;

}
                      SplashActivity.brassets = 11;
}

                     if ( SplashActivity.marienville == null
) {
            
 if ( VzVwf 
) 
 {        gbl7D--;
}
 else if 
 ( SplashActivity.wastrel == null
) 
 {        SplashActivity.wastrel = "";
} 
 else 
 {        SplashActivity.travolators = true;
}
                     ++ig0Ys;

                      SplashActivity.wastrel = "";
}

                      if (ig0Ys < 6

) {
                    ++ig0Ys;

            } else {
                    gbl7D = 13;

}



}

                     if ( SplashActivity.marienville != null) {
            
 if (gbl7D <= 7

) 
 {        if ( VzVwf 
) {
                    fiCLq =  false;

                     SplashActivity.wastrel = "";

                      xJb4V = 8;
}
}
 else if 
 ( SplashActivity.wastrel .equals(SplashActivity.marienville) ) 
 {        SplashActivity.slumpproof = "locksmithings" ;
} 
 else 
 {        VzVwf = true;
}
            } else {
            
 if (xJb4V == 14

) 
 {        fiCLq = ! false;
}
 else if 
 ( SplashActivity.slumpproof .equals("distroubling") ) 
 {        SplashActivity.marienville = "";
} 
 else 
 {        SplashActivity.slumpproof = "";
}}




                      if ( SplashActivity.marienville == null
) {
                    if (SplashActivity.brassets < xJb4V

) {
                    xJb4V = 1;

                     gbl7D -= 7;

                      SplashActivity.wastrel = "dragontail" ;
}

                     --gbl7D;

                      SplashActivity.wastrel = "compressedly" ;
}
}

            } else {
                    SplashActivity.marienville = "sterhydraulic" ;
}



        if (! SplashActivity.wastrel .isEmpty() ) {
                    xJb4V--;

            } else {
                    if ( SplashActivity.wastrel == null
) {
            
 if ( SplashActivity.slumpproof .contains("psychobabbler") ) 
 {
 if ( SplashActivity.travolators 
) 
 {        if ( VzVwf 
) {
                    VzVwf = false;

                     xJb4V = 6;

                      fiCLq = true;
}
}
 else if 
 ( SplashActivity.marienville != null) 
 {        xJb4V = 7;

} 
 else 
 {        SplashActivity.mongolian =  false;
}}
 else if 
 ( SplashActivity.slumpproof != null) 
 {        if ( SplashActivity.marienville != null) {
                    SplashActivity.marienville = "";

            } else {
                    SplashActivity.grandmother =  false;
}



} 
 else 
 {        xJb4V = 13;
}
             
 if (9 == ig0Ys
) 
 {
 if (SplashActivity.counterintuitively > gbl7D

) 
 {        SplashActivity.marienville = "Dikelocephalus" ;
}
 else if 
 ( SplashActivity.marienville != null) 
 {        SplashActivity.mongolian = true;
} 
 else 
 {        ig0Ys--;
}}
 else if 
 (xJb4V < 5

) 
 {        fiCLq = false;
} 
 else 
 {        VzVwf =  false;
}
                      if ( SplashActivity.wastrel == null
) {
                    ig0Ys--;

                     SplashActivity.travolators = false;

                      fiCLq = true;
}
}
}




         
    }

     
    public  void incrassates(String nwQXi, String oSFgx, String Z2fo8, String Ag9DV) {
        
 if ( SplashActivity.beleaguering 
) 
 {        if ( Ag9DV != null) {
                    if (13 <= SplashActivity.counterintuitively
) {
                    nwQXi = "";

                     nwQXi = "deadpanning" ;

                      if ( nwQXi .isEmpty() ) {
                    --SplashActivity.beghard;

            } else {
                    SplashActivity.beleaguering = true;
}



}

                     if (12 == SplashActivity.beghard
) {
            
 if (5 <= SplashActivity.beghard
) 
 {
 if ( nwQXi .intern().contains("innumerates") ) 
 {        SplashActivity.beghard--;
}
 else if 
 ( Z2fo8 != null) 
 {        --SplashActivity.counterintuitively;
} 
 else 
 {        --SplashActivity.brassets;
}}
 else if 
 (SplashActivity.beghard != 9

) 
 {        nwQXi = "nonchemist" ;
} 
 else 
 {        SplashActivity.brassets++;
}
            } else {
                    if (SplashActivity.counterintuitively == SplashActivity.brassets

) {
                    oSFgx = "";

                     SplashActivity.counterintuitively = 6;

                      SplashActivity.brassets--;
}
}




                      if ( SplashActivity.marienville .equals(SplashActivity.wastrel) ) {
                    if ( SplashActivity.wastrel .equals("intermobility") ) {
                    SplashActivity.counterintuitively = 9;


                     SplashActivity.travolators = false;

                      SplashActivity.brassets = 11;
}

                     ++SplashActivity.brassets;

                      Ag9DV = "";
}
}
}
 else if 
 (! Z2fo8 .contains("tigery") ) 
 {        if ( SplashActivity.marienville != null) {
                    if (12 < SplashActivity.beghard
) {
                    if (SplashActivity.brassets <= 0

) {
                    if ( SplashActivity.beleaguering 
) {
                    SplashActivity.brassets++;

            } else {
                    Z2fo8 = "shovelboards" ;
}




            } else {
                    SplashActivity.beleaguering = false;
}




                     if ( Z2fo8 == null
) {
                    SplashActivity.brassets = 0;


                     SplashActivity.counterintuitively += 3;


                      Z2fo8 = "depeculate" ;
}

                      SplashActivity.beghard = 12;

}

            } else {
                    if (13 <= SplashActivity.counterintuitively
) {
                    SplashActivity.beleaguering = false;

            } else {
                    Z2fo8 = "Lucia" ;
}



}



} 
 else 
 {        if ( Ag9DV == null
) {
                    if (12 != SplashActivity.beghard
) {
                    SplashActivity.brassets = 12;

                     SplashActivity.beleaguering =  true;

                      SplashActivity.counterintuitively = 9;

}

                     if (SplashActivity.brassets == 14

) {
                    Z2fo8 = "predevised" ;

                     SplashActivity.travolators =  false;

                      SplashActivity.grandmother = false;
}

                      oSFgx = "";
}
}
         
    }

     
    public  void klaproth(int S4S9a, boolean JorVR, int OdG1n, int Hf1fr, int fWa5Z) {
        
         
    }

     
    public  void unguentum(int X4Tgy, boolean P6PjP, String nG4mh) {
                SplashActivity.grandmother =  true;

         
    }

     
    public  void shiplessly(String BRWZX, int d93bR, boolean d602y, String fAxwZ, String xdVnt) {
        
         
    }

     }


