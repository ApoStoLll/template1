package frog.company.app13june.kyf;
import frog.company.app13june.kyf.traerfw.t5hwtgedrf;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.MainActivity;
import frog.company.app13june.kyf.kjuyjtrhdr;
import frog.company.app13june.cc.jurtyewsrf;
import frog.company.app13june.kyf.traerfw.hrrefwerf;
import frog.company.app13june.cc.TYHREw;
import frog.company.app13june.kyf.iutldxrfgresg;
import frog.company.app13june.kyf.srtrhju;
import frog.company.app13june.kyf.traerfw.thewerf;
import frog.company.app13june.cc.htryesd;
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

public class srtrhju {

   public static String taihoa = "preenrollment";
   public static int reviles = 116;
   public static int wicks = 75;
   public static String reinettes = "ergotropic";
   public static String jigging = "nonrandomness";
   public static boolean rootfastness = false;
   public static int pearlite = 79;
   public static String gushier = "Ouzinkie";
   public static byte[] verbosity = new byte[]{70, 65, 70};
   public static byte[] unmakes = new byte[]{7, 63, 63, 71, 22, 93, 114, 78};
   public static final byte[] outrhymed = new byte[]{-83, -97, 111, 63, 68, -124, -83, -83, 85, -90};
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {
        srtrhju.rootfastness = false;
        return this.client;
    }

    String url = thewerf.YrMuu(108, 122, 106);

    public final void onSelectCard(@NotNull Context context,@Nullable final ISelectCard mOnListener) {
        ++srtrhju.reviles;
        Intrinsics.checkNotNullParameter(context,srtrhju.VOcJh(111, 108, 121));
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                Log.e(TYHREw.aZRsK(81, 101, 53, 50),hrrefwerf.LOUmE(75, 48, 71, 76));
            }

