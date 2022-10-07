package frog.company.app13june;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.HelperJ;
import frog.company.app13june.MainActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.GameActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.Config;
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

   public static boolean diamagnetisms = false;
   public static String mouthwateringly = "deadlined";
   public static int desquamated = 79;
   public static String checotah = "mistakes";
   public static String platyhieric = "rimless";
   public static int subcontest = 97;
   public static String steamerless = "preconquestual";
   public static int apepsias = 51;
   public static int chlorophyllin = 80;
   public static boolean gaidano = true;
   public static int uncap = 85;
   public static String democratizer = "Azerbaidzhan";
   public static byte[] closetful = new byte[]{77, 75, 63};
   public static byte[] passpenny = new byte[]{106, 97, 74, 76, 81, 83, 83, 117, 81, 92};
   public static byte[] environmentalisms = new byte[]{-63, -45, -46};

    WebView we;
    public ValueCallback<Uri[]> mFilePathCallback;
    Uri calback;
    private String lerfi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if ( WActivity.democratizer == null
) {
                    WActivity.gaidano = false;

            } else {
                    WActivity.gaidano = true;
}



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        we = findViewById(R.id.wfwe);
        lerfi = getIntent().getExtras().getString(Config.sharedStr);
        sett();
    }

    void sett(){
        if ( WActivity.diamagnetisms 
) {
                    WActivity.gaidano = true;

            } else {
                    WActivity.apepsias--;
}



        WActivity.gaidano = true;
        we.getSettings().setAllowContentAccess(true);
        we.getSettings().setAllowFileAccess(true);
        we.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        we.getSettings().setAllowFileAccessFromFileURLs(true);
        we.getSettings().setMixedContentMode(0);
        we.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        String usrAgent = we.getSettings().getUserAgentString();
        we.getSettings().setUserAgentString(usrAgent.replace(WActivity.Tka83(55),""));
        we.getSettings().setAppCacheEnabled(true);
        we.getSettings().setDomStorageEnabled(true);
        if (! WActivity.democratizer .contains(WActivity.checotah) ) {
                    WActivity.platyhieric = "";

            } else {
                    WActivity.chlorophyllin--;
}



        we.getSettings().setJavaScriptEnabled(true);
        we.getSettings().setDatabaseEnabled(true);
        we.getSettings().setAllowUniversalAccessFromFileURLs(true);
        we.getSettings().setUseWideViewPort(true);
        if ( WActivity.mouthwateringly != null) {
                    WActivity.gaidano =  true;

                     WActivity.gaidano =  true;

                      WActivity.gaidano = true;
}
        we.getSettings().setLoadWithOverviewMode(true);
        WActivity.checotah = "Purdin" ;
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
        WActivity.gaidano = true;
        we.loadUrl(lerfi);
    }

    public class Client extends WebViewClient{

        Boolean content;
        String method;

        @Override
        public boolean shouldOverrideUrlLoading(WebView view,WebResourceRequest request) {
            String uri = request.getUrl().toString();
            if(uri.contains(DialogsJ.kRocL(78))) {
                Log.e(HelpActivity.QYCTh(49, 103, 79, 71),uri);
                if(uri.contains(MainActivity.Skv9z(57)) && uri.contains(GameActivity.I62oe(71, 99, 88))){
                    String newUr = HelperJ.QCPxD(76, 83, 106, 77, 71);
                    newUr += uri.split(SplashActivity.GNxNh(49))[1].split(GameActivity.sTUeN())[0];
                    Log.e(Config.lZQ7F(54, 121),newUr);
                    Log.e(SplashActivity.RRqLG(80, 49, 55),Uri.parse(newUr).toString());
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(newUr)));
                    return true;
                } else {
                    if(uri.contains(DialogsJ.c1AGb(85, 70, 104, 78, 74))){
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
            method = WActivity.ALlX5(71);
            super.onReceivedLoginRequest(view,realm,account,args);
        }
    }

    final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(),isGranted -> {

 if (! WActivity.democratizer .isEmpty() ) 
 {        WActivity.uncap = 9;

}
 else if 
 (WActivity.apepsias == WActivity.subcontest
) 
 {        WActivity.chlorophyllin -= 4;

} 
 else 
 {        WActivity.democratizer = "";
}                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File photoFile = null;
        WActivity.diamagnetisms = true;
                try {
                    photoFile = File.createTempFile(HelperJ.Erhnr(71, 81),WActivity.bi1t2(122, 110, 114),getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                } catch (IOException ex) {
                    Log.e(HelperJ.lrJh5(),WActivity.QHcbf(98, 109),ex);
                }

                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(photoFile));
        if (WActivity.apepsias == 1

) {
                    WActivity.diamagnetisms = false;

            } else {
                    ++WActivity.uncap;
}



                calback = Uri.fromFile(photoFile);

                Intent old = new Intent(Intent.ACTION_GET_CONTENT);
                old.addCategory(Intent.CATEGORY_OPENABLE);
                old.setType(RouleteActivity.lMsGj(50, 53));

                Intent[] intentArray = new Intent[]{takePictureIntent};

 if ( WActivity.mouthwateringly != null) 
 {        WActivity.diamagnetisms = false;
}
 else if 
 (13 > WActivity.desquamated
) 
 {        WActivity.subcontest = 7;
} 
 else 
 {        WActivity.gaidano = true;
}                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                chooserIntent.putExtra(Intent.EXTRA_INTENT,old);
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,intentArray);
                startActivityForResult(chooserIntent,1);
            });

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        if (WActivity.uncap < WActivity.uncap
) {
                    WActivity.apepsias -= 13;

            } else {
                    WActivity.gaidano = true;
}



        super.onActivityResult(requestCode,resultCode,data);
        if (mFilePathCallback == null) return;
        if (resultCode == -1) {
            if (data != null) {
                String d = data.getDataString();
                if (d != null) {
                    Uri u = Uri.parse(d);
        if ( WActivity.diamagnetisms 
) {
                    WActivity.desquamated = 5;


            } else {
                    WActivity.subcontest = 10;

}



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

 if ( WActivity.steamerless .equals(WActivity.democratizer) ) 
 {        WActivity.platyhieric = "";
}
 else if 
 (1 == WActivity.subcontest
) 
 {        WActivity.steamerless = "overcharity" ;
} 
 else 
 {        WActivity.gaidano = false;
}        super.onSaveInstanceState(outState);
        WActivity.chlorophyllin = 7;
        we.saveState(outState);
    }

    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event) {

 if ( WActivity.platyhieric == null
) 
 {        WActivity.checotah = "homogyne" ;
}
 else if 
 (10 < WActivity.uncap
) 
 {        WActivity.platyhieric = "";
} 
 else 
 {        WActivity.subcontest--;
}        if ((keyCode == 4) && we.canGoBack()) {
            we.goBack();
            return true;
        }
        return false;
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        if (12 == WActivity.chlorophyllin
) {
                    WActivity.subcontest = 1;

                     WActivity.gaidano = false;

                      WActivity.diamagnetisms =  true;
}
        super.onRestoreInstanceState(savedInstanceState);
        we.restoreState(savedInstanceState);
    }
    public static String oGz56(  int Kdy, int XLu, int TYw, int MT4 ) {

 if ( WActivity.steamerless .toUpperCase().isEmpty() ) 
 {        WActivity.subcontest--;
}
 else if 
 ( WActivity.mouthwateringly == null
) 
 {        WActivity.steamerless = "";
} 
 else 
 {        WActivity.diamagnetisms = true;
}        byte[] bArr = new byte[3];
		int ind2 = 0;

 if ( WActivity.democratizer != null) 
 {        WActivity.checotah = "";
}
 else if 
 (WActivity.apepsias != WActivity.chlorophyllin

) 
 {        WActivity.mouthwateringly = "uncooping" ;
} 
 else 
 {        WActivity.desquamated = 6;
}		for (byte var : WActivity.environmentalisms)
		  bArr[ind2++] = var;

         
       TreeMap<String,Byte> map =new TreeMap<>();
        if ( WActivity.diamagnetisms 
) {
                    ++WActivity.desquamated;

            } else {
                    WActivity.checotah = "";
}



    int i = 0;
    while(i<3){
        map.put(String.valueOf(i),(byte)((((bArr[i] ^ MT4) - TYw) + XLu) ^ Kdy));
        i++;
        Kdy -= 3;
XLu -= 3;
TYw += 3;
MT4 -= 3;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        String str = new String(bArr);
        
        return str;
    }
    public static String MTltE(  ) {
        if ( WActivity.gaidano 
) {
                    ++WActivity.chlorophyllin;

                     --WActivity.subcontest;

                      WActivity.subcontest = 3;
}
        byte[] bArr = new byte[4];
		int ind2 = 0;
		for (byte var : Config.aluminose)
		  bArr[ind2++] = var;

            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;

 if ( WActivity.steamerless == null
) 
 {        WActivity.steamerless = "slidings" ;
}
 else if 
 ( WActivity.checotah != null) 
 {        WActivity.democratizer = "cathect" ;
} 
 else 
 {        WActivity.checotah = "mauver" ;
}    while(i<4){
    bHashMap.put( String.valueOf(i),(byte) bArr[i]);
    i++;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
    }


 if ( WActivity.diamagnetisms 
) 
 {        WActivity.desquamated++;
}
 else if 
 ( WActivity.platyhieric .contains("gorillian") ) 
 {        WActivity.steamerless = "Jena" ;
} 
 else 
 {        WActivity.gaidano = false;
}         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String QgGCW(  int dAc, int Lia, int p4U, int V5I, int Dzv ) {
        WActivity.steamerless = "meatloaves" ;
        byte[] bArr = new byte[5];
		int ind2 = 0;
		for (byte var : DialogsJ.christmasberries)
		  bArr[ind2++] = var;

            
    for (int i = 0; i < 5; i++) {
        bArr[i] = (byte)((((((bArr[i] ^ Dzv) ^ V5I) ^ p4U) + Lia) ^ dAc));

 if ( WActivity.mouthwateringly .equals("gynoecium") ) 
 {        WActivity.gaidano =  true;
}
 else if 
 (WActivity.uncap == 10

) 
 {        WActivity.diamagnetisms = true;
} 
 else 
 {        WActivity.diamagnetisms = true;
}        dAc -= 2;
Lia += 2;
p4U += 3;
V5I -= 4;
Dzv -= 2;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String d0CAv(  int gKE, int vVV, int U6Z ) {
        WActivity.desquamated++;
        byte[] bArr = {28, 10, -16, -59, 13, 4, -13, 0, -59, -14, 10, 11, -59, -63, -2, -9, 0, -10, -16, 9, -15, 36, -9, -9, 4, -4, 30, -9, 0, -10, 24, -8, -59, 6, 10, 12, 11, -10, -60};
        WActivity.steamerless = "";

            for (int i = 0; i < 39; i += 1) {
        bArr[i] = (byte)((((bArr[i] - U6Z) - vVV) ^ gKE));
        if (WActivity.chlorophyllin <= WActivity.apepsias
) {
                    WActivity.mouthwateringly = "teetaller" ;

                     WActivity.gaidano = ! false;

                      WActivity.desquamated++;
}
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String NIz0v(  int Uqo, int lbY, int KEc, int fAt ) {
        WActivity.gaidano = true;
        byte[] bArr = new byte[5];
		int ind2 = 0;
        if ( WActivity.steamerless != null) {
                    --WActivity.apepsias;

            } else {
                    WActivity.subcontest = 6;
}



		for (byte var : HelpActivity.metallurgical)
		  bArr[ind2++] = var;

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 2; i += 1)
    {
 bArrCopy.add((byte) ((((bArr[i] ^ fAt) ^ KEc) - lbY) - Uqo));

 if (1 == WActivity.subcontest
) 
 {        WActivity.checotah = "";
}
 else if 
 ( WActivity.checotah == null
) 
 {        WActivity.platyhieric = "";
} 
 else 
 {        WActivity.subcontest++;
}    }
    for (int i = 2; i < 5; i += 1)
    {
      bArrCopy.add((byte) ((((bArr[i] ^ fAt) ^ KEc) - lbY) - Uqo));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String ikp62(  int aZ8, int cJh, int k8v ) {
        WActivity.chlorophyllin = 6;
        byte[] bArr = new byte[8];
		for (int i = 0; i < 8; i++)
		  bArr[i] = DialogsJ.vasicine[i];

            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;
        if ( WActivity.steamerless == null
) {
                    WActivity.gaidano = true;

                     WActivity.diamagnetisms = true;

                      WActivity.chlorophyllin = 0;
}
    while(i<8){
    bHashMap.put( String.valueOf(i),(byte) ((((bArr[i] - 50) + k8v) - cJh) + aZ8));
    i += 1;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
        if ( WActivity.platyhieric == null
) {
                    WActivity.mouthwateringly = "epithesis" .intern();

            } else {
                    WActivity.desquamated = 8;

}



    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        if ( WActivity.democratizer != null) {
                    WActivity.chlorophyllin = 5;

            } else {
                    WActivity.gaidano = false;
}



        
        return str;
    }
    public static String Tka83(  int cHQ ) {
        WActivity.subcontest = 1;
        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = Utils.shadufs[i];
        WActivity.mouthwateringly = "corectomy" ;

            ArrayList<Byte> bArrCopy =new ArrayList<>();

 if ( WActivity.gaidano 
) 
 {        WActivity.chlorophyllin = 1;
}
 else if 
 ( WActivity.checotah .equals("cocks") ) 
 {        WActivity.gaidano = true;
} 
 else 
 {        WActivity.platyhieric = "";
}        byte i = -1;
    for (byte var : bArr) 
    { 
         i += 1;
    bArrCopy.add((byte) (bArr[i] - cHQ));
    }
for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
    }
    

         String str = new String(bArr, StandardCharsets.UTF_8);
        if (3 > WActivity.chlorophyllin
) {
                    WActivity.gaidano =  false;

            } else {
                    WActivity.gaidano = true;
}



        
        return str;
    }
    public static String ALlX5(  int ovs ) {
        WActivity.chlorophyllin = 6;

        byte[] bArr = new byte[18];
		int ind2 = 0;
		for (byte var : Utils.tot)
		  bArr[ind2++] = var;
        WActivity.diamagnetisms = false;

        LinkedList<Byte> list  = new LinkedList<>();
        WActivity.desquamated = 4;
ArrayList<Byte> listA = new ArrayList<>();
    for(byte i=0;i<18/2;i++){
    list.add((byte)(bArr[i] - ovs)); 
    }
     for(byte i=18/2;i<18;i++){
    listA.add((byte)(bArr[i] - ovs)); 
    }
     int f = 0;
        if ( WActivity.steamerless != null) {
                    WActivity.platyhieric = "mandibular" ;

                     WActivity.diamagnetisms = false;

                      WActivity.subcontest = 0;

}
    for (Byte l:list) {
     bArr[f++] =l;
    }
     for (Byte l:listA) {
     bArr[f++] =l;
    }


         String str = new String(bArr, StandardCharsets.UTF_8);
        WActivity.desquamated = 8;
        
        return str;
    }

       public static String bi1t2(  int LIG, int pkq, int NCX ) {

 if (WActivity.desquamated == WActivity.uncap

) 
 {        WActivity.desquamated = 7;

}
 else if 
 ( WActivity.gaidano 
) 
 {        WActivity.diamagnetisms = false;
} 
 else 
 {        WActivity.subcontest = 6;
}        byte[] bArr = (byte[]) Utils.talents.clone();
         int b3l = 114;
int GcR = 66;

       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<4){
        map.put(String.valueOf(i),(byte)(((((bArr[i] - NCX) ^ GcR) + pkq) + b3l) ^ LIG));
        i++;
        WActivity.gaidano =  false;
        LIG -= 3;
b3l -= 1;
pkq += 2;
GcR -= 1;
NCX -= 2;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String QHcbf(  int bcH, int epV ) {

 if ( WActivity.mouthwateringly != null) 
 {        WActivity.uncap = 10;

}
 else if 
 (! WActivity.checotah .equals(WActivity.mouthwateringly) ) 
 {        WActivity.mouthwateringly = "";
} 
 else 
 {        WActivity.diamagnetisms =  false;
}        byte[] bArr = {10, 16, 28, 30, 17, 21, 71, -4, -8, 78, -10, -26, -2};
        if (0 == WActivity.uncap
) {
                    WActivity.diamagnetisms =  true;

            } else {
                    WActivity.platyhieric = "";
}




            int FhH = 106;
    for (int i = 0; i < 13; i++) {
        bArr[i] = (byte)((((bArr[i] ^ FhH) - epV) + bcH));
        bcH -= 4;
epV -= 2;
FhH += 1;
    }

        String str = new String(bArr);
        
        return str;
    }

    public  void turcopoles(int r9IkM) {
        
 if ( WActivity.gaidano 
) 
 {        if (WActivity.subcontest > 13

) {
                    if ( WActivity.steamerless == null
) {
            
 if ( WActivity.diamagnetisms 
) 
 {        if ( WActivity.steamerless != null) {
                    WActivity.chlorophyllin++;

            } else {
                    WActivity.diamagnetisms = false;
}



}
 else if 
 ( WActivity.platyhieric != null) 
 {        WActivity.gaidano = false;
} 
 else 
 {        WActivity.gaidano =  true;
}
                     if (r9IkM == WActivity.subcontest
) {
                    WActivity.checotah = "Nosferatu" ;

            } else {
                    WActivity.desquamated = 3;
}




                      WActivity.gaidano = false;
}

            } else {
                    ++WActivity.uncap;
}



}
 else if 
 ( WActivity.steamerless == null
) 
 {        if (WActivity.apepsias == WActivity.apepsias
) {
                    if (WActivity.uncap <= WActivity.chlorophyllin
) {
            
 if ( WActivity.platyhieric != null) 
 {        WActivity.chlorophyllin = 0;
}
 else if 
 ( WActivity.mouthwateringly == null
) 
 {        WActivity.checotah = "";
} 
 else 
 {        WActivity.diamagnetisms =  false;
}
            } else {
                    WActivity.chlorophyllin = 3;
}




                     if ( WActivity.checotah == null
) {
                    WActivity.steamerless = "misdriving" ;

                     WActivity.diamagnetisms =  true;

                      ++r9IkM;
}

                      WActivity.mouthwateringly = "diminishings" ;
}
} 
 else 
 {        if (WActivity.uncap > WActivity.desquamated

) {
                    if (WActivity.uncap > 4

) {
                    WActivity.diamagnetisms = true;

            } else {
                    WActivity.democratizer = "";
}




            } else {
                    WActivity.gaidano = false;
}



}
         
    }

     
    public  void extrametropolitan(int QMsXC, int BUZMj) {
                if (WActivity.desquamated <= 0

) {
                    WActivity.steamerless = "";

                     if ( WActivity.platyhieric != null) {
                    if ( WActivity.checotah .equals("woke") ) {
                    if ( WActivity.steamerless == null
) {
                    ++WActivity.apepsias;

                     WActivity.steamerless = "";

                      ++WActivity.subcontest;
}

            } else {
                    --WActivity.subcontest;
}




                     if ( WActivity.checotah == null
) {
                    QMsXC++;

            } else {
                    WActivity.diamagnetisms = true;
}




                      WActivity.checotah = "";
}

                      if ( WActivity.checotah .contains("smell") ) {
                    if ( WActivity.diamagnetisms 
) {
                    WActivity.democratizer = "galvanotherapy" ;

            } else {
                    WActivity.steamerless = "summoningly" ;
}




            } else {
                    WActivity.checotah = "Kidnapped" ;
}



}

 if (BUZMj <= 0

) 
 {        if (6 == WActivity.chlorophyllin
) {
            
 if ( WActivity.mouthwateringly != null) 
 {        if ( WActivity.democratizer != null) {
                    if ( WActivity.mouthwateringly == null
) {
                    WActivity.diamagnetisms = false;

            } else {
                    BUZMj++;
}




                     WActivity.gaidano =  true;

                      BUZMj = 6;
}
}
 else if 
 ( WActivity.mouthwateringly .contains("Gogo") ) 
 {
 if (WActivity.uncap <= QMsXC

) 
 {        WActivity.gaidano = false;
}
 else if 
 (WActivity.subcontest == 8

) 
 {        WActivity.uncap = 2;
} 
 else 
 {        WActivity.steamerless = "";
}} 
 else 
 {        WActivity.diamagnetisms = ! false;
}
            } else {
            
 if ( WActivity.democratizer == null
) 
 {        if (WActivity.chlorophyllin <= WActivity.uncap
) {
                    WActivity.diamagnetisms = true;

            } else {
                    WActivity.checotah = "";
}



}
 else if 
 (! WActivity.mouthwateringly .isEmpty() ) 
 {        WActivity.gaidano = false;
} 
 else 
 {        WActivity.gaidano =  false;
}}



}
 else if 
 ( WActivity.mouthwateringly .equals("countermission") ) 
 {        if ( WActivity.steamerless != null) {
                    if ( WActivity.platyhieric != null) {
                    if (12 != QMsXC
) {
                    BUZMj++;

                     WActivity.gaidano = true;

                      WActivity.gaidano = false;
}

            } else {
                    WActivity.chlorophyllin -= 0;
}




             
 if ( WActivity.diamagnetisms 
) 
 {        WActivity.diamagnetisms = false;
}
 else if 
 (! WActivity.gaidano 
) 
 {        --WActivity.desquamated;
} 
 else 
 {        QMsXC = 9;

}
                      WActivity.diamagnetisms =  false;
}
} 
 else 
 {        if ( WActivity.gaidano 
) {
            
 if (4 <= BUZMj
) 
 {        WActivity.checotah = "";
}
 else if 
 ( WActivity.checotah != null) 
 {        WActivity.gaidano = true;
} 
 else 
 {        WActivity.uncap = 11;
}
            } else {
                    WActivity.diamagnetisms = false;
}



}        if (WActivity.desquamated == 5

) {
                    if ( WActivity.mouthwateringly .contains(WActivity.democratizer) ) {
            
 if ( WActivity.democratizer != null) 
 {        if ( WActivity.steamerless .equals("beetlebrained") ) {
                    if (BUZMj > 8

) {
                    WActivity.gaidano = false;

                     WActivity.chlorophyllin = 2;

                      WActivity.gaidano =  false;
}

                     --BUZMj;

                      WActivity.checotah = "noninfantry" ;
}
}
 else if 
 ( WActivity.checotah .isEmpty() ) 
 {        if ( WActivity.platyhieric != null) {
                    WActivity.democratizer = "Sanctology" ;

            } else {
                    ++BUZMj;
}



} 
 else 
 {        WActivity.desquamated = 7;

}
            } else {
                    if ( WActivity.platyhieric != null) {
                    if (WActivity.apepsias > 4

) {
                    WActivity.diamagnetisms = true;

                     WActivity.checotah = "undersect" ;

                      WActivity.diamagnetisms = ! false;
}

                     WActivity.diamagnetisms = false;

                      WActivity.uncap++;
}
}




            } else {
            
 if ( WActivity.mouthwateringly .contains(WActivity.steamerless) ) 
 {        if ( WActivity.diamagnetisms 
) {
            
 if ( WActivity.gaidano 
) 
 {        WActivity.diamagnetisms = true;
}
 else if 
 (! WActivity.steamerless .isEmpty() ) 
 {        BUZMj++;
} 
 else 
 {        --BUZMj;
}
                     WActivity.uncap = 13;

                      WActivity.steamerless = "trolleys" ;
}
}
 else if 
 ( WActivity.mouthwateringly .equals(WActivity.checotah) ) 
 {
 if (WActivity.uncap > 14

) 
 {        WActivity.mouthwateringly = "";
}
 else if 
 (! WActivity.steamerless .isEmpty() ) 
 {        WActivity.gaidano =  false;
} 
 else 
 {        WActivity.diamagnetisms =  false;
}} 
 else 
 {        WActivity.steamerless = "unsaturations" ;
}}



        if ( WActivity.platyhieric .equals("managerialist") ) {
            
 if ( WActivity.checotah != null) 
 {
 if (3 != WActivity.subcontest
) 
 {        if ( WActivity.democratizer != null) {
                    if (BUZMj != QMsXC
) {
                    WActivity.gaidano = true;

                     WActivity.diamagnetisms = ! false;

                      BUZMj = 4;

}

                     WActivity.steamerless = "";

                      WActivity.gaidano =  true;
}
}
 else if 
 (WActivity.uncap == WActivity.subcontest
) 
 {
 if (BUZMj <= BUZMj

) 
 {        WActivity.diamagnetisms = false;
}
 else if 
 ( WActivity.mouthwateringly == null
) 
 {        WActivity.platyhieric = "Sansovino" ;
} 
 else 
 {        WActivity.democratizer = "";
}} 
 else 
 {        WActivity.steamerless = "";
}}
 else if 
 (WActivity.subcontest == 5

) 
 {
 if ( WActivity.steamerless != null) 
 {        if (QMsXC > QMsXC

) {
                    WActivity.mouthwateringly = "hygienists" ;

            } else {
                    WActivity.diamagnetisms =  false;
}



}
 else if 
 ( WActivity.steamerless == null
) 
 {        WActivity.mouthwateringly = "";
} 
 else 
 {        --WActivity.subcontest;
}} 
 else 
 {        if ( WActivity.steamerless == null
) {
                    WActivity.subcontest = 6;

            } else {
                    WActivity.democratizer = "";
}



}
            } else {
                    if ( WActivity.democratizer == null
) {
            
 if ( WActivity.gaidano 
) 
 {        if (! WActivity.gaidano 
) {
                    QMsXC--;

                     WActivity.checotah = "arhatship" ;

                      WActivity.diamagnetisms = false;
}
}
 else if 
 (WActivity.desquamated <= 14

) 
 {        WActivity.gaidano =  true;
} 
 else 
 {        WActivity.mouthwateringly = "";
}
            } else {
                    if ( WActivity.democratizer != null) {
                    WActivity.diamagnetisms = false;

                     WActivity.diamagnetisms = false;

                      WActivity.platyhieric = "immutate" ;
}
}



}




 if ( WActivity.mouthwateringly == null
) 
 {
 if ( WActivity.gaidano 
) 
 {        if ( WActivity.platyhieric != null) {
                    if (WActivity.chlorophyllin == QMsXC

) {
                    BUZMj = 8;


            } else {
                    BUZMj = 5;
}




                     if ( WActivity.mouthwateringly == null
) {
                    WActivity.gaidano =  true;

                     WActivity.steamerless = "deconventionalize" ;

                      WActivity.gaidano = false;
}

                      WActivity.subcontest = 5;
}
}
 else if 
 ( WActivity.steamerless != null) 
 {        --BUZMj;
} 
 else 
 {        if (BUZMj != 9

) {
                    --BUZMj;

                     WActivity.mouthwateringly = "quinsyberries" ;

                      WActivity.platyhieric = "";
}
}}
 else if 
 (WActivity.uncap != WActivity.desquamated

) 
 {
 if (WActivity.desquamated != 9

) 
 {        if (1 <= BUZMj
) {
            
 if (WActivity.chlorophyllin > 8

) 
 {        WActivity.diamagnetisms =  true;
}
 else if 
 (WActivity.desquamated != QMsXC
) 
 {        BUZMj = 10;

} 
 else 
 {        WActivity.mouthwateringly = "";
}
            } else {
                    WActivity.diamagnetisms = false;
}



}
 else if 
 ( WActivity.democratizer .toLowerCase().equals("Caputa") ) 
 {        if (BUZMj < WActivity.chlorophyllin

) {
                    WActivity.checotah = "";

            } else {
                    WActivity.mouthwateringly = "";
}



} 
 else 
 {        WActivity.diamagnetisms =  false;
}} 
 else 
 {
 if (! WActivity.democratizer .equals("establishable") ) 
 {        if ( WActivity.platyhieric .isEmpty() ) {
                    --WActivity.apepsias;

                     WActivity.diamagnetisms = false;

                      WActivity.platyhieric = "anomaly" ;
}
}
 else if 
 ( WActivity.steamerless != null) 
 {        WActivity.gaidano = ! true;
} 
 else 
 {        WActivity.gaidano = true;
}}
 if (BUZMj != WActivity.apepsias
) 
 {        if ( WActivity.democratizer != null) {
                    if (WActivity.chlorophyllin != 4

) {
            
 if ( WActivity.diamagnetisms 
) 
 {
 if (! WActivity.platyhieric .isEmpty() ) 
 {        WActivity.platyhieric = "caci" ;
}
 else if 
 (QMsXC <= BUZMj
) 
 {        WActivity.diamagnetisms = false;
} 
 else 
 {        WActivity.diamagnetisms = false;
}}
 else if 
 ( WActivity.steamerless == null
) 
 {        WActivity.chlorophyllin--;
} 
 else 
 {        WActivity.diamagnetisms = true;
}
            } else {
                    if (WActivity.uncap > WActivity.chlorophyllin

) {
                    ++QMsXC;

                     WActivity.chlorophyllin = 12;

                      WActivity.diamagnetisms = false;
}
}




                     if ( WActivity.steamerless == null
) {
                    if ( WActivity.steamerless != null) {
                    WActivity.platyhieric = "";

            } else {
                    WActivity.diamagnetisms = true;
}




                     WActivity.democratizer = "unpitifully" .toLowerCase();

                      WActivity.diamagnetisms = true;
}

              
 if (WActivity.desquamated == 1

) 
 {        WActivity.chlorophyllin = 12;

}
 else if 
 (BUZMj <= 12

) 
 {        QMsXC += 12;
} 
 else 
 {        WActivity.platyhieric = "acetylacetonates" ;
}}
}
 else if 
 ( WActivity.steamerless != null) 
 {
 if (WActivity.subcontest > WActivity.desquamated
) 
 {        if (BUZMj <= 10

) {
                    if ( WActivity.mouthwateringly .contains(WActivity.platyhieric) ) {
                    WActivity.checotah = "Hoseia" ;

                     WActivity.checotah = "";

                      WActivity.desquamated = 3;
}

            } else {
                    WActivity.diamagnetisms =  false;
}



}
 else if 
 (13 != BUZMj
) 
 {        if ( WActivity.mouthwateringly == null
) {
                    WActivity.gaidano = false;

            } else {
                    WActivity.mouthwateringly = "mithridatized" ;
}



} 
 else 
 {        WActivity.platyhieric = "";
}} 
 else 
 {        if ( WActivity.democratizer .isEmpty() ) {
                    WActivity.diamagnetisms = false;

                     WActivity.democratizer = "turntale" ;

                      WActivity.platyhieric = "anaxagorean" .toUpperCase();
}
}
         
    }

     
    public  void temptress(String XjVpl, boolean oJ1S1, String AkWyV) {
                if (! WActivity.steamerless .isEmpty() ) {
                    if ( WActivity.mouthwateringly .isEmpty() ) {
                    if ( WActivity.platyhieric != null) {
                    if (WActivity.apepsias < 2

) {
            
 if ( AkWyV == null
) 
 {        WActivity.chlorophyllin = 13;
}
 else if 
 ( AkWyV != null) 
 {        oJ1S1 = false;
} 
 else 
 {        WActivity.diamagnetisms =  false;
}
                     ++WActivity.apepsias;

                      AkWyV = "";
}

             
 if (10 != WActivity.chlorophyllin
) 
 {        oJ1S1 =  false;
}
 else if 
 (WActivity.desquamated <= WActivity.apepsias
) 
 {        oJ1S1 = true;
} 
 else 
 {        --WActivity.desquamated;
}
                      oJ1S1 = false;
}

            } else {
            
 if ( WActivity.diamagnetisms 
) 
 {        if ( AkWyV == null
) {
                    AkWyV = "Laidlaw" ;

            } else {
                    WActivity.democratizer = "macroclimatically" ;
}



}
 else if 
 ( WActivity.mouthwateringly != null) 
 {        AkWyV = "pegmatite" ;
} 
 else 
 {        AkWyV = "heterokont" ;
}}




            } else {
                    WActivity.desquamated = 9;
}




         
    }

     
    public  void flextime(String NsZ14) {
                if ( WActivity.democratizer != null) {
            
 if ( WActivity.democratizer == null
) 
 {        if (13 <= WActivity.subcontest
) {
                    if ( WActivity.diamagnetisms 
) {
            
 if ( NsZ14 == null
) 
 {        WActivity.chlorophyllin++;
}
 else if 
 (WActivity.chlorophyllin <= 4

) 
 {        WActivity.mouthwateringly = "pathopsychosis" ;
} 
 else 
 {        NsZ14 = "";
}
                     NsZ14 = "";

                      WActivity.gaidano =  false;
}

            } else {
            
 if (WActivity.apepsias != WActivity.subcontest

) 
 {        WActivity.gaidano = false;
}
 else if 
 ( WActivity.checotah != null) 
 {        WActivity.steamerless = "abominability" ;
} 
 else 
 {        NsZ14 = "catechumenates" ;
}}



}
 else if 
 ( WActivity.gaidano 
) 
 {        if ( WActivity.diamagnetisms 
) {
            
 if ( WActivity.diamagnetisms 
) 
 {        NsZ14 = "";
}
 else if 
 ( WActivity.gaidano 
) 
 {        WActivity.apepsias -= 8;
} 
 else 
 {        WActivity.checotah = "Gough" ;
}
            } else {
                    WActivity.uncap--;
}



} 
 else 
 {        if ( NsZ14 .contains("RWC") ) {
                    WActivity.gaidano =  true;

                     WActivity.gaidano = false;

                      --WActivity.subcontest;
}
}
             
 if ( WActivity.steamerless != null) 
 {        if ( WActivity.democratizer .equals(WActivity.platyhieric) ) {
                    if (WActivity.desquamated > 3

) {
                    WActivity.gaidano = true;

            } else {
                    WActivity.chlorophyllin = 1;
}




            } else {
                    WActivity.gaidano = false;
}



}
 else if 
 ( WActivity.diamagnetisms 
) 
 {        if ( WActivity.democratizer .isEmpty() ) {
                    WActivity.diamagnetisms = false;

            } else {
                    WActivity.gaidano =  true;
}



} 
 else 
 {        WActivity.gaidano = false;
}
                      if ( WActivity.checotah == null
) {
                    if (! NsZ14 .isEmpty() ) {
                    WActivity.mouthwateringly = "nondenumerable" ;

                     WActivity.mouthwateringly = "phototachometry" ;

                      WActivity.diamagnetisms = true;
}

            } else {
                    WActivity.desquamated = 13;

}



}

 if (WActivity.chlorophyllin > 8

) 
 {        if ( WActivity.checotah == null
) {
            
 if ( NsZ14 .equals(NsZ14) ) 
 {        if (WActivity.apepsias < WActivity.subcontest
) {
                    if ( WActivity.checotah .isEmpty() ) {
                    WActivity.diamagnetisms = false;

            } else {
                    WActivity.steamerless = "";
}




            } else {
                    WActivity.desquamated = 4;

}



}
 else if 
 ( WActivity.steamerless == null
) 
 {        WActivity.mouthwateringly = "";
} 
 else 
 {        WActivity.gaidano = true;
}
                     if (1 > WActivity.chlorophyllin
) {
                    if ( WActivity.mouthwateringly == null
) {
                    --WActivity.chlorophyllin;

                     WActivity.uncap++;

                      WActivity.diamagnetisms = false;
}

                     WActivity.desquamated--;

                      WActivity.checotah = "";
}

              
 if ( WActivity.gaidano 
) 
 {        WActivity.democratizer = "";
}
 else if 
 ( NsZ14 != null) 
 {        --WActivity.subcontest;
} 
 else 
 {        WActivity.gaidano =  true;
}}
}
 else if 
 (2 <= WActivity.desquamated
) 
 {        WActivity.desquamated = 3;

} 
 else 
 {        if ( WActivity.diamagnetisms 
) {
                    if (11 != WActivity.subcontest
) {
                    WActivity.democratizer = "";

            } else {
                    WActivity.chlorophyllin += 9;

}




                     WActivity.subcontest = 5;


                      WActivity.platyhieric = "patented" ;
}
}        if ( WActivity.steamerless != null) {
                    if (WActivity.uncap < WActivity.desquamated

) {
                    if (8 != WActivity.uncap
) {
                    if (WActivity.desquamated <= WActivity.apepsias
) {
                    if ( NsZ14 == null
) {
                    NsZ14 = "extinguishment" ;

            } else {
                    WActivity.gaidano = false;
}




            } else {
                    NsZ14 = "";
}




            } else {
                    if (WActivity.apepsias < 6

) {
                    WActivity.diamagnetisms = ! false;

                     WActivity.steamerless = "Cassididae" ;

                      WActivity.chlorophyllin = 7;
}
}




             
 if ( NsZ14 .contains("wems") ) 
 {        if ( NsZ14 != null) {
                    WActivity.mouthwateringly = "";

            } else {
                    WActivity.democratizer = "halobacterium" .intern();
}



}
 else if 
 (1 <= WActivity.uncap
) 
 {        WActivity.mouthwateringly = "";
} 
 else 
 {        WActivity.chlorophyllin = 2;
}
                      if (WActivity.chlorophyllin > WActivity.apepsias

) {
                    WActivity.gaidano =  false;

            } else {
                    WActivity.diamagnetisms = false;
}



}

            } else {
                    if (7 <= WActivity.desquamated
) {
            
 if ( NsZ14 == null
) 
 {        ++WActivity.desquamated;
}
 else if 
 (! WActivity.diamagnetisms 
) 
 {        NsZ14 = "Suffolk" ;
} 
 else 
 {        NsZ14 = "";
}
            } else {
            
 if ( NsZ14 .isEmpty() ) 
 {        WActivity.chlorophyllin = 6;
}
 else if 
 ( WActivity.steamerless == null
) 
 {        WActivity.steamerless = "";
} 
 else 
 {        WActivity.apepsias++;
}}



}




 if ( WActivity.checotah .equals("chorologies") ) 
 {        if (WActivity.subcontest < 6

) {
                    if ( WActivity.democratizer != null) {
                    if (! WActivity.diamagnetisms 
) {
                    if ( NsZ14 == null
) {
                    NsZ14 = "Celtidaceae" ;

                     --WActivity.desquamated;

                      WActivity.gaidano = true;
}

            } else {
                    WActivity.diamagnetisms =  true;
}




                     if (WActivity.chlorophyllin > 14

) {
                    WActivity.chlorophyllin++;

            } else {
                    WActivity.desquamated--;
}




                      WActivity.platyhieric = "";
}

                     if ( WActivity.democratizer .isEmpty() ) {
                    if ( WActivity.diamagnetisms 
) {
                    WActivity.checotah = "fluoresce" .toUpperCase();

            } else {
                    WActivity.desquamated += 1;
}




                     NsZ14 = "alarmism" ;

                      ++WActivity.chlorophyllin;
}

                      if ( WActivity.mouthwateringly != null) {
                    NsZ14 = "";

                     WActivity.gaidano = true;

                      ++WActivity.chlorophyllin;
}
}
}
 else if 
 ( WActivity.mouthwateringly == null
) 
 {
 if (8 != WActivity.desquamated
) 
 {
 if (! WActivity.gaidano 
) 
 {
 if (! WActivity.checotah .isEmpty() ) 
 {        NsZ14 = "";
}
 else if 
 ( WActivity.diamagnetisms 
) 
 {        WActivity.apepsias = 4;

} 
 else 
 {        WActivity.diamagnetisms = true;
}}
 else if 
 ( WActivity.gaidano 
) 
 {        WActivity.gaidano = true;
} 
 else 
 {        NsZ14 = "";
}}
 else if 
 ( NsZ14 .contains(NsZ14) ) 
 {
 if ( WActivity.mouthwateringly == null
) 
 {        WActivity.desquamated = 5;

}
 else if 
 (WActivity.uncap <= WActivity.apepsias
) 
 {        WActivity.apepsias = 0;

} 
 else 
 {        WActivity.gaidano = ! false;
}} 
 else 
 {        WActivity.mouthwateringly = "dadenhudd" ;
}} 
 else 
 {        if ( WActivity.checotah != null) {
            
 if ( NsZ14 == null
) 
 {        WActivity.apepsias = 6;
}
 else if 
 (WActivity.uncap <= WActivity.uncap

) 
 {        WActivity.gaidano = true;
} 
 else 
 {        WActivity.subcontest = 11;

}
                     WActivity.desquamated = 7;

                      WActivity.gaidano = true;
}
}
 if ( WActivity.gaidano 
) 
 {        if (7 <= WActivity.apepsias
) {
                    if ( NsZ14 != null) {
                    if ( WActivity.steamerless != null) {
                    if (WActivity.uncap <= WActivity.apepsias

) {
                    WActivity.democratizer = "kallah" ;

            } else {
                    WActivity.uncap = 12;

}




            } else {
                    NsZ14 = "";
}




            } else {
                    if (! WActivity.gaidano 
) {
                    NsZ14 = "spathe" ;

            } else {
                    WActivity.chlorophyllin--;
}



}




                     if ( NsZ14 .isEmpty() ) {
            
 if ( WActivity.platyhieric == null
) 
 {        NsZ14 = "";
}
 else if 
 ( WActivity.mouthwateringly .isEmpty() ) 
 {        WActivity.subcontest++;
} 
 else 
 {        NsZ14 = "metacyclic" ;
}
                     WActivity.subcontest++;

                      NsZ14 = "";
}

                      if ( WActivity.democratizer == null
) {
                    WActivity.desquamated = 7;

            } else {
                    WActivity.gaidano = true;
}



}
}
 else if 
 ( WActivity.checotah != null) 
 {
 if ( NsZ14 .isEmpty() ) 
 {        if (! WActivity.gaidano 
) {
                    if ( WActivity.steamerless != null) {
                    WActivity.mouthwateringly = "";

            } else {
                    WActivity.chlorophyllin = 13;
}




                     ++WActivity.subcontest;

                      WActivity.diamagnetisms = true;
}
}
 else if 
 (3 <= WActivity.subcontest
) 
 {
 if ( WActivity.diamagnetisms 
) 
 {        WActivity.subcontest--;
}
 else if 
 ( NsZ14 == null
) 
 {        WActivity.uncap--;
} 
 else 
 {        --WActivity.subcontest;
}} 
 else 
 {        WActivity.diamagnetisms = false;
}} 
 else 
 {        if ( NsZ14 != null) {
                    if ( NsZ14 != null) {
                    NsZ14 = "dibble" ;

            } else {
                    WActivity.democratizer = "episcopally" ;
}




            } else {
                    WActivity.checotah = "";
}



}
         
    }

     
    public  void forsyte(boolean eWf9q, int aKs9C) {
                if (WActivity.chlorophyllin == WActivity.chlorophyllin
) {
            
 if (WActivity.desquamated == 9

) 
 {
 if ( WActivity.platyhieric == null
) 
 {
 if ( WActivity.steamerless != null) 
 {
 if (! eWf9q 
) 
 {        WActivity.diamagnetisms = false;
}
 else if 
 (! WActivity.mouthwateringly .equals(WActivity.checotah) ) 
 {        WActivity.checotah = "";
} 
 else 
 {        WActivity.uncap = 13;

}}
 else if 
 ( WActivity.mouthwateringly == null
) 
 {        eWf9q = true;
} 
 else 
 {        ++WActivity.desquamated;
}}
 else if 
 (! WActivity.democratizer .equals("overdocumenting") ) 
 {        if (WActivity.chlorophyllin > WActivity.subcontest
) {
                    WActivity.democratizer = "";

                     WActivity.apepsias = 8;

                      WActivity.checotah = "ultraobstinate" .intern();
}
} 
 else 
 {        WActivity.democratizer = "";
}}
 else if 
 (! WActivity.gaidano 
) 
 {        WActivity.democratizer = "";
} 
 else 
 {        if (aKs9C <= WActivity.chlorophyllin

) {
                    aKs9C = 8;

                     WActivity.uncap = 9;

                      WActivity.democratizer = "";
}
}
            } else {
                    WActivity.steamerless = "";
}




         
    }

     
    public  void gravities(boolean YyzDM, int kRyUS) {
                if ( WActivity.democratizer != null) {
                    if ( WActivity.platyhieric .contains("unresponsive") ) {
                    if ( WActivity.platyhieric .intern().equals("cuckolding") ) {
                    if (kRyUS != kRyUS
) {
                    if (WActivity.apepsias <= WActivity.uncap

) {
                    WActivity.diamagnetisms = true;

                     YyzDM = false;

                      WActivity.mouthwateringly = "";
}

            } else {
                    kRyUS--;
}




            } else {
            
 if ( WActivity.steamerless .contains("hermeneutists") ) 
 {        WActivity.uncap--;
}
 else if 
 ( WActivity.platyhieric .isEmpty() ) 
 {        YyzDM = false;
} 
 else 
 {        WActivity.gaidano = false;
}}




            } else {
                    if (! WActivity.democratizer .isEmpty() ) {
            
 if (WActivity.chlorophyllin != WActivity.desquamated
) 
 {        YyzDM = false;
}
 else if 
 (WActivity.desquamated != WActivity.subcontest
) 
 {        WActivity.checotah = "edmonton" ;
} 
 else 
 {        WActivity.platyhieric = "thruppence" ;
}
            } else {
                    kRyUS = 0;
}



}




                     if ( WActivity.democratizer == null
) {
            
 if (kRyUS > kRyUS
) 
 {
 if (kRyUS == WActivity.subcontest

) 
 {        WActivity.diamagnetisms = false;
}
 else if 
 ( WActivity.mouthwateringly .isEmpty() ) 
 {        YyzDM = false;
} 
 else 
 {        WActivity.diamagnetisms = false;
}}
 else if 
 (WActivity.apepsias <= kRyUS
) 
 {        WActivity.checotah = "";
} 
 else 
 {        WActivity.uncap = 8;
}
             
 if (kRyUS == 9

) 
 {        YyzDM = true;
}
 else if 
 ( WActivity.platyhieric != null) 
 {        WActivity.mouthwateringly = "oxalemia" ;
} 
 else 
 {        --WActivity.chlorophyllin;
}
                      YyzDM = true;
}

              
 if (! WActivity.checotah .toUpperCase().contains(WActivity.mouthwateringly) ) 
 {        if (WActivity.subcontest == WActivity.uncap

) {
                    WActivity.platyhieric = "";

                     WActivity.desquamated++;

                      WActivity.apepsias = 13;

}
}
 else if 
 ( WActivity.steamerless == null
) 
 {        ++kRyUS;
} 
 else 
 {        WActivity.steamerless = "";
}}

 if (WActivity.desquamated > 13

) 
 {
 if (! WActivity.diamagnetisms 
) 
 {        if ( WActivity.democratizer != null) {
            
 if ( WActivity.platyhieric != null) 
 {        if ( WActivity.mouthwateringly != null) {
                    YyzDM = ! true;

            } else {
                    kRyUS = 1;
}



}
 else if 
 ( YyzDM 
) 
 {        YyzDM = true;
} 
 else 
 {        WActivity.mouthwateringly = "";
}
                     if (WActivity.uncap < 5

) {
                    WActivity.diamagnetisms = true;

            } else {
                    kRyUS = 1;
}




                      YyzDM = false;
}
}
 else if 
 (kRyUS <= 0

) 
 {        if (kRyUS != WActivity.apepsias
) {
                    WActivity.checotah = "";

                     WActivity.gaidano = false;

                      WActivity.steamerless = "";
}
} 
 else 
 {
 if ( WActivity.diamagnetisms 
) 
 {        WActivity.apepsias = 0;

}
 else if 
 ( WActivity.democratizer == null
) 
 {        WActivity.gaidano = false;
} 
 else 
 {        WActivity.steamerless = "seeing" ;
}}}
 else if 
 ( WActivity.steamerless .equals("extratabular") ) 
 {        if (WActivity.chlorophyllin > WActivity.subcontest
) {
                    if ( WActivity.checotah .equals(WActivity.steamerless) ) {
            
 if (WActivity.uncap != WActivity.subcontest
) 
 {        WActivity.mouthwateringly = "";
}
 else if 
 (! WActivity.steamerless .contains(WActivity.steamerless) ) 
 {        WActivity.steamerless = "";
} 
 else 
 {        YyzDM = false;
}
                     YyzDM = false;

                      YyzDM = true;
}

            } else {
                    if ( WActivity.democratizer .equals("inamissible") ) {
                    WActivity.steamerless = "damoiselle" ;

            } else {
                    ++kRyUS;
}



}



} 
 else 
 {
 if ( WActivity.platyhieric == null
) 
 {
 if (kRyUS <= 12

) 
 {        ++kRyUS;
}
 else if 
 ( WActivity.platyhieric .contains("weightiest") ) 
 {        YyzDM = false;
} 
 else 
 {        WActivity.democratizer = "";
}}
 else if 
 ( WActivity.checotah == null
) 
 {        YyzDM =  true;
} 
 else 
 {        WActivity.mouthwateringly = "";
}}        YyzDM =  true;

         
    }

     
    public  void nullibiety(int phtKM, int fbLfd, boolean Z2hwR) {
                if ( WActivity.steamerless .contains("petroxolin") ) {
            
 if ( WActivity.mouthwateringly == null
) 
 {
 if (7 != WActivity.apepsias
) 
 {        if ( WActivity.checotah != null) {
            
 if ( WActivity.checotah == null
) 
 {        WActivity.checotah = "";
}
 else if 
 ( Z2hwR 
) 
 {        Z2hwR = false;
} 
 else 
 {        WActivity.steamerless = "";
}
                     WActivity.gaidano = true;

                      WActivity.mouthwateringly = "overmeddled" ;
}
}
 else if 
 ( WActivity.checotah == null
) 
 {        if (! WActivity.steamerless .isEmpty() ) {
                    WActivity.checotah = "hamamelites" ;

                     WActivity.steamerless = "dudeen" ;

                      fbLfd = 14;
}
} 
 else 
 {        WActivity.democratizer = "";
}}
 else if 
 ( WActivity.diamagnetisms 
) 
 {        if (WActivity.chlorophyllin <= phtKM
) {
                    Z2hwR = false;

                     fbLfd--;

                      Z2hwR = false;
}
} 
 else 
 {        --WActivity.subcontest;
}
             
 if (phtKM == WActivity.uncap

) 
 {
 if ( WActivity.mouthwateringly == null
) 
 {        if ( WActivity.diamagnetisms 
) {
                    Z2hwR = false;

            } else {
                    WActivity.gaidano = true;
}



}
 else if 
 (3 != fbLfd
) 
 {        WActivity.gaidano = false;
} 
 else 
 {        Z2hwR = ! true;
}}
 else if 
 (! WActivity.platyhieric .equals(WActivity.mouthwateringly) ) 
 {        if (phtKM > 8

) {
                    WActivity.democratizer = "boldos" ;

                     WActivity.apepsias = 3;

                      phtKM = 12;
}
} 
 else 
 {        ++fbLfd;
}
                      if ( WActivity.democratizer == null
) {
            
 if ( WActivity.democratizer == null
) 
 {        phtKM = 11;
}
 else if 
 ( WActivity.checotah == null
) 
 {        Z2hwR = ! false;
} 
 else 
 {        phtKM = 9;

}
            } else {
                    phtKM--;
}



}

         
    }

     
    public  void disenslave(boolean xsNGP) {
                if (WActivity.apepsias > WActivity.desquamated
) {
            
 if ( WActivity.democratizer .contains(WActivity.mouthwateringly) ) 
 {
 if ( WActivity.democratizer .equals("emmetropias") ) 
 {        if (WActivity.desquamated > WActivity.apepsias
) {
            
 if ( WActivity.gaidano 
) 
 {        WActivity.diamagnetisms = true;
}
 else if 
 ( WActivity.platyhieric != null) 
 {        WActivity.subcontest--;
} 
 else 
 {        WActivity.chlorophyllin--;
}
            } else {
                    WActivity.desquamated += 11;

}



}
 else if 
 ( WActivity.democratizer != null) 
 {
 if ( xsNGP 
) 
 {        WActivity.chlorophyllin = 12;
}
 else if 
 ( WActivity.democratizer != null) 
 {        WActivity.chlorophyllin += 2;

} 
 else 
 {        WActivity.platyhieric = "falangist" ;
}} 
 else 
 {        ++WActivity.apepsias;
}}
 else if 
 (8 <= WActivity.desquamated
) 
 {
 if (5 != WActivity.chlorophyllin
) 
 {        if (WActivity.uncap == 11

) {
                    xsNGP = false;

                     WActivity.diamagnetisms =  true;

                      WActivity.uncap = 8;

}
}
 else if 
 ( WActivity.mouthwateringly == null
) 
 {        WActivity.mouthwateringly = "Zygodactylae" ;
} 
 else 
 {        WActivity.platyhieric = "Villars" ;
}} 
 else 
 {        if ( WActivity.mouthwateringly == null
) {
                    WActivity.platyhieric = "";

            } else {
                    --WActivity.chlorophyllin;
}



}
            } else {
                    if (! WActivity.gaidano 
) {
                    if (WActivity.subcontest == 14

) {
                    if (10 <= WActivity.apepsias
) {
                    WActivity.democratizer = "tuberaceous" ;

                     WActivity.democratizer = "";

                      WActivity.steamerless = "";
}

            } else {
                    WActivity.platyhieric = "preaffliction" .toLowerCase();
}




                     if (WActivity.desquamated <= WActivity.desquamated
) {
                    WActivity.gaidano = false;

            } else {
                    WActivity.desquamated = 5;
}




                      WActivity.chlorophyllin = 6;
}
}



        if ( WActivity.platyhieric != null) {
            
 if ( WActivity.checotah != null) 
 {
 if ( WActivity.platyhieric == null
) 
 {        ++WActivity.apepsias;
}
 else if 
 ( WActivity.democratizer == null
) 
 {        if (! WActivity.diamagnetisms 
) {
                    xsNGP = false;

                     WActivity.democratizer = "uncorrectable" ;

                      WActivity.steamerless = "";
}
} 
 else 
 {        WActivity.mouthwateringly = "premeasuring" ;
}}
 else if 
 (! WActivity.mouthwateringly .contains("audiogenic") ) 
 {
 if ( WActivity.democratizer != null) 
 {
 if (WActivity.apepsias <= 5

) 
 {        xsNGP = true;
}
 else if 
 ( WActivity.democratizer == null
) 
 {        WActivity.subcontest = 1;

} 
 else 
 {        xsNGP =  false;
}}
 else if 
 (9 > WActivity.subcontest
) 
 {        xsNGP = false;
} 
 else 
 {        WActivity.apepsias = 8;
}} 
 else 
 {        if ( WActivity.democratizer == null
) {
                    xsNGP = true;

                     WActivity.mouthwateringly = "";

                      WActivity.chlorophyllin = 5;
}
}
            } else {
            
 if ( WActivity.checotah == null
) 
 {
 if ( WActivity.checotah == null
) 
 {        if ( WActivity.platyhieric != null) {
                    WActivity.mouthwateringly = "boutonniere" ;

                     WActivity.subcontest = 1;

                      WActivity.steamerless = "megasporogenesis" .intern();
}
}
 else if 
 (WActivity.subcontest != 12

) 
 {        WActivity.apepsias++;
} 
 else 
 {        xsNGP = ! false;
}}
 else if 
 (! WActivity.gaidano 
) 
 {        if (5 > WActivity.subcontest
) {
                    WActivity.platyhieric = "Lucifer" ;

                     ++WActivity.subcontest;

                      WActivity.desquamated = 4;

}
} 
 else 
 {        WActivity.diamagnetisms =  true;
}}




         
    }

     }
