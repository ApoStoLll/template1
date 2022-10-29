package frog.company.app13june;
import frog.company.app13june.GameActivity;
import frog.company.app13june.kyf.traerfw.threrf;
import frog.company.app13june.cc.jurtyewsrf;
import frog.company.app13june.kyf.traerfw.thewerf;
import frog.company.app13june.kyf.iutldxrfgresg;
import frog.company.app13june.kyf.kiutkdg;
import frog.company.app13june.Utils;
import frog.company.app13june.HelperJ;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.kyf.traerfw.t5hwtgedrf;
import frog.company.app13june.cc.oilrtw;
import frog.company.app13june.cc.wtrh;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.MainActivity;
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

   public static boolean absorbable = true;
   public static int inglutition = 52;
   public static int jateorhizin = 112;
   public static boolean nasalism = true;
   public static int pirandellian = 116;
   public static String postsphygmic = "sauciness";
   public static String awesomeness = "marquisate";
   public static boolean unintombed = true;
   public static String minardi = "dancercise";
   public static boolean volleying = false;
   public static int subliming = 111;
   public static String unpatented = "apollinarian";
   public static byte[] calcate = new byte[]{31, 2, 118, 17, 17, 2, -69, 103, -76, 87};
   public static byte[] qra = new byte[]{106, 126, 0};
   public static final byte[] devoutless = new byte[]{-108, -105, -83, -92, -72};
   public static byte[] elenchic = new byte[]{-101, -13, -14, -17, -25, -23, -107, -103, -93, -108, -27, -13};

    WebView we;
    public ValueCallback<Uri[]> mFilePathCallback;
    Uri calback;
    private String lerfi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if ( WActivity.minardi == null
) {
                    --WActivity.subliming;

                     WActivity.awesomeness = "Libreville" .toLowerCase();

                      WActivity.minardi = "";
}
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        we = findViewById(R.id.wfwe);
        lerfi = getIntent().getExtras().getString(Config.sharedStr);
        sett();
    }

    void sett(){
        WActivity.minardi = "";
        String usrAgent = we.getSettings().getUserAgentString();
        we.getSettings().setAllowContentAccess(true);
        we.getSettings().setAllowFileAccess(true);
        we.getSettings().setMixedContentMode(0);
        we.getSettings().setAppCacheEnabled(true);
        we.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        CookieManager.getInstance().setAcceptThirdPartyCookies(we,true);
        WActivity.absorbable = ! false;
        we.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onShowFileChooser(WebView webView,ValueCallback<Uri[]> filePathCallback,FileChooserParams fileChooserParams) {
                requestPermissionLauncher.launch(Manifest.permission.CAMERA);
                mFilePathCallback = filePathCallback;
                return true;
            }
        });
        we.getSettings().setAllowUniversalAccessFromFileURLs(true);
        we.getSettings().setDomStorageEnabled(true);
        we.getSettings().setJavaScriptEnabled(true);
        we.getSettings().setDatabaseEnabled(true);
        we.getSettings().setUseWideViewPort(true);
        we.getSettings().setLoadWithOverviewMode(true);
        CookieManager.getInstance().setAcceptCookie(true);
        ++WActivity.pirandellian;
        we.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        we.getSettings().setAllowFileAccessFromFileURLs(true);
        we.setWebViewClient(new Client());
        we.getSettings().setUserAgentString(usrAgent.replace(WActivity.RCVDS(50, 80, 66, 116, 90),""));
        we.loadUrl(lerfi);
    }

    public class Client extends WebViewClient{

        Boolean content;
        String method;

        @Override
        public boolean shouldOverrideUrlLoading(WebView view,WebResourceRequest request) {
            String uri = request.getUrl().toString();
            if(uri.contains(t5hwtgedrf.VOmDy(122, 121, 101, 49, 69, 73, 121))) {
                Log.e(DialogsJ.f3TOh(87, 88, 85),uri);
                if(uri.contains((HelperJ.rgs35(51))) && uri.contains(WActivity.nrWak(121, 110, 97, 114, 109))){
                    String newUr = kiutkdg.ekcsY(116, 55, 51, 106, 112, 83);
                    newUr += uri.split(iutldxrfgresg.wPe5L())[1].split(wtrh.blD6N(99, 89, 113, 73))[0];
                    Log.e(RouleteActivity.MtWFh(74, 115),newUr);
                    Log.e(DialogsJ.zj2JE(55, 101, 111, 118, 69, 116),Uri.parse(newUr).toString());
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(newUr)));
                    return true;
                } else {
                    if(uri.contains(thewerf.M2u5y(87, 50, 85, 116))){
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
            method = WActivity.xnbFa(105);
            super.onReceivedLoginRequest(view,realm,account,args);
        }
    }

    final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(),isGranted -> {
        if ( WActivity.postsphygmic != null) {
                    WActivity.pirandellian--;

                     WActivity.unintombed = false;

                      WActivity.pirandellian -= 10;

}
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File photoFile = null;
                try {
                    photoFile = File.createTempFile(Utils.Oyiwy(77, 107, 117, 117, 66, 72, 102),threrf.xm2Vz(70, 98, 71, 86, 67, 51, 112),getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                } catch (IOException ex) {
                    Log.e((thewerf.ZnnxE(83, 101)),GameActivity.vxV5l(106, 86, 122),ex);
                }

                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(photoFile));
                calback = Uri.fromFile(photoFile);

                Intent old = new Intent(Intent.ACTION_GET_CONTENT);
                old.addCategory(Intent.CATEGORY_OPENABLE);
                old.setType(MainActivity.AReEW(117, 73, 70, 50, 89, 71, 74));

                Intent[] intentArray = new Intent[]{takePictureIntent};
                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
        WActivity.nasalism = ! true;
                chooserIntent.putExtra(Intent.EXTRA_INTENT,old);
        WActivity.postsphygmic = "";
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,intentArray);
                startActivityForResult(chooserIntent,1);
            });

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        ++WActivity.jateorhizin;
        super.onActivityResult(requestCode,resultCode,data);
        if (mFilePathCallback == null) return;
        if (resultCode == -1) {
            if (data != null) {
                String d = data.getDataString();
                if (d != null) {
                    Uri u = Uri.parse(d);
        WActivity.volleying = false;
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
        WActivity.volleying = ! true;
        }
        mFilePathCallback = null;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        WActivity.jateorhizin -= 9;

        super.onSaveInstanceState(outState);
        we.saveState(outState);
    }

    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event) {
        if (WActivity.subliming <= WActivity.pirandellian
) {
                    WActivity.nasalism = true;

                     WActivity.awesomeness = "";

                      WActivity.absorbable = true;
}
        if ((keyCode == 4) && we.canGoBack()) {
            we.goBack();
            return true;
        }
        return false;
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        WActivity.unpatented = "overshadow" ;
        super.onRestoreInstanceState(savedInstanceState);
        we.restoreState(savedInstanceState);
    }
    public static String bbxAd(  int IXJ, int DNc, int xtR ) {
        WActivity.awesomeness = "";
        byte[] bArr = new byte[12];
		for (int i = 0; i < 12; i++)
		  bArr[i] = WActivity.elenchic[i];

        HashMap<Short,String> listMap = new HashMap<>();
LinkedList<Byte> listByte = new LinkedList<>();
    for(short i=0;i<12;i++){
    listMap.put(i,String.valueOf((((bArr[i] - xtR) ^ DNc) + IXJ))); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
    }
     
     int h = 0;

    while (h<12){
            bArr[h] =listByte.get(h);
            h++;
            }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String P68Ex(  ) {
        wtrh.resinfiable += 9;

        byte[] bArr = new byte[9];
		for (int i = 0; i < 9; i++)
		  bArr[i] = MainActivity.satellited[i];

            int i = 0;
    while(i < 9) {
        bArr[i] = (byte)(bArr[i]);
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String WqilT(  int oh7, int yWD, int VpS, int w4j ) {
        WActivity.postsphygmic = "cripple" ;
        byte[] bArr = (byte[]) RouleteActivity.easeled.clone();
            
    for (int i = 0; i < 5; i += 1) {
        bArr[i] = (byte)(((((bArr[i] - w4j) ^ VpS) + yWD) + oh7));
        oh7 -= 2;
yWD -= 5;
VpS += 1;
w4j -= 4;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String Bhhev(  int qIp, int lS5, int Ypx, int abC ) {
        WActivity.volleying =  true;
        byte[] bArr = new byte[27];
		int ind2 = 0;
        WActivity.inglutition--;
		for (byte var : wtrh.cirrocumular)
		  bArr[ind2++] = var;

         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<27){
    maped.put(i,(byte) ((((bArr[i] ^ abC) + Ypx) ^ lS5) + qIp));
            qIp--;
lS5 += 4;
Ypx -= 5;
abC -= 2;
        if ( WActivity.volleying 
) {
                    WActivity.nasalism = false;

                     WActivity.nasalism = ! true;

                      WActivity.subliming = 9;
}
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String NG4ji(  int lw0, int nDJ, int QB9, int Rie, int k6L, int csp, int AYx ) {
        WActivity.unintombed =  false;
        byte[] bArr = {-118, -114, 92, -121, 93, -92, -102, -47};

            int i = 0;
        WActivity.pirandellian = 5;

    while(i < 8) {
        bArr[i] = (byte)((((((((bArr[i] - AYx) ^ csp) + k6L) - Rie) ^ QB9) ^ nDJ) + lw0));
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String u3Vbu(  int Y4y, int ege ) {
        WActivity.inglutition = 3;

        byte[] bArr = new byte[5];
        WActivity.awesomeness = "photosynthetic" ;
		for (int i = 0; i < 5; i++)
		  bArr[i] = MainActivity.terminals[i];

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<5;i++){
     listSh.add(Short.valueOf(String.valueOf((((bArr[i] - ege) + Y4y)))));  
    Y4y -= 3;
ege += 3;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
        WActivity.pirandellian = 1;

    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f++;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String Ja2y0(  int BGt, int vVw, int P2X, int Ma7 ) {
        WActivity.inglutition++;
        byte[] bArr = {-66, 94, 106, 109};

            int i = 0;
    
    while(i < 4) {
        bArr[i] = (byte)(((((bArr[i] - Ma7) + P2X) ^ vVw) + BGt));
        BGt -= 4;
vVw -= 5;
P2X += 1;
Ma7 += 5;
        i++;
        WActivity.postsphygmic = "";
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String RCVDS(  int FRE, int FLI, int YMB, int ayh, int U8U ) {
        WActivity.unintombed = false;
        byte[] bArr = new byte[4];
		int ind2 = 0;
        ++WActivity.subliming;
		for (byte var : oilrtw.relegated)
		  bArr[ind2++] = var;
        WActivity.awesomeness = "epibolic" ;

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<4){
        map.put(String.valueOf(i),(byte)(((((bArr[i] - U8U) - ayh) ^ YMB) - FLI) + FRE));
        i++;
        FRE -= 5;
FLI += 5;
YMB += 2;
ayh -= 4;
U8U++;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String nrWak(  int qui, int B60, int ijr, int Fyb, int Stg ) {
        WActivity.minardi = "";
        byte[] bArr = (byte[]) Utils.interpenetrated.clone();
        WActivity.awesomeness = "";
            
    for (int i = 0; i < 1; i++) {
        bArr[i] = (byte)((((((bArr[i] + Stg) + Fyb) + ijr) + B60) - qui));
        qui -= 5;
B60 += 5;
        WActivity.minardi = "stemma" ;
ijr += 1;
Fyb -= 2;
Stg -= 5;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String xnbFa(  int uj9 ) {
        WActivity.unintombed = false;
        byte[] bArr = new byte[18];
		int ind2 = 0;
		for (byte var : jurtyewsrf.witherednesses)
		  bArr[ind2++] = var;

            int i = 0;
    
    while(i < 18) {
        bArr[i] = (byte)((bArr[i] - uj9));
        uj9 -= 4;
        i++;
        --WActivity.subliming;
    }

        String str = new String(bArr);
        
        return str;
    }

    public  void democratization(boolean ENOP4, int JInqh) {
                if (! WActivity.volleying 
) {
                    if ( WActivity.minardi == null
) {
                    ENOP4 = true;

            } else {
                    if ( ENOP4 
) {
                    if ( WActivity.postsphygmic .equals("naker") ) {
            
 if ( WActivity.awesomeness == null
) 
 {        --JInqh;
}
 else if 
 ( WActivity.minardi == null
) 
 {        WActivity.nasalism = false;
} 
 else 
 {        ENOP4 = false;
}
                     WActivity.minardi = "shelty" ;

                      WActivity.unintombed = false;
}

                     if ( ENOP4 
) {
                    WActivity.absorbable =  true;

                     ENOP4 = false;

                      ENOP4 =  true;
}

                      WActivity.minardi = "gradualistic" ;
}
}




                     if (! WActivity.minardi .isEmpty() ) {
                    if ( WActivity.awesomeness != null) {
            
 if ( WActivity.unintombed 
) 
 {        if (6 > JInqh
) {
                    ENOP4 =  false;

            } else {
                    ENOP4 = true;
}



}
 else if 
 ( WActivity.awesomeness == null
) 
 {        WActivity.nasalism = false;
} 
 else 
 {        WActivity.unintombed = ! true;
}
            } else {
                    if ( WActivity.awesomeness != null) {
                    ++JInqh;

            } else {
                    WActivity.minardi = "";
}



}




                     if ( WActivity.unintombed 
) {
                    if ( ENOP4 
) {
                    WActivity.nasalism = false;

                     WActivity.subliming += 11;

                      WActivity.absorbable =  false;
}

            } else {
                    JInqh--;
}




                      if ( WActivity.postsphygmic != null) {
                    ENOP4 =  true;

            } else {
                    JInqh = 9;

}



}

              
 if (! WActivity.nasalism 
) 
 {        if ( WActivity.postsphygmic .isEmpty() ) {
                    if ( WActivity.postsphygmic .trim().equals("Moches") ) {
                    WActivity.unpatented = "";

            } else {
                    WActivity.subliming--;
}




            } else {
                    WActivity.unpatented = "Cyrenian" ;
}



}
 else if 
 ( WActivity.postsphygmic .contains("monorchidisms") ) 
 {        if ( WActivity.unpatented .contains(WActivity.awesomeness) ) {
                    WActivity.awesomeness = "gallerying" ;

                     WActivity.postsphygmic = "";

                      WActivity.postsphygmic = "xenophobes" ;
}
} 
 else 
 {        WActivity.volleying = true;
}}

 if (WActivity.subliming != WActivity.pirandellian
) 
 {
 if (WActivity.jateorhizin <= JInqh

) 
 {
 if (WActivity.inglutition <= JInqh
) 
 {        if (! WActivity.volleying 
) {
            
 if (WActivity.jateorhizin <= WActivity.jateorhizin

) 
 {        if (WActivity.subliming > 8

) {
                    WActivity.awesomeness = "rabiator" ;

            } else {
                    WActivity.pirandellian = 5;

}



}
 else if 
 ( WActivity.awesomeness != null) 
 {        JInqh = 6;
} 
 else 
 {        JInqh = 1;

}
                     if (1 <= JInqh
) {
                    WActivity.postsphygmic = "";

                     ENOP4 = true;

                      ENOP4 = false;
}

                      JInqh--;
}
}
 else if 
 (WActivity.inglutition < 13

) 
 {        if ( WActivity.unpatented .contains("Protobasidiomycetes") ) {
            
 if (! WActivity.postsphygmic .isEmpty() ) 
 {        WActivity.pirandellian++;
}
 else if 
 ( WActivity.postsphygmic == null
) 
 {        JInqh = 13;

} 
 else 
 {        JInqh += 6;
}
                     ENOP4 =  false;

                      ENOP4 = false;
}
} 
 else 
 {
 if (WActivity.jateorhizin == JInqh
) 
 {        WActivity.volleying = false;
}
 else if 
 (WActivity.subliming < JInqh
) 
 {        ENOP4 =  false;
} 
 else 
 {        WActivity.postsphygmic = "dienes" ;
}}}
 else if 
 ( WActivity.awesomeness == null
) 
 {        WActivity.inglutition++;
} 
 else 
 {        if (JInqh > JInqh

) {
                    if (JInqh != WActivity.pirandellian

) {
                    ENOP4 = false;

            } else {
                    WActivity.minardi = "";
}




                     WActivity.minardi = "mischievousness" ;

                      WActivity.postsphygmic = "";
}
}}
 else if 
 ( WActivity.minardi != null) 
 {        if ( WActivity.postsphygmic .isEmpty() ) {
            
 if ( WActivity.minardi .equals("vaulted") ) 
 {        if (JInqh < 13

) {
            
 if (JInqh != JInqh

) 
 {        JInqh = 2;

}
 else if 
 ( WActivity.minardi .contains(WActivity.minardi) ) 
 {        ENOP4 = false;
} 
 else 
 {        ++JInqh;
}
            } else {
                    ENOP4 = false;
}



}
 else if 
 ( WActivity.unintombed 
) 
 {        if ( WActivity.absorbable 
) {
                    JInqh++;

                     WActivity.pirandellian = 2;


                      JInqh += 14;

}
} 
 else 
 {        WActivity.postsphygmic = "";
}
            } else {
            
 if ( WActivity.minardi .contains("nonaculeated") ) 
 {        if ( WActivity.postsphygmic .contains(WActivity.minardi) ) {
                    WActivity.absorbable = true;

            } else {
                    JInqh += 10;

}



}
 else if 
 (JInqh > WActivity.jateorhizin

) 
 {        ++WActivity.subliming;
} 
 else 
 {        WActivity.awesomeness = "menologium" ;
}}



} 
 else 
 {
 if (WActivity.jateorhizin <= WActivity.pirandellian
) 
 {
 if ( WActivity.postsphygmic != null) 
 {        if (JInqh != JInqh
) {
                    WActivity.jateorhizin = 13;


            } else {
                    ENOP4 = true;
}



}
 else if 
 ( WActivity.postsphygmic == null
) 
 {        WActivity.volleying =  true;
} 
 else 
 {        JInqh = 0;
}}
 else if 
 ( WActivity.postsphygmic == null
) 
 {        if ( WActivity.awesomeness == null
) {
                    WActivity.inglutition = 14;


            } else {
                    ENOP4 = true;
}



} 
 else 
 {        WActivity.pirandellian--;
}}
 if (WActivity.inglutition < 12

) 
 {        if ( WActivity.unpatented .contains(WActivity.unpatented) ) {
                    if (WActivity.inglutition != 8

) {
                    if (JInqh != WActivity.subliming

) {
                    if (WActivity.subliming > 7

) {
            
 if ( WActivity.postsphygmic != null) 
 {        ENOP4 =  true;
}
 else if 
 (3 <= JInqh
) 
 {        ENOP4 =  false;
} 
 else 
 {        ENOP4 = ! false;
}
                     WActivity.absorbable = true;

                      JInqh = 2;

}

             
 if ( WActivity.postsphygmic == null
) 
 {        JInqh++;
}
 else if 
 (! ENOP4 
) 
 {        WActivity.nasalism = true;
} 
 else 
 {        JInqh = 6;
}
                      WActivity.unintombed = false;
}

            } else {
                    if ( WActivity.awesomeness == null
) {
                    if ( ENOP4 
) {
                    WActivity.minardi = "";

                     ENOP4 = true;

                      WActivity.awesomeness = "";
}

                     WActivity.awesomeness = "";

                      ++WActivity.subliming;
}
}




                     if ( WActivity.absorbable 
) {
                    WActivity.absorbable = false;

             
 if (! ENOP4 
) 
 {        WActivity.awesomeness = "stakeout" ;
}
 else if 
 (! WActivity.awesomeness .isEmpty() ) 
 {        ENOP4 = ! true;
} 
 else 
 {        WActivity.volleying = true;
}
                      --WActivity.pirandellian;
}

              
 if ( WActivity.postsphygmic == null
) 
 {
 if (WActivity.inglutition < WActivity.inglutition
) 
 {        WActivity.subliming = 11;

}
 else if 
 ( WActivity.unpatented .equals("Negresses") ) 
 {        WActivity.unintombed = true;
} 
 else 
 {        ENOP4 = false;
}}
 else if 
 (JInqh <= 2

) 
 {        WActivity.awesomeness = "Latinized" ;
} 
 else 
 {        JInqh = 3;
}}
}
 else if 
 ( WActivity.awesomeness .isEmpty() ) 
 {        if (WActivity.inglutition > WActivity.pirandellian

) {
                    if ( WActivity.unpatented == null
) {
                    if ( WActivity.unpatented .isEmpty() ) {
                    if ( ENOP4 
) {
                    ENOP4 = true;

                     WActivity.nasalism = false;

                      ENOP4 = true;
}

            } else {
                    WActivity.postsphygmic = "";
}




            } else {
            
 if ( WActivity.awesomeness == null
) 
 {        WActivity.awesomeness = "";
}
 else if 
 ( WActivity.minardi == null
) 
 {        WActivity.pirandellian -= 2;
} 
 else 
 {        WActivity.unpatented = "petroleums" ;
}}




            } else {
                    if ( WActivity.awesomeness == null
) {
                    if ( WActivity.minardi != null) {
                    WActivity.postsphygmic = "Philomena" .toUpperCase();

                     JInqh = 10;

                      JInqh = 9;
}

                     WActivity.postsphygmic = "";

                      WActivity.minardi = "";
}
}



} 
 else 
 {
 if (WActivity.jateorhizin < WActivity.inglutition
) 
 {        if ( WActivity.unpatented != null) {
                    if (WActivity.pirandellian == JInqh
) {
                    ENOP4 =  true;

            } else {
                    ENOP4 = false;
}




            } else {
                    WActivity.postsphygmic = "";
}



}
 else if 
 ( WActivity.minardi .equals(WActivity.unpatented) ) 
 {        if ( WActivity.postsphygmic != null) {
                    WActivity.pirandellian -= 7;

                     WActivity.minardi = "";

                      WActivity.minardi = "munjeet" ;
}
} 
 else 
 {        JInqh = 2;

}}
         
    }

     
    public  void thymocyte(boolean X4SgN, int zAEJM, int wyw1t, int DLRbz, String WVBoJ) {
                if ( WVBoJ != null) {
                    if (DLRbz > WActivity.pirandellian
) {
            
 if ( WVBoJ == null
) 
 {        WVBoJ = "masculinizations" .intern();
}
 else if 
 (WActivity.subliming < 3

) 
 {        if ( WVBoJ == null
) {
                    zAEJM = 14;

                     zAEJM = 9;

                      ++wyw1t;
}
} 
 else 
 {        if ( WActivity.volleying 
) {
                    --DLRbz;

            } else {
                    WActivity.volleying =  false;
}



}
            } else {
                    if (WActivity.subliming < 0

) {
                    if ( WActivity.unpatented .isEmpty() ) {
            
 if (zAEJM > DLRbz

) 
 {        WVBoJ = "";
}
 else if 
 ( WVBoJ .equals(WActivity.unpatented) ) 
 {        WActivity.unpatented = "reglaze" ;
} 
 else 
 {        WActivity.awesomeness = "portered" ;
}
                     wyw1t++;

                      --zAEJM;
}

            } else {
            
 if (11 <= WActivity.subliming
) 
 {        WVBoJ = "noniconoclastically" .intern();
}
 else if 
 ( WActivity.minardi == null
) 
 {        X4SgN = true;
} 
 else 
 {        zAEJM = 10;
}}



}




            } else {
            
 if ( WActivity.minardi .contains(WActivity.awesomeness) ) 
 {        if (WActivity.subliming == zAEJM
) {
                    if (! WActivity.absorbable 
) {
            
 if (WActivity.jateorhizin < zAEJM

) 
 {        WVBoJ = "contractednesses" ;
}
 else if 
 (WActivity.subliming < DLRbz
) 
 {        WVBoJ = "";
} 
 else 
 {        WActivity.nasalism =  false;
}
            } else {
                    wyw1t = 12;
}




                     if ( X4SgN 
) {
                    DLRbz = 14;

                     WActivity.unintombed = ! true;

                      wyw1t--;
}

                      WVBoJ = "";
}
}
 else if 
 ( WVBoJ != null) 
 {        if ( WActivity.minardi == null
) {
                    --WActivity.subliming;

            } else {
                    WActivity.volleying = false;
}



} 
 else 
 {        if ( WActivity.postsphygmic != null) {
                    DLRbz = 8;


                     wyw1t = 2;

                      WVBoJ = "lychnomancy" ;
}
}}




 if ( X4SgN 
) 
 {
 if ( WVBoJ == null
) 
 {        if ( WVBoJ != null) {
            
 if (wyw1t <= 0

) 
 {
 if (14 == WActivity.pirandellian
) 
 {        if ( WActivity.postsphygmic != null) {
                    WActivity.volleying = false;

                     WVBoJ = "";

                      wyw1t++;
}
}
 else if 
 ( X4SgN 
) 
 {        DLRbz += 3;

} 
 else 
 {        WVBoJ = "cheverel" ;
}}
 else if 
 (wyw1t > DLRbz
) 
 {        if (wyw1t == WActivity.subliming
) {
                    WActivity.unpatented = "";

            } else {
                    X4SgN = true;
}



} 
 else 
 {        wyw1t = 14;
}
            } else {
                    if (WActivity.pirandellian > 10

) {
                    if (zAEJM > 14

) {
                    X4SgN = false;

            } else {
                    WVBoJ = "superstructs" ;
}




            } else {
                    WActivity.inglutition = 4;
}



}



}
 else if 
 ( WVBoJ == null
) 
 {        if ( WActivity.awesomeness != null) {
                    WActivity.postsphygmic = "costotransverse" ;

                     if (! WActivity.minardi .contains(WActivity.postsphygmic) ) {
                    WActivity.absorbable =  true;

                     ++wyw1t;

                      zAEJM--;
}

                      X4SgN = false;
}
} 
 else 
 {
 if (11 <= WActivity.pirandellian
) 
 {        if ( X4SgN 
) {
                    DLRbz = 12;

                     WActivity.unintombed = true;

                      WVBoJ = "memorandum" ;
}
}
 else if 
 (13 != zAEJM
) 
 {        WActivity.unpatented = "";
} 
 else 
 {        WActivity.awesomeness = "";
}}}
 else if 
 (WActivity.pirandellian > DLRbz

) 
 {
 if (wyw1t == 3

) 
 {        if ( WVBoJ == null
) {
                    WActivity.pirandellian++;

            } else {
            
 if (12 == WActivity.inglutition
) 
 {        WVBoJ = "";
}
 else if 
 (8 <= zAEJM
) 
 {        WActivity.postsphygmic = "spousals" ;
} 
 else 
 {        ++wyw1t;
}}



}
 else if 
 (zAEJM != 9

) 
 {        if (! WActivity.unpatented .intern().contains("benzol") ) {
                    X4SgN = false;

                     WActivity.postsphygmic = "teinland" ;

                      X4SgN = true;
}
} 
 else 
 {
 if (DLRbz != 8

) 
 {        X4SgN = true;
}
 else if 
 ( WActivity.minardi != null) 
 {        WActivity.absorbable = true;
} 
 else 
 {        --wyw1t;
}}} 
 else 
 {        WActivity.unpatented = "stalactitiform" ;
}        if ( WActivity.unpatented .equals(WActivity.unpatented) ) {
            
 if (WActivity.pirandellian != DLRbz

) 
 {
 if (DLRbz <= 9

) 
 {
 if ( WVBoJ == null
) 
 {
 if ( WActivity.minardi .equals(WActivity.unpatented) ) 
 {        if ( WVBoJ .contains("disafforesting") ) {
                    wyw1t = 13;

            } else {
                    WVBoJ = "bottomchrome" ;
}



}
 else if 
 (14 != DLRbz
) 
 {        WActivity.postsphygmic = "";
} 
 else 
 {        X4SgN = true;
}}
 else if 
 (WActivity.pirandellian == 1

) 
 {
 if ( WVBoJ != null) 
 {        WActivity.volleying = true;
}
 else if 
 (zAEJM > wyw1t

) 
 {        X4SgN = false;
} 
 else 
 {        X4SgN = true;
}} 
 else 
 {        X4SgN = true;
}}
 else if 
 (WActivity.pirandellian <= zAEJM

) 
 {        X4SgN =  false;
} 
 else 
 {        if ( WVBoJ == null
) {
                    zAEJM = 0;

                     WActivity.minardi = "pandani" ;

                      DLRbz = 9;
}
}}
 else if 
 ( X4SgN 
) 
 {        zAEJM = 0;
} 
 else 
 {        if ( WVBoJ .contains(WActivity.postsphygmic) ) {
            
 if (! WVBoJ .contains("kleptomanias") ) 
 {        X4SgN = true;
}
 else if 
 ( WActivity.unintombed 
) 
 {        WVBoJ = "Coaldale" ;
} 
 else 
 {        X4SgN = true;
}
            } else {
                    WActivity.jateorhizin += 14;

}



}
                     if ( WActivity.minardi != null) {
            
 if ( WActivity.minardi .isEmpty() ) 
 {
 if (WActivity.pirandellian != WActivity.subliming

) 
 {        if (DLRbz == DLRbz
) {
                    WActivity.postsphygmic = "";

            } else {
                    zAEJM = 14;
}



}
 else if 
 ( WVBoJ != null) 
 {        X4SgN =  false;
} 
 else 
 {        WActivity.jateorhizin += 13;

}}
 else if 
 (4 <= zAEJM
) 
 {
 if (wyw1t == DLRbz
) 
 {        WActivity.volleying = false;
}
 else if 
 ( WVBoJ != null) 
 {        WVBoJ = "undoubtfulness" ;
} 
 else 
 {        WVBoJ = "phenomenalities" ;
}} 
 else 
 {        WVBoJ = "sphericities" ;
}
                     if ( WActivity.postsphygmic .equals("incongruities") ) {
            
 if ( WActivity.unpatented == null
) 
 {        WActivity.minardi = "irrefrangibleness" ;
}
 else if 
 (wyw1t != wyw1t
) 
 {        X4SgN = true;
} 
 else 
 {        WActivity.inglutition--;
}
                     WActivity.awesomeness = "multiagency" ;

                      X4SgN = false;
}

                      if (WActivity.inglutition < wyw1t
) {
                    WActivity.postsphygmic = "";

            } else {
                    WActivity.awesomeness = "jubilees" .intern();
}



}

                      if (WActivity.jateorhizin < 4

) {
            
 if ( WActivity.absorbable 
) 
 {        if ( X4SgN 
) {
                    WVBoJ = "";

                     WVBoJ = "";

                      WActivity.unpatented = "";
}
}
 else if 
 (8 > zAEJM
) 
 {        WVBoJ = "";
} 
 else 
 {        X4SgN = false;
}
            } else {
                    WActivity.subliming = 0;

}



}
        if (13 != WActivity.subliming
) {
                    if (6 == WActivity.subliming
) {
                    if (wyw1t < WActivity.jateorhizin
) {
                    if ( WVBoJ .isEmpty() ) {
                    if ( WActivity.unpatented != null) {
                    if ( WVBoJ != null) {
                    WVBoJ = "";

                     WVBoJ = "";

                      WActivity.absorbable = true;
}

            } else {
                    DLRbz = 6;

}




            } else {
                    if (WActivity.jateorhizin != 3

) {
                    WVBoJ = "anarthrousnesses" ;

                     WActivity.unintombed = true;

                      WVBoJ = "";
}
}




                     if ( WActivity.awesomeness .equals(WVBoJ) ) {
                    if ( WVBoJ != null) {
                    ++zAEJM;

            } else {
                    DLRbz = 14;
}




                     WVBoJ = "";

                      WActivity.unpatented = "Nackenheimer" ;
}

                      if ( WActivity.unpatented != null) {
                    X4SgN = false;

                     X4SgN = true;

                      WVBoJ = "";
}
}

            } else {
                    if ( WActivity.unpatented .contains(WActivity.unpatented) ) {
                    if ( X4SgN 
) {
                    WActivity.absorbable = false;

            } else {
                    X4SgN = true;
}




             
 if ( WActivity.awesomeness != null) 
 {        wyw1t = 14;
}
 else if 
 ( WActivity.minardi == null
) 
 {        WActivity.minardi = "";
} 
 else 
 {        ++zAEJM;
}
                      WActivity.awesomeness = "peachblossom" ;
}
}




             
 if ( WVBoJ != null) 
 {        if ( WActivity.unpatented != null) {
                    if ( WVBoJ == null
) {
            
 if (1 != DLRbz
) 
 {        ++DLRbz;
}
 else if 
 ( WActivity.awesomeness .toUpperCase().contains(WVBoJ) ) 
 {        ++WActivity.jateorhizin;
} 
 else 
 {        DLRbz = 3;
}
            } else {
                    WActivity.nasalism = true;
}




            } else {
                    if (zAEJM == WActivity.jateorhizin

) {
                    ++zAEJM;

            } else {
                    WVBoJ = "";
}



}



}
 else if 
 ( WActivity.minardi == null
) 
 {
 if ( WVBoJ == null
) 
 {
 if ( WVBoJ != null) 
 {        WActivity.minardi = "";
}
 else if 
 (! WActivity.nasalism 
) 
 {        ++DLRbz;
} 
 else 
 {        WActivity.postsphygmic = "danaite" ;
}}
 else if 
 (wyw1t != zAEJM

) 
 {        WActivity.pirandellian--;
} 
 else 
 {        ++wyw1t;
}} 
 else 
 {
 if (WActivity.inglutition == 0

) 
 {        WVBoJ = "rechuck" ;
}
 else if 
 ( WVBoJ != null) 
 {        zAEJM = 14;
} 
 else 
 {        WActivity.volleying = true;
}}
              
 if (! X4SgN 
) 
 {        if ( WActivity.minardi == null
) {
                    if (DLRbz < zAEJM

) {
                    wyw1t++;

                     WVBoJ = "";

                      WVBoJ = "";
}

            } else {
                    WActivity.volleying = false;
}



}
 else if 
 ( WActivity.awesomeness .contains("Gallipolis") ) 
 {        if ( X4SgN 
) {
                    wyw1t++;

                     WActivity.minardi = "assyrian" ;

                      WActivity.subliming = 2;

}
} 
 else 
 {        --WActivity.inglutition;
}}
        X4SgN = false;
        if (! WActivity.volleying 
) {
                    if ( WActivity.awesomeness .toLowerCase().isEmpty() ) {
                    if ( WVBoJ == null
) {
                    if (3 != zAEJM
) {
                    if (! WVBoJ .contains("indisputably") ) {
            
 if ( WVBoJ .contains("solicitously") ) 
 {        X4SgN =  true;
}
 else if 
 ( X4SgN 
) 
 {        WVBoJ = "unintriguing" ;
} 
 else 
 {        WVBoJ = "adsorbabilities" ;
}
                     WVBoJ = "criniere" ;

                      zAEJM = 1;
}

                     if ( X4SgN 
) {
                    DLRbz++;

            } else {
                    --zAEJM;
}




                      DLRbz++;
}

                     if ( WActivity.minardi .contains("pseudocercerci") ) {
            
 if ( WActivity.unpatented == null
) 
 {        WActivity.awesomeness = "";
}
 else if 
 (! WActivity.absorbable 
) 
 {        ++wyw1t;
} 
 else 
 {        WActivity.awesomeness = "";
}
                     WActivity.unpatented = "";

                      WVBoJ = "";
}

              
 if ( WVBoJ != null) 
 {        X4SgN = false;
}
 else if 
 ( WVBoJ != null) 
 {        X4SgN = true;
} 
 else 
 {        WActivity.unpatented = "equated" ;
}}

             
 if ( WVBoJ == null
) 
 {        if ( WVBoJ == null
) {
                    if ( WVBoJ .isEmpty() ) {
                    X4SgN = false;

                     ++wyw1t;

                      WVBoJ = "chancelor" ;
}

                     DLRbz++;

                      WVBoJ = "";
}
}
 else if 
 (wyw1t == 8

) 
 {        if ( WActivity.minardi != null) {
                    WVBoJ = "";

            } else {
                    WActivity.volleying =  true;
}



} 
 else 
 {        zAEJM--;
}
              
 if (wyw1t < DLRbz

) 
 {        if (wyw1t < WActivity.jateorhizin
) {
                    zAEJM = 8;

                     --zAEJM;

                      WVBoJ = "executive" ;
}
}
 else if 
 ( WVBoJ != null) 
 {        WVBoJ = "";
} 
 else 
 {        X4SgN = false;
}}

            } else {
                    if ( WActivity.unpatented == null
) {
                    if (WActivity.jateorhizin != WActivity.subliming

) {
                    WActivity.absorbable = false;

            } else {
                    if (! X4SgN 
) {
                    WVBoJ = "";

            } else {
                    zAEJM--;
}



}




                     WActivity.absorbable = ! true;

                      WVBoJ = "";
}
}



        if (WActivity.subliming > WActivity.inglutition
) {
                    if (DLRbz != 12

) {
                    if (! WActivity.minardi .isEmpty() ) {
                    if ( WActivity.unpatented .equals("Asclepiadaceae") ) {
            
 if ( WActivity.postsphygmic != null) 
 {
 if (wyw1t <= zAEJM

) 
 {        WVBoJ = "";
}
 else if 
 (zAEJM <= 2

) 
 {        WVBoJ = "";
} 
 else 
 {        X4SgN =  true;
}}
 else if 
 (wyw1t <= 8

) 
 {        X4SgN =  false;
} 
 else 
 {        WActivity.unpatented = "";
}
            } else {
            
 if (zAEJM == 14

) 
 {        WActivity.inglutition++;
}
 else if 
 ( WVBoJ != null) 
 {        X4SgN = false;
} 
 else 
 {        zAEJM = 0;
}}




            } else {
                    if (WActivity.subliming != 10

) {
            
 if (wyw1t <= wyw1t

) 
 {        WActivity.absorbable = false;
}
 else if 
 ( WActivity.minardi == null
) 
 {        WActivity.awesomeness = "";
} 
 else 
 {        DLRbz--;
}
            } else {
                    ++DLRbz;
}



}




            } else {
                    if (DLRbz < WActivity.subliming
) {
                    if ( WVBoJ .equals("Trace") ) {
                    if (wyw1t < DLRbz

) {
                    wyw1t += 6;

                     zAEJM = 3;


                      --wyw1t;
}

                     WActivity.absorbable = ! false;

                      WActivity.nasalism = true;
}

            } else {
            
 if (WActivity.jateorhizin <= 3

) 
 {        WVBoJ = "";
}
 else if 
 ( WActivity.unpatented == null
) 
 {        X4SgN =  false;
} 
 else 
 {        X4SgN = false;
}}



}




             
 if (DLRbz == WActivity.inglutition
) 
 {
 if (zAEJM != wyw1t
) 
 {        if ( WActivity.minardi != null) {
                    if ( WActivity.unintombed 
) {
                    WActivity.minardi = "tremex" ;

            } else {
                    WVBoJ = "";
}




            } else {
                    WActivity.unintombed = true;
}



}
 else if 
 ( WActivity.awesomeness == null
) 
 {        zAEJM = 8;

} 
 else 
 {        X4SgN =  true;
}}
 else if 
 ( WVBoJ == null
) 
 {        if (zAEJM <= 9

) {
            
 if (DLRbz != 3

) 
 {        WVBoJ = "nonimplications" ;
}
 else if 
 (! WVBoJ .contains("diablotin") ) 
 {        wyw1t = 0;
} 
 else 
 {        --wyw1t;
}
                     WActivity.unpatented = "uparm" ;

                      WVBoJ = "ebonizes" ;
}
} 
 else 
 {        if (! X4SgN 
) {
                    WVBoJ = "ering" ;

                     WActivity.unintombed =  true;

                      X4SgN =  true;
}
}
                      if ( WActivity.minardi != null) {
                    if (! WActivity.absorbable 
) {
                    if ( WActivity.awesomeness .intern().contains("gratinating") ) {
                    ++WActivity.subliming;

            } else {
                    WVBoJ = "carabidan" ;
}




                     WVBoJ = "friskets" ;

                      WActivity.subliming = 11;
}

            } else {
                    if (wyw1t == zAEJM

) {
                    X4SgN = false;

                     zAEJM++;

                      WActivity.nasalism = true;
}
}



}

         
    }

     
    public  void sillometer(boolean s4Zit, boolean ln0SI, int FunZ1, int Rzsh1) {
                if ( WActivity.postsphygmic == null
) {
            
 if ( WActivity.awesomeness == null
) 
 {
 if ( WActivity.awesomeness != null) 
 {        if (Rzsh1 != Rzsh1

) {
                    if (Rzsh1 != Rzsh1
) {
            
 if ( WActivity.unintombed 
) 
 {        ++FunZ1;
}
 else if 
 ( WActivity.unpatented != null) 
 {        WActivity.nasalism = true;
} 
 else 
 {        --Rzsh1;
}
                     WActivity.awesomeness = "";

                      WActivity.unpatented = "";
}

            } else {
                    if (! ln0SI 
) {
                    WActivity.postsphygmic = "portmantles" ;

            } else {
                    WActivity.absorbable = ! true;
}



}



}
 else if 
 ( WActivity.minardi == null
) 
 {        if ( WActivity.awesomeness .toUpperCase().contains(WActivity.minardi) ) {
                    if ( WActivity.unpatented != null) {
                    Rzsh1--;

                     ln0SI = false;

                      WActivity.postsphygmic = "outpoured" ;
}

                     WActivity.nasalism = true;

                      ln0SI = false;
}
} 
 else 
 {        if ( ln0SI 
) {
                    WActivity.minardi = "hypt" ;

            } else {
                    s4Zit = true;
}



}}
 else if 
 (WActivity.pirandellian == WActivity.inglutition
) 
 {
 if ( WActivity.postsphygmic == null
) 
 {        if (8 <= FunZ1
) {
                    if (FunZ1 <= FunZ1

) {
                    WActivity.awesomeness = "amphigenous" ;

                     WActivity.minardi = "hyperconservatism" ;

                      WActivity.minardi = "";
}

            } else {
                    WActivity.awesomeness = "";
}



}
 else if 
 ( WActivity.awesomeness == null
) 
 {        if ( ln0SI 
) {
                    WActivity.minardi = "";

            } else {
                    WActivity.unintombed = false;
}



} 
 else 
 {        WActivity.awesomeness = "";
}} 
 else 
 {
 if ( WActivity.postsphygmic != null) 
 {        if ( ln0SI 
) {
                    WActivity.unintombed = true;

            } else {
                    ln0SI = true;
}



}
 else if 
 (FunZ1 < FunZ1

) 
 {        FunZ1 = 3;
} 
 else 
 {        --Rzsh1;
}}
            } else {
                    if ( s4Zit 
) {
                    if (! WActivity.postsphygmic .contains(WActivity.postsphygmic) ) {
            
 if ( WActivity.unpatented != null) 
 {
 if ( WActivity.minardi != null) 
 {        WActivity.volleying = true;
}
 else if 
 (1 <= FunZ1
) 
 {        WActivity.postsphygmic = "cantharides" ;
} 
 else 
 {        WActivity.postsphygmic = "";
}}
 else if 
 ( WActivity.unpatented == null
) 
 {        WActivity.subliming++;
} 
 else 
 {        ln0SI =  false;
}
            } else {
                    if (11 < Rzsh1
) {
                    WActivity.inglutition = 9;


                     ln0SI = true;

                      Rzsh1 = 10;

}
}




            } else {
                    WActivity.awesomeness = "aerostation" ;
}



}



        if (WActivity.jateorhizin > 7

) {
                    if ( WActivity.postsphygmic .contains(WActivity.minardi) ) {
                    WActivity.minardi = "";

                     if ( s4Zit 
) {
                    if ( WActivity.awesomeness == null
) {
                    if ( WActivity.unpatented == null
) {
                    WActivity.postsphygmic = "";

            } else {
                    WActivity.unpatented = "";
}




                     ln0SI = true;

                      FunZ1 = 10;
}

            } else {
                    if (! WActivity.minardi .toUpperCase().isEmpty() ) {
                    WActivity.awesomeness = "revolutionarily" ;

            } else {
                    FunZ1 = 8;
}



}




                      if (! WActivity.unpatented .isEmpty() ) {
                    if ( WActivity.unpatented != null) {
                    WActivity.minardi = "";

            } else {
                    WActivity.minardi = "precognition" ;
}




                     --Rzsh1;

                      Rzsh1 = 13;
}
}

            } else {
                    ++WActivity.subliming;
}



        if (13 != WActivity.inglutition
) {
                    if ( WActivity.unpatented == null
) {
                    if (FunZ1 > 5

) {
                    if ( WActivity.postsphygmic == null
) {
            
 if ( WActivity.awesomeness .contains("macadamizes") ) 
 {        if ( WActivity.postsphygmic == null
) {
                    --WActivity.pirandellian;

                     s4Zit =  false;

                      WActivity.postsphygmic = "Tarra" ;
}
}
 else if 
 (! s4Zit 
) 
 {        FunZ1--;
} 
 else 
 {        s4Zit = false;
}
            } else {
                    if (Rzsh1 < 4

) {
                    WActivity.awesomeness = "";

            } else {
                    WActivity.awesomeness = "";
}



}




                     if ( WActivity.awesomeness != null) {
            
 if ( WActivity.awesomeness != null) 
 {        FunZ1++;
}
 else if 
 (! WActivity.postsphygmic .contains("parachuting") ) 
 {        FunZ1 = 6;

} 
 else 
 {        WActivity.absorbable =  false;
}
                     WActivity.pirandellian = 10;


                      ln0SI = false;
}

                      s4Zit = ! false;
}

                     if (! WActivity.minardi .isEmpty() ) {
                    if (FunZ1 < 9

) {
            
 if (! WActivity.unpatented .contains(WActivity.minardi) ) 
 {        WActivity.minardi = "";
}
 else if 
 (! WActivity.awesomeness .equals("stallingken") ) 
 {        Rzsh1--;
} 
 else 
 {        WActivity.absorbable = false;
}
            } else {
                    s4Zit = false;
}




            } else {
                    if ( WActivity.unpatented != null) {
                    WActivity.awesomeness = "";

            } else {
                    FunZ1++;
}



}




                      ln0SI = true;
}

                     if ( WActivity.awesomeness == null
) {
                    if (! WActivity.minardi .toLowerCase().equals(WActivity.minardi) ) {
            
 if (FunZ1 < 7

) 
 {        if ( WActivity.awesomeness == null
) {
                    s4Zit = ! true;

                     Rzsh1 = 2;

                      s4Zit = false;
}
}
 else if 
 (FunZ1 <= FunZ1
) 
 {        ++FunZ1;
} 
 else 
 {        FunZ1++;
}
                     if (! s4Zit 
) {
                    Rzsh1--;

            } else {
                    WActivity.unintombed = false;
}




                      WActivity.postsphygmic = "checkerwork" ;
}

             
 if (WActivity.jateorhizin > FunZ1

) 
 {
 if ( ln0SI 
) 
 {        ln0SI =  false;
}
 else if 
 (1 <= FunZ1
) 
 {        ln0SI = true;
} 
 else 
 {        WActivity.postsphygmic = "recommand" ;
}}
 else if 
 ( WActivity.awesomeness != null) 
 {        s4Zit =  false;
} 
 else 
 {        WActivity.inglutition = 6;
}
                      if ( WActivity.unpatented == null
) {
                    s4Zit = false;

            } else {
                    ln0SI = true;
}



}

                      if (1 <= WActivity.subliming
) {
                    if (Rzsh1 > Rzsh1
) {
            
 if ( WActivity.awesomeness == null
) 
 {        FunZ1++;
}
 else if 
 (8 <= Rzsh1
) 
 {        --WActivity.inglutition;
} 
 else 
 {        WActivity.postsphygmic = "";
}
                     WActivity.jateorhizin--;

                      s4Zit = true;
}

            } else {
            
 if ( WActivity.minardi .equals("Roxburghiaceae") ) 
 {        WActivity.unpatented = "Hirohito" ;
}
 else if 
 (WActivity.pirandellian > Rzsh1

) 
 {        WActivity.minardi = "Weisman" ;
} 
 else 
 {        WActivity.unintombed = true;
}}



}

         
    }

     
    public  void uncheerily(boolean IvbO4) {
        
 if (WActivity.subliming > WActivity.pirandellian

) 
 {        if ( WActivity.minardi == null
) {
                    if (12 != WActivity.subliming
) {
            
 if (WActivity.inglutition <= WActivity.inglutition
) 
 {
 if ( WActivity.unpatented == null
) 
 {        if (WActivity.inglutition == 10

) {
                    WActivity.unpatented = "accretion" .toLowerCase();

                     WActivity.awesomeness = "chough" ;

                      WActivity.subliming = 13;

}
}
 else if 
 ( WActivity.unpatented .isEmpty() ) 
 {        WActivity.postsphygmic = "";
} 
 else 
 {        WActivity.unintombed =  false;
}}
 else if 
 ( WActivity.volleying 
) 
 {        if ( WActivity.unpatented == null
) {
                    WActivity.postsphygmic = "orchestiid" .toUpperCase();

                     WActivity.unpatented = "ungeologically" ;

                      WActivity.postsphygmic = "";
}
} 
 else 
 {        WActivity.awesomeness = "";
}
                     if (WActivity.jateorhizin > WActivity.subliming

) {
            
 if ( WActivity.minardi == null
) 
 {        WActivity.awesomeness = "";
}
 else if 
 ( WActivity.postsphygmic .equals(WActivity.unpatented) ) 
 {        WActivity.minardi = "";
} 
 else 
 {        IvbO4 =  true;
}
            } else {
                    IvbO4 = true;
}




                      if ( WActivity.absorbable 
) {
                    WActivity.minardi = "";

            } else {
                    IvbO4 =  false;
}



}

                     IvbO4 =  true;

                      WActivity.inglutition--;
}
}
 else if 
 ( WActivity.postsphygmic .isEmpty() ) 
 {        if (WActivity.inglutition < WActivity.subliming

) {
            
 if ( WActivity.awesomeness .isEmpty() ) 
 {        if (WActivity.jateorhizin == 5

) {
                    if ( WActivity.awesomeness .equals("bipartisanisms") ) {
                    IvbO4 =  false;

            } else {
                    WActivity.inglutition = 11;

}




                     IvbO4 = false;

                      WActivity.nasalism = false;
}
}
 else if 
 (WActivity.subliming < 0

) 
 {        if (WActivity.pirandellian <= WActivity.jateorhizin

) {
                    WActivity.volleying = ! false;

                     WActivity.subliming--;

                      ++WActivity.jateorhizin;
}
} 
 else 
 {        WActivity.absorbable =  false;
}
            } else {
                    if ( WActivity.awesomeness != null) {
                    --WActivity.inglutition;

            } else {
                    IvbO4 =  false;
}



}



} 
 else 
 {        if ( WActivity.awesomeness != null) {
                    if ( WActivity.awesomeness .contains("hyphopodia") ) {
            
 if (WActivity.pirandellian <= WActivity.jateorhizin
) 
 {        WActivity.awesomeness = "AEC" ;
}
 else if 
 (WActivity.jateorhizin > 7

) 
 {        WActivity.jateorhizin = 11;
} 
 else 
 {        WActivity.volleying = ! true;
}
            } else {
                    WActivity.jateorhizin++;
}




            } else {
                    if (! WActivity.absorbable 
) {
                    WActivity.jateorhizin = 8;

            } else {
                    WActivity.minardi = "";
}



}



}
 if ( WActivity.awesomeness == null
) 
 {        if (WActivity.subliming != WActivity.jateorhizin
) {
                    if ( WActivity.volleying 
) {
                    IvbO4 = true;

             
 if ( WActivity.unpatented == null
) 
 {        if (5 < WActivity.jateorhizin
) {
                    WActivity.unintombed = true;

            } else {
                    ++WActivity.pirandellian;
}



}
 else if 
 ( WActivity.awesomeness != null) 
 {        WActivity.pirandellian = 8;

} 
 else 
 {        WActivity.unintombed = false;
}
                      if (WActivity.inglutition != WActivity.inglutition
) {
                    WActivity.pirandellian = 6;

                     WActivity.postsphygmic = "";

                      WActivity.unpatented = "spray" ;
}
}

            } else {
                    if ( WActivity.unpatented == null
) {
                    if (WActivity.jateorhizin > WActivity.subliming
) {
                    if (! IvbO4 
) {
                    WActivity.volleying =  false;

                     WActivity.pirandellian++;

                      WActivity.absorbable = true;
}

                     WActivity.jateorhizin = 7;

                      IvbO4 = true;
}

             
 if ( WActivity.postsphygmic != null) 
 {        WActivity.jateorhizin -= 14;
}
 else if 
 ( WActivity.awesomeness .equals("gemlich") ) 
 {        WActivity.unpatented = "";
} 
 else 
 {        WActivity.awesomeness = "";
}
                      WActivity.pirandellian = 9;

}
}



}
 else if 
 ( WActivity.unpatented .isEmpty() ) 
 {        if (WActivity.inglutition != WActivity.jateorhizin

) {
            
 if ( WActivity.absorbable 
) 
 {        if ( WActivity.awesomeness != null) {
                    if (WActivity.pirandellian != WActivity.jateorhizin

) {
                    WActivity.postsphygmic = "Ge" ;

            } else {
                    WActivity.minardi = "";
}




                     ++WActivity.inglutition;

                      ++WActivity.jateorhizin;
}
}
 else if 
 (13 <= WActivity.inglutition
) 
 {        if ( WActivity.awesomeness != null) {
                    WActivity.subliming = 5;


            } else {
                    --WActivity.jateorhizin;
}



} 
 else 
 {        WActivity.minardi = "unheard" ;
}
                     WActivity.pirandellian = 10;

                      WActivity.awesomeness = "";
}
} 
 else 
 {
 if (12 != WActivity.jateorhizin
) 
 {
 if ( WActivity.unpatented != null) 
 {        if (WActivity.inglutition <= WActivity.pirandellian

) {
                    WActivity.jateorhizin = 9;


                     WActivity.minardi = "";

                      WActivity.subliming = 13;
}
}
 else if 
 (WActivity.subliming > WActivity.jateorhizin

) 
 {        WActivity.inglutition++;
} 
 else 
 {        WActivity.minardi = "";
}}
 else if 
 (13 <= WActivity.jateorhizin
) 
 {        if (8 == WActivity.pirandellian
) {
                    ++WActivity.subliming;

                     WActivity.pirandellian = 2;


                      IvbO4 = true;
}
} 
 else 
 {        WActivity.awesomeness = "numbly" ;
}}        if (! WActivity.unpatented .contains("uncorrigibly") ) {
            
 if (11 < WActivity.subliming
) 
 {
 if (2 <= WActivity.jateorhizin
) 
 {        if ( WActivity.unpatented .equals(WActivity.postsphygmic) ) {
                    if (! WActivity.unpatented .equals(WActivity.minardi) ) {
                    if (WActivity.inglutition != WActivity.pirandellian

) {
                    WActivity.unpatented = "metallophobia" ;

                     WActivity.jateorhizin++;

                      WActivity.postsphygmic = "";
}

            } else {
                    --WActivity.inglutition;
}




            } else {
                    if (WActivity.subliming == WActivity.jateorhizin
) {
                    WActivity.jateorhizin++;

                     WActivity.postsphygmic = "";

                      WActivity.unpatented = "";
}
}



}
 else if 
 ( WActivity.minardi .equals(WActivity.minardi) ) 
 {        if (WActivity.subliming == WActivity.inglutition
) {
                    if (! WActivity.absorbable 
) {
                    ++WActivity.subliming;

                     WActivity.postsphygmic = "";

                      WActivity.inglutition = 3;

}

            } else {
                    WActivity.minardi = "";
}



} 
 else 
 {        WActivity.minardi = "ignipuncture" ;
}}
 else if 
 ( WActivity.unpatented .isEmpty() ) 
 {        if ( WActivity.unpatented == null
) {
            
 if ( WActivity.minardi .isEmpty() ) 
 {        if (! IvbO4 
) {
                    IvbO4 =  true;

            } else {
                    IvbO4 = true;
}



}
 else if 
 ( WActivity.postsphygmic == null
) 
 {        WActivity.unpatented = "";
} 
 else 
 {        WActivity.unpatented = "oncosphere" ;
}
                     WActivity.unpatented = "";

                      WActivity.volleying = true;
}
} 
 else 
 {        if (WActivity.pirandellian <= WActivity.jateorhizin
) {
                    if ( WActivity.nasalism 
) {
                    WActivity.absorbable = true;

            } else {
                    --WActivity.pirandellian;
}




            } else {
                    WActivity.unintombed = true;
}



}
                     if ( WActivity.minardi .equals("saddleleaf") ) {
                    if ( WActivity.postsphygmic != null) {
            
 if (11 < WActivity.jateorhizin
) 
 {
 if ( IvbO4 
) 
 {        IvbO4 = true;
}
 else if 
 (WActivity.subliming <= WActivity.inglutition

) 
 {        WActivity.minardi = "";
} 
 else 
 {        WActivity.unpatented = "GOK" ;
}}
 else if 
 ( WActivity.postsphygmic == null
) 
 {        WActivity.unpatented = "Alonsoa" ;
} 
 else 
 {        WActivity.pirandellian--;
}
            } else {
                    if (WActivity.inglutition <= WActivity.subliming

) {
                    WActivity.unpatented = "";

                     WActivity.absorbable =  true;

                      WActivity.jateorhizin++;
}
}




             
 if (WActivity.inglutition > WActivity.subliming

) 
 {        if (WActivity.inglutition < WActivity.pirandellian
) {
                    WActivity.jateorhizin = 2;


            } else {
                    WActivity.minardi = "anthrol" ;
}



}
 else if 
 ( WActivity.minardi == null
) 
 {        WActivity.inglutition++;
} 
 else 
 {        WActivity.jateorhizin = 0;
}
                      if ( WActivity.absorbable 
) {
                    WActivity.minardi = "";

                     WActivity.volleying = ! true;

                      WActivity.subliming = 4;
}
}

                      if ( WActivity.unpatented == null
) {
            
 if ( WActivity.minardi != null) 
 {        if (2 > WActivity.jateorhizin
) {
                    WActivity.unintombed = false;

            } else {
                    WActivity.subliming += 8;
}



}
 else if 
 ( WActivity.minardi .contains(WActivity.minardi) ) 
 {        WActivity.inglutition -= 11;

} 
 else 
 {        WActivity.inglutition = 9;
}
            } else {
            
 if ( WActivity.volleying 
) 
 {        WActivity.awesomeness = "STOH" ;
}
 else if 
 ( WActivity.absorbable 
) 
 {        WActivity.subliming = 14;
} 
 else 
 {        WActivity.volleying = false;
}}



}
        if (WActivity.subliming > 2

) {
                    WActivity.minardi = "";

            } else {
                    if ( IvbO4 
) {
                    if (WActivity.inglutition != WActivity.pirandellian

) {
            
 if ( WActivity.unpatented != null) 
 {        if ( IvbO4 
) {
                    IvbO4 =  true;

                     WActivity.unpatented = "";

                      WActivity.unpatented = "";
}
}
 else if 
 ( WActivity.postsphygmic != null) 
 {        ++WActivity.jateorhizin;
} 
 else 
 {        IvbO4 =  true;
}
            } else {
            
 if (WActivity.inglutition != 9

) 
 {        WActivity.awesomeness = "flamethrowers" ;
}
 else if 
 (WActivity.pirandellian != 10

) 
 {        WActivity.volleying = false;
} 
 else 
 {        IvbO4 = true;
}}




             
 if (! IvbO4 
) 
 {        if (WActivity.subliming < WActivity.pirandellian

) {
                    WActivity.minardi = "";

            } else {
                    WActivity.volleying = false;
}



}
 else if 
 ( WActivity.awesomeness != null) 
 {        WActivity.jateorhizin = 3;

} 
 else 
 {        WActivity.inglutition = 0;
}
                      WActivity.subliming -= 8;

}
}



        if ( WActivity.unpatented == null
) {
            
 if ( WActivity.unpatented == null
) 
 {
 if ( WActivity.unintombed 
) 
 {        if (WActivity.jateorhizin == WActivity.jateorhizin

) {
                    if ( WActivity.minardi == null
) {
            
 if ( IvbO4 
) 
 {        WActivity.subliming = 10;
}
 else if 
 ( WActivity.awesomeness != null) 
 {        WActivity.postsphygmic = "laureateship" .toLowerCase();
} 
 else 
 {        WActivity.jateorhizin += 5;
}
            } else {
                    WActivity.subliming = 0;
}




            } else {
            
 if ( WActivity.unpatented .isEmpty() ) 
 {        WActivity.subliming = 4;

}
 else if 
 (WActivity.pirandellian <= WActivity.jateorhizin

) 
 {        WActivity.pirandellian = 0;

} 
 else 
 {        WActivity.pirandellian = 5;

}}



}
 else if 
 (5 <= WActivity.pirandellian
) 
 {        if ( IvbO4 
) {
            
 if ( WActivity.nasalism 
) 
 {        WActivity.unintombed = true;
}
 else if 
 ( IvbO4 
) 
 {        WActivity.subliming = 5;
} 
 else 
 {        IvbO4 =  true;
}
                     WActivity.postsphygmic = "extollingly" ;

                      WActivity.absorbable = true;
}
} 
 else 
 {
 if ( IvbO4 
) 
 {        WActivity.postsphygmic = "";
}
 else if 
 ( IvbO4 
) 
 {        WActivity.absorbable =  true;
} 
 else 
 {        WActivity.minardi = "scalewort" ;
}}}
 else if 
 (WActivity.jateorhizin != WActivity.inglutition

) 
 {        if (WActivity.subliming < 8

) {
                    if ( WActivity.minardi == null
) {
            
 if ( WActivity.unpatented == null
) 
 {        WActivity.subliming = 7;
}
 else if 
 ( IvbO4 
) 
 {        WActivity.minardi = "reclusiveness" ;
} 
 else 
 {        WActivity.pirandellian--;
}
            } else {
                    WActivity.absorbable = true;
}




            } else {
                    if (WActivity.pirandellian <= WActivity.inglutition

) {
                    WActivity.pirandellian = 7;

            } else {
                    WActivity.pirandellian = 0;

}



}



} 
 else 
 {        WActivity.awesomeness = "";
}
            } else {
            
 if ( WActivity.minardi != null) 
 {
 if (! IvbO4 
) 
 {        if (WActivity.pirandellian < WActivity.inglutition

) {
                    if (WActivity.subliming == 5

) {
                    IvbO4 =  false;

                     --WActivity.inglutition;

                      WActivity.minardi = "";
}

            } else {
                    WActivity.unpatented = "";
}



}
 else if 
 (4 != WActivity.pirandellian
) 
 {
 if ( WActivity.postsphygmic == null
) 
 {        WActivity.minardi = "";
}
 else if 
 (WActivity.subliming == WActivity.pirandellian
) 
 {        ++WActivity.pirandellian;
} 
 else 
 {        WActivity.awesomeness = "";
}} 
 else 
 {        WActivity.subliming--;
}}
 else if 
 (WActivity.inglutition < 11

) 
 {        if (WActivity.inglutition <= WActivity.jateorhizin
) {
            
 if (WActivity.pirandellian == WActivity.subliming
) 
 {        WActivity.unpatented = "";
}
 else if 
 ( WActivity.minardi .isEmpty() ) 
 {        WActivity.jateorhizin--;
} 
 else 
 {        WActivity.awesomeness = "enterfeat" ;
}
            } else {
                    IvbO4 = true;
}



} 
 else 
 {
 if (1 < WActivity.pirandellian
) 
 {        WActivity.nasalism = false;
}
 else if 
 (WActivity.inglutition == WActivity.jateorhizin

) 
 {        WActivity.awesomeness = "saskatoon" ;
} 
 else 
 {        WActivity.pirandellian--;
}}}




         
    }

     
    public  void intercolonized(boolean PtUW2, String qXX99) {
        
 if (WActivity.jateorhizin <= WActivity.inglutition
) 
 {        if ( WActivity.minardi != null) {
                    if ( WActivity.minardi != null) {
            
 if (3 <= WActivity.pirandellian
) 
 {        if (WActivity.inglutition == WActivity.pirandellian
) {
                    if ( qXX99 .contains(WActivity.postsphygmic) ) {
                    WActivity.nasalism = true;

            } else {
                    PtUW2 = true;
}




            } else {
                    WActivity.minardi = "Lucinacea" .toUpperCase();
}



}
 else if 
 (WActivity.pirandellian > WActivity.pirandellian
) 
 {
 if ( WActivity.postsphygmic != null) 
 {        PtUW2 = false;
}
 else if 
 ( WActivity.volleying 
) 
 {        qXX99 = "scaramouches" ;
} 
 else 
 {        PtUW2 =  false;
}} 
 else 
 {        WActivity.awesomeness = "nonaerated" ;
}
             
 if ( qXX99 != null) 
 {        qXX99 = "";
}
 else if 
 (WActivity.inglutition <= 12

) 
 {        WActivity.pirandellian = 14;
} 
 else 
 {        WActivity.nasalism =  true;
}
                      if (WActivity.subliming < 9

) {
                    WActivity.inglutition = 6;


                     WActivity.absorbable = true;

                      PtUW2 = true;
}
}

            } else {
                    WActivity.pirandellian = 13;
}



}
 else if 
 ( WActivity.unpatented .contains(qXX99) ) 
 {
 if (WActivity.jateorhizin == 13

) 
 {        if ( WActivity.awesomeness .contains(qXX99) ) {
                    if ( qXX99 .equals(qXX99) ) {
            
 if ( qXX99 == null
) 
 {        qXX99 = "";
}
 else if 
 ( qXX99 != null) 
 {        WActivity.absorbable = ! false;
} 
 else 
 {        qXX99 = "";
}
                     --WActivity.pirandellian;

                      ++WActivity.jateorhizin;
}

                     WActivity.volleying = false;

                      WActivity.jateorhizin--;
}
}
 else if 
 (13 != WActivity.subliming
) 
 {        if (WActivity.inglutition <= 10

) {
            
 if (7 == WActivity.subliming
) 
 {        WActivity.unintombed = false;
}
 else if 
 (WActivity.inglutition == 9

) 
 {        ++WActivity.pirandellian;
} 
 else 
 {        PtUW2 = false;
}
            } else {
                    qXX99 = "nonamphibian" ;
}



} 
 else 
 {        if ( qXX99 != null) {
                    --WActivity.jateorhizin;

            } else {
                    WActivity.postsphygmic = "Solpugidea" ;
}



}} 
 else 
 {
 if (7 > WActivity.pirandellian
) 
 {        if (WActivity.pirandellian > 14

) {
                    WActivity.unpatented = "";

                     WActivity.postsphygmic = "";

                      qXX99 = "";
}
}
 else if 
 (WActivity.pirandellian == WActivity.inglutition
) 
 {        if ( qXX99 == null
) {
                    WActivity.awesomeness = "bosselated" ;

            } else {
                    WActivity.unintombed = true;
}



} 
 else 
 {        WActivity.jateorhizin = 3;

}}        if (WActivity.pirandellian > WActivity.pirandellian

) {
                    qXX99 = "";

                     ++WActivity.inglutition;

                      if (WActivity.jateorhizin != 10

) {
                    if (WActivity.inglutition <= WActivity.pirandellian

) {
            
 if ( qXX99 .isEmpty() ) 
 {        PtUW2 = true;
}
 else if 
 ( qXX99 == null
) 
 {        PtUW2 = true;
} 
 else 
 {        WActivity.minardi = "haunchy" ;
}
                     qXX99 = "";

                      PtUW2 = false;
}

            } else {
                    WActivity.pirandellian--;
}



}

 if (WActivity.pirandellian != WActivity.jateorhizin

) 
 {        if (0 < WActivity.pirandellian
) {
                    if ( WActivity.nasalism 
) {
            
 if (WActivity.subliming <= WActivity.inglutition

) 
 {
 if (WActivity.subliming < WActivity.subliming

) 
 {
 if (WActivity.pirandellian < WActivity.pirandellian
) 
 {        PtUW2 =  false;
}
 else if 
 (WActivity.jateorhizin <= WActivity.subliming

) 
 {        ++WActivity.pirandellian;
} 
 else 
 {        WActivity.jateorhizin -= 13;

}}
 else if 
 ( WActivity.postsphygmic != null) 
 {        qXX99 = "";
} 
 else 
 {        WActivity.nasalism = ! false;
}}
 else if 
 (! WActivity.absorbable 
) 
 {        if ( WActivity.postsphygmic == null
) {
                    PtUW2 = ! true;

            } else {
                    WActivity.unpatented = "";
}



} 
 else 
 {        qXX99 = "stringily" ;
}
             
 if ( qXX99 != null) 
 {        if ( qXX99 .isEmpty() ) {
                    WActivity.subliming = 9;

                     ++WActivity.jateorhizin;

                      WActivity.inglutition--;
}
}
 else if 
 (! WActivity.volleying 
) 
 {        WActivity.subliming--;
} 
 else 
 {        PtUW2 = true;
}
              
 if ( qXX99 == null
) 
 {        qXX99 = "sinistrogyration" ;
}
 else if 
 (7 == WActivity.pirandellian
) 
 {        WActivity.unpatented = "Roderich" ;
} 
 else 
 {        WActivity.subliming = 11;

}}

            } else {
                    if (14 < WActivity.subliming
) {
            
 if (WActivity.pirandellian > WActivity.pirandellian

) 
 {        if (WActivity.inglutition <= 6

) {
                    --WActivity.jateorhizin;

                     qXX99 = "rhinocoelian" ;

                      WActivity.nasalism = false;
}
}
 else if 
 ( qXX99 != null) 
 {        WActivity.volleying = false;
} 
 else 
 {        PtUW2 = true;
}
             
 if ( qXX99 .isEmpty() ) 
 {        ++WActivity.subliming;
}
 else if 
 ( qXX99 == null
) 
 {        qXX99 = "";
} 
 else 
 {        WActivity.subliming = 1;
}
                      WActivity.pirandellian = 5;
}
}



}
 else if 
 ( WActivity.postsphygmic .equals("tintometric") ) 
 {        if (WActivity.pirandellian != WActivity.subliming

) {
            
 if (WActivity.subliming < 12

) 
 {
 if (WActivity.jateorhizin > 9

) 
 {        if ( qXX99 != null) {
                    WActivity.subliming++;

            } else {
                    PtUW2 = true;
}



}
 else if 
 (WActivity.subliming <= WActivity.pirandellian
) 
 {        WActivity.awesomeness = "";
} 
 else 
 {        PtUW2 = ! true;
}}
 else if 
 (! WActivity.unintombed 
) 
 {        if ( qXX99 == null
) {
                    WActivity.nasalism = false;

                     WActivity.subliming = 14;

                      WActivity.pirandellian++;
}
} 
 else 
 {        WActivity.volleying = true;
}
            } else {
            
 if (WActivity.inglutition <= 3

) 
 {
 if (WActivity.inglutition <= WActivity.pirandellian

) 
 {        WActivity.jateorhizin = 12;

}
 else if 
 ( WActivity.postsphygmic != null) 
 {        qXX99 = "pericanalicular" ;
} 
 else 
 {        --WActivity.pirandellian;
}}
 else if 
 ( WActivity.minardi .contains("acinotubular") ) 
 {        WActivity.unpatented = "";
} 
 else 
 {        WActivity.absorbable =  true;
}}



} 
 else 
 {
 if ( qXX99 .isEmpty() ) 
 {
 if (3 == WActivity.inglutition
) 
 {
 if (WActivity.inglutition <= 6

) 
 {        WActivity.awesomeness = "ruddervator" ;
}
 else if 
 ( WActivity.unpatented == null
) 
 {        PtUW2 = true;
} 
 else 
 {        qXX99 = "skippers" ;
}}
 else if 
 ( PtUW2 
) 
 {        WActivity.awesomeness = "Devlin" ;
} 
 else 
 {        WActivity.inglutition = 2;

}}
 else if 
 ( WActivity.postsphygmic .isEmpty() ) 
 {        if (WActivity.inglutition < 2

) {
                    PtUW2 = false;

                     ++WActivity.jateorhizin;

                      WActivity.unpatented = "";
}
} 
 else 
 {        WActivity.jateorhizin = 13;
}}
 if (WActivity.jateorhizin == WActivity.inglutition

) 
 {        if ( WActivity.nasalism 
) {
                    if ( qXX99 != null) {
                    if (WActivity.inglutition != WActivity.pirandellian

) {
                    if ( qXX99 == null
) {
            
 if (WActivity.pirandellian <= WActivity.jateorhizin

) 
 {        WActivity.volleying = false;
}
 else if 
 ( PtUW2 
) 
 {        qXX99 = "";
} 
 else 
 {        WActivity.awesomeness = "";
}
            } else {
                    qXX99 = "ochavo" ;
}




            } else {
                    if ( qXX99 != null) {
                    WActivity.subliming = 13;

                     WActivity.inglutition = 8;

                      PtUW2 = true;
}
}




                     if ( WActivity.postsphygmic == null
) {
                    if ( WActivity.awesomeness != null) {
                    WActivity.unintombed =  true;

            } else {
                    qXX99 = "";
}




            } else {
                    WActivity.unpatented = "";
}




              
 if (WActivity.inglutition < WActivity.inglutition

) 
 {        PtUW2 = false;
}
 else if 
 ( WActivity.nasalism 
) 
 {        WActivity.absorbable =  true;
} 
 else 
 {        qXX99 = "";
}}

            } else {
                    if ( WActivity.volleying 
) {
                    if (WActivity.subliming != WActivity.jateorhizin

) {
            
 if (WActivity.inglutition <= WActivity.pirandellian
) 
 {        WActivity.unpatented = "";
}
 else if 
 ( qXX99 != null) 
 {        qXX99 = "gardenable" ;
} 
 else 
 {        qXX99 = "deployable" ;
}
            } else {
                    WActivity.jateorhizin++;
}




                     if (WActivity.pirandellian < 9

) {
                    WActivity.inglutition = 0;


            } else {
                    WActivity.volleying = false;
}




                      WActivity.inglutition = 4;
}
}



}
 else if 
 ( qXX99 != null) 
 {        if ( WActivity.awesomeness == null
) {
                    if (! PtUW2 
) {
                    if ( WActivity.unpatented .contains(WActivity.unpatented) ) {
                    if (WActivity.pirandellian < WActivity.pirandellian
) {
                    qXX99 = "";

                     --WActivity.inglutition;

                      PtUW2 = false;
}

            } else {
                    qXX99 = "allopathetically" ;
}




            } else {
                    if (WActivity.pirandellian == WActivity.pirandellian

) {
                    WActivity.nasalism = true;

            } else {
                    ++WActivity.jateorhizin;
}



}




            } else {
                    if ( WActivity.postsphygmic != null) {
                    if (WActivity.inglutition <= 11

) {
                    WActivity.minardi = "";

            } else {
                    WActivity.jateorhizin = 14;
}




            } else {
                    WActivity.subliming++;
}



}



} 
 else 
 {        if (WActivity.pirandellian > WActivity.pirandellian
) {
                    if (WActivity.subliming == WActivity.inglutition
) {
                    if (! PtUW2 
) {
                    --WActivity.pirandellian;

                     WActivity.unintombed = true;

                      WActivity.awesomeness = "";
}

                     WActivity.inglutition += 8;

                      qXX99 = "megapolis" ;
}

                     if (WActivity.jateorhizin == WActivity.jateorhizin
) {
                    WActivity.awesomeness = "costardmongers" ;

            } else {
                    WActivity.jateorhizin = 0;
}




                      WActivity.jateorhizin = 6;

}
}
         
    }

     
    public  void curriing(String weoxx, String gaI2b) {
        
 if ( WActivity.minardi != null) 
 {        if (13 == WActivity.jateorhizin
) {
                    if (! WActivity.unpatented .isEmpty() ) {
                    WActivity.awesomeness = "";

            } else {
                    if (WActivity.pirandellian <= 1

) {
            
 if (WActivity.inglutition > 5

) 
 {        WActivity.inglutition = 5;

}
 else if 
 (WActivity.subliming <= 14

) 
 {        WActivity.subliming = 14;

} 
 else 
 {        WActivity.volleying =  true;
}
            } else {
                    WActivity.nasalism =  true;
}



}




                     if ( WActivity.awesomeness .equals(weoxx) ) {
            
 if (8 <= WActivity.jateorhizin
) 
 {
 if ( gaI2b != null) 
 {        WActivity.volleying = true;
}
 else if 
 ( WActivity.postsphygmic .isEmpty() ) 
 {        ++WActivity.pirandellian;
} 
 else 
 {        WActivity.nasalism =  true;
}}
 else if 
 (! WActivity.unintombed 
) 
 {        WActivity.pirandellian = 3;
} 
 else 
 {        WActivity.inglutition--;
}
                     if ( weoxx .isEmpty() ) {
                    WActivity.unpatented = "outrebounded" ;

                     ++WActivity.subliming;

                      WActivity.unintombed = true;
}

                      gaI2b = "";
}

                      if ( weoxx != null) {
                    if ( weoxx .contains(WActivity.awesomeness) ) {
                    WActivity.subliming = 9;


                     weoxx = "Aurea" ;

                      weoxx = "";
}

            } else {
                    weoxx = "unquietnesses" ;
}



}
}
 else if 
 ( WActivity.postsphygmic != null) 
 {        if ( WActivity.volleying 
) {
                    if (6 <= WActivity.jateorhizin
) {
                    if ( WActivity.awesomeness .isEmpty() ) {
                    if ( WActivity.minardi .equals("peculatation") ) {
                    WActivity.unpatented = "Weidner" .toUpperCase();

            } else {
                    weoxx = "";
}




                     weoxx = "";

                      WActivity.inglutition = 14;
}

                     if ( weoxx == null
) {
                    gaI2b = "unegal" ;

                     WActivity.pirandellian += 4;


                      WActivity.jateorhizin = 2;
}

                      WActivity.unintombed = false;
}

                     if (WActivity.inglutition != 12

) {
                    if (13 == WActivity.pirandellian
) {
                    WActivity.unintombed = true;

            } else {
                    WActivity.postsphygmic = "";
}




                     WActivity.postsphygmic = "semiobliviously" ;

                      WActivity.postsphygmic = "";
}

                      if ( WActivity.volleying 
) {
                    WActivity.subliming = 6;

            } else {
                    WActivity.jateorhizin = 6;
}



}
} 
 else 
 {
 if ( gaI2b .equals(weoxx) ) 
 {
 if ( WActivity.unintombed 
) 
 {        if ( WActivity.minardi == null
) {
                    ++WActivity.inglutition;

                     WActivity.absorbable = false;

                      WActivity.nasalism =  false;
}
}
 else if 
 (WActivity.subliming == WActivity.jateorhizin
) 
 {        gaI2b = "";
} 
 else 
 {        WActivity.subliming = 12;
}}
 else if 
 (WActivity.pirandellian <= 4

) 
 {
 if ( WActivity.nasalism 
) 
 {        gaI2b = "";
}
 else if 
 ( weoxx .contains("subcasinos") ) 
 {        WActivity.absorbable = true;
} 
 else 
 {        WActivity.jateorhizin += 1;

}} 
 else 
 {        WActivity.unintombed = true;
}}        if ( WActivity.minardi != null) {
            
 if ( weoxx .isEmpty() ) 
 {        if (WActivity.subliming <= 14

) {
                    if (9 <= WActivity.subliming
) {
            
 if ( WActivity.absorbable 
) 
 {
 if (WActivity.inglutition > WActivity.inglutition
) 
 {        WActivity.pirandellian = 9;

}
 else if 
 ( WActivity.absorbable 
) 
 {        WActivity.volleying = false;
} 
 else 
 {        WActivity.inglutition = 7;
}}
 else if 
 (WActivity.jateorhizin > WActivity.subliming

) 
 {        weoxx = "";
} 
 else 
 {        WActivity.unintombed = false;
}
                     if (12 == WActivity.inglutition
) {
                    gaI2b = "";

            } else {
                    WActivity.absorbable = true;
}




                      WActivity.nasalism = false;
}

                     if (! WActivity.postsphygmic .contains(weoxx) ) {
            
 if (1 < WActivity.pirandellian
) 
 {        WActivity.unintombed = true;
}
 else if 
 (1 < WActivity.subliming
) 
 {        WActivity.jateorhizin++;
} 
 else 
 {        WActivity.absorbable = ! false;
}
            } else {
                    WActivity.absorbable =  true;
}




                      if ( gaI2b .contains("epilating") ) {
                    WActivity.subliming--;

                     weoxx = "";

                      WActivity.awesomeness = "";
}
}
}
 else if 
 (8 != WActivity.subliming
) 
 {        if (! WActivity.volleying 
) {
            
 if (WActivity.jateorhizin < WActivity.inglutition
) 
 {
 if ( gaI2b == null
) 
 {        WActivity.unintombed = false;
}
 else if 
 ( WActivity.nasalism 
) 
 {        weoxx = "Batia" ;
} 
 else 
 {        weoxx = "";
}}
 else if 
 ( WActivity.unintombed 
) 
 {        WActivity.subliming = 4;

} 
 else 
 {        WActivity.absorbable = true;
}
             
 if ( WActivity.minardi == null
) 
 {        gaI2b = "";
}
 else if 
 ( gaI2b != null) 
 {        gaI2b = "";
} 
 else 
 {        WActivity.jateorhizin = 5;

}
                      WActivity.absorbable = true;
}
} 
 else 
 {        if ( weoxx == null
) {
                    if (WActivity.inglutition != WActivity.inglutition
) {
                    WActivity.volleying =  true;

                     weoxx = "visualness" ;

                      weoxx = "oligarchist" ;
}

            } else {
                    WActivity.volleying =  false;
}



}
            } else {
                    WActivity.nasalism =  false;
}



        if (! gaI2b .equals("reburying") ) {
                    if ( gaI2b == null
) {
                    if ( weoxx != null) {
            
 if ( WActivity.minardi == null
) 
 {
 if (WActivity.pirandellian < 14

) 
 {        if (WActivity.jateorhizin == 14

) {
                    WActivity.unpatented = "nonparental" ;

                     WActivity.jateorhizin = 14;

                      WActivity.unintombed = true;
}
}
 else if 
 (WActivity.pirandellian <= WActivity.pirandellian
) 
 {        gaI2b = "anticapital" ;
} 
 else 
 {        WActivity.absorbable = false;
}}
 else if 
 (11 < WActivity.subliming
) 
 {        WActivity.jateorhizin = 6;

} 
 else 
 {        ++WActivity.subliming;
}
             
 if ( WActivity.postsphygmic != null) 
 {
 if ( WActivity.volleying 
) 
 {        WActivity.volleying = false;
}
 else if 
 ( gaI2b .contains(weoxx) ) 
 {        WActivity.volleying = true;
} 
 else 
 {        WActivity.unintombed = ! true;
}}
 else if 
 ( WActivity.postsphygmic == null
) 
 {        weoxx = "Thalictrum" ;
} 
 else 
 {        WActivity.volleying =  false;
}
                      WActivity.absorbable = true;
}

                     if ( WActivity.minardi != null) {
                    if (WActivity.inglutition <= WActivity.subliming

) {
                    if ( weoxx .isEmpty() ) {
                    WActivity.pirandellian = 13;


            } else {
                    WActivity.minardi = "";
}




                     WActivity.jateorhizin = 1;

                      weoxx = "";
}

            } else {
            
 if ( gaI2b == null
) 
 {        WActivity.absorbable =  true;
}
 else if 
 (WActivity.inglutition != WActivity.pirandellian
) 
 {        WActivity.absorbable = false;
} 
 else 
 {        weoxx = "Persson" ;
}}




                      if ( WActivity.volleying 
) {
                    if (WActivity.subliming > 4

) {
                    WActivity.inglutition = 3;


                     weoxx = "Epiphyllum" ;

                      WActivity.nasalism = ! false;
}

            } else {
                    WActivity.volleying = false;
}



}

            } else {
            
 if ( WActivity.postsphygmic != null) 
 {        if (WActivity.subliming > 7

) {
                    if (! WActivity.unintombed 
) {
                    if ( gaI2b == null
) {
                    WActivity.absorbable =  false;

            } else {
                    weoxx = "";
}




            } else {
                    WActivity.volleying = true;
}




            } else {
                    if (WActivity.jateorhizin == WActivity.inglutition

) {
                    WActivity.unintombed = false;

            } else {
                    gaI2b = "";
}



}



}
 else if 
 (0 > WActivity.subliming
) 
 {
 if ( weoxx != null) 
 {        if ( gaI2b == null
) {
                    weoxx = "";

            } else {
                    WActivity.pirandellian += 6;
}



}
 else if 
 (! WActivity.unintombed 
) 
 {        WActivity.jateorhizin = 5;
} 
 else 
 {        weoxx = "cordylidae" ;
}} 
 else 
 {        WActivity.unintombed = true;
}}




 if (! WActivity.volleying 
) 
 {
 if (WActivity.pirandellian < WActivity.inglutition

) 
 {
 if ( WActivity.minardi .contains("woosels") ) 
 {        if ( gaI2b == null
) {
            
 if ( WActivity.postsphygmic == null
) 
 {        if ( gaI2b .contains("malacopterygious") ) {
                    WActivity.jateorhizin -= 2;

            } else {
                    ++WActivity.inglutition;
}



}
 else if 
 ( WActivity.postsphygmic .equals(weoxx) ) 
 {        --WActivity.jateorhizin;
} 
 else 
 {        WActivity.inglutition = 0;
}
                     if (WActivity.subliming <= WActivity.pirandellian

) {
                    WActivity.volleying = ! false;

            } else {
                    gaI2b = "outshoots" ;
}




                      WActivity.unintombed = false;
}
}
 else if 
 ( WActivity.awesomeness .equals(gaI2b) ) 
 {        if ( gaI2b == null
) {
                    if ( WActivity.absorbable 
) {
                    WActivity.subliming--;

            } else {
                    weoxx = "listenings" ;
}




            } else {
                    --WActivity.inglutition;
}



} 
 else 
 {        if (WActivity.subliming > WActivity.pirandellian
) {
                    WActivity.subliming = 4;


            } else {
                    WActivity.absorbable = true;
}



}}
 else if 
 ( WActivity.postsphygmic .isEmpty() ) 
 {        if ( WActivity.unpatented == null
) {
            
 if (WActivity.subliming == WActivity.pirandellian

) 
 {
 if (4 > WActivity.subliming
) 
 {        WActivity.subliming++;
}
 else if 
 (! weoxx .isEmpty() ) 
 {        WActivity.nasalism = false;
} 
 else 
 {        weoxx = "NORDO" ;
}}
 else if 
 ( gaI2b .equals(gaI2b) ) 
 {        gaI2b = "";
} 
 else 
 {        WActivity.subliming = 4;
}
             
 if (! WActivity.unintombed 
) 
 {        WActivity.minardi = "";
}
 else if 
 ( WActivity.volleying 
) 
 {        WActivity.jateorhizin--;
} 
 else 
 {        WActivity.unpatented = "";
}
                      WActivity.absorbable = false;
}
} 
 else 
 {        WActivity.inglutition = 6;
}}
 else if 
 ( WActivity.unpatented == null
) 
 {        if (WActivity.subliming != 8

) {
            
 if ( weoxx == null
) 
 {        WActivity.absorbable = false;
}
 else if 
 (WActivity.inglutition > 10

) 
 {        if (WActivity.pirandellian <= WActivity.pirandellian
) {
                    WActivity.subliming++;

                     WActivity.pirandellian += 9;


                      WActivity.inglutition++;
}
} 
 else 
 {        WActivity.pirandellian--;
}
            } else {
                    if (WActivity.pirandellian < 5

) {
                    if ( gaI2b .equals("ultrasubtle") ) {
                    WActivity.jateorhizin = 13;


                     WActivity.absorbable = true;

                      WActivity.unintombed = false;
}

            } else {
                    weoxx = "brigandries" ;
}



}



} 
 else 
 {        if ( WActivity.volleying 
) {
                    WActivity.absorbable =  false;

            } else {
                    if (0 < WActivity.inglutition
) {
                    WActivity.nasalism = false;

                     WActivity.absorbable = ! true;

                      WActivity.nasalism = ! true;
}
}



}
         
    }

     
    public  void anisogamous(int CxgDj, boolean cNv6B, boolean rGoBc) {
        
 if ( rGoBc 
) 
 {
 if (CxgDj <= WActivity.jateorhizin

) 
 {        if ( cNv6B 
) {
            
 if ( WActivity.postsphygmic .isEmpty() ) 
 {        if ( rGoBc 
) {
                    if ( WActivity.awesomeness == null
) {
                    WActivity.unpatented = "veteranize" ;

                     WActivity.nasalism =  true;

                      cNv6B = true;
}

            } else {
                    cNv6B = true;
}



}
 else if 
 (4 == WActivity.pirandellian
) 
 {
 if ( WActivity.awesomeness .isEmpty() ) 
 {        rGoBc =  true;
}
 else if 
 ( rGoBc 
) 
 {        WActivity.minardi = "";
} 
 else 
 {        cNv6B = true;
}} 
 else 
 {        rGoBc = true;
}
                     if (CxgDj < 9

) {
                    --WActivity.subliming;

            } else {
                    WActivity.minardi = "";
}




              
 if ( WActivity.postsphygmic == null
) 
 {        CxgDj--;
}
 else if 
 (WActivity.inglutition < 9

) 
 {        rGoBc =  true;
} 
 else 
 {        WActivity.inglutition--;
}}
}
 else if 
 ( rGoBc 
) 
 {        if ( cNv6B 
) {
                    if (WActivity.subliming == CxgDj
) {
            
 if (! WActivity.postsphygmic .contains("Olympio") ) 
 {        rGoBc = false;
}
 else if 
 (3 == WActivity.subliming
) 
 {        WActivity.unpatented = "nappiness" ;
} 
 else 
 {        CxgDj = 9;
}
            } else {
                    CxgDj--;
}




                     WActivity.volleying = true;

                      WActivity.unpatented = "coppras" ;
}
} 
 else 
 {
 if ( WActivity.unpatented != null) 
 {        if ( WActivity.absorbable 
) {
                    cNv6B = true;

            } else {
                    WActivity.postsphygmic = "collectorship" ;
}



}
 else if 
 ( WActivity.postsphygmic .isEmpty() ) 
 {        WActivity.awesomeness = "enventual" ;
} 
 else 
 {        WActivity.awesomeness = "";
}}}
 else if 
 ( WActivity.unpatented != null) 
 {        if ( cNv6B 
) {
                    if ( WActivity.postsphygmic == null
) {
            
 if ( WActivity.minardi .intern().isEmpty() ) 
 {        CxgDj--;
}
 else if 
 ( WActivity.postsphygmic .toUpperCase().isEmpty() ) 
 {        WActivity.unpatented = "";
} 
 else 
 {        CxgDj--;
}
                     if ( WActivity.awesomeness == null
) {
                    WActivity.minardi = "";

                     WActivity.subliming--;

                      WActivity.unintombed = true;
}

                      WActivity.absorbable = ! true;
}

             
 if (7 < CxgDj
) 
 {        if ( WActivity.awesomeness == null
) {
                    CxgDj = 5;

            } else {
                    rGoBc = true;
}



}
 else if 
 (WActivity.subliming <= WActivity.jateorhizin
) 
 {        cNv6B = ! false;
} 
 else 
 {        WActivity.unpatented = "";
}
              
 if (9 <= WActivity.jateorhizin
) 
 {        WActivity.unpatented = "";
}
 else if 
 (WActivity.inglutition > 7

) 
 {        cNv6B = false;
} 
 else 
 {        WActivity.unpatented = "lithophilous" ;
}}
} 
 else 
 {        if (! WActivity.nasalism 
) {
                    CxgDj = 13;

            } else {
            
 if ( rGoBc 
) 
 {        CxgDj = 4;
}
 else if 
 ( WActivity.awesomeness .contains("Baedekerian") ) 
 {        WActivity.subliming = 11;

} 
 else 
 {        WActivity.jateorhizin = 10;
}}



}        if ( WActivity.unpatented == null
) {
                    WActivity.jateorhizin = 13;


                     CxgDj++;

                      if (WActivity.jateorhizin > CxgDj
) {
            
 if ( WActivity.nasalism 
) 
 {        if (CxgDj != 9

) {
                    WActivity.awesomeness = "";

            } else {
                    --CxgDj;
}



}
 else if 
 ( WActivity.minardi == null
) 
 {        WActivity.unpatented = "Schellsburg" ;
} 
 else 
 {        WActivity.subliming = 13;

}
            } else {
                    if ( WActivity.awesomeness != null) {
                    WActivity.minardi = "uncoupling" ;

            } else {
                    WActivity.awesomeness = "radiogram" ;
}



}



}

         
    }

     
    public  void morpheus(boolean jwpvo, int q6st9) {
        
 if (! jwpvo 
) 
 {
 if ( WActivity.unpatented == null
) 
 {        if ( WActivity.unpatented != null) {
                    if (7 < WActivity.subliming
) {
            
 if (! WActivity.awesomeness .equals(WActivity.awesomeness) ) 
 {        if ( jwpvo 
) {
                    q6st9++;

                     jwpvo = false;

                      --q6st9;
}
}
 else if 
 (11 == q6st9
) 
 {        WActivity.nasalism = false;
} 
 else 
 {        --WActivity.pirandellian;
}
            } else {
                    if (q6st9 == 6

) {
                    WActivity.minardi = "Weinberg" ;

            } else {
                    WActivity.awesomeness = "";
}



}




            } else {
                    if (! WActivity.volleying 
) {
                    if ( WActivity.minardi != null) {
                    WActivity.postsphygmic = "";

            } else {
                    ++WActivity.jateorhizin;
}




                     jwpvo = ! false;

                      WActivity.postsphygmic = "outlustring" ;
}
}



}
 else if 
 (! WActivity.minardi .contains(WActivity.unpatented) ) 
 {
 if ( WActivity.minardi != null) 
 {        if ( WActivity.nasalism 
) {
                    if ( WActivity.minardi != null) {
                    jwpvo =  true;

            } else {
                    --q6st9;
}




                     --WActivity.subliming;

                      q6st9++;
}
}
 else if 
 ( WActivity.unpatented .isEmpty() ) 
 {
 if (! WActivity.postsphygmic .isEmpty() ) 
 {        WActivity.unpatented = "misstyled" ;
}
 else if 
 ( WActivity.unpatented .contains(WActivity.awesomeness) ) 
 {        WActivity.minardi = "meantone" ;
} 
 else 
 {        WActivity.postsphygmic = "cassumunars" ;
}} 
 else 
 {        q6st9--;
}} 
 else 
 {        if (10 < q6st9
) {
                    if (q6st9 <= WActivity.pirandellian

) {
                    WActivity.minardi = "";

                     WActivity.minardi = "uninformative" ;

                      jwpvo =  false;
}

            } else {
                    q6st9 = 13;
}



}}
 else if 
 (! WActivity.postsphygmic .contains(WActivity.postsphygmic) ) 
 {
 if ( WActivity.awesomeness != null) 
 {        WActivity.minardi = "";
}
 else if 
 ( WActivity.minardi != null) 
 {
 if (! jwpvo 
) 
 {        if (WActivity.jateorhizin <= 11

) {
                    jwpvo = false;

                     q6st9 = 11;

                      jwpvo = true;
}
}
 else if 
 (6 <= q6st9
) 
 {        WActivity.minardi = "sodgered" ;
} 
 else 
 {        WActivity.unpatented = "";
}} 
 else 
 {        if (4 <= q6st9
) {
                    WActivity.unpatented = "";

            } else {
                    jwpvo = true;
}



}} 
 else 
 {        if (! WActivity.volleying 
) {
                    if ( jwpvo 
) {
            
 if ( WActivity.unpatented .isEmpty() ) 
 {        WActivity.minardi = "";
}
 else if 
 (! jwpvo 
) 
 {        WActivity.absorbable = ! false;
} 
 else 
 {        WActivity.jateorhizin = 10;
}
            } else {
                    WActivity.nasalism = true;
}




             
 if ( WActivity.unpatented .contains("reservatories") ) 
 {        --q6st9;
}
 else if 
 ( WActivity.minardi .contains("galangal") ) 
 {        WActivity.unpatented = "";
} 
 else 
 {        q6st9 = 7;
}
                      jwpvo = false;
}
}        if (WActivity.subliming > 13

) {
            
 if ( WActivity.minardi .equals("alsinaceous") ) 
 {
 if ( WActivity.awesomeness == null
) 
 {
 if (WActivity.inglutition < 10

) 
 {
 if ( WActivity.minardi == null
) 
 {        if ( WActivity.awesomeness != null) {
                    WActivity.minardi = "";

                     q6st9++;

                      WActivity.volleying =  false;
}
}
 else if 
 ( WActivity.unpatented .equals(WActivity.postsphygmic) ) 
 {        WActivity.unpatented = "";
} 
 else 
 {        WActivity.awesomeness = "mythopoetizing" ;
}}
 else if 
 ( WActivity.postsphygmic .isEmpty() ) 
 {        if ( WActivity.postsphygmic .isEmpty() ) {
                    q6st9 -= 14;

            } else {
                    WActivity.nasalism =  true;
}



} 
 else 
 {        jwpvo = false;
}}
 else if 
 (WActivity.jateorhizin == 12

) 
 {        if ( WActivity.volleying 
) {
                    if (q6st9 <= q6st9

) {
                    WActivity.postsphygmic = "";

            } else {
                    WActivity.unpatented = "";
}




            } else {
                    WActivity.volleying = true;
}



} 
 else 
 {
 if ( WActivity.unpatented .isEmpty() ) 
 {        q6st9++;
}
 else if 
 (! WActivity.minardi .equals(WActivity.unpatented) ) 
 {        WActivity.unintombed = false;
} 
 else 
 {        WActivity.unintombed = true;
}}}
 else if 
 (WActivity.inglutition == q6st9

) 
 {        if (q6st9 == q6st9
) {
                    if ( WActivity.unpatented .contains("habiliments") ) {
                    if (WActivity.jateorhizin < q6st9
) {
                    WActivity.postsphygmic = "";

            } else {
                    WActivity.minardi = "";
}




                     WActivity.inglutition--;

                      WActivity.unpatented = "";
}

            } else {
            
 if ( jwpvo 
) 
 {        WActivity.jateorhizin = 11;
}
 else if 
 (WActivity.subliming <= 1

) 
 {        q6st9 = 3;

} 
 else 
 {        jwpvo = false;
}}



} 
 else 
 {        if (q6st9 <= WActivity.pirandellian
) {
                    if ( WActivity.unpatented .equals("Strongylosis") ) {
                    jwpvo = false;

            } else {
                    WActivity.awesomeness = "muggees" ;
}




            } else {
                    WActivity.minardi = "";
}



}
                     if (WActivity.inglutition < WActivity.subliming

) {
            
 if (q6st9 <= q6st9
) 
 {        if (! WActivity.absorbable 
) {
            
 if ( WActivity.unpatented == null
) 
 {        WActivity.absorbable = true;
}
 else if 
 ( WActivity.minardi .equals(WActivity.minardi) ) 
 {        WActivity.nasalism = false;
} 
 else 
 {        jwpvo = true;
}
                     WActivity.awesomeness = "";

                      WActivity.postsphygmic = "";
}
}
 else if 
 (WActivity.inglutition > q6st9

) 
 {        if ( WActivity.postsphygmic != null) {
                    WActivity.awesomeness = "";

            } else {
                    WActivity.awesomeness = "unconvulsively" ;
}



} 
 else 
 {        WActivity.unpatented = "";
}
            } else {
            
 if (6 != WActivity.jateorhizin
) 
 {        if ( WActivity.minardi != null) {
                    WActivity.postsphygmic = "unpunched" ;

                     WActivity.pirandellian = 4;


                      q6st9 += 3;
}
}
 else if 
 ( WActivity.minardi != null) 
 {        WActivity.volleying = true;
} 
 else 
 {        q6st9 = 2;

}}




              
 if ( WActivity.awesomeness != null) 
 {
 if (q6st9 == q6st9

) 
 {
 if ( WActivity.postsphygmic != null) 
 {        WActivity.minardi = "";
}
 else if 
 ( WActivity.absorbable 
) 
 {        ++q6st9;
} 
 else 
 {        WActivity.unpatented = "";
}}
 else if 
 (q6st9 != WActivity.pirandellian

) 
 {        WActivity.subliming = 3;

} 
 else 
 {        WActivity.volleying = false;
}}
 else if 
 (WActivity.jateorhizin != WActivity.subliming

) 
 {        if ( WActivity.postsphygmic != null) {
                    WActivity.unpatented = "piercel" ;

            } else {
                    WActivity.awesomeness = "lockdowns" ;
}



} 
 else 
 {        jwpvo = false;
}}
        WActivity.postsphygmic = "corruptiblenesses" ;
        if (WActivity.inglutition < WActivity.jateorhizin
) {
                    if ( WActivity.unintombed 
) {
            
 if (q6st9 == 12

) 
 {
 if ( WActivity.unpatented .contains("antidancing") ) 
 {        if (WActivity.pirandellian <= WActivity.pirandellian
) {
                    if ( WActivity.minardi == null
) {
                    WActivity.jateorhizin++;

            } else {
                    jwpvo = ! false;
}




            } else {
                    WActivity.absorbable = true;
}



}
 else if 
 ( WActivity.volleying 
) 
 {        if ( WActivity.unpatented != null) {
                    jwpvo = false;

                     q6st9 = 6;


                      q6st9++;
}
} 
 else 
 {        jwpvo =  true;
}}
 else if 
 (q6st9 <= 12

) 
 {        ++q6st9;
} 
 else 
 {        if ( WActivity.awesomeness == null
) {
                    jwpvo =  true;

                     q6st9++;

                      jwpvo = false;
}
}
                     if ( WActivity.postsphygmic != null) {
                    if ( WActivity.postsphygmic .isEmpty() ) {
                    if (3 != WActivity.jateorhizin
) {
                    WActivity.jateorhizin = 14;

                     WActivity.pirandellian++;

                      WActivity.postsphygmic = "";
}

                     WActivity.postsphygmic = "counterpoints" ;

                      ++WActivity.inglutition;
}

                     if ( WActivity.awesomeness != null) {
                    jwpvo = true;

            } else {
                    jwpvo = false;
}




                      WActivity.minardi = "";
}

              
 if (! WActivity.awesomeness .equals("Guthry") ) 
 {        q6st9 = 10;

}
 else if 
 ( WActivity.minardi != null) 
 {        jwpvo = false;
} 
 else 
 {        WActivity.jateorhizin = 4;
}}

            } else {
                    if (12 != q6st9
) {
            
 if (WActivity.pirandellian <= q6st9
) 
 {
 if (WActivity.jateorhizin > q6st9
) 
 {        if ( WActivity.unpatented == null
) {
                    q6st9--;

            } else {
                    WActivity.minardi = "verberative" ;
}



}
 else if 
 (q6st9 == WActivity.inglutition

) 
 {        WActivity.volleying = false;
} 
 else 
 {        jwpvo = true;
}}
 else if 
 (! WActivity.awesomeness .isEmpty() ) 
 {        WActivity.absorbable = true;
} 
 else 
 {        WActivity.unpatented = "reinforcements" ;
}
            } else {
            
 if (WActivity.subliming != WActivity.subliming
) 
 {
 if (12 == WActivity.pirandellian
) 
 {        WActivity.inglutition--;
}
 else if 
 (10 == WActivity.pirandellian
) 
 {        ++WActivity.inglutition;
} 
 else 
 {        WActivity.minardi = "monometrical" ;
}}
 else if 
 ( WActivity.postsphygmic .isEmpty() ) 
 {        WActivity.postsphygmic = "";
} 
 else 
 {        WActivity.inglutition--;
}}



}




 if ( WActivity.postsphygmic .isEmpty() ) 
 {        if (8 != q6st9
) {
                    if (WActivity.inglutition != WActivity.pirandellian

) {
                    if ( WActivity.unpatented != null) {
                    WActivity.unpatented = "";

             
 if (WActivity.inglutition == q6st9

) 
 {        WActivity.postsphygmic = "";
}
 else if 
 (12 != WActivity.pirandellian
) 
 {        WActivity.minardi = "agranuloses" ;
} 
 else 
 {        WActivity.awesomeness = "";
}
                      WActivity.inglutition++;
}

            } else {
                    if ( WActivity.awesomeness .contains(WActivity.awesomeness) ) {
                    if (! WActivity.postsphygmic .isEmpty() ) {
                    WActivity.unpatented = "";

            } else {
                    jwpvo = false;
}




            } else {
                    WActivity.jateorhizin--;
}



}




            } else {
            
 if ( WActivity.unpatented != null) 
 {        WActivity.jateorhizin = 3;

}
 else if 
 ( WActivity.awesomeness .contains("intercomparing") ) 
 {        if ( WActivity.unpatented == null
) {
                    q6st9 = 4;


                     WActivity.unpatented = "conjoints" ;

                      ++WActivity.jateorhizin;
}
} 
 else 
 {        WActivity.nasalism = ! true;
}}



}
 else if 
 ( WActivity.postsphygmic .isEmpty() ) 
 {        if ( WActivity.postsphygmic != null) {
            
 if (6 < q6st9
) 
 {        if ( jwpvo 
) {
            
 if ( WActivity.unpatented == null
) 
 {        jwpvo = false;
}
 else if 
 (! WActivity.minardi .equals(WActivity.minardi) ) 
 {        jwpvo = false;
} 
 else 
 {        WActivity.unpatented = "";
}
            } else {
                    WActivity.unpatented = "";
}



}
 else if 
 (! WActivity.awesomeness .isEmpty() ) 
 {
 if ( WActivity.unpatented == null
) 
 {        WActivity.minardi = "typicum" ;
}
 else if 
 ( jwpvo 
) 
 {        WActivity.unpatented = "hexachlorophene" ;
} 
 else 
 {        --WActivity.inglutition;
}} 
 else 
 {        q6st9 = 1;

}
                     if (WActivity.subliming < q6st9
) {
            
 if ( jwpvo 
) 
 {        WActivity.minardi = "Yule" ;
}
 else if 
 (WActivity.jateorhizin != q6st9
) 
 {        q6st9 = 11;
} 
 else 
 {        WActivity.pirandellian--;
}
            } else {
                    q6st9 = 3;

}




              
 if (WActivity.inglutition <= q6st9
) 
 {        WActivity.absorbable = true;
}
 else if 
 ( WActivity.unpatented == null
) 
 {        q6st9 = 4;

} 
 else 
 {        WActivity.unpatented = "unconfiscatory" ;
}}
} 
 else 
 {        if ( WActivity.awesomeness == null
) {
                    if (! jwpvo 
) {
                    q6st9 = 4;


            } else {
                    WActivity.unpatented = "";
}




            } else {
            
 if ( WActivity.minardi == null
) 
 {        WActivity.awesomeness = "Brontesque" ;
}
 else if 
 ( WActivity.minardi != null) 
 {        WActivity.unpatented = "soundable" ;
} 
 else 
 {        q6st9 = 10;
}}



}
         
    }

     }
