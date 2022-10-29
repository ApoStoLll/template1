package frog.company.app13june.cc;
import frog.company.app13june.cc.jurtyewsrf;
import frog.company.app13june.kyf.traerfw.threrf;
import frog.company.app13june.cc.oilrtw;
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
import frog.company.app13june.HelperJ;
import frog.company.app13june.kyf.rtyjfythjdj;
import frog.company.app13june.kyf.jrtyjhftgh;
import frog.company.app13june.cc.ltiuukregre;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.WActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.kyf.traerfw.hrrefwerf;
import frog.company.app13june.cc.wtrh;
import frog.company.app13june.cc.htryesd;
import frog.company.app13june.cc.yurdrtf;
import frog.company.app13june.GameActivity;
import frog.company.app13june.SplashActivity;

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

   public static int rotc = 85;
   public static String insea = "oxter";
   public static String displacement = "wearing";
   public static String platydolichocephalous = "floutingstocks";
   public static int hyposkeletal = 86;
   public static String desorptions = "Neroic";
   public static boolean don = true;
   public static int pancreaticogastrostomy = 106;
   public static String phenates = "sibilated";
   public static byte[] storiettes = new byte[]{43};
   public static final byte[] winnick = new byte[]{8, 2, 2, 3, 9};
   public static byte[] antifamily = new byte[]{72, 77, 68, 82};

    String appLink;
    boolean first = true;
    Context ctxx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        fef.displacement = "defrags" ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ctxx = this;
        String old = getSharedPreferences(Config.sharedName,MODE_PRIVATE).getString(Config.sharedStr,null);
        if(old == null){
            Log.e(SplashActivity.dhdrb(107, 118),GameActivity.Ong5Y(120, 79, 90, 114));
            initFb(this);
            initAps();
        } else {
            Log.e(yurdrtf.De2Yg(112, 87, 88, 105, 53, 120, 110),htryesd.D5PYC(89, 55));
            earg(this,old);
        }

    }

    void initFb(fef activity){
        fef.phenates = "";
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
        fef.rotc--;
        fef.insea = "";
        OneSignal.initWithContext(this);
        OneSignal.setAppId(Config.one);
        AppsFlyerLib.getInstance().init(Config.apid,this,this);
        AppsFlyerLib.getInstance().start(this);
    }

    @Override
    public void onConversionDataSuccess(Map<String,Object> map) {
        fef.hyposkeletal--;
        if(!first) return;
        else log(map,1);
    }

    @Override
    public void onConversionDataFail(String s) {
        if ( fef.phenates != null) {
                    fef.don =  false;

            } else {
                    fef.displacement = "uninterests" ;
}



        if(!first) return;
        else log(null,-1);
    }

    @Override
    public void onAppOpenAttribution(Map<String,String> map) {
        fef.phenates = "";
        if(!first) return;
        Log.e(wtrh.F8yvA(122, 109, 97),MainActivity.zDH6f(121, 81, 114, 80, 68, 97));
    }

    @Override
    public void onAttributionFailure(String s) {
        fef.pancreaticogastrostomy = 2;
        if(!first) return;
        Log.e((hrrefwerf.gxJ3I(81, 53, 103, 84, 116, 82, 56)),Utils.fDG60(86, 109, 82, 90, 57, 53));
    }

    void log(Map<String,Object> map,int mode){
        fef.phenates = "";
        new Thread(){
            @Override
            public void run() {
                first = false;
        if ( fef.don 
) {
                    --fef.pancreaticogastrostomy;

                     fef.pancreaticogastrostomy = 12;

                      fef.don = ! false;
}

                Uri.Builder uri = Uri.parse(Config.url).buildUpon();
                if(mode == 1){
                    uri.appendQueryParameter(Config.campaign,String.valueOf(map.get(yurdrtf.XgXyD(102, 107, 56))));
                    uri.appendQueryParameter(Config.media_source,String.valueOf(map.get(WActivity.bbxAd(108, 86, 68))));
                    uri.appendQueryParameter(Config.af_channel,String.valueOf(map.get(Config.cSLQp(90, 113))));
                } else {
                    uri.appendQueryParameter(Config.campaign,RouleteActivity.nNhZA(79, 75, 105, 107, 86, 112, 65));
                    uri.appendQueryParameter(Config.media_source,Utils.god5A(112, 83));
                    uri.appendQueryParameter(Config.af_channel,GameActivity.syz0x(76, 120, 103, 100, 82, 82));
        if ( fef.desorptions == null
) {
                    fef.don =  true;

            } else {
                    fef.hyposkeletal--;
}



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
        if (13 != fef.rotc
) {
                    fef.phenates = "";

            } else {
                    fef.rotc -= 10;

}



                    }
                }
            }
        }.start();
    }

    void next(Uri.Builder ur) throws IOException {
        String i = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        String t = TimeZone.getDefault().getID();
        ++fef.rotc;
        ur.appendQueryParameter(Config.tmz,t);
        ur.appendQueryParameter(Config.af_userid,i);
        ur.appendQueryParameter(Config.adb,getAD());
        ur.appendQueryParameter(Config.fb_deeplink,appLink);
        Uri uu = ur.build();
        OkHttpClient ok = new OkHttpClient();
        HttpUrl builder = HttpUrl.parse(uu.toString()).newBuilder().build();
        Log.e(ltiuukregre.cV6vc(84, 121, 108, 84, 87),uu.toString());
        Request req = new Request.Builder().url(builder).build();
        Response resp = ok.newCall(req).execute();


        String stRerr = resp.body().string();


        fef.platydolichocephalous = "";
        Object stRe = new Gson().fromJson(stRerr,Map.class).get(Config.offerLink);
       
        
        if(stRe != null && !stRe.toString().equals(Utils.JamVR(97, 54, 55, 119, 67, 55))){
            earg(this,stRe.toString());
        }else {
            st(this);
        }
    }

    String getAD(){
        fef.don = true;
        fef.displacement = "unresourcefully" ;
        int adbStatus = Settings.Secure.getInt(this.getContentResolver(),jrtyjhftgh.hd2qU(78, 106, 48, 107, 104, 100),0);
        String adbTxt;
        if(adbStatus == 0){
            adbTxt = rtyjfythjdj.MG1Fk(99, 65, 68, 80);
        }else {
            adbTxt = HelperJ.Zeyyr(51, 75, 101);
        }
        return adbTxt;
    }

    void st(Context ctx){
        if (5 == fef.pancreaticogastrostomy
) {
                    fef.don = false;

            } else {
                    fef.desorptions = "entrant" ;
}



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
        fef.insea = "";
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,ltiuukregre.class);
                in.putExtra(Config.sharedStr,u);
                getSharedPreferences(Config.sharedName,MODE_PRIVATE).edit().putString(Config.sharedStr,u).apply();
                startActivity(in);
                finish();
        fef.don =  false;
            }
        });
    }
    public static String toKAx(  int Mgb, int Rim ) {
        fef.pancreaticogastrostomy += 2;

        byte[] bArr = {94, 120, 123, 60, -119, -119, -101, -103, 90, -87, -71, 108, -63, -50, -61, -42, -58, -34};

            int i = 0;
    
    while(i < 18) {
        bArr[i] = (byte)(((bArr[i] + Rim) - Mgb));
        Mgb += 3;
Rim -= 3;
        fef.don =  false;
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String xCl5J(  int BMb, int zrW, int Ua4, int lM6, int o4G, int SWI, int pk1 ) {
        fef.pancreaticogastrostomy = 0;
        fef.displacement = "botanically" ;
        byte[] bArr = new byte[10];
		for (int i = 0; i < 10; i++)
		  bArr[i] = wtrh.bohemianisms[i];

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<10){
        map.put(String.valueOf(i),(byte)(((((((bArr[i] + pk1) + SWI) ^ o4G) - lM6) + Ua4) - zrW) ^ BMb));
        i++;
        BMb += 5;
zrW += 2;
Ua4 -= 3;
lM6 += 4;
o4G -= 4;
        fef.phenates = "";
SWI--;
pk1 += 4;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        fef.displacement = "";
        fef.phenates = "aberrancies" ;
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String SaWGF(  int YH7, int B9E, int aG7, int xTr, int oSZ ) {
        if (fef.hyposkeletal > fef.hyposkeletal

) {
                    fef.pancreaticogastrostomy--;

            } else {
                    ++fef.rotc;
}



        byte[] bArr = new byte[3];
		int ind2 = 0;
		for (byte var : oilrtw.taisch)
		  bArr[ind2++] = var;

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
        fef.pancreaticogastrostomy = 13;

    while(i<3){
        map.put(String.valueOf(i),(byte)(((((bArr[i] - oSZ) - xTr) - aG7) - B9E) - YH7));
        i++;
        YH7 -= 1;
B9E += 5;
aG7--;
xTr += 2;
oSZ++;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String GqDg3(  int R3w, int Go4, int ZIi, int u1S ) {
        fef.displacement = "ecphova" ;
        byte[] bArr = new byte[4];
		int ind2 = 0;
		for (byte var : threrf.innately)
		  bArr[ind2++] = var;

        LinkedList<String> listStr  = new LinkedList<>();
ArrayList<Byte> listBt = new ArrayList<>();
    for(byte i=0;i<4;i++){
    listStr.add(String.valueOf(((((bArr[i] ^ u1S) + ZIi) - Go4) ^ R3w))); 
    }
     for (String s:listStr){
    listBt.add( Integer.valueOf(s).byteValue()); 
        fef.phenates = "";
    }
     int f = 0;
     for (Byte l:listBt) {
     bArr[f++] =l;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String Xf172(  int Ybp ) {
        fef.hyposkeletal--;
        byte[] bArr = new byte[4];
        fef.desorptions = "misresemblance" ;
		for (int i = 0; i < 4; i++)
		  bArr[i] = jurtyewsrf.labyrinthodontid[i];

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
        if (fef.hyposkeletal <= fef.pancreaticogastrostomy
) {
                    fef.displacement = "";

            } else {
                    fef.don =  true;
}



    for(byte i=0;i<4;i++){
     listSh.add(Short.valueOf(String.valueOf(((bArr[i] ^ Ybp)))));  
    Ybp -= 2;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
        fef.displacement = "";
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f++;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String eYahJ(  ) {
        fef.don = false;
        byte[] bArr = new byte[22];
		int ind2 = 0;
		for (byte var : ltiuukregre.overcommand)
		  bArr[ind2++] = var;

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 11; i++)
    {
 bArrCopy.add((byte) bArr[i]);
    }
    for (int i = 11; i < 22; i++)
    {
      bArrCopy.add((byte) bArr[i]);
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


        fef.insea = "naturopath" ;
        fef.rotc += 0;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void dragstaff(String NEIsg) {
        
 if (fef.pancreaticogastrostomy != fef.rotc
) 
 {        if (! fef.don 
) {
            
 if ( fef.desorptions .isEmpty() ) 
 {        fef.don = false;
}
 else if 
 (! fef.platydolichocephalous .isEmpty() ) 
 {
 if (fef.rotc > fef.rotc
) 
 {        if (! fef.don 
) {
                    fef.pancreaticogastrostomy = 6;

                     fef.don = true;

                      NEIsg = "";
}
}
 else if 
 (fef.hyposkeletal > 0

) 
 {        fef.hyposkeletal = 6;
} 
 else 
 {        fef.pancreaticogastrostomy = 11;

}} 
 else 
 {        if ( fef.insea .contains(fef.desorptions) ) {
                    fef.hyposkeletal = 6;

            } else {
                    fef.don = false;
}



}
            } else {
                    if (0 != fef.hyposkeletal
) {
                    if (fef.rotc == fef.hyposkeletal

) {
                    fef.don = false;

            } else {
                    --fef.pancreaticogastrostomy;
}




                     if ( NEIsg != null) {
                    NEIsg = "nomotheism" ;

                     fef.don = false;

                      fef.insea = "";
}

                      fef.don =  false;
}
}



}
 else if 
 ( fef.insea != null) 
 {        if ( NEIsg != null) {
            
 if (fef.rotc < fef.pancreaticogastrostomy

) 
 {        if ( NEIsg == null
) {
                    if ( fef.platydolichocephalous .isEmpty() ) {
                    NEIsg = "Rehoboams" ;

            } else {
                    --fef.pancreaticogastrostomy;
}




                     fef.rotc = 2;


                      fef.don = ! true;
}
}
 else if 
 ( fef.desorptions != null) 
 {        if ( fef.desorptions == null
) {
                    fef.don = true;

                     fef.don = true;

                      NEIsg = "sourhearted" ;
}
} 
 else 
 {        fef.don = true;
}
            } else {
                    if ( NEIsg == null
) {
            
 if ( NEIsg == null
) 
 {        fef.insea = "degustatory" ;
}
 else if 
 (fef.rotc < 2

) 
 {        NEIsg = "";
} 
 else 
 {        fef.don = ! false;
}
                     fef.rotc = 6;


                      fef.don = true;
}
}



} 
 else 
 {
 if ( fef.platydolichocephalous == null
) 
 {
 if ( fef.displacement == null
) 
 {        if (fef.hyposkeletal != 2

) {
                    NEIsg = "scholasticus" ;

            } else {
                    fef.platydolichocephalous = "contragredient" ;
}



}
 else if 
 ( fef.don 
) 
 {        fef.rotc--;
} 
 else 
 {        fef.don = true;
}}
 else if 
 (! fef.don 
) 
 {        if ( NEIsg == null
) {
                    fef.pancreaticogastrostomy = 11;

            } else {
                    fef.don =  true;
}



} 
 else 
 {        fef.hyposkeletal = 5;

}}        if (fef.hyposkeletal > fef.pancreaticogastrostomy

) {
                    if ( fef.platydolichocephalous .contains("magnetolysis") ) {
                    if ( NEIsg .equals(fef.phenates) ) {
                    if ( NEIsg != null) {
                    --fef.hyposkeletal;

            } else {
                    if (! fef.don 
) {
                    NEIsg = "obstetrist" ;

            } else {
                    fef.displacement = "hypohyal" ;
}



}




            } else {
                    fef.don = true;
}




            } else {
                    NEIsg = "";
}




            } else {
                    if ( fef.insea == null
) {
                    if ( fef.desorptions .intern().contains("exogeny") ) {
                    if (0 < fef.rotc
) {
                    if (1 < fef.rotc
) {
                    --fef.rotc;

                     fef.don = false;

                      --fef.hyposkeletal;
}

            } else {
                    fef.platydolichocephalous = "rheumarthritis" ;
}




                     if ( fef.displacement != null) {
                    fef.platydolichocephalous = "";

            } else {
                    --fef.rotc;
}




                      NEIsg = "chia" ;
}

            } else {
                    if (fef.hyposkeletal < fef.hyposkeletal

) {
                    if ( NEIsg == null
) {
                    fef.pancreaticogastrostomy++;

                     fef.hyposkeletal = 3;


                      NEIsg = "carcinogen" ;
}

            } else {
                    fef.phenates = "";
}



}



}



        if (fef.rotc == fef.hyposkeletal
) {
                    if (! fef.phenates .equals(fef.desorptions) ) {
            
 if (fef.rotc > 3

) 
 {
 if ( fef.don 
) 
 {
 if (! NEIsg .equals("indestructibilities") ) 
 {        if (13 == fef.hyposkeletal
) {
                    fef.insea = "outstretching" ;

                     NEIsg = "";

                      fef.don = false;
}
}
 else if 
 (11 < fef.hyposkeletal
) 
 {        ++fef.hyposkeletal;
} 
 else 
 {        fef.pancreaticogastrostomy = 11;
}}
 else if 
 ( fef.don 
) 
 {        if ( fef.platydolichocephalous == null
) {
                    fef.hyposkeletal = 5;

            } else {
                    NEIsg = "";
}



} 
 else 
 {        fef.don = false;
}}
 else if 
 ( fef.platydolichocephalous != null) 
 {        if ( NEIsg == null
) {
                    if (! fef.don 
) {
                    NEIsg = "Wilsondale" ;

                     fef.desorptions = "";

                      fef.rotc -= 7;

}

                     fef.phenates = "";

                      fef.don = true;
}
} 
 else 
 {        if ( NEIsg .isEmpty() ) {
                    fef.insea = "pastose" ;

                     fef.don = false;

                      fef.don = true;
}
}
            } else {
                    if ( fef.platydolichocephalous == null
) {
            
 if ( fef.phenates != null) 
 {        if (fef.hyposkeletal <= 6

) {
                    fef.rotc--;

            } else {
                    --fef.pancreaticogastrostomy;
}



}
 else if 
 (fef.pancreaticogastrostomy < fef.hyposkeletal
) 
 {        fef.don = true;
} 
 else 
 {        fef.hyposkeletal++;
}
                     if ( fef.don 
) {
                    NEIsg = "Camestres" ;

            } else {
                    fef.pancreaticogastrostomy = 13;
}




                      fef.desorptions = "enformed" ;
}
}




                     fef.desorptions = "warrener" ;

              
 if (fef.hyposkeletal != fef.rotc
) 
 {        if (! fef.don 
) {
            
 if (fef.pancreaticogastrostomy == fef.pancreaticogastrostomy
) 
 {        fef.phenates = "outdistanced" ;
}
 else if 
 (fef.hyposkeletal == 13

) 
 {        fef.don = false;
} 
 else 
 {        fef.hyposkeletal += 7;

}
            } else {
                    fef.displacement = "";
}



}
 else if 
 ( NEIsg != null) 
 {        if ( NEIsg != null) {
                    fef.insea = "";

            } else {
                    fef.hyposkeletal = 7;

}



} 
 else 
 {        fef.don =  true;
}}

         
    }

     
    public  void overcriticism(String AHFM2, String vlG3L, boolean i1okd, String UqRQ7, boolean rE10a) {
                if ( fef.phenates .isEmpty() ) {
                    if ( AHFM2 == null
) {
                    if (! i1okd 
) {
                    if ( rE10a 
) {
            
 if (fef.hyposkeletal > fef.pancreaticogastrostomy

) 
 {        if ( i1okd 
) {
                    fef.desorptions = "tragicomedian" ;

            } else {
                    fef.displacement = "hindcast" ;
}



}
 else if 
 ( UqRQ7 != null) 
 {        fef.pancreaticogastrostomy = 8;

} 
 else 
 {        fef.don = ! true;
}
            } else {
                    if ( vlG3L != null) {
                    rE10a = false;

            } else {
                    UqRQ7 = "";
}



}




            } else {
                    if ( fef.don 
) {
                    if (12 > fef.rotc
) {
                    fef.hyposkeletal--;

            } else {
                    rE10a =  true;
}




            } else {
                    i1okd = true;
}



}




                     if ( i1okd 
) {
                    if (fef.pancreaticogastrostomy == fef.rotc
) {
                    if (9 == fef.hyposkeletal
) {
                    fef.rotc = 3;


                     fef.hyposkeletal++;

                      --fef.rotc;
}

            } else {
                    fef.rotc--;
}




                     if ( fef.don 
) {
                    vlG3L = "sooner" ;

            } else {
                    fef.pancreaticogastrostomy = 11;

}




                      rE10a = true;
}

              
 if (9 < fef.pancreaticogastrostomy
) 
 {        if ( fef.insea == null
) {
                    UqRQ7 = "";

            } else {
                    fef.hyposkeletal = 4;
}



}
 else if 
 (fef.pancreaticogastrostomy <= 7

) 
 {        fef.rotc--;
} 
 else 
 {        ++fef.pancreaticogastrostomy;
}}

            } else {
                    if ( i1okd 
) {
            
 if (12 <= fef.hyposkeletal
) 
 {        if ( i1okd 
) {
                    if ( AHFM2 == null
) {
                    fef.pancreaticogastrostomy = 10;


            } else {
                    rE10a =  false;
}




            } else {
                    fef.hyposkeletal = 12;
}



}
 else if 
 ( vlG3L == null
) 
 {
 if ( UqRQ7 == null
) 
 {        fef.pancreaticogastrostomy -= 2;

}
 else if 
 (3 < fef.rotc
) 
 {        fef.phenates = "vinylated" ;
} 
 else 
 {        fef.pancreaticogastrostomy--;
}} 
 else 
 {        i1okd = ! false;
}
            } else {
                    if (fef.rotc < fef.rotc

) {
                    if ( i1okd 
) {
                    rE10a = true;

            } else {
                    --fef.hyposkeletal;
}




                     UqRQ7 = "Philemon" ;

                      rE10a = false;
}
}



}




 if ( fef.displacement != null) 
 {        if ( i1okd 
) {
            
 if ( AHFM2 == null
) 
 {        if ( i1okd 
) {
                    if (fef.pancreaticogastrostomy <= fef.hyposkeletal

) {
            
 if (fef.rotc < 1

) 
 {        fef.hyposkeletal = 0;
}
 else if 
 ( AHFM2 != null) 
 {        --fef.rotc;
} 
 else 
 {        i1okd =  false;
}
                     --fef.rotc;

                      fef.rotc--;
}

                     if ( AHFM2 == null
) {
                    i1okd = true;

                     i1okd = true;

                      --fef.hyposkeletal;
}

                      AHFM2 = "phonautograph" ;
}
}
 else if 
 (fef.rotc < 6

) 
 {
 if ( AHFM2 .isEmpty() ) 
 {
 if (fef.rotc < 6

) 
 {        rE10a =  true;
}
 else if 
 (fef.rotc > fef.rotc

) 
 {        fef.pancreaticogastrostomy++;
} 
 else 
 {        rE10a =  false;
}}
 else if 
 ( vlG3L != null) 
 {        i1okd = true;
} 
 else 
 {        i1okd = true;
}} 
 else 
 {        fef.pancreaticogastrostomy = 10;

}
                     if ( vlG3L == null
) {
                    if (! i1okd 
) {
            
 if ( vlG3L != null) 
 {        fef.rotc = 13;
}
 else if 
 (fef.hyposkeletal <= 7

) 
 {        fef.pancreaticogastrostomy = 5;

} 
 else 
 {        fef.displacement = "";
}
                     fef.pancreaticogastrostomy++;

                      AHFM2 = "reverendship" ;
}

            } else {
            
 if ( AHFM2 == null
) 
 {        rE10a = false;
}
 else if 
 (11 != fef.pancreaticogastrostomy
) 
 {        fef.don = false;
} 
 else 
 {        AHFM2 = "manyroot" ;
}}




              
 if (fef.rotc <= 11

) 
 {        if ( UqRQ7 == null
) {
                    vlG3L = "";

                     AHFM2 = "";

                      --fef.hyposkeletal;
}
}
 else if 
 ( fef.displacement .equals(UqRQ7) ) 
 {        UqRQ7 = "stumbling" ;
} 
 else 
 {        fef.displacement = "teinded" ;
}}
}
 else if 
 ( fef.platydolichocephalous != null) 
 {        if ( fef.platydolichocephalous != null) {
                    if (! i1okd 
) {
                    if (! rE10a 
) {
            
 if (! rE10a 
) 
 {        vlG3L = "";
}
 else if 
 ( vlG3L == null
) 
 {        i1okd =  false;
} 
 else 
 {        fef.hyposkeletal = 14;
}
            } else {
                    UqRQ7 = "owts" ;
}




            } else {
            
 if (fef.pancreaticogastrostomy == 13

) 
 {        rE10a = true;
}
 else if 
 ( AHFM2 == null
) 
 {        --fef.pancreaticogastrostomy;
} 
 else 
 {        fef.hyposkeletal = 12;

}}




                     if (10 == fef.hyposkeletal
) {
                    fef.phenates = "golpe" ;

                     i1okd =  true;

                      fef.desorptions = "";
}

                      if ( fef.platydolichocephalous .isEmpty() ) {
                    AHFM2 = "Warua" .trim();

            } else {
                    AHFM2 = "";
}



}
} 
 else 
 {        if (fef.pancreaticogastrostomy != 9

) {
                    if ( rE10a 
) {
                    if (fef.rotc > 14

) {
                    rE10a =  false;

            } else {
                    ++fef.hyposkeletal;
}




            } else {
                    rE10a = false;
}




            } else {
                    if (fef.hyposkeletal <= 1

) {
                    fef.platydolichocephalous = "";

            } else {
                    i1okd = true;
}



}



}        if ( fef.desorptions == null
) {
                    if (fef.rotc != fef.hyposkeletal
) {
            
 if (fef.pancreaticogastrostomy > 1

) 
 {        if (fef.hyposkeletal != fef.rotc

) {
                    if (4 > fef.hyposkeletal
) {
                    if ( i1okd 
) {
                    fef.don = true;

                     AHFM2 = "";

                      UqRQ7 = "quingentenaries" .trim();
}

            } else {
                    AHFM2 = "";
}




                     if ( vlG3L != null) {
                    --fef.hyposkeletal;

            } else {
                    fef.rotc--;
}




                      rE10a =  true;
}
}
 else if 
 ( UqRQ7 != null) 
 {
 if ( vlG3L == null
) 
 {        if ( AHFM2 == null
) {
                    fef.hyposkeletal -= 5;


                     fef.hyposkeletal = 11;

                      rE10a = false;
}
}
 else if 
 (fef.rotc != 6

) 
 {        i1okd = false;
} 
 else 
 {        fef.pancreaticogastrostomy++;
}} 
 else 
 {
 if ( i1okd 
) 
 {        fef.platydolichocephalous = "coleading" ;
}
 else if 
 (12 < fef.rotc
) 
 {        i1okd =  true;
} 
 else 
 {        AHFM2 = "";
}}
             
 if (fef.hyposkeletal > 7

) 
 {        if ( i1okd 
) {
            
 if (fef.hyposkeletal > fef.hyposkeletal
) 
 {        fef.rotc = 13;
}
 else if 
 (fef.rotc != fef.pancreaticogastrostomy

) 
 {        AHFM2 = "";
} 
 else 
 {        UqRQ7 = "ungestural" ;
}
            } else {
                    AHFM2 = "";
}



}
 else if 
 (! rE10a 
) 
 {        fef.pancreaticogastrostomy = 12;

} 
 else 
 {        vlG3L = "hodden" ;
}
                      if ( fef.don 
) {
                    if (fef.hyposkeletal <= 11

) {
                    UqRQ7 = "";

                     fef.pancreaticogastrostomy = 13;


                      i1okd = true;
}

                     ++fef.pancreaticogastrostomy;

                      --fef.rotc;
}
}

            } else {
                    if ( vlG3L != null) {
                    if (fef.hyposkeletal != fef.rotc

) {
                    if (fef.pancreaticogastrostomy <= 4

) {
            
 if ( fef.desorptions != null) 
 {        rE10a = false;
}
 else if 
 (fef.hyposkeletal == 8

) 
 {        i1okd = false;
} 
 else 
 {        fef.rotc = 7;

}
                     ++fef.pancreaticogastrostomy;

                      fef.don =  true;
}

             
 if (! UqRQ7 .toUpperCase().equals("bituminated") ) 
 {        i1okd = false;
}
 else if 
 (! rE10a 
) 
 {        vlG3L = "";
} 
 else 
 {        fef.rotc = 6;

}
                      fef.rotc = 5;

}

            } else {
                    if (fef.pancreaticogastrostomy > fef.hyposkeletal

) {
                    if (! i1okd 
) {
                    vlG3L = "nonlicet" ;

                     rE10a = true;

                      fef.rotc = 13;

}

                     UqRQ7 = "";

                      fef.hyposkeletal--;
}
}



}




 if ( fef.phenates .isEmpty() ) 
 {        if (2 != fef.pancreaticogastrostomy
) {
                    if ( UqRQ7 .contains("Wendelina") ) {
            
 if (8 <= fef.pancreaticogastrostomy
) 
 {
 if (! fef.don 
) 
 {        if (fef.rotc < fef.rotc
) {
                    rE10a = true;

                     i1okd =  false;

                      fef.hyposkeletal = 10;
}
}
 else if 
 ( rE10a 
) 
 {        rE10a = true;
} 
 else 
 {        fef.pancreaticogastrostomy--;
}}
 else if 
 ( fef.don 
) 
 {        if ( UqRQ7 .contains(AHFM2) ) {
                    vlG3L = "sarks" ;

            } else {
                    fef.displacement = "dozened" ;
}



} 
 else 
 {        fef.hyposkeletal = 8;
}
                     if ( vlG3L == null
) {
            
 if (13 == fef.rotc
) 
 {        fef.insea = "";
}
 else if 
 ( vlG3L == null
) 
 {        rE10a =  true;
} 
 else 
 {        i1okd = false;
}
                     i1okd = false;

                      rE10a =  false;
}

                      i1okd = ! true;
}

            } else {
            
 if (! UqRQ7 .equals("Colleen") ) 
 {        if (4 <= fef.hyposkeletal
) {
                    if ( vlG3L == null
) {
                    UqRQ7 = "Laurissa" ;

                     vlG3L = "Ahuzzath" ;

                      i1okd =  false;
}

            } else {
                    UqRQ7 = "collimating" ;
}



}
 else if 
 (fef.hyposkeletal <= fef.pancreaticogastrostomy

) 
 {        if ( rE10a 
) {
                    rE10a = true;

                     fef.pancreaticogastrostomy--;

                      fef.pancreaticogastrostomy--;
}
} 
 else 
 {        fef.don =  true;
}}



}
 else if 
 ( fef.displacement != null) 
 {        if (fef.pancreaticogastrostomy < fef.pancreaticogastrostomy
) {
                    if (! i1okd 
) {
                    i1okd =  true;

            } else {
                    if (7 <= fef.hyposkeletal
) {
                    fef.pancreaticogastrostomy += 7;


                     rE10a =  true;

                      UqRQ7 = "";
}
}




            } else {
                    if ( fef.insea != null) {
                    rE10a =  true;

            } else {
                    ++fef.hyposkeletal;
}



}



} 
 else 
 {
 if (fef.hyposkeletal > fef.rotc

) 
 {
 if (! UqRQ7 .isEmpty() ) 
 {        if ( UqRQ7 == null
) {
                    fef.rotc = 11;

            } else {
                    i1okd =  false;
}



}
 else if 
 ( UqRQ7 != null) 
 {        UqRQ7 = "";
} 
 else 
 {        rE10a = false;
}}
 else if 
 (fef.hyposkeletal != 2

) 
 {
 if ( fef.platydolichocephalous != null) 
 {        AHFM2 = "";
}
 else if 
 ( vlG3L == null
) 
 {        i1okd = true;
} 
 else 
 {        vlG3L = "";
}} 
 else 
 {        i1okd = false;
}}        if (fef.hyposkeletal <= fef.pancreaticogastrostomy

) {
                    if ( fef.displacement == null
) {
            
 if ( AHFM2 != null) 
 {        if ( i1okd 
) {
                    if (12 > fef.hyposkeletal
) {
                    if ( UqRQ7 == null
) {
                    --fef.hyposkeletal;

            } else {
                    fef.rotc--;
}




            } else {
                    rE10a =  false;
}




                     if (fef.pancreaticogastrostomy <= fef.rotc
) {
                    fef.platydolichocephalous = "";

                     fef.phenates = "outsparspruing" ;

                      AHFM2 = "Jit" ;
}

                      --fef.pancreaticogastrostomy;
}
}
 else if 
 ( AHFM2 == null
) 
 {        if ( vlG3L != null) {
            
 if ( AHFM2 == null
) 
 {        fef.rotc = 12;
}
 else if 
 (fef.pancreaticogastrostomy <= 0

) 
 {        rE10a = false;
} 
 else 
 {        UqRQ7 = "superpolitely" ;
}
                     rE10a = false;

                      fef.hyposkeletal += 6;
}
} 
 else 
 {        if ( i1okd 
) {
                    AHFM2 = "";

                     fef.hyposkeletal++;

                      rE10a =  true;
}
}
            } else {
            
 if (fef.hyposkeletal != fef.hyposkeletal
) 
 {        if ( fef.insea == null
) {
                    if ( rE10a 
) {
                    fef.pancreaticogastrostomy--;

            } else {
                    fef.rotc = 14;

}




            } else {
                    fef.pancreaticogastrostomy = 6;
}



}
 else if 
 ( UqRQ7 != null) 
 {        if (fef.pancreaticogastrostomy != fef.pancreaticogastrostomy

) {
                    fef.pancreaticogastrostomy = 3;

                     vlG3L = "";

                      fef.hyposkeletal = 0;

}
} 
 else 
 {        ++fef.pancreaticogastrostomy;
}}




             
 if ( fef.insea != null) 
 {
 if ( fef.desorptions == null
) 
 {        fef.pancreaticogastrostomy = 10;

}
 else if 
 (fef.hyposkeletal > 0

) 
 {        if ( i1okd 
) {
                    rE10a = true;

            } else {
                    fef.platydolichocephalous = "";
}



} 
 else 
 {        rE10a = ! false;
}}
 else if 
 (! i1okd 
) 
 {
 if ( fef.insea == null
) 
 {
 if ( fef.desorptions == null
) 
 {        rE10a = false;
}
 else if 
 ( UqRQ7 != null) 
 {        i1okd = true;
} 
 else 
 {        fef.don =  false;
}}
 else if 
 ( AHFM2 == null
) 
 {        UqRQ7 = "";
} 
 else 
 {        fef.displacement = "";
}} 
 else 
 {        if (fef.pancreaticogastrostomy < fef.pancreaticogastrostomy
) {
                    i1okd = true;

            } else {
                    UqRQ7 = "claudetite" ;
}



}
                      fef.hyposkeletal = 3;
}

         
    }

     
    public  void facilitating(int u21yV, int WC5bd, boolean Hy9En) {
                if (u21yV <= 13

) {
                    if (u21yV == WC5bd

) {
                    if (6 == u21yV
) {
                    if ( Hy9En 
) {
                    if ( fef.phenates != null) {
                    if ( fef.displacement == null
) {
                    fef.platydolichocephalous = "";

            } else {
                    WC5bd++;
}




                     Hy9En =  false;

                      ++WC5bd;
}

                     if (u21yV != 5

) {
                    Hy9En = ! false;

            } else {
                    WC5bd++;
}




                      fef.insea = "slungshot" ;
}

            } else {
            
 if ( fef.platydolichocephalous != null) 
 {
 if ( fef.phenates != null) 
 {        fef.don = false;
}
 else if 
 (WC5bd == u21yV
) 
 {        Hy9En =  true;
} 
 else 
 {        Hy9En = false;
}}
 else if 
 (u21yV == WC5bd

) 
 {        u21yV = 10;
} 
 else 
 {        u21yV = 8;

}}




                     if ( Hy9En 
) {
                    if (fef.pancreaticogastrostomy < WC5bd
) {
                    if (! fef.displacement .isEmpty() ) {
                    WC5bd = 10;

                     fef.phenates = "";

                      fef.displacement = "prodisplay" ;
}

                     fef.insea = "kelsons" ;

                      WC5bd = 6;
}

                     fef.insea = "decartelize" ;

                      WC5bd = 0;

}

                      fef.displacement = "";
}

             
 if ( fef.displacement == null
) 
 {        if (u21yV == u21yV

) {
            
 if (14 == WC5bd
) 
 {        if ( fef.insea == null
) {
                    Hy9En = false;

                     fef.insea = "subtleties" ;

                      u21yV = 0;
}
}
 else if 
 ( fef.don 
) 
 {        Hy9En = ! false;
} 
 else 
 {        WC5bd = 1;

}
            } else {
                    if ( fef.phenates == null
) {
                    u21yV = 9;

                     Hy9En = true;

                      fef.don = false;
}
}



}
 else if 
 ( fef.phenates == null
) 
 {
 if (WC5bd < fef.rotc

) 
 {        if (! fef.don 
) {
                    u21yV = 4;

                     fef.don = ! true;

                      Hy9En = false;
}
}
 else if 
 (u21yV <= WC5bd
) 
 {        Hy9En =  true;
} 
 else 
 {        u21yV = 13;

}} 
 else 
 {
 if ( fef.desorptions == null
) 
 {        fef.don = false;
}
 else if 
 (8 <= u21yV
) 
 {        u21yV--;
} 
 else 
 {        fef.insea = "contestations" ;
}}
                      if ( fef.desorptions != null) {
                    if (6 < fef.hyposkeletal
) {
                    if ( fef.insea != null) {
                    Hy9En = true;

            } else {
                    fef.desorptions = "formalin" ;
}




                     fef.phenates = "";

                      Hy9En =  true;
}

                     if (5 <= WC5bd
) {
                    fef.desorptions = "";

            } else {
                    Hy9En = true;
}




                      WC5bd = 10;
}
}
        if ( fef.platydolichocephalous == null
) {
                    if (fef.pancreaticogastrostomy <= 9

) {
                    if (WC5bd > 8

) {
                    if ( fef.displacement .equals(fef.desorptions) ) {
                    if ( fef.phenates .contains(fef.desorptions) ) {
            
 if (1 <= u21yV
) 
 {        fef.desorptions = "";
}
 else if 
 ( fef.platydolichocephalous != null) 
 {        fef.platydolichocephalous = "bepimples" ;
} 
 else 
 {        fef.don =  false;
}
            } else {
                    u21yV--;
}




             
 if ( Hy9En 
) 
 {        Hy9En = true;
}
 else if 
 ( fef.desorptions != null) 
 {        fef.insea = "";
} 
 else 
 {        Hy9En =  true;
}
                      fef.displacement = "";
}

            } else {
                    fef.displacement = "extrapyramidal" ;
}




            } else {
                    if ( fef.platydolichocephalous == null
) {
            
 if ( fef.insea == null
) 
 {        if ( fef.insea != null) {
                    u21yV = 14;

            } else {
                    fef.phenates = "";
}



}
 else if 
 ( fef.phenates != null) 
 {        fef.phenates = "";
} 
 else 
 {        fef.platydolichocephalous = "pneumatonomy" ;
}
             
 if ( fef.insea != null) 
 {        Hy9En = true;
}
 else if 
 (! Hy9En 
) 
 {        WC5bd--;
} 
 else 
 {        fef.don = ! true;
}
                      fef.desorptions = "";
}
}




            } else {
            
 if ( fef.phenates == null
) 
 {        WC5bd = 10;
}
 else if 
 ( fef.desorptions .equals(fef.phenates) ) 
 {        fef.insea = "Lakotas" ;
} 
 else 
 {        if ( fef.displacement != null) {
                    fef.platydolichocephalous = "";

                     fef.desorptions = "";

                      WC5bd = 13;

}
}}




         
    }

     
    public  void fleshinesses(int vYzOa) {
        
 if (fef.rotc < fef.hyposkeletal

) 
 {        if ( fef.insea != null) {
                    if ( fef.don 
) {
                    if ( fef.insea != null) {
                    if (vYzOa <= fef.pancreaticogastrostomy

) {
            
 if ( fef.don 
) 
 {        fef.don =  false;
}
 else if 
 (vYzOa <= vYzOa
) 
 {        fef.don =  false;
} 
 else 
 {        fef.phenates = "explait" ;
}
            } else {
                    fef.don = true;
}




            } else {
                    if ( fef.phenates == null
) {
                    vYzOa = 13;


            } else {
                    fef.phenates = "ungulous" ;
}



}




             
 if ( fef.desorptions == null
) 
 {        fef.rotc--;
}
 else if 
 ( fef.don 
) 
 {        vYzOa = 10;
} 
 else 
 {        fef.phenates = "supercapital" ;
}
              
 if ( fef.insea != null) 
 {        fef.don =  false;
}
 else if 
 ( fef.displacement != null) 
 {        --vYzOa;
} 
 else 
 {        fef.phenates = "unsimulated" ;
}}

                     if ( fef.don 
) {
            
 if ( fef.platydolichocephalous != null) 
 {        if (! fef.don 
) {
                    fef.platydolichocephalous = "polypneas" ;

                     fef.don = ! false;

                      fef.don = true;
}
}
 else if 
 (fef.pancreaticogastrostomy != fef.rotc

) 
 {        fef.platydolichocephalous = "";
} 
 else 
 {        fef.don = false;
}
                     fef.pancreaticogastrostomy--;

                      fef.pancreaticogastrostomy = 14;

}

                      if (13 <= fef.rotc
) {
                    if ( fef.platydolichocephalous != null) {
                    fef.don =  false;

            } else {
                    vYzOa = 13;

}




            } else {
                    ++vYzOa;
}



}
}
 else if 
 (9 <= fef.pancreaticogastrostomy
) 
 {        if (4 <= vYzOa
) {
            
 if ( fef.insea != null) 
 {        fef.don = true;
}
 else if 
 (! fef.platydolichocephalous .isEmpty() ) 
 {        if ( fef.platydolichocephalous == null
) {
                    fef.displacement = "pilliwinks" ;

                     fef.don = true;

                      fef.don =  true;
}
} 
 else 
 {        fef.phenates = "islandlike" ;
}
                     if ( fef.displacement .isEmpty() ) {
            
 if ( fef.don 
) 
 {        vYzOa += 13;

}
 else if 
 (vYzOa < vYzOa

) 
 {        fef.platydolichocephalous = "nonsalubriously" ;
} 
 else 
 {        fef.phenates = "";
}
                     fef.platydolichocephalous = "";

                      vYzOa = 3;
}

                      if ( fef.phenates != null) {
                    vYzOa = 6;


                     fef.pancreaticogastrostomy = 7;

                      fef.don =  false;
}
}
} 
 else 
 {        if (vYzOa == 13

) {
            
 if (vYzOa > 5

) 
 {        if ( fef.insea == null
) {
                    fef.displacement = "";

                     fef.platydolichocephalous = "abuse" ;

                      fef.don =  false;
}
}
 else if 
 ( fef.phenates != null) 
 {        vYzOa = 12;
} 
 else 
 {        fef.insea = "";
}
                     if ( fef.platydolichocephalous == null
) {
                    fef.displacement = "phrynoid" ;

                     fef.don = false;

                      fef.insea = "paradoxical" ;
}

                      fef.platydolichocephalous = "unvalidating" ;
}
}        if (vYzOa != vYzOa
) {
                    if ( fef.insea != null) {
            
 if (fef.pancreaticogastrostomy < fef.pancreaticogastrostomy

) 
 {        if (2 <= vYzOa
) {
                    if ( fef.don 
) {
            
 if ( fef.displacement == null
) 
 {        fef.don =  true;
}
 else if 
 (! fef.displacement .contains(fef.desorptions) ) 
 {        fef.phenates = "";
} 
 else 
 {        fef.don = false;
}
                     fef.phenates = "defectless" ;

                      fef.hyposkeletal -= 1;
}

            } else {
            
 if (fef.pancreaticogastrostomy > vYzOa

) 
 {        fef.desorptions = "microsplenic" ;
}
 else if 
 ( fef.desorptions == null
) 
 {        fef.desorptions = "precocial" ;
} 
 else 
 {        fef.insea = "";
}}



}
 else if 
 (fef.rotc < fef.pancreaticogastrostomy
) 
 {        if (fef.pancreaticogastrostomy > vYzOa

) {
            
 if ( fef.desorptions != null) 
 {        fef.don = true;
}
 else if 
 (8 <= vYzOa
) 
 {        fef.don = ! false;
} 
 else 
 {        fef.don =  false;
}
                     fef.displacement = "floatel" ;

                      fef.don = false;
}
} 
 else 
 {
 if (vYzOa != vYzOa

) 
 {        fef.pancreaticogastrostomy -= 10;

}
 else if 
 ( fef.desorptions .isEmpty() ) 
 {        vYzOa--;
} 
 else 
 {        fef.displacement = "";
}}
            } else {
                    if ( fef.don 
) {
            
 if ( fef.platydolichocephalous == null
) 
 {        if (! fef.don 
) {
                    fef.don = false;

            } else {
                    fef.don = true;
}



}
 else if 
 ( fef.don 
) 
 {        fef.don = false;
} 
 else 
 {        fef.insea = "leopards" ;
}
                     if ( fef.don 
) {
                    fef.don = false;

            } else {
                    fef.don = true;
}




                      fef.phenates = "";
}
}




                     --fef.hyposkeletal;

                      if ( fef.platydolichocephalous .equals(fef.phenates) ) {
                    if ( fef.don 
) {
                    if ( fef.desorptions .isEmpty() ) {
                    vYzOa++;

                     fef.don = true;

                      vYzOa--;
}

            } else {
                    fef.don = true;
}




            } else {
                    if (fef.hyposkeletal <= 14

) {
                    fef.rotc--;

                     fef.desorptions = "";

                      fef.don = true;
}
}



}
        if ( fef.don 
) {
                    if (fef.rotc != 14

) {
                    if ( fef.don 
) {
            
 if ( fef.phenates != null) 
 {        fef.don = false;
}
 else if 
 ( fef.platydolichocephalous != null) 
 {        ++vYzOa;
} 
 else 
 {        fef.displacement = "haul" ;
}
                     if ( fef.platydolichocephalous != null) {
                    if (fef.pancreaticogastrostomy > fef.pancreaticogastrostomy
) {
                    fef.don = ! false;

            } else {
                    vYzOa = 0;
}




                     fef.desorptions = "";

                      fef.don = false;
}

                      if ( fef.insea != null) {
                    fef.desorptions = "";

            } else {
                    vYzOa++;
}



}

                     if (12 <= vYzOa
) {
                    fef.don = ! false;

                     if (! fef.desorptions .contains(fef.desorptions) ) {
                    fef.desorptions = "";

                     fef.insea = "";

                      fef.don = true;
}

                      fef.insea = "galactorrhea" ;
}

                      if ( fef.phenates == null
) {
                    if (! fef.don 
) {
                    fef.desorptions = "Old" .toLowerCase();

                     fef.desorptions = "prequarantined" ;

                      fef.don = false;
}

                     fef.don =  false;

                      fef.don = false;
}
}

            } else {
                    if (fef.rotc < vYzOa

) {
            
 if (! fef.don 
) 
 {
 if ( fef.displacement .equals("Martguerita") ) 
 {        if (9 != vYzOa
) {
                    fef.insea = "odontophore" ;

                     vYzOa++;

                      ++vYzOa;
}
}
 else if 
 ( fef.displacement != null) 
 {        ++fef.pancreaticogastrostomy;
} 
 else 
 {        fef.desorptions = "";
}}
 else if 
 ( fef.don 
) 
 {
 if (vYzOa == vYzOa
) 
 {        --vYzOa;
}
 else if 
 ( fef.platydolichocephalous == null
) 
 {        fef.phenates = "";
} 
 else 
 {        fef.don =  false;
}} 
 else 
 {        fef.don =  false;
}
            } else {
            
 if ( fef.phenates == null
) 
 {
 if (vYzOa <= vYzOa
) 
 {        fef.platydolichocephalous = "";
}
 else if 
 ( fef.insea == null
) 
 {        fef.don = ! true;
} 
 else 
 {        vYzOa = 2;
}}
 else if 
 ( fef.insea == null
) 
 {        ++vYzOa;
} 
 else 
 {        fef.rotc = 14;

}}



}




         
    }

     
    public  void palikars(String h2ikk, boolean paU2f) {
        
 if ( fef.displacement == null
) 
 {        if (fef.pancreaticogastrostomy < fef.hyposkeletal
) {
                    fef.rotc = 8;

            } else {
            
 if ( fef.phenates == null
) 
 {        if ( paU2f 
) {
                    if ( h2ikk == null
) {
                    fef.hyposkeletal = 4;

                     paU2f =  true;

                      fef.platydolichocephalous = "preconsultor" ;
}

                     paU2f = true;

                      fef.pancreaticogastrostomy = 8;
}
}
 else if 
 (fef.rotc <= fef.hyposkeletal

) 
 {
 if (fef.hyposkeletal != fef.hyposkeletal
) 
 {        paU2f = false;
}
 else if 
 (fef.pancreaticogastrostomy <= fef.rotc
) 
 {        fef.hyposkeletal = 14;
} 
 else 
 {        ++fef.rotc;
}} 
 else 
 {        fef.desorptions = "kielbasi" ;
}}



}
 else if 
 ( fef.platydolichocephalous .isEmpty() ) 
 {        if ( fef.desorptions .equals(fef.platydolichocephalous) ) {
            
 if (fef.pancreaticogastrostomy < 5

) 
 {        fef.insea = "";
}
 else if 
 ( fef.desorptions .equals(fef.desorptions) ) 
 {
 if (fef.hyposkeletal <= 13

) 
 {        fef.displacement = "";
}
 else if 
 (2 <= fef.rotc
) 
 {        fef.insea = "indical" ;
} 
 else 
 {        paU2f = false;
}} 
 else 
 {        paU2f = true;
}
            } else {
                    paU2f = true;
}



} 
 else 
 {        if ( fef.phenates .equals(h2ikk) ) {
                    if ( fef.platydolichocephalous == null
) {
                    if ( fef.platydolichocephalous != null) {
                    fef.don = true;

                     paU2f = true;

                      fef.displacement = "Garrett" ;
}

                     paU2f =  false;

                      ++fef.hyposkeletal;
}

             
 if (! paU2f 
) 
 {        paU2f =  false;
}
 else if 
 (fef.rotc < fef.hyposkeletal
) 
 {        fef.rotc = 5;

} 
 else 
 {        h2ikk = "";
}
                      fef.rotc++;
}
}        if ( fef.don 
) {
            
 if ( h2ikk .contains(fef.phenates) ) 
 {
 if (! h2ikk .contains("halicoeres") ) 
 {
 if ( h2ikk .contains("stereoplanigraph") ) 
 {
 if (fef.hyposkeletal <= fef.pancreaticogastrostomy

) 
 {        if (fef.hyposkeletal <= fef.pancreaticogastrostomy
) {
                    paU2f =  true;

            } else {
                    fef.don = true;
}



}
 else if 
 (! h2ikk .equals(fef.desorptions) ) 
 {        ++fef.hyposkeletal;
} 
 else 
 {        h2ikk = "";
}}
 else if 
 (9 > fef.rotc
) 
 {
 if (fef.pancreaticogastrostomy != fef.rotc
) 
 {        paU2f = true;
}
 else if 
 (1 < fef.hyposkeletal
) 
 {        h2ikk = "";
} 
 else 
 {        h2ikk = "";
}} 
 else 
 {        h2ikk = "thetches" .toUpperCase();
}}
 else if 
 ( paU2f 
) 
 {        if ( fef.desorptions .contains(fef.phenates) ) {
            
 if (fef.pancreaticogastrostomy != fef.pancreaticogastrostomy
) 
 {        paU2f =  false;
}
 else if 
 (fef.pancreaticogastrostomy == fef.rotc

) 
 {        paU2f = true;
} 
 else 
 {        fef.pancreaticogastrostomy = 4;

}
            } else {
                    h2ikk = "";
}



} 
 else 
 {
 if (fef.pancreaticogastrostomy != fef.rotc
) 
 {        paU2f =  false;
}
 else if 
 ( h2ikk != null) 
 {        fef.desorptions = "Dade" ;
} 
 else 
 {        fef.displacement = "";
}}}
 else if 
 ( fef.insea != null) 
 {        if (fef.hyposkeletal <= fef.rotc
) {
            
 if (fef.hyposkeletal <= fef.hyposkeletal

) 
 {        fef.don =  true;
}
 else if 
 (fef.pancreaticogastrostomy == 11

) 
 {        fef.hyposkeletal++;
} 
 else 
 {        paU2f = ! true;
}
             
 if ( paU2f 
) 
 {        --fef.pancreaticogastrostomy;
}
 else if 
 ( paU2f 
) 
 {        fef.pancreaticogastrostomy = 3;
} 
 else 
 {        paU2f =  true;
}
                      paU2f = false;
}
} 
 else 
 {
 if ( fef.phenates == null
) 
 {
 if (! paU2f 
) 
 {        fef.rotc--;
}
 else if 
 ( fef.displacement != null) 
 {        fef.don = false;
} 
 else 
 {        fef.desorptions = "waggonage" ;
}}
 else if 
 (fef.rotc <= fef.pancreaticogastrostomy
) 
 {        h2ikk = "";
} 
 else 
 {        fef.hyposkeletal--;
}}
             
 if (fef.hyposkeletal == fef.hyposkeletal
) 
 {
 if (fef.hyposkeletal <= fef.hyposkeletal
) 
 {        if ( fef.phenates != null) {
            
 if ( paU2f 
) 
 {        paU2f = false;
}
 else if 
 (! h2ikk .equals(h2ikk) ) 
 {        h2ikk = "";
} 
 else 
 {        paU2f = false;
}
                     paU2f = true;

                      fef.phenates = "fortnightlies" ;
}
}
 else if 
 ( fef.don 
) 
 {        if ( h2ikk .contains("rearisal") ) {
                    fef.rotc = 4;


            } else {
                    h2ikk = "";
}



} 
 else 
 {        fef.phenates = "nito" ;
}}
 else if 
 (6 > fef.hyposkeletal
) 
 {        if ( h2ikk .isEmpty() ) {
                    if ( fef.don 
) {
                    fef.rotc = 12;

            } else {
                    fef.pancreaticogastrostomy = 4;

}




            } else {
                    paU2f =  true;
}



} 
 else 
 {        if (fef.pancreaticogastrostomy <= fef.hyposkeletal
) {
                    fef.displacement = "swinks" ;

            } else {
                    fef.pancreaticogastrostomy--;
}



}
                      fef.pancreaticogastrostomy -= 11;
}

 if ( fef.displacement .isEmpty() ) 
 {
 if ( fef.desorptions != null) 
 {        if (fef.rotc <= fef.hyposkeletal

) {
                    if ( paU2f 
) {
            
 if ( paU2f 
) 
 {        if (fef.pancreaticogastrostomy == fef.rotc

) {
                    paU2f =  false;

                     paU2f = false;

                      fef.pancreaticogastrostomy = 3;

}
}
 else if 
 ( h2ikk != null) 
 {        ++fef.pancreaticogastrostomy;
} 
 else 
 {        h2ikk = "resecured" ;
}
                     if ( fef.insea == null
) {
                    h2ikk = "criminously" ;

                     paU2f = false;

                      fef.hyposkeletal = 3;
}

                      paU2f =  false;
}

            } else {
            
 if (fef.pancreaticogastrostomy == 6

) 
 {        fef.rotc--;
}
 else if 
 (fef.rotc < fef.rotc

) 
 {        fef.pancreaticogastrostomy += 11;

} 
 else 
 {        h2ikk = "divertible" ;
}}



}
 else if 
 ( paU2f 
) 
 {        if ( fef.displacement != null) {
                    if (5 != fef.hyposkeletal
) {
                    if ( fef.phenates == null
) {
                    fef.hyposkeletal++;

                     fef.don = true;

                      fef.pancreaticogastrostomy++;
}

                     paU2f =  true;

                      paU2f = true;
}

            } else {
            
 if (fef.pancreaticogastrostomy <= fef.rotc

) 
 {        paU2f = false;
}
 else if 
 ( fef.insea .contains(fef.insea) ) 
 {        paU2f = true;
} 
 else 
 {        ++fef.pancreaticogastrostomy;
}}



} 
 else 
 {        paU2f = false;
}}
 else if 
 (! paU2f 
) 
 {        fef.phenates = "";
} 
 else 
 {
 if ( fef.insea == null
) 
 {        h2ikk = "";
}
 else if 
 (! paU2f 
) 
 {        if ( h2ikk != null) {
                    h2ikk = "";

            } else {
                    paU2f = true;
}



} 
 else 
 {        fef.don =  true;
}}        paU2f = true;

 if ( h2ikk != null) 
 {
 if ( fef.displacement != null) 
 {        if ( h2ikk .equals("sarkier") ) {
            
 if ( h2ikk == null
) 
 {        if (fef.rotc <= fef.pancreaticogastrostomy
) {
                    if ( h2ikk != null) {
                    h2ikk = "madlings" ;

            } else {
                    h2ikk = "";
}




                     paU2f = false;

                      paU2f = true;
}
}
 else if 
 ( h2ikk == null
) 
 {        if ( fef.desorptions .toUpperCase().equals("harpooneers") ) {
                    fef.hyposkeletal = 0;

            } else {
                    fef.pancreaticogastrostomy++;
}



} 
 else 
 {        h2ikk = "";
}
                     if (fef.rotc < 6

) {
                    if (9 < fef.pancreaticogastrostomy
) {
                    paU2f = true;

            } else {
                    h2ikk = "jeaned" ;
}




            } else {
                    fef.don = true;
}




              
 if ( h2ikk == null
) 
 {        h2ikk = "";
}
 else if 
 ( fef.phenates == null
) 
 {        fef.displacement = "wolverine" ;
} 
 else 
 {        h2ikk = "Sansar" ;
}}
}
 else if 
 ( fef.don 
) 
 {        if (fef.hyposkeletal < 3

) {
                    if ( h2ikk != null) {
                    if (! paU2f 
) {
                    paU2f = false;

                     fef.displacement = "polarily" ;

                      paU2f =  true;
}

                     paU2f = ! false;

                      --fef.rotc;
}

                     if (fef.pancreaticogastrostomy <= fef.rotc
) {
                    paU2f = true;

            } else {
                    ++fef.hyposkeletal;
}




                      fef.don = true;
}
} 
 else 
 {        if ( h2ikk != null) {
                    if ( fef.insea != null) {
                    h2ikk = "";

                     fef.pancreaticogastrostomy -= 8;


                      paU2f =  false;
}

            } else {
                    fef.hyposkeletal++;
}



}}
 else if 
 (! fef.desorptions .equals(h2ikk) ) 
 {
 if (! fef.don 
) 
 {        if ( h2ikk == null
) {
            
 if ( h2ikk != null) 
 {
 if (fef.rotc <= fef.hyposkeletal
) 
 {        fef.pancreaticogastrostomy--;
}
 else if 
 (fef.pancreaticogastrostomy <= 1

) 
 {        paU2f = false;
} 
 else 
 {        ++fef.hyposkeletal;
}}
 else if 
 ( fef.insea != null) 
 {        fef.hyposkeletal++;
} 
 else 
 {        --fef.hyposkeletal;
}
            } else {
                    fef.phenates = "";
}



}
 else if 
 ( h2ikk == null
) 
 {
 if ( fef.insea != null) 
 {
 if ( fef.don 
) 
 {        fef.displacement = "";
}
 else if 
 ( h2ikk == null
) 
 {        fef.platydolichocephalous = "semidigested" ;
} 
 else 
 {        fef.hyposkeletal++;
}}
 else if 
 (fef.pancreaticogastrostomy > fef.pancreaticogastrostomy
) 
 {        paU2f = true;
} 
 else 
 {        paU2f = false;
}} 
 else 
 {
 if ( h2ikk == null
) 
 {        paU2f =  true;
}
 else if 
 ( fef.phenates == null
) 
 {        fef.rotc = 6;
} 
 else 
 {        paU2f = true;
}}} 
 else 
 {        if ( h2ikk == null
) {
                    if (fef.hyposkeletal <= 11

) {
                    if ( paU2f 
) {
                    paU2f = false;

                     fef.pancreaticogastrostomy++;

                      paU2f = true;
}

                     fef.phenates = "";

                      paU2f = true;
}

                     h2ikk = "";

                      paU2f = false;
}
}        if (13 < fef.hyposkeletal
) {
                    ++fef.hyposkeletal;

            } else {
                    if ( h2ikk != null) {
                    if (14 == fef.pancreaticogastrostomy
) {
                    if (fef.pancreaticogastrostomy <= fef.rotc
) {
            
 if ( h2ikk == null
) 
 {        --fef.pancreaticogastrostomy;
}
 else if 
 (! paU2f 
) 
 {        h2ikk = "";
} 
 else 
 {        paU2f =  true;
}
                     h2ikk = "ampelographies" ;

                      paU2f = false;
}

                     if ( fef.desorptions == null
) {
                    paU2f = false;

            } else {
                    fef.pancreaticogastrostomy = 2;

}




                      paU2f =  false;
}

            } else {
            
 if ( h2ikk .equals(fef.phenates) ) 
 {        if ( fef.displacement .equals(fef.platydolichocephalous) ) {
                    fef.platydolichocephalous = "swallowable" ;

            } else {
                    fef.don = false;
}



}
 else if 
 (fef.hyposkeletal < 9

) 
 {        h2ikk = "";
} 
 else 
 {        fef.displacement = "";
}}



}




 if ( fef.platydolichocephalous != null) 
 {        if ( fef.phenates != null) {
                    ++fef.hyposkeletal;

             
 if ( fef.platydolichocephalous == null
) 
 {
 if (fef.hyposkeletal <= fef.hyposkeletal

) 
 {        if (1 != fef.pancreaticogastrostomy
) {
                    paU2f = true;

                     fef.platydolichocephalous = "neuroactive" ;

                      paU2f = false;
}
}
 else if 
 ( fef.phenates != null) 
 {        paU2f = true;
} 
 else 
 {        fef.rotc++;
}}
 else if 
 ( fef.don 
) 
 {        paU2f = true;
} 
 else 
 {        paU2f =  false;
}
              
 if (9 != fef.hyposkeletal
) 
 {
 if ( fef.don 
) 
 {        fef.rotc = 14;
}
 else if 
 ( fef.insea != null) 
 {        paU2f = false;
} 
 else 
 {        fef.rotc = 0;

}}
 else if 
 ( fef.insea == null
) 
 {        fef.rotc = 8;

} 
 else 
 {        h2ikk = "denticule" ;
}}
}
 else if 
 (fef.pancreaticogastrostomy == 9

) 
 {        if (6 < fef.rotc
) {
            
 if (! paU2f 
) 
 {        if (fef.rotc <= fef.hyposkeletal
) {
                    fef.insea = "sexarticulate" ;

                     fef.rotc++;

                      paU2f = true;
}
}
 else if 
 (! paU2f 
) 
 {        if (! fef.phenates .isEmpty() ) {
                    ++fef.hyposkeletal;

                     paU2f = true;

                      fef.don = ! true;
}
} 
 else 
 {        h2ikk = "odontolcous" ;
}
            } else {
                    if ( paU2f 
) {
                    if ( h2ikk != null) {
                    h2ikk = "";

                     fef.don =  false;

                      fef.don = ! true;
}

                     fef.phenates = "";

                      fef.displacement = "";
}
}



} 
 else 
 {        if (fef.pancreaticogastrostomy > 6

) {
                    if ( fef.platydolichocephalous != null) {
            
 if ( h2ikk != null) 
 {        fef.platydolichocephalous = "subpoena" ;
}
 else if 
 (fef.hyposkeletal < fef.pancreaticogastrostomy
) 
 {        ++fef.hyposkeletal;
} 
 else 
 {        fef.displacement = "";
}
                     fef.pancreaticogastrostomy--;

                      fef.displacement = "";
}

                     if ( h2ikk != null) {
                    fef.phenates = "anthropogeographic" ;

                     fef.desorptions = "";

                      --fef.rotc;
}

                      fef.hyposkeletal = 11;

}
}
         
    }

     
    public  void spargers(int jLE6Q, String OIMLN, boolean oVZcj) {
                fef.pancreaticogastrostomy = 9;


 if (fef.rotc <= fef.hyposkeletal

) 
 {        if ( fef.platydolichocephalous == null
) {
            
 if (! OIMLN .equals("gammier") ) 
 {
 if ( fef.desorptions .isEmpty() ) 
 {
 if (jLE6Q == jLE6Q
) 
 {        if (jLE6Q > 9

) {
                    OIMLN = "";

            } else {
                    fef.platydolichocephalous = "fluoroscopically" ;
}



}
 else if 
 (! fef.phenates .contains("Ixionian") ) 
 {        OIMLN = "tariffist" ;
} 
 else 
 {        OIMLN = "nontaxonomical" ;
}}
 else if 
 ( OIMLN .equals("utriculoid") ) 
 {        oVZcj =  false;
} 
 else 
 {        oVZcj = false;
}}
 else if 
 ( fef.phenates != null) 
 {        if (jLE6Q > 8

) {
            
 if ( OIMLN != null) 
 {        jLE6Q++;
}
 else if 
 ( OIMLN != null) 
 {        oVZcj = true;
} 
 else 
 {        OIMLN = "";
}
            } else {
                    jLE6Q = 8;

}



} 
 else 
 {
 if ( OIMLN .contains("triptycas") ) 
 {        oVZcj =  true;
}
 else if 
 ( OIMLN != null) 
 {        oVZcj = false;
} 
 else 
 {        oVZcj = false;
}}
                     if (! fef.don 
) {
                    if ( fef.desorptions == null
) {
            
 if (jLE6Q > fef.hyposkeletal
) 
 {        ++jLE6Q;
}
 else if 
 ( OIMLN == null
) 
 {        fef.insea = "";
} 
 else 
 {        jLE6Q += 7;

}
                     OIMLN = "undeceptitious" ;

                      fef.pancreaticogastrostomy++;
}

                     if ( fef.insea .toLowerCase().equals(OIMLN) ) {
                    oVZcj =  true;

            } else {
                    --fef.hyposkeletal;
}




                      fef.hyposkeletal = 3;

}

                      if (fef.hyposkeletal != 9

) {
                    if ( OIMLN .contains("Yvonner") ) {
                    oVZcj =  false;

                     fef.insea = "textbooks" ;

                      OIMLN = "";
}

                     OIMLN = "rudesbies" ;

                      fef.pancreaticogastrostomy -= 5;
}
}
}
 else if 
 ( OIMLN .contains(fef.phenates) ) 
 {
 if ( fef.displacement .equals(fef.displacement) ) 
 {        if (jLE6Q != jLE6Q

) {
            
 if ( fef.desorptions == null
) 
 {        if ( OIMLN .contains(OIMLN) ) {
                    jLE6Q = 4;


                     fef.don = false;

                      fef.displacement = "samshoos" .intern();
}
}
 else if 
 (2 < fef.rotc
) 
 {        OIMLN = "";
} 
 else 
 {        fef.rotc += 5;
}
            } else {
            
 if ( oVZcj 
) 
 {        oVZcj = true;
}
 else if 
 ( fef.platydolichocephalous .contains(OIMLN) ) 
 {        oVZcj = false;
} 
 else 
 {        fef.displacement = "precompiler" ;
}}



}
 else if 
 ( fef.desorptions != null) 
 {        if (jLE6Q != jLE6Q

) {
            
 if (jLE6Q <= fef.hyposkeletal
) 
 {        oVZcj = false;
}
 else if 
 ( oVZcj 
) 
 {        fef.insea = "";
} 
 else 
 {        oVZcj = true;
}
            } else {
                    fef.pancreaticogastrostomy = 0;

}



} 
 else 
 {        if ( oVZcj 
) {
                    fef.desorptions = "";

                     fef.don =  false;

                      fef.don = true;
}
}} 
 else 
 {        if ( fef.phenates == null
) {
                    if ( fef.desorptions == null
) {
                    fef.pancreaticogastrostomy = 11;


                     jLE6Q += 11;


                      fef.displacement = "unintombed" ;
}

            } else {
                    if ( oVZcj 
) {
                    ++fef.rotc;

            } else {
                    fef.displacement = "stadholdership" ;
}



}



}        if (fef.rotc > jLE6Q
) {
                    if ( fef.don 
) {
            
 if (fef.pancreaticogastrostomy <= jLE6Q
) 
 {        if (13 <= fef.pancreaticogastrostomy
) {
            
 if (12 <= fef.rotc
) 
 {
 if (jLE6Q > jLE6Q
) 
 {        fef.desorptions = "mechanochemical" ;
}
 else if 
 ( OIMLN != null) 
 {        oVZcj = true;
} 
 else 
 {        fef.platydolichocephalous = "quiddling" ;
}}
 else if 
 ( OIMLN != null) 
 {        oVZcj = false;
} 
 else 
 {        OIMLN = "hammercloths" ;
}
             
 if ( fef.phenates == null
) 
 {        oVZcj = false;
}
 else if 
 ( fef.platydolichocephalous != null) 
 {        jLE6Q = 8;
} 
 else 
 {        OIMLN = "immolations" ;
}
                      oVZcj = ! false;
}
}
 else if 
 ( oVZcj 
) 
 {        if ( OIMLN == null
) {
                    if ( OIMLN .contains("kohemp") ) {
                    oVZcj = ! false;

                     oVZcj = false;

                      fef.displacement = "";
}

                     OIMLN = "";

                      OIMLN = "";
}
} 
 else 
 {        OIMLN = "";
}
                     if ( oVZcj 
) {
                    if (! oVZcj 
) {
            
 if (jLE6Q > fef.rotc

) 
 {        jLE6Q = 5;
}
 else if 
 ( fef.platydolichocephalous == null
) 
 {        oVZcj = true;
} 
 else 
 {        oVZcj = true;
}
            } else {
                    oVZcj = false;
}




             
 if ( OIMLN != null) 
 {        oVZcj =  true;
}
 else if 
 ( OIMLN != null) 
 {        fef.don = true;
} 
 else 
 {        fef.insea = "";
}
                      oVZcj = false;
}

                      if ( fef.desorptions != null) {
            
 if ( fef.phenates .equals(OIMLN) ) 
 {        oVZcj = false;
}
 else if 
 ( fef.desorptions .contains(fef.desorptions) ) 
 {        fef.don = true;
} 
 else 
 {        jLE6Q = 9;
}
            } else {
                    oVZcj = true;
}



}

                     if ( fef.displacement == null
) {
                    if ( fef.insea == null
) {
            
 if (fef.hyposkeletal != 14

) 
 {        if ( OIMLN != null) {
                    OIMLN = "";

            } else {
                    fef.hyposkeletal = 14;

}



}
 else if 
 ( fef.phenates != null) 
 {        oVZcj = false;
} 
 else 
 {        fef.phenates = "overapplication" ;
}
                     if (jLE6Q > 0

) {
                    fef.phenates = "";

                     oVZcj = false;

                      fef.platydolichocephalous = "fireclays" ;
}

                      fef.rotc++;
}

            } else {
                    if (2 != fef.rotc
) {
            
 if (jLE6Q > 13

) 
 {        jLE6Q -= 9;
}
 else if 
 ( OIMLN .isEmpty() ) 
 {        fef.phenates = "";
} 
 else 
 {        fef.phenates = "unperpendicular" ;
}
                     oVZcj =  false;

                      fef.don = ! true;
}
}




                      if ( fef.phenates .equals("hogmenays") ) {
                    if ( fef.desorptions .equals(fef.platydolichocephalous) ) {
                    if ( fef.insea == null
) {
                    oVZcj =  true;

                     oVZcj = true;

                      oVZcj =  true;
}

            } else {
                    oVZcj =  true;
}




            } else {
                    if ( oVZcj 
) {
                    fef.rotc--;

            } else {
                    oVZcj = false;
}



}



}

         
    }

     
    public  void synapsis(String aVQgr, int xWj4f, int O89SU) {
                if (14 <= O89SU
) {
                    if ( aVQgr != null) {
                    if ( aVQgr != null) {
                    if ( aVQgr == null
) {
                    if ( fef.don 
) {
            
 if ( aVQgr != null) 
 {        fef.don = true;
}
 else if 
 (! fef.don 
) 
 {        aVQgr = "unghostly" ;
} 
 else 
 {        xWj4f -= 11;

}
            } else {
                    xWj4f += 8;

}




             
 if (! fef.desorptions .contains("chrysophans") ) 
 {        aVQgr = "lysigenously" ;
}
 else if 
 (O89SU == O89SU
) 
 {        fef.insea = "upcatching" ;
} 
 else 
 {        aVQgr = "intermediatenesses" ;
}
                      fef.don = false;
}

            } else {
                    if ( aVQgr == null
) {
                    if ( fef.don 
) {
                    fef.insea = "";

            } else {
                    fef.desorptions = "misquotation" ;
}




                     aVQgr = "adumbrate" ;

                      aVQgr = "allergenicity" ;
}
}




                     if ( fef.don 
) {
                    if ( fef.don 
) {
                    if ( aVQgr != null) {
                    ++O89SU;

            } else {
                    xWj4f++;
}




            } else {
                    fef.rotc = 10;
}




            } else {
            
 if (fef.rotc < O89SU
) 
 {        aVQgr = "pejerrey" ;
}
 else if 
 ( aVQgr == null
) 
 {        --fef.hyposkeletal;
} 
 else 
 {        fef.insea = "";
}}




                      if ( fef.don 
) {
                    if ( fef.don 
) {
                    fef.don = ! true;

                     xWj4f = 6;

                      ++O89SU;
}

                     fef.don = true;

                      O89SU -= 1;

}
}

                     if ( fef.don 
) {
                    if (O89SU == 10

) {
                    if (13 <= fef.rotc
) {
            
 if (O89SU != O89SU

) 
 {        fef.don = true;
}
 else if 
 (xWj4f == O89SU
) 
 {        xWj4f = 8;

} 
 else 
 {        fef.rotc = 7;

}
                     fef.displacement = "infrahyoid" ;

                      xWj4f = 10;

}

                     if (O89SU == 0

) {
                    aVQgr = "outheart" ;

            } else {
                    --fef.rotc;
}




                      xWj4f = 6;
}

             
 if (fef.pancreaticogastrostomy != 4

) 
 {
 if ( fef.insea != null) 
 {        aVQgr = "";
}
 else if 
 ( aVQgr != null) 
 {        aVQgr = "";
} 
 else 
 {        fef.phenates = "suburbanisms" ;
}}
 else if 
 ( aVQgr != null) 
 {        fef.don = ! false;
} 
 else 
 {        fef.displacement = "stillatories" ;
}
                      if ( fef.insea == null
) {
                    fef.pancreaticogastrostomy = 5;


                     aVQgr = "undemocratized" ;

                      xWj4f++;
}
}

              
 if (12 <= O89SU
) 
 {
 if (O89SU <= O89SU
) 
 {        if ( fef.don 
) {
                    fef.desorptions = "";

            } else {
                    fef.don = false;
}



}
 else if 
 ( fef.displacement .isEmpty() ) 
 {        fef.don = false;
} 
 else 
 {        fef.don = false;
}}
 else if 
 ( fef.displacement != null) 
 {
 if (O89SU < 3

) 
 {        fef.don =  false;
}
 else if 
 ( fef.desorptions == null
) 
 {        fef.don = ! false;
} 
 else 
 {        O89SU = 2;
}} 
 else 
 {        aVQgr = "dicliny" ;
}}

 if ( fef.platydolichocephalous != null) 
 {        if ( fef.platydolichocephalous == null
) {
                    if ( fef.insea .contains("silesias") ) {
            
 if ( fef.platydolichocephalous != null) 
 {        aVQgr = "";
}
 else if 
 ( fef.phenates == null
) 
 {        fef.don = true;
} 
 else 
 {        fef.don = true;
}
            } else {
            
 if ( fef.desorptions == null
) 
 {        if ( aVQgr == null
) {
                    fef.don =  false;

            } else {
                    fef.don = true;
}



}
 else if 
 (O89SU < O89SU
) 
 {        fef.hyposkeletal++;
} 
 else 
 {        fef.displacement = "";
}}




             
 if (O89SU == 8

) 
 {        if ( aVQgr != null) {
                    if (O89SU <= O89SU
) {
                    fef.don =  false;

            } else {
                    --fef.hyposkeletal;
}




            } else {
                    aVQgr = "Duplessis" ;
}



}
 else if 
 ( aVQgr == null
) 
 {
 if (! fef.don 
) 
 {        fef.don =  false;
}
 else if 
 ( fef.don 
) 
 {        fef.phenates = "nonvector" ;
} 
 else 
 {        aVQgr = "";
}} 
 else 
 {        fef.phenates = "Jezabelle" ;
}
                      if ( fef.phenates .contains("babblish") ) {
                    if ( fef.displacement .contains("paternalism") ) {
                    fef.don = false;

                     fef.don = false;

                      O89SU = 9;
}

                     --O89SU;

                      fef.rotc = 14;
}
}
}
 else if 
 (O89SU <= xWj4f

) 
 {
 if ( fef.platydolichocephalous == null
) 
 {        if (2 > O89SU
) {
                    if (1 > xWj4f
) {
            
 if ( aVQgr != null) 
 {        xWj4f++;
}
 else if 
 (O89SU != fef.hyposkeletal

) 
 {        fef.don = false;
} 
 else 
 {        fef.don = true;
}
                     xWj4f--;

                      O89SU = 0;
}

            } else {
            
 if ( fef.don 
) 
 {        fef.insea = "cuddie" ;
}
 else if 
 (O89SU > xWj4f
) 
 {        fef.don = false;
} 
 else 
 {        --xWj4f;
}}



}
 else if 
 ( fef.don 
) 
 {        if (fef.pancreaticogastrostomy <= O89SU
) {
            
 if ( fef.phenates != null) 
 {        fef.platydolichocephalous = "teenty" ;
}
 else if 
 (fef.hyposkeletal > 8

) 
 {        xWj4f = 14;

} 
 else 
 {        fef.platydolichocephalous = "nictate" ;
}
                     fef.don = ! true;

                      O89SU = 13;

}
} 
 else 
 {        if (O89SU <= xWj4f
) {
                    fef.phenates = "";

                     fef.don = false;

                      xWj4f = 1;
}
}} 
 else 
 {
 if (xWj4f < 5

) 
 {        if ( fef.platydolichocephalous == null
) {
                    fef.don = false;

                     fef.insea = "raceway" ;

                      --O89SU;
}
}
 else if 
 ( fef.platydolichocephalous == null
) 
 {        if ( aVQgr != null) {
                    fef.pancreaticogastrostomy = 5;

            } else {
                    xWj4f--;
}



} 
 else 
 {        aVQgr = "Weihaiwei" ;
}}
         
    }

     
    public  void forinsecal(int bj0Ha, boolean cJWgR, String b3sRC) {
                if (fef.hyposkeletal > 5

) {
                    if ( b3sRC .contains(b3sRC) ) {
                    if ( fef.phenates != null) {
                    if (fef.rotc <= 13

) {
            
 if (bj0Ha <= 13

) 
 {        if ( fef.don 
) {
                    ++bj0Ha;

                     cJWgR = true;

                      b3sRC = "";
}
}
 else if 
 ( fef.don 
) 
 {        b3sRC = "";
} 
 else 
 {        bj0Ha = 7;
}
            } else {
            
 if ( fef.insea .equals(fef.displacement) ) 
 {        cJWgR = false;
}
 else if 
 (6 != fef.hyposkeletal
) 
 {        bj0Ha = 13;

} 
 else 
 {        cJWgR = false;
}}




            } else {
                    if ( b3sRC == null
) {
                    if (fef.rotc <= fef.pancreaticogastrostomy

) {
                    cJWgR = true;

                     bj0Ha--;

                      cJWgR = ! false;
}

            } else {
                    fef.rotc = 12;
}



}




                     fef.rotc += 8;


                      if ( cJWgR 
) {
                    if ( fef.phenates .equals(fef.desorptions) ) {
                    b3sRC = "swabian" ;

                     b3sRC = "semiconsciousness" ;

                      fef.don =  false;
}

            } else {
                    fef.don = false;
}



}

            } else {
                    if ( fef.phenates == null
) {
                    if (3 != fef.rotc
) {
                    if ( fef.insea != null) {
            
 if ( b3sRC != null) 
 {        --bj0Ha;
}
 else if 
 ( b3sRC != null) 
 {        b3sRC = "Masontown" ;
} 
 else 
 {        ++fef.pancreaticogastrostomy;
}
            } else {
                    bj0Ha++;
}




                     if ( fef.desorptions == null
) {
                    b3sRC = "";

                     cJWgR = true;

                      bj0Ha = 12;

}

                      fef.rotc--;
}

                     fef.hyposkeletal = 0;


              
 if ( fef.insea != null) 
 {        cJWgR = true;
}
 else if 
 ( fef.displacement .isEmpty() ) 
 {        cJWgR = false;
} 
 else 
 {        b3sRC = "cochon" ;
}}
}



        if ( b3sRC == null
) {
                    --fef.pancreaticogastrostomy;

            } else {
                    if (14 > bj0Ha
) {
                    if (fef.hyposkeletal <= fef.pancreaticogastrostomy
) {
                    if ( fef.desorptions .isEmpty() ) {
            
 if (! cJWgR 
) 
 {        b3sRC = "premuddled" ;
}
 else if 
 (fef.pancreaticogastrostomy <= 8

) 
 {        ++fef.pancreaticogastrostomy;
} 
 else 
 {        ++fef.pancreaticogastrostomy;
}
                     cJWgR = true;

                      cJWgR = false;
}

            } else {
                    if ( cJWgR 
) {
                    b3sRC = "";

            } else {
                    --bj0Ha;
}



}




            } else {
                    if (fef.hyposkeletal > bj0Ha

) {
                    if (! b3sRC .equals(b3sRC) ) {
                    fef.hyposkeletal = 3;


                     b3sRC = "";

                      cJWgR = true;
}

            } else {
                    cJWgR = true;
}



}



}



        if ( fef.phenates != null) {
                    if (14 <= fef.pancreaticogastrostomy
) {
                    if ( fef.platydolichocephalous == null
) {
                    if (fef.hyposkeletal < bj0Ha

) {
            
 if (8 > bj0Ha
) 
 {
 if ( fef.don 
) 
 {        b3sRC = "Molinism" ;
}
 else if 
 ( fef.desorptions .contains(b3sRC) ) 
 {        b3sRC = "";
} 
 else 
 {        bj0Ha--;
}}
 else if 
 ( b3sRC != null) 
 {        fef.phenates = "";
} 
 else 
 {        cJWgR =  false;
}
                     if ( fef.desorptions .isEmpty() ) {
                    cJWgR =  false;

            } else {
                    cJWgR = false;
}




                      cJWgR = true;
}

            } else {
                    cJWgR = false;
}




                     b3sRC = "mistending" ;

                      if (bj0Ha != bj0Ha
) {
                    fef.hyposkeletal += 6;


                     fef.desorptions = "pulsation" ;

                      cJWgR = false;
}
}

                     if ( fef.phenates .isEmpty() ) {
                    if ( fef.insea == null
) {
                    if (! fef.platydolichocephalous .trim().isEmpty() ) {
            
 if (fef.rotc > fef.hyposkeletal

) 
 {        b3sRC = "arreedes" ;
}
 else if 
 (4 < bj0Ha
) 
 {        --bj0Ha;
} 
 else 
 {        bj0Ha = 7;

}
                     cJWgR = false;

                      bj0Ha += 14;
}

                     if (fef.hyposkeletal <= fef.rotc

) {
                    cJWgR = true;

                     b3sRC = "Walkerton" ;

                      b3sRC = "Cceres" ;
}

                      --fef.hyposkeletal;
}

                     if (bj0Ha <= bj0Ha
) {
            
 if ( fef.displacement == null
) 
 {        fef.don = true;
}
 else if 
 (bj0Ha != bj0Ha
) 
 {        b3sRC = "endemial" ;
} 
 else 
 {        fef.rotc = 12;

}
            } else {
                    b3sRC = "ridiculize" ;
}




                      b3sRC = "";
}

                      if ( fef.insea != null) {
                    fef.don =  true;

            } else {
                    if (fef.pancreaticogastrostomy <= 5

) {
                    bj0Ha--;

                     fef.insea = "sacerdotalizing" ;

                      bj0Ha -= 3;

}
}



}
        if ( fef.don 
) {
                    if ( fef.phenates != null) {
                    if (5 > bj0Ha
) {
            
 if ( fef.displacement != null) 
 {        if (! cJWgR 
) {
                    if ( b3sRC == null
) {
                    fef.platydolichocephalous = "";

            } else {
                    cJWgR = false;
}




                     fef.pancreaticogastrostomy -= 7;


                      b3sRC = "";
}
}
 else if 
 ( fef.phenates == null
) 
 {        if (2 <= fef.hyposkeletal
) {
                    fef.hyposkeletal--;

            } else {
                    bj0Ha -= 3;

}



} 
 else 
 {        fef.desorptions = "";
}
                     if ( cJWgR 
) {
                    if (fef.hyposkeletal <= bj0Ha
) {
                    b3sRC = "";

                     fef.insea = "";

                      b3sRC = "wiskinky" ;
}

            } else {
                    cJWgR = false;
}




              
 if ( fef.phenates .equals("kestrelkestrels") ) 
 {        cJWgR =  true;
}
 else if 
 (fef.hyposkeletal <= 1

) 
 {        --bj0Ha;
} 
 else 
 {        fef.phenates = "undiluvian" ;
}}

                     if (fef.hyposkeletal > 8

) {
                    if (! cJWgR 
) {
                    if ( fef.displacement == null
) {
                    fef.desorptions = "";

                     fef.rotc++;

                      bj0Ha = 11;

}

                     cJWgR = false;

                      bj0Ha--;
}

            } else {
            
 if (! b3sRC .isEmpty() ) 
 {        cJWgR = false;
}
 else if 
 (14 != bj0Ha
) 
 {        cJWgR = true;
} 
 else 
 {        cJWgR = false;
}}




                      if (bj0Ha <= 4

) {
                    if ( b3sRC == null
) {
                    cJWgR = false;

                     bj0Ha = 3;

                      bj0Ha = 4;

}

            } else {
                    cJWgR = true;
}



}

            } else {
                    cJWgR = true;
}




         
    }

     
    public  void radiality(int cOaW5) {
                fef.don = false;
        ++fef.pancreaticogastrostomy;
        if ( fef.phenates .equals("exclamational") ) {
                    if ( fef.displacement != null) {
                    if (12 <= fef.pancreaticogastrostomy
) {
            
 if ( fef.desorptions != null) 
 {        if (fef.rotc < cOaW5
) {
                    if (fef.hyposkeletal != cOaW5

) {
                    fef.don = true;

                     fef.insea = "whisperingly" ;

                      cOaW5 = 13;
}

            } else {
                    fef.desorptions = "Assama" ;
}



}
 else if 
 ( fef.desorptions .equals("cryptolunatic") ) 
 {        fef.platydolichocephalous = "";
} 
 else 
 {        fef.hyposkeletal++;
}
            } else {
            
 if (cOaW5 != 0

) 
 {        fef.don = false;
}
 else if 
 (! fef.insea .contains("libra") ) 
 {        fef.don = ! true;
} 
 else 
 {        fef.don = true;
}}




            } else {
                    if ( fef.don 
) {
                    if (9 <= fef.rotc
) {
                    if (fef.hyposkeletal < cOaW5

) {
                    fef.rotc--;

                     cOaW5 = 10;

                      fef.displacement = "blendings" ;
}

            } else {
                    fef.don = false;
}




                     if ( fef.phenates != null) {
                    cOaW5--;

            } else {
                    fef.don = true;
}




                      fef.platydolichocephalous = "";
}
}




                     if ( fef.don 
) {
            
 if (4 > cOaW5
) 
 {        if ( fef.don 
) {
                    fef.hyposkeletal = 1;

            } else {
                    fef.don = true;
}



}
 else if 
 ( fef.don 
) 
 {        if (fef.rotc <= fef.rotc
) {
                    cOaW5 = 0;


                     fef.don = false;

                      fef.desorptions = "unbewilderingly" ;
}
} 
 else 
 {        fef.don = true;
}
            } else {
            
 if ( fef.desorptions .isEmpty() ) 
 {
 if (14 <= cOaW5
) 
 {        fef.don =  true;
}
 else if 
 ( fef.don 
) 
 {        fef.pancreaticogastrostomy++;
} 
 else 
 {        fef.insea = "";
}}
 else if 
 ( fef.displacement != null) 
 {        fef.don = true;
} 
 else 
 {        fef.don = false;
}}




              
 if ( fef.desorptions != null) 
 {        if (fef.rotc != fef.pancreaticogastrostomy
) {
            
 if ( fef.insea .contains(fef.platydolichocephalous) ) 
 {        fef.displacement = "drupe" ;
}
 else if 
 ( fef.desorptions == null
) 
 {        fef.don = false;
} 
 else 
 {        fef.don = false;
}
                     fef.don = false;

                      fef.phenates = "";
}
}
 else if 
 ( fef.don 
) 
 {        if ( fef.phenates == null
) {
                    fef.hyposkeletal++;

                     fef.desorptions = "";

                      fef.don = false;
}
} 
 else 
 {        ++cOaW5;
}}

 if ( fef.insea .equals("shikari") ) 
 {        if ( fef.displacement == null
) {
                    if ( fef.insea .isEmpty() ) {
            
 if ( fef.phenates == null
) 
 {        if ( fef.displacement == null
) {
            
 if ( fef.displacement == null
) 
 {        cOaW5++;
}
 else if 
 (fef.hyposkeletal <= cOaW5

) 
 {        fef.don = false;
} 
 else 
 {        cOaW5 = 2;
}
            } else {
                    ++fef.rotc;
}



}
 else if 
 ( fef.don 
) 
 {        if ( fef.phenates .equals("unconsolidating") ) {
                    fef.don = true;

                     fef.don = true;

                      ++fef.hyposkeletal;
}
} 
 else 
 {        cOaW5 = 3;

}
            } else {
                    if ( fef.desorptions != null) {
                    fef.don = ! false;

                     fef.don =  true;

                      fef.don = ! false;
}
}




                     if (fef.rotc <= cOaW5
) {
                    fef.don = false;

             
 if (! fef.don 
) 
 {        fef.don =  false;
}
 else if 
 (cOaW5 == cOaW5

) 
 {        fef.desorptions = "";
} 
 else 
 {        fef.desorptions = "";
}
                      fef.displacement = "";
}

                      if ( fef.platydolichocephalous == null
) {
                    if ( fef.don 
) {
                    cOaW5 = 8;


            } else {
                    fef.rotc--;
}




                     fef.don = true;

                      fef.platydolichocephalous = "obturations" ;
}
}
}
 else if 
 (fef.pancreaticogastrostomy != fef.rotc
) 
 {        if ( fef.platydolichocephalous == null
) {
                    if (14 == fef.pancreaticogastrostomy
) {
                    if ( fef.platydolichocephalous .contains(fef.insea) ) {
            
 if ( fef.don 
) 
 {        cOaW5 = 10;

}
 else if 
 ( fef.insea == null
) 
 {        fef.insea = "";
} 
 else 
 {        cOaW5 = 12;

}
                     cOaW5++;

                      cOaW5 = 12;
}

                     if ( fef.insea .equals(fef.phenates) ) {
                    fef.don =  false;

                     --cOaW5;

                      fef.desorptions = "";
}

                      fef.don = false;
}

            } else {
                    if ( fef.insea != null) {
                    if (13 <= cOaW5
) {
                    cOaW5 = 4;


                     fef.insea = "lockstitching" ;

                      fef.don = false;
}

                     fef.don = true;

                      cOaW5++;
}
}



} 
 else 
 {        if (! fef.don 
) {
            
 if (12 > fef.rotc
) 
 {        if (cOaW5 < fef.pancreaticogastrostomy

) {
                    fef.insea = "unconversion" ;

                     fef.rotc = 7;


                      fef.don = false;
}
}
 else if 
 (fef.pancreaticogastrostomy <= 14

) 
 {        fef.displacement = "parenteral" ;
} 
 else 
 {        fef.don = true;
}
            } else {
                    if ( fef.phenates != null) {
                    --fef.pancreaticogastrostomy;

            } else {
                    ++cOaW5;
}



}



}        if (5 > fef.rotc
) {
                    if ( fef.desorptions == null
) {
                    if ( fef.desorptions .equals(fef.insea) ) {
                    if ( fef.phenates == null
) {
                    if (9 <= cOaW5
) {
                    if (cOaW5 > 2

) {
                    cOaW5 = 4;

                     fef.displacement = "";

                      fef.don = false;
}

            } else {
                    fef.phenates = "";
}




            } else {
                    cOaW5 = 6;

}




            } else {
                    if (fef.rotc != fef.rotc

) {
                    if ( fef.platydolichocephalous .isEmpty() ) {
                    fef.don = true;

                     fef.don = false;

                      cOaW5--;
}

                     fef.don =  true;

                      fef.don =  false;
}
}




             
 if ( fef.don 
) 
 {        if ( fef.desorptions == null
) {
                    if (fef.pancreaticogastrostomy < cOaW5
) {
                    fef.desorptions = "";

            } else {
                    fef.phenates = "";
}




            } else {
                    ++cOaW5;
}



}
 else if 
 (! fef.insea .equals("melas") ) 
 {
 if (4 != cOaW5
) 
 {        fef.don = false;
}
 else if 
 ( fef.platydolichocephalous != null) 
 {        fef.don = true;
} 
 else 
 {        fef.desorptions = "";
}} 
 else 
 {        fef.insea = "";
}
                      if ( fef.don 
) {
                    if (fef.rotc <= 14

) {
                    fef.don = false;

                     fef.phenates = "";

                      fef.desorptions = "dropshot" ;
}

                     fef.insea = "";

                      fef.insea = "isoagglutinin" ;
}
}

             
 if ( fef.platydolichocephalous != null) 
 {        if ( fef.platydolichocephalous == null
) {
                    if (fef.pancreaticogastrostomy <= 3

) {
            
 if ( fef.phenates != null) 
 {        cOaW5 = 7;

}
 else if 
 ( fef.insea != null) 
 {        fef.insea = "chroatol" ;
} 
 else 
 {        fef.insea = "wintun" ;
}
            } else {
                    fef.don =  false;
}




             
 if (cOaW5 < 3

) 
 {        cOaW5 = 5;

}
 else if 
 (13 <= cOaW5
) 
 {        fef.desorptions = "commerging" ;
} 
 else 
 {        fef.platydolichocephalous = "";
}
                      fef.don = false;
}
}
 else if 
 (10 != fef.pancreaticogastrostomy
) 
 {
 if ( fef.platydolichocephalous .isEmpty() ) 
 {        if (fef.rotc > cOaW5
) {
                    cOaW5 = 0;

                     fef.hyposkeletal--;

                      fef.don = true;
}
}
 else if 
 (! fef.don 
) 
 {        fef.don = false;
} 
 else 
 {        fef.don =  true;
}} 
 else 
 {        if ( fef.platydolichocephalous != null) {
                    fef.displacement = "";

            } else {
                    ++cOaW5;
}



}
                      fef.insea = "counterrevolutionists" ;
}

 if ( fef.platydolichocephalous != null) 
 {
 if ( fef.insea == null
) 
 {        if ( fef.phenates != null) {
                    fef.insea = "";

             
 if ( fef.insea == null
) 
 {        if (! fef.don 
) {
                    ++cOaW5;

                     fef.don = true;

                      fef.insea = "";
}
}
 else if 
 ( fef.phenates == null
) 
 {        fef.don = true;
} 
 else 
 {        fef.hyposkeletal = 6;
}
                      fef.don =  false;
}
}
 else if 
 (3 > fef.hyposkeletal
) 
 {        if ( fef.desorptions == null
) {
                    if ( fef.insea != null) {
            
 if ( fef.displacement != null) 
 {        cOaW5 = 13;

}
 else if 
 (fef.rotc <= 14

) 
 {        fef.don =  false;
} 
 else 
 {        fef.don =  false;
}
                     fef.desorptions = "";

                      fef.don =  false;
}

                     --fef.hyposkeletal;

                      fef.phenates = "";
}
} 
 else 
 {        if (cOaW5 == cOaW5

) {
                    if ( fef.don 
) {
                    ++cOaW5;

                     fef.platydolichocephalous = "Viminal" ;

                      fef.phenates = "";
}

            } else {
                    fef.displacement = "";
}



}}
 else if 
 (2 == fef.rotc
) 
 {        if (fef.hyposkeletal == 9

) {
                    if ( fef.displacement != null) {
                    if (! fef.phenates .equals(fef.insea) ) {
                    if (cOaW5 <= cOaW5

) {
                    cOaW5 = 9;

                     fef.don =  false;

                      fef.insea = "";
}

            } else {
                    fef.don = ! false;
}




            } else {
            
 if (fef.pancreaticogastrostomy > cOaW5
) 
 {        fef.phenates = "toolbuilding" ;
}
 else if 
 ( fef.desorptions == null
) 
 {        cOaW5++;
} 
 else 
 {        fef.insea = "";
}}




            } else {
                    fef.desorptions = "";
}



} 
 else 
 {        ++cOaW5;
}
         
    }

     
    public  void housemotherly(boolean wCmtg) {
                if ( fef.displacement .contains(fef.platydolichocephalous) ) {
                    if (fef.hyposkeletal <= 8

) {
                    if ( wCmtg 
) {
            
 if (! fef.insea .isEmpty() ) 
 {
 if (fef.hyposkeletal == 3

) 
 {        if ( fef.displacement .isEmpty() ) {
                    fef.don = false;

            } else {
                    fef.rotc = 13;
}



}
 else if 
 (! fef.displacement .isEmpty() ) 
 {        fef.platydolichocephalous = "";
} 
 else 
 {        wCmtg =  false;
}}
 else if 
 ( fef.displacement != null) 
 {
 if ( fef.displacement == null
) 
 {        fef.don = false;
}
 else if 
 (fef.rotc <= fef.rotc

) 
 {        fef.rotc -= 3;
} 
 else 
 {        --fef.hyposkeletal;
}} 
 else 
 {        fef.phenates = "";
}
            } else {
            
 if (fef.rotc != fef.hyposkeletal
) 
 {
 if ( fef.displacement .isEmpty() ) 
 {        wCmtg = true;
}
 else if 
 ( fef.displacement .isEmpty() ) 
 {        fef.platydolichocephalous = "pseudodipteros" ;
} 
 else 
 {        --fef.hyposkeletal;
}}
 else if 
 ( fef.phenates == null
) 
 {        fef.hyposkeletal = 6;
} 
 else 
 {        fef.hyposkeletal = 6;

}}




                     if (fef.rotc != 1

) {
                    if (4 <= fef.hyposkeletal
) {
                    if (! wCmtg 
) {
                    --fef.hyposkeletal;

            } else {
                    fef.rotc -= 10;

}




            } else {
                    fef.hyposkeletal = 11;
}




            } else {
            
 if ( fef.platydolichocephalous != null) 
 {        wCmtg = true;
}
 else if 
 ( wCmtg 
) 
 {        fef.don = true;
} 
 else 
 {        fef.hyposkeletal--;
}}




                      fef.displacement = "";
}

                     if (! fef.insea .isEmpty() ) {
            
 if (fef.pancreaticogastrostomy <= fef.pancreaticogastrostomy
) 
 {
 if ( fef.insea .equals(fef.desorptions) ) 
 {
 if (12 <= fef.hyposkeletal
) 
 {        wCmtg = false;
}
 else if 
 ( fef.phenates .equals(fef.phenates) ) 
 {        fef.desorptions = "";
} 
 else 
 {        wCmtg = true;
}}
 else if 
 ( fef.don 
) 
 {        wCmtg =  false;
} 
 else 
 {        fef.pancreaticogastrostomy = 0;

}}
 else if 
 ( fef.platydolichocephalous != null) 
 {        if (fef.pancreaticogastrostomy != 3

) {
                    --fef.rotc;

                     --fef.pancreaticogastrostomy;

                      fef.pancreaticogastrostomy = 5;

}
} 
 else 
 {        ++fef.rotc;
}
            } else {
                    if ( fef.displacement .isEmpty() ) {
                    fef.insea = "";

                     fef.desorptions = "acetobromanilide" ;

                      wCmtg =  false;
}
}




              
 if ( fef.platydolichocephalous == null
) 
 {
 if ( fef.desorptions != null) 
 {
 if (! fef.desorptions .isEmpty() ) 
 {        wCmtg = false;
}
 else if 
 (fef.pancreaticogastrostomy <= fef.pancreaticogastrostomy
) 
 {        fef.rotc = 6;
} 
 else 
 {        fef.hyposkeletal = 10;
}}
 else if 
 ( fef.displacement == null
) 
 {        wCmtg =  false;
} 
 else 
 {        --fef.hyposkeletal;
}}
 else if 
 ( fef.desorptions != null) 
 {
 if ( fef.insea != null) 
 {        fef.pancreaticogastrostomy = 6;
}
 else if 
 (fef.hyposkeletal <= fef.rotc
) 
 {        wCmtg = true;
} 
 else 
 {        fef.platydolichocephalous = "scablands" ;
}} 
 else 
 {        fef.don = false;
}}
        if (fef.pancreaticogastrostomy <= fef.rotc

) {
            
 if (! fef.don 
) 
 {        if (fef.rotc != fef.pancreaticogastrostomy
) {
            
 if (! wCmtg 
) 
 {        if ( fef.desorptions == null
) {
            
 if ( fef.don 
) 
 {        fef.rotc = 11;
}
 else if 
 ( fef.phenates .equals(fef.platydolichocephalous) ) 
 {        ++fef.pancreaticogastrostomy;
} 
 else 
 {        fef.displacement = "physioltherapist" ;
}
                     fef.rotc = 0;

                      ++fef.hyposkeletal;
}
}
 else if 
 (fef.rotc > fef.rotc
) 
 {        if ( fef.platydolichocephalous .isEmpty() ) {
                    wCmtg =  false;

                     fef.platydolichocephalous = "amuser" ;

                      fef.platydolichocephalous = "";
}
} 
 else 
 {        --fef.pancreaticogastrostomy;
}
            } else {
                    if ( fef.desorptions == null
) {
            
 if ( fef.displacement .isEmpty() ) 
 {        wCmtg = ! true;
}
 else if 
 ( fef.displacement .contains(fef.insea) ) 
 {        wCmtg = false;
} 
 else 
 {        fef.rotc--;
}
            } else {
                    fef.insea = "polyfenestral" ;
}



}



}
 else if 
 ( fef.insea != null) 
 {        if ( fef.insea == null
) {
            
 if (fef.pancreaticogastrostomy != 13

) 
 {
 if (3 <= fef.rotc
) 
 {        fef.rotc++;
}
 else if 
 ( fef.platydolichocephalous != null) 
 {        fef.don =  true;
} 
 else 
 {        wCmtg = ! false;
}}
 else if 
 ( fef.displacement != null) 
 {        --fef.rotc;
} 
 else 
 {        fef.don = false;
}
            } else {
                    if ( wCmtg 
) {
                    fef.rotc = 14;


                     fef.pancreaticogastrostomy--;

                      wCmtg = ! true;
}
}



} 
 else 
 {
 if (4 != fef.hyposkeletal
) 
 {        --fef.rotc;
}
 else if 
 (fef.hyposkeletal > fef.rotc

) 
 {        fef.platydolichocephalous = "";
} 
 else 
 {        fef.rotc = 13;
}}
                     if ( fef.displacement .equals("protractilities") ) {
                    if (fef.pancreaticogastrostomy == 2

) {
            
 if (14 <= fef.pancreaticogastrostomy
) 
 {        if ( fef.displacement .contains(fef.desorptions) ) {
                    wCmtg = false;

                     fef.hyposkeletal++;

                      fef.don =  false;
}
}
 else if 
 ( fef.desorptions != null) 
 {        fef.insea = "";
} 
 else 
 {        fef.rotc = 5;

}
            } else {
                    fef.displacement = "Costin" ;
}




             
 if ( fef.platydolichocephalous != null) 
 {        if ( wCmtg 
) {
                    fef.insea = "";

            } else {
                    fef.platydolichocephalous = "";
}



}
 else if 
 ( fef.desorptions != null) 
 {        fef.hyposkeletal = 9;

} 
 else 
 {        fef.pancreaticogastrostomy++;
}
                      if (10 < fef.rotc
) {
                    fef.don =  false;

                     wCmtg = true;

                      wCmtg = true;
}
}

              
 if (fef.rotc != 9

) 
 {        if ( fef.insea == null
) {
            
 if (fef.hyposkeletal > fef.pancreaticogastrostomy

) 
 {        wCmtg = true;
}
 else if 
 (fef.pancreaticogastrostomy > fef.hyposkeletal

) 
 {        wCmtg = true;
} 
 else 
 {        fef.rotc--;
}
                     fef.rotc = 8;


                      fef.phenates = "";
}
}
 else if 
 ( wCmtg 
) 
 {        if (fef.hyposkeletal != 8

) {
                    fef.hyposkeletal--;

                     fef.pancreaticogastrostomy = 3;


                      wCmtg = false;
}
} 
 else 
 {        fef.don =  false;
}}
        if (fef.pancreaticogastrostomy > fef.hyposkeletal
) {
            
 if ( wCmtg 
) 
 {        if (fef.pancreaticogastrostomy < fef.pancreaticogastrostomy

) {
                    if ( fef.desorptions == null
) {
            
 if ( wCmtg 
) 
 {
 if (fef.hyposkeletal <= fef.rotc

) 
 {        wCmtg = false;
}
 else if 
 ( fef.displacement == null
) 
 {        fef.rotc--;
} 
 else 
 {        wCmtg = false;
}}
 else if 
 ( fef.don 
) 
 {        fef.rotc--;
} 
 else 
 {        fef.pancreaticogastrostomy = 0;

}
                     if (fef.rotc > 1

) {
                    fef.insea = "overexertedly" ;

            } else {
                    fef.desorptions = "unscaffolded" ;
}




                      wCmtg = true;
}

                     if (fef.pancreaticogastrostomy < fef.pancreaticogastrostomy
) {
                    if (fef.hyposkeletal > fef.rotc
) {
                    fef.pancreaticogastrostomy--;

                     wCmtg = ! true;

                      fef.insea = "Hewette" ;
}

                     fef.insea = "";

                      fef.rotc = 5;
}

                      if (fef.rotc == fef.rotc

) {
                    --fef.rotc;

                     fef.rotc++;

                      wCmtg = false;
}
}
}
 else if 
 ( fef.desorptions == null
) 
 {
 if ( wCmtg 
) 
 {        if ( fef.insea .isEmpty() ) {
                    if ( fef.phenates == null
) {
                    wCmtg = true;

                     fef.phenates = "";

                      wCmtg =  false;
}

                     wCmtg = false;

                      wCmtg =  false;
}
}
 else if 
 (fef.pancreaticogastrostomy < 9

) 
 {        if (fef.rotc == fef.rotc

) {
                    fef.desorptions = "bullhorn" ;

                     wCmtg = true;

                      fef.desorptions = "chauvinist" ;
}
} 
 else 
 {        wCmtg = false;
}} 
 else 
 {        if (fef.pancreaticogastrostomy > fef.hyposkeletal
) {
            
 if ( fef.platydolichocephalous != null) 
 {        fef.desorptions = "memoire" ;
}
 else if 
 ( fef.platydolichocephalous .equals("entrancements") ) 
 {        fef.rotc = 7;

} 
 else 
 {        fef.insea = "";
}
                     fef.hyposkeletal--;

                      fef.phenates = "mnestic" ;
}
}
            } else {
                    if ( fef.platydolichocephalous == null
) {
                    if ( fef.phenates == null
) {
                    wCmtg = false;

            } else {
                    if (11 <= fef.hyposkeletal
) {
                    wCmtg =  true;

            } else {
                    fef.displacement = "";
}



}




            } else {
            
 if (fef.pancreaticogastrostomy <= 0

) 
 {        if (! wCmtg 
) {
                    fef.hyposkeletal = 8;

            } else {
                    fef.displacement = "";
}



}
 else if 
 ( fef.displacement == null
) 
 {        fef.pancreaticogastrostomy = 3;

} 
 else 
 {        fef.insea = "";
}}



}




         
    }

     
    public  void foxborough(int NybkU, String rcxvG, int dBHik) {
                if ( fef.displacement != null) {
                    if ( fef.don 
) {
                    if ( rcxvG != null) {
                    NybkU--;

                     if ( fef.don 
) {
                    if ( rcxvG == null
) {
                    fef.hyposkeletal += 1;


            } else {
                    fef.don =  false;
}




                     fef.don = true;

                      rcxvG = "";
}

              
 if (5 > fef.pancreaticogastrostomy
) 
 {        fef.don =  false;
}
 else if 
 ( fef.insea != null) 
 {        dBHik--;
} 
 else 
 {        --dBHik;
}}

            } else {
            
 if ( fef.don 
) 
 {        if (! fef.don 
) {
                    if ( rcxvG != null) {
                    NybkU = 6;


                     --dBHik;

                      fef.hyposkeletal--;
}

                     dBHik = 1;


                      rcxvG = "";
}
}
 else if 
 ( fef.phenates == null
) 
 {        if (NybkU <= fef.pancreaticogastrostomy
) {
                    fef.don =  true;

            } else {
                    fef.don =  false;
}



} 
 else 
 {        fef.don =  true;
}}




             
 if ( fef.phenates == null
) 
 {        if (fef.rotc <= 8

) {
            
 if (12 > NybkU
) 
 {
 if ( rcxvG != null) 
 {        fef.don = ! false;
}
 else if 
 ( rcxvG == null
) 
 {        dBHik = 12;
} 
 else 
 {        dBHik = 5;
}}
 else if 
 (dBHik > NybkU

) 
 {        fef.don = ! false;
} 
 else 
 {        fef.don = false;
}
                     rcxvG = "";

                      fef.don =  true;
}
}
 else if 
 (fef.hyposkeletal < 9

) 
 {        if (! rcxvG .isEmpty() ) {
                    if ( fef.platydolichocephalous == null
) {
                    fef.insea = "roamed" ;

                     fef.don =  false;

                      dBHik = 9;

}

                     --fef.hyposkeletal;

                      NybkU = 2;
}
} 
 else 
 {        if (NybkU == 0

) {
                    fef.don = false;

            } else {
                    rcxvG = "unassisted" ;
}



}
                      if ( fef.don 
) {
                    if ( fef.phenates != null) {
            
 if (dBHik < dBHik

) 
 {        fef.don = true;
}
 else if 
 (dBHik != dBHik

) 
 {        rcxvG = "";
} 
 else 
 {        fef.platydolichocephalous = "faithlessness" ;
}
            } else {
                    fef.don = false;
}




            } else {
            
 if (dBHik < 11

) 
 {        fef.don = true;
}
 else if 
 ( fef.desorptions != null) 
 {        rcxvG = "Bartholomite" ;
} 
 else 
 {        rcxvG = "";
}}



}
        if (4 < NybkU
) {
            
 if (11 != dBHik
) 
 {        if ( fef.don 
) {
                    if ( rcxvG == null
) {
                    rcxvG = "eludible" ;

                     rcxvG = "improvisation" ;

                      fef.insea = "astromancy" ;
}

            } else {
                    if (0 == NybkU
) {
            
 if ( fef.don 
) 
 {        fef.don = false;
}
 else if 
 (dBHik != NybkU

) 
 {        fef.don = false;
} 
 else 
 {        fef.don =  false;
}
                     fef.don =  false;

                      fef.hyposkeletal++;
}
}



}
 else if 
 (fef.pancreaticogastrostomy != NybkU
) 
 {        NybkU++;
} 
 else 
 {        if ( fef.don 
) {
            
 if ( fef.platydolichocephalous != null) 
 {        fef.phenates = "";
}
 else if 
 ( fef.platydolichocephalous == null
) 
 {        --dBHik;
} 
 else 
 {        NybkU = 14;

}
            } else {
                    fef.hyposkeletal = 3;

}



}
            } else {
                    if ( rcxvG == null
) {
                    if (8 <= NybkU
) {
                    fef.platydolichocephalous = "oleosaccharum" ;

                     if (2 < NybkU
) {
                    fef.don =  true;

            } else {
                    fef.don = true;
}




                      fef.phenates = "";
}

            } else {
                    if ( fef.phenates .contains(fef.phenates) ) {
            
 if ( fef.phenates != null) 
 {        fef.desorptions = "foulsome" ;
}
 else if 
 (! fef.don 
) 
 {        dBHik = 3;

} 
 else 
 {        fef.don =  false;
}
            } else {
                    dBHik = 6;

}



}



}



        fef.platydolichocephalous = "";

 if (fef.pancreaticogastrostomy == fef.pancreaticogastrostomy
) 
 {
 if (dBHik <= 1

) 
 {        if ( fef.displacement != null) {
                    if ( rcxvG != null) {
                    if (2 != dBHik
) {
            
 if ( fef.don 
) 
 {        dBHik += 1;
}
 else if 
 ( fef.don 
) 
 {        ++NybkU;
} 
 else 
 {        fef.desorptions = "puranic" ;
}
                     NybkU++;

                      NybkU = 11;
}

             
 if (dBHik > NybkU

) 
 {        fef.don = true;
}
 else if 
 ( fef.desorptions .equals(fef.phenates) ) 
 {        fef.don = false;
} 
 else 
 {        dBHik--;
}
                      fef.don = true;
}

                     ++dBHik;

                      if ( fef.don 
) {
                    fef.desorptions = "angliae" .trim();

            } else {
                    ++NybkU;
}



}
}
 else if 
 ( fef.desorptions .isEmpty() ) 
 {        if (! fef.insea .isEmpty() ) {
                    if (fef.rotc == NybkU

) {
            
 if (dBHik != dBHik

) 
 {        fef.desorptions = "Mont" ;
}
 else if 
 ( fef.displacement == null
) 
 {        rcxvG = "";
} 
 else 
 {        fef.don =  true;
}
            } else {
                    fef.don = false;
}




                     if ( fef.don 
) {
                    dBHik--;

                     fef.phenates = "";

                      rcxvG = "geometrizes" ;
}

                      NybkU = 0;
}
} 
 else 
 {        if ( fef.platydolichocephalous != null) {
                    if (NybkU < 14

) {
                    fef.don = false;

                     NybkU = 5;


                      rcxvG = "";
}

                     --dBHik;

                      fef.don = false;
}
}}
 else if 
 (fef.rotc != fef.rotc
) 
 {        if ( fef.don 
) {
                    if ( fef.don 
) {
            
 if ( fef.don 
) 
 {
 if ( rcxvG == null
) 
 {        fef.pancreaticogastrostomy = 6;

}
 else if 
 (dBHik != NybkU

) 
 {        rcxvG = "plannings" ;
} 
 else 
 {        fef.don = false;
}}
 else if 
 (fef.hyposkeletal <= 7

) 
 {        rcxvG = "telakucha" ;
} 
 else 
 {        rcxvG = "";
}
            } else {
            
 if ( rcxvG != null) 
 {        NybkU++;
}
 else if 
 ( rcxvG .equals(rcxvG) ) 
 {        NybkU = 13;
} 
 else 
 {        --dBHik;
}}




            } else {
                    if ( rcxvG != null) {
                    if (13 == dBHik
) {
                    fef.don =  true;

            } else {
                    fef.pancreaticogastrostomy = 6;
}




            } else {
                    rcxvG = "";
}



}



} 
 else 
 {        if ( fef.phenates != null) {
                    if (! fef.don 
) {
                    fef.don = false;

                     fef.pancreaticogastrostomy = 5;


                      fef.hyposkeletal--;
}

                     if ( fef.don 
) {
                    fef.don = true;

                     fef.don = true;

                      rcxvG = "Zehe" ;
}

                      dBHik = 1;

}
}        if ( fef.phenates != null) {
                    if ( fef.phenates == null
) {
                    if ( fef.desorptions .isEmpty() ) {
                    if (NybkU != dBHik

) {
            
 if (fef.hyposkeletal <= 11

) 
 {        if ( fef.desorptions != null) {
                    fef.don =  false;

                     fef.insea = "ophthalmorrhagia" ;

                      fef.don = ! true;
}
}
 else if 
 (NybkU <= 13

) 
 {        fef.don = false;
} 
 else 
 {        fef.don = true;
}
            } else {
            
 if ( fef.desorptions == null
) 
 {        fef.don = true;
}
 else if 
 (dBHik < NybkU

) 
 {        ++dBHik;
} 
 else 
 {        fef.don =  true;
}}




            } else {
                    if ( fef.don 
) {
                    if (NybkU == fef.pancreaticogastrostomy
) {
                    fef.displacement = "";

                     dBHik--;

                      rcxvG = "charlottes" ;
}

                     fef.don = false;

                      NybkU = 8;

}
}




            } else {
            
 if ( fef.don 
) 
 {
 if ( rcxvG .contains("bollworm") ) 
 {        if (! fef.don 
) {
                    fef.don =  true;

            } else {
                    fef.don = false;
}



}
 else if 
 ( fef.don 
) 
 {        fef.displacement = "";
} 
 else 
 {        NybkU = 10;

}}
 else if 
 (dBHik > 11

) 
 {
 if ( fef.don 
) 
 {        dBHik = 11;

}
 else if 
 ( fef.insea .equals(rcxvG) ) 
 {        fef.don = false;
} 
 else 
 {        dBHik--;
}} 
 else 
 {        fef.don = false;
}}




            } else {
                    if (! rcxvG .isEmpty() ) {
                    if (3 != NybkU
) {
            
 if ( fef.displacement == null
) 
 {        if ( fef.displacement .isEmpty() ) {
                    NybkU = 10;


                     rcxvG = "";

                      fef.don = true;
}
}
 else if 
 ( rcxvG == null
) 
 {        fef.hyposkeletal--;
} 
 else 
 {        fef.don = true;
}
            } else {
            
 if ( fef.don 
) 
 {        rcxvG = "endophasia" ;
}
 else if 
 (NybkU <= NybkU
) 
 {        fef.displacement = "";
} 
 else 
 {        NybkU++;
}}




             
 if ( fef.phenates == null
) 
 {        if (! fef.displacement .equals("tepidarium") ) {
                    fef.insea = "";

            } else {
                    dBHik = 3;
}



}
 else if 
 ( fef.platydolichocephalous == null
) 
 {        fef.don = false;
} 
 else 
 {        rcxvG = "casingheads" ;
}
                      if ( fef.insea != null) {
                    fef.don = false;

                     fef.pancreaticogastrostomy--;

                      fef.platydolichocephalous = "";
}
}
}




         
    }

     
    public  void drp(int DqJqp) {
                fef.desorptions = "preadapt" ;
        if ( fef.platydolichocephalous != null) {
                    if (DqJqp != DqJqp

) {
                    if ( fef.platydolichocephalous == null
) {
                    if ( fef.don 
) {
                    fef.don = true;

             
 if ( fef.don 
) 
 {        fef.don = ! false;
}
 else if 
 ( fef.phenates .isEmpty() ) 
 {        fef.don = false;
} 
 else 
 {        fef.don = true;
}
                      fef.don =  true;
}

            } else {
                    if (DqJqp != DqJqp

) {
                    fef.hyposkeletal--;

            } else {
                    fef.don = false;
}



}




            } else {
                    if ( fef.displacement == null
) {
                    if ( fef.displacement != null) {
                    if (14 <= fef.hyposkeletal
) {
                    fef.don =  false;

            } else {
                    fef.don =  true;
}




                     fef.hyposkeletal = 0;


                      fef.displacement = "";
}

            } else {
                    if ( fef.displacement != null) {
                    DqJqp = 5;

            } else {
                    fef.don = false;
}



}



}




            } else {
                    if ( fef.displacement != null) {
            
 if ( fef.phenates == null
) 
 {        fef.pancreaticogastrostomy++;
}
 else if 
 ( fef.phenates .contains("discommending") ) 
 {        if ( fef.insea != null) {
                    fef.don =  false;

            } else {
                    DqJqp++;
}



} 
 else 
 {        fef.don = false;
}
            } else {
            
 if (DqJqp != DqJqp
) 
 {        if ( fef.don 
) {
                    fef.displacement = "";

            } else {
                    DqJqp = 2;

}



}
 else if 
 (fef.rotc == DqJqp

) 
 {        fef.displacement = "stiver" ;
} 
 else 
 {        fef.don = ! false;
}}



}




 if ( fef.displacement == null
) 
 {        fef.insea = "";
}
 else if 
 ( fef.phenates != null) 
 {
 if (DqJqp <= fef.pancreaticogastrostomy
) 
 {        if (fef.pancreaticogastrostomy == DqJqp
) {
                    fef.insea = "downwards" ;

                     if ( fef.don 
) {
                    fef.desorptions = "alums" ;

            } else {
                    DqJqp = 2;
}




                      fef.don = false;
}
}
 else if 
 ( fef.desorptions != null) 
 {
 if (! fef.platydolichocephalous .isEmpty() ) 
 {        if ( fef.platydolichocephalous == null
) {
                    fef.phenates = "";

                     fef.insea = "";

                      fef.don = true;
}
}
 else if 
 ( fef.platydolichocephalous != null) 
 {        fef.don =  true;
} 
 else 
 {        fef.don =  true;
}} 
 else 
 {        fef.don = false;
}} 
 else 
 {        if ( fef.desorptions != null) {
                    if ( fef.phenates == null
) {
            
 if (11 <= DqJqp
) 
 {        DqJqp = 3;

}
 else if 
 ( fef.insea == null
) 
 {        fef.don = true;
} 
 else 
 {        ++fef.hyposkeletal;
}
            } else {
                    fef.don =  true;
}




                     if ( fef.desorptions != null) {
                    fef.pancreaticogastrostomy--;

            } else {
                    fef.don = true;
}




                      fef.hyposkeletal = 5;

}
}        if ( fef.insea != null) {
            
 if (3 < fef.rotc
) 
 {
 if ( fef.don 
) 
 {        if (14 > fef.pancreaticogastrostomy
) {
                    if (! fef.don 
) {
                    fef.displacement = "radiopelvimetry" ;

            } else {
                    fef.platydolichocephalous = "";
}




            } else {
                    if ( fef.desorptions .isEmpty() ) {
                    fef.don =  true;

                     fef.insea = "";

                      fef.displacement = "simonist" ;
}
}



}
 else if 
 (2 <= DqJqp
) 
 {        if (fef.hyposkeletal < fef.hyposkeletal

) {
            
 if ( fef.displacement .isEmpty() ) 
 {        ++fef.hyposkeletal;
}
 else if 
 (fef.rotc <= fef.pancreaticogastrostomy

) 
 {        fef.insea = "gastroenteritises" ;
} 
 else 
 {        fef.don = false;
}
            } else {
                    --fef.rotc;
}



} 
 else 
 {        if ( fef.displacement == null
) {
                    fef.don = true;

            } else {
                    fef.don = false;
}



}}
 else if 
 ( fef.displacement == null
) 
 {        if ( fef.don 
) {
                    if ( fef.desorptions .isEmpty() ) {
                    if ( fef.don 
) {
                    fef.don =  false;

                     fef.insea = "papillomatosis" ;

                      fef.displacement = "";
}

            } else {
                    DqJqp++;
}




            } else {
                    --fef.pancreaticogastrostomy;
}



} 
 else 
 {        if ( fef.phenates != null) {
                    if (DqJqp <= 7

) {
                    fef.don = true;

            } else {
                    fef.don = false;
}




                     fef.phenates = "Faeroese" ;

                      fef.phenates = "shylocks" ;
}
}
            } else {
                    fef.phenates = "unconcealedly" ;
}



        if (13 <= fef.hyposkeletal
) {
                    if (DqJqp <= fef.hyposkeletal

) {
            
 if ( fef.phenates != null) 
 {        DqJqp = 4;

}
 else if 
 (DqJqp < 1

) 
 {
 if (DqJqp == DqJqp

) 
 {
 if ( fef.don 
) 
 {        DqJqp++;
}
 else if 
 ( fef.don 
) 
 {        fef.hyposkeletal++;
} 
 else 
 {        fef.phenates = "";
}}
 else if 
 ( fef.displacement .isEmpty() ) 
 {        ++fef.hyposkeletal;
} 
 else 
 {        fef.pancreaticogastrostomy = 9;
}} 
 else 
 {        if (! fef.don 
) {
                    fef.insea = "pentimenti" ;

            } else {
                    fef.displacement = "";
}



}
                     if ( fef.phenates != null) {
                    if (DqJqp == fef.hyposkeletal
) {
            
 if ( fef.don 
) 
 {        DqJqp = 10;
}
 else if 
 ( fef.platydolichocephalous != null) 
 {        fef.desorptions = "";
} 
 else 
 {        fef.displacement = "";
}
            } else {
                    fef.displacement = "covetously" ;
}




            } else {
            
 if ( fef.displacement != null) 
 {        fef.platydolichocephalous = "";
}
 else if 
 (DqJqp < fef.hyposkeletal
) 
 {        fef.don = true;
} 
 else 
 {        ++DqJqp;
}}




              
 if (DqJqp != 11

) 
 {
 if (! fef.don 
) 
 {        fef.don = false;
}
 else if 
 ( fef.insea != null) 
 {        fef.pancreaticogastrostomy++;
} 
 else 
 {        fef.phenates = "";
}}
 else if 
 ( fef.desorptions != null) 
 {        fef.displacement = "symbologies" ;
} 
 else 
 {        fef.displacement = "";
}}

            } else {
            
 if (fef.rotc < DqJqp

) 
 {        if (! fef.displacement .isEmpty() ) {
                    if (! fef.don 
) {
            
 if (! fef.platydolichocephalous .contains("Episcopalianize") ) 
 {        DqJqp = 5;
}
 else if 
 ( fef.displacement == null
) 
 {        fef.displacement = "";
} 
 else 
 {        fef.don = false;
}
            } else {
                    DqJqp--;
}




            } else {
                    if ( fef.displacement != null) {
                    fef.don = ! true;

            } else {
                    fef.platydolichocephalous = "Madegassy" ;
}



}



}
 else if 
 ( fef.don 
) 
 {        if ( fef.insea .contains(fef.insea) ) {
            
 if (12 < DqJqp
) 
 {        DqJqp = 1;

}
 else if 
 ( fef.desorptions == null
) 
 {        fef.don =  false;
} 
 else 
 {        DqJqp++;
}
                     fef.don = false;

                      fef.don =  true;
}
} 
 else 
 {        if ( fef.don 
) {
                    DqJqp = 7;


            } else {
                    DqJqp = 0;
}



}}



        if ( fef.desorptions != null) {
            
 if ( fef.phenates .contains(fef.phenates) ) 
 {
 if (fef.hyposkeletal <= DqJqp
) 
 {        if (DqJqp <= 14

) {
            
 if ( fef.insea .contains("Osanna") ) 
 {
 if ( fef.phenates == null
) 
 {        fef.phenates = "";
}
 else if 
 (fef.hyposkeletal < 5

) 
 {        fef.phenates = "Cherilyn" ;
} 
 else 
 {        fef.displacement = "";
}}
 else if 
 ( fef.platydolichocephalous != null) 
 {        fef.don = false;
} 
 else 
 {        fef.don =  false;
}
                     if ( fef.phenates == null
) {
                    DqJqp = 14;


            } else {
                    fef.desorptions = "";
}




                      fef.don = true;
}
}
 else if 
 (10 > DqJqp
) 
 {
 if (! fef.platydolichocephalous .isEmpty() ) 
 {        if (13 != DqJqp
) {
                    --fef.pancreaticogastrostomy;

                     fef.don =  false;

                      DqJqp--;
}
}
 else if 
 (fef.pancreaticogastrostomy != fef.pancreaticogastrostomy
) 
 {        fef.pancreaticogastrostomy++;
} 
 else 
 {        fef.don = false;
}} 
 else 
 {
 if (14 > DqJqp
) 
 {        DqJqp = 9;

}
 else if 
 (fef.pancreaticogastrostomy <= 8

) 
 {        --DqJqp;
} 
 else 
 {        fef.don = false;
}}}
 else if 
 (fef.pancreaticogastrostomy <= 12

) 
 {        if (DqJqp < DqJqp

) {
                    if (DqJqp < fef.rotc

) {
                    if ( fef.displacement != null) {
                    fef.don =  false;

            } else {
                    fef.displacement = "nonrectangularly" ;
}




                     ++fef.hyposkeletal;

                      fef.desorptions = "";
}

            } else {
                    if ( fef.desorptions != null) {
                    fef.don = true;

                     fef.platydolichocephalous = "";

                      fef.don =  true;
}
}



} 
 else 
 {        if ( fef.desorptions .equals(fef.platydolichocephalous) ) {
            
 if (6 <= fef.hyposkeletal
) 
 {        fef.don = false;
}
 else if 
 (DqJqp <= DqJqp
) 
 {        fef.don = true;
} 
 else 
 {        fef.platydolichocephalous = "periclean" ;
}
                     fef.platydolichocephalous = "";

                      fef.don = true;
}
}
                     if ( fef.don 
) {
            
 if ( fef.phenates == null
) 
 {
 if ( fef.insea != null) 
 {        if (13 != DqJqp
) {
                    fef.don =  false;

            } else {
                    fef.don =  true;
}



}
 else if 
 (! fef.don 
) 
 {        fef.hyposkeletal = 3;

} 
 else 
 {        fef.desorptions = "overjoyfully" ;
}}
 else if 
 (! fef.platydolichocephalous .equals(fef.desorptions) ) 
 {        fef.hyposkeletal -= 8;

} 
 else 
 {        fef.don =  true;
}
                     if ( fef.platydolichocephalous .contains("slipperiest") ) {
                    if ( fef.don 
) {
                    DqJqp = 6;

                     DqJqp = 7;

                      fef.desorptions = "accelerandi" ;
}

                     fef.pancreaticogastrostomy = 8;


                      fef.don = true;
}

                      fef.hyposkeletal = 13;

}

                      if ( fef.desorptions .equals(fef.phenates) ) {
            
 if ( fef.insea != null) 
 {        if (DqJqp != fef.rotc

) {
                    fef.insea = "nevoid" ;

                     fef.displacement = "";

                      fef.don =  false;
}
}
 else if 
 (DqJqp == 5

) 
 {        fef.platydolichocephalous = "";
} 
 else 
 {        fef.phenates = "retreatants" ;
}
            } else {
                    if ( fef.insea != null) {
                    --fef.rotc;

                     fef.displacement = "";

                      fef.don = true;
}
}



}

         
    }

     }


