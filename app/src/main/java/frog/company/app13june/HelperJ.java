package frog.company.app13june;
import frog.company.app13june.Utils;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.MainActivity;
import frog.company.app13june.WActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.GameActivity;
import frog.company.app13june.Config;
import frog.company.app13june.HelperJ;
import java.nio.CharBuffer;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedList;
import java.util.Random;
import java.nio.charset.CharsetDecoder;
import java.util.stream.Collectors;
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

import io.michaelrocks.paranoid.Obfuscate;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
@Obfuscate
public class HelperJ {

   public static String nonapostatizing = "minuscule";
   public static int isidoid = 111;
   public static boolean pyrophyllites = true;
   public static String phycochromophyceae = "pontifical";
   public static boolean fariss = false;
   public static int anatropal = 109;
   public static String parjanya = "Kulpsville";
   public static String adelgid = "27,115,126,-121,126,21,116,127,120";
   public static String cheatings = "-29,31,33,8";
   public static String responsors = "104,116,116,112";
   public static String woghness = "28,26,29,13";
   public static String schoolgoings = "-6,-121,-101";
   public static String antenniform = "-72,-62,-68,-65";
   public static String tarahumare = "-35,-73";
   public static final String encephalospinal = "104";
   public static String irrecoverably = "19,106,63,97,104,97,111,16,15,37,22,96";
   public static String cyclosis = "-77,-61,-58,-48,-59,-36,-36";
   public static String hydractinian = "-63,-46,-45,-53,116,-78,-71,-78,-94,-92,-92,-110,-96,-112,-111,-117,56,123,111,124,36,107,105,104,100,25,6,37,75,-9,75,60,61,-29,53,26,34,35,-54,25,15,-69,10,3,5,-89,-29,-28,-39,-36,-36,-88,-64,-51";
   public static String stiltlike = "5,40,63,61,116,42,50,42,101";
   public static String vasodilatory = "127,-125,116,111";
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {

 if (! DialogsJ.ammonification 
) 
 {        DialogsJ.pluripara = 12;        

}
 else if 
 (DialogsJ.pluripara < DialogsJ.epiplasm

 &&  DialogsJ.haematin .equals(DialogsJ.pneumatologies) ) 
 {        DialogsJ.epiplasm--;
} 
 else 
 {        DialogsJ.epiplasm = 8;
}

        return this.client;
    }

    String url = Config.P6kEs(81, 117, 56, 51, 74);

    public final void onSelectCard(@NotNull Context context,@Nullable final ISelectCard mOnListener) {
        HelperJ.nonapostatizing = "";
        Intrinsics.checkNotNullParameter(context,GameActivity.Ljj9U(80));
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                Log.e(GameActivity.IQ2V6(85, 114, 99, 82, 89, 87),RouleteActivity.ujxZF(119, 80, 70));
            }

