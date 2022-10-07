package frog.company.app13june;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.Config;
import frog.company.app13june.HelperJ;
import frog.company.app13june.GameActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.MainActivity;
import frog.company.app13june.DialogsJ;
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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import frog.company.app13june.databinding.ActivityGameBinding;

public class GameActivity extends AppCompatActivity implements IResultDialog,ISelectCard {

   public static String quaresma = "mesquite";
   public static String demisable = "hoeshin";
   public static String soldanella = "novilunar";
   public static int fittable = 74;
   public static boolean spittings = false;
   public static boolean myliobatidae = false;
   public static boolean uncereclothed = false;
   public static int pandemonium = 68;
   public static String overconfidences = "Nuristanis";
   public static final byte[] crapulousnesses = new byte[]{80, 104, 111, 116, 111, 70, 105, 108, 101};
   public static byte[] lazar = new byte[]{83, 116};
   public static byte[] leslie = new byte[]{97, 112, 105, 47, 100, 101, 99, 107, 47};

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

 if (GameActivity.pandemonium <= GameActivity.pandemonium
) 
 {        GameActivity.spittings =  false;
}
 else if 
 ( GameActivity.soldanella == null
) 
 {        GameActivity.pandemonium = 2;
} 
 else 
 {        GameActivity.quaresma = "chuffer" ;
}        super.onCreate(savedInstanceState);
        if ( GameActivity.myliobatidae 
) {
                    GameActivity.quaresma = "chalumeau" ;

            } else {
                    GameActivity.myliobatidae = true;
}




        binding = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnBet.setOnClickListener(view -> {
            step++;

            runOnUiThread(() -> {
                switch (step) {
                    case 1: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card4);
                        onAddCard(false);
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy4);
                        onAddCard(true);
                    }
                    case 2: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card5);
        GameActivity.fittable--;
                        onAddCard(false);
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy5);
                        onAddCard(true);

