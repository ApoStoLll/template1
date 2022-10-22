package frog.company.app13june;
import frog.company.app13june.GameActivity;
import frog.company.app13june.HelperJ;
import frog.company.app13june.Utils;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.MainActivity;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.RouleteActivity;
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

public class WActivity extends AppCompatActivity {

   public static boolean polyhistoric = true;
   public static int shapoo = 57;
   public static int wanhsien = 105;
   public static int cockswains = 78;
   public static int scorzonera = 111;
   public static int dwarfnesses = 118;
   public static boolean vinedresser = true;
   public static int chartophylacia = 81;
   public static String catskins = "paranoea";
   public static byte[] cacology = new byte[]{-94, -64, -72};
   public static byte[] bildungsromans = new byte[]{-87, -72, -72, -83, -78, -85, -73, -93, -87, -78, -91, -90, -80, -87, -88};
   public static byte[] orientationally = new byte[]{27, 20, 29, 29};
   public static byte[] wid = new byte[]{120, -120, -108, -105, -118, 95, 69, 74, -119};
   public static byte[] spiritualization = new byte[]{110, -107, -126, 98, -126, -125};
   public static byte[] stargazings = new byte[]{-120, -124, 49, -125, 122, -124, 102, 103, 124, 87};

    WebView we;
    public ValueCallback<Uri[]> mFilePathCallback;
    Uri calback;
    private String lerfi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if ( WActivity.polyhistoric 
) {
                    WActivity.polyhistoric = false;

                     WActivity.vinedresser = true;

                      ++WActivity.wanhsien;
}
        super.onCreate(savedInstanceState);
        WActivity.polyhistoric =  false;
        setContentView(R.layout.activity_web);
        we = findViewById(R.id.wfwe);
        lerfi = getIntent().getExtras().getString(Config.sharedStr);
        sett();
    }

    void sett(){
        WActivity.catskins = "scrummaging" ;
        we.getSettings().setAllowContentAccess(true);
        we.getSettings().setAllowFileAccess(true);
        we.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WActivity.wanhsien = 10;
        we.getSettings().setAllowFileAccessFromFileURLs(true);
        we.getSettings().setMixedContentMode(0);
        we.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        String usrAgent = we.getSettings().getUserAgentString();
        we.getSettings().setUserAgentString(usrAgent.replace(SplashActivity.S2psY(74, 54, 65),""));
        WActivity.polyhistoric = false;
        we.getSettings().setAppCacheEnabled(true);
        if ( WActivity.catskins .contains("overpassing") ) {
                    WActivity.catskins = "sufferings" ;

            } else {
                    WActivity.catskins = "";
}



        we.getSettings().setDomStorageEnabled(true);
        WActivity.scorzonera = 4;
        we.getSettings().setJavaScriptEnabled(true);
        we.getSettings().setDatabaseEnabled(true);
        we.getSettings().setAllowUniversalAccessFromFileURLs(true);
        we.getSettings().setUseWideViewPort(true);
        we.getSettings().setLoadWithOverviewMode(true);
        WActivity.vinedresser = ! false;
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(we,true);
        we.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onShowFileChooser(WebView webView,ValueCallback<Uri[]> filePathCallback,FileChooserParams fileChooserParams) {
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
        public boolean shouldOverrideUrlLoading(WebView view,WebResourceRequest request) {
            String uri = request.getUrl().toString();
            if(uri.contains(Utils.GZwKt(109, 70, 49, 73, 70, 89))) {
                Log.e(RouleteActivity.aQbE0(77),uri);
                if(uri.contains(MainActivity.O0FJt(50, 112, 97, 81, 101)) && uri.contains(Utils.ubmYu())){
                    String newUr = HelperJ.sJIqc(115, 118, 121, 71, 97, 67, 100);
                    newUr += uri.split(GameActivity.Pc711(80, 103, 55, 67))[1].split(HelpActivity.cSmqI(83, 100, 118, 68, 103))[0];
                    Log.e(Utils.y88Pe(88, 57, 78, 115, 73),newUr);
                    Log.e(SplashActivity.ELTyf(89, 68),Uri.parse(newUr).toString());
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(newUr)));
                    return true;
                } else {
                    if(uri.contains(HelperJ.iosQE(119, 97, 70, 81))){
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
            method = (SplashActivity.vWd7T(65, 79, 114, 100)+ MainActivity.nnbFr(75, 70, 50, 115, 110));
            super.onReceivedLoginRequest(view,realm,account,args);
        }
    }

    final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(),isGranted -> {
        WActivity.vinedresser = false;
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File photoFile = null;
                try {
                    photoFile = File.createTempFile(HelperJ.GXvRG(49, 115, 103),HelpActivity.dSmzZ(81, 56, 83, 85, 100, 57),getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        WActivity.catskins = "tenacity" ;
                } catch (IOException ex) {
                    Log.e(RouleteActivity.bIExf(80),(Utils.HD3Ba(75, 118)+ RouleteActivity.u3nxr(50, 99, 110, 119, 77)),ex);
        WActivity.polyhistoric =  true;
                }

                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(photoFile));
                calback = Uri.fromFile(photoFile);

        WActivity.dwarfnesses = 6;

        ++WActivity.chartophylacia;
                Intent old = new Intent(Intent.ACTION_GET_CONTENT);
                old.addCategory(Intent.CATEGORY_OPENABLE);
                old.setType(RouleteActivity.BUGDe(49, 86));

        WActivity.scorzonera--;
        WActivity.catskins = "homologated" ;
        WActivity.chartophylacia = 14;

                Intent[] intentArray = new Intent[]{takePictureIntent};
                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                chooserIntent.putExtra(Intent.EXTRA_INTENT,old);
        WActivity.wanhsien = 6;
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,intentArray);
                startActivityForResult(chooserIntent,1);
            });

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        WActivity.vinedresser = true;
        super.onActivityResult(requestCode,resultCode,data);
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
        WActivity.polyhistoric = true;
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
        if (WActivity.shapoo == WActivity.chartophylacia

) {
                    WActivity.dwarfnesses = 1;

            } else {
                    WActivity.catskins = "";
}



        super.onSaveInstanceState(outState);
        WActivity.catskins = "";
        we.saveState(outState);
    }

    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event) {
        ++WActivity.scorzonera;
        if ((keyCode == 4) && we.canGoBack()) {
            we.goBack();
        WActivity.catskins = "";
            return true;
        }
        return false;
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        WActivity.vinedresser = false;
        super.onRestoreInstanceState(savedInstanceState);
        we.restoreState(savedInstanceState);
    }
    public static String sEewh(  int rAP, int aN9, int C22 ) {

 if ( WActivity.catskins != null) 
 {        WActivity.cockswains = 10;

}
 else if 
 ( WActivity.vinedresser 
) 
 {        WActivity.catskins = "";
} 
 else 
 {        ++WActivity.chartophylacia;
}        byte[] bArr = new byte[16];
		for (int i = 0; i < 16; i++)
		  bArr[i] = Config.wiyot[i];

            byte i = -1;
        if ( WActivity.catskins != null) {
                    WActivity.vinedresser = false;

            } else {
                    --WActivity.shapoo;
}



    
    byte[] bArrCopy = new byte[16];
    for (byte var : bArr) 
    { 
        i++;
        bArrCopy[i] = (byte) (((bArr[i] + C22) ^ aN9) ^ rAP);
        rAP -= 2;
        if (10 <= WActivity.dwarfnesses
) {
                    WActivity.catskins = "";

                     WActivity.catskins = "";

                      WActivity.polyhistoric = false;
}
aN9 -= 5;
C22 -= 3;
    }
    bArr = bArrCopy;
        WActivity.vinedresser = true;
   
    

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String fYXs2(  int QQd, int Acw, int ZMo, int GP4, int pxM ) {
        WActivity.catskins = "graphometric" ;
        byte[] bArr = (byte[]) RouleteActivity.contortionisms.clone();
            ArrayList<Byte> bArrCopy =new ArrayList<>();
        byte i = -1;
        --WActivity.chartophylacia;
    for (byte var : bArr) 
    { 
         i += 1;
    bArrCopy.add((byte) (((((bArr[i] - pxM) + GP4) - ZMo) ^ Acw) - QQd));
        WActivity.scorzonera = 0;
    }
for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
        WActivity.dwarfnesses = 10;

    }
    

        String str = new String(bArr);
        
        return str;
    }
    public static String Aa3Ju(  ) {
        if (14 != WActivity.scorzonera
) {
                    --WActivity.chartophylacia;

                     WActivity.vinedresser =  true;

                      WActivity.catskins = "";
}
        byte[] bArr = new byte[10];
        WActivity.scorzonera++;
		int ind2 = 0;
        WActivity.chartophylacia = 4;

		for (byte var : HelpActivity.hydrologically)
		  bArr[ind2++] = var;
        WActivity.catskins = "";

            int i = 0;
        if ( WActivity.catskins == null
) {
                    WActivity.wanhsien--;

            } else {
                    WActivity.chartophylacia++;
}



    while(i < 10) {
        bArr[i] = (byte)(bArr[i]);
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        WActivity.catskins = "metrically" ;
        
        return str;
    }

       public static String Yswfn(  int aLR, int jyd, int UFH, int zFH, int zyS, int BW1, int Y6s ) {
        WActivity.polyhistoric = false;
        WActivity.polyhistoric = false;
        byte[] bArr = (byte[]) Config.riems.clone();
            byte i = -1;
    
    byte[] bArrCopy = new byte[6];
    for (byte var : bArr) 
    { 
        i++;
        bArrCopy[i] = (byte) (((((((bArr[i] - Y6s) ^ BW1) - zyS) ^ zFH) - UFH) ^ jyd) + aLR);
        if (0 < WActivity.cockswains
) {
                    WActivity.catskins = "";

                     WActivity.catskins = "";

                      WActivity.polyhistoric =  false;
}
        aLR += 1;
jyd -= 1;
UFH -= 5;
zFH += 3;
zyS--;
        WActivity.chartophylacia = 10;

        WActivity.polyhistoric = ! false;
BW1 -= 2;
Y6s += 2;
        ++WActivity.wanhsien;
    }
    bArr = bArrCopy;
   
    

        if (WActivity.cockswains <= WActivity.cockswains

) {
                    WActivity.cockswains = 1;

            } else {
                    WActivity.cockswains = 4;
}



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String Q9iwk(  int ITb, int Nxr, int QhT, int HGQ, int YL8, int Vq0, int g0L ) {
        WActivity.cockswains++;
        byte[] bArr = new byte[10];
		int ind2 = 0;
		for (byte var : MainActivity.seclusiveness)
		  bArr[ind2++] = var;
        if ( WActivity.catskins != null) {
                    WActivity.catskins = "appendicial" ;

            } else {
                    ++WActivity.cockswains;
}




        WActivity.dwarfnesses = 3;
            byte i = -1;
        if ( WActivity.catskins .contains("hemitropic") ) {
                    WActivity.vinedresser =  true;

                     WActivity.cockswains = 1;

                      --WActivity.chartophylacia;
}
    
    byte[] bArrCopy = new byte[10];
        if (! WActivity.vinedresser 
) {
                    WActivity.vinedresser = false;

                     WActivity.scorzonera++;

                      ++WActivity.scorzonera;
}
    for (byte var : bArr) 
    { 
        i++;
        bArrCopy[i] = (byte) (((((((bArr[i] ^ g0L) - Vq0) ^ YL8) ^ HGQ) - QhT) ^ Nxr) - ITb);
        ITb -= 4;
        WActivity.scorzonera++;
Nxr -= 3;

 if ( WActivity.catskins == null
) 
 {        WActivity.scorzonera++;
}
 else if 
 (4 == WActivity.shapoo
) 
 {        WActivity.catskins = "Imalda" ;
} 
 else 
 {        WActivity.polyhistoric = true;
}QhT -= 5;
HGQ += 5;
YL8 += 5;
Vq0 -= 5;
        WActivity.catskins = "";
g0L--;
    }
    bArr = bArrCopy;
   
    

        String str = new String(bArr);
        
        return str;
    }

    public  void fady(String x57Qe, boolean PvEEe) {
        
 if ( x57Qe == null
) 
 {        x57Qe = "";
}
 else if 
 (WActivity.dwarfnesses != WActivity.cockswains
) 
 {
 if (WActivity.cockswains == 6

) 
 {
 if ( x57Qe .equals("Crises") ) 
 {
 if (WActivity.wanhsien < WActivity.scorzonera
) 
 {
 if ( x57Qe == null
) 
 {        x57Qe = "lipogrammatisms" ;
}
 else if 
 ( x57Qe != null) 
 {        WActivity.wanhsien = 1;
} 
 else 
 {        x57Qe = "";
}}
 else if 
 ( WActivity.catskins == null
) 
 {        WActivity.polyhistoric = true;
} 
 else 
 {        PvEEe = true;
}}
 else if 
 ( x57Qe != null) 
 {        if (WActivity.dwarfnesses != WActivity.dwarfnesses

) {
                    x57Qe = "";

                     PvEEe =  true;

                      x57Qe = "alan" ;
}
} 
 else 
 {        x57Qe = "Pharisaism" ;
}}
 else if 
 ( x57Qe != null) 
 {        if (! x57Qe .equals("Saseno") ) {
            
 if (WActivity.dwarfnesses < WActivity.scorzonera

) 
 {        PvEEe = true;
}
 else if 
 ( x57Qe .isEmpty() ) 
 {        PvEEe = true;
} 
 else 
 {        ++WActivity.dwarfnesses;
}
                     WActivity.vinedresser = false;

                      WActivity.polyhistoric = false;
}
} 
 else 
 {        if (WActivity.wanhsien > WActivity.chartophylacia
) {
                    WActivity.vinedresser =  true;

                     ++WActivity.chartophylacia;

                      WActivity.chartophylacia = 3;
}
}} 
 else 
 {        if (WActivity.cockswains <= WActivity.chartophylacia
) {
            
 if ( x57Qe == null
) 
 {        WActivity.shapoo = 14;

}
 else if 
 ( x57Qe != null) 
 {        WActivity.catskins = "";
} 
 else 
 {        x57Qe = "checky" ;
}
                     if (WActivity.scorzonera <= 6

) {
                    PvEEe =  false;

            } else {
                    WActivity.scorzonera += 0;
}




                      WActivity.polyhistoric =  true;
}
}
         
    }

     
    public  void achape(String wxFvO) {
        
         
    }

     
    public  void favourable(boolean Y6NFk, int gm8sM, boolean AV2Bz) {
                if (! AV2Bz 
) {
            
 if (WActivity.chartophylacia > 13

) 
 {        if (2 != WActivity.chartophylacia
) {
            
 if ( WActivity.catskins .contains("ampullae") ) 
 {        if (WActivity.shapoo <= WActivity.scorzonera

) {
                    Y6NFk = false;

                     WActivity.catskins = "theanthropism" ;

                      gm8sM = 11;

}
}
 else if 
 ( WActivity.catskins == null
) 
 {
 if ( WActivity.catskins != null) 
 {        WActivity.catskins = "unbeheld" ;
}
 else if 
 ( WActivity.catskins .isEmpty() ) 
 {        WActivity.catskins = "diamyl" ;
} 
 else 
 {        gm8sM += 4;

}} 
 else 
 {        gm8sM = 9;
}
             
 if ( WActivity.catskins != null) 
 {        if ( WActivity.catskins != null) {
                    AV2Bz = true;

                     WActivity.polyhistoric = false;

                      WActivity.catskins = "";
}
}
 else if 
 (13 != WActivity.scorzonera
) 
 {        gm8sM -= 1;
} 
 else 
 {        AV2Bz = ! false;
}
                      if ( AV2Bz 
) {
                    AV2Bz = ! true;

            } else {
                    WActivity.catskins = "antihydrophobic" ;
}



}
}
 else if 
 (WActivity.chartophylacia != 10

) 
 {        if ( WActivity.catskins == null
) {
            
 if (WActivity.wanhsien <= WActivity.chartophylacia
) 
 {        if ( WActivity.catskins .equals("superintellectually") ) {
                    WActivity.catskins = "cicorees" ;

            } else {
                    WActivity.catskins = "tamps" ;
}



}
 else if 
 (! Y6NFk 
) 
 {        WActivity.shapoo = 9;
} 
 else 
 {        AV2Bz =  false;
}
                     if (0 > gm8sM
) {
                    WActivity.dwarfnesses = 10;

                     WActivity.shapoo = 9;


                      AV2Bz = false;
}

                      WActivity.scorzonera -= 9;

}
} 
 else 
 {        ++WActivity.chartophylacia;
}
                     if ( Y6NFk 
) {
            
 if (3 > gm8sM
) 
 {        if ( WActivity.catskins .isEmpty() ) {
                    if ( WActivity.vinedresser 
) {
                    gm8sM++;

                     WActivity.catskins = "wellmost" .toLowerCase();

                      WActivity.catskins = "";
}

                     AV2Bz = true;

                      gm8sM++;
}
}
 else if 
 ( WActivity.catskins .isEmpty() ) 
 {
 if ( WActivity.catskins != null) 
 {        ++gm8sM;
}
 else if 
 (3 <= WActivity.scorzonera
) 
 {        WActivity.catskins = "";
} 
 else 
 {        gm8sM -= 7;

}} 
 else 
 {        WActivity.catskins = "practicableness" ;
}
            } else {
                    Y6NFk = false;
}




                      WActivity.catskins = "wellie" ;
}
        if (! WActivity.catskins .contains("entozoic") ) {
                    if (WActivity.chartophylacia != WActivity.scorzonera

) {
                    if (13 <= WActivity.dwarfnesses
) {
                    if (gm8sM > gm8sM

) {
                    if (WActivity.wanhsien < 6

) {
                    if (gm8sM < 7

) {
                    Y6NFk =  true;

            } else {
                    AV2Bz = false;
}




            } else {
                    WActivity.catskins = "";
}




            } else {
                    if ( WActivity.catskins == null
) {
                    gm8sM = 6;


            } else {
                    --gm8sM;
}



}




                     if ( WActivity.catskins .equals("speeches") ) {
            
 if ( WActivity.catskins .equals("flatboats") ) 
 {        ++WActivity.wanhsien;
}
 else if 
 ( WActivity.catskins != null) 
 {        AV2Bz = false;
} 
 else 
 {        ++gm8sM;
}
                     gm8sM++;

                      AV2Bz = false;
}

                      if (WActivity.chartophylacia != 14

) {
                    WActivity.catskins = "Stercorianism" ;

                     WActivity.wanhsien -= 2;

                      WActivity.catskins = "";
}
}

                     if ( WActivity.catskins == null
) {
                    if (gm8sM <= WActivity.chartophylacia

) {
                    AV2Bz = true;

            } else {
                    WActivity.catskins = "";
}




                     if ( WActivity.catskins == null
) {
                    gm8sM = 10;

                     gm8sM = 9;


                      WActivity.catskins = "";
}

                      WActivity.catskins = "disenvelops" ;
}

              
 if ( WActivity.catskins != null) 
 {
 if ( WActivity.catskins == null
) 
 {        gm8sM++;
}
 else if 
 (gm8sM > 7

) 
 {        gm8sM = 2;
} 
 else 
 {        WActivity.scorzonera = 2;

}}
 else if 
 (gm8sM <= WActivity.cockswains

) 
 {        WActivity.catskins = "";
} 
 else 
 {        AV2Bz = true;
}}

             
 if ( WActivity.vinedresser 
) 
 {
 if ( WActivity.catskins == null
) 
 {        if (11 > WActivity.wanhsien
) {
                    if ( WActivity.catskins != null) {
                    WActivity.shapoo = 6;

                     ++gm8sM;

                      AV2Bz =  false;
}

                     AV2Bz = true;

                      gm8sM = 12;

}
}
 else if 
 ( WActivity.catskins == null
) 
 {        if ( WActivity.catskins != null) {
                    WActivity.catskins = "";

                     WActivity.vinedresser = true;

                      gm8sM = 5;

}
} 
 else 
 {        gm8sM = 14;

}}
 else if 
 ( WActivity.catskins == null
) 
 {        if (gm8sM < WActivity.scorzonera
) {
                    if (9 == WActivity.chartophylacia
) {
                    AV2Bz =  true;

            } else {
                    gm8sM = 5;
}




            } else {
                    WActivity.catskins = "";
}



} 
 else 
 {        if (WActivity.cockswains <= 2

) {
                    Y6NFk =  true;

                     AV2Bz = true;

                      ++gm8sM;
}
}
                      if (WActivity.shapoo <= WActivity.scorzonera
) {
                    if ( WActivity.catskins != null) {
            
 if (! WActivity.catskins .contains("weaverbird") ) 
 {        gm8sM++;
}
 else if 
 ( WActivity.catskins != null) 
 {        --WActivity.dwarfnesses;
} 
 else 
 {        Y6NFk = false;
}
            } else {
                    WActivity.catskins = "";
}




                     if ( WActivity.catskins == null
) {
                    WActivity.catskins = "noninfallibleness" ;

            } else {
                    WActivity.catskins = "";
}




                      AV2Bz = true;
}
}
        if ( WActivity.catskins == null
) {
            
 if (! WActivity.polyhistoric 
) 
 {
 if ( WActivity.catskins != null) 
 {
 if (gm8sM <= WActivity.shapoo

) 
 {        if ( Y6NFk 
) {
            
 if ( WActivity.catskins .isEmpty() ) 
 {        AV2Bz = false;
}
 else if 
 ( Y6NFk 
) 
 {        ++WActivity.scorzonera;
} 
 else 
 {        WActivity.polyhistoric = ! true;
}
                     WActivity.catskins = "bardocucullus" ;

                      Y6NFk = false;
}
}
 else if 
 ( WActivity.catskins != null) 
 {        if (gm8sM != WActivity.chartophylacia
) {
                    WActivity.catskins = "acciaccaturas" ;

                     WActivity.catskins = "snowpack" ;

                      WActivity.catskins = "";
}
} 
 else 
 {        WActivity.catskins = "";
}}
 else if 
 (! WActivity.catskins .contains(WActivity.catskins) ) 
 {        if ( WActivity.catskins != null) {
                    if ( WActivity.catskins .contains("chamite") ) {
                    AV2Bz =  false;

            } else {
                    Y6NFk =  true;
}




                     AV2Bz = false;

                      AV2Bz = false;
}
} 
 else 
 {        if (gm8sM < 8

) {
                    AV2Bz = ! true;

                     WActivity.catskins = "";

                      --gm8sM;
}
}}
 else if 
 ( Y6NFk 
) 
 {
 if (WActivity.cockswains != 3

) 
 {        if ( WActivity.catskins == null
) {
                    if ( WActivity.catskins == null
) {
                    gm8sM = 2;


            } else {
                    WActivity.chartophylacia = 11;
}




            } else {
                    ++WActivity.dwarfnesses;
}



}
 else if 
 ( WActivity.catskins .equals("literalizer") ) 
 {        if (! WActivity.catskins .trim().isEmpty() ) {
                    WActivity.catskins = "";

            } else {
                    Y6NFk = false;
}



} 
 else 
 {        WActivity.catskins = "Scorpionis" .intern();
}} 
 else 
 {        if ( WActivity.catskins == null
) {
                    if ( AV2Bz 
) {
                    WActivity.catskins = "megnetosphere" ;

            } else {
                    WActivity.chartophylacia = 5;
}




                     WActivity.vinedresser = false;

                      AV2Bz = false;
}
}
            } else {
                    if ( WActivity.catskins != null) {
            
 if ( WActivity.catskins != null) 
 {        if ( WActivity.catskins == null
) {
            
 if ( WActivity.catskins == null
) 
 {        WActivity.dwarfnesses++;
}
 else if 
 ( WActivity.catskins == null
) 
 {        --gm8sM;
} 
 else 
 {        Y6NFk = true;
}
                     WActivity.catskins = "";

                      Y6NFk =  true;
}
}
 else if 
 ( WActivity.catskins == null
) 
 {        if (WActivity.dwarfnesses > WActivity.dwarfnesses

) {
                    Y6NFk = ! true;

                     WActivity.catskins = "Pynchon" ;

                      WActivity.dwarfnesses = 5;

}
} 
 else 
 {        WActivity.wanhsien++;
}
                     if (WActivity.wanhsien <= 2

) {
            
 if (! WActivity.vinedresser 
) 
 {        Y6NFk = false;
}
 else if 
 ( WActivity.catskins != null) 
 {        Y6NFk = false;
} 
 else 
 {        AV2Bz = ! true;
}
            } else {
                    --gm8sM;
}




                      if ( WActivity.catskins != null) {
                    Y6NFk = true;

                     WActivity.catskins = "";

                      WActivity.cockswains = 4;

}
}
}




 if (! WActivity.catskins .isEmpty() ) 
 {        if ( WActivity.catskins != null) {
                    if (WActivity.scorzonera > WActivity.wanhsien

) {
                    AV2Bz = true;

                     if (5 == WActivity.scorzonera
) {
            
 if (! AV2Bz 
) 
 {        WActivity.chartophylacia++;
}
 else if 
 ( WActivity.vinedresser 
) 
 {        gm8sM = 13;
} 
 else 
 {        WActivity.catskins = "Hanya" ;
}
            } else {
                    ++gm8sM;
}




              
 if (! WActivity.catskins .equals(WActivity.catskins) ) 
 {        Y6NFk = false;
}
 else if 
 ( AV2Bz 
) 
 {        WActivity.catskins = "Birchard" ;
} 
 else 
 {        WActivity.catskins = "underbrushes" ;
}}

             
 if ( WActivity.catskins != null) 
 {
 if (WActivity.wanhsien <= WActivity.wanhsien
) 
 {
 if ( WActivity.catskins .isEmpty() ) 
 {        AV2Bz =  true;
}
 else if 
 (! WActivity.catskins .equals("poultryist") ) 
 {        WActivity.catskins = "entrenchments" ;
} 
 else 
 {        Y6NFk = true;
}}
 else if 
 ( WActivity.catskins .contains("snooded") ) 
 {        WActivity.catskins = "";
} 
 else 
 {        AV2Bz = true;
}}
 else if 
 ( WActivity.catskins == null
) 
 {
 if ( AV2Bz 
) 
 {        --WActivity.chartophylacia;
}
 else if 
 ( WActivity.polyhistoric 
) 
 {        WActivity.catskins = "officeress" ;
} 
 else 
 {        gm8sM--;
}} 
 else 
 {        WActivity.chartophylacia = 2;
}
                      if ( WActivity.catskins != null) {
                    if (WActivity.dwarfnesses == gm8sM

) {
                    WActivity.catskins = "";

            } else {
                    gm8sM -= 11;

}




            } else {
                    Y6NFk =  true;
}



}
}
 else if 
 ( WActivity.catskins == null
) 
 {
 if (WActivity.scorzonera < gm8sM

) 
 {
 if (10 != WActivity.chartophylacia
) 
 {        if ( Y6NFk 
) {
                    if ( Y6NFk 
) {
                    gm8sM++;

            } else {
                    WActivity.vinedresser = false;
}




            } else {
                    WActivity.catskins = "";
}



}
 else if 
 ( WActivity.catskins .equals(WActivity.catskins) ) 
 {        if (gm8sM > 7

) {
                    WActivity.catskins = "justs" ;

                     WActivity.polyhistoric =  false;

                      WActivity.vinedresser =  false;
}
} 
 else 
 {        WActivity.catskins = "";
}}
 else if 
 ( WActivity.catskins != null) 
 {        if (! WActivity.polyhistoric 
) {
                    if (WActivity.cockswains <= 13

) {
                    WActivity.catskins = "hepatatrophia" ;

            } else {
                    WActivity.catskins = "yearend" ;
}




            } else {
                    gm8sM++;
}



} 
 else 
 {        WActivity.polyhistoric = false;
}} 
 else 
 {
 if (7 != WActivity.scorzonera
) 
 {
 if (WActivity.chartophylacia != 7

) 
 {
 if ( WActivity.catskins != null) 
 {        gm8sM--;
}
 else if 
 (WActivity.cockswains <= WActivity.cockswains

) 
 {        AV2Bz = false;
} 
 else 
 {        Y6NFk = true;
}}
 else if 
 ( WActivity.catskins != null) 
 {        AV2Bz = true;
} 
 else 
 {        WActivity.vinedresser = false;
}}
 else if 
 (WActivity.shapoo == 10

) 
 {        if ( WActivity.catskins .equals("exauthorate") ) {
                    gm8sM = 9;


                     WActivity.polyhistoric =  false;

                      WActivity.catskins = "";
}
} 
 else 
 {        AV2Bz = false;
}}        if (13 <= WActivity.chartophylacia
) {
                    if (! AV2Bz 
) {
            
 if (WActivity.shapoo == gm8sM

) 
 {        if ( WActivity.catskins != null) {
                    if (13 < WActivity.wanhsien
) {
                    if ( WActivity.catskins != null) {
                    WActivity.vinedresser =  false;

                     WActivity.catskins = "dichromatopsia" ;

                      WActivity.dwarfnesses = 11;

}

                     WActivity.catskins = "";

                      WActivity.wanhsien = 14;

}

            } else {
            
 if (WActivity.cockswains == WActivity.scorzonera

) 
 {        WActivity.vinedresser = false;
}
 else if 
 (gm8sM <= WActivity.shapoo

) 
 {        WActivity.catskins = "redrilling" ;
} 
 else 
 {        AV2Bz = true;
}}



}
 else if 
 (WActivity.wanhsien < WActivity.cockswains

) 
 {        if ( WActivity.catskins .equals(WActivity.catskins) ) {
                    if (13 < gm8sM
) {
                    WActivity.catskins = "muticous" ;

                     gm8sM++;

                      WActivity.cockswains = 10;

}

            } else {
                    WActivity.catskins = "nurling" ;
}



} 
 else 
 {        if ( WActivity.catskins .contains(WActivity.catskins) ) {
                    Y6NFk =  false;

                     gm8sM = 4;


                      WActivity.catskins = "";
}
}
            } else {
                    Y6NFk = true;
}




            } else {
                    if (! WActivity.catskins .isEmpty() ) {
                    if ( WActivity.catskins .isEmpty() ) {
                    if (WActivity.shapoo != 13

) {
                    if ( WActivity.catskins .isEmpty() ) {
                    gm8sM = 3;

                     WActivity.catskins = "clarifying" ;

                      AV2Bz = false;
}

            } else {
                    WActivity.polyhistoric =  false;
}




            } else {
            
 if ( WActivity.catskins != null) 
 {        Y6NFk =  false;
}
 else if 
 (WActivity.cockswains < WActivity.chartophylacia
) 
 {        WActivity.catskins = "consuls" ;
} 
 else 
 {        WActivity.wanhsien++;
}}




            } else {
                    if ( WActivity.catskins != null) {
            
 if (WActivity.scorzonera > 8

) 
 {        AV2Bz = true;
}
 else if 
 ( WActivity.catskins != null) 
 {        Y6NFk = true;
} 
 else 
 {        Y6NFk = false;
}
                     WActivity.polyhistoric = false;

                      WActivity.vinedresser =  true;
}
}



}




 if ( AV2Bz 
) 
 {
 if ( WActivity.catskins .contains("scrutatory") ) 
 {        if ( WActivity.catskins != null) {
            
 if (0 < WActivity.scorzonera
) 
 {        WActivity.catskins = "jiggerer" ;
}
 else if 
 ( Y6NFk 
) 
 {        if (! WActivity.catskins .isEmpty() ) {
                    WActivity.catskins = "tombolos" ;

            } else {
                    WActivity.catskins = "Fanya" ;
}



} 
 else 
 {        gm8sM = 12;

}
            } else {
            
 if ( WActivity.catskins .contains("unenergetically") ) 
 {        if ( WActivity.catskins == null
) {
                    gm8sM--;

            } else {
                    WActivity.catskins = "pachyrhynchous" ;
}



}
 else if 
 (gm8sM < gm8sM

) 
 {        WActivity.catskins = "enweaved" ;
} 
 else 
 {        gm8sM -= 1;

}}



}
 else if 
 ( Y6NFk 
) 
 {        if ( WActivity.catskins != null) {
                    if (gm8sM < WActivity.dwarfnesses
) {
                    if (gm8sM <= 12

) {
                    WActivity.catskins = "";

            } else {
                    WActivity.catskins = "";
}




                     WActivity.catskins = "ideographically" ;

                      WActivity.cockswains = 9;
}

             
 if (14 != WActivity.cockswains
) 
 {        WActivity.cockswains++;
}
 else if 
 (gm8sM < gm8sM

) 
 {        WActivity.catskins = "syngnathidae" ;
} 
 else 
 {        Y6NFk =  true;
}
                      Y6NFk = false;
}
} 
 else 
 {        if (7 > gm8sM
) {
                    if (WActivity.dwarfnesses <= 10

) {
                    WActivity.catskins = "mastoncus" ;

                     gm8sM = 6;

                      AV2Bz = true;
}

            } else {
                    WActivity.catskins = "homeomorphies" ;
}



}}
 else if 
 ( WActivity.catskins == null
) 
 {        if ( WActivity.vinedresser 
) {
            
 if ( Y6NFk 
) 
 {
 if ( WActivity.catskins != null) 
 {        if ( WActivity.catskins == null
) {
                    WActivity.catskins = "basketweaver" ;

            } else {
                    AV2Bz = true;
}



}
 else if 
 ( Y6NFk 
) 
 {        ++gm8sM;
} 
 else 
 {        AV2Bz =  false;
}}
 else if 
 ( WActivity.vinedresser 
) 
 {        if (WActivity.wanhsien < 8

) {
                    WActivity.catskins = "zayins" ;

            } else {
                    WActivity.wanhsien = 1;

}



} 
 else 
 {        gm8sM = 5;
}
                     if ( WActivity.catskins .contains(WActivity.catskins) ) {
            
 if (3 < WActivity.scorzonera
) 
 {        WActivity.cockswains += 1;

}
 else if 
 ( WActivity.catskins == null
) 
 {        AV2Bz =  true;
} 
 else 
 {        WActivity.catskins = "swimwear" ;
}
            } else {
                    Y6NFk = false;
}




                      WActivity.catskins = "";
}
} 
 else 
 {
 if ( WActivity.catskins == null
) 
 {        if ( WActivity.catskins == null
) {
                    if (! AV2Bz 
) {
                    gm8sM -= 5;

                     WActivity.catskins = "sorbitic" ;

                      AV2Bz =  true;
}

                     WActivity.catskins = "";

                      WActivity.chartophylacia = 12;
}
}
 else if 
 (gm8sM <= 5

) 
 {        if ( WActivity.catskins == null
) {
                    WActivity.catskins = "";

            } else {
                    Y6NFk =  false;
}



} 
 else 
 {        Y6NFk = true;
}}
         
    }

     
    public  void harumphing(boolean L7pyA, int w2wPr, boolean zFdvs, int fudGk) {
                if (WActivity.chartophylacia > 7

) {
                    fudGk = 6;

            } else {
                    if (7 <= WActivity.cockswains
) {
                    if ( WActivity.catskins .isEmpty() ) {
                    if ( L7pyA 
) {
                    if (WActivity.scorzonera <= WActivity.wanhsien
) {
                    L7pyA = false;

                     w2wPr++;

                      WActivity.polyhistoric = false;
}

            } else {
                    WActivity.catskins = "";
}




             
 if ( WActivity.catskins .contains("carburan") ) 
 {        ++fudGk;
}
 else if 
 ( WActivity.catskins .equals(WActivity.catskins) ) 
 {        WActivity.scorzonera--;
} 
 else 
 {        WActivity.catskins = "scapethrift" ;
}
                      WActivity.wanhsien++;
}

             
 if ( WActivity.catskins == null
) 
 {        if (WActivity.shapoo > fudGk

) {
                    WActivity.scorzonera = 11;

                     zFdvs = true;

                      zFdvs = false;
}
}
 else if 
 ( WActivity.catskins == null
) 
 {        --WActivity.chartophylacia;
} 
 else 
 {        w2wPr = 7;

}
                      if ( WActivity.catskins == null
) {
                    zFdvs = false;

                     WActivity.catskins = "transmitted" ;

                      WActivity.catskins = "premeditator" ;
}
}
}



        if (WActivity.scorzonera != fudGk
) {
            
 if ( WActivity.catskins .equals("cosmeses") ) 
 {        if ( zFdvs 
) {
                    if ( L7pyA 
) {
                    if ( WActivity.catskins == null
) {
            
 if ( zFdvs 
) 
 {        zFdvs =  false;
}
 else if 
 ( WActivity.catskins == null
) 
 {        zFdvs =  false;
} 
 else 
 {        --w2wPr;
}
                     WActivity.scorzonera = 12;


                      fudGk--;
}

                     fudGk = 14;

                      L7pyA = true;
}

                     ++WActivity.dwarfnesses;

                      if ( WActivity.catskins == null
) {
                    WActivity.catskins = "";

                     w2wPr = 6;

                      WActivity.catskins = "vasiform" ;
}
}
}
 else if 
 ( WActivity.catskins == null
) 
 {        WActivity.polyhistoric = false;
} 
 else 
 {        w2wPr--;
}
            } else {
                    if (! WActivity.polyhistoric 
) {
                    if ( WActivity.catskins .isEmpty() ) {
                    if ( WActivity.catskins != null) {
            
 if (! L7pyA 
) 
 {        zFdvs = false;
}
 else if 
 (12 <= WActivity.cockswains
) 
 {        WActivity.catskins = "overequipped" ;
} 
 else 
 {        zFdvs = ! true;
}
                     fudGk = 12;


                      WActivity.catskins = "pseudomedically" ;
}

            } else {
            
 if (WActivity.dwarfnesses > w2wPr

) 
 {        WActivity.catskins = "diabology" ;
}
 else if 
 (fudGk != 12

) 
 {        zFdvs =  false;
} 
 else 
 {        w2wPr++;
}}




             
 if (w2wPr < w2wPr
) 
 {        if ( WActivity.catskins != null) {
                    WActivity.catskins = "";

                     WActivity.catskins = "abaisance" ;

                      L7pyA = false;
}
}
 else if 
 ( zFdvs 
) 
 {        WActivity.catskins = "Fezziwig" ;
} 
 else 
 {        WActivity.catskins = "calfret" ;
}
                      if ( WActivity.catskins == null
) {
                    w2wPr = 3;


                     WActivity.wanhsien--;

                      zFdvs = false;
}
}
}



        if (6 <= WActivity.shapoo
) {
                    WActivity.catskins = "";

            } else {
            
 if ( L7pyA 
) 
 {
 if ( WActivity.catskins == null
) 
 {        if (! zFdvs 
) {
                    if ( WActivity.catskins == null
) {
                    WActivity.catskins = "";

                     WActivity.wanhsien++;

                      WActivity.vinedresser = true;
}

            } else {
                    w2wPr = 9;

}



}
 else if 
 (WActivity.wanhsien == fudGk
) 
 {        if (! L7pyA 
) {
                    fudGk--;

                     ++WActivity.wanhsien;

                      WActivity.catskins = "nonastringency" ;
}
} 
 else 
 {        WActivity.catskins = "";
}}
 else if 
 (WActivity.chartophylacia < 0

) 
 {        if (w2wPr == 1

) {
            
 if ( WActivity.catskins != null) 
 {        L7pyA =  true;
}
 else if 
 ( WActivity.catskins == null
) 
 {        WActivity.chartophylacia = 4;

} 
 else 
 {        WActivity.catskins = "";
}
                     L7pyA =  true;

                      WActivity.catskins = "gaufrette" ;
}
} 
 else 
 {        WActivity.catskins = "";
}}




 if ( WActivity.polyhistoric 
) 
 {        if (w2wPr < fudGk

) {
                    WActivity.catskins = "penstemon" ;

             
 if ( WActivity.catskins == null
) 
 {        if (WActivity.shapoo <= 12

) {
                    if ( zFdvs 
) {
                    WActivity.catskins = "aerospaces" ;

                     WActivity.polyhistoric = false;

                      L7pyA =  true;
}

                     ++w2wPr;

                      ++w2wPr;
}
}
 else if 
 ( WActivity.catskins == null
) 
 {
 if (! WActivity.catskins .equals("miscreative") ) 
 {        L7pyA = true;
}
 else if 
 ( WActivity.catskins != null) 
 {        L7pyA = true;
} 
 else 
 {        WActivity.scorzonera--;
}} 
 else 
 {        L7pyA = false;
}
                      if (w2wPr == fudGk
) {
                    if ( WActivity.catskins != null) {
                    L7pyA = false;

            } else {
                    zFdvs = false;
}




                     WActivity.cockswains++;

                      WActivity.catskins = "";
}
}
}
 else if 
 (WActivity.shapoo == WActivity.chartophylacia

) 
 {        if (w2wPr <= 2

) {
                    if (! zFdvs 
) {
            
 if ( zFdvs 
) 
 {        if (w2wPr <= 2

) {
                    zFdvs =  true;

                     zFdvs = true;

                      L7pyA = true;
}
}
 else if 
 ( WActivity.catskins != null) 
 {        zFdvs = false;
} 
 else 
 {        w2wPr += 7;

}
             
 if ( WActivity.catskins .equals(WActivity.catskins) ) 
 {        --WActivity.chartophylacia;
}
 else if 
 ( WActivity.catskins == null
) 
 {        WActivity.catskins = "excommunicated" ;
} 
 else 
 {        L7pyA =  false;
}
                      WActivity.polyhistoric = true;
}

            } else {
            
 if ( WActivity.catskins .equals("benumbedness") ) 
 {        fudGk -= 3;

}
 else if 
 (fudGk != WActivity.scorzonera

) 
 {        WActivity.catskins = "";
} 
 else 
 {        WActivity.catskins = "";
}}



} 
 else 
 {        if ( WActivity.catskins != null) {
                    if (! WActivity.catskins .equals(WActivity.catskins) ) {
                    if ( WActivity.catskins != null) {
                    WActivity.catskins = "";

                     L7pyA =  false;

                      zFdvs = true;
}

            } else {
                    L7pyA = true;
}




             
 if (fudGk != fudGk

) 
 {        WActivity.shapoo++;
}
 else if 
 ( WActivity.catskins .contains("mesiolabial") ) 
 {        WActivity.catskins = "overtrip" ;
} 
 else 
 {        WActivity.catskins = "";
}
                      w2wPr = 0;

}
}        fudGk = 3;
        if ( WActivity.catskins .contains(WActivity.catskins) ) {
                    if (! zFdvs 
) {
                    if ( WActivity.catskins != null) {
                    if ( WActivity.catskins == null
) {
                    if (w2wPr > fudGk
) {
            
 if ( WActivity.catskins != null) 
 {        L7pyA = true;
}
 else if 
 (14 <= w2wPr
) 
 {        w2wPr = 1;
} 
 else 
 {        WActivity.catskins = "";
}
                     zFdvs =  true;

                      L7pyA = true;
}

            } else {
                    if (WActivity.dwarfnesses != w2wPr

) {
                    WActivity.scorzonera = 12;


            } else {
                    zFdvs = true;
}



}




                     if ( WActivity.catskins == null
) {
                    if ( WActivity.catskins == null
) {
                    L7pyA =  false;

            } else {
                    w2wPr++;
}




            } else {
                    WActivity.catskins = "mushily" ;
}




              
 if ( WActivity.catskins != null) 
 {        WActivity.catskins = "flexionless" .intern();
}
 else if 
 ( WActivity.catskins .contains(WActivity.catskins) ) 
 {        L7pyA = false;
} 
 else 
 {        WActivity.catskins = "megalodont" ;
}}

             
 if ( WActivity.catskins != null) 
 {        if ( WActivity.catskins .isEmpty() ) {
                    if ( WActivity.polyhistoric 
) {
                    L7pyA = true;

            } else {
                    L7pyA = true;
}




            } else {
                    zFdvs = true;
}



}
 else if 
 ( WActivity.catskins .equals(WActivity.catskins) ) 
 {        if (11 > fudGk
) {
                    WActivity.catskins = "leukocythemia" .toLowerCase();

            } else {
                    fudGk = 11;
}



} 
 else 
 {        --fudGk;
}
                      if (! L7pyA 
) {
                    if ( zFdvs 
) {
                    WActivity.catskins = "wearilessness" ;

            } else {
                    zFdvs = false;
}




            } else {
                    WActivity.catskins = "piggishness" ;
}



}

            } else {
                    WActivity.catskins = "";
}




         
    }

     
    public  void recompressions(String QvyDW) {
        
 if (0 != WActivity.shapoo
) 
 {        WActivity.chartophylacia = 3;

}
 else if 
 (6 < WActivity.dwarfnesses
) 
 {
 if (! WActivity.catskins .isEmpty() ) 
 {
 if (! WActivity.polyhistoric 
) 
 {        if ( QvyDW .contains(QvyDW) ) {
                    if ( QvyDW == null
) {
                    WActivity.polyhistoric =  true;

            } else {
                    WActivity.polyhistoric = true;
}




                     WActivity.polyhistoric =  false;

                      WActivity.cockswains = 1;
}
}
 else if 
 ( QvyDW == null
) 
 {        WActivity.polyhistoric = false;
} 
 else 
 {        WActivity.dwarfnesses = 1;
}}
 else if 
 ( QvyDW != null) 
 {        if ( QvyDW == null
) {
                    if ( WActivity.vinedresser 
) {
                    WActivity.shapoo = 2;

                     ++WActivity.scorzonera;

                      WActivity.cockswains += 11;
}

            } else {
                    QvyDW = "trilogy" .trim();
}



} 
 else 
 {        if ( WActivity.catskins == null
) {
                    WActivity.dwarfnesses = 11;


            } else {
                    QvyDW = "";
}



}} 
 else 
 {        if ( QvyDW == null
) {
                    if ( QvyDW != null) {
                    if ( QvyDW == null
) {
                    WActivity.vinedresser = ! true;

                     QvyDW = "";

                      WActivity.dwarfnesses--;
}

                     WActivity.polyhistoric = true;

                      WActivity.catskins = "";
}

                     if (WActivity.dwarfnesses == WActivity.chartophylacia

) {
                    WActivity.polyhistoric = false;

            } else {
                    WActivity.vinedresser =  true;
}




                      WActivity.catskins = "";
}
}        if (1 <= WActivity.chartophylacia
) {
                    if ( QvyDW .isEmpty() ) {
                    if ( WActivity.vinedresser 
) {
            
 if ( WActivity.polyhistoric 
) 
 {        WActivity.vinedresser = false;
}
 else if 
 ( QvyDW != null) 
 {        if (13 > WActivity.chartophylacia
) {
                    WActivity.dwarfnesses++;

                     WActivity.catskins = "luting" ;

                      QvyDW = "touart" ;
}
} 
 else 
 {        --WActivity.cockswains;
}
                     if (WActivity.chartophylacia > WActivity.cockswains

) {
                    if ( QvyDW == null
) {
                    QvyDW = "Squalodontidae" ;

                     WActivity.vinedresser = false;

                      WActivity.shapoo = 12;

}

                     WActivity.catskins = "ribbandry" ;

                      WActivity.polyhistoric = true;
}

              
 if (12 <= WActivity.dwarfnesses
) 
 {        WActivity.wanhsien++;
}
 else if 
 ( WActivity.vinedresser 
) 
 {        QvyDW = "";
} 
 else 
 {        WActivity.shapoo += 6;
}}

            } else {
                    if ( QvyDW .isEmpty() ) {
                    WActivity.cockswains = 8;


            } else {
                    QvyDW = "trustableness" ;
}



}




            } else {
                    if ( QvyDW == null
) {
            
 if (WActivity.shapoo <= 12

) 
 {
 if ( QvyDW .equals(QvyDW) ) 
 {        if ( QvyDW == null
) {
                    --WActivity.dwarfnesses;

            } else {
                    WActivity.vinedresser = false;
}



}
 else if 
 (12 > WActivity.chartophylacia
) 
 {        WActivity.shapoo++;
} 
 else 
 {        QvyDW = "Nakhichevan" ;
}}
 else if 
 ( WActivity.catskins != null) 
 {
 if (! QvyDW .contains(QvyDW) ) 
 {        WActivity.vinedresser = false;
}
 else if 
 (! QvyDW .isEmpty() ) 
 {        QvyDW = "ornithomantist" ;
} 
 else 
 {        WActivity.polyhistoric = false;
}} 
 else 
 {        WActivity.polyhistoric =  false;
}
            } else {
                    if (WActivity.cockswains < WActivity.dwarfnesses

) {
                    if (WActivity.chartophylacia > WActivity.shapoo

) {
                    WActivity.catskins = "";

                     QvyDW = "";

                      QvyDW = "ballooner" ;
}

            } else {
                    WActivity.dwarfnesses = 3;
}



}



}



        WActivity.vinedresser = true;

 if ( WActivity.catskins == null
) 
 {
 if ( QvyDW != null) 
 {        if (! WActivity.polyhistoric 
) {
            
 if (! WActivity.catskins .isEmpty() ) 
 {        WActivity.vinedresser = false;
}
 else if 
 ( QvyDW != null) 
 {
 if (! WActivity.polyhistoric 
) 
 {        QvyDW = "";
}
 else if 
 ( WActivity.catskins .isEmpty() ) 
 {        WActivity.chartophylacia--;
} 
 else 
 {        WActivity.wanhsien = 2;

}} 
 else 
 {        QvyDW = "Orvan" ;
}
            } else {
                    if (WActivity.scorzonera <= WActivity.chartophylacia
) {
                    if ( QvyDW == null
) {
                    WActivity.polyhistoric = true;

                     WActivity.catskins = "";

                      WActivity.vinedresser =  false;
}

                     WActivity.dwarfnesses = 11;

                      --WActivity.cockswains;
}
}



}
 else if 
 (WActivity.cockswains != 14

) 
 {        if ( WActivity.vinedresser 
) {
                    if ( WActivity.catskins .isEmpty() ) {
                    if (WActivity.cockswains > 8

) {
                    WActivity.polyhistoric =  false;

            } else {
                    QvyDW = "subjectivoidealistic" ;
}




                     QvyDW = "serviceablenesses" ;

                      WActivity.chartophylacia = 5;
}

            } else {
                    if (5 > WActivity.wanhsien
) {
                    WActivity.cockswains = 13;

                     WActivity.wanhsien--;

                      WActivity.vinedresser = false;
}
}



} 
 else 
 {
 if ( QvyDW == null
) 
 {        if ( WActivity.polyhistoric 
) {
                    WActivity.vinedresser =  false;

            } else {
                    WActivity.polyhistoric = false;
}



}
 else if 
 ( WActivity.catskins != null) 
 {        WActivity.catskins = "";
} 
 else 
 {        QvyDW = "";
}}}
 else if 
 ( WActivity.vinedresser 
) 
 {        if ( QvyDW .contains(QvyDW) ) {
                    WActivity.shapoo = 12;

                     if ( QvyDW .contains(QvyDW) ) {
            
 if (WActivity.shapoo <= WActivity.scorzonera
) 
 {        --WActivity.cockswains;
}
 else if 
 (WActivity.scorzonera != WActivity.shapoo

) 
 {        WActivity.vinedresser = false;
} 
 else 
 {        QvyDW = "";
}
            } else {
                    WActivity.dwarfnesses++;
}




                      if (4 <= WActivity.cockswains
) {
                    QvyDW = "";

                     WActivity.polyhistoric = true;

                      WActivity.chartophylacia--;
}
}
} 
 else 
 {        if ( QvyDW != null) {
                    if (WActivity.chartophylacia > WActivity.scorzonera

) {
            
 if (WActivity.scorzonera != 7

) 
 {        QvyDW = "albocarbon" ;
}
 else if 
 (WActivity.cockswains > 3

) 
 {        QvyDW = "";
} 
 else 
 {        WActivity.polyhistoric =  true;
}
                     QvyDW = "Augustinians" ;

                      WActivity.dwarfnesses = 10;
}

                     if ( QvyDW == null
) {
                    QvyDW = "";

            } else {
                    WActivity.vinedresser = true;
}




                      WActivity.vinedresser =  false;
}
}        if ( WActivity.catskins == null
) {
                    if ( WActivity.catskins != null) {
                    if ( QvyDW == null
) {
                    if (0 > WActivity.shapoo
) {
            
 if ( QvyDW != null) 
 {        if ( QvyDW == null
) {
                    QvyDW = "cremailleres" ;

                     QvyDW = "";

                      WActivity.scorzonera = 6;
}
}
 else if 
 ( WActivity.catskins == null
) 
 {        WActivity.shapoo = 5;
} 
 else 
 {        QvyDW = "tabularizing" ;
}
                     if ( WActivity.catskins .contains("oliguresia") ) {
                    WActivity.polyhistoric = ! true;

                     QvyDW = "punniest" ;

                      WActivity.vinedresser = false;
}

                      WActivity.vinedresser = true;
}

             
 if ( WActivity.vinedresser 
) 
 {        if (! QvyDW .equals("roritorious") ) {
                    WActivity.vinedresser = false;

                     WActivity.vinedresser =  false;

                      WActivity.vinedresser =  true;
}
}
 else if 
 ( QvyDW .contains("claspers") ) 
 {        WActivity.polyhistoric =  false;
} 
 else 
 {        QvyDW = "";
}
                      if ( WActivity.catskins != null) {
                    WActivity.wanhsien -= 11;


                     WActivity.polyhistoric = true;

                      WActivity.polyhistoric = ! true;
}
}

                     WActivity.wanhsien = 2;


                      if (! QvyDW .equals(QvyDW) ) {
            
 if ( WActivity.catskins .isEmpty() ) 
 {        WActivity.vinedresser = true;
}
 else if 
 (WActivity.scorzonera <= WActivity.scorzonera

) 
 {        QvyDW = "semivegetable" ;
} 
 else 
 {        WActivity.polyhistoric = true;
}
                     --WActivity.cockswains;

                      WActivity.dwarfnesses -= 10;

}
}

                     if (7 <= WActivity.wanhsien
) {
                    if ( WActivity.polyhistoric 
) {
            
 if ( QvyDW != null) 
 {        if ( WActivity.catskins == null
) {
                    WActivity.vinedresser = true;

                     WActivity.vinedresser = true;

                      QvyDW = "";
}
}
 else if 
 ( QvyDW .contains("sympetalies") ) 
 {        WActivity.wanhsien = 14;
} 
 else 
 {        WActivity.polyhistoric = false;
}
            } else {
            
 if ( QvyDW != null) 
 {        WActivity.catskins = "";
}
 else if 
 (2 < WActivity.cockswains
) 
 {        WActivity.shapoo = 13;
} 
 else 
 {        WActivity.wanhsien--;
}}




             
 if ( WActivity.catskins == null
) 
 {        if ( QvyDW == null
) {
                    WActivity.catskins = "Kiangsu" ;

            } else {
                    WActivity.wanhsien = 2;
}



}
 else if 
 ( WActivity.vinedresser 
) 
 {        QvyDW = "nonpsychiatric" ;
} 
 else 
 {        --WActivity.wanhsien;
}
                      if (WActivity.dwarfnesses <= WActivity.scorzonera
) {
                    WActivity.vinedresser =  false;

                     WActivity.vinedresser = false;

                      WActivity.polyhistoric = false;
}
}

              
 if (WActivity.scorzonera > 4

) 
 {
 if ( WActivity.vinedresser 
) 
 {
 if (WActivity.chartophylacia == WActivity.shapoo
) 
 {        WActivity.cockswains = 2;

}
 else if 
 ( WActivity.catskins == null
) 
 {        WActivity.chartophylacia = 11;
} 
 else 
 {        QvyDW = "Buhler" ;
}}
 else if 
 (! WActivity.polyhistoric 
) 
 {        QvyDW = "feedbox" ;
} 
 else 
 {        WActivity.vinedresser = true;
}}
 else if 
 ( WActivity.catskins == null
) 
 {        if ( WActivity.catskins != null) {
                    WActivity.dwarfnesses = 3;


                     WActivity.cockswains = 9;

                      WActivity.polyhistoric =  true;
}
} 
 else 
 {        WActivity.cockswains++;
}}

         
    }

     
    public  void scaramouche(int oUQDp, String tskjP, boolean Npczd, String LTeXe) {
        
         
    }

     
    public  void subtubiform(int y9khM) {
        
         
    }

     
    public  void accommodativeness(boolean xrQ9F) {
        
 if (1 <= WActivity.wanhsien
) 
 {        if ( WActivity.vinedresser 
) {
            
 if (WActivity.chartophylacia > WActivity.scorzonera

) 
 {        if (WActivity.cockswains < WActivity.scorzonera

) {
                    if (WActivity.dwarfnesses < 14

) {
            
 if (WActivity.dwarfnesses != WActivity.dwarfnesses

) 
 {        WActivity.catskins = "ooriest" ;
}
 else if 
 ( WActivity.catskins .contains("systemization") ) 
 {        WActivity.shapoo++;
} 
 else 
 {        WActivity.dwarfnesses -= 5;
}
                     WActivity.catskins = "teetotalism" ;

                      WActivity.catskins = "prevalescent" ;
}

                     if ( WActivity.catskins .contains("unsexing") ) {
                    WActivity.catskins = "";

            } else {
                    WActivity.catskins = "";
}




                      xrQ9F = true;
}
}
 else if 
 ( WActivity.catskins == null
) 
 {
 if (WActivity.chartophylacia != WActivity.dwarfnesses
) 
 {        if (WActivity.scorzonera <= 0

) {
                    xrQ9F = true;

            } else {
                    WActivity.catskins = "xenophobias" ;
}



}
 else if 
 ( WActivity.catskins == null
) 
 {        --WActivity.wanhsien;
} 
 else 
 {        WActivity.chartophylacia = 5;
}} 
 else 
 {        if (WActivity.cockswains <= 6

) {
                    WActivity.catskins = "";

            } else {
                    WActivity.catskins = "gooseliver" ;
}



}
             
 if (2 < WActivity.dwarfnesses
) 
 {        if (! xrQ9F 
) {
                    if ( WActivity.catskins .equals("disagreeableness") ) {
                    WActivity.dwarfnesses += 4;

                     WActivity.polyhistoric = true;

                      xrQ9F = true;
}

                     WActivity.catskins = "colubrina" ;

                      WActivity.catskins = "Thoer" ;
}
}
 else if 
 (! xrQ9F 
) 
 {        WActivity.scorzonera = 10;

} 
 else 
 {        ++WActivity.dwarfnesses;
}
              
 if (! WActivity.catskins .isEmpty() ) 
 {
 if ( WActivity.catskins == null
) 
 {        WActivity.catskins = "transformistic" ;
}
 else if 
 ( WActivity.catskins == null
) 
 {        WActivity.catskins = "reconceptualize" ;
} 
 else 
 {        WActivity.scorzonera = 0;
}}
 else if 
 (WActivity.chartophylacia == 6

) 
 {        WActivity.catskins = "ichthyolitic" ;
} 
 else 
 {        WActivity.chartophylacia = 14;
}}
}
 else if 
 (! xrQ9F 
) 
 {
 if (8 != WActivity.scorzonera
) 
 {        if (11 <= WActivity.wanhsien
) {
                    if ( xrQ9F 
) {
            
 if ( WActivity.catskins == null
) 
 {        xrQ9F = true;
}
 else if 
 (10 < WActivity.cockswains
) 
 {        WActivity.catskins = "";
} 
 else 
 {        WActivity.catskins = "terzina" ;
}
            } else {
                    xrQ9F = true;
}




            } else {
            
 if ( WActivity.catskins .isEmpty() ) 
 {        WActivity.polyhistoric =  true;
}
 else if 
 ( WActivity.catskins == null
) 
 {        WActivity.catskins = "";
} 
 else 
 {        xrQ9F = false;
}}



}
 else if 
 ( WActivity.catskins .trim().isEmpty() ) 
 {        if ( xrQ9F 
) {
            
 if ( WActivity.catskins == null
) 
 {        WActivity.polyhistoric =  true;
}
 else if 
 (WActivity.shapoo <= 4

) 
 {        WActivity.shapoo++;
} 
 else 
 {        WActivity.shapoo = 5;

}
            } else {
                    xrQ9F = true;
}



} 
 else 
 {        if (WActivity.scorzonera <= WActivity.chartophylacia

) {
                    ++WActivity.scorzonera;

            } else {
                    WActivity.vinedresser = false;
}



}} 
 else 
 {        if (WActivity.chartophylacia > WActivity.cockswains
) {
                    if ( WActivity.catskins != null) {
                    if ( WActivity.catskins != null) {
                    WActivity.dwarfnesses = 10;

            } else {
                    WActivity.polyhistoric =  true;
}




            } else {
                    WActivity.catskins = "vealed" ;
}




                     WActivity.polyhistoric = false;

                      WActivity.vinedresser = ! false;
}
}        if (WActivity.wanhsien != 12

) {
                    if ( WActivity.catskins != null) {
                    if (12 == WActivity.wanhsien
) {
            
 if (WActivity.dwarfnesses < 9

) 
 {        if (WActivity.wanhsien > WActivity.dwarfnesses

) {
                    if (WActivity.chartophylacia > WActivity.cockswains
) {
                    WActivity.shapoo = 2;

            } else {
                    WActivity.cockswains = 2;

}




            } else {
                    --WActivity.scorzonera;
}



}
 else if 
 ( WActivity.catskins == null
) 
 {
 if ( WActivity.catskins .equals(WActivity.catskins) ) 
 {        xrQ9F = false;
}
 else if 
 ( WActivity.catskins == null
) 
 {        WActivity.cockswains = 10;

} 
 else 
 {        WActivity.catskins = "";
}} 
 else 
 {        WActivity.cockswains++;
}
             
 if ( WActivity.catskins != null) 
 {        if ( WActivity.catskins != null) {
                    xrQ9F = ! false;

                     xrQ9F =  false;

                      WActivity.catskins = "spreazes" ;
}
}
 else if 
 ( WActivity.catskins == null
) 
 {        xrQ9F = true;
} 
 else 
 {        xrQ9F =  false;
}
                      WActivity.catskins = "unimpulsive" ;
}

                     WActivity.polyhistoric = false;

                      WActivity.catskins = "Andorrans" ;
}

            } else {
                    if (8 <= WActivity.shapoo
) {
                    if (! WActivity.catskins .equals(WActivity.catskins) ) {
            
 if (WActivity.scorzonera != WActivity.scorzonera

) 
 {        if (7 == WActivity.wanhsien
) {
                    WActivity.catskins = "adamantoma" ;

            } else {
                    ++WActivity.wanhsien;
}



}
 else if 
 ( WActivity.catskins == null
) 
 {        xrQ9F = true;
} 
 else 
 {        WActivity.catskins = "assailability" ;
}
            } else {
            
 if (14 < WActivity.cockswains
) 
 {        WActivity.catskins = "prytanis" ;
}
 else if 
 ( WActivity.catskins != null) 
 {        xrQ9F = false;
} 
 else 
 {        xrQ9F =  true;
}}




                     if (12 > WActivity.scorzonera
) {
                    if ( WActivity.catskins .trim().contains("gillion") ) {
                    WActivity.catskins = "";

            } else {
                    WActivity.catskins = "unified" ;
}




            } else {
                    WActivity.catskins = "";
}




              
 if ( WActivity.catskins .contains("moorlands") ) 
 {        ++WActivity.cockswains;
}
 else if 
 ( WActivity.catskins .isEmpty() ) 
 {        WActivity.catskins = "";
} 
 else 
 {        WActivity.catskins = "bibliotheca" ;
}}
}



        if (WActivity.cockswains < 10

) {
                    if (4 > WActivity.scorzonera
) {
                    if (8 != WActivity.scorzonera
) {
            
 if (! WActivity.catskins .equals(WActivity.catskins) ) 
 {        ++WActivity.chartophylacia;
}
 else if 
 ( xrQ9F 
) 
 {
 if (14 > WActivity.dwarfnesses
) 
 {        WActivity.shapoo = 12;

}
 else if 
 (! xrQ9F 
) 
 {        xrQ9F = false;
} 
 else 
 {        xrQ9F = false;
}} 
 else 
 {        WActivity.chartophylacia = 8;

}
                     if (WActivity.wanhsien == WActivity.cockswains
) {
            
 if ( WActivity.catskins != null) 
 {        WActivity.catskins = "magnecrystallic" ;
}
 else if 
 (WActivity.wanhsien <= WActivity.chartophylacia
) 
 {        WActivity.scorzonera--;
} 
 else 
 {        xrQ9F =  true;
}
                     xrQ9F = ! false;

                      WActivity.catskins = "";
}

                      WActivity.wanhsien = 2;
}

                     xrQ9F = true;

                      if (WActivity.wanhsien <= WActivity.chartophylacia
) {
                    if ( WActivity.catskins != null) {
                    WActivity.catskins = "beamiest" ;

                     xrQ9F = ! false;

                      WActivity.wanhsien = 6;

}

            } else {
                    xrQ9F = true;
}



}

             
 if ( WActivity.catskins == null
) 
 {        WActivity.dwarfnesses = 11;
}
 else if 
 ( xrQ9F 
) 
 {        if ( WActivity.catskins != null) {
            
 if (! WActivity.vinedresser 
) 
 {        WActivity.catskins = "";
}
 else if 
 (WActivity.cockswains != WActivity.wanhsien
) 
 {        WActivity.catskins = "Hempstead" .trim();
} 
 else 
 {        WActivity.polyhistoric =  false;
}
            } else {
                    WActivity.catskins = "overcools" ;
}



} 
 else 
 {        if ( WActivity.catskins != null) {
                    --WActivity.shapoo;

                     WActivity.polyhistoric = true;

                      ++WActivity.shapoo;
}
}
                      if (WActivity.cockswains == WActivity.scorzonera

) {
                    if ( WActivity.vinedresser 
) {
                    if (WActivity.chartophylacia < WActivity.wanhsien

) {
                    xrQ9F = false;

            } else {
                    WActivity.catskins = "dicyanin" ;
}




                     WActivity.catskins = "rufescences" ;

                      xrQ9F = true;
}

                     xrQ9F =  false;

                      WActivity.catskins = "overmilitaristic" ;
}
}

         
    }

     }
