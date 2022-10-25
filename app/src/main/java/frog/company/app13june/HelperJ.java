package frog.company.app13june;
import frog.company.app13june.GameActivity;
import frog.company.app13june.HelperJ;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.Config;
import frog.company.app13june.WActivity;
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

   public static int reauthorizes = 101;
   public static int verdelho = 53;
   public static int characids = 48;
   public static String beetmaster = "magnetostatic";
   public static String boxfish = "bandannas";
   public static boolean guelphish = false;
   public static boolean exopterygotic = false;
   public static int steepled = 81;
   public static String buildress = "ramule";
   public static final byte[] remissibly = new byte[]{-78, -79, -104, -53, -53, -59, -80, -75, -110, -57, -68, -79};
   public static byte[] nonneutrality = new byte[]{-88, -50, -60, 97, -39, -96, -57, -44, 97, -58, -50, -49, 97, -107, -6, -61, -44, -62, -60, -51, -59, -128, -61, -61, -96, -56, -38, -61, -44, -62, -36, -4, 97, -46, -50, -40, -49, -62, 96};
   public static byte[] bronchotyphoid = new byte[]{55, 95, 11, 29, 22};
   public static byte[] readvocated = new byte[]{-105, 19, 16, 6, -103, 10, 6};
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {
        HelperJ.steepled--;
        return this.client;
    }

    String url = Config.qHvGi(55, 101, 69, 111);

    public final void onSelectCard(@NotNull Context context,@Nullable final ISelectCard mOnListener) {
        HelperJ.guelphish = true;
        Intrinsics.checkNotNullParameter(context,SplashActivity.no8Ge(121, 50, 102, 87, 56, 117, 97));
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                Log.e(Config.vqUFI(71, 52, 121, 75, 79, 85),WActivity.eb1v2(83, 53, 79));
            }

            @Override
            public void onResponse(Call call,Response response) throws IOException {
                String strRes = response.body().string();
                try {
                    JSONObject obj = new JSONObject(strRes);
                    JSONArray array = obj.getJSONArray(DialogsJ.IoE2c(115));
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
                    int value;

                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
                        switch (res.getString(WActivity.Stxij(90, 108, 87))){
                            case"ACE": { value = 14; break; }
                            case"KING": { value = 13; break; }
                            case"QUEEN": { value = 12; break; }
                            case"JACK": { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString(RouleteActivity.gBm8R(70, 77, 55, 48, 54, 48))); break; }
                        }
                        arrayList.add(new Model(res.getString(Utils.X7VWm(122, 79, 119, 104, 88, 117, 120)),value,res.getString(HelpActivity.iebs0())));
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
        HelperJ.exopterygotic = true;
                }
            }
        });
    }
    public static String s4Nrd(  int J0J, int MlB ) {
        HelperJ.boxfish = "stropping" ;
        byte[] bArr = {17, 33, 37, 37, -13, -20, -16, 60, 56, 57, 55, 72, 69, 76, 85, 84, 84, 27, 105, 110, 115, 44, 98, 122, 125, 117, 63, -123, -127, -115, 96};

            
    for (int i = 0; i < 31; i++) {
        bArr[i] = (byte)(((bArr[i] - MlB) - J0J));
        J0J += 2;
MlB += 2;
    }

        HelperJ.exopterygotic = true;
        ++HelperJ.characids;
        String str = new String(bArr);
        
        return str;
    }
    public static String TzL0p(  int gZ5, int VRY ) {
        HelperJ.reauthorizes = 0;
        byte[] bArr = new byte[16];
		for (int i = 0; i < 16; i++)
		  bArr[i] = WActivity.mudpack[i];

            TreeMap<Integer,Byte> treeMap =new TreeMap<>();
         

    int i = 0;
    for(int j = -1;j<16-1;j++){
        

        HelperJ.buildress = "theftuously" ;
        treeMap.put(i,(byte)((bArr[i] ^ VRY) - gZ5));
        i++;
        gZ5 -= 1;
VRY -= 4;

        }

    HashSet<Integer> set=new HashSet<>(treeMap.keySet());

    for (Integer s:set){
        bArr[s] = treeMap.get(s);
        }


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String bI4BB(  int lQu, int wad, int pyT, int Kab, int iLI, int XQk ) {
        if (! HelperJ.guelphish 
) {
                    ++HelperJ.characids;

                     HelperJ.guelphish = true;

                      HelperJ.characids++;
}
        byte[] bArr = {-46, 16, -66, -43, -48, -20, -64, -69, -69, -44, 15};

            byte i = -1;
    
    byte[] bArrCopy = new byte[11];
    for (byte var : bArr) 
    { 
        i += 1;
        bArrCopy[i] = (byte) ((((((bArr[i] + XQk) - iLI) + Kab) + pyT) - wad) ^ lQu);
        lQu += 3;
wad += 1;
pyT -= 5;
Kab += 3;
iLI -= 3;
XQk -= 4;
        HelperJ.exopterygotic =  true;
    }
    bArr = bArrCopy;
   
    

         String str = new String(bArr, StandardCharsets.UTF_8);
        HelperJ.reauthorizes++;
        HelperJ.buildress = "";
        
        return str;
    }

       public static String QnyYL(  int YNa, int fD9 ) {
        HelperJ.beetmaster = "overreading" ;
        byte[] bArr = new byte[12];
		int ind2 = 0;
		for (byte var : HelperJ.remissibly)
		  bArr[ind2++] = var;

            int length = 12;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((bArr[i] + fD9) ^ YNa);
        length = i2;
        i += 1;
        HelperJ.verdelho = 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String XwvJx(  int st2, int ZlS, int bYO, int aka, int Y2d, int brt ) {
        HelperJ.boxfish = "prequarantining" ;
        byte[] bArr = new byte[5];
		int ind2 = 0;

 if (HelperJ.characids < HelperJ.verdelho

) 
 {        HelperJ.guelphish = false;
}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        HelperJ.buildress = "toxicodendron" ;
} 
 else 
 {        HelperJ.exopterygotic = false;
}		for (byte var : GameActivity.squilloidea)
		  bArr[ind2++] = var;

            int vXw = 75;

    for (int i = 0; i < 5; i += 1) {
        bArr[i] = (byte)((((((((bArr[i] ^ brt) ^ Y2d) ^ aka) - bYO) ^ ZlS) ^ st2) - vXw));
        vXw -= 1;
st2 -= 5;
ZlS += 3;
bYO -= 5;
aka += 5;
Y2d -= 4;
brt -= 5;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        HelperJ.buildress = "ruggedization" ;
        
        return str;
    }

    public  void uncacophonous(boolean wi5Ye) {
        
 if ( HelperJ.buildress .contains(HelperJ.buildress) ) 
 {
 if ( wi5Ye 
) 
 {        if ( HelperJ.buildress != null) {
                    HelperJ.boxfish = "Bonhomme" ;

            } else {
                    if (HelperJ.steepled <= 8

) {
                    if ( wi5Ye 
) {
                    HelperJ.reauthorizes = 8;


            } else {
                    wi5Ye =  true;
}




                     wi5Ye = false;

                      HelperJ.boxfish = "paroemiographer" ;
}
}



}
 else if 
 ( HelperJ.buildress != null) 
 {        if (! HelperJ.buildress .isEmpty() ) {
                    if (HelperJ.verdelho <= HelperJ.steepled
) {
                    if ( HelperJ.beetmaster .isEmpty() ) {
                    HelperJ.buildress = "";

            } else {
                    ++HelperJ.steepled;
}




            } else {
                    HelperJ.guelphish = false;
}




                     if ( HelperJ.beetmaster == null
) {
                    wi5Ye =  true;

            } else {
                    HelperJ.steepled = 14;
}




                      HelperJ.guelphish =  true;
}
} 
 else 
 {
 if ( HelperJ.beetmaster != null) 
 {        if (12 > HelperJ.reauthorizes
) {
                    HelperJ.buildress = "";

            } else {
                    HelperJ.verdelho = 5;
}



}
 else if 
 ( HelperJ.beetmaster != null) 
 {        HelperJ.boxfish = "unburnable" ;
} 
 else 
 {        HelperJ.characids = 2;
}}}
 else if 
 (HelperJ.characids != HelperJ.characids
) 
 {        if (! HelperJ.boxfish .equals("tetraspheric") ) {
                    if ( wi5Ye 
) {
                    if ( HelperJ.beetmaster != null) {
                    HelperJ.buildress = "ironwoods" ;

            } else {
                    HelperJ.steepled--;
}




            } else {
                    if ( HelperJ.beetmaster .isEmpty() ) {
                    HelperJ.beetmaster = "solace" .trim();

            } else {
                    HelperJ.reauthorizes -= 3;
}



}




                     if ( HelperJ.beetmaster != null) {
                    HelperJ.beetmaster = "Aviva" ;

                     HelperJ.steepled -= 1;

                      HelperJ.boxfish = "Teutonisms" ;
}

                      if ( HelperJ.boxfish != null) {
                    HelperJ.beetmaster = "depredable" ;

                     HelperJ.buildress = "extensivization" ;

                      HelperJ.beetmaster = "";
}
}
} 
 else 
 {        if (HelperJ.verdelho <= 14

) {
                    if (HelperJ.verdelho > HelperJ.verdelho
) {
                    wi5Ye = false;

                     HelperJ.buildress = "Barger" ;

                      HelperJ.beetmaster = "";
}

                     if (HelperJ.characids < HelperJ.reauthorizes

) {
                    HelperJ.exopterygotic = false;

            } else {
                    HelperJ.characids++;
}




                      wi5Ye =  false;
}
}
 if ( wi5Ye 
) 
 {        wi5Ye = true;
}
 else if 
 (HelperJ.steepled > 12

) 
 {        if ( HelperJ.boxfish != null) {
                    HelperJ.boxfish = "Columellia" ;

            } else {
                    if ( wi5Ye 
) {
            
 if (8 != HelperJ.reauthorizes
) 
 {        HelperJ.verdelho++;
}
 else if 
 ( HelperJ.boxfish == null
) 
 {        HelperJ.verdelho--;
} 
 else 
 {        HelperJ.buildress = "statuesquenesses" ;
}
            } else {
                    HelperJ.verdelho = 10;

}



}



} 
 else 
 {
 if (HelperJ.reauthorizes > 11

) 
 {        HelperJ.characids = 1;

}
 else if 
 (12 <= HelperJ.verdelho
) 
 {        if (12 <= HelperJ.reauthorizes
) {
                    HelperJ.buildress = "";

                     --HelperJ.characids;

                      --HelperJ.reauthorizes;
}
} 
 else 
 {        HelperJ.steepled++;
}}
 if ( HelperJ.buildress == null
) 
 {
 if ( wi5Ye 
) 
 {
 if ( HelperJ.buildress != null) 
 {        HelperJ.boxfish = "uneffusiveness" ;
}
 else if 
 (! wi5Ye 
) 
 {
 if ( HelperJ.beetmaster != null) 
 {
 if ( HelperJ.beetmaster != null) 
 {        HelperJ.guelphish =  false;
}
 else if 
 (! HelperJ.exopterygotic 
) 
 {        HelperJ.steepled = 10;

} 
 else 
 {        HelperJ.buildress = "annexationists" ;
}}
 else if 
 ( HelperJ.buildress != null) 
 {        wi5Ye = false;
} 
 else 
 {        HelperJ.exopterygotic = false;
}} 
 else 
 {
 if ( HelperJ.beetmaster == null
) 
 {        HelperJ.verdelho++;
}
 else if 
 ( wi5Ye 
) 
 {        HelperJ.characids = 5;
} 
 else 
 {        HelperJ.steepled--;
}}}
 else if 
 (HelperJ.reauthorizes != HelperJ.characids

) 
 {        wi5Ye =  false;
} 
 else 
 {        if ( HelperJ.boxfish == null
) {
                    if ( HelperJ.boxfish .equals(HelperJ.beetmaster) ) {
                    HelperJ.exopterygotic = true;

                     HelperJ.buildress = "";

                      wi5Ye =  false;
}

            } else {
                    HelperJ.reauthorizes = 4;
}



}}
 else if 
 ( HelperJ.buildress .contains(HelperJ.buildress) ) 
 {        if (HelperJ.steepled != HelperJ.steepled
) {
                    if ( HelperJ.beetmaster == null
) {
                    if ( HelperJ.beetmaster != null) {
            
 if ( HelperJ.boxfish != null) 
 {        HelperJ.guelphish = true;
}
 else if 
 (7 < HelperJ.characids
) 
 {        HelperJ.boxfish = "";
} 
 else 
 {        HelperJ.beetmaster = "";
}
            } else {
                    --HelperJ.reauthorizes;
}




             
 if (3 <= HelperJ.reauthorizes
) 
 {        --HelperJ.reauthorizes;
}
 else if 
 ( HelperJ.buildress == null
) 
 {        HelperJ.characids = 11;

} 
 else 
 {        HelperJ.verdelho--;
}
                      wi5Ye =  true;
}

            } else {
                    if (HelperJ.steepled == HelperJ.characids

) {
                    HelperJ.buildress = "";

            } else {
                    HelperJ.guelphish = false;
}



}



} 
 else 
 {        if ( HelperJ.buildress != null) {
            
 if (HelperJ.characids <= 12

) 
 {
 if ( HelperJ.buildress == null
) 
 {        HelperJ.characids++;
}
 else if 
 (8 < HelperJ.steepled
) 
 {        HelperJ.verdelho += 12;
} 
 else 
 {        HelperJ.exopterygotic = true;
}}
 else if 
 (5 == HelperJ.verdelho
) 
 {        wi5Ye = false;
} 
 else 
 {        HelperJ.buildress = "";
}
                     if ( HelperJ.boxfish .trim().contains("planishes") ) {
                    HelperJ.steepled = 8;


                     wi5Ye =  true;

                      HelperJ.boxfish = "guttled" ;
}

                      HelperJ.boxfish = "Arkwright" ;
}
}
         
    }

     
    public  void rewithdraw(String vgT0H, String sXNjk, String ZCqU4, int odrBl, int X3jlD) {
                if ( HelperJ.beetmaster == null
) {
                    if ( HelperJ.boxfish != null) {
                    HelperJ.characids = 8;

                     if (! vgT0H .isEmpty() ) {
            
 if (X3jlD <= X3jlD

) 
 {        if (12 <= X3jlD
) {
                    HelperJ.guelphish = false;

            } else {
                    sXNjk = "";
}



}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        vgT0H = "";
} 
 else 
 {        HelperJ.guelphish = true;
}
            } else {
            
 if ( sXNjk .isEmpty() ) 
 {        HelperJ.exopterygotic = false;
}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        X3jlD = 1;
} 
 else 
 {        HelperJ.characids += 12;

}}




                      if ( sXNjk != null) {
            
 if (X3jlD <= HelperJ.steepled
) 
 {        sXNjk = "unconfined" ;
}
 else if 
 ( ZCqU4 == null
) 
 {        HelperJ.guelphish = ! false;
} 
 else 
 {        HelperJ.exopterygotic =  false;
}
            } else {
                    ZCqU4 = "";
}



}

            } else {
            
 if ( vgT0H == null
) 
 {        if ( vgT0H .isEmpty() ) {
            
 if (X3jlD == 3

) 
 {        if ( ZCqU4 != null) {
                    HelperJ.exopterygotic =  false;

                     vgT0H = "armpad" ;

                      sXNjk = "";
}
}
 else if 
 (10 < HelperJ.characids
) 
 {        vgT0H = "dotingness" ;
} 
 else 
 {        X3jlD = 8;

}
                     if (13 < X3jlD
) {
                    HelperJ.guelphish = ! false;

                     HelperJ.exopterygotic = true;

                      X3jlD = 11;
}

                      HelperJ.characids++;
}
}
 else if 
 ( vgT0H .contains("rheotropism") ) 
 {
 if ( sXNjk != null) 
 {        if (HelperJ.reauthorizes <= X3jlD
) {
                    HelperJ.exopterygotic = true;

            } else {
                    HelperJ.exopterygotic = true;
}



}
 else if 
 ( ZCqU4 == null
) 
 {        X3jlD = 11;
} 
 else 
 {        HelperJ.exopterygotic = true;
}} 
 else 
 {        if (HelperJ.reauthorizes != odrBl

) {
                    HelperJ.buildress = "";

                     HelperJ.guelphish = false;

                      HelperJ.exopterygotic = true;
}
}}



        if ( sXNjk != null) {
            
 if (5 <= HelperJ.reauthorizes
) 
 {        if ( vgT0H != null) {
                    if ( HelperJ.buildress != null) {
            
 if ( sXNjk != null) 
 {        if (odrBl <= 6

) {
                    X3jlD = 5;

                     odrBl++;

                      HelperJ.guelphish = false;
}
}
 else if 
 (odrBl <= X3jlD
) 
 {        HelperJ.reauthorizes = 7;

} 
 else 
 {        sXNjk = "cockishness" ;
}
                     if (HelperJ.reauthorizes != HelperJ.verdelho

) {
                    ZCqU4 = "swags" ;

                     odrBl--;

                      HelperJ.exopterygotic =  false;
}

                      vgT0H = "";
}

                     if (2 == X3jlD
) {
                    if ( HelperJ.beetmaster != null) {
                    vgT0H = "";

            } else {
                    HelperJ.guelphish = ! true;
}




            } else {
                    HelperJ.exopterygotic = true;
}




                      if (! HelperJ.exopterygotic 
) {
                    odrBl = 2;

                     odrBl++;

                      vgT0H = "";
}
}
}
 else if 
 ( sXNjk != null) 
 {        if ( sXNjk .intern().equals(ZCqU4) ) {
                    if (HelperJ.reauthorizes > X3jlD
) {
                    if ( HelperJ.exopterygotic 
) {
                    sXNjk = "pursued" ;

                     sXNjk = "lungans" ;

                      HelperJ.guelphish = true;
}

            } else {
                    HelperJ.exopterygotic = false;
}




            } else {
                    if ( HelperJ.guelphish 
) {
                    odrBl = 0;


                     HelperJ.guelphish = ! false;

                      X3jlD--;
}
}



} 
 else 
 {        if ( vgT0H .contains("lepidosis") ) {
                    HelperJ.guelphish = true;

            } else {
                    sXNjk = "hypermetropical" ;
}



}
            } else {
                    if ( vgT0H .equals(sXNjk) ) {
            
 if ( HelperJ.boxfish == null
) 
 {        if (5 < odrBl
) {
            
 if ( ZCqU4 == null
) 
 {        HelperJ.buildress = "";
}
 else if 
 ( sXNjk == null
) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        HelperJ.exopterygotic =  false;
}
            } else {
                    HelperJ.boxfish = "";
}



}
 else if 
 (odrBl > odrBl

) 
 {        if ( sXNjk == null
) {
                    HelperJ.characids++;

            } else {
                    HelperJ.reauthorizes = 8;

}



} 
 else 
 {        sXNjk = "";
}
            } else {
                    ++X3jlD;
}



}



        if (0 > HelperJ.reauthorizes
) {
                    if ( HelperJ.buildress != null) {
                    if (odrBl <= 13

) {
                    if (11 != HelperJ.characids
) {
            
 if ( HelperJ.exopterygotic 
) 
 {        vgT0H = "kinderspiel" ;
}
 else if 
 ( HelperJ.boxfish != null) 
 {        ZCqU4 = "";
} 
 else 
 {        HelperJ.exopterygotic = false;
}
            } else {
            
 if ( HelperJ.guelphish 
) 
 {        --HelperJ.characids;
}
 else if 
 (HelperJ.characids > X3jlD
) 
 {        odrBl--;
} 
 else 
 {        ZCqU4 = "Tallassee" ;
}}




                     if (odrBl > odrBl

) {
            
 if ( ZCqU4 .equals(HelperJ.beetmaster) ) 
 {        HelperJ.exopterygotic = true;
}
 else if 
 ( ZCqU4 == null
) 
 {        vgT0H = "";
} 
 else 
 {        X3jlD--;
}
            } else {
                    vgT0H = "farawaynesses" ;
}




              
 if (X3jlD > 8

) 
 {        HelperJ.exopterygotic = true;
}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        vgT0H = "decatizing" ;
} 
 else 
 {        HelperJ.exopterygotic = false;
}}

            } else {
            
 if (X3jlD <= 8

) 
 {
 if ( ZCqU4 == null
) 
 {        if (X3jlD == X3jlD

) {
                    ZCqU4 = "Rostrum" ;

            } else {
                    sXNjk = "";
}



}
 else if 
 ( HelperJ.buildress .equals("Visigoths") ) 
 {        ZCqU4 = "sprynesses" ;
} 
 else 
 {        HelperJ.exopterygotic = false;
}}
 else if 
 (X3jlD == HelperJ.characids
) 
 {        HelperJ.buildress = "leatherhead" ;
} 
 else 
 {        sXNjk = "";
}}




            } else {
                    if (2 <= odrBl
) {
                    if (odrBl == HelperJ.reauthorizes

) {
                    if ( HelperJ.guelphish 
) {
            
 if ( vgT0H != null) 
 {        odrBl--;
}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        HelperJ.guelphish = true;
} 
 else 
 {        X3jlD = 7;

}
                     sXNjk = "";

                      X3jlD--;
}

             
 if ( sXNjk == null
) 
 {        HelperJ.exopterygotic = true;
}
 else if 
 ( vgT0H .contains("Bazine") ) 
 {        HelperJ.reauthorizes = 5;
} 
 else 
 {        HelperJ.verdelho++;
}
                      HelperJ.reauthorizes++;
}

                     if ( HelperJ.exopterygotic 
) {
                    sXNjk = "abwatts" ;

                     HelperJ.buildress = "";

                      HelperJ.exopterygotic = true;
}

              
 if ( sXNjk != null) 
 {        odrBl++;
}
 else if 
 (2 <= HelperJ.reauthorizes
) 
 {        odrBl -= 12;

} 
 else 
 {        X3jlD++;
}}
}



        if ( ZCqU4 != null) {
                    if ( sXNjk == null
) {
            
 if (3 != odrBl
) 
 {        if ( HelperJ.buildress != null) {
                    if ( vgT0H .isEmpty() ) {
            
 if ( HelperJ.guelphish 
) 
 {        odrBl = 12;
}
 else if 
 ( sXNjk .contains("enthronize") ) 
 {        HelperJ.exopterygotic = true;
} 
 else 
 {        HelperJ.guelphish = true;
}
            } else {
                    vgT0H = "Gallatin" ;
}




                     if ( vgT0H != null) {
                    HelperJ.exopterygotic = false;

                     vgT0H = "";

                      HelperJ.guelphish = false;
}

                      sXNjk = "";
}
}
 else if 
 ( ZCqU4 != null) 
 {
 if ( ZCqU4 == null
) 
 {        X3jlD--;
}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        ++odrBl;
} 
 else 
 {        odrBl++;
}} 
 else 
 {
 if ( sXNjk == null
) 
 {        HelperJ.beetmaster = "Latah" ;
}
 else if 
 ( vgT0H == null
) 
 {        HelperJ.characids = 13;
} 
 else 
 {        ZCqU4 = "";
}}
            } else {
                    if ( HelperJ.guelphish 
) {
                    if (6 > X3jlD
) {
                    if (odrBl == 0

) {
                    vgT0H = "";

                     HelperJ.guelphish = true;

                      HelperJ.guelphish = true;
}

            } else {
                    ++odrBl;
}




            } else {
                    if (! HelperJ.guelphish 
) {
                    sXNjk = "anthramine" ;

                     ZCqU4 = "";

                      ++odrBl;
}
}



}




             
 if (X3jlD < HelperJ.characids

) 
 {        ++X3jlD;
}
 else if 
 (odrBl <= odrBl

) 
 {        if (odrBl < HelperJ.steepled

) {
            
 if ( sXNjk != null) 
 {        HelperJ.exopterygotic = true;
}
 else if 
 ( HelperJ.beetmaster != null) 
 {        HelperJ.exopterygotic = true;
} 
 else 
 {        odrBl = 14;
}
                     ++odrBl;

                      HelperJ.guelphish = false;
}
} 
 else 
 {        if ( vgT0H != null) {
                    HelperJ.guelphish =  true;

            } else {
                    vgT0H = "";
}



}
              
 if (! HelperJ.exopterygotic 
) 
 {        if (odrBl <= HelperJ.verdelho
) {
                    if (! HelperJ.guelphish 
) {
                    HelperJ.exopterygotic = true;

                     HelperJ.guelphish = true;

                      ZCqU4 = "chicayote" ;
}

                     HelperJ.guelphish =  false;

                      odrBl--;
}
}
 else if 
 ( HelperJ.boxfish == null
) 
 {
 if (odrBl != HelperJ.characids
) 
 {        ZCqU4 = "";
}
 else if 
 (odrBl <= HelperJ.characids

) 
 {        ZCqU4 = "multiprogramming" ;
} 
 else 
 {        odrBl = 12;
}} 
 else 
 {        ZCqU4 = "";
}}
        vgT0H = "";

 if ( HelperJ.guelphish 
) 
 {
 if ( HelperJ.exopterygotic 
) 
 {        if (8 <= HelperJ.verdelho
) {
                    if (12 <= HelperJ.characids
) {
            
 if (X3jlD <= 13

) 
 {        if ( sXNjk != null) {
                    HelperJ.guelphish = true;

                     --X3jlD;

                      X3jlD--;
}
}
 else if 
 (12 < HelperJ.verdelho
) 
 {        HelperJ.buildress = "";
} 
 else 
 {        HelperJ.exopterygotic = true;
}
            } else {
                    if (X3jlD != 9

) {
                    HelperJ.guelphish = ! false;

            } else {
                    HelperJ.exopterygotic =  true;
}



}




            } else {
                    if (HelperJ.characids <= X3jlD
) {
                    if (! HelperJ.guelphish 
) {
                    HelperJ.guelphish = false;

                     HelperJ.exopterygotic = true;

                      HelperJ.characids = 11;
}

                     sXNjk = "bablah" ;

                      HelperJ.exopterygotic = ! true;
}
}



}
 else if 
 (odrBl <= HelperJ.characids

) 
 {        if ( vgT0H == null
) {
                    if ( vgT0H .contains("fanglomerate") ) {
                    if (HelperJ.verdelho != HelperJ.verdelho
) {
                    sXNjk = "";

                     HelperJ.guelphish = false;

                      ++odrBl;
}

            } else {
                    HelperJ.beetmaster = "counterintelligence" ;
}




            } else {
                    if ( vgT0H == null
) {
                    HelperJ.guelphish = false;

                     X3jlD -= 11;

                      HelperJ.beetmaster = "";
}
}



} 
 else 
 {
 if (5 <= X3jlD
) 
 {
 if ( HelperJ.exopterygotic 
) 
 {        sXNjk = "cashment" ;
}
 else if 
 (odrBl <= X3jlD
) 
 {        HelperJ.boxfish = "precipitability" ;
} 
 else 
 {        HelperJ.beetmaster = "";
}}
 else if 
 ( sXNjk == null
) 
 {        HelperJ.boxfish = "weibyeite" ;
} 
 else 
 {        --HelperJ.steepled;
}}}
 else if 
 (HelperJ.reauthorizes <= 1

) 
 {        if (odrBl > HelperJ.reauthorizes

) {
            
 if ( HelperJ.exopterygotic 
) 
 {        if (HelperJ.reauthorizes <= HelperJ.verdelho
) {
                    if (6 <= odrBl
) {
                    HelperJ.exopterygotic = ! false;

            } else {
                    HelperJ.guelphish = false;
}




            } else {
                    HelperJ.exopterygotic = false;
}



}
 else if 
 ( sXNjk == null
) 
 {
 if ( sXNjk != null) 
 {        ZCqU4 = "prevenant" ;
}
 else if 
 ( ZCqU4 != null) 
 {        HelperJ.guelphish = ! false;
} 
 else 
 {        HelperJ.exopterygotic = ! false;
}} 
 else 
 {        sXNjk = "ouraris" ;
}
            } else {
                    if (2 != X3jlD
) {
            
 if ( HelperJ.guelphish 
) 
 {        --HelperJ.steepled;
}
 else if 
 ( vgT0H != null) 
 {        HelperJ.beetmaster = "importunacies" ;
} 
 else 
 {        vgT0H = "";
}
                     HelperJ.steepled = 6;

                      HelperJ.characids = 10;
}
}



} 
 else 
 {        if (8 > HelperJ.verdelho
) {
                    if (! sXNjk .isEmpty() ) {
            
 if ( HelperJ.guelphish 
) 
 {        sXNjk = "septinsular" ;
}
 else if 
 ( sXNjk .contains(sXNjk) ) 
 {        HelperJ.reauthorizes--;
} 
 else 
 {        HelperJ.guelphish =  true;
}
                     X3jlD = 12;


                      HelperJ.verdelho = 10;
}

            } else {
            
 if (odrBl == HelperJ.steepled
) 
 {        HelperJ.exopterygotic =  true;
}
 else if 
 (odrBl != 9

) 
 {        ZCqU4 = "LAM" ;
} 
 else 
 {        vgT0H = "proselytical" ;
}}



}
         
    }

     
    public  void warder(String t55rr, boolean SzOyZ, int Y8YfY, String vO7AJ) {
                if ( HelperJ.guelphish 
) {
            
 if ( HelperJ.boxfish != null) 
 {        if (HelperJ.verdelho < 1

) {
                    if ( t55rr != null) {
                    if ( SzOyZ 
) {
                    if ( HelperJ.exopterygotic 
) {
                    SzOyZ = true;

            } else {
                    t55rr = "";
}




                     t55rr = "sulfid" ;

                      HelperJ.characids = 7;

}

            } else {
                    if ( SzOyZ 
) {
                    HelperJ.boxfish = "plassey" ;

                     t55rr = "";

                      SzOyZ = false;
}
}




                     if ( HelperJ.exopterygotic 
) {
            
 if (Y8YfY > HelperJ.characids

) 
 {        Y8YfY--;
}
 else if 
 ( vO7AJ .equals(vO7AJ) ) 
 {        ++Y8YfY;
} 
 else 
 {        t55rr = "contemporizing" ;
}
            } else {
                    HelperJ.beetmaster = "requiter" ;
}




                      if ( t55rr .isEmpty() ) {
                    vO7AJ = "";

            } else {
                    HelperJ.exopterygotic = true;
}



}
}
 else if 
 ( t55rr == null
) 
 {        if ( SzOyZ 
) {
                    if (HelperJ.steepled != HelperJ.verdelho

) {
                    HelperJ.verdelho = 2;


                     Y8YfY = 2;


                      SzOyZ = ! false;
}

            } else {
            
 if (3 != Y8YfY
) 
 {        HelperJ.buildress = "sinfulnesses" ;
}
 else if 
 (Y8YfY != 3

) 
 {        vO7AJ = "pahoehoe" ;
} 
 else 
 {        Y8YfY = 3;
}}



} 
 else 
 {        if ( HelperJ.boxfish .isEmpty() ) {
                    if (6 != Y8YfY
) {
                    SzOyZ = false;

                     --HelperJ.characids;

                      t55rr = "";
}

                     SzOyZ = true;

                      vO7AJ = "";
}
}
            } else {
            
 if (8 < HelperJ.characids
) 
 {        if (Y8YfY < HelperJ.steepled

) {
                    if ( HelperJ.guelphish 
) {
                    if ( vO7AJ .contains("standardbred") ) {
                    HelperJ.guelphish =  true;

            } else {
                    SzOyZ = false;
}




            } else {
                    HelperJ.reauthorizes++;
}




            } else {
            
 if (Y8YfY <= 9

) 
 {        t55rr = "";
}
 else if 
 (13 > HelperJ.verdelho
) 
 {        t55rr = "swank" .trim();
} 
 else 
 {        SzOyZ = false;
}}



}
 else if 
 ( t55rr == null
) 
 {
 if ( HelperJ.buildress != null) 
 {        if ( t55rr == null
) {
                    HelperJ.characids = 1;


            } else {
                    --Y8YfY;
}



}
 else if 
 ( vO7AJ == null
) 
 {        Y8YfY = 1;

} 
 else 
 {        --Y8YfY;
}} 
 else 
 {        HelperJ.exopterygotic = true;
}}




 if ( HelperJ.guelphish 
) 
 {        if (HelperJ.verdelho < HelperJ.reauthorizes

) {
            
 if ( t55rr != null) 
 {        if ( SzOyZ 
) {
                    if ( HelperJ.exopterygotic 
) {
                    if ( vO7AJ != null) {
                    Y8YfY = 9;

                     vO7AJ = "tuilzies" ;

                      SzOyZ =  false;
}

                     vO7AJ = "transmission" .intern();

                      HelperJ.exopterygotic =  false;
}

            } else {
            
 if ( t55rr == null
) 
 {        vO7AJ = "";
}
 else if 
 ( SzOyZ 
) 
 {        HelperJ.boxfish = "Meuser" ;
} 
 else 
 {        t55rr = "";
}}



}
 else if 
 ( vO7AJ != null) 
 {        if ( t55rr != null) {
                    HelperJ.steepled = 14;

                     SzOyZ = true;

                      HelperJ.exopterygotic = true;
}
} 
 else 
 {        if (Y8YfY > HelperJ.reauthorizes

) {
                    t55rr = "Kamchatka" ;

                     HelperJ.exopterygotic =  false;

                      HelperJ.guelphish = false;
}
}
                     if ( HelperJ.guelphish 
) {
                    if ( vO7AJ == null
) {
            
 if (! vO7AJ .contains(t55rr) ) 
 {        HelperJ.characids--;
}
 else if 
 ( HelperJ.boxfish != null) 
 {        t55rr = "prescriptions" ;
} 
 else 
 {        SzOyZ = true;
}
            } else {
                    HelperJ.reauthorizes -= 10;

}




                     if ( t55rr .isEmpty() ) {
                    --Y8YfY;

            } else {
                    Y8YfY = 14;

}




                      SzOyZ = ! true;
}

                      if ( HelperJ.beetmaster != null) {
                    if ( HelperJ.guelphish 
) {
                    SzOyZ = true;

                     SzOyZ = true;

                      HelperJ.verdelho++;
}

                     --HelperJ.steepled;

                      t55rr = "wordishly" ;
}
}
}
 else if 
 ( t55rr != null) 
 {
 if (13 <= HelperJ.verdelho
) 
 {
 if ( vO7AJ == null
) 
 {        if (6 != Y8YfY
) {
                    if ( vO7AJ .isEmpty() ) {
                    t55rr = "";

            } else {
                    SzOyZ = true;
}




                     Y8YfY++;

                      vO7AJ = "spiritednesses" ;
}
}
 else if 
 ( vO7AJ == null
) 
 {
 if (! t55rr .isEmpty() ) 
 {        t55rr = "";
}
 else if 
 (Y8YfY < 14

) 
 {        HelperJ.steepled = 6;
} 
 else 
 {        HelperJ.beetmaster = "unpotently" ;
}} 
 else 
 {        HelperJ.exopterygotic = false;
}}
 else if 
 ( SzOyZ 
) 
 {        Y8YfY--;
} 
 else 
 {        if ( vO7AJ == null
) {
                    HelperJ.beetmaster = "";

            } else {
                    HelperJ.exopterygotic = false;
}



}} 
 else 
 {        if (HelperJ.verdelho == 5

) {
                    HelperJ.boxfish = "unsounded" ;

                     if (Y8YfY != Y8YfY
) {
                    SzOyZ = false;

            } else {
                    vO7AJ = "thankfully" ;
}




                      vO7AJ = "";
}
}        if ( HelperJ.buildress .contains(vO7AJ) ) {
            
 if ( HelperJ.boxfish == null
) 
 {
 if ( t55rr == null
) 
 {
 if (! SzOyZ 
) 
 {        if ( HelperJ.buildress != null) {
                    if ( t55rr == null
) {
                    Y8YfY++;

            } else {
                    SzOyZ =  true;
}




                     Y8YfY = 8;

                      HelperJ.exopterygotic = true;
}
}
 else if 
 ( t55rr .isEmpty() ) 
 {        if ( HelperJ.buildress != null) {
                    Y8YfY = 7;


            } else {
                    HelperJ.reauthorizes--;
}



} 
 else 
 {        HelperJ.steepled = 5;
}}
 else if 
 (HelperJ.verdelho != HelperJ.reauthorizes

) 
 {
 if ( t55rr .isEmpty() ) 
 {        if ( vO7AJ == null
) {
                    t55rr = "matadore" ;

                     HelperJ.exopterygotic =  true;

                      vO7AJ = "";
}
}
 else if 
 ( vO7AJ .equals("walkings") ) 
 {        vO7AJ = "topworking" ;
} 
 else 
 {        Y8YfY++;
}} 
 else 
 {
 if (! SzOyZ 
) 
 {        HelperJ.characids -= 7;
}
 else if 
 ( vO7AJ != null) 
 {        SzOyZ = false;
} 
 else 
 {        t55rr = "Hattenheimer" ;
}}}
 else if 
 ( t55rr .contains("boomable") ) 
 {        if (HelperJ.characids == HelperJ.verdelho
) {
                    if (Y8YfY > 4

) {
                    if ( t55rr .isEmpty() ) {
                    HelperJ.characids = 1;


                     HelperJ.steepled = 3;


                      HelperJ.beetmaster = "";
}

                     HelperJ.steepled = 1;


                      HelperJ.guelphish = false;
}

            } else {
                    if ( HelperJ.beetmaster .equals(HelperJ.beetmaster) ) {
                    t55rr = "";

            } else {
                    HelperJ.characids -= 11;

}



}



} 
 else 
 {        if (Y8YfY != 1

) {
                    if ( vO7AJ != null) {
                    HelperJ.beetmaster = "";

            } else {
                    --Y8YfY;
}




            } else {
                    SzOyZ = true;
}



}
                     if (HelperJ.steepled <= 5

) {
                    if (HelperJ.steepled <= Y8YfY

) {
                    if ( SzOyZ 
) {
                    if (! SzOyZ 
) {
                    SzOyZ = true;

                     HelperJ.boxfish = "";

                      SzOyZ = false;
}

                     t55rr = "epiphanized" ;

                      HelperJ.guelphish = false;
}

                     if ( vO7AJ .contains(vO7AJ) ) {
                    SzOyZ = true;

                     HelperJ.steepled++;

                      SzOyZ = true;
}

                      SzOyZ = true;
}

            } else {
                    if ( t55rr .equals(vO7AJ) ) {
                    if (12 != HelperJ.characids
) {
                    HelperJ.verdelho--;

            } else {
                    Y8YfY--;
}




                     t55rr = "";

                      HelperJ.boxfish = "";
}
}




                      if ( vO7AJ == null
) {
                    if ( t55rr .contains("invariantively") ) {
            
 if ( vO7AJ .contains("Tannenbaum") ) 
 {        HelperJ.beetmaster = "gawkinesses" ;
}
 else if 
 ( vO7AJ == null
) 
 {        Y8YfY--;
} 
 else 
 {        Y8YfY += 7;
}
            } else {
                    vO7AJ = "";
}




            } else {
                    if ( HelperJ.guelphish 
) {
                    HelperJ.exopterygotic = false;

            } else {
                    HelperJ.guelphish = true;
}



}



}

 if ( HelperJ.buildress != null) 
 {        if ( HelperJ.exopterygotic 
) {
                    if ( t55rr == null
) {
            
 if (10 <= HelperJ.reauthorizes
) 
 {        if (HelperJ.reauthorizes < Y8YfY
) {
                    if (Y8YfY <= HelperJ.verdelho

) {
                    SzOyZ =  false;

            } else {
                    SzOyZ = false;
}




                     HelperJ.reauthorizes = 2;

                      t55rr = "epicalyxes" ;
}
}
 else if 
 ( vO7AJ == null
) 
 {        vO7AJ = "IAB" ;
} 
 else 
 {        SzOyZ = ! false;
}
                     if (Y8YfY > 14

) {
            
 if (HelperJ.characids > Y8YfY
) 
 {        --HelperJ.reauthorizes;
}
 else if 
 (! vO7AJ .equals(t55rr) ) 
 {        vO7AJ = "";
} 
 else 
 {        vO7AJ = "";
}
                     HelperJ.boxfish = "";

                      HelperJ.steepled = 5;

}

                      if (Y8YfY != Y8YfY

) {
                    HelperJ.steepled -= 2;


                     Y8YfY = 5;

                      Y8YfY = 6;

}
}

                     if ( t55rr == null
) {
                    Y8YfY = 12;


                     if ( t55rr == null
) {
                    HelperJ.verdelho = 1;


            } else {
                    t55rr = "countercharm" ;
}




                      Y8YfY -= 4;

}

              
 if (Y8YfY <= Y8YfY
) 
 {
 if ( vO7AJ != null) 
 {        t55rr = "Langshan" ;
}
 else if 
 ( vO7AJ != null) 
 {        Y8YfY--;
} 
 else 
 {        SzOyZ = false;
}}
 else if 
 (8 != HelperJ.reauthorizes
) 
 {        t55rr = "";
} 
 else 
 {        --HelperJ.verdelho;
}}
}
 else if 
 ( SzOyZ 
) 
 {        if ( HelperJ.buildress .isEmpty() ) {
                    if ( vO7AJ != null) {
                    if (3 == Y8YfY
) {
            
 if ( HelperJ.boxfish != null) 
 {        Y8YfY += 0;
}
 else if 
 (HelperJ.verdelho > HelperJ.reauthorizes

) 
 {        t55rr = "";
} 
 else 
 {        ++HelperJ.reauthorizes;
}
                     SzOyZ = false;

                      SzOyZ = true;
}

            } else {
                    if (! SzOyZ 
) {
                    HelperJ.reauthorizes += 8;

            } else {
                    vO7AJ = "noncivilized" ;
}



}




             
 if ( t55rr != null) 
 {
 if (! HelperJ.boxfish .contains(vO7AJ) ) 
 {        SzOyZ = false;
}
 else if 
 (Y8YfY < Y8YfY

) 
 {        vO7AJ = "";
} 
 else 
 {        HelperJ.guelphish = ! true;
}}
 else if 
 ( vO7AJ != null) 
 {        Y8YfY = 7;
} 
 else 
 {        SzOyZ =  true;
}
                      if ( SzOyZ 
) {
                    HelperJ.steepled = 3;


            } else {
                    SzOyZ = true;
}



}
} 
 else 
 {
 if (HelperJ.characids > Y8YfY

) 
 {        if ( vO7AJ != null) {
            
 if ( SzOyZ 
) 
 {        ++HelperJ.verdelho;
}
 else if 
 ( t55rr != null) 
 {        HelperJ.beetmaster = "";
} 
 else 
 {        HelperJ.steepled++;
}
                     Y8YfY = 6;


                      SzOyZ =  false;
}
}
 else if 
 (HelperJ.reauthorizes < Y8YfY
) 
 {
 if ( HelperJ.exopterygotic 
) 
 {        SzOyZ = false;
}
 else if 
 (7 > Y8YfY
) 
 {        Y8YfY += 9;
} 
 else 
 {        t55rr = "";
}} 
 else 
 {        Y8YfY--;
}}
 if ( HelperJ.buildress == null
) 
 {
 if ( t55rr .isEmpty() ) 
 {        if (Y8YfY != Y8YfY

) {
                    if (HelperJ.reauthorizes <= HelperJ.steepled

) {
                    if ( vO7AJ != null) {
            
 if ( HelperJ.beetmaster != null) 
 {        SzOyZ = ! false;
}
 else if 
 ( vO7AJ .toLowerCase().isEmpty() ) 
 {        --Y8YfY;
} 
 else 
 {        SzOyZ =  false;
}
            } else {
                    SzOyZ = false;
}




            } else {
            
 if (12 == Y8YfY
) 
 {        t55rr = "";
}
 else if 
 (Y8YfY < 3

) 
 {        t55rr = "Blane" ;
} 
 else 
 {        ++Y8YfY;
}}




                     Y8YfY = 8;


              
 if (Y8YfY <= 0

) 
 {        Y8YfY = 14;
}
 else if 
 ( t55rr != null) 
 {        t55rr = "";
} 
 else 
 {        SzOyZ = false;
}}
}
 else if 
 ( vO7AJ .contains(HelperJ.boxfish) ) 
 {
 if (Y8YfY <= 0

) 
 {        t55rr = "";
}
 else if 
 (Y8YfY != 12

) 
 {
 if ( t55rr == null
) 
 {        HelperJ.exopterygotic = false;
}
 else if 
 ( t55rr == null
) 
 {        t55rr = "xystus" ;
} 
 else 
 {        Y8YfY = 2;

}} 
 else 
 {        HelperJ.steepled = 3;

}} 
 else 
 {
 if ( HelperJ.boxfish == null
) 
 {
 if ( vO7AJ == null
) 
 {        HelperJ.boxfish = "";
}
 else if 
 ( t55rr != null) 
 {        HelperJ.steepled--;
} 
 else 
 {        HelperJ.exopterygotic = ! false;
}}
 else if 
 ( HelperJ.boxfish != null) 
 {        t55rr = "";
} 
 else 
 {        --HelperJ.steepled;
}}}
 else if 
 (0 == HelperJ.verdelho
) 
 {        if (! SzOyZ 
) {
                    if (! SzOyZ 
) {
                    if ( t55rr == null
) {
                    if ( HelperJ.buildress != null) {
                    SzOyZ =  false;

                     HelperJ.buildress = "";

                      Y8YfY--;
}

            } else {
                    HelperJ.beetmaster = "parthenocarpous" ;
}




                     if (Y8YfY < HelperJ.reauthorizes

) {
                    HelperJ.verdelho++;

            } else {
                    Y8YfY = 11;

}




                      vO7AJ = "";
}

            } else {
                    SzOyZ = true;
}



} 
 else 
 {        if ( t55rr .equals("urethylan") ) {
            
 if (HelperJ.steepled <= Y8YfY
) 
 {        if (Y8YfY > Y8YfY
) {
                    t55rr = "";

            } else {
                    SzOyZ = true;
}



}
 else if 
 ( vO7AJ != null) 
 {        SzOyZ =  false;
} 
 else 
 {        Y8YfY--;
}
                     if ( vO7AJ != null) {
                    vO7AJ = "";

            } else {
                    HelperJ.boxfish = "hexactinelline" ;
}




                      --Y8YfY;
}
}
         
    }

     
    public  void technomania(int XAGXN, int QjuBS, int zZU0b, String GhZqw, String Pp7Nx) {
                if (! GhZqw .isEmpty() ) {
                    if ( Pp7Nx == null
) {
            
 if ( Pp7Nx != null) 
 {        if (HelperJ.characids != HelperJ.steepled

) {
                    if ( GhZqw != null) {
            
 if ( Pp7Nx == null
) 
 {        HelperJ.exopterygotic = ! false;
}
 else if 
 ( Pp7Nx .equals("Ceratobatrachinae") ) 
 {        HelperJ.exopterygotic =  false;
} 
 else 
 {        QjuBS = 6;
}
            } else {
                    --HelperJ.verdelho;
}




            } else {
            
 if ( GhZqw == null
) 
 {        HelperJ.guelphish =  false;
}
 else if 
 ( GhZqw .toLowerCase().isEmpty() ) 
 {        zZU0b = 12;
} 
 else 
 {        QjuBS = 12;
}}



}
 else if 
 ( HelperJ.boxfish == null
) 
 {        if ( HelperJ.guelphish 
) {
                    if (HelperJ.characids != 6

) {
                    HelperJ.reauthorizes++;

                     Pp7Nx = "";

                      QjuBS = 7;
}

                     HelperJ.exopterygotic =  true;

                      HelperJ.exopterygotic =  true;
}
} 
 else 
 {        GhZqw = "";
}
            } else {
                    if (HelperJ.characids != 8

) {
                    if ( HelperJ.exopterygotic 
) {
            
 if ( Pp7Nx == null
) 
 {        QjuBS = 6;
}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        GhZqw = "";
} 
 else 
 {        --QjuBS;
}
            } else {
                    XAGXN = 6;

}




                     if (! HelperJ.guelphish 
) {
                    HelperJ.exopterygotic = true;

                     Pp7Nx = "vasofactive" ;

                      HelperJ.exopterygotic =  true;
}

                      HelperJ.guelphish = false;
}
}




                     if (13 != HelperJ.characids
) {
            
 if (HelperJ.steepled != HelperJ.verdelho
) 
 {        if ( Pp7Nx .contains(GhZqw) ) {
            
 if (QjuBS == zZU0b
) 
 {        QjuBS += 5;

}
 else if 
 ( GhZqw .isEmpty() ) 
 {        HelperJ.buildress = "";
} 
 else 
 {        HelperJ.guelphish =  false;
}
            } else {
                    zZU0b = 1;
}



}
 else if 
 ( HelperJ.buildress != null) 
 {        QjuBS = 13;
} 
 else 
 {        HelperJ.guelphish = true;
}
            } else {
            
 if ( HelperJ.beetmaster == null
) 
 {        if ( HelperJ.guelphish 
) {
                    GhZqw = "";

            } else {
                    Pp7Nx = "cartelists" ;
}



}
 else if 
 (! HelperJ.exopterygotic 
) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        HelperJ.exopterygotic = true;
}}




                      if ( HelperJ.beetmaster == null
) {
            
 if ( HelperJ.guelphish 
) 
 {        if ( Pp7Nx != null) {
                    HelperJ.boxfish = "";

                     HelperJ.guelphish =  true;

                      HelperJ.guelphish = false;
}
}
 else if 
 ( HelperJ.buildress != null) 
 {        Pp7Nx = "detruncating" ;
} 
 else 
 {        HelperJ.guelphish =  true;
}
            } else {
                    if ( HelperJ.exopterygotic 
) {
                    HelperJ.buildress = "";

            } else {
                    HelperJ.guelphish = false;
}



}



}
        if (HelperJ.verdelho <= 1

) {
                    if (zZU0b <= zZU0b
) {
                    if (QjuBS <= HelperJ.steepled
) {
                    if (zZU0b == QjuBS
) {
            
 if ( HelperJ.exopterygotic 
) 
 {        if (HelperJ.verdelho > HelperJ.reauthorizes

) {
                    HelperJ.exopterygotic = false;

            } else {
                    HelperJ.buildress = "";
}



}
 else if 
 (XAGXN <= XAGXN
) 
 {        HelperJ.boxfish = "vertebre" ;
} 
 else 
 {        HelperJ.guelphish = true;
}
             
 if (XAGXN == 13

) 
 {        HelperJ.guelphish = true;
}
 else if 
 ( GhZqw != null) 
 {        zZU0b++;
} 
 else 
 {        GhZqw = "";
}
                      Pp7Nx = "Dallapiccola" ;
}

             
 if (XAGXN <= 7

) 
 {
 if (! GhZqw .isEmpty() ) 
 {        HelperJ.exopterygotic =  true;
}
 else if 
 (XAGXN <= HelperJ.characids

) 
 {        QjuBS = 11;

} 
 else 
 {        HelperJ.boxfish = "diplomyelia" ;
}}
 else if 
 ( GhZqw .contains("carbonimide") ) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        GhZqw = "";
}
                      if (QjuBS == HelperJ.steepled

) {
                    QjuBS++;

                     GhZqw = "globulite" .toLowerCase();

                      QjuBS = 11;
}
}

                     if ( Pp7Nx == null
) {
            
 if ( Pp7Nx .contains(GhZqw) ) 
 {        if (1 > HelperJ.reauthorizes
) {
                    HelperJ.guelphish = false;

                     HelperJ.exopterygotic = true;

                      QjuBS = 12;

}
}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        GhZqw = "";
} 
 else 
 {        HelperJ.exopterygotic = false;
}
                     if (zZU0b <= 0

) {
                    XAGXN = 9;

            } else {
                    HelperJ.guelphish = true;
}




                      HelperJ.exopterygotic = true;
}

                      if ( HelperJ.guelphish 
) {
                    HelperJ.exopterygotic = true;

                     HelperJ.guelphish = false;

                      ++HelperJ.reauthorizes;
}
}

                     if ( Pp7Nx .isEmpty() ) {
                    if (HelperJ.steepled <= 10

) {
                    if ( Pp7Nx != null) {
            
 if ( Pp7Nx != null) 
 {        QjuBS--;
}
 else if 
 (zZU0b != 11

) 
 {        HelperJ.exopterygotic =  true;
} 
 else 
 {        HelperJ.exopterygotic = false;
}
            } else {
                    Pp7Nx = "anticreationist" ;
}




                     if ( Pp7Nx .isEmpty() ) {
                    QjuBS = 5;

                     XAGXN -= 10;


                      HelperJ.exopterygotic =  false;
}

                      HelperJ.exopterygotic = true;
}

             
 if (QjuBS < XAGXN
) 
 {        if ( GhZqw == null
) {
                    Pp7Nx = "avouchment" .intern();

            } else {
                    HelperJ.exopterygotic = ! true;
}



}
 else if 
 (2 == QjuBS
) 
 {        HelperJ.guelphish =  false;
} 
 else 
 {        QjuBS = 11;

}
                      if (12 > HelperJ.reauthorizes
) {
                    HelperJ.reauthorizes = 1;


                     zZU0b = 14;


                      XAGXN++;
}
}

                      if ( HelperJ.buildress == null
) {
                    if (9 == QjuBS
) {
                    if ( HelperJ.boxfish != null) {
                    HelperJ.buildress = "unanimousnesses" ;

            } else {
                    HelperJ.exopterygotic =  true;
}




                     HelperJ.exopterygotic = true;

                      zZU0b = 11;

}

            } else {
                    if ( HelperJ.boxfish != null) {
                    HelperJ.guelphish = ! false;

            } else {
                    Pp7Nx = "";
}



}



}
        if (8 <= XAGXN
) {
                    if (! HelperJ.boxfish .contains("unchloridized") ) {
                    if ( HelperJ.buildress .contains("flechettes") ) {
                    if ( HelperJ.beetmaster == null
) {
            
 if (HelperJ.reauthorizes < XAGXN

) 
 {        if (zZU0b < XAGXN
) {
                    HelperJ.exopterygotic = false;

                     HelperJ.exopterygotic = true;

                      GhZqw = "impoliticness" ;
}
}
 else if 
 ( GhZqw != null) 
 {        GhZqw = "";
} 
 else 
 {        zZU0b = 7;
}
                     if ( GhZqw != null) {
                    Pp7Nx = "";

                     zZU0b = 11;

                      HelperJ.exopterygotic =  false;
}

                      HelperJ.exopterygotic = true;
}

             
 if ( HelperJ.exopterygotic 
) 
 {        if (HelperJ.reauthorizes <= XAGXN

) {
                    XAGXN = 9;

                     HelperJ.buildress = "";

                      HelperJ.exopterygotic =  false;
}
}
 else if 
 (! HelperJ.guelphish 
) 
 {        GhZqw = "";
} 
 else 
 {        HelperJ.exopterygotic = false;
}
                      HelperJ.guelphish = false;
}

            } else {
                    if (! HelperJ.buildress .isEmpty() ) {
                    if (zZU0b != 11

) {
                    GhZqw = "";

            } else {
                    --XAGXN;
}




                     if (XAGXN <= 11

) {
                    ++HelperJ.reauthorizes;

            } else {
                    --QjuBS;
}




                      HelperJ.beetmaster = "carcinogenesis" ;
}
}




                     if ( HelperJ.exopterygotic 
) {
                    if (14 < zZU0b
) {
                    if ( Pp7Nx .isEmpty() ) {
            
 if (zZU0b <= 14

) 
 {        HelperJ.guelphish = false;
}
 else if 
 ( HelperJ.buildress != null) 
 {        XAGXN = 6;
} 
 else 
 {        GhZqw = "kanaf" ;
}
                     XAGXN--;

                      GhZqw = "stockholdings" ;
}

             
 if ( HelperJ.beetmaster == null
) 
 {        HelperJ.verdelho = 14;

}
 else if 
 ( GhZqw .isEmpty() ) 
 {        zZU0b++;
} 
 else 
 {        HelperJ.exopterygotic =  false;
}
                      HelperJ.characids = 7;

}

            } else {
                    if ( HelperJ.exopterygotic 
) {
            
 if ( HelperJ.guelphish 
) 
 {        XAGXN = 3;
}
 else if 
 (! HelperJ.buildress .contains(GhZqw) ) 
 {        GhZqw = "woldes" ;
} 
 else 
 {        HelperJ.exopterygotic = false;
}
            } else {
                    QjuBS = 9;

}



}




              
 if ( HelperJ.boxfish .isEmpty() ) 
 {        if (zZU0b == zZU0b
) {
                    if ( HelperJ.boxfish == null
) {
                    XAGXN--;

            } else {
                    HelperJ.exopterygotic = true;
}




                     HelperJ.guelphish = ! false;

                      Pp7Nx = "transactionally" ;
}
}
 else if 
 ( GhZqw == null
) 
 {        if (zZU0b <= 2

) {
                    GhZqw = "olykoeks" ;

            } else {
                    --XAGXN;
}



} 
 else 
 {        GhZqw = "apertures" .toLowerCase();
}}

         
    }

     
    public  void cegb(boolean IKVmm, String tZwTO, String JyKw7) {
                if ( HelperJ.guelphish 
) {
            
 if (HelperJ.verdelho <= 8

) 
 {
 if (HelperJ.verdelho > HelperJ.characids

) 
 {
 if ( HelperJ.beetmaster != null) 
 {
 if ( JyKw7 != null) 
 {        HelperJ.characids = 14;
}
 else if 
 (HelperJ.reauthorizes <= HelperJ.steepled
) 
 {        tZwTO = "";
} 
 else 
 {        IKVmm = true;
}}
 else if 
 ( HelperJ.beetmaster .contains("mop") ) 
 {        if (4 < HelperJ.characids
) {
                    HelperJ.boxfish = "weatings" ;

            } else {
                    tZwTO = "stockpiles" ;
}



} 
 else 
 {        IKVmm = true;
}}
 else if 
 (HelperJ.reauthorizes == HelperJ.characids

) 
 {
 if ( tZwTO != null) 
 {        if ( IKVmm 
) {
                    --HelperJ.characids;

            } else {
                    HelperJ.verdelho++;
}



}
 else if 
 (HelperJ.reauthorizes != HelperJ.steepled
) 
 {        IKVmm = ! false;
} 
 else 
 {        JyKw7 = "malgring" ;
}} 
 else 
 {        IKVmm = true;
}}
 else if 
 (! IKVmm 
) 
 {
 if (HelperJ.characids != 2

) 
 {        if ( tZwTO == null
) {
                    if ( IKVmm 
) {
                    --HelperJ.verdelho;

            } else {
                    tZwTO = "";
}




            } else {
                    HelperJ.reauthorizes--;
}



}
 else if 
 (HelperJ.steepled <= HelperJ.characids
) 
 {
 if ( tZwTO .contains("unconstricted") ) 
 {        HelperJ.exopterygotic = true;
}
 else if 
 ( tZwTO != null) 
 {        ++HelperJ.verdelho;
} 
 else 
 {        HelperJ.characids = 8;

}} 
 else 
 {        tZwTO = "hoernesite" ;
}} 
 else 
 {        if ( tZwTO != null) {
                    if ( tZwTO != null) {
                    HelperJ.buildress = "lapsibility" ;

                     JyKw7 = "metacetone" ;

                      HelperJ.verdelho = 0;
}

            } else {
                    HelperJ.beetmaster = "ultramarathoner" .trim();
}



}
                     if ( HelperJ.buildress != null) {
                    if ( tZwTO != null) {
                    if ( IKVmm 
) {
                    if (HelperJ.steepled != HelperJ.verdelho

) {
                    ++HelperJ.verdelho;

            } else {
                    HelperJ.steepled = 2;

}




            } else {
                    tZwTO = "";
}




            } else {
            
 if ( tZwTO .equals("stoneless") ) 
 {        HelperJ.buildress = "";
}
 else if 
 ( HelperJ.boxfish .contains("retinoblastomata") ) 
 {        JyKw7 = "subdistricted" ;
} 
 else 
 {        HelperJ.guelphish = true;
}}




            } else {
                    if (HelperJ.reauthorizes == HelperJ.verdelho
) {
                    if ( tZwTO == null
) {
                    tZwTO = "";

            } else {
                    HelperJ.guelphish = false;
}




                     HelperJ.exopterygotic =  true;

                      HelperJ.beetmaster = "";
}
}




                      if (HelperJ.steepled < 1

) {
                    if (! JyKw7 .isEmpty() ) {
                    if ( tZwTO == null
) {
                    JyKw7 = "";

                     IKVmm = true;

                      HelperJ.verdelho = 5;
}

            } else {
                    ++HelperJ.verdelho;
}




                     if ( HelperJ.beetmaster != null) {
                    HelperJ.buildress = "";

            } else {
                    HelperJ.reauthorizes++;
}




                      HelperJ.buildress = "";
}
}
        if ( HelperJ.beetmaster .equals("Artacia") ) {
                    if (! IKVmm 
) {
                    if (5 <= HelperJ.steepled
) {
            
 if ( JyKw7 != null) 
 {        if ( JyKw7 .equals(tZwTO) ) {
                    if (HelperJ.reauthorizes == HelperJ.verdelho
) {
                    IKVmm = true;

            } else {
                    JyKw7 = "chondrosarcomatous" ;
}




                     HelperJ.reauthorizes = 0;


                      JyKw7 = "";
}
}
 else if 
 (6 < HelperJ.steepled
) 
 {
 if ( tZwTO .intern().equals(tZwTO) ) 
 {        tZwTO = "";
}
 else if 
 ( JyKw7 != null) 
 {        JyKw7 = "psychroesthesia" ;
} 
 else 
 {        tZwTO = "Toskish" ;
}} 
 else 
 {        --HelperJ.verdelho;
}
            } else {
            
 if ( JyKw7 .intern().isEmpty() ) 
 {        if (HelperJ.verdelho > HelperJ.verdelho

) {
                    HelperJ.steepled = 6;


                     IKVmm = true;

                      HelperJ.exopterygotic = true;
}
}
 else if 
 (! tZwTO .equals("lecanoscopic") ) 
 {        HelperJ.exopterygotic = true;
} 
 else 
 {        IKVmm = false;
}}




            } else {
                    if (! HelperJ.beetmaster .contains("equiprobability") ) {
            
 if ( tZwTO == null
) 
 {        if (HelperJ.characids <= HelperJ.characids

) {
                    IKVmm = true;

            } else {
                    JyKw7 = "";
}



}
 else if 
 ( IKVmm 
) 
 {        IKVmm =  false;
} 
 else 
 {        HelperJ.exopterygotic =  true;
}
             
 if (HelperJ.characids <= HelperJ.reauthorizes

) 
 {        IKVmm = true;
}
 else if 
 ( HelperJ.buildress == null
) 
 {        HelperJ.steepled = 0;
} 
 else 
 {        IKVmm = false;
}
                      HelperJ.steepled--;
}
}




                     if ( IKVmm 
) {
                    HelperJ.steepled = 13;

            } else {
                    if ( tZwTO == null
) {
                    if ( tZwTO .contains("phytopathology") ) {
                    HelperJ.beetmaster = "forray" ;

                     tZwTO = "flustery" ;

                      IKVmm =  true;
}

                     --HelperJ.steepled;

                      HelperJ.characids++;
}
}




                      if (8 != HelperJ.reauthorizes
) {
                    tZwTO = "cincinnus" ;

            } else {
            
 if (HelperJ.verdelho == HelperJ.verdelho

) 
 {        IKVmm = false;
}
 else if 
 (! IKVmm 
) 
 {        HelperJ.reauthorizes--;
} 
 else 
 {        HelperJ.reauthorizes = 9;

}}



}
        if ( HelperJ.buildress != null) {
                    HelperJ.verdelho = 0;


            } else {
                    if ( HelperJ.beetmaster != null) {
            
 if ( HelperJ.buildress .contains(HelperJ.beetmaster) ) 
 {        if ( IKVmm 
) {
            
 if ( JyKw7 == null
) 
 {        --HelperJ.characids;
}
 else if 
 (! IKVmm 
) 
 {        HelperJ.characids++;
} 
 else 
 {        HelperJ.reauthorizes = 12;
}
                     IKVmm =  true;

                      ++HelperJ.reauthorizes;
}
}
 else if 
 (HelperJ.verdelho == HelperJ.characids
) 
 {        IKVmm = true;
} 
 else 
 {        IKVmm = false;
}
            } else {
                    if (! JyKw7 .equals(JyKw7) ) {
                    if ( JyKw7 != null) {
                    HelperJ.exopterygotic =  true;

            } else {
                    IKVmm = true;
}




            } else {
                    IKVmm = false;
}



}



}




 if (HelperJ.verdelho != HelperJ.reauthorizes

) 
 {        HelperJ.buildress = "savara" ;
}
 else if 
 (3 > HelperJ.reauthorizes
) 
 {        if (HelperJ.steepled < HelperJ.characids
) {
            
 if ( IKVmm 
) 
 {        IKVmm = false;
}
 else if 
 ( tZwTO != null) 
 {        tZwTO = "cattle" ;
} 
 else 
 {        HelperJ.verdelho++;
}
            } else {
                    if (! HelperJ.boxfish .contains("gelsemine") ) {
                    if (HelperJ.verdelho <= 14

) {
                    JyKw7 = "";

            } else {
                    IKVmm = true;
}




                     --HelperJ.reauthorizes;

                      HelperJ.steepled = 13;

}
}



} 
 else 
 {        if (13 < HelperJ.steepled
) {
                    if ( HelperJ.guelphish 
) {
                    if ( tZwTO != null) {
                    tZwTO = "wieldableness" ;

            } else {
                    HelperJ.boxfish = "rollicksomeness" ;
}




                     HelperJ.reauthorizes++;

                      IKVmm = true;
}

                     if (HelperJ.verdelho <= 4

) {
                    ++HelperJ.reauthorizes;

            } else {
                    --HelperJ.verdelho;
}




                      HelperJ.verdelho = 5;

}
}
         
    }

     
    public  void underbalancing(String c59fl, int JF2J4) {
        
 if ( HelperJ.guelphish 
) 
 {        c59fl = "";
}
 else if 
 ( HelperJ.buildress .toUpperCase().equals("issanguila") ) 
 {        if ( HelperJ.buildress .isEmpty() ) {
            
 if ( HelperJ.guelphish 
) 
 {        if (HelperJ.characids <= HelperJ.steepled

) {
                    if (HelperJ.characids < 2

) {
                    --HelperJ.reauthorizes;

                     c59fl = "";

                      HelperJ.exopterygotic = false;
}

                     HelperJ.guelphish =  false;

                      JF2J4--;
}
}
 else if 
 (HelperJ.reauthorizes < JF2J4

) 
 {        if (JF2J4 < HelperJ.reauthorizes
) {
                    HelperJ.guelphish =  false;

            } else {
                    JF2J4 = 5;
}



} 
 else 
 {        c59fl = "";
}
             
 if ( c59fl == null
) 
 {        if ( HelperJ.boxfish == null
) {
                    c59fl = "";

                     HelperJ.guelphish = true;

                      c59fl = "dapple" ;
}
}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        HelperJ.exopterygotic = true;
} 
 else 
 {        c59fl = "";
}
                      if (6 > HelperJ.reauthorizes
) {
                    HelperJ.verdelho = 7;


                     JF2J4--;

                      HelperJ.beetmaster = "";
}
}
} 
 else 
 {
 if (HelperJ.reauthorizes != 8

) 
 {
 if (JF2J4 > 6

) 
 {
 if ( c59fl .equals("outvoyaging") ) 
 {        HelperJ.verdelho = 2;

}
 else if 
 (! HelperJ.beetmaster .contains(c59fl) ) 
 {        HelperJ.guelphish =  true;
} 
 else 
 {        HelperJ.buildress = "";
}}
 else if 
 (HelperJ.characids <= JF2J4

) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        HelperJ.guelphish = false;
}}
 else if 
 (HelperJ.verdelho <= JF2J4
) 
 {        if ( HelperJ.guelphish 
) {
                    ++JF2J4;

            } else {
                    HelperJ.exopterygotic = ! false;
}



} 
 else 
 {        HelperJ.exopterygotic = false;
}}        if ( c59fl == null
) {
                    JF2J4 = 9;


             
 if ( c59fl != null) 
 {        HelperJ.exopterygotic = false;
}
 else if 
 (JF2J4 <= HelperJ.steepled

) 
 {
 if ( c59fl != null) 
 {
 if ( c59fl .contains("neighborship") ) 
 {        c59fl = "vapourwares" ;
}
 else if 
 ( c59fl != null) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        HelperJ.guelphish = true;
}}
 else if 
 ( c59fl == null
) 
 {        c59fl = "peacebreaker" ;
} 
 else 
 {        c59fl = "";
}} 
 else 
 {        if ( HelperJ.boxfish == null
) {
                    JF2J4 = 14;


            } else {
                    ++JF2J4;
}



}
              
 if (! HelperJ.beetmaster .contains(HelperJ.buildress) ) 
 {        if (HelperJ.characids > HelperJ.characids

) {
                    if (JF2J4 <= HelperJ.steepled
) {
                    HelperJ.buildress = "crotchetiest" ;

            } else {
                    JF2J4--;
}




            } else {
                    c59fl = "charabancer" ;
}



}
 else if 
 ( c59fl != null) 
 {        if ( HelperJ.beetmaster != null) {
                    JF2J4 = 7;


                     --JF2J4;

                      c59fl = "knots" ;
}
} 
 else 
 {        HelperJ.boxfish = "";
}}

 if ( HelperJ.boxfish .contains("semidiaphanously") ) 
 {        if (! HelperJ.buildress .equals("intrapopulation") ) {
                    if ( HelperJ.boxfish .equals(HelperJ.buildress) ) {
                    HelperJ.guelphish =  false;

                     if ( c59fl != null) {
                    if ( HelperJ.exopterygotic 
) {
                    HelperJ.boxfish = "isodonts" ;

                     c59fl = "Alcester" ;

                      c59fl = "Tollman" ;
}

            } else {
                    HelperJ.steepled = 7;
}




                      if (JF2J4 <= JF2J4

) {
                    HelperJ.reauthorizes--;

                     --JF2J4;

                      JF2J4++;
}
}

             
 if ( c59fl .isEmpty() ) 
 {        if (HelperJ.characids < JF2J4

) {
                    if (! HelperJ.exopterygotic 
) {
                    HelperJ.guelphish = ! true;

                     HelperJ.guelphish = false;

                      ++JF2J4;
}

            } else {
                    HelperJ.beetmaster = "nuncheck" ;
}



}
 else if 
 (HelperJ.reauthorizes <= HelperJ.verdelho

) 
 {
 if (HelperJ.verdelho == JF2J4

) 
 {        HelperJ.guelphish = false;
}
 else if 
 ( c59fl .contains(HelperJ.beetmaster) ) 
 {        c59fl = "";
} 
 else 
 {        c59fl = "formidablenesses" ;
}} 
 else 
 {        HelperJ.reauthorizes = 6;

}
              
 if (! HelperJ.beetmaster .equals(HelperJ.beetmaster) ) 
 {        if ( c59fl == null
) {
                    HelperJ.exopterygotic = ! false;

                     HelperJ.beetmaster = "subparagraph" ;

                      HelperJ.guelphish = true;
}
}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        c59fl = "";
} 
 else 
 {        HelperJ.verdelho--;
}}
}
 else if 
 (JF2J4 <= HelperJ.steepled
) 
 {
 if (JF2J4 != 11

) 
 {        if ( c59fl .equals("wordman") ) {
                    if ( HelperJ.exopterygotic 
) {
            
 if (HelperJ.verdelho <= JF2J4

) 
 {        c59fl = "panaris" ;
}
 else if 
 ( c59fl == null
) 
 {        HelperJ.exopterygotic = true;
} 
 else 
 {        ++JF2J4;
}
            } else {
                    HelperJ.steepled--;
}




                     if ( c59fl == null
) {
                    HelperJ.exopterygotic =  true;

                     HelperJ.guelphish = true;

                      HelperJ.verdelho += 14;

}

                      c59fl = "";
}
}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        if ( HelperJ.beetmaster .isEmpty() ) {
            
 if (10 > HelperJ.steepled
) 
 {        HelperJ.reauthorizes = 14;
}
 else if 
 ( HelperJ.beetmaster .contains("edingtonite") ) 
 {        HelperJ.characids += 10;

} 
 else 
 {        HelperJ.guelphish = false;
}
            } else {
                    HelperJ.exopterygotic = false;
}



} 
 else 
 {        if (3 <= JF2J4
) {
                    HelperJ.steepled = 4;

            } else {
                    HelperJ.guelphish = false;
}



}} 
 else 
 {
 if (HelperJ.verdelho > HelperJ.characids
) 
 {        if ( HelperJ.guelphish 
) {
                    if (HelperJ.verdelho <= 12

) {
                    HelperJ.buildress = "posttrapezoid" ;

            } else {
                    HelperJ.guelphish = false;
}




                     HelperJ.guelphish = false;

                      HelperJ.exopterygotic =  true;
}
}
 else if 
 ( c59fl != null) 
 {        if ( c59fl == null
) {
                    c59fl = "deerdrive" ;

            } else {
                    HelperJ.boxfish = "lamiae" ;
}



} 
 else 
 {        HelperJ.boxfish = "amylogenesis" ;
}}        if ( HelperJ.beetmaster == null
) {
                    ++JF2J4;

            } else {
            
 if (5 != HelperJ.steepled
) 
 {
 if (! c59fl .isEmpty() ) 
 {        if ( c59fl != null) {
            
 if (6 < HelperJ.steepled
) 
 {        c59fl = "McCarthyists" ;
}
 else if 
 ( c59fl .isEmpty() ) 
 {        c59fl = "";
} 
 else 
 {        c59fl = "Karim" ;
}
                     c59fl = "noncomprehendingly" ;

                      HelperJ.buildress = "confluent" ;
}
}
 else if 
 ( c59fl != null) 
 {
 if ( HelperJ.guelphish 
) 
 {        HelperJ.characids--;
}
 else if 
 (12 != JF2J4
) 
 {        HelperJ.exopterygotic = ! false;
} 
 else 
 {        c59fl = "bourgeoisified" ;
}} 
 else 
 {        HelperJ.guelphish = true;
}}
 else if 
 ( HelperJ.buildress .isEmpty() ) 
 {        if ( HelperJ.buildress == null
) {
                    if (JF2J4 <= 11

) {
                    HelperJ.beetmaster = "";

            } else {
                    c59fl = "hysterodynia" ;
}




            } else {
                    c59fl = "inhabiting" ;
}



} 
 else 
 {
 if ( c59fl == null
) 
 {        HelperJ.boxfish = "Kabukis" ;
}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        ++JF2J4;
} 
 else 
 {        HelperJ.guelphish =  true;
}}}




         
    }

     
    public  void superattainableness(boolean UzJS6) {
                UzJS6 = true;

 if ( UzJS6 
) 
 {
 if ( HelperJ.boxfish == null
) 
 {
 if ( HelperJ.beetmaster == null
) 
 {        if ( HelperJ.boxfish != null) {
                    if (! HelperJ.buildress .equals(HelperJ.buildress) ) {
            
 if ( HelperJ.boxfish == null
) 
 {        HelperJ.verdelho = 7;

}
 else if 
 ( HelperJ.boxfish .equals("prerecognize") ) 
 {        UzJS6 =  true;
} 
 else 
 {        UzJS6 = true;
}
            } else {
                    HelperJ.steepled++;
}




                     HelperJ.reauthorizes = 11;


                      HelperJ.exopterygotic = true;
}
}
 else if 
 (! HelperJ.boxfish .equals("cosmonautic") ) 
 {
 if ( HelperJ.beetmaster != null) 
 {        if (! HelperJ.beetmaster .isEmpty() ) {
                    UzJS6 =  true;

            } else {
                    HelperJ.beetmaster = "aqueoglacial" ;
}



}
 else if 
 ( HelperJ.buildress == null
) 
 {        UzJS6 =  false;
} 
 else 
 {        HelperJ.buildress = "phenoplast" ;
}} 
 else 
 {
 if ( HelperJ.buildress != null) 
 {        UzJS6 = false;
}
 else if 
 (HelperJ.characids == HelperJ.verdelho
) 
 {        UzJS6 = ! false;
} 
 else 
 {        HelperJ.steepled += 11;

}}}
 else if 
 ( HelperJ.boxfish != null) 
 {
 if (HelperJ.verdelho == HelperJ.verdelho

) 
 {        if ( HelperJ.buildress .equals(HelperJ.boxfish) ) {
                    if ( HelperJ.boxfish == null
) {
                    HelperJ.exopterygotic =  true;

            } else {
                    UzJS6 = true;
}




                     HelperJ.steepled++;

                      HelperJ.buildress = "";
}
}
 else if 
 (! HelperJ.exopterygotic 
) 
 {        if ( HelperJ.boxfish == null
) {
                    UzJS6 = true;

                     UzJS6 =  false;

                      HelperJ.beetmaster = "recreantly" ;
}
} 
 else 
 {        HelperJ.reauthorizes = 11;
}} 
 else 
 {        if (14 <= HelperJ.verdelho
) {
                    HelperJ.verdelho = 1;


            } else {
                    --HelperJ.steepled;
}



}}
 else if 
 ( HelperJ.boxfish != null) 
 {        if (HelperJ.characids == HelperJ.steepled
) {
                    if ( HelperJ.guelphish 
) {
                    if (HelperJ.steepled > HelperJ.steepled

) {
                    if ( HelperJ.beetmaster == null
) {
                    HelperJ.buildress = "uncorrelatedly" ;

                     UzJS6 = ! true;

                      HelperJ.beetmaster = "";
}

                     HelperJ.reauthorizes = 9;

                      UzJS6 = false;
}

             
 if ( UzJS6 
) 
 {        HelperJ.characids = 5;

}
 else if 
 (5 > HelperJ.reauthorizes
) 
 {        HelperJ.beetmaster = "";
} 
 else 
 {        UzJS6 = true;
}
                      HelperJ.beetmaster = "";
}

             
 if ( HelperJ.boxfish .contains(HelperJ.buildress) ) 
 {        if (4 <= HelperJ.verdelho
) {
                    HelperJ.boxfish = "";

                     --HelperJ.characids;

                      HelperJ.characids = 0;
}
}
 else if 
 ( UzJS6 
) 
 {        HelperJ.characids = 7;

} 
 else 
 {        HelperJ.boxfish = "noneternal" ;
}
                      if ( HelperJ.buildress == null
) {
                    HelperJ.characids = 7;


                     UzJS6 = false;

                      HelperJ.beetmaster = "transeptal" ;
}
}
} 
 else 
 {
 if (HelperJ.reauthorizes != HelperJ.steepled

) 
 {        if ( HelperJ.boxfish == null
) {
            
 if ( HelperJ.buildress != null) 
 {        HelperJ.verdelho--;
}
 else if 
 ( UzJS6 
) 
 {        HelperJ.characids = 11;
} 
 else 
 {        HelperJ.steepled = 9;
}
                     HelperJ.guelphish =  false;

                      HelperJ.boxfish = "";
}
}
 else if 
 ( HelperJ.boxfish == null
) 
 {
 if (! HelperJ.boxfish .isEmpty() ) 
 {        HelperJ.beetmaster = "";
}
 else if 
 ( HelperJ.buildress != null) 
 {        ++HelperJ.verdelho;
} 
 else 
 {        HelperJ.buildress = "";
}} 
 else 
 {        HelperJ.characids -= 7;

}}        if (HelperJ.verdelho <= 6

) {
                    if ( UzJS6 
) {
            
 if (10 < HelperJ.reauthorizes
) 
 {
 if ( HelperJ.buildress .equals("weldment") ) 
 {
 if ( HelperJ.exopterygotic 
) 
 {        if ( HelperJ.boxfish != null) {
                    UzJS6 = ! true;

            } else {
                    HelperJ.boxfish = "Leonie" ;
}



}
 else if 
 (! UzJS6 
) 
 {        ++HelperJ.verdelho;
} 
 else 
 {        HelperJ.boxfish = "";
}}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        if ( HelperJ.beetmaster .contains("jugulars") ) {
                    UzJS6 = ! true;

            } else {
                    HelperJ.characids = 10;
}



} 
 else 
 {        HelperJ.verdelho = 13;

}}
 else if 
 ( HelperJ.boxfish .contains(HelperJ.boxfish) ) 
 {        if ( HelperJ.beetmaster == null
) {
                    if ( HelperJ.buildress != null) {
                    HelperJ.buildress = "spirometries" ;

            } else {
                    HelperJ.buildress = "";
}




                     ++HelperJ.characids;

                      HelperJ.boxfish = "";
}
} 
 else 
 {        if ( HelperJ.boxfish .equals(HelperJ.boxfish) ) {
                    HelperJ.boxfish = "neurocomputing" ;

            } else {
                    HelperJ.guelphish = false;
}



}
                     if (HelperJ.steepled != 9

) {
                    if ( HelperJ.boxfish == null
) {
                    if (HelperJ.verdelho > HelperJ.steepled

) {
                    HelperJ.characids++;

                     ++HelperJ.verdelho;

                      UzJS6 = false;
}

                     UzJS6 = true;

                      UzJS6 = true;
}

                     if ( HelperJ.beetmaster != null) {
                    HelperJ.buildress = "hemikaryon" ;

            } else {
                    HelperJ.boxfish = "";
}




                      ++HelperJ.steepled;
}

                      HelperJ.guelphish =  true;
}

            } else {
                    if ( HelperJ.buildress != null) {
            
 if (! HelperJ.buildress .equals("kynde") ) 
 {
 if ( HelperJ.boxfish .isEmpty() ) 
 {        if (1 < HelperJ.verdelho
) {
                    UzJS6 = false;

            } else {
                    ++HelperJ.steepled;
}



}
 else if 
 ( HelperJ.boxfish == null
) 
 {        --HelperJ.characids;
} 
 else 
 {        HelperJ.steepled -= 10;
}}
 else if 
 ( HelperJ.guelphish 
) 
 {
 if (11 != HelperJ.reauthorizes
) 
 {        HelperJ.boxfish = "";
}
 else if 
 ( UzJS6 
) 
 {        HelperJ.verdelho -= 13;

} 
 else 
 {        UzJS6 =  false;
}} 
 else 
 {        HelperJ.beetmaster = "unboisterously" ;
}
            } else {
                    if ( HelperJ.boxfish != null) {
            
 if ( UzJS6 
) 
 {        HelperJ.reauthorizes++;
}
 else if 
 (HelperJ.steepled < 13

) 
 {        HelperJ.characids -= 8;

} 
 else 
 {        UzJS6 =  false;
}
                     HelperJ.boxfish = "diffusible" ;

                      ++HelperJ.characids;
}
}



}



        if ( HelperJ.buildress == null
) {
                    if (HelperJ.verdelho > 1

) {
            
 if ( UzJS6 
) 
 {        if (HelperJ.characids == HelperJ.steepled

) {
            
 if ( UzJS6 
) 
 {        if ( HelperJ.buildress != null) {
                    HelperJ.exopterygotic = true;

                     ++HelperJ.reauthorizes;

                      HelperJ.steepled = 8;
}
}
 else if 
 (! HelperJ.beetmaster .contains("overrestrict") ) 
 {        UzJS6 = true;
} 
 else 
 {        HelperJ.exopterygotic =  false;
}
                     if ( HelperJ.beetmaster != null) {
                    HelperJ.reauthorizes = 6;

                     UzJS6 =  false;

                      HelperJ.reauthorizes--;
}

                      HelperJ.boxfish = "tangibile" ;
}
}
 else if 
 ( HelperJ.boxfish == null
) 
 {        UzJS6 = false;
} 
 else 
 {        if (5 > HelperJ.steepled
) {
                    UzJS6 = true;

            } else {
                    HelperJ.characids--;
}



}
            } else {
            
 if ( HelperJ.buildress == null
) 
 {
 if (HelperJ.verdelho <= HelperJ.reauthorizes

) 
 {        HelperJ.buildress = "";
}
 else if 
 ( HelperJ.boxfish == null
) 
 {        HelperJ.boxfish = "overstriking" ;
} 
 else 
 {        --HelperJ.steepled;
}}
 else if 
 ( HelperJ.buildress != null) 
 {        if (HelperJ.verdelho == HelperJ.reauthorizes

) {
                    ++HelperJ.steepled;

            } else {
                    --HelperJ.steepled;
}



} 
 else 
 {        --HelperJ.steepled;
}}




            } else {
                    if (HelperJ.verdelho < HelperJ.verdelho

) {
                    if (HelperJ.characids < 3

) {
            
 if (HelperJ.steepled != HelperJ.verdelho

) 
 {
 if (HelperJ.steepled != HelperJ.reauthorizes
) 
 {        UzJS6 = true;
}
 else if 
 ( HelperJ.buildress == null
) 
 {        UzJS6 = false;
} 
 else 
 {        HelperJ.boxfish = "";
}}
 else if 
 ( HelperJ.buildress .isEmpty() ) 
 {        HelperJ.boxfish = "";
} 
 else 
 {        HelperJ.verdelho--;
}
            } else {
                    if (HelperJ.reauthorizes != 14

) {
                    HelperJ.reauthorizes = 8;


            } else {
                    HelperJ.reauthorizes = 3;

}



}




             
 if ( UzJS6 
) 
 {        if (! UzJS6 
) {
                    HelperJ.characids += 12;

                     HelperJ.steepled = 7;


                      HelperJ.boxfish = "audiencia" ;
}
}
 else if 
 ( HelperJ.boxfish == null
) 
 {        --HelperJ.characids;
} 
 else 
 {        HelperJ.exopterygotic = false;
}
                      if (! HelperJ.buildress .contains("Concorde") ) {
                    HelperJ.guelphish =  true;

            } else {
                    HelperJ.verdelho = 9;

}



}
}




 if ( HelperJ.boxfish .isEmpty() ) 
 {        HelperJ.reauthorizes--;
}
 else if 
 ( HelperJ.beetmaster == null
) 
 {
 if ( HelperJ.exopterygotic 
) 
 {        if ( HelperJ.beetmaster != null) {
            
 if (HelperJ.characids <= HelperJ.reauthorizes

) 
 {        if ( HelperJ.beetmaster == null
) {
                    HelperJ.verdelho = 4;


                     HelperJ.boxfish = "";

                      HelperJ.verdelho -= 5;
}
}
 else if 
 (HelperJ.verdelho < 11

) 
 {        HelperJ.reauthorizes += 1;

} 
 else 
 {        HelperJ.boxfish = "Perikiromene" ;
}
            } else {
                    if (HelperJ.reauthorizes != 10

) {
                    HelperJ.beetmaster = "";

            } else {
                    HelperJ.buildress = "";
}



}



}
 else if 
 ( UzJS6 
) 
 {        if ( HelperJ.buildress == null
) {
                    if ( UzJS6 
) {
                    HelperJ.buildress = "";

                     HelperJ.beetmaster = "stoves" ;

                      UzJS6 = true;
}

            } else {
                    UzJS6 = true;
}



} 
 else 
 {        if (! HelperJ.boxfish .isEmpty() ) {
                    HelperJ.reauthorizes += 10;


                     HelperJ.guelphish =  false;

                      HelperJ.buildress = "unspotted" ;
}
}} 
 else 
 {        if ( HelperJ.boxfish .equals("crossopterygians") ) {
            
 if ( HelperJ.boxfish == null
) 
 {        if ( HelperJ.boxfish .isEmpty() ) {
                    ++HelperJ.reauthorizes;

                     UzJS6 = false;

                      HelperJ.boxfish = "orthosilicate" ;
}
}
 else if 
 (HelperJ.verdelho != HelperJ.steepled
) 
 {        UzJS6 = true;
} 
 else 
 {        HelperJ.steepled += 10;

}
                     if (HelperJ.characids < HelperJ.reauthorizes

) {
                    HelperJ.characids--;

            } else {
                    UzJS6 = false;
}




                      HelperJ.beetmaster = "";
}
}
 if (HelperJ.reauthorizes <= HelperJ.steepled

) 
 {        if ( HelperJ.boxfish == null
) {
                    if ( HelperJ.boxfish != null) {
                    if ( HelperJ.buildress .equals(HelperJ.beetmaster) ) {
            
 if ( HelperJ.buildress == null
) 
 {
 if ( HelperJ.buildress .contains(HelperJ.boxfish) ) 
 {        HelperJ.buildress = "vestibulitises" ;
}
 else if 
 (! HelperJ.beetmaster .contains("latrobite") ) 
 {        UzJS6 =  true;
} 
 else 
 {        HelperJ.boxfish = "arricciato" ;
}}
 else if 
 ( HelperJ.boxfish != null) 
 {        UzJS6 = false;
} 
 else 
 {        HelperJ.verdelho += 4;

}
                     if ( UzJS6 
) {
                    UzJS6 = true;

            } else {
                    HelperJ.boxfish = "motives" ;
}




                      HelperJ.reauthorizes++;
}

            } else {
                    if (HelperJ.characids > HelperJ.reauthorizes
) {
                    if (! HelperJ.exopterygotic 
) {
                    HelperJ.steepled = 3;

            } else {
                    UzJS6 = false;
}




                     HelperJ.guelphish = ! false;

                      HelperJ.reauthorizes = 5;

}
}




                     if (HelperJ.reauthorizes == 8

) {
                    if (HelperJ.steepled == HelperJ.steepled

) {
                    if (3 == HelperJ.characids
) {
                    HelperJ.exopterygotic = false;

            } else {
                    HelperJ.steepled = 11;
}




                     HelperJ.characids--;

                      UzJS6 = false;
}

            } else {
                    if (HelperJ.verdelho != HelperJ.verdelho

) {
                    HelperJ.boxfish = "";

            } else {
                    HelperJ.reauthorizes++;
}



}




                      if (HelperJ.steepled > HelperJ.characids
) {
                    if ( HelperJ.buildress == null
) {
                    HelperJ.beetmaster = "repandly" ;

            } else {
                    ++HelperJ.verdelho;
}




                     HelperJ.verdelho++;

                      --HelperJ.verdelho;
}
}
}
 else if 
 ( HelperJ.boxfish == null
) 
 {        if (9 <= HelperJ.verdelho
) {
                    UzJS6 =  true;

                     HelperJ.verdelho += 13;


                      if ( HelperJ.buildress .contains("dichlorvoses") ) {
                    HelperJ.buildress = "";

                     HelperJ.guelphish = false;

                      HelperJ.buildress = "plainsfolk" ;
}
}
} 
 else 
 {
 if ( HelperJ.guelphish 
) 
 {
 if (! HelperJ.guelphish 
) 
 {        if ( HelperJ.beetmaster == null
) {
                    HelperJ.reauthorizes = 14;

            } else {
                    HelperJ.reauthorizes = 9;
}



}
 else if 
 ( UzJS6 
) 
 {        HelperJ.characids--;
} 
 else 
 {        HelperJ.reauthorizes = 6;
}}
 else if 
 ( HelperJ.beetmaster != null) 
 {        if (2 <= HelperJ.characids
) {
                    HelperJ.reauthorizes--;

            } else {
                    UzJS6 = false;
}



} 
 else 
 {        HelperJ.buildress = "pinakoids" ;
}}
 if ( HelperJ.boxfish == null
) 
 {        HelperJ.boxfish = "discriminants" ;
}
 else if 
 ( HelperJ.beetmaster != null) 
 {
 if ( HelperJ.boxfish != null) 
 {        if ( HelperJ.beetmaster .contains(HelperJ.boxfish) ) {
                    if ( HelperJ.beetmaster != null) {
                    if ( HelperJ.boxfish != null) {
                    ++HelperJ.reauthorizes;

            } else {
                    HelperJ.characids += 9;

}




                     UzJS6 = false;

                      HelperJ.beetmaster = "slumberousness" ;
}

                     if (2 != HelperJ.reauthorizes
) {
                    HelperJ.guelphish = true;

            } else {
                    HelperJ.reauthorizes++;
}




                      UzJS6 = ! false;
}
}
 else if 
 ( HelperJ.boxfish .contains(HelperJ.beetmaster) ) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        if (HelperJ.reauthorizes <= HelperJ.reauthorizes
) {
                    HelperJ.boxfish = "";

                     HelperJ.exopterygotic = false;

                      --HelperJ.steepled;
}
}} 
 else 
 {        if ( HelperJ.boxfish == null
) {
            
 if ( HelperJ.boxfish == null
) 
 {        if (6 < HelperJ.steepled
) {
                    UzJS6 = true;

            } else {
                    --HelperJ.steepled;
}



}
 else if 
 ( HelperJ.boxfish != null) 
 {        --HelperJ.characids;
} 
 else 
 {        HelperJ.exopterygotic = ! true;
}
            } else {
                    if (0 < HelperJ.characids
) {
                    HelperJ.steepled--;

                     HelperJ.reauthorizes--;

                      UzJS6 = false;
}
}



}
         
    }

     
    public  void unmingle(int q3SPd, String cCAUC, boolean pLfby, String K1cIm) {
                if (HelperJ.verdelho > HelperJ.steepled

) {
                    if (q3SPd < q3SPd

) {
                    if (HelperJ.verdelho == 8

) {
                    if ( cCAUC == null
) {
                    if ( pLfby 
) {
                    if ( HelperJ.exopterygotic 
) {
                    ++HelperJ.steepled;

                     q3SPd++;

                      HelperJ.guelphish =  true;
}

                     pLfby = true;

                      HelperJ.buildress = "pentacts" ;
}

                     if (q3SPd == q3SPd
) {
                    q3SPd = 9;

                     cCAUC = "";

                      pLfby =  true;
}

                      q3SPd++;
}

                     if (q3SPd < q3SPd
) {
            
 if ( cCAUC .equals("spangles") ) 
 {        HelperJ.exopterygotic = false;
}
 else if 
 ( K1cIm == null
) 
 {        HelperJ.characids += 0;
} 
 else 
 {        cCAUC = "";
}
                     K1cIm = "";

                      HelperJ.guelphish =  true;
}

                      if (! HelperJ.exopterygotic 
) {
                    pLfby = false;

            } else {
                    q3SPd = 13;

}



}

            } else {
            
 if (q3SPd <= HelperJ.steepled

) 
 {
 if ( pLfby 
) 
 {        if (HelperJ.steepled < HelperJ.verdelho
) {
                    q3SPd = 12;

                     --q3SPd;

                      K1cIm = "pyruvate" ;
}
}
 else if 
 (HelperJ.steepled < 5

) 
 {        pLfby = true;
} 
 else 
 {        K1cIm = "";
}}
 else if 
 ( HelperJ.beetmaster != null) 
 {
 if (! HelperJ.guelphish 
) 
 {        HelperJ.beetmaster = "monacillos" ;
}
 else if 
 ( K1cIm .isEmpty() ) 
 {        q3SPd = 0;

} 
 else 
 {        pLfby =  true;
}} 
 else 
 {        q3SPd++;
}}




                     if ( cCAUC != null) {
                    if (! HelperJ.beetmaster .isEmpty() ) {
            
 if (HelperJ.reauthorizes <= q3SPd
) 
 {        if ( cCAUC == null
) {
                    cCAUC = "";

                     pLfby = ! false;

                      pLfby =  false;
}
}
 else if 
 ( cCAUC .isEmpty() ) 
 {        q3SPd--;
} 
 else 
 {        --HelperJ.characids;
}
             
 if (q3SPd < HelperJ.characids

) 
 {        HelperJ.guelphish = false;
}
 else if 
 (! pLfby 
) 
 {        cCAUC = "eruditionist" ;
} 
 else 
 {        HelperJ.boxfish = "";
}
                      pLfby = false;
}

                     if (! HelperJ.buildress .isEmpty() ) {
                    if ( HelperJ.boxfish .isEmpty() ) {
                    ++q3SPd;

                     ++HelperJ.reauthorizes;

                      q3SPd--;
}

            } else {
                    K1cIm = "fumeuse" .trim();
}




                      pLfby = true;
}

              
 if ( K1cIm != null) 
 {        if (HelperJ.verdelho < 4

) {
                    if ( cCAUC != null) {
                    K1cIm = "";

            } else {
                    HelperJ.beetmaster = "";
}




            } else {
                    cCAUC = "bronchiocrisis" ;
}



}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        if ( cCAUC != null) {
                    K1cIm = "";

                     HelperJ.guelphish = true;

                      pLfby = false;
}
} 
 else 
 {        HelperJ.steepled = 10;

}}
        K1cIm = "";

 if ( HelperJ.beetmaster == null
) 
 {        if (! cCAUC .contains(K1cIm) ) {
                    if (q3SPd != 13

) {
                    if (HelperJ.reauthorizes != 10

) {
                    if ( HelperJ.buildress != null) {
                    if ( K1cIm == null
) {
                    HelperJ.exopterygotic = true;

                     pLfby = true;

                      cCAUC = "regrabbing" ;
}

            } else {
                    pLfby = false;
}




            } else {
                    if ( HelperJ.boxfish == null
) {
                    HelperJ.exopterygotic = true;

            } else {
                    pLfby =  false;
}



}




             
 if (q3SPd < HelperJ.verdelho

) 
 {        q3SPd = 0;
}
 else if 
 ( K1cIm != null) 
 {        HelperJ.boxfish = "preapplies" ;
} 
 else 
 {        HelperJ.characids = 3;
}
                      HelperJ.exopterygotic = true;
}

            } else {
            
 if ( pLfby 
) 
 {        if (HelperJ.reauthorizes <= HelperJ.characids
) {
                    if (q3SPd < 4

) {
                    K1cIm = "";

                     pLfby =  false;

                      HelperJ.exopterygotic = false;
}

                     HelperJ.buildress = "";

                      HelperJ.boxfish = "affeerments" ;
}
}
 else if 
 ( K1cIm != null) 
 {
 if ( K1cIm .contains("Amoritish") ) 
 {        HelperJ.characids = 6;

}
 else if 
 (q3SPd == q3SPd

) 
 {        q3SPd = 9;
} 
 else 
 {        HelperJ.exopterygotic = false;
}} 
 else 
 {        pLfby =  true;
}}



}
 else if 
 ( cCAUC == null
) 
 {        if ( K1cIm .equals(K1cIm) ) {
                    if ( HelperJ.beetmaster != null) {
            
 if (HelperJ.steepled > q3SPd

) 
 {        if ( cCAUC != null) {
                    q3SPd--;

                     q3SPd = 5;

                      HelperJ.buildress = "unproportionably" ;
}
}
 else if 
 (q3SPd <= HelperJ.reauthorizes
) 
 {        K1cIm = "";
} 
 else 
 {        cCAUC = "unmaidenly" ;
}
            } else {
            
 if (0 == q3SPd
) 
 {        HelperJ.verdelho = 14;
}
 else if 
 ( pLfby 
) 
 {        --HelperJ.reauthorizes;
} 
 else 
 {        cCAUC = "";
}}




            } else {
                    if ( pLfby 
) {
            
 if (HelperJ.characids == q3SPd
) 
 {        HelperJ.exopterygotic = false;
}
 else if 
 ( K1cIm != null) 
 {        HelperJ.beetmaster = "stalkier" ;
} 
 else 
 {        HelperJ.buildress = "";
}
            } else {
                    pLfby = false;
}



}



} 
 else 
 {        cCAUC = "";
}
 if (HelperJ.verdelho == HelperJ.steepled
) 
 {        if ( K1cIm == null
) {
                    if ( K1cIm != null) {
                    if (! K1cIm .trim().isEmpty() ) {
                    if (! K1cIm .equals("conidiophorous") ) {
                    if (q3SPd == q3SPd

) {
                    K1cIm = "regerminative" ;

            } else {
                    --q3SPd;
}




                     HelperJ.reauthorizes = 8;

                      q3SPd = 8;
}

                     HelperJ.characids = 10;


                      q3SPd++;
}

                     if (! cCAUC .isEmpty() ) {
            
 if ( HelperJ.boxfish == null
) 
 {        cCAUC = "";
}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        HelperJ.beetmaster = "searcer" ;
} 
 else 
 {        ++HelperJ.reauthorizes;
}
                     HelperJ.buildress = "";

                      pLfby = false;
}

                      if ( K1cIm .contains(HelperJ.beetmaster) ) {
                    q3SPd = 1;


            } else {
                    pLfby = true;
}



}

            } else {
                    if (! HelperJ.beetmaster .contains("actionizing") ) {
                    if (HelperJ.characids == 14

) {
                    HelperJ.guelphish =  true;

                     --q3SPd;

                      pLfby = true;
}

                     if ( cCAUC .isEmpty() ) {
                    pLfby = true;

            } else {
                    pLfby = false;
}




                      HelperJ.exopterygotic = false;
}
}



}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        q3SPd = 13;
} 
 else 
 {        if ( HelperJ.boxfish .contains(HelperJ.boxfish) ) {
            
 if (10 == HelperJ.reauthorizes
) 
 {        if ( cCAUC != null) {
                    ++HelperJ.characids;

            } else {
                    q3SPd++;
}



}
 else if 
 ( K1cIm != null) 
 {        --HelperJ.steepled;
} 
 else 
 {        q3SPd = 8;
}
             
 if ( HelperJ.guelphish 
) 
 {        HelperJ.guelphish =  true;
}
 else if 
 (8 <= q3SPd
) 
 {        cCAUC = "";
} 
 else 
 {        HelperJ.verdelho = 0;
}
                      K1cIm = "";
}
}        if (HelperJ.characids > 9

) {
                    if ( cCAUC == null
) {
                    if ( cCAUC == null
) {
                    if (HelperJ.steepled <= q3SPd

) {
                    pLfby =  false;

            } else {
                    if ( cCAUC == null
) {
                    HelperJ.guelphish = true;

            } else {
                    cCAUC = "chundering" ;
}



}




                     q3SPd++;

                      if ( pLfby 
) {
                    cCAUC = "minos" ;

                     HelperJ.verdelho--;

                      pLfby = true;
}
}

            } else {
            
 if (q3SPd == 11

) 
 {        q3SPd++;
}
 else if 
 (! HelperJ.guelphish 
) 
 {
 if (HelperJ.reauthorizes != 4

) 
 {        HelperJ.characids = 8;
}
 else if 
 ( K1cIm == null
) 
 {        q3SPd = 2;
} 
 else 
 {        HelperJ.reauthorizes--;
}} 
 else 
 {        cCAUC = "currantiest" ;
}}




            } else {
                    if ( cCAUC .contains(HelperJ.boxfish) ) {
                    HelperJ.steepled = 10;


            } else {
                    HelperJ.exopterygotic = true;
}



}




 if ( pLfby 
) 
 {        HelperJ.boxfish = "telecon" ;
}
 else if 
 ( HelperJ.buildress != null) 
 {
 if ( cCAUC != null) 
 {        if ( K1cIm == null
) {
                    if ( HelperJ.buildress == null
) {
                    if (13 != q3SPd
) {
                    cCAUC = "";

            } else {
                    pLfby =  false;
}




                     HelperJ.beetmaster = "";

                      HelperJ.guelphish = false;
}

                     if ( cCAUC != null) {
                    cCAUC = "";

            } else {
                    HelperJ.guelphish = true;
}




                      HelperJ.guelphish = false;
}
}
 else if 
 (HelperJ.characids == HelperJ.reauthorizes

) 
 {
 if ( HelperJ.buildress != null) 
 {        if ( HelperJ.beetmaster != null) {
                    --HelperJ.steepled;

            } else {
                    q3SPd = 6;

}



}
 else if 
 (HelperJ.reauthorizes <= HelperJ.reauthorizes
) 
 {        HelperJ.exopterygotic = false;
} 
 else 
 {        pLfby = ! false;
}} 
 else 
 {
 if (q3SPd <= q3SPd

) 
 {        HelperJ.reauthorizes = 10;

}
 else if 
 ( K1cIm .trim().equals("petnappers") ) 
 {        ++q3SPd;
} 
 else 
 {        pLfby =  false;
}}} 
 else 
 {        if ( HelperJ.buildress == null
) {
            
 if ( HelperJ.buildress != null) 
 {
 if (11 < HelperJ.characids
) 
 {        HelperJ.beetmaster = "";
}
 else if 
 ( HelperJ.buildress == null
) 
 {        pLfby =  false;
} 
 else 
 {        pLfby = false;
}}
 else if 
 ( HelperJ.beetmaster != null) 
 {        HelperJ.buildress = "dephlogisticated" ;
} 
 else 
 {        HelperJ.buildress = "holluschickie" ;
}
                     if ( cCAUC != null) {
                    --q3SPd;

                     cCAUC = "hypermorphic" ;

                      HelperJ.characids = 11;

}

                      q3SPd = 1;

}
}
 if ( K1cIm != null) 
 {        if (HelperJ.characids == HelperJ.steepled
) {
                    if ( HelperJ.beetmaster .contains("spondylosyndeses") ) {
                    if ( cCAUC .contains("wallowings") ) {
                    if (HelperJ.verdelho > q3SPd

) {
            
 if (14 < HelperJ.steepled
) 
 {        pLfby = false;
}
 else if 
 ( pLfby 
) 
 {        q3SPd = 2;
} 
 else 
 {        K1cIm = "";
}
                     pLfby =  false;

                      HelperJ.reauthorizes--;
}

                     if (HelperJ.steepled > 10

) {
                    q3SPd = 0;

            } else {
                    HelperJ.characids = 2;
}




                      pLfby = false;
}

                     if (q3SPd < 8

) {
                    if (! pLfby 
) {
                    ++q3SPd;

                     cCAUC = "bilander" ;

                      K1cIm = "emotionalize" ;
}

            } else {
                    K1cIm = "diabolos" ;
}




                      if ( cCAUC .equals("pabouche") ) {
                    cCAUC = "mungo" ;

                     pLfby = false;

                      HelperJ.guelphish = true;
}
}

            } else {
                    if ( pLfby 
) {
                    if ( K1cIm .isEmpty() ) {
                    cCAUC = "";

                     HelperJ.exopterygotic =  true;

                      HelperJ.beetmaster = "";
}

             
 if (! K1cIm .isEmpty() ) 
 {        HelperJ.buildress = "cobleman" ;
}
 else if 
 (! HelperJ.exopterygotic 
) 
 {        q3SPd++;
} 
 else 
 {        HelperJ.steepled--;
}
                      K1cIm = "antidiscrimination" ;
}
}



}
 else if 
 (! HelperJ.guelphish 
) 
 {
 if ( HelperJ.buildress .isEmpty() ) 
 {
 if ( HelperJ.boxfish != null) 
 {        if (q3SPd <= q3SPd
) {
            
 if ( K1cIm == null
) 
 {        pLfby = false;
}
 else if 
 (HelperJ.reauthorizes <= 3

) 
 {        pLfby = false;
} 
 else 
 {        HelperJ.exopterygotic =  true;
}
            } else {
                    K1cIm = "rosinweed" ;
}



}
 else if 
 (q3SPd == HelperJ.verdelho

) 
 {        if (q3SPd != 9

) {
                    pLfby = false;

            } else {
                    HelperJ.steepled++;
}



} 
 else 
 {        ++q3SPd;
}}
 else if 
 ( K1cIm != null) 
 {        if ( HelperJ.beetmaster != null) {
            
 if ( pLfby 
) 
 {        pLfby =  false;
}
 else if 
 (q3SPd < q3SPd

) 
 {        HelperJ.beetmaster = "sidepiece" ;
} 
 else 
 {        HelperJ.exopterygotic = false;
}
                     pLfby = false;

                      HelperJ.beetmaster = "";
}
} 
 else 
 {
 if (q3SPd != q3SPd
) 
 {        HelperJ.guelphish = false;
}
 else if 
 ( cCAUC == null
) 
 {        pLfby = false;
} 
 else 
 {        pLfby = true;
}}} 
 else 
 {
 if ( HelperJ.exopterygotic 
) 
 {
 if (13 > q3SPd
) 
 {        if (HelperJ.characids > HelperJ.reauthorizes

) {
                    pLfby = false;

                     HelperJ.verdelho = 3;

                      pLfby = true;
}
}
 else if 
 (1 <= HelperJ.steepled
) 
 {        HelperJ.steepled--;
} 
 else 
 {        pLfby = false;
}}
 else if 
 (2 <= HelperJ.steepled
) 
 {        if ( cCAUC .contains(HelperJ.buildress) ) {
                    pLfby = true;

                     pLfby = ! false;

                      pLfby = false;
}
} 
 else 
 {        K1cIm = "";
}}
         
    }

     
    public  void crotchet(boolean yvqgj) {
                HelperJ.buildress = "";

         
    }

     
    public  void arksutite(boolean KSCgk) {
                if ( HelperJ.buildress == null
) {
                    if (HelperJ.steepled <= 7

) {
            
 if (HelperJ.reauthorizes > HelperJ.characids
) 
 {
 if ( KSCgk 
) 
 {        if ( KSCgk 
) {
                    KSCgk =  true;

                     --HelperJ.characids;

                      HelperJ.steepled--;
}
}
 else if 
 (HelperJ.steepled == HelperJ.verdelho
) 
 {
 if (HelperJ.characids != HelperJ.reauthorizes
) 
 {        HelperJ.verdelho--;
}
 else if 
 (! HelperJ.buildress .isEmpty() ) 
 {        HelperJ.steepled++;
} 
 else 
 {        KSCgk =  true;
}} 
 else 
 {        KSCgk = false;
}}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        HelperJ.characids--;
} 
 else 
 {
 if (! HelperJ.beetmaster .contains(HelperJ.beetmaster) ) 
 {        HelperJ.verdelho = 8;

}
 else if 
 ( HelperJ.buildress .contains("macrography") ) 
 {        HelperJ.beetmaster = "";
} 
 else 
 {        KSCgk =  false;
}}
                     if (! HelperJ.boxfish .contains("catholicos") ) {
            
 if ( HelperJ.boxfish .contains(HelperJ.buildress) ) 
 {        if (11 < HelperJ.verdelho
) {
                    KSCgk = true;

                     HelperJ.reauthorizes = 5;

                      HelperJ.steepled = 9;

}
}
 else if 
 ( HelperJ.beetmaster .isEmpty() ) 
 {        HelperJ.exopterygotic = false;
} 
 else 
 {        HelperJ.verdelho = 1;
}
            } else {
                    KSCgk =  true;
}




                      if (7 != HelperJ.characids
) {
                    ++HelperJ.steepled;

                     HelperJ.boxfish = "trichomonacide" ;

                      HelperJ.exopterygotic = ! true;
}
}

            } else {
                    HelperJ.beetmaster = "vermeologist" ;
}



        if (HelperJ.characids <= HelperJ.reauthorizes

) {
                    if ( HelperJ.boxfish .contains("amblychromatic") ) {
                    if ( HelperJ.buildress == null
) {
            
 if (6 <= HelperJ.steepled
) 
 {        if ( HelperJ.beetmaster == null
) {
            
 if (13 == HelperJ.verdelho
) 
 {        HelperJ.reauthorizes = 14;
}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        KSCgk = false;
} 
 else 
 {        HelperJ.verdelho = 3;

}
                     HelperJ.verdelho = 0;


                      HelperJ.beetmaster = "";
}
}
 else if 
 (HelperJ.verdelho <= 8

) 
 {        if ( HelperJ.buildress == null
) {
                    KSCgk = ! false;

            } else {
                    HelperJ.exopterygotic = true;
}



} 
 else 
 {        KSCgk = true;
}
            } else {
                    if ( HelperJ.buildress != null) {
            
 if (7 <= HelperJ.verdelho
) 
 {        HelperJ.boxfish = "Ehrhardt" ;
}
 else if 
 ( HelperJ.boxfish == null
) 
 {        HelperJ.guelphish = true;
} 
 else 
 {        HelperJ.verdelho = 7;

}
                     HelperJ.exopterygotic = true;

                      HelperJ.characids = 11;
}
}




                     HelperJ.verdelho--;

                      if ( HelperJ.boxfish == null
) {
                    if ( HelperJ.buildress .equals(HelperJ.beetmaster) ) {
                    HelperJ.boxfish = "";

            } else {
                    HelperJ.beetmaster = "Vandenberg" ;
}




            } else {
                    HelperJ.beetmaster = "";
}



}

             
 if ( HelperJ.buildress == null
) 
 {        if (HelperJ.steepled != HelperJ.verdelho
) {
                    HelperJ.buildress = "stormtrooper" ;

                     if (9 > HelperJ.steepled
) {
                    HelperJ.boxfish = "";

            } else {
                    KSCgk = false;
}




                      HelperJ.steepled -= 3;

}
}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        if ( HelperJ.beetmaster .equals(HelperJ.beetmaster) ) {
                    HelperJ.boxfish = "";

            } else {
                    HelperJ.characids = 3;

}



} 
 else 
 {        if ( HelperJ.buildress .contains("quinqueserial") ) {
                    KSCgk = false;

                     HelperJ.characids = 7;


                      HelperJ.beetmaster = "Tuscarora" ;
}
}
              
 if (HelperJ.characids <= 6

) 
 {        if ( HelperJ.exopterygotic 
) {
            
 if ( HelperJ.boxfish != null) 
 {        HelperJ.characids++;
}
 else if 
 ( HelperJ.buildress != null) 
 {        HelperJ.exopterygotic =  true;
} 
 else 
 {        HelperJ.beetmaster = "unpanicky" ;
}
                     HelperJ.steepled = 10;


                      HelperJ.beetmaster = "sympatry" ;
}
}
 else if 
 (4 != HelperJ.steepled
) 
 {        if (HelperJ.characids <= HelperJ.characids

) {
                    --HelperJ.steepled;

                     ++HelperJ.steepled;

                      HelperJ.characids++;
}
} 
 else 
 {        HelperJ.characids++;
}}

         
    }

     
    public  void nonfeverishness(int Kjcxx, int K5HxB) {
        
 if (HelperJ.steepled == K5HxB

) 
 {
 if (Kjcxx > 3

) 
 {
 if (HelperJ.steepled < Kjcxx
) 
 {        if ( HelperJ.boxfish != null) {
                    if ( HelperJ.boxfish == null
) {
                    if ( HelperJ.boxfish == null
) {
                    HelperJ.guelphish = true;

            } else {
                    K5HxB -= 6;
}




                     HelperJ.exopterygotic =  true;

                      Kjcxx = 12;

}

            } else {
                    if ( HelperJ.boxfish != null) {
                    HelperJ.buildress = "tradiment" ;

                     HelperJ.exopterygotic = ! true;

                      Kjcxx++;
}
}



}
 else if 
 ( HelperJ.boxfish != null) 
 {        if (Kjcxx == K5HxB
) {
            
 if (Kjcxx <= Kjcxx

) 
 {        K5HxB = 3;
}
 else if 
 ( HelperJ.buildress == null
) 
 {        HelperJ.boxfish = "pupiparous" ;
} 
 else 
 {        HelperJ.buildress = "";
}
            } else {
                    HelperJ.exopterygotic =  true;
}



} 
 else 
 {        if (K5HxB > K5HxB

) {
                    HelperJ.boxfish = "";

            } else {
                    HelperJ.guelphish = true;
}



}}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        if (4 > K5HxB
) {
            
 if ( HelperJ.exopterygotic 
) 
 {        HelperJ.boxfish = "";
}
 else if 
 (! HelperJ.buildress .equals("tolbooth") ) 
 {        HelperJ.boxfish = "Wojtyla" ;
} 
 else 
 {        HelperJ.exopterygotic = false;
}
                     if ( HelperJ.boxfish != null) {
                    HelperJ.guelphish = true;

            } else {
                    HelperJ.guelphish =  true;
}




                      HelperJ.beetmaster = "ripenesses" ;
}
} 
 else 
 {        if ( HelperJ.guelphish 
) {
            
 if ( HelperJ.beetmaster == null
) 
 {        ++Kjcxx;
}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        --HelperJ.steepled;
} 
 else 
 {        HelperJ.buildress = "";
}
            } else {
                    K5HxB--;
}



}}
 else if 
 ( HelperJ.exopterygotic 
) 
 {        if ( HelperJ.boxfish == null
) {
                    if ( HelperJ.boxfish .equals("longevous") ) {
                    if (8 <= K5HxB
) {
                    if (Kjcxx > HelperJ.steepled
) {
                    HelperJ.guelphish =  false;

                     HelperJ.guelphish = false;

                      HelperJ.characids = 10;

}

            } else {
                    HelperJ.guelphish =  true;
}




             
 if (8 == HelperJ.verdelho
) 
 {        HelperJ.guelphish =  true;
}
 else if 
 ( HelperJ.boxfish == null
) 
 {        K5HxB = 1;

} 
 else 
 {        HelperJ.boxfish = "";
}
                      HelperJ.boxfish = "staw" ;
}

            } else {
            
 if ( HelperJ.exopterygotic 
) 
 {        if ( HelperJ.beetmaster != null) {
                    HelperJ.guelphish = false;

            } else {
                    HelperJ.boxfish = "";
}



}
 else if 
 ( HelperJ.beetmaster == null
) 
 {        Kjcxx = 9;
} 
 else 
 {        --K5HxB;
}}



} 
 else 
 {
 if (HelperJ.characids != HelperJ.characids
) 
 {        HelperJ.beetmaster = "cytolysis" .toUpperCase();
}
 else if 
 ( HelperJ.guelphish 
) 
 {
 if (HelperJ.characids < 14

) 
 {        HelperJ.exopterygotic = ! false;
}
 else if 
 (HelperJ.characids <= K5HxB

) 
 {        HelperJ.boxfish = "";
} 
 else 
 {        HelperJ.guelphish =  false;
}} 
 else 
 {        Kjcxx++;
}}        if ( HelperJ.exopterygotic 
) {
            
 if (! HelperJ.exopterygotic 
) 
 {        if (! HelperJ.buildress .equals("Timur") ) {
                    if ( HelperJ.guelphish 
) {
            
 if ( HelperJ.buildress == null
) 
 {        if (Kjcxx < 4

) {
                    ++Kjcxx;

                     K5HxB = 10;

                      HelperJ.buildress = "Keefer" ;
}
}
 else if 
 ( HelperJ.boxfish == null
) 
 {        --K5HxB;
} 
 else 
 {        HelperJ.buildress = "autocratically" ;
}
                     if (2 <= HelperJ.steepled
) {
                    HelperJ.boxfish = "galvanoplastical" ;

                     HelperJ.exopterygotic = true;

                      HelperJ.guelphish =  false;
}

                      Kjcxx--;
}

             
 if (! HelperJ.exopterygotic 
) 
 {        HelperJ.beetmaster = "debris" ;
}
 else if 
 (Kjcxx <= HelperJ.reauthorizes
) 
 {        HelperJ.exopterygotic = ! false;
} 
 else 
 {        HelperJ.boxfish = "iontophoreses" ;
}
                      if ( HelperJ.exopterygotic 
) {
                    HelperJ.guelphish = false;

                     HelperJ.guelphish = true;

                      ++Kjcxx;
}
}
}
 else if 
 ( HelperJ.boxfish != null) 
 {        if ( HelperJ.buildress != null) {
                    if (! HelperJ.boxfish .isEmpty() ) {
                    if (5 == HelperJ.steepled
) {
                    HelperJ.exopterygotic =  false;

            } else {
                    HelperJ.buildress = "";
}




                     HelperJ.beetmaster = "";

                      Kjcxx = 1;

}

                     HelperJ.boxfish = "";

                      Kjcxx = 11;
}
} 
 else 
 {
 if (Kjcxx > 0

) 
 {        if ( HelperJ.beetmaster == null
) {
                    Kjcxx--;

            } else {
                    HelperJ.characids -= 0;
}



}
 else if 
 (0 > Kjcxx
) 
 {        HelperJ.beetmaster = "whirrick" ;
} 
 else 
 {        HelperJ.exopterygotic = false;
}}
            } else {
            
 if (Kjcxx <= Kjcxx
) 
 {
 if ( HelperJ.buildress .equals(HelperJ.boxfish) ) 
 {
 if ( HelperJ.buildress != null) 
 {        if ( HelperJ.buildress == null
) {
                    HelperJ.verdelho = 6;


            } else {
                    HelperJ.verdelho = 0;

}



}
 else if 
 ( HelperJ.buildress .equals("horizontalnesses") ) 
 {        HelperJ.buildress = "blossoming" ;
} 
 else 
 {        HelperJ.exopterygotic =  false;
}}
 else if 
 ( HelperJ.buildress != null) 
 {        if (HelperJ.characids != K5HxB
) {
                    HelperJ.guelphish =  true;

                     HelperJ.boxfish = "antivivisectionist" ;

                      Kjcxx = 1;
}
} 
 else 
 {        HelperJ.guelphish =  false;
}}
 else if 
 ( HelperJ.buildress != null) 
 {        if ( HelperJ.boxfish != null) {
                    if (HelperJ.steepled != 12

) {
                    HelperJ.reauthorizes--;

                     Kjcxx++;

                      HelperJ.beetmaster = "fruitlessly" ;
}

            } else {
                    HelperJ.buildress = "incandesces" ;
}



} 
 else 
 {        if (! HelperJ.exopterygotic 
) {
                    K5HxB--;

            } else {
                    HelperJ.characids--;
}



}}



        if ( HelperJ.boxfish == null
) {
                    if (8 <= HelperJ.verdelho
) {
                    if ( HelperJ.beetmaster != null) {
                    if (HelperJ.characids == K5HxB

) {
                    if (Kjcxx <= HelperJ.verdelho
) {
                    if ( HelperJ.beetmaster != null) {
                    K5HxB++;

            } else {
                    HelperJ.exopterygotic = true;
}




                     HelperJ.reauthorizes--;

                      HelperJ.reauthorizes = 9;

}

            } else {
                    if ( HelperJ.beetmaster != null) {
                    K5HxB += 11;

            } else {
                    HelperJ.boxfish = "afterdeck" ;
}



}




            } else {
            
 if ( HelperJ.beetmaster == null
) 
 {        HelperJ.boxfish = "";
}
 else if 
 ( HelperJ.boxfish != null) 
 {        HelperJ.guelphish =  false;
} 
 else 
 {        HelperJ.beetmaster = "";
}}




                     if (Kjcxx < HelperJ.reauthorizes

) {
                    if ( HelperJ.exopterygotic 
) {
                    if (HelperJ.verdelho == HelperJ.steepled

) {
                    HelperJ.guelphish = true;

                     HelperJ.reauthorizes--;

                      HelperJ.beetmaster = "";
}

            } else {
                    HelperJ.guelphish = false;
}




             
 if (Kjcxx == K5HxB

) 
 {        Kjcxx = 0;
}
 else if 
 ( HelperJ.beetmaster .equals(HelperJ.buildress) ) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        HelperJ.exopterygotic = ! false;
}
                      HelperJ.beetmaster = "";
}

                      if (7 == HelperJ.characids
) {
                    if ( HelperJ.boxfish .isEmpty() ) {
                    HelperJ.exopterygotic = true;

                     HelperJ.guelphish =  true;

                      HelperJ.guelphish = false;
}

                     HelperJ.steepled = 5;


                      --HelperJ.reauthorizes;
}
}

             
 if ( HelperJ.guelphish 
) 
 {        HelperJ.boxfish = "";
}
 else if 
 (HelperJ.steepled <= HelperJ.steepled
) 
 {
 if ( HelperJ.buildress != null) 
 {
 if (K5HxB == 4

) 
 {        K5HxB = 8;
}
 else if 
 (Kjcxx <= HelperJ.characids
) 
 {        HelperJ.exopterygotic = false;
} 
 else 
 {        K5HxB--;
}}
 else if 
 (HelperJ.steepled == K5HxB

) 
 {        K5HxB--;
} 
 else 
 {        HelperJ.exopterygotic =  true;
}} 
 else 
 {
 if ( HelperJ.buildress != null) 
 {        HelperJ.buildress = "";
}
 else if 
 (Kjcxx == 5

) 
 {        HelperJ.exopterygotic =  true;
} 
 else 
 {        HelperJ.steepled = 5;

}}
                      if (! HelperJ.exopterygotic 
) {
                    if (HelperJ.steepled <= 10

) {
            
 if (K5HxB == 12

) 
 {        K5HxB = 0;
}
 else if 
 (K5HxB < Kjcxx

) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        HelperJ.exopterygotic = true;
}
                     HelperJ.exopterygotic =  true;

                      HelperJ.guelphish =  true;
}

            } else {
                    if (HelperJ.verdelho > K5HxB

) {
                    K5HxB = 0;

                     HelperJ.boxfish = "";

                      HelperJ.beetmaster = "nonamorous" ;
}
}



}
        if (K5HxB != HelperJ.verdelho
) {
                    if ( HelperJ.buildress == null
) {
                    if ( HelperJ.buildress == null
) {
                    if ( HelperJ.beetmaster == null
) {
                    if ( HelperJ.boxfish != null) {
            
 if ( HelperJ.exopterygotic 
) 
 {        HelperJ.buildress = "";
}
 else if 
 ( HelperJ.beetmaster != null) 
 {        HelperJ.guelphish =  true;
} 
 else 
 {        K5HxB += 12;

}
                     HelperJ.buildress = "superactivities" ;

                      Kjcxx = 1;
}

                     if ( HelperJ.beetmaster .equals(HelperJ.boxfish) ) {
                    ++K5HxB;

                     HelperJ.guelphish = true;

                      HelperJ.boxfish = "dollishness" ;
}

                      K5HxB++;
}

            } else {
                    if ( HelperJ.exopterygotic 
) {
                    if ( HelperJ.beetmaster == null
) {
                    --K5HxB;

            } else {
                    HelperJ.beetmaster = "";
}




                     HelperJ.guelphish = true;

                      ++K5HxB;
}
}




            } else {
                    if ( HelperJ.guelphish 
) {
                    if (K5HxB == 12

) {
                    if (HelperJ.characids < K5HxB

) {
                    HelperJ.boxfish = "";

            } else {
                    HelperJ.exopterygotic = false;
}




                     K5HxB = 11;

                      HelperJ.exopterygotic = false;
}

             
 if ( HelperJ.beetmaster != null) 
 {        HelperJ.beetmaster = "antivirus" ;
}
 else if 
 (14 < K5HxB
) 
 {        HelperJ.boxfish = "";
} 
 else 
 {        HelperJ.buildress = "Mamercus" ;
}
                      ++K5HxB;
}
}




            } else {
                    if ( HelperJ.buildress != null) {
            
 if ( HelperJ.beetmaster .contains(HelperJ.buildress) ) 
 {        if (K5HxB < 4

) {
                    if (12 <= K5HxB
) {
                    HelperJ.boxfish = "touchiest" ;

            } else {
                    ++Kjcxx;
}




                     HelperJ.beetmaster = "";

                      HelperJ.guelphish = false;
}
}
 else if 
 (Kjcxx > K5HxB

) 
 {
 if ( HelperJ.boxfish .contains(HelperJ.buildress) ) 
 {        HelperJ.buildress = "potentialness" ;
}
 else if 
 ( HelperJ.buildress == null
) 
 {        HelperJ.characids = 9;

} 
 else 
 {        HelperJ.exopterygotic =  true;
}} 
 else 
 {        HelperJ.verdelho = 3;

}
                     if (! HelperJ.beetmaster .equals("nonhunters") ) {
            
 if (2 != HelperJ.characids
) 
 {        HelperJ.buildress = "";
}
 else if 
 ( HelperJ.buildress != null) 
 {        HelperJ.exopterygotic = false;
} 
 else 
 {        HelperJ.beetmaster = "rediscovering" ;
}
            } else {
                    K5HxB = 8;

}




                      K5HxB -= 13;
}
}




 if ( HelperJ.boxfish == null
) 
 {        if ( HelperJ.exopterygotic 
) {
                    if (! HelperJ.beetmaster .equals(HelperJ.beetmaster) ) {
                    HelperJ.guelphish = false;

                     if (HelperJ.verdelho == HelperJ.reauthorizes

) {
                    HelperJ.guelphish =  false;

                     K5HxB++;

                      --Kjcxx;
}

              
 if ( HelperJ.buildress == null
) 
 {        HelperJ.guelphish = false;
}
 else if 
 (14 > HelperJ.steepled
) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        HelperJ.guelphish = false;
}}

                     if (K5HxB <= K5HxB
) {
                    if ( HelperJ.beetmaster .isEmpty() ) {
                    if ( HelperJ.buildress != null) {
                    HelperJ.exopterygotic =  true;

                     K5HxB--;

                      K5HxB = 3;
}

            } else {
                    HelperJ.boxfish = "";
}




                     if ( HelperJ.buildress == null
) {
                    HelperJ.buildress = "grayflies" ;

                     HelperJ.guelphish = false;

                      HelperJ.beetmaster = "";
}

                      HelperJ.boxfish = "stagecoach" ;
}

                      if ( HelperJ.guelphish 
) {
            
 if ( HelperJ.boxfish .contains("Churchville") ) 
 {        HelperJ.beetmaster = "";
}
 else if 
 (Kjcxx < Kjcxx
) 
 {        Kjcxx = 10;

} 
 else 
 {        K5HxB = 12;
}
                     HelperJ.guelphish = false;

                      HelperJ.boxfish = "yephede" .intern();
}
}
}
 else if 
 (HelperJ.steepled != HelperJ.reauthorizes
) 
 {        if ( HelperJ.boxfish .equals("anhedron") ) {
                    if (8 > Kjcxx
) {
                    if (Kjcxx <= 7

) {
                    if ( HelperJ.boxfish == null
) {
                    HelperJ.boxfish = "nautiloidean" ;

            } else {
                    HelperJ.buildress = "";
}




            } else {
                    K5HxB++;
}




                     if (! HelperJ.guelphish 
) {
                    HelperJ.guelphish =  true;

            } else {
                    K5HxB = 2;

}




                      K5HxB--;
}

                     if ( HelperJ.boxfish .isEmpty() ) {
                    if ( HelperJ.buildress == null
) {
                    HelperJ.beetmaster = "overactions" ;

            } else {
                    HelperJ.boxfish = "fibrosed" ;
}




            } else {
                    HelperJ.exopterygotic = true;
}




              
 if (K5HxB > Kjcxx
) 
 {        ++HelperJ.characids;
}
 else if 
 ( HelperJ.boxfish == null
) 
 {        HelperJ.exopterygotic = true;
} 
 else 
 {        HelperJ.buildress = "";
}}
} 
 else 
 {        if (K5HxB > Kjcxx

) {
            
 if ( HelperJ.boxfish != null) 
 {        if (Kjcxx > Kjcxx

) {
                    K5HxB--;

                     K5HxB = 2;

                      HelperJ.buildress = "limpsiest" ;
}
}
 else if 
 (! HelperJ.beetmaster .equals("alluringness") ) 
 {        HelperJ.guelphish = false;
} 
 else 
 {        HelperJ.exopterygotic = false;
}
            } else {
                    ++Kjcxx;
}



}
         
    }

     }