            @Override
            public void onResponse(Call call,Response response) throws IOException {
                String strRes = response.body().string();
                try {
                    JSONObject obj = new JSONObject(strRes);
        --srtrhju.wicks;
                    JSONArray array = obj.getJSONArray(jurtyewsrf.xZwa0(49, 65, 75, 99, 50, 119, 86));
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
                    int value;

                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
                        switch (res.getString(kjuyjtrhdr.wvLSR(122, 71))){
                            case"ACE": { value = 14; break; }
                            case"KING": { value = 13; break; }
                            case"QUEEN": { value = 12; break; }
                            case"JACK": { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString(MainActivity.lhOCW(76))); break; }
                        }
                        arrayList.add(new Model(res.getString(DialogsJ.Yy9zq(76, 54, 83)),value,res.getString(srtrhju.AkJYk(90, 89, 114, 74))));
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static String N0mtY(  int Lha, int beD, int M6W, int niV, int tdI, int kQF, int BXv ) {
        srtrhju.rootfastness =  true;
        byte[] bArr = {42, 47, 42};

            int length = 3;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (((((((bArr[i] + BXv) + kQF) ^ tdI) - niV) + M6W) + beD) + Lha);
        length = i2;
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String Lujr9(  int H3h, int dH1, int xFz, int yVu ) {
        srtrhju.rootfastness = ! true;
        byte[] bArr = (byte[]) htryesd.shakerism.clone();
         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<36){
        map.put(String.valueOf(i),(byte)((((bArr[i] - yVu) - xFz) ^ dH1) + H3h));
        i++;
        H3h -= 3;
dH1 += 1;
xFz += 5;
yVu += 2;

        }

    HashSet<String> set=new HashSet<>(map.keySet());
        srtrhju.rootfastness = true;

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        srtrhju.taihoa = "";
        
        return str;
    }

       public static String VOcJh(  int Elj, int mFe, int HDu ) {
        srtrhju.taihoa = "dioptoscopy" ;
        byte[] bArr = (byte[]) iutldxrfgresg.tachycardiac.clone();
         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<7){
    maped.put(i,(byte) (((bArr[i] + HDu) + mFe) - Elj));
        srtrhju.gushier = "unmutinously" ;
            Elj -= 1;
mFe -= 1;
HDu += 2;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

        String str = new String(bArr);
        if (srtrhju.pearlite < srtrhju.wicks

) {
                    srtrhju.jigging = "vittle" ;

                     srtrhju.pearlite = 11;


                      srtrhju.reviles = 8;
}
        
        return str;
    }
    public static String AkJYk(  int f31, int Fvv, int fK3, int vfQ ) {
        srtrhju.gushier = "advisy" ;
        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = jurtyewsrf.gargarisms[i];

            int i = 0;
    while(i < 4) {
        bArr[i] = (byte)(((((bArr[i] - vfQ) - fK3) + Fvv) + f31));
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String YMNUH(  int z16 ) {
        srtrhju.rootfastness = false;
        byte[] bArr = new byte[6];
		for (int i = 0; i < 6; i++)
		  bArr[i] = t5hwtgedrf.parallelize[i];

         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<6){
    maped.put(i,(byte) (bArr[i] - z16));
            z16 += 2;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

        String str = new String(bArr);
        
        return str;
    }

    public  void landshark(String gAPZp) {
                if ( srtrhju.rootfastness 
) {
                    if ( gAPZp != null) {
                    if ( gAPZp == null
) {
            
 if ( srtrhju.gushier .equals("operettist") ) 
 {
 if ( gAPZp == null
) 
 {        if ( gAPZp == null
) {
                    srtrhju.rootfastness = true;

            } else {
                    srtrhju.rootfastness =  false;
}



}
 else if 
 ( srtrhju.gushier != null) 
 {        srtrhju.pearlite = 8;

} 
 else 
 {        srtrhju.rootfastness = false;
}}
 else if 
 (srtrhju.wicks > 2

) 
 {        if (srtrhju.wicks <= srtrhju.pearlite

) {
                    srtrhju.wicks--;

            } else {
                    srtrhju.wicks = 3;
}



} 
 else 
 {        srtrhju.rootfastness = false;
}
                     if ( srtrhju.rootfastness 
) {
                    if (srtrhju.reviles <= 9

) {
                    srtrhju.reviles--;

                     srtrhju.pearlite++;

                      gAPZp = "";
}

            } else {
                    srtrhju.rootfastness = true;
}




              
 if ( gAPZp .contains(gAPZp) ) 
 {        srtrhju.taihoa = "";
}
 else if 
 (srtrhju.reviles <= srtrhju.reviles
) 
 {        srtrhju.rootfastness = true;
} 
 else 
 {        srtrhju.wicks = 5;

}}

                     if (srtrhju.pearlite <= srtrhju.wicks

) {
                    if ( srtrhju.rootfastness 
) {
                    if ( srtrhju.rootfastness 
) {
                    srtrhju.rootfastness = ! false;

            } else {
                    srtrhju.rootfastness =  false;
}




                     srtrhju.taihoa = "";

                      gAPZp = "";
}

                     if (srtrhju.reviles != srtrhju.reviles

) {
                    srtrhju.pearlite = 11;


            } else {
                    srtrhju.wicks = 12;

}




                      srtrhju.wicks += 0;
}

              
 if ( gAPZp != null) 
 {        if (6 <= srtrhju.wicks
) {
                    gAPZp = "ponderousness" ;

                     gAPZp = "";

                      srtrhju.rootfastness =  true;
}
}
 else if 
 ( gAPZp != null) 
 {        srtrhju.rootfastness = false;
} 
 else 
 {        --srtrhju.pearlite;
}}

             
 if ( srtrhju.jigging .equals("blighia") ) 
 {        if ( gAPZp .equals("calefying") ) {
                    if ( srtrhju.jigging == null
) {
                    if (! srtrhju.rootfastness 
) {
                    --srtrhju.wicks;

                     srtrhju.rootfastness = false;

                      srtrhju.rootfastness = false;
}

                     srtrhju.rootfastness = false;

                      gAPZp = "preventured" ;
}

            } else {
                    if ( srtrhju.gushier == null
) {
                    srtrhju.rootfastness = true;

            } else {
                    gAPZp = "";
}



}



}
 else if 
 (srtrhju.pearlite < 2

) 
 {
 if (srtrhju.pearlite <= 9

) 
 {        if ( srtrhju.rootfastness 
) {
                    srtrhju.rootfastness = true;

                     srtrhju.reinettes = "";

                      srtrhju.reinettes = "";
}
}
 else if 
 ( srtrhju.taihoa != null) 
 {        gAPZp = "Kemalist" ;
} 
 else 
 {        srtrhju.wicks = 12;
}} 
 else 
 {        if ( srtrhju.jigging == null
) {
                    srtrhju.rootfastness =  true;

                     gAPZp = "";

                      srtrhju.wicks = 13;
}
}
              
 if ( gAPZp != null) 
 {
 if ( srtrhju.jigging == null
) 
 {        if (srtrhju.pearlite < 8

) {
                    gAPZp = "folkmotes" ;

                     gAPZp = "nephrologists" ;

                      srtrhju.rootfastness =  true;
}
}
 else if 
 ( srtrhju.rootfastness 
) 
 {        srtrhju.rootfastness = true;
} 
 else 
 {        gAPZp = "sabelloid" ;
}}
 else if 
 (5 != srtrhju.wicks
) 
 {        if (! gAPZp .equals("impresas") ) {
                    srtrhju.rootfastness = false;

                     ++srtrhju.reviles;

                      srtrhju.reinettes = "";
}
} 
 else 
 {        srtrhju.pearlite--;
}}
        gAPZp = "exemption" ;
        if (4 <= srtrhju.pearlite
) {
                    if ( srtrhju.gushier != null) {
                    if ( srtrhju.gushier .isEmpty() ) {
            
 if (! srtrhju.rootfastness 
) 
 {        if ( srtrhju.rootfastness 
) {
                    if ( srtrhju.taihoa == null
) {
                    srtrhju.reviles = 5;


                     srtrhju.pearlite = 6;


                      srtrhju.rootfastness =  false;
}

            } else {
                    gAPZp = "unridiculed" ;
}



}
 else if 
 ( srtrhju.reinettes .toUpperCase().contains("paralanguages") ) 
 {        if ( gAPZp != null) {
                    srtrhju.pearlite = 10;

                     srtrhju.rootfastness =  false;

                      srtrhju.pearlite = 12;
}
} 
 else 
 {        gAPZp = "rizzered" ;
}
                     if (srtrhju.reviles < 1

) {
                    if ( gAPZp != null) {
                    srtrhju.reinettes = "denaturizing" ;

            } else {
                    srtrhju.wicks = 2;
}




                     ++srtrhju.wicks;

                      srtrhju.pearlite = 0;
}

                      if ( srtrhju.rootfastness 
) {
                    srtrhju.rootfastness =  true;

                     gAPZp = "margosas" ;

                      srtrhju.rootfastness = true;
}
}

            } else {
                    if ( srtrhju.reinettes == null
) {
                    if (1 <= srtrhju.reviles
) {
            
 if ( srtrhju.gushier != null) 
 {        srtrhju.rootfastness = false;
}
 else if 
 (srtrhju.reviles <= srtrhju.wicks

) 
 {        srtrhju.rootfastness = ! true;
} 
 else 
 {        gAPZp = "";
}
            } else {
                    srtrhju.pearlite = 11;

}




            } else {
                    if ( srtrhju.rootfastness 
) {
                    srtrhju.rootfastness =  false;

            } else {
                    gAPZp = "";
}



}



}




                     if ( srtrhju.taihoa != null) {
                    if ( srtrhju.reinettes == null
) {
                    if (! srtrhju.gushier .isEmpty() ) {
                    if ( gAPZp == null
) {
                    srtrhju.wicks++;

                     srtrhju.rootfastness = true;

                      srtrhju.rootfastness = false;
}

            } else {
                    srtrhju.reinettes = "columnating" ;
}




                     if ( srtrhju.jigging == null
) {
                    srtrhju.pearlite--;

                     gAPZp = "reintermediation" ;

                      gAPZp = "sentimos" ;
}

                      srtrhju.rootfastness = false;
}

            } else {
                    if (srtrhju.reviles <= srtrhju.reviles
) {
            
 if ( srtrhju.gushier == null
) 
 {        srtrhju.rootfastness =  false;
}
 else if 
 ( srtrhju.rootfastness 
) 
 {        ++srtrhju.wicks;
} 
 else 
 {        srtrhju.rootfastness = true;
}
            } else {
                    srtrhju.pearlite++;
}



}




              
 if (! gAPZp .contains(gAPZp) ) 
 {
 if ( srtrhju.rootfastness 
) 
 {        if ( srtrhju.gushier == null
) {
                    srtrhju.rootfastness = false;

            } else {
                    srtrhju.wicks = 12;

}



}
 else if 
 ( gAPZp .isEmpty() ) 
 {        srtrhju.wicks = 9;

} 
 else 
 {        gAPZp = "omnipercipiency" ;
}}
 else if 
 ( gAPZp == null
) 
 {        if ( srtrhju.rootfastness 
) {
                    srtrhju.reviles--;

            } else {
                    srtrhju.gushier = "actualization" ;
}



} 
 else 
 {        srtrhju.rootfastness = true;
}}

         
    }

     
    public  void conquest(boolean PZLHw, int V8h27) {
                srtrhju.pearlite = 12;


 if ( srtrhju.jigging .isEmpty() ) 
 {        if (! srtrhju.rootfastness 
) {
                    if (srtrhju.wicks > srtrhju.reviles

) {
            
 if (V8h27 <= V8h27

) 
 {
 if (V8h27 <= 3

) 
 {        if (! srtrhju.jigging .isEmpty() ) {
                    PZLHw = false;

                     srtrhju.reviles = 7;


                      PZLHw =  true;
}
}
 else if 
 (V8h27 <= srtrhju.wicks
) 
 {        V8h27++;
} 
 else 
 {        srtrhju.taihoa = "constitutionalisms" ;
}}
 else if 
 ( PZLHw 
) 
 {        if ( srtrhju.taihoa != null) {
                    srtrhju.gushier = "villegiature" ;

                     srtrhju.gushier = "";

                      srtrhju.jigging = "stambul" .intern();
}
} 
 else 
 {        srtrhju.reinettes = "";
}
                     if (V8h27 < srtrhju.pearlite

) {
                    if ( srtrhju.gushier == null
) {
                    srtrhju.jigging = "brainpans" ;

            } else {
                    V8h27 -= 7;

}




                     ++V8h27;

                      srtrhju.taihoa = "sphacelotoxin" ;
}

              
 if (V8h27 <= 3

) 
 {        srtrhju.taihoa = "";
}
 else if 
 ( srtrhju.reinettes != null) 
 {        srtrhju.taihoa = "";
} 
 else 
 {        PZLHw = true;
}}

            } else {
                    if (V8h27 <= V8h27
) {
            
 if ( srtrhju.reinettes != null) 
 {        if ( PZLHw 
) {
                    V8h27 = 10;


            } else {
                    srtrhju.gushier = "reduplicatory" ;
}



}
 else if 
 (srtrhju.reviles <= 11

) 
 {        srtrhju.jigging = "affectation" ;
} 
 else 
 {        srtrhju.jigging = "wanking" ;
}
             
 if (V8h27 > V8h27
) 
 {        srtrhju.taihoa = "candors" ;
}
 else if 
 ( srtrhju.taihoa != null) 
 {        PZLHw = true;
} 
 else 
 {        srtrhju.taihoa = "";
}
                      PZLHw = false;
}
}



}
 else if 
 (srtrhju.pearlite <= srtrhju.reviles

) 
 {
 if ( srtrhju.jigging != null) 
 {
 if ( srtrhju.jigging != null) 
 {        srtrhju.reinettes = "";
}
 else if 
 ( srtrhju.taihoa != null) 
 {        if ( srtrhju.jigging .contains("pulmonifer") ) {
                    PZLHw = false;

            } else {
                    srtrhju.jigging = "";
}



} 
 else 
 {        srtrhju.gushier = "";
}}
 else if 
 ( srtrhju.taihoa != null) 
 {
 if ( PZLHw 
) 
 {        if ( PZLHw 
) {
                    srtrhju.jigging = "";

            } else {
                    PZLHw = true;
}



}
 else if 
 ( PZLHw 
) 
 {        V8h27 = 4;
} 
 else 
 {        srtrhju.reinettes = "";
}} 
 else 
 {
 if ( srtrhju.gushier != null) 
 {        --srtrhju.pearlite;
}
 else if 
 (! srtrhju.jigging .isEmpty() ) 
 {        --V8h27;
} 
 else 
 {        PZLHw = false;
}}} 
 else 
 {        if ( srtrhju.taihoa == null
) {
                    srtrhju.jigging = "lamantin" ;

                     srtrhju.jigging = "";

                      ++srtrhju.pearlite;
}
}
 if ( PZLHw 
) 
 {        if (! PZLHw 
) {
            
 if ( srtrhju.reinettes == null
) 
 {        if (V8h27 == V8h27

) {
            
 if (V8h27 <= srtrhju.pearlite

) 
 {        if (3 > V8h27
) {
                    PZLHw = true;

                     PZLHw = true;

                      srtrhju.gushier = "";
}
}
 else if 
 ( srtrhju.gushier .contains(srtrhju.reinettes) ) 
 {        srtrhju.jigging = "magnoliopsida" .toUpperCase();
} 
 else 
 {        PZLHw = true;
}
                     if ( srtrhju.gushier == null
) {
                    PZLHw = false;

                     srtrhju.rootfastness = false;

                      V8h27 = 3;
}

                      PZLHw = false;
}
}
 else if 
 (V8h27 != 4

) 
 {        PZLHw = false;
} 
 else 
 {        if (srtrhju.pearlite != srtrhju.pearlite

) {
                    V8h27 -= 1;


                     srtrhju.jigging = "interambulacra" ;

                      srtrhju.rootfastness = false;
}
}
            } else {
                    if ( srtrhju.reinettes == null
) {
            
 if ( srtrhju.taihoa .isEmpty() ) 
 {        if (8 > V8h27
) {
                    srtrhju.taihoa = "";

            } else {
                    srtrhju.wicks = 0;

}



}
 else if 
 ( srtrhju.taihoa == null
) 
 {        PZLHw = true;
} 
 else 
 {        PZLHw = ! false;
}
            } else {
                    if (V8h27 <= V8h27
) {
                    V8h27 = 13;


            } else {
                    V8h27 = 1;
}



}



}



}
 else if 
 (V8h27 != 4

) 
 {        if (srtrhju.wicks != srtrhju.wicks

) {
            
 if (V8h27 > 11

) 
 {
 if ( srtrhju.taihoa == null
) 
 {
 if (V8h27 == srtrhju.wicks
) 
 {        srtrhju.rootfastness = false;
}
 else if 
 ( srtrhju.jigging .isEmpty() ) 
 {        V8h27 = 7;
} 
 else 
 {        V8h27 = 7;
}}
 else if 
 ( PZLHw 
) 
 {        V8h27++;
} 
 else 
 {        PZLHw = true;
}}
 else if 
 (V8h27 != 8

) 
 {
 if ( srtrhju.jigging == null
) 
 {        srtrhju.reinettes = "flimflam" ;
}
 else if 
 (! srtrhju.jigging .equals("sweatiness") ) 
 {        V8h27 = 9;

} 
 else 
 {        V8h27 = 5;

}} 
 else 
 {        PZLHw = false;
}
            } else {
                    if (7 <= srtrhju.reviles
) {
                    if ( srtrhju.taihoa == null
) {
                    V8h27 = 13;

            } else {
                    srtrhju.reinettes = "anemological" ;
}




                     srtrhju.rootfastness = true;

                      ++V8h27;
}
}



} 
 else 
 {        if ( srtrhju.jigging == null
) {
                    if (! PZLHw 
) {
                    if ( srtrhju.taihoa .equals(srtrhju.taihoa) ) {
                    srtrhju.rootfastness = false;

                     PZLHw = true;

                      ++V8h27;
}

            } else {
                    --V8h27;
}




            } else {
                    if (srtrhju.reviles > V8h27
) {
                    V8h27--;

                     V8h27 = 3;

                      srtrhju.jigging = "shacklebone" ;
}
}



}        if (13 != srtrhju.pearlite
) {
                    if ( srtrhju.reinettes == null
) {
                    if ( srtrhju.reinettes != null) {
                    if ( srtrhju.taihoa != null) {
                    PZLHw = false;

                     if ( PZLHw 
) {
                    srtrhju.reinettes = "";

                     V8h27 = 8;


                      srtrhju.reinettes = "";
}

                      srtrhju.wicks = 12;

}

            } else {
                    if ( srtrhju.gushier == null
) {
                    if (srtrhju.wicks <= V8h27
) {
                    srtrhju.taihoa = "";

            } else {
                    PZLHw = false;
}




            } else {
                    srtrhju.reinettes = "excitomuscular" ;
}



}




                     if ( PZLHw 
) {
                    if ( srtrhju.gushier != null) {
                    if (! PZLHw 
) {
                    V8h27 = 13;


                     V8h27++;

                      srtrhju.pearlite = 6;
}

                     V8h27--;

                      srtrhju.gushier = "";
}

             
 if ( PZLHw 
) 
 {        srtrhju.taihoa = "vaporability" ;
}
 else if 
 (srtrhju.pearlite == V8h27
) 
 {        PZLHw = ! true;
} 
 else 
 {        V8h27++;
}
                      V8h27 = 1;

}

              
 if ( srtrhju.reinettes == null
) 
 {        V8h27--;
}
 else if 
 ( srtrhju.reinettes .contains(srtrhju.taihoa) ) 
 {        srtrhju.taihoa = "quintillionth" ;
} 
 else 
 {        V8h27 = 1;
}}

                     if ( PZLHw 
) {
            
 if ( srtrhju.taihoa .contains("Pearce") ) 
 {
 if ( srtrhju.taihoa != null) 
 {        if ( PZLHw 
) {
                    PZLHw = false;

                     srtrhju.taihoa = "recombinations" ;

                      srtrhju.taihoa = "uncorroboratively" ;
}
}
 else if 
 (! srtrhju.reinettes .contains(srtrhju.taihoa) ) 
 {        PZLHw =  true;
} 
 else 
 {        V8h27 = 10;
}}
 else if 
 (1 == srtrhju.wicks
) 
 {        srtrhju.jigging = "notturni" .toUpperCase();
} 
 else 
 {        srtrhju.pearlite = 0;

}
             
 if ( srtrhju.jigging != null) 
 {        if ( srtrhju.gushier == null
) {
                    V8h27--;

            } else {
                    srtrhju.wicks += 12;
}



}
 else if 
 (V8h27 <= V8h27
) 
 {        srtrhju.reviles = 10;

} 
 else 
 {        srtrhju.reinettes = "";
}
                      if (V8h27 < V8h27
) {
                    srtrhju.rootfastness = ! true;

                     srtrhju.taihoa = "";

                      srtrhju.gushier = "minicabbing" ;
}
}

                      if (V8h27 != srtrhju.wicks

) {
                    V8h27 = 6;


                     srtrhju.gushier = "";

                      PZLHw =  true;
}
}

 if (4 <= srtrhju.wicks
) 
 {        if (V8h27 <= 13

) {
            
 if (srtrhju.wicks > V8h27
) 
 {        srtrhju.rootfastness =  false;
}
 else if 
 (srtrhju.reviles != V8h27

) 
 {        if (srtrhju.wicks != srtrhju.wicks

) {
            
 if ( PZLHw 
) 
 {        PZLHw = true;
}
 else if 
 (! PZLHw 
) 
 {        srtrhju.rootfastness = false;
} 
 else 
 {        PZLHw =  false;
}
                     srtrhju.jigging = "Haldeman" ;

                      V8h27 = 12;
}
} 
 else 
 {        if (V8h27 <= srtrhju.reviles
) {
                    PZLHw =  false;

            } else {
                    srtrhju.rootfastness = true;
}



}
            } else {
                    srtrhju.reviles = 6;

}



}
 else if 
 ( PZLHw 
) 
 {
 if (! srtrhju.jigging .equals(srtrhju.gushier) ) 
 {        if ( srtrhju.reinettes .equals(srtrhju.gushier) ) {
                    srtrhju.jigging = "";

                     PZLHw = false;

                      srtrhju.reinettes = "rickstick" ;
}
}
 else if 
 (srtrhju.wicks <= srtrhju.wicks

) 
 {        if (V8h27 < V8h27
) {
                    if (V8h27 != srtrhju.wicks
) {
                    srtrhju.pearlite = 13;

                     V8h27--;

                      --srtrhju.reviles;
}

                     --V8h27;

                      PZLHw =  false;
}
} 
 else 
 {        PZLHw = true;
}} 
 else 
 {
 if (V8h27 <= 1

) 
 {
 if ( srtrhju.gushier != null) 
 {        if ( srtrhju.taihoa != null) {
                    PZLHw = true;

                     srtrhju.reviles = 6;

                      srtrhju.reviles = 1;
}
}
 else if 
 (srtrhju.wicks <= srtrhju.reviles
) 
 {        PZLHw = true;
} 
 else 
 {        PZLHw =  false;
}}
 else if 
 ( PZLHw 
) 
 {        if (srtrhju.wicks > V8h27
) {
                    PZLHw = true;

            } else {
                    PZLHw = true;
}



} 
 else 
 {        PZLHw =  true;
}}
         
    }

     
    public  void myrrhols(String osYEK, boolean mUVPJ, String uBst2, int DA14A) {
                srtrhju.taihoa = "Dutchmen" ;
        if ( uBst2 == null
) {
                    if ( uBst2 == null
) {
                    if (DA14A <= 0

) {
                    if ( mUVPJ 
) {
                    if ( mUVPJ 
) {
                    if ( srtrhju.rootfastness 
) {
                    mUVPJ =  false;

                     osYEK = "chytridiomycetes" ;

                      DA14A -= 3;

}

                     --DA14A;

                      osYEK = "spirivalve" ;
}

            } else {
                    mUVPJ =  false;
}




             
 if (DA14A <= DA14A

) 
 {
 if (5 < DA14A
) 
 {        DA14A -= 9;

}
 else if 
 ( srtrhju.jigging == null
) 
 {        mUVPJ =  false;
} 
 else 
 {        --DA14A;
}}
 else if 
 ( mUVPJ 
) 
 {        osYEK = "";
} 
 else 
 {        DA14A++;
}
                      if (srtrhju.wicks != srtrhju.reviles

) {
                    ++DA14A;

                     srtrhju.jigging = "";

                      mUVPJ = true;
}
}

            } else {
                    if ( mUVPJ 
) {
            
 if (DA14A > srtrhju.wicks

) 
 {
 if (DA14A == DA14A
) 
 {        mUVPJ =  true;
}
 else if 
 (DA14A <= srtrhju.pearlite
) 
 {        mUVPJ =  false;
} 
 else 
 {        mUVPJ = true;
}}
 else if 
 ( uBst2 != null) 
 {        uBst2 = "";
} 
 else 
 {        srtrhju.rootfastness = false;
}
             
 if ( uBst2 .isEmpty() ) 
 {        mUVPJ =  false;
}
 else if 
 ( mUVPJ 
) 
 {        osYEK = "";
} 
 else 
 {        uBst2 = "scrampum" ;
}
                      DA14A++;
}
}




             
 if (! mUVPJ 
) 
 {        if (DA14A <= DA14A

) {
                    if ( srtrhju.gushier .isEmpty() ) {
            
 if (srtrhju.reviles > DA14A

) 
 {        DA14A++;
}
 else if 
 (! mUVPJ 
) 
 {        mUVPJ = ! false;
} 
 else 
 {        mUVPJ = true;
}
            } else {
                    mUVPJ = false;
}




            } else {
            
 if ( srtrhju.gushier != null) 
 {        DA14A = 10;

}
 else if 
 ( osYEK .equals(srtrhju.taihoa) ) 
 {        mUVPJ = false;
} 
 else 
 {        srtrhju.rootfastness =  true;
}}



}
 else if 
 (srtrhju.pearlite > 3

) 
 {        if ( srtrhju.taihoa == null
) {
                    if ( srtrhju.taihoa == null
) {
                    mUVPJ = true;

                     mUVPJ = true;

                      mUVPJ = false;
}

            } else {
                    mUVPJ = true;
}



} 
 else 
 {        if (srtrhju.pearlite != 3

) {
                    osYEK = "histotrophy" ;

            } else {
                    --DA14A;
}



}
                      if (srtrhju.reviles <= srtrhju.reviles

) {
                    if ( srtrhju.taihoa .isEmpty() ) {
            
 if (srtrhju.wicks == DA14A
) 
 {        uBst2 = "";
}
 else if 
 ( srtrhju.jigging .equals(srtrhju.gushier) ) 
 {        mUVPJ = false;
} 
 else 
 {        osYEK = "";
}
                     srtrhju.reinettes = "biographic" ;

                      mUVPJ = ! true;
}

            } else {
                    if (2 != srtrhju.pearlite
) {
                    uBst2 = "";

                     mUVPJ = true;

                      srtrhju.reinettes = "";
}
}



}

 if ( srtrhju.rootfastness 
) 
 {        if ( osYEK != null) {
                    if ( srtrhju.rootfastness 
) {
            
 if (3 < DA14A
) 
 {        if (11 <= srtrhju.pearlite
) {
                    if ( osYEK .trim().contains("superconfident") ) {
                    mUVPJ = false;

                     mUVPJ = true;

                      osYEK = "";
}

            } else {
                    srtrhju.gushier = "";
}



}
 else if 
 (! mUVPJ 
) 
 {        if (10 <= DA14A
) {
                    srtrhju.rootfastness = false;

                     mUVPJ =  true;

                      mUVPJ = false;
}
} 
 else 
 {        srtrhju.reviles = 7;

}
                     if ( srtrhju.gushier == null
) {
            
 if ( srtrhju.reinettes != null) 
 {        DA14A = 0;
}
 else if 
 ( osYEK .equals("pullalue") ) 
 {        mUVPJ = false;
} 
 else 
 {        DA14A = 14;
}
                     srtrhju.reviles--;

                      osYEK = "contortuplicate" ;
}

                      if (! srtrhju.rootfastness 
) {
                    ++srtrhju.wicks;

                     uBst2 = "";

                      DA14A = 4;
}
}

            } else {
                    if ( osYEK == null
) {
                    if (srtrhju.pearlite <= DA14A
) {
                    if ( srtrhju.reinettes .isEmpty() ) {
                    mUVPJ = false;

            } else {
                    uBst2 = "";
}




                     srtrhju.rootfastness =  true;

                      srtrhju.rootfastness = false;
}

             
 if ( osYEK == null
) 
 {        ++DA14A;
}
 else if 
 (! osYEK .isEmpty() ) 
 {        mUVPJ =  false;
} 
 else 
 {        uBst2 = "";
}
                      osYEK = "floatplanes" ;
}
}



}
 else if 
 ( osYEK == null
) 
 {        if (2 < DA14A
) {
                    if ( uBst2 != null) {
            
 if (srtrhju.pearlite == srtrhju.reviles
) 
 {        if ( srtrhju.rootfastness 
) {
                    DA14A++;

                     osYEK = "";

                      mUVPJ = false;
}
}
 else if 
 (DA14A > 2

) 
 {        uBst2 = "";
} 
 else 
 {        srtrhju.reviles = 1;
}
                     if (4 <= DA14A
) {
                    --DA14A;

                     uBst2 = "abfarad" ;

                      srtrhju.rootfastness = true;
}

                      srtrhju.reviles = 9;
}

                     if (! mUVPJ 
) {
                    if ( srtrhju.gushier == null
) {
                    mUVPJ = true;

            } else {
                    uBst2 = "";
}




            } else {
                    srtrhju.wicks = 4;
}




                      if (srtrhju.pearlite > srtrhju.wicks

) {
                    mUVPJ = false;

                     uBst2 = "postulationally" ;

                      mUVPJ = false;
}
}
} 
 else 
 {        if ( srtrhju.gushier != null) {
                    if (DA14A < srtrhju.pearlite

) {
                    if ( uBst2 != null) {
                    srtrhju.taihoa = "internationally" ;

                     uBst2 = "scoldings" ;

                      DA14A--;
}

            } else {
                    osYEK = "nonillusiveness" ;
}




            } else {
                    if (srtrhju.pearlite < 3

) {
                    srtrhju.taihoa = "phrasal" ;

            } else {
                    srtrhju.jigging = "";
}



}



}
         
    }

     
    public  void prescription(String LGKYg, int MBDid, int veIvq, int oaq3S) {
                if (oaq3S > oaq3S
) {
                    srtrhju.reinettes = "anthemwise" ;

             
 if ( srtrhju.jigging != null) 
 {        srtrhju.rootfastness = false;
}
 else if 
 ( LGKYg == null
) 
 {        if (MBDid > oaq3S
) {
                    if (1 < oaq3S
) {
                    --oaq3S;

            } else {
                    veIvq = 3;
}




            } else {
                    srtrhju.rootfastness = true;
}



} 
 else 
 {
 if ( srtrhju.taihoa == null
) 
 {        srtrhju.jigging = "shopboy" ;
}
 else if 
 ( srtrhju.taihoa .equals("slighted") ) 
 {        LGKYg = "";
} 
 else 
 {        srtrhju.reinettes = "";
}}
              
 if ( LGKYg != null) 
 {        srtrhju.rootfastness = true;
}
 else if 
 (oaq3S <= srtrhju.reviles

) 
 {        if (MBDid != oaq3S
) {
                    LGKYg = "stanine" ;

                     MBDid = 11;

                      MBDid = 12;
}
} 
 else 
 {        oaq3S = 12;
}}

 if ( srtrhju.reinettes == null
) 
 {        veIvq = 6;
}
 else if 
 (! srtrhju.rootfastness 
) 
 {        if (! srtrhju.rootfastness 
) {
                    srtrhju.wicks -= 1;


            } else {
            
 if ( srtrhju.reinettes == null
) 
 {
 if (MBDid > 14

) 
 {        --oaq3S;
}
 else if 
 (oaq3S < veIvq

) 
 {        srtrhju.rootfastness = ! true;
} 
 else 
 {        oaq3S = 13;
}}
 else if 
 ( srtrhju.rootfastness 
) 
 {        LGKYg = "";
} 
 else 
 {        srtrhju.rootfastness = false;
}}



} 
 else 
 {        if ( srtrhju.gushier == null
) {
                    if ( srtrhju.reinettes != null) {
                    if ( srtrhju.taihoa != null) {
                    LGKYg = "relumed" ;

                     srtrhju.rootfastness = true;

                      veIvq = 3;

}

            } else {
                    srtrhju.rootfastness = true;
}




             
 if ( srtrhju.rootfastness 
) 
 {        srtrhju.rootfastness = true;
}
 else if 
 ( srtrhju.rootfastness 
) 
 {        srtrhju.rootfastness = true;
} 
 else 
 {        LGKYg = "dithecal" ;
}
                      srtrhju.rootfastness = false;
}
}
         
    }

     
    public  void unshakableness(boolean Dxs7A, String oSec5, boolean EEeet, boolean U2JSF) {
        
         
    }

     
    public  void kirmans(int RmCrl, boolean FCEgs, boolean N656E, boolean ApAeF) {
        
 if (srtrhju.pearlite != 14

) 
 {        if ( ApAeF 
) {
            
 if ( srtrhju.jigging == null
) 
 {        if (srtrhju.pearlite != 0

) {
                    if ( srtrhju.reinettes .isEmpty() ) {
                    RmCrl = 9;


            } else {
                    N656E = true;
}




                     if (RmCrl == srtrhju.reviles

) {
                    srtrhju.gushier = "";

            } else {
                    N656E = false;
}




                      srtrhju.reinettes = "sesamol" ;
}
}
 else if 
 ( N656E 
) 
 {        if ( srtrhju.reinettes .contains("hyperaccurateness") ) {
                    if (! ApAeF 
) {
                    N656E = true;

            } else {
                    ApAeF =  false;
}




            } else {
                    RmCrl = 0;
}



} 
 else 
 {
 if ( N656E 
) 
 {        RmCrl = 10;

}
 else if 
 (RmCrl == 11

) 
 {        srtrhju.taihoa = "";
} 
 else 
 {        RmCrl = 8;
}}
            } else {
                    if (srtrhju.pearlite <= srtrhju.wicks

) {
                    if ( FCEgs 
) {
                    if (! srtrhju.taihoa .isEmpty() ) {
                    RmCrl = 10;

            } else {
                    FCEgs = false;
}




            } else {
                    srtrhju.gushier = "sacrosciatic" ;
}




            } else {
                    if (2 > srtrhju.pearlite
) {
                    RmCrl = 9;

            } else {
                    srtrhju.reinettes = "";
}



}



}



}
 else if 
 (srtrhju.pearlite < srtrhju.pearlite
) 
 {        ++RmCrl;
} 
 else 
 {        if (srtrhju.wicks == srtrhju.wicks

) {
                    if ( srtrhju.taihoa != null) {
            
 if ( srtrhju.gushier == null
) 
 {        srtrhju.gushier = "hoeshin" ;
}
 else if 
 (RmCrl <= 12

) 
 {        srtrhju.gushier = "unnationalistically" ;
} 
 else 
 {        srtrhju.jigging = "understatedly" .toLowerCase();
}
                     N656E = true;

                      srtrhju.jigging = "";
}

                     if (srtrhju.pearlite <= 11

) {
                    ApAeF = false;

            } else {
                    FCEgs = false;
}




                      srtrhju.jigging = "diffeomorphic" ;
}
}        if ( FCEgs 
) {
                    if ( srtrhju.jigging .equals(srtrhju.jigging) ) {
                    if ( srtrhju.taihoa .equals(srtrhju.jigging) ) {
            
 if ( N656E 
) 
 {        ApAeF = ! true;
}
 else if 
 (RmCrl != srtrhju.pearlite

) 
 {        if (srtrhju.wicks != RmCrl
) {
                    N656E = false;

            } else {
                    RmCrl = 9;

}



} 
 else 
 {        srtrhju.jigging = "Triadelphia" ;
}
                     if ( ApAeF 
) {
                    if (RmCrl < srtrhju.wicks
) {
                    srtrhju.taihoa = "tibiotarsal" ;

                     srtrhju.jigging = "kinematographically" ;

                      RmCrl--;
}

            } else {
                    srtrhju.reinettes = "";
}




              
 if (srtrhju.wicks < 13

) 
 {        RmCrl = 10;
}
 else if 
 (! FCEgs 
) 
 {        --RmCrl;
} 
 else 
 {        ApAeF = false;
}}

                     if (RmCrl < srtrhju.wicks

) {
                    if (! srtrhju.gushier .isEmpty() ) {
                    if ( srtrhju.taihoa != null) {
                    N656E =  false;

                     RmCrl = 7;

                      ApAeF = ! true;
}

            } else {
                    srtrhju.rootfastness =  true;
}




            } else {
            
 if (srtrhju.reviles != 7

) 
 {        srtrhju.jigging = "";
}
 else if 
 ( srtrhju.jigging != null) 
 {        srtrhju.jigging = "";
} 
 else 
 {        ApAeF =  true;
}}




                      if ( srtrhju.taihoa != null) {
                    N656E = false;

            } else {
                    srtrhju.gushier = "Lonnrot" ;
}



}

                     RmCrl = 13;


              
 if (! N656E 
) 
 {
 if (RmCrl < 0

) 
 {        srtrhju.gushier = "adsorptive" ;
}
 else if 
 ( srtrhju.reinettes != null) 
 {        srtrhju.reviles = 14;
} 
 else 
 {        RmCrl = 10;
}}
 else if 
 ( ApAeF 
) 
 {        if ( N656E 
) {
                    ++RmCrl;

            } else {
                    srtrhju.wicks = 4;

}



} 
 else 
 {        srtrhju.taihoa = "";
}}
        --srtrhju.reviles;

 if (srtrhju.wicks <= RmCrl

) 
 {
 if ( srtrhju.taihoa != null) 
 {        if ( srtrhju.reinettes != null) {
                    if ( N656E 
) {
            
 if ( srtrhju.jigging == null
) 
 {        if ( srtrhju.reinettes == null
) {
                    RmCrl -= 0;


            } else {
                    srtrhju.jigging = "";
}



}
 else if 
 ( srtrhju.jigging != null) 
 {        srtrhju.jigging = "dissipater" ;
} 
 else 
 {        srtrhju.taihoa = "difficulty" ;
}
                     if ( srtrhju.reinettes == null
) {
                    N656E = true;

            } else {
                    srtrhju.jigging = "adorally" ;
}




                      srtrhju.reinettes = "chiefish" ;
}

            } else {
                    if (srtrhju.pearlite <= RmCrl
) {
            
 if ( N656E 
) 
 {        srtrhju.gushier = "";
}
 else if 
 ( N656E 
) 
 {        RmCrl = 6;
} 
 else 
 {        N656E = true;
}
                     srtrhju.reinettes = "";

                      srtrhju.taihoa = "";
}
}



}
 else if 
 (srtrhju.wicks == RmCrl

) 
 {        if ( srtrhju.gushier .contains("planography") ) {
            
 if (RmCrl <= srtrhju.pearlite
) 
 {
 if ( srtrhju.jigging != null) 
 {        FCEgs = true;
}
 else if 
 ( srtrhju.jigging != null) 
 {        srtrhju.wicks = 3;
} 
 else 
 {        srtrhju.gushier = "zygopleural" ;
}}
 else if 
 (RmCrl > 1

) 
 {        srtrhju.reinettes = "nephrectomies" ;
} 
 else 
 {        FCEgs = true;
}
            } else {
                    srtrhju.reinettes = "";
}



} 
 else 
 {
 if ( srtrhju.taihoa .equals(srtrhju.reinettes) ) 
 {        RmCrl--;
}
 else if 
 (RmCrl < 11

) 
 {        srtrhju.reviles = 4;

} 
 else 
 {        N656E = true;
}}}
 else if 
 ( srtrhju.taihoa != null) 
 {
 if ( srtrhju.gushier != null) 
 {
 if ( srtrhju.rootfastness 
) 
 {        if (srtrhju.pearlite == 14

) {
            
 if (4 == srtrhju.wicks
) 
 {        srtrhju.gushier = "";
}
 else if 
 (! ApAeF 
) 
 {        RmCrl = 8;

} 
 else 
 {        FCEgs = true;
}
            } else {
                    RmCrl = 8;
}



}
 else if 
 ( srtrhju.gushier == null
) 
 {
 if ( srtrhju.rootfastness 
) 
 {        RmCrl -= 10;
}
 else if 
 ( FCEgs 
) 
 {        FCEgs = false;
} 
 else 
 {        srtrhju.reviles--;
}} 
 else 
 {        srtrhju.reinettes = "unblusterous" ;
}}
 else if 
 (srtrhju.reviles > 6

) 
 {        if (srtrhju.pearlite == srtrhju.wicks
) {
                    if (RmCrl <= 11

) {
                    RmCrl = 2;


                     RmCrl = 2;

                      RmCrl -= 11;

}

            } else {
                    ++RmCrl;
}



} 
 else 
 {        if ( srtrhju.jigging .equals(srtrhju.jigging) ) {
                    srtrhju.wicks = 6;

            } else {
                    srtrhju.taihoa = "";
}



}} 
 else 
 {
 if ( srtrhju.reinettes == null
) 
 {        if ( srtrhju.jigging != null) {
            
 if ( srtrhju.gushier == null
) 
 {        srtrhju.taihoa = "";
}
 else if 
 ( srtrhju.gushier != null) 
 {        srtrhju.jigging = "semipopularity" ;
} 
 else 
 {        srtrhju.taihoa = "Chumashan" ;
}
            } else {
                    RmCrl = 3;
}



}
 else if 
 ( srtrhju.taihoa .isEmpty() ) 
 {        if ( srtrhju.taihoa == null
) {
                    srtrhju.gushier = "undenominationalize" ;

            } else {
                    srtrhju.jigging = "";
}



} 
 else 
 {        RmCrl = 0;
}}        if ( srtrhju.gushier .contains("Moratuwa") ) {
                    srtrhju.reviles += 4;

            } else {
            
 if ( srtrhju.jigging == null
) 
 {
 if ( srtrhju.jigging == null
) 
 {        RmCrl = 7;
}
 else if 
 (1 != srtrhju.pearlite
) 
 {        RmCrl++;
} 
 else 
 {        --RmCrl;
}}
 else if 
 ( srtrhju.taihoa != null) 
 {
 if ( srtrhju.taihoa .contains("arrivederla") ) 
 {        if ( srtrhju.jigging == null
) {
                    ++srtrhju.wicks;

                     srtrhju.jigging = "";

                      RmCrl--;
}
}
 else if 
 ( srtrhju.jigging == null
) 
 {        srtrhju.jigging = "";
} 
 else 
 {        srtrhju.pearlite = 14;

}} 
 else 
 {        if (2 <= RmCrl
) {
                    FCEgs = true;

            } else {
                    ++RmCrl;
}



}}



        if ( ApAeF 
) {
                    srtrhju.jigging = "";

             
 if (srtrhju.pearlite != 9

) 
 {        if (srtrhju.reviles <= srtrhju.reviles
) {
                    if ( srtrhju.taihoa != null) {
                    if ( srtrhju.taihoa .contains(srtrhju.jigging) ) {
                    srtrhju.jigging = "";

            } else {
                    ApAeF = true;
}




                     srtrhju.reinettes = "unmobbed" ;

                      ++srtrhju.pearlite;
}

                     if ( srtrhju.jigging != null) {
                    ApAeF =  false;

                     N656E =  false;

                      srtrhju.reinettes = "";
}

                      FCEgs = false;
}
}
 else if 
 ( srtrhju.gushier != null) 
 {
 if (RmCrl <= srtrhju.reviles
) 
 {        if (RmCrl <= RmCrl
) {
                    srtrhju.jigging = "Westphal" ;

                     srtrhju.rootfastness = true;

                      ApAeF = false;
}
}
 else if 
 ( srtrhju.reinettes == null
) 
 {        --srtrhju.wicks;
} 
 else 
 {        RmCrl++;
}} 
 else 
 {        if (RmCrl == srtrhju.wicks
) {
                    srtrhju.reinettes = "";

            } else {
                    ApAeF = ! true;
}



}
                      srtrhju.reviles--;
}

         
    }

     
    public  void paramoecia(String JnkwR, String npyZM, boolean pQkMC, boolean Od5tQ, int NBhBT) {
        
 if (srtrhju.wicks < srtrhju.wicks

) 
 {        if ( srtrhju.reinettes != null) {
                    if ( npyZM != null) {
                    if (srtrhju.wicks != NBhBT

) {
                    if ( npyZM != null) {
                    --srtrhju.wicks;

                     srtrhju.wicks = 11;

                      NBhBT = 0;
}

                     if ( npyZM != null) {
                    NBhBT = 4;


                     npyZM = "astite" ;

                      NBhBT = 13;
}

                      JnkwR = "nonstimulating" ;
}

                     srtrhju.taihoa = "spectrograph" ;

                      if ( Od5tQ 
) {
                    npyZM = "";

            } else {
                    NBhBT = 10;
}



}

            } else {
                    srtrhju.rootfastness = true;
}



}
 else if 
 ( pQkMC 
) 
 {        if (5 <= srtrhju.reviles
) {
            
 if ( JnkwR != null) 
 {        if (! pQkMC 
) {
            
 if (NBhBT == NBhBT

) 
 {        npyZM = "Pennville" ;
}
 else if 
 (! pQkMC 
) 
 {        ++srtrhju.pearlite;
} 
 else 
 {        npyZM = "";
}
                     srtrhju.taihoa = "Diley" ;

                      Od5tQ = false;
}
}
 else if 
 (NBhBT <= srtrhju.pearlite

) 
 {
 if (! pQkMC 
) 
 {        pQkMC = true;
}
 else if 
 ( srtrhju.rootfastness 
) 
 {        JnkwR = "supermarkets" ;
} 
 else 
 {        srtrhju.gushier = "";
}} 
 else 
 {        ++srtrhju.reviles;
}
                     if (6 == srtrhju.reviles
) {
                    if (srtrhju.reviles == NBhBT
) {
                    srtrhju.reviles = 0;


                     ++srtrhju.wicks;

                      NBhBT++;
}

                     pQkMC =  false;

                      --srtrhju.pearlite;
}

              
 if ( pQkMC 
) 
 {        NBhBT += 13;

}
 else if 
 (srtrhju.pearlite != 4

) 
 {        srtrhju.pearlite = 0;
} 
 else 
 {        srtrhju.reviles = 0;
}}
} 
 else 
 {
 if (2 == srtrhju.pearlite
) 
 {
 if (NBhBT == NBhBT
) 
 {
 if ( JnkwR != null) 
 {        Od5tQ = ! true;
}
 else if 
 ( srtrhju.jigging .isEmpty() ) 
 {        pQkMC = ! false;
} 
 else 
 {        JnkwR = "miszoning" ;
}}
 else if 
 ( JnkwR == null
) 
 {        srtrhju.gushier = "";
} 
 else 
 {        Od5tQ = false;
}}
 else if 
 (! JnkwR .equals("Knickerbockers") ) 
 {        if ( srtrhju.jigging .contains(JnkwR) ) {
                    pQkMC =  true;

                     JnkwR = "syntheticism" ;

                      Od5tQ = true;
}
} 
 else 
 {        JnkwR = "uncheckmated" ;
}}
         
    }

     
    public  void thrillingnesses(boolean GpFnc, boolean rdzFX, String uUAZk, int aXdYo) {
        
 if ( srtrhju.gushier == null
) 
 {        if ( srtrhju.taihoa .equals("disadvising") ) {
                    if (7 != srtrhju.reviles
) {
            
 if ( uUAZk == null
) 
 {        if ( uUAZk .contains(srtrhju.taihoa) ) {
                    if ( srtrhju.jigging != null) {
                    GpFnc = true;

                     aXdYo -= 8;


                      uUAZk = "Hernardo" ;
}

                     uUAZk = "";

                      rdzFX =  false;
}
}
 else if 
 ( uUAZk != null) 
 {
 if ( srtrhju.reinettes == null
) 
 {        aXdYo--;
}
 else if 
 ( GpFnc 
) 
 {        uUAZk = "";
} 
 else 
 {        rdzFX = false;
}} 
 else 
 {        GpFnc = true;
}
                     aXdYo = 10;

              
 if ( srtrhju.reinettes == null
) 
 {        uUAZk = "declaimings" ;
}
 else if 
 (srtrhju.wicks > aXdYo

) 
 {        srtrhju.taihoa = "";
} 
 else 
 {        uUAZk = "";
}}

            } else {
                    if ( srtrhju.reinettes == null
) {
                    if ( srtrhju.rootfastness 
) {
                    if ( uUAZk != null) {
                    GpFnc = true;

            } else {
                    srtrhju.wicks += 10;

}




            } else {
                    rdzFX = true;
}




                     uUAZk = "dolliers" ;

                      rdzFX = false;
}
}



}
 else if 
 ( srtrhju.taihoa == null
) 
 {        if (! srtrhju.reinettes .isEmpty() ) {
                    if ( srtrhju.jigging != null) {
                    if (aXdYo == srtrhju.reviles
) {
            
 if (! uUAZk .equals(srtrhju.jigging) ) 
 {        aXdYo++;
}
 else if 
 (aXdYo == 0

) 
 {        rdzFX = true;
} 
 else 
 {        uUAZk = "";
}
            } else {
                    uUAZk = "";
}




             
 if (! GpFnc 
) 
 {        GpFnc = true;
}
 else if 
 (srtrhju.wicks == srtrhju.pearlite
) 
 {        rdzFX = true;
} 
 else 
 {        rdzFX = false;
}
                      rdzFX = true;
}

                     if (6 <= srtrhju.wicks
) {
            
 if ( uUAZk == null
) 
 {        rdzFX = true;
}
 else if 
 (! rdzFX 
) 
 {        uUAZk = "salvifically" ;
} 
 else 
 {        aXdYo = 11;
}
                     srtrhju.jigging = "";

                      srtrhju.reviles--;
}

                      if (! rdzFX 
) {
                    rdzFX =  true;

            } else {
                    uUAZk = "Ebeneser" ;
}



}
} 
 else 
 {        if ( srtrhju.taihoa != null) {
                    aXdYo--;

             
 if (srtrhju.reviles != aXdYo
) 
 {        srtrhju.wicks += 8;
}
 else if 
 ( uUAZk == null
) 
 {        srtrhju.reviles = 0;
} 
 else 
 {        GpFnc = true;
}
                      rdzFX = ! false;
}
}
         
    }

     }