            @Override
            public void onResponse(Call call,Response response) throws IOException {
                String strRes = response.body().string();
        HelperJ.isidoid = 4;        

                try {
                    JSONObject obj = new JSONObject(strRes);
                    JSONArray array = obj.getJSONArray(GameActivity.EAgMq(120));
        HelperJ.anatropal++;
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
        HelperJ.nonapostatizing = "";
                    int value;

                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
                        switch (res.getString(GameActivity.sCPGg(121, 99, 113))){
                            case"ACE": { value = 14; break; }
                            case"KING": { value = 13; break; }
                            case"QUEEN": { value = 12; break; }
                            case"JACK": { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString(WActivity.zvF2g(72, 112, 74))); break; }
                        }
                        arrayList.add(new Model(res.getString(MainActivity.t81O8(66, 121, 111, 122, 49, 85)),value,res.getString(HelperJ.EeozX(110, 110, 112, 120))));
        HelperJ.anatropal = 8;
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static String Zw3X3(  int FrU ) {

 if ( RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric)  && RouleteActivity.bifrost > RouleteActivity.bifrost
) 
 {        RouleteActivity.asthenospheric = "";
}
 else if 
 ( RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.asthenospheric = "Paradiseinae" ;
} 
 else 
 {        RouleteActivity.nephropathic =  true;
}

        GameActivity.hookah++;
        byte[] bArr = new byte[54];

 if ( HelperJ.pyrophyllites 
) 
 {        HelperJ.anatropal = 9;        

}
 else if 
 (6 < HelperJ.isidoid
 || HelperJ.anatropal < HelperJ.anatropal
) 
 {        HelperJ.phycochromophyceae = "";
} 
 else 
 {        HelperJ.isidoid = 13;
}

		String[] arr = HelperJ.hydractinian.split(",");

 if (DialogsJ.epiplasm < DialogsJ.pluripara
 ||  DialogsJ.pneumatologies == null
) 
 {        DialogsJ.epiplasm = 9;        

}
 else if 
 ( DialogsJ.obstructs .contains("alternants") ) 
 {        ++DialogsJ.pluripara;
} 
 else 
 {        DialogsJ.haematin = "";
}

		for (int i = 0; i < 54; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

         TreeMap<Integer,Byte> map =new TreeMap<>();
        if ( HelpActivity.combat != null) {
                    HelpActivity.unmakable = "Gracewood" ;

            } else {
                    HelpActivity.hypocrater = false;
}



         


 if (8 > HelperJ.isidoid
) 
 {        HelperJ.pyrophyllites = true;
}
 else if 
 (14 == HelperJ.anatropal
) 
 {        HelperJ.nonapostatizing = "";
} 
 else 
 {        HelperJ.fariss =  true;
}

     int i = 0;

 if (HelperJ.isidoid != 7

) 
 {        HelperJ.pyrophyllites = ! false;
}
 else if 
 ( HelperJ.phycochromophyceae == null
) 
 {        --HelperJ.isidoid;
} 
 else 
 {        HelperJ.anatropal--;
}

    while(i<54){
        map.put(i,(byte)(bArr[i] - FrU));
        i++;
        HelperJ.pyrophyllites = true;
        FrU -= 5;

        }

    HashSet<Integer> set=new HashSet<>(map.keySet());

    for (Integer s:set){
        bArr[s] = map.get(s);
        MainActivity.malapropish = true;

 if ( HelperJ.parjanya .isEmpty()  || HelperJ.anatropal <= HelperJ.isidoid
) 
 {        HelperJ.nonapostatizing = "";
}
 else if 
 ( HelperJ.nonapostatizing == null
) 
 {        HelperJ.pyrophyllites = false;
} 
 else 
 {        HelperJ.pyrophyllites = true;
}

        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        if (! HelperJ.pyrophyllites 
 ||  HelperJ.fariss 
) {
                    HelperJ.pyrophyllites = false;

            } else {
                    HelperJ.anatropal = 14;
}



        
        return str;
    }

       public static String EeozX(  int oBk, int WyA, int xlZ, int kyI ) {
        if (HelpActivity.fenner <= HelpActivity.psilotaceae

) {
                    HelpActivity.hypocrater = true;

                     HelpActivity.dimeric = 11;        


                      HelpActivity.fenner = 7;
}
        byte[] bArr = new byte[4];
		String[] arr = GameActivity.locutionary.split(",");
        --SplashActivity.landiron;
		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        if ( HelperJ.parjanya != null || HelperJ.anatropal > 11

) {
                    HelperJ.parjanya = "";

                     HelperJ.anatropal = 13;        


                      HelperJ.fariss = false;
}

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 2; i += 1)
    {
 bArrCopy.add((byte) ((((bArr[i] ^ kyI) ^ xlZ) ^ WyA) - oBk));
    }
    for (int i = 2; i < 4; i += 1)
    {
      bArrCopy.add((byte) ((((bArr[i] ^ kyI) ^ xlZ) ^ WyA) - oBk));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


        if (1 <= DialogsJ.epiplasm
 &&  DialogsJ.autoluminescence .isEmpty() ) {
                    DialogsJ.pneumatologies = "";

                     DialogsJ.pneumatologies = "";

                      DialogsJ.epiplasm++;
}
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String NmUM0(  int Kdi, int fYW, int W2W, int oZE, int fsq ) {
        DialogsJ.carbodiimide = "";
        byte[] bArr = new byte[4];
		String[] arr = WActivity.saronide.split(",");
		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            
    for (int i = 0; i < 4; i++) {
        bArr[i] = (byte)((((((bArr[i] - fsq) - oZE) + W2W) - fYW) ^ Kdi));
        Kdi += 3;

 if ( WActivity.bifacially .isEmpty() ) 
 {        WActivity.yancopin = 9;
}
 else if 
 ( WActivity.bejezebel 
 &&  WActivity.bifacially == null
) 
 {        WActivity.bejezebel = false;
} 
 else 
 {        WActivity.bifacially = "thalassophilous" ;
}

fYW -= 4;
W2W -= 3;
oZE += 4;
        DialogsJ.pluripara++;
fsq -= 4;
    }

        --HelperJ.anatropal;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String oKo9o(  int Ni8, int iiy, int HES, int sGm, int tE2, int Z8B ) {
        SplashActivity.faveolate =  false;

 if ( HelperJ.parjanya == null
 && ! HelperJ.nonapostatizing .contains(HelperJ.nonapostatizing) ) 
 {        HelperJ.fariss = true;
}
 else if 
 (HelperJ.isidoid < HelperJ.isidoid

) 
 {        HelperJ.parjanya = "";
} 
 else 
 {        HelperJ.anatropal += 14;        

}

        byte[] bArr = new byte[12];
		String[] arr = WActivity.crowboots.split(",");
        HelperJ.phycochromophyceae = "";
		for (int i = 0; i < 12; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        HelperJ.pyrophyllites = false;

            for (int i = 0; i < 12; i += 1) {
        bArr[i] = (byte)(((((((bArr[i] ^ Z8B) + tE2) + sGm) - HES) - iiy) - Ni8));
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String NK9ze(  int pPs, int JX3, int TpW ) {
        if (HelpActivity.dimeric > 9

 ||  HelpActivity.combat .contains(HelpActivity.loginess) ) {
                    HelpActivity.psilotaceae = 7;        


            } else {
                    HelpActivity.viticeta =  true;
}



        byte[] bArr = new byte[1];
		String[] arr = SplashActivity.crabbednesses.split(",");
		for (int i = 0; i < 1; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        HelperJ.nonapostatizing = "";

            HashMap<String,Byte> bHashMap = new HashMap<>();
        if (HelperJ.anatropal != HelperJ.anatropal

 && HelperJ.anatropal <= HelperJ.anatropal

) {
                    HelperJ.nonapostatizing = "";

            } else {
                    HelperJ.fariss =  false;
}



    int i = 0;
    while(i<1){
    bHashMap.put( String.valueOf(i),(byte) (((bArr[i] ^ TpW) ^ JX3) + pPs));

 if (DialogsJ.pluripara > DialogsJ.pluripara

 ||  DialogsJ.inquinating == null
) 
 {        DialogsJ.epiplasm--;
}
 else if 
 (DialogsJ.epiplasm < DialogsJ.pluripara
) 
 {        DialogsJ.ammonification = ! true;
} 
 else 
 {        DialogsJ.inquinating = "ulstered" ;
}

    i++;
        if (8 <= HelperJ.anatropal
) {
                    HelperJ.anatropal = 0;        


                     HelperJ.fariss = false;

                      HelperJ.phycochromophyceae = "fasted" ;
}
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
    }

        HelperJ.pyrophyllites =  false;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String J3Zez(  int k0N, int aVl, int SVJ, int Ihq, int qNB ) {

 if ( DialogsJ.autoluminescence .contains("oohing")  || ! DialogsJ.haematin .isEmpty() ) 
 {        DialogsJ.epiplasm++;
}
 else if 
 (1 < DialogsJ.epiplasm
) 
 {        DialogsJ.ungelatinized = true;
} 
 else 
 {        DialogsJ.pluripara++;
}

        byte[] bArr = new byte[3];
		String[] arr = HelpActivity.contest.split(",");
		for (int i = 0; i < 3; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

        DialogsJ.pneumatologies = "";
        HelperJ.pyrophyllites = false;
            int i = 0;
    
    while(i < 3) {
        bArr[i] = (byte)((((((bArr[i] + qNB) - Ihq) + SVJ) + aVl) + k0N));
        HelperJ.pyrophyllites = true;
        k0N += 3;
        DialogsJ.congealment = "speciousness" ;
aVl--;
SVJ += 2;
        SplashActivity.tapisser = "";
Ihq++;
        if (GameActivity.hookah > 1

 ||  GameActivity.connive 
) {
                    GameActivity.baseheartedness = "";

            } else {
                    GameActivity.fourteeners = false;
}



qNB--;
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);

 if (! GameActivity.fourteeners 
 || 0 <= GameActivity.subradiance
) 
 {        GameActivity.fourteeners = true;
}
 else if 
 ( GameActivity.baseheartedness .isEmpty() ) 
 {        GameActivity.baseheartedness = "semigovernmentally" ;
} 
 else 
 {        GameActivity.atarax = 11;        

}

        
        return str;
    }

       public static String D1aXI(  int Zac, int Yxd, int AfJ ) {
        Utils.bookish =  true;
        byte[] bArr = new byte[1];
		String[] arr = HelpActivity.atarax.split(",");
		for (int i = 0; i < 1; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        DialogsJ.haematin = "hyperfederalist" ;

            int length = 1;
        if (RouleteActivity.recompacted < 1

) {
                    RouleteActivity.circumflexions--;

            } else {
                    RouleteActivity.disciplinant = false;
}



    int i = 0;
    while (true) {
        int i2 = length - 1;
        HelperJ.parjanya = "stupefied" ;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (((bArr[i] - AfJ) + Yxd) + Zac);
        HelperJ.phycochromophyceae = "";
        length = i2;
        HelperJ.anatropal = 11;
        i++;
    }

        SplashActivity.electroacoustically++;
        if ( HelperJ.nonapostatizing != null ||  HelperJ.parjanya .isEmpty() ) {
                    HelperJ.anatropal--;

            } else {
                    HelperJ.nonapostatizing = "";
}



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String OsMHF(  ) {
        Utils.rabatine++;
        byte[] bArr = new byte[4];
		String[] arr = MainActivity.cmyk.split(",");
        Utils.contrastedly++;
		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

        if ( HelperJ.fariss 
) {
                    HelperJ.fariss = true;

                     HelperJ.anatropal = 11;        


                      HelperJ.fariss =  true;
}
            ArrayList<Byte> bArrCopy =new ArrayList<>();

 if ( HelperJ.phycochromophyceae != null) 
 {        HelperJ.pyrophyllites = true;
}
 else if 
 ( HelperJ.parjanya .equals("biblioklept") ) 
 {        HelperJ.phycochromophyceae = "";
} 
 else 
 {        HelperJ.fariss =  true;
}


    for (int i = 0; i < 2; i++)
    {
 bArrCopy.add((byte) bArr[i]);
        HelperJ.phycochromophyceae = "";
    }
    for (int i = 2; i < 4; i++)
    {
      bArrCopy.add((byte) bArr[i]);
        Utils.rabatine--;
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String Z5AlV(  int Z8e, int h3v, int gtL, int tuL, int SAt ) {
        GameActivity.connive = true;
        byte[] bArr = new byte[9];
		String[] arr = HelperJ.adelgid.split(",");
		for (int i = 0; i < 9; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            int length = 9;
    int i = 0;
        HelperJ.isidoid = 5;        

    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (((((bArr[i] + SAt) ^ tuL) ^ gtL) + h3v) - Z8e);
        length = i2;
        GameActivity.subradiance++;
        i++;
    }


 if ( HelperJ.fariss 
) 
 {        HelperJ.anatropal++;
}
 else if 
 ( HelperJ.phycochromophyceae != null &&  HelperJ.parjanya == null
) 
 {        HelperJ.pyrophyllites = false;
} 
 else 
 {        HelperJ.isidoid--;
}


 if (HelperJ.anatropal != HelperJ.anatropal

) 
 {        HelperJ.anatropal = 5;        

}
 else if 
 ( HelperJ.nonapostatizing == null
 || 6 != HelperJ.isidoid
) 
 {        HelperJ.phycochromophyceae = "sentient" ;
} 
 else 
 {        HelperJ.pyrophyllites = ! false;
}

         String str = new String(bArr, StandardCharsets.UTF_8);
        GameActivity.baseheartedness = "placemaking" ;
        
        return str;
    }

    public  void immunol(String ab7Xq, String Q5Npo, boolean EU4PI, String YDszd) {
        
 if ( YDszd != null ||  YDszd != null) 
 {        if (HelperJ.anatropal == HelperJ.isidoid
 &&  ab7Xq != null) {
                    if ( EU4PI 
) {
            
 if ( Q5Npo == null
) 
 {        if (4 != HelperJ.isidoid
 &&  YDszd == null
) {
                    if ( ab7Xq == null
 || HelperJ.anatropal > HelperJ.isidoid
) {
                    EU4PI =  true;

                     HelperJ.anatropal = 6;        


                      ab7Xq = "encipherments" ;
}

                     HelperJ.pyrophyllites =  true;

                      ab7Xq = "Hypsilophodontidae" ;
}
}
 else if 
 ( Q5Npo == null
 &&  EU4PI 
) 
 {        if (7 == HelperJ.anatropal
 && ! HelperJ.fariss 
) {
                    ab7Xq = "";

            } else {
                    EU4PI = false;
}



} 
 else 
 {        HelperJ.parjanya = "nonlacteous" ;
}


            } else {
                    EU4PI = true;
}




            } else {
                    if ( ab7Xq .contains("lompish")  && 3 <= HelperJ.anatropal
) {
            
 if ( YDszd != null || ! HelperJ.fariss 
) 
 {        if ( HelperJ.nonapostatizing != null && HelperJ.anatropal < HelperJ.isidoid
) {
                    YDszd = "rethicken" ;

                     ++HelperJ.isidoid;

                      HelperJ.anatropal = 9;
}
}
 else if 
 (HelperJ.isidoid == 2

) 
 {        EU4PI = true;
} 
 else 
 {        EU4PI = false;
}


            } else {
            
 if (HelperJ.isidoid < HelperJ.isidoid

) 
 {        Q5Npo = "smowts" ;
}
 else if 
 (HelperJ.anatropal > 7

) 
 {        HelperJ.anatropal--;
} 
 else 
 {        YDszd = "neovitalists" .toUpperCase();
}

}



}



}
 else if 
 (HelperJ.isidoid == 14

) 
 {        if ( YDszd != null &&  HelperJ.parjanya != null) {
                    if ( ab7Xq != null ||  YDszd == null
) {
            
 if ( EU4PI 
 ||  HelperJ.nonapostatizing != null) 
 {        if ( EU4PI 
 ||  ab7Xq .equals(HelperJ.phycochromophyceae) ) {
                    ab7Xq = "";

            } else {
                    HelperJ.pyrophyllites = true;
}



}
 else if 
 ( EU4PI 
 &&  YDszd .trim().isEmpty() ) 
 {        ab7Xq = "talipat" ;
} 
 else 
 {        Q5Npo = "";
}


            } else {
            
 if ( YDszd .equals("bullsticker")  || HelperJ.anatropal > HelperJ.isidoid
) 
 {        HelperJ.phycochromophyceae = "prelaws" ;
}
 else if 
 (HelperJ.isidoid <= 14

 &&  HelperJ.parjanya == null
) 
 {        --HelperJ.anatropal;
} 
 else 
 {        HelperJ.isidoid++;
}

}




             
 if ( HelperJ.pyrophyllites 
 &&  HelperJ.fariss 
) 
 {        if ( Q5Npo != null ||  ab7Xq .isEmpty() ) {
                    --HelperJ.isidoid;

            } else {
                    ++HelperJ.isidoid;
}



}
 else if 
 (6 != HelperJ.isidoid
 &&  EU4PI 
) 
 {        EU4PI = false;
} 
 else 
 {        YDszd = "hypothetizes" ;
}


                      if ( HelperJ.nonapostatizing == null
 &&  HelperJ.phycochromophyceae != null) {
                    HelperJ.parjanya = "";

                     YDszd = "wonderberries" ;

                      EU4PI = false;
}
}
} 
 else 
 {        if ( Q5Npo != null &&  HelperJ.phycochromophyceae .isEmpty() ) {
            
 if (HelperJ.isidoid != 0

) 
 {        if (HelperJ.isidoid <= 12

 &&  EU4PI 
) {
                    YDszd = "";

                     ++HelperJ.anatropal;

                      EU4PI = false;
}
}
 else if 
 ( Q5Npo != null) 
 {        ab7Xq = "";
} 
 else 
 {        ++HelperJ.anatropal;
}


             
 if ( Q5Npo == null
 ||  HelperJ.fariss 
) 
 {        EU4PI = true;
}
 else if 
 ( HelperJ.phycochromophyceae != null ||  EU4PI 
) 
 {        HelperJ.pyrophyllites =  true;
} 
 else 
 {        HelperJ.anatropal = 9;        

}


                      HelperJ.anatropal--;
}
}

        ab7Xq = "Judaeo" ;
        if (! YDszd .contains(ab7Xq)  || ! ab7Xq .contains(HelperJ.phycochromophyceae) ) {
                    if ( HelperJ.phycochromophyceae != null) {
                    if ( HelperJ.nonapostatizing == null
) {
            
 if ( YDszd .isEmpty() ) 
 {        if (HelperJ.isidoid != HelperJ.isidoid
) {
                    if ( Q5Npo == null
) {
                    HelperJ.anatropal++;

            } else {
                    HelperJ.isidoid = 5;        

}




            } else {
                    HelperJ.pyrophyllites = true;
}



}
 else if 
 (5 != HelperJ.anatropal
) 
 {
 if ( Q5Npo .contains("nonexemplificatior") ) 
 {        EU4PI = ! false;
}
 else if 
 (! EU4PI 
) 
 {        --HelperJ.anatropal;
} 
 else 
 {        HelperJ.isidoid++;
}

} 
 else 
 {        Q5Npo = "retranscribing" ;
}


                     if ( YDszd .contains("noninvincibility")  &&  HelperJ.parjanya .contains("stepfamily") ) {
            
 if (HelperJ.isidoid != HelperJ.isidoid

 &&  YDszd .isEmpty() ) 
 {        YDszd = "inextinguishable" ;
}
 else if 
 (HelperJ.isidoid <= HelperJ.anatropal

 ||  EU4PI 
) 
 {        Q5Npo = "";
} 
 else 
 {        EU4PI = false;
}


            } else {
                    YDszd = "colonelship" .toUpperCase();
}




              
 if (! EU4PI 
) 
 {        HelperJ.isidoid++;
}
 else if 
 (HelperJ.anatropal <= 9

 && HelperJ.isidoid > HelperJ.isidoid

) 
 {        HelperJ.anatropal--;
} 
 else 
 {        EU4PI = true;
}

}

            } else {
                    if ( EU4PI 
 && 2 <= HelperJ.isidoid
) {
                    if (HelperJ.isidoid == HelperJ.isidoid
) {
                    if ( Q5Npo == null
) {
                    ++HelperJ.isidoid;

            } else {
                    YDszd = "";
}




            } else {
                    HelperJ.anatropal = 8;        

}




             
 if ( Q5Npo != null) 
 {        HelperJ.anatropal = 14;
}
 else if 
 (! ab7Xq .isEmpty() ) 
 {        HelperJ.anatropal = 12;
} 
 else 
 {        ab7Xq = "pseudoaristocratically" ;
}


                      HelperJ.phycochromophyceae = "";
}
}




             
 if ( ab7Xq != null) 
 {        if ( ab7Xq == null
) {
                    if ( YDszd != null && HelperJ.anatropal > HelperJ.isidoid

) {
            
 if ( Q5Npo .equals(YDszd)  || HelperJ.anatropal == HelperJ.anatropal

) 
 {        ab7Xq = "smokes" ;
}
 else if 
 (8 <= HelperJ.anatropal
) 
 {        HelperJ.anatropal = 14;        

} 
 else 
 {        HelperJ.phycochromophyceae = "pleaseman" ;
}


                     EU4PI = false;

                      YDszd = "";
}

            } else {
                    HelperJ.pyrophyllites = true;
}



}
 else if 
 ( HelperJ.parjanya .isEmpty() ) 
 {        if ( HelperJ.fariss 
) {
                    if ( ab7Xq != null) {
                    HelperJ.anatropal--;

            } else {
                    Q5Npo = "welfare" ;
}




            } else {
                    Q5Npo = "";
}



} 
 else 
 {        if ( YDszd .contains(HelperJ.parjanya)  && HelperJ.isidoid == HelperJ.isidoid
) {
                    ++HelperJ.anatropal;

                     Q5Npo = "groundliness" ;

                      HelperJ.isidoid--;
}
}


              
 if ( HelperJ.phycochromophyceae == null
 &&  EU4PI 
) 
 {        if (HelperJ.isidoid != HelperJ.anatropal

) {
            
 if ( ab7Xq == null
) 
 {        HelperJ.anatropal = 0;
}
 else if 
 ( HelperJ.phycochromophyceae != null &&  ab7Xq != null) 
 {        EU4PI = false;
} 
 else 
 {        EU4PI =  true;
}


                     HelperJ.anatropal -= 5;

                      ab7Xq = "Almelo" ;
}
}
 else if 
 (HelperJ.anatropal <= HelperJ.isidoid
 ||  EU4PI 
) 
 {
 if ( EU4PI 
) 
 {        HelperJ.anatropal++;
}
 else if 
 ( HelperJ.nonapostatizing == null
 &&  EU4PI 
) 
 {        HelperJ.anatropal++;
} 
 else 
 {        HelperJ.isidoid = 4;        

}

} 
 else 
 {        HelperJ.isidoid = 1;
}

}

 if ( YDszd .isEmpty()  &&  HelperJ.phycochromophyceae .toUpperCase().contains(HelperJ.nonapostatizing) ) 
 {
 if ( ab7Xq == null
 || HelperJ.isidoid == HelperJ.isidoid
) 
 {        if (HelperJ.anatropal <= HelperJ.anatropal

 || ! ab7Xq .isEmpty() ) {
                    if ( ab7Xq != null ||  EU4PI 
) {
                    --HelperJ.anatropal;

            } else {
                    if ( HelperJ.parjanya .isEmpty() ) {
                    YDszd = "splendiferousness" ;

            } else {
                    YDszd = "";
}



}




            } else {
            
 if ( YDszd == null
 && HelperJ.anatropal <= HelperJ.anatropal
) 
 {        if ( Q5Npo != null && ! HelperJ.fariss 
) {
                    HelperJ.anatropal += 14;

                     EU4PI =  false;

                      EU4PI =  true;
}
}
 else if 
 ( Q5Npo .equals(HelperJ.phycochromophyceae)  ||  ab7Xq == null
) 
 {        HelperJ.phycochromophyceae = "interjectionize" .toLowerCase();
} 
 else 
 {        HelperJ.isidoid = 14;
}

}



}
 else if 
 ( HelperJ.phycochromophyceae != null) 
 {        if ( HelperJ.pyrophyllites 
 ||  HelperJ.nonapostatizing .contains("maternalistically") ) {
            
 if (HelperJ.isidoid != 12

) 
 {        ++HelperJ.anatropal;
}
 else if 
 ( ab7Xq .contains(Q5Npo)  ||  HelperJ.nonapostatizing != null) 
 {        HelperJ.isidoid = 13;
} 
 else 
 {        HelperJ.anatropal += 0;        

}


            } else {
                    if (10 != HelperJ.isidoid
 || HelperJ.anatropal <= HelperJ.isidoid
) {
                    EU4PI = true;

            } else {
                    HelperJ.fariss = false;
}



}



} 
 else 
 {
 if (HelperJ.anatropal > 11

) 
 {        if ( ab7Xq == null
) {
                    ab7Xq = "";

                     EU4PI =  false;

                      HelperJ.anatropal = 10;
}
}
 else if 
 (! HelperJ.pyrophyllites 
 ||  EU4PI 
) 
 {        ++HelperJ.anatropal;
} 
 else 
 {        HelperJ.anatropal = 4;        

}

}

}
 else if 
 (HelperJ.isidoid < HelperJ.isidoid
 &&  EU4PI 
) 
 {        YDszd = "";
} 
 else 
 {        if (HelperJ.isidoid <= 4

 ||  Q5Npo != null) {
                    if ( EU4PI 
 || 7 < HelperJ.anatropal
) {
                    if ( EU4PI 
) {
                    EU4PI = false;

                     Q5Npo = "adenocellulitis" ;

                      ab7Xq = "";
}

                     HelperJ.isidoid -= 10;

                      ++HelperJ.isidoid;
}

            } else {
                    if ( ab7Xq .contains(HelperJ.phycochromophyceae)  || HelperJ.isidoid != HelperJ.anatropal

) {
                    ++HelperJ.isidoid;

                     HelperJ.anatropal = 4;

                      HelperJ.anatropal++;
}
}



}

        if (14 > HelperJ.anatropal
 ||  HelperJ.pyrophyllites 
) {
            
 if ( HelperJ.phycochromophyceae .contains(YDszd)  && 13 <= HelperJ.anatropal
) 
 {        if ( HelperJ.nonapostatizing == null
 ||  Q5Npo .contains(ab7Xq) ) {
                    if ( ab7Xq == null
) {
            
 if (HelperJ.anatropal > HelperJ.isidoid
 && ! HelperJ.phycochromophyceae .equals("soleplate") ) 
 {        if ( YDszd != null) {
                    HelperJ.isidoid++;

            } else {
                    Q5Npo = "Trappist" ;
}



}
 else if 
 ( ab7Xq != null && HelperJ.isidoid == HelperJ.isidoid
) 
 {        Q5Npo = "crampet" .trim();
} 
 else 
 {        HelperJ.fariss = ! false;
}


             
 if (9 != HelperJ.anatropal
 &&  Q5Npo != null) 
 {        ab7Xq = "";
}
 else if 
 ( HelperJ.fariss 
 ||  ab7Xq != null) 
 {        Q5Npo = "zonally" ;
} 
 else 
 {        YDszd = "Charline" ;
}


                      HelperJ.fariss = false;
}

            } else {
            
 if (! EU4PI 
 || 11 == HelperJ.anatropal
) 
 {
 if (HelperJ.isidoid <= HelperJ.isidoid
 ||  YDszd != null) 
 {        HelperJ.fariss = false;
}
 else if 
 ( ab7Xq == null
 ||  EU4PI 
) 
 {        Q5Npo = "sawbill" ;
} 
 else 
 {        EU4PI = true;
}

}
 else if 
 (! EU4PI 
 ||  HelperJ.parjanya != null) 
 {        HelperJ.pyrophyllites =  false;
} 
 else 
 {        EU4PI = true;
}

}



}
 else if 
 (13 < HelperJ.isidoid
) 
 {        if ( ab7Xq != null ||  Q5Npo != null) {
                    if ( Q5Npo == null
) {
                    if (! YDszd .contains("perichondria")  ||  ab7Xq != null) {
                    HelperJ.nonapostatizing = "accentuable" ;

                     EU4PI = false;

                      HelperJ.phycochromophyceae = "jarovization" ;
}

            } else {
                    HelperJ.anatropal += 11;
}




                     if (HelperJ.isidoid <= HelperJ.isidoid
) {
                    HelperJ.isidoid--;

            } else {
                    EU4PI = true;
}




                      HelperJ.isidoid = 8;        

}
} 
 else 
 {
 if ( YDszd != null) 
 {        if ( HelperJ.phycochromophyceae .contains(ab7Xq)  && ! EU4PI 
) {
                    EU4PI =  true;

                     HelperJ.isidoid = 6;        


                      ab7Xq = "fannell" ;
}
}
 else if 
 (! EU4PI 
) 
 {        EU4PI = false;
} 
 else 
 {        HelperJ.anatropal = 7;
}

}


             
 if ( YDszd != null) 
 {        HelperJ.isidoid = 0;        

}
 else if 
 (HelperJ.isidoid < HelperJ.isidoid
 && HelperJ.isidoid < HelperJ.isidoid
) 
 {
 if (HelperJ.anatropal <= HelperJ.isidoid

) 
 {        if (HelperJ.isidoid != HelperJ.anatropal

) {
                    HelperJ.anatropal++;

            } else {
                    HelperJ.anatropal = 14;        

}



}
 else if 
 ( Q5Npo == null
 &&  ab7Xq == null
) 
 {        Q5Npo = "planographies" ;
} 
 else 
 {        HelperJ.isidoid++;
}

} 
 else 
 {
 if (HelperJ.anatropal < 4

) 
 {        Q5Npo = "obelism" ;
}
 else if 
 (HelperJ.isidoid <= HelperJ.anatropal
) 
 {        HelperJ.fariss = true;
} 
 else 
 {        Q5Npo = "";
}

}


                      if (! EU4PI 
 &&  Q5Npo .equals("thropples") ) {
            
 if ( EU4PI 
 ||  ab7Xq != null) 
 {        HelperJ.anatropal--;
}
 else if 
 (HelperJ.isidoid != HelperJ.isidoid

) 
 {        YDszd = "";
} 
 else 
 {        ab7Xq = "nonserviceable" .intern();
}


            } else {
                    if (HelperJ.anatropal == 14

 &&  YDszd .isEmpty() ) {
                    Q5Npo = "";

                     HelperJ.fariss = true;

                      ab7Xq = "";
}
}



}

 if ( HelperJ.pyrophyllites 
) 
 {        if ( YDszd != null ||  HelperJ.pyrophyllites 
) {
                    if (HelperJ.anatropal > 14

 &&  Q5Npo == null
) {
                    if ( HelperJ.parjanya == null
 ||  YDszd != null) {
                    HelperJ.anatropal++;

            } else {
            
 if ( Q5Npo == null
 &&  EU4PI 
) 
 {        YDszd = "";
}
 else if 
 (HelperJ.anatropal < 5

) 
 {        EU4PI =  false;
} 
 else 
 {        HelperJ.nonapostatizing = "";
}

}




             
 if ( HelperJ.phycochromophyceae != null ||  HelperJ.nonapostatizing != null) 
 {
 if (HelperJ.anatropal <= 9

 || 14 != HelperJ.anatropal
) 
 {        HelperJ.pyrophyllites = false;
}
 else if 
 (HelperJ.anatropal == HelperJ.isidoid
 ||  ab7Xq != null) 
 {        Q5Npo = "subchronically" ;
} 
 else 
 {        Q5Npo = "drants" ;
}

}
 else if 
 (HelperJ.isidoid < 10

) 
 {        EU4PI = true;
} 
 else 
 {        ab7Xq = "nonconformists" ;
}


                      if ( YDszd == null
 && HelperJ.isidoid != 14

) {
                    EU4PI = true;

                     EU4PI = false;

                      HelperJ.fariss = false;
}
}

            } else {
                    if ( YDszd == null
) {
                    if ( HelperJ.nonapostatizing != null ||  YDszd != null) {
                    HelperJ.anatropal -= 4;        


                     EU4PI = true;

                      HelperJ.pyrophyllites =  true;
}

            } else {
            
 if ( Q5Npo != null &&  Q5Npo == null
) 
 {        ab7Xq = "";
}
 else if 
 (! HelperJ.pyrophyllites 
 && HelperJ.anatropal != HelperJ.isidoid
) 
 {        HelperJ.phycochromophyceae = "latrations" ;
} 
 else 
 {        Q5Npo = "";
}

}



}



}
 else if 
 ( HelperJ.pyrophyllites 
 && ! HelperJ.phycochromophyceae .equals(YDszd) ) 
 {        if (! Q5Npo .equals("laureal") ) {
                    if ( Q5Npo .isEmpty()  ||  Q5Npo == null
) {
                    if ( HelperJ.parjanya == null
 || 4 != HelperJ.anatropal
) {
            
 if ( YDszd != null) 
 {        HelperJ.isidoid -= 1;        

}
 else if 
 (HelperJ.anatropal <= HelperJ.isidoid
) 
 {        HelperJ.isidoid = 3;
} 
 else 
 {        HelperJ.isidoid++;
}


            } else {
                    EU4PI =  true;
}




            } else {
                    HelperJ.isidoid--;
}




            } else {
                    EU4PI = false;
}



} 
 else 
 {
 if ( HelperJ.phycochromophyceae .isEmpty() ) 
 {
 if (HelperJ.anatropal <= HelperJ.anatropal

 &&  YDszd .equals(ab7Xq) ) 
 {        if ( EU4PI 
) {
                    HelperJ.pyrophyllites = ! true;

                     HelperJ.phycochromophyceae = "";

                      HelperJ.isidoid = 0;
}
}
 else if 
 ( Q5Npo .toUpperCase().isEmpty()  || HelperJ.isidoid <= 2

) 
 {        --HelperJ.isidoid;
} 
 else 
 {        EU4PI = ! false;
}

}
 else if 
 (! EU4PI 
) 
 {
 if ( HelperJ.parjanya != null ||  HelperJ.nonapostatizing == null
) 
 {        --HelperJ.anatropal;
}
 else if 
 (HelperJ.anatropal <= HelperJ.anatropal
) 
 {        ab7Xq = "outfreeman" .toUpperCase();
} 
 else 
 {        HelperJ.anatropal--;
}

} 
 else 
 {        Q5Npo = "buoyances" ;
}

}

        if (HelperJ.isidoid <= HelperJ.anatropal

) {
                    HelperJ.fariss = false;

            } else {
                    if ( HelperJ.phycochromophyceae == null
) {
                    if ( HelperJ.fariss 
 &&  EU4PI 
) {
            
 if ( EU4PI 
) 
 {
 if (HelperJ.anatropal == 1

) 
 {        EU4PI =  true;
}
 else if 
 ( YDszd != null) 
 {        HelperJ.anatropal = 3;
} 
 else 
 {        EU4PI = false;
}

}
 else if 
 ( HelperJ.pyrophyllites 
 ||  Q5Npo != null) 
 {        EU4PI =  true;
} 
 else 
 {        EU4PI = true;
}


             
 if (8 <= HelperJ.isidoid
 &&  YDszd .equals(ab7Xq) ) 
 {        HelperJ.fariss = true;
}
 else if 
 ( HelperJ.phycochromophyceae .equals("rebroadcast")  ||  ab7Xq == null
) 
 {        HelperJ.nonapostatizing = "";
} 
 else 
 {        YDszd = "";
}


                      HelperJ.isidoid++;
}

             
 if (HelperJ.anatropal <= HelperJ.isidoid
 &&  HelperJ.fariss 
) 
 {
 if ( YDszd != null || HelperJ.isidoid == 13

) 
 {        HelperJ.pyrophyllites = false;
}
 else if 
 (2 != HelperJ.anatropal
 &&  ab7Xq .isEmpty() ) 
 {        HelperJ.fariss =  true;
} 
 else 
 {        HelperJ.nonapostatizing = "";
}

}
 else if 
 ( HelperJ.nonapostatizing == null
 &&  HelperJ.nonapostatizing != null) 
 {        HelperJ.pyrophyllites = true;
} 
 else 
 {        HelperJ.pyrophyllites =  true;
}


                      if (HelperJ.anatropal < HelperJ.anatropal

) {
                    YDszd = "renegated" ;

                     HelperJ.isidoid = 13;        


                      HelperJ.parjanya = "";
}
}
}




         
    }

     
    public  void discommunities(String vorBn, String zgoB3, boolean O0BoV) {
                zgoB3 = "Semarang" ;

 if ( HelperJ.phycochromophyceae == null
 &&  HelperJ.nonapostatizing == null
) 
 {
 if (HelperJ.isidoid < HelperJ.anatropal
) 
 {        if ( zgoB3 == null
 &&  vorBn != null) {
                    if ( zgoB3 != null) {
                    if (! HelperJ.pyrophyllites 
) {
                    if (HelperJ.anatropal == 10

 ||  zgoB3 != null) {
                    HelperJ.anatropal--;

            } else {
                    zgoB3 = "";
}




            } else {
                    O0BoV = true;
}




             
 if ( vorBn == null
 && HelperJ.isidoid != 10

) 
 {        HelperJ.anatropal++;
}
 else if 
 (HelperJ.isidoid <= 2

 || HelperJ.isidoid <= HelperJ.anatropal
) 
 {        O0BoV = false;
} 
 else 
 {        HelperJ.anatropal = 13;        

}


                      --HelperJ.isidoid;
}

            } else {
                    HelperJ.isidoid = 13;        

}



}
 else if 
 ( zgoB3 .contains("carouse") ) 
 {
 if (HelperJ.isidoid > 2

) 
 {        if ( zgoB3 == null
) {
                    if ( vorBn == null
) {
                    HelperJ.isidoid += 1;        


            } else {
                    --HelperJ.anatropal;
}




            } else {
                    HelperJ.isidoid--;
}



}
 else if 
 (2 <= HelperJ.anatropal
 ||  HelperJ.phycochromophyceae == null
) 
 {
 if ( HelperJ.fariss 
 &&  zgoB3 != null) 
 {        O0BoV = true;
}
 else if 
 ( vorBn .isEmpty() ) 
 {        HelperJ.phycochromophyceae = "";
} 
 else 
 {        O0BoV = true;
}

} 
 else 
 {        HelperJ.anatropal++;
}

} 
 else 
 {        if ( zgoB3 == null
 || ! vorBn .equals("Mullens") ) {
                    if ( O0BoV 
) {
                    HelperJ.isidoid = 2;        


            } else {
                    zgoB3 = "thiophil" .trim();
}




                     HelperJ.isidoid = 4;        


                      O0BoV = true;
}
}

}
 else if 
 ( HelperJ.nonapostatizing != null) 
 {
 if (HelperJ.anatropal < 9

 && HelperJ.anatropal != HelperJ.isidoid
) 
 {
 if (! zgoB3 .contains("realters")  || HelperJ.anatropal > HelperJ.isidoid

) 
 {
 if ( zgoB3 == null
 && HelperJ.anatropal > 3

) 
 {        if (! zgoB3 .equals("phaser") ) {
                    HelperJ.isidoid--;

            } else {
                    HelperJ.anatropal--;
}



}
 else if 
 (6 <= HelperJ.isidoid
 &&  zgoB3 != null) 
 {        zgoB3 = "";
} 
 else 
 {        zgoB3 = "jiggling" ;
}

}
 else if 
 (HelperJ.anatropal > HelperJ.anatropal
) 
 {        if (2 != HelperJ.anatropal
) {
                    HelperJ.anatropal--;

                     O0BoV =  true;

                      vorBn = "";
}
} 
 else 
 {        HelperJ.isidoid = 5;        

}

}
 else if 
 ( zgoB3 != null) 
 {        HelperJ.isidoid = 4;
} 
 else 
 {
 if (HelperJ.isidoid > HelperJ.anatropal
 &&  HelperJ.phycochromophyceae == null
) 
 {        O0BoV = true;
}
 else if 
 (HelperJ.anatropal > HelperJ.isidoid
) 
 {        vorBn = "unmouthable" ;
} 
 else 
 {        HelperJ.anatropal = 3;        

}

}

} 
 else 
 {
 if ( zgoB3 == null
 && ! vorBn .isEmpty() ) 
 {        if (HelperJ.isidoid <= 1

 || 4 <= HelperJ.isidoid
) {
                    if ( HelperJ.phycochromophyceae .isEmpty() ) {
                    zgoB3 = "Marcelino" ;

            } else {
                    O0BoV =  false;
}




            } else {
                    vorBn = "retried" ;
}



}
 else if 
 ( O0BoV 
 || HelperJ.isidoid > HelperJ.anatropal
) 
 {
 if ( zgoB3 == null
 || HelperJ.anatropal <= 2

) 
 {        HelperJ.fariss = false;
}
 else if 
 (! HelperJ.fariss 
) 
 {        O0BoV =  false;
} 
 else 
 {        zgoB3 = "mesotropic" ;
}

} 
 else 
 {        HelperJ.isidoid--;
}

}

        if (HelperJ.isidoid == 11

 ||  zgoB3 != null) {
                    if (HelperJ.anatropal > HelperJ.anatropal

 ||  HelperJ.fariss 
) {
            
 if (! HelperJ.pyrophyllites 
) 
 {
 if ( zgoB3 == null
 && HelperJ.isidoid == 0

) 
 {        if (2 == HelperJ.isidoid
) {
            
 if (HelperJ.anatropal == HelperJ.isidoid
) 
 {        --HelperJ.isidoid;
}
 else if 
 ( HelperJ.pyrophyllites 
 && 7 > HelperJ.anatropal
) 
 {        vorBn = "";
} 
 else 
 {        zgoB3 = "";
}


            } else {
                    vorBn = "";
}



}
 else if 
 (HelperJ.isidoid > HelperJ.isidoid

 ||  zgoB3 != null) 
 {
 if (! zgoB3 .isEmpty()  && 14 != HelperJ.anatropal
) 
 {        O0BoV = true;
}
 else if 
 ( vorBn == null
 ||  HelperJ.nonapostatizing .equals("mesohippus") ) 
 {        HelperJ.isidoid++;
} 
 else 
 {        HelperJ.isidoid = 8;        

}

} 
 else 
 {        HelperJ.isidoid = 5;        

}

}
 else if 
 ( HelperJ.phycochromophyceae != null && ! O0BoV 
) 
 {        if (HelperJ.isidoid < 4

 || HelperJ.anatropal == HelperJ.anatropal

) {
            
 if (HelperJ.isidoid < HelperJ.anatropal
 ||  vorBn .equals(vorBn) ) 
 {        HelperJ.fariss = false;
}
 else if 
 ( vorBn .isEmpty()  &&  vorBn .isEmpty() ) 
 {        HelperJ.anatropal--;
} 
 else 
 {        --HelperJ.isidoid;
}


            } else {
                    zgoB3 = "scotomia" ;
}



} 
 else 
 {        if ( zgoB3 .isEmpty()  || HelperJ.isidoid > HelperJ.isidoid

) {
                    O0BoV = true;

                     zgoB3 = "";

                      HelperJ.phycochromophyceae = "";
}
}


                     HelperJ.isidoid = 12;        


                      O0BoV = true;
}

             
 if ( O0BoV 
 &&  O0BoV 
) 
 {        if ( O0BoV 
 &&  vorBn == null
) {
            
 if (HelperJ.anatropal != HelperJ.isidoid

) 
 {        O0BoV = false;
}
 else if 
 ( zgoB3 == null
 || HelperJ.anatropal == 10

) 
 {        ++HelperJ.anatropal;
} 
 else 
 {        zgoB3 = "";
}


            } else {
                    ++HelperJ.isidoid;
}



}
 else if 
 ( vorBn == null
 &&  HelperJ.nonapostatizing == null
) 
 {
 if (11 == HelperJ.isidoid
) 
 {        if ( HelperJ.parjanya != null &&  HelperJ.nonapostatizing != null) {
                    HelperJ.isidoid = 2;        


            } else {
                    ++HelperJ.anatropal;
}



}
 else if 
 ( HelperJ.nonapostatizing == null
) 
 {        vorBn = "";
} 
 else 
 {        zgoB3 = "acrobates" ;
}

} 
 else 
 {        if (HelperJ.anatropal < HelperJ.isidoid
) {
                    HelperJ.isidoid = 5;

            } else {
                    HelperJ.anatropal = 7;        

}



}


                      if ( vorBn == null
) {
                    HelperJ.isidoid--;

            } else {
            
 if ( HelperJ.phycochromophyceae .isEmpty()  && ! HelperJ.fariss 
) 
 {        HelperJ.anatropal = 3;
}
 else if 
 (10 == HelperJ.isidoid
) 
 {        vorBn = "";
} 
 else 
 {        zgoB3 = "coenthrone" ;
}

}



}
        if (HelperJ.anatropal <= HelperJ.isidoid
 &&  HelperJ.parjanya != null) {
            
 if (HelperJ.anatropal == HelperJ.anatropal

 || HelperJ.anatropal < 6

) 
 {        if (HelperJ.isidoid != HelperJ.isidoid

 ||  zgoB3 .isEmpty() ) {
                    if (HelperJ.anatropal < HelperJ.isidoid
) {
                    if ( HelperJ.fariss 
 ||  vorBn != null) {
                    if ( HelperJ.phycochromophyceae .equals(zgoB3) ) {
                    HelperJ.fariss = false;

                     vorBn = "";

                      zgoB3 = "";
}

            } else {
                    HelperJ.isidoid = 7;
}




                     if ( vorBn .equals("coitions")  && ! O0BoV 
) {
                    O0BoV = true;

            } else {
                    zgoB3 = "Hegira" ;
}




                      ++HelperJ.isidoid;
}

            } else {
                    if ( O0BoV 
 &&  zgoB3 .toUpperCase().isEmpty() ) {
                    vorBn = "quintupling" ;

            } else {
                    O0BoV = true;
}



}



}
 else if 
 (HelperJ.anatropal != 3

 &&  HelperJ.fariss 
) 
 {        ++HelperJ.anatropal;
} 
 else 
 {
 if (HelperJ.anatropal <= HelperJ.anatropal
) 
 {        if (HelperJ.anatropal < HelperJ.isidoid

 &&  zgoB3 != null) {
                    --HelperJ.anatropal;

            } else {
                    HelperJ.isidoid = 3;        

}



}
 else if 
 (! HelperJ.pyrophyllites 
) 
 {        O0BoV =  true;
} 
 else 
 {        HelperJ.anatropal++;
}

}


             
 if ( zgoB3 != null ||  O0BoV 
) 
 {        O0BoV = true;
}
 else if 
 (12 == HelperJ.anatropal
 ||  vorBn == null
) 
 {
 if (HelperJ.isidoid != HelperJ.anatropal
 || HelperJ.isidoid > HelperJ.isidoid
) 
 {        if ( vorBn == null
) {
                    zgoB3 = "";

            } else {
                    O0BoV = false;
}



}
 else if 
 ( zgoB3 .contains("veiliest") ) 
 {        O0BoV = true;
} 
 else 
 {        HelperJ.fariss =  true;
}

} 
 else 
 {
 if ( HelperJ.nonapostatizing .isEmpty()  &&  O0BoV 
) 
 {        HelperJ.isidoid++;
}
 else if 
 ( zgoB3 == null
) 
 {        zgoB3 = "";
} 
 else 
 {        --HelperJ.isidoid;
}

}


                      if (HelperJ.isidoid <= HelperJ.anatropal

) {
                    if ( zgoB3 == null
) {
                    if (HelperJ.isidoid != 12

 &&  vorBn != null) {
                    O0BoV = false;

            } else {
                    HelperJ.pyrophyllites = true;
}




                     O0BoV =  false;

                      HelperJ.isidoid--;
}

                     if ( HelperJ.parjanya .isEmpty() ) {
                    vorBn = "hypsistenocephaly" ;

            } else {
                    O0BoV = false;
}




                      HelperJ.anatropal = 9;
}
}

 if ( HelperJ.parjanya == null
) 
 {        ++HelperJ.isidoid;
}
 else if 
 (! HelperJ.pyrophyllites 
 && 3 > HelperJ.isidoid
) 
 {
 if (HelperJ.anatropal != 12

) 
 {
 if ( HelperJ.parjanya .contains(vorBn)  && 3 <= HelperJ.isidoid
) 
 {        HelperJ.anatropal = 1;
}
 else if 
 (10 == HelperJ.anatropal
) 
 {        if (HelperJ.isidoid <= 9

 && HelperJ.anatropal > 14

) {
                    vorBn = "";

                     HelperJ.isidoid = 6;

                      HelperJ.fariss = false;
}
} 
 else 
 {        O0BoV = ! true;
}

}
 else if 
 ( HelperJ.parjanya .equals(vorBn)  || ! O0BoV 
) 
 {
 if ( zgoB3 == null
) 
 {        if ( vorBn == null
 &&  HelperJ.parjanya == null
) {
                    O0BoV =  true;

                     HelperJ.fariss = ! false;

                      HelperJ.phycochromophyceae = "";
}
}
 else if 
 ( vorBn == null
 && HelperJ.anatropal == HelperJ.anatropal

) 
 {        HelperJ.anatropal = 2;
} 
 else 
 {        HelperJ.anatropal = 5;
}

} 
 else 
 {        if (2 <= HelperJ.isidoid
 &&  HelperJ.nonapostatizing != null) {
                    HelperJ.anatropal = 3;

            } else {
                    HelperJ.isidoid += 14;
}



}

} 
 else 
 {        if ( HelperJ.pyrophyllites 
 ||  HelperJ.fariss 
) {
            
 if (5 != HelperJ.anatropal
 || 3 == HelperJ.anatropal
) 
 {
 if (! HelperJ.nonapostatizing .equals(HelperJ.parjanya) ) 
 {        HelperJ.isidoid = 10;
}
 else if 
 ( zgoB3 .contains("epigastriums") ) 
 {        HelperJ.phycochromophyceae = "pachydermatosis" ;
} 
 else 
 {        vorBn = "";
}

}
 else if 
 ( zgoB3 == null
 && ! vorBn .contains("centreboard") ) 
 {        HelperJ.anatropal++;
} 
 else 
 {        O0BoV = true;
}


                     if ( HelperJ.parjanya != null) {
                    HelperJ.anatropal += 4;        


            } else {
                    vorBn = "misquality" .toLowerCase();
}




                      ++HelperJ.isidoid;
}
}


         
    }

     
    public  void preconcurred(boolean uwZVt, boolean dEbW9, boolean W8o5r) {
                if (! W8o5r 
 ||  HelperJ.nonapostatizing != null) {
                    if ( HelperJ.pyrophyllites 
 || ! HelperJ.nonapostatizing .contains(HelperJ.phycochromophyceae) ) {
                    if ( HelperJ.nonapostatizing != null) {
                    --HelperJ.anatropal;

             
 if ( HelperJ.parjanya != null) 
 {        if ( HelperJ.phycochromophyceae != null) {
                    HelperJ.isidoid++;

            } else {
                    uwZVt =  false;
}



}
 else if 
 ( HelperJ.parjanya != null) 
 {        HelperJ.anatropal -= 1;        

} 
 else 
 {        --HelperJ.anatropal;
}


                      if ( dEbW9 
) {
                    HelperJ.isidoid = 12;

                     dEbW9 = ! true;

                      HelperJ.isidoid--;
}
}

            } else {
            
 if ( uwZVt 
) 
 {        if (HelperJ.isidoid > 11

) {
                    if (14 > HelperJ.isidoid
 || HelperJ.isidoid < HelperJ.anatropal

) {
                    HelperJ.nonapostatizing = "";

                     W8o5r = true;

                      HelperJ.parjanya = "sulfotelluride" .toUpperCase();
}

                     HelperJ.anatropal--;

                      uwZVt = true;
}
}
 else if 
 ( uwZVt 
 ||  HelperJ.parjanya == null
) 
 {        if ( HelperJ.phycochromophyceae == null
 || HelperJ.anatropal < HelperJ.anatropal
) {
                    HelperJ.phycochromophyceae = "";

                     HelperJ.anatropal--;

                      W8o5r = true;
}
} 
 else 
 {        uwZVt = true;
}

}




            } else {
            
 if (HelperJ.isidoid < HelperJ.anatropal

) 
 {        if ( HelperJ.nonapostatizing == null
) {
                    if ( W8o5r 
 || ! HelperJ.phycochromophyceae .equals(HelperJ.parjanya) ) {
                    if (HelperJ.isidoid < HelperJ.isidoid
 || ! uwZVt 
) {
                    HelperJ.phycochromophyceae = "";

            } else {
                    HelperJ.parjanya = "stimulatingly" ;
}




            } else {
                    HelperJ.nonapostatizing = "discomposingly" ;
}




            } else {
            
 if (12 <= HelperJ.isidoid
 ||  HelperJ.phycochromophyceae != null) 
 {        --HelperJ.isidoid;
}
 else if 
 ( HelperJ.phycochromophyceae .isEmpty()  &&  HelperJ.parjanya == null
) 
 {        HelperJ.anatropal--;
} 
 else 
 {        HelperJ.nonapostatizing = "prefigurement" ;
}

}



}
 else if 
 ( HelperJ.parjanya != null) 
 {
 if ( HelperJ.parjanya .intern().equals(HelperJ.parjanya) ) 
 {        if ( HelperJ.parjanya != null &&  HelperJ.pyrophyllites 
) {
                    HelperJ.nonapostatizing = "";

            } else {
                    ++HelperJ.isidoid;
}



}
 else if 
 ( HelperJ.nonapostatizing == null
) 
 {        HelperJ.phycochromophyceae = "loudliest" ;
} 
 else 
 {        HelperJ.phycochromophyceae = "";
}

} 
 else 
 {        uwZVt = true;
}

}



        HelperJ.nonapostatizing = "";
        if ( HelperJ.nonapostatizing == null
 && HelperJ.isidoid <= 8

) {
                    HelperJ.pyrophyllites = false;

            } else {
                    HelperJ.nonapostatizing = "";
}



        if (8 <= HelperJ.isidoid
) {
            
 if ( dEbW9 
) 
 {
 if (! HelperJ.phycochromophyceae .isEmpty()  && 1 > HelperJ.isidoid
) 
 {        if (HelperJ.isidoid == 6

 ||  HelperJ.nonapostatizing .toLowerCase().contains("outbreathe") ) {
                    if ( HelperJ.phycochromophyceae != null && HelperJ.anatropal == HelperJ.isidoid

) {
                    if (HelperJ.isidoid == HelperJ.anatropal

 || 5 <= HelperJ.isidoid
) {
                    HelperJ.phycochromophyceae = "";

                     HelperJ.isidoid = 5;

                      W8o5r =  true;
}

            } else {
                    HelperJ.isidoid = 13;
}




             
 if ( HelperJ.parjanya == null
 &&  HelperJ.parjanya == null
) 
 {        HelperJ.nonapostatizing = "";
}
 else if 
 (! HelperJ.parjanya .contains(HelperJ.phycochromophyceae) ) 
 {        uwZVt = false;
} 
 else 
 {        dEbW9 = false;
}


                      uwZVt = true;
}
}
 else if 
 (HelperJ.anatropal == HelperJ.anatropal
 || 9 != HelperJ.isidoid
) 
 {        if ( HelperJ.phycochromophyceae != null) {
                    if ( HelperJ.parjanya != null || 9 <= HelperJ.isidoid
) {
                    HelperJ.parjanya = "";

            } else {
                    dEbW9 =  true;
}




            } else {
                    HelperJ.parjanya = "";
}



} 
 else 
 {        HelperJ.phycochromophyceae = "dirhems" ;
}

}
 else if 
 ( HelperJ.nonapostatizing .contains(HelperJ.nonapostatizing)  ||  HelperJ.nonapostatizing != null) 
 {        if ( HelperJ.parjanya == null
 || HelperJ.isidoid <= HelperJ.isidoid
) {
                    if ( HelperJ.phycochromophyceae .isEmpty()  ||  HelperJ.phycochromophyceae != null) {
                    if ( HelperJ.nonapostatizing != null &&  HelperJ.nonapostatizing != null) {
                    dEbW9 =  true;

            } else {
                    HelperJ.phycochromophyceae = "";
}




            } else {
                    HelperJ.anatropal = 0;
}




            } else {
                    if ( HelperJ.nonapostatizing != null || HelperJ.anatropal != 9

) {
                    dEbW9 =  true;

                     ++HelperJ.anatropal;

                      HelperJ.nonapostatizing = "";
}
}



} 
 else 
 {        if (HelperJ.anatropal <= HelperJ.isidoid
) {
            
 if ( W8o5r 
 && HelperJ.isidoid <= 9

) 
 {        HelperJ.phycochromophyceae = "lusatian" ;
}
 else if 
 (HelperJ.anatropal < 7

 || 14 > HelperJ.isidoid
) 
 {        uwZVt = true;
} 
 else 
 {        HelperJ.phycochromophyceae = "recklessnesses" ;
}


                     HelperJ.phycochromophyceae = "cardiocarpum" ;

                      HelperJ.nonapostatizing = "swaggerings" ;
}
}


            } else {
                    if ( HelperJ.nonapostatizing .contains(HelperJ.phycochromophyceae) ) {
            
 if (! HelperJ.nonapostatizing .equals(HelperJ.phycochromophyceae)  && HelperJ.anatropal > HelperJ.isidoid

) 
 {        HelperJ.nonapostatizing = "spokesmanship" ;
}
 else if 
 (! HelperJ.nonapostatizing .contains(HelperJ.phycochromophyceae) ) 
 {        if (HelperJ.isidoid < 13

 && HelperJ.anatropal <= HelperJ.anatropal
) {
                    uwZVt = true;

                     HelperJ.isidoid = 13;

                      HelperJ.parjanya = "dermatographism" ;
}
} 
 else 
 {        HelperJ.parjanya = "";
}


            } else {
                    if (HelperJ.isidoid == HelperJ.anatropal
) {
                    HelperJ.nonapostatizing = "";

            } else {
                    HelperJ.nonapostatizing = "";
}



}



}




         
    }

     
    public  void mantic(String jSJBy, String oHCN2, boolean ADTfZ) {
                if (5 < HelperJ.isidoid
 &&  oHCN2 != null) {
            
 if ( HelperJ.fariss 
) 
 {
 if ( ADTfZ 
 && ! HelperJ.phycochromophyceae .equals(oHCN2) ) 
 {
 if ( oHCN2 .contains("theriodont")  || HelperJ.anatropal > HelperJ.anatropal
) 
 {        HelperJ.nonapostatizing = "";
}
 else if 
 ( oHCN2 != null || 1 > HelperJ.isidoid
) 
 {        if ( jSJBy .contains(jSJBy)  ||  ADTfZ 
) {
                    HelperJ.anatropal--;

                     oHCN2 = "grapewort" ;

                      ADTfZ =  false;
}
} 
 else 
 {        ADTfZ = true;
}

}
 else if 
 ( HelperJ.phycochromophyceae != null ||  jSJBy == null
) 
 {        if ( ADTfZ 
) {
                    ADTfZ = ! true;

            } else {
                    jSJBy = "epexegesis" ;
}



} 
 else 
 {        if (11 > HelperJ.isidoid
) {
                    ADTfZ =  false;

            } else {
                    ADTfZ = ! false;
}



}

}
 else if 
 (HelperJ.isidoid <= HelperJ.isidoid

 ||  jSJBy != null) 
 {
 if ( oHCN2 == null
) 
 {
 if (1 == HelperJ.isidoid
) 
 {        if ( HelperJ.parjanya != null &&  HelperJ.parjanya != null) {
                    ADTfZ =  false;

                     ADTfZ =  false;

                      jSJBy = "synkaryons" ;
}
}
 else if 
 (HelperJ.anatropal != HelperJ.anatropal

 && HelperJ.isidoid < 2

) 
 {        --HelperJ.anatropal;
} 
 else 
 {        jSJBy = "";
}

}
 else if 
 ( oHCN2 .isEmpty()  &&  jSJBy != null) 
 {        if ( HelperJ.parjanya != null) {
                    HelperJ.phycochromophyceae = "samlets" ;

            } else {
                    oHCN2 = "";
}



} 
 else 
 {        HelperJ.nonapostatizing = "";
}

} 
 else 
 {        if (HelperJ.isidoid < HelperJ.isidoid
) {
                    if (HelperJ.isidoid <= 11

) {
                    HelperJ.fariss =  true;

                     oHCN2 = "Kathye" ;

                      ADTfZ =  true;
}

                     oHCN2 = "";

                      ADTfZ = ! false;
}
}


                     if (HelperJ.anatropal > 2

) {
                    if ( oHCN2 .equals("mahsur")  &&  oHCN2 == null
) {
            
 if (13 == HelperJ.isidoid
 &&  jSJBy .isEmpty() ) 
 {        if (HelperJ.isidoid > 3

 && HelperJ.anatropal != HelperJ.anatropal
) {
                    ++HelperJ.isidoid;

                     jSJBy = "";

                      HelperJ.parjanya = "";
}
}
 else if 
 ( ADTfZ 
) 
 {        ADTfZ =  true;
} 
 else 
 {        HelperJ.isidoid++;
}


            } else {
            
 if (4 > HelperJ.isidoid
) 
 {        HelperJ.phycochromophyceae = "";
}
 else if 
 (HelperJ.anatropal == 11

) 
 {        jSJBy = "";
} 
 else 
 {        jSJBy = "";
}

}




                     if (! ADTfZ 
 &&  oHCN2 == null
) {
            
 if ( oHCN2 != null) 
 {        HelperJ.pyrophyllites = true;
}
 else if 
 ( oHCN2 .equals("mercerized") ) 
 {        ADTfZ = true;
} 
 else 
 {        oHCN2 = "";
}


                     HelperJ.anatropal++;

                      oHCN2 = "quebracho" ;
}

                      oHCN2 = "";
}

                      if ( oHCN2 != null ||  oHCN2 .isEmpty() ) {
                    if ( ADTfZ 
 &&  ADTfZ 
) {
                    HelperJ.nonapostatizing = "fantassin" ;

            } else {
                    jSJBy = "";
}




                     if (HelperJ.anatropal <= HelperJ.isidoid

) {
                    ADTfZ = false;

            } else {
                    ++HelperJ.isidoid;
}




                      HelperJ.isidoid += 6;
}
}

 if ( HelperJ.phycochromophyceae == null
) 
 {        if (2 < HelperJ.isidoid
 && HelperJ.isidoid <= 2

) {
            
 if ( jSJBy != null || HelperJ.isidoid <= 4

) 
 {        if ( oHCN2 != null) {
                    if ( oHCN2 .isEmpty()  &&  jSJBy != null) {
                    if (HelperJ.isidoid > HelperJ.anatropal

 || ! jSJBy .contains(HelperJ.phycochromophyceae) ) {
                    --HelperJ.isidoid;

            } else {
                    HelperJ.anatropal++;
}




            } else {
                    ADTfZ =  true;
}




            } else {
                    if ( jSJBy == null
 ||  oHCN2 != null) {
                    HelperJ.nonapostatizing = "";

            } else {
                    HelperJ.nonapostatizing = "";
}



}



}
 else if 
 (HelperJ.isidoid <= HelperJ.isidoid
) 
 {        if ( HelperJ.parjanya != null) {
                    if ( jSJBy != null &&  oHCN2 == null
) {
                    ADTfZ = true;

                     ADTfZ = true;

                      jSJBy = "";
}

                     oHCN2 = "";

                      ADTfZ = true;
}
} 
 else 
 {        if (5 <= HelperJ.anatropal
) {
                    HelperJ.isidoid = 8;

            } else {
                    ADTfZ = false;
}



}


            } else {
                    if ( ADTfZ 
 &&  jSJBy != null) {
                    if ( ADTfZ 
) {
                    if ( ADTfZ 
) {
                    --HelperJ.anatropal;

                     oHCN2 = "produceable" ;

                      HelperJ.anatropal++;
}

            } else {
                    jSJBy = "";
}




            } else {
                    --HelperJ.anatropal;
}



}



}
 else if 
 ( HelperJ.pyrophyllites 
) 
 {
 if ( oHCN2 .contains(HelperJ.nonapostatizing) ) 
 {        if ( jSJBy .isEmpty()  || ! jSJBy .isEmpty() ) {
            
 if ( HelperJ.parjanya .equals("ericales")  && 5 > HelperJ.isidoid
) 
 {        ++HelperJ.anatropal;
}
 else if 
 ( jSJBy == null
) 
 {        oHCN2 = "";
} 
 else 
 {        HelperJ.isidoid = 13;        

}


                     if ( oHCN2 != null) {
                    jSJBy = "spined" ;

                     ADTfZ = false;

                      HelperJ.anatropal--;
}

                      HelperJ.anatropal -= 11;        

}
}
 else if 
 (HelperJ.anatropal <= HelperJ.isidoid
 &&  HelperJ.nonapostatizing == null
) 
 {        if ( oHCN2 == null
) {
                    ++HelperJ.anatropal;

            } else {
                    ADTfZ = true;
}



} 
 else 
 {        if (HelperJ.anatropal != 11

 ||  ADTfZ 
) {
                    HelperJ.anatropal--;

                     ADTfZ =  false;

                      --HelperJ.anatropal;
}
}

} 
 else 
 {        if ( HelperJ.pyrophyllites 
 &&  oHCN2 != null) {
                    if (HelperJ.isidoid > 11

 &&  HelperJ.phycochromophyceae != null) {
                    HelperJ.pyrophyllites = true;

            } else {
                    jSJBy = "";
}




                     if ( HelperJ.nonapostatizing .isEmpty()  &&  HelperJ.parjanya .contains(oHCN2) ) {
                    oHCN2 = "polyalcohol" ;

            } else {
                    HelperJ.nonapostatizing = "revalued" ;
}




                      ADTfZ =  true;
}
}

        if (HelperJ.anatropal <= HelperJ.isidoid
) {
                    if (! ADTfZ 
 ||  HelperJ.phycochromophyceae == null
) {
            
 if (HelperJ.isidoid <= HelperJ.anatropal

) 
 {
 if (HelperJ.anatropal <= HelperJ.anatropal

) 
 {
 if (3 < HelperJ.isidoid
) 
 {
 if (! ADTfZ 
 || HelperJ.anatropal > 6

) 
 {        HelperJ.parjanya = "";
}
 else if 
 ( jSJBy != null) 
 {        HelperJ.anatropal = 14;        

} 
 else 
 {        ADTfZ = false;
}

}
 else if 
 ( jSJBy != null) 
 {        jSJBy = "pseudoaggressively" ;
} 
 else 
 {        HelperJ.pyrophyllites = true;
}

}
 else if 
 ( HelperJ.pyrophyllites 
) 
 {
 if (HelperJ.isidoid <= HelperJ.isidoid

 &&  ADTfZ 
) 
 {        ++HelperJ.anatropal;
}
 else if 
 (HelperJ.isidoid < HelperJ.anatropal

) 
 {        jSJBy = "";
} 
 else 
 {        HelperJ.parjanya = "Vaiden" ;
}

} 
 else 
 {        ADTfZ = false;
}

}
 else if 
 (12 < HelperJ.anatropal
) 
 {        if (HelperJ.isidoid <= HelperJ.anatropal

) {
            
 if ( oHCN2 .contains("neurohormone") ) 
 {        HelperJ.anatropal = 3;        

}
 else if 
 ( HelperJ.nonapostatizing == null
) 
 {        ADTfZ = false;
} 
 else 
 {        ++HelperJ.isidoid;
}


                     HelperJ.anatropal++;

                      jSJBy = "";
}
} 
 else 
 {
 if (13 <= HelperJ.anatropal
) 
 {        ADTfZ = false;
}
 else if 
 (8 != HelperJ.anatropal
 && HelperJ.anatropal < HelperJ.anatropal
) 
 {        HelperJ.isidoid = 8;
} 
 else 
 {        oHCN2 = "";
}

}


            } else {
            
 if ( oHCN2 != null &&  oHCN2 != null) 
 {
 if ( oHCN2 != null) 
 {        ADTfZ = true;
}
 else if 
 ( jSJBy == null
 &&  jSJBy != null) 
 {        ADTfZ = true;
} 
 else 
 {        HelperJ.anatropal = 5;        

}

}
 else if 
 ( jSJBy != null) 
 {        if ( jSJBy .isEmpty() ) {
                    ADTfZ =  false;

                     HelperJ.phycochromophyceae = "";

                      HelperJ.pyrophyllites =  true;
}
} 
 else 
 {        HelperJ.anatropal++;
}

}




            } else {
                    if ( oHCN2 == null
) {
                    if (HelperJ.isidoid == HelperJ.anatropal
) {
                    if ( ADTfZ 
) {
            
 if ( HelperJ.phycochromophyceae .contains("prosit")  ||  oHCN2 == null
) 
 {        jSJBy = "nonubiquitously" ;
}
 else if 
 ( HelperJ.fariss 
) 
 {        jSJBy = "";
} 
 else 
 {        HelperJ.fariss =  true;
}


                     HelperJ.isidoid--;

                      jSJBy = "";
}

            } else {
                    if ( oHCN2 != null) {
                    HelperJ.fariss = false;

            } else {
                    ADTfZ = true;
}



}




            } else {
                    HelperJ.anatropal++;
}



}



        if ( jSJBy == null
 &&  jSJBy != null) {
                    if ( HelperJ.phycochromophyceae != null &&  HelperJ.parjanya == null
) {
                    oHCN2 = "";

            } else {
                    if (HelperJ.anatropal > HelperJ.anatropal
) {
                    if ( jSJBy != null) {
                    oHCN2 = "adeeming" ;

            } else {
                    jSJBy = "chlorohydroquinone" ;
}




                     if ( oHCN2 .isEmpty() ) {
                    ADTfZ = true;

                     jSJBy = "cervisia" .toUpperCase();

                      ADTfZ = true;
}

                      HelperJ.parjanya = "unmeetness" ;
}
}




            } else {
                    if (14 != HelperJ.isidoid
) {
                    if ( oHCN2 == null
) {
            
 if ( ADTfZ 
 && ! ADTfZ 
) 
 {        if (HelperJ.anatropal != HelperJ.isidoid

) {
                    HelperJ.fariss = true;

            } else {
                    ADTfZ = ! false;
}



}
 else if 
 ( oHCN2 .isEmpty()  && HelperJ.anatropal <= 0

) 
 {        --HelperJ.anatropal;
} 
 else 
 {        ++HelperJ.anatropal;
}


                     if ( HelperJ.phycochromophyceae == null
 ||  ADTfZ 
) {
                    oHCN2 = "sisyridae" ;

            } else {
                    ADTfZ = false;
}




                      HelperJ.parjanya = "rougeberry" .intern();
}

                     oHCN2 = "uncooperative" ;

                      if ( oHCN2 == null
) {
                    oHCN2 = "selenological" ;

            } else {
                    jSJBy = "mizzonites" ;
}



}
}



        HelperJ.pyrophyllites = true;
        oHCN2 = "duets" ;

         
    }

     
    public  void selt(boolean hxjG1, String oBc5u) {
                if (HelperJ.anatropal < HelperJ.isidoid
) {
                    if ( HelperJ.phycochromophyceae == null
 ||  HelperJ.nonapostatizing == null
) {
                    if ( oBc5u .isEmpty()  ||  HelperJ.phycochromophyceae .equals(HelperJ.nonapostatizing) ) {
                    if ( hxjG1 
 && ! HelperJ.phycochromophyceae .equals(HelperJ.phycochromophyceae) ) {
            
 if ( oBc5u .contains("scrieveboards")  &&  HelperJ.phycochromophyceae == null
) 
 {        if ( HelperJ.phycochromophyceae == null
 ||  HelperJ.parjanya .equals(HelperJ.parjanya) ) {
                    hxjG1 = true;

                     HelperJ.isidoid--;

                      HelperJ.anatropal += 1;        

}
}
 else if 
 ( oBc5u != null) 
 {        --HelperJ.isidoid;
} 
 else 
 {        hxjG1 = false;
}


             
 if ( oBc5u != null) 
 {        oBc5u = "";
}
 else if 
 ( oBc5u == null
) 
 {        HelperJ.parjanya = "";
} 
 else 
 {        HelperJ.phycochromophyceae = "fatalist" ;
}


                      oBc5u = "";
}

            } else {
                    if (HelperJ.anatropal <= HelperJ.isidoid

 && HelperJ.isidoid != HelperJ.anatropal
) {
                    if (! oBc5u .contains(oBc5u)  && HelperJ.anatropal <= 13

) {
                    HelperJ.pyrophyllites = true;

                     HelperJ.isidoid = 0;        


                      HelperJ.anatropal = 8;
}

            } else {
                    HelperJ.anatropal = 3;        

}



}




                     if ( HelperJ.parjanya .equals("silverberry") ) {
                    if (HelperJ.anatropal > HelperJ.isidoid
 ||  hxjG1 
) {
                    if (HelperJ.isidoid < HelperJ.isidoid
) {
                    HelperJ.isidoid--;

            } else {
                    oBc5u = "";
}




                     hxjG1 = ! false;

                      oBc5u = "";
}

                     if (HelperJ.isidoid != HelperJ.anatropal
 ||  HelperJ.fariss 
) {
                    HelperJ.anatropal++;

            } else {
                    HelperJ.isidoid = 3;
}




                      HelperJ.nonapostatizing = "";
}

              
 if (HelperJ.anatropal <= 2

) 
 {        if ( hxjG1 
) {
                    hxjG1 =  false;

            } else {
                    HelperJ.isidoid = 1;
}



}
 else if 
 ( HelperJ.phycochromophyceae .isEmpty()  ||  oBc5u != null) 
 {        HelperJ.anatropal = 2;
} 
 else 
 {        HelperJ.isidoid++;
}

}

             
 if ( HelperJ.parjanya == null
) 
 {        if ( HelperJ.pyrophyllites 
 &&  HelperJ.nonapostatizing .equals("ideologies") ) {
                    if (HelperJ.anatropal == HelperJ.anatropal
) {
            
 if ( HelperJ.parjanya .contains(oBc5u) ) 
 {        HelperJ.anatropal++;
}
 else if 
 ( oBc5u .equals(oBc5u) ) 
 {        HelperJ.parjanya = "undercourtier" ;
} 
 else 
 {        HelperJ.fariss =  false;
}


                     hxjG1 =  false;

                      HelperJ.phycochromophyceae = "Edwyna" ;
}

             
 if (HelperJ.anatropal <= 11

 || ! HelperJ.phycochromophyceae .equals(oBc5u) ) 
 {        HelperJ.phycochromophyceae = "";
}
 else if 
 ( oBc5u == null
) 
 {        oBc5u = "compassionated" ;
} 
 else 
 {        HelperJ.parjanya = "";
}


                      HelperJ.pyrophyllites = false;
}
}
 else if 
 ( hxjG1 
 || HelperJ.isidoid < 1

) 
 {        if (HelperJ.anatropal <= HelperJ.anatropal

) {
            
 if (HelperJ.isidoid > HelperJ.isidoid

 && ! HelperJ.nonapostatizing .contains(HelperJ.parjanya) ) 
 {        oBc5u = "cinemas" ;
}
 else if 
 ( oBc5u != null) 
 {        ++HelperJ.isidoid;
} 
 else 
 {        hxjG1 = false;
}


            } else {
                    hxjG1 = false;
}



} 
 else 
 {
 if ( oBc5u != null) 
 {        hxjG1 = true;
}
 else if 
 ( oBc5u != null && HelperJ.anatropal < HelperJ.anatropal
) 
 {        hxjG1 = true;
} 
 else 
 {        HelperJ.isidoid += 6;
}

}


              
 if ( hxjG1 
 ||  HelperJ.nonapostatizing != null) 
 {        if ( oBc5u .contains("reappreciate") ) {
            
 if ( oBc5u != null && HelperJ.isidoid <= HelperJ.anatropal

) 
 {        HelperJ.parjanya = "chlamydera" ;
}
 else if 
 (! oBc5u .contains("psychagogic")  ||  oBc5u == null
) 
 {        oBc5u = "";
} 
 else 
 {        HelperJ.nonapostatizing = "piltock" ;
}


            } else {
                    HelperJ.isidoid++;
}



}
 else if 
 ( HelperJ.phycochromophyceae != null) 
 {        hxjG1 = false;
} 
 else 
 {        HelperJ.fariss = true;
}

}

         
    }

     
    public  void vomica(boolean G9t7h, String XU6R6, int uwsYL) {
        
         
    }

     
    public  void nipcheese(boolean itjsY) {
                HelperJ.nonapostatizing = "palaeontographic" ;
        HelperJ.parjanya = "yuchier" ;
        if ( HelperJ.phycochromophyceae == null
 && HelperJ.isidoid != HelperJ.isidoid

) {
                    if ( HelperJ.nonapostatizing != null ||  HelperJ.phycochromophyceae .intern().equals(HelperJ.parjanya) ) {
                    if (! HelperJ.pyrophyllites 
) {
                    if ( HelperJ.nonapostatizing != null) {
                    if ( HelperJ.parjanya != null) {
            
 if ( HelperJ.nonapostatizing != null) 
 {        HelperJ.anatropal++;
}
 else if 
 (10 <= HelperJ.isidoid
 &&  itjsY 
) 
 {        ++HelperJ.anatropal;
} 
 else 
 {        HelperJ.parjanya = "Morissa" ;
}


                     HelperJ.nonapostatizing = "";

                      itjsY = true;
}

            } else {
            
 if ( HelperJ.nonapostatizing != null) 
 {        --HelperJ.isidoid;
}
 else if 
 ( HelperJ.nonapostatizing == null
 ||  HelperJ.parjanya != null) 
 {        HelperJ.phycochromophyceae = "Nimrodic" ;
} 
 else 
 {        itjsY = true;
}

}




             
 if (11 <= HelperJ.isidoid
) 
 {        if (HelperJ.anatropal != HelperJ.anatropal
 && HelperJ.isidoid != 11

) {
                    HelperJ.anatropal = 14;        


            } else {
                    HelperJ.isidoid = 14;        

}



}
 else if 
 ( itjsY 
) 
 {        HelperJ.anatropal -= 5;        

} 
 else 
 {        HelperJ.anatropal--;
}


              
 if (2 <= HelperJ.anatropal
) 
 {        itjsY = false;
}
 else if 
 ( HelperJ.phycochromophyceae != null &&  HelperJ.pyrophyllites 
) 
 {        HelperJ.nonapostatizing = "saucepot" ;
} 
 else 
 {        ++HelperJ.anatropal;
}

}

             
 if ( HelperJ.parjanya != null) 
 {        if ( HelperJ.fariss 
 ||  HelperJ.parjanya == null
) {
                    if (! itjsY 
 &&  HelperJ.parjanya == null
) {
                    itjsY = true;

                     HelperJ.anatropal = 14;

                      --HelperJ.anatropal;
}

                     itjsY = ! false;

                      HelperJ.fariss = true;
}
}
 else if 
 ( HelperJ.parjanya != null) 
 {
 if (HelperJ.anatropal <= HelperJ.anatropal

) 
 {        itjsY = true;
}
 else if 
 (10 > HelperJ.isidoid
) 
 {        HelperJ.isidoid--;
} 
 else 
 {        itjsY = true;
}

} 
 else 
 {        HelperJ.isidoid++;
}


                      if ( HelperJ.parjanya .isEmpty()  ||  HelperJ.phycochromophyceae != null) {
            
 if (HelperJ.anatropal < 8

 || HelperJ.isidoid == HelperJ.isidoid

) 
 {        HelperJ.pyrophyllites = false;
}
 else if 
 (HelperJ.isidoid > HelperJ.anatropal
 && 6 == HelperJ.anatropal
) 
 {        HelperJ.parjanya = "";
} 
 else 
 {        HelperJ.isidoid = 6;        

}


            } else {
                    itjsY =  false;
}



}

             
 if ( itjsY 
) 
 {
 if ( itjsY 
 && ! HelperJ.nonapostatizing .contains(HelperJ.parjanya) ) 
 {        if ( itjsY 
 ||  HelperJ.parjanya != null) {
                    if (12 > HelperJ.anatropal
 || 11 > HelperJ.anatropal
) {
                    HelperJ.phycochromophyceae = "";

                     ++HelperJ.anatropal;

                      HelperJ.parjanya = "viragolike" ;
}

                     HelperJ.nonapostatizing = "";

                      itjsY = true;
}
}
 else if 
 ( HelperJ.nonapostatizing != null) 
 {
 if (HelperJ.isidoid > HelperJ.isidoid
 || ! itjsY 
) 
 {        --HelperJ.isidoid;
}
 else if 
 (HelperJ.anatropal == 2

 &&  HelperJ.phycochromophyceae == null
) 
 {        HelperJ.anatropal++;
} 
 else 
 {        ++HelperJ.isidoid;
}

} 
 else 
 {        HelperJ.isidoid = 13;        

}

}
 else if 
 ( itjsY 
) 
 {        if (HelperJ.isidoid < HelperJ.isidoid
 ||  HelperJ.parjanya != null) {
                    if (HelperJ.isidoid != 4

) {
                    itjsY = true;

            } else {
                    HelperJ.nonapostatizing = "";
}




            } else {
                    HelperJ.isidoid--;
}



} 
 else 
 {
 if (HelperJ.isidoid <= HelperJ.isidoid
) 
 {        HelperJ.parjanya = "";
}
 else if 
 ( HelperJ.phycochromophyceae == null
) 
 {        HelperJ.phycochromophyceae = "paradises" ;
} 
 else 
 {        HelperJ.isidoid = 7;
}

}


              
 if ( HelperJ.nonapostatizing .equals(HelperJ.parjanya) ) 
 {        if (! HelperJ.pyrophyllites 
) {
                    if (11 > HelperJ.isidoid
) {
                    HelperJ.parjanya = "";

            } else {
                    HelperJ.fariss = false;
}




                     HelperJ.nonapostatizing = "cellulosic" ;

                      HelperJ.nonapostatizing = "";
}
}
 else if 
 ( HelperJ.pyrophyllites 
 || HelperJ.isidoid != HelperJ.isidoid

) 
 {        if ( HelperJ.fariss 
 &&  HelperJ.parjanya == null
) {
                    HelperJ.fariss =  true;

                     HelperJ.isidoid -= 14;

                      HelperJ.phycochromophyceae = "Levantines" ;
}
} 
 else 
 {        HelperJ.nonapostatizing = "";
}

}
        HelperJ.isidoid = 5;        

        if ( itjsY 
 ||  HelperJ.nonapostatizing == null
) {
            
 if ( itjsY 
 &&  HelperJ.parjanya == null
) 
 {
 if (! HelperJ.pyrophyllites 
 || HelperJ.anatropal <= 7

) 
 {        if ( HelperJ.phycochromophyceae != null && ! HelperJ.phycochromophyceae .isEmpty() ) {
                    if ( itjsY 
 &&  itjsY 
) {
                    if ( HelperJ.phycochromophyceae .contains("quinanisole") ) {
                    --HelperJ.isidoid;

            } else {
                    itjsY = true;
}




                     itjsY = false;

                      HelperJ.isidoid = 1;
}

            } else {
                    if ( HelperJ.phycochromophyceae != null) {
                    itjsY = false;

            } else {
                    HelperJ.phycochromophyceae = "";
}



}



}
 else if 
 ( HelperJ.nonapostatizing == null
) 
 {
 if (HelperJ.isidoid <= HelperJ.anatropal
) 
 {        if (HelperJ.anatropal > 10

) {
                    itjsY = false;

                     HelperJ.pyrophyllites = false;

                      HelperJ.parjanya = "";
}
}
 else if 
 (3 < HelperJ.anatropal
) 
 {        HelperJ.parjanya = "beastlier" ;
} 
 else 
 {        HelperJ.anatropal--;
}

} 
 else 
 {        HelperJ.isidoid = 7;        

}

}
 else if 
 ( HelperJ.nonapostatizing == null
 && HelperJ.anatropal > HelperJ.anatropal

) 
 {        if ( itjsY 
 &&  HelperJ.nonapostatizing .isEmpty() ) {
                    if (HelperJ.isidoid > HelperJ.anatropal
 || HelperJ.anatropal <= HelperJ.isidoid
) {
            
 if (! HelperJ.parjanya .toUpperCase().equals("shawwal")  && 11 != HelperJ.anatropal
) 
 {        HelperJ.nonapostatizing = "untorridity" ;
}
 else if 
 ( HelperJ.nonapostatizing != null) 
 {        itjsY =  true;
} 
 else 
 {        HelperJ.isidoid = 4;
}


            } else {
                    HelperJ.anatropal -= 8;
}




            } else {
                    if (HelperJ.anatropal <= HelperJ.isidoid

) {
                    HelperJ.phycochromophyceae = "mystic" ;

            } else {
                    HelperJ.fariss = true;
}



}



} 
 else 
 {
 if ( HelperJ.pyrophyllites 
 || HelperJ.isidoid > HelperJ.anatropal

) 
 {
 if (HelperJ.anatropal <= HelperJ.anatropal

 ||  itjsY 
) 
 {        HelperJ.isidoid = 9;        

}
 else if 
 ( HelperJ.parjanya != null) 
 {        itjsY = false;
} 
 else 
 {        HelperJ.anatropal += 8;        

}

}
 else if 
 ( HelperJ.parjanya == null
 && HelperJ.isidoid == HelperJ.anatropal
) 
 {        HelperJ.anatropal = 6;
} 
 else 
 {        ++HelperJ.isidoid;
}

}


            } else {
                    if (HelperJ.anatropal < HelperJ.anatropal

 ||  HelperJ.parjanya == null
) {
                    if (HelperJ.anatropal < HelperJ.isidoid

) {
                    if (6 > HelperJ.anatropal
 && 12 != HelperJ.isidoid
) {
            
 if (HelperJ.anatropal == 3

) 
 {        HelperJ.phycochromophyceae = "";
}
 else if 
 (HelperJ.anatropal <= HelperJ.isidoid

) 
 {        HelperJ.anatropal--;
} 
 else 
 {        itjsY =  false;
}


                     itjsY =  false;

                      HelperJ.fariss = true;
}

            } else {
                    if (14 < HelperJ.anatropal
 &&  HelperJ.parjanya != null) {
                    HelperJ.nonapostatizing = "berkovets" .intern();

            } else {
                    HelperJ.pyrophyllites = false;
}



}




                     HelperJ.nonapostatizing = "";

                      if ( HelperJ.parjanya .equals(HelperJ.nonapostatizing)  || ! HelperJ.phycochromophyceae .contains(HelperJ.parjanya) ) {
                    HelperJ.pyrophyllites = false;

                     HelperJ.parjanya = "antiherpes" ;

                      itjsY =  true;
}
}
}



        if ( HelperJ.nonapostatizing != null) {
            
 if (HelperJ.anatropal < 1

 && HelperJ.isidoid < HelperJ.isidoid

) 
 {        if (HelperJ.isidoid <= HelperJ.isidoid
 &&  HelperJ.parjanya .contains(HelperJ.nonapostatizing) ) {
                    if ( HelperJ.phycochromophyceae == null
 && HelperJ.anatropal <= HelperJ.anatropal

) {
                    if (10 <= HelperJ.isidoid
) {
            
 if ( HelperJ.nonapostatizing != null &&  HelperJ.phycochromophyceae != null) 
 {        HelperJ.fariss =  false;
}
 else if 
 ( HelperJ.nonapostatizing != null) 
 {        HelperJ.pyrophyllites = false;
} 
 else 
 {        ++HelperJ.anatropal;
}


            } else {
                    itjsY = ! false;
}




            } else {
                    if ( HelperJ.fariss 
) {
                    itjsY = false;

            } else {
                    HelperJ.phycochromophyceae = "roosterless" ;
}



}




             
 if (HelperJ.anatropal <= HelperJ.anatropal

 &&  HelperJ.nonapostatizing != null) 
 {        if ( itjsY 
 ||  HelperJ.phycochromophyceae .isEmpty() ) {
                    HelperJ.phycochromophyceae = "";

            } else {
                    HelperJ.parjanya = "";
}



}
 else if 
 (HelperJ.isidoid != HelperJ.isidoid

) 
 {        HelperJ.parjanya = "";
} 
 else 
 {        HelperJ.pyrophyllites = false;
}


                      itjsY = true;
}
}
 else if 
 (HelperJ.anatropal == 10

) 
 {        if (HelperJ.isidoid != HelperJ.anatropal
) {
            
 if (HelperJ.anatropal <= HelperJ.anatropal
 &&  HelperJ.phycochromophyceae == null
) 
 {
 if ( HelperJ.nonapostatizing != null) 
 {        itjsY = true;
}
 else if 
 (HelperJ.isidoid == 2

 ||  HelperJ.phycochromophyceae != null) 
 {        HelperJ.pyrophyllites = false;
} 
 else 
 {        itjsY = false;
}

}
 else if 
 (HelperJ.isidoid > HelperJ.isidoid

) 
 {        HelperJ.pyrophyllites = true;
} 
 else 
 {        HelperJ.parjanya = "inconfident" ;
}


            } else {
                    if (HelperJ.isidoid <= HelperJ.isidoid

 ||  itjsY 
) {
                    HelperJ.parjanya = "Sicyos" ;

                     HelperJ.isidoid = 0;

                      itjsY = false;
}
}



} 
 else 
 {
 if (! HelperJ.pyrophyllites 
 || HelperJ.anatropal < HelperJ.anatropal
) 
 {        if (1 <= HelperJ.isidoid
) {
                    itjsY = true;

            } else {
                    --HelperJ.anatropal;
}



}
 else if 
 (6 > HelperJ.anatropal
 ||  HelperJ.fariss 
) 
 {        HelperJ.nonapostatizing = "CRONIC" ;
} 
 else 
 {        ++HelperJ.anatropal;
}

}


            } else {
                    HelperJ.isidoid--;
}



        if (! HelperJ.parjanya .isEmpty() ) {
                    if (! HelperJ.parjanya .contains(HelperJ.nonapostatizing)  ||  itjsY 
) {
                    itjsY = ! false;

                     if (7 <= HelperJ.anatropal
) {
            
 if (HelperJ.anatropal == HelperJ.anatropal

 &&  HelperJ.parjanya == null
) 
 {        if ( HelperJ.nonapostatizing != null) {
                    itjsY = false;

                     ++HelperJ.anatropal;

                      HelperJ.phycochromophyceae = "christianization" ;
}
}
 else if 
 ( HelperJ.phycochromophyceae .equals(HelperJ.phycochromophyceae) ) 
 {        HelperJ.nonapostatizing = "rhododaphnes" ;
} 
 else 
 {        HelperJ.isidoid = 6;        

}


                     if ( HelperJ.parjanya == null
) {
                    HelperJ.parjanya = "";

            } else {
                    HelperJ.isidoid--;
}




                      itjsY = ! false;
}

                      if ( HelperJ.pyrophyllites 
 && HelperJ.anatropal != HelperJ.isidoid

) {
                    if (HelperJ.isidoid > HelperJ.anatropal

 && HelperJ.isidoid != HelperJ.anatropal
) {
                    HelperJ.anatropal = 7;

                     itjsY = false;

                      HelperJ.anatropal = 9;
}

            } else {
                    ++HelperJ.anatropal;
}



}

             
 if ( HelperJ.phycochromophyceae == null
) 
 {
 if ( HelperJ.parjanya .isEmpty()  || HelperJ.anatropal != HelperJ.anatropal

) 
 {
 if ( HelperJ.phycochromophyceae .contains("octyne") ) 
 {        if (HelperJ.isidoid <= HelperJ.isidoid
) {
                    itjsY = true;

            } else {
                    --HelperJ.isidoid;
}



}
 else if 
 ( HelperJ.phycochromophyceae != null || HelperJ.isidoid == HelperJ.anatropal

) 
 {        itjsY = true;
} 
 else 
 {        HelperJ.isidoid = 11;        

}

}
 else if 
 (HelperJ.isidoid != 3

) 
 {        if ( HelperJ.phycochromophyceae .equals(HelperJ.phycochromophyceae) ) {
                    HelperJ.parjanya = "";

            } else {
                    itjsY = true;
}



} 
 else 
 {        ++HelperJ.anatropal;
}

}
 else if 
 ( HelperJ.phycochromophyceae .contains(HelperJ.phycochromophyceae)  ||  HelperJ.fariss 
) 
 {
 if ( HelperJ.parjanya != null) 
 {
 if ( HelperJ.parjanya == null
) 
 {        HelperJ.isidoid = 7;
}
 else if 
 (HelperJ.isidoid < 2

) 
 {        itjsY = false;
} 
 else 
 {        HelperJ.anatropal = 9;
}

}
 else if 
 ( HelperJ.phycochromophyceae != null ||  HelperJ.nonapostatizing == null
) 
 {        HelperJ.phycochromophyceae = "Vardhamana" ;
} 
 else 
 {        HelperJ.fariss = true;
}

} 
 else 
 {        if (1 < HelperJ.isidoid
) {
                    HelperJ.isidoid = 13;

            } else {
                    itjsY = true;
}



}


                      if (14 <= HelperJ.anatropal
) {
                    if ( HelperJ.phycochromophyceae .contains("emdashes") ) {
                    if (HelperJ.anatropal != HelperJ.isidoid

) {
                    HelperJ.fariss = true;

            } else {
                    itjsY = ! true;
}




            } else {
                    HelperJ.anatropal--;
}




             
 if ( itjsY 
) 
 {        HelperJ.anatropal = 13;        

}
 else if 
 ( itjsY 
) 
 {        HelperJ.isidoid--;
} 
 else 
 {        HelperJ.pyrophyllites = false;
}


                      HelperJ.isidoid += 3;
}
}

         
    }

     
    public  void maracan(boolean QF0rR, int d1owt) {
        
 if ( HelperJ.parjanya == null
 ||  QF0rR 
) 
 {        if (d1owt != d1owt
) {
            
 if (d1owt < HelperJ.isidoid
 ||  HelperJ.phycochromophyceae == null
) 
 {        if (d1owt == d1owt
) {
            
 if (HelperJ.anatropal <= d1owt
 ||  HelperJ.parjanya != null) 
 {
 if (! HelperJ.parjanya .isEmpty()  ||  QF0rR 
) 
 {        QF0rR = true;
}
 else if 
 ( QF0rR 
) 
 {        HelperJ.parjanya = "";
} 
 else 
 {        d1owt = 12;        

}

}
 else if 
 ( QF0rR 
) 
 {        QF0rR = false;
} 
 else 
 {        HelperJ.pyrophyllites = true;
}


                     if ( HelperJ.nonapostatizing == null
) {
                    QF0rR = false;

            } else {
                    d1owt++;
}




                      HelperJ.pyrophyllites = false;
}
}
 else if 
 (HelperJ.anatropal != 1

) 
 {        if ( HelperJ.parjanya != null ||  HelperJ.nonapostatizing != null) {
            
 if ( HelperJ.parjanya .isEmpty()  &&  HelperJ.nonapostatizing != null) 
 {        QF0rR =  true;
}
 else if 
 ( QF0rR 
 || HelperJ.isidoid <= HelperJ.isidoid

) 
 {        ++d1owt;
} 
 else 
 {        HelperJ.nonapostatizing = "graupel" ;
}


            } else {
                    d1owt--;
}



} 
 else 
 {        if ( HelperJ.parjanya == null
) {
                    HelperJ.nonapostatizing = "";

                     QF0rR =  true;

                      HelperJ.parjanya = "Pythagorism" ;
}
}


                     if (HelperJ.anatropal != d1owt
 ||  HelperJ.phycochromophyceae == null
) {
            
 if (! HelperJ.nonapostatizing .isEmpty()  ||  HelperJ.parjanya == null
) 
 {        HelperJ.isidoid--;
}
 else if 
 ( HelperJ.phycochromophyceae != null &&  QF0rR 
) 
 {        QF0rR = false;
} 
 else 
 {        ++d1owt;
}


            } else {
            
 if (! QF0rR 
) 
 {        HelperJ.anatropal++;
}
 else if 
 (! QF0rR 
 &&  HelperJ.parjanya == null
) 
 {        HelperJ.parjanya = "Thomasine" ;
} 
 else 
 {        HelperJ.pyrophyllites =  true;
}

}




              
 if ( HelperJ.fariss 
) 
 {        if (d1owt <= HelperJ.anatropal
 ||  HelperJ.nonapostatizing != null) {
                    d1owt = 14;        


                     d1owt += 7;        


                      d1owt = 3;        

}
}
 else if 
 ( HelperJ.fariss 
 &&  HelperJ.parjanya != null) 
 {        d1owt = 2;
} 
 else 
 {        ++HelperJ.anatropal;
}

}
}
 else if 
 ( HelperJ.nonapostatizing != null) 
 {        if ( HelperJ.parjanya == null
 || HelperJ.anatropal <= HelperJ.isidoid

) {
                    if ( HelperJ.fariss 
) {
                    if (7 != d1owt
 &&  HelperJ.parjanya == null
) {
                    if ( QF0rR 
 || d1owt < d1owt

) {
                    HelperJ.nonapostatizing = "scabrock" ;

            } else {
                    QF0rR = false;
}




                     QF0rR = true;

                      QF0rR = false;
}

                     if (d1owt < 10

) {
                    HelperJ.parjanya = "";

                     QF0rR = false;

                      ++d1owt;
}

                      QF0rR = true;
}

                     if ( HelperJ.nonapostatizing == null
) {
            
 if ( HelperJ.nonapostatizing .isEmpty()  ||  QF0rR 
) 
 {        HelperJ.nonapostatizing = "boosterisms" ;
}
 else if 
 (d1owt == d1owt

 || d1owt != d1owt
) 
 {        HelperJ.nonapostatizing = "";
} 
 else 
 {        HelperJ.nonapostatizing = "kerfuffle" ;
}


            } else {
                    --HelperJ.isidoid;
}




                      if (! HelperJ.nonapostatizing .contains("ictuses")  &&  HelperJ.phycochromophyceae == null
) {
                    HelperJ.phycochromophyceae = "valetudinarianisms" ;

            } else {
                    HelperJ.parjanya = "";
}



}
} 
 else 
 {        if ( HelperJ.parjanya == null
) {
                    if (HelperJ.anatropal <= HelperJ.isidoid
 || HelperJ.isidoid > d1owt
) {
                    if ( HelperJ.fariss 
 && 4 > d1owt
) {
                    HelperJ.parjanya = "";

            } else {
                    d1owt = 3;        

}




                     QF0rR = true;

                      QF0rR = true;
}

                     if (d1owt != 13

) {
                    HelperJ.anatropal++;

            } else {
                    QF0rR =  true;
}




                      HelperJ.phycochromophyceae = "mystifically" ;
}
}


 if ( HelperJ.parjanya != null) 
 {        if ( QF0rR 
 || d1owt != HelperJ.isidoid
) {
                    if ( QF0rR 
 && d1owt != 6

) {
                    HelperJ.pyrophyllites =  false;

            } else {
                    if (HelperJ.isidoid != d1owt
 ||  HelperJ.fariss 
) {
                    if (0 != d1owt
) {
                    d1owt--;

            } else {
                    HelperJ.isidoid = 6;
}




            } else {
                    QF0rR = true;
}



}




                     if (HelperJ.isidoid > 3

) {
                    if (11 != d1owt
 &&  HelperJ.parjanya == null
) {
            
 if (! HelperJ.fariss 
 && ! QF0rR 
) 
 {        QF0rR = true;
}
 else if 
 ( HelperJ.nonapostatizing != null && d1owt != 8

) 
 {        d1owt = 9;
} 
 else 
 {        HelperJ.nonapostatizing = "";
}


            } else {
                    HelperJ.phycochromophyceae = "";
}




                     if ( HelperJ.phycochromophyceae == null
 ||  HelperJ.parjanya .contains(HelperJ.phycochromophyceae) ) {
                    HelperJ.phycochromophyceae = "";

                     HelperJ.anatropal = 10;        


                      HelperJ.parjanya = "";
}

                      d1owt += 13;
}

              
 if (d1owt <= 4

) 
 {
 if ( QF0rR 
 &&  HelperJ.parjanya .contains("Yuma") ) 
 {        QF0rR = false;
}
 else if 
 ( HelperJ.nonapostatizing != null || d1owt <= HelperJ.isidoid
) 
 {        HelperJ.phycochromophyceae = "";
} 
 else 
 {        d1owt = 3;        

}

}
 else if 
 (d1owt < d1owt

 && ! QF0rR 
) 
 {        HelperJ.pyrophyllites = false;
} 
 else 
 {        HelperJ.isidoid = 5;        

}

}
}
 else if 
 (13 <= d1owt
) 
 {        if (d1owt <= d1owt

 && 9 > d1owt
) {
                    HelperJ.fariss =  true;

            } else {
            
 if (! HelperJ.fariss 
 || d1owt != d1owt

) 
 {        ++d1owt;
}
 else if 
 (! HelperJ.nonapostatizing .contains(HelperJ.phycochromophyceae) ) 
 {        HelperJ.fariss = true;
} 
 else 
 {        ++d1owt;
}

}



} 
 else 
 {
 if (d1owt <= d1owt

 ||  HelperJ.nonapostatizing != null) 
 {
 if (HelperJ.isidoid <= d1owt
) 
 {
 if (3 == d1owt
) 
 {        HelperJ.phycochromophyceae = "";
}
 else if 
 (! HelperJ.pyrophyllites 
 ||  HelperJ.phycochromophyceae .equals("conarium") ) 
 {        HelperJ.parjanya = "";
} 
 else 
 {        HelperJ.fariss = false;
}

}
 else if 
 (HelperJ.anatropal < 3

) 
 {        QF0rR =  false;
} 
 else 
 {        QF0rR = true;
}

}
 else if 
 (! QF0rR 
) 
 {        if (7 <= d1owt
 ||  HelperJ.nonapostatizing != null) {
                    HelperJ.parjanya = "";

            } else {
                    QF0rR = false;
}



} 
 else 
 {        ++d1owt;
}

}

        QF0rR =  false;
        if ( HelperJ.phycochromophyceae != null &&  HelperJ.nonapostatizing == null
) {
                    if ( HelperJ.nonapostatizing != null) {
                    if ( QF0rR 
 ||  HelperJ.phycochromophyceae != null) {
                    if (d1owt < d1owt

) {
                    d1owt = 3;        


                     HelperJ.parjanya = "";

                      HelperJ.parjanya = "avow" ;
}

            } else {
                    if (0 < d1owt
 && 9 <= HelperJ.isidoid
) {
                    if (HelperJ.anatropal == HelperJ.isidoid
 && ! HelperJ.nonapostatizing .contains("batrachiate") ) {
                    QF0rR = false;

                     HelperJ.isidoid--;

                      HelperJ.nonapostatizing = "microreader" ;
}

            } else {
                    HelperJ.fariss =  false;
}



}




            } else {
                    if ( HelperJ.nonapostatizing != null &&  HelperJ.nonapostatizing .equals(HelperJ.phycochromophyceae) ) {
                    if ( HelperJ.pyrophyllites 
 && ! QF0rR 
) {
                    if ( QF0rR 
 &&  HelperJ.phycochromophyceae != null) {
                    d1owt = 12;        


            } else {
                    HelperJ.nonapostatizing = "Ucalegon" ;
}




            } else {
                    d1owt++;
}




            } else {
                    if ( HelperJ.phycochromophyceae .equals("supernormality") ) {
                    HelperJ.nonapostatizing = "troubleshooted" ;

                     HelperJ.phycochromophyceae = "";

                      HelperJ.phycochromophyceae = "Jerald" ;
}
}



}




            } else {
                    if (! HelperJ.nonapostatizing .contains(HelperJ.nonapostatizing) ) {
            
 if ( HelperJ.phycochromophyceae != null ||  HelperJ.parjanya .equals("refutes") ) 
 {
 if (d1owt <= d1owt

 ||  HelperJ.nonapostatizing .isEmpty() ) 
 {        HelperJ.phycochromophyceae = "pawkiest" ;
}
 else if 
 ( HelperJ.nonapostatizing != null) 
 {        QF0rR = true;
} 
 else 
 {        QF0rR = ! true;
}

}
 else if 
 ( HelperJ.pyrophyllites 
) 
 {        if (! QF0rR 
 &&  HelperJ.phycochromophyceae != null) {
                    ++d1owt;

                     HelperJ.isidoid++;

                      d1owt = 12;        

}
} 
 else 
 {        --d1owt;
}


                     if ( HelperJ.parjanya == null
 && d1owt < d1owt
) {
            
 if (d1owt != HelperJ.isidoid
 ||  HelperJ.nonapostatizing == null
) 
 {        d1owt++;
}
 else if 
 ( HelperJ.nonapostatizing != null &&  HelperJ.parjanya != null) 
 {        HelperJ.phycochromophyceae = "underutilized" ;
} 
 else 
 {        HelperJ.fariss = true;
}


            } else {
                    QF0rR = false;
}




              
 if ( HelperJ.nonapostatizing == null
) 
 {        d1owt += 8;
}
 else if 
 (12 > d1owt
 &&  HelperJ.nonapostatizing .contains(HelperJ.nonapostatizing) ) 
 {        QF0rR = true;
} 
 else 
 {        --HelperJ.isidoid;
}

}
}



        if (d1owt > HelperJ.isidoid
) {
                    if ( HelperJ.parjanya .contains("ketting") ) {
                    if ( HelperJ.fariss 
) {
                    if ( HelperJ.nonapostatizing .isEmpty()  || d1owt <= d1owt

) {
                    if ( HelperJ.phycochromophyceae == null
) {
            
 if (12 == d1owt
 ||  HelperJ.nonapostatizing == null
) 
 {        QF0rR = true;
}
 else if 
 (d1owt > 6

) 
 {        HelperJ.phycochromophyceae = "assessorial" ;
} 
 else 
 {        HelperJ.parjanya = "";
}


            } else {
                    HelperJ.isidoid = 14;
}




            } else {
                    if ( HelperJ.nonapostatizing != null) {
                    d1owt += 8;        


                     QF0rR = false;

                      d1owt -= 13;
}
}




             
 if ( HelperJ.fariss 
 && d1owt <= d1owt

) 
 {        if (! HelperJ.parjanya .equals("Wakeen") ) {
                    QF0rR = false;

                     QF0rR =  true;

                      HelperJ.nonapostatizing = "rubijervine" ;
}
}
 else if 
 ( HelperJ.nonapostatizing .equals("mongers") ) 
 {        QF0rR = true;
} 
 else 
 {        QF0rR =  false;
}


                      if ( QF0rR 
 &&  HelperJ.nonapostatizing != null) {
                    QF0rR = true;

            } else {
                    QF0rR = false;
}



}

                     HelperJ.fariss =  true;

                      if (3 < d1owt
 && d1owt == d1owt

) {
            
 if (d1owt > d1owt
 ||  HelperJ.nonapostatizing .equals("Seleucidan") ) 
 {        ++d1owt;
}
 else if 
 ( HelperJ.phycochromophyceae == null
 &&  HelperJ.parjanya == null
) 
 {        HelperJ.isidoid = 14;        

} 
 else 
 {        d1owt--;
}


            } else {
                    d1owt--;
}



}

                     HelperJ.fariss =  true;

              
 if (HelperJ.isidoid == HelperJ.anatropal
 && ! HelperJ.parjanya .toLowerCase().equals(HelperJ.parjanya) ) 
 {        if ( HelperJ.nonapostatizing .contains("paratroopers")  ||  HelperJ.nonapostatizing != null) {
                    if ( HelperJ.nonapostatizing == null
) {
                    HelperJ.pyrophyllites = true;

                     d1owt = 10;

                      ++d1owt;
}

                     ++HelperJ.isidoid;

                      HelperJ.anatropal++;
}
}
 else if 
 ( QF0rR 
 &&  HelperJ.pyrophyllites 
) 
 {        if ( HelperJ.phycochromophyceae != null &&  HelperJ.phycochromophyceae == null
) {
                    QF0rR = true;

                     QF0rR = true;

                      QF0rR = true;
}
} 
 else 
 {        HelperJ.nonapostatizing = "salsifies" ;
}

}
        if ( HelperJ.nonapostatizing .equals(HelperJ.parjanya) ) {
                    if (HelperJ.isidoid != 9

 &&  HelperJ.parjanya == null
) {
                    if (11 <= d1owt
) {
                    if ( HelperJ.phycochromophyceae == null
) {
                    QF0rR =  true;

            } else {
                    if ( HelperJ.nonapostatizing != null &&  HelperJ.phycochromophyceae == null
) {
                    QF0rR = false;

                     HelperJ.parjanya = "altilik" ;

                      HelperJ.phycochromophyceae = "";
}
}




            } else {
                    if (HelperJ.anatropal <= HelperJ.isidoid

) {
            
 if ( HelperJ.phycochromophyceae .contains(HelperJ.phycochromophyceae)  && 10 == d1owt
) 
 {        HelperJ.nonapostatizing = "";
}
 else if 
 ( HelperJ.parjanya == null
 &&  HelperJ.nonapostatizing != null) 
 {        d1owt++;
} 
 else 
 {        HelperJ.nonapostatizing = "";
}


                     HelperJ.pyrophyllites =  true;

                      HelperJ.parjanya = "";
}
}




            } else {
                    if (14 <= d1owt
 || 8 != HelperJ.anatropal
) {
                    if (d1owt != 5

) {
            
 if ( HelperJ.nonapostatizing == null
) 
 {        QF0rR = ! false;
}
 else if 
 ( HelperJ.parjanya != null ||  HelperJ.phycochromophyceae .isEmpty() ) 
 {        QF0rR =  false;
} 
 else 
 {        HelperJ.phycochromophyceae = "unpersonally" ;
}


            } else {
                    HelperJ.anatropal -= 10;
}




                     if (10 > HelperJ.anatropal
) {
                    HelperJ.parjanya = "Tulua" ;

                     HelperJ.nonapostatizing = "uproariness" ;

                      ++d1owt;
}

                      HelperJ.fariss = true;
}
}




             
 if ( HelperJ.phycochromophyceae == null
) 
 {
 if ( HelperJ.nonapostatizing != null) 
 {        if ( HelperJ.nonapostatizing .equals("holohemihedral")  &&  HelperJ.parjanya == null
) {
                    if (d1owt > 1

 || d1owt > d1owt

) {
                    d1owt = 11;

                     HelperJ.nonapostatizing = "flaughting" ;

                      HelperJ.phycochromophyceae = "";
}

            } else {
                    HelperJ.nonapostatizing = "";
}



}
 else if 
 ( HelperJ.parjanya .equals(HelperJ.phycochromophyceae)  &&  HelperJ.parjanya != null) 
 {
 if ( HelperJ.nonapostatizing .equals(HelperJ.parjanya) ) 
 {        HelperJ.anatropal++;
}
 else if 
 ( HelperJ.parjanya == null
 || 5 != HelperJ.isidoid
) 
 {        HelperJ.nonapostatizing = "diploplacula" ;
} 
 else 
 {        d1owt = 9;        

}

} 
 else 
 {        HelperJ.phycochromophyceae = "auspicial" ;
}

}
 else if 
 ( HelperJ.phycochromophyceae != null &&  HelperJ.parjanya != null) 
 {        HelperJ.parjanya = "";
} 
 else 
 {
 if ( HelperJ.nonapostatizing .isEmpty() ) 
 {        HelperJ.pyrophyllites = true;
}
 else if 
 (! HelperJ.fariss 
 &&  HelperJ.nonapostatizing .contains("iodines") ) 
 {        d1owt -= 10;
} 
 else 
 {        HelperJ.nonapostatizing = "";
}

}


                      if (HelperJ.anatropal > 13

) {
            
 if ( HelperJ.nonapostatizing == null
) 
 {        if ( HelperJ.nonapostatizing != null || d1owt <= HelperJ.isidoid

) {
                    d1owt += 2;

            } else {
                    HelperJ.phycochromophyceae = "";
}



}
 else if 
 ( HelperJ.nonapostatizing == null
) 
 {        HelperJ.nonapostatizing = "admonitions" ;
} 
 else 
 {        d1owt = 6;
}


            } else {
            
 if (d1owt > d1owt
 &&  HelperJ.phycochromophyceae == null
) 
 {        QF0rR = true;
}
 else if 
 ( QF0rR 
) 
 {        HelperJ.nonapostatizing = "";
} 
 else 
 {        d1owt = 6;
}

}



}

         
    }

     
    public  void eicosane(int DmkTc, String B9dWS, String XgSML, boolean Rh0bW) {
                if ( HelperJ.fariss 
 ||  HelperJ.phycochromophyceae != null) {
                    if (! HelperJ.pyrophyllites 
 &&  HelperJ.nonapostatizing != null) {
            
 if ( XgSML .contains("tetraster") ) 
 {        if ( B9dWS == null
) {
                    B9dWS = "";

                     DmkTc = 12;        


                      XgSML = "provabilities" ;
}
}
 else if 
 ( B9dWS == null
 || 6 != HelperJ.isidoid
) 
 {
 if (9 != DmkTc
 || HelperJ.anatropal < 10

) 
 {        if ( XgSML != null && ! XgSML .equals(XgSML) ) {
                    HelperJ.nonapostatizing = "histrionically" ;

            } else {
                    B9dWS = "realizingly" ;
}



}
 else if 
 ( XgSML != null) 
 {        HelperJ.parjanya = "strengthener" ;
} 
 else 
 {        XgSML = "";
}

} 
 else 
 {
 if (DmkTc <= 1

) 
 {        HelperJ.fariss = false;
}
 else if 
 (! B9dWS .isEmpty()  &&  HelperJ.nonapostatizing != null) 
 {        HelperJ.phycochromophyceae = "membracine" ;
} 
 else 
 {        XgSML = "";
}

}


            } else {
                    if (DmkTc == HelperJ.isidoid

) {
                    if (DmkTc > 7

) {
                    if (2 < DmkTc
 ||  HelperJ.phycochromophyceae != null) {
                    HelperJ.anatropal = 8;

            } else {
                    ++DmkTc;
}




            } else {
                    --DmkTc;
}




            } else {
            
 if ( B9dWS .contains("Praenestinian")  || DmkTc > HelperJ.isidoid

) 
 {        XgSML = "visitress" ;
}
 else if 
 ( Rh0bW 
 ||  XgSML == null
) 
 {        HelperJ.pyrophyllites = true;
} 
 else 
 {        Rh0bW = false;
}

}



}




            } else {
                    if (HelperJ.isidoid != HelperJ.anatropal

) {
                    if ( HelperJ.phycochromophyceae .equals(HelperJ.nonapostatizing) ) {
                    if ( XgSML == null
 && 4 != HelperJ.anatropal
) {
                    if (7 < DmkTc
) {
                    HelperJ.phycochromophyceae = "";

                     Rh0bW =  true;

                      HelperJ.anatropal = 5;        

}

            } else {
                    DmkTc++;
}




                     if (DmkTc <= HelperJ.isidoid

) {
                    XgSML = "";

            } else {
                    Rh0bW = false;
}




                      HelperJ.pyrophyllites = true;
}

            } else {
                    if (7 != DmkTc
 ||  XgSML == null
) {
                    if (! HelperJ.pyrophyllites 
) {
                    Rh0bW =  true;

                     ++DmkTc;

                      --HelperJ.anatropal;
}

                     Rh0bW = false;

                      B9dWS = "";
}
}



}




         
    }

     
    public  void affectively() {
                if ( HelperJ.nonapostatizing .trim().equals("Batrachoididae") ) {
                    if (HelperJ.isidoid == HelperJ.anatropal
 ||  HelperJ.pyrophyllites 
) {
                    HelperJ.parjanya = "";

            } else {
                    if (HelperJ.anatropal == 1

) {
                    HelperJ.phycochromophyceae = "";

             
 if (HelperJ.isidoid <= 10

 &&  HelperJ.parjanya != null) 
 {        HelperJ.isidoid = 1;
}
 else if 
 ( HelperJ.parjanya == null
) 
 {        HelperJ.fariss =  false;
} 
 else 
 {        HelperJ.parjanya = "";
}


                      ++HelperJ.anatropal;
}
}




            } else {
                    if (4 > HelperJ.anatropal
 ||  HelperJ.pyrophyllites 
) {
            
 if ( HelperJ.phycochromophyceae != null) 
 {        if ( HelperJ.parjanya .isEmpty() ) {
            
 if ( HelperJ.pyrophyllites 
) 
 {        HelperJ.phycochromophyceae = "uncheerfully" ;
}
 else if 
 ( HelperJ.pyrophyllites 
 &&  HelperJ.fariss 
) 
 {        HelperJ.fariss =  true;
} 
 else 
 {        HelperJ.anatropal = 7;        

}


            } else {
                    HelperJ.fariss = false;
}



}
 else if 
 ( HelperJ.parjanya .isEmpty() ) 
 {        if ( HelperJ.parjanya != null) {
                    HelperJ.isidoid = 8;

            } else {
                    --HelperJ.anatropal;
}



} 
 else 
 {        HelperJ.nonapostatizing = "";
}


            } else {
                    if ( HelperJ.nonapostatizing .isEmpty()  && HelperJ.isidoid != HelperJ.isidoid
) {
                    if (! HelperJ.parjanya .isEmpty() ) {
                    HelperJ.fariss =  false;

                     HelperJ.anatropal++;

                      HelperJ.fariss = false;
}

                     HelperJ.anatropal = 14;

                      HelperJ.parjanya = "";
}
}



}



        HelperJ.pyrophyllites = ! false;

 if ( HelperJ.parjanya == null
 || HelperJ.anatropal < HelperJ.isidoid

) 
 {
 if ( HelperJ.fariss 
 ||  HelperJ.nonapostatizing == null
) 
 {        if (10 <= HelperJ.anatropal
) {
                    HelperJ.pyrophyllites = ! false;

            } else {
                    if (HelperJ.anatropal < HelperJ.anatropal

) {
            
 if ( HelperJ.parjanya == null
 && ! HelperJ.nonapostatizing .contains(HelperJ.parjanya) ) 
 {        HelperJ.isidoid++;
}
 else if 
 (HelperJ.isidoid > HelperJ.isidoid
) 
 {        HelperJ.nonapostatizing = "digitorium" ;
} 
 else 
 {        HelperJ.nonapostatizing = "scientized" ;
}


            } else {
                    HelperJ.fariss = ! false;
}



}



}
 else if 
 (! HelperJ.parjanya .contains("bothria") ) 
 {
 if ( HelperJ.phycochromophyceae == null
) 
 {        if (HelperJ.isidoid <= HelperJ.isidoid
) {
                    if ( HelperJ.nonapostatizing .contains("transactional")  || HelperJ.anatropal <= HelperJ.isidoid
) {
                    HelperJ.parjanya = "";

                     HelperJ.fariss = true;

                      HelperJ.phycochromophyceae = "";
}

                     HelperJ.anatropal = 10;        


                      HelperJ.phycochromophyceae = "";
}
}
 else if 
 (HelperJ.anatropal == 5

 ||  HelperJ.phycochromophyceae != null) 
 {        if ( HelperJ.parjanya .equals("predepreciated") ) {
                    HelperJ.pyrophyllites = false;

                     HelperJ.anatropal = 14;        


                      HelperJ.parjanya = "";
}
} 
 else 
 {        HelperJ.fariss = false;
}

} 
 else 
 {        if (13 > HelperJ.isidoid
 &&  HelperJ.nonapostatizing != null) {
            
 if ( HelperJ.phycochromophyceae != null) 
 {        HelperJ.nonapostatizing = "Frederic" ;
}
 else if 
 ( HelperJ.nonapostatizing == null
) 
 {        HelperJ.isidoid--;
} 
 else 
 {        HelperJ.nonapostatizing = "";
}


                     HelperJ.nonapostatizing = "";

                      HelperJ.isidoid++;
}
}

}
 else if 
 (HelperJ.isidoid <= HelperJ.anatropal
 &&  HelperJ.fariss 
) 
 {
 if (HelperJ.isidoid <= HelperJ.anatropal
 &&  HelperJ.pyrophyllites 
) 
 {        if ( HelperJ.parjanya != null) {
            
 if (HelperJ.anatropal == HelperJ.isidoid

 ||  HelperJ.pyrophyllites 
) 
 {
 if (14 != HelperJ.anatropal
 &&  HelperJ.phycochromophyceae == null
) 
 {        HelperJ.isidoid = 0;
}
 else if 
 (HelperJ.anatropal < HelperJ.anatropal

) 
 {        HelperJ.nonapostatizing = "";
} 
 else 
 {        HelperJ.pyrophyllites = true;
}

}
 else if 
 ( HelperJ.phycochromophyceae .isEmpty() ) 
 {        HelperJ.anatropal++;
} 
 else 
 {        --HelperJ.isidoid;
}


                     if (11 <= HelperJ.isidoid
 || HelperJ.isidoid < HelperJ.anatropal

) {
                    HelperJ.pyrophyllites = true;

            } else {
                    HelperJ.phycochromophyceae = "toughing" ;
}




                      ++HelperJ.anatropal;
}
}
 else if 
 ( HelperJ.parjanya .equals(HelperJ.nonapostatizing)  && HelperJ.anatropal <= HelperJ.isidoid
) 
 {        if ( HelperJ.parjanya .contains("misascription")  || ! HelperJ.pyrophyllites 
) {
            
 if ( HelperJ.phycochromophyceae != null &&  HelperJ.parjanya != null) 
 {        HelperJ.parjanya = "xenurine" ;
}
 else if 
 (! HelperJ.fariss 
 && HelperJ.anatropal == 5

) 
 {        HelperJ.pyrophyllites =  true;
} 
 else 
 {        HelperJ.parjanya = "";
}


                     HelperJ.fariss = true;

                      HelperJ.phycochromophyceae = "";
}
} 
 else 
 {
 if (! HelperJ.fariss 
 && HelperJ.anatropal < HelperJ.isidoid

) 
 {        HelperJ.phycochromophyceae = "";
}
 else if 
 (HelperJ.isidoid <= 12

 ||  HelperJ.nonapostatizing == null
) 
 {        HelperJ.isidoid = 8;
} 
 else 
 {        HelperJ.isidoid++;
}

}

} 
 else 
 {        if ( HelperJ.nonapostatizing != null ||  HelperJ.parjanya != null) {
                    if ( HelperJ.phycochromophyceae == null
 ||  HelperJ.phycochromophyceae != null) {
                    if (! HelperJ.phycochromophyceae .isEmpty() ) {
                    HelperJ.parjanya = "oughtnesses" ;

                     HelperJ.fariss = false;

                      HelperJ.fariss = true;
}

                     HelperJ.anatropal -= 14;        


                      HelperJ.fariss = true;
}

            } else {
                    if ( HelperJ.nonapostatizing != null || ! HelperJ.pyrophyllites 
) {
                    HelperJ.isidoid++;

                     HelperJ.fariss = ! false;

                      HelperJ.pyrophyllites = false;
}
}



}


 if ( HelperJ.nonapostatizing .toLowerCase().isEmpty()  && 5 == HelperJ.anatropal
) 
 {        if ( HelperJ.parjanya == null
 || 0 != HelperJ.anatropal
) {
                    if ( HelperJ.parjanya .contains("Helmholtzian") ) {
            
 if ( HelperJ.nonapostatizing != null ||  HelperJ.parjanya == null
) 
 {        if ( HelperJ.pyrophyllites 
) {
            
 if (HelperJ.isidoid <= 11

) 
 {        HelperJ.isidoid = 3;
}
 else if 
 ( HelperJ.parjanya != null) 
 {        HelperJ.isidoid = 11;
} 
 else 
 {        HelperJ.anatropal = 8;        

}


                     HelperJ.fariss =  true;

                      HelperJ.pyrophyllites = false;
}
}
 else if 
 ( HelperJ.fariss 
) 
 {
 if (! HelperJ.phycochromophyceae .equals("collodiochloride")  ||  HelperJ.parjanya .equals(HelperJ.parjanya) ) 
 {        ++HelperJ.anatropal;
}
 else if 
 (HelperJ.anatropal < 14

) 
 {        HelperJ.phycochromophyceae = "forciblenesses" ;
} 
 else 
 {        HelperJ.nonapostatizing = "unresifted" ;
}

} 
 else 
 {        HelperJ.nonapostatizing = "";
}


                     if ( HelperJ.parjanya .equals(HelperJ.nonapostatizing)  && ! HelperJ.parjanya .contains(HelperJ.nonapostatizing) ) {
            
 if ( HelperJ.parjanya == null
) 
 {        HelperJ.anatropal = 14;
}
 else if 
 ( HelperJ.parjanya == null
) 
 {        HelperJ.phycochromophyceae = "";
} 
 else 
 {        HelperJ.parjanya = "";
}


                     HelperJ.pyrophyllites = true;

                      HelperJ.parjanya = "";
}

                      if (! HelperJ.parjanya .isEmpty()  ||  HelperJ.parjanya == null
) {
                    HelperJ.phycochromophyceae = "regnellidium" ;

                     HelperJ.pyrophyllites = true;

                      HelperJ.fariss = true;
}
}

            } else {
                    if ( HelperJ.nonapostatizing == null
 || HelperJ.isidoid <= 4

) {
                    if ( HelperJ.parjanya == null
 && 10 > HelperJ.anatropal
) {
                    if ( HelperJ.fariss 
 || HelperJ.isidoid == HelperJ.isidoid

) {
                    HelperJ.nonapostatizing = "";

                     HelperJ.parjanya = "diphenylguanidine" ;

                      HelperJ.parjanya = "untwitching" ;
}

                     --HelperJ.isidoid;

                      --HelperJ.anatropal;
}

                     if ( HelperJ.parjanya != null &&  HelperJ.parjanya == null
) {
                    HelperJ.anatropal++;

                     HelperJ.isidoid++;

                      HelperJ.nonapostatizing = "gustatorially" ;
}

                      HelperJ.phycochromophyceae = "misgraft" ;
}
}



}
 else if 
 (! HelperJ.fariss 
 || HelperJ.isidoid > 13

) 
 {        if ( HelperJ.pyrophyllites 
) {
                    if ( HelperJ.pyrophyllites 
 &&  HelperJ.nonapostatizing != null) {
                    if ( HelperJ.phycochromophyceae == null
) {
                    if (HelperJ.isidoid > HelperJ.isidoid
) {
                    HelperJ.nonapostatizing = "";

            } else {
                    HelperJ.parjanya = "makeable" ;
}




            } else {
                    HelperJ.parjanya = "";
}




            } else {
                    if ( HelperJ.nonapostatizing == null
 ||  HelperJ.nonapostatizing .equals("Abrahamite") ) {
                    HelperJ.isidoid = 6;

                     HelperJ.anatropal = 12;

                      HelperJ.parjanya = "";
}
}




                     if ( HelperJ.fariss 
 || ! HelperJ.parjanya .equals("haplosporidia") ) {
                    if ( HelperJ.parjanya == null
 ||  HelperJ.parjanya .equals("anticensoriousness") ) {
                    HelperJ.nonapostatizing = "";

            } else {
                    HelperJ.fariss = false;
}




            } else {
                    HelperJ.parjanya = "";
}




              
 if (! HelperJ.fariss 
) 
 {        HelperJ.phycochromophyceae = "";
}
 else if 
 ( HelperJ.phycochromophyceae != null) 
 {        HelperJ.fariss = false;
} 
 else 
 {        HelperJ.isidoid = 4;        

}

}
} 
 else 
 {        HelperJ.anatropal = 4;        

}

        if ( HelperJ.parjanya .equals(HelperJ.phycochromophyceae) ) {
                    if ( HelperJ.nonapostatizing == null
 &&  HelperJ.phycochromophyceae .isEmpty() ) {
                    if (! HelperJ.phycochromophyceae .contains(HelperJ.nonapostatizing) ) {
            
 if ( HelperJ.fariss 
 &&  HelperJ.phycochromophyceae == null
) 
 {
 if (HelperJ.anatropal == HelperJ.isidoid

 ||  HelperJ.nonapostatizing == null
) 
 {        if ( HelperJ.nonapostatizing != null ||  HelperJ.nonapostatizing != null) {
                    HelperJ.nonapostatizing = "";

            } else {
                    HelperJ.fariss =  false;
}



}
 else if 
 ( HelperJ.nonapostatizing .equals(HelperJ.phycochromophyceae)  || ! HelperJ.fariss 
) 
 {        HelperJ.pyrophyllites = ! false;
} 
 else 
 {        HelperJ.nonapostatizing = "rereviewing" ;
}

}
 else if 
 ( HelperJ.pyrophyllites 
 ||  HelperJ.phycochromophyceae .equals(HelperJ.nonapostatizing) ) 
 {        if (HelperJ.anatropal <= HelperJ.anatropal

) {
                    HelperJ.phycochromophyceae = "elve" ;

                     HelperJ.phycochromophyceae = "insectarium" ;

                      HelperJ.pyrophyllites =  false;
}
} 
 else 
 {        HelperJ.parjanya = "praelection" .toUpperCase();
}


            } else {
                    if ( HelperJ.nonapostatizing == null
 ||  HelperJ.phycochromophyceae .isEmpty() ) {
                    if ( HelperJ.parjanya == null
) {
                    HelperJ.pyrophyllites = false;

                     HelperJ.nonapostatizing = "chevisance" ;

                      HelperJ.anatropal = 14;        

}

                     HelperJ.nonapostatizing = "";

                      HelperJ.anatropal = 2;
}
}




            } else {
                    if ( HelperJ.parjanya == null
) {
                    if ( HelperJ.parjanya == null
) {
                    if (! HelperJ.nonapostatizing .intern().isEmpty() ) {
                    HelperJ.anatropal++;

            } else {
                    HelperJ.phycochromophyceae = "";
}




                     HelperJ.nonapostatizing = "zooerasty" ;

                      HelperJ.phycochromophyceae = "";
}

            } else {
                    if ( HelperJ.phycochromophyceae != null) {
                    --HelperJ.anatropal;

            } else {
                    HelperJ.parjanya = "";
}



}



}




            } else {
            
 if ( HelperJ.pyrophyllites 
) 
 {
 if (HelperJ.isidoid <= 5

) 
 {        if (! HelperJ.pyrophyllites 
) {
                    if ( HelperJ.nonapostatizing != null) {
                    HelperJ.anatropal--;

                     HelperJ.fariss = false;

                      HelperJ.anatropal++;
}

                     HelperJ.parjanya = "cystotomy" ;

                      HelperJ.nonapostatizing = "";
}
}
 else if 
 ( HelperJ.phycochromophyceae == null
) 
 {        if ( HelperJ.parjanya != null && HelperJ.isidoid != HelperJ.isidoid
) {
                    HelperJ.phycochromophyceae = "noninclusive" ;

                     --HelperJ.isidoid;

                      HelperJ.fariss =  true;
}
} 
 else 
 {        HelperJ.anatropal = 5;        

}

}
 else if 
 (! HelperJ.parjanya .isEmpty()  || HelperJ.anatropal > HelperJ.isidoid

) 
 {        HelperJ.isidoid++;
} 
 else 
 {        if (HelperJ.anatropal > HelperJ.isidoid

 || HelperJ.anatropal > 3

) {
                    HelperJ.isidoid = 7;

            } else {
                    HelperJ.nonapostatizing = "";
}



}

}



        HelperJ.anatropal = 1;        


         
    }

     
    public  void outfinds(String RLuYf, String LaJSO, boolean SFC4Y, int mgXC0) {
                if ( LaJSO .contains("blepharosynechia") ) {
                    if ( HelperJ.nonapostatizing .contains("monothalamian")  && ! HelperJ.nonapostatizing .trim().isEmpty() ) {
                    if (! HelperJ.fariss 
) {
                    SFC4Y =  true;

            } else {
            
 if ( HelperJ.fariss 
) 
 {        LaJSO = "Kyrgyzstan" ;
}
 else if 
 ( LaJSO != null ||  LaJSO .equals(HelperJ.nonapostatizing) ) 
 {        RLuYf = "";
} 
 else 
 {        LaJSO = "crowkeeper" ;
}

}




            } else {
                    if ( HelperJ.fariss 
 || HelperJ.anatropal != mgXC0
) {
            
 if ( RLuYf .isEmpty() ) 
 {
 if (! RLuYf .contains(RLuYf) ) 
 {        SFC4Y = false;
}
 else if 
 (0 < mgXC0
 && 2 > mgXC0
) 
 {        HelperJ.phycochromophyceae = "";
} 
 else 
 {        RLuYf = "FMCS" ;
}

}
 else if 
 (mgXC0 == mgXC0

 &&  HelperJ.phycochromophyceae .equals(HelperJ.parjanya) ) 
 {        HelperJ.isidoid = 1;
} 
 else 
 {        ++HelperJ.isidoid;
}


            } else {
                    if ( LaJSO .contains("undevotional") ) {
                    LaJSO = "Plutarchic" ;

                     LaJSO = "Hudmezovcscrhely" ;

                      HelperJ.fariss = false;
}
}



}




            } else {
                    if (HelperJ.isidoid <= mgXC0
) {
            
 if ( HelperJ.pyrophyllites 
) 
 {
 if (mgXC0 <= mgXC0
 || ! HelperJ.pyrophyllites 
) 
 {
 if ( SFC4Y 
 &&  HelperJ.nonapostatizing != null) 
 {        SFC4Y = ! true;
}
 else if 
 (mgXC0 > mgXC0
 &&  RLuYf != null) 
 {        mgXC0++;
} 
 else 
 {        HelperJ.parjanya = "Larentalia" ;
}

}
 else if 
 (mgXC0 < HelperJ.isidoid
) 
 {        LaJSO = "";
} 
 else 
 {        SFC4Y = false;
}

}
 else if 
 (HelperJ.anatropal != 11

) 
 {
 if ( RLuYf != null && HelperJ.anatropal == 6

) 
 {        SFC4Y = true;
}
 else if 
 (9 <= mgXC0
 ||  SFC4Y 
) 
 {        RLuYf = "howres" ;
} 
 else 
 {        SFC4Y = true;
}

} 
 else 
 {        HelperJ.pyrophyllites = false;
}


                     if (8 > HelperJ.isidoid
) {
            
 if ( HelperJ.nonapostatizing == null
 && 9 > mgXC0
) 
 {        HelperJ.fariss =  true;
}
 else if 
 (HelperJ.anatropal <= 12

) 
 {        HelperJ.pyrophyllites =  false;
} 
 else 
 {        SFC4Y = true;
}


                     HelperJ.isidoid--;

                      SFC4Y = false;
}

                      if ( LaJSO .contains("medrese")  &&  HelperJ.phycochromophyceae != null) {
                    SFC4Y =  false;

                     SFC4Y =  false;

                      LaJSO = "";
}
}
}



        if (! HelperJ.fariss 
) {
            
 if ( HelperJ.parjanya != null) 
 {        if ( RLuYf == null
) {
                    if ( HelperJ.nonapostatizing != null &&  HelperJ.parjanya != null) {
                    RLuYf = "";

             
 if (mgXC0 <= mgXC0
 &&  RLuYf == null
) 
 {        HelperJ.fariss = true;
}
 else if 
 ( HelperJ.fariss 
 && mgXC0 < mgXC0

) 
 {        HelperJ.phycochromophyceae = "";
} 
 else 
 {        LaJSO = "";
}


                      mgXC0 = 13;
}

            } else {
                    mgXC0++;
}



}
 else if 
 ( RLuYf .equals("Islesboro") ) 
 {        if ( LaJSO == null
 && HelperJ.anatropal <= mgXC0

) {
                    if ( LaJSO == null
) {
                    if ( RLuYf != null ||  HelperJ.nonapostatizing .equals("plantules") ) {
                    RLuYf = "";

            } else {
                    RLuYf = "";
}




            } else {
                    SFC4Y = false;
}




            } else {
            
 if ( RLuYf .contains(LaJSO) ) 
 {        RLuYf = "";
}
 else if 
 ( RLuYf .isEmpty()  && HelperJ.isidoid < mgXC0

) 
 {        LaJSO = "";
} 
 else 
 {        SFC4Y = false;
}

}



} 
 else 
 {
 if ( RLuYf .isEmpty() ) 
 {        if ( LaJSO .contains(RLuYf)  ||  LaJSO .equals("ampelotherapy") ) {
                    mgXC0--;

                     RLuYf = "mathematization" ;

                      mgXC0 = 2;
}
}
 else if 
 ( HelperJ.parjanya == null
 ||  LaJSO == null
) 
 {        LaJSO = "tussocky" ;
} 
 else 
 {        mgXC0 = 0;
}

}


            } else {
            
 if (9 != HelperJ.anatropal
 &&  LaJSO .contains(LaJSO) ) 
 {
 if (HelperJ.isidoid == mgXC0
) 
 {        if (HelperJ.anatropal <= HelperJ.anatropal
 && 3 > mgXC0
) {
                    if (1 == mgXC0
 &&  LaJSO .equals("physiotherapeutics") ) {
                    ++mgXC0;

                     LaJSO = "redbait" ;

                      mgXC0 = 10;        

}

                     HelperJ.phycochromophyceae = "sheens" ;

                      SFC4Y = true;
}
}
 else if 
 (8 <= HelperJ.anatropal
 &&  LaJSO != null) 
 {        if ( RLuYf != null ||  LaJSO .isEmpty() ) {
                    mgXC0 -= 11;        


            } else {
                    SFC4Y = false;
}



} 
 else 
 {        LaJSO = "Rajes" ;
}

}
 else if 
 ( RLuYf .equals(RLuYf) ) 
 {
 if (HelperJ.anatropal > 1

) 
 {        if ( HelperJ.nonapostatizing .equals("unpromised") ) {
                    mgXC0 = 11;        


                     --mgXC0;

                      SFC4Y = true;
}
}
 else if 
 (13 <= mgXC0
) 
 {        RLuYf = "";
} 
 else 
 {        SFC4Y = true;
}

} 
 else 
 {
 if (HelperJ.isidoid < mgXC0

 || ! HelperJ.fariss 
) 
 {        HelperJ.fariss = false;
}
 else if 
 ( RLuYf != null && 8 > mgXC0
) 
 {        HelperJ.parjanya = "";
} 
 else 
 {        RLuYf = "allonges" ;
}

}

}



        if ( HelperJ.parjanya != null && mgXC0 < 5

) {
            
 if (9 != mgXC0
 &&  LaJSO == null
) 
 {        if (13 <= HelperJ.isidoid
) {
                    if ( LaJSO .equals(HelperJ.nonapostatizing)  || ! SFC4Y 
) {
                    if ( HelperJ.parjanya == null
 && HelperJ.isidoid <= mgXC0

) {
                    if ( LaJSO .contains("sumpters") ) {
                    mgXC0++;

            } else {
                    LaJSO = "microseismometrograph" ;
}




            } else {
                    HelperJ.pyrophyllites = true;
}




            } else {
            
 if ( LaJSO .contains("scribe") ) 
 {        RLuYf = "";
}
 else if 
 (HelperJ.anatropal <= 5

) 
 {        SFC4Y = true;
} 
 else 
 {        mgXC0 = 10;
}

}




            } else {
                    if (mgXC0 != mgXC0

 || mgXC0 == HelperJ.isidoid
) {
                    if (HelperJ.isidoid != 0

) {
                    ++mgXC0;

                     SFC4Y = false;

                      LaJSO = "";
}

                     --mgXC0;

                      LaJSO = "";
}
}



}
 else if 
 ( LaJSO == null
 || HelperJ.anatropal < HelperJ.isidoid

) 
 {        if (! HelperJ.fariss 
 ||  RLuYf == null
) {
            
 if ( RLuYf != null) 
 {        if (mgXC0 <= 13

) {
                    mgXC0 += 12;        


                     LaJSO = "";

                      HelperJ.parjanya = "Haltica" ;
}
}
 else if 
 ( HelperJ.phycochromophyceae == null
 && HelperJ.anatropal == HelperJ.anatropal

) 
 {        HelperJ.isidoid = 11;        

} 
 else 
 {        --HelperJ.isidoid;
}


            } else {
                    if (mgXC0 <= HelperJ.isidoid
 ||  HelperJ.phycochromophyceae .equals(LaJSO) ) {
                    LaJSO = "aldermancy" ;

            } else {
                    HelperJ.fariss =  true;
}



}



} 
 else 
 {        if ( LaJSO .trim().isEmpty()  || ! SFC4Y 
) {
                    if (3 != mgXC0
 && mgXC0 != 4

) {
                    HelperJ.pyrophyllites =  true;

                     mgXC0 = 11;

                      HelperJ.phycochromophyceae = "";
}

                     HelperJ.anatropal += 5;        


                      SFC4Y =  false;
}
}


                     if (! SFC4Y 
 ||  LaJSO == null
) {
                    if ( HelperJ.nonapostatizing != null ||  HelperJ.nonapostatizing == null
) {
            
 if (! SFC4Y 
 &&  HelperJ.parjanya != null) 
 {        if ( LaJSO != null) {
                    HelperJ.pyrophyllites = true;

                     RLuYf = "Strobilophyta" ;

                      HelperJ.fariss = ! false;
}
}
 else if 
 ( RLuYf == null
) 
 {        mgXC0 = 9;        

} 
 else 
 {        SFC4Y = false;
}


             
 if (mgXC0 < 13

 &&  HelperJ.fariss 
) 
 {        --HelperJ.anatropal;
}
 else if 
 ( HelperJ.nonapostatizing != null) 
 {        SFC4Y =  false;
} 
 else 
 {        RLuYf = "geofacts" ;
}


                      ++mgXC0;
}

             
 if ( HelperJ.fariss 
) 
 {        if ( HelperJ.parjanya == null
) {
                    SFC4Y =  false;

            } else {
                    LaJSO = "";
}



}
 else if 
 (mgXC0 <= 12

) 
 {        mgXC0 = 2;        

} 
 else 
 {        SFC4Y = ! true;
}


              
 if ( LaJSO != null) 
 {        HelperJ.fariss = true;
}
 else if 
 (HelperJ.isidoid <= mgXC0

 &&  LaJSO .isEmpty() ) 
 {        SFC4Y =  true;
} 
 else 
 {        mgXC0 = 0;        

}

}

                      if ( RLuYf == null
) {
            
 if ( RLuYf != null && HelperJ.isidoid < mgXC0

) 
 {        if ( LaJSO .contains("untether") ) {
                    HelperJ.isidoid = 11;        


            } else {
                    LaJSO = "";
}



}
 else if 
 ( HelperJ.nonapostatizing != null && 9 > HelperJ.isidoid
) 
 {        SFC4Y = false;
} 
 else 
 {        RLuYf = "previolating" ;
}


            } else {
                    if ( LaJSO != null &&  RLuYf .contains(RLuYf) ) {
                    mgXC0++;

                     LaJSO = "volume" ;

                      HelperJ.anatropal = 8;
}
}



}
        if ( HelperJ.fariss 
 &&  LaJSO != null) {
            
 if ( LaJSO .equals(HelperJ.phycochromophyceae)  || HelperJ.anatropal != mgXC0
) 
 {
 if ( LaJSO == null
 &&  HelperJ.phycochromophyceae == null
) 
 {        HelperJ.parjanya = "Keating" ;
}
 else if 
 (13 != mgXC0
) 
 {
 if ( HelperJ.fariss 
 || 11 > HelperJ.isidoid
) 
 {
 if (6 <= mgXC0
) 
 {        HelperJ.isidoid++;
}
 else if 
 (HelperJ.isidoid < 1

 || mgXC0 != 4

) 
 {        HelperJ.isidoid = 6;        

} 
 else 
 {        RLuYf = "";
}

}
 else if 
 (! SFC4Y 
) 
 {        HelperJ.anatropal = 1;
} 
 else 
 {        ++mgXC0;
}

} 
 else 
 {        if ( LaJSO .isEmpty() ) {
                    RLuYf = "resignations" ;

            } else {
                    --mgXC0;
}



}

}
 else if 
 ( LaJSO .equals("Jandal")  && 8 < HelperJ.anatropal
) 
 {        if ( LaJSO != null) {
                    if ( RLuYf .contains(LaJSO)  && mgXC0 < mgXC0

) {
                    if (mgXC0 <= mgXC0
 && mgXC0 == HelperJ.anatropal
) {
                    LaJSO = "";

                     SFC4Y =  false;

                      HelperJ.parjanya = "bearskin" ;
}

                     LaJSO = "Arsippe" ;

                      SFC4Y =  false;
}

                     if ( RLuYf != null) {
                    RLuYf = "";

            } else {
                    HelperJ.isidoid = 12;
}




                      ++mgXC0;
}
} 
 else 
 {        if (mgXC0 <= 14

 && 7 <= HelperJ.isidoid
) {
            
 if ( RLuYf .contains("reversible")  && 12 <= mgXC0
) 
 {        SFC4Y = true;
}
 else if 
 ( LaJSO != null) 
 {        mgXC0 = 9;
} 
 else 
 {        mgXC0 -= 1;
}


                     mgXC0 = 11;

                      RLuYf = "";
}
}


            } else {
            
 if ( HelperJ.phycochromophyceae == null
) 
 {        if ( HelperJ.nonapostatizing == null
) {
            
 if (14 <= mgXC0
) 
 {
 if ( RLuYf == null
) 
 {        HelperJ.fariss = false;
}
 else if 
 ( RLuYf .isEmpty() ) 
 {        mgXC0 = 12;        

} 
 else 
 {        mgXC0 -= 4;        

}

}
 else if 
 ( LaJSO != null ||  RLuYf == null
) 
 {        SFC4Y = false;
} 
 else 
 {        mgXC0++;
}


            } else {
                    if (mgXC0 <= 1

) {
                    ++mgXC0;

                     SFC4Y = true;

                      --mgXC0;
}
}



}
 else if 
 (mgXC0 <= HelperJ.anatropal

 &&  HelperJ.parjanya .contains(HelperJ.phycochromophyceae) ) 
 {        if ( HelperJ.phycochromophyceae == null
) {
                    if ( SFC4Y 
) {
                    mgXC0--;

                     HelperJ.pyrophyllites =  true;

                      mgXC0 = 14;        

}

                     mgXC0 = 1;        


                      mgXC0 = 8;        

}
} 
 else 
 {        if ( LaJSO != null) {
                    mgXC0 = 14;

            } else {
                    HelperJ.anatropal = 5;
}



}

}



        LaJSO = "beverse" .trim();

 if ( HelperJ.parjanya .isEmpty() ) 
 {        if ( SFC4Y 
 || 13 != mgXC0
) {
                    if ( HelperJ.parjanya .isEmpty() ) {
                    if ( LaJSO == null
) {
                    if ( RLuYf != null || mgXC0 > HelperJ.anatropal

) {
                    if ( LaJSO != null && mgXC0 <= 3

) {
                    SFC4Y =  true;

            } else {
                    SFC4Y =  false;
}




            } else {
                    HelperJ.parjanya = "Alrick" ;
}




             
 if ( HelperJ.pyrophyllites 
 || mgXC0 < mgXC0
) 
 {        SFC4Y = true;
}
 else if 
 (mgXC0 > mgXC0
 || ! SFC4Y 
) 
 {        RLuYf = "counteractingly" ;
} 
 else 
 {        mgXC0 = 12;        

}


                      mgXC0 = 4;
}

            } else {
                    if ( SFC4Y 
) {
                    if ( SFC4Y 
 &&  SFC4Y 
) {
                    SFC4Y = false;

                     RLuYf = "nondependance" ;

                      SFC4Y = true;
}

            } else {
                    --HelperJ.anatropal;
}



}




                     if (mgXC0 <= HelperJ.anatropal
 || mgXC0 <= HelperJ.isidoid
) {
            
 if ( LaJSO .isEmpty() ) 
 {        if ( LaJSO != null &&  RLuYf == null
) {
                    LaJSO = "thirteenfold" .trim();

                     SFC4Y =  false;

                      RLuYf = "";
}
}
 else if 
 ( SFC4Y 
) 
 {        LaJSO = "Matralia" ;
} 
 else 
 {        SFC4Y = ! true;
}


                     if (! HelperJ.pyrophyllites 
) {
                    mgXC0 = 9;        


                     mgXC0 = 7;        


                      RLuYf = "Germans" ;
}

                      --mgXC0;
}

                      if (mgXC0 <= mgXC0
 &&  LaJSO != null) {
                    if (12 < HelperJ.anatropal
) {
                    LaJSO = "Sundays" ;

                     mgXC0 = 4;

                      HelperJ.anatropal--;
}

                     SFC4Y = false;

                      LaJSO = "";
}
}
}
 else if 
 (3 > mgXC0
) 
 {        if ( SFC4Y 
) {
                    HelperJ.pyrophyllites = true;

            } else {
                    if ( LaJSO != null) {
                    if ( LaJSO .contains(RLuYf)  ||  HelperJ.nonapostatizing == null
) {
                    SFC4Y = ! false;

            } else {
                    SFC4Y = true;
}




                     SFC4Y = true;

                      SFC4Y = true;
}
}



} 
 else 
 {        if (1 <= HelperJ.anatropal
) {
                    if ( HelperJ.fariss 
) {
                    if ( RLuYf .equals(RLuYf)  &&  SFC4Y 
) {
                    mgXC0--;

                     mgXC0++;

                      LaJSO = "";
}

            } else {
                    RLuYf = "";
}




            } else {
                    if (mgXC0 < mgXC0
 &&  SFC4Y 
) {
                    SFC4Y = false;

                     HelperJ.anatropal--;

                      mgXC0 = 8;        

}
}



}

        if ( RLuYf != null || HelperJ.anatropal < HelperJ.isidoid

) {
                    if ( HelperJ.nonapostatizing == null
 || ! RLuYf .contains(HelperJ.parjanya) ) {
                    if ( RLuYf == null
) {
            
 if (! RLuYf .contains(HelperJ.parjanya) ) 
 {        if ( HelperJ.phycochromophyceae == null
) {
                    if (10 > mgXC0
 && ! HelperJ.nonapostatizing .contains("labefying") ) {
                    HelperJ.pyrophyllites = false;

            } else {
                    SFC4Y = false;
}




            } else {
                    LaJSO = "";
}



}
 else if 
 ( LaJSO != null &&  SFC4Y 
) 
 {        if ( HelperJ.nonapostatizing .isEmpty() ) {
                    --mgXC0;

                     mgXC0--;

                      SFC4Y = false;
}
} 
 else 
 {        mgXC0 = 12;        

}


             
 if (mgXC0 != mgXC0

 ||  RLuYf .contains("rereadings") ) 
 {        if ( RLuYf == null
) {
                    ++mgXC0;

                     --mgXC0;

                      LaJSO = "wrongly" ;
}
}
 else if 
 ( RLuYf != null && mgXC0 <= 8

) 
 {        HelperJ.nonapostatizing = "substantiae" ;
} 
 else 
 {        --mgXC0;
}


              
 if ( RLuYf != null || ! HelperJ.parjanya .contains("altoruffled") ) 
 {        RLuYf = "tabernacle" ;
}
 else if 
 (HelperJ.isidoid < HelperJ.anatropal

) 
 {        RLuYf = "";
} 
 else 
 {        LaJSO = "carcerated" ;
}

}

            } else {
                    if ( SFC4Y 
) {
            
 if ( SFC4Y 
) 
 {        if (mgXC0 != mgXC0

 && ! SFC4Y 
) {
                    RLuYf = "";

                     HelperJ.phycochromophyceae = "";

                      SFC4Y =  true;
}
}
 else if 
 (! HelperJ.pyrophyllites 
) 
 {        SFC4Y = false;
} 
 else 
 {        HelperJ.isidoid = 13;
}


            } else {
                    if ( LaJSO .contains("staidly")  ||  RLuYf .contains("industrious") ) {
                    mgXC0--;

            } else {
                    mgXC0 = 0;
}



}



}




             
 if (HelperJ.anatropal <= mgXC0
) 
 {
 if (! HelperJ.fariss 
 || mgXC0 <= mgXC0
) 
 {        if (HelperJ.isidoid < mgXC0
 && 0 != mgXC0
) {
            
 if (! HelperJ.parjanya .contains("undemolishable")  &&  RLuYf .equals("velocipedists") ) 
 {        SFC4Y = false;
}
 else if 
 (HelperJ.anatropal == mgXC0

) 
 {        HelperJ.fariss = true;
} 
 else 
 {        HelperJ.phycochromophyceae = "ammonal" ;
}


                     SFC4Y = false;

                      SFC4Y = true;
}
}
 else if 
 (1 < mgXC0
) 
 {
 if (12 < mgXC0
) 
 {        HelperJ.isidoid--;
}
 else if 
 ( HelperJ.phycochromophyceae .equals(RLuYf)  && ! LaJSO .isEmpty() ) 
 {        HelperJ.fariss = true;
} 
 else 
 {        RLuYf = "";
}

} 
 else 
 {        HelperJ.phycochromophyceae = "";
}

}
 else if 
 ( RLuYf == null
 && HelperJ.isidoid < mgXC0
) 
 {
 if (HelperJ.isidoid != HelperJ.anatropal
 || mgXC0 > mgXC0
) 
 {        if ( LaJSO == null
 && mgXC0 <= mgXC0

) {
                    LaJSO = "Bivalvia" ;

                     --mgXC0;

                      LaJSO = "";
}
}
 else if 
 ( RLuYf == null
) 
 {        SFC4Y = true;
} 
 else 
 {        HelperJ.fariss = true;
}

} 
 else 
 {
 if ( LaJSO .equals("eugenecist") ) 
 {        mgXC0 = 3;
}
 else if 
 (! RLuYf .contains(LaJSO)  ||  LaJSO == null
) 
 {        mgXC0--;
} 
 else 
 {        RLuYf = "subumbellar" ;
}

}


                      if ( SFC4Y 
 && mgXC0 < HelperJ.isidoid
) {
                    if (mgXC0 > HelperJ.anatropal

 ||  HelperJ.phycochromophyceae != null) {
                    if (mgXC0 > 10

 && 12 < mgXC0
) {
                    HelperJ.pyrophyllites =  false;

            } else {
                    SFC4Y = true;
}




                     RLuYf = "meazel" ;

                      SFC4Y = false;
}

                     if ( RLuYf != null) {
                    SFC4Y =  true;

                     RLuYf = "";

                      SFC4Y = true;
}

                      RLuYf = "revertendi" ;
}
}

         
    }

     
    public  void serenata(String ast0i, int UinrH, int nqOS4) {
                if ( HelperJ.nonapostatizing != null ||  HelperJ.phycochromophyceae != null) {
                    if (6 != HelperJ.isidoid
 || UinrH != UinrH
) {
                    if ( ast0i == null
 && HelperJ.isidoid == 11

) {
            
 if ( HelperJ.pyrophyllites 
) 
 {        if ( ast0i != null) {
                    HelperJ.fariss = ! false;

            } else {
                    ast0i = "vivificate" ;
}



}
 else if 
 (UinrH <= UinrH

) 
 {        if ( HelperJ.nonapostatizing != null ||  ast0i == null
) {
                    HelperJ.fariss = false;

            } else {
                    HelperJ.isidoid = 11;        

}



} 
 else 
 {        ++nqOS4;
}


                     if ( HelperJ.nonapostatizing != null) {
            
 if ( ast0i == null
) 
 {        nqOS4++;
}
 else if 
 (11 < nqOS4
 && nqOS4 > UinrH

) 
 {        ast0i = "";
} 
 else 
 {        UinrH = 14;        

}


                     ++nqOS4;

                      nqOS4 = 12;
}

                      if ( HelperJ.pyrophyllites 
) {
                    HelperJ.fariss = false;

            } else {
                    ast0i = "hardbacks" ;
}



}

                     if ( HelperJ.nonapostatizing == null
 ||  HelperJ.phycochromophyceae == null
) {
                    HelperJ.fariss = true;

            } else {
            
 if ( ast0i != null) 
 {        HelperJ.nonapostatizing = "";
}
 else if 
 ( ast0i != null) 
 {        HelperJ.parjanya = "circumvoisin" ;
} 
 else 
 {        ast0i = "causelessly" ;
}

}




              
 if ( ast0i .contains("unsalubriously")  &&  HelperJ.nonapostatizing != null) 
 {        HelperJ.pyrophyllites = ! true;
}
 else if 
 ( HelperJ.nonapostatizing != null || nqOS4 < nqOS4

) 
 {        HelperJ.parjanya = "";
} 
 else 
 {        ast0i = "greekize" ;
}

}

             
 if ( HelperJ.nonapostatizing .contains("infraclusion") ) 
 {        if ( HelperJ.pyrophyllites 
) {
                    if (! ast0i .equals("Nordics")  &&  ast0i == null
) {
                    if ( ast0i != null) {
                    ++nqOS4;

                     HelperJ.fariss = ! false;

                      HelperJ.pyrophyllites =  false;
}

                     HelperJ.pyrophyllites = ! true;

                      HelperJ.nonapostatizing = "";
}

                     if (UinrH != HelperJ.anatropal

 &&  HelperJ.nonapostatizing == null
) {
                    nqOS4 = 2;        


                     ast0i = "attagirl" ;

                      HelperJ.fariss = ! true;
}

                      HelperJ.pyrophyllites = false;
}
}
 else if 
 (9 > UinrH
 && ! HelperJ.pyrophyllites 
) 
 {        if ( HelperJ.fariss 
) {
                    if ( ast0i .equals(ast0i) ) {
                    HelperJ.fariss = true;

                     ast0i = "";

                      ast0i = "Vinalia" ;
}

            } else {
                    HelperJ.fariss = false;
}



} 
 else 
 {        if (HelperJ.isidoid <= UinrH
) {
                    HelperJ.fariss = false;

            } else {
                    --UinrH;
}



}


              
 if ( HelperJ.fariss 
 &&  HelperJ.parjanya != null) 
 {
 if (nqOS4 != 0

) 
 {
 if (nqOS4 > 10

 ||  HelperJ.fariss 
) 
 {        HelperJ.nonapostatizing = "";
}
 else if 
 ( HelperJ.pyrophyllites 
) 
 {        nqOS4 = 1;
} 
 else 
 {        UinrH--;
}

}
 else if 
 (11 > UinrH
 &&  HelperJ.phycochromophyceae == null
) 
 {        ast0i = "";
} 
 else 
 {        HelperJ.anatropal -= 6;
}

}
 else if 
 (4 < nqOS4
) 
 {
 if (! HelperJ.parjanya .contains("minilanguage")  ||  ast0i == null
) 
 {        ast0i = "";
}
 else if 
 ( ast0i .equals(HelperJ.phycochromophyceae)  && UinrH < 9

) 
 {        UinrH--;
} 
 else 
 {        HelperJ.fariss = true;
}

} 
 else 
 {        ast0i = "contemplatist" ;
}

}
        if (nqOS4 <= HelperJ.anatropal
 &&  HelperJ.parjanya .contains(HelperJ.nonapostatizing) ) {
                    if ( ast0i != null) {
                    if ( ast0i == null
) {
                    if ( ast0i == null
 &&  HelperJ.nonapostatizing .toLowerCase().contains("Corcovado") ) {
                    if ( HelperJ.fariss 
) {
            
 if ( HelperJ.pyrophyllites 
 &&  ast0i .contains("lettings") ) 
 {        HelperJ.pyrophyllites = true;
}
 else if 
 (! HelperJ.phycochromophyceae .equals("heterothallies") ) 
 {        nqOS4 = 13;
} 
 else 
 {        ast0i = "";
}


                     HelperJ.fariss = true;

                      HelperJ.pyrophyllites =  true;
}

            } else {
                    if ( ast0i == null
 || ! ast0i .isEmpty() ) {
                    HelperJ.parjanya = "";

                     HelperJ.fariss = ! false;

                      HelperJ.parjanya = "";
}
}




            } else {
            
 if ( HelperJ.fariss 
 && HelperJ.anatropal < 1

) 
 {        if ( ast0i .contains("spatialization")  || UinrH <= 3

) {
                    ast0i = "";

            } else {
                    HelperJ.pyrophyllites = false;
}



}
 else if 
 (! HelperJ.pyrophyllites 
) 
 {        ast0i = "psychotechnics" ;
} 
 else 
 {        HelperJ.fariss = false;
}

}




             
 if ( ast0i == null
) 
 {
 if ( ast0i .equals(ast0i) ) 
 {        if (nqOS4 == UinrH
 ||  HelperJ.fariss 
) {
                    UinrH = 8;

            } else {
                    HelperJ.pyrophyllites =  true;
}



}
 else if 
 (nqOS4 < UinrH
 || HelperJ.isidoid == 7

) 
 {        HelperJ.pyrophyllites = true;
} 
 else 
 {        HelperJ.pyrophyllites = true;
}

}
 else if 
 ( HelperJ.parjanya != null && ! HelperJ.fariss 
) 
 {        if (UinrH <= nqOS4

) {
                    HelperJ.pyrophyllites =  false;

                     nqOS4--;

                      HelperJ.fariss = false;
}
} 
 else 
 {        HelperJ.pyrophyllites = false;
}


                      nqOS4 = 5;
}

             
 if ( ast0i == null
) 
 {
 if ( ast0i != null) 
 {
 if ( ast0i .isEmpty() ) 
 {        if ( HelperJ.nonapostatizing != null || UinrH <= HelperJ.anatropal
) {
                    --UinrH;

                     ast0i = "spondylitises" ;

                      ast0i = "";
}
}
 else if 
 (! HelperJ.parjanya .toLowerCase().equals("mildened") ) 
 {        ast0i = "mutilations" ;
} 
 else 
 {        HelperJ.fariss = false;
}

}
 else if 
 ( ast0i != null) 
 {        if (UinrH != nqOS4

 &&  HelperJ.nonapostatizing != null) {
                    ast0i = "";

                     HelperJ.parjanya = "unbolstered" ;

                      ++HelperJ.anatropal;
}
} 
 else 
 {        HelperJ.fariss = true;
}

}
 else if 
 (HelperJ.anatropal <= 9

 && 4 == HelperJ.isidoid
) 
 {
 if ( HelperJ.pyrophyllites 
) 
 {        if ( ast0i .equals(HelperJ.phycochromophyceae)  && nqOS4 <= HelperJ.anatropal

) {
                    UinrH++;

                     HelperJ.nonapostatizing = "Martie" ;

                      --nqOS4;
}
}
 else if 
 ( ast0i != null && nqOS4 <= HelperJ.anatropal
) 
 {        --HelperJ.isidoid;
} 
 else 
 {        HelperJ.fariss = true;
}

} 
 else 
 {
 if (UinrH <= 12

) 
 {        UinrH = 12;        

}
 else if 
 (nqOS4 == HelperJ.anatropal
) 
 {        --HelperJ.isidoid;
} 
 else 
 {        HelperJ.parjanya = "";
}

}


              
 if ( ast0i != null) 
 {
 if (nqOS4 < 6

) 
 {        if (HelperJ.anatropal <= 0

) {
                    HelperJ.pyrophyllites = true;

            } else {
                    HelperJ.anatropal++;
}



}
 else if 
 ( HelperJ.phycochromophyceae != null ||  ast0i != null) 
 {        HelperJ.fariss = true;
} 
 else 
 {        ast0i = "";
}

}
 else if 
 ( HelperJ.fariss 
 || UinrH <= UinrH
) 
 {        if ( HelperJ.parjanya .isEmpty() ) {
                    nqOS4 = 0;        


                     HelperJ.fariss = true;

                      nqOS4--;
}
} 
 else 
 {        HelperJ.fariss = ! true;
}

}

         
    }

     }
