package frog.company.app13june.kyf.traerfw;
import frog.company.app13june.Utils;
import frog.company.app13june.kyf.traerfw.ytjtghfsgdr;
import frog.company.app13june.kyf.kjuyjtrhdr;
import frog.company.app13june.cc.jurtyewsrf;
import frog.company.app13june.kyf.rtyjfythjdj;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.kyf.iutldxrfgresg;
import frog.company.app13june.kyf.jrtyjhftgh;
import frog.company.app13june.WActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.kyf.traerfw.t5hwtgedrf;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.MainActivity;
import frog.company.app13june.GameActivity;
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

public class hrrefwerf {

   public static String twinberries = "nonentries";
   public static String wis = "nucleofugal";
   public static int nonsuccession = 51;
   public static int harmonie = 48;
   public static int unvenerably = 115;
   public static String whillywhaed = "Germanisms";
   public static int trussery = 107;
   public static boolean hotpressing = false;
   public static int wasatch = 116;
   public static String maceraters = "cammas";
   public static final byte[] areopagus = new byte[]{77, 87, 124, -122, -109, 124};
   public static final byte[] angiolipoma = new byte[]{47, 110, 101, 119, 47, 100, 114, 97, 119, 47, 63};
   public static byte[] scallawag = new byte[]{-122, -101, -116, -101};
   public static byte[] interventions = new byte[]{19, 50, 22, 41, 39, 41, 45, 58, 41, 40, 16, 51, 43, 45, 50, 22, 41, 53};
   public static byte[] sheeled = new byte[]{15, -51, -14, -16, -23, -14};
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {
        hrrefwerf.wis = "mikrkra" ;
        return this.client;
    }

    String url = (SplashActivity.iexAB(107, 75, 84, 119, 86, 75, 97)+WActivity.Bhhev(109, 79, 72, 84)+t5hwtgedrf.N9xwP()+ WActivity.NG4ji(83, 104, 116, 98, 65, 121, 54));

    public final void onSelectCard(@NotNull Context context,@Nullable final ISelectCard mOnListener) {
        ++hrrefwerf.trussery;
        Intrinsics.checkNotNullParameter(context,GameActivity.aZEvf());
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                Log.e(jrtyjhftgh.v6Tvw(72, 112, 80),iutldxrfgresg.Co2Ty(107));
            }

