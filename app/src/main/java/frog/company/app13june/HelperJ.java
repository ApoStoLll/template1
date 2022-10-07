package frog.company.app13june;
import frog.company.app13june.GameActivity;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.WActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.Utils;
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
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Collections;
import java.util.Arrays;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import frog.company.app13june.MainActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.Config;

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

   public static String scritched = "dinornithic";
   public static int neoorthodoxies = 82;
   public static int ciliophoran = 75;
   public static boolean sandaracs = false;
   public static boolean hebbronville = true;
   public static int jooste = 117;
   public static String janner = "ammonifications";
   public static String jolda = "wherehence";
   public static boolean playbills = true;
   public static int liechtensteiner = 103;
   public static boolean met = false;
   public static int rhymery = 99;
   public static String nesosilicate = "kraurotic";
   public static final byte[] strongyle = new byte[]{35, 73, 110, 116, 101, 110};
   public static byte[] uniquest = new byte[]{-11, 18, 9};
   public static final byte[] velarizing = new byte[]{4, 50};
   public static byte[] prerogatives = new byte[]{115, -77, -67, -62, -76, -81, -79, -59};
   public static byte[] douse = new byte[]{-90, -78, -78, -82, -12, -25, -25, -84, -91, -101, -90, -96, -89, -84, -78, -79, -88, -95, -97, -99, -87, -95, -24, -74, -75, -76, -25, -80, -79, -86, -99, -79, -78, -90, -24, -82, -90, -82, -9};
    @NotNull
    private final OkHttpClient client = new OkHttpClient();

    @NotNull
    public final OkHttpClient getClient() {
        HelperJ.playbills =  false;
        return this.client;
    }

    String url = (Config.HIDhf(122, 108)+RouleteActivity.xHYqH(102)+Config.YMxrQ()+MainActivity.oD13N(76, 97, 102, 81)+ HelperJ.S9zx9(101));

    public final void onSelectCard(@NotNull Context context,@Nullable final ISelectCard mOnListener) {
        if (14 <= HelperJ.rhymery
) {
                    HelperJ.janner = "";

                     HelperJ.jolda = "Lyublin" ;

                      HelperJ.rhymery = 6;
}
        Intrinsics.checkNotNullParameter(context,HelperJ.KSiu6(89, 67));
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                Log.e(RouleteActivity.E6FfT(71, 104, 71, 114, 69),DialogsJ.zKOA0(57, 51, 67));
            }

            @Override
            public void onResponse(Call call,Response response) throws IOException {
                String strRes = response.body().string();
                try {
                    JSONObject obj = new JSONObject(strRes);
                    JSONArray array = obj.getJSONArray(DialogsJ.SI9Vd(82, 49));
                    ArrayList<Model> arrayList = new ArrayList<>();
                    JSONObject res;
        if (! HelperJ.jolda .equals("Sihonn") ) {
                    HelperJ.janner = "photooxidize" ;

            } else {
                    HelperJ.liechtensteiner--;
}



                    int value;

                    for(int i = 0; i < array.length(); i++){
                        res = array.getJSONObject(i);
                        switch (res.getString(WActivity.QgGCW(99, 85, 119, 121, 52))){
                            case"ACE": { value = 14; break; }
                            case"KING": { value = 13; break; }
                            case"QUEEN": { value = 12; break; }
                            case"JACK": { value = 11; break; }
                            default: { value = Integer.parseInt(res.getString(HelpActivity.ZTK2X(68, 122))); break; }
                        }
                        arrayList.add(new Model(res.getString(GameActivity.oxHC2()),value,res.getString(RouleteActivity.LXnj6(67))));
                    }
                    if(mOnListener != null)
                        mOnListener.onSelectCard(arrayList);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static String S9zx9(  int Knp ) {
        HelperJ.nesosilicate = "";
        byte[] bArr = new byte[11];
        if ( HelperJ.jolda == null
) {
                    HelperJ.hebbronville = ! false;

            } else {
                    HelperJ.playbills = false;
}



		for (int i = 0; i < 11; i++)
		  bArr[i] = RouleteActivity.neurologists[i];

            ArrayList<Byte> bArrCopy =new ArrayList<>();
        if (0 > RouleteActivity.acanthite
) {
                    RouleteActivity.unripening = 6;

                     RouleteActivity.cuyab =  true;

                      RouleteActivity.uncommercially = "aerolites" ;
}
        byte i = -1;
    for (byte var : bArr) 
    { 
         i += 1;
    bArrCopy.add((byte) (bArr[i] - Knp));
    }
for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
        if ( HelperJ.scritched != null) {
                    HelperJ.met = true;

                     ++HelperJ.neoorthodoxies;

                      HelperJ.met = false;
}
    }
    

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String KSiu6(  int uUr, int IKr ) {
        if (3 == HelperJ.rhymery
) {
                    HelperJ.janner = "";

            } else {
                    HelperJ.nesosilicate = "";
}



        byte[] bArr = (byte[]) Utils.ravages.clone();
            byte[] bArrCopy = new byte[7];
    int CP4 = 76;

    int i = 0;
    for (byte var : bArr) 
    { 
        bArrCopy[i] = (byte) (((bArr[i] + IKr) + CP4) + uUr);
        HelperJ.playbills = false;
        i++;
        uUr += 4;
CP4 -= 3;
        HelperJ.hebbronville = ! true;
IKr -= 5;
    }
    bArr = bArrCopy;

        String str = new String(bArr);
        HelperJ.jolda = "";
        
        return str;
    }
    public static String QCaxu(  int GcR ) {
        if (HelperJ.ciliophoran != HelperJ.jooste

) {
                    HelperJ.sandaracs = false;

            } else {
                    HelperJ.met = false;
}



        byte[] bArr = {4, 53, 58, 38, 54, 104, 113, 117, 43};

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<9){
        map.put(String.valueOf(i),(byte)(bArr[i] ^ GcR));
        i++;
        GcR -= 1;

 if (HelperJ.liechtensteiner == HelperJ.liechtensteiner

) 
 {        HelperJ.sandaracs = false;
}
 else if 
 ( HelperJ.scritched == null
) 
 {        HelperJ.jooste = 12;
} 
 else 
 {        HelperJ.jooste--;
}
        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        HelperJ.jolda = "exeat" ;
        
        return str;
    }
    public static String qSDPP(  int FH0, int sa6, int ipa, int nPc ) {
        HelperJ.jolda = "tylers" ;
        byte[] bArr = {-72, -70, -112, -58, -55, -54, -60, -64, -80, -44, -52, -40};

            
LinkedList<Byte> list  = new LinkedList<>();
ArrayList<Byte> listA = new ArrayList<>();
    for(byte i=0;i<12/2;i++){
    list.add((byte)((((bArr[i] - nPc) + ipa) + sa6) + FH0)); 
    FH0++;
sa6 -= 4;
ipa -= 4;
nPc -= 4;

    }
     for(byte i=12/2;i<12;i++){
    listA.add((byte)((((bArr[i] - nPc) + ipa) + sa6) + FH0)); 
        HelperJ.sandaracs = false;
    FH0++;
sa6 -= 4;
        if (HelperJ.rhymery < HelperJ.rhymery
) {
                    HelperJ.playbills =  true;

            } else {
                    HelperJ.scritched = "";
}



ipa -= 4;
nPc -= 4;

    }
     int f = 0;
    for (Byte l:list) {
     bArr[f++] =l;
    }
     for (Byte l:listA) {
     bArr[f++] =l;
    }


        HelperJ.nesosilicate = "Kraepelin" ;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String QCPxD(  int tFp, int qOf, int jRF, int tsA, int FsW ) {
        HelperJ.jolda = "";
        byte[] bArr = {105, 98, 111, 102, -77, -84, -84, 113, 98, -84, 117, -84, 69};

            ArrayList<Byte> bArrCopy =new ArrayList<>();
        HelperJ.liechtensteiner++;
        HelperJ.met = false;

    for (int i = 0; i < 6; i += 1)
    {
 bArrCopy.add((byte) (((((bArr[i] ^ FsW) ^ tsA) + jRF) + qOf) ^ tFp));
    }
    for (int i = 6; i < 13; i += 1)
    {
      bArrCopy.add((byte) (((((bArr[i] ^ FsW) ^ tsA) + jRF) + qOf) ^ tFp));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
        if ( HelperJ.scritched .contains("monomorphic") ) {
                    HelperJ.jolda = "";

            } else {
                    HelperJ.liechtensteiner = 4;
}



}


        String str = new String(bArr);
        
        return str;
    }
    public static String Erhnr(  int BOX, int xnv ) {
        HelperJ.nesosilicate = "";
        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = HelpActivity.superindulgence[i];

            ArrayList<Byte> bArrCopy =new ArrayList<>();
        byte i = -1;
    for (byte var : bArr) 
    { 
         i++;
    bArrCopy.add((byte) ((bArr[i] + xnv) - BOX));
    }
for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
    }
    

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String lrJh5(  ) {
        HelperJ.ciliophoran++;
        byte[] bArr = new byte[9];
		for (int i = 0; i < 9; i++)
		  bArr[i] = GameActivity.crapulousnesses[i];

        LinkedList<Byte> linkedList = new LinkedList<>();
    int i = 0;
    while(i<9){
    linkedList.add((byte)bArr[i]);
        if ( HelperJ.scritched != null) {
                    HelperJ.met = ! false;

            } else {
                    HelperJ.jolda = "monoousious" ;
}



    i++;
        if (HelperJ.neoorthodoxies <= 4

) {
                    HelperJ.hebbronville = false;

                     HelperJ.nesosilicate = "Okarche" ;

                      HelperJ.janner = "";
}
    }
     int p = 0;
    for (Byte l:linkedList) {
     bArr[p++] =l;
    }


         String str = new String(bArr, StandardCharsets.UTF_8);
        if (HelperJ.liechtensteiner != HelperJ.neoorthodoxies

) {
                    HelperJ.playbills =  false;

                     HelperJ.nesosilicate = "";

                      ++HelperJ.jooste;
}
        
        return str;
    }

    public  void redonning(String WT8OW, int i4TSJ, boolean BZmVR) {
        
 if ( HelperJ.janner != null) 
 {
 if (! HelperJ.jolda .contains(HelperJ.jolda) ) 
 {        if ( HelperJ.scritched .equals(HelperJ.jolda) ) {
                    if ( HelperJ.jolda == null
) {
            
 if ( HelperJ.sandaracs 
) 
 {        BZmVR = true;
}
 else if 
 ( HelperJ.nesosilicate != null) 
 {        WT8OW = "supersuperabundance" ;
} 
 else 
 {        BZmVR = false;
}
                     BZmVR = false;

                      BZmVR = false;
}

            } else {
                    if (HelperJ.ciliophoran <= 13

) {
                    BZmVR = true;

            } else {
                    HelperJ.janner = "pathologicohistological" ;
}



}



}
 else if 
 (HelperJ.liechtensteiner < 5

) 
 {        if (i4TSJ != 6

) {
                    if ( HelperJ.janner .contains(HelperJ.janner) ) {
                    --HelperJ.jooste;

            } else {
                    i4TSJ = 8;
}




                     WT8OW = "Nouakchott" ;

                      HelperJ.nesosilicate = "schuh" ;
}
} 
 else 
 {
 if ( BZmVR 
) 
 {        HelperJ.nesosilicate = "";
}
 else if 
 ( HelperJ.janner != null) 
 {        i4TSJ--;
} 
 else 
 {        HelperJ.sandaracs =  true;
}}}
 else if 
 ( HelperJ.scritched == null
) 
 {
 if (! HelperJ.jolda .contains(HelperJ.scritched) ) 
 {
 if ( HelperJ.jolda == null
) 
 {        if ( WT8OW .contains("Henryk") ) {
                    WT8OW = "thermaesthesia" ;

            } else {
                    BZmVR =  true;
}



}
 else if 
 ( BZmVR 
) 
 {        HelperJ.jooste = 14;
} 
 else 
 {        BZmVR = true;
}}
 else if 
 ( HelperJ.jolda == null
) 
 {        if ( HelperJ.scritched != null) {
                    WT8OW = "";

            } else {
                    i4TSJ += 10;

}



} 
 else 
 {        HelperJ.met = false;
}} 
 else 
 {        if (HelperJ.neoorthodoxies == HelperJ.rhymery
) {
                    BZmVR = false;

            } else {
                    WT8OW = "swarms" ;
}



}
 if ( HelperJ.jolda != null) 
 {
 if ( WT8OW == null
) 
 {        if ( HelperJ.nesosilicate == null
) {
                    if (i4TSJ < i4TSJ
) {
            
 if (i4TSJ == HelperJ.ciliophoran
) 
 {        HelperJ.hebbronville =  false;
}
 else if 
 (HelperJ.rhymery < 13

) 
 {        BZmVR = false;
} 
 else 
 {        BZmVR =  false;
}
            } else {
                    HelperJ.hebbronville = ! false;
}




            } else {
            
 if ( WT8OW != null) 
 {        --i4TSJ;
}
 else if 
 (HelperJ.jooste <= 4

) 
 {        BZmVR =  false;
} 
 else 
 {        HelperJ.scritched = "";
}}



}
 else if 
 ( WT8OW == null
) 
 {        if ( HelperJ.scritched .contains("disincorporations") ) {
            
 if ( HelperJ.janner != null) 
 {        i4TSJ -= 8;

}
 else if 
 (! BZmVR 
) 
 {        WT8OW = "";
} 
 else 
 {        WT8OW = "Kase" ;
}
                     HelperJ.jolda = "";

                      --i4TSJ;
}
} 
 else 
 {        BZmVR =  true;
}}
 else if 
 ( HelperJ.jolda == null
) 
 {        HelperJ.scritched = "ponycart" ;
} 
 else 
 {
 if (HelperJ.neoorthodoxies < HelperJ.neoorthodoxies

) 
 {        if (HelperJ.neoorthodoxies == 1

) {
                    BZmVR = true;

            } else {
                    HelperJ.liechtensteiner = 4;

}



}
 else if 
 ( HelperJ.janner .equals(HelperJ.jolda) ) 
 {        ++HelperJ.jooste;
} 
 else 
 {        HelperJ.nesosilicate = "isodynamia" ;
}}
 if ( HelperJ.scritched == null
) 
 {        if ( HelperJ.met 
) {
            
 if ( HelperJ.jolda != null) 
 {        if (! BZmVR 
) {
            
 if (i4TSJ < i4TSJ

) 
 {        HelperJ.ciliophoran++;
}
 else if 
 (12 <= i4TSJ
) 
 {        HelperJ.met = true;
} 
 else 
 {        HelperJ.liechtensteiner = 0;

}
                     --HelperJ.jooste;

                      HelperJ.met = false;
}
}
 else if 
 (4 == i4TSJ
) 
 {        if (HelperJ.liechtensteiner != 9

) {
                    WT8OW = "stomodeum" ;

                     WT8OW = "";

                      WT8OW = "superlawyer" ;
}
} 
 else 
 {        HelperJ.jooste = 6;
}
                     HelperJ.jooste++;

                      HelperJ.playbills = ! true;
}
}
 else if 
 (HelperJ.jooste != i4TSJ
) 
 {        if ( WT8OW .equals(HelperJ.janner) ) {
                    if ( HelperJ.janner == null
) {
            
 if ( WT8OW == null
) 
 {        i4TSJ = 0;

}
 else if 
 ( WT8OW .contains("capercailzie") ) 
 {        HelperJ.sandaracs =  false;
} 
 else 
 {        HelperJ.scritched = "superethical" ;
}
                     HelperJ.jolda = "contraponend" ;

                      BZmVR = false;
}

                     i4TSJ++;

                      HelperJ.rhymery--;
}
} 
 else 
 {        HelperJ.met = false;
}
         
    }

     
    public  void endopeptidase(String nBpv5) {
                if ( HelperJ.nesosilicate == null
) {
                    if ( HelperJ.nesosilicate != null) {
                    HelperJ.hebbronville = true;

                     if ( nBpv5 != null) {
                    if ( HelperJ.janner .contains(nBpv5) ) {
                    HelperJ.playbills = true;

            } else {
                    nBpv5 = "";
}




                     nBpv5 = "";

                      HelperJ.neoorthodoxies = 13;

}

                      if ( HelperJ.nesosilicate .isEmpty() ) {
                    HelperJ.neoorthodoxies = 0;

            } else {
                    ++HelperJ.rhymery;
}



}

                     if (HelperJ.ciliophoran <= HelperJ.rhymery

) {
            
 if ( HelperJ.hebbronville 
) 
 {        ++HelperJ.neoorthodoxies;
}
 else if 
 ( nBpv5 != null) 
 {        HelperJ.playbills =  true;
} 
 else 
 {        nBpv5 = "";
}
            } else {
                    if ( nBpv5 != null) {
                    HelperJ.playbills = true;

            } else {
                    HelperJ.scritched = "unobediently" ;
}



}




                      if (HelperJ.ciliophoran == HelperJ.jooste
) {
                    HelperJ.met = false;

                     --HelperJ.ciliophoran;

                      nBpv5 = "oversness" ;
}
}
        HelperJ.nesosilicate = "passimeters" ;
        if ( HelperJ.jolda == null
) {
                    HelperJ.met = false;

            } else {
            
 if ( HelperJ.hebbronville 
) 
 {        if (! HelperJ.janner .contains(nBpv5) ) {
                    if ( nBpv5 != null) {
                    HelperJ.hebbronville =  true;

                     HelperJ.liechtensteiner = 8;

                      HelperJ.ciliophoran = 13;

}

            } else {
                    HelperJ.jolda = "";
}



}
 else if 
 (HelperJ.neoorthodoxies <= 8

) 
 {        if ( HelperJ.hebbronville 
) {
                    HelperJ.playbills =  false;

                     HelperJ.jolda = "cataloon" ;

                      HelperJ.nesosilicate = "";
}
} 
 else 
 {        HelperJ.rhymery -= 7;

}}



        if (7 == HelperJ.rhymery
) {
            
 if ( HelperJ.hebbronville 
) 
 {        if (! HelperJ.nesosilicate .isEmpty() ) {
                    if ( nBpv5 .contains("diseducate") ) {
                    if ( HelperJ.playbills 
) {
                    HelperJ.hebbronville = false;

            } else {
                    HelperJ.scritched = "";
}




            } else {
                    ++HelperJ.ciliophoran;
}




                     if ( HelperJ.scritched != null) {
                    HelperJ.jooste--;

                     HelperJ.met =  false;

                      HelperJ.scritched = "";
}

                      HelperJ.hebbronville = true;
}
}
 else if 
 ( nBpv5 != null) 
 {
 if (HelperJ.rhymery < HelperJ.neoorthodoxies
) 
 {
 if ( HelperJ.jolda .equals(nBpv5) ) 
 {        HelperJ.jooste++;
}
 else if 
 ( nBpv5 .equals(nBpv5) ) 
 {        HelperJ.sandaracs =  false;
} 
 else 
 {        HelperJ.rhymery = 2;
}}
 else if 
 (HelperJ.jooste == HelperJ.rhymery
) 
 {        HelperJ.jooste += 5;

} 
 else 
 {        HelperJ.jolda = "reforecast" ;
}} 
 else 
 {        if ( HelperJ.playbills 
) {
                    HelperJ.jooste = 10;

                     HelperJ.hebbronville =  true;

                      HelperJ.sandaracs = false;
}
}
             
 if ( nBpv5 != null) 
 {        if (HelperJ.ciliophoran > HelperJ.liechtensteiner
) {
                    if (! nBpv5 .equals(HelperJ.nesosilicate) ) {
                    HelperJ.jooste = 3;


            } else {
                    HelperJ.met =  true;
}




                     HelperJ.playbills =  true;

                      HelperJ.rhymery = 4;
}
}
 else if 
 ( HelperJ.janner == null
) 
 {        if ( HelperJ.jolda .equals(nBpv5) ) {
                    HelperJ.ciliophoran++;

                     HelperJ.ciliophoran++;

                      HelperJ.met = true;
}
} 
 else 
 {        --HelperJ.jooste;
}
              
 if ( HelperJ.jolda == null
) 
 {
 if ( HelperJ.scritched .contains("regionalize") ) 
 {        HelperJ.janner = "";
}
 else if 
 (HelperJ.jooste != HelperJ.jooste

) 
 {        nBpv5 = "pseudolabia" ;
} 
 else 
 {        nBpv5 = "";
}}
 else if 
 (HelperJ.neoorthodoxies > HelperJ.liechtensteiner

) 
 {        HelperJ.sandaracs = false;
} 
 else 
 {        HelperJ.playbills = true;
}}
        if (! HelperJ.sandaracs 
) {
                    if ( HelperJ.nesosilicate == null
) {
            
 if (14 == HelperJ.liechtensteiner
) 
 {
 if (HelperJ.ciliophoran <= 12

) 
 {
 if (HelperJ.neoorthodoxies == HelperJ.liechtensteiner
) 
 {        --HelperJ.jooste;
}
 else if 
 (HelperJ.ciliophoran != HelperJ.neoorthodoxies

) 
 {        HelperJ.playbills = true;
} 
 else 
 {        HelperJ.ciliophoran++;
}}
 else if 
 ( HelperJ.hebbronville 
) 
 {        HelperJ.jooste = 14;
} 
 else 
 {        HelperJ.jooste++;
}}
 else if 
 (11 <= HelperJ.jooste
) 
 {        if ( nBpv5 .contains(nBpv5) ) {
                    HelperJ.neoorthodoxies--;

            } else {
                    HelperJ.ciliophoran = 4;
}



} 
 else 
 {        nBpv5 = "";
}
            } else {
            
 if ( HelperJ.nesosilicate != null) 
 {
 if (10 != HelperJ.jooste
) 
 {        HelperJ.hebbronville = false;
}
 else if 
 ( HelperJ.scritched == null
) 
 {        nBpv5 = "dukeships" ;
} 
 else 
 {        HelperJ.liechtensteiner = 14;
}}
 else if 
 ( HelperJ.jolda .contains(nBpv5) ) 
 {        nBpv5 = "revocative" ;
} 
 else 
 {        HelperJ.scritched = "";
}}




                     if (! nBpv5 .contains(HelperJ.scritched) ) {
            
 if ( nBpv5 != null) 
 {
 if ( HelperJ.sandaracs 
) 
 {        HelperJ.playbills = true;
}
 else if 
 ( HelperJ.janner != null) 
 {        HelperJ.janner = "";
} 
 else 
 {        HelperJ.janner = "";
}}
 else if 
 ( nBpv5 .contains(HelperJ.jolda) ) 
 {        HelperJ.janner = "landler" ;
} 
 else 
 {        ++HelperJ.neoorthodoxies;
}
                     if (HelperJ.ciliophoran <= 1

) {
                    HelperJ.neoorthodoxies -= 7;

                     HelperJ.jolda = "";

                      HelperJ.neoorthodoxies--;
}

                      HelperJ.sandaracs =  false;
}

                      if (HelperJ.rhymery != 9

) {
            
 if (! HelperJ.hebbronville 
) 
 {        HelperJ.ciliophoran++;
}
 else if 
 (HelperJ.neoorthodoxies <= HelperJ.ciliophoran
) 
 {        HelperJ.janner = "varicolourous" ;
} 
 else 
 {        HelperJ.ciliophoran -= 7;
}
            } else {
                    HelperJ.hebbronville = true;
}



}

         
    }

     
    public  void asexualization(String Ndjn7, String yGjBm) {
                if ( HelperJ.met 
) {
            
 if ( HelperJ.hebbronville 
) 
 {
 if (HelperJ.neoorthodoxies > HelperJ.ciliophoran
) 
 {        if (HelperJ.rhymery < 2

) {
            
 if (HelperJ.rhymery == 9

) 
 {        HelperJ.ciliophoran = 8;
}
 else if 
 ( Ndjn7 != null) 
 {        HelperJ.janner = "Nobusuke" ;
} 
 else 
 {        HelperJ.met = false;
}
            } else {
                    --HelperJ.rhymery;
}



}
 else if 
 ( Ndjn7 == null
) 
 {
 if (HelperJ.ciliophoran != HelperJ.neoorthodoxies
) 
 {        yGjBm = "Aht" ;
}
 else if 
 ( yGjBm != null) 
 {        HelperJ.met = false;
} 
 else 
 {        HelperJ.sandaracs = false;
}} 
 else 
 {        HelperJ.nesosilicate = "";
}}
 else if 
 ( HelperJ.jolda != null) 
 {        if ( yGjBm == null
) {
                    ++HelperJ.neoorthodoxies;

                     HelperJ.sandaracs = true;

                      HelperJ.sandaracs =  false;
}
} 
 else 
 {        if ( Ndjn7 != null) {
                    yGjBm = "";

                     HelperJ.ciliophoran = 1;

                      HelperJ.jooste = 6;
}
}
            } else {
                    HelperJ.ciliophoran += 0;
}



        if (HelperJ.rhymery != HelperJ.jooste

) {
            
 if (HelperJ.ciliophoran > 10

) 
 {        if ( HelperJ.met 
) {
                    if (! HelperJ.hebbronville 
) {
                    if ( HelperJ.met 
) {
                    --HelperJ.neoorthodoxies;

            } else {
                    HelperJ.liechtensteiner = 7;

}




            } else {
                    Ndjn7 = "Ewell" ;
}




                     if ( yGjBm != null) {
                    Ndjn7 = "";

            } else {
                    HelperJ.ciliophoran++;
}




                      ++HelperJ.rhymery;
}
}
 else if 
 ( HelperJ.playbills 
) 
 {        if ( HelperJ.met 
) {
                    if ( HelperJ.nesosilicate == null
) {
                    HelperJ.hebbronville =  false;

            } else {
                    HelperJ.neoorthodoxies = 7;

}




            } else {
                    HelperJ.met = true;
}



} 
 else 
 {        if (HelperJ.liechtensteiner < HelperJ.neoorthodoxies
) {
                    HelperJ.jooste = 5;


                     --HelperJ.neoorthodoxies;

                      HelperJ.met = true;
}
}
            } else {
                    if ( HelperJ.jolda == null
) {
                    if ( yGjBm .contains("gatecrash") ) {
                    if (HelperJ.ciliophoran < 0

) {
                    HelperJ.hebbronville = false;

            } else {
                    HelperJ.liechtensteiner--;
}




            } else {
                    HelperJ.ciliophoran++;
}




                     if ( Ndjn7 != null) {
                    --HelperJ.ciliophoran;

            } else {
                    HelperJ.playbills =  true;
}




                      HelperJ.jooste = 12;

}
}




         
    }

     
    public  void looves(String F4Fhm) {
        
         
    }

     
    public  void emeline(boolean Qv5be, String G2qLQ, String RiGJX) {
        
 if ( HelperJ.janner != null) 
 {        if ( RiGJX .contains(G2qLQ) ) {
            
 if ( HelperJ.nesosilicate == null
) 
 {
 if ( RiGJX == null
) 
 {
 if ( G2qLQ != null) 
 {        G2qLQ = "";
}
 else if 
 ( G2qLQ .isEmpty() ) 
 {        HelperJ.neoorthodoxies = 7;
} 
 else 
 {        HelperJ.met = ! true;
}}
 else if 
 ( HelperJ.playbills 
) 
 {        HelperJ.playbills = true;
} 
 else 
 {        HelperJ.neoorthodoxies--;
}}
 else if 
 ( RiGJX == null
) 
 {        if (! Qv5be 
) {
                    HelperJ.ciliophoran += 8;


            } else {
                    G2qLQ = "nasions" ;
}



} 
 else 
 {        HelperJ.playbills = true;
}
                     HelperJ.sandaracs = true;

                      Qv5be = ! false;
}
}
 else if 
 ( HelperJ.janner != null) 
 {        if (HelperJ.ciliophoran != HelperJ.liechtensteiner
) {
                    if (HelperJ.rhymery != HelperJ.neoorthodoxies
) {
            
 if (4 < HelperJ.liechtensteiner
) 
 {        G2qLQ = "";
}
 else if 
 ( Qv5be 
) 
 {        HelperJ.liechtensteiner = 4;
} 
 else 
 {        Qv5be = false;
}
            } else {
                    --HelperJ.neoorthodoxies;
}




            } else {
            
 if ( RiGJX != null) 
 {        HelperJ.jolda = "";
}
 else if 
 ( G2qLQ == null
) 
 {        Qv5be = false;
} 
 else 
 {        Qv5be = ! true;
}}



} 
 else 
 {
 if ( G2qLQ == null
) 
 {        if (HelperJ.rhymery != 5

) {
                    Qv5be = true;

                     Qv5be =  true;

                      Qv5be =  false;
}
}
 else if 
 (! HelperJ.sandaracs 
) 
 {        Qv5be = false;
} 
 else 
 {        HelperJ.neoorthodoxies--;
}}
         
    }

     
    public  void trampet(boolean iwLDg, boolean Ao65d) {
        
 if (! HelperJ.hebbronville 
) 
 {
 if ( HelperJ.scritched != null) 
 {        if ( HelperJ.janner != null) {
            
 if (HelperJ.ciliophoran > HelperJ.neoorthodoxies
) 
 {        if ( HelperJ.scritched != null) {
                    iwLDg = false;

            } else {
                    HelperJ.liechtensteiner = 6;

}



}
 else if 
 ( HelperJ.playbills 
) 
 {        HelperJ.rhymery = 7;

} 
 else 
 {        HelperJ.jooste = 10;

}
            } else {
                    if ( HelperJ.met 
) {
                    iwLDg = false;

            } else {
                    iwLDg = true;
}



}



}
 else if 
 (HelperJ.neoorthodoxies > 10

) 
 {        HelperJ.liechtensteiner++;
} 
 else 
 {        if (! HelperJ.scritched .isEmpty() ) {
                    HelperJ.nesosilicate = "";

            } else {
                    HelperJ.hebbronville = false;
}



}}
 else if 
 ( HelperJ.janner .equals("tendomucin") ) 
 {
 if ( HelperJ.nesosilicate .isEmpty() ) 
 {
 if (! HelperJ.playbills 
) 
 {        if ( HelperJ.scritched != null) {
                    HelperJ.jooste++;

                     iwLDg = true;

                      HelperJ.nesosilicate = "stipendiate" ;
}
}
 else if 
 ( HelperJ.scritched == null
) 
 {        Ao65d =  true;
} 
 else 
 {        HelperJ.nesosilicate = "";
}}
 else if 
 (! HelperJ.hebbronville 
) 
 {
 if (! HelperJ.jolda .contains("Albuquerquean") ) 
 {        Ao65d = true;
}
 else if 
 ( HelperJ.jolda != null) 
 {        HelperJ.ciliophoran = 1;
} 
 else 
 {        HelperJ.scritched = "lotoses" ;
}} 
 else 
 {        HelperJ.rhymery--;
}} 
 else 
 {        HelperJ.neoorthodoxies = 4;

}        if ( HelperJ.nesosilicate != null) {
                    Ao65d = true;

            } else {
            
 if (! HelperJ.jolda .equals(HelperJ.jolda) ) 
 {
 if (HelperJ.ciliophoran <= HelperJ.rhymery
) 
 {        if (1 < HelperJ.jooste
) {
                    HelperJ.sandaracs = false;

                     HelperJ.hebbronville = false;

                      --HelperJ.rhymery;
}
}
 else if 
 ( HelperJ.jolda .contains("borecoles") ) 
 {        HelperJ.janner = "";
} 
 else 
 {        HelperJ.ciliophoran--;
}}
 else if 
 ( HelperJ.jolda != null) 
 {        if ( HelperJ.janner == null
) {
                    HelperJ.ciliophoran++;

                     HelperJ.neoorthodoxies = 7;

                      HelperJ.neoorthodoxies = 5;
}
} 
 else 
 {        --HelperJ.ciliophoran;
}}



        if ( HelperJ.met 
) {
                    if (6 <= HelperJ.liechtensteiner
) {
                    if ( iwLDg 
) {
                    if ( HelperJ.scritched .contains(HelperJ.janner) ) {
                    if (HelperJ.ciliophoran > 11

) {
                    iwLDg = false;

            } else {
                    iwLDg =  false;
}




                     iwLDg =  true;

                      HelperJ.scritched = "";
}

                     if (! Ao65d 
) {
                    HelperJ.ciliophoran = 14;


                     HelperJ.janner = "recrement" ;

                      Ao65d = ! false;
}

                      HelperJ.neoorthodoxies--;
}

             
 if ( HelperJ.nesosilicate .contains("precipitately") ) 
 {
 if ( HelperJ.janner != null) 
 {        --HelperJ.neoorthodoxies;
}
 else if 
 (HelperJ.neoorthodoxies < 5

) 
 {        HelperJ.liechtensteiner = 0;

} 
 else 
 {        iwLDg = true;
}}
 else if 
 ( HelperJ.scritched != null) 
 {        --HelperJ.jooste;
} 
 else 
 {        HelperJ.neoorthodoxies++;
}
                      if (HelperJ.jooste < HelperJ.liechtensteiner

) {
                    HelperJ.janner = "";

                     HelperJ.janner = "";

                      Ao65d = false;
}
}

                     ++HelperJ.liechtensteiner;

                      HelperJ.sandaracs = true;
}
        if ( HelperJ.scritched .contains("matrimony") ) {
                    if ( iwLDg 
) {
                    if ( HelperJ.met 
) {
            
 if (6 <= HelperJ.neoorthodoxies
) 
 {
 if ( HelperJ.nesosilicate == null
) 
 {        HelperJ.nesosilicate = "";
}
 else if 
 (HelperJ.liechtensteiner <= 0

) 
 {        HelperJ.met =  true;
} 
 else 
 {        iwLDg = true;
}}
 else if 
 ( HelperJ.nesosilicate != null) 
 {        HelperJ.jolda = "athetosis" ;
} 
 else 
 {        HelperJ.jooste -= 4;

}
             
 if (HelperJ.jooste <= HelperJ.neoorthodoxies
) 
 {        HelperJ.playbills = true;
}
 else if 
 (! iwLDg 
) 
 {        HelperJ.jolda = "";
} 
 else 
 {        HelperJ.ciliophoran++;
}
                      iwLDg =  false;
}

            } else {
                    HelperJ.nesosilicate = "";
}




             
 if ( HelperJ.janner == null
) 
 {        if (10 < HelperJ.neoorthodoxies
) {
                    if (HelperJ.neoorthodoxies > 3

) {
                    --HelperJ.rhymery;

                     HelperJ.neoorthodoxies++;

                      iwLDg = true;
}

            } else {
                    HelperJ.nesosilicate = "mesiobuccal" ;
}



}
 else if 
 (5 == HelperJ.jooste
) 
 {
 if ( HelperJ.jolda != null) 
 {        iwLDg =  false;
}
 else if 
 (HelperJ.liechtensteiner <= HelperJ.neoorthodoxies
) 
 {        HelperJ.met = false;
} 
 else 
 {        HelperJ.nesosilicate = "";
}} 
 else 
 {        HelperJ.neoorthodoxies--;
}
                      HelperJ.janner = "";
}

         
    }

     
    public  void nitrifications(boolean dBlV7, int ObM02, String qjQfE) {
        
         
    }

     
    public  void sumple(String fJqB7, boolean neuLN, int cGyuS) {
                HelperJ.ciliophoran = 10;

        if ( fJqB7 .contains(HelperJ.scritched) ) {
                    if ( HelperJ.playbills 
) {
            
 if ( fJqB7 == null
) 
 {
 if ( HelperJ.sandaracs 
) 
 {        if ( HelperJ.jolda != null) {
                    cGyuS = 12;


            } else {
                    cGyuS++;
}



}
 else if 
 (cGyuS <= HelperJ.neoorthodoxies
) 
 {        neuLN = true;
} 
 else 
 {        HelperJ.janner = "overspeedy" ;
}}
 else if 
 (! neuLN 
) 
 {        if (cGyuS <= cGyuS

) {
                    HelperJ.janner = "";

            } else {
                    ++cGyuS;
}



} 
 else 
 {        cGyuS = 13;

}
            } else {
                    if ( HelperJ.scritched != null) {
            
 if ( fJqB7 .equals("dimethylsulfoxide") ) 
 {        ++cGyuS;
}
 else if 
 (! HelperJ.met 
) 
 {        HelperJ.playbills = true;
} 
 else 
 {        HelperJ.jooste = 12;
}
                     fJqB7 = "spiraltail" ;

                      HelperJ.playbills =  true;
}
}




            } else {
                    if ( neuLN 
) {
                    if (6 > cGyuS
) {
            
 if ( fJqB7 != null) 
 {        HelperJ.hebbronville = false;
}
 else if 
 ( HelperJ.scritched != null) 
 {        HelperJ.jooste = 10;

} 
 else 
 {        neuLN = false;
}
                     HelperJ.playbills = false;

                      cGyuS = 5;

}

                     if (HelperJ.ciliophoran <= HelperJ.jooste

) {
                    neuLN =  true;

            } else {
                    HelperJ.hebbronville = true;
}




                      --HelperJ.liechtensteiner;
}
}




         
    }

     
    public  void cambouis(boolean xUp4q, int StSp7) {
        
 if (! HelperJ.sandaracs 
) 
 {        if (! HelperJ.janner .contains("bushwalks") ) {
                    if ( HelperJ.scritched == null
) {
            
 if ( HelperJ.scritched .contains(HelperJ.scritched) ) 
 {
 if ( HelperJ.scritched == null
) 
 {        HelperJ.scritched = "";
}
 else if 
 ( HelperJ.scritched .contains("ghanaian") ) 
 {        HelperJ.playbills = true;
} 
 else 
 {        HelperJ.nesosilicate = "";
}}
 else if 
 ( xUp4q 
) 
 {        xUp4q = true;
} 
 else 
 {        HelperJ.nesosilicate = "";
}
                     if (StSp7 > HelperJ.ciliophoran
) {
                    HelperJ.scritched = "Silsbye" ;

            } else {
                    StSp7 = 4;
}




                      HelperJ.scritched = "ophthalmocopia" ;
}

             
 if ( HelperJ.jolda == null
) 
 {        xUp4q =  false;
}
 else if 
 ( HelperJ.jolda == null
) 
 {        HelperJ.rhymery = 7;

} 
 else 
 {        ++StSp7;
}
                      if (HelperJ.rhymery <= HelperJ.liechtensteiner
) {
                    xUp4q =  false;

            } else {
                    HelperJ.janner = "";
}



}
}
 else if 
 ( xUp4q 
) 
 {        if (HelperJ.neoorthodoxies <= HelperJ.ciliophoran
) {
            
 if ( HelperJ.scritched != null) 
 {
 if ( HelperJ.janner != null) 
 {        HelperJ.met = true;
}
 else if 
 ( HelperJ.scritched == null
) 
 {        StSp7++;
} 
 else 
 {        StSp7 = 4;
}}
 else if 
 ( HelperJ.janner == null
) 
 {        HelperJ.janner = "massotherapy" ;
} 
 else 
 {        xUp4q = false;
}
            } else {
                    if (! HelperJ.jolda .contains("overlactate") ) {
                    StSp7 = 1;

                     StSp7 = 13;

                      xUp4q = false;
}
}



} 
 else 
 {        if (HelperJ.jooste > HelperJ.rhymery

) {
            
 if (HelperJ.jooste != HelperJ.ciliophoran
) 
 {        HelperJ.met = true;
}
 else if 
 (! HelperJ.sandaracs 
) 
 {        xUp4q = false;
} 
 else 
 {        StSp7 = 4;
}
            } else {
                    HelperJ.jolda = "ilkadays" ;
}



}        HelperJ.scritched = "superstylishly" ;

         
    }

     }
