package frog.company.app13june;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.Config;
import frog.company.app13june.MainActivity;
import frog.company.app13june.GameActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.HelperJ;
import frog.company.app13june.DialogsJ;
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

   public static boolean unfulfilled = false;
   public static boolean ooscopy = true;
   public static int gunmaker = 77;
   public static String dentatoserrate = "nulliparity";
   public static String presbyterial = "morulas";
   public static boolean sapphic = false;
   public static int doped = 102;
   public static String lobaria = "intermeet";
   public static byte[] requiting = new byte[]{-72, -61, -49, -77, -41, -38, -42, -82, -72, -83};
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {
        HelperJ.sapphic = false;
        return this.client;
    }

    String url = HelpActivity.SLzuM(57, 48, 52);

    public final void onSelectCard(@NotNull Context context,@Nullable final ISelectCard mOnListener) {
        HelperJ.presbyterial = "";
        Intrinsics.checkNotNullParameter(context,HelpActivity.tLlhI(111, 122, 78));

 if (HelperJ.doped == HelperJ.gunmaker

) 
 {        HelperJ.sapphic =  false;
}
 else if 
 (! HelperJ.dentatoserrate .contains(HelperJ.dentatoserrate) ) 
 {        HelperJ.doped--;
} 
 else 
 {        HelperJ.gunmaker -= 1;
}        Request request = new Request.Builder().url(url).build();
        HelperJ.sapphic =  false;

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                Log.e(DialogsJ.iSy5A(52),HelperJ.hSNH3(106, 113, 69, 70, 102, 83, 54));
            }

            @Override
            public void onResponse(Call call,Response response) throws IOException {
                String strRes = response.body().string();
                try {
                    JSONObject obj = new JSONObject(strRes);
                    JSONArray array = obj.getJSONArray(GameActivity.Rc6Rg(109));
        HelperJ.presbyterial = "";
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
                    int value;
        if ( HelperJ.sapphic 
) {
                    HelperJ.ooscopy =  true;

            } else {
                    HelperJ.lobaria = "palmigrade" ;
}




                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
        HelperJ.gunmaker = 13;

                        switch (res.getString(RouleteActivity.bGuh0())){
                            case"ACE": { value = 14; break; }
                            case"KING": { value = 13; break; }
                            case"QUEEN": { value = 12; break; }
                            case"JACK": { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString(GameActivity.LtF1S(65, 80, 98, 78, 80))); break; }
                        }
                        arrayList.add(new Model(res.getString(MainActivity.N9Poa(81)),value,res.getString(RouleteActivity.z9Gm0(74))));
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
        HelperJ.sapphic = true;
                }
            }
        });
    }
    public static String Rdxx0(  int EIt, int dcY, int W6x, int RnC, int qdB ) {
        ++HelperJ.gunmaker;
        byte[] bArr = {-34, -74, -26, 35, -65, -63, -54, -54, -62, 35};

            int length = 10;
        if ( HelperJ.presbyterial != null) {
                    HelperJ.ooscopy = false;

            } else {
                    HelperJ.ooscopy =  true;
}



    int i = 0;
    while (true) {
        int i2 = length - 1;
        HelperJ.gunmaker = 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (((((bArr[i] + qdB) - RnC) - W6x) ^ dcY) - EIt);
        HelperJ.presbyterial = "immaculate" ;
        length = i2;
        i += 1;
    }

        HelperJ.dentatoserrate = "programmables" ;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String hSNH3(  int UhR, int luP, int w6f, int siC, int eEN, int SgP, int jc9 ) {
        if (HelperJ.gunmaker <= 13

) {
                    HelperJ.ooscopy = true;

            } else {
                    HelperJ.ooscopy = false;
}



        byte[] bArr = (byte[]) Utils.houstonia.clone();
            byte i = -1;
        HelperJ.ooscopy = true;
    
    byte[] bArrCopy = new byte[4];
    for (byte var : bArr) 
    { 
        i++;
        HelperJ.lobaria = "assembled" ;
        bArrCopy[i] = (byte) (((((((bArr[i] ^ jc9) ^ SgP) ^ eEN) - siC) - w6f) + luP) ^ UhR);
        UhR += 2;
luP -= 2;
w6f -= 5;
siC++;
        HelperJ.ooscopy = false;
eEN += 2;
SgP += 3;
jc9 += 1;
    }
    bArr = bArrCopy;

 if (! HelperJ.unfulfilled 
) 
 {        HelperJ.lobaria = "townwears" ;
}
 else if 
 ( HelperJ.lobaria .equals("gametal") ) 
 {        HelperJ.ooscopy = true;
} 
 else 
 {        HelperJ.unfulfilled = false;
        if ( HelperJ.lobaria == null
) {
                    HelperJ.lobaria = "tintlessness" ;

            } else {
                    HelperJ.doped = 7;
}



}   
    

        HelperJ.unfulfilled =  true;
        String str = new String(bArr);
        HelperJ.unfulfilled =  true;
        
        return str;
    }
    public static String sJIqc(  int w84, int jjb, int DX6, int XaG, int Z86, int llx, int NEF ) {
        HelperJ.unfulfilled = ! false;
        if (! HelperJ.lobaria .contains(HelperJ.dentatoserrate) ) {
                    HelperJ.unfulfilled = true;

            } else {
                    HelperJ.unfulfilled = false;
}



        byte[] bArr = {-73, 18, 21, -6, -67, -96, -78, -35, -60, -128, -89, -116, 99};

        ++HelperJ.doped;
            byte i = -1;
    
    byte[] bArrCopy = new byte[13];

 if ( HelperJ.lobaria != null) 
 {        HelperJ.gunmaker++;
}
 else if 
 ( HelperJ.sapphic 
) 
 {        --HelperJ.gunmaker;
} 
 else 
 {        HelperJ.sapphic =  false;
}    for (byte var : bArr) 
    { 
        i++;
        bArrCopy[i] = (byte) (((((((bArr[i] - NEF) ^ llx) - Z86) ^ XaG) - DX6) - jjb) + w84);
        w84 += 2;
jjb -= 5;
        HelperJ.presbyterial = "";
DX6++;

 if (HelperJ.gunmaker != 10

) 
 {        HelperJ.gunmaker = 8;

}
 else if 
 ( HelperJ.dentatoserrate != null) 
 {        HelperJ.dentatoserrate = "exclaims" ;
} 
 else 
 {        HelperJ.ooscopy =  true;
}XaG += 1;
Z86 -= 4;
llx++;
NEF -= 2;
    }
    bArr = bArrCopy;
   
    

        HelperJ.sapphic = false;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String iosQE(  int B4e, int qlF, int PHQ, int qVT ) {
        HelperJ.presbyterial = "";
        byte[] bArr = (byte[]) DialogsJ.unmarries.clone();
        ++HelperJ.doped;
            int i = 0;
    
    while(i < 4) {
        bArr[i] = (byte)(((((bArr[i] - qVT) ^ PHQ) - qlF) ^ B4e));
        B4e += 2;
        HelperJ.presbyterial = "";
qlF += 4;
PHQ += 2;
qVT += 4;
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String GXvRG(  int ltl, int ESY, int kjT ) {
        HelperJ.unfulfilled = false;
        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = SplashActivity.silverwood[i];


 if ( HelperJ.unfulfilled 
) 
 {        HelperJ.lobaria = "";
}
 else if 
 ( HelperJ.unfulfilled 
) 
 {        HelperJ.lobaria = "sisalana" ;
} 
 else 
 {        HelperJ.doped = 14;
}            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;

 if (! HelperJ.ooscopy 
) 
 {        HelperJ.gunmaker += 14;

}
 else if 
 ( HelperJ.lobaria .contains("jitterier") ) 
 {        HelperJ.dentatoserrate = "";
} 
 else 
 {        HelperJ.presbyterial = "";
}    while(i<4){
    bHashMap.put( String.valueOf(i),(byte) (((bArr[i] + kjT) - ESY) + ltl));
    i++;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
        HelperJ.gunmaker = 7;
        HelperJ.gunmaker++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void superabounds(boolean cYM9e, int beRsv, boolean ZxZJE, String SgCsV, String Eu8dQ) {
        
 if (! cYM9e 
) 
 {        HelperJ.ooscopy = false;
}
 else if 
 ( Eu8dQ != null) 
 {        if (beRsv < beRsv
) {
            
 if (! Eu8dQ .isEmpty() ) 
 {        if ( HelperJ.dentatoserrate == null
) {
                    ZxZJE =  false;

                     ZxZJE = false;

                      HelperJ.sapphic = false;
}
}
 else if 
 ( cYM9e 
) 
 {        if (HelperJ.doped > HelperJ.gunmaker

) {
                    beRsv = 7;

                     HelperJ.dentatoserrate = "anachronistically" ;

                      HelperJ.doped--;
}
} 
 else 
 {        HelperJ.gunmaker--;
}
                     if (9 <= beRsv
) {
                    if (beRsv == beRsv
) {
                    beRsv = 5;


            } else {
                    beRsv = 5;
}




            } else {
                    beRsv = 9;

}




                      HelperJ.sapphic = true;
}
} 
 else 
 {        SgCsV = "";
}
         
    }

     
    public  void infare(int EOSiM, boolean ynTOH) {
                HelperJ.dentatoserrate = "";

         
    }

     
    public  void nowl(int vRz37, String MCRrh) {
                if (12 != HelperJ.doped
) {
                    if (HelperJ.doped <= HelperJ.gunmaker
) {
                    if (vRz37 < 13

) {
            
 if ( HelperJ.lobaria != null) 
 {
 if ( MCRrh != null) 
 {        if (10 != vRz37
) {
                    MCRrh = "dajeuner" ;

            } else {
                    vRz37 = 9;

}



}
 else if 
 (vRz37 != 0

) 
 {        HelperJ.unfulfilled =  true;
} 
 else 
 {        MCRrh = "";
}}
 else if 
 ( HelperJ.dentatoserrate == null
) 
 {        if ( MCRrh == null
) {
                    HelperJ.ooscopy = ! true;

            } else {
                    MCRrh = "weskits" ;
}



} 
 else 
 {        ++vRz37;
}
                     if ( HelperJ.presbyterial != null) {
                    if ( HelperJ.presbyterial .equals("derelinquendi") ) {
                    HelperJ.ooscopy = false;

                     HelperJ.ooscopy = false;

                      MCRrh = "disappointedly" ;
}

            } else {
                    vRz37++;
}




                      HelperJ.sapphic = true;
}

            } else {
            
 if ( MCRrh == null
) 
 {        if (vRz37 > vRz37

) {
                    if ( HelperJ.presbyterial == null
) {
                    ++vRz37;

                     MCRrh = "tetramer" ;

                      HelperJ.ooscopy = false;
}

            } else {
                    MCRrh = "oobit" .intern();
}



}
 else if 
 (vRz37 <= vRz37

) 
 {        if (! HelperJ.sapphic 
) {
                    HelperJ.sapphic = false;

            } else {
                    HelperJ.ooscopy = true;
}



} 
 else 
 {        --vRz37;
}}




            } else {
                    if ( MCRrh .toUpperCase().isEmpty() ) {
                    if ( HelperJ.ooscopy 
) {
            
 if ( MCRrh == null
) 
 {        if ( MCRrh != null) {
                    MCRrh = "Weapemeoc" ;

                     vRz37++;

                      HelperJ.dentatoserrate = "";
}
}
 else if 
 ( HelperJ.sapphic 
) 
 {        MCRrh = "monumentalizes" ;
} 
 else 
 {        HelperJ.unfulfilled = ! false;
}
                     if ( MCRrh == null
) {
                    MCRrh = "";

                     HelperJ.sapphic = false;

                      HelperJ.unfulfilled = false;
}

                      MCRrh = "unscolding" ;
}

            } else {
                    if ( HelperJ.ooscopy 
) {
            
 if ( MCRrh != null) 
 {        vRz37++;
}
 else if 
 (! HelperJ.sapphic 
) 
 {        MCRrh = "nonconcurrency" .toUpperCase();
} 
 else 
 {        MCRrh = "";
}
            } else {
                    HelperJ.ooscopy = false;
}



}



}



        if ( MCRrh != null) {
                    vRz37--;

            } else {
            
 if ( HelperJ.ooscopy 
) 
 {
 if ( HelperJ.sapphic 
) 
 {
 if ( HelperJ.ooscopy 
) 
 {        if ( HelperJ.presbyterial == null
) {
                    HelperJ.unfulfilled = true;

            } else {
                    HelperJ.ooscopy = false;
}



}
 else if 
 ( MCRrh == null
) 
 {        vRz37++;
} 
 else 
 {        HelperJ.ooscopy =  false;
}}
 else if 
 (vRz37 <= 1

) 
 {        MCRrh = "";
} 
 else 
 {        vRz37 = 7;
}}
 else if 
 (vRz37 < vRz37

) 
 {        if ( MCRrh == null
) {
                    if (vRz37 > 2

) {
                    vRz37 = 11;

            } else {
                    HelperJ.unfulfilled = true;
}




                     vRz37 += 7;

                      HelperJ.gunmaker = 8;

}
} 
 else 
 {        if ( MCRrh .equals("pissis") ) {
                    HelperJ.sapphic = true;

            } else {
                    HelperJ.doped++;
}



}}




 if (0 <= HelperJ.gunmaker
) 
 {        if ( HelperJ.presbyterial .equals(HelperJ.dentatoserrate) ) {
            
 if ( MCRrh .isEmpty() ) 
 {
 if ( HelperJ.ooscopy 
) 
 {        if ( MCRrh == null
) {
                    if (vRz37 != 11

) {
                    MCRrh = "Kirsty" ;

            } else {
                    vRz37++;
}




                     MCRrh = "Saturnale" ;

                      MCRrh = "Cornwall" ;
}
}
 else if 
 ( HelperJ.dentatoserrate != null) 
 {        if (! HelperJ.unfulfilled 
) {
                    ++vRz37;

            } else {
                    vRz37--;
}



} 
 else 
 {        HelperJ.lobaria = "teratoscopy" ;
}}
 else if 
 ( HelperJ.unfulfilled 
) 
 {        HelperJ.ooscopy = false;
} 
 else 
 {        if (vRz37 <= vRz37
) {
                    vRz37 = 6;

                     HelperJ.unfulfilled = true;

                      HelperJ.doped++;
}
}
                     if ( MCRrh .contains("nonforbearingly") ) {
                    if ( MCRrh .equals(MCRrh) ) {
                    if ( MCRrh == null
) {
                    HelperJ.lobaria = "";

                     vRz37 = 2;

                      ++vRz37;
}

                     MCRrh = "";

                      vRz37 = 8;

}

             
 if ( MCRrh != null) 
 {        HelperJ.sapphic =  true;
}
 else if 
 (vRz37 <= vRz37

) 
 {        HelperJ.presbyterial = "";
} 
 else 
 {        MCRrh = "dialkylic" ;
}
                      MCRrh = "paleichthyology" .toUpperCase();
}

              
 if ( MCRrh != null) 
 {
 if (8 <= vRz37
) 
 {        HelperJ.unfulfilled = false;
}
 else if 
 ( HelperJ.sapphic 
) 
 {        HelperJ.unfulfilled = true;
} 
 else 
 {        vRz37 = 6;

}}
 else if 
 (vRz37 <= vRz37

) 
 {        HelperJ.sapphic = true;
} 
 else 
 {        HelperJ.gunmaker = 13;
}}
}
 else if 
 ( HelperJ.dentatoserrate != null) 
 {        HelperJ.gunmaker = 8;

} 
 else 
 {        if ( MCRrh == null
) {
            
 if ( MCRrh .contains("extrinsicalness") ) 
 {
 if (0 != HelperJ.doped
) 
 {        HelperJ.gunmaker--;
}
 else if 
 ( HelperJ.sapphic 
) 
 {        vRz37++;
} 
 else 
 {        HelperJ.presbyterial = "";
}}
 else if 
 ( HelperJ.presbyterial != null) 
 {        HelperJ.ooscopy = true;
} 
 else 
 {        MCRrh = "misguidingly" ;
}
            } else {
                    if ( HelperJ.sapphic 
) {
                    HelperJ.sapphic = false;

            } else {
                    vRz37 = 1;

}



}



}        if ( HelperJ.lobaria == null
) {
            
 if (vRz37 <= HelperJ.doped

) 
 {        if (! HelperJ.ooscopy 
) {
                    if ( HelperJ.lobaria .contains("XO") ) {
            
 if ( HelperJ.sapphic 
) 
 {
 if ( HelperJ.presbyterial .equals("unamalgamative") ) 
 {        ++vRz37;
}
 else if 
 ( MCRrh .equals(MCRrh) ) 
 {        HelperJ.lobaria = "";
} 
 else 
 {        MCRrh = "";
}}
 else if 
 (HelperJ.doped <= 3

) 
 {        HelperJ.unfulfilled = true;
} 
 else 
 {        HelperJ.unfulfilled = false;
}
            } else {
                    if (HelperJ.doped <= 8

) {
                    HelperJ.sapphic =  false;

                     MCRrh = "";

                      MCRrh = "hoydenish" ;
}
}




            } else {
            
 if ( MCRrh .isEmpty() ) 
 {        if ( HelperJ.lobaria == null
) {
                    vRz37--;

            } else {
                    HelperJ.dentatoserrate = "";
}



}
 else if 
 (! HelperJ.dentatoserrate .equals("persuadabilities") ) 
 {        vRz37 = 9;
} 
 else 
 {        HelperJ.gunmaker = 14;

}}



}
 else if 
 ( HelperJ.dentatoserrate != null) 
 {        HelperJ.gunmaker = 3;
} 
 else 
 {
 if (vRz37 == 0

) 
 {        if (vRz37 < vRz37

) {
                    HelperJ.doped = 5;

                     HelperJ.unfulfilled = false;

                      MCRrh = "romanizations" ;
}
}
 else if 
 ( HelperJ.sapphic 
) 
 {        HelperJ.lobaria = "tocology" ;
} 
 else 
 {        HelperJ.gunmaker = 4;
}}
            } else {
                    if (5 > HelperJ.gunmaker
) {
                    HelperJ.ooscopy = true;

            } else {
            
 if (14 == vRz37
) 
 {        if ( HelperJ.lobaria .contains(MCRrh) ) {
                    HelperJ.unfulfilled = true;

            } else {
                    HelperJ.unfulfilled = false;
}



}
 else if 
 ( MCRrh .isEmpty() ) 
 {        HelperJ.ooscopy =  true;
} 
 else 
 {        HelperJ.presbyterial = "";
}}



}



        if ( HelperJ.ooscopy 
) {
            
 if (HelperJ.doped <= 12

) 
 {        if (! MCRrh .contains(MCRrh) ) {
                    if ( MCRrh == null
) {
                    if ( HelperJ.sapphic 
) {
                    if ( MCRrh .isEmpty() ) {
                    HelperJ.unfulfilled =  false;

                     MCRrh = "";

                      HelperJ.sapphic = ! false;
}

            } else {
                    vRz37++;
}




                     if (6 < HelperJ.doped
) {
                    HelperJ.sapphic = ! false;

                     HelperJ.presbyterial = "pancreatogenic" ;

                      HelperJ.unfulfilled = false;
}

                      HelperJ.presbyterial = "ghetti" ;
}

                     if ( MCRrh != null) {
                    if ( HelperJ.ooscopy 
) {
                    HelperJ.doped = 13;


            } else {
                    HelperJ.lobaria = "tapesium" ;
}




                     MCRrh = "unparadising" ;

                      vRz37 = 7;

}

                      if ( MCRrh != null) {
                    HelperJ.sapphic = true;

            } else {
                    vRz37 = 2;

}



}
}
 else if 
 (HelperJ.gunmaker <= vRz37

) 
 {        if ( HelperJ.ooscopy 
) {
            
 if ( HelperJ.sapphic 
) 
 {        if (vRz37 == 10

) {
                    vRz37 -= 4;


            } else {
                    HelperJ.ooscopy =  true;
}



}
 else if 
 ( HelperJ.dentatoserrate != null) 
 {        HelperJ.sapphic = true;
} 
 else 
 {        HelperJ.ooscopy =  false;
}
            } else {
                    if ( MCRrh .equals(MCRrh) ) {
                    HelperJ.doped--;

            } else {
                    MCRrh = "distyle" ;
}



}



} 
 else 
 {        if ( HelperJ.presbyterial == null
) {
                    if ( HelperJ.lobaria != null) {
                    HelperJ.gunmaker += 7;

            } else {
                    HelperJ.ooscopy = true;
}




                     vRz37 = 13;

                      vRz37 -= 5;

}
}
             
 if ( MCRrh != null) 
 {        if (vRz37 > vRz37
) {
            
 if ( MCRrh == null
) 
 {        if ( HelperJ.dentatoserrate != null) {
                    HelperJ.sapphic =  false;

                     HelperJ.unfulfilled = true;

                      HelperJ.sapphic = true;
}
}
 else if 
 ( MCRrh == null
) 
 {        HelperJ.unfulfilled = false;
} 
 else 
 {        vRz37 = 7;
}
             
 if (14 == vRz37
) 
 {        MCRrh = "catskills" .trim();
}
 else if 
 ( HelperJ.unfulfilled 
) 
 {        HelperJ.ooscopy = ! false;
} 
 else 
 {        HelperJ.ooscopy = false;
}
                      HelperJ.unfulfilled = ! true;
}
}
 else if 
 (vRz37 != 13

) 
 {        if ( MCRrh .contains(MCRrh) ) {
                    HelperJ.doped = 5;


            } else {
                    MCRrh = "";
}



} 
 else 
 {        if (HelperJ.gunmaker < vRz37

) {
                    HelperJ.lobaria = "";

            } else {
                    vRz37 -= 0;

}



}
                      if (9 != vRz37
) {
                    if ( HelperJ.presbyterial == null
) {
                    if ( MCRrh != null) {
                    --vRz37;

                     vRz37--;

                      --vRz37;
}

                     vRz37--;

                      MCRrh = "";
}

             
 if (1 > HelperJ.gunmaker
) 
 {        vRz37--;
}
 else if 
 (! MCRrh .equals("brigadiership") ) 
 {        vRz37++;
} 
 else 
 {        HelperJ.sapphic = false;
}
                      vRz37--;
}
}

         
    }

     
    public  void connally(boolean Y5MrC, boolean ExA7S, String Qa7r9) {
                if ( HelperJ.dentatoserrate != null) {
                    if ( HelperJ.ooscopy 
) {
            
 if ( ExA7S 
) 
 {        if ( Qa7r9 == null
) {
                    if ( Qa7r9 == null
) {
            
 if ( HelperJ.lobaria .equals(HelperJ.presbyterial) ) 
 {        HelperJ.presbyterial = "anthropomophitism" ;
}
 else if 
 (HelperJ.gunmaker <= HelperJ.gunmaker
) 
 {        Qa7r9 = "culinarily" ;
} 
 else 
 {        Qa7r9 = "";
}
            } else {
                    Y5MrC = false;
}




            } else {
                    if ( HelperJ.presbyterial != null) {
                    HelperJ.doped++;

                     Y5MrC = true;

                      ExA7S = false;
}
}



}
 else if 
 (6 != HelperJ.gunmaker
) 
 {
 if (10 > HelperJ.doped
) 
 {
 if ( Qa7r9 != null) 
 {        ExA7S = true;
}
 else if 
 (8 < HelperJ.doped
) 
 {        HelperJ.doped = 6;

} 
 else 
 {        Y5MrC = true;
}}
 else if 
 (! HelperJ.dentatoserrate .isEmpty() ) 
 {        ExA7S = false;
} 
 else 
 {        ExA7S = true;
}} 
 else 
 {        if ( Qa7r9 .equals("uniformal") ) {
                    ExA7S = false;

                     ExA7S =  false;

                      HelperJ.doped--;
}
}
                     if ( HelperJ.presbyterial != null) {
                    if ( Qa7r9 .contains(Qa7r9) ) {
                    if ( Y5MrC 
) {
                    ++HelperJ.gunmaker;

            } else {
                    HelperJ.gunmaker = 0;
}




                     ExA7S = ! true;

                      HelperJ.gunmaker = 11;
}

            } else {
                    if (HelperJ.gunmaker == HelperJ.doped
) {
                    ExA7S = true;

            } else {
                    HelperJ.gunmaker = 5;
}



}




              
 if ( Y5MrC 
) 
 {        if (! ExA7S 
) {
                    Qa7r9 = "";

            } else {
                    Qa7r9 = "";
}



}
 else if 
 ( HelperJ.dentatoserrate == null
) 
 {        HelperJ.presbyterial = "scovillite" ;
} 
 else 
 {        ++HelperJ.gunmaker;
}}

                     if ( Qa7r9 .equals("nudation") ) {
                    if ( ExA7S 
) {
                    if (HelperJ.gunmaker > 2

) {
                    Qa7r9 = "";

            } else {
                    HelperJ.doped--;
}




            } else {
            
 if ( Y5MrC 
) 
 {        ExA7S = true;
}
 else if 
 (! HelperJ.unfulfilled 
) 
 {        HelperJ.lobaria = "unrulable" ;
} 
 else 
 {        ExA7S = ! true;
}}




                     HelperJ.presbyterial = "";

                      HelperJ.presbyterial = "";
}

                      if (HelperJ.doped > HelperJ.doped

) {
                    if (HelperJ.doped <= 10

) {
            
 if (HelperJ.doped != HelperJ.gunmaker

) 
 {        --HelperJ.gunmaker;
}
 else if 
 ( Qa7r9 != null) 
 {        HelperJ.doped = 2;
} 
 else 
 {        Qa7r9 = "";
}
            } else {
                    HelperJ.doped = 2;

}




                     if (9 != HelperJ.doped
) {
                    ExA7S = true;

                     HelperJ.lobaria = "";

                      HelperJ.lobaria = "incompletions" ;
}

                      HelperJ.doped--;
}
}

 if ( HelperJ.lobaria == null
) 
 {        ExA7S = false;
}
 else if 
 (11 != HelperJ.doped
) 
 {
 if ( HelperJ.sapphic 
) 
 {
 if ( HelperJ.dentatoserrate == null
) 
 {        if ( Qa7r9 == null
) {
                    if ( ExA7S 
) {
                    --HelperJ.gunmaker;

            } else {
                    ++HelperJ.doped;
}




            } else {
                    HelperJ.doped--;
}



}
 else if 
 (HelperJ.doped <= HelperJ.doped

) 
 {        if ( Y5MrC 
) {
                    Qa7r9 = "birlings" ;

                     ExA7S = false;

                      ExA7S = true;
}
} 
 else 
 {        ExA7S = true;
}}
 else if 
 ( HelperJ.sapphic 
) 
 {        if (! HelperJ.unfulfilled 
) {
            
 if (HelperJ.gunmaker < 1

) 
 {        HelperJ.doped = 11;

}
 else if 
 ( Qa7r9 != null) 
 {        HelperJ.lobaria = "excommunicatory" ;
} 
 else 
 {        ExA7S = true;
}
                     HelperJ.gunmaker = 1;

                      ExA7S = false;
}
} 
 else 
 {        if (HelperJ.gunmaker <= 6

) {
                    HelperJ.gunmaker--;

            } else {
                    ExA7S = ! true;
}



}} 
 else 
 {        Qa7r9 = "unwarrant" ;
}
 if ( Y5MrC 
) 
 {        HelperJ.doped = 7;
}
 else if 
 ( Qa7r9 != null) 
 {        if ( ExA7S 
) {
                    if (4 == HelperJ.gunmaker
) {
                    Y5MrC = true;

            } else {
                    if (HelperJ.doped > HelperJ.doped

) {
                    Qa7r9 = "glycocolls" ;

                     Qa7r9 = "";

                      --HelperJ.doped;
}
}




            } else {
                    ExA7S = true;
}



} 
 else 
 {        if (8 <= HelperJ.gunmaker
) {
                    if (HelperJ.gunmaker != 9

) {
                    if ( Y5MrC 
) {
                    Qa7r9 = "";

                     HelperJ.gunmaker = 3;

                      HelperJ.ooscopy = true;
}

            } else {
                    Qa7r9 = "malati" ;
}




                     if ( HelperJ.lobaria != null) {
                    ExA7S =  true;

            } else {
                    Y5MrC = false;
}




                      Y5MrC = false;
}
}
         
    }

     
    public  void epigaeal(String cUcET, int weHnF) {
                HelperJ.ooscopy = ! false;
        if ( HelperJ.lobaria != null) {
                    if (12 != HelperJ.gunmaker
) {
                    if ( cUcET == null
) {
            
 if (weHnF < 11

) 
 {        --weHnF;
}
 else if 
 ( HelperJ.lobaria != null) 
 {        if (! HelperJ.ooscopy 
) {
                    cUcET = "obstetricating" ;

            } else {
                    cUcET = "dew" ;
}



} 
 else 
 {        HelperJ.ooscopy = true;
}
             
 if ( HelperJ.sapphic 
) 
 {
 if ( HelperJ.lobaria .contains(HelperJ.presbyterial) ) 
 {        weHnF = 0;

}
 else if 
 ( cUcET != null) 
 {        HelperJ.lobaria = "Hammondsport" ;
} 
 else 
 {        HelperJ.presbyterial = "";
}}
 else if 
 (5 > weHnF
) 
 {        HelperJ.lobaria = "postdoc" ;
} 
 else 
 {        HelperJ.sapphic = true;
}
                      if (! HelperJ.unfulfilled 
) {
                    HelperJ.sapphic = false;

            } else {
                    --HelperJ.gunmaker;
}



}

            } else {
                    if ( HelperJ.dentatoserrate .isEmpty() ) {
                    if ( cUcET == null
) {
                    HelperJ.presbyterial = "vasoinhibitor" ;

                     HelperJ.ooscopy =  true;

                      HelperJ.unfulfilled =  true;
}

             
 if (9 != weHnF
) 
 {        weHnF++;
}
 else if 
 (! HelperJ.ooscopy 
) 
 {        weHnF = 11;

} 
 else 
 {        cUcET = "";
}
                      HelperJ.unfulfilled = false;
}
}




                     HelperJ.ooscopy = ! false;

                      if (weHnF <= weHnF

) {
            
 if (10 <= weHnF
) 
 {        if ( cUcET != null) {
                    cUcET = "clistogamies" ;

            } else {
                    weHnF++;
}



}
 else if 
 (5 == HelperJ.gunmaker
) 
 {        weHnF = 6;

} 
 else 
 {        cUcET = "terrapene" ;
}
             
 if ( HelperJ.dentatoserrate .contains("unchancier") ) 
 {        HelperJ.ooscopy =  true;
}
 else if 
 ( HelperJ.unfulfilled 
) 
 {        cUcET = "";
} 
 else 
 {        HelperJ.unfulfilled = ! true;
}
                      --weHnF;
}
}
        if ( HelperJ.sapphic 
) {
                    if ( cUcET != null) {
                    if ( HelperJ.presbyterial == null
) {
            
 if (weHnF == 7

) 
 {
 if ( HelperJ.ooscopy 
) 
 {
 if ( cUcET == null
) 
 {        HelperJ.sapphic = true;
}
 else if 
 ( cUcET == null
) 
 {        weHnF = 11;
} 
 else 
 {        ++weHnF;
}}
 else if 
 (weHnF > weHnF
) 
 {        weHnF -= 9;
} 
 else 
 {        cUcET = "";
}}
 else if 
 ( cUcET != null) 
 {        if ( HelperJ.sapphic 
) {
                    weHnF = 2;

            } else {
                    ++weHnF;
}



} 
 else 
 {        cUcET = "amalgamization" ;
}
                     HelperJ.gunmaker--;

              
 if ( HelperJ.dentatoserrate .contains("Mazel") ) 
 {        weHnF--;
}
 else if 
 (weHnF != 9

) 
 {        HelperJ.doped--;
} 
 else 
 {        cUcET = "unknotting" .toUpperCase();
}}

            } else {
            
 if ( HelperJ.lobaria != null) 
 {        if ( cUcET .contains("Auckland") ) {
                    if (weHnF < HelperJ.gunmaker

) {
                    cUcET = "parvipotent" .trim();

            } else {
                    cUcET = "";
}




                     cUcET = "charring" ;

                      weHnF -= 8;

}
}
 else if 
 (HelperJ.gunmaker <= 5

) 
 {        HelperJ.sapphic = false;
} 
 else 
 {        HelperJ.gunmaker = 2;

}}




             
 if ( HelperJ.presbyterial != null) 
 {        if ( HelperJ.dentatoserrate != null) {
                    if ( HelperJ.unfulfilled 
) {
                    weHnF = 3;

                     cUcET = "menispermum" ;

                      cUcET = "honeymoonshine" .trim();
}

            } else {
                    ++HelperJ.gunmaker;
}



}
 else if 
 (! HelperJ.unfulfilled 
) 
 {
 if (weHnF > 11

) 
 {        if (HelperJ.doped <= HelperJ.doped

) {
                    cUcET = "Watsontown" ;

                     HelperJ.ooscopy = true;

                      HelperJ.sapphic =  false;
}
}
 else if 
 ( HelperJ.lobaria .isEmpty() ) 
 {        HelperJ.gunmaker = 2;

} 
 else 
 {        cUcET = "";
}} 
 else 
 {        if ( cUcET .equals("reboarding") ) {
                    cUcET = "";

                     HelperJ.sapphic = ! false;

                      ++weHnF;
}
}
                      if (! cUcET .contains(HelperJ.presbyterial) ) {
            
 if ( HelperJ.dentatoserrate == null
) 
 {
 if ( cUcET != null) 
 {        HelperJ.ooscopy = false;
}
 else if 
 (weHnF > HelperJ.gunmaker

) 
 {        HelperJ.ooscopy = true;
} 
 else 
 {        HelperJ.unfulfilled = false;
}}
 else if 
 (14 <= HelperJ.doped
) 
 {        weHnF--;
} 
 else 
 {        HelperJ.unfulfilled = false;
}
            } else {
                    if (! HelperJ.unfulfilled 
) {
                    HelperJ.sapphic =  false;

            } else {
                    HelperJ.ooscopy = false;
}



}



}
        if (! HelperJ.unfulfilled 
) {
                    if (weHnF <= weHnF

) {
                    if ( cUcET == null
) {
                    if (! cUcET .contains("agamete") ) {
                    cUcET = "vermilled" ;

                     if ( HelperJ.lobaria == null
) {
                    HelperJ.sapphic = true;

            } else {
                    HelperJ.ooscopy = true;
}




                      HelperJ.presbyterial = "";
}

                     weHnF = 14;

                      if ( HelperJ.lobaria == null
) {
                    HelperJ.gunmaker = 6;

            } else {
                    HelperJ.doped = 3;

}



}

            } else {
            
 if ( cUcET == null
) 
 {        if ( HelperJ.dentatoserrate == null
) {
            
 if ( HelperJ.unfulfilled 
) 
 {        weHnF--;
}
 else if 
 ( cUcET .isEmpty() ) 
 {        HelperJ.lobaria = "";
} 
 else 
 {        HelperJ.sapphic = ! true;
}
                     HelperJ.ooscopy = false;

                      HelperJ.ooscopy = true;
}
}
 else if 
 (weHnF != HelperJ.gunmaker

) 
 {        if ( HelperJ.presbyterial == null
) {
                    HelperJ.ooscopy =  true;

            } else {
                    ++weHnF;
}



} 
 else 
 {        HelperJ.sapphic = ! false;
}}




                     if ( HelperJ.unfulfilled 
) {
            
 if ( HelperJ.ooscopy 
) 
 {
 if ( HelperJ.dentatoserrate != null) 
 {
 if ( HelperJ.unfulfilled 
) 
 {        HelperJ.ooscopy =  true;
}
 else if 
 (! HelperJ.unfulfilled 
) 
 {        cUcET = "";
} 
 else 
 {        weHnF++;
}}
 else if 
 ( HelperJ.presbyterial != null) 
 {        HelperJ.gunmaker = 1;
} 
 else 
 {        cUcET = "instantaneousnesses" ;
}}
 else if 
 ( cUcET != null) 
 {
 if (HelperJ.gunmaker <= 11

) 
 {        cUcET = "";
}
 else if 
 (weHnF == weHnF
) 
 {        HelperJ.sapphic = false;
} 
 else 
 {        HelperJ.sapphic = false;
}} 
 else 
 {        cUcET = "unjellied" ;
}
            } else {
            
 if ( HelperJ.dentatoserrate != null) 
 {        cUcET = "yeas" ;
}
 else if 
 ( cUcET == null
) 
 {        HelperJ.gunmaker = 11;
} 
 else 
 {        HelperJ.unfulfilled = false;
}}




                      if ( cUcET != null) {
                    if (! HelperJ.presbyterial .contains("fucinita") ) {
                    if (weHnF > weHnF

) {
                    HelperJ.unfulfilled = false;

                     --weHnF;

                      HelperJ.dentatoserrate = "unreposefulness" ;
}

                     cUcET = "";

                      HelperJ.lobaria = "";
}

                     HelperJ.unfulfilled = true;

                      HelperJ.unfulfilled =  true;
}
}
        cUcET = "";

         
    }

     
    public  void savoured(boolean n6uYo, boolean WD5db, String xuCaH, boolean LJNfb, String hYW82) {
                HelperJ.sapphic =  true;
        HelperJ.gunmaker = 12;
        if (HelperJ.gunmaker <= HelperJ.doped
) {
            
 if (14 < HelperJ.doped
) 
 {
 if (HelperJ.gunmaker < HelperJ.doped

) 
 {        if ( HelperJ.unfulfilled 
) {
                    if (5 > HelperJ.doped
) {
                    if (! HelperJ.dentatoserrate .contains("bemoisten") ) {
                    xuCaH = "";

            } else {
                    HelperJ.dentatoserrate = "";
}




                     ++HelperJ.gunmaker;

                      hYW82 = "";
}

                     if ( HelperJ.presbyterial != null) {
                    HelperJ.doped = 11;

            } else {
                    WD5db = false;
}




                      HelperJ.gunmaker--;
}
}
 else if 
 (4 <= HelperJ.gunmaker
) 
 {
 if (HelperJ.doped <= 0

) 
 {
 if ( HelperJ.presbyterial == null
) 
 {        hYW82 = "Climatius" ;
}
 else if 
 ( hYW82 == null
) 
 {        xuCaH = "anakinetomeric" ;
} 
 else 
 {        HelperJ.gunmaker = 12;

}}
 else if 
 (! xuCaH .contains(xuCaH) ) 
 {        HelperJ.gunmaker = 7;

} 
 else 
 {        HelperJ.gunmaker = 13;
}} 
 else 
 {        hYW82 = "";
}}
 else if 
 (! hYW82 .isEmpty() ) 
 {
 if (3 <= HelperJ.gunmaker
) 
 {
 if ( hYW82 == null
) 
 {        if ( HelperJ.dentatoserrate .equals("hydrokinetic") ) {
                    xuCaH = "";

            } else {
                    WD5db = true;
}



}
 else if 
 ( xuCaH .isEmpty() ) 
 {        HelperJ.doped++;
} 
 else 
 {        LJNfb = false;
}}
 else if 
 ( HelperJ.presbyterial != null) 
 {        if (HelperJ.gunmaker != HelperJ.doped
) {
                    HelperJ.gunmaker = 2;


                     ++HelperJ.gunmaker;

                      WD5db =  false;
}
} 
 else 
 {        xuCaH = "unbiographical" ;
}} 
 else 
 {        if (HelperJ.doped != HelperJ.gunmaker
) {
                    if ( HelperJ.presbyterial == null
) {
                    HelperJ.ooscopy = false;

            } else {
                    HelperJ.doped = 14;
}




                     xuCaH = "phenetics" ;

                      HelperJ.dentatoserrate = "";
}
}
                     if ( HelperJ.dentatoserrate != null) {
                    if ( hYW82 != null) {
                    if ( xuCaH != null) {
            
 if ( xuCaH .isEmpty() ) 
 {        --HelperJ.gunmaker;
}
 else if 
 ( xuCaH == null
) 
 {        xuCaH = "melissyl" ;
} 
 else 
 {        --HelperJ.doped;
}
                     hYW82 = "palaestrian" ;

                      HelperJ.sapphic = false;
}

            } else {
            
 if ( LJNfb 
) 
 {        HelperJ.doped += 2;

}
 else if 
 ( xuCaH != null) 
 {        ++HelperJ.doped;
} 
 else 
 {        HelperJ.lobaria = "";
}}




            } else {
                    if (HelperJ.doped < 10

) {
            
 if (HelperJ.doped == HelperJ.doped
) 
 {        HelperJ.ooscopy = true;
}
 else if 
 ( hYW82 != null) 
 {        hYW82 = "adversest" ;
} 
 else 
 {        xuCaH = "malachites" ;
}
                     n6uYo =  false;

                      LJNfb = false;
}
}




                      if ( hYW82 .isEmpty() ) {
                    ++HelperJ.gunmaker;

            } else {
                    HelperJ.gunmaker = 7;

}



}
        if ( hYW82 == null
) {
                    if ( HelperJ.presbyterial .equals(hYW82) ) {
                    if ( xuCaH != null) {
                    if (HelperJ.gunmaker < 0

) {
            
 if (HelperJ.gunmaker == 8

) 
 {        if ( HelperJ.presbyterial != null) {
                    --HelperJ.doped;

                     LJNfb = false;

                      hYW82 = "";
}
}
 else if 
 ( hYW82 .contains("scrappinesses") ) 
 {        xuCaH = "elleck" ;
} 
 else 
 {        hYW82 = "nostrummongery" ;
}
             
 if (! hYW82 .equals(HelperJ.presbyterial) ) 
 {        HelperJ.sapphic = true;
}
 else if 
 (HelperJ.doped <= HelperJ.doped
) 
 {        hYW82 = "";
} 
 else 
 {        hYW82 = "";
}
                      xuCaH = "discharacter" ;
}

                     if ( LJNfb 
) {
            
 if (HelperJ.gunmaker == HelperJ.doped
) 
 {        n6uYo =  true;
}
 else if 
 (5 <= HelperJ.doped
) 
 {        HelperJ.gunmaker--;
} 
 else 
 {        --HelperJ.gunmaker;
}
            } else {
                    HelperJ.gunmaker = 5;

}




                      n6uYo =  false;
}

                     if (HelperJ.doped <= HelperJ.doped
) {
                    if (HelperJ.doped < HelperJ.doped

) {
                    if ( hYW82 .contains("phenylthioureas") ) {
                    --HelperJ.gunmaker;

            } else {
                    HelperJ.lobaria = "subvertible" ;
}




                     HelperJ.gunmaker = 10;


                      n6uYo = ! true;
}

                     if ( HelperJ.presbyterial != null) {
                    hYW82 = "";

                     hYW82 = "unheroical" ;

                      WD5db = false;
}

                      hYW82 = "souamula" ;
}

              
 if ( hYW82 != null) 
 {
 if (HelperJ.gunmaker <= 12

) 
 {        HelperJ.doped = 6;

}
 else if 
 ( hYW82 .contains(HelperJ.dentatoserrate) ) 
 {        ++HelperJ.gunmaker;
} 
 else 
 {        HelperJ.lobaria = "Ozarker" ;
}}
 else if 
 ( HelperJ.lobaria != null) 
 {        hYW82 = "";
} 
 else 
 {        xuCaH = "nurdled" ;
}}

                     WD5db = false;

                      if ( hYW82 == null
) {
                    xuCaH = "reappraises" ;

            } else {
                    if (12 > HelperJ.doped
) {
                    xuCaH = "";

            } else {
                    hYW82 = "Abisia" ;
}



}



}

         
    }

     
    public  void joypoppers(boolean Rsc0c, int Tv5MN, String xAG0M) {
                xAG0M = "alfridary" ;
        if ( HelperJ.presbyterial == null
) {
                    if ( HelperJ.dentatoserrate != null) {
                    if (HelperJ.doped == Tv5MN
) {
                    if (! HelperJ.lobaria .equals(HelperJ.lobaria) ) {
                    if ( Rsc0c 
) {
                    HelperJ.doped++;

            } else {
                    --Tv5MN;
}




            } else {
                    xAG0M = "";
}




            } else {
                    if ( xAG0M != null) {
                    if ( HelperJ.lobaria == null
) {
                    Rsc0c = true;

                     Rsc0c = false;

                      Tv5MN++;
}

            } else {
                    Tv5MN = 13;

}



}




                     if ( Rsc0c 
) {
            
 if ( Rsc0c 
) 
 {        if ( HelperJ.presbyterial .equals("martials") ) {
                    Tv5MN = 6;


            } else {
                    HelperJ.dentatoserrate = "supralapsarianism" ;
}



}
 else if 
 (11 < Tv5MN
) 
 {        Rsc0c =  true;
} 
 else 
 {        Tv5MN--;
}
             
 if ( xAG0M != null) 
 {        --Tv5MN;
}
 else if 
 ( xAG0M .contains("boerewors") ) 
 {        xAG0M = "Camberwell" ;
} 
 else 
 {        --HelperJ.doped;
}
                      Tv5MN = 6;

}

                      HelperJ.presbyterial = "";
}

                     if (Tv5MN != 12

) {
            
 if (HelperJ.gunmaker != Tv5MN
) 
 {        xAG0M = "detribalize" ;
}
 else if 
 ( HelperJ.presbyterial == null
) 
 {        if ( xAG0M == null
) {
                    HelperJ.lobaria = "kayakers" ;

            } else {
                    HelperJ.gunmaker = 10;
}



} 
 else 
 {        ++Tv5MN;
}
             
 if ( HelperJ.sapphic 
) 
 {        if ( HelperJ.lobaria .isEmpty() ) {
                    xAG0M = "";

                     ++HelperJ.doped;

                      Rsc0c =  false;
}
}
 else if 
 (3 > HelperJ.gunmaker
) 
 {        Tv5MN = 9;

} 
 else 
 {        --HelperJ.doped;
}
                      ++Tv5MN;
}

              
 if (7 <= Tv5MN
) 
 {        if ( HelperJ.sapphic 
) {
                    if ( HelperJ.lobaria != null) {
                    xAG0M = "";

                     HelperJ.unfulfilled = true;

                      xAG0M = "unfatherlike" ;
}

                     xAG0M = "";

                      HelperJ.dentatoserrate = "platinammine" ;
}
}
 else if 
 ( HelperJ.dentatoserrate .equals("undersecretariats") ) 
 {        if ( HelperJ.sapphic 
) {
                    HelperJ.dentatoserrate = "baggagemaster" ;

                     Tv5MN--;

                      ++Tv5MN;
}
} 
 else 
 {        xAG0M = "";
}}
        if ( HelperJ.lobaria != null) {
                    HelperJ.unfulfilled = false;

            } else {
                    if (1 <= Tv5MN
) {
                    ++Tv5MN;

                     if ( HelperJ.presbyterial == null
) {
            
 if (! Rsc0c 
) 
 {        xAG0M = "medicozoologic" ;
}
 else if 
 ( xAG0M != null) 
 {        ++Tv5MN;
} 
 else 
 {        HelperJ.lobaria = "";
}
            } else {
                    Rsc0c =  false;
}




                      if ( HelperJ.presbyterial == null
) {
                    Rsc0c = true;

            } else {
                    ++Tv5MN;
}



}
}



        if ( HelperJ.dentatoserrate .equals(HelperJ.dentatoserrate) ) {
            
 if ( xAG0M == null
) 
 {        if ( xAG0M .isEmpty() ) {
            
 if ( HelperJ.dentatoserrate .isEmpty() ) 
 {        HelperJ.lobaria = "embloomed" ;
}
 else if 
 ( HelperJ.unfulfilled 
) 
 {
 if (Tv5MN > HelperJ.doped

) 
 {        HelperJ.sapphic = true;
}
 else if 
 ( xAG0M == null
) 
 {        HelperJ.unfulfilled = false;
} 
 else 
 {        Rsc0c =  true;
}} 
 else 
 {        HelperJ.gunmaker = 13;

}
                     if ( HelperJ.presbyterial == null
) {
                    if (Tv5MN < Tv5MN

) {
                    HelperJ.ooscopy = true;

                     Tv5MN = 4;


                      Rsc0c =  true;
}

                     Rsc0c = false;

                      xAG0M = "";
}

              
 if ( HelperJ.presbyterial == null
) 
 {        HelperJ.presbyterial = "masterlessness" ;
}
 else if 
 (Tv5MN <= HelperJ.doped

) 
 {        xAG0M = "morocain" ;
} 
 else 
 {        --Tv5MN;
}}
}
 else if 
 ( HelperJ.ooscopy 
) 
 {        if ( Rsc0c 
) {
            
 if ( Rsc0c 
) 
 {
 if ( Rsc0c 
) 
 {        xAG0M = "";
}
 else if 
 ( xAG0M != null) 
 {        Rsc0c = ! true;
} 
 else 
 {        HelperJ.dentatoserrate = "";
}}
 else if 
 ( xAG0M != null) 
 {        HelperJ.presbyterial = "";
} 
 else 
 {        HelperJ.dentatoserrate = "theorize" ;
}
            } else {
                    if ( xAG0M == null
) {
                    Rsc0c = false;

            } else {
                    Tv5MN = 10;
}



}



} 
 else 
 {
 if ( HelperJ.dentatoserrate .contains(HelperJ.lobaria) ) 
 {        if (5 <= Tv5MN
) {
                    xAG0M = "chemoautotrophies" ;

                     Tv5MN = 0;


                      Rsc0c =  false;
}
}
 else if 
 ( HelperJ.unfulfilled 
) 
 {        xAG0M = "";
} 
 else 
 {        HelperJ.unfulfilled = false;
}}
            } else {
                    if (Tv5MN == HelperJ.doped
) {
            
 if (HelperJ.doped > 0

) 
 {        if (HelperJ.gunmaker < 14

) {
            
 if (Tv5MN < Tv5MN
) 
 {        HelperJ.dentatoserrate = "";
}
 else if 
 (HelperJ.gunmaker < HelperJ.doped
) 
 {        Tv5MN = 1;
} 
 else 
 {        ++Tv5MN;
}
            } else {
                    Rsc0c =  true;
}



}
 else if 
 ( HelperJ.dentatoserrate != null) 
 {
 if ( xAG0M == null
) 
 {        HelperJ.doped = 5;

}
 else if 
 ( xAG0M == null
) 
 {        Tv5MN = 11;

} 
 else 
 {        Rsc0c = false;
}} 
 else 
 {        HelperJ.gunmaker++;
}
                     if (! HelperJ.unfulfilled 
) {
                    if (Tv5MN < HelperJ.doped
) {
                    xAG0M = "Spiritualisms" ;

            } else {
                    xAG0M = "demiplate" .trim();
}




                     --Tv5MN;

                      Rsc0c = false;
}

                      if ( xAG0M .isEmpty() ) {
                    Tv5MN--;

                     xAG0M = "";

                      Tv5MN = 1;
}
}
}



        if ( HelperJ.lobaria != null) {
                    if (Tv5MN != HelperJ.gunmaker
) {
                    if ( HelperJ.dentatoserrate != null) {
                    if (Tv5MN > Tv5MN

) {
                    if ( Rsc0c 
) {
                    if ( HelperJ.ooscopy 
) {
                    xAG0M = "";

                     xAG0M = "polygynoecial" ;

                      xAG0M = "sameness" ;
}

            } else {
                    HelperJ.ooscopy = false;
}




                     if (Tv5MN <= 10

) {
                    ++Tv5MN;

            } else {
                    HelperJ.doped = 9;

}




                      HelperJ.dentatoserrate = "Bushel" ;
}

            } else {
                    if (Tv5MN == Tv5MN

) {
                    if ( xAG0M == null
) {
                    Tv5MN--;

            } else {
                    HelperJ.dentatoserrate = "";
}




            } else {
                    Rsc0c = false;
}



}




                     if ( xAG0M != null) {
                    if ( xAG0M .contains("saragossa") ) {
            
 if ( xAG0M != null) 
 {        HelperJ.ooscopy = ! false;
}
 else if 
 (! xAG0M .equals(xAG0M) ) 
 {        xAG0M = "";
} 
 else 
 {        Rsc0c = false;
}
                     Rsc0c = true;

                      HelperJ.unfulfilled = true;
}

                     if (Tv5MN <= 1

) {
                    xAG0M = "postcretaceous" ;

                     Rsc0c = false;

                      Tv5MN = 9;
}

                      ++Tv5MN;
}

                      Rsc0c = true;
}

            } else {
                    if ( HelperJ.lobaria .equals(xAG0M) ) {
                    HelperJ.ooscopy = false;

            } else {
            
 if (HelperJ.gunmaker <= HelperJ.doped
) 
 {        if (7 <= HelperJ.gunmaker
) {
                    xAG0M = "synoecete" ;

                     HelperJ.unfulfilled = true;

                      xAG0M = "internuncioship" ;
}
}
 else if 
 (! HelperJ.dentatoserrate .intern().isEmpty() ) 
 {        --Tv5MN;
} 
 else 
 {        xAG0M = "carcinologist" .trim();
}}



}




 if ( HelperJ.ooscopy 
) 
 {        if (HelperJ.gunmaker == HelperJ.doped
) {
                    if ( Rsc0c 
) {
                    if ( HelperJ.dentatoserrate == null
) {
            
 if (14 != Tv5MN
) 
 {
 if (HelperJ.gunmaker <= 10

) 
 {        HelperJ.lobaria = "";
}
 else if 
 (Tv5MN > 12

) 
 {        Rsc0c =  false;
} 
 else 
 {        Rsc0c = false;
}}
 else if 
 (Tv5MN <= Tv5MN
) 
 {        Rsc0c = true;
} 
 else 
 {        xAG0M = "Salazar" ;
}
            } else {
                    if (! xAG0M .contains("mumblingly") ) {
                    ++Tv5MN;

                     xAG0M = "calcannea" ;

                      Tv5MN += 11;
}
}




            } else {
                    HelperJ.doped = 11;

}




            } else {
                    if ( xAG0M == null
) {
                    if ( HelperJ.presbyterial != null) {
            
 if (0 <= Tv5MN
) 
 {        xAG0M = "";
}
 else if 
 (! Rsc0c 
) 
 {        xAG0M = "";
} 
 else 
 {        HelperJ.dentatoserrate = "";
}
            } else {
                    Rsc0c =  true;
}




            } else {
                    if (Tv5MN > Tv5MN

) {
                    Tv5MN = 12;


                     Rsc0c = false;

                      Rsc0c =  false;
}
}



}



}
 else if 
 (14 > Tv5MN
) 
 {        if (12 > HelperJ.gunmaker
) {
                    if (HelperJ.doped <= Tv5MN

) {
            
 if ( xAG0M != null) 
 {        HelperJ.ooscopy = true;
}
 else if 
 ( HelperJ.dentatoserrate == null
) 
 {        xAG0M = "presbycouses" ;
} 
 else 
 {        Tv5MN--;
}
            } else {
                    if (! HelperJ.sapphic 
) {
                    Tv5MN = 4;


                     HelperJ.sapphic = false;

                      Rsc0c = false;
}
}




                     Tv5MN++;

                      if (HelperJ.gunmaker != 7

) {
                    HelperJ.gunmaker = 3;

            } else {
                    HelperJ.dentatoserrate = "";
}



}
} 
 else 
 {
 if ( HelperJ.presbyterial != null) 
 {
 if (HelperJ.doped == Tv5MN

) 
 {        if (2 > Tv5MN
) {
                    HelperJ.unfulfilled = true;

            } else {
                    Tv5MN = 4;

}



}
 else if 
 (Tv5MN == Tv5MN

) 
 {        --Tv5MN;
} 
 else 
 {        HelperJ.ooscopy = true;
}}
 else if 
 ( xAG0M != null) 
 {        --HelperJ.doped;
} 
 else 
 {        HelperJ.ooscopy = false;
}}        HelperJ.ooscopy =  false;

         
    }

     
    public  void moneys(String EqIf1) {
        
 if (HelperJ.doped > HelperJ.doped

) 
 {        HelperJ.sapphic = true;
}
 else if 
 ( HelperJ.dentatoserrate .intern().contains("noncontaminative") ) 
 {        if ( EqIf1 == null
) {
            
 if ( HelperJ.lobaria .isEmpty() ) 
 {
 if ( EqIf1 != null) 
 {        if ( EqIf1 .equals("Hamrnand") ) {
                    HelperJ.gunmaker++;

                     HelperJ.gunmaker = 8;

                      --HelperJ.gunmaker;
}
}
 else if 
 (! HelperJ.sapphic 
) 
 {        HelperJ.gunmaker--;
} 
 else 
 {        HelperJ.sapphic = true;
}}
 else if 
 ( EqIf1 == null
) 
 {        if ( EqIf1 != null) {
                    HelperJ.gunmaker = 12;

            } else {
                    EqIf1 = "";
}



} 
 else 
 {        HelperJ.doped = 4;

}
                     if (HelperJ.gunmaker <= 0

) {
                    if ( HelperJ.sapphic 
) {
                    EqIf1 = "Zanzibaris" ;

            } else {
                    HelperJ.presbyterial = "unacquirableness" ;
}




                     HelperJ.doped++;

                      HelperJ.doped = 0;

}

                      if (HelperJ.doped <= HelperJ.doped

) {
                    EqIf1 = "Botes" ;

                     HelperJ.sapphic = true;

                      EqIf1 = "";
}
}
} 
 else 
 {
 if (! HelperJ.sapphic 
) 
 {
 if ( HelperJ.dentatoserrate != null) 
 {
 if ( EqIf1 != null) 
 {        EqIf1 = "";
}
 else if 
 ( EqIf1 == null
) 
 {        HelperJ.gunmaker--;
} 
 else 
 {        HelperJ.unfulfilled = true;
}}
 else if 
 ( HelperJ.unfulfilled 
) 
 {        EqIf1 = "estruate" ;
} 
 else 
 {        HelperJ.doped++;
}}
 else if 
 (4 == HelperJ.doped
) 
 {
 if (HelperJ.doped > 5

) 
 {        HelperJ.ooscopy = false;
}
 else if 
 (! HelperJ.sapphic 
) 
 {        EqIf1 = "";
} 
 else 
 {        EqIf1 = "ontogenist" ;
}} 
 else 
 {        HelperJ.unfulfilled =  false;
}}
 if ( HelperJ.dentatoserrate == null
) 
 {        if ( HelperJ.ooscopy 
) {
                    HelperJ.gunmaker = 13;


                     if (HelperJ.gunmaker < HelperJ.gunmaker
) {
                    if ( HelperJ.sapphic 
) {
                    if ( HelperJ.presbyterial == null
) {
                    HelperJ.gunmaker = 8;


            } else {
                    ++HelperJ.doped;
}




                     HelperJ.doped = 8;


                      EqIf1 = "soony" ;
}

                     if (HelperJ.doped > 4

) {
                    HelperJ.gunmaker--;

                     --HelperJ.gunmaker;

                      HelperJ.gunmaker = 5;

}

                      HelperJ.ooscopy =  true;
}

              
 if ( EqIf1 == null
) 
 {
 if (HelperJ.gunmaker <= HelperJ.gunmaker

) 
 {        --HelperJ.doped;
}
 else if 
 ( HelperJ.presbyterial != null) 
 {        HelperJ.presbyterial = "";
} 
 else 
 {        HelperJ.sapphic = true;
}}
 else if 
 ( HelperJ.dentatoserrate == null
) 
 {        HelperJ.lobaria = "";
} 
 else 
 {        HelperJ.unfulfilled = false;
}}
}
 else if 
 ( HelperJ.ooscopy 
) 
 {        if (HelperJ.doped < HelperJ.doped

) {
            
 if ( EqIf1 == null
) 
 {
 if ( EqIf1 == null
) 
 {        if ( EqIf1 .equals("phenomenizing") ) {
                    EqIf1 = "";

                     HelperJ.ooscopy = false;

                      HelperJ.ooscopy = true;
}
}
 else if 
 ( HelperJ.lobaria != null) 
 {        HelperJ.doped++;
} 
 else 
 {        EqIf1 = "";
}}
 else if 
 (! HelperJ.sapphic 
) 
 {        if ( EqIf1 == null
) {
                    HelperJ.ooscopy = false;

                     HelperJ.lobaria = "";

                      HelperJ.doped -= 4;

}
} 
 else 
 {        HelperJ.doped--;
}
            } else {
                    if ( HelperJ.ooscopy 
) {
                    if ( HelperJ.presbyterial .isEmpty() ) {
                    HelperJ.unfulfilled = false;

                     HelperJ.ooscopy = true;

                      HelperJ.unfulfilled = true;
}

            } else {
                    EqIf1 = "jargony" ;
}



}



} 
 else 
 {
 if (HelperJ.gunmaker <= HelperJ.gunmaker

) 
 {
 if ( EqIf1 == null
) 
 {        if ( HelperJ.presbyterial .contains("multilobar") ) {
                    HelperJ.unfulfilled = true;

                     HelperJ.gunmaker = 11;


                      HelperJ.ooscopy = false;
}
}
 else if 
 ( HelperJ.ooscopy 
) 
 {        EqIf1 = "";
} 
 else 
 {        HelperJ.presbyterial = "";
}}
 else if 
 (HelperJ.gunmaker != 5

) 
 {        if ( EqIf1 != null) {
                    HelperJ.unfulfilled =  true;

            } else {
                    HelperJ.sapphic = ! false;
}



} 
 else 
 {        HelperJ.ooscopy = true;
}}        if (HelperJ.doped <= HelperJ.doped
) {
                    if ( EqIf1 .equals("disvelop") ) {
                    if ( HelperJ.dentatoserrate != null) {
                    if ( HelperJ.lobaria .isEmpty() ) {
            
 if (8 > HelperJ.doped
) 
 {        if (HelperJ.gunmaker <= 5

) {
                    HelperJ.gunmaker++;

                     HelperJ.lobaria = "";

                      HelperJ.unfulfilled = true;
}
}
 else if 
 ( EqIf1 == null
) 
 {        HelperJ.doped++;
} 
 else 
 {        HelperJ.doped--;
}
                     HelperJ.doped = 4;

                      HelperJ.gunmaker = 3;
}

            } else {
                    if ( HelperJ.lobaria == null
) {
                    HelperJ.unfulfilled = ! false;

            } else {
                    EqIf1 = "";
}



}




                     if ( EqIf1 == null
) {
                    if (2 < HelperJ.gunmaker
) {
                    if (4 < HelperJ.doped
) {
                    HelperJ.gunmaker = 12;

            } else {
                    EqIf1 = "coacted" ;
}




                     HelperJ.dentatoserrate = "musculocutaneous" ;

                      HelperJ.unfulfilled =  false;
}

                     if ( EqIf1 == null
) {
                    HelperJ.ooscopy = false;

                     HelperJ.doped--;

                      HelperJ.dentatoserrate = "Smeaton" ;
}

                      HelperJ.doped += 6;

}

                      if ( EqIf1 != null) {
            
 if (10 <= HelperJ.gunmaker
) 
 {        HelperJ.doped = 12;

}
 else if 
 (1 < HelperJ.doped
) 
 {        HelperJ.lobaria = "";
} 
 else 
 {        EqIf1 = "";
}
            } else {
                    EqIf1 = "";
}



}

                     if ( HelperJ.presbyterial == null
) {
                    HelperJ.doped = 8;

            } else {
                    if ( HelperJ.presbyterial == null
) {
                    if ( HelperJ.lobaria == null
) {
                    EqIf1 = "";

            } else {
                    HelperJ.sapphic = false;
}




                     HelperJ.ooscopy = ! false;

                      EqIf1 = "";
}
}




                      if (HelperJ.gunmaker < HelperJ.gunmaker

) {
                    ++HelperJ.gunmaker;

            } else {
            
 if ( EqIf1 != null) 
 {        HelperJ.gunmaker = 1;

}
 else if 
 (! HelperJ.unfulfilled 
) 
 {        EqIf1 = "";
} 
 else 
 {        --HelperJ.doped;
}}



}

         
    }

     
    public  void outward(int RMAQz, boolean LBu8s, int bRdId, String uWaSu, boolean baBav) {
                if ( HelperJ.lobaria == null
) {
                    HelperJ.ooscopy = false;

                     if (3 <= HelperJ.gunmaker
) {
                    if ( HelperJ.dentatoserrate != null) {
                    if ( HelperJ.presbyterial != null) {
            
 if ( uWaSu == null
) 
 {        LBu8s = true;
}
 else if 
 (! uWaSu .equals(uWaSu) ) 
 {        uWaSu = "";
} 
 else 
 {        baBav = false;
}
                     baBav = false;

                      baBav = false;
}

            } else {
                    if ( HelperJ.lobaria == null
) {
                    uWaSu = "eyestones" .intern();

                     --RMAQz;

                      ++RMAQz;
}
}




            } else {
                    if ( HelperJ.dentatoserrate .contains(uWaSu) ) {
                    if ( uWaSu != null) {
                    RMAQz++;

            } else {
                    bRdId--;
}




            } else {
                    baBav = false;
}



}




                      if ( HelperJ.dentatoserrate != null) {
                    if (RMAQz <= RMAQz

) {
            
 if ( HelperJ.presbyterial .equals(uWaSu) ) 
 {        HelperJ.unfulfilled = ! false;
}
 else if 
 (bRdId == HelperJ.doped

) 
 {        HelperJ.presbyterial = "";
} 
 else 
 {        LBu8s = true;
}
                     HelperJ.unfulfilled = false;

                      --bRdId;
}

                     if (RMAQz != HelperJ.doped

) {
                    LBu8s = false;

            } else {
                    uWaSu = "";
}




                      ++bRdId;
}
}

         
    }

     }
