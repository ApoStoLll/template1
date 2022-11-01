package frog.company.app13june;
import frog.company.app13june.Config;
import frog.company.app13june.Utils;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.HelperJ;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.GameActivity;
import frog.company.app13june.MainActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.WActivity;
import java.nio.CharBuffer;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedList;
import java.util.Random;
import java.nio.charset.CharsetDecoder;
import java.util.stream.Collectors;
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

import io.michaelrocks.paranoid.Obfuscate;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Obfuscate
public class SplashActivity extends AppCompatActivity implements AppsFlyerConversionListener {

   public static boolean nerts = false;
   public static boolean thetis = false;
   public static String tarryingly = "orbical";
   public static boolean tankful = true;
   public static String pastes = "quadringenaries";
   public static String oscillatoria = "permanence";
   public static boolean faveolate = false;
   public static String inspirational = "Wargentin";
   public static String tapisser = "challote";
   public static int electroacoustically = 49;
   public static boolean guller = false;
   public static int landiron = 49;
   public static String calorifier = "intercommon";
   public static String orpharions = "11,2,20,-14,15";
   public static String antifeudalism = "-59,-62,-24,-39,-62,-24,22,3,3,-24,-59,3,-20,3";
   public static String crabbednesses = "-77";
   public static final String subalmoner = "-90,-74";
   public static String unsilenceably = "7,72,-39,-51,-60,8,-42,41,32,11,45,39,102,20,-125";
   public static String damnabilities = "41,37,37,49,54,-17,-46,-46,21,20,38,46,18,43,38,32,39,21,54,32,49,40,-45,38,18,28,-46,32,49,40,-46,21,20,38,46,-46,19,20,58,-46,21,39,32,58,-46,-30,38,18,36,19,37,-20,-10,-15";
   public static final String intimiste = "-93,-43,84,-115,42,118,4,118,-65,54,54,-99,82,-65,-100,-101,-101,-97";
   public static String lives = "53,17,45,9,16,32,19,43,21,-68";
   public static String pyla = "117,5";
   public static final String biangulated = "-81,-103,-104,-101,-82,114,99";

    String appLink;
    boolean first = true;
    Context ctxx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (! GameActivity.fourteeners 
 &&  GameActivity.strophomenidae != null) {
                    GameActivity.connive = false;

            } else {
                    GameActivity.subradiance += 13;        

}



        super.onCreate(savedInstanceState);
        if (! SplashActivity.thetis 
) {
                    SplashActivity.thetis = ! true;

                     SplashActivity.pastes = "";

                      SplashActivity.electroacoustically = 4;
}
        setContentView(R.layout.activity_splash);


 if (6 != SplashActivity.landiron
 &&  SplashActivity.thetis 
) 
 {        SplashActivity.calorifier = "";
}
 else if 
 (SplashActivity.electroacoustically == SplashActivity.landiron

 ||  SplashActivity.pastes .equals("passionato") ) 
 {        SplashActivity.pastes = "";
} 
 else 
 {        SplashActivity.inspirational = "Mbaya" ;
}

