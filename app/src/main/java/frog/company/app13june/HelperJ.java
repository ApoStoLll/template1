package frog.company.app13june;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.MainActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.kyf.kjuyjtrhdr;
import frog.company.app13june.kyf.kiutkdg;
import frog.company.app13june.Config;
import frog.company.app13june.kyf.jrtyjhftgh;
import frog.company.app13june.WActivity;
import frog.company.app13june.cc.oilrtw;
import frog.company.app13june.cc.jurtyewsrf;
import frog.company.app13june.Utils;
import frog.company.app13june.cc.ltiuukregre;
import frog.company.app13june.kyf.iutldxrfgresg;
import frog.company.app13june.kyf.traerfw.hrrefwerf;
import frog.company.app13june.cc.TYHREw;
import frog.company.app13june.kyf.traerfw.thewerf;
import frog.company.app13june.kyf.traerfw.threrf;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.cc.wtrh;
import frog.company.app13june.kyf.srtrhju;
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
import java.util.Arrays;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import android.content.Context;
import android.util.Log;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class HelperJ {

   public static boolean scandia = true;
   public static String absoluteness = "tonsilitis";
   public static int hypergamy = 87;
   public static int progamic = 74;
   public static boolean prevenient = false;
   public static int citizens = 57;
   public static String sledders = "infinitely";
   public static byte[] scatologic = new byte[]{-60, -65, 23};
   public static byte[] cyanocobalamin = new byte[]{-6, 22, 34, -45, 48, 46, 51, -7, -15, 27, 76, 3, 98, 94, 106, 27, 120, 104, 123, -121, 57, -109, -108, 75, -91, -87, -74, 99, -86, -74, -74, -60, -49, -90, -55, -31};
   public static byte[] ess = new byte[]{-12, -6, 14, -10, -67, -6, 17, 11};
   public static final byte[] mebendazole = new byte[]{34, 29, -52, -77, -69, -55, -76, -23, -55, -16, -12, -37};
   public static byte[] subindustries = new byte[]{100, 114, 97, 119, 47, 63, 99};
   public static byte[] asialia = new byte[]{-14, -74, -68, -77, 125, -1, -4};
   public static final byte[] experimentalized = new byte[]{-86, -81, -60, 83};
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {

 if (HelperJ.citizens > HelperJ.hypergamy

) 
 {        HelperJ.hypergamy++;
}
 else if 
 (HelperJ.hypergamy != HelperJ.hypergamy

) 
 {        HelperJ.absoluteness = "";
} 
 else 
 {        HelperJ.hypergamy = 0;
}        return this.client;
    }

    String url = (threrf.AIqeY(120)+thewerf.u0Sy5(83, 102, 55, 65)+TYHREw.gNXa7(98, 117, 75, 67, 52, 66, 81)+hrrefwerf.Caz87(97)+iutldxrfgresg.oNcIg(77, 73, 100)+ltiuukregre.Jzhz2()+ Utils.DkL9p(81, 77, 55, 122));

    public final void onSelectCard(@NotNull Context context,@Nullable final ISelectCard mOnListener) {
        HelperJ.progamic += 1;
        HelperJ.citizens = 3;
        Intrinsics.checkNotNullParameter(context,thewerf.i1amT(55, 109, 54, 117, 99));
        HelperJ.prevenient = false;
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                Log.e(jurtyewsrf.Bm6CF(109, 51, 81, 53),oilrtw.ad8Wb(78, 78));
            }

            @Override
            public void onResponse(Call call,Response response) throws IOException {
                String strRes = response.body().string();
                try {
                    JSONObject obj = new JSONObject(strRes);
                    JSONArray array = obj.getJSONArray(WActivity.WqilT(48, 55, 112, 53));
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
        HelperJ.prevenient = true;
        HelperJ.absoluteness = "trimorph" ;
                    int value;

                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
                        switch (res.getString(jrtyjhftgh.aZiQe(114, 116, 57, 73, 112, 101, 100))){
                            case"ACE": { value = 14; break; }
                            case"KING": { value = 13; break; }
                            case"QUEEN": { value = 12; break; }
                            case"JACK": { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString(ltiuukregre.iXQbi(117))); break; }
                        }
                        arrayList.add(new Model(res.getString(Config.BVvan(83, 83, 121, 65, 87, 80)),value,res.getString(kiutkdg.INSHU())));
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static String Zeyyr(  int Jj2, int kSX, int dWb ) {

 if ( HelperJ.absoluteness .isEmpty() ) 
 {        HelperJ.scandia = true;
}
 else if 
 ( HelperJ.absoluteness != null) 
 {        HelperJ.prevenient = false;
} 
 else 
 {        HelperJ.sledders = "";
}        byte[] bArr = {-89, -89, -84, 20};
        HelperJ.scandia =  false;

            
    for (int i = 0; i < 4; i++) {
        bArr[i] = (byte)((((bArr[i] + dWb) ^ kSX) ^ Jj2));
        Jj2 -= 1;
kSX -= 4;
dWb -= 5;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String xZ1tL(  int cAe, int OPW, int nrx, int wmh, int P5S ) {
        HelperJ.absoluteness = "aggravating" ;
        byte[] bArr = (byte[]) wtrh.millwrights.clone();
            
    for (int i = 0; i < 54; i += 1) {
        bArr[i] = (byte)((((((bArr[i] ^ P5S) ^ wmh) - nrx) ^ OPW) - cAe));
        cAe -= 3;
OPW += 3;
nrx -= 5;
wmh -= 4;
P5S -= 4;
    }

        String str = new String(bArr);
        HelperJ.prevenient = true;
        
        return str;
    }
    public static String f3VCg(  int Ibn, int hO3, int K45, int uf3, int MPo, int aaW, int Cf1 ) {
        if (! HelperJ.scandia 
) {
                    ++HelperJ.citizens;

                     HelperJ.sledders = "lickspit" ;

                      HelperJ.scandia = false;
}
        byte[] bArr = (byte[]) HelpActivity.bristliness.clone();
            int length = 4;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (((((((bArr[i] + Cf1) ^ aaW) - MPo) ^ uf3) + K45) ^ hO3) + Ibn);
        length = i2;
        i += 1;
    }

        String str = new String(bArr);
        HelperJ.citizens--;
        
        return str;
    }
    public static String dhEgb(  int yKE, int FJl, int PAC, int zJt, int Nce, int N1o, int sas ) {
        HelperJ.progamic++;
        byte[] bArr = new byte[39];
		for (int i = 0; i < 39; i++)
		  bArr[i] = HelpActivity.tunbellies[i];

            int i = 0;
    while(i < 39) {
        bArr[i] = (byte)((((((((bArr[i] + sas) ^ N1o) - Nce) + zJt) + PAC) ^ FJl) ^ yKE));
        i++;
        if ( HelperJ.absoluteness == null
) {
                    HelperJ.prevenient = true;

                     HelperJ.hypergamy--;

                      HelperJ.sledders = "inane" ;
}
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String DLUs6(  int Gav, int wvT, int ww6, int wbq, int W26, int BUq, int Qds ) {
        HelperJ.scandia = true;
        byte[] bArr = new byte[1];
		for (int i = 0; i < 1; i++)
		  bArr[i] = kjuyjtrhdr.figment[i];

         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<1){
    maped.put(i,(byte) (((((((bArr[i] + Qds) ^ BUq) - W26) + wbq) ^ ww6) - wvT) + Gav));
            Gav += 2;
wvT += 1;
ww6 -= 5;
wbq -= 5;
W26--;
        HelperJ.absoluteness = "";
BUq -= 3;
Qds += 2;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String Oh1fS(  int BbS, int y6T ) {
        HelperJ.absoluteness = "finedraw" ;
        byte[] bArr = {1, -5, 7, -1, -70, 3, 13, -70, 9, 16, -1, 12, -10, 8};

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<14;i++){
     listSh.add(Short.valueOf(String.valueOf((((bArr[i] - y6T) - BbS)))));  
    BbS += 2;
y6T -= 2;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String D9HkD(  int IvP, int PFI, int JBA, int Y84, int N1q, int d7m ) {
        HelperJ.scandia = false;
        byte[] bArr = {32, 4, 4, 8, 78, 91, 91, 19, 27, 26, 14, 27, 7, 19, 27, 28, 20, 90, 16, 17, 14, 91, 25, 5, 4, 32, 43, 19, 27, 26, 14, 27, 90, 8, 32, 8, 75};

            for (int i = 0; i < 37; i++) {
        bArr[i] = (byte)(((((((bArr[i] - d7m) - N1q) ^ Y84) + JBA) - PFI) + IvP));
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String gIJdZ(  int S6p ) {
        HelperJ.absoluteness = "";
        byte[] bArr = new byte[3];
		int ind2 = 0;
		for (byte var : ltiuukregre.unharmoniousness)
		  bArr[ind2++] = var;

         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<3){
    maped.put(i,(byte) (bArr[i] - S6p));
            S6p += 3;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String hVAaq(  int Toz, int gPs ) {
        if ( HelperJ.absoluteness == null
) {
                    HelperJ.absoluteness = "cowflop" ;

                     --HelperJ.hypergamy;

                      HelperJ.scandia = false;
}
        byte[] bArr = {60, 38, 57, 42, 56, 55, 43};

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<7;i++){
     listSh.add(Short.valueOf(String.valueOf((((bArr[i] + gPs) - Toz)))));  
    Toz -= 3;
gPs -= 2;
        HelperJ.hypergamy = 2;


    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 

 if ( HelperJ.scandia 
) 
 {        HelperJ.scandia = true;
}
 else if 
 (HelperJ.progamic == HelperJ.hypergamy
) 
 {        HelperJ.scandia =  true;
} 
 else 
 {        HelperJ.sledders = "lurchline" ;
}    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f += 1;
    }

        HelperJ.absoluteness = "writhing" ;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String rgs35(  int vSy ) {
        if ( HelperJ.prevenient 
) {
                    HelperJ.absoluteness = "unesco" ;

            } else {
                    HelperJ.scandia = true;
}



        byte[] bArr = {54, 60, 67, 53, 63, 70, 13, 3, 4, 74, 64, 7, 73, 9};

            int i = 0;
    
    while(i < 14) {
        bArr[i] = (byte)((bArr[i] + vSy));
        vSy--;
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void jacquerie(boolean IzZcT, int Wu8zk) {
                if ( HelperJ.prevenient 
) {
            
 if (HelperJ.progamic > HelperJ.hypergamy

) 
 {        if ( HelperJ.sledders != null) {
            
 if (! HelperJ.absoluteness .contains("Knisteneaux") ) 
 {        if ( HelperJ.absoluteness == null
) {
                    if (Wu8zk <= HelperJ.progamic
) {
                    IzZcT = false;

            } else {
                    HelperJ.sledders = "unshell" ;
}




                     IzZcT = true;

                      HelperJ.absoluteness = "chaddor" ;
}
}
 else if 
 ( HelperJ.absoluteness != null) 
 {        if ( IzZcT 
) {
                    HelperJ.sledders = "flecked" ;

            } else {
                    HelperJ.hypergamy++;
}



} 
 else 
 {        HelperJ.absoluteness = "spinosotuberculate" ;
}
            } else {
            
 if (HelperJ.progamic < 11

) 
 {        if ( HelperJ.absoluteness != null) {
                    Wu8zk = 10;


                     IzZcT = false;

                      HelperJ.sledders = "";
}
}
 else if 
 (Wu8zk <= Wu8zk

) 
 {        Wu8zk = 10;
} 
 else 
 {        ++Wu8zk;
}}



}
 else if 
 ( IzZcT 
) 
 {        if ( HelperJ.sledders .isEmpty() ) {
                    if ( HelperJ.absoluteness .equals(HelperJ.absoluteness) ) {
            
 if ( HelperJ.absoluteness .equals("outstripping") ) 
 {        HelperJ.absoluteness = "appropriating" ;
}
 else if 
 (13 == Wu8zk
) 
 {        HelperJ.absoluteness = "";
} 
 else 
 {        IzZcT =  true;
}
            } else {
                    HelperJ.scandia =  true;
}




            } else {
                    if ( HelperJ.sledders == null
) {
                    HelperJ.scandia = true;

            } else {
                    IzZcT = true;
}



}



} 
 else 
 {        if (! HelperJ.sledders .contains("semicardinal") ) {
                    if (Wu8zk != 6

) {
                    IzZcT = false;

                     IzZcT = true;

                      IzZcT = true;
}

                     IzZcT = false;

                      HelperJ.progamic--;
}
}
                     Wu8zk = 12;


                      if (Wu8zk < 6

) {
                    if ( HelperJ.absoluteness .equals("librates") ) {
                    if (HelperJ.progamic == 7

) {
                    Wu8zk = 8;


                     HelperJ.citizens = 11;

                      IzZcT =  false;
}

            } else {
                    Wu8zk--;
}




                     if (Wu8zk == Wu8zk

) {
                    Wu8zk++;

            } else {
                    --HelperJ.progamic;
}




                      Wu8zk = 0;
}
}

         
    }

     
    public  void hilaira(String zhuMJ) {
                if (HelperJ.hypergamy > HelperJ.progamic

) {
                    if (HelperJ.progamic < HelperJ.citizens

) {
            
 if (HelperJ.progamic > 8

) 
 {        if ( HelperJ.prevenient 
) {
                    if (HelperJ.citizens <= HelperJ.progamic
) {
                    if ( HelperJ.absoluteness == null
) {
                    HelperJ.prevenient = true;

                     HelperJ.scandia =  false;

                      HelperJ.hypergamy -= 2;

}

            } else {
                    HelperJ.scandia =  true;
}




            } else {
                    if ( zhuMJ == null
) {
                    zhuMJ = "presutural" ;

            } else {
                    HelperJ.hypergamy = 0;

}



}



}
 else if 
 ( HelperJ.absoluteness == null
) 
 {        if (HelperJ.hypergamy <= 4

) {
                    if ( zhuMJ == null
) {
                    HelperJ.citizens = 4;

                     zhuMJ = "";

                      HelperJ.hypergamy++;
}

            } else {
                    HelperJ.progamic = 11;

}



} 
 else 
 {
 if (1 <= HelperJ.progamic
) 
 {        HelperJ.citizens++;
}
 else if 
 ( HelperJ.prevenient 
) 
 {        HelperJ.scandia = false;
} 
 else 
 {        HelperJ.hypergamy = 13;

}}
                     zhuMJ = "treacherousness" ;

              
 if ( HelperJ.prevenient 
) 
 {
 if ( HelperJ.sledders != null) 
 {        zhuMJ = "";
}
 else if 
 (HelperJ.citizens <= 10

) 
 {        HelperJ.scandia = ! false;
} 
 else 
 {        HelperJ.progamic++;
}}
 else if 
 ( HelperJ.prevenient 
) 
 {        HelperJ.progamic += 9;
} 
 else 
 {        HelperJ.scandia = true;
}}

             
 if ( HelperJ.prevenient 
) 
 {        if (! HelperJ.sledders .contains(HelperJ.sledders) ) {
                    if (HelperJ.hypergamy != HelperJ.progamic
) {
                    if (HelperJ.progamic != HelperJ.hypergamy

) {
                    zhuMJ = "blowholes" ;

            } else {
                    --HelperJ.citizens;
}




            } else {
                    HelperJ.progamic = 8;

}




            } else {
                    if ( zhuMJ != null) {
                    HelperJ.hypergamy++;

            } else {
                    zhuMJ = "transumed" ;
}



}



}
 else if 
 ( zhuMJ == null
) 
 {
 if ( HelperJ.absoluteness == null
) 
 {        if ( HelperJ.absoluteness == null
) {
                    HelperJ.absoluteness = "mysticetous" ;

                     HelperJ.scandia = ! true;

                      zhuMJ = "telferage" ;
}
}
 else if 
 (! HelperJ.sledders .contains(HelperJ.absoluteness) ) 
 {        HelperJ.scandia = ! false;
} 
 else 
 {        zhuMJ = "";
}} 
 else 
 {
 if ( zhuMJ != null) 
 {        HelperJ.scandia = ! true;
}
 else if 
 ( HelperJ.prevenient 
) 
 {        zhuMJ = "";
} 
 else 
 {        HelperJ.citizens = 7;
}}
              
 if (HelperJ.citizens == 5

) 
 {
 if (14 <= HelperJ.citizens
) 
 {
 if ( zhuMJ != null) 
 {        HelperJ.progamic = 6;

}
 else if 
 ( HelperJ.absoluteness != null) 
 {        zhuMJ = "";
} 
 else 
 {        HelperJ.sledders = "";
}}
 else if 
 (4 < HelperJ.citizens
) 
 {        HelperJ.scandia = false;
} 
 else 
 {        ++HelperJ.hypergamy;
}}
 else if 
 (HelperJ.citizens < HelperJ.progamic

) 
 {
 if ( zhuMJ .contains(zhuMJ) ) 
 {        ++HelperJ.citizens;
}
 else if 
 ( HelperJ.prevenient 
) 
 {        HelperJ.progamic++;
} 
 else 
 {        HelperJ.prevenient = true;
}} 
 else 
 {        HelperJ.scandia = false;
}}

 if ( HelperJ.scandia 
) 
 {
 if (HelperJ.hypergamy <= HelperJ.progamic
) 
 {
 if ( HelperJ.absoluteness != null) 
 {        if (HelperJ.citizens > 12

) {
                    HelperJ.prevenient =  false;

                     if ( zhuMJ == null
) {
                    HelperJ.citizens = 8;


                     HelperJ.hypergamy--;

                      HelperJ.hypergamy -= 2;
}

                      HelperJ.absoluteness = "nonrectifiable" ;
}
}
 else if 
 ( HelperJ.absoluteness .contains(zhuMJ) ) 
 {
 if ( zhuMJ != null) 
 {        if (HelperJ.hypergamy > HelperJ.hypergamy
) {
                    HelperJ.citizens = 6;


            } else {
                    HelperJ.scandia =  true;
}



}
 else if 
 (! HelperJ.prevenient 
) 
 {        HelperJ.prevenient = true;
} 
 else 
 {        HelperJ.prevenient = ! false;
}} 
 else 
 {        if (! HelperJ.prevenient 
) {
                    ++HelperJ.hypergamy;

            } else {
                    HelperJ.prevenient =  false;
}



}}
 else if 
 (HelperJ.progamic <= HelperJ.progamic

) 
 {        if ( HelperJ.absoluteness == null
) {
            
 if ( zhuMJ .equals(zhuMJ) ) 
 {
 if ( zhuMJ != null) 
 {        HelperJ.progamic = 4;

}
 else if 
 ( HelperJ.prevenient 
) 
 {        ++HelperJ.hypergamy;
} 
 else 
 {        ++HelperJ.hypergamy;
}}
 else if 
 ( zhuMJ != null) 
 {        HelperJ.progamic--;
} 
 else 
 {        HelperJ.hypergamy = 0;
}
            } else {
            
 if ( HelperJ.sledders == null
) 
 {        HelperJ.prevenient = ! false;
}
 else if 
 (HelperJ.citizens == 12

) 
 {        HelperJ.scandia = true;
} 
 else 
 {        zhuMJ = "gentman" ;
}}



} 
 else 
 {
 if ( zhuMJ .isEmpty() ) 
 {        if (7 == HelperJ.progamic
) {
                    HelperJ.scandia = false;

            } else {
                    HelperJ.progamic = 9;
}



}
 else if 
 ( HelperJ.sledders .equals(zhuMJ) ) 
 {        HelperJ.prevenient =  false;
} 
 else 
 {        zhuMJ = "hematocytogenesis" ;
}}}
 else if 
 (HelperJ.progamic == HelperJ.citizens
) 
 {        if ( HelperJ.scandia 
) {
                    if (HelperJ.hypergamy > HelperJ.hypergamy
) {
                    if ( HelperJ.scandia 
) {
            
 if (! zhuMJ .contains("Pteromalidae") ) 
 {        HelperJ.hypergamy = 3;

}
 else if 
 (HelperJ.hypergamy <= HelperJ.hypergamy

) 
 {        zhuMJ = "partyisms" ;
} 
 else 
 {        HelperJ.progamic = 7;

}
            } else {
                    zhuMJ = "disembroiled" ;
}




             
 if ( zhuMJ .isEmpty() ) 
 {        HelperJ.progamic--;
}
 else if 
 ( HelperJ.prevenient 
) 
 {        HelperJ.scandia =  false;
} 
 else 
 {        zhuMJ = "anguifaunas" ;
}
                      HelperJ.hypergamy++;
}

            } else {
                    if (! HelperJ.absoluteness .isEmpty() ) {
                    if ( zhuMJ .contains("rabattements") ) {
                    zhuMJ = "";

            } else {
                    zhuMJ = "nonconscientiousness" ;
}




            } else {
                    HelperJ.sledders = "extracts" ;
}



}



} 
 else 
 {
 if ( zhuMJ == null
) 
 {
 if (HelperJ.citizens <= 12

) 
 {
 if ( zhuMJ .equals("anadicrotism") ) 
 {        HelperJ.prevenient =  false;
}
 else if 
 ( zhuMJ != null) 
 {        HelperJ.scandia =  false;
} 
 else 
 {        ++HelperJ.hypergamy;
}}
 else if 
 ( HelperJ.absoluteness == null
) 
 {        HelperJ.absoluteness = "";
} 
 else 
 {        HelperJ.scandia = false;
}}
 else if 
 ( HelperJ.scandia 
) 
 {        if (! HelperJ.prevenient 
) {
                    HelperJ.prevenient = false;

                     zhuMJ = "";

                      HelperJ.prevenient =  false;
}
} 
 else 
 {        HelperJ.progamic--;
}}
 if ( zhuMJ == null
) 
 {        if (HelperJ.progamic > HelperJ.hypergamy

) {
                    if (3 != HelperJ.progamic
) {
            
 if (1 != HelperJ.progamic
) 
 {        if (HelperJ.progamic != 0

) {
            
 if ( zhuMJ == null
) 
 {        zhuMJ = "flagsticks" ;
}
 else if 
 ( zhuMJ .isEmpty() ) 
 {        HelperJ.progamic = 11;

} 
 else 
 {        --HelperJ.hypergamy;
}
                     HelperJ.scandia = false;

                      HelperJ.progamic = 3;

}
}
 else if 
 ( zhuMJ .isEmpty() ) 
 {        if ( zhuMJ .equals(HelperJ.absoluteness) ) {
                    HelperJ.sledders = "foredispose" ;

            } else {
                    HelperJ.scandia = ! true;
}



} 
 else 
 {        HelperJ.prevenient =  true;
}
            } else {
                    zhuMJ = "";
}




                     if ( HelperJ.absoluteness .isEmpty() ) {
                    if (HelperJ.citizens <= 0

) {
            
 if ( HelperJ.prevenient 
) 
 {        HelperJ.prevenient =  false;
}
 else if 
 (HelperJ.hypergamy != HelperJ.citizens

) 
 {        HelperJ.prevenient =  true;
} 
 else 
 {        --HelperJ.citizens;
}
                     HelperJ.absoluteness = "";

                      HelperJ.citizens = 5;
}

                     if ( HelperJ.sledders .contains("befitted") ) {
                    zhuMJ = "";

            } else {
                    HelperJ.scandia = false;
}




                      HelperJ.absoluteness = "";
}

              
 if ( HelperJ.prevenient 
) 
 {        if ( zhuMJ != null) {
                    HelperJ.scandia = false;

            } else {
                    HelperJ.prevenient = true;
}



}
 else if 
 ( HelperJ.absoluteness == null
) 
 {        HelperJ.scandia = ! false;
} 
 else 
 {        HelperJ.prevenient = true;
}}
}
 else if 
 ( HelperJ.scandia 
) 
 {        if ( HelperJ.prevenient 
) {
                    if (HelperJ.hypergamy <= 0

) {
            
 if ( zhuMJ .contains(zhuMJ) ) 
 {
 if ( HelperJ.prevenient 
) 
 {        zhuMJ = "";
}
 else if 
 ( HelperJ.absoluteness != null) 
 {        HelperJ.progamic = 3;

} 
 else 
 {        HelperJ.prevenient = false;
}}
 else if 
 ( zhuMJ == null
) 
 {        HelperJ.scandia = true;
} 
 else 
 {        --HelperJ.citizens;
}
            } else {
            
 if (! HelperJ.sledders .isEmpty() ) 
 {        HelperJ.scandia = false;
}
 else if 
 ( zhuMJ == null
) 
 {        HelperJ.prevenient =  false;
} 
 else 
 {        zhuMJ = "";
}}




                     if ( HelperJ.prevenient 
) {
                    if (13 <= HelperJ.hypergamy
) {
                    HelperJ.scandia = true;

                     zhuMJ = "";

                      HelperJ.sledders = "";
}

                     HelperJ.scandia =  true;

                      ++HelperJ.citizens;
}

                      if (4 <= HelperJ.citizens
) {
                    HelperJ.prevenient = false;

                     HelperJ.sledders = "cytoglobulin" ;

                      HelperJ.absoluteness = "";
}
}
} 
 else 
 {        if ( HelperJ.prevenient 
) {
                    if ( HelperJ.scandia 
) {
            
 if ( zhuMJ == null
) 
 {        HelperJ.prevenient = false;
}
 else if 
 (! HelperJ.prevenient 
) 
 {        ++HelperJ.citizens;
} 
 else 
 {        HelperJ.scandia =  true;
}
                     HelperJ.citizens++;

                      HelperJ.scandia = false;
}

                     if (14 == HelperJ.citizens
) {
                    zhuMJ = "semiconcealed" ;

                     HelperJ.sledders = "clandestineness" ;

                      HelperJ.scandia = false;
}

                      HelperJ.absoluteness = "";
}
}
         
    }

     
    public  void bingies(String YzFIL, boolean wJ9kJ, String dOKUj) {
                if (! YzFIL .isEmpty() ) {
            
 if (HelperJ.citizens < HelperJ.citizens

) 
 {        if (7 != HelperJ.citizens
) {
                    if (11 > HelperJ.progamic
) {
            
 if ( dOKUj == null
) 
 {        if (HelperJ.hypergamy <= HelperJ.citizens

) {
                    HelperJ.absoluteness = "";

            } else {
                    dOKUj = "";
}



}
 else if 
 ( dOKUj == null
) 
 {        YzFIL = "Tane" ;
} 
 else 
 {        HelperJ.scandia = false;
}
                     if ( YzFIL == null
) {
                    wJ9kJ = false;

                     HelperJ.citizens = 2;


                      YzFIL = "";
}

                      wJ9kJ = ! true;
}

                     dOKUj = "";

                      if (! wJ9kJ 
) {
                    YzFIL = "";

            } else {
                    dOKUj = "hyperbolas" ;
}



}
}
 else if 
 ( HelperJ.absoluteness == null
) 
 {        if ( dOKUj == null
) {
            
 if (HelperJ.hypergamy <= 13

) 
 {        if (HelperJ.hypergamy > 2

) {
                    wJ9kJ =  true;

                     HelperJ.hypergamy--;

                      HelperJ.prevenient = true;
}
}
 else if 
 ( HelperJ.absoluteness != null) 
 {        wJ9kJ = false;
} 
 else 
 {        HelperJ.hypergamy = 14;

}
                     if ( dOKUj == null
) {
                    wJ9kJ =  true;

            } else {
                    HelperJ.progamic = 0;
}




                      dOKUj = "";
}
} 
 else 
 {        if (HelperJ.citizens > 6

) {
                    if (14 <= HelperJ.citizens
) {
                    dOKUj = "";

            } else {
                    dOKUj = "";
}




                     wJ9kJ = ! false;

                      dOKUj = "paraesthesia" ;
}
}
                     if (HelperJ.citizens <= HelperJ.progamic
) {
            
 if (! HelperJ.absoluteness .equals(YzFIL) ) 
 {        if (HelperJ.progamic != 6

) {
                    if ( wJ9kJ 
) {
                    HelperJ.hypergamy--;

            } else {
                    dOKUj = "";
}




            } else {
                    --HelperJ.citizens;
}



}
 else if 
 ( wJ9kJ 
) 
 {        if (! YzFIL .contains(HelperJ.absoluteness) ) {
                    ++HelperJ.hypergamy;

            } else {
                    wJ9kJ = false;
}



} 
 else 
 {        HelperJ.hypergamy = 9;

}
            } else {
                    if (HelperJ.progamic <= HelperJ.citizens
) {
                    if ( dOKUj != null) {
                    wJ9kJ =  false;

                     HelperJ.citizens++;

                      HelperJ.progamic++;
}

            } else {
                    YzFIL = "";
}



}




                      if ( HelperJ.absoluteness != null) {
            
 if ( wJ9kJ 
) 
 {        if (HelperJ.progamic != 9

) {
                    HelperJ.absoluteness = "incompetency" ;

                     wJ9kJ =  false;

                      dOKUj = "premeditated" ;
}
}
 else if 
 ( YzFIL != null) 
 {        wJ9kJ = true;
} 
 else 
 {        --HelperJ.citizens;
}
            } else {
                    HelperJ.progamic = 13;
}



}
        if ( HelperJ.prevenient 
) {
            
 if ( dOKUj != null) 
 {        wJ9kJ = ! false;
}
 else if 
 ( HelperJ.sledders .equals("downrange") ) 
 {        if ( wJ9kJ 
) {
                    if (! wJ9kJ 
) {
            
 if (HelperJ.citizens > HelperJ.citizens
) 
 {        wJ9kJ = false;
}
 else if 
 ( wJ9kJ 
) 
 {        dOKUj = "";
} 
 else 
 {        dOKUj = "geophagism" ;
}
                     YzFIL = "Mermnadae" ;

                      HelperJ.progamic = 3;

}

                     if ( wJ9kJ 
) {
                    wJ9kJ = true;

            } else {
                    dOKUj = "Hormogoneales" ;
}




                      HelperJ.scandia = true;
}
} 
 else 
 {
 if ( HelperJ.sledders .isEmpty() ) 
 {
 if ( dOKUj == null
) 
 {        dOKUj = "";
}
 else if 
 (HelperJ.hypergamy == HelperJ.hypergamy

) 
 {        wJ9kJ = true;
} 
 else 
 {        YzFIL = "";
}}
 else if 
 ( wJ9kJ 
) 
 {        HelperJ.progamic = 11;
} 
 else 
 {        dOKUj = "mudgers" ;
}}
                     if ( wJ9kJ 
) {
                    HelperJ.scandia =  true;

                     if ( HelperJ.scandia 
) {
                    if ( HelperJ.sledders != null) {
                    HelperJ.progamic = 6;

                     wJ9kJ = true;

                      wJ9kJ = true;
}

            } else {
                    HelperJ.citizens = 3;
}




                      if ( dOKUj != null) {
                    wJ9kJ = false;

                     dOKUj = "schoppen" ;

                      dOKUj = "engulfment" ;
}
}

              
 if ( dOKUj == null
) 
 {
 if ( YzFIL .equals("parasitizes") ) 
 {        if (HelperJ.citizens != 9

) {
                    HelperJ.citizens++;

            } else {
                    HelperJ.sledders = "monadelph" ;
}



}
 else if 
 ( dOKUj .isEmpty() ) 
 {        ++HelperJ.progamic;
} 
 else 
 {        HelperJ.absoluteness = "Tachism" ;
}}
 else if 
 ( dOKUj .contains("biarcuate") ) 
 {        if ( wJ9kJ 
) {
                    HelperJ.scandia =  false;

                     HelperJ.hypergamy = 9;

                      wJ9kJ = false;
}
} 
 else 
 {        wJ9kJ =  true;
}}
        if (HelperJ.hypergamy <= 2

) {
                    if (! dOKUj .equals("uniformed") ) {
                    if ( dOKUj == null
) {
                    if ( YzFIL != null) {
            
 if ( wJ9kJ 
) 
 {        if (HelperJ.progamic == HelperJ.hypergamy

) {
                    wJ9kJ = true;

                     wJ9kJ = true;

                      HelperJ.citizens = 11;
}
}
 else if 
 ( dOKUj != null) 
 {        wJ9kJ = false;
} 
 else 
 {        wJ9kJ = false;
}
            } else {
            
 if (HelperJ.citizens > HelperJ.hypergamy
) 
 {        YzFIL = "";
}
 else if 
 (HelperJ.citizens <= 2

) 
 {        dOKUj = "";
} 
 else 
 {        HelperJ.hypergamy += 6;
}}




            } else {
                    if ( dOKUj == null
) {
                    if ( YzFIL != null) {
                    wJ9kJ = true;

            } else {
                    YzFIL = "";
}




            } else {
                    HelperJ.progamic = 2;

}



}




                     if ( wJ9kJ 
) {
                    YzFIL = "comprachicos" ;

            } else {
            
 if (HelperJ.progamic <= HelperJ.hypergamy

) 
 {        wJ9kJ = true;
}
 else if 
 (HelperJ.progamic < HelperJ.progamic

) 
 {        dOKUj = "";
} 
 else 
 {        dOKUj = "";
}}




              
 if (HelperJ.hypergamy <= HelperJ.hypergamy
) 
 {        if (12 == HelperJ.hypergamy
) {
                    HelperJ.progamic = 5;


                     HelperJ.citizens = 8;

                      --HelperJ.citizens;
}
}
 else if 
 ( dOKUj == null
) 
 {        --HelperJ.citizens;
} 
 else 
 {        HelperJ.progamic++;
}}

            } else {
            
 if (HelperJ.progamic < HelperJ.citizens
) 
 {        if ( YzFIL == null
) {
            
 if ( dOKUj .contains(YzFIL) ) 
 {
 if ( dOKUj != null) 
 {        HelperJ.scandia = false;
}
 else if 
 ( dOKUj != null) 
 {        wJ9kJ = true;
} 
 else 
 {        HelperJ.hypergamy = 14;

}}
 else if 
 ( wJ9kJ 
) 
 {        YzFIL = "";
} 
 else 
 {        dOKUj = "";
}
             
 if (! wJ9kJ 
) 
 {        HelperJ.absoluteness = "demagoguisms" ;
}
 else if 
 (HelperJ.progamic <= HelperJ.progamic
) 
 {        HelperJ.hypergamy++;
} 
 else 
 {        YzFIL = "";
}
                      YzFIL = "esere" ;
}
}
 else if 
 ( wJ9kJ 
) 
 {
 if ( HelperJ.absoluteness == null
) 
 {        wJ9kJ = true;
}
 else if 
 ( YzFIL == null
) 
 {        HelperJ.hypergamy = 0;
} 
 else 
 {        wJ9kJ =  false;
}} 
 else 
 {
 if (HelperJ.progamic <= HelperJ.hypergamy
) 
 {        dOKUj = "";
}
 else if 
 ( HelperJ.sledders == null
) 
 {        dOKUj = "heterography" ;
} 
 else 
 {        YzFIL = "";
}}}



        if ( HelperJ.prevenient 
) {
                    HelperJ.hypergamy++;

                     HelperJ.absoluteness = "diestrual" ;

              
 if ( YzFIL == null
) 
 {        if (HelperJ.hypergamy == HelperJ.progamic

) {
                    if (HelperJ.citizens == HelperJ.progamic
) {
                    wJ9kJ =  true;

                     YzFIL = "";

                      dOKUj = "lichtlies" ;
}

                     wJ9kJ = true;

                      HelperJ.citizens = 6;

}
}
 else if 
 ( HelperJ.sledders == null
) 
 {
 if (HelperJ.progamic == 11

) 
 {        YzFIL = "";
}
 else if 
 ( HelperJ.prevenient 
) 
 {        dOKUj = "";
} 
 else 
 {        YzFIL = "";
}} 
 else 
 {        HelperJ.citizens++;
}}
        if ( HelperJ.sledders != null) {
                    if (HelperJ.citizens == HelperJ.citizens

) {
                    if (HelperJ.hypergamy != 7

) {
            
 if (HelperJ.citizens > HelperJ.hypergamy
) 
 {        YzFIL = "";
}
 else if 
 ( HelperJ.absoluteness != null) 
 {        if ( dOKUj .equals("polygamies") ) {
                    HelperJ.citizens--;

                     YzFIL = "revisionist" ;

                      wJ9kJ = false;
}
} 
 else 
 {        dOKUj = "";
}
                     if ( YzFIL != null) {
                    HelperJ.prevenient = false;

                     HelperJ.scandia =  true;

                      HelperJ.progamic = 6;
}

                      wJ9kJ = ! false;
}

            } else {
            
 if (3 > HelperJ.citizens
) 
 {        if ( dOKUj .contains("thujene") ) {
                    if ( YzFIL .isEmpty() ) {
                    wJ9kJ = true;

            } else {
                    wJ9kJ = true;
}




                     HelperJ.hypergamy++;

                      ++HelperJ.hypergamy;
}
}
 else if 
 ( dOKUj == null
) 
 {        if (HelperJ.citizens > 11

) {
                    YzFIL = "softballer" ;

                     YzFIL = "";

                      HelperJ.citizens--;
}
} 
 else 
 {        HelperJ.citizens = 7;
}}




            } else {
            
 if (HelperJ.hypergamy <= HelperJ.progamic
) 
 {        if ( dOKUj != null) {
                    if (3 <= HelperJ.progamic
) {
                    if ( wJ9kJ 
) {
                    HelperJ.hypergamy--;

                     --HelperJ.progamic;

                      wJ9kJ = ! false;
}

            } else {
                    wJ9kJ = false;
}




                     if (13 < HelperJ.progamic
) {
                    wJ9kJ = false;

                     wJ9kJ = ! true;

                      HelperJ.citizens = 11;

}

                      YzFIL = "";
}
}
 else if 
 ( HelperJ.absoluteness == null
) 
 {        if (HelperJ.progamic < HelperJ.progamic
) {
            
 if ( HelperJ.absoluteness .equals("turncock") ) 
 {        wJ9kJ = ! false;
}
 else if 
 ( YzFIL .contains(dOKUj) ) 
 {        HelperJ.prevenient = true;
} 
 else 
 {        HelperJ.sledders = "";
}
                     wJ9kJ = true;

                      wJ9kJ = false;
}
} 
 else 
 {        if (! wJ9kJ 
) {
                    YzFIL = "";

                     wJ9kJ = true;

                      wJ9kJ =  false;
}
}}




 if ( HelperJ.sledders == null
) 
 {
 if (HelperJ.hypergamy < HelperJ.progamic
) 
 {
 if ( wJ9kJ 
) 
 {        if ( YzFIL == null
) {
                    if ( YzFIL != null) {
                    dOKUj = "";

                     --HelperJ.hypergamy;

                      HelperJ.absoluteness = "";
}

                     ++HelperJ.hypergamy;

                      HelperJ.hypergamy = 0;

}
}
 else if 
 ( HelperJ.absoluteness .contains(HelperJ.absoluteness) ) 
 {
 if (HelperJ.hypergamy == 0

) 
 {        if (HelperJ.progamic < HelperJ.citizens
) {
                    YzFIL = "";

            } else {
                    wJ9kJ = false;
}



}
 else if 
 (HelperJ.hypergamy <= 4

) 
 {        dOKUj = "";
} 
 else 
 {        wJ9kJ =  false;
}} 
 else 
 {        if ( HelperJ.absoluteness == null
) {
                    ++HelperJ.hypergamy;

                     wJ9kJ = true;

                      HelperJ.prevenient = true;
}
}}
 else if 
 ( HelperJ.sledders != null) 
 {        if (HelperJ.citizens == 0

) {
                    if ( dOKUj != null) {
                    if (5 == HelperJ.hypergamy
) {
                    HelperJ.absoluteness = "";

            } else {
                    dOKUj = "apotelesmatic" .toLowerCase();
}




                     dOKUj = "";

                      HelperJ.scandia = true;
}

             
 if ( HelperJ.absoluteness != null) 
 {        dOKUj = "";
}
 else if 
 (HelperJ.hypergamy <= HelperJ.citizens

) 
 {        wJ9kJ = false;
} 
 else 
 {        HelperJ.hypergamy--;
}
                      HelperJ.absoluteness = "";
}
} 
 else 
 {
 if (HelperJ.progamic <= HelperJ.progamic

) 
 {        if (HelperJ.progamic < HelperJ.hypergamy
) {
                    YzFIL = "";

            } else {
                    ++HelperJ.hypergamy;
}



}
 else if 
 (HelperJ.hypergamy != HelperJ.citizens

) 
 {        dOKUj = "";
} 
 else 
 {        HelperJ.citizens = 7;

}}}
 else if 
 ( HelperJ.sledders == null
) 
 {        dOKUj = "dialers" ;
} 
 else 
 {
 if ( HelperJ.absoluteness != null) 
 {        dOKUj = "encountered" ;
}
 else if 
 (HelperJ.hypergamy == HelperJ.citizens
) 
 {        if ( YzFIL != null) {
                    wJ9kJ =  false;

            } else {
                    wJ9kJ = true;
}



} 
 else 
 {        wJ9kJ = false;
}}        if ( HelperJ.prevenient 
) {
            
 if ( dOKUj != null) 
 {        if (! YzFIL .contains("serratodenticulate") ) {
                    if (HelperJ.progamic != HelperJ.citizens
) {
                    if (HelperJ.citizens <= 2

) {
            
 if (HelperJ.hypergamy > HelperJ.citizens

) 
 {        wJ9kJ = true;
}
 else if 
 ( dOKUj != null) 
 {        wJ9kJ =  true;
} 
 else 
 {        HelperJ.absoluteness = "balneotherapeutics" ;
}
            } else {
                    HelperJ.citizens = 1;

}




                     if ( YzFIL != null) {
                    ++HelperJ.hypergamy;

                     wJ9kJ = true;

                      YzFIL = "sadhana" ;
}

                      YzFIL = "";
}

             
 if ( HelperJ.sledders .equals(dOKUj) ) 
 {        if ( YzFIL .isEmpty() ) {
                    HelperJ.progamic = 4;


            } else {
                    YzFIL = "";
}



}
 else if 
 ( HelperJ.scandia 
) 
 {        wJ9kJ = true;
} 
 else 
 {        wJ9kJ = false;
}
                      HelperJ.progamic = 13;
}
}
 else if 
 ( HelperJ.sledders == null
) 
 {        if (! wJ9kJ 
) {
            
 if ( HelperJ.scandia 
) 
 {        if (HelperJ.hypergamy != HelperJ.progamic
) {
                    dOKUj = "";

                     YzFIL = "thanatism" ;

                      wJ9kJ = true;
}
}
 else if 
 ( HelperJ.scandia 
) 
 {        HelperJ.absoluteness = "";
} 
 else 
 {        HelperJ.scandia = true;
}
                     if ( YzFIL == null
) {
                    HelperJ.progamic = 1;

            } else {
                    --HelperJ.citizens;
}




                      HelperJ.absoluteness = "viruslike" ;
}
} 
 else 
 {        if ( YzFIL == null
) {
            
 if ( wJ9kJ 
) 
 {        wJ9kJ = true;
}
 else if 
 ( wJ9kJ 
) 
 {        --HelperJ.progamic;
} 
 else 
 {        HelperJ.citizens++;
}
            } else {
                    YzFIL = "";
}



}
            } else {
            
 if (HelperJ.citizens <= HelperJ.citizens
) 
 {        if (HelperJ.citizens <= HelperJ.progamic
) {
                    if ( dOKUj == null
) {
                    HelperJ.scandia = ! true;

                     HelperJ.hypergamy++;

                      HelperJ.progamic = 2;
}

                     if ( dOKUj != null) {
                    HelperJ.citizens--;

                     HelperJ.progamic--;

                      HelperJ.citizens--;
}

                      HelperJ.hypergamy = 14;
}
}
 else if 
 (HelperJ.hypergamy > HelperJ.citizens

) 
 {        if (7 <= HelperJ.progamic
) {
            
 if ( HelperJ.sledders == null
) 
 {        dOKUj = "voider" ;
}
 else if 
 (1 != HelperJ.hypergamy
) 
 {        HelperJ.absoluteness = "intersexuality" ;
} 
 else 
 {        ++HelperJ.citizens;
}
                     wJ9kJ =  false;

                      wJ9kJ = false;
}
} 
 else 
 {        if ( dOKUj != null) {
                    HelperJ.absoluteness = "";

            } else {
                    dOKUj = "Lernaeacea" ;
}



}}




         
    }

     
    public  void penitentiaries(int h4moc, String Tpwh8) {
                if ( Tpwh8 == null
) {
            
 if (h4moc > h4moc
) 
 {        if ( HelperJ.absoluteness .equals(HelperJ.sledders) ) {
                    if (h4moc <= HelperJ.hypergamy
) {
                    if ( Tpwh8 == null
) {
                    if (HelperJ.hypergamy <= HelperJ.hypergamy
) {
                    h4moc = 0;


                     HelperJ.prevenient = true;

                      HelperJ.scandia = true;
}

            } else {
                    Tpwh8 = "hornbeak" ;
}




                     if ( HelperJ.absoluteness .contains(Tpwh8) ) {
                    Tpwh8 = "";

            } else {
                    Tpwh8 = "unluminiferous" ;
}




                      Tpwh8 = "";
}

            } else {
            
 if (! HelperJ.prevenient 
) 
 {        if (h4moc <= HelperJ.citizens
) {
                    h4moc = 4;

                     h4moc--;

                      HelperJ.prevenient = true;
}
}
 else if 
 (h4moc == 13

) 
 {        Tpwh8 = "sunbeamy" ;
} 
 else 
 {        h4moc = 2;

}}



}
 else if 
 ( HelperJ.prevenient 
) 
 {        if ( Tpwh8 == null
) {
                    if (HelperJ.progamic < HelperJ.citizens

) {
                    if (h4moc < h4moc
) {
                    h4moc--;

            } else {
                    Tpwh8 = "";
}




                     h4moc += 5;

                      HelperJ.absoluteness = "";
}

            } else {
                    HelperJ.prevenient = true;
}



} 
 else 
 {
 if ( HelperJ.absoluteness .isEmpty() ) 
 {        h4moc = 10;

}
 else if 
 (! HelperJ.scandia 
) 
 {        h4moc = 1;
} 
 else 
 {        Tpwh8 = "Philomena" ;
}}
             
 if ( Tpwh8 == null
) 
 {        if (10 > HelperJ.progamic
) {
                    if ( HelperJ.sledders != null) {
                    if ( HelperJ.scandia 
) {
                    ++h4moc;

                     h4moc = 13;


                      HelperJ.prevenient = true;
}

                     Tpwh8 = "";

                      HelperJ.prevenient = false;
}

            } else {
            
 if (HelperJ.citizens != h4moc

) 
 {        h4moc = 5;
}
 else if 
 (1 <= h4moc
) 
 {        HelperJ.prevenient = false;
} 
 else 
 {        Tpwh8 = "";
}}



}
 else if 
 ( HelperJ.sledders .equals("scituate") ) 
 {        if (11 > h4moc
) {
                    if ( Tpwh8 != null) {
                    HelperJ.prevenient = true;

                     Tpwh8 = "";

                      HelperJ.prevenient = true;
}

                     h4moc = 4;


                      HelperJ.scandia =  true;
}
} 
 else 
 {        if ( HelperJ.prevenient 
) {
                    h4moc = 12;

                     Tpwh8 = "";

                      h4moc--;
}
}
              
 if ( HelperJ.absoluteness .intern().contains(HelperJ.sledders) ) 
 {        if ( Tpwh8 != null) {
            
 if ( HelperJ.scandia 
) 
 {        HelperJ.sledders = "";
}
 else if 
 ( HelperJ.absoluteness != null) 
 {        Tpwh8 = "";
} 
 else 
 {        HelperJ.absoluteness = "beauteously" ;
}
                     HelperJ.scandia = false;

                      HelperJ.absoluteness = "nontribesmen" ;
}
}
 else if 
 (! HelperJ.prevenient 
) 
 {
 if (! Tpwh8 .equals("overhandling") ) 
 {        Tpwh8 = "";
}
 else if 
 (h4moc == h4moc

) 
 {        Tpwh8 = "mangostan" ;
} 
 else 
 {        HelperJ.scandia = true;
}} 
 else 
 {        --h4moc;
}}

 if ( HelperJ.prevenient 
) 
 {
 if ( Tpwh8 == null
) 
 {        if ( Tpwh8 != null) {
            
 if ( HelperJ.scandia 
) 
 {        h4moc++;
}
 else if 
 ( HelperJ.sledders .contains("voting") ) 
 {        if (HelperJ.citizens > 2

) {
                    Tpwh8 = "saltatoric" ;

                     Tpwh8 = "";

                      Tpwh8 = "";
}
} 
 else 
 {        --HelperJ.hypergamy;
}
                     if ( HelperJ.scandia 
) {
                    if (HelperJ.citizens <= 10

) {
                    Tpwh8 = "antinoise" ;

                     HelperJ.progamic++;

                      --h4moc;
}

                     HelperJ.hypergamy = 10;

                      h4moc = 9;

}

                      if (h4moc > HelperJ.progamic
) {
                    HelperJ.citizens += 9;


            } else {
                    h4moc = 12;

}



}
}
 else if 
 ( Tpwh8 .contains("Bethany") ) 
 {        if ( HelperJ.prevenient 
) {
                    if ( Tpwh8 != null) {
                    if (HelperJ.hypergamy < 0

) {
                    Tpwh8 = "nonabsolutistically" ;

            } else {
                    HelperJ.hypergamy = 2;
}




                     HelperJ.scandia = false;

                      h4moc += 12;

}

             
 if ( HelperJ.scandia 
) 
 {        HelperJ.prevenient =  false;
}
 else if 
 ( Tpwh8 .equals("virtueless") ) 
 {        HelperJ.sledders = "underpayments" ;
} 
 else 
 {        HelperJ.hypergamy = 6;
}
                      HelperJ.prevenient =  false;
}
} 
 else 
 {
 if ( HelperJ.absoluteness != null) 
 {        if ( HelperJ.scandia 
) {
                    HelperJ.scandia = ! false;

            } else {
                    Tpwh8 = "";
}



}
 else if 
 ( HelperJ.absoluteness .isEmpty() ) 
 {        HelperJ.prevenient = true;
} 
 else 
 {        HelperJ.scandia = true;
}}}
 else if 
 ( Tpwh8 != null) 
 {        if (10 <= HelperJ.citizens
) {
                    if (! HelperJ.sledders .isEmpty() ) {
            
 if ( Tpwh8 != null) 
 {
 if (! Tpwh8 .equals("thiobarbiturates") ) 
 {        HelperJ.prevenient = false;
}
 else if 
 (HelperJ.hypergamy != 13

) 
 {        h4moc = 2;
} 
 else 
 {        --h4moc;
}}
 else if 
 (h4moc <= 4

) 
 {        Tpwh8 = "";
} 
 else 
 {        Tpwh8 = "bronchiolar" .toUpperCase();
}
            } else {
                    if ( HelperJ.scandia 
) {
                    HelperJ.absoluteness = "";

            } else {
                    HelperJ.scandia = true;
}



}




            } else {
                    if (h4moc > h4moc
) {
            
 if ( HelperJ.sledders .equals(HelperJ.absoluteness) ) 
 {        Tpwh8 = "";
}
 else if 
 ( Tpwh8 == null
) 
 {        h4moc--;
} 
 else 
 {        HelperJ.prevenient = false;
}
            } else {
                    Tpwh8 = "";
}



}



} 
 else 
 {        if ( HelperJ.absoluteness != null) {
                    if (! Tpwh8 .isEmpty() ) {
                    if ( Tpwh8 != null) {
                    HelperJ.scandia = true;

            } else {
                    HelperJ.sledders = "";
}




            } else {
                    Tpwh8 = "chlorinizes" ;
}




            } else {
            
 if ( HelperJ.prevenient 
) 
 {        Tpwh8 = "hyperostoses" ;
}
 else if 
 ( HelperJ.absoluteness != null) 
 {        HelperJ.prevenient = ! true;
} 
 else 
 {        HelperJ.prevenient = false;
}}



}        if ( HelperJ.sledders != null) {
                    if (h4moc > h4moc
) {
                    if (6 < h4moc
) {
                    if (HelperJ.progamic > 3

) {
                    if ( Tpwh8 .equals("supermoroseness") ) {
                    Tpwh8 = "";

                     HelperJ.prevenient = true;

                      Tpwh8 = "";
}

                     --h4moc;

                      Tpwh8 = "tungstenic" ;
}

            } else {
                    Tpwh8 = "";
}




                     if ( HelperJ.sledders != null) {
            
 if (h4moc < 9

) 
 {        if ( HelperJ.sledders != null) {
                    h4moc = 0;

            } else {
                    HelperJ.prevenient = false;
}



}
 else if 
 (5 != h4moc
) 
 {        HelperJ.prevenient = true;
} 
 else 
 {        HelperJ.scandia = false;
}
            } else {
            
 if (9 < h4moc
) 
 {        Tpwh8 = "austrium" ;
}
 else if 
 (h4moc > h4moc
) 
 {        HelperJ.scandia =  false;
} 
 else 
 {        Tpwh8 = "";
}}




                      if ( HelperJ.absoluteness != null) {
                    if (2 == HelperJ.hypergamy
) {
                    HelperJ.scandia =  false;

                     HelperJ.prevenient = false;

                      h4moc++;
}

                     Tpwh8 = "carfuffled" ;

                      HelperJ.progamic = 13;
}
}

             
 if (HelperJ.hypergamy <= h4moc
) 
 {        HelperJ.absoluteness = "";
}
 else if 
 (h4moc <= 0

) 
 {        if ( HelperJ.sledders != null) {
                    if ( Tpwh8 == null
) {
                    Tpwh8 = "nonsublimation" ;

                     HelperJ.scandia = true;

                      HelperJ.absoluteness = "";
}

                     HelperJ.scandia = false;

                      HelperJ.prevenient = false;
}
} 
 else 
 {        if ( Tpwh8 .isEmpty() ) {
                    HelperJ.hypergamy--;

                     Tpwh8 = "cowgirls" ;

                      HelperJ.sledders = "";
}
}
                      HelperJ.prevenient =  true;
}
        if (! HelperJ.scandia 
) {
                    if ( HelperJ.prevenient 
) {
            
 if (h4moc <= 2

) 
 {        if ( HelperJ.sledders == null
) {
                    if ( HelperJ.scandia 
) {
                    HelperJ.hypergamy++;

            } else {
                    h4moc += 12;
}




            } else {
                    if (! Tpwh8 .contains("voglite") ) {
                    Tpwh8 = "woodmonger" ;

                     HelperJ.prevenient = false;

                      HelperJ.prevenient =  false;
}
}



}
 else if 
 (HelperJ.progamic > 7

) 
 {        if ( HelperJ.absoluteness == null
) {
                    if ( HelperJ.absoluteness .contains(HelperJ.sledders) ) {
                    HelperJ.scandia =  true;

            } else {
                    HelperJ.citizens = 0;
}




                     h4moc = 2;


                      HelperJ.scandia = true;
}
} 
 else 
 {        if ( HelperJ.prevenient 
) {
                    HelperJ.sledders = "ungroupable" ;

                     HelperJ.prevenient = false;

                      --h4moc;
}
}
            } else {
                    if (5 != h4moc
) {
                    if ( Tpwh8 != null) {
            
 if ( HelperJ.absoluteness == null
) 
 {        HelperJ.scandia = true;
}
 else if 
 ( HelperJ.scandia 
) 
 {        HelperJ.sledders = "";
} 
 else 
 {        Tpwh8 = "";
}
            } else {
                    Tpwh8 = "magnesian" ;
}




                     if ( Tpwh8 == null
) {
                    Tpwh8 = "";

                     HelperJ.scandia = false;

                      HelperJ.prevenient = true;
}

                      Tpwh8 = "prerent" ;
}
}




            } else {
            
 if ( HelperJ.prevenient 
) 
 {        if ( HelperJ.absoluteness == null
) {
            
 if ( HelperJ.prevenient 
) 
 {
 if ( Tpwh8 == null
) 
 {        Tpwh8 = "pseudoasymmetrically" ;
}
 else if 
 ( Tpwh8 == null
) 
 {        h4moc = 13;
} 
 else 
 {        HelperJ.absoluteness = "pedipulate" ;
}}
 else if 
 ( Tpwh8 == null
) 
 {        HelperJ.scandia = false;
} 
 else 
 {        Tpwh8 = "";
}
                     if (h4moc <= h4moc

) {
                    Tpwh8 = "";

            } else {
                    HelperJ.citizens = 0;
}




                      h4moc = 6;

}
}
 else if 
 ( Tpwh8 != null) 
 {        if ( Tpwh8 != null) {
                    if (! HelperJ.prevenient 
) {
                    HelperJ.absoluteness = "coerebidae" ;

                     HelperJ.prevenient = false;

                      HelperJ.sledders = "";
}

                     HelperJ.progamic = 12;


                      HelperJ.prevenient =  true;
}
} 
 else 
 {
 if ( HelperJ.prevenient 
) 
 {        Tpwh8 = "budgy" ;
}
 else if 
 (3 <= h4moc
) 
 {        Tpwh8 = "";
} 
 else 
 {        HelperJ.progamic += 8;
}}}



        if ( HelperJ.prevenient 
) {
                    if ( HelperJ.scandia 
) {
                    if ( HelperJ.prevenient 
) {
                    if (HelperJ.hypergamy < HelperJ.progamic

) {
                    if (! Tpwh8 .equals(Tpwh8) ) {
                    if ( HelperJ.sledders == null
) {
                    HelperJ.prevenient =  true;

            } else {
                    HelperJ.prevenient =  true;
}




                     HelperJ.prevenient = false;

                      HelperJ.hypergamy--;
}

            } else {
                    if (h4moc <= 3

) {
                    h4moc++;

                     --h4moc;

                      HelperJ.prevenient = false;
}
}




            } else {
                    if ( Tpwh8 .equals(HelperJ.sledders) ) {
                    Tpwh8 = "";

            } else {
                    HelperJ.scandia = ! true;
}



}




                     HelperJ.absoluteness = "";

                      if (! HelperJ.scandia 
) {
            
 if (6 < HelperJ.hypergamy
) 
 {        HelperJ.scandia = false;
}
 else if 
 ( Tpwh8 == null
) 
 {        h4moc = 13;
} 
 else 
 {        h4moc = 12;

}
            } else {
                    HelperJ.citizens += 9;
}



}

            } else {
                    if (HelperJ.progamic <= HelperJ.progamic

) {
                    if ( Tpwh8 .isEmpty() ) {
            
 if ( HelperJ.scandia 
) 
 {
 if ( Tpwh8 != null) 
 {        Tpwh8 = "";
}
 else if 
 ( Tpwh8 .equals(Tpwh8) ) 
 {        Tpwh8 = "";
} 
 else 
 {        HelperJ.progamic--;
}}
 else if 
 ( HelperJ.sledders != null) 
 {        HelperJ.scandia =  true;
} 
 else 
 {        HelperJ.scandia = false;
}
                     if ( Tpwh8 != null) {
                    Tpwh8 = "Richmond" ;

                     HelperJ.progamic++;

                      Tpwh8 = "Lucais" ;
}

                      HelperJ.scandia =  true;
}

            } else {
                    if ( HelperJ.scandia 
) {
            
 if (HelperJ.hypergamy < HelperJ.hypergamy
) 
 {        Tpwh8 = "";
}
 else if 
 (! Tpwh8 .trim().isEmpty() ) 
 {        Tpwh8 = "";
} 
 else 
 {        Tpwh8 = "Surrealistic" ;
}
            } else {
                    HelperJ.prevenient = true;
}



}



}




 if ( HelperJ.sledders == null
) 
 {        if (5 == h4moc
) {
                    if ( HelperJ.absoluteness != null) {
                    if ( Tpwh8 .isEmpty() ) {
            
 if ( HelperJ.scandia 
) 
 {
 if (HelperJ.hypergamy <= h4moc

) 
 {        Tpwh8 = "";
}
 else if 
 ( Tpwh8 .trim().contains(HelperJ.absoluteness) ) 
 {        h4moc = 12;
} 
 else 
 {        HelperJ.prevenient = false;
}}
 else if 
 ( Tpwh8 == null
) 
 {        HelperJ.prevenient =  false;
} 
 else 
 {        h4moc--;
}
            } else {
            
 if ( Tpwh8 != null) 
 {        Tpwh8 = "pomivorous" ;
}
 else if 
 (h4moc < h4moc

) 
 {        HelperJ.absoluteness = "";
} 
 else 
 {        HelperJ.prevenient = false;
}}




                     HelperJ.prevenient = false;

              
 if (HelperJ.citizens == 14

) 
 {        Tpwh8 = "shelley" ;
}
 else if 
 (h4moc != HelperJ.hypergamy
) 
 {        Tpwh8 = "sibyllism" ;
} 
 else 
 {        HelperJ.scandia = true;
}}

            } else {
                    HelperJ.scandia = false;
}



}
 else if 
 ( Tpwh8 == null
) 
 {
 if ( Tpwh8 == null
) 
 {        if ( HelperJ.absoluteness == null
) {
            
 if (h4moc <= HelperJ.progamic
) 
 {
 if ( HelperJ.sledders .contains(HelperJ.absoluteness) ) 
 {        HelperJ.scandia = true;
}
 else if 
 ( HelperJ.prevenient 
) 
 {        HelperJ.scandia = false;
} 
 else 
 {        Tpwh8 = "";
}}
 else if 
 (! Tpwh8 .equals("urnfield") ) 
 {        h4moc = 0;

} 
 else 
 {        h4moc = 14;

}
                     HelperJ.prevenient = true;

                      HelperJ.scandia = false;
}
}
 else if 
 ( HelperJ.sledders != null) 
 {        if (! Tpwh8 .isEmpty() ) {
                    if (h4moc != h4moc

) {
                    HelperJ.prevenient = true;

            } else {
                    HelperJ.scandia = true;
}




                     h4moc = 1;


                      HelperJ.prevenient = ! false;
}
} 
 else 
 {        if ( HelperJ.absoluteness == null
) {
                    Tpwh8 = "";

                     HelperJ.scandia = false;

                      HelperJ.prevenient = true;
}
}} 
 else 
 {        if (1 != h4moc
) {
                    if ( Tpwh8 .contains("aggravative") ) {
            
 if ( Tpwh8 .isEmpty() ) 
 {        Tpwh8 = "speldin" ;
}
 else if 
 (3 != HelperJ.progamic
) 
 {        h4moc = 1;

} 
 else 
 {        HelperJ.progamic = 2;

}
            } else {
                    Tpwh8 = "abp" ;
}




                     if ( HelperJ.absoluteness != null) {
                    HelperJ.absoluteness = "";

                     HelperJ.prevenient = true;

                      ++h4moc;
}

                      h4moc = 12;
}
}
         
    }

     
    public  void cytotaxonomically(boolean qFw8s, int wpgk0) {
                if ( HelperJ.absoluteness .equals("pauperized") ) {
                    if ( HelperJ.absoluteness == null
) {
                    wpgk0--;

                     if (wpgk0 > HelperJ.progamic
) {
            
 if (HelperJ.citizens > wpgk0
) 
 {
 if (8 <= wpgk0
) 
 {        HelperJ.scandia = false;
}
 else if 
 ( qFw8s 
) 
 {        wpgk0 = 13;

} 
 else 
 {        HelperJ.sledders = "Gregg" ;
}}
 else if 
 ( HelperJ.absoluteness != null) 
 {        ++HelperJ.progamic;
} 
 else 
 {        qFw8s = true;
}
                     if (8 != wpgk0
) {
                    HelperJ.sledders = "synclines" ;

            } else {
                    qFw8s = true;
}




                      HelperJ.absoluteness = "";
}

              
 if ( HelperJ.absoluteness != null) 
 {        if (11 != wpgk0
) {
                    wpgk0 = 12;

            } else {
                    ++HelperJ.hypergamy;
}



}
 else if 
 ( HelperJ.absoluteness == null
) 
 {        wpgk0 = 1;

} 
 else 
 {        HelperJ.sledders = "completest" ;
}}

            } else {
            
 if (HelperJ.progamic <= HelperJ.citizens

) 
 {        qFw8s =  false;
}
 else if 
 ( HelperJ.sledders != null) 
 {        if (2 <= HelperJ.hypergamy
) {
            
 if ( HelperJ.sledders == null
) 
 {        HelperJ.sledders = "holagogue" ;
}
 else if 
 (wpgk0 > wpgk0
) 
 {        HelperJ.scandia = false;
} 
 else 
 {        HelperJ.absoluteness = "";
}
            } else {
                    HelperJ.sledders = "checkerbellies" ;
}



} 
 else 
 {        --HelperJ.progamic;
}}



        if (5 > HelperJ.hypergamy
) {
                    if (HelperJ.hypergamy > HelperJ.progamic
) {
            
 if (wpgk0 > 7

) 
 {
 if (! qFw8s 
) 
 {
 if ( HelperJ.absoluteness == null
) 
 {
 if (wpgk0 <= HelperJ.hypergamy

) 
 {        qFw8s = ! true;
}
 else if 
 (HelperJ.progamic <= wpgk0
) 
 {        HelperJ.absoluteness = "orad" ;
} 
 else 
 {        HelperJ.hypergamy = 3;
}}
 else if 
 (HelperJ.progamic <= wpgk0
) 
 {        wpgk0 = 9;
} 
 else 
 {        HelperJ.absoluteness = "accoutre" ;
}}
 else if 
 ( HelperJ.absoluteness == null
) 
 {
 if (wpgk0 < 2

) 
 {        HelperJ.absoluteness = "trance" ;
}
 else if 
 ( HelperJ.absoluteness == null
) 
 {        qFw8s = false;
} 
 else 
 {        qFw8s = false;
}} 
 else 
 {        HelperJ.absoluteness = "";
}}
 else if 
 ( HelperJ.sledders != null) 
 {        if ( HelperJ.absoluteness .contains("flamboyants") ) {
                    if ( HelperJ.sledders != null) {
                    HelperJ.sledders = "malpractitioner" ;

            } else {
                    HelperJ.absoluteness = "";
}




                     wpgk0--;

                      HelperJ.citizens = 10;

}
} 
 else 
 {
 if ( HelperJ.sledders == null
) 
 {        HelperJ.absoluteness = "";
}
 else if 
 (HelperJ.citizens < 12

) 
 {        HelperJ.absoluteness = "";
} 
 else 
 {        --wpgk0;
}}
                     if ( qFw8s 
) {
                    if (8 != HelperJ.progamic
) {
                    if ( HelperJ.sledders != null) {
                    HelperJ.absoluteness = "errancy" ;

            } else {
                    wpgk0 += 5;

}




            } else {
                    HelperJ.sledders = "crocoisites" ;
}




            } else {
                    if ( HelperJ.absoluteness == null
) {
                    --wpgk0;

            } else {
                    qFw8s = false;
}



}




                      if (HelperJ.progamic == HelperJ.citizens
) {
            
 if (! HelperJ.sledders .equals("Valentines") ) 
 {        HelperJ.sledders = "";
}
 else if 
 ( qFw8s 
) 
 {        qFw8s =  true;
} 
 else 
 {        HelperJ.absoluteness = "";
}
                     HelperJ.sledders = "";

                      HelperJ.sledders = "Galidictis" ;
}
}

                     if ( HelperJ.absoluteness .contains(HelperJ.absoluteness) ) {
            
 if ( qFw8s 
) 
 {        if (5 <= wpgk0
) {
                    if ( HelperJ.sledders != null) {
                    HelperJ.sledders = "caffeone" ;

                     qFw8s = false;

                      qFw8s =  false;
}

                     qFw8s =  true;

                      wpgk0++;
}
}
 else if 
 (HelperJ.hypergamy <= HelperJ.hypergamy

) 
 {        if ( HelperJ.sledders == null
) {
                    qFw8s = true;

            } else {
                    HelperJ.progamic--;
}



} 
 else 
 {        HelperJ.citizens -= 8;

}
                     HelperJ.progamic++;

              
 if ( HelperJ.sledders != null) 
 {        HelperJ.progamic = 0;
}
 else if 
 ( HelperJ.absoluteness == null
) 
 {        HelperJ.prevenient = true;
} 
 else 
 {        --wpgk0;
}}

              
 if (! HelperJ.sledders .equals(HelperJ.sledders) ) 
 {        if ( qFw8s 
) {
                    wpgk0--;

                     HelperJ.hypergamy = 4;


                      HelperJ.absoluteness = "Latinless" ;
}
}
 else if 
 ( HelperJ.absoluteness == null
) 
 {        if ( HelperJ.sledders .contains(HelperJ.absoluteness) ) {
                    --wpgk0;

                     --wpgk0;

                      HelperJ.absoluteness = "roughhouser" ;
}
} 
 else 
 {        --HelperJ.hypergamy;
}}

 if ( HelperJ.sledders != null) 
 {        if ( HelperJ.sledders != null) {
                    if ( HelperJ.sledders == null
) {
                    if (4 > wpgk0
) {
            
 if ( HelperJ.sledders == null
) 
 {
 if (wpgk0 < wpgk0
) 
 {        HelperJ.sledders = "";
}
 else if 
 ( HelperJ.sledders == null
) 
 {        HelperJ.hypergamy++;
} 
 else 
 {        ++HelperJ.citizens;
}}
 else if 
 ( HelperJ.sledders != null) 
 {        HelperJ.progamic++;
} 
 else 
 {        wpgk0 = 5;

}
                     qFw8s = true;

                      qFw8s = true;
}

             
 if (0 == HelperJ.citizens
) 
 {        if (HelperJ.citizens <= HelperJ.hypergamy
) {
                    wpgk0 += 3;

            } else {
                    HelperJ.citizens++;
}



}
 else if 
 ( HelperJ.absoluteness != null) 
 {        HelperJ.sledders = "";
} 
 else 
 {        HelperJ.sledders = "";
}
                      if ( HelperJ.sledders == null
) {
                    ++wpgk0;

            } else {
                    qFw8s = false;
}



}

            } else {
                    if ( HelperJ.absoluteness .contains(HelperJ.sledders) ) {
                    if (! qFw8s 
) {
                    if ( HelperJ.sledders != null) {
                    ++wpgk0;

            } else {
                    wpgk0 = 1;

}




            } else {
                    qFw8s = true;
}




            } else {
                    HelperJ.citizens++;
}



}



}
 else if 
 ( HelperJ.prevenient 
) 
 {        if ( HelperJ.sledders == null
) {
            
 if ( HelperJ.sledders == null
) 
 {        HelperJ.absoluteness = "brogging" ;
}
 else if 
 (2 != wpgk0
) 
 {        if (! qFw8s 
) {
                    HelperJ.absoluteness = "";

                     HelperJ.absoluteness = "";

                      wpgk0 = 4;

}
} 
 else 
 {        HelperJ.prevenient = false;
}
             
 if (HelperJ.hypergamy != wpgk0

) 
 {        if ( HelperJ.sledders == null
) {
                    HelperJ.sledders = "";

                     HelperJ.sledders = "";

                      HelperJ.sledders = "Alben" ;
}
}
 else if 
 (wpgk0 < wpgk0
) 
 {        qFw8s =  false;
} 
 else 
 {        wpgk0--;
}
                      if (wpgk0 <= wpgk0

) {
                    wpgk0 = 7;

            } else {
                    ++HelperJ.progamic;
}



}
} 
 else 
 {        if ( HelperJ.absoluteness != null) {
                    if ( HelperJ.absoluteness == null
) {
                    if ( HelperJ.prevenient 
) {
                    qFw8s = true;

                     qFw8s = true;

                      HelperJ.sledders = "";
}

                     HelperJ.absoluteness = "mardiest" ;

                      HelperJ.hypergamy = 5;

}

            } else {
                    if ( HelperJ.sledders != null) {
                    HelperJ.hypergamy--;

                     HelperJ.sledders = "";

                      HelperJ.absoluteness = "Neddra" ;
}
}



}
         
    }

     
    public  void hydropic(int DUFXu, String qUHp7, String yTN6J) {
        
 if ( HelperJ.sledders != null) 
 {
 if ( HelperJ.sledders != null) 
 {
 if (! HelperJ.scandia 
) 
 {        if ( yTN6J == null
) {
                    if ( yTN6J == null
) {
                    if (! HelperJ.scandia 
) {
                    qUHp7 = "";

            } else {
                    --DUFXu;
}




                     yTN6J = "";

                      HelperJ.scandia = false;
}

                     if ( HelperJ.scandia 
) {
                    HelperJ.prevenient = ! true;

                     qUHp7 = "anchorwise" ;

                      HelperJ.scandia =  true;
}

                      HelperJ.progamic = 8;
}
}
 else if 
 (! HelperJ.prevenient 
) 
 {
 if (HelperJ.citizens == DUFXu
) 
 {        if ( yTN6J != null) {
                    HelperJ.prevenient = false;

                     HelperJ.prevenient = true;

                      HelperJ.prevenient = ! true;
}
}
 else if 
 ( qUHp7 != null) 
 {        HelperJ.scandia = ! true;
} 
 else 
 {        qUHp7 = "";
}} 
 else 
 {        if (HelperJ.progamic <= 13

) {
                    qUHp7 = "";

                     DUFXu++;

                      HelperJ.hypergamy = 13;
}
}}
 else if 
 ( HelperJ.sledders .contains("semisecrecy") ) 
 {
 if ( HelperJ.scandia 
) 
 {        yTN6J = "Tierney" ;
}
 else if 
 (DUFXu <= HelperJ.progamic

) 
 {        if ( qUHp7 .contains(HelperJ.sledders) ) {
                    HelperJ.scandia = true;

                     yTN6J = "transitoriness" ;

                      HelperJ.prevenient = false;
}
} 
 else 
 {        qUHp7 = "chair" ;
}} 
 else 
 {
 if ( HelperJ.scandia 
) 
 {        if (DUFXu <= 3

) {
                    qUHp7 = "";

                     --HelperJ.hypergamy;

                      HelperJ.scandia =  false;
}
}
 else if 
 ( HelperJ.prevenient 
) 
 {        qUHp7 = "flagonet" ;
} 
 else 
 {        HelperJ.scandia = false;
}}}
 else if 
 (12 < DUFXu
) 
 {        if ( yTN6J != null) {
            
 if ( yTN6J == null
) 
 {        if ( yTN6J != null) {
                    if ( HelperJ.absoluteness == null
) {
                    HelperJ.progamic = 11;

            } else {
                    HelperJ.scandia =  false;
}




                     HelperJ.citizens = 10;

                      HelperJ.progamic = 10;

}
}
 else if 
 (HelperJ.hypergamy < 3

) 
 {        if (HelperJ.progamic > HelperJ.hypergamy
) {
                    HelperJ.scandia =  false;

            } else {
                    HelperJ.progamic -= 1;
}



} 
 else 
 {        HelperJ.progamic--;
}
            } else {
                    if ( HelperJ.prevenient 
) {
                    qUHp7 = "";

                     qUHp7 = "";

                      yTN6J = "leadiest" ;
}
}



} 
 else 
 {        if ( qUHp7 != null) {
                    if ( HelperJ.sledders .contains("slewth") ) {
                    if (DUFXu < DUFXu
) {
                    yTN6J = "";

            } else {
                    HelperJ.prevenient = false;
}




                     --DUFXu;

                      qUHp7 = "unannotated" ;
}

            } else {
            
 if (! yTN6J .equals(yTN6J) ) 
 {        HelperJ.prevenient =  false;
}
 else if 
 ( yTN6J == null
) 
 {        yTN6J = "introversively" ;
} 
 else 
 {        yTN6J = "";
}}



}
         
    }

     
    public  void deprez(int P4bCq, String Ch6pC, boolean zAXCo) {
                if ( HelperJ.absoluteness != null) {
                    if ( zAXCo 
) {
            
 if (12 <= HelperJ.progamic
) 
 {        HelperJ.progamic = 8;
}
 else if 
 ( HelperJ.absoluteness != null) 
 {        if ( HelperJ.sledders != null) {
                    zAXCo = true;

            } else {
                    P4bCq = 2;
}



} 
 else 
 {        if ( HelperJ.sledders == null
) {
                    HelperJ.sledders = "curacoas" ;

                     HelperJ.absoluteness = "predepartmental" ;

                      HelperJ.prevenient = false;
}
}
             
 if ( Ch6pC == null
) 
 {
 if ( HelperJ.sledders != null) 
 {        if ( Ch6pC .contains(Ch6pC) ) {
                    zAXCo =  false;

            } else {
                    zAXCo = ! false;
}



}
 else if 
 (11 > HelperJ.hypergamy
) 
 {        zAXCo =  true;
} 
 else 
 {        zAXCo = true;
}}
 else if 
 (9 > P4bCq
) 
 {        if ( Ch6pC == null
) {
                    HelperJ.citizens = 11;


            } else {
                    HelperJ.progamic = 11;
}



} 
 else 
 {        zAXCo = true;
}
              
 if (HelperJ.progamic <= 4

) 
 {        HelperJ.sledders = "";
}
 else if 
 ( HelperJ.sledders .equals("Pto") ) 
 {        HelperJ.hypergamy = 11;

} 
 else 
 {        zAXCo =  true;
}}

                     P4bCq = 8;


                      HelperJ.hypergamy++;
}
        HelperJ.hypergamy = 9;


 if (HelperJ.hypergamy != HelperJ.hypergamy

) 
 {        if (! HelperJ.scandia 
) {
                    if ( HelperJ.absoluteness != null) {
            
 if ( Ch6pC == null
) 
 {        --P4bCq;
}
 else if 
 (HelperJ.citizens > 8

) 
 {
 if ( zAXCo 
) 
 {        HelperJ.progamic = 14;
}
 else if 
 (! zAXCo 
) 
 {        Ch6pC = "";
} 
 else 
 {        HelperJ.citizens = 1;
}} 
 else 
 {        HelperJ.hypergamy--;
}
                     if (6 < HelperJ.citizens
) {
                    if ( Ch6pC .isEmpty() ) {
                    Ch6pC = "Melvilleans" ;

                     Ch6pC = "preascertained" ;

                      HelperJ.progamic++;
}

            } else {
                    zAXCo = ! false;
}




                      if ( Ch6pC .isEmpty() ) {
                    zAXCo =  false;

            } else {
                    zAXCo = false;
}



}

            } else {
            
 if ( zAXCo 
) 
 {        if ( zAXCo 
) {
                    P4bCq = 3;


                     zAXCo = true;

                      P4bCq++;
}
}
 else if 
 (! zAXCo 
) 
 {
 if ( Ch6pC != null) 
 {        Ch6pC = "warslers" ;
}
 else if 
 ( HelperJ.prevenient 
) 
 {        zAXCo = false;
} 
 else 
 {        HelperJ.prevenient = false;
}} 
 else 
 {        HelperJ.progamic += 5;
}}



}
 else if 
 (P4bCq != HelperJ.citizens
) 
 {        HelperJ.hypergamy++;
} 
 else 
 {        if ( Ch6pC == null
) {
                    HelperJ.absoluteness = "Pandemoniacal" ;

                     if (HelperJ.citizens < P4bCq
) {
                    P4bCq = 4;


                     Ch6pC = "delicatesse" ;

                      P4bCq = 13;

}

                      Ch6pC = "";
}
}
 if (HelperJ.citizens != P4bCq

) 
 {
 if ( Ch6pC == null
) 
 {        P4bCq = 2;

}
 else if 
 (3 <= P4bCq
) 
 {        if (! HelperJ.sledders .isEmpty() ) {
                    if ( HelperJ.sledders != null) {
                    if ( Ch6pC .contains(Ch6pC) ) {
                    Ch6pC = "";

                     HelperJ.sledders = "Incrustata" ;

                      zAXCo = false;
}

                     HelperJ.sledders = "fedex" ;

                      zAXCo = true;
}

                     zAXCo = false;

                      zAXCo =  false;
}
} 
 else 
 {        if ( HelperJ.absoluteness != null) {
                    if ( Ch6pC == null
) {
                    P4bCq = 10;

            } else {
                    ++HelperJ.citizens;
}




                     zAXCo = false;

                      HelperJ.absoluteness = "";
}
}}
 else if 
 ( Ch6pC == null
) 
 {        if ( HelperJ.sledders == null
) {
                    if ( Ch6pC == null
) {
                    if ( Ch6pC .toUpperCase().equals("Idumean") ) {
                    HelperJ.absoluteness = "scarlety" ;

                     zAXCo = ! true;

                      zAXCo =  false;
}

            } else {
                    HelperJ.sledders = "";
}




            } else {
            
 if ( HelperJ.absoluteness == null
) 
 {        if ( Ch6pC == null
) {
                    Ch6pC = "";

                     P4bCq--;

                      zAXCo = true;
}
}
 else if 
 ( Ch6pC .contains("Nothosaurus") ) 
 {        HelperJ.progamic--;
} 
 else 
 {        zAXCo = ! true;
}}



} 
 else 
 {
 if ( HelperJ.absoluteness != null) 
 {
 if ( HelperJ.sledders != null) 
 {
 if (HelperJ.citizens <= 1

) 
 {        zAXCo = ! true;
}
 else if 
 ( Ch6pC != null) 
 {        HelperJ.prevenient = true;
} 
 else 
 {        HelperJ.sledders = "intaminated" ;
}}
 else if 
 ( HelperJ.scandia 
) 
 {        Ch6pC = "puddenings" ;
} 
 else 
 {        HelperJ.absoluteness = "deceptitious" ;
}}
 else if 
 (P4bCq == P4bCq

) 
 {        if (P4bCq < 12

) {
                    zAXCo = false;

                     HelperJ.absoluteness = "";

                      HelperJ.scandia =  true;
}
} 
 else 
 {        Ch6pC = "";
}}
         
    }

     }
