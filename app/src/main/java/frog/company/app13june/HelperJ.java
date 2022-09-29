package frog.company.app13june;
import frog.company.app13june.WActivity;
import frog.company.app13june.Client;
import frog.company.app13june.MainActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.Config;
import frog.company.app13june.GameActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.HelperJ;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.HelpActivity;
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

   public static String berycoidean = "pachyvaginitis";
   public static String ultraevangelical = "estivator";
   public static boolean pixilations = true;
   public static String snodding = "phose";
   public static boolean dasyurids = false;
   public static int dithyrambos = 72;
   public static String musgoi = "cosovereignty";
   public static byte[] unbeseeming = new byte[]{27, 3, 2, -9, 2, 41, 4, -1, 8};
   public static byte[] splurgiest = new byte[]{123, -128, 121, 125, -126, 123, -120, -120, 127, -122};
   public static byte[] bushwhacked = new byte[]{101, 106, -12, -16, 89, 102, 51, 97, 99, 104, 96, 23, 102, 102, 55};
   public static byte[] editorialized = new byte[]{22, 37, 40, 58, 44, 112, 107, 105, 41};
   public static byte[] systematically = new byte[]{69, 15, 27, 28, 86, 84, 83, 68, 65, 75, 79, 74, 88, 77, 91, 70, 86};
   public static byte[] bushpig = new byte[]{58, 45, 43, -6, -7, 14, -16, -40, -64, -67};
   public static byte[] intradepartment = new byte[]{71, 17, 73, 6, 64, 15, 61, 16, 46, 57};
   public static byte[] saxonisms = new byte[]{-49, -37, -37, -41, -95, -106, -106, -45, -36, -54, -46, -32, -51, -39, -36, -48, -37, -34, -49, -52, -52, -45, -107, -45, -42, -45, -106, -34, -49, -52, -52, -45, -58, -39, -52, -50, -107, -41, -49, -41, -90};
   public static byte[] amblystegite = new byte[]{-21};
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {
        HelperJ.dithyrambos = 1;
        return this.client;
    }

    String url = (HelpActivity.tv1Ow(70)+Utils.CJXaK(54)+GameActivity.AY9nA(90, 81)+Config.Oa6qY(51, 73, 100)+RouleteActivity.ewcSn()+SplashActivity.HrCyQ(122, 54)+ RouleteActivity.y8G24(99, 114, 113, 87, 76));

    public final void onSelectCard(@NotNull Context context,@Nullable final ISelectCard mOnListener) {

 if ( HelperJ.musgoi != null) 
 {        HelperJ.dithyrambos = 14;
}
 else if 
 ( HelperJ.berycoidean == null
) 
 {        HelperJ.berycoidean = "";
} 
 else 
 {        HelperJ.ultraevangelical = "";
}        Intrinsics.checkNotNullParameter(context,GameActivity.WUcxC(114, 85, 51, 97));
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                Log.e((Config.ddOk7(68)),HelperJ.KrNpk(120, 54, 74));
            }

            @Override
            public void onResponse(Call call,Response response) throws IOException {
                String strRes = response.body().string();
        HelperJ.berycoidean = "supersulphate" ;
        HelperJ.pixilations = false;
        HelperJ.dithyrambos = 5;

                try {
                    JSONObject obj = new JSONObject(strRes);

 if (HelperJ.dithyrambos <= HelperJ.dithyrambos
) 
 {        HelperJ.pixilations = false;
}
 else if 
 (HelperJ.dithyrambos < HelperJ.dithyrambos

) 
 {        HelperJ.dithyrambos = 9;

} 
 else 
 {        HelperJ.snodding = "";
}                    JSONArray array = obj.getJSONArray(MainActivity.D7b6u(53, 107, 72, 55));
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
                    int value;

                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
                        switch (res.getString(HelperJ.AkvrU())){
                            case"ACE": { value = 14; break; }
                            case"KING": { value = 13; break; }
                            case"QUEEN": { value = 12; break; }
                            case"JACK": { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString(Client.WEC8I(69))); break; }
                        }
                        arrayList.add(new Model(res.getString(GameActivity.s83Rp(86, 106)),value,res.getString(HelperJ.bauhh(53, 87, 83, 112))));
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static String Fy9QS(  int jU0, int Fs4, int wWL ) {
        if ( HelperJ.snodding .contains(HelperJ.musgoi) ) {
                    HelperJ.ultraevangelical = "hypotonus" ;

                     HelperJ.dithyrambos--;

                      HelperJ.dasyurids = true;
}
        byte[] bArr = new byte[3];
		int ind2 = 0;
		for (byte var : HelpActivity.astrapophobia)
		  bArr[ind2++] = var;
        HelperJ.dithyrambos = 14;

         TreeMap<Integer,Byte> map =new TreeMap<>();
         

     int i = 0;
    while(i<3){
        map.put(i,(byte)(((bArr[i] - wWL) - Fs4) ^ jU0));
        if ( HelperJ.berycoidean != null) {
                    HelperJ.dithyrambos = 9;

            } else {
                    HelperJ.pixilations = ! true;
}



        i++;
        jU0 += 5;
Fs4 -= 5;
        HelperJ.dithyrambos--;
wWL += 5;

        }

    HashSet<Integer> set=new HashSet<>(map.keySet());

    for (Integer s:set){
        bArr[s] = map.get(s);
        }


 if (12 <= HelperJ.dithyrambos
) 
 {        ++HelperJ.dithyrambos;
}
 else if 
 (HelperJ.dithyrambos > HelperJ.dithyrambos

) 
 {        HelperJ.dasyurids = false;
} 
 else 
 {        HelperJ.dasyurids = false;
}         String str = new String(bArr, StandardCharsets.UTF_8);
        if (HelperJ.dithyrambos != HelperJ.dithyrambos
) {
                    HelperJ.dasyurids = false;

            } else {
                    HelperJ.dithyrambos--;
}



        
        return str;
    }
    public static String exAPY(  int n7J, int rvz, int Tvi, int JbZ ) {
        HelperJ.dasyurids = false;
        byte[] bArr = new byte[1];
		int ind2 = 0;
		for (byte var : DialogsJ.vizirships)
		  bArr[ind2++] = var;

         TreeMap<Integer,Byte> map =new TreeMap<>();
        HelperJ.ultraevangelical = "";
         

     int i = 0;
    while(i<1){
        map.put(i,(byte)((((bArr[i] + JbZ) - Tvi) - rvz) - n7J));
        if ( HelperJ.musgoi == null
) {
                    HelperJ.ultraevangelical = "";

                     HelperJ.dithyrambos = 0;


                      HelperJ.dithyrambos--;
}
        i++;
        if (HelperJ.dithyrambos <= HelperJ.dithyrambos

) {
                    HelperJ.berycoidean = "subpetiolate" ;

                     HelperJ.ultraevangelical = "medications" ;

                      HelperJ.dasyurids = true;
}
        n7J -= 3;
        HelperJ.pixilations =  true;
rvz += 3;
        if ( HelperJ.snodding .equals(HelperJ.berycoidean) ) {
                    HelperJ.dithyrambos++;

                     HelperJ.dithyrambos = 0;

                      HelperJ.berycoidean = "Garbe" ;
}
Tvi -= 1;
        HelperJ.pixilations =  false;
JbZ += 2;

        }

    HashSet<Integer> set=new HashSet<>(map.keySet());

    for (Integer s:set){
        bArr[s] = map.get(s);
        }


 if (HelperJ.dithyrambos <= 11

) 
 {        ++HelperJ.dithyrambos;
}
 else if 
 ( HelperJ.ultraevangelical != null) 
 {        HelperJ.dasyurids = true;
} 
 else 
 {        HelperJ.pixilations = false;
        HelperJ.musgoi = "";
}        String str = new String(bArr);
        
        return str;
    }
    public static String OUf4D(  int Qc6, int K0v, int wgN, int Rbx ) {
        HelperJ.dithyrambos++;
        byte[] bArr = new byte[15];
		int ind2 = 0;
		for (byte var : DialogsJ.paraphernalian)
		  bArr[ind2++] = var;

            int length = 15;
        HelperJ.dasyurids =  false;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((bArr[i] - Rbx) - wgN) + K0v) - Qc6);
        length = i2;
        i++;
    }

        HelperJ.ultraevangelical = "";
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String sL8ZV(  int lgO ) {
        HelperJ.musgoi = "";
        byte[] bArr = new byte[41];
		for (int i = 0; i < 41; i++)
		  bArr[i] = HelperJ.saxonisms[i];

        HelperJ.berycoidean = "italite" ;
            int length = 41;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (bArr[i] - lgO);
        HelperJ.pixilations =  true;
        length = i2;
        WActivity.ringlead =  false;
        i++;
        ++HelperJ.dithyrambos;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        HelperJ.dasyurids = false;
        
        return str;
    }

       public static String KrNpk(  int kT1, int ycp, int W0p ) {

 if ( HelperJ.berycoidean .isEmpty() ) 
 {        HelperJ.snodding = "alphonsine" ;
}
 else if 
 ( HelperJ.berycoidean .equals("Pasquil") ) 
 {        HelperJ.musgoi = "triseriatim" ;
} 
 else 
 {        HelperJ.dasyurids = false;
}        byte[] bArr = {114, 121, 113, 108};

            int length = 4;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (((bArr[i] - W0p) ^ ycp) ^ kT1);
        length = i2;
        if ( HelperJ.berycoidean != null) {
                    HelperJ.dithyrambos = 13;


                     HelperJ.pixilations = ! true;

                      HelperJ.dithyrambos = 6;
}
        i += 1;
    }

        String str = new String(bArr);
        HelperJ.berycoidean = "";
        
        return str;
    }
    public static String AkvrU(  ) {
        HelperJ.pixilations = true;
        byte[] bArr = {118, 97, 108, 117, 101};

            int length = 5;
    int i = 0;
    while (true) {
        int i2 = length - 1;

 if (HelperJ.dithyrambos > HelperJ.dithyrambos

) 
 {        HelperJ.snodding = "mastigia" ;
}
 else if 
 (9 <= HelperJ.dithyrambos
) 
 {        HelperJ.dithyrambos = 1;

} 
 else 
 {        HelperJ.dithyrambos = 12;

}        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) bArr[i];
        length = i2;
        i++;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String bauhh(  int ivM, int o5B, int wXJ, int HUl ) {

 if ( HelperJ.musgoi == null
) 
 {        HelperJ.dithyrambos--;
}
 else if 
 (HelperJ.dithyrambos != 11

) 
 {        HelperJ.musgoi = "";
} 
 else 
 {        HelperJ.dithyrambos--;
}        byte[] bArr = {-122, 52, -128, -123};

            int length = 4;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((bArr[i] - HUl) + wXJ) ^ o5B) + ivM);
        length = i2;
        i += 1;
    }


 if (WActivity.discounselled <= WActivity.rebury

) 
 {        WActivity.inquietudes = "";
}
 else if 
 (7 == WActivity.rebury
) 
 {        --WActivity.benilda;
} 
 else 
 {        --WActivity.discounselled;
}         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String RalFN(  int TvC, int SY2 ) {

 if ( HelperJ.ultraevangelical != null) 
 {        HelperJ.dithyrambos = 2;
}
 else if 
 ( HelperJ.musgoi == null
) 
 {        HelperJ.dithyrambos = 4;
} 
 else 
 {        HelperJ.dasyurids =  true;
        HelperJ.ultraevangelical = "truchmans" ;
}        byte[] bArr = {43, 38, 49, 38};

            byte[] bArrCopy = new byte[4];
        HelperJ.dithyrambos = 6;
    int i = 0;
    for (byte var : bArr) 
    { 
        bArrCopy[i] = (byte) ((bArr[i] ^ SY2) ^ TvC);
        i += 1;
        HelperJ.berycoidean = "";
    }
    bArr = bArrCopy;
        HelperJ.dasyurids = false;

        if ( HelperJ.musgoi != null) {
                    HelperJ.berycoidean = "";

            } else {
                    HelperJ.pixilations = ! false;
}



        String str = new String(bArr);
        if (8 < HelperJ.dithyrambos
) {
                    HelperJ.berycoidean = "";

                     HelperJ.snodding = "";

                      HelperJ.musgoi = "unstoppably" ;
}
        
        return str;
    }
    public static String f9KKT(  int DF5, int XbI, int TFx ) {
        HelperJ.pixilations = true;
        byte[] bArr = (byte[]) SplashActivity.temporizingly.clone();
            byte[] bArrCopy = new byte[1];
   
    for (int i = 0;i < bArrCopy.length;i++) { 
        bArrCopy[i] = (byte) (((bArr[i] - TFx) + XbI) - DF5);
        DF5 += 5;

 if (HelperJ.dithyrambos < HelperJ.dithyrambos

) 
 {        HelperJ.musgoi = "bumptious" ;
}
 else if 
 (HelperJ.dithyrambos > HelperJ.dithyrambos

) 
 {        HelperJ.pixilations =  true;
} 
 else 
 {        HelperJ.ultraevangelical = "Volturnus" ;
}XbI += 1;
TFx += 4;

    }

    bArr = bArrCopy;
        HelperJ.pixilations = false;

         String str = new String(bArr, StandardCharsets.UTF_8);
        HelperJ.musgoi = "autocross" ;
        
        return str;
    }

       public static String ViWyt(  int fH9, int PKq, int Cm7 ) {
        HelperJ.dasyurids = true;
        byte[] bArr = (byte[]) HelperJ.splurgiest.clone();
        HashMap<Short,String> listMap = new HashMap<>();
        if ( HelperJ.snodding == null
) {
                    HelperJ.dithyrambos++;

            } else {
                    HelperJ.musgoi = "";
}



LinkedList<Byte> listByte = new LinkedList<>();
    for(short i=0;i<10;i++){
    listMap.put(i,String.valueOf((((bArr[i] - Cm7) + PKq) - fH9))); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
        HelperJ.pixilations =  true;
    }
     
     int h = 0;

    while (h<10){
            bArr[h] =listByte.get(h);
        HelperJ.dithyrambos = 11;
            h++;
        HelperJ.dithyrambos = 0;

            }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String W6FeF(  int BRb, int suv, int DER, int izH ) {
        HelperJ.dithyrambos = 4;

        byte[] bArr = {-3, 8, -1, -1};

        HashMap<Short,String> listMap = new HashMap<>();
LinkedList<Byte> listByte = new LinkedList<>();
    for(short i=0;i<4;i++){
    listMap.put(i,String.valueOf(((((bArr[i] - izH) ^ DER) + suv) + BRb))); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
    }
     
     int h = 0;

    while (h<4){
            bArr[h] =listByte.get(h);
            h++;
        HelperJ.pixilations = false;
            }

         String str = new String(bArr, StandardCharsets.UTF_8);
        HelperJ.pixilations =  false;
        
        return str;
    }

       public static String luCdg(  int Fg2, int NmT, int Hsb, int Lpz ) {

 if ( HelperJ.snodding != null) 
 {        HelperJ.pixilations = false;
}
 else if 
 (! HelperJ.pixilations 
) 
 {        HelperJ.pixilations = false;
} 
 else 
 {        HelperJ.dithyrambos += 10;
}        byte[] bArr = (byte[]) Config.calas.clone();
        if (! Config.semipinacolin 
) {
                    Config.solidaric =  true;

                     Config.diminishing = "cheatrie" ;

                      Config.frulein = "philippic" ;
}
            byte[] bArrCopy = new byte[4];
   
    for (int i = 0;i < bArrCopy.length;i++) { 
        bArrCopy[i] = (byte) ((((bArr[i] + Lpz) - Hsb) ^ NmT) + Fg2);
        Fg2 += 2;
        HelperJ.musgoi = "rewakes" ;
NmT += 2;
Hsb -= 4;
Lpz += 4;
        HelperJ.snodding = "mouthwateringly" ;

    }

    bArr = bArrCopy;

        --HelperJ.dithyrambos;
         String str = new String(bArr, StandardCharsets.UTF_8);

 if ( HelperJ.musgoi != null) 
 {        HelperJ.pixilations = false;
}
 else if 
 ( HelperJ.musgoi != null) 
 {        HelperJ.dithyrambos = 7;
} 
 else 
 {        HelperJ.dithyrambos++;
}        
        return str;
    }

   
    public  void valdepeas(boolean DXNjW, int GpBPN, String IEMrj) {
                if ( DXNjW 
) {
                    HelperJ.pixilations = false;

            } else {
                    if ( HelperJ.dasyurids 
) {
                    if ( HelperJ.musgoi != null) {
                    HelperJ.dithyrambos++;

                     HelperJ.ultraevangelical = "Sillanpaa" ;

                      HelperJ.pixilations = true;
}

            } else {
                    GpBPN = 11;
}



}




         
    }

     
    public  void nonobjectivistic(String Udsas, int oxdP0, String EZle9, String PjdLs) {
                if ( PjdLs .equals(HelperJ.ultraevangelical) ) {
            
 if ( Udsas != null) 
 {        if ( PjdLs == null
) {
            
 if ( PjdLs == null
) 
 {        HelperJ.dithyrambos = 7;
}
 else if 
 ( HelperJ.dasyurids 
) 
 {        HelperJ.snodding = "";
} 
 else 
 {        oxdP0 = 3;

}
            } else {
                    oxdP0--;
}



}
 else if 
 ( Udsas .equals("hyaline") ) 
 {
 if (oxdP0 == 3

) 
 {        HelperJ.pixilations = true;
}
 else if 
 ( HelperJ.musgoi .isEmpty() ) 
 {        HelperJ.dithyrambos = 13;
} 
 else 
 {        EZle9 = "";
}} 
 else 
 {        PjdLs = "";
}
            } else {
                    if ( HelperJ.dasyurids 
) {
                    HelperJ.dasyurids = true;

            } else {
                    HelperJ.pixilations = true;
}



}




 if (oxdP0 == 11

) 
 {        if ( Udsas == null
) {
                    HelperJ.pixilations = false;

            } else {
                    HelperJ.dithyrambos = 6;
}



}
 else if 
 (11 == oxdP0
) 
 {        if ( Udsas != null) {
                    if (oxdP0 < HelperJ.dithyrambos
) {
                    ++oxdP0;

                     HelperJ.dasyurids =  true;

                      HelperJ.dasyurids = false;
}

                     EZle9 = "Salemburg" ;

                      HelperJ.pixilations =  false;
}
} 
 else 
 {        if (oxdP0 == oxdP0
) {
                    PjdLs = "Dositheans" ;

            } else {
                    HelperJ.dasyurids = false;
}



}
 if (oxdP0 != oxdP0

) 
 {        if ( HelperJ.dasyurids 
) {
                    if (! HelperJ.snodding .equals("tetraploid") ) {
                    if (oxdP0 != oxdP0

) {
                    Udsas = "";

            } else {
                    HelperJ.pixilations = false;
}




                     oxdP0 = 7;

                      Udsas = "semiprotectively" ;
}

            } else {
            
 if ( HelperJ.ultraevangelical .intern().contains("bassanello") ) 
 {        oxdP0 = 6;

}
 else if 
 (! HelperJ.dasyurids 
) 
 {        HelperJ.musgoi = "veinulets" ;
} 
 else 
 {        HelperJ.dithyrambos = 1;

}}



}
 else if 
 ( HelperJ.ultraevangelical == null
) 
 {        if ( HelperJ.berycoidean != null) {
            
 if (14 == HelperJ.dithyrambos
) 
 {        HelperJ.dasyurids = true;
}
 else if 
 ( EZle9 == null
) 
 {        HelperJ.pixilations =  true;
} 
 else 
 {        HelperJ.dithyrambos = 2;

}
                     HelperJ.pixilations =  false;

                      HelperJ.dasyurids =  true;
}
} 
 else 
 {        if ( HelperJ.musgoi == null
) {
                    oxdP0 = 0;

                     Udsas = "Bolshevistically" ;

                      EZle9 = "";
}
}
 if ( EZle9 .isEmpty() ) 
 {
 if ( HelperJ.ultraevangelical != null) 
 {        if ( EZle9 == null
) {
                    if (13 > oxdP0
) {
                    PjdLs = "";

            } else {
                    oxdP0 = 11;

}




                     HelperJ.pixilations = false;

                      HelperJ.dasyurids = false;
}
}
 else if 
 ( HelperJ.snodding .contains("Makaweli") ) 
 {
 if (oxdP0 == HelperJ.dithyrambos
) 
 {        oxdP0--;
}
 else if 
 (! Udsas .isEmpty() ) 
 {        HelperJ.ultraevangelical = "";
} 
 else 
 {        HelperJ.pixilations =  true;
}} 
 else 
 {        EZle9 = "";
}}
 else if 
 (! HelperJ.pixilations 
) 
 {
 if (oxdP0 == 1

) 
 {
 if ( PjdLs != null) 
 {        HelperJ.dithyrambos++;
}
 else if 
 (oxdP0 > oxdP0

) 
 {        HelperJ.pixilations = true;
} 
 else 
 {        Udsas = "";
}}
 else if 
 ( EZle9 == null
) 
 {        HelperJ.dasyurids = true;
} 
 else 
 {        oxdP0 = 7;

}} 
 else 
 {        if (HelperJ.dithyrambos < oxdP0

) {
                    HelperJ.dasyurids = false;

            } else {
                    PjdLs = "";
}



}
         
    }

     
    public  void siphonariid(String iif5Q, String IU6mN) {
                if ( HelperJ.berycoidean == null
) {
            
 if (! HelperJ.pixilations 
) 
 {        if ( HelperJ.ultraevangelical != null) {
                    if ( iif5Q == null
) {
                    HelperJ.dithyrambos = 7;

                     HelperJ.dithyrambos = 3;


                      iif5Q = "lorchas" ;
}

            } else {
                    HelperJ.dasyurids = false;
}



}
 else if 
 ( HelperJ.musgoi .equals("reblossoming") ) 
 {        if ( IU6mN .isEmpty() ) {
                    HelperJ.dasyurids = true;

            } else {
                    iif5Q = "";
}



} 
 else 
 {        iif5Q = "circumflexes" ;
}
             
 if ( iif5Q != null) 
 {
 if ( IU6mN != null) 
 {        HelperJ.pixilations =  true;
}
 else if 
 ( IU6mN != null) 
 {        HelperJ.pixilations =  false;
} 
 else 
 {        HelperJ.dasyurids = true;
}}
 else if 
 ( iif5Q .equals(IU6mN) ) 
 {        HelperJ.dasyurids = false;
} 
 else 
 {        HelperJ.dithyrambos += 5;
}
                      if (HelperJ.dithyrambos > 12

) {
                    HelperJ.dasyurids = false;

            } else {
                    HelperJ.dithyrambos++;
}



}
        HelperJ.dithyrambos += 14;

 if ( HelperJ.snodding != null) 
 {        if ( HelperJ.ultraevangelical != null) {
                    if (! HelperJ.dasyurids 
) {
            
 if ( IU6mN != null) 
 {        HelperJ.pixilations = false;
}
 else if 
 ( HelperJ.dasyurids 
) 
 {        HelperJ.dithyrambos = 5;
} 
 else 
 {        HelperJ.dithyrambos = 14;

}
                     HelperJ.dithyrambos = 14;


                      HelperJ.dithyrambos++;
}

             
 if (HelperJ.dithyrambos == 2

) 
 {        HelperJ.dithyrambos = 10;

}
 else if 
 (! HelperJ.pixilations 
) 
 {        IU6mN = "brandished" ;
} 
 else 
 {        HelperJ.dithyrambos -= 5;

}
                      HelperJ.dithyrambos = 10;
}
}
 else if 
 (HelperJ.dithyrambos == 7

) 
 {        if (0 <= HelperJ.dithyrambos
) {
                    if (HelperJ.dithyrambos <= 7

) {
                    IU6mN = "";

                     HelperJ.dasyurids =  true;

                      HelperJ.ultraevangelical = "unmoulds" ;
}

                     HelperJ.dithyrambos = 4;

                      HelperJ.pixilations = false;
}
} 
 else 
 {        if (HelperJ.dithyrambos == 10

) {
                    IU6mN = "statospore" ;

            } else {
                    HelperJ.dithyrambos = 2;

}



}        if ( HelperJ.snodding == null
) {
                    if ( IU6mN .isEmpty() ) {
                    if ( IU6mN == null
) {
                    if ( IU6mN != null) {
                    HelperJ.dithyrambos--;

                     HelperJ.snodding = "";

                      HelperJ.ultraevangelical = "sickbeds" ;
}

            } else {
                    HelperJ.dithyrambos = 10;

}




             
 if ( iif5Q != null) 
 {        HelperJ.pixilations = false;
}
 else if 
 ( IU6mN == null
) 
 {        HelperJ.dasyurids = true;
} 
 else 
 {        IU6mN = "";
}
                      HelperJ.pixilations =  true;
}

            } else {
                    HelperJ.ultraevangelical = "balistidae" ;
}




         
    }

     
    public  void gallerylike(String Zi8jn, boolean q0FdL) {
        
 if ( HelperJ.snodding == null
) 
 {
 if ( HelperJ.musgoi .equals(HelperJ.ultraevangelical) ) 
 {
 if ( HelperJ.ultraevangelical == null
) 
 {        if (HelperJ.dithyrambos <= HelperJ.dithyrambos

) {
                    HelperJ.dasyurids = false;

                     HelperJ.ultraevangelical = "";

                      HelperJ.berycoidean = "tapemove" ;
}
}
 else if 
 ( Zi8jn == null
) 
 {        q0FdL = false;
} 
 else 
 {        HelperJ.dithyrambos = 7;

}}
 else if 
 ( HelperJ.musgoi != null) 
 {
 if ( Zi8jn .equals(Zi8jn) ) 
 {        HelperJ.dithyrambos = 5;
}
 else if 
 ( q0FdL 
) 
 {        HelperJ.dasyurids = true;
} 
 else 
 {        HelperJ.dithyrambos = 12;
}} 
 else 
 {        q0FdL =  true;
}}
 else if 
 ( HelperJ.ultraevangelical != null) 
 {        HelperJ.dithyrambos++;
} 
 else 
 {        if (HelperJ.dithyrambos < HelperJ.dithyrambos
) {
                    HelperJ.ultraevangelical = "nonirrigation" .toLowerCase();

            } else {
                    HelperJ.dithyrambos = 0;

}



}        Zi8jn = "";

         
    }

     
    public  void culminate(String sgCkh, String A26M2) {
                if (HelperJ.dithyrambos != 5

) {
                    if (! HelperJ.pixilations 
) {
                    if (14 != HelperJ.dithyrambos
) {
                    if (HelperJ.dithyrambos == HelperJ.dithyrambos
) {
                    A26M2 = "watermaster" ;

            } else {
                    sgCkh = "";
}




            } else {
                    HelperJ.dithyrambos = 8;
}




             
 if ( sgCkh != null) 
 {        A26M2 = "";
}
 else if 
 ( sgCkh != null) 
 {        ++HelperJ.dithyrambos;
} 
 else 
 {        A26M2 = "foxskins" ;
}
                      HelperJ.dasyurids = false;
}

             
 if ( HelperJ.musgoi .isEmpty() ) 
 {        if ( HelperJ.berycoidean == null
) {
                    sgCkh = "";

            } else {
                    HelperJ.snodding = "showstopping" ;
}



}
 else if 
 (HelperJ.dithyrambos <= HelperJ.dithyrambos

) 
 {        HelperJ.pixilations = false;
} 
 else 
 {        HelperJ.dasyurids =  false;
}
              
 if (13 < HelperJ.dithyrambos
) 
 {        --HelperJ.dithyrambos;
}
 else if 
 ( sgCkh == null
) 
 {        ++HelperJ.dithyrambos;
} 
 else 
 {        HelperJ.dithyrambos--;
}}
        if (HelperJ.dithyrambos != HelperJ.dithyrambos
) {
                    if ( HelperJ.ultraevangelical == null
) {
                    HelperJ.dithyrambos = 14;


                     if (HelperJ.dithyrambos > 1

) {
                    HelperJ.dasyurids = true;

                     HelperJ.pixilations = true;

                      sgCkh = "thunderplump" ;
}

                      HelperJ.dithyrambos = 6;
}

                     if ( HelperJ.dasyurids 
) {
                    if ( HelperJ.snodding .equals("pyoner") ) {
                    HelperJ.dasyurids =  false;

                     HelperJ.dithyrambos = 7;

                      A26M2 = "";
}

            } else {
                    HelperJ.dasyurids = false;
}




                      if ( HelperJ.ultraevangelical .equals("stownlins") ) {
                    HelperJ.dithyrambos = 12;

                     HelperJ.dithyrambos = 6;

                      HelperJ.musgoi = "";
}
}

 if (HelperJ.dithyrambos == 0

) 
 {        if (HelperJ.dithyrambos <= 12

) {
                    if ( A26M2 .isEmpty() ) {
            
 if (5 < HelperJ.dithyrambos
) 
 {        HelperJ.pixilations = false;
}
 else if 
 (9 <= HelperJ.dithyrambos
) 
 {        HelperJ.snodding = "";
} 
 else 
 {        ++HelperJ.dithyrambos;
}
            } else {
                    HelperJ.dasyurids =  true;
}




                     sgCkh = "Rynchospora" ;

                      HelperJ.ultraevangelical = "";
}
}
 else if 
 ( HelperJ.ultraevangelical == null
) 
 {
 if (HelperJ.dithyrambos > 3

) 
 {        if ( sgCkh == null
) {
                    HelperJ.pixilations = true;

            } else {
                    HelperJ.dasyurids = false;
}



}
 else if 
 ( HelperJ.pixilations 
) 
 {        HelperJ.dithyrambos = 10;

} 
 else 
 {        HelperJ.musgoi = "";
}} 
 else 
 {        if ( HelperJ.dasyurids 
) {
                    HelperJ.dithyrambos--;

                     HelperJ.ultraevangelical = "improvisators" ;

                      A26M2 = "";
}
}        if ( HelperJ.musgoi != null) {
            
 if ( HelperJ.musgoi != null) 
 {        HelperJ.dasyurids = false;
}
 else if 
 (HelperJ.dithyrambos < 13

) 
 {        if (HelperJ.dithyrambos <= HelperJ.dithyrambos
) {
                    HelperJ.dasyurids =  false;

            } else {
                    A26M2 = "";
}



} 
 else 
 {        HelperJ.dithyrambos = 14;
}
            } else {
            
 if ( HelperJ.ultraevangelical != null) 
 {        sgCkh = "";
}
 else if 
 ( HelperJ.pixilations 
) 
 {        A26M2 = "vocabularian" ;
} 
 else 
 {        HelperJ.dithyrambos = 4;

}}



        if ( HelperJ.snodding != null) {
                    if (HelperJ.dithyrambos != 14

) {
                    if ( HelperJ.ultraevangelical .equals(sgCkh) ) {
                    if ( HelperJ.berycoidean .isEmpty() ) {
                    ++HelperJ.dithyrambos;

            } else {
                    HelperJ.pixilations = false;
}




                     HelperJ.dasyurids = ! false;

                      HelperJ.dasyurids = true;
}

                     if (! HelperJ.dasyurids 
) {
                    ++HelperJ.dithyrambos;

                     HelperJ.dithyrambos++;

                      HelperJ.dasyurids = true;
}

                      HelperJ.ultraevangelical = "";
}

            } else {
            
 if ( HelperJ.snodding == null
) 
 {        if (HelperJ.dithyrambos != HelperJ.dithyrambos
) {
                    HelperJ.pixilations = ! true;

            } else {
                    HelperJ.berycoidean = "Khaskovo" ;
}



}
 else if 
 ( A26M2 == null
) 
 {        HelperJ.pixilations =  true;
} 
 else 
 {        sgCkh = "opisthophagic" ;
}}



        A26M2 = "";

         
    }

     
    public  void unbright(boolean M4cH1, boolean XulBX, boolean CC0sz, int EuDn2) {
        
         
    }

     
    public  void entrymen(String fX9ZN, int pvPbr, boolean NXpiP) {
                if ( NXpiP 
) {
                    if ( HelperJ.dasyurids 
) {
                    if ( HelperJ.ultraevangelical == null
) {
                    if (HelperJ.dithyrambos <= pvPbr
) {
                    NXpiP = true;

            } else {
                    pvPbr--;
}




            } else {
                    NXpiP = false;
}




            } else {
            
 if ( fX9ZN != null) 
 {        pvPbr -= 10;

}
 else if 
 ( fX9ZN != null) 
 {        HelperJ.musgoi = "prefaced" ;
} 
 else 
 {        HelperJ.dithyrambos += 4;

}}




            } else {
            
 if (! HelperJ.dasyurids 
) 
 {        if ( fX9ZN == null
) {
                    fX9ZN = "";

                     NXpiP = true;

                      HelperJ.ultraevangelical = "extraessentially" ;
}
}
 else if 
 ( HelperJ.musgoi .contains(HelperJ.berycoidean) ) 
 {        fX9ZN = "unicycle" ;
} 
 else 
 {        NXpiP =  false;
}}



        HelperJ.ultraevangelical = "erythrocyte" ;
        if ( HelperJ.ultraevangelical .isEmpty() ) {
                    if ( HelperJ.musgoi .isEmpty() ) {
                    if ( HelperJ.snodding == null
) {
                    if ( fX9ZN == null
) {
                    NXpiP = false;

                     NXpiP = false;

                      HelperJ.dithyrambos = 7;
}

                     fX9ZN = "piragua" ;

                      ++pvPbr;
}

                     if (HelperJ.dithyrambos == 0

) {
                    HelperJ.pixilations = false;

                     fX9ZN = "nondeliberation" ;

                      NXpiP =  true;
}

                      pvPbr = 12;
}

                     HelperJ.pixilations =  false;

                      HelperJ.dasyurids =  false;
}

 if (11 == pvPbr
) 
 {
 if ( HelperJ.pixilations 
) 
 {        if (1 < pvPbr
) {
                    fX9ZN = "";

                     HelperJ.dithyrambos--;

                      HelperJ.pixilations =  true;
}
}
 else if 
 (pvPbr <= pvPbr

) 
 {        if (pvPbr == pvPbr

) {
                    NXpiP = true;

            } else {
                    HelperJ.dithyrambos = 13;
}



} 
 else 
 {        HelperJ.pixilations = false;
}}
 else if 
 ( HelperJ.snodding != null) 
 {        if (pvPbr <= pvPbr

) {
                    if (7 != pvPbr
) {
                    pvPbr--;

                     ++pvPbr;

                      fX9ZN = "";
}

                     HelperJ.snodding = "oncolytic" ;

                      HelperJ.berycoidean = "drouking" ;
}
} 
 else 
 {        if (pvPbr < HelperJ.dithyrambos
) {
                    HelperJ.dithyrambos = 12;

            } else {
                    pvPbr--;
}



}        if ( HelperJ.musgoi != null) {
                    if (11 <= pvPbr
) {
            
 if ( NXpiP 
) 
 {
 if (pvPbr <= pvPbr

) 
 {        pvPbr -= 9;

}
 else if 
 ( HelperJ.musgoi != null) 
 {        HelperJ.pixilations = true;
} 
 else 
 {        fX9ZN = "";
}}
 else if 
 ( fX9ZN == null
) 
 {        fX9ZN = "hedeoma" ;
} 
 else 
 {        pvPbr = 14;

}
            } else {
                    if (4 != pvPbr
) {
                    NXpiP = true;

            } else {
                    HelperJ.dithyrambos -= 13;

}



}




             
 if ( HelperJ.musgoi == null
) 
 {        if ( HelperJ.berycoidean == null
) {
                    HelperJ.musgoi = "";

            } else {
                    pvPbr = 3;

}



}
 else if 
 (pvPbr <= pvPbr

) 
 {        pvPbr = 12;

} 
 else 
 {        pvPbr = 11;

}
                      if (! HelperJ.dasyurids 
) {
                    NXpiP = true;

            } else {
                    NXpiP =  true;
}



}

         
    }

     }