                        onStopGame();
                    }
                    default: step = 0;
        GameActivity.uncereclothed = true;
                }
            });
        });

        onStartGame();
    }
    private void onStartGame(){

 if ( GameActivity.demisable == null
) 
 {        GameActivity.myliobatidae =  true;
}
 else if 
 ( GameActivity.spittings 
) 
 {        GameActivity.overconfidences = "decryption" ;
} 
 else 
 {        GameActivity.quaresma = "";
}        runOnUiThread(() -> {
            new HelperJ().onSelectCard(this,this);
        });
    }

    private void onStopGame(){

 if (GameActivity.fittable < GameActivity.fittable

) 
 {        GameActivity.quaresma = "clapped" .toUpperCase();
}
 else if 
 ( GameActivity.overconfidences .equals("Nicobar") ) 
 {        GameActivity.uncereclothed = true;
} 
 else 
 {        GameActivity.pandemonium = 10;
}
        int myResult = 0;
        GameActivity.fittable = 13;

        int emyResult = 0;

        for(Model i : myCard)
            myResult += i.getValue();
        GameActivity.pandemonium = 14;

        for(Model i : emyCard)
            emyResult += i.getValue();

        step = 0;
        if (GameActivity.fittable <= 8

) {
                    GameActivity.soldanella = "";

            } else {
                    GameActivity.uncereclothed = ! false;
}



        index = 0;
        models = new ArrayList<>();
        emyCard = new ArrayList<>();
        GameActivity.quaresma = "blended" ;
        myCard = new ArrayList<>();

        GameActivity.fittable = 11;
        int finalMyResult = myResult;
        int finalEmyResult = emyResult;

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new DialogsJ().dialogResult(this,Utils.Jn2mF(79, 100, 55, 118, 55),this);
            else
                new DialogsJ().dialogResult(this,GameActivity.EJrZH(106, 74, 113),this);
        });
    }

    private void onAddCard(Boolean emy){
        GameActivity.overconfidences = "faceted" ;
        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {
        if ( GameActivity.demisable .equals("subcaption") ) {
                    GameActivity.pandemonium--;

            } else {
                    ++GameActivity.pandemonium;
}



        models = result;

        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card2);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card3);
        GameActivity.fittable++;
            onAddCard(false);

            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy1);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy2);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy3);
        if ( GameActivity.uncereclothed 
) {
                    GameActivity.spittings = false;

                     GameActivity.spittings = false;

                      GameActivity.overconfidences = "";
}
            onAddCard(true);
        GameActivity.soldanella = "";
        });


        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        GameActivity.uncereclothed = false;
        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
        GameActivity.overconfidences = "nonextractible" .toUpperCase();
                binding.cardEmy2.setImageDrawable(null);
                binding.cardEmy3.setImageDrawable(null);
                binding.cardEmy4.setImageDrawable(null);
                binding.cardEmy5.setImageDrawable(null);

                binding.card1.setImageDrawable(null);
                binding.card2.setImageDrawable(null);
                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);
        if (! GameActivity.demisable .contains("chikaras") ) {
                    GameActivity.uncereclothed =  false;

            } else {
                    GameActivity.fittable = 2;

}



                binding.card5.setImageDrawable(null);

                onStartGame();
            }
        });
    }
    public static String Ed54g(  int FT0 ) {
        GameActivity.spittings = ! false;
        byte[] bArr = new byte[10];
		for (int i = 0; i < 10; i++)
		  bArr[i] = DialogsJ.footrail[i];

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 5; i += 1)
    {
 bArrCopy.add((byte) (bArr[i] - FT0));
        if (GameActivity.fittable > GameActivity.fittable
) {
                    GameActivity.demisable = "";

                     GameActivity.overconfidences = "Rezzani" ;

                      GameActivity.spittings = true;
}
    }
    for (int i = 5; i < 10; i += 1)
    {
      bArrCopy.add((byte) (bArr[i] - FT0));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);

 if (! GameActivity.myliobatidae 
) 
 {        GameActivity.fittable = 10;
}
 else if 
 ( GameActivity.demisable == null
) 
 {        GameActivity.fittable = 8;

} 
 else 
 {        GameActivity.demisable = "resonates" ;
}}


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String eM8PG(  int ofk, int zA1, int G9P, int Hcl, int CcP ) {
        ++GameActivity.fittable;
        byte[] bArr = {10, -16, 4, -30, -47, -9, -35, -21, -13, -57};

            byte[] bArrCopy = new byte[10];
    int UO5 = 81;
        if ( GameActivity.demisable != null) {
                    GameActivity.fittable++;

            } else {
                    GameActivity.pandemonium = 10;

}




    int i = 0;
    for (byte var : bArr) 
    { 
        bArrCopy[i] = (byte) ((((((bArr[i] - CcP) + Hcl) - G9P) ^ zA1) ^ UO5) - ofk);
        i++;
        ofk++;
UO5 += 4;
zA1 += 4;
G9P -= 2;
Hcl += 5;
CcP += 4;
    }
    bArr = bArrCopy;

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String EJrZH(  int GQa, int bfF, int Td5 ) {
        GameActivity.soldanella = "tolldishes" ;
        if ( GameActivity.demisable .isEmpty() ) {
                    GameActivity.myliobatidae =  true;

                     GameActivity.fittable++;

                      GameActivity.myliobatidae = false;
}
        byte[] bArr = {52, 74, 80, 77, -5, 62, 74, 72, 61, 68, 73, 60, 79, 68, 74, 73, -5, 67, 60, 78, -5, 71, 74, 78, 79, 9, -5, 31, 74, -5, 84, 74, 80, -5, 82, 60, 73, 79, -5, 79, 74, -5, 79, 77, 84, -5, 60, 66, 60, 68, 73, 26, 55, 73};

        LinkedList<Byte> linkedList = new LinkedList<>();
        GameActivity.myliobatidae = true;
    int i = 0;
    while(i<54){
    linkedList.add((byte)(((bArr[i] + Td5) + bfF) + GQa));

 if ( GameActivity.quaresma != null) 
 {        GameActivity.fittable = 11;

}
 else if 
 (3 <= GameActivity.fittable
) 
 {        GameActivity.myliobatidae = false;
} 
 else 
 {        GameActivity.pandemonium = 8;

}    i += 1;
    }
     int p = 0;
    for (Byte l:linkedList) {
     bArr[p++] =l;
    }


        String str = new String(bArr);
        
        return str;
    }
    public static String oxHC2(  ) {
        GameActivity.pandemonium--;
        byte[] bArr = {105, 109, 97, 103, 101};
        if (! GameActivity.myliobatidae 
) {
                    GameActivity.soldanella = "pigeoneer" ;

                     ++GameActivity.pandemonium;

                      GameActivity.pandemonium++;
}

        LinkedList<Byte> list  = new LinkedList<>();
        --GameActivity.pandemonium;
ArrayList<Byte> listA = new ArrayList<>();
    for(byte i=0;i<5/2;i++){
    list.add((byte)bArr[i]); 
    }
     for(byte i=5/2;i<5;i++){
    listA.add((byte)bArr[i]); 
    }
     int f = 0;
    for (Byte l:list) {
     bArr[f++] =l;
    }
     for (Byte l:listA) {
     bArr[f++] =l;
    }


        String str = new String(bArr);
        
        return str;
    }
    public static String Ex34J(  int lv4 ) {
        if (GameActivity.fittable > GameActivity.pandemonium
) {
                    GameActivity.uncereclothed = false;

                     GameActivity.overconfidences = "winnow" ;

                      GameActivity.overconfidences = "";
}
        byte[] bArr = {56, 86, 102, 98};

        if ( GameActivity.spittings 
) {
                    GameActivity.soldanella = "splintbone" ;

            } else {
                    GameActivity.pandemonium = 1;
}



        if (GameActivity.pandemonium <= GameActivity.pandemonium
) {
                    GameActivity.quaresma = "";

            } else {
                    GameActivity.soldanella = "actinons" ;
}



            int HTu = 120;
    for (int i = 0; i < 4; i++) {
        bArr[i] = (byte)(((bArr[i] - HTu) - lv4));
        GameActivity.fittable = 6;

        lv4 += 2;
        if (GameActivity.fittable <= 6

) {
                    GameActivity.myliobatidae = false;

            } else {
                    GameActivity.uncereclothed =  false;
}



HTu += 2;
        GameActivity.quaresma = "";
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String vGa3o(  int T7d, int ete, int Wov, int JQC ) {

 if ( GameActivity.quaresma == null
) 
 {        GameActivity.spittings = false;
}
 else if 
 ( GameActivity.uncereclothed 
) 
 {        GameActivity.pandemonium = 7;

} 
 else 
 {        GameActivity.pandemonium++;
        GameActivity.pandemonium = 8;

}        byte[] bArr = {-38, -37};

        if (! GameActivity.myliobatidae 
) {
                    GameActivity.uncereclothed =  true;

            } else {
                    GameActivity.pandemonium = 14;
}



        LinkedList<Byte> linkedList = new LinkedList<>();
    int i = 0;
    while(i<2){
    linkedList.add((byte)((((bArr[i] + JQC) ^ Wov) + ete) - T7d));
    i++;
    }
     int p = 0;
    for (Byte l:linkedList) {
     bArr[p++] =l;
    }


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String s9DxX(  int gAF, int Bj9, int ZTm ) {
        GameActivity.demisable = "";
        byte[] bArr = new byte[8];
		for (int i = 0; i < 8; i++)
		  bArr[i] = RouleteActivity.bonamiases[i];

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;

 if ( GameActivity.demisable != null) 
 {        GameActivity.soldanella = "martyrologic" ;
}
 else if 
 (2 <= GameActivity.fittable
) 
 {        GameActivity.fittable--;
} 
 else 
 {        GameActivity.overconfidences = "unlovingnesses" ;
}    while(i<8){
        map.put(String.valueOf(i),(byte)(((bArr[i] - ZTm) - Bj9) + gAF));
        i++;
        gAF += 5;
Bj9 += 4;
ZTm -= 1;

        }

        GameActivity.demisable = "";
    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        GameActivity.spittings =  false;
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String mqljc(  int xoN, int qyy, int v9S ) {
        GameActivity.myliobatidae = false;
        byte[] bArr = {10, 2, 127, 118};

            
LinkedList<Byte> list  = new LinkedList<>();
ArrayList<Byte> listA = new ArrayList<>();
    for(byte i=0;i<4/2;i++){
    list.add((byte)(((bArr[i] ^ v9S) ^ qyy) ^ xoN)); 
    xoN -= 2;
qyy--;

 if ( GameActivity.demisable != null) 
 {        GameActivity.demisable = "suppositionless" ;
}
 else if 
 (GameActivity.fittable <= GameActivity.fittable

) 
 {        GameActivity.pandemonium = 12;
} 
 else 
 {        GameActivity.myliobatidae =  true;
}v9S -= 1;

    }
     for(byte i=4/2;i<4;i++){
    listA.add((byte)(((bArr[i] ^ v9S) ^ qyy) ^ xoN)); 
    xoN -= 2;
qyy--;
v9S -= 1;

    }
     int f = 0;
    for (Byte l:list) {
     bArr[f++] =l;
    }
     for (Byte l:listA) {
     bArr[f++] =l;
    }


        String str = new String(bArr);
        GameActivity.uncereclothed = false;
        
        return str;
    }
    public static String TXlRX(  int Ih6, int fNP, int YKq, int ssH, int epa ) {
        GameActivity.demisable = "coprecipitated" ;
        byte[] bArr = {-61, -66, -75, -75};
        GameActivity.fittable = 3;


            for (int i = 0; i < 4; i += 1) {
        bArr[i] = (byte)((((((bArr[i] - epa) ^ ssH) + YKq) + fNP) + Ih6));
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String I62oe(  int lDe, int sl6, int SBi ) {
        if ( GameActivity.demisable == null
) {
                    GameActivity.overconfidences = "";

                     ++GameActivity.pandemonium;

                      GameActivity.pandemonium = 9;
}
        byte[] bArr = new byte[1];
		int ind2 = 0;
		for (byte var : RouleteActivity.saernaite)
		  bArr[ind2++] = var;

            byte[] bArrCopy = new byte[1];
    
    int i = 0;
    for (byte var : bArr) 
    { 
        bArrCopy[i] = (byte) (((bArr[i] ^ SBi) + sl6) ^ lDe);
        i++;
        lDe += 2;
        GameActivity.fittable = 11;
sl6 -= 2;
SBi += 2;
    }
    bArr = bArrCopy;

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String sTUeN(  ) {
        if ( HelperJ.playbills 
) {
                    HelperJ.liechtensteiner++;

                     --HelperJ.ciliophoran;

                      HelperJ.nesosilicate = "";
}
        byte[] bArr = new byte[6];

 if (GameActivity.fittable <= GameActivity.fittable
) 
 {        GameActivity.fittable = 12;

}
 else if 
 (12 <= GameActivity.pandemonium
) 
 {        GameActivity.soldanella = "";
} 
 else 
 {        GameActivity.soldanella = "undog" ;
}		int ind2 = 0;
		for (byte var : HelperJ.strongyle)
		  bArr[ind2++] = var;

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 3; i += 1)
    {
 bArrCopy.add((byte) bArr[i]);
    }
    for (int i = 3; i < 6; i += 1)
    {
      bArrCopy.add((byte) bArr[i]);
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


        String str = new String(bArr);
        GameActivity.soldanella = "";
        
        return str;
    }

    public  void brin(boolean JV8r9, int OgkSj) {
        
         
    }

     
    public  void mfnchhausen(String m2R5p, int Qy2SL) {
                if ( m2R5p .contains(GameActivity.overconfidences) ) {
                    if (11 != GameActivity.pandemonium
) {
                    GameActivity.demisable = "Kampliles" ;

                     if ( m2R5p .equals("linksmen") ) {
                    m2R5p = "catamited" .trim();

                     GameActivity.myliobatidae = false;

                      Qy2SL--;
}

              
 if ( GameActivity.demisable != null) 
 {        m2R5p = "outfiction" ;
}
 else if 
 ( GameActivity.quaresma != null) 
 {        GameActivity.uncereclothed =  true;
} 
 else 
 {        GameActivity.uncereclothed = ! false;
}}

                     if ( GameActivity.spittings 
) {
                    if (! GameActivity.soldanella .isEmpty() ) {
                    if (Qy2SL != 9

) {
                    GameActivity.spittings =  false;

                     GameActivity.spittings =  true;

                      GameActivity.pandemonium = 4;
}

            } else {
                    m2R5p = "whumped" ;
}




                     if (Qy2SL < GameActivity.fittable
) {
                    GameActivity.spittings =  true;

                     GameActivity.myliobatidae = true;

                      --GameActivity.pandemonium;
}

                      --Qy2SL;
}

                      if (0 > Qy2SL
) {
                    if ( GameActivity.soldanella == null
) {
                    m2R5p = "";

            } else {
                    GameActivity.pandemonium++;
}




            } else {
                    GameActivity.myliobatidae = false;
}



}
        if (GameActivity.fittable <= Qy2SL
) {
                    if ( GameActivity.overconfidences != null) {
                    GameActivity.pandemonium--;

            } else {
            
 if ( GameActivity.overconfidences .equals(GameActivity.demisable) ) 
 {        if ( GameActivity.demisable != null) {
                    m2R5p = "";

                     m2R5p = "metallurgists" ;

                      GameActivity.uncereclothed = ! false;
}
}
 else if 
 (Qy2SL < GameActivity.pandemonium
) 
 {        GameActivity.spittings = ! false;
} 
 else 
 {        GameActivity.fittable++;
}}




                     if ( m2R5p .isEmpty() ) {
            
 if (! GameActivity.myliobatidae 
) 
 {
 if ( GameActivity.uncereclothed 
) 
 {        Qy2SL = 12;
}
 else if 
 (7 < GameActivity.fittable
) 
 {        m2R5p = "shtchi" ;
} 
 else 
 {        m2R5p = "";
}}
 else if 
 ( GameActivity.quaresma != null) 
 {        Qy2SL = 8;

} 
 else 
 {        Qy2SL = 7;
}
                     if ( GameActivity.demisable .contains(GameActivity.demisable) ) {
                    GameActivity.spittings = true;

                     GameActivity.soldanella = "ells" ;

                      GameActivity.soldanella = "encephalomalacosis" ;
}

                      m2R5p = "";
}

                      if (! GameActivity.overconfidences .isEmpty() ) {
                    if ( m2R5p .isEmpty() ) {
                    Qy2SL = 14;


            } else {
                    GameActivity.spittings = true;
}




            } else {
                    GameActivity.soldanella = "";
}



}
        if (13 == GameActivity.pandemonium
) {
            
 if ( GameActivity.myliobatidae 
) 
 {
 if ( m2R5p != null) 
 {        if (! GameActivity.uncereclothed 
) {
                    if ( GameActivity.demisable == null
) {
                    GameActivity.quaresma = "enhemospore" ;

            } else {
                    GameActivity.overconfidences = "";
}




                     --Qy2SL;

                      GameActivity.spittings =  true;
}
}
 else if 
 (GameActivity.pandemonium < GameActivity.pandemonium

) 
 {        if ( m2R5p != null) {
                    GameActivity.demisable = "";

                     GameActivity.uncereclothed = false;

                      m2R5p = "saccharifications" ;
}
} 
 else 
 {        Qy2SL = 5;

}}
 else if 
 (GameActivity.pandemonium <= GameActivity.fittable

) 
 {        if ( GameActivity.overconfidences != null) {
            
 if (Qy2SL != Qy2SL
) 
 {        Qy2SL -= 13;

}
 else if 
 ( GameActivity.demisable == null
) 
 {        m2R5p = "";
} 
 else 
 {        GameActivity.spittings = false;
}
            } else {
                    GameActivity.myliobatidae = true;
}



} 
 else 
 {        Qy2SL--;
}
            } else {
                    m2R5p = "unvenomed" ;
}



        if ( GameActivity.quaresma != null) {
                    if ( GameActivity.myliobatidae 
) {
                    if ( GameActivity.uncereclothed 
) {
            
 if ( GameActivity.spittings 
) 
 {        if ( GameActivity.demisable != null) {
                    GameActivity.spittings = false;

            } else {
                    GameActivity.myliobatidae = true;
}



}
 else if 
 ( m2R5p == null
) 
 {        Qy2SL = 13;

} 
 else 
 {        GameActivity.demisable = "picayunishly" ;
}
                     if ( m2R5p .isEmpty() ) {
                    GameActivity.uncereclothed = true;

            } else {
                    Qy2SL = 12;
}




                      m2R5p = "suctions" ;
}

            } else {
                    if ( GameActivity.quaresma .equals(GameActivity.soldanella) ) {
                    if ( m2R5p .contains("embowers") ) {
                    m2R5p = "transvaluations" ;

            } else {
                    GameActivity.quaresma = "pterocarpous" ;
}




            } else {
                    Qy2SL = 14;

}



}




            } else {
                    if ( m2R5p != null) {
            
 if (GameActivity.fittable == 6

) 
 {        if (14 != Qy2SL
) {
                    GameActivity.quaresma = "Selenicereus" ;

                     GameActivity.uncereclothed = false;

                      m2R5p = "";
}
}
 else if 
 (Qy2SL > 12

) 
 {        Qy2SL = 7;

} 
 else 
 {        m2R5p = "";
}
            } else {
            
 if (GameActivity.fittable < 14

) 
 {        Qy2SL = 6;

}
 else if 
 (4 == GameActivity.fittable
) 
 {        GameActivity.spittings = false;
} 
 else 
 {        m2R5p = "";
}}



}



        GameActivity.uncereclothed = ! true;

 if (GameActivity.fittable > GameActivity.pandemonium
) 
 {
 if (Qy2SL != 11

) 
 {
 if ( GameActivity.quaresma != null) 
 {        if ( GameActivity.spittings 
) {
                    if ( m2R5p .contains("gayest") ) {
                    GameActivity.spittings = ! false;

            } else {
                    --Qy2SL;
}




                     --Qy2SL;

                      Qy2SL += 9;
}
}
 else if 
 (12 != Qy2SL
) 
 {
 if (Qy2SL > Qy2SL
) 
 {        Qy2SL = 3;

}
 else if 
 (! m2R5p .contains("kreosotes") ) 
 {        GameActivity.myliobatidae =  false;
} 
 else 
 {        Qy2SL = 14;

}} 
 else 
 {        m2R5p = "transapical" ;
}}
 else if 
 (Qy2SL != GameActivity.pandemonium
) 
 {        if ( m2R5p == null
) {
            
 if ( GameActivity.demisable != null) 
 {        m2R5p = "metalliform" ;
}
 else if 
 ( m2R5p != null) 
 {        GameActivity.spittings =  false;
} 
 else 
 {        Qy2SL -= 2;
}
            } else {
                    Qy2SL++;
}



} 
 else 
 {        if (GameActivity.pandemonium > Qy2SL

) {
                    GameActivity.overconfidences = "";

                     m2R5p = "";

                      GameActivity.myliobatidae =  true;
}
}}
 else if 
 ( GameActivity.uncereclothed 
) 
 {        if (11 == GameActivity.pandemonium
) {
                    if ( GameActivity.uncereclothed 
) {
                    if (Qy2SL > GameActivity.pandemonium
) {
                    Qy2SL = 8;

            } else {
                    Qy2SL = 10;
}




            } else {
                    GameActivity.uncereclothed = false;
}




            } else {
            
 if (! GameActivity.demisable .isEmpty() ) 
 {        m2R5p = "";
}
 else if 
 (4 <= GameActivity.fittable
) 
 {        GameActivity.uncereclothed =  true;
} 
 else 
 {        Qy2SL--;
}}



} 
 else 
 {        if (GameActivity.pandemonium <= GameActivity.pandemonium
) {
            
 if (Qy2SL < 9

) 
 {        Qy2SL = 9;

}
 else if 
 ( GameActivity.quaresma .equals(m2R5p) ) 
 {        Qy2SL = 6;

} 
 else 
 {        Qy2SL = 13;
}
            } else {
                    GameActivity.uncereclothed = ! true;
}



}
         
    }

     
    public  void attuitively(String BKqzo, boolean pzfpr, int nf0d4, int arPy2) {
                if ( GameActivity.demisable != null) {
                    if (2 == arPy2
) {
            
 if ( GameActivity.spittings 
) 
 {
 if ( BKqzo != null) 
 {        if ( pzfpr 
) {
                    GameActivity.overconfidences = "khahoon" ;

                     BKqzo = "ostentatiously" ;

                      BKqzo = "";
}
}
 else if 
 (arPy2 <= nf0d4
) 
 {        arPy2 = 0;
} 
 else 
 {        GameActivity.spittings = ! false;
}}
 else if 
 ( GameActivity.soldanella .contains(BKqzo) ) 
 {        if ( BKqzo .equals(GameActivity.soldanella) ) {
                    GameActivity.soldanella = "intercolumn" ;

            } else {
                    BKqzo = "";
}



} 
 else 
 {        ++arPy2;
}
            } else {
                    if (nf0d4 != GameActivity.fittable
) {
                    if (4 != arPy2
) {
                    nf0d4 = 8;

            } else {
                    GameActivity.spittings =  false;
}




            } else {
                    pzfpr = false;
}



}




                     if ( GameActivity.quaresma != null) {
                    if ( GameActivity.demisable .contains(GameActivity.soldanella) ) {
                    if ( GameActivity.demisable .contains("choofed") ) {
                    nf0d4 -= 2;

                     GameActivity.pandemonium++;

                      BKqzo = "";
}

            } else {
                    pzfpr = true;
}




            } else {
                    if ( GameActivity.spittings 
) {
                    BKqzo = "underactivity" ;

                     GameActivity.demisable = "wuntee" ;

                      --nf0d4;
}
}




                      if ( GameActivity.soldanella == null
) {
            
 if ( BKqzo .contains(GameActivity.quaresma) ) 
 {        GameActivity.quaresma = "";
}
 else if 
 (nf0d4 > arPy2
) 
 {        arPy2 = 10;

} 
 else 
 {        GameActivity.quaresma = "";
}
                     BKqzo = "";

                      ++arPy2;
}
}
        if ( GameActivity.demisable .equals("encroach") ) {
                    GameActivity.myliobatidae = ! true;

            } else {
            
 if ( BKqzo != null) 
 {        if (GameActivity.pandemonium != 14

) {
            
 if ( BKqzo == null
) 
 {        BKqzo = "";
}
 else if 
 ( BKqzo != null) 
 {        arPy2 = 13;
} 
 else 
 {        GameActivity.overconfidences = "nonlustrous" ;
}
            } else {
                    pzfpr = false;
}



}
 else if 
 ( GameActivity.overconfidences == null
) 
 {        arPy2++;
} 
 else 
 {        pzfpr = true;
}}



        GameActivity.quaresma = "Caligulism" ;
        if (4 == GameActivity.fittable
) {
                    if ( GameActivity.myliobatidae 
) {
            
 if ( pzfpr 
) 
 {        if (arPy2 == arPy2

) {
            
 if (! pzfpr 
) 
 {        arPy2++;
}
 else if 
 ( pzfpr 
) 
 {        arPy2 = 10;
} 
 else 
 {        GameActivity.myliobatidae = true;
}
                     pzfpr =  true;

                      pzfpr = false;
}
}
 else if 
 ( BKqzo != null) 
 {        if (8 == arPy2
) {
                    ++GameActivity.pandemonium;

            } else {
                    GameActivity.overconfidences = "welterweights" ;
}



} 
 else 
 {        GameActivity.spittings = false;
}
                     if ( GameActivity.uncereclothed 
) {
                    if ( GameActivity.overconfidences .isEmpty() ) {
                    GameActivity.quaresma = "";

                     ++GameActivity.pandemonium;

                      BKqzo = "Alvito" ;
}

                     pzfpr = true;

                      --arPy2;
}

                      GameActivity.myliobatidae = ! true;
}

                     if ( GameActivity.soldanella == null
) {
            
 if ( GameActivity.quaresma .isEmpty() ) 
 {
 if ( BKqzo != null) 
 {        BKqzo = "roofward" .toLowerCase();
}
 else if 
 ( BKqzo == null
) 
 {        --arPy2;
} 
 else 
 {        ++arPy2;
}}
 else if 
 ( BKqzo != null) 
 {        BKqzo = "";
} 
 else 
 {        GameActivity.overconfidences = "prenegotiate" ;
}
            } else {
                    if (! BKqzo .equals("Petasites") ) {
                    pzfpr = true;

            } else {
                    GameActivity.overconfidences = "tachyarrhythmias" ;
}



}




                      if ( pzfpr 
) {
                    if (nf0d4 == 4

) {
                    nf0d4++;

                     GameActivity.spittings = true;

                      GameActivity.fittable = 14;
}

                     GameActivity.spittings = true;

                      pzfpr = false;
}
}

 if (4 == GameActivity.fittable
) 
 {        if (arPy2 != 2

) {
                    arPy2++;

                     if ( GameActivity.soldanella .isEmpty() ) {
                    if ( BKqzo .contains("Cavalieri") ) {
                    --nf0d4;

                     nf0d4 = 4;

                      pzfpr = true;
}

                     arPy2 = 12;

                      GameActivity.soldanella = "urachus" ;
}

              
 if (9 <= nf0d4
) 
 {        GameActivity.quaresma = "";
}
 else if 
 (arPy2 == 6

) 
 {        GameActivity.myliobatidae =  false;
} 
 else 
 {        GameActivity.overconfidences = "";
}}
}
 else if 
 (nf0d4 == GameActivity.fittable
) 
 {        GameActivity.soldanella = "bromvoel" ;
} 
 else 
 {        if ( GameActivity.uncereclothed 
) {
                    if (2 < arPy2
) {
                    GameActivity.soldanella = "";

            } else {
                    pzfpr = ! false;
}




            } else {
                    GameActivity.pandemonium = 8;
}



}
         
    }

     
    public  void underlye(boolean pMc7W, boolean nXLj4, String bixAQ, boolean Pdk67) {
        
 if ( GameActivity.overconfidences != null) 
 {
 if ( GameActivity.overconfidences != null) 
 {
 if (! nXLj4 
) 
 {        if ( GameActivity.myliobatidae 
) {
                    Pdk67 =  true;

                     bixAQ = "";

                      GameActivity.soldanella = "impartable" ;
}
}
 else if 
 ( GameActivity.overconfidences != null) 
 {        pMc7W =  true;
} 
 else 
 {        Pdk67 = false;
}}
 else if 
 ( bixAQ == null
) 
 {        if (! GameActivity.myliobatidae 
) {
                    if (GameActivity.pandemonium <= GameActivity.fittable
) {
                    GameActivity.pandemonium = 8;


                     GameActivity.pandemonium = 13;


                      Pdk67 = true;
}

                     --GameActivity.pandemonium;

                      GameActivity.fittable += 4;
}
} 
 else 
 {        if ( bixAQ == null
) {
                    GameActivity.fittable = 3;


                     GameActivity.fittable = 10;


                      ++GameActivity.pandemonium;
}
}}
 else if 
 ( bixAQ != null) 
 {        if ( GameActivity.myliobatidae 
) {
                    if (! bixAQ .isEmpty() ) {
                    if (GameActivity.pandemonium <= GameActivity.fittable
) {
                    GameActivity.quaresma = "silos" ;

                     bixAQ = "methysergide" ;

                      GameActivity.overconfidences = "";
}

                     GameActivity.fittable++;

                      GameActivity.myliobatidae =  false;
}

            } else {
                    if (GameActivity.pandemonium != GameActivity.fittable

) {
                    GameActivity.demisable = "";

            } else {
                    pMc7W = false;
}



}



} 
 else 
 {        if ( bixAQ == null
) {
            
 if ( GameActivity.spittings 
) 
 {        bixAQ = "myelopoietic" ;
}
 else if 
 (! pMc7W 
) 
 {        GameActivity.fittable = 3;
} 
 else 
 {        bixAQ = "";
}
            } else {
                    pMc7W = true;
}



}        if (! GameActivity.soldanella .equals("scouter") ) {
            
 if ( GameActivity.demisable == null
) 
 {
 if ( GameActivity.uncereclothed 
) 
 {        --GameActivity.fittable;
}
 else if 
 ( Pdk67 
) 
 {
 if ( bixAQ == null
) 
 {        ++GameActivity.pandemonium;
}
 else if 
 ( GameActivity.overconfidences .contains("multibreak") ) 
 {        nXLj4 =  true;
} 
 else 
 {        GameActivity.myliobatidae = true;
}} 
 else 
 {        GameActivity.overconfidences = "murderee" ;
}}
 else if 
 (GameActivity.fittable <= GameActivity.fittable

) 
 {        if (7 > GameActivity.pandemonium
) {
            
 if (GameActivity.fittable <= GameActivity.fittable

) 
 {        ++GameActivity.pandemonium;
}
 else if 
 (1 <= GameActivity.pandemonium
) 
 {        nXLj4 = false;
} 
 else 
 {        bixAQ = "";
}
                     pMc7W = false;

                      nXLj4 = false;
}
} 
 else 
 {        if (GameActivity.fittable <= GameActivity.pandemonium
) {
                    ++GameActivity.pandemonium;

            } else {
                    --GameActivity.pandemonium;
}



}
            } else {
                    if ( GameActivity.overconfidences == null
) {
                    if (GameActivity.pandemonium < GameActivity.fittable

) {
            
 if (GameActivity.fittable > GameActivity.fittable
) 
 {        GameActivity.soldanella = "";
}
 else if 
 ( GameActivity.demisable != null) 
 {        bixAQ = "";
} 
 else 
 {        ++GameActivity.fittable;
}
            } else {
                    GameActivity.myliobatidae =  true;
}




             
 if (GameActivity.pandemonium != GameActivity.pandemonium

) 
 {        nXLj4 =  false;
}
 else if 
 ( GameActivity.overconfidences != null) 
 {        bixAQ = "anabo" ;
} 
 else 
 {        ++GameActivity.fittable;
}
                      GameActivity.soldanella = "";
}
}



        if ( GameActivity.overconfidences == null
) {
            
 if ( Pdk67 
) 
 {        nXLj4 = false;
}
 else if 
 ( GameActivity.soldanella .isEmpty() ) 
 {
 if (GameActivity.fittable <= GameActivity.fittable
) 
 {        if (! Pdk67 
) {
                    GameActivity.pandemonium = 5;

            } else {
                    pMc7W = true;
}



}
 else if 
 (! nXLj4 
) 
 {        GameActivity.demisable = "";
} 
 else 
 {        GameActivity.demisable = "";
}} 
 else 
 {        if (GameActivity.pandemonium <= GameActivity.pandemonium
) {
                    pMc7W = true;

            } else {
                    pMc7W = true;
}



}
                     if ( GameActivity.soldanella != null) {
            
 if ( bixAQ != null) 
 {        if ( pMc7W 
) {
                    bixAQ = "";

            } else {
                    --GameActivity.fittable;
}



}
 else if 
 (GameActivity.fittable == 13

) 
 {        GameActivity.pandemonium = 12;
} 
 else 
 {        GameActivity.fittable = 11;

}
             
 if ( nXLj4 
) 
 {        bixAQ = "";
}
 else if 
 ( bixAQ .contains("irises") ) 
 {        bixAQ = "superthankful" ;
} 
 else 
 {        GameActivity.soldanella = "nonsulfurous" ;
}
                      GameActivity.uncereclothed = false;
}

              
 if (GameActivity.pandemonium == 9

) 
 {        --GameActivity.pandemonium;
}
 else if 
 ( bixAQ == null
) 
 {        GameActivity.fittable = 11;

} 
 else 
 {        nXLj4 = false;
}}
        GameActivity.fittable -= 11;

         
    }

     
    public  void dreamfulness(int O8SBl) {
                GameActivity.pandemonium--;
        if ( GameActivity.quaresma .equals("electronystagmographies") ) {
                    if (O8SBl <= 11

) {
                    if (9 != O8SBl
) {
                    if ( GameActivity.myliobatidae 
) {
                    if (O8SBl == O8SBl

) {
                    O8SBl = 3;


                     O8SBl++;

                      GameActivity.spittings = false;
}

            } else {
                    GameActivity.soldanella = "disenthronement" ;
}




            } else {
                    if ( GameActivity.quaresma == null
) {
                    GameActivity.spittings =  false;

            } else {
                    GameActivity.uncereclothed =  false;
}



}




                     if (O8SBl > 10

) {
                    if ( GameActivity.myliobatidae 
) {
                    GameActivity.soldanella = "stewardly" ;

                     GameActivity.spittings = false;

                      GameActivity.quaresma = "negrillo" ;
}

            } else {
                    GameActivity.uncereclothed = false;
}




              
 if ( GameActivity.uncereclothed 
) 
 {        --O8SBl;
}
 else if 
 ( GameActivity.quaresma == null
) 
 {        GameActivity.overconfidences = "";
} 
 else 
 {        GameActivity.demisable = "physicalism" ;
}}

            } else {
                    if (4 > O8SBl
) {
            
 if (2 < GameActivity.pandemonium
) 
 {        GameActivity.demisable = "";
}
 else if 
 ( GameActivity.myliobatidae 
) 
 {        GameActivity.spittings = true;
} 
 else 
 {        GameActivity.pandemonium--;
}
            } else {
            
 if ( GameActivity.demisable != null) 
 {        GameActivity.demisable = "quincunxial" ;
}
 else if 
 ( GameActivity.quaresma != null) 
 {        GameActivity.fittable = 5;
} 
 else 
 {        GameActivity.demisable = "regaled" ;
}}



}



        if ( GameActivity.quaresma != null) {
                    if (3 != GameActivity.fittable
) {
                    if ( GameActivity.quaresma != null) {
                    if ( GameActivity.soldanella != null) {
                    if (8 <= GameActivity.pandemonium
) {
                    GameActivity.quaresma = "";

                     GameActivity.pandemonium++;

                      GameActivity.myliobatidae = ! true;
}

            } else {
                    O8SBl = 7;
}




            } else {
                    ++O8SBl;
}




             
 if ( GameActivity.myliobatidae 
) 
 {
 if ( GameActivity.demisable == null
) 
 {        GameActivity.overconfidences = "";
}
 else if 
 ( GameActivity.demisable .equals(GameActivity.overconfidences) ) 
 {        GameActivity.quaresma = "documentalist" ;
} 
 else 
 {        GameActivity.overconfidences = "myalgias" ;
}}
 else if 
 ( GameActivity.demisable != null) 
 {        O8SBl = 14;

} 
 else 
 {        GameActivity.overconfidences = "";
}
                      if ( GameActivity.quaresma == null
) {
                    GameActivity.soldanella = "";

            } else {
                    GameActivity.spittings =  false;
}



}

            } else {
                    if ( GameActivity.soldanella != null) {
                    if (! GameActivity.quaresma .equals("antinephritic") ) {
                    GameActivity.myliobatidae = true;

            } else {
                    O8SBl--;
}




            } else {
                    if ( GameActivity.overconfidences != null) {
                    GameActivity.overconfidences = "mangaby" ;

            } else {
                    --GameActivity.fittable;
}



}



}




 if ( GameActivity.myliobatidae 
) 
 {        if (! GameActivity.uncereclothed 
) {
                    if (! GameActivity.spittings 
) {
                    if ( GameActivity.overconfidences != null) {
                    if ( GameActivity.overconfidences .isEmpty() ) {
                    O8SBl = 1;


            } else {
                    GameActivity.overconfidences = "swinesty" ;
}




                     GameActivity.uncereclothed = false;

                      GameActivity.overconfidences = "ambigenous" ;
}

                     if (! GameActivity.soldanella .equals(GameActivity.soldanella) ) {
                    GameActivity.soldanella = "unconventionality" ;

                     GameActivity.soldanella = "";

                      GameActivity.quaresma = "tubaron" ;
}

                      GameActivity.demisable = "calinut" ;
}

             
 if (GameActivity.pandemonium <= 8

) 
 {
 if (O8SBl == O8SBl

) 
 {        GameActivity.uncereclothed = false;
}
 else if 
 ( GameActivity.quaresma != null) 
 {        GameActivity.myliobatidae = true;
} 
 else 
 {        GameActivity.uncereclothed = true;
}}
 else if 
 ( GameActivity.spittings 
) 
 {        --GameActivity.fittable;
} 
 else 
 {        ++O8SBl;
}
                      O8SBl = 0;
}
}
 else if 
 ( GameActivity.soldanella != null) 
 {        if (GameActivity.fittable < GameActivity.pandemonium
) {
                    if (! GameActivity.spittings 
) {
                    if ( GameActivity.demisable != null) {
                    GameActivity.demisable = "";

                     O8SBl = 4;


                      GameActivity.quaresma = "";
}

                     GameActivity.fittable--;

                      GameActivity.soldanella = "overbounteous" ;
}

                     if ( GameActivity.uncereclothed 
) {
                    GameActivity.pandemonium++;

                     GameActivity.spittings = false;

                      GameActivity.soldanella = "";
}

                      GameActivity.fittable -= 6;

}
} 
 else 
 {        GameActivity.overconfidences = "";
}
 if (GameActivity.fittable > O8SBl

) 
 {        if (10 > GameActivity.fittable
) {
            
 if ( GameActivity.demisable != null) 
 {        if (O8SBl <= GameActivity.fittable

) {
                    if (5 == O8SBl
) {
                    GameActivity.myliobatidae = false;

                     GameActivity.quaresma = "";

                      GameActivity.quaresma = "";
}

            } else {
                    GameActivity.spittings = ! true;
}



}
 else if 
 ( GameActivity.quaresma != null) 
 {        if ( GameActivity.myliobatidae 
) {
                    GameActivity.fittable++;

                     GameActivity.uncereclothed = ! true;

                      GameActivity.overconfidences = "intuitive" ;
}
} 
 else 
 {        GameActivity.overconfidences = "";
}
            } else {
                    if ( GameActivity.overconfidences .isEmpty() ) {
                    if ( GameActivity.quaresma .isEmpty() ) {
                    GameActivity.uncereclothed = true;

            } else {
                    GameActivity.soldanella = "Ibsenisms" ;
}




            } else {
                    GameActivity.pandemonium = 10;
}



}



}
 else if 
 (GameActivity.fittable < 10

) 
 {        if ( GameActivity.myliobatidae 
) {
                    if ( GameActivity.uncereclothed 
) {
                    if (! GameActivity.demisable .equals(GameActivity.overconfidences) ) {
                    O8SBl++;

                     O8SBl -= 4;

                      GameActivity.soldanella = "republications" ;
}

            } else {
                    O8SBl = 10;
}




                     if (! GameActivity.demisable .toLowerCase().equals(GameActivity.soldanella) ) {
                    O8SBl = 7;

                     GameActivity.uncereclothed = false;

                      GameActivity.demisable = "";
}

                      GameActivity.spittings = true;
}
} 
 else 
 {        if (2 == O8SBl
) {
            
 if (O8SBl <= O8SBl
) 
 {        GameActivity.spittings =  false;
}
 else if 
 ( GameActivity.uncereclothed 
) 
 {        GameActivity.myliobatidae = true;
} 
 else 
 {        GameActivity.quaresma = "Vougeot" ;
}
            } else {
                    GameActivity.quaresma = "";
}



}
         
    }

     
    public  void forthcoming(boolean DTssn, int PKYdM) {
        
 if (GameActivity.pandemonium <= 1

) 
 {        if (GameActivity.pandemonium == GameActivity.fittable
) {
            
 if ( DTssn 
) 
 {        if ( GameActivity.demisable .contains("inshrining") ) {
                    if ( GameActivity.soldanella != null) {
                    GameActivity.spittings = false;

            } else {
                    GameActivity.demisable = "";
}




            } else {
                    GameActivity.pandemonium = 1;

}



}
 else if 
 (PKYdM == 4

) 
 {        if (5 == GameActivity.pandemonium
) {
                    DTssn = true;

                     PKYdM = 7;


                      DTssn = true;
}
} 
 else 
 {        DTssn = true;
}
            } else {
                    GameActivity.overconfidences = "Ogcocephalidae" ;
}



}
 else if 
 ( GameActivity.quaresma != null) 
 {        if (! DTssn 
) {
            
 if ( GameActivity.overconfidences != null) 
 {        if (PKYdM < 8

) {
                    ++PKYdM;

            } else {
                    GameActivity.fittable--;
}



}
 else if 
 (10 != PKYdM
) 
 {        DTssn = false;
} 
 else 
 {        PKYdM++;
}
            } else {
            
 if ( GameActivity.spittings 
) 
 {        --GameActivity.fittable;
}
 else if 
 ( GameActivity.demisable != null) 
 {        ++PKYdM;
} 
 else 
 {        GameActivity.quaresma = "ambiversions" ;
}}



} 
 else 
 {
 if (! GameActivity.uncereclothed 
) 
 {        if ( GameActivity.overconfidences == null
) {
                    GameActivity.pandemonium--;

            } else {
                    DTssn =  true;
}



}
 else if 
 (! GameActivity.spittings 
) 
 {        GameActivity.overconfidences = "chondrofibroma" ;
} 
 else 
 {        PKYdM = 5;

}}        if ( GameActivity.demisable != null) {
                    if ( GameActivity.overconfidences .equals("abietinic") ) {
                    if ( GameActivity.demisable != null) {
            
 if ( GameActivity.spittings 
) 
 {        if ( DTssn 
) {
                    GameActivity.soldanella = "";

            } else {
                    GameActivity.overconfidences = "overdubs" ;
}



}
 else if 
 ( GameActivity.soldanella .equals(GameActivity.demisable) ) 
 {        GameActivity.overconfidences = "";
} 
 else 
 {        ++PKYdM;
}
                     if ( GameActivity.soldanella != null) {
                    DTssn =  true;

                     GameActivity.fittable++;

                      PKYdM++;
}

                      DTssn = true;
}

                     if (12 <= GameActivity.fittable
) {
                    if (4 > PKYdM
) {
                    GameActivity.myliobatidae =  false;

            } else {
                    GameActivity.pandemonium--;
}




            } else {
                    GameActivity.spittings = true;
}




                      if ( GameActivity.overconfidences != null) {
                    DTssn = true;

            } else {
                    GameActivity.quaresma = "overcommunicate" ;
}



}

            } else {
                    PKYdM = 3;

}




         
    }

     
    public  void microwords(String QctEK, int PmyYl) {
                if ( GameActivity.overconfidences == null
) {
            
 if (PmyYl > GameActivity.pandemonium
) 
 {        QctEK = "knape" ;
}
 else if 
 ( QctEK .toLowerCase().equals("rationate") ) 
 {        if (12 != PmyYl
) {
                    if ( GameActivity.spittings 
) {
                    GameActivity.demisable = "";

            } else {
                    PmyYl += 0;
}




            } else {
                    GameActivity.overconfidences = "";
}



} 
 else 
 {        if (PmyYl <= PmyYl
) {
                    GameActivity.uncereclothed = false;

            } else {
                    GameActivity.uncereclothed = true;
}



}
                     if ( GameActivity.quaresma == null
) {
                    if ( GameActivity.soldanella != null) {
                    if (9 <= GameActivity.pandemonium
) {
                    GameActivity.pandemonium++;

                     ++PmyYl;

                      GameActivity.myliobatidae = true;
}

                     QctEK = "";

                      GameActivity.spittings = false;
}

                     if (GameActivity.fittable > GameActivity.fittable
) {
                    ++GameActivity.fittable;

            } else {
                    GameActivity.spittings = false;
}




                      GameActivity.spittings = false;
}

                      if ( GameActivity.soldanella == null
) {
            
 if (PmyYl <= 2

) 
 {        PmyYl = 4;

}
 else if 
 ( GameActivity.overconfidences == null
) 
 {        GameActivity.soldanella = "uneschewable" ;
} 
 else 
 {        GameActivity.myliobatidae = true;
}
            } else {
                    GameActivity.demisable = "";
}



}
        if ( QctEK == null
) {
            
 if (! GameActivity.soldanella .isEmpty() ) 
 {        if (2 > PmyYl
) {
            
 if ( QctEK == null
) 
 {        if ( QctEK == null
) {
                    --PmyYl;

            } else {
                    GameActivity.uncereclothed =  false;
}



}
 else if 
 ( QctEK == null
) 
 {        PmyYl++;
} 
 else 
 {        GameActivity.myliobatidae = false;
}
            } else {
                    if (PmyYl > PmyYl

) {
                    PmyYl = 9;


                     QctEK = "wading" ;

                      GameActivity.myliobatidae = false;
}
}



}
 else if 
 ( QctEK == null
) 
 {        if ( QctEK == null
) {
                    if (PmyYl == GameActivity.pandemonium
) {
                    GameActivity.uncereclothed = false;

            } else {
                    GameActivity.uncereclothed =  true;
}




                     GameActivity.uncereclothed = true;

                      QctEK = "";
}
} 
 else 
 {        if ( GameActivity.soldanella == null
) {
                    GameActivity.uncereclothed = false;

                     GameActivity.uncereclothed =  false;

                      GameActivity.myliobatidae =  false;
}
}
                     if ( GameActivity.myliobatidae 
) {
                    if ( GameActivity.demisable != null) {
                    if (! QctEK .equals("refrustrate") ) {
                    GameActivity.uncereclothed = false;

                     GameActivity.overconfidences = "";

                      GameActivity.fittable = 7;
}

                     PmyYl++;

                      GameActivity.fittable++;
}

                     if ( GameActivity.myliobatidae 
) {
                    PmyYl -= 0;


                     GameActivity.quaresma = "";

                      GameActivity.soldanella = "";
}

                      GameActivity.myliobatidae = false;
}

              
 if ( GameActivity.soldanella .equals(QctEK) ) 
 {        if ( GameActivity.quaresma == null
) {
                    GameActivity.myliobatidae =  true;

            } else {
                    --PmyYl;
}



}
 else if 
 ( GameActivity.soldanella .intern().contains(GameActivity.demisable) ) 
 {        GameActivity.myliobatidae = false;
} 
 else 
 {        GameActivity.demisable = "";
}}
        if ( GameActivity.uncereclothed 
) {
                    if (1 <= GameActivity.fittable
) {
            
 if (! GameActivity.myliobatidae 
) 
 {
 if ( GameActivity.demisable != null) 
 {        if (PmyYl == PmyYl

) {
                    GameActivity.quaresma = "";

            } else {
                    QctEK = "morels" ;
}



}
 else if 
 ( GameActivity.uncereclothed 
) 
 {        GameActivity.myliobatidae = false;
} 
 else 
 {        QctEK = "meditatingly" ;
}}
 else if 
 (PmyYl == PmyYl

) 
 {        if ( GameActivity.spittings 
) {
                    QctEK = "";

                     GameActivity.uncereclothed = false;

                      QctEK = "Yarboroughs" ;
}
} 
 else 
 {        GameActivity.quaresma = "";
}
                     if ( GameActivity.myliobatidae 
) {
                    if ( QctEK == null
) {
                    GameActivity.fittable = 10;

                     --PmyYl;

                      GameActivity.myliobatidae = false;
}

                     GameActivity.myliobatidae =  true;

                      GameActivity.demisable = "loathsome" ;
}

                      if ( GameActivity.soldanella == null
) {
                    QctEK = "";

                     GameActivity.myliobatidae =  false;

                      QctEK = "subdivecious" ;
}
}

             
 if ( GameActivity.spittings 
) 
 {
 if (! GameActivity.soldanella .equals(GameActivity.overconfidences) ) 
 {
 if (! GameActivity.spittings 
) 
 {        GameActivity.spittings = true;
}
 else if 
 (GameActivity.fittable < GameActivity.pandemonium

) 
 {        GameActivity.myliobatidae = true;
} 
 else 
 {        QctEK = "peninsulate" ;
}}
 else if 
 (PmyYl > 6

) 
 {        GameActivity.uncereclothed =  false;
} 
 else 
 {        GameActivity.uncereclothed = true;
}}
 else if 
 ( QctEK == null
) 
 {        if ( GameActivity.overconfidences != null) {
                    GameActivity.myliobatidae =  true;

                     GameActivity.myliobatidae =  true;

                      GameActivity.quaresma = "crooker" ;
}
} 
 else 
 {        GameActivity.spittings = false;
}
                      GameActivity.uncereclothed = false;
}
        GameActivity.fittable = 13;


 if (! GameActivity.myliobatidae 
) 
 {        GameActivity.pandemonium = 13;
}
 else if 
 (! GameActivity.myliobatidae 
) 
 {        if ( GameActivity.uncereclothed 
) {
            
 if (PmyYl <= PmyYl
) 
 {
 if ( GameActivity.overconfidences != null) 
 {        GameActivity.demisable = "ischiocapsular" ;
}
 else if 
 ( GameActivity.soldanella == null
) 
 {        GameActivity.myliobatidae =  true;
} 
 else 
 {        GameActivity.spittings = false;
}}
 else if 
 (PmyYl < PmyYl
) 
 {        GameActivity.uncereclothed = ! true;
} 
 else 
 {        QctEK = "";
}
            } else {
            
 if (PmyYl <= 10

) 
 {        ++PmyYl;
}
 else if 
 (PmyYl == GameActivity.fittable
) 
 {        ++PmyYl;
} 
 else 
 {        PmyYl++;
}}



} 
 else 
 {        if (! GameActivity.uncereclothed 
) {
                    if ( QctEK != null) {
                    QctEK = "semigravel" .trim();

                     GameActivity.spittings = false;

                      QctEK = "Kelcy" ;
}

                     --GameActivity.pandemonium;

                      QctEK = "tsesarevitches" ;
}
}
         
    }

     
    public  void mineralocorticoid(int K4n4H, boolean DhmlJ, String jEfTs, boolean v651D) {
        
         
    }

     
    public  void shadelessness(boolean CXMkL, int pdgcB, String rBnYo, String YNKhH) {
        
 if ( GameActivity.overconfidences != null) 
 {        GameActivity.pandemonium--;
}
 else if 
 ( rBnYo .isEmpty() ) 
 {        if (GameActivity.fittable <= 10

) {
                    YNKhH = "bibliopolically" ;

            } else {
            
 if ( rBnYo == null
) 
 {        pdgcB = 5;

}
 else if 
 (! YNKhH .equals("tobymen") ) 
 {        GameActivity.uncereclothed = false;
} 
 else 
 {        CXMkL = true;
}}



} 
 else 
 {        if ( YNKhH == null
) {
            
 if ( GameActivity.overconfidences .isEmpty() ) 
 {        pdgcB = 9;
}
 else if 
 ( CXMkL 
) 
 {        GameActivity.myliobatidae =  true;
} 
 else 
 {        rBnYo = "";
}
                     ++pdgcB;

                      GameActivity.myliobatidae = true;
}
}
         
    }

     }