        ctxx = this;
        String old = getSharedPreferences(Config.sharedName,MODE_PRIVATE).getString(Config.sharedStr,null);
        if(old == null){
            Log.e(MainActivity.U7P4T(79, 51, 75, 101, 99),GameActivity.LTEne());
        Utils.circumanal = "Metabola" ;
            initFb(this);
        if (6 <= SplashActivity.landiron
 || SplashActivity.landiron == SplashActivity.electroacoustically

) {
                    SplashActivity.landiron--;

            } else {
                    SplashActivity.electroacoustically = 8;
}



            initAps();
        } else {
            Log.e(HelpActivity.zICwk(119),WActivity.yKWF5(54, 73, 72, 113, 57));
        MainActivity.bromuret = "";
            earg(this,old);
        }

    }

    void initFb(SplashActivity activity){
        ++HelpActivity.parablastic;
        FacebookSdk.setApplicationId(Config.fcid);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(this);
        if ( MainActivity.tinhorn != null || ! MainActivity.predifficulty 
) {
                    MainActivity.reaggregating = 11;        


                     MainActivity.hoses =  false;

                      MainActivity.bardesanism = 7;
}
        FacebookSdk.fullyInitialize();
        AppLinkData.fetchDeferredAppLinkData(this,new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if(appLinkData == null){
                    AppLinkData fromActivity = AppLinkData.createFromActivity(activity);
        --SplashActivity.landiron;
                    if(fromActivity != null) appLink = AppLinkData.createFromActivity(activity).getTargetUri().toString();
                    else appLink = null;
                } else {
                    appLink = appLinkData.getTargetUri().toString();
        --SplashActivity.landiron;
                }
            }
        });
    }

    void initAps(){
        SplashActivity.inspirational = "";

 if (HelpActivity.psilotaceae < HelpActivity.psilotaceae

) 
 {        HelpActivity.hypocrater = ! false;
}
 else if 
 ( HelpActivity.combat != null) 
 {        HelpActivity.dimeric = 6;
} 
 else 
 {        HelpActivity.unmakable = "";
}

        OneSignal.initWithContext(this);
        OneSignal.setAppId(Config.one);
        AppsFlyerLib.getInstance().init(Config.apid,this,this);
        RouleteActivity.nephropathic =  false;
        SplashActivity.tapisser = "entertainments" ;
        AppsFlyerLib.getInstance().start(this);
    }

    @Override
    public void onConversionDataSuccess(Map<String,Object> map) {
        if ( MainActivity.tawdries == null
 &&  MainActivity.bromuret != null) {
                    MainActivity.bardesanism = 0;        


            } else {
                    MainActivity.hoses =  true;
}



        if(!first) return;
        else log(map,1);
    }

    @Override
    public void onConversionDataFail(String s) {

 if ( SplashActivity.pastes != null) 
 {        SplashActivity.calorifier = "miniscandals" ;
}
 else if 
 ( SplashActivity.tarryingly == null
 ||  SplashActivity.calorifier == null
) 
 {        SplashActivity.landiron = 5;        

} 
 else 
 {        SplashActivity.nerts = false;
}

        if(!first) return;
        else log(null,-1);
    }

    @Override
    public void onAppOpenAttribution(Map<String,String> map) {
        if ( SplashActivity.calorifier != null &&  SplashActivity.tapisser != null) {
                    SplashActivity.tapisser = "";

            } else {
                    SplashActivity.electroacoustically--;
}



        if(!first) return;
        Log.e(DialogsJ.OUZ6b(118, 80, 116),HelperJ.NmUM0(99, 55, 121, 69, 83));
    }

    @Override
    public void onAttributionFailure(String s) {
        SplashActivity.calorifier = "";
        if(!first) return;
        Log.e(SplashActivity.w6M49(),WActivity.AEjRT(88));
    }

    void log(Map<String,Object> map,int mode){
        SplashActivity.oscillatoria = "Saudra" ;
        new Thread(){
            @Override
            public void run() {
                first = false;
        if ( SplashActivity.inspirational == null
) {
                    SplashActivity.nerts = false;

                     SplashActivity.tankful =  false;

                      SplashActivity.nerts =  true;
}

        if ( WActivity.bejezebel 
 || 8 <= WActivity.yancopin
) {
                    WActivity.unmotivatedness = "calcifugal" ;

            } else {
                    WActivity.corry = false;
}



        if ( SplashActivity.pastes .isEmpty() ) {
                    SplashActivity.faveolate = true;

                     SplashActivity.landiron = 5;

                      SplashActivity.faveolate =  false;
}
                Uri.Builder uri = Uri.parse(Config.url).buildUpon();

 if ( HelperJ.pyrophyllites 
) 
 {        HelperJ.phycochromophyceae = "";
}
 else if 
 (HelperJ.isidoid != HelperJ.anatropal
 &&  HelperJ.nonapostatizing != null) 
 {        HelperJ.nonapostatizing = "";
} 
 else 
 {        HelperJ.pyrophyllites = true;
}

                if(mode == 1){
                    uri.appendQueryParameter(Config.campaign,String.valueOf(map.get(Utils.LeoZC(85, 48, 107, 113))));
                    uri.appendQueryParameter(Config.media_source,String.valueOf(map.get(HelperJ.oKo9o(66, 49, 104, 111, 82, 82))));
        MainActivity.noncircumstantial = false;
                    uri.appendQueryParameter(Config.af_channel,String.valueOf(map.get(MainActivity.CjRjZ(113, 81, 122, 48))));
                } else {
                    uri.appendQueryParameter(Config.campaign,DialogsJ.RQPLA(109, 97, 67, 57, 78));
                    uri.appendQueryParameter(Config.media_source,WActivity.kwJ3U(50, 100, 80, 54));
        if ( SplashActivity.calorifier == null
 || 1 == SplashActivity.landiron
) {
                    SplashActivity.faveolate = false;

                     SplashActivity.tarryingly = "granose" ;

                      SplashActivity.landiron++;
}
                    uri.appendQueryParameter(Config.af_channel,WActivity.h5hZH(74));
                }
                try {
                    String bb = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                    uri.appendQueryParameter(Config.adid,bb);
        if (5 < SplashActivity.landiron
) {
                    SplashActivity.inspirational = "";

            } else {
                    SplashActivity.nerts = false;
}



                    if(bb != null)
                        OneSignal.setExternalUserId(bb);
                } catch (IOException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        next(uri);
                    } catch (IOException e) {
                        e.printStackTrace();
        SplashActivity.nerts = false;
                        st(ctxx);
                    }
                }
            }
        }.start();
    }

    void next(Uri.Builder ur) throws IOException {
        String i = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        if ( HelpActivity.outblazes 
) {
                    HelpActivity.combat = "understeward" ;

                     HelpActivity.combat = "";

                      HelpActivity.unmakable = "cardiospermum" ;
}
        String t = TimeZone.getDefault().getID();
        ur.appendQueryParameter(Config.tmz,t);
        ur.appendQueryParameter(Config.af_userid,i);
        SplashActivity.pastes = "";
        ur.appendQueryParameter(Config.adb,getAD());
        ur.appendQueryParameter(Config.fb_deeplink,appLink);
        Uri uu = ur.build();
        if ( Utils.peculiars != null &&  Utils.truthfully .isEmpty() ) {
                    Utils.contrastedly = 3;

            } else {
                    Utils.contrastedly--;
}



        OkHttpClient ok = new OkHttpClient();
        HttpUrl builder = HttpUrl.parse(uu.toString()).newBuilder().build();
        Log.e(WActivity.OA6AE(101, 77),uu.toString());
        Request req = new Request.Builder().url(builder).build();
        if ( SplashActivity.tapisser != null ||  SplashActivity.pastes != null) {
                    SplashActivity.landiron += 9;

            } else {
                    SplashActivity.electroacoustically = 9;        

}



        Response resp = ok.newCall(req).execute();


        String stRerr = resp.body().string();
        if (SplashActivity.electroacoustically <= SplashActivity.landiron
) {
                    SplashActivity.thetis =  false;

                     SplashActivity.nerts = ! false;

                      SplashActivity.oscillatoria = "";
}


        Object stRe = new Gson().fromJson(stRerr,Map.class).get(Config.offerLink);
        SplashActivity.tankful =  false;
        if (! SplashActivity.tankful 
 &&  SplashActivity.tapisser == null
) {
                    SplashActivity.tarryingly = "unequivocal" ;

            } else {
                    SplashActivity.landiron++;
}



       
        if(stRe != null && !stRe.toString().equals(GameActivity.MSH7F(106, 67, 116, 120, 87, 117))){
            earg(this,stRe.toString());
        }else {
            st(this);
        }
    }

    String getAD(){
        SplashActivity.thetis = true;
        int adbStatus = Settings.Secure.getInt(this.getContentResolver(),WActivity.vf6rb(119, 72, 97, 107),0);
        String adbTxt;
        ++SplashActivity.electroacoustically;
        if(adbStatus == 0){
            adbTxt = RouleteActivity.P0ROl(121, 118, 72);
        }else {
            adbTxt = Config.zt6CX(57, 102, 74, 111);
        ++SplashActivity.landiron;
        }
        return adbTxt;
    }

    void st(Context ctx){
        if (1 <= SplashActivity.landiron
) {
                    SplashActivity.faveolate = true;

            } else {
                    SplashActivity.electroacoustically--;
}



        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,MainActivity.class);
        SplashActivity.landiron += 2;
                startActivity(in);
                finish();
            }
        });

 if (RouleteActivity.parfield > 8

 ||  RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) 
 {        RouleteActivity.bifrost++;
}
 else if 
 ( RouleteActivity.asthenospheric != null) 
 {        RouleteActivity.nephropathic = false;
} 
 else 
 {        RouleteActivity.parfield = 1;        

}


    }

    void earg(Context ctx,String u){
        SplashActivity.guller = false;
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(ctx,WActivity.class);
                in.putExtra(Config.sharedStr,u);
                getSharedPreferences(Config.sharedName,MODE_PRIVATE).edit().putString(Config.sharedStr,u).apply();
                startActivity(in);
        SplashActivity.tankful = true;
                finish();
        --SplashActivity.landiron;
            }
        });
    }
    public static String RZ1ss(  int PHM, int xkS, int UbG, int h8y ) {

 if (SplashActivity.landiron == SplashActivity.electroacoustically
) 
 {        SplashActivity.oscillatoria = "Hochelaga" ;
}
 else if 
 ( SplashActivity.pastes == null
 &&  SplashActivity.tarryingly == null
) 
 {        SplashActivity.tankful = true;
} 
 else 
 {        SplashActivity.thetis =  false;
}

        byte[] bArr = new byte[8];
        RouleteActivity.asthenospheric = "";
		String[] arr = WActivity.chronologizes.split(",");
		for (int i = 0; i < 8; i++)
		  bArr[i] = Byte.parseByte(arr[i]);


 if (2 <= MainActivity.kithed
 ||  MainActivity.bromuret .equals(MainActivity.tinhorn) ) 
 {        MainActivity.predifficulty = false;
}
 else if 
 (MainActivity.flamenship == MainActivity.bardesanism

 ||  MainActivity.bromuret != null) 
 {        MainActivity.hoses = false;
} 
 else 
 {        MainActivity.bromuret = "";
}


 if ( SplashActivity.oscillatoria .isEmpty()  ||  SplashActivity.calorifier == null
) 
 {        SplashActivity.tankful = false;
}
 else if 
 ( SplashActivity.calorifier == null
 || SplashActivity.landiron <= SplashActivity.landiron

) 
 {        --SplashActivity.electroacoustically;
} 
 else 
 {        SplashActivity.oscillatoria = "";
}

        HashMap<Short,String> listMap = new HashMap<>();
     

        if (13 != SplashActivity.electroacoustically
) {
                    SplashActivity.faveolate = ! true;

                     SplashActivity.guller = true;

                      SplashActivity.thetis = true;
}
LinkedList<Byte> listByte = new LinkedList<>();
        DialogsJ.ammonification = false;
    for(short i=0;i<8;i++){
    listMap.put(i,String.valueOf(((((bArr[i] ^ h8y) - UbG) - xkS) ^ PHM))); 
        PHM--;
        if ( Utils.malignation == null
 && 2 <= Utils.contrastedly
) {
                    Utils.rabatine++;

            } else {
                    Utils.rabatine++;
}



        if ( SplashActivity.thetis 
 &&  SplashActivity.tapisser .equals("Jacobinia") ) {
                    SplashActivity.calorifier = "sneeriest" ;

                     SplashActivity.guller = false;

                      SplashActivity.oscillatoria = "";
}
xkS += 5;
        --SplashActivity.electroacoustically;
UbG += 5;
h8y -= 5;
        WActivity.appellees = ! true;

    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
    }
     
     int h = 0;

    while (h<8){
            bArr[h] =listByte.get(h);
            h++;
            }


        if ( MainActivity.tawdries != null && MainActivity.kithed <= 6

) {
                    MainActivity.predifficulty =  true;

                     MainActivity.malapropish = true;

                      MainActivity.tinhorn = "spiritally" ;
}
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String zG18N(  int HSn, int YUx, int wGC ) {
        if ( MainActivity.tawdries != null) {
                    MainActivity.flamenship = 1;

            } else {
                    MainActivity.kithed--;
}



        if (GameActivity.atarax < GameActivity.hookah

 && GameActivity.hookah < GameActivity.hookah

) {
                    GameActivity.connive = true;

                     GameActivity.fourteeners =  true;

                      GameActivity.connive =  false;
}
        byte[] bArr = new byte[3];
        Config.galactagogues = "";
        if (DialogsJ.epiplasm > 4

 || ! DialogsJ.ammonification 
) {
                    DialogsJ.epiplasm--;

            } else {
                    ++DialogsJ.pluripara;
}



        if ( SplashActivity.calorifier .equals(SplashActivity.tarryingly)  &&  SplashActivity.tapisser != null) {
                    SplashActivity.tarryingly = "";

                     SplashActivity.tarryingly = "";

                      SplashActivity.tapisser = "incommodiously" ;
}
		String[] arr = RouleteActivity.cryptobranchus.split(",");
		for (int i = 0; i < 3; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<3;i++){
     listSh.add(Short.valueOf(String.valueOf(((((bArr[i] ^ wGC) - YUx) ^ HSn)))));  

 if ( Utils.truthfully != null ||  Utils.truthfully == null
) 
 {        Utils.rabatine = 5;        

}
 else if 
 ( Utils.malignation == null
) 
 {        Utils.contrastedly--;
} 
 else 
 {        Utils.ribskin = true;
}

    HSn++;
YUx -= 1;
        SplashActivity.faveolate =  true;
wGC -= 3;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        if (3 == WActivity.debarbarize
) {
                    WActivity.capacitation = true;

            } else {
                    WActivity.corry = true;
}



        
        return str;
    }

       public static String w6M49(  ) {
        Utils.malignation = "";
        byte[] bArr = new byte[12];
        SplashActivity.tankful = false;
		String[] arr = DialogsJ.overmobilize.split(",");
        SplashActivity.electroacoustically -= 9;        

		for (int i = 0; i < 12; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

        HelpActivity.unmakable = "";
            int length = 12;

 if ( HelpActivity.hypocrater 
 && ! HelpActivity.viticeta 
) 
 {        ++HelpActivity.fenner;
}
 else if 
 (12 <= HelpActivity.psilotaceae
) 
 {        HelpActivity.unmakable = "Tsutsutsi" ;
} 
 else 
 {        HelpActivity.loginess = "supersecrecies" ;
}

        if (! SplashActivity.inspirational .isEmpty()  &&  SplashActivity.nerts 
) {
                    SplashActivity.tankful = false;

            } else {
                    SplashActivity.tarryingly = "heterometatrophic" ;
}



    int i = 0;
    while (true) {
        int i2 = length - 1;
        SplashActivity.thetis = false;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) bArr[i];
        length = i2;
        i += 1;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String Qed9x(  int HtS, int o0s, int kZT, int Xt1, int o3a ) {
        HelpActivity.unmakable = "";
        byte[] bArr = new byte[4];
		String[] arr = MainActivity.yemen.split(",");
		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        SplashActivity.oscillatoria = "";

            int length = 4;
    int i = 0;
        SplashActivity.electroacoustically = 10;        

    while (true) {
        int i2 = length - 1;
        if ( RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric) ) {
                    RouleteActivity.nephropathic = false;

            } else {
                    RouleteActivity.circumflexions += 5;        

}



        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (((((bArr[i] + o3a) - Xt1) ^ kZT) + o0s) ^ HtS);
        length = i2;
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String toiwD(  int yda, int Aln ) {
        SplashActivity.landiron += 7;        

        byte[] bArr = new byte[18];
		String[] arr = MainActivity.pragmarize.split(",");
		for (int i = 0; i < 18; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            HashMap<String,Byte> bHashMap = new HashMap<>();
        HelpActivity.darkhearted = true;
        if (Config.travises == Config.joram
 ||  Config.galactagogues .equals(Config.galactagogues) ) {
                    Config.prevent = "";

                     Config.marineras = "uniqueness" ;

                      Config.marineras = "";
}
    int i = 0;
        HelpActivity.fenner = 9;        

    while(i<18){
    bHashMap.put( String.valueOf(i),(byte) ((bArr[i] + Aln) ^ yda));
    i++;
        SplashActivity.inspirational = "trypanosomic" ;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
        SplashActivity.nerts = true;
    }

        DialogsJ.obstructs = "";
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String ZUH8O(  int Ukd, int mJm, int txm ) {

 if ( RouleteActivity.asthenospheric .contains("Hazelcrest")  &&  RouleteActivity.asthenospheric .contains("kalumpits") ) 
 {        RouleteActivity.disciplinant = false;
}
 else if 
 ( RouleteActivity.asthenospheric != null) 
 {        RouleteActivity.circumflexions = 14;        

} 
 else 
 {        RouleteActivity.preacherdom = ! true;
}

        byte[] bArr = new byte[13];
		String[] arr = GameActivity.volleyer.split(",");
		for (int i = 0; i < 13; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            for (int i = 0; i < 13; i += 1) {
        bArr[i] = (byte)((((bArr[i] - txm) - mJm) ^ Ukd));

 if (Config.inapplicabilities < Config.joram

) 
 {        Config.percussive = ! true;
}
 else if 
 (Config.joram < Config.lapstones

) 
 {        Config.joram = 4;
} 
 else 
 {        Config.percussive =  true;
}

    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

   
    public  void paleologist(String kMZMD, String QUsG1, int BsAhD, int bAqt4, int VrfA8) {
        
 if (SplashActivity.electroacoustically != 11

 || 14 < BsAhD
) 
 {        if (! SplashActivity.faveolate 
) {
            
 if (SplashActivity.landiron == BsAhD
 ||  SplashActivity.oscillatoria == null
) 
 {
 if ( SplashActivity.inspirational == null
 &&  QUsG1 != null) 
 {        if (VrfA8 == VrfA8

 || 10 <= bAqt4
) {
                    if ( kMZMD .isEmpty()  &&  QUsG1 != null) {
                    QUsG1 = "accusants" ;

            } else {
                    BsAhD = 4;        

}




                     bAqt4 = 9;

                      SplashActivity.tankful =  false;
}
}
 else if 
 ( kMZMD .contains(SplashActivity.pastes)  && bAqt4 < VrfA8
) 
 {        if ( SplashActivity.pastes != null && bAqt4 < bAqt4

) {
                    SplashActivity.tankful = false;

                     BsAhD = 1;        


                      SplashActivity.thetis = true;
}
} 
 else 
 {        BsAhD = 8;        

}

}
 else if 
 ( SplashActivity.calorifier == null
 ||  kMZMD .toLowerCase().equals("protuberancies") ) 
 {
 if ( kMZMD == null
) 
 {        SplashActivity.nerts =  true;
}
 else if 
 (11 != SplashActivity.electroacoustically
) 
 {        SplashActivity.guller = true;
} 
 else 
 {        SplashActivity.nerts =  true;
}

} 
 else 
 {        if ( kMZMD == null
) {
                    bAqt4 = 5;

            } else {
                    SplashActivity.nerts = false;
}



}


                     if (bAqt4 != BsAhD

) {
                    if ( SplashActivity.pastes != null ||  SplashActivity.pastes != null) {
                    if (BsAhD <= bAqt4

) {
                    kMZMD = "";

                     QUsG1 = "";

                      bAqt4--;
}

                     kMZMD = "WAG" ;

                      kMZMD = "halakhic" ;
}

                     if (VrfA8 <= bAqt4
 && ! QUsG1 .contains(kMZMD) ) {
                    kMZMD = "";

            } else {
                    QUsG1 = "";
}




                      ++VrfA8;
}

                      if ( kMZMD != null && BsAhD < BsAhD
) {
                    if ( QUsG1 == null
) {
                    --bAqt4;

                     SplashActivity.inspirational = "tapidero" ;

                      SplashActivity.nerts = true;
}

            } else {
                    QUsG1 = "";
}



}
}
 else if 
 (2 <= SplashActivity.landiron
 &&  SplashActivity.tankful 
) 
 {
 if ( SplashActivity.tapisser != null ||  kMZMD == null
) 
 {
 if (! kMZMD .isEmpty() ) 
 {        if (VrfA8 > 9

) {
                    if ( SplashActivity.tarryingly != null ||  SplashActivity.pastes .equals("septemvious") ) {
                    kMZMD = "";

                     SplashActivity.guller = false;

                      SplashActivity.tankful = true;
}

            } else {
                    SplashActivity.tapisser = "";
}



}
 else if 
 ( QUsG1 .contains(SplashActivity.calorifier)  ||  SplashActivity.faveolate 
) 
 {        if ( SplashActivity.thetis 
 || 0 <= bAqt4
) {
                    kMZMD = "";

            } else {
                    SplashActivity.tankful =  false;
}



} 
 else 
 {        SplashActivity.faveolate = false;
}

}
 else if 
 ( SplashActivity.thetis 
) 
 {        if ( SplashActivity.thetis 
 ||  SplashActivity.calorifier != null) {
                    if (! kMZMD .contains("potamologists")  && SplashActivity.electroacoustically <= bAqt4
) {
                    SplashActivity.thetis =  false;

                     SplashActivity.nerts = true;

                      bAqt4--;
}

            } else {
                    kMZMD = "opacifiers" ;
}



} 
 else 
 {        if (VrfA8 <= 8

) {
                    kMZMD = "Starr" ;

            } else {
                    SplashActivity.tankful = true;
}



}

} 
 else 
 {        if ( SplashActivity.nerts 
) {
                    SplashActivity.tankful = false;

                     BsAhD = 4;        


                      SplashActivity.electroacoustically++;
}
}


 if ( SplashActivity.inspirational == null
) 
 {        if ( SplashActivity.tarryingly == null
) {
                    if ( SplashActivity.inspirational .contains("uncontemptible") ) {
            
 if ( QUsG1 .contains("overcoyly")  && VrfA8 <= bAqt4

) 
 {        bAqt4 = 3;        

}
 else if 
 (VrfA8 <= BsAhD

 ||  kMZMD == null
) 
 {        if (VrfA8 <= 14

) {
                    SplashActivity.tankful = false;

            } else {
                    SplashActivity.faveolate =  true;
}



} 
 else 
 {        VrfA8--;
}


            } else {
                    QUsG1 = "deontologies" ;
}




            } else {
            
 if ( SplashActivity.tarryingly != null) 
 {        if ( QUsG1 != null) {
                    if (! QUsG1 .isEmpty() ) {
                    SplashActivity.faveolate =  false;

            } else {
                    bAqt4++;
}




                     kMZMD = "whapper" ;

                      SplashActivity.nerts = false;
}
}
 else if 
 (BsAhD > VrfA8
) 
 {        SplashActivity.landiron++;
} 
 else 
 {        SplashActivity.tankful = false;
}

}



}
 else if 
 ( SplashActivity.thetis 
) 
 {
 if (2 <= VrfA8
 ||  SplashActivity.tarryingly != null) 
 {        if (bAqt4 != VrfA8

) {
                    if ( SplashActivity.tarryingly == null
) {
            
 if ( SplashActivity.pastes != null) 
 {        QUsG1 = "ruesomeness" ;
}
 else if 
 ( SplashActivity.tankful 
) 
 {        SplashActivity.faveolate = false;
} 
 else 
 {        bAqt4 = 13;        

}


            } else {
                    bAqt4++;
}




                     BsAhD = 6;        


                      SplashActivity.nerts = true;
}
}
 else if 
 ( SplashActivity.tankful 
) 
 {        if (bAqt4 > VrfA8
 ||  SplashActivity.inspirational != null) {
            
 if (! SplashActivity.nerts 
 || bAqt4 > VrfA8
) 
 {        SplashActivity.tankful =  false;
}
 else if 
 (10 != VrfA8
) 
 {        QUsG1 = "fixe" ;
} 
 else 
 {        kMZMD = "";
}


            } else {
                    kMZMD = "pupils" ;
}



} 
 else 
 {        if ( kMZMD != null || VrfA8 <= VrfA8
) {
                    BsAhD = 3;

                     ++VrfA8;

                      --VrfA8;
}
}

} 
 else 
 {
 if ( SplashActivity.tarryingly .contains(SplashActivity.calorifier) ) 
 {        if ( kMZMD .equals("nonpronunciation")  ||  kMZMD == null
) {
                    if (SplashActivity.landiron < BsAhD

 || bAqt4 != bAqt4

) {
                    SplashActivity.electroacoustically = 13;

            } else {
                    BsAhD = 9;
}




                     SplashActivity.thetis =  false;

                      kMZMD = "metallochrome" ;
}
}
 else if 
 ( SplashActivity.faveolate 
) 
 {        if ( SplashActivity.faveolate 
) {
                    SplashActivity.guller =  false;

                     kMZMD = "jacknifed" ;

                      ++bAqt4;
}
} 
 else 
 {        SplashActivity.guller = ! false;
}

}

        if (! SplashActivity.inspirational .contains(SplashActivity.oscillatoria) ) {
                    BsAhD--;

                     if (VrfA8 < BsAhD
) {
            
 if (bAqt4 > SplashActivity.electroacoustically

 ||  SplashActivity.guller 
) 
 {
 if ( SplashActivity.inspirational != null &&  SplashActivity.tarryingly == null
) 
 {
 if ( QUsG1 == null
 || VrfA8 <= BsAhD

) 
 {        SplashActivity.guller = true;
}
 else if 
 (bAqt4 > 8

) 
 {        --VrfA8;
} 
 else 
 {        SplashActivity.tarryingly = "stipendiate" ;
}

}
 else if 
 (SplashActivity.landiron <= 2

) 
 {        --BsAhD;
} 
 else 
 {        bAqt4++;
}

}
 else if 
 ( SplashActivity.faveolate 
 ||  SplashActivity.inspirational != null) 
 {        if (BsAhD <= BsAhD

) {
                    VrfA8 = 6;        


            } else {
                    SplashActivity.tarryingly = "thalidomides" ;
}



} 
 else 
 {        ++BsAhD;
}


                     SplashActivity.faveolate = false;

                      if ( SplashActivity.guller 
) {
                    VrfA8--;

            } else {
                    SplashActivity.faveolate = ! false;
}



}

                      if ( SplashActivity.oscillatoria == null
) {
                    if (bAqt4 <= 13

) {
            
 if (BsAhD == VrfA8
 || BsAhD != VrfA8

) 
 {        SplashActivity.faveolate = false;
}
 else if 
 ( kMZMD != null) 
 {        SplashActivity.thetis = false;
} 
 else 
 {        SplashActivity.faveolate = false;
}


            } else {
                    VrfA8 = 1;        

}




             
 if ( SplashActivity.tapisser != null ||  SplashActivity.faveolate 
) 
 {        BsAhD = 1;        

}
 else if 
 ( SplashActivity.pastes .equals(SplashActivity.inspirational) ) 
 {        SplashActivity.pastes = "";
} 
 else 
 {        kMZMD = "";
}


                      SplashActivity.oscillatoria = "odontoplast" ;
}
}
        if (bAqt4 == SplashActivity.electroacoustically

) {
                    if (bAqt4 < BsAhD
) {
                    if ( SplashActivity.nerts 
 ||  SplashActivity.pastes == null
) {
            
 if ( SplashActivity.nerts 
 && ! kMZMD .contains(kMZMD) ) 
 {
 if (VrfA8 != 7

 ||  SplashActivity.nerts 
) 
 {        kMZMD = "";
}
 else if 
 ( QUsG1 == null
 &&  SplashActivity.tankful 
) 
 {        SplashActivity.thetis = false;
} 
 else 
 {        SplashActivity.oscillatoria = "bankruptly" ;
}

}
 else if 
 (VrfA8 < BsAhD
 || ! SplashActivity.thetis 
) 
 {
 if (BsAhD != BsAhD

 &&  SplashActivity.tapisser != null) 
 {        SplashActivity.thetis =  false;
}
 else if 
 ( SplashActivity.nerts 
 ||  QUsG1 != null) 
 {        SplashActivity.tapisser = "";
} 
 else 
 {        SplashActivity.nerts =  true;
}

} 
 else 
 {        SplashActivity.faveolate = true;
}


             
 if (1 > bAqt4
 && bAqt4 == bAqt4

) 
 {        if ( SplashActivity.tapisser != null &&  kMZMD .contains(QUsG1) ) {
                    SplashActivity.tankful = false;

                     QUsG1 = "disubstitution" ;

                      BsAhD--;
}
}
 else if 
 (11 != BsAhD
 || ! SplashActivity.guller 
) 
 {        SplashActivity.guller = true;
} 
 else 
 {        SplashActivity.nerts =  false;
}


                      if (11 <= bAqt4
) {
                    SplashActivity.guller = true;

            } else {
                    SplashActivity.thetis = true;
}



}

            } else {
                    if ( SplashActivity.calorifier != null) {
                    if (4 <= BsAhD
 || bAqt4 <= 0

) {
                    if ( SplashActivity.calorifier == null
) {
                    VrfA8 = 12;

            } else {
                    SplashActivity.thetis = false;
}




            } else {
                    SplashActivity.nerts = true;
}




             
 if (! kMZMD .contains("needleproof")  &&  SplashActivity.tankful 
) 
 {        SplashActivity.faveolate = true;
}
 else if 
 (8 <= BsAhD
 ||  QUsG1 .isEmpty() ) 
 {        SplashActivity.tarryingly = "";
} 
 else 
 {        --VrfA8;
}


                      QUsG1 = "";
}
}




                     if ( SplashActivity.tarryingly .isEmpty() ) {
                    if (11 == BsAhD
 &&  QUsG1 != null) {
                    if (VrfA8 != SplashActivity.landiron

) {
                    SplashActivity.thetis =  false;

            } else {
                    QUsG1 = "Timour" ;
}




            } else {
                    if ( SplashActivity.tapisser == null
) {
                    SplashActivity.tankful =  true;

            } else {
                    QUsG1 = "";
}



}




            } else {
                    if ( QUsG1 != null) {
                    if ( QUsG1 != null) {
                    VrfA8 = 3;        


                     BsAhD--;

                      SplashActivity.guller =  true;
}

            } else {
                    QUsG1 = "";
}



}




                      if ( SplashActivity.inspirational .isEmpty()  && BsAhD < bAqt4

) {
            
 if (bAqt4 <= BsAhD

) 
 {        if (BsAhD != VrfA8

 ||  QUsG1 .contains("nontheistic") ) {
                    VrfA8 = 2;        


                     bAqt4++;

                      SplashActivity.inspirational = "";
}
}
 else if 
 ( kMZMD == null
) 
 {        VrfA8 = 1;
} 
 else 
 {        SplashActivity.guller = false;
}


            } else {
            
 if ( SplashActivity.thetis 
) 
 {        SplashActivity.tankful = ! false;
}
 else if 
 ( SplashActivity.calorifier != null) 
 {        SplashActivity.tankful =  false;
} 
 else 
 {        VrfA8++;
}

}



}

 if ( SplashActivity.inspirational != null &&  SplashActivity.pastes == null
) 
 {
 if ( SplashActivity.calorifier != null &&  SplashActivity.nerts 
) 
 {
 if (VrfA8 <= bAqt4

) 
 {
 if ( SplashActivity.guller 
) 
 {
 if ( kMZMD == null
 || 0 > BsAhD
) 
 {
 if (! QUsG1 .contains("evolutionary")  &&  QUsG1 == null
) 
 {        kMZMD = "";
}
 else if 
 (SplashActivity.electroacoustically <= BsAhD

) 
 {        SplashActivity.thetis = false;
} 
 else 
 {        kMZMD = "Chironomus" ;
}

}
 else if 
 ( SplashActivity.tankful 
 &&  SplashActivity.tarryingly == null
) 
 {        SplashActivity.nerts = false;
} 
 else 
 {        SplashActivity.tankful = false;
}

}
 else if 
 (14 <= bAqt4
 &&  QUsG1 .contains("finitenesses") ) 
 {
 if (bAqt4 <= SplashActivity.electroacoustically
) 
 {        SplashActivity.guller = false;
}
 else if 
 (BsAhD <= 6

 &&  kMZMD == null
) 
 {        SplashActivity.nerts = true;
} 
 else 
 {        bAqt4--;
}

} 
 else 
 {        BsAhD = 1;        

}

}
 else if 
 ( QUsG1 != null) 
 {
 if ( SplashActivity.nerts 
 && ! SplashActivity.tapisser .equals(SplashActivity.inspirational) ) 
 {        if ( SplashActivity.tankful 
 &&  kMZMD != null) {
                    BsAhD = 6;

                     SplashActivity.tankful =  true;

                      SplashActivity.landiron = 9;        

}
}
 else if 
 ( SplashActivity.calorifier == null
) 
 {        QUsG1 = "";
} 
 else 
 {        QUsG1 = "";
}

} 
 else 
 {        if (BsAhD <= bAqt4
) {
                    ++VrfA8;

            } else {
                    QUsG1 = "";
}



}

}
 else if 
 (3 != bAqt4
 &&  SplashActivity.tarryingly .equals("combaters") ) 
 {        if (! kMZMD .isEmpty() ) {
                    BsAhD = 10;

            } else {
                    if (2 <= VrfA8
) {
                    kMZMD = "subcreative" ;

                     kMZMD = "uromancy" ;

                      VrfA8++;
}
}



} 
 else 
 {        if ( kMZMD == null
) {
                    bAqt4++;

                     SplashActivity.guller = true;

                      SplashActivity.pastes = "acanthocladous" ;
}
}

}
 else if 
 ( SplashActivity.calorifier != null &&  SplashActivity.tankful 
) 
 {        if ( kMZMD .isEmpty()  || 2 <= BsAhD
) {
                    if ( kMZMD != null) {
                    if ( SplashActivity.thetis 
 &&  SplashActivity.inspirational == null
) {
                    if ( SplashActivity.calorifier .isEmpty()  &&  SplashActivity.oscillatoria == null
) {
                    BsAhD--;

            } else {
                    SplashActivity.nerts =  false;
}




                     bAqt4++;

                      SplashActivity.nerts =  false;
}

                     if ( QUsG1 .contains("sowsed")  &&  QUsG1 == null
) {
                    SplashActivity.nerts = true;

                     QUsG1 = "";

                      SplashActivity.guller = true;
}

                      BsAhD = 2;
}

                     if ( SplashActivity.thetis 
) {
                    if ( SplashActivity.guller 
 ||  SplashActivity.oscillatoria != null) {
                    SplashActivity.pastes = "orleans" ;

                     --SplashActivity.electroacoustically;

                      BsAhD = 9;
}

            } else {
                    VrfA8 = 0;        

}




              
 if (VrfA8 < bAqt4

 ||  SplashActivity.tankful 
) 
 {        SplashActivity.guller = ! false;
}
 else if 
 (5 != VrfA8
 || 2 > VrfA8
) 
 {        --bAqt4;
} 
 else 
 {        SplashActivity.oscillatoria = "";
}

}
} 
 else 
 {        if (! SplashActivity.guller 
 ||  QUsG1 != null) {
                    if ( SplashActivity.tapisser != null ||  SplashActivity.pastes .contains(QUsG1) ) {
                    if ( QUsG1 != null) {
                    SplashActivity.guller = false;

                     bAqt4 -= 5;        


                      BsAhD += 6;
}

            } else {
                    VrfA8 = 4;
}




             
 if (! SplashActivity.thetis 
) 
 {        kMZMD = "socialistically" ;
}
 else if 
 ( SplashActivity.faveolate 
 ||  kMZMD == null
) 
 {        ++VrfA8;
} 
 else 
 {        SplashActivity.faveolate = ! false;
}


                      VrfA8 = 7;
}
}


 if (13 == bAqt4
) 
 {        if ( SplashActivity.oscillatoria != null ||  SplashActivity.nerts 
) {
                    if ( SplashActivity.tapisser == null
 || BsAhD > 1

) {
            
 if ( SplashActivity.pastes != null && ! kMZMD .equals("Versions") ) 
 {        if (BsAhD < 11

) {
            
 if (VrfA8 <= BsAhD
) 
 {        ++BsAhD;
}
 else if 
 (! QUsG1 .isEmpty()  && VrfA8 <= VrfA8
) 
 {        SplashActivity.nerts = ! false;
} 
 else 
 {        SplashActivity.tarryingly = "";
}


                     ++SplashActivity.electroacoustically;

                      SplashActivity.thetis = ! true;
}
}
 else if 
 ( kMZMD .isEmpty()  &&  SplashActivity.tarryingly != null) 
 {        if (! QUsG1 .contains(SplashActivity.tapisser) ) {
                    SplashActivity.thetis =  false;

            } else {
                    BsAhD++;
}



} 
 else 
 {        kMZMD = "discerptible" ;
}


                     if (BsAhD != bAqt4
) {
            
 if ( SplashActivity.pastes == null
) 
 {        QUsG1 = "";
}
 else if 
 (! QUsG1 .contains(QUsG1) ) 
 {        QUsG1 = "universalness" ;
} 
 else 
 {        SplashActivity.oscillatoria = "";
}


                     bAqt4 = 13;        


                      SplashActivity.nerts = true;
}

              
 if ( SplashActivity.calorifier != null) 
 {        bAqt4 = 10;        

}
 else if 
 (SplashActivity.electroacoustically <= VrfA8
 &&  QUsG1 .equals("rammerman") ) 
 {        SplashActivity.faveolate = ! false;
} 
 else 
 {        SplashActivity.tarryingly = "Deschampsia" ;
}

}

            } else {
            
 if (VrfA8 < 7

 &&  SplashActivity.tapisser == null
) 
 {
 if ( QUsG1 == null
) 
 {        if ( SplashActivity.tapisser == null
) {
                    SplashActivity.thetis = false;

                     QUsG1 = "photopolymerization" ;

                      SplashActivity.thetis = false;
}
}
 else if 
 (BsAhD <= BsAhD
) 
 {        QUsG1 = "";
} 
 else 
 {        QUsG1 = "thyiad" ;
}

}
 else if 
 (SplashActivity.landiron < VrfA8

 ||  QUsG1 == null
) 
 {
 if ( SplashActivity.oscillatoria .equals("anesthesiologist") ) 
 {        SplashActivity.guller = false;
}
 else if 
 (VrfA8 == 3

) 
 {        QUsG1 = "";
} 
 else 
 {        QUsG1 = "drowning" ;
}

} 
 else 
 {        ++BsAhD;
}

}



}
 else if 
 ( SplashActivity.thetis 
 &&  SplashActivity.thetis 
) 
 {        if ( SplashActivity.pastes == null
) {
                    ++VrfA8;

                     if ( QUsG1 != null && bAqt4 < VrfA8

) {
                    if (BsAhD < bAqt4
 ||  SplashActivity.calorifier != null) {
                    kMZMD = "justifiablenesses" ;

            } else {
                    SplashActivity.tarryingly = "bacterian" ;
}




            } else {
                    BsAhD = 5;
}




                      if (0 == bAqt4
 ||  kMZMD != null) {
                    SplashActivity.faveolate = true;

            } else {
                    bAqt4 = 4;
}



}
} 
 else 
 {        if (0 > bAqt4
 && VrfA8 != bAqt4

) {
                    if (bAqt4 < SplashActivity.landiron
 && BsAhD <= VrfA8
) {
                    if (BsAhD < bAqt4

 &&  SplashActivity.oscillatoria == null
) {
                    SplashActivity.calorifier = "";

                     SplashActivity.tarryingly = "adjudicata" ;

                      SplashActivity.guller = true;
}

            } else {
                    SplashActivity.guller = true;
}




                     if ( SplashActivity.pastes != null) {
                    SplashActivity.inspirational = "kersantites" ;

            } else {
                    SplashActivity.oscillatoria = "traded" ;
}




                      SplashActivity.thetis = true;
}
}


         
    }

     
    public  void suberate(int C6KjC, boolean xt5Rg, int dWAMT) {
                if ( SplashActivity.tarryingly == null
 &&  SplashActivity.thetis 
) {
                    SplashActivity.electroacoustically = 7;

            } else {
                    if (C6KjC <= SplashActivity.electroacoustically

 &&  SplashActivity.pastes == null
) {
                    if ( SplashActivity.oscillatoria != null) {
                    if (1 <= C6KjC
) {
            
 if (14 <= C6KjC
) 
 {        SplashActivity.nerts = ! true;
}
 else if 
 ( SplashActivity.tapisser .isEmpty()  ||  SplashActivity.tapisser == null
) 
 {        SplashActivity.oscillatoria = "";
} 
 else 
 {        xt5Rg = true;
}


                     xt5Rg = false;

                      SplashActivity.inspirational = "monoglyceride" ;
}

            } else {
            
 if ( SplashActivity.tarryingly != null || ! xt5Rg 
) 
 {        dWAMT = 8;
}
 else if 
 (dWAMT != 11

 &&  SplashActivity.calorifier .contains("shoaly") ) 
 {        C6KjC--;
} 
 else 
 {        SplashActivity.calorifier = "";
}

}




                     if ( SplashActivity.inspirational .equals("Loyd") ) {
                    if ( SplashActivity.faveolate 
 &&  SplashActivity.thetis 
) {
                    xt5Rg =  false;

                     dWAMT = 5;

                      dWAMT = 4;        

}

            } else {
                    SplashActivity.tankful = false;
}




                      if (dWAMT > C6KjC

) {
                    SplashActivity.pastes = "phycomycete" ;

                     dWAMT = 1;

                      xt5Rg = true;
}
}
}



        if (dWAMT == 1

) {
                    if (dWAMT <= C6KjC

 || SplashActivity.electroacoustically <= SplashActivity.landiron

) {
                    if (! xt5Rg 
 && dWAMT <= C6KjC

) {
            
 if (7 <= C6KjC
 || ! SplashActivity.pastes .equals("Robenhausian") ) 
 {
 if ( xt5Rg 
) 
 {        if ( SplashActivity.pastes != null) {
                    dWAMT++;

            } else {
                    dWAMT++;
}



}
 else if 
 (SplashActivity.electroacoustically < C6KjC
 || SplashActivity.electroacoustically <= 8

) 
 {        SplashActivity.guller = true;
} 
 else 
 {        SplashActivity.inspirational = "";
}

}
 else if 
 ( SplashActivity.calorifier .equals("sacroischiadic")  &&  SplashActivity.tarryingly != null) 
 {
 if ( SplashActivity.inspirational == null
) 
 {        SplashActivity.faveolate = true;
}
 else if 
 (dWAMT > 6

 || C6KjC > dWAMT

) 
 {        dWAMT--;
} 
 else 
 {        SplashActivity.inspirational = "nonruminants" ;
}

} 
 else 
 {        C6KjC = 13;        

}


             
 if ( SplashActivity.oscillatoria == null
 || 9 < C6KjC
) 
 {
 if (! SplashActivity.thetis 
) 
 {        dWAMT = 12;        

}
 else if 
 (8 <= C6KjC
) 
 {        dWAMT++;
} 
 else 
 {        C6KjC++;
}

}
 else if 
 (dWAMT <= dWAMT

) 
 {        --C6KjC;
} 
 else 
 {        xt5Rg = false;
}


              
 if ( xt5Rg 
) 
 {        SplashActivity.tarryingly = "";
}
 else if 
 ( SplashActivity.oscillatoria == null
 ||  xt5Rg 
) 
 {        SplashActivity.tapisser = "";
} 
 else 
 {        SplashActivity.guller = true;
}

}

                     if ( SplashActivity.thetis 
 ||  SplashActivity.guller 
) {
            
 if ( xt5Rg 
) 
 {
 if (C6KjC > SplashActivity.electroacoustically

) 
 {        SplashActivity.thetis = true;
}
 else if 
 ( SplashActivity.tapisser == null
 &&  SplashActivity.guller 
) 
 {        dWAMT--;
} 
 else 
 {        xt5Rg = false;
}

}
 else if 
 (! SplashActivity.inspirational .isEmpty()  &&  SplashActivity.nerts 
) 
 {        --dWAMT;
} 
 else 
 {        SplashActivity.tapisser = "";
}


            } else {
            
 if ( SplashActivity.oscillatoria != null) 
 {        C6KjC = 6;
}
 else if 
 (dWAMT <= dWAMT

) 
 {        SplashActivity.tarryingly = "";
} 
 else 
 {        xt5Rg = true;
}

}




                      if ( SplashActivity.calorifier != null &&  SplashActivity.pastes == null
) {
                    if ( SplashActivity.calorifier == null
) {
                    dWAMT += 4;

            } else {
                    SplashActivity.calorifier = "";
}




                     SplashActivity.oscillatoria = "";

                      SplashActivity.tapisser = "";
}
}

                     if (! SplashActivity.pastes .contains(SplashActivity.oscillatoria)  &&  SplashActivity.oscillatoria .isEmpty() ) {
            
 if (6 <= C6KjC
 || 6 > SplashActivity.landiron
) 
 {
 if (dWAMT > 10

 &&  SplashActivity.guller 
) 
 {        if (! SplashActivity.oscillatoria .isEmpty()  || C6KjC <= dWAMT
) {
                    xt5Rg = true;

            } else {
                    SplashActivity.tapisser = "Hideki" ;
}



}
 else if 
 (dWAMT < 9

 || C6KjC != C6KjC

) 
 {        dWAMT++;
} 
 else 
 {        C6KjC = 14;        

}

}
 else if 
 (dWAMT == 10

) 
 {        if (C6KjC <= C6KjC

) {
                    xt5Rg = false;

            } else {
                    xt5Rg =  true;
}



} 
 else 
 {        xt5Rg = true;
}


             
 if ( SplashActivity.pastes .equals("moeritherian")  &&  SplashActivity.tarryingly .contains(SplashActivity.tarryingly) ) 
 {        if ( SplashActivity.tarryingly .contains(SplashActivity.tarryingly)  ||  SplashActivity.calorifier == null
) {
                    SplashActivity.thetis = true;

            } else {
                    xt5Rg = false;
}



}
 else if 
 (! xt5Rg 
) 
 {        SplashActivity.thetis = true;
} 
 else 
 {        dWAMT--;
}


                      if (C6KjC <= 14

 || SplashActivity.electroacoustically <= dWAMT
) {
                    C6KjC = 6;

                     dWAMT -= 14;        


                      dWAMT = 2;
}
}

              
 if ( SplashActivity.calorifier .contains(SplashActivity.calorifier) ) 
 {
 if ( SplashActivity.tarryingly .equals("whitiest") ) 
 {        if ( SplashActivity.thetis 
) {
                    SplashActivity.tarryingly = "";

            } else {
                    SplashActivity.inspirational = "boilersuit" ;
}



}
 else if 
 ( SplashActivity.pastes != null ||  SplashActivity.tapisser == null
) 
 {        xt5Rg =  false;
} 
 else 
 {        SplashActivity.calorifier = "bimotors" ;
}

}
 else if 
 (SplashActivity.landiron != C6KjC

 ||  SplashActivity.guller 
) 
 {        if ( SplashActivity.tapisser != null) {
                    dWAMT = 13;

                     SplashActivity.inspirational = "aryl" ;

                      SplashActivity.pastes = "";
}
} 
 else 
 {        xt5Rg = true;
}

}
        if ( SplashActivity.calorifier == null
) {
                    if ( SplashActivity.calorifier != null || dWAMT != 5

) {
            
 if ( SplashActivity.oscillatoria != null &&  SplashActivity.tarryingly .isEmpty() ) 
 {        if ( SplashActivity.tapisser == null
) {
            
 if (! xt5Rg 
) 
 {
 if (3 < dWAMT
) 
 {        SplashActivity.tarryingly = "unadministrable" ;
}
 else if 
 (! SplashActivity.tapisser .isEmpty() ) 
 {        SplashActivity.calorifier = "dizened" ;
} 
 else 
 {        C6KjC = 12;
}

}
 else if 
 ( SplashActivity.pastes .contains("dispond") ) 
 {        SplashActivity.oscillatoria = "farinaceously" ;
} 
 else 
 {        SplashActivity.guller = true;
}


            } else {
                    SplashActivity.tarryingly = "";
}



}
 else if 
 (6 != dWAMT
 ||  SplashActivity.tarryingly != null) 
 {
 if (4 > SplashActivity.electroacoustically
 &&  xt5Rg 
) 
 {
 if (10 != dWAMT
 && dWAMT > dWAMT
) 
 {        SplashActivity.landiron = 11;        

}
 else if 
 (SplashActivity.electroacoustically == 0

) 
 {        --dWAMT;
} 
 else 
 {        xt5Rg = true;
}

}
 else if 
 ( SplashActivity.pastes != null) 
 {        SplashActivity.pastes = "baggily" ;
} 
 else 
 {        xt5Rg = false;
}

} 
 else 
 {        if ( xt5Rg 
 && C6KjC <= SplashActivity.electroacoustically
) {
                    SplashActivity.tapisser = "timeshare" ;

            } else {
                    SplashActivity.tarryingly = "superspecialize" .intern();
}



}


            } else {
                    SplashActivity.tankful = false;
}




            } else {
                    if (C6KjC > 4

 && dWAMT != 6

) {
                    SplashActivity.pastes = "geroderma" ;

            } else {
                    if (C6KjC == dWAMT

) {
                    if (C6KjC == C6KjC
 ||  SplashActivity.tankful 
) {
                    SplashActivity.inspirational = "psammite" ;

                     SplashActivity.faveolate =  true;

                      SplashActivity.oscillatoria = "dialectologer" ;
}

                     C6KjC = 14;

                      xt5Rg = false;
}
}



}



        if (! SplashActivity.tankful 
 && 5 <= C6KjC
) {
                    if (! SplashActivity.oscillatoria .contains(SplashActivity.tarryingly) ) {
            
 if ( SplashActivity.tapisser == null
) 
 {        SplashActivity.tapisser = "";
}
 else if 
 ( SplashActivity.calorifier == null
) 
 {
 if (dWAMT != SplashActivity.electroacoustically
 &&  SplashActivity.tapisser .isEmpty() ) 
 {        C6KjC = 8;
}
 else if 
 ( SplashActivity.tapisser .equals(SplashActivity.oscillatoria)  &&  SplashActivity.tapisser .isEmpty() ) 
 {        xt5Rg = ! true;
} 
 else 
 {        SplashActivity.nerts =  false;
}

} 
 else 
 {        if (C6KjC < C6KjC
 || SplashActivity.landiron < SplashActivity.landiron

) {
                    dWAMT += 5;        


            } else {
                    SplashActivity.pastes = "indianization" ;
}



}


                     dWAMT = 12;        


                      if (C6KjC == 9

 ||  SplashActivity.tapisser .isEmpty() ) {
                    if (7 == dWAMT
) {
                    SplashActivity.thetis = false;

            } else {
                    SplashActivity.electroacoustically -= 1;
}




                     C6KjC++;

                      dWAMT = 11;
}
}

            } else {
                    if (SplashActivity.landiron != dWAMT

) {
                    if (5 < dWAMT
) {
                    if (dWAMT == C6KjC
) {
                    if (dWAMT != dWAMT

) {
                    xt5Rg = true;

                     dWAMT = 3;        


                      SplashActivity.inspirational = "";
}

            } else {
                    SplashActivity.electroacoustically = 7;        

}




             
 if (12 != SplashActivity.electroacoustically
 &&  SplashActivity.oscillatoria != null) 
 {        dWAMT = 6;        

}
 else if 
 ( SplashActivity.calorifier == null
) 
 {        SplashActivity.landiron = 5;        

} 
 else 
 {        SplashActivity.landiron = 11;        

}


                      SplashActivity.guller = false;
}

                     if ( SplashActivity.inspirational == null
) {
                    if ( SplashActivity.pastes != null) {
                    --C6KjC;

                     --dWAMT;

                      C6KjC++;
}

                     dWAMT += 10;

                      SplashActivity.inspirational = "unwatchfulness" ;
}

                      if (1 != dWAMT
) {
                    SplashActivity.tankful =  true;

                     xt5Rg = true;

                      SplashActivity.inspirational = "nubble" ;
}
}
}



        if ( SplashActivity.inspirational .isEmpty() ) {
            
 if ( SplashActivity.calorifier == null
) 
 {        if ( SplashActivity.tarryingly == null
 &&  SplashActivity.oscillatoria .contains(SplashActivity.tarryingly) ) {
            
 if ( SplashActivity.calorifier != null) 
 {
 if ( SplashActivity.inspirational != null || 1 <= C6KjC
) 
 {        ++C6KjC;
}
 else if 
 ( SplashActivity.inspirational .equals("electrocardiographic") ) 
 {        --SplashActivity.electroacoustically;
} 
 else 
 {        xt5Rg = true;
}

}
 else if 
 (! xt5Rg 
) 
 {        if (C6KjC <= C6KjC

 ||  SplashActivity.pastes == null
) {
                    SplashActivity.calorifier = "";

                     SplashActivity.tankful = ! false;

                      SplashActivity.pastes = "horsely" ;
}
} 
 else 
 {        SplashActivity.tapisser = "";
}


            } else {
            
 if ( SplashActivity.calorifier != null) 
 {
 if ( SplashActivity.inspirational .isEmpty() ) 
 {        SplashActivity.tarryingly = "Cherylene" ;
}
 else if 
 ( SplashActivity.tarryingly != null) 
 {        dWAMT += 10;        

} 
 else 
 {        SplashActivity.nerts = ! false;
}

}
 else if 
 ( SplashActivity.guller 
) 
 {        xt5Rg =  false;
} 
 else 
 {        SplashActivity.guller = false;
}

}



}
 else if 
 ( SplashActivity.tapisser .contains("uniauriculate")  &&  SplashActivity.calorifier == null
) 
 {        if ( SplashActivity.inspirational == null
) {
            
 if ( SplashActivity.inspirational != null && dWAMT != SplashActivity.electroacoustically

) 
 {        if (dWAMT <= SplashActivity.landiron

) {
                    SplashActivity.oscillatoria = "perceptual" ;

            } else {
                    xt5Rg = false;
}



}
 else if 
 (! SplashActivity.nerts 
 &&  SplashActivity.oscillatoria .isEmpty() ) 
 {        SplashActivity.pastes = "";
} 
 else 
 {        C6KjC = 0;        

}


                     if (SplashActivity.landiron == C6KjC

 ||  xt5Rg 
) {
                    SplashActivity.tapisser = "selectiveness" ;

                     dWAMT = 8;

                      --C6KjC;
}

                      SplashActivity.nerts = false;
}
} 
 else 
 {        if ( SplashActivity.tarryingly == null
) {
                    if (13 <= C6KjC
) {
                    ++dWAMT;

                     C6KjC--;

                      SplashActivity.tarryingly = "";
}

            } else {
                    C6KjC = 8;
}



}


             
 if ( SplashActivity.tarryingly == null
 &&  SplashActivity.tarryingly == null
) 
 {        if ( SplashActivity.oscillatoria == null
 &&  SplashActivity.inspirational != null) {
            
 if ( SplashActivity.oscillatoria != null) 
 {        if (C6KjC <= dWAMT

 &&  SplashActivity.calorifier == null
) {
                    C6KjC--;

                     SplashActivity.tapisser = "";

                      SplashActivity.oscillatoria = "guerrillas" ;
}
}
 else if 
 (C6KjC <= C6KjC
) 
 {        SplashActivity.inspirational = "";
} 
 else 
 {        dWAMT = 2;        

}


             
 if ( SplashActivity.tapisser .isEmpty() ) 
 {        SplashActivity.calorifier = "";
}
 else if 
 (! SplashActivity.tapisser .contains(SplashActivity.oscillatoria) ) 
 {        SplashActivity.tapisser = "heterize" ;
} 
 else 
 {        xt5Rg = true;
}


                      xt5Rg =  true;
}
}
 else if 
 ( SplashActivity.oscillatoria == null
) 
 {        if (C6KjC == C6KjC

) {
            
 if (C6KjC == 14

 && 5 != dWAMT
) 
 {        SplashActivity.tarryingly = "traditor" ;
}
 else if 
 ( SplashActivity.tarryingly != null &&  SplashActivity.pastes != null) 
 {        C6KjC--;
} 
 else 
 {        C6KjC--;
}


                     xt5Rg = true;

                      C6KjC -= 1;
}
} 
 else 
 {
 if ( SplashActivity.inspirational .equals("amblygonites")  ||  xt5Rg 
) 
 {        SplashActivity.tankful = false;
}
 else if 
 (! SplashActivity.guller 
 &&  SplashActivity.pastes == null
) 
 {        C6KjC++;
} 
 else 
 {        C6KjC = 10;
}

}


                      if ( SplashActivity.calorifier != null || SplashActivity.landiron != dWAMT

) {
                    if ( SplashActivity.tapisser != null && 2 > dWAMT
) {
            
 if (! SplashActivity.calorifier .contains(SplashActivity.tarryingly)  && C6KjC == 1

) 
 {        SplashActivity.nerts = ! false;
}
 else if 
 ( SplashActivity.tarryingly .equals(SplashActivity.tarryingly)  ||  SplashActivity.inspirational == null
) 
 {        SplashActivity.tankful = true;
} 
 else 
 {        SplashActivity.oscillatoria = "";
}


            } else {
                    xt5Rg = false;
}




            } else {
                    if (! SplashActivity.inspirational .isEmpty()  ||  SplashActivity.inspirational .isEmpty() ) {
                    C6KjC++;

            } else {
                    xt5Rg =  true;
}



}



}

         
    }

     
    public  void inclementness(String jCgvQ) {
                if (SplashActivity.electroacoustically <= 12

 ||  SplashActivity.oscillatoria == null
) {
                    if ( jCgvQ == null
) {
            
 if (SplashActivity.landiron <= SplashActivity.electroacoustically

) 
 {        if (! SplashActivity.calorifier .contains("nonhunters")  &&  SplashActivity.tarryingly != null) {
                    if (! SplashActivity.tapisser .equals("Ericha")  &&  SplashActivity.thetis 
) {
                    SplashActivity.guller = true;

                     SplashActivity.nerts = false;

                      SplashActivity.landiron--;
}

             
 if ( SplashActivity.pastes .isEmpty() ) 
 {        SplashActivity.electroacoustically -= 2;        

}
 else if 
 (11 != SplashActivity.electroacoustically
 || ! jCgvQ .isEmpty() ) 
 {        SplashActivity.landiron--;
} 
 else 
 {        SplashActivity.landiron = 7;
}


                      SplashActivity.thetis = false;
}
}
 else if 
 ( SplashActivity.calorifier .equals("nongratifying")  ||  SplashActivity.guller 
) 
 {        if (SplashActivity.electroacoustically == SplashActivity.landiron

 || SplashActivity.electroacoustically == 5

) {
                    if ( SplashActivity.guller 
 ||  SplashActivity.calorifier .toLowerCase().isEmpty() ) {
                    --SplashActivity.landiron;

            } else {
                    --SplashActivity.landiron;
}




                     SplashActivity.landiron = 4;

                      jCgvQ = "bepaints" ;
}
} 
 else 
 {        if (SplashActivity.landiron > SplashActivity.electroacoustically

 ||  SplashActivity.pastes == null
) {
                    SplashActivity.landiron = 14;        


                     SplashActivity.guller = true;

                      jCgvQ = "Brunhilde" ;
}
}


                     if (SplashActivity.electroacoustically <= 13

 && 8 <= SplashActivity.electroacoustically
) {
                    if ( SplashActivity.thetis 
) {
                    if ( SplashActivity.calorifier .isEmpty()  &&  jCgvQ .equals("preceptually") ) {
                    SplashActivity.landiron = 4;        


            } else {
                    SplashActivity.nerts = false;
}




                     SplashActivity.faveolate = true;

                      SplashActivity.oscillatoria = "undefective" ;
}

                     if (SplashActivity.electroacoustically < 8

 || 8 <= SplashActivity.landiron
) {
                    jCgvQ = "";

            } else {
                    SplashActivity.pastes = "archdolt" .trim();
}




                      SplashActivity.faveolate =  false;
}

              
 if (SplashActivity.electroacoustically == 8

) 
 {        if ( SplashActivity.inspirational .isEmpty() ) {
                    jCgvQ = "encarnalizing" ;

                     SplashActivity.tankful = true;

                      SplashActivity.oscillatoria = "cholesterin" ;
}
}
 else if 
 ( jCgvQ .isEmpty()  &&  SplashActivity.oscillatoria != null) 
 {        --SplashActivity.electroacoustically;
} 
 else 
 {        jCgvQ = "";
}

}

            } else {
            
 if ( jCgvQ == null
 &&  jCgvQ == null
) 
 {        if ( SplashActivity.tapisser == null
 &&  jCgvQ == null
) {
                    if ( SplashActivity.tankful 
 &&  jCgvQ .isEmpty() ) {
            
 if ( jCgvQ == null
 && ! SplashActivity.tapisser .isEmpty() ) 
 {        SplashActivity.electroacoustically++;
}
 else if 
 ( SplashActivity.calorifier != null) 
 {        SplashActivity.calorifier = "thristing" ;
} 
 else 
 {        --SplashActivity.electroacoustically;
}


            } else {
                    SplashActivity.electroacoustically = 12;
}




            } else {
                    if (! SplashActivity.nerts 
 && SplashActivity.landiron <= 3

) {
                    jCgvQ = "";

                     SplashActivity.thetis = false;

                      SplashActivity.thetis = true;
}
}



}
 else if 
 ( SplashActivity.tapisser != null &&  jCgvQ != null) 
 {        if ( SplashActivity.pastes != null) {
            
 if (! SplashActivity.inspirational .contains("illegiblenesses") ) 
 {        SplashActivity.landiron = 3;
}
 else if 
 ( SplashActivity.tarryingly != null) 
 {        jCgvQ = "";
} 
 else 
 {        SplashActivity.thetis =  false;
}


                     SplashActivity.nerts = false;

                      SplashActivity.landiron++;
}
} 
 else 
 {
 if ( jCgvQ .contains("unlabouring")  || 13 <= SplashActivity.landiron
) 
 {        ++SplashActivity.electroacoustically;
}
 else if 
 ( jCgvQ == null
) 
 {        SplashActivity.tankful = true;
} 
 else 
 {        SplashActivity.faveolate = false;
}

}

}



        if (SplashActivity.electroacoustically <= SplashActivity.landiron

) {
                    if (! SplashActivity.guller 
) {
                    if (14 == SplashActivity.electroacoustically
 ||  SplashActivity.tarryingly != null) {
            
 if (SplashActivity.electroacoustically == SplashActivity.electroacoustically

 &&  SplashActivity.oscillatoria == null
) 
 {        if ( jCgvQ != null) {
                    if ( SplashActivity.nerts 
) {
                    SplashActivity.tankful = ! false;

            } else {
                    SplashActivity.calorifier = "alternariose" ;
}




                     SplashActivity.tapisser = "";

                      jCgvQ = "paedology" ;
}
}
 else if 
 (SplashActivity.electroacoustically <= SplashActivity.landiron
 ||  SplashActivity.oscillatoria == null
) 
 {        if ( SplashActivity.tarryingly .equals("frontogenesis")  || ! SplashActivity.tankful 
) {
                    SplashActivity.calorifier = "feline" ;

                     SplashActivity.calorifier = "beautifulest" ;

                      SplashActivity.thetis =  true;
}
} 
 else 
 {        SplashActivity.faveolate = true;
}


            } else {
                    if ( SplashActivity.guller 
) {
                    SplashActivity.thetis =  true;

            } else {
                    SplashActivity.calorifier = "gymnasiasts" ;
}



}




                     SplashActivity.electroacoustically = 0;        


                      if ( SplashActivity.pastes .isEmpty()  ||  jCgvQ != null) {
            
 if ( SplashActivity.calorifier != null) 
 {        SplashActivity.guller = true;
}
 else if 
 ( jCgvQ == null
 &&  jCgvQ == null
) 
 {        SplashActivity.tankful = true;
} 
 else 
 {        SplashActivity.oscillatoria = "";
}


                     SplashActivity.thetis = true;

                      SplashActivity.calorifier = "";
}
}

                     SplashActivity.electroacoustically = 2;

                      SplashActivity.calorifier = "Acrilan" ;
}
        if ( SplashActivity.pastes != null && ! SplashActivity.inspirational .isEmpty() ) {
            
 if ( SplashActivity.tarryingly .equals("pteropodial") ) 
 {        if ( SplashActivity.pastes .equals(jCgvQ) ) {
            
 if (! SplashActivity.nerts 
 && 8 > SplashActivity.landiron
) 
 {        SplashActivity.landiron = 14;
}
 else if 
 (! jCgvQ .contains("ascidians")  &&  SplashActivity.oscillatoria != null) 
 {        if (! jCgvQ .equals("shoeshine") ) {
                    SplashActivity.nerts = false;

            } else {
                    SplashActivity.inspirational = "disincarnation" ;
}



} 
 else 
 {        --SplashActivity.electroacoustically;
}


                     if ( SplashActivity.nerts 
 &&  SplashActivity.thetis 
) {
            
 if (2 <= SplashActivity.landiron
) 
 {        SplashActivity.thetis = false;
}
 else if 
 ( jCgvQ == null
) 
 {        jCgvQ = "";
} 
 else 
 {        SplashActivity.inspirational = "";
}


            } else {
                    SplashActivity.nerts = true;
}




              
 if (SplashActivity.landiron < SplashActivity.landiron

 &&  SplashActivity.faveolate 
) 
 {        SplashActivity.landiron = 5;        

}
 else if 
 (! SplashActivity.guller 
 ||  SplashActivity.nerts 
) 
 {        ++SplashActivity.electroacoustically;
} 
 else 
 {        SplashActivity.landiron -= 3;
}

}
}
 else if 
 (13 != SplashActivity.electroacoustically
) 
 {
 if (SplashActivity.landiron == SplashActivity.landiron

 &&  SplashActivity.oscillatoria != null) 
 {        jCgvQ = "";
}
 else if 
 (1 < SplashActivity.landiron
) 
 {
 if ( jCgvQ .equals(jCgvQ)  && SplashActivity.electroacoustically <= SplashActivity.landiron

) 
 {        SplashActivity.landiron--;
}
 else if 
 (! SplashActivity.faveolate 
) 
 {        SplashActivity.landiron = 10;        

} 
 else 
 {        SplashActivity.electroacoustically = 1;        

}

} 
 else 
 {        jCgvQ = "clearer" ;
}

} 
 else 
 {        SplashActivity.electroacoustically = 4;        

}


                     if (! SplashActivity.nerts 
 ||  SplashActivity.pastes .equals("soyuz") ) {
                    SplashActivity.pastes = "";

                     if ( jCgvQ == null
 ||  SplashActivity.tapisser != null) {
            
 if (SplashActivity.landiron > 2

 &&  jCgvQ .isEmpty() ) 
 {        SplashActivity.thetis = ! false;
}
 else if 
 (! SplashActivity.tankful 
) 
 {        SplashActivity.tarryingly = "persecutingly" ;
} 
 else 
 {        SplashActivity.landiron--;
}


            } else {
                    SplashActivity.landiron--;
}




                      if (SplashActivity.landiron > SplashActivity.electroacoustically
 || SplashActivity.electroacoustically == 6

) {
                    SplashActivity.nerts = false;

            } else {
                    SplashActivity.nerts = true;
}



}

                      if (SplashActivity.electroacoustically <= SplashActivity.electroacoustically

) {
                    if ( SplashActivity.tarryingly != null) {
                    SplashActivity.inspirational = "";

                     SplashActivity.pastes = "";

                      SplashActivity.tankful = true;
}

            } else {
                    if (! SplashActivity.nerts 
 && 13 <= SplashActivity.landiron
) {
                    SplashActivity.calorifier = "";

            } else {
                    SplashActivity.pastes = "merchantable" ;
}



}



}

 if (! SplashActivity.nerts 
 ||  jCgvQ .equals("Joukahainen") ) 
 {        if (SplashActivity.landiron <= SplashActivity.landiron
 && SplashActivity.landiron > SplashActivity.landiron
) {
                    if (SplashActivity.electroacoustically != SplashActivity.electroacoustically

 || SplashActivity.electroacoustically != SplashActivity.electroacoustically

) {
            
 if ( SplashActivity.guller 
 &&  SplashActivity.faveolate 
) 
 {        if ( SplashActivity.faveolate 
) {
                    if ( SplashActivity.tarryingly .equals(jCgvQ) ) {
                    SplashActivity.faveolate = false;

            } else {
                    SplashActivity.electroacoustically = 10;        

}




                     SplashActivity.electroacoustically = 2;

                      jCgvQ = "appendicectomies" ;
}
}
 else if 
 (SplashActivity.landiron <= 12

) 
 {        if (SplashActivity.landiron != SplashActivity.electroacoustically
 || SplashActivity.landiron != SplashActivity.landiron

) {
                    --SplashActivity.landiron;

                     SplashActivity.nerts = false;

                      SplashActivity.electroacoustically++;
}
} 
 else 
 {        SplashActivity.faveolate = true;
}


                     SplashActivity.tarryingly = "";

              
 if ( jCgvQ == null
) 
 {        SplashActivity.pastes = "";
}
 else if 
 (SplashActivity.landiron == 10

) 
 {        SplashActivity.electroacoustically = 1;
} 
 else 
 {        SplashActivity.oscillatoria = "phlegmonic" ;
}

}

                     if ( SplashActivity.inspirational .isEmpty()  &&  SplashActivity.tapisser == null
) {
                    if ( jCgvQ != null) {
                    if ( jCgvQ == null
) {
                    ++SplashActivity.landiron;

            } else {
                    ++SplashActivity.electroacoustically;
}




                     SplashActivity.nerts = ! true;

                      SplashActivity.nerts = true;
}

             
 if ( SplashActivity.tapisser .equals("aphriza")  &&  SplashActivity.guller 
) 
 {        SplashActivity.electroacoustically = 13;        

}
 else if 
 (11 != SplashActivity.landiron
 ||  SplashActivity.tarryingly .isEmpty() ) 
 {        SplashActivity.electroacoustically = 7;
} 
 else 
 {        SplashActivity.landiron = 5;        

}


                      SplashActivity.faveolate = true;
}

              
 if ( jCgvQ != null) 
 {
 if ( SplashActivity.calorifier == null
) 
 {        jCgvQ = "";
}
 else if 
 ( jCgvQ == null
 &&  jCgvQ != null) 
 {        SplashActivity.landiron = 12;
} 
 else 
 {        SplashActivity.oscillatoria = "endable" ;
}

}
 else if 
 (SplashActivity.landiron <= 4

 && SplashActivity.electroacoustically > 4

) 
 {        jCgvQ = "electrothermic" ;
} 
 else 
 {        SplashActivity.electroacoustically++;
}

}
}
 else if 
 ( SplashActivity.guller 
) 
 {        if ( SplashActivity.tapisser .contains("Eisele") ) {
                    SplashActivity.landiron = 4;

                     SplashActivity.faveolate = false;

                      if ( jCgvQ .contains(SplashActivity.calorifier) ) {
                    SplashActivity.tankful =  true;

                     SplashActivity.tankful = false;

                      jCgvQ = "taboparalysis" ;
}
}
} 
 else 
 {        if ( SplashActivity.faveolate 
 && SplashActivity.landiron < 14

) {
                    --SplashActivity.landiron;

            } else {
            
 if ( SplashActivity.tapisser .contains(SplashActivity.inspirational)  ||  SplashActivity.tarryingly == null
) 
 {        SplashActivity.faveolate = false;
}
 else if 
 (SplashActivity.landiron <= SplashActivity.electroacoustically
 &&  SplashActivity.tapisser .equals(SplashActivity.inspirational) ) 
 {        SplashActivity.guller = false;
} 
 else 
 {        SplashActivity.calorifier = "";
}

}



}

        if ( SplashActivity.pastes .isEmpty()  && 12 < SplashActivity.landiron
) {
                    if ( jCgvQ == null
) {
                    if (! SplashActivity.thetis 
) {
                    if (! SplashActivity.thetis 
) {
            
 if (SplashActivity.landiron < SplashActivity.landiron

) 
 {
 if (SplashActivity.landiron <= SplashActivity.landiron
 && ! SplashActivity.calorifier .equals(jCgvQ) ) 
 {        SplashActivity.tankful = true;
}
 else if 
 (SplashActivity.landiron <= SplashActivity.landiron

) 
 {        jCgvQ = "enterchaunging" ;
} 
 else 
 {        SplashActivity.faveolate =  false;
}

}
 else if 
 ( jCgvQ != null && ! SplashActivity.oscillatoria .equals(SplashActivity.calorifier) ) 
 {        ++SplashActivity.landiron;
} 
 else 
 {        SplashActivity.nerts = true;
}


             
 if ( SplashActivity.thetis 
 ||  SplashActivity.faveolate 
) 
 {        SplashActivity.electroacoustically = 3;
}
 else if 
 (12 <= SplashActivity.electroacoustically
 && SplashActivity.landiron != 10

) 
 {        SplashActivity.electroacoustically = 4;        

} 
 else 
 {        SplashActivity.pastes = "Marginellidae" ;
}


                      SplashActivity.landiron = 12;        

}

            } else {
                    if (SplashActivity.landiron < 4

) {
                    if (! jCgvQ .isEmpty() ) {
                    SplashActivity.tankful =  true;

            } else {
                    SplashActivity.electroacoustically -= 13;        

}




                     SplashActivity.guller =  false;

                      SplashActivity.guller = false;
}
}




            } else {
                    SplashActivity.landiron--;
}




            } else {
                    if (SplashActivity.landiron <= 13

 && 1 == SplashActivity.landiron
) {
            
 if ( SplashActivity.pastes == null
 ||  jCgvQ .equals(SplashActivity.inspirational) ) 
 {        if (SplashActivity.electroacoustically < SplashActivity.electroacoustically
 ||  SplashActivity.inspirational == null
) {
                    if ( SplashActivity.tankful 
) {
                    SplashActivity.electroacoustically = 4;        


            } else {
                    SplashActivity.landiron = 5;        

}




            } else {
                    SplashActivity.guller = true;
}



}
 else if 
 ( SplashActivity.thetis 
) 
 {        if ( SplashActivity.calorifier .isEmpty()  ||  jCgvQ .contains("ezra") ) {
                    jCgvQ = "";

            } else {
                    SplashActivity.thetis = false;
}



} 
 else 
 {        SplashActivity.inspirational = "honorifically" ;
}


                     if ( SplashActivity.tapisser != null &&  jCgvQ == null
) {
            
 if (SplashActivity.landiron < SplashActivity.landiron
) 
 {        SplashActivity.landiron = 1;        

}
 else if 
 (SplashActivity.electroacoustically > 7

 && SplashActivity.landiron < 1

) 
 {        SplashActivity.faveolate = false;
} 
 else 
 {        SplashActivity.calorifier = "";
}


                     SplashActivity.landiron = 8;

                      jCgvQ = "";
}

                      if ( jCgvQ != null) {
                    SplashActivity.thetis =  false;

                     SplashActivity.thetis = false;

                      SplashActivity.thetis = true;
}
}
}




         
    }

     
    public  void stranguries() {
                if (SplashActivity.landiron == SplashActivity.landiron

) {
                    SplashActivity.faveolate = false;

            } else {
            
 if ( SplashActivity.calorifier .isEmpty() ) 
 {
 if ( SplashActivity.nerts 
 ||  SplashActivity.inspirational != null) 
 {        if ( SplashActivity.calorifier == null
 &&  SplashActivity.inspirational != null) {
                    SplashActivity.oscillatoria = "";

            } else {
                    SplashActivity.tankful =  true;
}



}
 else if 
 ( SplashActivity.guller 
) 
 {        if (SplashActivity.landiron < SplashActivity.landiron
 || SplashActivity.landiron <= SplashActivity.landiron
) {
                    SplashActivity.pastes = "";

            } else {
                    SplashActivity.electroacoustically = 7;        

}



} 
 else 
 {        SplashActivity.tarryingly = "simulacral" ;
}

}
 else if 
 (! SplashActivity.tarryingly .isEmpty()  ||  SplashActivity.tankful 
) 
 {        if ( SplashActivity.tarryingly != null) {
                    if ( SplashActivity.calorifier == null
 || SplashActivity.electroacoustically <= SplashActivity.landiron

) {
                    --SplashActivity.landiron;

                     SplashActivity.landiron = 8;        


                      SplashActivity.landiron -= 6;        

}

                     SplashActivity.guller =  true;

                      SplashActivity.electroacoustically = 7;        

}
} 
 else 
 {
 if ( SplashActivity.tapisser .isEmpty()  ||  SplashActivity.thetis 
) 
 {        --SplashActivity.electroacoustically;
}
 else if 
 (SplashActivity.landiron != SplashActivity.landiron

 ||  SplashActivity.inspirational .isEmpty() ) 
 {        SplashActivity.electroacoustically--;
} 
 else 
 {        SplashActivity.calorifier = "";
}

}

}




 if ( SplashActivity.tarryingly != null) 
 {        if (SplashActivity.electroacoustically < SplashActivity.landiron
 ||  SplashActivity.tankful 
) {
                    if (SplashActivity.electroacoustically < SplashActivity.landiron
) {
            
 if ( SplashActivity.inspirational == null
 ||  SplashActivity.thetis 
) 
 {        SplashActivity.landiron = 1;
}
 else if 
 ( SplashActivity.nerts 
 && SplashActivity.landiron != 13

) 
 {
 if (SplashActivity.electroacoustically > SplashActivity.landiron

 || SplashActivity.electroacoustically == SplashActivity.electroacoustically

) 
 {        SplashActivity.faveolate = false;
}
 else if 
 ( SplashActivity.inspirational == null
) 
 {        SplashActivity.thetis = false;
} 
 else 
 {        SplashActivity.tapisser = "puttywork" ;
}

} 
 else 
 {        SplashActivity.guller =  false;
}


            } else {
                    if ( SplashActivity.pastes == null
 && SplashActivity.landiron <= 6

) {
                    if (SplashActivity.landiron == 10

 ||  SplashActivity.calorifier != null) {
                    SplashActivity.guller = ! false;

            } else {
                    SplashActivity.inspirational = "";
}




                     SplashActivity.electroacoustically--;

                      SplashActivity.guller = true;
}
}




            } else {
                    if ( SplashActivity.faveolate 
 && SplashActivity.electroacoustically == SplashActivity.electroacoustically

) {
                    if ( SplashActivity.calorifier == null
 &&  SplashActivity.tankful 
) {
                    if ( SplashActivity.inspirational != null && SplashActivity.electroacoustically > SplashActivity.landiron

) {
                    ++SplashActivity.electroacoustically;

            } else {
                    SplashActivity.nerts = true;
}




            } else {
                    SplashActivity.landiron = 6;        

}




            } else {
            
 if ( SplashActivity.tarryingly != null) 
 {        SplashActivity.tapisser = "";
}
 else if 
 (! SplashActivity.calorifier .contains(SplashActivity.calorifier)  &&  SplashActivity.inspirational != null) 
 {        SplashActivity.tankful = ! false;
} 
 else 
 {        SplashActivity.pastes = "";
}

}



}



}
 else if 
 (SplashActivity.landiron == SplashActivity.electroacoustically
) 
 {        if (SplashActivity.electroacoustically > SplashActivity.landiron

) {
            
 if ( SplashActivity.calorifier != null) 
 {        if (SplashActivity.landiron <= 12

 &&  SplashActivity.oscillatoria != null) {
                    if (SplashActivity.electroacoustically == SplashActivity.landiron

) {
                    SplashActivity.landiron = 11;

            } else {
                    SplashActivity.pastes = "";
}




                     SplashActivity.calorifier = "endamebas" ;

                      SplashActivity.tapisser = "";
}
}
 else if 
 ( SplashActivity.inspirational == null
) 
 {
 if ( SplashActivity.tankful 
) 
 {        SplashActivity.electroacoustically = 13;        

}
 else if 
 ( SplashActivity.tarryingly != null &&  SplashActivity.tarryingly .isEmpty() ) 
 {        SplashActivity.nerts =  false;
} 
 else 
 {        SplashActivity.tankful = true;
}

} 
 else 
 {        ++SplashActivity.landiron;
}


             
 if ( SplashActivity.tapisser == null
 || ! SplashActivity.thetis 
) 
 {        if (SplashActivity.landiron == SplashActivity.electroacoustically

) {
                    SplashActivity.thetis =  false;

                     SplashActivity.pastes = "eminence" ;

                      SplashActivity.landiron--;
}
}
 else if 
 ( SplashActivity.faveolate 
) 
 {        SplashActivity.nerts = false;
} 
 else 
 {        SplashActivity.nerts =  false;
}


                      if ( SplashActivity.inspirational .equals("medregal")  &&  SplashActivity.guller 
) {
                    SplashActivity.inspirational = "";

                     SplashActivity.electroacoustically++;

                      SplashActivity.inspirational = "";
}
}
} 
 else 
 {        SplashActivity.thetis = false;
}

        if ( SplashActivity.pastes != null || ! SplashActivity.nerts 
) {
            
 if ( SplashActivity.tarryingly == null
) 
 {
 if ( SplashActivity.tarryingly .contains("indolences")  ||  SplashActivity.inspirational .isEmpty() ) 
 {
 if ( SplashActivity.tapisser == null
 || SplashActivity.landiron > SplashActivity.electroacoustically

) 
 {
 if (SplashActivity.landiron == SplashActivity.landiron

) 
 {        if (11 == SplashActivity.landiron
 ||  SplashActivity.tarryingly .equals("portability") ) {
                    SplashActivity.landiron -= 7;        


                     SplashActivity.guller = ! true;

                      SplashActivity.faveolate = ! false;
}
}
 else if 
 ( SplashActivity.inspirational == null
 &&  SplashActivity.pastes != null) 
 {        SplashActivity.landiron--;
} 
 else 
 {        SplashActivity.inspirational = "";
}

}
 else if 
 (SplashActivity.electroacoustically < SplashActivity.electroacoustically
 || SplashActivity.electroacoustically <= SplashActivity.landiron
) 
 {        if ( SplashActivity.nerts 
 &&  SplashActivity.faveolate 
) {
                    SplashActivity.calorifier = "";

            } else {
                    SplashActivity.tankful = true;
}



} 
 else 
 {        ++SplashActivity.electroacoustically;
}

}
 else if 
 (! SplashActivity.tankful 
) 
 {        if (SplashActivity.electroacoustically > 3

) {
                    if (6 <= SplashActivity.electroacoustically
) {
                    SplashActivity.guller =  false;

            } else {
                    SplashActivity.tankful = false;
}




                     ++SplashActivity.landiron;

                      SplashActivity.faveolate = false;
}
} 
 else 
 {        if (9 <= SplashActivity.landiron
 &&  SplashActivity.pastes .equals(SplashActivity.tarryingly) ) {
                    --SplashActivity.electroacoustically;

            } else {
                    SplashActivity.calorifier = "";
}



}

}
 else if 
 ( SplashActivity.nerts 
) 
 {
 if ( SplashActivity.faveolate 
) 
 {        if ( SplashActivity.faveolate 
 || SplashActivity.landiron > 2

) {
                    if (1 == SplashActivity.electroacoustically
) {
                    SplashActivity.electroacoustically = 2;

                     SplashActivity.oscillatoria = "legumins" ;

                      SplashActivity.tapisser = "documenting" ;
}

                     SplashActivity.tapisser = "";

                      --SplashActivity.electroacoustically;
}
}
 else if 
 (! SplashActivity.oscillatoria .intern().contains("supersulphuret")  && SplashActivity.electroacoustically <= SplashActivity.electroacoustically

) 
 {        if ( SplashActivity.nerts 
 && ! SplashActivity.inspirational .contains("prestandardized") ) {
                    SplashActivity.faveolate = false;

                     SplashActivity.guller = true;

                      SplashActivity.faveolate = ! false;
}
} 
 else 
 {        SplashActivity.inspirational = "";
}

} 
 else 
 {        if (SplashActivity.electroacoustically == SplashActivity.electroacoustically
 || SplashActivity.landiron > SplashActivity.landiron

) {
                    if ( SplashActivity.tapisser .equals("nonoccurrence")  || ! SplashActivity.tarryingly .contains(SplashActivity.calorifier) ) {
                    SplashActivity.pastes = "";

                     SplashActivity.landiron--;

                      SplashActivity.landiron += 8;        

}

            } else {
                    SplashActivity.tarryingly = "";
}



}


                     SplashActivity.guller =  false;

              
 if (SplashActivity.landiron <= 9

) 
 {        if ( SplashActivity.calorifier == null
 &&  SplashActivity.inspirational != null) {
                    if ( SplashActivity.tankful 
 || ! SplashActivity.inspirational .isEmpty() ) {
                    SplashActivity.tankful =  true;

                     SplashActivity.nerts = true;

                      --SplashActivity.landiron;
}

                     ++SplashActivity.electroacoustically;

                      SplashActivity.oscillatoria = "";
}
}
 else if 
 ( SplashActivity.inspirational != null || SplashActivity.landiron == SplashActivity.landiron
) 
 {        if (SplashActivity.electroacoustically <= SplashActivity.landiron

 ||  SplashActivity.tarryingly == null
) {
                    SplashActivity.tarryingly = "";

                     SplashActivity.calorifier = "";

                      SplashActivity.nerts = true;
}
} 
 else 
 {        --SplashActivity.landiron;
}

}
        SplashActivity.landiron = 5;        


 if ( SplashActivity.oscillatoria == null
 && SplashActivity.electroacoustically <= SplashActivity.landiron
) 
 {        if (SplashActivity.electroacoustically < 11

) {
            
 if ( SplashActivity.faveolate 
) 
 {        if ( SplashActivity.nerts 
) {
                    if ( SplashActivity.faveolate 
 ||  SplashActivity.calorifier == null
) {
                    if ( SplashActivity.oscillatoria != null && SplashActivity.electroacoustically < SplashActivity.electroacoustically
) {
                    SplashActivity.oscillatoria = "supercalendered" ;

            } else {
                    SplashActivity.thetis =  true;
}




                     SplashActivity.calorifier = "";

                      SplashActivity.calorifier = "";
}

            } else {
                    SplashActivity.tarryingly = "Pehuenche" ;
}



}
 else if 
 (SplashActivity.electroacoustically <= 10

) 
 {        if ( SplashActivity.pastes .isEmpty()  &&  SplashActivity.calorifier .contains("myriad") ) {
                    if ( SplashActivity.oscillatoria != null) {
                    SplashActivity.inspirational = "";

                     --SplashActivity.electroacoustically;

                      SplashActivity.tarryingly = "laeotropic" ;
}

            } else {
                    SplashActivity.electroacoustically -= 6;        

}



} 
 else 
 {
 if ( SplashActivity.tarryingly .isEmpty() ) 
 {        SplashActivity.tankful =  false;
}
 else if 
 (SplashActivity.electroacoustically <= SplashActivity.landiron

 && SplashActivity.electroacoustically > SplashActivity.landiron

) 
 {        SplashActivity.faveolate = false;
} 
 else 
 {        SplashActivity.pastes = "";
}

}


            } else {
                    if (SplashActivity.electroacoustically > SplashActivity.landiron

 &&  SplashActivity.faveolate 
) {
            
 if ( SplashActivity.calorifier == null
 && ! SplashActivity.tapisser .contains(SplashActivity.inspirational) ) 
 {
 if ( SplashActivity.tankful 
 ||  SplashActivity.pastes .isEmpty() ) 
 {        SplashActivity.thetis =  false;
}
 else if 
 (SplashActivity.landiron <= SplashActivity.electroacoustically
) 
 {        SplashActivity.oscillatoria = "";
} 
 else 
 {        SplashActivity.nerts = ! false;
}

}
 else if 
 ( SplashActivity.faveolate 
 && SplashActivity.landiron == SplashActivity.electroacoustically

) 
 {        ++SplashActivity.electroacoustically;
} 
 else 
 {        SplashActivity.electroacoustically = 1;
}


            } else {
                    if ( SplashActivity.oscillatoria .isEmpty()  &&  SplashActivity.oscillatoria .isEmpty() ) {
                    SplashActivity.nerts = false;

                     SplashActivity.tarryingly = "panellings" ;

                      SplashActivity.tapisser = "";
}
}



}



}
 else if 
 ( SplashActivity.tapisser == null
 &&  SplashActivity.guller 
) 
 {        if ( SplashActivity.oscillatoria == null
 && SplashActivity.electroacoustically > SplashActivity.electroacoustically

) {
                    if ( SplashActivity.pastes != null && 7 < SplashActivity.electroacoustically
) {
                    if (SplashActivity.electroacoustically == 4

) {
                    if ( SplashActivity.calorifier != null) {
                    SplashActivity.thetis = true;

                     SplashActivity.calorifier = "brontosaur" ;

                      SplashActivity.electroacoustically -= 13;
}

            } else {
                    SplashActivity.landiron++;
}




            } else {
                    if ( SplashActivity.tarryingly != null || SplashActivity.landiron == SplashActivity.electroacoustically
) {
                    SplashActivity.nerts = false;

                     SplashActivity.inspirational = "";

                      SplashActivity.electroacoustically = 8;
}
}




            } else {
                    if ( SplashActivity.pastes .toLowerCase().isEmpty()  || SplashActivity.electroacoustically <= 9

) {
                    SplashActivity.thetis = false;

                     SplashActivity.oscillatoria = "";

                      SplashActivity.nerts = false;
}
}



} 
 else 
 {
 if (SplashActivity.electroacoustically < 3

 && SplashActivity.electroacoustically <= 14

) 
 {
 if (SplashActivity.landiron > SplashActivity.electroacoustically
 || 10 < SplashActivity.landiron
) 
 {        if ( SplashActivity.oscillatoria == null
 && SplashActivity.landiron > SplashActivity.landiron
) {
                    SplashActivity.thetis = false;

            } else {
                    SplashActivity.inspirational = "";
}



}
 else if 
 (SplashActivity.electroacoustically < SplashActivity.landiron
) 
 {        SplashActivity.guller =  true;
} 
 else 
 {        ++SplashActivity.electroacoustically;
}

}
 else if 
 ( SplashActivity.oscillatoria != null ||  SplashActivity.oscillatoria != null) 
 {        if ( SplashActivity.tankful 
) {
                    SplashActivity.electroacoustically--;

            } else {
                    SplashActivity.landiron--;
}



} 
 else 
 {        SplashActivity.tankful =  true;
}

}

        if (SplashActivity.electroacoustically <= 4

) {
                    if ( SplashActivity.inspirational == null
) {
                    SplashActivity.tankful = false;

             
 if ( SplashActivity.inspirational == null
 &&  SplashActivity.pastes == null
) 
 {        if (10 < SplashActivity.landiron
) {
                    if ( SplashActivity.guller 
) {
                    SplashActivity.landiron++;

            } else {
                    SplashActivity.faveolate = false;
}




            } else {
                    SplashActivity.electroacoustically++;
}



}
 else if 
 ( SplashActivity.tapisser != null &&  SplashActivity.thetis 
) 
 {
 if (! SplashActivity.nerts 
 || SplashActivity.landiron < 6

) 
 {        SplashActivity.tarryingly = "zwitterionic" ;
}
 else if 
 (2 <= SplashActivity.landiron
 || SplashActivity.landiron < SplashActivity.landiron

) 
 {        SplashActivity.landiron = 7;
} 
 else 
 {        SplashActivity.tapisser = "arithmancy" ;
}

} 
 else 
 {        SplashActivity.thetis = false;
}


                      if (SplashActivity.landiron <= SplashActivity.electroacoustically
 || ! SplashActivity.nerts 
) {
            
 if (3 > SplashActivity.electroacoustically
) 
 {        SplashActivity.pastes = "aloid" ;
}
 else if 
 ( SplashActivity.pastes == null
) 
 {        SplashActivity.tarryingly = "";
} 
 else 
 {        SplashActivity.faveolate = true;
}


                     SplashActivity.guller = true;

                      SplashActivity.tarryingly = "berglet" ;
}
}

            } else {
                    if ( SplashActivity.tapisser == null
 &&  SplashActivity.pastes .intern().isEmpty() ) {
                    if (SplashActivity.landiron != 5

 && 9 != SplashActivity.electroacoustically
) {
            
 if ( SplashActivity.faveolate 
) 
 {        if ( SplashActivity.calorifier != null) {
                    SplashActivity.electroacoustically = 4;

                     SplashActivity.calorifier = "";

                      SplashActivity.landiron = 6;        

}
}
 else if 
 ( SplashActivity.inspirational == null
) 
 {        SplashActivity.guller = false;
} 
 else 
 {        SplashActivity.oscillatoria = "";
}


            } else {
                    if ( SplashActivity.oscillatoria == null
 ||  SplashActivity.oscillatoria .isEmpty() ) {
                    SplashActivity.nerts = false;

            } else {
                    SplashActivity.thetis = true;
}



}




            } else {
            
 if (! SplashActivity.nerts 
) 
 {        if ( SplashActivity.oscillatoria != null ||  SplashActivity.tapisser != null) {
                    SplashActivity.tankful = false;

            } else {
                    SplashActivity.tarryingly = "";
}



}
 else if 
 (SplashActivity.electroacoustically <= SplashActivity.electroacoustically
 &&  SplashActivity.tapisser == null
) 
 {        SplashActivity.tankful = true;
} 
 else 
 {        SplashActivity.faveolate = false;
}

}



}




         
    }

     
    public  void cleuks(String s7Var, int v8cgj) {
        
 if (! SplashActivity.oscillatoria .equals("unicamerate") ) 
 {        if (SplashActivity.landiron <= SplashActivity.electroacoustically

) {
                    SplashActivity.landiron = 13;        


                     if (SplashActivity.electroacoustically < 8

 &&  SplashActivity.tarryingly == null
) {
                    if ( SplashActivity.oscillatoria == null
 &&  s7Var .contains("tightest") ) {
                    if ( SplashActivity.faveolate 
) {
                    s7Var = "Pollyannaish" ;

            } else {
                    SplashActivity.nerts = true;
}




                     v8cgj++;

                      SplashActivity.faveolate =  true;
}

            } else {
                    if (v8cgj > 13

) {
                    SplashActivity.electroacoustically = 10;

                     SplashActivity.electroacoustically = 11;

                      s7Var = "";
}
}




                      if ( SplashActivity.faveolate 
 ||  SplashActivity.thetis 
) {
                    if (! s7Var .contains("palaeocosmology") ) {
                    SplashActivity.inspirational = "interfrontal" .trim();

                     SplashActivity.thetis = ! true;

                      v8cgj = 9;        

}

            } else {
                    v8cgj++;
}



}
}
 else if 
 ( SplashActivity.tarryingly == null
 &&  SplashActivity.pastes .isEmpty() ) 
 {
 if (SplashActivity.landiron < SplashActivity.electroacoustically

) 
 {        if (SplashActivity.electroacoustically != v8cgj

 &&  SplashActivity.inspirational == null
) {
                    if ( SplashActivity.inspirational != null ||  SplashActivity.oscillatoria .intern().isEmpty() ) {
                    if (! SplashActivity.faveolate 
 &&  SplashActivity.calorifier == null
) {
                    SplashActivity.tankful =  true;

                     SplashActivity.tankful =  false;

                      SplashActivity.landiron = 11;
}

            } else {
                    SplashActivity.tapisser = "Wilkommenn" ;
}




                     if ( s7Var == null
 && v8cgj == v8cgj
) {
                    v8cgj = 10;        


                     SplashActivity.faveolate = true;

                      ++v8cgj;
}

                      s7Var = "skeined" ;
}
}
 else if 
 (! SplashActivity.thetis 
) 
 {
 if ( SplashActivity.pastes != null) 
 {
 if ( SplashActivity.calorifier != null ||  SplashActivity.oscillatoria != null) 
 {        SplashActivity.tapisser = "";
}
 else if 
 ( s7Var != null) 
 {        SplashActivity.guller = false;
} 
 else 
 {        SplashActivity.tankful =  true;
}

}
 else if 
 (! s7Var .equals("characteristics")  &&  s7Var != null) 
 {        SplashActivity.tankful = ! false;
} 
 else 
 {        s7Var = "Tarkington" ;
}

} 
 else 
 {        if ( s7Var == null
) {
                    s7Var = "Kenweigh" ;

                     SplashActivity.electroacoustically--;

                      SplashActivity.nerts =  false;
}
}

} 
 else 
 {        if (SplashActivity.landiron > v8cgj
 ||  SplashActivity.tankful 
) {
            
 if (SplashActivity.landiron > SplashActivity.electroacoustically
 &&  s7Var == null
) 
 {        if ( s7Var .contains(SplashActivity.calorifier) ) {
                    v8cgj = 9;

            } else {
                    ++v8cgj;
}



}
 else if 
 ( s7Var == null
 && v8cgj <= v8cgj
) 
 {        ++v8cgj;
} 
 else 
 {        SplashActivity.guller = ! false;
}


            } else {
            
 if ( s7Var == null
 &&  SplashActivity.oscillatoria .contains(SplashActivity.pastes) ) 
 {        SplashActivity.nerts =  true;
}
 else if 
 ( SplashActivity.tapisser != null && ! SplashActivity.faveolate 
) 
 {        SplashActivity.thetis =  false;
} 
 else 
 {        SplashActivity.thetis = ! false;
}

}



}


 if ( s7Var != null && v8cgj > SplashActivity.electroacoustically
) 
 {        SplashActivity.pastes = "botty" ;
}
 else if 
 ( SplashActivity.thetis 
) 
 {        if ( SplashActivity.pastes != null ||  s7Var != null) {
                    if (SplashActivity.landiron < v8cgj
 ||  SplashActivity.oscillatoria == null
) {
                    if ( s7Var .equals(s7Var) ) {
                    if ( SplashActivity.calorifier != null ||  SplashActivity.nerts 
) {
                    SplashActivity.tarryingly = "";

            } else {
                    SplashActivity.tapisser = "bibliomanian" ;
}




            } else {
                    --SplashActivity.electroacoustically;
}




            } else {
                    SplashActivity.inspirational = "";
}




                     SplashActivity.pastes = "";

                      if ( SplashActivity.tapisser .equals(s7Var) ) {
                    ++v8cgj;

                     s7Var = "noncontemporaneousness" ;

                      SplashActivity.pastes = "wardman" ;
}
}
} 
 else 
 {        if (v8cgj == SplashActivity.landiron
) {
                    if (SplashActivity.electroacoustically == v8cgj

 ||  SplashActivity.oscillatoria == null
) {
                    v8cgj = 7;

                     ++SplashActivity.electroacoustically;

                      SplashActivity.calorifier = "";
}

            } else {
                    v8cgj = 1;
}



}

        SplashActivity.inspirational = "";
        SplashActivity.calorifier = "Ardyth" ;

         
    }

     
    public  void readvance(boolean QNgqG, boolean c6Wkt, String w1y1m) {
        
         
    }

     
    public  void monopolizations(String lSRoj, boolean kML15, String M7xx9) {
                SplashActivity.electroacoustically--;

         
    }

     }


