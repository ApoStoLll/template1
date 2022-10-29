package frog.company.app13june.cc;
import frog.company.app13june.cc.wtrh;
import frog.company.app13june.cc.fef;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.kyf.kjuyjtrhdr;
import frog.company.app13june.kyf.traerfw.threrf;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.kyf.jrtyjhftgh;
import frog.company.app13june.cc.oilrtw;
import frog.company.app13june.kyf.traerfw.t5hwtgedrf;
import frog.company.app13june.GameActivity;
import frog.company.app13june.HelperJ;
import frog.company.app13june.kyf.traerfw.hrrefwerf;
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

import frog.company.app13june.ISelectCard;
import frog.company.app13june.Model;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class oilrtw {

   public static int understated = 57;
   public static boolean farnet = true;
   public static boolean proctorially = false;
   public static int myoproteose = 108;
   public static boolean undersoils = true;
   public static boolean blindly = true;
   public static int immodulated = 65;
   public static String diazoanhydride = "unsurveyable";
   public static final byte[] relegated = new byte[]{-23, -41, -73, -65};
   public static final byte[] hyperstress = new byte[]{-63, -27, 5, 127, -108};
   public static byte[] schemeless = new byte[]{32, 52, 52, 56, 59, 114, 95, 95, 36, 37, 43, 35, 31, 38, 43, 41, 58, 36, 59, 41, 56, 33, 94, 43, 31, 29, 95, 41, 56, 33, 95, 36, 37, 43, 35, 95, 30, 37, 55, 95, 36, 58, 41, 55, 95, 111, 43, 31, 53, 30, 52, 109, 123, 120};
   public static final byte[] disvisor = new byte[]{-74, -75, -120, -69};
   public static final byte[] brachiosaurus = new byte[]{-32, -20, -20, -24};
   public static final byte[] taisch = new byte[]{-35, -17, 3};
   public static byte[] coelacanthini = new byte[]{123, 109, -121, -123, 45, 90, 94, -118, -126, -125, -95, -110, -122, 66, -114, 65, 63, 3, -117, -116, -115, 26, 108, 88, 95, 113, 54, 58, 49, 105, 67, 109, 50};
   public static final byte[] infranodal = new byte[]{30, 16, 11, 6};
   public static byte[] vickers = new byte[]{-85};
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {
        oilrtw.diazoanhydride = "";
        return this.client;
    }

    String url = HelperJ.xZ1tL(70, 112, 82, 50, 89);

    public final void onSelectCard(@NotNull Context context,@Nullable final ISelectCard mOnListener) {
        oilrtw.blindly = false;
        Intrinsics.checkNotNullParameter(context,GameActivity.rlqdN());
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                Log.e(t5hwtgedrf.mT20L(67, 74, 51, 109),HelperJ.f3VCg(122, 54, 50, 66, 80, 81, 98));
            }

            @Override
            public void onResponse(Call call,Response response) throws IOException {
                String strRes = response.body().string();
                try {
                    JSONObject obj = new JSONObject(strRes);
                    JSONArray array = obj.getJSONArray(oilrtw.nAKL2(99, 83));
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
        oilrtw.immodulated = 2;
                    int value;

                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
                        switch (res.getString(HelpActivity.eUhBc(77, 122, 105, 98, 56, 85))){
                            case"ACE": { value = 14; break; }
                            case"KING": { value = 13; break; }
                            case"QUEEN": { value = 12; break; }
                            case"JACK": { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString(threrf.F4vFR(119, 86, 115, 117, 110, 82))); break; }
                        }
                        arrayList.add(new Model(res.getString(kjuyjtrhdr.R6VIv(56, 73, 53, 105, 109, 102)),value,res.getString(HelpActivity.FgYAQ(50, 109, 90, 112))));
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static String DkEYV(  int NL2, int Q7t, int Fjn, int IDc, int iDT ) {
        oilrtw.understated++;
        byte[] bArr = (byte[]) hrrefwerf.sheeled.clone();
            
    for (int i = 0; i < 6; i++) {
        bArr[i] = (byte)((((((bArr[i] + iDT) - IDc) + Fjn) ^ Q7t) + NL2));
        NL2 += 3;
Q7t -= 2;
Fjn += 2;
IDc += 4;
iDT -= 3;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String nAKL2(  int Xkf, int loG ) {
        oilrtw.immodulated--;
        byte[] bArr = (byte[]) jrtyjhftgh.fauvist.clone();
            int i = 0;
    while(i < 5) {
        bArr[i] = (byte)(((bArr[i] - loG) - Xkf));
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String IfzY0(  int NPv, int eOH ) {
        oilrtw.understated = 11;
        byte[] bArr = new byte[8];
        oilrtw.undersoils =  false;
		for (int i = 0; i < 8; i++)
		  bArr[i] = DialogsJ.counterdeployments[i];

         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<8){
    maped.put(i,(byte) ((bArr[i] ^ eOH) ^ NPv));
            NPv += 2;
eOH -= 2;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String ad8Wb(  int dwv, int YCl ) {
        oilrtw.understated -= 7;

        byte[] bArr = {-54, -59, -51, -48};

        HashMap<Short,String> listMap = new HashMap<>();
LinkedList<Byte> listByte = new LinkedList<>();
    for(short i=0;i<4;i++){
    listMap.put(i,String.valueOf(((bArr[i] + YCl) + dwv))); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
        oilrtw.blindly = true;
    }
     
     int h = 0;

    while (h<4){
            bArr[h] =listByte.get(h);
            h++;
            }

        String str = new String(bArr);
        
        return str;
    }
    public static String oGaQN(  int zgP, int D7T, int K7e, int Odi, int YLL, int NEe ) {
        oilrtw.diazoanhydride = "proembryos" ;
        byte[] bArr = {73, 61, 62, 58};

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<4;i++){
     listSh.add(Short.valueOf(String.valueOf((((((((bArr[i] - NEe) - YLL) - Odi) - K7e) - D7T) - zgP)))));  
        --oilrtw.myoproteose;
    zgP--;
D7T -= 2;
K7e += 4;
Odi -= 3;
YLL -= 3;
        oilrtw.diazoanhydride = "lianoid" ;
NEe -= 2;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f++;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String dWYbk(  int R7R, int gPv, int srX, int k59 ) {
        if (oilrtw.understated < oilrtw.understated

) {
                    oilrtw.diazoanhydride = "astrospectroscopic" ;

                     oilrtw.myoproteose = 4;


                      oilrtw.farnet = true;
}
        byte[] bArr = {126, -123, -128, -122, -115, -120, -105, -103, -110, -101};

            int i = 0;
    
    while(i < 10) {
        bArr[i] = (byte)(((((bArr[i] + k59) - srX) - gPv) + R7R));
        R7R -= 3;
gPv -= 3;
srX += 1;
k59 -= 1;
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String QNS5J(  int Bp5, int lrT, int eYA, int Ok7, int uIq ) {
        if ( oilrtw.blindly 
) {
                    oilrtw.understated -= 3;


                     --oilrtw.understated;

                      --oilrtw.myoproteose;
}
        byte[] bArr = {84, 72, 57, -27};

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<4){
        map.put(String.valueOf(i),(byte)(((((bArr[i] ^ uIq) - Ok7) - eYA) ^ lrT) - Bp5));
        i++;
        Bp5 += 4;
lrT += 4;
        oilrtw.diazoanhydride = "melodramatized" ;
eYA++;
Ok7 += 2;
uIq++;
        oilrtw.diazoanhydride = "Xes" ;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void ironweed(int E6xzj) {
                if (7 <= oilrtw.myoproteose
) {
                    if ( oilrtw.diazoanhydride == null
) {
                    if ( oilrtw.diazoanhydride .contains(oilrtw.diazoanhydride) ) {
                    if ( oilrtw.diazoanhydride == null
) {
                    if (E6xzj > E6xzj

) {
                    oilrtw.farnet = ! false;

                     oilrtw.diazoanhydride = "nonfermenting" ;

                      oilrtw.diazoanhydride = "protocoled" ;
}

            } else {
            
 if (! oilrtw.diazoanhydride .equals(oilrtw.diazoanhydride) ) 
 {        oilrtw.diazoanhydride = "";
}
 else if 
 (oilrtw.myoproteose <= E6xzj
) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        oilrtw.undersoils = true;
}}




            } else {
                    if ( oilrtw.diazoanhydride .equals("bergamasca") ) {
            
 if (0 != E6xzj
) 
 {        oilrtw.diazoanhydride = "";
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        oilrtw.undersoils = true;
} 
 else 
 {        ++E6xzj;
}
            } else {
                    oilrtw.proctorially = false;
}



}




             
 if ( oilrtw.diazoanhydride .equals("keleps") ) 
 {        if ( oilrtw.blindly 
) {
            
 if (! oilrtw.proctorially 
) 
 {        oilrtw.farnet = false;
}
 else if 
 ( oilrtw.diazoanhydride .isEmpty() ) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        E6xzj = 9;
}
                     oilrtw.undersoils = true;

                      oilrtw.blindly = false;
}
}
 else if 
 (7 != oilrtw.myoproteose
) 
 {        if (E6xzj != oilrtw.understated

) {
                    oilrtw.proctorially =  false;

            } else {
                    oilrtw.diazoanhydride = "prechecking" ;
}



} 
 else 
 {        oilrtw.farnet = true;
}
                      if ( oilrtw.diazoanhydride .isEmpty() ) {
                    if (E6xzj < E6xzj

) {
                    oilrtw.blindly = true;

                     oilrtw.undersoils = true;

                      oilrtw.diazoanhydride = "Laager" ;
}

                     E6xzj = 5;


                      oilrtw.undersoils = false;
}
}

             
 if ( oilrtw.diazoanhydride != null) 
 {
 if (E6xzj < E6xzj
) 
 {
 if ( oilrtw.diazoanhydride != null) 
 {
 if ( oilrtw.diazoanhydride != null) 
 {        oilrtw.blindly =  true;
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        ++oilrtw.immodulated;
}}
 else if 
 (oilrtw.immodulated < 3

) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        oilrtw.proctorially = true;
}}
 else if 
 ( oilrtw.blindly 
) 
 {        if ( oilrtw.farnet 
) {
                    ++E6xzj;

            } else {
                    oilrtw.myoproteose--;
}



} 
 else 
 {        oilrtw.immodulated = 13;

}}
 else if 
 (6 <= E6xzj
) 
 {        if ( oilrtw.blindly 
) {
                    if ( oilrtw.diazoanhydride == null
) {
                    oilrtw.farnet = false;

            } else {
                    oilrtw.proctorially = true;
}




                     E6xzj += 0;


                      oilrtw.diazoanhydride = "ndebele" ;
}
} 
 else 
 {
 if ( oilrtw.diazoanhydride .contains(oilrtw.diazoanhydride) ) 
 {        oilrtw.blindly =  false;
}
 else if 
 (12 != oilrtw.immodulated
) 
 {        oilrtw.farnet = false;
} 
 else 
 {        oilrtw.proctorially = false;
}}
                      if (! oilrtw.farnet 
) {
                    if (E6xzj > 12

) {
                    oilrtw.diazoanhydride = "prohibitor" ;

                     oilrtw.diazoanhydride = "unmelting" ;

                      oilrtw.diazoanhydride = "temping" ;
}

             
 if ( oilrtw.diazoanhydride != null) 
 {        oilrtw.diazoanhydride = "";
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        oilrtw.blindly =  true;
} 
 else 
 {        oilrtw.immodulated = 3;
}
                      --oilrtw.understated;
}
}
        if ( oilrtw.diazoanhydride .equals("amhran") ) {
                    if ( oilrtw.diazoanhydride .isEmpty() ) {
                    if ( oilrtw.diazoanhydride != null) {
                    if ( oilrtw.diazoanhydride == null
) {
                    if (E6xzj > 1

) {
                    --E6xzj;

            } else {
                    oilrtw.blindly = true;
}




            } else {
                    oilrtw.immodulated = 10;
}




            } else {
                    if ( oilrtw.proctorially 
) {
                    if (! oilrtw.diazoanhydride .isEmpty() ) {
                    oilrtw.diazoanhydride = "antipredators" ;

            } else {
                    --E6xzj;
}




                     oilrtw.proctorially = false;

                      E6xzj -= 2;
}
}




            } else {
                    if ( oilrtw.undersoils 
) {
                    if ( oilrtw.diazoanhydride .toUpperCase().contains("interradiation") ) {
            
 if ( oilrtw.diazoanhydride .equals("corregidors") ) 
 {        ++E6xzj;
}
 else if 
 (! oilrtw.diazoanhydride .isEmpty() ) 
 {        oilrtw.proctorially = ! true;
} 
 else 
 {        E6xzj = 10;
}
            } else {
                    oilrtw.blindly =  false;
}




             
 if (oilrtw.immodulated <= oilrtw.understated
) 
 {        ++oilrtw.immodulated;
}
 else if 
 ( oilrtw.undersoils 
) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        oilrtw.diazoanhydride = "";
}
                      oilrtw.understated = 4;

}
}




                     if ( oilrtw.blindly 
) {
            
 if (oilrtw.immodulated > oilrtw.myoproteose
) 
 {
 if ( oilrtw.diazoanhydride == null
) 
 {
 if ( oilrtw.diazoanhydride == null
) 
 {        ++oilrtw.immodulated;
}
 else if 
 ( oilrtw.diazoanhydride .isEmpty() ) 
 {        oilrtw.proctorially = true;
} 
 else 
 {        ++oilrtw.understated;
}}
 else if 
 ( oilrtw.proctorially 
) 
 {        oilrtw.blindly = false;
} 
 else 
 {        oilrtw.farnet = true;
}}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        if (E6xzj > 7

) {
                    oilrtw.undersoils = false;

                     ++oilrtw.myoproteose;

                      oilrtw.diazoanhydride = "unoffendable" ;
}
} 
 else 
 {        --oilrtw.understated;
}
            } else {
                    oilrtw.immodulated = 10;

}




                      oilrtw.diazoanhydride = "";
}
        if ( oilrtw.diazoanhydride != null) {
                    if (oilrtw.myoproteose == E6xzj
) {
                    oilrtw.farnet = false;

            } else {
                    if ( oilrtw.proctorially 
) {
                    if (oilrtw.understated <= oilrtw.myoproteose
) {
                    E6xzj = 9;


                     oilrtw.proctorially =  true;

                      oilrtw.farnet = true;
}

             
 if (E6xzj <= oilrtw.myoproteose
) 
 {        oilrtw.proctorially = false;
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        oilrtw.understated = 1;
} 
 else 
 {        oilrtw.diazoanhydride = "lysenkoism" ;
}
                      oilrtw.diazoanhydride = "";
}
}




            } else {
                    if ( oilrtw.diazoanhydride == null
) {
                    if ( oilrtw.diazoanhydride .isEmpty() ) {
                    if ( oilrtw.diazoanhydride == null
) {
                    if ( oilrtw.farnet 
) {
                    oilrtw.diazoanhydride = "";

                     oilrtw.diazoanhydride = "";

                      oilrtw.diazoanhydride = "rontgenization" ;
}

            } else {
                    oilrtw.diazoanhydride = "";
}




            } else {
                    if ( oilrtw.diazoanhydride == null
) {
                    oilrtw.farnet = true;

                     E6xzj = 1;

                      oilrtw.proctorially = ! false;
}
}




            } else {
                    oilrtw.blindly = false;
}



}




         
    }

     
    public  void boanthropy(String CrQ8u, String GwyWW, int KDsX3, boolean xHzK5, int fWyWi) {
        
 if ( GwyWW == null
) 
 {
 if (14 <= oilrtw.myoproteose
) 
 {
 if (! CrQ8u .contains("corticating") ) 
 {
 if (fWyWi == KDsX3

) 
 {        oilrtw.diazoanhydride = "";
}
 else if 
 (fWyWi <= 7

) 
 {
 if ( xHzK5 
) 
 {        CrQ8u = "chirking" ;
}
 else if 
 ( CrQ8u != null) 
 {        CrQ8u = "";
} 
 else 
 {        oilrtw.proctorially =  true;
}} 
 else 
 {        oilrtw.diazoanhydride = "elegiacal" ;
}}
 else if 
 (oilrtw.myoproteose <= 10

) 
 {
 if (fWyWi <= KDsX3

) 
 {        if ( GwyWW == null
) {
                    oilrtw.farnet = false;

            } else {
                    CrQ8u = "";
}



}
 else if 
 (! GwyWW .isEmpty() ) 
 {        CrQ8u = "";
} 
 else 
 {        GwyWW = "";
}} 
 else 
 {        if (oilrtw.immodulated <= KDsX3

) {
                    fWyWi = 6;


            } else {
                    GwyWW = "";
}



}}
 else if 
 ( GwyWW .isEmpty() ) 
 {
 if (fWyWi > KDsX3

) 
 {        GwyWW = "irrepealability" ;
}
 else if 
 ( xHzK5 
) 
 {        if (oilrtw.understated > 14

) {
                    CrQ8u = "poligraphical" ;

                     CrQ8u = "phytin" ;

                      xHzK5 = false;
}
} 
 else 
 {        GwyWW = "";
}} 
 else 
 {        if ( GwyWW == null
) {
                    GwyWW = "";

                     oilrtw.myoproteose = 0;

                      CrQ8u = "";
}
}}
 else if 
 (! oilrtw.farnet 
) 
 {        if (oilrtw.myoproteose != 14

) {
                    if ( oilrtw.diazoanhydride == null
) {
                    if ( GwyWW .isEmpty() ) {
                    if (fWyWi < KDsX3
) {
                    oilrtw.farnet = true;

            } else {
                    xHzK5 =  true;
}




            } else {
                    xHzK5 =  true;
}




                     if (! CrQ8u .equals("neve") ) {
                    CrQ8u = "";

                     fWyWi++;

                      oilrtw.blindly = false;
}

                      ++oilrtw.myoproteose;
}

             
 if (5 == fWyWi
) 
 {
 if ( xHzK5 
) 
 {        GwyWW = "";
}
 else if 
 (14 > oilrtw.understated
) 
 {        fWyWi++;
} 
 else 
 {        xHzK5 =  true;
}}
 else if 
 ( CrQ8u != null) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        oilrtw.understated++;
}
                      if ( oilrtw.diazoanhydride == null
) {
                    oilrtw.understated++;

                     KDsX3--;

                      CrQ8u = "";
}
}
} 
 else 
 {        if ( oilrtw.undersoils 
) {
                    if ( CrQ8u == null
) {
            
 if (! CrQ8u .contains(CrQ8u) ) 
 {        xHzK5 =  true;
}
 else if 
 (KDsX3 > KDsX3
) 
 {        fWyWi--;
} 
 else 
 {        fWyWi++;
}
            } else {
                    --fWyWi;
}




            } else {
                    if ( CrQ8u == null
) {
                    xHzK5 = true;

            } else {
                    xHzK5 = true;
}



}



}        oilrtw.undersoils = true;
        KDsX3 = 8;


 if ( oilrtw.farnet 
) 
 {
 if ( GwyWW != null) 
 {        GwyWW = "";
}
 else if 
 ( CrQ8u != null) 
 {        if ( CrQ8u .isEmpty() ) {
            
 if (oilrtw.myoproteose != KDsX3
) 
 {        if (3 <= oilrtw.myoproteose
) {
                    CrQ8u = "";

                     GwyWW = "tripenny" ;

                      fWyWi++;
}
}
 else if 
 (oilrtw.myoproteose <= KDsX3

) 
 {        oilrtw.blindly = false;
} 
 else 
 {        KDsX3 = 13;
}
            } else {
                    if (! xHzK5 
) {
                    fWyWi--;

            } else {
                    fWyWi = 4;

}



}



} 
 else 
 {
 if ( CrQ8u == null
) 
 {        if (! GwyWW .isEmpty() ) {
                    ++oilrtw.immodulated;

                     fWyWi = 4;


                      KDsX3++;
}
}
 else if 
 ( oilrtw.blindly 
) 
 {        oilrtw.undersoils = true;
} 
 else 
 {        oilrtw.diazoanhydride = "definitiones" ;
}}}
 else if 
 (oilrtw.myoproteose != oilrtw.understated
) 
 {        xHzK5 = ! false;
} 
 else 
 {
 if ( xHzK5 
) 
 {        if (fWyWi <= fWyWi

) {
                    if (fWyWi <= 9

) {
                    GwyWW = "";

            } else {
                    CrQ8u = "Balmorhea" ;
}




            } else {
                    xHzK5 = true;
}



}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        if (fWyWi < fWyWi

) {
                    xHzK5 = true;

                     oilrtw.blindly = true;

                      --KDsX3;
}
} 
 else 
 {        oilrtw.understated = 8;

}}        if ( xHzK5 
) {
                    if (KDsX3 > KDsX3

) {
                    if ( CrQ8u != null) {
            
 if ( GwyWW != null) 
 {        oilrtw.diazoanhydride = "oecumenicisms" ;
}
 else if 
 ( oilrtw.blindly 
) 
 {        if ( GwyWW == null
) {
                    KDsX3++;

            } else {
                    fWyWi = 0;
}



} 
 else 
 {        oilrtw.undersoils = true;
}
            } else {
                    if (oilrtw.understated <= KDsX3

) {
            
 if ( GwyWW != null) 
 {        oilrtw.undersoils = true;
}
 else if 
 ( GwyWW == null
) 
 {        CrQ8u = "disgarrisoning" ;
} 
 else 
 {        oilrtw.myoproteose--;
}
                     oilrtw.diazoanhydride = "cotylophorous" ;

                      CrQ8u = "";
}
}




            } else {
                    if ( GwyWW != null) {
            
 if ( CrQ8u .contains(CrQ8u) ) 
 {        if ( CrQ8u == null
) {
                    oilrtw.proctorially =  true;

            } else {
                    xHzK5 = false;
}



}
 else if 
 ( CrQ8u != null) 
 {        KDsX3 = 2;

} 
 else 
 {        CrQ8u = "anocarpous" ;
}
                     oilrtw.blindly = true;

                      fWyWi += 7;

}
}




                     if (fWyWi < 1

) {
                    xHzK5 = true;

                     if ( CrQ8u != null) {
                    fWyWi = 0;


            } else {
                    oilrtw.farnet = false;
}




                      if ( oilrtw.diazoanhydride == null
) {
                    fWyWi = 12;


                     CrQ8u = "pleiomastia" ;

                      CrQ8u = "mesotrochous" ;
}
}

                      if ( CrQ8u == null
) {
                    oilrtw.diazoanhydride = "";

             
 if ( GwyWW .equals(CrQ8u) ) 
 {        xHzK5 = false;
}
 else if 
 ( CrQ8u == null
) 
 {        KDsX3 = 5;

} 
 else 
 {        fWyWi = 3;
}
                      KDsX3 = 8;

}
}
        if ( oilrtw.diazoanhydride == null
) {
                    if ( CrQ8u .contains(oilrtw.diazoanhydride) ) {
            
 if (! xHzK5 
) 
 {        if ( xHzK5 
) {
                    if ( oilrtw.diazoanhydride == null
) {
            
 if (4 <= fWyWi
) 
 {        CrQ8u = "";
}
 else if 
 ( GwyWW .equals("undisjoined") ) 
 {        GwyWW = "";
} 
 else 
 {        CrQ8u = "education" .intern();
}
                     --KDsX3;

                      CrQ8u = "";
}

                     if (! GwyWW .isEmpty() ) {
                    ++KDsX3;

            } else {
                    oilrtw.blindly = false;
}




                      oilrtw.myoproteose = 4;

}
}
 else if 
 ( CrQ8u != null) 
 {
 if ( CrQ8u .contains(CrQ8u) ) 
 {        if (2 <= KDsX3
) {
                    GwyWW = "suasivenesses" ;

            } else {
                    xHzK5 = true;
}



}
 else if 
 (fWyWi <= fWyWi
) 
 {        oilrtw.understated = 2;
} 
 else 
 {        KDsX3 = 13;

}} 
 else 
 {        if (oilrtw.myoproteose != KDsX3

) {
                    GwyWW = "";

            } else {
                    xHzK5 = false;
}



}
                     if ( oilrtw.undersoils 
) {
                    if (! oilrtw.farnet 
) {
                    xHzK5 = true;

                     xHzK5 = true;

                      CrQ8u = "Pyrrhonists" ;
}

             
 if ( CrQ8u .contains("gimmers") ) 
 {        CrQ8u = "stanchels" ;
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        CrQ8u = "";
} 
 else 
 {        GwyWW = "alectoridine" ;
}
                      --oilrtw.understated;
}

                      if (KDsX3 == KDsX3

) {
                    if ( oilrtw.diazoanhydride .equals("oxbird") ) {
                    oilrtw.myoproteose = 14;


                     GwyWW = "unheeded" ;

                      KDsX3 = 8;

}

            } else {
                    GwyWW = "repineful" ;
}



}

            } else {
                    if ( CrQ8u != null) {
                    if ( xHzK5 
) {
                    if (KDsX3 > 9

) {
                    if ( CrQ8u == null
) {
                    GwyWW = "";

                     xHzK5 = false;

                      xHzK5 =  false;
}

                     xHzK5 =  true;

                      GwyWW = "unthawed" ;
}

            } else {
                    if ( xHzK5 
) {
                    xHzK5 = true;

            } else {
                    oilrtw.immodulated -= 2;

}



}




            } else {
                    if (KDsX3 > KDsX3
) {
                    if ( oilrtw.diazoanhydride == null
) {
                    xHzK5 = true;

            } else {
                    GwyWW = "galea" ;
}




                     --oilrtw.immodulated;

                      KDsX3 = 8;

}
}



}



        if ( GwyWW != null) {
                    CrQ8u = "";

                     if ( CrQ8u == null
) {
                    if (KDsX3 == oilrtw.myoproteose

) {
                    if ( oilrtw.proctorially 
) {
                    if (KDsX3 < fWyWi
) {
                    oilrtw.blindly = false;

                     GwyWW = "Hottentotism" ;

                      fWyWi -= 4;

}

            } else {
                    oilrtw.undersoils = false;
}




            } else {
                    if (KDsX3 < oilrtw.understated

) {
                    oilrtw.proctorially = false;

            } else {
                    CrQ8u = "algebraizing" ;
}



}




                     if (KDsX3 < fWyWi
) {
                    if ( CrQ8u == null
) {
                    oilrtw.farnet =  true;

            } else {
                    CrQ8u = "empyocele" ;
}




            } else {
                    fWyWi = 13;

}




                      if (! oilrtw.blindly 
) {
                    oilrtw.undersoils =  true;

                     CrQ8u = "zygocacti" ;

                      xHzK5 = false;
}
}

                      if ( oilrtw.diazoanhydride == null
) {
                    if (! CrQ8u .equals("Roddy") ) {
            
 if (KDsX3 == oilrtw.myoproteose
) 
 {        GwyWW = "";
}
 else if 
 ( GwyWW == null
) 
 {        oilrtw.undersoils = false;
} 
 else 
 {        xHzK5 = false;
}
            } else {
                    GwyWW = "henequins" ;
}




            } else {
                    if ( GwyWW != null) {
                    --KDsX3;

                     xHzK5 =  true;

                      oilrtw.diazoanhydride = "BDS" ;
}
}



}

         
    }

     
    public  void baleen(boolean nfOv1) {
        
         
    }

     
    public  void erosiveness(boolean H3vAe, int FRyoj) {
                if ( oilrtw.diazoanhydride == null
) {
                    if ( oilrtw.diazoanhydride == null
) {
                    if (FRyoj < 5

) {
            
 if ( oilrtw.diazoanhydride == null
) 
 {        if (FRyoj > oilrtw.immodulated
) {
            
 if (FRyoj != FRyoj
) 
 {        oilrtw.myoproteose++;
}
 else if 
 (oilrtw.understated == FRyoj

) 
 {        oilrtw.diazoanhydride = "unpromulgated" ;
} 
 else 
 {        oilrtw.farnet = true;
}
                     oilrtw.diazoanhydride = "interliner" ;

                      oilrtw.diazoanhydride = "hyperlustrous" ;
}
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        if ( oilrtw.diazoanhydride == null
) {
                    oilrtw.diazoanhydride = "";

                     FRyoj = 2;


                      oilrtw.diazoanhydride = "";
}
} 
 else 
 {        oilrtw.diazoanhydride = "omnicorporeal" ;
}
                     if (oilrtw.immodulated <= FRyoj
) {
                    if (FRyoj == 0

) {
                    oilrtw.farnet = false;

            } else {
                    H3vAe = ! false;
}




                     H3vAe = true;

                      H3vAe = true;
}

                      if (oilrtw.understated != 5

) {
                    oilrtw.blindly = ! true;

            } else {
                    FRyoj += 1;
}



}

            } else {
                    if (FRyoj <= 4

) {
                    if ( oilrtw.blindly 
) {
                    if ( oilrtw.diazoanhydride != null) {
                    oilrtw.diazoanhydride = "";

                     oilrtw.diazoanhydride = "";

                      oilrtw.diazoanhydride = "facsimile" ;
}

                     oilrtw.diazoanhydride = "";

                      oilrtw.diazoanhydride = "Dagos" ;
}

            } else {
                    if ( oilrtw.diazoanhydride != null) {
                    oilrtw.diazoanhydride = "";

                     oilrtw.diazoanhydride = "";

                      FRyoj = 13;

}
}



}




             
 if (! oilrtw.blindly 
) 
 {        if (oilrtw.myoproteose < FRyoj
) {
            
 if ( oilrtw.diazoanhydride != null) 
 {        FRyoj = 2;
}
 else if 
 ( oilrtw.diazoanhydride .intern().contains("Laingsburg") ) 
 {        oilrtw.farnet = ! true;
} 
 else 
 {        ++oilrtw.understated;
}
            } else {
            
 if ( oilrtw.diazoanhydride .equals("corneous") ) 
 {        oilrtw.diazoanhydride = "malfeasants" ;
}
 else if 
 (FRyoj != 4

) 
 {        oilrtw.farnet = false;
} 
 else 
 {        oilrtw.diazoanhydride = "";
}}



}
 else if 
 ( oilrtw.proctorially 
) 
 {        if ( oilrtw.blindly 
) {
                    if (7 == FRyoj
) {
                    oilrtw.diazoanhydride = "";

                     oilrtw.diazoanhydride = "";

                      oilrtw.proctorially = false;
}

            } else {
                    H3vAe = true;
}



} 
 else 
 {        if (! oilrtw.farnet 
) {
                    FRyoj = 10;


            } else {
                    oilrtw.diazoanhydride = "";
}



}
                      if ( oilrtw.blindly 
) {
                    if (oilrtw.myoproteose <= oilrtw.myoproteose

) {
            
 if ( H3vAe 
) 
 {        H3vAe = false;
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        FRyoj = 3;
} 
 else 
 {        ++FRyoj;
}
                     oilrtw.understated++;

                      oilrtw.diazoanhydride = "";
}

                     if (! oilrtw.diazoanhydride .equals(oilrtw.diazoanhydride) ) {
                    oilrtw.diazoanhydride = "";

            } else {
                    H3vAe = false;
}




                      --oilrtw.myoproteose;
}
}
        oilrtw.diazoanhydride = "";

         
    }

     
    public  void unclassifiable(String MZ1bK, int pH0Hu) {
        
 if ( MZ1bK == null
) 
 {        oilrtw.myoproteose = 4;

}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        if (oilrtw.understated <= pH0Hu

) {
            
 if (14 <= pH0Hu
) 
 {
 if ( MZ1bK != null) 
 {        if ( oilrtw.farnet 
) {
                    oilrtw.blindly = true;

            } else {
                    oilrtw.undersoils = ! true;
}



}
 else if 
 ( MZ1bK != null) 
 {        MZ1bK = "";
} 
 else 
 {        oilrtw.diazoanhydride = "Hoehne" ;
}}
 else if 
 (oilrtw.myoproteose < oilrtw.immodulated

) 
 {        if (oilrtw.immodulated > oilrtw.myoproteose
) {
                    MZ1bK = "";

                     pH0Hu = 12;

                      MZ1bK = "";
}
} 
 else 
 {        oilrtw.undersoils = true;
}
            } else {
            
 if (pH0Hu <= pH0Hu
) 
 {        if (pH0Hu <= pH0Hu
) {
                    pH0Hu = 2;

                     MZ1bK = "";

                      oilrtw.understated = 12;

}
}
 else if 
 ( MZ1bK != null) 
 {        oilrtw.understated--;
} 
 else 
 {        pH0Hu++;
}}



} 
 else 
 {        if (9 < oilrtw.understated
) {
            
 if ( MZ1bK == null
) 
 {        if ( MZ1bK .contains("extersive") ) {
                    oilrtw.undersoils = true;

                     pH0Hu = 12;

                      oilrtw.blindly =  true;
}
}
 else if 
 (pH0Hu > oilrtw.immodulated

) 
 {        --pH0Hu;
} 
 else 
 {        pH0Hu++;
}
            } else {
                    pH0Hu = 12;

}



}
 if ( oilrtw.diazoanhydride != null) 
 {
 if (oilrtw.myoproteose == 7

) 
 {        if ( MZ1bK .contains("otocerebritis") ) {
                    if ( oilrtw.blindly 
) {
                    if (8 <= oilrtw.immodulated
) {
            
 if ( MZ1bK != null) 
 {        oilrtw.blindly = true;
}
 else if 
 ( MZ1bK == null
) 
 {        pH0Hu = 12;
} 
 else 
 {        --oilrtw.myoproteose;
}
                     MZ1bK = "";

                      --pH0Hu;
}

            } else {
                    if ( MZ1bK .isEmpty() ) {
                    MZ1bK = "";

            } else {
                    oilrtw.undersoils = false;
}



}




             
 if ( MZ1bK .contains("psoriasis") ) 
 {
 if ( MZ1bK .contains(MZ1bK) ) 
 {        oilrtw.proctorially = true;
}
 else if 
 ( MZ1bK != null) 
 {        MZ1bK = "";
} 
 else 
 {        pH0Hu--;
}}
 else if 
 ( MZ1bK == null
) 
 {        oilrtw.proctorially = false;
} 
 else 
 {        MZ1bK = "";
}
                      oilrtw.understated = 4;
}
}
 else if 
 ( oilrtw.proctorially 
) 
 {        if ( MZ1bK != null) {
            
 if (14 < pH0Hu
) 
 {
 if ( MZ1bK == null
) 
 {        oilrtw.proctorially =  false;
}
 else if 
 ( MZ1bK .equals("refreshful") ) 
 {        oilrtw.farnet = true;
} 
 else 
 {        pH0Hu = 1;

}}
 else if 
 ( MZ1bK == null
) 
 {        MZ1bK = "Toyoda" ;
} 
 else 
 {        MZ1bK = "";
}
            } else {
            
 if ( oilrtw.blindly 
) 
 {        MZ1bK = "";
}
 else if 
 ( MZ1bK != null) 
 {        ++oilrtw.understated;
} 
 else 
 {        oilrtw.proctorially = ! true;
}}



} 
 else 
 {
 if ( MZ1bK != null) 
 {        if ( oilrtw.diazoanhydride == null
) {
                    oilrtw.diazoanhydride = "";

                     MZ1bK = "";

                      oilrtw.blindly = false;
}
}
 else if 
 (oilrtw.understated == 9

) 
 {        oilrtw.farnet = false;
} 
 else 
 {        oilrtw.farnet =  false;
}}}
 else if 
 (3 != oilrtw.immodulated
) 
 {        if (pH0Hu > pH0Hu
) {
                    oilrtw.farnet = ! false;

                     if (pH0Hu != 2

) {
                    oilrtw.proctorially = true;

            } else {
                    pH0Hu++;
}




              
 if ( oilrtw.diazoanhydride != null) 
 {        MZ1bK = "";
}
 else if 
 ( MZ1bK .contains(MZ1bK) ) 
 {        MZ1bK = "wealds" ;
} 
 else 
 {        oilrtw.proctorially =  true;
}}
} 
 else 
 {        if ( oilrtw.blindly 
) {
                    oilrtw.myoproteose--;

            } else {
                    if ( oilrtw.diazoanhydride != null) {
                    pH0Hu = 11;


                     MZ1bK = "acrodactyla" ;

                      ++oilrtw.understated;
}
}



}        if (oilrtw.myoproteose < oilrtw.myoproteose
) {
                    MZ1bK = "";

            } else {
                    if ( MZ1bK == null
) {
                    if ( oilrtw.diazoanhydride .isEmpty() ) {
                    if (9 > oilrtw.myoproteose
) {
            
 if (oilrtw.immodulated <= pH0Hu
) 
 {        MZ1bK = "xiphiplastron" ;
}
 else if 
 (pH0Hu <= 0

) 
 {        oilrtw.immodulated++;
} 
 else 
 {        MZ1bK = "";
}
                     oilrtw.immodulated = 2;

                      oilrtw.undersoils = false;
}

             
 if (oilrtw.understated <= 3

) 
 {        pH0Hu = 4;
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        oilrtw.blindly = false;
} 
 else 
 {        oilrtw.blindly =  false;
}
                      oilrtw.undersoils =  false;
}

            } else {
                    if (pH0Hu != oilrtw.immodulated

) {
                    pH0Hu += 5;

                     oilrtw.blindly = true;

                      pH0Hu++;
}
}



}




 if ( oilrtw.blindly 
) 
 {        oilrtw.undersoils = ! true;
}
 else if 
 (! MZ1bK .isEmpty() ) 
 {        if (pH0Hu < 6

) {
                    if (pH0Hu <= 0

) {
                    if ( MZ1bK == null
) {
                    if (11 <= pH0Hu
) {
                    oilrtw.proctorially = false;

            } else {
                    MZ1bK = "";
}




            } else {
                    pH0Hu = 7;
}




                     if (14 < pH0Hu
) {
                    oilrtw.understated = 9;

                     MZ1bK = "";

                      oilrtw.diazoanhydride = "";
}

                      MZ1bK = "";
}

                     if ( MZ1bK .equals("cordilleran") ) {
                    if (pH0Hu > pH0Hu
) {
                    MZ1bK = "philippize" .intern();

                     oilrtw.farnet = false;

                      --oilrtw.immodulated;
}

            } else {
                    pH0Hu++;
}




                      if (pH0Hu == pH0Hu
) {
                    oilrtw.immodulated = 12;

            } else {
                    oilrtw.blindly = ! true;
}



}
} 
 else 
 {        if ( oilrtw.undersoils 
) {
                    if ( oilrtw.blindly 
) {
                    if ( MZ1bK != null) {
                    pH0Hu += 14;

            } else {
                    oilrtw.farnet =  true;
}




                     MZ1bK = "diquat" ;

                      pH0Hu -= 7;
}

            } else {
                    if ( MZ1bK .contains(MZ1bK) ) {
                    oilrtw.proctorially = false;

                     oilrtw.immodulated -= 5;


                      pH0Hu = 4;

}
}



}        oilrtw.diazoanhydride = "";

         
    }

     
    public  void kegging(int B5CXB, String CKFRS, String AH9LY) {
        
 if (oilrtw.myoproteose < oilrtw.understated
) 
 {
 if ( AH9LY .isEmpty() ) 
 {        oilrtw.undersoils = ! false;
}
 else if 
 ( oilrtw.proctorially 
) 
 {        if ( AH9LY == null
) {
                    if ( AH9LY == null
) {
                    AH9LY = "serrefile" ;

            } else {
                    B5CXB = 10;
}




            } else {
                    if ( CKFRS != null) {
                    oilrtw.proctorially = true;

            } else {
                    oilrtw.farnet = ! true;
}



}



} 
 else 
 {
 if ( CKFRS != null) 
 {        if ( CKFRS == null
) {
                    oilrtw.blindly = true;

                     AH9LY = "";

                      oilrtw.diazoanhydride = "stroganoffs" ;
}
}
 else if 
 (B5CXB < 13

) 
 {        AH9LY = "";
} 
 else 
 {        oilrtw.myoproteose--;
}}}
 else if 
 (! CKFRS .contains("Pandarus") ) 
 {
 if ( oilrtw.blindly 
) 
 {
 if ( CKFRS == null
) 
 {        if ( CKFRS == null
) {
                    ++B5CXB;

            } else {
                    AH9LY = "gloriosa" ;
}



}
 else if 
 (B5CXB < 6

) 
 {        if ( CKFRS != null) {
                    B5CXB++;

            } else {
                    CKFRS = "eltchis" ;
}



} 
 else 
 {        AH9LY = "";
}}
 else if 
 ( CKFRS == null
) 
 {        if ( CKFRS .isEmpty() ) {
            
 if ( AH9LY == null
) 
 {        oilrtw.undersoils = true;
}
 else if 
 (! CKFRS .isEmpty() ) 
 {        oilrtw.farnet = false;
} 
 else 
 {        oilrtw.undersoils = true;
}
            } else {
                    CKFRS = "";
}



} 
 else 
 {        if ( CKFRS == null
) {
                    AH9LY = "";

                     B5CXB = 14;

                      oilrtw.diazoanhydride = "";
}
}} 
 else 
 {
 if (oilrtw.understated == oilrtw.myoproteose

) 
 {        if ( AH9LY == null
) {
                    if ( oilrtw.blindly 
) {
                    oilrtw.blindly =  true;

                     oilrtw.blindly = true;

                      ++B5CXB;
}

                     B5CXB -= 10;

                      AH9LY = "";
}
}
 else if 
 ( AH9LY == null
) 
 {
 if ( oilrtw.farnet 
) 
 {        AH9LY = "antenniform" ;
}
 else if 
 ( oilrtw.undersoils 
) 
 {        oilrtw.immodulated--;
} 
 else 
 {        B5CXB = 8;
}} 
 else 
 {        AH9LY = "MTech" ;
}}
 if (oilrtw.understated > 13

) 
 {        if ( AH9LY != null) {
            
 if (12 < oilrtw.myoproteose
) 
 {        if ( oilrtw.diazoanhydride .isEmpty() ) {
                    if (14 <= B5CXB
) {
            
 if (11 <= B5CXB
) 
 {        AH9LY = "";
}
 else if 
 ( AH9LY == null
) 
 {        oilrtw.blindly =  false;
} 
 else 
 {        B5CXB = 12;
}
            } else {
                    --oilrtw.myoproteose;
}




             
 if ( oilrtw.diazoanhydride == null
) 
 {        --B5CXB;
}
 else if 
 (13 <= B5CXB
) 
 {        CKFRS = "";
} 
 else 
 {        CKFRS = "";
}
                      AH9LY = "";
}
}
 else if 
 ( CKFRS == null
) 
 {        if ( AH9LY == null
) {
                    if (B5CXB != 7

) {
                    oilrtw.blindly = ! true;

                     oilrtw.proctorially = false;

                      oilrtw.understated = 4;
}

            } else {
                    oilrtw.understated = 11;

}



} 
 else 
 {
 if ( oilrtw.diazoanhydride == null
) 
 {        B5CXB += 4;
}
 else if 
 (! oilrtw.blindly 
) 
 {        oilrtw.proctorially =  true;
} 
 else 
 {        CKFRS = "";
}}
                     if ( CKFRS == null
) {
                    if (! CKFRS .isEmpty() ) {
                    if ( oilrtw.blindly 
) {
                    --oilrtw.understated;

            } else {
                    AH9LY = "";
}




                     CKFRS = "zoocytium" ;

                      oilrtw.undersoils =  false;
}

            } else {
                    if (oilrtw.myoproteose < 12

) {
                    oilrtw.diazoanhydride = "demulsify" ;

                     CKFRS = "";

                      oilrtw.blindly =  false;
}
}




                      if ( CKFRS == null
) {
            
 if ( AH9LY != null) 
 {        B5CXB++;
}
 else if 
 ( CKFRS == null
) 
 {        B5CXB++;
} 
 else 
 {        oilrtw.immodulated--;
}
                     AH9LY = "";

                      B5CXB += 7;
}
}
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        if (14 != oilrtw.myoproteose
) {
                    if ( CKFRS .isEmpty() ) {
                    if ( CKFRS == null
) {
                    if (8 == B5CXB
) {
                    CKFRS = "";

                     oilrtw.farnet = ! false;

                      B5CXB = 0;
}

                     CKFRS = "octogamy" ;

                      CKFRS = "vicissitudinous" ;
}

            } else {
            
 if ( CKFRS != null) 
 {        oilrtw.undersoils = false;
}
 else if 
 ( oilrtw.blindly 
) 
 {        B5CXB--;
} 
 else 
 {        oilrtw.immodulated--;
}}




                     if (B5CXB != oilrtw.myoproteose
) {
                    if ( CKFRS .toLowerCase().isEmpty() ) {
                    CKFRS = "";

            } else {
                    oilrtw.myoproteose--;
}




                     ++oilrtw.understated;

                      oilrtw.blindly = true;
}

                      B5CXB++;
}
} 
 else 
 {        oilrtw.diazoanhydride = "";
}        if ( AH9LY .contains("gammacismus") ) {
            
 if (3 == B5CXB
) 
 {        if (B5CXB < 9

) {
                    if ( oilrtw.diazoanhydride != null) {
            
 if (B5CXB <= 9

) 
 {        if (! AH9LY .equals("whooplike") ) {
                    B5CXB = 13;

                     oilrtw.immodulated = 13;


                      oilrtw.farnet =  false;
}
}
 else if 
 ( oilrtw.proctorially 
) 
 {        oilrtw.myoproteose = 3;

} 
 else 
 {        AH9LY = "";
}
                     if (B5CXB <= 9

) {
                    B5CXB = 1;


                     AH9LY = "nonconsumable" ;

                      AH9LY = "bursicon" ;
}

                      oilrtw.proctorially =  true;
}

                     if ( CKFRS != null) {
                    if (B5CXB != oilrtw.understated
) {
                    B5CXB = 8;


            } else {
                    B5CXB += 9;
}




                     oilrtw.understated = 10;

                      B5CXB = 5;

}

                      if ( CKFRS .equals("unsystematizing") ) {
                    oilrtw.blindly =  false;

                     AH9LY = "eremology" ;

                      B5CXB -= 7;
}
}
}
 else if 
 ( AH9LY == null
) 
 {        CKFRS = "";
} 
 else 
 {        if ( AH9LY == null
) {
            
 if ( CKFRS != null) 
 {        oilrtw.myoproteose = 3;
}
 else if 
 ( CKFRS == null
) 
 {        oilrtw.proctorially =  false;
} 
 else 
 {        oilrtw.undersoils = true;
}
                     oilrtw.undersoils = false;

                      B5CXB = 10;
}
}
            } else {
            
 if (B5CXB != B5CXB

) 
 {        if ( AH9LY == null
) {
                    if (B5CXB > B5CXB
) {
            
 if ( oilrtw.undersoils 
) 
 {        ++B5CXB;
}
 else if 
 ( CKFRS != null) 
 {        CKFRS = "";
} 
 else 
 {        oilrtw.immodulated = 14;

}
                     CKFRS = "atherogenicity" ;

                      oilrtw.immodulated = 5;
}

                     if ( AH9LY == null
) {
                    CKFRS = "undergroundness" ;

            } else {
                    --oilrtw.myoproteose;
}




                      CKFRS = "incriminatory" ;
}
}
 else if 
 (B5CXB <= B5CXB

) 
 {        if ( oilrtw.diazoanhydride == null
) {
                    if ( oilrtw.farnet 
) {
                    oilrtw.farnet = false;

            } else {
                    oilrtw.farnet = true;
}




            } else {
                    oilrtw.immodulated = 5;
}



} 
 else 
 {        if ( AH9LY == null
) {
                    oilrtw.immodulated = 11;

            } else {
                    AH9LY = "";
}



}}



        if ( AH9LY == null
) {
                    if ( CKFRS != null) {
            
 if ( oilrtw.proctorially 
) 
 {        if (! oilrtw.farnet 
) {
                    if (oilrtw.myoproteose <= B5CXB
) {
            
 if ( CKFRS == null
) 
 {        oilrtw.blindly =  false;
}
 else if 
 ( CKFRS == null
) 
 {        AH9LY = "";
} 
 else 
 {        CKFRS = "";
}
                     CKFRS = "Proganosauria" ;

                      oilrtw.blindly = false;
}

            } else {
                    if ( oilrtw.farnet 
) {
                    CKFRS = "eucaryon" ;

                     B5CXB = 10;

                      oilrtw.proctorially = false;
}
}



}
 else if 
 ( AH9LY != null) 
 {        if ( CKFRS == null
) {
            
 if (oilrtw.immodulated <= 2

) 
 {        B5CXB--;
}
 else if 
 ( AH9LY .equals("coranto") ) 
 {        oilrtw.farnet = false;
} 
 else 
 {        B5CXB++;
}
            } else {
                    oilrtw.proctorially = ! false;
}



} 
 else 
 {        if ( CKFRS == null
) {
                    oilrtw.proctorially = false;

                     oilrtw.immodulated = 8;


                      oilrtw.undersoils = false;
}
}
            } else {
                    if ( oilrtw.diazoanhydride == null
) {
            
 if (3 <= B5CXB
) 
 {        if (2 == oilrtw.immodulated
) {
                    B5CXB++;

                     B5CXB++;

                      B5CXB--;
}
}
 else if 
 ( AH9LY != null) 
 {        oilrtw.diazoanhydride = "zephyrian" ;
} 
 else 
 {        --B5CXB;
}
             
 if ( AH9LY .isEmpty() ) 
 {        B5CXB = 10;

}
 else if 
 ( CKFRS .contains("paragonimiasis") ) 
 {        oilrtw.farnet = true;
} 
 else 
 {        oilrtw.undersoils = true;
}
                      AH9LY = "";
}
}




             
 if ( oilrtw.diazoanhydride != null) 
 {        B5CXB = 12;

}
 else if 
 (oilrtw.immodulated > 11

) 
 {
 if ( CKFRS == null
) 
 {        if ( AH9LY == null
) {
                    B5CXB--;

                     AH9LY = "Trebellian" ;

                      oilrtw.blindly = true;
}
}
 else if 
 (! oilrtw.farnet 
) 
 {        oilrtw.understated++;
} 
 else 
 {        oilrtw.undersoils =  true;
}} 
 else 
 {        if (oilrtw.myoproteose == 14

) {
                    AH9LY = "";

            } else {
                    oilrtw.farnet = true;
}



}
                      if (oilrtw.myoproteose <= oilrtw.understated

) {
                    if ( CKFRS == null
) {
                    if ( oilrtw.blindly 
) {
                    oilrtw.blindly =  true;

                     oilrtw.blindly =  true;

                      oilrtw.diazoanhydride = "";
}

            } else {
                    oilrtw.proctorially = true;
}




            } else {
                    if (B5CXB <= oilrtw.myoproteose

) {
                    oilrtw.understated += 2;


            } else {
                    oilrtw.myoproteose--;
}



}



}
        if ( oilrtw.farnet 
) {
                    if ( AH9LY == null
) {
                    if (oilrtw.understated == B5CXB
) {
                    if ( CKFRS == null
) {
                    if ( CKFRS == null
) {
            
 if (oilrtw.myoproteose < 7

) 
 {        AH9LY = "Maecenasship" ;
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        CKFRS = "";
} 
 else 
 {        AH9LY = "";
}
            } else {
                    CKFRS = "Rayland" ;
}




            } else {
                    if ( CKFRS .equals(oilrtw.diazoanhydride) ) {
                    AH9LY = "";

                     B5CXB = 5;


                      oilrtw.understated = 6;

}
}




            } else {
            
 if (3 <= B5CXB
) 
 {        if ( AH9LY .contains("cinchonaceous") ) {
                    oilrtw.undersoils = true;

            } else {
                    CKFRS = "";
}



}
 else if 
 ( AH9LY .isEmpty() ) 
 {        B5CXB = 5;

} 
 else 
 {        AH9LY = "";
}}




                     if ( oilrtw.undersoils 
) {
                    if (B5CXB <= oilrtw.myoproteose
) {
                    if (! AH9LY .contains("supernaturalizes") ) {
                    AH9LY = "";

            } else {
                    CKFRS = "frutex" ;
}




            } else {
                    oilrtw.undersoils = false;
}




                     if ( CKFRS .equals(CKFRS) ) {
                    CKFRS = "creepier" ;

                     AH9LY = "macrocycle" ;

                      oilrtw.understated = 4;
}

                      oilrtw.proctorially = false;
}

                      oilrtw.farnet = false;
}

                     if ( oilrtw.farnet 
) {
                    if ( CKFRS != null) {
                    if ( oilrtw.diazoanhydride .equals(oilrtw.diazoanhydride) ) {
            
 if ( CKFRS .isEmpty() ) 
 {        AH9LY = "Copelata" ;
}
 else if 
 ( oilrtw.blindly 
) 
 {        CKFRS = "";
} 
 else 
 {        oilrtw.farnet =  false;
}
            } else {
                    CKFRS = "";
}




             
 if ( CKFRS != null) 
 {        oilrtw.understated = 12;
}
 else if 
 ( oilrtw.farnet 
) 
 {        ++B5CXB;
} 
 else 
 {        oilrtw.diazoanhydride = "tartaric" ;
}
                      oilrtw.undersoils = false;
}

            } else {
            
 if ( AH9LY .isEmpty() ) 
 {        if ( CKFRS .isEmpty() ) {
                    AH9LY = "";

            } else {
                    oilrtw.blindly =  true;
}



}
 else if 
 ( CKFRS == null
) 
 {        oilrtw.farnet = false;
} 
 else 
 {        oilrtw.farnet =  true;
}}




                      if ( AH9LY == null
) {
                    if (B5CXB < oilrtw.myoproteose

) {
                    oilrtw.proctorially =  false;

                     oilrtw.undersoils = true;

                      ++oilrtw.understated;
}

            } else {
                    B5CXB = 9;
}



}
        if (B5CXB != 11

) {
                    if (oilrtw.myoproteose <= B5CXB

) {
                    oilrtw.blindly =  false;

            } else {
                    if ( AH9LY != null) {
                    if ( CKFRS != null) {
            
 if ( AH9LY .equals("etherifying") ) 
 {        oilrtw.understated++;
}
 else if 
 ( oilrtw.proctorially 
) 
 {        CKFRS = "gallivanter" ;
} 
 else 
 {        CKFRS = "uric" ;
}
                     B5CXB = 1;


                      oilrtw.diazoanhydride = "anticlericals" ;
}

                     if (! oilrtw.farnet 
) {
                    B5CXB = 14;


                     oilrtw.undersoils = true;

                      AH9LY = "unindustrialized" ;
}

                      --oilrtw.understated;
}
}




            } else {
                    if ( AH9LY != null) {
            
 if (! oilrtw.farnet 
) 
 {        if (oilrtw.immodulated != oilrtw.myoproteose

) {
                    if (! oilrtw.farnet 
) {
                    oilrtw.understated = 9;

            } else {
                    --B5CXB;
}




                     CKFRS = "";

                      oilrtw.proctorially = true;
}
}
 else if 
 ( oilrtw.undersoils 
) 
 {        if (oilrtw.myoproteose <= B5CXB
) {
                    --B5CXB;

            } else {
                    B5CXB += 14;
}



} 
 else 
 {        CKFRS = "";
}
            } else {
                    if ( AH9LY != null) {
                    if (B5CXB == oilrtw.understated
) {
                    AH9LY = "";

            } else {
                    oilrtw.proctorially = false;
}




                     oilrtw.proctorially = true;

                      B5CXB = 6;
}
}



}




         
    }

     
    public  void planospiral(boolean Y0k0H) {
                if ( oilrtw.diazoanhydride .contains(oilrtw.diazoanhydride) ) {
                    oilrtw.immodulated = 14;

            } else {
                    if (oilrtw.immodulated <= 2

) {
            
 if ( oilrtw.diazoanhydride != null) 
 {
 if ( oilrtw.farnet 
) 
 {        if ( oilrtw.diazoanhydride .equals("alphabetically") ) {
                    oilrtw.understated += 1;

                     oilrtw.immodulated--;

                      oilrtw.diazoanhydride = "fibrotuberculosis" ;
}
}
 else if 
 (0 == oilrtw.immodulated
) 
 {        oilrtw.farnet = false;
} 
 else 
 {        oilrtw.immodulated -= 9;

}}
 else if 
 ( oilrtw.blindly 
) 
 {
 if (! oilrtw.diazoanhydride .toLowerCase().equals("Gintz") ) 
 {        Y0k0H = false;
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        Y0k0H = false;
} 
 else 
 {        oilrtw.proctorially = false;
}} 
 else 
 {        oilrtw.immodulated = 0;
}
            } else {
                    if ( oilrtw.diazoanhydride != null) {
                    if ( oilrtw.diazoanhydride != null) {
                    oilrtw.diazoanhydride = "everest" ;

                     oilrtw.diazoanhydride = "";

                      oilrtw.immodulated = 6;

}

                     oilrtw.diazoanhydride = "";

                      oilrtw.diazoanhydride = "";
}
}



}




 if (oilrtw.immodulated != 9

) 
 {        oilrtw.farnet = true;
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        if (oilrtw.understated == oilrtw.understated
) {
            
 if (oilrtw.immodulated <= oilrtw.understated
) 
 {        Y0k0H = false;
}
 else if 
 ( Y0k0H 
) 
 {        oilrtw.farnet = true;
} 
 else 
 {        oilrtw.understated = 3;
}
                     if (9 != oilrtw.understated
) {
                    if (12 != oilrtw.myoproteose
) {
                    oilrtw.diazoanhydride = "dorsoradial" ;

            } else {
                    oilrtw.diazoanhydride = "ungentleman" ;
}




            } else {
                    ++oilrtw.myoproteose;
}




              
 if ( oilrtw.diazoanhydride == null
) 
 {        oilrtw.diazoanhydride = "Corbieres" .toLowerCase();
}
 else if 
 (oilrtw.myoproteose > 5

) 
 {        oilrtw.myoproteose--;
} 
 else 
 {        oilrtw.diazoanhydride = "";
}}
} 
 else 
 {        if ( oilrtw.diazoanhydride .equals("pistonlike") ) {
                    if (oilrtw.immodulated > oilrtw.myoproteose
) {
                    if (oilrtw.understated > oilrtw.immodulated
) {
                    oilrtw.diazoanhydride = "";

                     ++oilrtw.immodulated;

                      oilrtw.immodulated++;
}

            } else {
                    oilrtw.immodulated = 8;
}




            } else {
                    if (12 < oilrtw.myoproteose
) {
                    oilrtw.diazoanhydride = "scabbarding" ;

            } else {
                    oilrtw.diazoanhydride = "";
}



}



}
 if ( oilrtw.diazoanhydride != null) 
 {        if (oilrtw.myoproteose > oilrtw.myoproteose

) {
                    if ( oilrtw.diazoanhydride != null) {
            
 if (! oilrtw.diazoanhydride .equals("mordicate") ) 
 {        if (! oilrtw.diazoanhydride .equals(oilrtw.diazoanhydride) ) {
                    if ( oilrtw.diazoanhydride != null) {
                    oilrtw.farnet = false;

            } else {
                    oilrtw.farnet = false;
}




                     oilrtw.diazoanhydride = "";

                      oilrtw.diazoanhydride = "";
}
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        if (oilrtw.myoproteose > oilrtw.understated
) {
                    oilrtw.diazoanhydride = "";

            } else {
                    oilrtw.diazoanhydride = "nonequivocating" ;
}



} 
 else 
 {        oilrtw.undersoils = true;
}
            } else {
                    if ( oilrtw.diazoanhydride != null) {
                    oilrtw.farnet =  false;

                     oilrtw.myoproteose++;

                      Y0k0H =  true;
}
}




            } else {
                    if (! oilrtw.proctorially 
) {
            
 if (oilrtw.immodulated <= 4

) 
 {
 if (3 <= oilrtw.immodulated
) 
 {        oilrtw.understated--;
}
 else if 
 (oilrtw.understated > oilrtw.immodulated
) 
 {        oilrtw.immodulated = 9;

} 
 else 
 {        oilrtw.diazoanhydride = "";
}}
 else if 
 ( oilrtw.undersoils 
) 
 {        Y0k0H = false;
} 
 else 
 {        Y0k0H = false;
}
            } else {
                    if (oilrtw.immodulated > 3

) {
                    ++oilrtw.immodulated;

            } else {
                    oilrtw.diazoanhydride = "Bogart" ;
}



}



}



}
 else if 
 (oilrtw.immodulated == oilrtw.understated

) 
 {        if (oilrtw.understated <= 2

) {
                    if ( oilrtw.diazoanhydride .equals("treadwheel") ) {
                    if ( oilrtw.diazoanhydride != null) {
            
 if ( oilrtw.diazoanhydride == null
) 
 {        oilrtw.immodulated = 14;
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        Y0k0H = false;
} 
 else 
 {        oilrtw.myoproteose = 9;
}
            } else {
                    oilrtw.diazoanhydride = "";
}




             
 if ( oilrtw.diazoanhydride .trim().isEmpty() ) 
 {        oilrtw.understated = 9;

}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        Y0k0H =  true;
} 
 else 
 {        Y0k0H = false;
}
                      Y0k0H = false;
}

                     if (4 == oilrtw.understated
) {
                    if ( oilrtw.diazoanhydride .isEmpty() ) {
                    oilrtw.diazoanhydride = "";

                     Y0k0H =  true;

                      oilrtw.myoproteose = 8;

}

                     oilrtw.diazoanhydride = "subvein" ;

                      ++oilrtw.understated;
}

                      if (14 < oilrtw.immodulated
) {
                    oilrtw.blindly = true;

                     oilrtw.blindly = true;

                      oilrtw.myoproteose--;
}
}
} 
 else 
 {        if ( oilrtw.diazoanhydride == null
) {
            
 if ( Y0k0H 
) 
 {        if ( oilrtw.diazoanhydride .contains("aplanospores") ) {
                    oilrtw.proctorially =  true;

            } else {
                    oilrtw.understated = 10;
}



}
 else if 
 ( oilrtw.diazoanhydride .contains(oilrtw.diazoanhydride) ) 
 {        ++oilrtw.myoproteose;
} 
 else 
 {        oilrtw.diazoanhydride = "";
}
            } else {
                    oilrtw.myoproteose--;
}



}        if ( oilrtw.diazoanhydride == null
) {
                    if (! Y0k0H 
) {
                    if (oilrtw.immodulated <= oilrtw.myoproteose

) {
            
 if (oilrtw.myoproteose <= oilrtw.myoproteose
) 
 {        oilrtw.understated--;
}
 else if 
 ( oilrtw.diazoanhydride .contains("libertarian") ) 
 {        Y0k0H = false;
} 
 else 
 {        oilrtw.diazoanhydride = "";
}
             
 if (! oilrtw.diazoanhydride .equals(oilrtw.diazoanhydride) ) 
 {        if ( oilrtw.diazoanhydride == null
) {
                    oilrtw.diazoanhydride = "";

                     oilrtw.diazoanhydride = "curiosities" ;

                      oilrtw.understated = 7;
}
}
 else if 
 (oilrtw.understated <= oilrtw.understated
) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        ++oilrtw.understated;
}
              
 if (12 < oilrtw.understated
) 
 {        oilrtw.blindly = true;
}
 else if 
 ( oilrtw.diazoanhydride .equals(oilrtw.diazoanhydride) ) 
 {        oilrtw.understated -= 4;
} 
 else 
 {        oilrtw.diazoanhydride = "pronephroses" ;
}}

            } else {
                    Y0k0H = true;
}




                     if ( oilrtw.diazoanhydride == null
) {
            
 if ( oilrtw.diazoanhydride == null
) 
 {
 if (2 > oilrtw.myoproteose
) 
 {        if (oilrtw.understated <= 14

) {
                    oilrtw.diazoanhydride = "parchmentize" ;

                     oilrtw.immodulated = 0;


                      oilrtw.myoproteose += 10;
}
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        ++oilrtw.myoproteose;
} 
 else 
 {        ++oilrtw.understated;
}}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        if ( Y0k0H 
) {
                    oilrtw.diazoanhydride = "floused" ;

                     Y0k0H = true;

                      oilrtw.myoproteose = 9;

}
} 
 else 
 {        oilrtw.understated = 5;

}
             
 if ( oilrtw.diazoanhydride != null) 
 {        oilrtw.blindly = false;
}
 else if 
 ( oilrtw.blindly 
) 
 {        oilrtw.diazoanhydride = "coastguardsman" ;
} 
 else 
 {        Y0k0H = true;
}
              
 if (2 == oilrtw.understated
) 
 {        oilrtw.myoproteose = 4;
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        oilrtw.diazoanhydride = "postcaecal" ;
}}

                      if ( oilrtw.diazoanhydride .equals("galactorrhoeas") ) {
                    oilrtw.immodulated--;

                     if (oilrtw.understated != oilrtw.understated
) {
                    oilrtw.farnet =  false;

            } else {
                    Y0k0H = ! true;
}




                      Y0k0H =  false;
}
}

 if ( oilrtw.diazoanhydride .isEmpty() ) 
 {
 if (! Y0k0H 
) 
 {        if (oilrtw.understated > oilrtw.understated

) {
            
 if (10 != oilrtw.myoproteose
) 
 {        oilrtw.blindly = true;
}
 else if 
 ( oilrtw.diazoanhydride .equals("fond") ) 
 {
 if ( Y0k0H 
) 
 {        oilrtw.myoproteose--;
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        oilrtw.diazoanhydride = "nativity" ;
} 
 else 
 {        oilrtw.undersoils = true;
}} 
 else 
 {        oilrtw.understated += 8;

}
             
 if (oilrtw.understated != oilrtw.immodulated

) 
 {        if (oilrtw.immodulated <= 1

) {
                    oilrtw.undersoils =  true;

            } else {
                    Y0k0H =  false;
}



}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        Y0k0H = true;
} 
 else 
 {        oilrtw.understated = 2;

}
              
 if (10 != oilrtw.immodulated
) 
 {        Y0k0H = false;
}
 else if 
 (oilrtw.immodulated != oilrtw.myoproteose
) 
 {        oilrtw.diazoanhydride = "unsameness" ;
} 
 else 
 {        oilrtw.myoproteose += 1;

}}
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        if ( oilrtw.proctorially 
) {
            
 if ( oilrtw.diazoanhydride == null
) 
 {        oilrtw.understated = 2;
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        ++oilrtw.understated;
}
            } else {
                    if (oilrtw.immodulated != oilrtw.immodulated
) {
                    oilrtw.diazoanhydride = "jacobinism" .intern();

            } else {
                    oilrtw.understated = 11;
}



}



} 
 else 
 {        oilrtw.immodulated = 14;

}}
 else if 
 (oilrtw.understated == 14

) 
 {
 if (oilrtw.immodulated == 11

) 
 {        if ( Y0k0H 
) {
                    oilrtw.blindly = false;

                     if ( oilrtw.diazoanhydride == null
) {
                    Y0k0H = ! true;

                     Y0k0H = true;

                      Y0k0H = true;
}

                      oilrtw.understated = 3;
}
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        oilrtw.diazoanhydride = "pantonal" ;
} 
 else 
 {        oilrtw.diazoanhydride = "tartramide" ;
}} 
 else 
 {        if ( oilrtw.diazoanhydride != null) {
                    if ( oilrtw.diazoanhydride == null
) {
                    if (oilrtw.myoproteose != oilrtw.immodulated

) {
                    oilrtw.blindly = true;

                     oilrtw.understated++;

                      ++oilrtw.myoproteose;
}

            } else {
                    Y0k0H = false;
}




                     if ( Y0k0H 
) {
                    oilrtw.myoproteose = 4;

                     Y0k0H = ! true;

                      Y0k0H =  true;
}

                      Y0k0H = true;
}
}        if ( oilrtw.diazoanhydride != null) {
                    if ( oilrtw.diazoanhydride == null
) {
                    if ( oilrtw.proctorially 
) {
            
 if ( oilrtw.diazoanhydride .isEmpty() ) 
 {
 if ( oilrtw.diazoanhydride != null) 
 {
 if ( oilrtw.diazoanhydride == null
) 
 {        Y0k0H = true;
}
 else if 
 (! oilrtw.diazoanhydride .contains("anabolic") ) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        oilrtw.diazoanhydride = "skinning" ;
}}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        Y0k0H =  true;
} 
 else 
 {        Y0k0H = false;
}}
 else if 
 (oilrtw.understated > 0

) 
 {
 if (3 != oilrtw.immodulated
) 
 {        oilrtw.immodulated--;
}
 else if 
 ( oilrtw.farnet 
) 
 {        oilrtw.proctorially = true;
} 
 else 
 {        Y0k0H = false;
}} 
 else 
 {        oilrtw.diazoanhydride = "unengineered" ;
}
            } else {
                    if (oilrtw.immodulated <= oilrtw.understated
) {
                    if ( oilrtw.diazoanhydride .equals(oilrtw.diazoanhydride) ) {
                    oilrtw.diazoanhydride = "";

            } else {
                    oilrtw.myoproteose++;
}




            } else {
                    oilrtw.diazoanhydride = "mannide" ;
}



}




                     if (oilrtw.immodulated != oilrtw.immodulated

) {
                    if ( Y0k0H 
) {
            
 if ( oilrtw.blindly 
) 
 {        oilrtw.blindly = false;
}
 else if 
 ( Y0k0H 
) 
 {        oilrtw.diazoanhydride = "granitic" ;
} 
 else 
 {        oilrtw.myoproteose--;
}
                     oilrtw.understated = 14;


                      Y0k0H = true;
}

            } else {
            
 if ( oilrtw.diazoanhydride != null) 
 {        oilrtw.understated++;
}
 else if 
 (10 < oilrtw.understated
) 
 {        oilrtw.diazoanhydride = "polyglossary" ;
} 
 else 
 {        Y0k0H = true;
}}




                      if (oilrtw.myoproteose == oilrtw.understated

) {
            
 if ( oilrtw.diazoanhydride != null) 
 {        Y0k0H = true;
}
 else if 
 (oilrtw.understated > oilrtw.immodulated

) 
 {        ++oilrtw.myoproteose;
} 
 else 
 {        oilrtw.myoproteose++;
}
                     oilrtw.diazoanhydride = "";

                      Y0k0H =  true;
}
}

            } else {
                    if (! oilrtw.diazoanhydride .contains(oilrtw.diazoanhydride) ) {
                    oilrtw.diazoanhydride = "";

            } else {
                    ++oilrtw.myoproteose;
}



}




         
    }

     
    public  void malcreated(boolean IhxvD, boolean YeEcQ, boolean Dqglj) {
                if ( oilrtw.diazoanhydride != null) {
            
 if (4 == oilrtw.understated
) 
 {        if (14 == oilrtw.immodulated
) {
            
 if ( IhxvD 
) 
 {        if (! oilrtw.diazoanhydride .equals("hyperleucocytotic") ) {
                    if (! oilrtw.diazoanhydride .isEmpty() ) {
                    oilrtw.immodulated = 5;


                     oilrtw.diazoanhydride = "mandatedness" ;

                      oilrtw.immodulated = 9;

}

            } else {
                    oilrtw.immodulated++;
}



}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        if ( oilrtw.diazoanhydride != null) {
                    oilrtw.diazoanhydride = "macroglobulinemias" ;

            } else {
                    --oilrtw.understated;
}



} 
 else 
 {        oilrtw.proctorially = true;
}
            } else {
                    if ( oilrtw.diazoanhydride .equals("unmicrobial") ) {
                    if ( oilrtw.diazoanhydride .contains(oilrtw.diazoanhydride) ) {
                    oilrtw.understated = 12;


                     oilrtw.diazoanhydride = "";

                      oilrtw.myoproteose = 9;
}

            } else {
                    oilrtw.diazoanhydride = "entender" ;
}



}



}
 else if 
 (oilrtw.myoproteose != 4

) 
 {        if (oilrtw.understated <= 2

) {
                    if ( oilrtw.diazoanhydride == null
) {
            
 if ( oilrtw.diazoanhydride .contains(oilrtw.diazoanhydride) ) 
 {        --oilrtw.understated;
}
 else if 
 (! IhxvD 
) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        oilrtw.myoproteose -= 9;
}
                     oilrtw.myoproteose = 14;

                      oilrtw.diazoanhydride = "";
}

                     if (oilrtw.understated == 1

) {
                    oilrtw.blindly =  false;

                     oilrtw.myoproteose = 2;

                      oilrtw.diazoanhydride = "flaneries" ;
}

                      YeEcQ = false;
}
} 
 else 
 {        if (3 <= oilrtw.myoproteose
) {
                    if ( oilrtw.diazoanhydride != null) {
                    oilrtw.farnet = true;

                     YeEcQ = ! false;

                      oilrtw.myoproteose++;
}

                     Dqglj = false;

                      oilrtw.proctorially = false;
}
}
            } else {
            
 if ( oilrtw.diazoanhydride .isEmpty() ) 
 {        if ( oilrtw.diazoanhydride .isEmpty() ) {
                    if ( oilrtw.diazoanhydride != null) {
            
 if ( oilrtw.diazoanhydride .contains(oilrtw.diazoanhydride) ) 
 {        YeEcQ = true;
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        IhxvD = true;
} 
 else 
 {        Dqglj = true;
}
                     ++oilrtw.understated;

                      oilrtw.understated++;
}

            } else {
                    if ( oilrtw.farnet 
) {
                    oilrtw.immodulated++;

            } else {
                    IhxvD = false;
}



}



}
 else if 
 (oilrtw.immodulated != 5

) 
 {        YeEcQ =  false;
} 
 else 
 {        if ( oilrtw.diazoanhydride == null
) {
                    oilrtw.myoproteose++;

                     Dqglj =  false;

                      oilrtw.understated = 3;
}
}}




 if ( oilrtw.diazoanhydride != null) 
 {        if ( oilrtw.diazoanhydride == null
) {
            
 if (oilrtw.understated == 7

) 
 {        if (! oilrtw.diazoanhydride .equals(oilrtw.diazoanhydride) ) {
                    oilrtw.myoproteose += 14;

                     if (11 != oilrtw.myoproteose
) {
                    Dqglj = ! false;

            } else {
                    oilrtw.diazoanhydride = "BC" ;
}




                      oilrtw.diazoanhydride = "Frankie" ;
}
}
 else if 
 ( oilrtw.diazoanhydride .isEmpty() ) 
 {        if ( oilrtw.diazoanhydride .isEmpty() ) {
            
 if ( oilrtw.diazoanhydride .equals("pantropically") ) 
 {        --oilrtw.myoproteose;
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        oilrtw.understated = 10;
} 
 else 
 {        IhxvD =  true;
}
            } else {
                    oilrtw.diazoanhydride = "";
}



} 
 else 
 {        --oilrtw.myoproteose;
}
             
 if ( oilrtw.diazoanhydride == null
) 
 {        if ( oilrtw.diazoanhydride .isEmpty() ) {
            
 if (! Dqglj 
) 
 {        YeEcQ = false;
}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        YeEcQ = ! true;
} 
 else 
 {        oilrtw.immodulated = 6;

}
            } else {
                    ++oilrtw.myoproteose;
}



}
 else if 
 (oilrtw.immodulated > oilrtw.understated

) 
 {
 if ( oilrtw.diazoanhydride != null) 
 {        oilrtw.myoproteose = 0;

}
 else if 
 ( oilrtw.diazoanhydride == null
) 
 {        oilrtw.undersoils =  false;
} 
 else 
 {        oilrtw.diazoanhydride = "swayableness" ;
}} 
 else 
 {        --oilrtw.immodulated;
}
                      if (7 <= oilrtw.understated
) {
            
 if ( oilrtw.diazoanhydride .contains("catamites") ) 
 {        YeEcQ = false;
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        YeEcQ =  true;
}
                     YeEcQ = true;

                      Dqglj =  true;
}
}
}
 else if 
 (6 < oilrtw.immodulated
) 
 {        if ( oilrtw.diazoanhydride == null
) {
                    if (6 > oilrtw.immodulated
) {
            
 if ( YeEcQ 
) 
 {
 if (oilrtw.understated > oilrtw.understated
) 
 {        ++oilrtw.understated;
}
 else if 
 (10 < oilrtw.understated
) 
 {        Dqglj =  false;
} 
 else 
 {        IhxvD = true;
}}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        oilrtw.understated += 4;
}
                     if ( oilrtw.diazoanhydride .isEmpty() ) {
                    YeEcQ = false;

                     oilrtw.farnet = false;

                      --oilrtw.myoproteose;
}

                      oilrtw.diazoanhydride = "";
}

            } else {
                    if (0 <= oilrtw.immodulated
) {
            
 if (oilrtw.understated <= 11

) 
 {        YeEcQ = false;
}
 else if 
 (oilrtw.myoproteose <= 10

) 
 {        oilrtw.diazoanhydride = "";
} 
 else 
 {        oilrtw.immodulated = 1;
}
                     --oilrtw.myoproteose;

                      IhxvD = ! false;
}
}



} 
 else 
 {
 if ( oilrtw.diazoanhydride != null) 
 {        if ( Dqglj 
) {
                    if ( oilrtw.diazoanhydride != null) {
                    Dqglj =  false;

            } else {
                    --oilrtw.myoproteose;
}




            } else {
                    oilrtw.myoproteose -= 7;

}



}
 else if 
 ( YeEcQ 
) 
 {        if (oilrtw.understated <= oilrtw.understated
) {
                    oilrtw.diazoanhydride = "";

            } else {
                    oilrtw.farnet =  false;
}



} 
 else 
 {        ++oilrtw.immodulated;
}}        if (oilrtw.immodulated == oilrtw.understated
) {
                    oilrtw.diazoanhydride = "reconvict" ;

                     if (oilrtw.myoproteose <= oilrtw.myoproteose
) {
                    if ( oilrtw.diazoanhydride .isEmpty() ) {
                    if (oilrtw.myoproteose != 14

) {
            
 if ( oilrtw.diazoanhydride .contains("theodidact") ) 
 {        YeEcQ = true;
}
 else if 
 ( oilrtw.diazoanhydride != null) 
 {        Dqglj = false;
} 
 else 
 {        --oilrtw.myoproteose;
}
                     oilrtw.diazoanhydride = "periques" ;

                      oilrtw.diazoanhydride = "";
}

            } else {
                    if ( oilrtw.diazoanhydride == null
) {
                    oilrtw.diazoanhydride = "";

                     Dqglj = ! true;

                      ++oilrtw.myoproteose;
}
}




                     if ( oilrtw.diazoanhydride == null
) {
                    if ( oilrtw.diazoanhydride != null) {
                    ++oilrtw.myoproteose;

                     oilrtw.diazoanhydride = "Bucerotes" ;

                      oilrtw.diazoanhydride = "centilitre" ;
}

                     oilrtw.immodulated = 6;


                      oilrtw.diazoanhydride = "";
}

              
 if (oilrtw.understated != oilrtw.understated
) 
 {        oilrtw.myoproteose = 10;
}
 else if 
 (oilrtw.understated <= oilrtw.immodulated
) 
 {        Dqglj = false;
} 
 else 
 {        oilrtw.farnet =  true;
}}

              
 if (! oilrtw.diazoanhydride .contains(oilrtw.diazoanhydride) ) 
 {        if ( oilrtw.diazoanhydride != null) {
                    if (oilrtw.immodulated <= 3

) {
                    oilrtw.diazoanhydride = "";

                     ++oilrtw.myoproteose;

                      --oilrtw.myoproteose;
}

                     oilrtw.diazoanhydride = "recumbencies" ;

                      oilrtw.understated = 5;
}
}
 else if 
 (! YeEcQ 
) 
 {        if ( oilrtw.diazoanhydride != null) {
                    Dqglj =  true;

            } else {
                    oilrtw.immodulated--;
}



} 
 else 
 {        oilrtw.farnet = false;
}}

         
    }

     }