            @Override
            public void onResponse(Call call,Response response) throws IOException {
                String strRes = response.body().string();
                try {
                    JSONObject obj = new JSONObject(strRes);
                    JSONArray array = obj.getJSONArray(RouleteActivity.Fhl8C(49));
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
                    int value;

                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
                        switch (res.getString(rtyjfythjdj.pZ2Z6(77, 97, 89, 70, 65, 56, 71))){
                            case"ACE": { value = 14; break; }
                            case"KING": { value = 13; break; }
                            case"QUEEN": { value = 12; break; }
                            case"JACK": { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString(jurtyewsrf.nXZBO(53, 66))); break; }
                        }
                        arrayList.add(new Model(res.getString(kjuyjtrhdr.g0wG8(112, 97, 112)),value,res.getString(ytjtghfsgdr.usEY2(112, 90, 84, 108, 115))));
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static String gxJ3I(  int BNJ, int gU2, int S2w, int qEF, int N84, int l1h, int d5g ) {
        hrrefwerf.hotpressing = false;
        byte[] bArr = {62, 57, -112, 91, 97, 77, 88, -123, -121, -116, 120, -125};

         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<12){
    maped.put(i,(byte) (((((((bArr[i] + d5g) - l1h) + N84) + qEF) ^ S2w) + gU2) - BNJ));
            BNJ += 4;
gU2 += 4;
S2w++;
qEF += 3;
        hrrefwerf.wasatch = 2;

N84 -= 2;
l1h += 1;
d5g -= 5;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String DEqsx(  int sKx, int M20 ) {
        if ( hrrefwerf.hotpressing 
) {
                    --hrrefwerf.trussery;

            } else {
                    hrrefwerf.twinberries = "";
}



        byte[] bArr = {108, 91, -99, -94, -114, 116, -113, -107, -74, -100};

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<10;i++){
     listSh.add(Short.valueOf(String.valueOf((((bArr[i] + M20) + sKx)))));  
    sKx -= 1;
M20 -= 5;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
        ++hrrefwerf.wasatch;
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f++;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String Caz87(  int emx ) {
        hrrefwerf.hotpressing = ! true;
        byte[] bArr = {15, 4, -59};

            int i = 0;
    
    while(i < 3) {
        bArr[i] = (byte)((bArr[i] + emx));
        emx += 4;
        i += 1;
    }

        String str = new String(bArr);
        hrrefwerf.whillywhaed = "";
        
        return str;
    }
    public static String LOUmE(  int GlD, int fkw, int kzD, int sqX ) {
        --hrrefwerf.unvenerably;
        byte[] bArr = (byte[]) t5hwtgedrf.candlesnuffers.clone();
            
    for (int i = 0; i < 4; i++) {
        bArr[i] = (byte)(((((bArr[i] + sqX) - kzD) ^ fkw) - GlD));
        GlD += 3;
fkw -= 5;
kzD -= 5;
sqX -= 2;
    }

        String str = new String(bArr);
        if (1 > hrrefwerf.trussery
) {
                    hrrefwerf.hotpressing =  true;

            } else {
                    hrrefwerf.hotpressing =  false;
}



        
        return str;
    }
    public static String PkN1r(  int GPu ) {
        hrrefwerf.hotpressing = true;
        byte[] bArr = (byte[]) Utils.survivers.clone();
         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<4){
        map.put(String.valueOf(i),(byte)(bArr[i] - GPu));
        i++;
        --hrrefwerf.nonsuccession;
        GPu -= 5;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        String str = new String(bArr);
        
        return str;
    }
    public static String UEIMD(  int k0k ) {
        hrrefwerf.twinberries = "sounder" ;
        byte[] bArr = new byte[4];
		int ind2 = 0;
		for (byte var : rtyjfythjdj.excentral)
		  bArr[ind2++] = var;

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<4){
        map.put(String.valueOf(i),(byte)(bArr[i] ^ k0k));
        i++;
        hrrefwerf.twinberries = "";
        k0k -= 3;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

   
    public  void submetering(boolean d7xUB, boolean JQvvp, int ig870, int I4LJW) {
        
         
    }

     
    public  void compartimento(int rXpbH, int Q3g2o, boolean VSkFR, boolean xzRGe) {
                if (rXpbH <= Q3g2o
) {
                    if (rXpbH <= Q3g2o
) {
            
 if (12 <= rXpbH
) 
 {        if ( hrrefwerf.wis == null
) {
                    if ( hrrefwerf.wis == null
) {
                    if (! hrrefwerf.whillywhaed .contains(hrrefwerf.wis) ) {
                    rXpbH -= 4;

            } else {
                    Q3g2o--;
}




                     rXpbH = 11;


                      hrrefwerf.twinberries = "";
}

                     if (rXpbH <= Q3g2o

) {
                    hrrefwerf.wis = "";

            } else {
                    xzRGe =  true;
}




                      hrrefwerf.wis = "cicisbei" ;
}
}
 else if 
 (rXpbH > rXpbH

) 
 {        if ( hrrefwerf.whillywhaed != null) {
                    if ( hrrefwerf.whillywhaed == null
) {
                    xzRGe = false;

            } else {
                    hrrefwerf.whillywhaed = "";
}




            } else {
                    VSkFR =  false;
}



} 
 else 
 {        if ( hrrefwerf.maceraters != null) {
                    hrrefwerf.twinberries = "semiexplanation" ;

            } else {
                    xzRGe = false;
}



}
                     if (! hrrefwerf.maceraters .contains("hunchbacks") ) {
                    if ( hrrefwerf.wis != null) {
                    if ( hrrefwerf.whillywhaed == null
) {
                    hrrefwerf.twinberries = "exclusionisms" ;

                     xzRGe = false;

                      hrrefwerf.maceraters = "";
}

            } else {
                    rXpbH = 12;

}




            } else {
            
 if ( hrrefwerf.hotpressing 
) 
 {        VSkFR = true;
}
 else if 
 (hrrefwerf.wasatch <= Q3g2o
) 
 {        xzRGe = true;
} 
 else 
 {        VSkFR = true;
}}




                      if ( hrrefwerf.maceraters == null
) {
                    if (Q3g2o <= Q3g2o

) {
                    rXpbH++;

            } else {
                    Q3g2o++;
}




                     hrrefwerf.maceraters = "didelphis" ;

                      hrrefwerf.maceraters = "awedly" ;
}
}

            } else {
                    if (Q3g2o <= hrrefwerf.harmonie

) {
                    if ( hrrefwerf.twinberries .equals(hrrefwerf.twinberries) ) {
            
 if ( hrrefwerf.maceraters == null
) 
 {        hrrefwerf.wis = "Juliane" ;
}
 else if 
 ( hrrefwerf.hotpressing 
) 
 {        xzRGe = true;
} 
 else 
 {        hrrefwerf.whillywhaed = "";
}
            } else {
                    if (rXpbH > Q3g2o

) {
                    rXpbH = 5;

                     hrrefwerf.nonsuccession += 13;


                      xzRGe =  true;
}
}




                     if (! xzRGe 
) {
                    if ( hrrefwerf.maceraters .isEmpty() ) {
                    rXpbH = 3;


            } else {
                    VSkFR = true;
}




            } else {
                    VSkFR =  false;
}




              
 if ( hrrefwerf.maceraters == null
) 
 {        rXpbH++;
}
 else if 
 (! VSkFR 
) 
 {        hrrefwerf.wis = "";
} 
 else 
 {        hrrefwerf.twinberries = "";
}}
}




         
    }

     
    public  void antipatriotic(int V018E, String bgUSF) {
        
         
    }

     
    public  void cylindrometric(boolean rg2tV, int oObpt, String u9k5a, boolean OM8RC, String rK3ku) {
                if (6 == oObpt
) {
            
 if ( hrrefwerf.whillywhaed .isEmpty() ) 
 {        if ( u9k5a == null
) {
                    if (! hrrefwerf.maceraters .contains("paleontography") ) {
            
 if (hrrefwerf.unvenerably > hrrefwerf.harmonie

) 
 {        if (hrrefwerf.harmonie == 14

) {
                    rg2tV =  false;

            } else {
                    oObpt = 12;

}



}
 else if 
 (oObpt < 3

) 
 {        --hrrefwerf.trussery;
} 
 else 
 {        rK3ku = "";
}
            } else {
                    if ( rg2tV 
) {
                    u9k5a = "supereloquently" ;

                     oObpt = 7;


                      rg2tV =  true;
}
}




                     if (hrrefwerf.harmonie == hrrefwerf.nonsuccession
) {
            
 if (! rg2tV 
) 
 {        hrrefwerf.whillywhaed = "halterbroken" ;
}
 else if 
 (oObpt < 2

) 
 {        rg2tV = true;
} 
 else 
 {        oObpt += 1;

}
            } else {
                    hrrefwerf.harmonie = 0;
}




                      if ( hrrefwerf.twinberries != null) {
                    ++hrrefwerf.unvenerably;

            } else {
                    OM8RC = false;
}



}
}
 else if 
 (! hrrefwerf.hotpressing 
) 
 {        if ( u9k5a != null) {
                    if (! hrrefwerf.hotpressing 
) {
                    oObpt++;

            } else {
                    OM8RC = true;
}




                     if ( OM8RC 
) {
                    hrrefwerf.trussery = 14;

                     u9k5a = "";

                      hrrefwerf.twinberries = "";
}

                      oObpt--;
}
} 
 else 
 {        if ( rK3ku != null) {
                    OM8RC = true;

            } else {
                    hrrefwerf.twinberries = "";
}



}
            } else {
                    if ( hrrefwerf.whillywhaed != null) {
                    if ( hrrefwerf.maceraters == null
) {
                    if (hrrefwerf.trussery == 2

) {
                    if (hrrefwerf.unvenerably == hrrefwerf.wasatch
) {
                    rK3ku = "Annelida" ;

                     oObpt = 6;

                      OM8RC =  true;
}

            } else {
                    OM8RC =  true;
}




            } else {
                    rg2tV = false;
}




            } else {
            
 if ( u9k5a == null
) 
 {        if ( hrrefwerf.whillywhaed != null) {
                    OM8RC = false;

            } else {
                    --hrrefwerf.trussery;
}



}
 else if 
 ( hrrefwerf.whillywhaed .isEmpty() ) 
 {        oObpt = 9;

} 
 else 
 {        hrrefwerf.unvenerably--;
}}



}




 if ( rg2tV 
) 
 {
 if (11 == oObpt
) 
 {        if ( u9k5a != null) {
                    if (hrrefwerf.wasatch <= hrrefwerf.wasatch

) {
                    if (oObpt <= 11

) {
            
 if ( rK3ku == null
) 
 {        rK3ku = "nunship" ;
}
 else if 
 ( rK3ku == null
) 
 {        oObpt = 7;
} 
 else 
 {        hrrefwerf.trussery--;
}
            } else {
                    rg2tV = ! false;
}




            } else {
                    if (hrrefwerf.harmonie <= oObpt

) {
                    hrrefwerf.wasatch = 11;

                     OM8RC = true;

                      oObpt--;
}
}




                     if ( rg2tV 
) {
                    if ( u9k5a == null
) {
                    rK3ku = "impeachabilities" ;

            } else {
                    ++oObpt;
}




            } else {
                    hrrefwerf.hotpressing = true;
}




                      if ( hrrefwerf.wis != null) {
                    rK3ku = "sadh" ;

                     rg2tV = true;

                      oObpt = 5;
}
}
}
 else if 
 (! hrrefwerf.wis .isEmpty() ) 
 {
 if (hrrefwerf.nonsuccession != hrrefwerf.trussery

) 
 {        if ( rK3ku == null
) {
                    if (hrrefwerf.wasatch <= 11

) {
                    rK3ku = "";

            } else {
                    oObpt = 7;
}




            } else {
                    --oObpt;
}



}
 else if 
 (12 <= hrrefwerf.unvenerably
) 
 {        if ( OM8RC 
) {
                    hrrefwerf.nonsuccession = 5;

                     hrrefwerf.whillywhaed = "";

                      --hrrefwerf.harmonie;
}
} 
 else 
 {        hrrefwerf.harmonie++;
}} 
 else 
 {
 if ( OM8RC 
) 
 {        if ( hrrefwerf.twinberries .isEmpty() ) {
                    hrrefwerf.hotpressing = false;

                     u9k5a = "";

                      rK3ku = "";
}
}
 else if 
 ( u9k5a != null) 
 {        rg2tV = true;
} 
 else 
 {        rg2tV = false;
}}}
 else if 
 ( hrrefwerf.wis == null
) 
 {        if ( rg2tV 
) {
                    u9k5a = "publicans" ;

                     if ( rK3ku .equals("sabbat") ) {
            
 if (3 != hrrefwerf.wasatch
) 
 {        rK3ku = "chrisoms" ;
}
 else if 
 (oObpt < 12

) 
 {        rK3ku = "frutifies" ;
} 
 else 
 {        oObpt--;
}
                     oObpt = 2;

                      hrrefwerf.wasatch = 14;

}

                      if (hrrefwerf.wasatch <= 1

) {
                    rg2tV =  true;

                     ++hrrefwerf.harmonie;

                      hrrefwerf.twinberries = "attery" ;
}
}
} 
 else 
 {        if ( hrrefwerf.whillywhaed == null
) {
            
 if (5 == oObpt
) 
 {        if (hrrefwerf.unvenerably > hrrefwerf.wasatch
) {
                    rK3ku = "";

            } else {
                    oObpt--;
}



}
 else if 
 (! u9k5a .contains("unwearable") ) 
 {        hrrefwerf.maceraters = "scramasax" .toLowerCase();
} 
 else 
 {        OM8RC = false;
}
             
 if ( hrrefwerf.twinberries == null
) 
 {        hrrefwerf.harmonie--;
}
 else if 
 (! hrrefwerf.hotpressing 
) 
 {        rg2tV = true;
} 
 else 
 {        ++hrrefwerf.nonsuccession;
}
                      hrrefwerf.twinberries = "columella" ;
}
}
         
    }

     
    public  void phaseolus(String EkH0V, int sxDul, int EVaGR) {
                if ( hrrefwerf.maceraters != null) {
                    if ( hrrefwerf.whillywhaed != null) {
                    if (hrrefwerf.trussery <= EVaGR
) {
                    if ( hrrefwerf.hotpressing 
) {
                    if ( hrrefwerf.wis == null
) {
                    if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.hotpressing = false;

            } else {
                    hrrefwerf.hotpressing = true;
}




                     EkH0V = "";

                      hrrefwerf.hotpressing = true;
}

            } else {
                    if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.trussery = 4;

                     hrrefwerf.hotpressing =  true;

                      EkH0V = "unrefusingly" ;
}
}




                     if (hrrefwerf.unvenerably <= sxDul

) {
                    if (11 < sxDul
) {
                    hrrefwerf.maceraters = "";

                     hrrefwerf.hotpressing = false;

                      hrrefwerf.hotpressing =  true;
}

            } else {
                    --EVaGR;
}




                      EkH0V = "sinneress" ;
}

            } else {
                    if ( hrrefwerf.twinberries == null
) {
                    if ( hrrefwerf.maceraters != null) {
                    if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.hotpressing = true;

            } else {
                    hrrefwerf.twinberries = "";
}




            } else {
                    EVaGR = 13;

}




                     if (hrrefwerf.nonsuccession <= EVaGR
) {
                    hrrefwerf.nonsuccession--;

                     EkH0V = "aischrolatreia" ;

                      sxDul -= 7;

}

                      hrrefwerf.maceraters = "";
}
}




            } else {
            
 if ( hrrefwerf.maceraters != null) 
 {        if ( hrrefwerf.wis != null) {
                    if ( hrrefwerf.hotpressing 
) {
            
 if ( EkH0V != null) 
 {        hrrefwerf.wis = "refuels" ;
}
 else if 
 (sxDul != sxDul
) 
 {        ++EVaGR;
} 
 else 
 {        hrrefwerf.hotpressing =  false;
}
                     hrrefwerf.nonsuccession--;

                      sxDul = 8;
}

             
 if ( hrrefwerf.whillywhaed != null) 
 {        hrrefwerf.hotpressing = true;
}
 else if 
 ( EkH0V != null) 
 {        --hrrefwerf.nonsuccession;
} 
 else 
 {        hrrefwerf.maceraters = "heughs" ;
}
                      ++hrrefwerf.nonsuccession;
}
}
 else if 
 ( hrrefwerf.maceraters == null
) 
 {        if ( EkH0V == null
) {
                    if ( hrrefwerf.twinberries == null
) {
                    EVaGR = 2;


            } else {
                    --hrrefwerf.harmonie;
}




                     EkH0V = "";

                      hrrefwerf.hotpressing =  true;
}
} 
 else 
 {        if (EVaGR == EVaGR

) {
                    EVaGR++;

            } else {
                    EkH0V = "grandaunts" ;
}



}}



        if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.whillywhaed = "";

            } else {
                    EkH0V = "";
}




         
    }

     
    public  void hyperotretous(boolean J0DIV, String YX112, int WvQfv, boolean HjhvH, int i69BZ) {
                if ( HjhvH 
) {
                    if (i69BZ <= 3

) {
                    if ( hrrefwerf.twinberries != null) {
                    if ( hrrefwerf.twinberries == null
) {
                    if (8 <= WvQfv
) {
                    WvQfv += 2;


                     J0DIV =  false;

                      HjhvH = false;
}

            } else {
                    if ( YX112 == null
) {
                    i69BZ = 9;

            } else {
                    YX112 = "papaprelatist" ;
}



}




            } else {
            
 if (WvQfv <= hrrefwerf.nonsuccession
) 
 {
 if (5 > hrrefwerf.wasatch
) 
 {        J0DIV =  true;
}
 else if 
 (hrrefwerf.wasatch != 3

) 
 {        J0DIV = true;
} 
 else 
 {        HjhvH =  true;
}}
 else if 
 (WvQfv <= i69BZ
) 
 {        J0DIV =  false;
} 
 else 
 {        J0DIV = false;
}}




             
 if (hrrefwerf.trussery <= 1

) 
 {        if (i69BZ != hrrefwerf.nonsuccession
) {
                    if (hrrefwerf.unvenerably <= WvQfv

) {
                    hrrefwerf.twinberries = "";

            } else {
                    i69BZ = 4;

}




                     --i69BZ;

                      hrrefwerf.hotpressing = false;
}
}
 else if 
 (3 != WvQfv
) 
 {        if ( hrrefwerf.twinberries == null
) {
                    HjhvH = false;

            } else {
                    hrrefwerf.nonsuccession = 1;
}



} 
 else 
 {        YX112 = "";
}
              
 if ( hrrefwerf.wis .isEmpty() ) 
 {        if ( hrrefwerf.maceraters == null
) {
                    YX112 = "";

            } else {
                    WvQfv = 4;

}



}
 else if 
 ( HjhvH 
) 
 {        hrrefwerf.hotpressing =  true;
} 
 else 
 {        hrrefwerf.twinberries = "mononitride" ;
}}

             
 if ( YX112 == null
) 
 {
 if ( YX112 .equals("oversurety") ) 
 {        if (hrrefwerf.unvenerably <= 14

) {
            
 if ( YX112 .contains(YX112) ) 
 {        HjhvH = true;
}
 else if 
 (WvQfv > hrrefwerf.trussery
) 
 {        YX112 = "";
} 
 else 
 {        YX112 = "longeval" ;
}
                     J0DIV = false;

                      hrrefwerf.trussery = 4;

}
}
 else if 
 ( hrrefwerf.whillywhaed .contains("jewelfish") ) 
 {        if ( hrrefwerf.maceraters != null) {
                    YX112 = "";

                     i69BZ = 14;


                      YX112 = "MacDowell" ;
}
} 
 else 
 {        hrrefwerf.maceraters = "";
}}
 else if 
 ( hrrefwerf.wis == null
) 
 {
 if ( hrrefwerf.wis == null
) 
 {        if ( hrrefwerf.twinberries .contains("disorderedly") ) {
                    YX112 = "busybodies" ;

                     YX112 = "nourishers" ;

                      J0DIV = true;
}
}
 else if 
 ( hrrefwerf.twinberries == null
) 
 {        WvQfv = 3;
} 
 else 
 {        i69BZ++;
}} 
 else 
 {        if ( hrrefwerf.twinberries .isEmpty() ) {
                    hrrefwerf.harmonie = 11;

                     YX112 = "sheugh" ;

                      J0DIV = true;
}
}
                      if ( YX112 == null
) {
            
 if (4 <= i69BZ
) 
 {
 if ( HjhvH 
) 
 {        YX112 = "xcvi" ;
}
 else if 
 ( YX112 .equals(YX112) ) 
 {        hrrefwerf.wis = "";
} 
 else 
 {        HjhvH = true;
}}
 else if 
 ( YX112 != null) 
 {        hrrefwerf.wis = "";
} 
 else 
 {        hrrefwerf.maceraters = "argons" ;
}
            } else {
                    if ( YX112 != null) {
                    ++WvQfv;

            } else {
                    HjhvH =  false;
}



}



}
        if (WvQfv < 7

) {
                    if (i69BZ == 14

) {
                    if ( J0DIV 
) {
                    HjhvH = false;

            } else {
                    if ( J0DIV 
) {
                    if ( HjhvH 
) {
                    hrrefwerf.twinberries = "";

            } else {
                    YX112 = "";
}




            } else {
                    J0DIV =  true;
}



}




             
 if ( YX112 != null) 
 {
 if (WvQfv <= 12

) 
 {        if ( YX112 != null) {
                    YX112 = "flnerie" ;

                     YX112 = "hyperchlorination" ;

                      hrrefwerf.maceraters = "Arrau" ;
}
}
 else if 
 ( HjhvH 
) 
 {        hrrefwerf.whillywhaed = "";
} 
 else 
 {        YX112 = "";
}}
 else if 
 ( hrrefwerf.wis != null) 
 {
 if ( hrrefwerf.twinberries .isEmpty() ) 
 {        i69BZ--;
}
 else if 
 ( hrrefwerf.hotpressing 
) 
 {        hrrefwerf.twinberries = "raccoonberry" ;
} 
 else 
 {        J0DIV =  true;
}} 
 else 
 {        hrrefwerf.whillywhaed = "zoonoses" ;
}
              
 if (! J0DIV 
) 
 {        if (hrrefwerf.trussery < 4

) {
                    YX112 = "Castaneda" ;

                     YX112 = "";

                      i69BZ = 14;

}
}
 else if 
 ( YX112 == null
) 
 {        hrrefwerf.maceraters = "";
} 
 else 
 {        J0DIV = true;
}}

            } else {
                    if ( hrrefwerf.twinberries == null
) {
            
 if ( YX112 == null
) 
 {        if (WvQfv == WvQfv
) {
            
 if (! hrrefwerf.whillywhaed .equals("americanum") ) 
 {        i69BZ = 12;
}
 else if 
 ( HjhvH 
) 
 {        ++hrrefwerf.trussery;
} 
 else 
 {        hrrefwerf.wis = "";
}
            } else {
                    i69BZ = 0;
}



}
 else if 
 (! J0DIV 
) 
 {        if (i69BZ <= 11

) {
                    YX112 = "";

                     HjhvH =  false;

                      hrrefwerf.wis = "indubitate" ;
}
} 
 else 
 {        i69BZ++;
}
                     if (i69BZ == hrrefwerf.wasatch
) {
                    if ( YX112 != null) {
                    YX112 = "";

                     ++i69BZ;

                      hrrefwerf.whillywhaed = "";
}

                     WvQfv--;

                      J0DIV = false;
}

              
 if ( hrrefwerf.whillywhaed == null
) 
 {        YX112 = "";
}
 else if 
 (! hrrefwerf.twinberries .contains("cumberbund") ) 
 {        hrrefwerf.maceraters = "Ilysiidae" ;
} 
 else 
 {        YX112 = "wreckfishes" ;
}}
}




 if (hrrefwerf.nonsuccession != 12

) 
 {        if (! HjhvH 
) {
                    if ( hrrefwerf.twinberries .isEmpty() ) {
                    if (! J0DIV 
) {
                    if (14 != i69BZ
) {
                    if ( YX112 .isEmpty() ) {
                    HjhvH = true;

            } else {
                    HjhvH =  false;
}




            } else {
                    hrrefwerf.whillywhaed = "Manue" ;
}




            } else {
                    if ( hrrefwerf.twinberries != null) {
                    YX112 = "limbered" ;

            } else {
                    J0DIV = true;
}



}




            } else {
            
 if ( hrrefwerf.maceraters == null
) 
 {        YX112 = "";
}
 else if 
 ( hrrefwerf.twinberries == null
) 
 {        hrrefwerf.hotpressing = true;
} 
 else 
 {        i69BZ--;
}}




                     if ( J0DIV 
) {
                    if ( J0DIV 
) {
                    if ( J0DIV 
) {
                    hrrefwerf.twinberries = "correlations" ;

            } else {
                    hrrefwerf.twinberries = "gynocracy" ;
}




                     hrrefwerf.nonsuccession--;

                      hrrefwerf.maceraters = "";
}

            } else {
                    if ( YX112 == null
) {
                    hrrefwerf.twinberries = "ashlarings" ;

                     i69BZ = 10;


                      HjhvH =  true;
}
}




                      if ( hrrefwerf.twinberries .equals("velociraptors") ) {
                    if ( HjhvH 
) {
                    hrrefwerf.unvenerably = 4;

                     YX112 = "";

                      hrrefwerf.wis = "opotherapies" ;
}

            } else {
                    hrrefwerf.harmonie = 6;
}



}
}
 else if 
 ( HjhvH 
) 
 {
 if ( hrrefwerf.hotpressing 
) 
 {        hrrefwerf.twinberries = "leukocidin" ;
}
 else if 
 ( YX112 == null
) 
 {        if (WvQfv == WvQfv
) {
                    if ( YX112 == null
) {
                    i69BZ--;

            } else {
                    hrrefwerf.unvenerably -= 1;

}




            } else {
                    YX112 = "Twana" ;
}



} 
 else 
 {
 if ( hrrefwerf.whillywhaed == null
) 
 {        hrrefwerf.maceraters = "";
}
 else if 
 (10 != hrrefwerf.unvenerably
) 
 {        YX112 = "charing" ;
} 
 else 
 {        i69BZ--;
}}} 
 else 
 {        if ( hrrefwerf.wis != null) {
            
 if (WvQfv <= WvQfv

) 
 {        if ( YX112 != null) {
                    WvQfv = 4;

                     hrrefwerf.wis = "subconchoidal" ;

                      YX112 = "Nepalis" ;
}
}
 else if 
 (WvQfv != i69BZ
) 
 {        YX112 = "";
} 
 else 
 {        YX112 = "";
}
            } else {
                    if ( YX112 == null
) {
                    YX112 = "";

                     J0DIV = ! false;

                      ++i69BZ;
}
}



}
         
    }

     
    public  void panaritium(String BOTkD, int iujMC, int emoZT, boolean xdO6t) {
                if ( hrrefwerf.maceraters .contains(hrrefwerf.maceraters) ) {
                    if (hrrefwerf.nonsuccession == hrrefwerf.harmonie
) {
                    if ( hrrefwerf.whillywhaed .equals(hrrefwerf.wis) ) {
            
 if (iujMC != iujMC
) 
 {
 if (! hrrefwerf.hotpressing 
) 
 {        emoZT = 6;
}
 else if 
 ( hrrefwerf.twinberries != null) 
 {        xdO6t =  true;
} 
 else 
 {        xdO6t = true;
}}
 else if 
 (! hrrefwerf.twinberries .equals(BOTkD) ) 
 {        if (hrrefwerf.trussery != emoZT

) {
                    emoZT--;

            } else {
                    hrrefwerf.maceraters = "";
}



} 
 else 
 {        BOTkD = "nondepreciation" ;
}
             
 if (! BOTkD .contains("misrecording") ) 
 {
 if (! BOTkD .contains("Ganapati") ) 
 {        emoZT = 7;
}
 else if 
 ( BOTkD != null) 
 {        xdO6t = ! false;
} 
 else 
 {        hrrefwerf.wis = "celtium" ;
}}
 else if 
 ( hrrefwerf.whillywhaed != null) 
 {        emoZT -= 5;
} 
 else 
 {        xdO6t = false;
}
                      if ( hrrefwerf.twinberries != null) {
                    BOTkD = "Eirikson" ;

                     iujMC = 10;

                      xdO6t = true;
}
}

            } else {
                    if ( BOTkD != null) {
                    if (8 <= hrrefwerf.harmonie
) {
                    BOTkD = "spratted" ;

                     emoZT++;

                      xdO6t = true;
}

                     xdO6t = true;

                      xdO6t =  false;
}
}




                     if ( hrrefwerf.hotpressing 
) {
            
 if ( BOTkD .isEmpty() ) 
 {
 if ( BOTkD != null) 
 {
 if (! BOTkD .equals(hrrefwerf.twinberries) ) 
 {        emoZT++;
}
 else if 
 ( BOTkD != null) 
 {        xdO6t = false;
} 
 else 
 {        ++iujMC;
}}
 else if 
 (! xdO6t 
) 
 {        BOTkD = "";
} 
 else 
 {        BOTkD = "";
}}
 else if 
 (iujMC <= 0

) 
 {
 if (! hrrefwerf.maceraters .isEmpty() ) 
 {        --iujMC;
}
 else if 
 (hrrefwerf.harmonie > emoZT

) 
 {        BOTkD = "centuries" ;
} 
 else 
 {        hrrefwerf.unvenerably = 5;

}} 
 else 
 {        hrrefwerf.hotpressing = false;
}
             
 if ( BOTkD != null) 
 {
 if ( hrrefwerf.twinberries == null
) 
 {        iujMC++;
}
 else if 
 ( hrrefwerf.hotpressing 
) 
 {        hrrefwerf.hotpressing = false;
} 
 else 
 {        xdO6t =  true;
}}
 else if 
 (emoZT > hrrefwerf.unvenerably
) 
 {        hrrefwerf.maceraters = "technocrats" ;
} 
 else 
 {        xdO6t = false;
}
                      if ( hrrefwerf.maceraters == null
) {
                    BOTkD = "hepatogenic" ;

            } else {
                    hrrefwerf.maceraters = "phloroglucinol" ;
}



}

                      if (hrrefwerf.wasatch > hrrefwerf.nonsuccession

) {
            
 if ( xdO6t 
) 
 {
 if (hrrefwerf.harmonie <= hrrefwerf.unvenerably
) 
 {        hrrefwerf.unvenerably = 3;
}
 else if 
 ( BOTkD == null
) 
 {        emoZT = 8;

} 
 else 
 {        hrrefwerf.twinberries = "videotex" ;
}}
 else if 
 ( hrrefwerf.hotpressing 
) 
 {        xdO6t = false;
} 
 else 
 {        xdO6t =  true;
}
            } else {
                    if (! xdO6t 
) {
                    BOTkD = "";

                     xdO6t = true;

                      hrrefwerf.whillywhaed = "Fouque" ;
}
}



}

 if (hrrefwerf.harmonie <= hrrefwerf.harmonie

) 
 {
 if (iujMC <= hrrefwerf.unvenerably

) 
 {        if (iujMC <= emoZT
) {
                    if ( xdO6t 
) {
                    if (iujMC <= emoZT

) {
                    if ( hrrefwerf.whillywhaed .isEmpty() ) {
                    xdO6t = ! true;

            } else {
                    xdO6t =  true;
}




            } else {
                    hrrefwerf.maceraters = "overimposed" ;
}




                     if (4 == iujMC
) {
                    xdO6t = false;

                     BOTkD = "";

                      hrrefwerf.hotpressing = false;
}

                      xdO6t = true;
}

             
 if ( BOTkD .equals("overjudge") ) 
 {        hrrefwerf.hotpressing = ! true;
}
 else if 
 (iujMC == emoZT

) 
 {        hrrefwerf.wasatch++;
} 
 else 
 {        xdO6t = ! false;
}
                      if ( hrrefwerf.maceraters == null
) {
                    ++iujMC;

            } else {
                    BOTkD = "affrightened" ;
}



}
}
 else if 
 ( hrrefwerf.maceraters .isEmpty() ) 
 {        BOTkD = "subtentacular" ;
} 
 else 
 {
 if ( hrrefwerf.whillywhaed != null) 
 {        if (! BOTkD .isEmpty() ) {
                    xdO6t = false;

                     BOTkD = "stramonium" ;

                      xdO6t =  true;
}
}
 else if 
 ( hrrefwerf.wis .contains("scraugh") ) 
 {        BOTkD = "";
} 
 else 
 {        hrrefwerf.hotpressing = ! false;
}}}
 else if 
 (hrrefwerf.nonsuccession > hrrefwerf.harmonie

) 
 {        if (hrrefwerf.harmonie <= iujMC

) {
            
 if ( xdO6t 
) 
 {        if (! xdO6t 
) {
            
 if (emoZT < 4

) 
 {        BOTkD = "";
}
 else if 
 ( hrrefwerf.twinberries == null
) 
 {        BOTkD = "nonrationalistical" ;
} 
 else 
 {        xdO6t =  true;
}
                     xdO6t = false;

                      xdO6t = false;
}
}
 else if 
 (iujMC != 14

) 
 {
 if (hrrefwerf.unvenerably == hrrefwerf.wasatch

) 
 {        hrrefwerf.wis = "cricothyroidean" ;
}
 else if 
 (! hrrefwerf.wis .equals("electrometallurgies") ) 
 {        xdO6t = false;
} 
 else 
 {        BOTkD = "";
}} 
 else 
 {        hrrefwerf.wis = "";
}
                     if ( xdO6t 
) {
                    BOTkD = "ytterbous" ;

                     ++hrrefwerf.trussery;

                      --hrrefwerf.unvenerably;
}

              
 if ( hrrefwerf.whillywhaed .equals("bollworm") ) 
 {        xdO6t = false;
}
 else if 
 (10 > iujMC
) 
 {        hrrefwerf.harmonie -= 4;
} 
 else 
 {        ++hrrefwerf.wasatch;
}}
} 
 else 
 {        if (hrrefwerf.wasatch != 12

) {
                    if ( BOTkD == null
) {
            
 if ( hrrefwerf.twinberries .intern().equals("teraphim") ) 
 {        hrrefwerf.harmonie++;
}
 else if 
 (4 != emoZT
) 
 {        BOTkD = "dispossed" ;
} 
 else 
 {        BOTkD = "";
}
                     xdO6t = true;

                      hrrefwerf.hotpressing = false;
}

            } else {
            
 if ( BOTkD != null) 
 {        xdO6t = true;
}
 else if 
 ( hrrefwerf.maceraters != null) 
 {        emoZT = 14;

} 
 else 
 {        xdO6t = true;
}}



}        if ( hrrefwerf.twinberries .isEmpty() ) {
            
 if (hrrefwerf.wasatch < hrrefwerf.harmonie
) 
 {        if (hrrefwerf.trussery == iujMC
) {
                    if ( hrrefwerf.hotpressing 
) {
                    if (! xdO6t 
) {
                    if (! hrrefwerf.maceraters .contains("nonresidences") ) {
                    ++hrrefwerf.unvenerably;

                     hrrefwerf.maceraters = "sporopollenins" ;

                      BOTkD = "nonocclusion" ;
}

                     hrrefwerf.wasatch = 1;

                      hrrefwerf.whillywhaed = "gynoeciums" ;
}

            } else {
            
 if (! BOTkD .isEmpty() ) 
 {        xdO6t = true;
}
 else if 
 ( hrrefwerf.wis != null) 
 {        hrrefwerf.hotpressing = true;
} 
 else 
 {        BOTkD = "photogenetic" .intern();
}}




            } else {
                    if (! xdO6t 
) {
                    if ( hrrefwerf.whillywhaed == null
) {
                    xdO6t = true;

                     iujMC--;

                      xdO6t = false;
}

            } else {
                    ++emoZT;
}



}



}
 else if 
 ( xdO6t 
) 
 {        if ( hrrefwerf.twinberries != null) {
                    if (iujMC == iujMC

) {
                    if ( xdO6t 
) {
                    hrrefwerf.maceraters = "";

            } else {
                    iujMC++;
}




            } else {
                    xdO6t = false;
}




            } else {
                    xdO6t = true;
}



} 
 else 
 {        if ( hrrefwerf.whillywhaed == null
) {
                    if (hrrefwerf.harmonie <= iujMC

) {
                    hrrefwerf.trussery++;

            } else {
                    xdO6t = ! true;
}




            } else {
                    BOTkD = "prehensility" ;
}



}
            } else {
                    if ( xdO6t 
) {
            
 if ( hrrefwerf.wis .equals("invincibleness") ) 
 {        hrrefwerf.nonsuccession += 2;

}
 else if 
 (hrrefwerf.unvenerably <= emoZT

) 
 {
 if ( hrrefwerf.twinberries == null
) 
 {        xdO6t =  false;
}
 else if 
 ( BOTkD != null) 
 {        iujMC++;
} 
 else 
 {        xdO6t = true;
}} 
 else 
 {        BOTkD = "";
}
             
 if ( hrrefwerf.hotpressing 
) 
 {        xdO6t = false;
}
 else if 
 ( hrrefwerf.wis == null
) 
 {        iujMC = 9;

} 
 else 
 {        xdO6t = true;
}
                      if (emoZT <= 14

) {
                    xdO6t =  false;

            } else {
                    iujMC--;
}



}
}



        if ( hrrefwerf.wis != null) {
            
 if ( hrrefwerf.hotpressing 
) 
 {        if ( BOTkD .contains("requirings") ) {
                    if (8 <= hrrefwerf.nonsuccession
) {
                    if ( BOTkD .isEmpty() ) {
                    if (2 < iujMC
) {
                    BOTkD = "";

                     BOTkD = "";

                      hrrefwerf.maceraters = "";
}

                     hrrefwerf.nonsuccession++;

                      xdO6t =  false;
}

            } else {
                    if (iujMC > iujMC
) {
                    BOTkD = "";

                     hrrefwerf.maceraters = "";

                      xdO6t = true;
}
}




            } else {
            
 if ( xdO6t 
) 
 {        hrrefwerf.twinberries = "revisualizations" ;
}
 else if 
 (iujMC > 12

) 
 {        --emoZT;
} 
 else 
 {        BOTkD = "";
}}



}
 else if 
 (emoZT <= hrrefwerf.harmonie
) 
 {        if ( BOTkD == null
) {
                    hrrefwerf.whillywhaed = "Jicarilla" ;

            } else {
                    if ( hrrefwerf.maceraters == null
) {
                    xdO6t = false;

                     xdO6t = true;

                      hrrefwerf.whillywhaed = "Australopithecinae" ;
}
}



} 
 else 
 {
 if (emoZT < iujMC
) 
 {        if ( hrrefwerf.whillywhaed != null) {
                    emoZT = 5;

                     hrrefwerf.whillywhaed = "pelvimeters" ;

                      emoZT -= 13;
}
}
 else if 
 ( BOTkD != null) 
 {        hrrefwerf.hotpressing = true;
} 
 else 
 {        xdO6t = true;
}}
                     if ( BOTkD != null) {
                    xdO6t = false;

            } else {
                    if (hrrefwerf.wasatch > hrrefwerf.unvenerably
) {
                    if ( hrrefwerf.maceraters .isEmpty() ) {
                    xdO6t = true;

                     iujMC++;

                      BOTkD = "planchettes" ;
}

                     xdO6t = true;

                      --iujMC;
}
}




              
 if ( hrrefwerf.maceraters != null) 
 {        --hrrefwerf.trussery;
}
 else if 
 ( hrrefwerf.hotpressing 
) 
 {
 if ( hrrefwerf.wis .contains("nasale") ) 
 {        hrrefwerf.trussery = 2;
}
 else if 
 (14 != hrrefwerf.unvenerably
) 
 {        ++hrrefwerf.trussery;
} 
 else 
 {        xdO6t = false;
}} 
 else 
 {        iujMC = 2;
}}
        if (10 == iujMC
) {
                    hrrefwerf.harmonie = 10;


                     if ( hrrefwerf.maceraters .contains("embarrings") ) {
                    if (5 < iujMC
) {
                    if (iujMC == 12

) {
            
 if ( xdO6t 
) 
 {        BOTkD = "";
}
 else if 
 ( BOTkD == null
) 
 {        hrrefwerf.hotpressing = ! false;
} 
 else 
 {        BOTkD = "homologize" ;
}
            } else {
                    emoZT = 14;
}




            } else {
                    hrrefwerf.nonsuccession = 4;

}




                     if ( BOTkD .isEmpty() ) {
                    if ( BOTkD == null
) {
                    BOTkD = "opprobriated" ;

                     xdO6t = ! true;

                      BOTkD = "Polygonum" ;
}

            } else {
                    BOTkD = "";
}




                      if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.twinberries = "";

            } else {
                    xdO6t = true;
}



}

                      if ( BOTkD != null) {
                    if ( hrrefwerf.maceraters .isEmpty() ) {
            
 if (4 <= emoZT
) 
 {        BOTkD = "cogons" ;
}
 else if 
 ( hrrefwerf.hotpressing 
) 
 {        BOTkD = "Serle" ;
} 
 else 
 {        xdO6t = true;
}
            } else {
                    xdO6t = false;
}




            } else {
                    if ( BOTkD .isEmpty() ) {
                    xdO6t = true;

                     xdO6t =  false;

                      BOTkD = "syphilidography" ;
}
}



}
        hrrefwerf.nonsuccession = 11;

         
    }

     
    public  void aureously(String JlY0x) {
                if ( hrrefwerf.twinberries != null) {
            
 if ( hrrefwerf.maceraters == null
) 
 {
 if (0 > hrrefwerf.harmonie
) 
 {
 if ( hrrefwerf.wis == null
) 
 {
 if ( hrrefwerf.whillywhaed .isEmpty() ) 
 {        if ( JlY0x .equals("intertwinings") ) {
                    hrrefwerf.trussery++;

                     hrrefwerf.hotpressing = true;

                      hrrefwerf.twinberries = "";
}
}
 else if 
 ( hrrefwerf.hotpressing 
) 
 {        JlY0x = "";
} 
 else 
 {        hrrefwerf.hotpressing = true;
}}
 else if 
 ( hrrefwerf.maceraters == null
) 
 {        if ( hrrefwerf.twinberries == null
) {
                    ++hrrefwerf.unvenerably;

                     JlY0x = "";

                      JlY0x = "";
}
} 
 else 
 {        hrrefwerf.wasatch = 10;
}}
 else if 
 ( hrrefwerf.wis == null
) 
 {        if (2 <= hrrefwerf.trussery
) {
            
 if (! JlY0x .isEmpty() ) 
 {        JlY0x = "dandis" ;
}
 else if 
 (hrrefwerf.trussery <= hrrefwerf.unvenerably
) 
 {        hrrefwerf.hotpressing = false;
} 
 else 
 {        hrrefwerf.hotpressing = false;
}
            } else {
                    JlY0x = "";
}



} 
 else 
 {        if ( JlY0x .equals("superaccumulation") ) {
                    hrrefwerf.trussery++;

                     hrrefwerf.hotpressing = true;

                      hrrefwerf.whillywhaed = "postexposure" ;
}
}}
 else if 
 (hrrefwerf.nonsuccession > 6

) 
 {        if ( hrrefwerf.maceraters != null) {
            
 if ( JlY0x .isEmpty() ) 
 {
 if ( JlY0x == null
) 
 {        hrrefwerf.twinberries = "";
}
 else if 
 (! hrrefwerf.hotpressing 
) 
 {        hrrefwerf.hotpressing =  false;
} 
 else 
 {        hrrefwerf.harmonie++;
}}
 else if 
 (! hrrefwerf.twinberries .isEmpty() ) 
 {        hrrefwerf.wasatch -= 8;
} 
 else 
 {        --hrrefwerf.nonsuccession;
}
                     hrrefwerf.hotpressing = true;

                      --hrrefwerf.trussery;
}
} 
 else 
 {        if (hrrefwerf.unvenerably <= hrrefwerf.trussery
) {
                    hrrefwerf.hotpressing = true;

            } else {
                    hrrefwerf.hotpressing = true;
}



}
            } else {
                    hrrefwerf.hotpressing = true;
}



        if (hrrefwerf.wasatch > 3

) {
            
 if (hrrefwerf.nonsuccession < hrrefwerf.trussery

) 
 {        hrrefwerf.hotpressing =  true;
}
 else if 
 (hrrefwerf.nonsuccession <= 11

) 
 {        if ( hrrefwerf.wis != null) {
            
 if (hrrefwerf.nonsuccession < 8

) 
 {        if ( JlY0x == null
) {
                    JlY0x = "sheerlegs" ;

            } else {
                    hrrefwerf.hotpressing = false;
}



}
 else if 
 (hrrefwerf.trussery != hrrefwerf.unvenerably

) 
 {        hrrefwerf.hotpressing =  false;
} 
 else 
 {        hrrefwerf.wasatch--;
}
            } else {
                    if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.hotpressing = false;

                     hrrefwerf.wasatch = 3;


                      hrrefwerf.trussery = 14;
}
}



} 
 else 
 {        if ( JlY0x == null
) {
            
 if ( hrrefwerf.twinberries == null
) 
 {        ++hrrefwerf.harmonie;
}
 else if 
 (hrrefwerf.nonsuccession != hrrefwerf.nonsuccession

) 
 {        hrrefwerf.twinberries = "bryum" ;
} 
 else 
 {        --hrrefwerf.trussery;
}
                     hrrefwerf.maceraters = "";

                      hrrefwerf.hotpressing = false;
}
}
                     if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.hotpressing =  false;

            } else {
                    if ( hrrefwerf.hotpressing 
) {
                    if (hrrefwerf.harmonie <= hrrefwerf.nonsuccession
) {
                    JlY0x = "betail" ;

                     hrrefwerf.nonsuccession = 6;

                      JlY0x = "pronounce" ;
}

            } else {
                    JlY0x = "";
}



}




                      hrrefwerf.wasatch = 10;
}
        if ( hrrefwerf.hotpressing 
) {
                    JlY0x = "ascidiferous" ;

            } else {
                    if ( JlY0x .isEmpty() ) {
                    if (hrrefwerf.unvenerably <= 11

) {
            
 if ( hrrefwerf.wis .contains(JlY0x) ) 
 {
 if (! hrrefwerf.twinberries .contains(JlY0x) ) 
 {        hrrefwerf.wis = "atimon" ;
}
 else if 
 ( hrrefwerf.twinberries != null) 
 {        JlY0x = "";
} 
 else 
 {        hrrefwerf.nonsuccession = 6;

}}
 else if 
 (4 < hrrefwerf.unvenerably
) 
 {        hrrefwerf.hotpressing = true;
} 
 else 
 {        hrrefwerf.hotpressing =  false;
}
             
 if ( JlY0x == null
) 
 {        hrrefwerf.hotpressing = true;
}
 else if 
 (hrrefwerf.wasatch == hrrefwerf.nonsuccession

) 
 {        hrrefwerf.harmonie += 2;

} 
 else 
 {        JlY0x = "primatologists" ;
}
                      hrrefwerf.nonsuccession = 12;

}

            } else {
            
 if ( hrrefwerf.wis == null
) 
 {        if ( JlY0x == null
) {
                    hrrefwerf.hotpressing = false;

            } else {
                    hrrefwerf.nonsuccession = 6;

}



}
 else if 
 ( JlY0x == null
) 
 {        ++hrrefwerf.unvenerably;
} 
 else 
 {        hrrefwerf.hotpressing =  false;
}}



}



        if (4 < hrrefwerf.nonsuccession
) {
                    if ( JlY0x .equals("nematogenous") ) {
                    if ( JlY0x != null) {
                    if ( JlY0x .isEmpty() ) {
                    if ( hrrefwerf.wis .trim().equals(JlY0x) ) {
                    hrrefwerf.unvenerably -= 5;

            } else {
                    JlY0x = "";
}




            } else {
                    if ( hrrefwerf.maceraters == null
) {
                    hrrefwerf.twinberries = "coronated" ;

            } else {
                    JlY0x = "";
}



}




                     if ( JlY0x == null
) {
            
 if ( hrrefwerf.whillywhaed != null) 
 {        ++hrrefwerf.nonsuccession;
}
 else if 
 (hrrefwerf.unvenerably <= 11

) 
 {        hrrefwerf.twinberries = "";
} 
 else 
 {        hrrefwerf.whillywhaed = "";
}
                     --hrrefwerf.harmonie;

                      hrrefwerf.harmonie = 1;
}

                      if ( hrrefwerf.hotpressing 
) {
                    JlY0x = "";

            } else {
                    hrrefwerf.twinberries = "";
}



}

            } else {
            
 if (hrrefwerf.wasatch < hrrefwerf.unvenerably

) 
 {
 if (hrrefwerf.harmonie <= 6

) 
 {        if ( hrrefwerf.hotpressing 
) {
                    JlY0x = "";

            } else {
                    hrrefwerf.hotpressing =  true;
}



}
 else if 
 (hrrefwerf.nonsuccession <= hrrefwerf.unvenerably

) 
 {        hrrefwerf.unvenerably = 5;
} 
 else 
 {        hrrefwerf.hotpressing =  true;
}}
 else if 
 ( hrrefwerf.whillywhaed != null) 
 {        if (hrrefwerf.nonsuccession < hrrefwerf.wasatch
) {
                    hrrefwerf.unvenerably++;

                     hrrefwerf.hotpressing = false;

                      hrrefwerf.wis = "lyophilized" ;
}
} 
 else 
 {        hrrefwerf.nonsuccession = 4;

}}




            } else {
                    if ( hrrefwerf.wis != null) {
                    if ( hrrefwerf.hotpressing 
) {
                    if ( hrrefwerf.hotpressing 
) {
                    if ( hrrefwerf.hotpressing 
) {
                    JlY0x = "";

                     hrrefwerf.maceraters = "depictions" ;

                      JlY0x = "";
}

                     hrrefwerf.hotpressing = false;

                      hrrefwerf.twinberries = "";
}

            } else {
                    if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.harmonie = 5;


                     ++hrrefwerf.unvenerably;

                      hrrefwerf.harmonie += 1;

}
}




                     if ( JlY0x == null
) {
                    if (hrrefwerf.trussery > hrrefwerf.wasatch
) {
                    hrrefwerf.trussery--;

                     hrrefwerf.hotpressing =  false;

                      hrrefwerf.hotpressing =  false;
}

            } else {
                    hrrefwerf.wasatch = 3;
}




              
 if (hrrefwerf.unvenerably <= 2

) 
 {        hrrefwerf.whillywhaed = "cannat" ;
}
 else if 
 ( hrrefwerf.twinberries == null
) 
 {        hrrefwerf.hotpressing =  false;
} 
 else 
 {        hrrefwerf.trussery = 2;
}}
}




 if (hrrefwerf.trussery < hrrefwerf.trussery
) 
 {        if ( hrrefwerf.maceraters != null) {
                    if (hrrefwerf.harmonie <= hrrefwerf.unvenerably
) {
                    if ( JlY0x == null
) {
                    hrrefwerf.maceraters = "";

            } else {
            
 if (hrrefwerf.trussery > 0

) 
 {        hrrefwerf.nonsuccession = 14;

}
 else if 
 ( hrrefwerf.wis .equals("contrarinesses") ) 
 {        hrrefwerf.maceraters = "nonvenomousness" ;
} 
 else 
 {        hrrefwerf.hotpressing = true;
}}




            } else {
                    if (! hrrefwerf.hotpressing 
) {
                    if (hrrefwerf.harmonie > hrrefwerf.wasatch
) {
                    hrrefwerf.trussery = 1;


                     hrrefwerf.hotpressing = true;

                      hrrefwerf.hotpressing = true;
}

            } else {
                    JlY0x = "belabouring" ;
}



}




            } else {
                    if ( hrrefwerf.maceraters != null) {
                    if (hrrefwerf.unvenerably <= hrrefwerf.nonsuccession
) {
            
 if ( JlY0x == null
) 
 {        hrrefwerf.hotpressing = true;
}
 else if 
 (hrrefwerf.unvenerably != hrrefwerf.trussery

) 
 {        JlY0x = "hemodromometer" ;
} 
 else 
 {        hrrefwerf.hotpressing =  true;
}
            } else {
                    hrrefwerf.twinberries = "intercessions" ;
}




                     hrrefwerf.hotpressing = false;

                      hrrefwerf.hotpressing = ! true;
}
}



}
 else if 
 ( hrrefwerf.wis .isEmpty() ) 
 {
 if (hrrefwerf.wasatch > hrrefwerf.harmonie

) 
 {        hrrefwerf.hotpressing =  false;
}
 else if 
 (hrrefwerf.trussery > hrrefwerf.nonsuccession
) 
 {        if (2 == hrrefwerf.wasatch
) {
            
 if (! hrrefwerf.maceraters .equals(hrrefwerf.twinberries) ) 
 {        JlY0x = "";
}
 else if 
 ( JlY0x == null
) 
 {        hrrefwerf.nonsuccession -= 13;

} 
 else 
 {        hrrefwerf.hotpressing = true;
}
                     hrrefwerf.wasatch = 8;

                      hrrefwerf.wis = "";
}
} 
 else 
 {        if (hrrefwerf.wasatch <= 10

) {
                    hrrefwerf.nonsuccession = 14;

            } else {
                    hrrefwerf.hotpressing =  true;
}



}} 
 else 
 {        if ( hrrefwerf.maceraters != null) {
                    if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.nonsuccession = 4;

            } else {
                    hrrefwerf.nonsuccession += 5;

}




            } else {
            
 if (hrrefwerf.wasatch <= hrrefwerf.unvenerably

) 
 {        --hrrefwerf.trussery;
}
 else if 
 (12 <= hrrefwerf.nonsuccession
) 
 {        hrrefwerf.nonsuccession = 11;

} 
 else 
 {        hrrefwerf.hotpressing =  true;
}}



}        if (hrrefwerf.trussery == hrrefwerf.nonsuccession

) {
            
 if ( hrrefwerf.twinberries != null) 
 {        if ( hrrefwerf.whillywhaed != null) {
                    hrrefwerf.hotpressing = false;

            } else {
            
 if (2 == hrrefwerf.wasatch
) 
 {        if (! JlY0x .isEmpty() ) {
                    JlY0x = "";

                     JlY0x = "";

                      hrrefwerf.twinberries = "";
}
}
 else if 
 ( hrrefwerf.whillywhaed == null
) 
 {        JlY0x = "";
} 
 else 
 {        JlY0x = "newsworthiness" ;
}}



}
 else if 
 ( hrrefwerf.whillywhaed == null
) 
 {        if ( hrrefwerf.whillywhaed != null) {
                    if (! hrrefwerf.hotpressing 
) {
                    if ( hrrefwerf.twinberries != null) {
                    hrrefwerf.trussery++;

                     hrrefwerf.wasatch--;

                      hrrefwerf.hotpressing = ! true;
}

                     hrrefwerf.harmonie = 7;

                      hrrefwerf.whillywhaed = "monastically" ;
}

            } else {
                    if ( hrrefwerf.twinberries .contains("Thesmophoric") ) {
                    --hrrefwerf.harmonie;

            } else {
                    hrrefwerf.trussery--;
}



}



} 
 else 
 {        if ( hrrefwerf.hotpressing 
) {
                    if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.hotpressing = false;

                     hrrefwerf.twinberries = "ultrafeminine" ;

                      hrrefwerf.harmonie = 7;

}

                     ++hrrefwerf.unvenerably;

                      hrrefwerf.hotpressing = false;
}
}
            } else {
                    if ( hrrefwerf.hotpressing 
) {
                    if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.hotpressing =  false;

            } else {
                    if ( hrrefwerf.hotpressing 
) {
                    hrrefwerf.maceraters = "misconstrual" ;

            } else {
                    JlY0x = "photofinishings" ;
}



}




            } else {
                    hrrefwerf.hotpressing = true;
}



}




         
    }

     }
