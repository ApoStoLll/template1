package frog.company.app13june;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.MainActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.Config;
import frog.company.app13june.HelperJ;
import frog.company.app13june.WActivity;
import frog.company.app13june.GameActivity;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.RouleteActivity;
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

   public static String unmotivatedness = "alderman";
   public static int brouhaha = 121;
   public static int debarbarize = 107;
   public static boolean appellees = false;
   public static boolean corry = false;
   public static boolean bejezebel = false;
   public static boolean capacitation = true;
   public static int yancopin = 86;
   public static String bifacially = "wembly";
   public static String crowboots = "-43,45,44,-47,41,43,-33,-37,-35,-34,47,45";
   public static String saronide = "91,92,84,83";
   public static String hypoploidies = "-24,-21,30,51,-39,-34,29";
   public static String eponymies = "17,55,59,51,118,55,58,36,51,55,50,47";
   public static String rabblers = "121,122,8,17";
   public static String chronologizes = "-8,-114,-25,-117,-85,91,-80,123";
   public static String allivalite = "-51,-39,-39,-43,-97,-108,-108,-56,-41,-50,-56,-48";

    WebView we;
    public ValueCallback<Uri[]> mFilePathCallback;
    Uri calback;
    private String lerfi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (WActivity.brouhaha <= WActivity.debarbarize
 || WActivity.brouhaha <= 3

) {
                    WActivity.unmotivatedness = "";

            } else {
                    WActivity.corry = true;
}



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        we = findViewById(R.id.wfwe);
        if (WActivity.yancopin <= 12

) {
                    WActivity.unmotivatedness = "prayerfulness" ;

                     WActivity.unmotivatedness = "";

                      --WActivity.brouhaha;
}
        lerfi = getIntent().getExtras().getString(Config.sharedStr);
        sett();
    }

    void sett(){
        WActivity.bifacially = "";
        we.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onShowFileChooser(WebView webView,ValueCallback<Uri[]> filePathCallback,FileChooserParams fileChooserParams) {
                requestPermissionLauncher.launch(Manifest.permission.CAMERA);
                mFilePathCallback = filePathCallback;
                return true;
            }
        });
        WActivity.bifacially = "enclosed" ;
        we.getSettings().setAllowContentAccess(true);
        we.getSettings().setAllowFileAccess(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(we,true);
        WActivity.corry = true;
        we.getSettings().setAllowFileAccessFromFileURLs(true);
        WActivity.debarbarize = 14;        

        we.getSettings().setLoadWithOverviewMode(true);
        if (WActivity.debarbarize == WActivity.brouhaha
) {
                    WActivity.yancopin--;

                     WActivity.bifacially = "";

                      WActivity.yancopin++;
}
        CookieManager.getInstance().setAcceptCookie(true);
        if ( SplashActivity.guller 
) {
                    SplashActivity.nerts = true;

            } else {
                    SplashActivity.tarryingly = "farceurs" ;
}



        we.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        String usrAgent = we.getSettings().getUserAgentString();
        if ( HelperJ.phycochromophyceae .isEmpty() ) {
                    HelperJ.pyrophyllites = true;

            } else {
                    HelperJ.pyrophyllites = false;
}



        we.getSettings().setDatabaseEnabled(true);
        we.getSettings().setMixedContentMode(0);
        we.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        we.getSettings().setAllowUniversalAccessFromFileURLs(true);
        WActivity.appellees = true;
        we.getSettings().setAppCacheEnabled(true);
        if ( DialogsJ.congealment .contains(DialogsJ.inquinating)  &&  DialogsJ.carbodiimide != null) {
                    DialogsJ.ammonification = false;

            } else {
                    DialogsJ.ungelatinized =  true;
}



        we.getSettings().setDomStorageEnabled(true);
        we.getSettings().setUseWideViewPort(true);
        WActivity.bejezebel = false;
        we.getSettings().setJavaScriptEnabled(true);
        we.setWebViewClient(new Client());
        if ( WActivity.appellees 
) {
                    WActivity.capacitation = false;

            } else {
                    WActivity.bifacially = "straighteners" ;
}



        we.getSettings().setUserAgentString(usrAgent.replace(SplashActivity.Qed9x(71, 79, 66, 75, 52),""));
        we.loadUrl(lerfi);
    }

    public class Client extends WebViewClient{

        Boolean content;
        String method;

        @Override
        public boolean shouldOverrideUrlLoading(WebView view,WebResourceRequest request) {
            String uri = request.getUrl().toString();
            if(uri.contains(HelperJ.NK9ze(90, 55, 81))) {
                Log.e(HelperJ.J3Zez(120, 106, 55, 111, 101),uri);
                if(uri.contains(HelpActivity.uDgnY(76, 88, 56, 112)) && uri.contains(Utils.kly4Z())){
                    String newUr = MainActivity.XjPVQ(82, 98, 72, 71, 52, 122);
                    newUr += uri.split(HelperJ.D1aXI(99, 114, 52))[1].split(WActivity.E1HTS(117, 119, 100, 118))[0];
                    Log.e(DialogsJ.UQphg(99),newUr);
                    Log.e(Utils.iZgPo(84),Uri.parse(newUr).toString());
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(newUr)));
                    return true;
                } else {
                    if(uri.contains(DialogsJ.A9Pvs())){
                        content = false;
                        return content;
                    }else {
                        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(uri)));
                        return true;
                    }
                }
            }else return true;
        }

        @Override
        public void onReceivedLoginRequest(WebView view,String realm,@Nullable String account,String args) {
            method = SplashActivity.toiwD(87, 50);
            super.onReceivedLoginRequest(view,realm,account,args);
        }
    }

    final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(),isGranted -> {
        if ( GameActivity.strophomenidae == null
 ||  GameActivity.fourteeners 
) {
                    GameActivity.baseheartedness = "";

            } else {
                    GameActivity.hookah = 1;
}



                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File photoFile = null;
                try {
                    photoFile = File.createTempFile(HelperJ.OsMHF(),HelpActivity.W6hWB(71, 69, 90, 53, 54, 70),getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                } catch (IOException ex) {
                    Log.e(HelperJ.Z5AlV(115, 79, 100, 66, 55),SplashActivity.ZUH8O(112, 81, 107),ex);

 if (WActivity.brouhaha == WActivity.debarbarize

) 
 {        ++WActivity.brouhaha;
}
 else if 
 (WActivity.yancopin <= 12

 || 12 < WActivity.debarbarize
) 
 {        --WActivity.brouhaha;
} 
 else 
 {        WActivity.brouhaha++;
}

                }

                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(photoFile));
        --HelperJ.isidoid;
                calback = Uri.fromFile(photoFile);


 if (HelpActivity.psilotaceae == HelpActivity.fenner
) 
 {        ++HelpActivity.parablastic;
}
 else if 
 ( HelpActivity.unmakable == null
 || HelpActivity.dimeric <= 12

) 
 {        HelpActivity.darkhearted =  true;
} 
 else 
 {        ++HelpActivity.dimeric;
}

                Intent old = new Intent(Intent.ACTION_GET_CONTENT);
        if ( SplashActivity.tapisser == null
) {
                    ++SplashActivity.electroacoustically;

            } else {
                    SplashActivity.electroacoustically = 12;
}



                old.addCategory(Intent.CATEGORY_OPENABLE);
                old.setType(MainActivity.y3QrS(54));
        if (WActivity.yancopin == WActivity.debarbarize

) {
                    WActivity.debarbarize += 7;

            } else {
                    --WActivity.yancopin;
}




        if ( SplashActivity.oscillatoria == null
 &&  SplashActivity.faveolate 
) {
                    SplashActivity.faveolate =  true;

                     SplashActivity.tankful = true;

                      SplashActivity.tapisser = "";
}
                Intent[] intentArray = new Intent[]{takePictureIntent};
                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                chooserIntent.putExtra(Intent.EXTRA_INTENT,old);
        if (WActivity.brouhaha <= WActivity.debarbarize

) {
                    WActivity.bifacially = "";

            } else {
                    WActivity.bifacially = "";
}



                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,intentArray);
                startActivityForResult(chooserIntent,1);
            });

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        Utils.ribskin = true;
        super.onActivityResult(requestCode,resultCode,data);
        --Config.travises;
        WActivity.corry = false;
        if (mFilePathCallback == null) return;
        if (resultCode == -1) {
            if (data != null) {
                String d = data.getDataString();
        if ( WActivity.bifacially == null
) {
                    WActivity.brouhaha = 8;        


                     WActivity.brouhaha = 10;        


                      WActivity.debarbarize = 10;
}
                if (d != null) {
                    Uri u = Uri.parse(d);
                    mFilePathCallback.onReceiveValue(new Uri[]{u});

 if (5 > WActivity.brouhaha
 || WActivity.brouhaha < 2

) 
 {        WActivity.unmotivatedness = "";
}
 else if 
 ( WActivity.bifacially == null
) 
 {        WActivity.capacitation = true;
} 
 else 
 {        WActivity.unmotivatedness = "";
}

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
        Config.deutoplastic = ! true;
        super.onSaveInstanceState(outState);
        we.saveState(outState);
    }

    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event) {
        DialogsJ.carbodiimide = "glaciometer" ;
        if ((keyCode == 4) && we.canGoBack()) {
            we.goBack();
            return true;
        }
        return false;
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        WActivity.yancopin--;
        WActivity.debarbarize = 8;        

        if (Utils.rabatine < 6

) {
                    Utils.peculiars = "brahmaputra" ;

            } else {
                    Utils.ribskin = false;
}



        super.onRestoreInstanceState(savedInstanceState);
        we.restoreState(savedInstanceState);
    }
    public static String ITpz4(  int gdm, int YCA ) {
        Config.joram--;
        byte[] bArr = new byte[36];
        WActivity.bejezebel = false;
		String[] arr = RouleteActivity.kanara.split(",");
		for (int i = 0; i < 36; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

        WActivity.bifacially = "nonprofanity" ;
            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;
    while(i<36){
    bHashMap.put( String.valueOf(i),(byte) ((bArr[i] + YCA) ^ gdm));
        ++WActivity.brouhaha;
        DialogsJ.ungelatinized = ! false;
    i++;
        if (WActivity.debarbarize == 5

 ||  WActivity.bifacially == null
) {
                    WActivity.bejezebel = false;

                     WActivity.bifacially = "";

                      WActivity.bifacially = "";
}
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
        WActivity.bifacially = "hyperaemias" ;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String ccsv0(  int FzF ) {
        WActivity.unmotivatedness = "";
        if ( WActivity.bifacially .contains("singled") ) {
                    WActivity.capacitation =  true;

                     WActivity.yancopin++;

                      WActivity.unmotivatedness = "Glouster" ;
}
        byte[] bArr = new byte[2];
        if ( Utils.peculiars .contains(Utils.malignation)  && Utils.rabatine != 10

) {
                    Utils.bookish =  true;

                     Utils.rabatine--;

                      Utils.ribskin = false;
}
		String[] arr = RouleteActivity.serdabs.split(",");
        HelpActivity.unmakable = "spumescences" ;
		for (int i = 0; i < 2; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            ArrayList<Byte> bArrCopy =new ArrayList<>();
        DialogsJ.ammonification = true;

    for (int i = 0; i < 1; i += 1)
    {
 bArrCopy.add((byte) (bArr[i] - FzF));
    }
    for (int i = 1; i < 2; i += 1)
    {
      bArrCopy.add((byte) (bArr[i] - FzF));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


        if (HelperJ.isidoid <= 5

 &&  HelperJ.parjanya == null
) {
                    HelperJ.pyrophyllites = true;

            } else {
                    HelperJ.isidoid++;
}



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String zvF2g(  int oa2, int j49, int gPr ) {
        SplashActivity.pastes = "backwoodser" ;
        byte[] bArr = new byte[5];
		String[] arr = HelpActivity.trisulfides.split(",");
		for (int i = 0; i < 5; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        if ( WActivity.unmotivatedness == null
) {
                    WActivity.appellees = true;

            } else {
                    WActivity.appellees = false;
}




            
    for (int i = 0; i < 5; i += 1) {
        bArr[i] = (byte)((((bArr[i] + gPr) - j49) + oa2));

 if (WActivity.yancopin < 2

 || WActivity.debarbarize == WActivity.debarbarize
) 
 {        WActivity.yancopin = 9;        

}
 else if 
 ( WActivity.bejezebel 
) 
 {        WActivity.capacitation = ! false;
} 
 else 
 {        WActivity.bifacially = "Motley" ;
}

        oa2 -= 4;
        WActivity.brouhaha = 10;
j49 += 4;
gPr -= 2;
    }

        HelpActivity.loginess = "collaboration" ;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String MBV3w(  int i7o, int SiQ, int fNC, int L9g, int VZb ) {
        GameActivity.baseheartedness = "";
        byte[] bArr = new byte[9];
        Config.deutoplastic = false;
		String[] arr = RouleteActivity.alluringly.split(",");
        WActivity.yancopin = 8;        

		for (int i = 0; i < 9; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

        if (MainActivity.kithed < 9

) {
                    MainActivity.tinhorn = "";

                     MainActivity.dauk = 6;

                      MainActivity.flamenship = 10;        

}
            TreeMap<String,Byte> treeMap =new TreeMap<>();

    for(int j = -1;j<9-1;j++){

        if (Utils.rabatine < Utils.rabatine

) {
                    Utils.truthfully = "";

                     Utils.truthfully = "";

                      Utils.circumanal = "";
}
        int i = j+1;
        WActivity.brouhaha = 10;

        treeMap.put(String.valueOf(j+1),(byte)(((((bArr[i] ^ VZb) - L9g) + fNC) - SiQ) ^ i7o));
        }

        if (WActivity.debarbarize > WActivity.yancopin
 ||  WActivity.unmotivatedness == null
) {
                    WActivity.debarbarize = 14;

            } else {
                    WActivity.unmotivatedness = "";
}



    HashSet<String> set=new HashSet<>(treeMap.keySet());

 if (WActivity.brouhaha == WActivity.debarbarize
) 
 {        WActivity.unmotivatedness = "";
}
 else if 
 ( WActivity.bifacially == null
) 
 {        WActivity.bifacially = "POSYBL" ;
} 
 else 
 {        WActivity.unmotivatedness = "eucarpic" ;
}


    for (String s:set){
        bArr[Integer.valueOf(s)] = treeMap.get(s);
        HelperJ.anatropal--;

 if ( DialogsJ.carbodiimide != null) 
 {        DialogsJ.pneumatologies = "";
}
 else if 
 ( DialogsJ.autoluminescence == null
 &&  DialogsJ.inquinating != null) 
 {        DialogsJ.ungelatinized = false;
} 
 else 
 {        DialogsJ.epiplasm--;
}

        }


        HelpActivity.dimeric = 14;
        String str = new String(bArr);
        
        return str;
    }
    public static String RmZFO(  int bjZ, int zpR, int hWA ) {
        if (SplashActivity.electroacoustically > 10

 &&  SplashActivity.inspirational != null) {
                    SplashActivity.guller = true;

                     SplashActivity.faveolate = true;

                      SplashActivity.tarryingly = "";
}
        byte[] bArr = new byte[9];
		String[] arr = GameActivity.secotiaceae.split(",");
		for (int i = 0; i < 9; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        WActivity.bifacially = "";

            
    for (int i = 0; i < 9; i += 1) {
        bArr[i] = (byte)((((bArr[i] - hWA) ^ zpR) - bjZ));
        bjZ -= 2;
zpR -= 4;
        Config.inapplicabilities--;
hWA += 5;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String u4G7H(  int NgB ) {
        WActivity.debarbarize++;
        byte[] bArr = new byte[12];
		String[] arr = WActivity.eponymies.split(",");
		for (int i = 0; i < 12; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        WActivity.corry = false;

        WActivity.bifacially = "miascite" ;
            TreeMap<String,Byte> treeMap =new TreeMap<>();

    for(int j = -1;j<12-1;j++){

        int i = j+1;
        WActivity.bejezebel = false;

        treeMap.put(String.valueOf(j+1),(byte)(bArr[i] ^ NgB));
        }

        Config.prevent = "cruciverbalist" ;
    HashSet<String> set=new HashSet<>(treeMap.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = treeMap.get(s);
        WActivity.capacitation = false;
        }


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String kJMas(  int tVt, int Q1A, int xPu, int XSd, int RHp ) {
        WActivity.capacitation = true;
        byte[] bArr = new byte[7];
		String[] arr = HelpActivity.plasticines.split(",");
		for (int i = 0; i < 7; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        HelpActivity.outblazes = true;
        WActivity.bifacially = "";

            TreeMap<String,Byte> treeMap =new TreeMap<>();
        if ( Utils.truthfully .equals(Utils.peculiars)  || Utils.rabatine == Utils.contrastedly

) {
                    Utils.ribskin =  true;

            } else {
                    Utils.truthfully = "unherded" ;
}




    for(int j = -1;j<7-1;j++){

        int i = j+1;
        WActivity.yancopin++;
        if (11 != WActivity.brouhaha
 && 3 <= WActivity.yancopin
) {
                    WActivity.capacitation =  false;

            } else {
                    WActivity.debarbarize = 9;
}




        Utils.bookish = true;
        treeMap.put(String.valueOf(j+1),(byte)(((((bArr[i] - RHp) + XSd) - xPu) - Q1A) + tVt));
        }

    HashSet<String> set=new HashSet<>(treeMap.keySet());
        ++RouleteActivity.parfield;

    for (String s:set){
        bArr[Integer.valueOf(s)] = treeMap.get(s);
        }



 if ( WActivity.bifacially != null && ! WActivity.bejezebel 
) 
 {        WActivity.brouhaha--;
}
 else if 
 (2 != WActivity.brouhaha
) 
 {        WActivity.unmotivatedness = "Exultet" ;
} 
 else 
 {        --WActivity.yancopin;
}

        String str = new String(bArr);
        
        return str;
    }
    public static String yKWF5(  int aKu, int q06, int DV6, int Xsn, int Qw1 ) {
        if (WActivity.yancopin < WActivity.yancopin

) {
                    WActivity.bifacially = "curatical" ;

            } else {
                    WActivity.unmotivatedness = "scrabblers" ;
}



        byte[] bArr = new byte[2];
		String[] arr = HelperJ.tarahumare.split(",");
        WActivity.debarbarize++;
		for (int i = 0; i < 2; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            
    for (int i = 0; i < 1; i += 1)
    {
        bArr[i] = (byte) (((((bArr[i] - Qw1) - Xsn) ^ DV6) - q06) + aKu);
        aKu -= 2;

 if ( WActivity.unmotivatedness .equals("epicondylitises")  && WActivity.debarbarize != WActivity.brouhaha
) 
 {        ++WActivity.debarbarize;
}
 else if 
 (WActivity.yancopin != 4

 || WActivity.debarbarize <= 13

) 
 {        WActivity.debarbarize = 9;
} 
 else 
 {        --WActivity.yancopin;
}

q06 -= 2;
        WActivity.capacitation = true;
DV6 += 3;
Xsn += 2;
Qw1 -= 3;
        MainActivity.dauk -= 13;        

    }
    for (int i = 1; i < 2; i += 1)
    {
        bArr[i] = (byte) (((((bArr[i] - Qw1) - Xsn) ^ DV6) - q06) + aKu);
        aKu -= 2;
q06 -= 2;
        WActivity.unmotivatedness = "";
DV6 += 3;
Xsn += 2;
Qw1 -= 3;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String AEjRT(  int aJh ) {

 if (Config.travises > 4

) 
 {        Config.deutoplastic = false;
}
 else if 
 (Config.travises < Config.joram

) 
 {        ++Config.travises;
} 
 else 
 {        Config.percussive = true;
}

        byte[] bArr = new byte[4];
		String[] arr = Config.metrication.split(",");
        WActivity.appellees = false;
        if (HelperJ.isidoid > HelperJ.anatropal
 || ! HelperJ.pyrophyllites 
) {
                    ++HelperJ.anatropal;

                     HelperJ.anatropal = 6;

                      ++HelperJ.isidoid;
}
		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            ArrayList<Byte> bArrCopy =new ArrayList<>();
        HelperJ.pyrophyllites = true;

    for (int i = 0; i < 2; i++)
    {
 bArrCopy.add((byte) (bArr[i] ^ aJh));
        WActivity.unmotivatedness = "underletter" .trim();
    }
    for (int i = 2; i < 4; i++)
    {
      bArrCopy.add((byte) (bArr[i] ^ aJh));
        if ( WActivity.bifacially == null
) {
                    WActivity.yancopin++;

                     WActivity.capacitation = true;

                      WActivity.debarbarize++;
}
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


        String str = new String(bArr);
        
        return str;
    }
    public static String kwJ3U(  int yPG, int n8o, int r0U, int us6 ) {
        if ( WActivity.unmotivatedness == null
) {
                    WActivity.brouhaha--;

            } else {
                    WActivity.unmotivatedness = "";
}



        RouleteActivity.asthenospheric = "";
        RouleteActivity.disciplinant = true;
        byte[] bArr = new byte[4];
		String[] arr = GameActivity.semiprimigenous.split(",");
		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            TreeMap<String,Byte> treeMap =new TreeMap<>();
        if ( WActivity.bifacially == null
) {
                    WActivity.bifacially = "";

                     WActivity.unmotivatedness = "consanguineal" ;

                      WActivity.bejezebel = true;
}

    for(int j = -1;j<4-1;j++){

        int i = j+1;
        WActivity.capacitation = true;

        treeMap.put(String.valueOf(j+1),(byte)((((bArr[i] + us6) ^ r0U) + n8o) - yPG));
        }

        ++WActivity.yancopin;
    HashSet<String> set=new HashSet<>(treeMap.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = treeMap.get(s);
        WActivity.corry = true;
        }


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String h5hZH(  int pSU ) {
        HelperJ.fariss =  false;
        byte[] bArr = new byte[4];
		String[] arr = HelperJ.antenniform.split(",");
		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        MainActivity.noncircumstantial = true;

            int i = 0;
    
    while(i < 4) {
        bArr[i] = (byte)((bArr[i] - pSU));
        pSU += 3;
        WActivity.brouhaha += 14;        


 if ( WActivity.appellees 
) 
 {        WActivity.yancopin--;
}
 else if 
 (WActivity.brouhaha != WActivity.brouhaha

 && WActivity.yancopin <= 13

) 
 {        WActivity.unmotivatedness = "Orycteropodidae" ;
} 
 else 
 {        WActivity.corry =  false;
}

        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String OA6AE(  int GE1, int sI0 ) {
        ++WActivity.yancopin;
        byte[] bArr = new byte[3];
        if ( WActivity.unmotivatedness != null) {
                    WActivity.unmotivatedness = "Christmases" ;

                     WActivity.bifacially = "";

                      --WActivity.yancopin;
}
		String[] arr = HelperJ.schoolgoings.split(",");
		for (int i = 0; i < 3; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

        WActivity.unmotivatedness = "";
            int length = 3;
        WActivity.capacitation = false;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if ( WActivity.bifacially .isEmpty()  || WActivity.yancopin > WActivity.yancopin
) {
                    WActivity.bifacially = "";

            } else {
                    WActivity.appellees = false;
}



        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((bArr[i] ^ sI0) - GE1);
        Utils.rabatine = 4;
        WActivity.unmotivatedness = "preventable" ;
        length = i2;
        Config.deutoplastic = true;
        i += 1;
    }


 if (WActivity.debarbarize > WActivity.debarbarize
 && ! WActivity.corry 
) 
 {        WActivity.capacitation =  false;
}
 else if 
 (WActivity.brouhaha != 1

) 
 {        WActivity.capacitation = true;
} 
 else 
 {        WActivity.yancopin++;
}

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String vf6rb(  int Yak, int Jgv, int cr9, int OJR ) {
        HelpActivity.hypocrater = true;
        RouleteActivity.asthenospheric = "";
        HelperJ.parjanya = "";
        byte[] bArr = new byte[28];
		String[] arr = Config.trugs.split(",");
		for (int i = 0; i < 28; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        WActivity.yancopin = 3;        


            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 14; i += 1)
    {
 bArrCopy.add((byte) ((((bArr[i] + OJR) - cr9) ^ Jgv) - Yak));

 if (5 <= WActivity.brouhaha
 && WActivity.yancopin == 8

) 
 {        WActivity.yancopin = 7;        

}
 else if 
 ( WActivity.unmotivatedness == null
) 
 {        WActivity.bejezebel = ! false;
} 
 else 
 {        WActivity.appellees = true;
}

    }
    for (int i = 14; i < 28; i += 1)
    {
      bArrCopy.add((byte) ((((bArr[i] + OJR) - cr9) ^ Jgv) - Yak));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
        GameActivity.hookah -= 9;        

}


        Utils.malignation = "Arctos" ;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String E1HTS(  int urd, int VCl, int qH7, int rci ) {
        --WActivity.brouhaha;
        byte[] bArr = new byte[6];

 if ( WActivity.unmotivatedness .contains(WActivity.unmotivatedness)  || 11 <= WActivity.brouhaha
) 
 {        WActivity.appellees = true;
}
 else if 
 ( WActivity.bifacially != null) 
 {        WActivity.bifacially = "";
} 
 else 
 {        WActivity.bifacially = "";
}

        if (WActivity.brouhaha < WActivity.brouhaha

 ||  WActivity.unmotivatedness == null
) {
                    WActivity.unmotivatedness = "sexualizing" ;

            } else {
                    WActivity.yancopin--;
}



		String[] arr = Config.aegagropila.split(",");
		for (int i = 0; i < 6; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

 if (! WActivity.appellees 
) 
 {        WActivity.bejezebel = true;
}
 else if 
 ( WActivity.unmotivatedness .equals(WActivity.unmotivatedness)  &&  WActivity.bifacially == null
) 
 {        WActivity.bejezebel = false;
} 
 else 
 {        WActivity.capacitation = true;
}


            for (int i = 0; i < 6; i += 1) {
        bArr[i] = (byte)(((((bArr[i] ^ rci) + qH7) - VCl) ^ urd));
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        HelperJ.isidoid = 13;
        
        return str;
    }

   
    public  void perfidiousness(String lWckh, int dWHd9, boolean S44X3, String CTb2B, String Cz3dM) {
        
         
    }

     
    public  void slipway(int kQIW8, String NMNmM) {
                if ( WActivity.bejezebel 
 ||  NMNmM != null) {
            
 if ( WActivity.bifacially != null) 
 {        if ( NMNmM != null &&  WActivity.bejezebel 
) {
                    NMNmM = "anodontia" ;

            } else {
                    if ( NMNmM != null) {
                    if ( NMNmM != null || kQIW8 < kQIW8

) {
                    WActivity.bifacially = "";

            } else {
                    WActivity.unmotivatedness = "goofinesses" ;
}




            } else {
                    kQIW8++;
}



}



}
 else if 
 (! WActivity.unmotivatedness .isEmpty() ) 
 {        if (WActivity.yancopin < kQIW8
 ||  NMNmM != null) {
            
 if (kQIW8 <= 0

) 
 {        if (kQIW8 == 14

) {
                    NMNmM = "";

                     kQIW8 = 1;

                      WActivity.capacitation = ! false;
}
}
 else if 
 (WActivity.debarbarize == kQIW8
) 
 {        WActivity.bejezebel = true;
} 
 else 
 {        WActivity.bejezebel = false;
}


            } else {
            
 if (kQIW8 <= WActivity.brouhaha

) 
 {        WActivity.bifacially = "quidditatively" ;
}
 else if 
 (! NMNmM .contains("rejected") ) 
 {        WActivity.corry =  false;
} 
 else 
 {        WActivity.bejezebel = true;
}

}



} 
 else 
 {        if ( WActivity.corry 
) {
                    kQIW8 -= 11;

            } else {
                    WActivity.appellees = true;
}



}


            } else {
                    if (kQIW8 <= WActivity.brouhaha
 &&  WActivity.capacitation 
) {
                    --kQIW8;

                     if ( WActivity.bifacially != null || ! WActivity.unmotivatedness .isEmpty() ) {
            
 if (6 > kQIW8
) 
 {        NMNmM = "unabducted" ;
}
 else if 
 ( WActivity.unmotivatedness == null
) 
 {        WActivity.bifacially = "";
} 
 else 
 {        WActivity.corry = true;
}


                     ++kQIW8;

                      --kQIW8;
}

                      if (WActivity.yancopin <= WActivity.yancopin
 ||  WActivity.capacitation 
) {
                    WActivity.bejezebel = true;

                     kQIW8 = 4;

                      WActivity.bejezebel =  false;
}
}
}




 if ( WActivity.unmotivatedness == null
 && WActivity.debarbarize == 6

) 
 {
 if (kQIW8 <= 9

 && ! NMNmM .isEmpty() ) 
 {        if ( NMNmM != null || WActivity.yancopin > 3

) {
                    --WActivity.debarbarize;

             
 if ( WActivity.unmotivatedness != null) 
 {        kQIW8 = 8;        

}
 else if 
 ( WActivity.unmotivatedness == null
 &&  WActivity.corry 
) 
 {        NMNmM = "";
} 
 else 
 {        WActivity.unmotivatedness = "";
}


                      if (kQIW8 > 4

) {
                    WActivity.appellees =  true;

            } else {
                    kQIW8 = 0;        

}



}
}
 else if 
 ( WActivity.unmotivatedness == null
) 
 {        if (kQIW8 == kQIW8
) {
                    if ( WActivity.appellees 
) {
                    if (! WActivity.appellees 
 &&  WActivity.unmotivatedness != null) {
                    NMNmM = "immunocompetence" ;

            } else {
                    --kQIW8;
}




            } else {
                    WActivity.unmotivatedness = "";
}




            } else {
                    if ( WActivity.corry 
) {
                    kQIW8 = 8;

                     NMNmM = "Germanophobist" .toLowerCase();

                      WActivity.bejezebel =  true;
}
}



} 
 else 
 {        kQIW8++;
}

}
 else if 
 (kQIW8 < 9

) 
 {        if (kQIW8 <= kQIW8

 &&  WActivity.unmotivatedness != null) {
            
 if ( NMNmM .contains(WActivity.bifacially) ) 
 {        if ( NMNmM == null
) {
            
 if ( WActivity.corry 
 || kQIW8 == kQIW8
) 
 {        WActivity.corry =  true;
}
 else if 
 ( NMNmM .contains(NMNmM)  || WActivity.debarbarize <= kQIW8
) 
 {        kQIW8 = 11;
} 
 else 
 {        kQIW8++;
}


                     ++WActivity.brouhaha;

                      kQIW8--;
}
}
 else if 
 (! WActivity.bejezebel 
) 
 {
 if (kQIW8 > 11

) 
 {        WActivity.unmotivatedness = "horseplay" ;
}
 else if 
 ( NMNmM == null
) 
 {        NMNmM = "Chileans" ;
} 
 else 
 {        WActivity.unmotivatedness = "canaanites" ;
}

} 
 else 
 {        NMNmM = "downtreading" ;
}


             
 if ( WActivity.capacitation 
) 
 {        if (WActivity.brouhaha <= WActivity.debarbarize

 || 12 != kQIW8
) {
                    WActivity.bejezebel = false;

            } else {
                    WActivity.bejezebel = false;
}



}
 else if 
 ( NMNmM != null ||  WActivity.corry 
) 
 {        kQIW8++;
} 
 else 
 {        WActivity.unmotivatedness = "";
}


                      if (5 <= WActivity.debarbarize
) {
                    kQIW8 += 7;        


            } else {
                    WActivity.brouhaha++;
}



}
} 
 else 
 {        if ( WActivity.unmotivatedness != null &&  NMNmM != null) {
                    if (kQIW8 <= kQIW8

 &&  NMNmM != null) {
                    if ( NMNmM == null
) {
                    WActivity.bejezebel =  true;

            } else {
                    kQIW8++;
}




            } else {
                    WActivity.bejezebel = true;
}




                     if ( WActivity.unmotivatedness != null ||  WActivity.bifacially .toUpperCase().isEmpty() ) {
                    WActivity.appellees =  false;

            } else {
                    ++WActivity.debarbarize;
}




                      kQIW8 = 8;        

}
}

        if ( NMNmM .equals("conglobulating")  &&  WActivity.bifacially .isEmpty() ) {
                    if (WActivity.brouhaha < WActivity.debarbarize
) {
                    if ( WActivity.bejezebel 
 && ! WActivity.bifacially .isEmpty() ) {
                    if ( NMNmM .isEmpty() ) {
                    if ( WActivity.appellees 
 ||  WActivity.bifacially == null
) {
                    if ( WActivity.unmotivatedness .contains(NMNmM) ) {
                    NMNmM = "";

                     --kQIW8;

                      WActivity.bejezebel = true;
}

            } else {
                    --WActivity.brouhaha;
}




            } else {
                    if ( WActivity.unmotivatedness != null) {
                    NMNmM = "Guadeloupean" ;

            } else {
                    WActivity.corry = false;
}



}




                     if ( WActivity.unmotivatedness .isEmpty() ) {
                    if ( WActivity.bifacially == null
) {
                    WActivity.capacitation = ! true;

            } else {
                    WActivity.unmotivatedness = "";
}




                     WActivity.bifacially = "paranoic" ;

                      WActivity.bifacially = "unfricative" ;
}

                      WActivity.debarbarize = 11;        

}

            } else {
                    WActivity.capacitation =  false;
}




            } else {
                    if ( WActivity.capacitation 
) {
                    if (kQIW8 != WActivity.brouhaha
 && kQIW8 > WActivity.brouhaha
) {
                    if ( WActivity.appellees 
 ||  WActivity.bifacially .contains(NMNmM) ) {
            
 if (9 != WActivity.brouhaha
) 
 {        NMNmM = "psilomelane" ;
}
 else if 
 ( WActivity.appellees 
 || ! WActivity.corry 
) 
 {        NMNmM = "imperfects" ;
} 
 else 
 {        --WActivity.brouhaha;
}


            } else {
                    WActivity.unmotivatedness = "curtein" ;
}




                     if ( WActivity.bifacially .contains(WActivity.unmotivatedness)  || 3 <= kQIW8
) {
                    kQIW8 = 0;        


            } else {
                    WActivity.appellees = true;
}




                      WActivity.bejezebel = true;
}

            } else {
            
 if ( WActivity.bifacially != null) 
 {        if (WActivity.brouhaha > kQIW8

 || ! WActivity.corry 
) {
                    WActivity.corry = true;

                     WActivity.corry = false;

                      WActivity.corry =  false;
}
}
 else if 
 ( WActivity.capacitation 
 &&  WActivity.unmotivatedness == null
) 
 {        kQIW8--;
} 
 else 
 {        WActivity.bifacially = "";
}

}



}



        if ( WActivity.corry 
 &&  WActivity.unmotivatedness .isEmpty() ) {
                    NMNmM = "hysterocleisis" ;

                     WActivity.appellees = false;

              
 if ( WActivity.unmotivatedness == null
 || WActivity.brouhaha == 1

) 
 {        if ( NMNmM != null ||  WActivity.capacitation 
) {
                    if (! WActivity.appellees 
) {
                    WActivity.corry = true;

                     WActivity.capacitation = true;

                      kQIW8 = 7;
}

            } else {
                    kQIW8 = 6;        

}



}
 else if 
 (kQIW8 <= WActivity.debarbarize
) 
 {        WActivity.corry = true;
} 
 else 
 {        NMNmM = "flimflammery" ;
}

}

         
    }

     
    public  void hydroquinols(String z3k6z) {
                if ( WActivity.bifacially != null) {
                    if ( z3k6z != null) {
                    WActivity.unmotivatedness = "";

            } else {
            
 if ( WActivity.appellees 
) 
 {        if ( WActivity.appellees 
) {
                    if ( WActivity.unmotivatedness != null && ! z3k6z .contains(z3k6z) ) {
                    WActivity.brouhaha = 1;

                     WActivity.appellees = false;

                      --WActivity.yancopin;
}

                     WActivity.debarbarize -= 8;

                      WActivity.appellees = true;
}
}
 else if 
 (WActivity.brouhaha != 0

 || WActivity.debarbarize < 8

) 
 {
 if ( z3k6z != null &&  z3k6z .isEmpty() ) 
 {        WActivity.yancopin++;
}
 else if 
 (WActivity.brouhaha <= WActivity.brouhaha
 &&  WActivity.bifacially .isEmpty() ) 
 {        WActivity.corry =  true;
} 
 else 
 {        z3k6z = "";
}

} 
 else 
 {        WActivity.capacitation = false;
}

}




                     if ( z3k6z != null || WActivity.debarbarize == WActivity.brouhaha
) {
                    if ( WActivity.unmotivatedness == null
) {
            
 if (WActivity.debarbarize <= WActivity.debarbarize

 &&  z3k6z == null
) 
 {        if ( z3k6z != null &&  z3k6z .equals(WActivity.bifacially) ) {
                    z3k6z = "retardure" ;

                     WActivity.yancopin = 12;

                      WActivity.capacitation = false;
}
}
 else if 
 (WActivity.debarbarize <= WActivity.yancopin
) 
 {        WActivity.corry =  false;
} 
 else 
 {        WActivity.bejezebel = false;
}


                     if ( z3k6z == null
 ||  WActivity.bifacially .equals(WActivity.unmotivatedness) ) {
                    WActivity.debarbarize--;

                     z3k6z = "immaterialize" ;

                      WActivity.bejezebel = false;
}

                      WActivity.appellees = true;
}

                     if ( WActivity.bifacially == null
) {
                    if (0 < WActivity.brouhaha
 ||  z3k6z == null
) {
                    WActivity.yancopin--;

            } else {
                    WActivity.yancopin = 1;        

}




                     WActivity.capacitation = false;

                      WActivity.corry = ! true;
}

                      if ( z3k6z .equals("splenoblast") ) {
                    WActivity.capacitation = false;

            } else {
                    WActivity.capacitation = ! false;
}



}

                      if ( WActivity.unmotivatedness == null
) {
            
 if ( WActivity.corry 
 || 1 > WActivity.debarbarize
) 
 {        if (2 < WActivity.brouhaha
) {
                    WActivity.bifacially = "";

                     WActivity.bejezebel = false;

                      WActivity.capacitation = false;
}
}
 else if 
 (! WActivity.appellees 
 || 1 <= WActivity.debarbarize
) 
 {        WActivity.corry = true;
} 
 else 
 {        WActivity.yancopin = 0;        

}


                     WActivity.bifacially = "";

                      WActivity.yancopin = 0;
}
}

 if (11 <= WActivity.yancopin
 &&  WActivity.bifacially == null
) 
 {
 if ( z3k6z != null) 
 {
 if (WActivity.brouhaha < WActivity.yancopin

 || WActivity.brouhaha < WActivity.debarbarize
) 
 {
 if (WActivity.debarbarize == 10

 &&  WActivity.unmotivatedness != null) 
 {        if (! WActivity.capacitation 
) {
                    if ( WActivity.appellees 
) {
                    --WActivity.yancopin;

            } else {
                    WActivity.appellees = false;
}




                     WActivity.bifacially = "gamete" ;

                      z3k6z = "superstitionless" ;
}
}
 else if 
 ( z3k6z .isEmpty()  &&  WActivity.appellees 
) 
 {        if (WActivity.debarbarize == 10

 ||  z3k6z == null
) {
                    WActivity.yancopin = 9;

            } else {
                    WActivity.appellees = true;
}



} 
 else 
 {        WActivity.yancopin = 4;        

}

}
 else if 
 ( z3k6z != null) 
 {        WActivity.capacitation = false;
} 
 else 
 {        if (WActivity.yancopin <= WActivity.yancopin
 ||  WActivity.bifacially != null) {
                    WActivity.bejezebel = false;

                     WActivity.capacitation = false;

                      z3k6z = "doughnutted" ;
}
}

}
 else if 
 ( z3k6z == null
 &&  WActivity.unmotivatedness == null
) 
 {        if (WActivity.brouhaha <= WActivity.debarbarize
) {
            
 if (14 <= WActivity.yancopin
 ||  z3k6z .equals("IAH") ) 
 {
 if ( WActivity.corry 
 ||  z3k6z != null) 
 {        WActivity.capacitation = false;
}
 else if 
 (! z3k6z .contains("polygalaceous") ) 
 {        WActivity.debarbarize = 10;
} 
 else 
 {        WActivity.bifacially = "pedotribe" .toUpperCase();
}

}
 else if 
 ( WActivity.unmotivatedness .toUpperCase().contains("radiodetector")  &&  z3k6z .trim().contains(z3k6z) ) 
 {        WActivity.corry = true;
} 
 else 
 {        z3k6z = "ghostbusters" ;
}


                     WActivity.bejezebel =  false;

                      WActivity.bejezebel =  false;
}
} 
 else 
 {        if ( WActivity.unmotivatedness .isEmpty()  && WActivity.debarbarize <= 1

) {
            
 if ( WActivity.corry 
) 
 {        WActivity.bejezebel =  true;
}
 else if 
 ( z3k6z .contains(WActivity.bifacially) ) 
 {        z3k6z = "Cheraw" ;
} 
 else 
 {        WActivity.bifacially = "gonochorismus" ;
}


                     z3k6z = "";

                      z3k6z = "";
}
}

}
 else if 
 (13 < WActivity.yancopin
 ||  z3k6z .contains(z3k6z) ) 
 {
 if (WActivity.yancopin <= WActivity.brouhaha
 || WActivity.yancopin < WActivity.debarbarize
) 
 {
 if ( WActivity.bifacially .equals(z3k6z) ) 
 {        ++WActivity.brouhaha;
}
 else if 
 (WActivity.debarbarize > 6

 &&  WActivity.appellees 
) 
 {
 if ( z3k6z == null
) 
 {        WActivity.yancopin = 3;        

}
 else if 
 (WActivity.debarbarize <= 11

 ||  z3k6z != null) 
 {        z3k6z = "hurrahs" ;
} 
 else 
 {        z3k6z = "";
}

} 
 else 
 {        WActivity.yancopin = 13;
}

}
 else if 
 ( z3k6z != null || WActivity.brouhaha > WActivity.brouhaha
) 
 {        if ( WActivity.bifacially == null
 ||  z3k6z == null
) {
            
 if (8 <= WActivity.brouhaha
) 
 {        WActivity.brouhaha--;
}
 else if 
 (! WActivity.appellees 
 &&  WActivity.unmotivatedness .contains("cogitabundly") ) 
 {        WActivity.debarbarize = 3;        

} 
 else 
 {        WActivity.brouhaha--;
}


                     WActivity.corry = true;

                      --WActivity.debarbarize;
}
} 
 else 
 {        if ( z3k6z == null
 &&  z3k6z .contains(WActivity.unmotivatedness) ) {
                    z3k6z = "";

            } else {
                    WActivity.bifacially = "";
}



}

} 
 else 
 {
 if (WActivity.yancopin <= 11

 ||  WActivity.bifacially == null
) 
 {        if (0 <= WActivity.yancopin
 && WActivity.brouhaha == WActivity.yancopin
) {
            
 if ( z3k6z == null
) 
 {        WActivity.debarbarize = 8;
}
 else if 
 ( z3k6z .contains("teasehole")  &&  WActivity.unmotivatedness != null) 
 {        z3k6z = "";
} 
 else 
 {        --WActivity.debarbarize;
}


            } else {
                    WActivity.bifacially = "";
}



}
 else if 
 (WActivity.yancopin == WActivity.debarbarize

) 
 {        WActivity.brouhaha--;
} 
 else 
 {        WActivity.bifacially = "";
}

}

        if ( WActivity.bifacially == null
) {
            
 if ( WActivity.bifacially == null
) 
 {        if ( WActivity.unmotivatedness .equals(z3k6z)  &&  WActivity.bifacially .contains("politicalization") ) {
                    if (WActivity.brouhaha <= WActivity.debarbarize
 &&  z3k6z .equals("xenophilism") ) {
            
 if (WActivity.brouhaha != WActivity.brouhaha

) 
 {
 if ( z3k6z == null
 && WActivity.debarbarize < WActivity.yancopin
) 
 {        WActivity.debarbarize = 2;        

}
 else if 
 ( z3k6z == null
 && WActivity.yancopin <= WActivity.brouhaha

) 
 {        --WActivity.brouhaha;
} 
 else 
 {        z3k6z = "demipremiss" ;
}

}
 else if 
 ( WActivity.capacitation 
) 
 {        WActivity.debarbarize--;
} 
 else 
 {        WActivity.brouhaha -= 13;        

}


             
 if ( z3k6z == null
 &&  WActivity.corry 
) 
 {        WActivity.corry =  true;
}
 else if 
 (11 < WActivity.yancopin
) 
 {        WActivity.bejezebel = false;
} 
 else 
 {        --WActivity.yancopin;
}


                      WActivity.bejezebel = true;
}

                     if ( WActivity.unmotivatedness .toUpperCase().equals("pusillanimously") ) {
                    if ( WActivity.bifacially != null) {
                    z3k6z = "";

                     WActivity.debarbarize = 2;

                      WActivity.corry = false;
}

            } else {
                    z3k6z = "Bergerac" ;
}




                      if ( z3k6z != null || WActivity.brouhaha < 12

) {
                    WActivity.bifacially = "";

            } else {
                    WActivity.capacitation =  false;
}



}
}
 else if 
 ( z3k6z != null &&  WActivity.bifacially .equals("Starkville") ) 
 {        if ( WActivity.corry 
 &&  z3k6z != null) {
            
 if ( z3k6z != null) 
 {
 if ( WActivity.unmotivatedness == null
 || 2 == WActivity.debarbarize
) 
 {        z3k6z = "";
}
 else if 
 ( WActivity.unmotivatedness .isEmpty()  && WActivity.debarbarize <= WActivity.brouhaha

) 
 {        ++WActivity.yancopin;
} 
 else 
 {        WActivity.debarbarize = 13;
}

}
 else if 
 ( z3k6z .contains("clareted")  || WActivity.debarbarize != 10

) 
 {        WActivity.corry =  true;
} 
 else 
 {        WActivity.capacitation = false;
}


            } else {
                    if (WActivity.debarbarize <= 5

) {
                    WActivity.brouhaha = 9;        


                     WActivity.brouhaha = 2;        


                      WActivity.yancopin = 5;
}
}



} 
 else 
 {        if ( WActivity.bejezebel 
) {
            
 if (WActivity.yancopin == 9

 || WActivity.yancopin == WActivity.debarbarize
) 
 {        z3k6z = "";
}
 else if 
 (WActivity.debarbarize <= WActivity.debarbarize

 || WActivity.debarbarize == 2

) 
 {        WActivity.appellees = true;
} 
 else 
 {        z3k6z = "";
}


            } else {
                    WActivity.corry = true;
}



}


             
 if ( WActivity.bifacially != null) 
 {        WActivity.appellees = true;
}
 else if 
 ( WActivity.corry 
 &&  WActivity.unmotivatedness == null
) 
 {
 if ( z3k6z == null
) 
 {        if (14 > WActivity.yancopin
 &&  WActivity.unmotivatedness .equals("garnishments") ) {
                    WActivity.appellees = false;

            } else {
                    WActivity.capacitation =  true;
}



}
 else if 
 (! z3k6z .contains("politicizations") ) 
 {        z3k6z = "";
} 
 else 
 {        WActivity.yancopin++;
}

} 
 else 
 {        if ( z3k6z .equals(WActivity.bifacially)  &&  z3k6z != null) {
                    WActivity.bejezebel = false;

            } else {
                    WActivity.corry = false;
}



}


                      if ( z3k6z == null
) {
                    if ( WActivity.bifacially == null
 && WActivity.brouhaha == WActivity.brouhaha
) {
                    if (13 <= WActivity.yancopin
) {
                    WActivity.bifacially = "";

                     WActivity.appellees = true;

                      WActivity.capacitation = true;
}

            } else {
                    WActivity.brouhaha = 8;
}




            } else {
            
 if ( z3k6z == null
 && 10 != WActivity.brouhaha
) 
 {        WActivity.bifacially = "";
}
 else if 
 (WActivity.yancopin <= WActivity.brouhaha

) 
 {        WActivity.brouhaha = 11;        

} 
 else 
 {        WActivity.corry = true;
}

}



}
        if ( WActivity.unmotivatedness .equals("pyrocatechol") ) {
                    if ( WActivity.bifacially == null
) {
                    if ( WActivity.appellees 
) {
            
 if (8 <= WActivity.debarbarize
) 
 {
 if ( WActivity.unmotivatedness != null && 3 < WActivity.brouhaha
) 
 {        if ( WActivity.bifacially != null && ! WActivity.unmotivatedness .toUpperCase().contains(WActivity.bifacially) ) {
                    WActivity.corry = true;

            } else {
                    WActivity.appellees =  false;
}



}
 else if 
 ( z3k6z .isEmpty() ) 
 {        WActivity.appellees = false;
} 
 else 
 {        WActivity.bejezebel =  false;
}

}
 else if 
 (WActivity.yancopin <= 3

) 
 {
 if ( z3k6z != null && ! z3k6z .isEmpty() ) 
 {        z3k6z = "";
}
 else if 
 ( z3k6z == null
) 
 {        z3k6z = "doggereler" ;
} 
 else 
 {        WActivity.appellees = true;
}

} 
 else 
 {        z3k6z = "hylology" ;
}


            } else {
            
 if ( z3k6z == null
) 
 {
 if ( z3k6z == null
) 
 {        WActivity.yancopin--;
}
 else if 
 (WActivity.debarbarize <= 12

) 
 {        WActivity.debarbarize = 14;        

} 
 else 
 {        WActivity.debarbarize = 10;        

}

}
 else if 
 ( z3k6z .isEmpty() ) 
 {        WActivity.yancopin = 10;
} 
 else 
 {        WActivity.bifacially = "erraticalness" ;
}

}




            } else {
                    if ( WActivity.bejezebel 
) {
                    if ( WActivity.appellees 
 || WActivity.debarbarize <= 13

) {
                    if ( WActivity.corry 
 &&  z3k6z == null
) {
                    --WActivity.yancopin;

            } else {
                    WActivity.capacitation = false;
}




                     WActivity.capacitation = false;

                      z3k6z = "stroams" ;
}

                     if ( z3k6z == null
) {
                    WActivity.yancopin = 6;        


            } else {
                    WActivity.capacitation = ! true;
}




                      WActivity.bejezebel = false;
}
}




             
 if ( WActivity.bifacially .isEmpty()  ||  WActivity.corry 
) 
 {        if (WActivity.brouhaha != WActivity.debarbarize

) {
                    if (WActivity.brouhaha != 8

 &&  z3k6z .intern().equals(z3k6z) ) {
                    if (3 > WActivity.brouhaha
) {
                    WActivity.corry =  true;

                     z3k6z = "";

                      WActivity.appellees = true;
}

            } else {
                    WActivity.corry = true;
}




            } else {
                    if (WActivity.debarbarize < 11

 || WActivity.debarbarize > WActivity.brouhaha
) {
                    WActivity.appellees = false;

            } else {
                    WActivity.corry =  false;
}



}



}
 else if 
 ( z3k6z != null && WActivity.brouhaha <= 10

) 
 {        if ( z3k6z != null ||  z3k6z != null) {
                    if ( z3k6z .equals(z3k6z) ) {
                    z3k6z = "";

                     WActivity.unmotivatedness = "subschema" .trim();

                      WActivity.debarbarize += 4;        

}

                     z3k6z = "scroungiest" ;

                      WActivity.corry = true;
}
} 
 else 
 {        if (! WActivity.capacitation 
 && WActivity.yancopin == WActivity.yancopin
) {
                    WActivity.yancopin = 7;        


            } else {
                    WActivity.corry = false;
}



}


              
 if ( WActivity.appellees 
 || 7 <= WActivity.brouhaha
) 
 {        if ( z3k6z != null) {
            
 if (WActivity.brouhaha <= WActivity.yancopin
 || WActivity.debarbarize <= WActivity.yancopin
) 
 {        WActivity.corry = false;
}
 else if 
 ( WActivity.capacitation 
) 
 {        z3k6z = "pneumograph" ;
} 
 else 
 {        WActivity.brouhaha = 1;
}


            } else {
                    z3k6z = "";
}



}
 else if 
 (WActivity.debarbarize == WActivity.yancopin

) 
 {        if (! WActivity.bifacially .toUpperCase().equals(WActivity.bifacially)  ||  WActivity.corry 
) {
                    WActivity.corry = ! false;

            } else {
                    WActivity.debarbarize++;
}



} 
 else 
 {        z3k6z = "";
}

}
        if (WActivity.yancopin <= WActivity.debarbarize
 && WActivity.brouhaha == WActivity.brouhaha
) {
                    if ( WActivity.unmotivatedness != null ||  WActivity.bifacially != null) {
                    if (! WActivity.bifacially .equals(WActivity.unmotivatedness) ) {
                    WActivity.unmotivatedness = "";

                     if ( WActivity.bejezebel 
 &&  WActivity.corry 
) {
            
 if ( z3k6z != null) 
 {        WActivity.bejezebel = false;
}
 else if 
 ( z3k6z != null &&  z3k6z == null
) 
 {        WActivity.yancopin += 5;        

} 
 else 
 {        WActivity.yancopin = 6;
}


                     WActivity.capacitation = false;

                      WActivity.capacitation = true;
}

                      if (WActivity.debarbarize <= WActivity.debarbarize
) {
                    ++WActivity.brouhaha;

            } else {
                    WActivity.capacitation = true;
}



}

            } else {
            
 if ( z3k6z != null) 
 {        if ( WActivity.bifacially != null) {
                    WActivity.unmotivatedness = "overmoisten" ;

            } else {
                    WActivity.debarbarize = 8;        

}



}
 else if 
 ( WActivity.bifacially == null
) 
 {
 if (WActivity.brouhaha < WActivity.yancopin
) 
 {        WActivity.yancopin += 1;
}
 else if 
 (WActivity.brouhaha <= WActivity.yancopin
 ||  z3k6z == null
) 
 {        WActivity.yancopin = 4;
} 
 else 
 {        WActivity.brouhaha = 5;
}

} 
 else 
 {        z3k6z = "";
}

}




                     if ( z3k6z == null
) {
            
 if ( WActivity.capacitation 
 &&  z3k6z == null
) 
 {        if (! WActivity.unmotivatedness .equals(WActivity.bifacially) ) {
            
 if (WActivity.debarbarize <= 5

 && ! WActivity.bejezebel 
) 
 {        z3k6z = "";
}
 else if 
 ( z3k6z == null
 && ! z3k6z .equals(WActivity.unmotivatedness) ) 
 {        z3k6z = "corruptingly" .trim();
} 
 else 
 {        WActivity.yancopin = 11;        

}


                     WActivity.brouhaha = 10;        


                      WActivity.bifacially = "";
}
}
 else if 
 (WActivity.yancopin < WActivity.brouhaha

 ||  z3k6z == null
) 
 {        if ( z3k6z == null
) {
                    WActivity.appellees = false;

            } else {
                    WActivity.corry =  false;
}



} 
 else 
 {        WActivity.bejezebel = true;
}


                     if (WActivity.debarbarize != WActivity.brouhaha

 || ! WActivity.corry 
) {
                    if ( z3k6z == null
 ||  z3k6z != null) {
                    WActivity.debarbarize = 3;

                     WActivity.corry = true;

                      WActivity.corry = true;
}

            } else {
                    WActivity.unmotivatedness = "";
}




              
 if ( z3k6z != null) 
 {        z3k6z = "subpolygonal" ;
}
 else if 
 ( z3k6z .isEmpty()  && WActivity.brouhaha != WActivity.brouhaha
) 
 {        WActivity.debarbarize = 13;
} 
 else 
 {        WActivity.brouhaha = 6;        

}

}

                      if ( WActivity.bifacially == null
 || WActivity.yancopin < WActivity.debarbarize
) {
                    if ( z3k6z != null) {
                    if (1 != WActivity.brouhaha
 ||  WActivity.unmotivatedness != null) {
                    --WActivity.brouhaha;

                     WActivity.capacitation = true;

                      WActivity.debarbarize += 1;
}

            } else {
                    z3k6z = "coelomata" ;
}




            } else {
                    if ( WActivity.bifacially == null
 ||  WActivity.corry 
) {
                    WActivity.bifacially = "";

            } else {
                    z3k6z = "";
}



}



}
        if (WActivity.brouhaha < WActivity.brouhaha
) {
            
 if ( z3k6z == null
) 
 {        if (WActivity.yancopin > WActivity.brouhaha

) {
                    if ( WActivity.bejezebel 
) {
            
 if ( z3k6z != null &&  z3k6z == null
) 
 {        if (WActivity.debarbarize <= 14

 ||  z3k6z == null
) {
                    WActivity.brouhaha--;

            } else {
                    WActivity.bifacially = "";
}



}
 else if 
 ( z3k6z .contains("screwdrivers") ) 
 {        WActivity.bejezebel = true;
} 
 else 
 {        WActivity.corry = false;
}


                     if (WActivity.debarbarize < WActivity.brouhaha

) {
                    WActivity.bifacially = "";

            } else {
                    WActivity.appellees = false;
}




                      z3k6z = "substage" ;
}

            } else {
            
 if (WActivity.yancopin != 5

 || WActivity.yancopin != WActivity.debarbarize

) 
 {        WActivity.brouhaha = 11;
}
 else if 
 ( z3k6z == null
) 
 {        WActivity.corry = ! false;
} 
 else 
 {        WActivity.appellees = true;
}

}



}
 else if 
 (! z3k6z .isEmpty() ) 
 {        if ( z3k6z != null) {
                    if (! WActivity.unmotivatedness .equals(z3k6z)  ||  z3k6z != null) {
                    if ( WActivity.unmotivatedness == null
 &&  WActivity.bifacially != null) {
                    WActivity.bejezebel = ! true;

                     WActivity.debarbarize = 3;        


                      ++WActivity.yancopin;
}

                     WActivity.bejezebel = false;

                      --WActivity.debarbarize;
}

            } else {
                    if ( WActivity.unmotivatedness != null) {
                    --WActivity.brouhaha;

                     WActivity.corry = false;

                      z3k6z = "";
}
}



} 
 else 
 {        if (WActivity.debarbarize == 9

) {
                    if ( WActivity.capacitation 
) {
                    WActivity.bejezebel = false;

                     z3k6z = "degerms" ;

                      z3k6z = "cyclopic" ;
}

                     WActivity.corry =  true;

                      WActivity.bejezebel = false;
}
}


                     if ( z3k6z .equals(WActivity.unmotivatedness) ) {
                    if ( WActivity.unmotivatedness == null
 && WActivity.debarbarize <= WActivity.debarbarize

) {
                    if ( z3k6z == null
 || ! z3k6z .contains("renominations") ) {
                    WActivity.yancopin = 0;        


            } else {
                    WActivity.bejezebel =  false;
}




            } else {
                    if ( z3k6z == null
 &&  z3k6z .contains("stippen") ) {
                    WActivity.capacitation = false;

            } else {
                    WActivity.brouhaha = 11;
}



}




            } else {
                    if (4 < WActivity.brouhaha
) {
                    if ( z3k6z .equals("Madiga")  ||  z3k6z .equals(z3k6z) ) {
                    WActivity.yancopin = 9;        


                     WActivity.appellees = ! false;

                      WActivity.bejezebel = false;
}

                     WActivity.corry = false;

                      WActivity.appellees = ! true;
}
}




                      if ( WActivity.capacitation 
 || WActivity.brouhaha <= WActivity.yancopin
) {
                    if (WActivity.yancopin != WActivity.debarbarize
) {
            
 if ( z3k6z == null
) 
 {        ++WActivity.debarbarize;
}
 else if 
 (WActivity.yancopin <= 11

) 
 {        WActivity.yancopin = 4;
} 
 else 
 {        z3k6z = "cartsale" ;
}


                     ++WActivity.brouhaha;

                      WActivity.unmotivatedness = "";
}

            } else {
                    if (! WActivity.corry 
) {
                    WActivity.bejezebel = true;

            } else {
                    WActivity.debarbarize = 7;
}



}



}

         
    }

     
    public  void cosymmedian(String ixRD5, String nzHQZ, String NMs4n) {
                if ( WActivity.corry 
 || WActivity.debarbarize < WActivity.yancopin

) {
                    if ( WActivity.capacitation 
 &&  nzHQZ == null
) {
                    if ( NMs4n == null
 || WActivity.brouhaha < WActivity.brouhaha
) {
            
 if ( NMs4n .isEmpty() ) 
 {
 if ( WActivity.bejezebel 
) 
 {        ixRD5 = "";
}
 else if 
 (! WActivity.appellees 
 &&  WActivity.bifacially == null
) 
 {        WActivity.appellees = ! true;
} 
 else 
 {        WActivity.capacitation =  false;
}

}
 else if 
 (12 > WActivity.brouhaha
) 
 {
 if ( ixRD5 == null
) 
 {        WActivity.appellees = false;
}
 else if 
 ( NMs4n .contains(ixRD5) ) 
 {        ixRD5 = "Haxtun" ;
} 
 else 
 {        WActivity.debarbarize--;
}

} 
 else 
 {        WActivity.corry =  false;
}


                     WActivity.bejezebel = false;

                      if (WActivity.yancopin == 14

 || 12 < WActivity.brouhaha
) {
                    NMs4n = "";

            } else {
                    WActivity.debarbarize = 12;
}



}

            } else {
                    if ( nzHQZ .isEmpty() ) {
            
 if (WActivity.debarbarize == WActivity.debarbarize

 && ! WActivity.corry 
) 
 {        if (3 <= WActivity.debarbarize
) {
                    NMs4n = "";

                     WActivity.unmotivatedness = "";

                      WActivity.capacitation = false;
}
}
 else if 
 ( WActivity.unmotivatedness .contains("conjurators")  ||  NMs4n == null
) 
 {        WActivity.bejezebel = true;
} 
 else 
 {        NMs4n = "";
}


            } else {
                    if ( WActivity.bifacially == null
) {
                    WActivity.bejezebel = false;

            } else {
                    ixRD5 = "geomys" ;
}



}



}




            } else {
                    if (! WActivity.corry 
) {
                    if (9 <= WActivity.brouhaha
) {
                    if (WActivity.brouhaha < 9

) {
                    if (1 <= WActivity.yancopin
 ||  WActivity.bejezebel 
) {
                    WActivity.yancopin--;

                     WActivity.appellees = false;

                      WActivity.corry = true;
}

                     WActivity.brouhaha = 13;

                      ixRD5 = "uncommemoratively" ;
}

                     if (WActivity.brouhaha <= WActivity.yancopin
 &&  NMs4n != null) {
                    WActivity.corry =  false;

            } else {
                    --WActivity.yancopin;
}




                      ++WActivity.brouhaha;
}

            } else {
                    if (WActivity.brouhaha != WActivity.brouhaha
) {
                    if ( NMs4n .isEmpty() ) {
                    NMs4n = "";

            } else {
                    WActivity.brouhaha = 4;        

}




                     WActivity.capacitation = false;

                      WActivity.bejezebel =  true;
}
}



}




         
    }

     
    public  void lymphatical() {
        
 if ( WActivity.unmotivatedness == null
 &&  WActivity.bifacially .contains(WActivity.bifacially) ) 
 {        if ( WActivity.bifacially == null
 ||  WActivity.unmotivatedness .contains("antiadministration") ) {
            
 if ( WActivity.corry 
 ||  WActivity.bejezebel 
) 
 {        if ( WActivity.bifacially .isEmpty()  || 7 != WActivity.yancopin
) {
                    if ( WActivity.appellees 
) {
                    if (WActivity.yancopin == WActivity.brouhaha
 || ! WActivity.bifacially .contains(WActivity.unmotivatedness) ) {
                    WActivity.brouhaha++;

            } else {
                    WActivity.corry = false;
}




            } else {
                    WActivity.bejezebel = false;
}




            } else {
                    if (12 <= WActivity.brouhaha
) {
                    WActivity.bejezebel = false;

            } else {
                    WActivity.corry = false;
}



}



}
 else if 
 (WActivity.yancopin < WActivity.brouhaha

) 
 {
 if ( WActivity.corry 
) 
 {        if ( WActivity.unmotivatedness .contains("peincts") ) {
                    WActivity.bifacially = "";

                     --WActivity.brouhaha;

                      WActivity.capacitation =  true;
}
}
 else if 
 (0 > WActivity.debarbarize
 &&  WActivity.unmotivatedness .isEmpty() ) 
 {        WActivity.yancopin = 14;
} 
 else 
 {        WActivity.appellees = false;
}

} 
 else 
 {
 if ( WActivity.bifacially .equals(WActivity.bifacially) ) 
 {        WActivity.capacitation = true;
}
 else if 
 ( WActivity.unmotivatedness .contains("opuscula")  ||  WActivity.unmotivatedness .equals("scripophiles") ) 
 {        WActivity.bifacially = "lummoxes" .trim();
} 
 else 
 {        WActivity.bifacially = "";
}

}


                     if ( WActivity.unmotivatedness == null
 ||  WActivity.appellees 
) {
                    if ( WActivity.bifacially .equals("jiggled")  || WActivity.yancopin < 4

) {
            
 if ( WActivity.bifacially != null &&  WActivity.bifacially .isEmpty() ) 
 {        WActivity.bifacially = "postaccident" ;
}
 else if 
 (WActivity.brouhaha <= WActivity.debarbarize

 ||  WActivity.appellees 
) 
 {        WActivity.debarbarize++;
} 
 else 
 {        WActivity.debarbarize = 4;
}


                     WActivity.yancopin++;

                      WActivity.unmotivatedness = "LE" .trim();
}

            } else {
                    WActivity.brouhaha--;
}




                      if (WActivity.brouhaha < WActivity.debarbarize

) {
                    WActivity.bifacially = "";

                     WActivity.bifacially = "";

                      WActivity.unmotivatedness = "coupled" ;
}
}
}
 else if 
 ( WActivity.bifacially == null
) 
 {        if (3 > WActivity.debarbarize
 ||  WActivity.unmotivatedness .contains("eparterial") ) {
            
 if ( WActivity.bifacially == null
) 
 {
 if (WActivity.yancopin != 0

 &&  WActivity.bifacially .equals(WActivity.unmotivatedness) ) 
 {        if ( WActivity.unmotivatedness != null &&  WActivity.bifacially .contains(WActivity.unmotivatedness) ) {
                    WActivity.corry =  true;

            } else {
                    WActivity.bifacially = "iguanodontoid" ;
}



}
 else if 
 ( WActivity.bifacially != null) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.yancopin = 6;
}

}
 else if 
 (WActivity.debarbarize == 13

 || 7 > WActivity.debarbarize
) 
 {
 if ( WActivity.unmotivatedness != null) 
 {        WActivity.debarbarize = 8;
}
 else if 
 ( WActivity.unmotivatedness == null
) 
 {        WActivity.capacitation = false;
} 
 else 
 {        WActivity.debarbarize = 8;
}

} 
 else 
 {        WActivity.unmotivatedness = "";
}


                     if (WActivity.brouhaha <= WActivity.brouhaha

 && ! WActivity.bifacially .contains("inconformably") ) {
            
 if (WActivity.debarbarize == 12

) 
 {        WActivity.bejezebel = false;
}
 else if 
 ( WActivity.bifacially != null) 
 {        WActivity.brouhaha += 12;        

} 
 else 
 {        ++WActivity.yancopin;
}


            } else {
                    WActivity.unmotivatedness = "unchildishly" ;
}




                      if (WActivity.yancopin < 5

) {
                    WActivity.unmotivatedness = "deindividualization" .intern();

            } else {
                    WActivity.bifacially = "";
}



}
} 
 else 
 {        if ( WActivity.bifacially .contains("Flushing")  || 11 == WActivity.brouhaha
) {
            
 if (11 != WActivity.yancopin
 || 6 < WActivity.debarbarize
) 
 {        if (1 == WActivity.yancopin
) {
                    WActivity.brouhaha++;

                     WActivity.corry = ! true;

                      WActivity.brouhaha++;
}
}
 else if 
 ( WActivity.capacitation 
 ||  WActivity.bifacially == null
) 
 {        WActivity.appellees =  false;
} 
 else 
 {        WActivity.corry = false;
}


            } else {
                    if (WActivity.brouhaha < 8

 ||  WActivity.appellees 
) {
                    WActivity.brouhaha = 12;        


            } else {
                    WActivity.appellees =  true;
}



}



}

        if ( WActivity.unmotivatedness == null
) {
                    if ( WActivity.bifacially == null
 && ! WActivity.capacitation 
) {
                    if ( WActivity.bifacially != null ||  WActivity.bifacially == null
) {
                    if ( WActivity.unmotivatedness == null
) {
                    WActivity.yancopin = 9;

             
 if (WActivity.brouhaha != WActivity.brouhaha
) 
 {        WActivity.bifacially = "thunking" ;
}
 else if 
 ( WActivity.appellees 
) 
 {        WActivity.corry =  false;
} 
 else 
 {        WActivity.appellees = false;
}


                      WActivity.corry = true;
}

             
 if ( WActivity.unmotivatedness .contains(WActivity.bifacially)  || ! WActivity.bifacially .equals("overhandicapping") ) 
 {        if ( WActivity.unmotivatedness != null) {
                    WActivity.capacitation = true;

                     WActivity.unmotivatedness = "";

                      WActivity.brouhaha = 13;        

}
}
 else if 
 ( WActivity.bifacially == null
 || WActivity.yancopin < WActivity.brouhaha

) 
 {        WActivity.corry = false;
} 
 else 
 {        WActivity.appellees =  false;
}


              
 if ( WActivity.bifacially != null ||  WActivity.unmotivatedness == null
) 
 {        WActivity.unmotivatedness = "pendulosity" ;
}
 else if 
 ( WActivity.appellees 
) 
 {        --WActivity.yancopin;
} 
 else 
 {        WActivity.debarbarize = 6;        

}

}

             
 if ( WActivity.corry 
 &&  WActivity.appellees 
) 
 {
 if ( WActivity.bifacially .equals(WActivity.bifacially)  && ! WActivity.bifacially .trim().isEmpty() ) 
 {        WActivity.capacitation = true;
}
 else if 
 (WActivity.brouhaha == WActivity.brouhaha

) 
 {        WActivity.debarbarize = 2;
} 
 else 
 {        WActivity.capacitation =  true;
}

}
 else if 
 (WActivity.debarbarize != WActivity.debarbarize

 &&  WActivity.capacitation 
) 
 {
 if ( WActivity.bejezebel 
) 
 {        WActivity.appellees = ! true;
}
 else if 
 (! WActivity.appellees 
) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.debarbarize = 4;
}

} 
 else 
 {        WActivity.capacitation = true;
}


                      if (WActivity.yancopin <= 5

) {
                    if (! WActivity.appellees 
 && WActivity.debarbarize == WActivity.brouhaha

) {
                    WActivity.bifacially = "";

                     WActivity.unmotivatedness = "";

                      WActivity.corry = ! true;
}

                     WActivity.bifacially = "";

                      WActivity.unmotivatedness = "";
}
}

                     if ( WActivity.unmotivatedness != null && WActivity.yancopin > WActivity.debarbarize
) {
            
 if ( WActivity.unmotivatedness == null
 &&  WActivity.unmotivatedness != null) 
 {
 if ( WActivity.bifacially .isEmpty() ) 
 {
 if ( WActivity.unmotivatedness .isEmpty() ) 
 {        WActivity.yancopin--;
}
 else if 
 (12 == WActivity.yancopin
 || WActivity.yancopin > WActivity.yancopin
) 
 {        --WActivity.debarbarize;
} 
 else 
 {        WActivity.yancopin -= 7;
}

}
 else if 
 ( WActivity.unmotivatedness != null ||  WActivity.bifacially != null) 
 {        WActivity.corry = true;
} 
 else 
 {        WActivity.unmotivatedness = "";
}

}
 else if 
 (WActivity.yancopin != WActivity.brouhaha

) 
 {
 if ( WActivity.bifacially != null) 
 {        WActivity.appellees = true;
}
 else if 
 (WActivity.yancopin <= WActivity.yancopin
) 
 {        WActivity.yancopin = 3;        

} 
 else 
 {        WActivity.unmotivatedness = "";
}

} 
 else 
 {        WActivity.unmotivatedness = "Akans" ;
}


                     if ( WActivity.unmotivatedness == null
 &&  WActivity.bifacially != null) {
                    if (WActivity.yancopin > WActivity.debarbarize

) {
                    WActivity.brouhaha = 3;

                     WActivity.unmotivatedness = "perissological" ;

                      WActivity.corry = true;
}

            } else {
                    WActivity.corry = true;
}




                      if (WActivity.debarbarize != 11

 ||  WActivity.bifacially != null) {
                    WActivity.bifacially = "";

                     WActivity.bifacially = "osseins" ;

                      WActivity.corry =  true;
}
}

              
 if ( WActivity.bejezebel 
) 
 {        if (! WActivity.bifacially .equals("ecclesiastics") ) {
                    if ( WActivity.unmotivatedness != null) {
                    WActivity.unmotivatedness = "fetterbush" ;

            } else {
                    --WActivity.brouhaha;
}




            } else {
                    WActivity.debarbarize++;
}



}
 else if 
 ( WActivity.corry 
) 
 {        if (WActivity.yancopin < 3

 && WActivity.yancopin <= 7

) {
                    WActivity.debarbarize = 12;        


            } else {
                    WActivity.unmotivatedness = "conventionalized" ;
}



} 
 else 
 {        WActivity.capacitation = true;
}

}
        if ( WActivity.unmotivatedness != null || WActivity.brouhaha > WActivity.brouhaha
) {
                    if ( WActivity.unmotivatedness != null && WActivity.debarbarize <= WActivity.brouhaha
) {
            
 if ( WActivity.bifacially != null ||  WActivity.unmotivatedness .contains("poorhouse") ) 
 {        if ( WActivity.unmotivatedness != null) {
            
 if (! WActivity.appellees 
 &&  WActivity.unmotivatedness .isEmpty() ) 
 {        if ( WActivity.appellees 
) {
                    WActivity.appellees =  false;

            } else {
                    WActivity.capacitation = false;
}



}
 else if 
 (! WActivity.appellees 
 ||  WActivity.corry 
) 
 {        WActivity.corry = ! false;
} 
 else 
 {        WActivity.appellees = true;
}


            } else {
                    if (! WActivity.appellees 
) {
                    WActivity.debarbarize = 10;

            } else {
                    ++WActivity.yancopin;
}



}



}
 else if 
 (WActivity.debarbarize == 12

) 
 {        if ( WActivity.capacitation 
) {
            
 if (! WActivity.appellees 
 ||  WActivity.bifacially != null) 
 {        WActivity.bifacially = "rhodospermous" ;
}
 else if 
 ( WActivity.bifacially == null
 ||  WActivity.bejezebel 
) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.bejezebel = false;
}


                     WActivity.unmotivatedness = "Neoplatonists" ;

                      WActivity.yancopin = 8;
}
} 
 else 
 {        if (WActivity.debarbarize <= WActivity.debarbarize

 && WActivity.yancopin < WActivity.brouhaha

) {
                    WActivity.bejezebel = true;

            } else {
                    WActivity.appellees =  false;
}



}


                     if ( WActivity.bifacially == null
) {
            
 if ( WActivity.unmotivatedness .contains("orientalisms")  ||  WActivity.unmotivatedness == null
) 
 {        if ( WActivity.capacitation 
) {
                    WActivity.unmotivatedness = "";

                     --WActivity.yancopin;

                      WActivity.debarbarize = 7;        

}
}
 else if 
 ( WActivity.unmotivatedness == null
 || ! WActivity.corry 
) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.capacitation = false;
}


             
 if (WActivity.debarbarize <= WActivity.yancopin

) 
 {        WActivity.unmotivatedness = "";
}
 else if 
 ( WActivity.unmotivatedness != null) 
 {        WActivity.bejezebel = false;
} 
 else 
 {        ++WActivity.yancopin;
}


                      WActivity.yancopin = 3;        

}

                      if ( WActivity.appellees 
) {
            
 if ( WActivity.unmotivatedness == null
 ||  WActivity.unmotivatedness == null
) 
 {        WActivity.unmotivatedness = "";
}
 else if 
 (WActivity.yancopin == WActivity.yancopin

) 
 {        WActivity.unmotivatedness = "Gorden" ;
} 
 else 
 {        WActivity.unmotivatedness = "";
}


            } else {
                    WActivity.bifacially = "perdurabilities" ;
}



}

            } else {
                    if ( WActivity.capacitation 
) {
                    if (WActivity.brouhaha <= 10

) {
                    if ( WActivity.unmotivatedness != null && 8 != WActivity.yancopin
) {
                    if (WActivity.brouhaha != WActivity.yancopin

 &&  WActivity.bejezebel 
) {
                    WActivity.corry = false;

            } else {
                    WActivity.bejezebel = false;
}




            } else {
                    WActivity.appellees = false;
}




             
 if ( WActivity.unmotivatedness != null && 1 <= WActivity.yancopin
) 
 {        WActivity.bifacially = "";
}
 else if 
 ( WActivity.bejezebel 
) 
 {        WActivity.yancopin = 14;
} 
 else 
 {        WActivity.unmotivatedness = "ringbarking" ;
}


                      WActivity.brouhaha = 2;        

}

            } else {
                    if ( WActivity.unmotivatedness .isEmpty()  &&  WActivity.bifacially != null) {
            
 if (WActivity.yancopin > WActivity.brouhaha

) 
 {        WActivity.brouhaha = 0;        

}
 else if 
 ( WActivity.unmotivatedness == null
 ||  WActivity.unmotivatedness .equals("wirepuller") ) 
 {        WActivity.bejezebel = true;
} 
 else 
 {        WActivity.unmotivatedness = "";
}


                     WActivity.debarbarize -= 5;        


                      WActivity.yancopin -= 5;        

}
}



}




 if (WActivity.brouhaha > WActivity.brouhaha

) 
 {        if ( WActivity.appellees 
) {
            
 if ( WActivity.unmotivatedness != null || 12 != WActivity.brouhaha
) 
 {        if ( WActivity.bifacially .contains(WActivity.unmotivatedness) ) {
                    WActivity.appellees = true;

            } else {
                    if ( WActivity.capacitation 
 &&  WActivity.unmotivatedness == null
) {
                    WActivity.bifacially = "nudophobia" ;

                     WActivity.appellees = false;

                      WActivity.unmotivatedness = "stahlhelm" ;
}
}



}
 else if 
 (WActivity.debarbarize == 3

 && WActivity.yancopin <= WActivity.brouhaha

) 
 {        if (WActivity.brouhaha != 11

 ||  WActivity.unmotivatedness .isEmpty() ) {
                    if ( WActivity.bifacially .isEmpty() ) {
                    WActivity.yancopin += 8;        


                     WActivity.unmotivatedness = "noneligibly" ;

                      WActivity.bifacially = "";
}

            } else {
                    WActivity.debarbarize++;
}



} 
 else 
 {        if (WActivity.brouhaha < 9

) {
                    WActivity.debarbarize = 1;

            } else {
                    --WActivity.debarbarize;
}



}


                     if ( WActivity.unmotivatedness != null && ! WActivity.appellees 
) {
            
 if (WActivity.yancopin > 6

) 
 {        WActivity.bifacially = "";
}
 else if 
 ( WActivity.bifacially == null
) 
 {        WActivity.unmotivatedness = "epispastics" ;
} 
 else 
 {        WActivity.brouhaha = 9;        

}


            } else {
                    WActivity.debarbarize = 4;        

}




                      WActivity.brouhaha++;
}
}
 else if 
 ( WActivity.unmotivatedness .isEmpty() ) 
 {        if (3 == WActivity.yancopin
) {
            
 if ( WActivity.unmotivatedness == null
) 
 {
 if (! WActivity.unmotivatedness .contains("centums")  ||  WActivity.unmotivatedness .contains("petrostearin") ) 
 {        if (WActivity.yancopin == WActivity.yancopin

 ||  WActivity.unmotivatedness == null
) {
                    WActivity.brouhaha = 5;

                     WActivity.appellees = false;

                      WActivity.corry = ! true;
}
}
 else if 
 ( WActivity.capacitation 
) 
 {        WActivity.unmotivatedness = "wastefulness" ;
} 
 else 
 {        WActivity.brouhaha--;
}

}
 else if 
 ( WActivity.bifacially == null
) 
 {
 if ( WActivity.unmotivatedness == null
 &&  WActivity.unmotivatedness == null
) 
 {        WActivity.bifacially = "padlocking" ;
}
 else if 
 (WActivity.debarbarize <= 12

 || WActivity.brouhaha > WActivity.yancopin
) 
 {        WActivity.bifacially = "";
} 
 else 
 {        WActivity.unmotivatedness = "nongraduate" .toLowerCase();
}

} 
 else 
 {        WActivity.capacitation = false;
}


            } else {
                    if (WActivity.yancopin > 9

) {
                    if ( WActivity.unmotivatedness == null
) {
                    WActivity.bifacially = "unpropitiatory" ;

            } else {
                    ++WActivity.yancopin;
}




                     WActivity.unmotivatedness = "";

                      WActivity.bejezebel = true;
}
}



} 
 else 
 {        if (7 != WActivity.debarbarize
 ||  WActivity.unmotivatedness == null
) {
                    WActivity.capacitation = false;

            } else {
            
 if ( WActivity.corry 
 ||  WActivity.unmotivatedness != null) 
 {        WActivity.unmotivatedness = "";
}
 else if 
 ( WActivity.unmotivatedness != null || ! WActivity.unmotivatedness .isEmpty() ) 
 {        WActivity.bifacially = "Wahiawa" ;
} 
 else 
 {        ++WActivity.brouhaha;
}

}



}

        if (WActivity.debarbarize == WActivity.debarbarize

) {
            
 if ( WActivity.bifacially == null
 || WActivity.brouhaha != WActivity.brouhaha

) 
 {        WActivity.debarbarize += 7;
}
 else if 
 ( WActivity.bifacially .contains(WActivity.bifacially)  || ! WActivity.capacitation 
) 
 {        if ( WActivity.unmotivatedness == null
) {
            
 if (WActivity.brouhaha == 1

) 
 {        if (WActivity.debarbarize == 14

) {
                    WActivity.bifacially = "";

                     WActivity.bifacially = "";

                      WActivity.bifacially = "preindulge" ;
}
}
 else if 
 (WActivity.yancopin > WActivity.debarbarize

) 
 {        WActivity.yancopin = 0;        

} 
 else 
 {        WActivity.debarbarize++;
}


            } else {
                    if ( WActivity.bifacially == null
 &&  WActivity.unmotivatedness .equals("peptonization") ) {
                    WActivity.bifacially = "";

            } else {
                    WActivity.appellees = false;
}



}



} 
 else 
 {        if ( WActivity.appellees 
) {
                    if (0 <= WActivity.yancopin
) {
                    --WActivity.brouhaha;

                     WActivity.debarbarize--;

                      --WActivity.yancopin;
}

            } else {
                    WActivity.yancopin--;
}



}


                     WActivity.unmotivatedness = "";

              
 if (WActivity.yancopin > WActivity.yancopin
 &&  WActivity.unmotivatedness == null
) 
 {        if (12 > WActivity.yancopin
) {
                    if ( WActivity.unmotivatedness != null) {
                    WActivity.appellees =  true;

                     WActivity.unmotivatedness = "";

                      WActivity.bifacially = "quadriennials" ;
}

                     WActivity.corry =  true;

                      WActivity.bifacially = "";
}
}
 else if 
 ( WActivity.bifacially .isEmpty()  &&  WActivity.bifacially .equals("dodonaena") ) 
 {        WActivity.unmotivatedness = "thanatognomonic" ;
} 
 else 
 {        WActivity.debarbarize = 14;        

}

}
        if (WActivity.yancopin < WActivity.brouhaha
) {
                    if (WActivity.debarbarize <= WActivity.yancopin
 || ! WActivity.bejezebel 
) {
            
 if (WActivity.brouhaha <= WActivity.debarbarize

 && WActivity.yancopin == 11

) 
 {        if ( WActivity.bifacially != null && WActivity.yancopin != WActivity.debarbarize
) {
                    if (! WActivity.capacitation 
) {
                    if ( WActivity.bejezebel 
) {
                    WActivity.unmotivatedness = "";

            } else {
                    WActivity.unmotivatedness = "";
}




                     WActivity.bifacially = "";

                      WActivity.yancopin--;
}

            } else {
                    if ( WActivity.corry 
 &&  WActivity.bifacially .isEmpty() ) {
                    --WActivity.debarbarize;

            } else {
                    WActivity.bifacially = "";
}



}



}
 else if 
 ( WActivity.unmotivatedness == null
) 
 {        if ( WActivity.unmotivatedness .isEmpty() ) {
                    if ( WActivity.corry 
) {
                    WActivity.debarbarize++;

            } else {
                    WActivity.unmotivatedness = "";
}




                     WActivity.appellees = false;

                      WActivity.unmotivatedness = "";
}
} 
 else 
 {        if (WActivity.brouhaha == 5

) {
                    WActivity.yancopin = 10;

            } else {
                    WActivity.unmotivatedness = "";
}



}


            } else {
                    if (WActivity.yancopin == 10

 && WActivity.debarbarize == WActivity.yancopin
) {
            
 if ( WActivity.unmotivatedness == null
) 
 {        if ( WActivity.bifacially == null
 || WActivity.yancopin == 3

) {
                    WActivity.unmotivatedness = "designingly" ;

            } else {
                    WActivity.corry =  true;
}



}
 else if 
 ( WActivity.unmotivatedness .equals(WActivity.bifacially)  || ! WActivity.appellees 
) 
 {        WActivity.bejezebel = true;
} 
 else 
 {        WActivity.yancopin++;
}


             
 if (WActivity.yancopin < 6

) 
 {        WActivity.brouhaha = 10;
}
 else if 
 ( WActivity.bifacially != null && WActivity.debarbarize <= WActivity.yancopin
) 
 {        WActivity.unmotivatedness = "psychoacoustics" ;
} 
 else 
 {        WActivity.bifacially = "roseting" ;
}


                      WActivity.bejezebel = true;
}
}




             
 if ( WActivity.bifacially != null &&  WActivity.bifacially .equals("meg") ) 
 {
 if ( WActivity.unmotivatedness != null &&  WActivity.bifacially == null
) 
 {
 if (WActivity.debarbarize <= 12

) 
 {
 if (1 <= WActivity.debarbarize
) 
 {        WActivity.yancopin = 5;        

}
 else if 
 (! WActivity.unmotivatedness .equals(WActivity.unmotivatedness) ) 
 {        WActivity.bifacially = "Sarvarthasiddha" ;
} 
 else 
 {        WActivity.yancopin++;
}

}
 else if 
 ( WActivity.capacitation 
) 
 {        WActivity.yancopin = 3;
} 
 else 
 {        WActivity.bifacially = "substructions" .toUpperCase();
}

}
 else if 
 (WActivity.debarbarize != WActivity.debarbarize

 && WActivity.brouhaha > WActivity.debarbarize
) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.bifacially = "dalk" .toUpperCase();
}

}
 else if 
 ( WActivity.unmotivatedness != null &&  WActivity.bifacially == null
) 
 {        if ( WActivity.unmotivatedness == null
 &&  WActivity.bifacially .contains("lockjaw") ) {
                    if ( WActivity.corry 
 &&  WActivity.bifacially .equals("overbragging") ) {
                    WActivity.appellees = false;

                     WActivity.debarbarize = 1;        


                      WActivity.bejezebel =  false;
}

            } else {
                    WActivity.unmotivatedness = "";
}



} 
 else 
 {
 if ( WActivity.unmotivatedness != null) 
 {        WActivity.bejezebel =  false;
}
 else if 
 (WActivity.brouhaha <= 8

 ||  WActivity.capacitation 
) 
 {        WActivity.corry =  false;
} 
 else 
 {        WActivity.bejezebel = true;
}

}


              
 if ( WActivity.bifacially .contains(WActivity.bifacially)  &&  WActivity.unmotivatedness .isEmpty() ) 
 {        if (! WActivity.bejezebel 
) {
            
 if ( WActivity.capacitation 
 &&  WActivity.unmotivatedness != null) 
 {        WActivity.unmotivatedness = "intreatable" ;
}
 else if 
 ( WActivity.unmotivatedness == null
 ||  WActivity.corry 
) 
 {        --WActivity.debarbarize;
} 
 else 
 {        WActivity.bifacially = "";
}


                     WActivity.appellees =  false;

                      WActivity.brouhaha = 8;        

}
}
 else if 
 ( WActivity.capacitation 
) 
 {        if (WActivity.debarbarize > 12

) {
                    WActivity.yancopin -= 12;        


            } else {
                    WActivity.yancopin++;
}



} 
 else 
 {        WActivity.yancopin = 1;
}

}

         
    }

     
    public  void sanguinicolous(boolean s0VTM) {
                if (WActivity.brouhaha < WActivity.yancopin
 || WActivity.debarbarize != WActivity.yancopin
) {
                    WActivity.capacitation = false;

            } else {
                    WActivity.bifacially = "ushering" ;
}



        if (WActivity.brouhaha > WActivity.brouhaha

) {
                    s0VTM = true;

            } else {
                    WActivity.bejezebel =  false;
}



        if ( WActivity.bejezebel 
 &&  WActivity.unmotivatedness == null
) {
            
 if (! WActivity.appellees 
 ||  s0VTM 
) 
 {        WActivity.capacitation = false;
}
 else if 
 ( WActivity.unmotivatedness != null) 
 {        if ( WActivity.bifacially == null
 &&  WActivity.unmotivatedness .contains(WActivity.bifacially) ) {
                    if (5 > WActivity.yancopin
 && WActivity.brouhaha <= 2

) {
                    WActivity.capacitation = ! false;

            } else {
                    WActivity.appellees = true;
}




                     if (! s0VTM 
 &&  WActivity.unmotivatedness == null
) {
                    s0VTM = true;

                     s0VTM = false;

                      ++WActivity.brouhaha;
}

                      WActivity.corry = false;
}
} 
 else 
 {        WActivity.appellees =  true;
}


                     if (WActivity.brouhaha > WActivity.brouhaha

) {
                    WActivity.brouhaha = 13;

                     if (6 <= WActivity.yancopin
) {
            
 if (! WActivity.corry 
) 
 {        WActivity.yancopin--;
}
 else if 
 (WActivity.debarbarize > WActivity.brouhaha
 && WActivity.yancopin > WActivity.yancopin
) 
 {        WActivity.unmotivatedness = "minimalism" ;
} 
 else 
 {        WActivity.capacitation = true;
}


                     WActivity.yancopin = 14;

                      s0VTM = false;
}

              
 if ( WActivity.bejezebel 
 &&  WActivity.unmotivatedness == null
) 
 {        s0VTM = true;
}
 else if 
 ( s0VTM 
) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.bejezebel = true;
}

}

                      if ( WActivity.bifacially == null
 || WActivity.debarbarize < WActivity.yancopin
) {
                    if ( WActivity.capacitation 
 &&  WActivity.unmotivatedness != null) {
                    if (WActivity.debarbarize < 1

) {
                    WActivity.unmotivatedness = "";

                     WActivity.appellees = ! true;

                      WActivity.debarbarize = 7;
}

                     ++WActivity.yancopin;

                      WActivity.unmotivatedness = "";
}

            } else {
                    if ( WActivity.bifacially == null
) {
                    WActivity.bejezebel = true;

            } else {
                    WActivity.corry = false;
}



}



}

 if ( WActivity.bifacially != null ||  WActivity.capacitation 
) 
 {        if ( WActivity.bifacially != null || 0 <= WActivity.debarbarize
) {
                    if (! WActivity.corry 
) {
                    if ( WActivity.bifacially == null
 || WActivity.brouhaha == WActivity.brouhaha
) {
                    if ( WActivity.unmotivatedness != null) {
                    if (! s0VTM 
) {
                    WActivity.yancopin++;

            } else {
                    WActivity.bifacially = "";
}




                     WActivity.unmotivatedness = "thymolphthalein" ;

                      WActivity.brouhaha = 6;        

}

            } else {
            
 if ( WActivity.bejezebel 
) 
 {        WActivity.bifacially = "";
}
 else if 
 (WActivity.debarbarize > WActivity.yancopin

) 
 {        WActivity.bifacially = "";
} 
 else 
 {        WActivity.unmotivatedness = "fannell" ;
}

}




            } else {
            
 if (WActivity.debarbarize > 9

 ||  WActivity.unmotivatedness == null
) 
 {        if (1 > WActivity.yancopin
) {
                    ++WActivity.brouhaha;

                     WActivity.bejezebel = false;

                      WActivity.yancopin++;
}
}
 else if 
 ( WActivity.unmotivatedness == null
) 
 {        s0VTM = true;
} 
 else 
 {        s0VTM =  false;
}

}




            } else {
            
 if ( WActivity.bifacially != null) 
 {        if (WActivity.debarbarize <= 14

) {
                    if ( WActivity.unmotivatedness == null
 &&  s0VTM 
) {
                    WActivity.bifacially = "";

                     WActivity.debarbarize = 7;

                      WActivity.unmotivatedness = "slobberer" ;
}

            } else {
                    WActivity.corry = false;
}



}
 else if 
 (WActivity.debarbarize < WActivity.debarbarize

 ||  s0VTM 
) 
 {        WActivity.debarbarize -= 13;
} 
 else 
 {        WActivity.debarbarize -= 12;
}

}



}
 else if 
 (! s0VTM 
 &&  WActivity.unmotivatedness == null
) 
 {        ++WActivity.brouhaha;
} 
 else 
 {        if ( WActivity.unmotivatedness .contains(WActivity.bifacially) ) {
            
 if (6 <= WActivity.yancopin
 && WActivity.debarbarize != WActivity.yancopin
) 
 {        if (! s0VTM 
) {
                    WActivity.unmotivatedness = "";

                     WActivity.unmotivatedness = "";

                      ++WActivity.debarbarize;
}
}
 else if 
 ( s0VTM 
) 
 {        WActivity.bifacially = "copastorate" ;
} 
 else 
 {        s0VTM =  true;
}


            } else {
            
 if ( s0VTM 
) 
 {        WActivity.unmotivatedness = "";
}
 else if 
 ( s0VTM 
) 
 {        s0VTM = true;
} 
 else 
 {        s0VTM = false;
}

}



}


         
    }

     
    public  void absquatulating(String np4Hu, boolean A6ul7) {
        
 if ( WActivity.bifacially .isEmpty() ) 
 {
 if (WActivity.brouhaha == WActivity.debarbarize

) 
 {        if (WActivity.debarbarize == WActivity.debarbarize
) {
            
 if (WActivity.yancopin != WActivity.yancopin
) 
 {        if ( np4Hu != null) {
                    if ( np4Hu != null) {
                    np4Hu = "";

            } else {
                    WActivity.debarbarize = 4;        

}




            } else {
                    np4Hu = "shtucks" ;
}



}
 else if 
 (WActivity.yancopin < WActivity.brouhaha

 ||  np4Hu != null) 
 {        if (! WActivity.bifacially .equals("Marienbad")  || WActivity.debarbarize != WActivity.yancopin

) {
                    WActivity.unmotivatedness = "";

                     A6ul7 =  false;

                      np4Hu = "";
}
} 
 else 
 {        WActivity.brouhaha = 12;        

}


                     if ( np4Hu != null) {
            
 if ( np4Hu != null) 
 {        --WActivity.debarbarize;
}
 else if 
 ( A6ul7 
 && ! WActivity.bejezebel 
) 
 {        WActivity.debarbarize = 3;        

} 
 else 
 {        WActivity.yancopin = 2;        

}


            } else {
                    WActivity.bifacially = "triandria" ;
}




              
 if ( np4Hu != null &&  np4Hu .trim().contains(np4Hu) ) 
 {        A6ul7 =  true;
}
 else if 
 ( np4Hu == null
) 
 {        WActivity.yancopin = 5;
} 
 else 
 {        WActivity.capacitation = false;
}

}
}
 else if 
 (WActivity.yancopin <= 5

 ||  WActivity.unmotivatedness .equals(WActivity.unmotivatedness) ) 
 {        if (WActivity.brouhaha < 12

) {
                    WActivity.brouhaha = 2;

            } else {
                    if ( np4Hu == null
 &&  A6ul7 
) {
                    np4Hu = "";

            } else {
                    WActivity.debarbarize = 2;
}



}



} 
 else 
 {        if (WActivity.brouhaha < WActivity.brouhaha

 || WActivity.yancopin > WActivity.debarbarize
) {
                    if (WActivity.yancopin != WActivity.yancopin

) {
                    A6ul7 = true;

            } else {
                    WActivity.bejezebel =  true;
}




            } else {
                    WActivity.brouhaha = 11;        

}



}

}
 else if 
 (11 == WActivity.debarbarize
 &&  A6ul7 
) 
 {        if (WActivity.brouhaha < WActivity.brouhaha
) {
                    WActivity.bifacially = "hagbush" ;

            } else {
            
 if (WActivity.yancopin == WActivity.yancopin

) 
 {        WActivity.debarbarize = 13;
}
 else if 
 ( WActivity.corry 
) 
 {        A6ul7 = true;
} 
 else 
 {        np4Hu = "untrochaic" ;
}

}



} 
 else 
 {        WActivity.yancopin--;
}

        if (WActivity.brouhaha == WActivity.debarbarize
) {
            
 if (WActivity.debarbarize != WActivity.brouhaha
 || 13 <= WActivity.brouhaha
) 
 {        if (6 != WActivity.brouhaha
) {
            
 if (WActivity.yancopin > WActivity.debarbarize

) 
 {        if (WActivity.yancopin <= 14

) {
                    A6ul7 = true;

                     np4Hu = "epilithic" ;

                      np4Hu = "interspeaker" ;
}
}
 else if 
 ( np4Hu == null
) 
 {        if ( np4Hu == null
) {
                    WActivity.capacitation = false;

                     np4Hu = "cinquefoiled" ;

                      WActivity.bejezebel =  true;
}
} 
 else 
 {        WActivity.bejezebel = false;
}


             
 if ( np4Hu != null && 7 != WActivity.brouhaha
) 
 {        --WActivity.brouhaha;
}
 else if 
 (! A6ul7 
) 
 {        WActivity.bejezebel =  true;
} 
 else 
 {        A6ul7 = true;
}


              
 if (WActivity.brouhaha == WActivity.brouhaha

) 
 {        ++WActivity.brouhaha;
}
 else if 
 ( np4Hu != null) 
 {        np4Hu = "";
} 
 else 
 {        WActivity.yancopin++;
}

}
}
 else if 
 ( WActivity.unmotivatedness != null) 
 {        if (! A6ul7 
) {
                    if ( np4Hu != null) {
            
 if (WActivity.debarbarize > WActivity.debarbarize

) 
 {        np4Hu = "";
}
 else if 
 (WActivity.yancopin <= WActivity.debarbarize

 &&  np4Hu != null) 
 {        WActivity.unmotivatedness = "liquidate" ;
} 
 else 
 {        A6ul7 =  false;
}


                     A6ul7 = ! false;

                      --WActivity.brouhaha;
}

                     A6ul7 = true;

                      --WActivity.brouhaha;
}
} 
 else 
 {        WActivity.corry = ! false;
}


            } else {
                    if ( np4Hu == null
 ||  WActivity.bifacially == null
) {
                    if ( np4Hu .contains(np4Hu)  || ! WActivity.bifacially .contains(np4Hu) ) {
                    if ( WActivity.bifacially != null ||  np4Hu .equals(WActivity.bifacially) ) {
                    if ( np4Hu == null
) {
                    WActivity.bejezebel = ! true;

                     A6ul7 =  false;

                      A6ul7 = true;
}

                     WActivity.brouhaha--;

                      WActivity.appellees = true;
}

                     if (WActivity.yancopin == 6

) {
                    WActivity.yancopin--;

            } else {
                    np4Hu = "";
}




                      A6ul7 = ! false;
}

            } else {
                    if (WActivity.debarbarize == WActivity.brouhaha

 && WActivity.yancopin == WActivity.debarbarize
) {
                    if (! WActivity.bifacially .equals("filigrees")  ||  WActivity.corry 
) {
                    --WActivity.brouhaha;

            } else {
                    A6ul7 =  false;
}




                     WActivity.capacitation = true;

                      WActivity.bifacially = "";
}
}



}



        np4Hu = "palaeodendrology" .toLowerCase();

         
    }

     
    public  void irrecordable() {
                if ( WActivity.unmotivatedness != null) {
            
 if ( WActivity.unmotivatedness .equals("polyorganic")  ||  WActivity.bifacially != null) 
 {        if (WActivity.yancopin <= WActivity.brouhaha

 &&  WActivity.unmotivatedness != null) {
            
 if ( WActivity.unmotivatedness == null
) 
 {        WActivity.yancopin = 6;
}
 else if 
 ( WActivity.unmotivatedness != null ||  WActivity.unmotivatedness == null
) 
 {        if ( WActivity.bifacially .contains("illinoisan")  &&  WActivity.capacitation 
) {
                    --WActivity.debarbarize;

                     WActivity.unmotivatedness = "";

                      WActivity.capacitation = false;
}
} 
 else 
 {        WActivity.unmotivatedness = "draglines" ;
}


                     if ( WActivity.unmotivatedness != null || WActivity.debarbarize < WActivity.yancopin
) {
                    if (! WActivity.unmotivatedness .isEmpty() ) {
                    ++WActivity.debarbarize;

            } else {
                    WActivity.yancopin = 11;        

}




                     WActivity.unmotivatedness = "";

                      WActivity.unmotivatedness = "overdiscreetly" ;
}

              
 if (WActivity.yancopin != WActivity.brouhaha
 ||  WActivity.unmotivatedness != null) 
 {        WActivity.appellees = true;
}
 else if 
 (WActivity.yancopin < WActivity.brouhaha

) 
 {        WActivity.corry =  true;
} 
 else 
 {        WActivity.brouhaha--;
}

}
}
 else if 
 ( WActivity.unmotivatedness != null) 
 {
 if (WActivity.yancopin != WActivity.brouhaha
 ||  WActivity.unmotivatedness == null
) 
 {        if ( WActivity.unmotivatedness == null
 || WActivity.brouhaha < WActivity.brouhaha

) {
                    if (WActivity.yancopin == 0

) {
                    WActivity.corry = true;

            } else {
                    WActivity.debarbarize = 7;        

}




                     ++WActivity.brouhaha;

                      WActivity.capacitation = true;
}
}
 else if 
 (WActivity.debarbarize > WActivity.yancopin
) 
 {
 if ( WActivity.bifacially == null
 &&  WActivity.unmotivatedness .contains("ampalea") ) 
 {        WActivity.yancopin = 3;
}
 else if 
 ( WActivity.bifacially != null ||  WActivity.unmotivatedness == null
) 
 {        WActivity.brouhaha = 8;
} 
 else 
 {        WActivity.yancopin = 13;        

}

} 
 else 
 {        WActivity.brouhaha = 6;
}

} 
 else 
 {        if (WActivity.brouhaha == WActivity.brouhaha

) {
                    if ( WActivity.bifacially == null
) {
                    WActivity.debarbarize = 2;

                     WActivity.corry = ! false;

                      WActivity.debarbarize--;
}

                     WActivity.unmotivatedness = "Epicureanism" .trim();

                      WActivity.corry =  false;
}
}


            } else {
            
 if (WActivity.debarbarize < 5

 ||  WActivity.bejezebel 
) 
 {        if ( WActivity.bifacially != null) {
                    if ( WActivity.capacitation 
 || WActivity.debarbarize != WActivity.debarbarize
) {
            
 if (8 > WActivity.brouhaha
 || 1 == WActivity.brouhaha
) 
 {        WActivity.debarbarize = 8;
}
 else if 
 ( WActivity.unmotivatedness != null ||  WActivity.bifacially == null
) 
 {        WActivity.brouhaha--;
} 
 else 
 {        WActivity.yancopin = 2;        

}


                     WActivity.unmotivatedness = "";

                      WActivity.bejezebel =  false;
}

                     if ( WActivity.unmotivatedness .isEmpty()  ||  WActivity.unmotivatedness != null) {
                    ++WActivity.brouhaha;

            } else {
                    WActivity.appellees = false;
}




                      WActivity.yancopin = 13;
}
}
 else if 
 ( WActivity.bifacially != null || WActivity.yancopin == WActivity.brouhaha
) 
 {        WActivity.yancopin++;
} 
 else 
 {
 if ( WActivity.unmotivatedness .contains("peptogaster")  &&  WActivity.unmotivatedness .equals("pseudoimpartial") ) 
 {        WActivity.brouhaha++;
}
 else if 
 ( WActivity.bifacially != null) 
 {        WActivity.brouhaha++;
} 
 else 
 {        WActivity.bifacially = "";
}

}

}



        if ( WActivity.bifacially .contains(WActivity.bifacially)  &&  WActivity.unmotivatedness == null
) {
                    if ( WActivity.unmotivatedness .equals("rerepeating")  || WActivity.debarbarize < 3

) {
                    if (WActivity.debarbarize == 11

 || ! WActivity.capacitation 
) {
            
 if ( WActivity.bifacially == null
) 
 {
 if (WActivity.yancopin != WActivity.yancopin

 ||  WActivity.bifacially == null
) 
 {        if (13 > WActivity.debarbarize
 || WActivity.debarbarize <= WActivity.brouhaha
) {
                    WActivity.bejezebel = true;

                     WActivity.debarbarize = 12;

                      WActivity.capacitation =  false;
}
}
 else if 
 ( WActivity.unmotivatedness == null
) 
 {        WActivity.bejezebel = true;
} 
 else 
 {        WActivity.corry = ! false;
}

}
 else if 
 (WActivity.brouhaha != WActivity.yancopin

 &&  WActivity.appellees 
) 
 {        if (WActivity.debarbarize != WActivity.brouhaha

) {
                    WActivity.debarbarize = 7;

            } else {
                    WActivity.unmotivatedness = "tolusafranine" ;
}



} 
 else 
 {        WActivity.yancopin = 13;
}


             
 if (12 != WActivity.yancopin
 && WActivity.debarbarize <= WActivity.brouhaha

) 
 {        if ( WActivity.bifacially == null
 &&  WActivity.unmotivatedness .contains(WActivity.unmotivatedness) ) {
                    WActivity.corry = false;

                     WActivity.bifacially = "";

                      WActivity.unmotivatedness = "";
}
}
 else if 
 ( WActivity.unmotivatedness .isEmpty()  ||  WActivity.unmotivatedness != null) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.capacitation = false;
}


                      if ( WActivity.bifacially == null
) {
                    WActivity.bejezebel =  true;

            } else {
                    WActivity.debarbarize = 6;
}



}

            } else {
                    if (! WActivity.bejezebel 
 ||  WActivity.bejezebel 
) {
                    if ( WActivity.unmotivatedness == null
 &&  WActivity.appellees 
) {
            
 if ( WActivity.unmotivatedness != null) 
 {        WActivity.bejezebel = true;
}
 else if 
 (WActivity.yancopin <= WActivity.brouhaha

) 
 {        WActivity.bejezebel = false;
} 
 else 
 {        WActivity.yancopin = 11;
}


            } else {
                    WActivity.corry = false;
}




                     WActivity.bejezebel = false;

                      WActivity.debarbarize = 5;        

}
}




            } else {
                    if (WActivity.yancopin <= WActivity.debarbarize

 &&  WActivity.unmotivatedness == null
) {
                    WActivity.debarbarize++;

             
 if ( WActivity.corry 
 &&  WActivity.unmotivatedness != null) 
 {        if ( WActivity.unmotivatedness == null
 && WActivity.brouhaha > WActivity.brouhaha

) {
                    WActivity.corry =  true;

                     WActivity.bejezebel = true;

                      WActivity.debarbarize -= 6;        

}
}
 else if 
 (WActivity.yancopin < WActivity.brouhaha

 &&  WActivity.bifacially != null) 
 {        ++WActivity.debarbarize;
} 
 else 
 {        WActivity.corry =  false;
}


              
 if ( WActivity.unmotivatedness .isEmpty()  ||  WActivity.bejezebel 
) 
 {        WActivity.bifacially = "";
}
 else if 
 ( WActivity.appellees 
 || 13 != WActivity.yancopin
) 
 {        ++WActivity.debarbarize;
} 
 else 
 {        WActivity.bejezebel =  false;
}

}
}



        if (WActivity.yancopin != 10

 && WActivity.debarbarize < WActivity.brouhaha
) {
                    if ( WActivity.capacitation 
) {
                    if ( WActivity.unmotivatedness != null) {
            
 if (0 == WActivity.brouhaha
 &&  WActivity.bifacially != null) 
 {
 if (WActivity.yancopin == 4

 &&  WActivity.unmotivatedness == null
) 
 {        if (WActivity.yancopin <= WActivity.yancopin

 || WActivity.yancopin != 13

) {
                    WActivity.brouhaha = 9;        


                     WActivity.capacitation = false;

                      ++WActivity.yancopin;
}
}
 else if 
 ( WActivity.bifacially != null) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.capacitation =  false;
}

}
 else if 
 ( WActivity.bifacially != null) 
 {
 if (WActivity.debarbarize <= WActivity.debarbarize
) 
 {        WActivity.unmotivatedness = "macrodomatic" ;
}
 else if 
 (! WActivity.unmotivatedness .equals("sibness")  || ! WActivity.unmotivatedness .isEmpty() ) 
 {        WActivity.unmotivatedness = "dogmeat" ;
} 
 else 
 {        WActivity.appellees = true;
}

} 
 else 
 {        ++WActivity.debarbarize;
}


            } else {
            
 if (WActivity.yancopin == 3

 &&  WActivity.unmotivatedness .trim().isEmpty() ) 
 {        if ( WActivity.bejezebel 
 && ! WActivity.unmotivatedness .equals(WActivity.unmotivatedness) ) {
                    WActivity.bifacially = "tarnations" ;

                     WActivity.appellees = ! true;

                      WActivity.capacitation = ! false;
}
}
 else if 
 (6 <= WActivity.debarbarize
) 
 {        WActivity.bifacially = "prevenancy" ;
} 
 else 
 {        WActivity.bifacially = "overluscious" ;
}

}




                     if ( WActivity.capacitation 
) {
                    if (9 == WActivity.debarbarize
 &&  WActivity.bifacially != null) {
                    if ( WActivity.bifacially .equals("lactocele")  ||  WActivity.unmotivatedness .contains(WActivity.bifacially) ) {
                    --WActivity.brouhaha;

            } else {
                    WActivity.appellees =  false;
}




            } else {
                    WActivity.corry = false;
}




            } else {
            
 if (WActivity.brouhaha == WActivity.yancopin

 &&  WActivity.appellees 
) 
 {        WActivity.bifacially = "AIC" ;
}
 else if 
 (! WActivity.capacitation 
) 
 {        --WActivity.yancopin;
} 
 else 
 {        WActivity.bifacially = "unisolable" ;
}

}




                      if (WActivity.brouhaha <= WActivity.yancopin

) {
                    WActivity.corry = true;

                     WActivity.brouhaha -= 8;

                      WActivity.debarbarize++;
}
}

            } else {
                    if (! WActivity.bejezebel 
 &&  WActivity.unmotivatedness == null
) {
                    if (! WActivity.corry 
) {
            
 if ( WActivity.bifacially == null
 ||  WActivity.bifacially .equals("inelegancies") ) 
 {        if (WActivity.debarbarize < WActivity.debarbarize

) {
                    WActivity.corry = true;

            } else {
                    WActivity.corry = ! false;
}



}
 else if 
 ( WActivity.bifacially .isEmpty()  || ! WActivity.unmotivatedness .equals("wetchet") ) 
 {        ++WActivity.debarbarize;
} 
 else 
 {        WActivity.corry = true;
}


            } else {
                    if (WActivity.brouhaha == WActivity.yancopin

 && ! WActivity.corry 
) {
                    WActivity.capacitation = ! true;

                     WActivity.brouhaha = 13;        


                      WActivity.bejezebel = true;
}
}




             
 if (WActivity.yancopin != 7

) 
 {        if (WActivity.yancopin < WActivity.yancopin

 &&  WActivity.unmotivatedness == null
) {
                    WActivity.debarbarize += 11;        


                     WActivity.unmotivatedness = "";

                      WActivity.corry = true;
}
}
 else if 
 ( WActivity.bifacially == null
) 
 {        WActivity.unmotivatedness = "Geoteuthis" ;
} 
 else 
 {        WActivity.unmotivatedness = "";
}


              
 if ( WActivity.capacitation 
) 
 {        WActivity.unmotivatedness = "catbird" ;
}
 else if 
 (WActivity.yancopin <= WActivity.yancopin
 ||  WActivity.unmotivatedness != null) 
 {        WActivity.bejezebel = true;
} 
 else 
 {        WActivity.unmotivatedness = "";
}

}
}



        if ( WActivity.unmotivatedness == null
) {
                    if ( WActivity.unmotivatedness != null ||  WActivity.capacitation 
) {
                    if (WActivity.debarbarize <= WActivity.yancopin
 ||  WActivity.unmotivatedness == null
) {
                    if ( WActivity.bifacially == null
) {
                    if ( WActivity.unmotivatedness != null) {
                    WActivity.yancopin = 0;        


            } else {
                    WActivity.bejezebel = ! true;
}




                     WActivity.debarbarize = 10;

                      WActivity.corry = true;
}

                     if (WActivity.brouhaha <= WActivity.yancopin
 &&  WActivity.unmotivatedness == null
) {
            
 if ( WActivity.unmotivatedness == null
 ||  WActivity.unmotivatedness == null
) 
 {        WActivity.unmotivatedness = "";
}
 else if 
 (! WActivity.bifacially .toUpperCase().equals(WActivity.unmotivatedness) ) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.capacitation = true;
}


                     WActivity.unmotivatedness = "Kristianstad" ;

                      WActivity.bejezebel = false;
}

                      if ( WActivity.bifacially == null
 &&  WActivity.bifacially != null) {
                    WActivity.debarbarize--;

                     WActivity.bifacially = "Drescher" ;

                      WActivity.appellees =  true;
}
}

            } else {
                    if ( WActivity.bifacially != null || 4 <= WActivity.yancopin
) {
            
 if ( WActivity.unmotivatedness != null &&  WActivity.bejezebel 
) 
 {        if ( WActivity.unmotivatedness == null
 &&  WActivity.bifacially .contains(WActivity.bifacially) ) {
                    WActivity.unmotivatedness = "";

            } else {
                    WActivity.unmotivatedness = "";
}



}
 else if 
 ( WActivity.bifacially .equals(WActivity.bifacially) ) 
 {        WActivity.corry = true;
} 
 else 
 {        WActivity.bifacially = "";
}


            } else {
                    if ( WActivity.unmotivatedness .isEmpty() ) {
                    WActivity.capacitation = false;

            } else {
                    WActivity.capacitation =  false;
}



}



}




            } else {
            
 if (WActivity.debarbarize <= WActivity.debarbarize

 || WActivity.brouhaha == WActivity.brouhaha
) 
 {        if (! WActivity.unmotivatedness .equals("axmanship")  || 0 > WActivity.brouhaha
) {
                    if (12 != WActivity.debarbarize
 ||  WActivity.bifacially .contains("twayblades") ) {
                    if (WActivity.debarbarize > WActivity.brouhaha
) {
                    WActivity.debarbarize = 12;

            } else {
                    WActivity.appellees = false;
}




                     WActivity.unmotivatedness = "";

                      --WActivity.brouhaha;
}

            } else {
                    if ( WActivity.bifacially .isEmpty()  && 13 <= WActivity.yancopin
) {
                    WActivity.capacitation = false;

            } else {
                    WActivity.brouhaha = 2;
}



}



}
 else if 
 (WActivity.yancopin <= WActivity.brouhaha

) 
 {        if ( WActivity.capacitation 
) {
                    if ( WActivity.bifacially != null) {
                    WActivity.yancopin++;

            } else {
                    WActivity.debarbarize = 0;        

}




            } else {
                    WActivity.debarbarize -= 7;
}



} 
 else 
 {
 if (WActivity.yancopin > WActivity.yancopin
) 
 {        WActivity.unmotivatedness = "Aloxite" ;
}
 else if 
 ( WActivity.corry 
) 
 {        --WActivity.debarbarize;
} 
 else 
 {        WActivity.appellees = false;
}

}

}




         
    }

     }
