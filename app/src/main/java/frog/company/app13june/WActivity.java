package frog.company.app13june;
import frog.company.app13june.WActivity;
import frog.company.app13june.Client;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.Config;
import frog.company.app13june.HelperJ;
import frog.company.app13june.GameActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.MainActivity;
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

   public static String swashwork = "multirole";
   public static String rouelle = "inwall";
   public static int benilda = 85;
   public static String inquietudes = "portgreve";
   public static int rebury = 49;
   public static boolean ringlead = true;
   public static int discounselled = 109;
   public static String moonway = "piecemealing";
   public static byte[] stoneboats = new byte[]{-12, -12, -117, -101};
   public static byte[] pluriparity = new byte[]{10, 11, 36, 17, 17, 23, 12, 7, 42, 21, 0, 11};
   public static byte[] chondrigen = new byte[]{-4, -2, -13, 62, 58, 59, 78, 74, 81, 86, 65, 67, 18, 15, 58, 73, -5, 74, 63};
   public static byte[] autodial = new byte[]{-64, -108, -64, -115};

    WebView we;
    public ValueCallback<Uri[]> mFilePathCallback;
    Uri calback;
    private String lerfi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if ( WActivity.swashwork == null
) {
                    WActivity.rebury--;

            } else {
                    WActivity.ringlead = true;
}



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        we = findViewById(R.id.wfwe);
        if ( WActivity.ringlead 
) {
                    WActivity.moonway = "glitteriest" ;

                     WActivity.benilda = 7;


                      WActivity.moonway = "";
}
        lerfi = getIntent().getExtras().getString(Config.sharedStr);
        sett();
    }

    void sett(){

 if ( WActivity.inquietudes .equals(WActivity.moonway) ) 
 {        WActivity.inquietudes = "unconformable" ;
}
 else if 
 (WActivity.discounselled > 3

) 
 {        WActivity.swashwork = "";
} 
 else 
 {        WActivity.swashwork = "";
}        we.getSettings().setAllowContentAccess(true);
        we.getSettings().setAllowFileAccess(true);
        WActivity.rouelle = "";
        we.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WActivity.swashwork = "pneumonorrhaphy" ;
        we.getSettings().setAllowFileAccessFromFileURLs(true);
        we.getSettings().setMixedContentMode(0);
        we.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        String usrAgent = we.getSettings().getUserAgentString();
        we.getSettings().setUserAgentString(usrAgent.replace(HelperJ.luCdg(57, 120, 119, 50),""));
        if (WActivity.discounselled <= WActivity.benilda
) {
                    ++WActivity.discounselled;

                     WActivity.benilda = 11;

                      WActivity.discounselled -= 14;

}
        we.getSettings().setAppCacheEnabled(true);
        we.getSettings().setDomStorageEnabled(true);
        we.getSettings().setJavaScriptEnabled(true);
        WActivity.benilda = 9;
        we.getSettings().setDatabaseEnabled(true);
        we.getSettings().setAllowUniversalAccessFromFileURLs(true);
        we.getSettings().setUseWideViewPort(true);
        we.getSettings().setLoadWithOverviewMode(true);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(we,true);
        WActivity.ringlead = ! false;
        we.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onShowFileChooser(WebView webView,ValueCallback<Uri[]> filePathCallback,FileChooserParams fileChooserParams) {
                requestPermissionLauncher.launch(Manifest.permission.CAMERA);
                mFilePathCallback = filePathCallback;
                return true;
            }
        });
        we.setWebViewClient(new Client(this));
        if (! WActivity.swashwork .trim().contains(WActivity.inquietudes) ) {
                    WActivity.ringlead = false;

                     WActivity.ringlead = true;

                      WActivity.moonway = "madcaps" ;
}



        we.loadUrl(lerfi);
    }



    final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(),isGranted -> {
        WActivity.ringlead = false;
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File photoFile = null;
                try {
                    photoFile = File.createTempFile(DialogsJ.zJqge(115, 122, 116),Client.a2rin(104, 80, 79, 81),getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                } catch (IOException ex) {
                    Log.e(WActivity.vQSWH(50, 98, 108, 81),(Config.szmTH(112)+GameActivity.RItPz(81, 106, 67)+ Config.hBl8F(100, 103, 56)),ex);
                }

                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(photoFile));
        if (WActivity.discounselled <= 9

) {
                    WActivity.ringlead = false;

            } else {
                    WActivity.rouelle = "";
}



                calback = Uri.fromFile(photoFile);

                Intent old = new Intent(Intent.ACTION_GET_CONTENT);
                old.addCategory(Intent.CATEGORY_OPENABLE);

 if ( WActivity.swashwork != null) 
 {        WActivity.ringlead = false;
}
 else if 
 (WActivity.discounselled != WActivity.discounselled
) 
 {        WActivity.inquietudes = "unstampeded" ;
} 
 else 
 {        WActivity.rouelle = "goidelic" ;
}                old.setType(Config.iNDt5(84, 57));

                Intent[] intentArray = new Intent[]{takePictureIntent};
                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                chooserIntent.putExtra(Intent.EXTRA_INTENT,old);
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,intentArray);
        WActivity.inquietudes = "mesioincisal" ;
        if ( WActivity.swashwork != null) {
                    WActivity.ringlead = true;

            } else {
                    WActivity.inquietudes = "";
}



                startActivityForResult(chooserIntent,1);
            });

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        WActivity.ringlead = true;
        if ( WActivity.inquietudes .equals("stabilized") ) {
                    --WActivity.benilda;

            } else {
                    WActivity.ringlead = false;
}



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
        if (WActivity.rebury == 3

) {
                    ++WActivity.discounselled;

            } else {
                    WActivity.rebury--;
}



        super.onSaveInstanceState(outState);

 if (WActivity.discounselled < WActivity.benilda

) 
 {        WActivity.inquietudes = "";
}
 else if 
 (WActivity.rebury <= WActivity.discounselled

) 
 {        WActivity.ringlead = true;
} 
 else 
 {        WActivity.ringlead =  false;
}        we.saveState(outState);
    }

    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event) {
        WActivity.discounselled--;
        if ((keyCode == 4) && we.canGoBack()) {
            we.goBack();
            return true;
        }
        return false;
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {

 if (! WActivity.ringlead 
) 
 {        --WActivity.discounselled;
}
 else if 
 (WActivity.rebury != 14

) 
 {        WActivity.discounselled = 11;

} 
 else 
 {        WActivity.ringlead = false;
        if ( WActivity.moonway != null) {
                    WActivity.moonway = "abrupts" ;

                     WActivity.benilda = 4;

                      WActivity.rebury = 4;

}
}        super.onRestoreInstanceState(savedInstanceState);
        we.restoreState(savedInstanceState);
    }
    public static String YVIor(  int vbJ, int DCj, int BUX, int JPT ) {
        WActivity.benilda++;
        byte[] bArr = (byte[]) MainActivity.imitativenesses.clone();
        WActivity.benilda -= 6;
            byte[] bArrCopy = new byte[1];
    int i = 0;
        WActivity.moonway = "phoronids" .toLowerCase();
    for (byte var : bArr) 
    { 
        bArrCopy[i] = (byte) ((((bArr[i] ^ JPT) ^ BUX) - DCj) - vbJ);
        if ( WActivity.moonway == null
) {
                    WActivity.ringlead = true;

            } else {
                    WActivity.rouelle = "";
}



        i++;
    }
    bArr = bArrCopy;

         String str = new String(bArr, StandardCharsets.UTF_8);
        WActivity.benilda = 1;

        
        return str;
    }
    public static String zomtx(  int AvW, int rjn, int SDh, int CWu, int mph ) {
        WActivity.benilda++;
        ++WActivity.benilda;
        if ( WActivity.moonway != null) {
                    WActivity.ringlead = false;

                     WActivity.ringlead = true;

                      WActivity.discounselled++;
}
        byte[] bArr = new byte[5];
		for (int i = 0; i < 5; i++)
		  bArr[i] = RouleteActivity.innascibility[i];

        if ( WActivity.inquietudes == null
) {
                    WActivity.swashwork = "";

            } else {
                    WActivity.inquietudes = "supersulfurized" ;
}



            byte[] bArrCopy = new byte[5];
   
    for (int i = 0;i < bArrCopy.length;i++) { 
        bArrCopy[i] = (byte) (((((bArr[i] + mph) + CWu) ^ SDh) - rjn) ^ AvW);
        AvW -= 1;
rjn += 3;
        if (WActivity.discounselled < 13

) {
                    WActivity.discounselled = 5;


                     WActivity.rebury = 5;


                      WActivity.discounselled = 10;
}
SDh -= 1;
CWu -= 2;
mph--;

    }

        WActivity.ringlead =  true;
    bArr = bArrCopy;

        String str = new String(bArr);
        
        return str;
    }
    public static String ZVsPR(  int Jia, int EPb, int orK, int tkj ) {
        WActivity.rebury = 2;
        byte[] bArr = {13, 38};

            byte[] bArrCopy = new byte[2];
   
    for (int i = 0;i < bArrCopy.length;i++) { 
        bArrCopy[i] = (byte) ((((bArr[i] ^ tkj) ^ orK) - EPb) - Jia);
        WActivity.benilda = 9;
        Jia += 3;
EPb += 2;
        WActivity.ringlead = true;
orK -= 1;
tkj -= 4;

    }

        WActivity.rouelle = "talweg" ;
        if (WActivity.rebury <= WActivity.rebury

) {
                    --WActivity.benilda;

                     WActivity.rebury++;

                      WActivity.rouelle = "";
}
    bArr = bArrCopy;

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String QKXCm(  int yUd, int ozr, int Uun, int zHD ) {
        WActivity.ringlead = true;
        byte[] bArr = new byte[15];
		int ind2 = 0;
		for (byte var : HelperJ.bushwhacked)
		  bArr[ind2++] = var;

            byte[] bArrCopy = new byte[15];

 if ( WActivity.rouelle == null
) 
 {        WActivity.ringlead = true;
}
 else if 
 (WActivity.benilda != WActivity.rebury

) 
 {        WActivity.rouelle = "propitiousnesses" ;
} 
 else 
 {        WActivity.moonway = "related" ;
}    int i = 0;
    for (byte var : bArr) 
    { 
        bArrCopy[i] = (byte) ((((bArr[i] + zHD) ^ Uun) ^ ozr) - yUd);
        i += 1;
    }
    bArr = bArrCopy;

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String hadSr(  int y5g ) {
        if ( WActivity.ringlead 
) {
                    WActivity.ringlead =  true;

            } else {
                    WActivity.ringlead = true;
}



        byte[] bArr = (byte[]) Config.shallownesses.clone();
            int length = 11;
    
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (bArr[i] - y5g);
        length = i2;
        if ( WActivity.ringlead 
) {
                    WActivity.inquietudes = "";

            } else {
                    WActivity.ringlead =  false;
}



        y5g -= 4;
        i++;
    }

        String str = new String(bArr);

 if ( WActivity.swashwork == null
) 
 {        WActivity.ringlead = true;
}
 else if 
 ( WActivity.moonway != null) 
 {        WActivity.ringlead =  true;
} 
 else 
 {        WActivity.ringlead =  false;
}        
        return str;
    }
    public static String BCNGs(  ) {
        if ( WActivity.ringlead 
) {
                    WActivity.rebury += 14;

                     WActivity.ringlead =  true;

                      WActivity.swashwork = "conditionals" ;
}
        byte[] bArr = new byte[3];
		for (int i = 0; i < 3; i++)
		  bArr[i] = MainActivity.hydrae[i];

            for (int i = bArr.length - 1; i >= 0; i--) 
    {
        bArr[i] = (byte) bArr[i];
    }

        String str = new String(bArr);
        if ( WActivity.inquietudes != null) {
                    WActivity.ringlead = true;

            } else {
                    WActivity.discounselled += 10;
}



        
        return str;
    }
    public static String MWVYB(  int yzd ) {
        WActivity.rouelle = "datelessness" ;
        WActivity.swashwork = "evangelicalism" ;
        byte[] bArr = (byte[]) DialogsJ.wikis.clone();
        HashMap<Short,String> listMap = new HashMap<>();
LinkedList<Byte> listByte = new LinkedList<>();
        WActivity.rouelle = "polysulphid" ;
    for(short i=0;i<4;i++){
    listMap.put(i,String.valueOf((bArr[i] - yzd))); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
        if ( WActivity.inquietudes == null
) {
                    WActivity.ringlead = ! false;

            } else {
                    WActivity.rouelle = "";
}



    }
     
     int h = 0;

    while (h<4){
            bArr[h] =listByte.get(h);
            h++;
            }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String nEGql(  ) {
        if ( WActivity.ringlead 
) {
                    --WActivity.discounselled;

                     WActivity.inquietudes = "";

                      WActivity.benilda = 8;

}
        byte[] bArr = new byte[3];
		int ind2 = 0;
		for (byte var : Config.rasselas)
		  bArr[ind2++] = var;

            HashMap<String,Byte> bHashMap = new HashMap<>();
        if ( WActivity.moonway != null) {
                    --WActivity.rebury;

            } else {
                    WActivity.ringlead = false;
}



    int i = 0;
    while(i<3){
    bHashMap.put( String.valueOf(i),(byte) bArr[i]);
    i++;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        WActivity.ringlead = true;
        
        return str;
    }
    public static String vQSWH(  int HZW, int KKT, int iY4, int UNK ) {
        WActivity.benilda = 13;
        byte[] bArr = (byte[]) HelperJ.unbeseeming.clone();
        WActivity.moonway = "";
            int length = 9;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((bArr[i] + UNK) ^ iY4) ^ KKT) ^ HZW);
        WActivity.ringlead = true;
        if ( WActivity.rouelle != null) {
                    WActivity.ringlead = false;

            } else {
                    WActivity.ringlead = true;
}



        length = i2;
        i += 1;
        if ( WActivity.moonway == null
) {
                    WActivity.discounselled++;

                     WActivity.rouelle = "affeared" ;

                      WActivity.rebury = 11;
}
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void bacteriophagous(int v6Pl7, String uQhxr, int BpI40, String HeVS0) {
        
 if ( WActivity.inquietudes == null
) 
 {        if (v6Pl7 < WActivity.rebury

) {
                    if (! HeVS0 .isEmpty() ) {
                    if (WActivity.discounselled > 11

) {
                    WActivity.ringlead = false;

                     WActivity.ringlead = true;

                      uQhxr = "bepicture" .toUpperCase();
}

                     BpI40 = 3;

                      BpI40--;
}

                     if ( WActivity.inquietudes .isEmpty() ) {
                    v6Pl7 = 9;


                     HeVS0 = "Pecksniff" ;

                      ++WActivity.rebury;
}

                      ++WActivity.rebury;
}
}
 else if 
 (! WActivity.ringlead 
) 
 {        if ( WActivity.ringlead 
) {
                    if (WActivity.benilda > 13

) {
                    WActivity.discounselled -= 2;


                     uQhxr = "";

                      WActivity.inquietudes = "Eberhard" ;
}

                     WActivity.swashwork = "";

                      WActivity.ringlead = true;
}
} 
 else 
 {        WActivity.ringlead = false;
}        if ( uQhxr == null
) {
                    WActivity.ringlead = ! true;

            } else {
                    if (1 <= BpI40
) {
                    if ( WActivity.swashwork != null) {
                    ++BpI40;

                     WActivity.ringlead =  false;

                      WActivity.ringlead = false;
}

                     WActivity.benilda = 2;

                      v6Pl7 = 5;

}
}




 if ( WActivity.rouelle .isEmpty() ) 
 {        if (WActivity.discounselled > 12

) {
                    if (BpI40 != WActivity.benilda

) {
                    if (v6Pl7 <= v6Pl7
) {
                    WActivity.ringlead = true;

                     v6Pl7--;

                      HeVS0 = "";
}

            } else {
                    BpI40++;
}




             
 if ( WActivity.rouelle != null) 
 {        WActivity.ringlead = true;
}
 else if 
 ( uQhxr != null) 
 {        WActivity.swashwork = "";
} 
 else 
 {        WActivity.ringlead =  false;
}
                      ++BpI40;
}
}
 else if 
 (6 <= WActivity.discounselled
) 
 {        if ( HeVS0 != null) {
                    if (! WActivity.ringlead 
) {
                    WActivity.ringlead =  true;

            } else {
                    HeVS0 = "";
}




            } else {
                    ++v6Pl7;
}



} 
 else 
 {        if ( WActivity.ringlead 
) {
                    HeVS0 = "prancings" ;

            } else {
                    v6Pl7++;
}



}
 if (! WActivity.ringlead 
) 
 {        if ( WActivity.ringlead 
) {
                    if (WActivity.benilda <= 8

) {
                    if ( HeVS0 == null
) {
                    WActivity.ringlead = false;

                     uQhxr = "scyphistomae" ;

                      ++BpI40;
}

                     WActivity.ringlead = true;

                      WActivity.ringlead = false;
}

            } else {
                    if ( WActivity.ringlead 
) {
                    ++v6Pl7;

                     WActivity.benilda--;

                      --BpI40;
}
}



}
 else if 
 ( WActivity.ringlead 
) 
 {
 if (BpI40 < v6Pl7

) 
 {        if ( WActivity.ringlead 
) {
                    WActivity.moonway = "countline" ;

                     BpI40 = 14;


                      WActivity.ringlead = true;
}
}
 else if 
 (! uQhxr .contains(HeVS0) ) 
 {        WActivity.ringlead = false;
} 
 else 
 {        WActivity.ringlead = true;
}} 
 else 
 {        if ( uQhxr != null) {
                    uQhxr = "";

                     HeVS0 = "noup" ;

                      WActivity.rebury = 10;
}
}
         
    }

     
    public  void interspiral(boolean YhXfi, boolean vaIPQ, int KVlm5) {
                if (2 == WActivity.rebury
) {
            
 if (KVlm5 != WActivity.benilda

) 
 {        if (! YhXfi 
) {
                    if (KVlm5 <= WActivity.rebury
) {
                    WActivity.swashwork = "xanthelasmoidea" ;

                     WActivity.benilda++;

                      ++WActivity.rebury;
}

                     YhXfi = ! false;

                      WActivity.inquietudes = "";
}
}
 else if 
 (KVlm5 != 3

) 
 {
 if ( vaIPQ 
) 
 {        WActivity.rebury++;
}
 else if 
 ( WActivity.inquietudes == null
) 
 {        vaIPQ = ! true;
} 
 else 
 {        WActivity.discounselled = 8;
}} 
 else 
 {        WActivity.inquietudes = "zelotypias" ;
}
             
 if ( WActivity.ringlead 
) 
 {        if (WActivity.rebury != KVlm5
) {
                    ++KVlm5;

                     WActivity.rebury--;

                      KVlm5 = 10;

}
}
 else if 
 (WActivity.benilda <= 0

) 
 {        --WActivity.discounselled;
} 
 else 
 {        KVlm5 = 13;

}
              
 if (WActivity.rebury <= 0

) 
 {        YhXfi = false;
}
 else if 
 ( YhXfi 
) 
 {        WActivity.inquietudes = "elastivity" ;
} 
 else 
 {        WActivity.inquietudes = "";
}}

         
    }

     
    public  void didymitis(String QSu1c) {
        
 if ( WActivity.swashwork .equals(QSu1c) ) 
 {        if ( WActivity.rouelle == null
) {
                    if ( WActivity.ringlead 
) {
            
 if (WActivity.discounselled <= WActivity.benilda

) 
 {        QSu1c = "lipsanotheca" ;
}
 else if 
 (WActivity.rebury <= WActivity.benilda

) 
 {        WActivity.moonway = "premonetory" ;
} 
 else 
 {        WActivity.inquietudes = "debonairity" ;
}
            } else {
                    WActivity.discounselled += 13;

}




                     if ( WActivity.inquietudes == null
) {
                    WActivity.swashwork = "Levittown" ;

                     ++WActivity.discounselled;

                      WActivity.discounselled = 10;

}

                      QSu1c = "";
}
}
 else if 
 ( WActivity.rouelle .equals("uvuloptosis") ) 
 {        if ( WActivity.ringlead 
) {
            
 if (7 > WActivity.benilda
) 
 {        WActivity.ringlead = ! false;
}
 else if 
 (WActivity.benilda > WActivity.discounselled

) 
 {        WActivity.discounselled--;
} 
 else 
 {        WActivity.ringlead = false;
}
                     ++WActivity.discounselled;

                      QSu1c = "grabouche" ;
}
} 
 else 
 {        if ( WActivity.rouelle == null
) {
                    WActivity.ringlead =  true;

            } else {
                    WActivity.ringlead = ! false;
}



}        WActivity.ringlead = false;
        WActivity.moonway = "nicety" ;

 if (WActivity.discounselled <= WActivity.rebury

) 
 {        if ( QSu1c .equals(WActivity.swashwork) ) {
                    WActivity.benilda = 1;


            } else {
                    if ( WActivity.moonway .isEmpty() ) {
                    WActivity.ringlead =  true;

            } else {
                    WActivity.benilda = 13;
}



}



}
 else if 
 (8 > WActivity.rebury
) 
 {        if ( WActivity.ringlead 
) {
            
 if (! WActivity.ringlead 
) 
 {        WActivity.rebury = 9;

}
 else if 
 (WActivity.benilda <= WActivity.benilda

) 
 {        --WActivity.benilda;
} 
 else 
 {        WActivity.ringlead = false;
}
                     QSu1c = "Watsonville" ;

                      WActivity.ringlead =  false;
}
} 
 else 
 {        WActivity.rebury--;
}        if (! WActivity.moonway .equals("subpellucidness") ) {
                    if (WActivity.discounselled == WActivity.discounselled

) {
                    WActivity.benilda = 12;


            } else {
                    if ( QSu1c == null
) {
                    WActivity.benilda = 11;


            } else {
                    WActivity.benilda--;
}



}




            } else {
                    if (WActivity.benilda != WActivity.discounselled

) {
            
 if ( WActivity.moonway .isEmpty() ) 
 {        WActivity.ringlead = false;
}
 else if 
 ( WActivity.ringlead 
) 
 {        WActivity.ringlead = false;
} 
 else 
 {        WActivity.benilda = 11;

}
            } else {
                    WActivity.benilda = 9;
}



}




         
    }

     
    public  void stourbridge(String fKi5M) {
        
 if ( WActivity.moonway != null) 
 {        if ( WActivity.swashwork .contains(WActivity.moonway) ) {
                    if ( WActivity.ringlead 
) {
            
 if (WActivity.discounselled <= WActivity.benilda
) 
 {        --WActivity.discounselled;
}
 else if 
 ( fKi5M != null) 
 {        WActivity.ringlead =  true;
} 
 else 
 {        WActivity.rebury = 2;

}
            } else {
                    WActivity.moonway = "";
}




                     if ( WActivity.ringlead 
) {
                    WActivity.ringlead =  true;

            } else {
                    fKi5M = "consignificative" ;
}




                      WActivity.swashwork = "";
}
}
 else if 
 ( WActivity.inquietudes .equals("semiabstractions") ) 
 {        fKi5M = "gentisein" ;
} 
 else 
 {        if ( WActivity.rouelle == null
) {
                    WActivity.inquietudes = "grewhound" ;

            } else {
                    fKi5M = "paraunter" ;
}



}
 if ( WActivity.inquietudes != null) 
 {        if ( fKi5M != null) {
                    if ( fKi5M .contains(WActivity.rouelle) ) {
                    if ( fKi5M == null
) {
                    WActivity.ringlead = false;

                     WActivity.ringlead = true;

                      WActivity.discounselled = 3;

}

            } else {
                    WActivity.moonway = "baffies" ;
}




                     if ( WActivity.inquietudes .trim().isEmpty() ) {
                    --WActivity.rebury;

                     WActivity.moonway = "splenocele" ;

                      WActivity.benilda = 9;
}

                      WActivity.discounselled--;
}
}
 else if 
 (WActivity.discounselled < WActivity.rebury
) 
 {        if ( WActivity.rouelle == null
) {
            
 if ( WActivity.swashwork != null) 
 {        WActivity.ringlead =  true;
}
 else if 
 (! WActivity.ringlead 
) 
 {        WActivity.swashwork = "miskal" ;
} 
 else 
 {        fKi5M = "";
}
                     ++WActivity.discounselled;

                      WActivity.discounselled--;
}
} 
 else 
 {
 if (10 > WActivity.rebury
) 
 {        ++WActivity.rebury;
}
 else if 
 (WActivity.rebury == WActivity.discounselled

) 
 {        WActivity.rouelle = "semidark" ;
} 
 else 
 {        WActivity.moonway = "";
}}        if ( WActivity.moonway != null) {
                    if ( WActivity.moonway == null
) {
                    --WActivity.discounselled;

                     fKi5M = "anisomelia" ;

                      ++WActivity.discounselled;
}

            } else {
                    if ( fKi5M .equals(WActivity.inquietudes) ) {
                    if ( WActivity.swashwork == null
) {
                    fKi5M = "";

            } else {
                    WActivity.rebury++;
}




            } else {
                    WActivity.ringlead = true;
}



}




         
    }

     
    public  void photoelectron(String NbnS1) {
        
 if ( WActivity.ringlead 
) 
 {
 if ( WActivity.rouelle == null
) 
 {
 if (WActivity.discounselled != WActivity.benilda
) 
 {        if (WActivity.discounselled != WActivity.rebury

) {
                    ++WActivity.benilda;

                     WActivity.benilda++;

                      WActivity.ringlead = true;
}
}
 else if 
 ( WActivity.inquietudes == null
) 
 {        WActivity.ringlead = true;
} 
 else 
 {        WActivity.ringlead =  false;
}}
 else if 
 ( WActivity.inquietudes == null
) 
 {
 if ( NbnS1 != null) 
 {        WActivity.swashwork = "Maglemosian" ;
}
 else if 
 ( WActivity.inquietudes == null
) 
 {        WActivity.benilda--;
} 
 else 
 {        WActivity.ringlead = false;
}} 
 else 
 {        WActivity.rebury = 6;
}}
 else if 
 ( NbnS1 == null
) 
 {        if (WActivity.discounselled <= 11

) {
                    if (WActivity.benilda < 14

) {
                    WActivity.ringlead = true;

            } else {
                    WActivity.benilda++;
}




                     WActivity.moonway = "adsorbate" ;

                      WActivity.ringlead = ! true;
}
} 
 else 
 {        if (WActivity.benilda <= WActivity.rebury
) {
                    WActivity.rouelle = "";

                     WActivity.ringlead =  true;

                      WActivity.rebury--;
}
}        if (WActivity.benilda > WActivity.discounselled

) {
            
 if (3 <= WActivity.rebury
) 
 {        if (! WActivity.rouelle .isEmpty() ) {
            
 if ( NbnS1 == null
) 
 {        WActivity.discounselled = 11;
}
 else if 
 ( NbnS1 != null) 
 {        NbnS1 = "";
} 
 else 
 {        WActivity.swashwork = "doorlike" ;
}
                     WActivity.ringlead =  true;

                      WActivity.benilda++;
}
}
 else if 
 ( WActivity.rouelle == null
) 
 {
 if ( WActivity.ringlead 
) 
 {        WActivity.ringlead =  false;
}
 else if 
 ( WActivity.inquietudes != null) 
 {        WActivity.rouelle = "";
} 
 else 
 {        NbnS1 = "";
}} 
 else 
 {        WActivity.rebury = 1;
}
            } else {
            
 if ( WActivity.inquietudes != null) 
 {        WActivity.ringlead = true;
}
 else if 
 (5 != WActivity.rebury
) 
 {        WActivity.moonway = "drumroll" ;
} 
 else 
 {        WActivity.rouelle = "";
}}



        if ( WActivity.inquietudes == null
) {
                    if ( WActivity.moonway != null) {
            
 if (8 > WActivity.discounselled
) 
 {
 if ( WActivity.inquietudes != null) 
 {        WActivity.discounselled = 6;

}
 else if 
 ( NbnS1 != null) 
 {        WActivity.discounselled++;
} 
 else 
 {        WActivity.ringlead = false;
}}
 else if 
 ( NbnS1 == null
) 
 {        NbnS1 = "semillon" ;
} 
 else 
 {        WActivity.ringlead =  false;
}
            } else {
                    if ( WActivity.ringlead 
) {
                    ++WActivity.discounselled;

            } else {
                    WActivity.rebury++;
}



}




            } else {
            
 if ( WActivity.swashwork == null
) 
 {        if ( WActivity.moonway != null) {
                    WActivity.ringlead = true;

            } else {
                    NbnS1 = "presprinkled" ;
}



}
 else if 
 (9 == WActivity.rebury
) 
 {        WActivity.discounselled = 2;

} 
 else 
 {        WActivity.rebury = 3;

}}




         
    }

     
    public  void incompatiblenesses(boolean PIg31) {
                if (WActivity.rebury < WActivity.rebury
) {
            
 if (WActivity.rebury <= 3

) 
 {        if ( WActivity.inquietudes .isEmpty() ) {
            
 if (! PIg31 
) 
 {        WActivity.inquietudes = "premonetary" .trim();
}
 else if 
 (WActivity.benilda > 6

) 
 {        WActivity.inquietudes = "apptd" ;
} 
 else 
 {        WActivity.swashwork = "";
}
            } else {
                    WActivity.swashwork = "biloculine" ;
}



}
 else if 
 ( WActivity.moonway == null
) 
 {        if (! WActivity.moonway .equals("unpragmatic") ) {
                    PIg31 = true;

                     PIg31 = false;

                      WActivity.inquietudes = "";
}
} 
 else 
 {        PIg31 = true;
}
                     if ( WActivity.rouelle != null) {
                    if ( WActivity.rouelle != null) {
                    WActivity.ringlead =  false;

                     WActivity.swashwork = "complines" ;

                      PIg31 =  true;
}

            } else {
                    WActivity.swashwork = "unperpendicular" ;
}




                      if (13 > WActivity.discounselled
) {
                    WActivity.rebury = 2;

            } else {
                    PIg31 = true;
}



}

 if (3 <= WActivity.benilda
) 
 {        if (WActivity.rebury <= WActivity.discounselled

) {
                    if ( WActivity.rouelle == null
) {
            
 if ( WActivity.moonway == null
) 
 {        WActivity.benilda += 8;

}
 else if 
 ( WActivity.moonway .isEmpty() ) 
 {        PIg31 =  true;
} 
 else 
 {        PIg31 =  true;
}
            } else {
                    ++WActivity.benilda;
}




            } else {
                    if (WActivity.discounselled > WActivity.discounselled
) {
                    WActivity.swashwork = "trapeziform" ;

                     PIg31 = false;

                      ++WActivity.rebury;
}
}



}
 else if 
 ( PIg31 
) 
 {
 if (WActivity.benilda < WActivity.rebury

) 
 {        if ( WActivity.inquietudes != null) {
                    --WActivity.rebury;

            } else {
                    PIg31 = false;
}



}
 else if 
 ( WActivity.rouelle == null
) 
 {        WActivity.ringlead = false;
} 
 else 
 {        PIg31 = true;
}} 
 else 
 {        if (13 <= WActivity.rebury
) {
                    WActivity.rebury = 2;

                     WActivity.discounselled = 9;

                      PIg31 = true;
}
}        if ( WActivity.moonway .contains(WActivity.rouelle) ) {
                    if (WActivity.benilda <= WActivity.discounselled
) {
                    if ( WActivity.swashwork .equals("trailery") ) {
            
 if (! WActivity.ringlead 
) 
 {        PIg31 = true;
}
 else if 
 (5 < WActivity.rebury
) 
 {        PIg31 = true;
} 
 else 
 {        WActivity.rouelle = "";
}
                     PIg31 =  true;

                      WActivity.moonway = "humorful" ;
}

            } else {
                    if (WActivity.benilda <= 6

) {
                    PIg31 =  false;

                     WActivity.inquietudes = "";

                      WActivity.rebury--;
}
}




                     if (WActivity.rebury <= WActivity.discounselled
) {
            
 if ( WActivity.swashwork != null) 
 {        WActivity.inquietudes = "";
}
 else if 
 ( WActivity.swashwork == null
) 
 {        PIg31 = false;
} 
 else 
 {        WActivity.benilda--;
}
                     --WActivity.benilda;

                      WActivity.rouelle = "repineful" ;
}

                      if (3 == WActivity.rebury
) {
                    WActivity.benilda = 10;


            } else {
                    WActivity.moonway = "";
}



}
        WActivity.ringlead =  false;
        if (WActivity.discounselled != 2

) {
                    WActivity.rebury++;

                     if ( PIg31 
) {
                    if ( WActivity.swashwork == null
) {
                    ++WActivity.discounselled;

            } else {
                    PIg31 = true;
}




            } else {
                    WActivity.rouelle = "";
}




                      if ( WActivity.moonway == null
) {
                    WActivity.discounselled = 2;


            } else {
                    WActivity.swashwork = "intersection" ;
}



}

         
    }

     
    public  void transversocubital(int Gei52, int A5qAL, boolean jFQNs, int NtD1p) {
                if (A5qAL < WActivity.benilda

) {
            
 if ( WActivity.inquietudes != null) 
 {
 if ( WActivity.rouelle .contains("timbertuned") ) 
 {        if (NtD1p == 14

) {
                    WActivity.inquietudes = "";

            } else {
                    WActivity.moonway = "bothidae" ;
}



}
 else if 
 ( WActivity.moonway != null) 
 {        Gei52++;
} 
 else 
 {        WActivity.rouelle = "";
}}
 else if 
 (A5qAL != A5qAL

) 
 {        WActivity.swashwork = "";
} 
 else 
 {        ++Gei52;
}
            } else {
                    if (! WActivity.ringlead 
) {
                    if ( WActivity.inquietudes == null
) {
                    WActivity.ringlead =  false;

            } else {
                    WActivity.swashwork = "radiocommunication" ;
}




                     jFQNs = true;

                      WActivity.ringlead = true;
}
}




         
    }

     
    public  void perspectival(int CZohP) {
        
 if (WActivity.discounselled <= WActivity.benilda

) 
 {
 if ( WActivity.inquietudes != null) 
 {
 if (CZohP == CZohP
) 
 {        if ( WActivity.ringlead 
) {
                    CZohP--;

            } else {
                    CZohP = 5;

}



}
 else if 
 ( WActivity.moonway == null
) 
 {        WActivity.moonway = "";
} 
 else 
 {        WActivity.moonway = "";
}}
 else if 
 ( WActivity.inquietudes == null
) 
 {        if ( WActivity.ringlead 
) {
                    WActivity.ringlead = ! false;

                     WActivity.benilda = 4;

                      WActivity.ringlead = ! false;
}
} 
 else 
 {        WActivity.ringlead = false;
}}
 else if 
 ( WActivity.ringlead 
) 
 {        if ( WActivity.ringlead 
) {
            
 if ( WActivity.rouelle == null
) 
 {        WActivity.ringlead = ! true;
}
 else if 
 ( WActivity.swashwork .contains(WActivity.moonway) ) 
 {        WActivity.rebury = 14;

} 
 else 
 {        CZohP--;
}
                     WActivity.ringlead = true;

                      WActivity.swashwork = "grecianizing" ;
}
} 
 else 
 {
 if (WActivity.benilda == WActivity.discounselled
) 
 {        WActivity.swashwork = "unawakened" ;
}
 else if 
 ( WActivity.rouelle != null) 
 {        WActivity.inquietudes = "reptile" ;
} 
 else 
 {        ++CZohP;
}}        if ( WActivity.rouelle != null) {
                    if ( WActivity.moonway == null
) {
            
 if ( WActivity.inquietudes == null
) 
 {        if ( WActivity.ringlead 
) {
                    WActivity.ringlead = true;

            } else {
                    CZohP = 10;
}



}
 else if 
 (12 == WActivity.discounselled
) 
 {        WActivity.ringlead =  true;
} 
 else 
 {        WActivity.ringlead = true;
}
                     if ( WActivity.inquietudes .contains("myxochondrosarcoma") ) {
                    WActivity.ringlead = false;

            } else {
                    WActivity.swashwork = "";
}




                      WActivity.moonway = "diplacuses" ;
}

                     if ( WActivity.swashwork != null) {
            
 if ( WActivity.ringlead 
) 
 {        WActivity.ringlead = true;
}
 else if 
 (CZohP < 7

) 
 {        WActivity.ringlead = true;
} 
 else 
 {        WActivity.ringlead =  false;
}
            } else {
                    WActivity.discounselled--;
}




                      WActivity.ringlead =  false;
}
        WActivity.discounselled = 12;


 if ( WActivity.inquietudes != null) 
 {        if ( WActivity.moonway != null) {
                    if (! WActivity.ringlead 
) {
                    if ( WActivity.moonway != null) {
                    WActivity.moonway = "";

            } else {
                    WActivity.ringlead =  false;
}




            } else {
                    WActivity.inquietudes = "withertip" ;
}




            } else {
                    if ( WActivity.moonway != null) {
                    WActivity.moonway = "";

            } else {
                    WActivity.inquietudes = "Twitt" ;
}



}



}
 else if 
 ( WActivity.swashwork != null) 
 {        if ( WActivity.rouelle .equals(WActivity.moonway) ) {
            
 if (CZohP == CZohP
) 
 {        WActivity.ringlead =  true;
}
 else if 
 ( WActivity.swashwork != null) 
 {        WActivity.discounselled--;
} 
 else 
 {        CZohP += 8;

}
                     WActivity.ringlead = true;

                      ++CZohP;
}
} 
 else 
 {        if ( WActivity.inquietudes != null) {
                    WActivity.ringlead = false;

            } else {
                    WActivity.swashwork = "unabatedly" ;
}



}        if ( WActivity.inquietudes .isEmpty() ) {
                    if ( WActivity.inquietudes .contains(WActivity.moonway) ) {
                    if (! WActivity.rouelle .toLowerCase().equals("unexceptionableness") ) {
                    if ( WActivity.rouelle == null
) {
                    WActivity.ringlead = ! true;

                     --CZohP;

                      CZohP -= 10;

}

                     CZohP--;

                      WActivity.ringlead =  false;
}

            } else {
                    if ( WActivity.moonway != null) {
                    WActivity.rouelle = "laevigating" ;

            } else {
                    WActivity.discounselled = 1;

}



}




            } else {
                    if (CZohP <= WActivity.discounselled
) {
                    if ( WActivity.swashwork != null) {
                    WActivity.rouelle = "achaetous" ;

                     CZohP--;

                      WActivity.ringlead = true;
}

                     WActivity.ringlead = true;

                      WActivity.ringlead = true;
}
}




         
    }

     }
