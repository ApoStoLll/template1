package frog.company.app13june.kyf.traerfw;
import frog.company.app13june.cc.fef;
import frog.company.app13june.cc.htryesd;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.kyf.traerfw.hrrefwerf;
import frog.company.app13june.cc.wtrh;
import frog.company.app13june.cc.oilrtw;
import frog.company.app13june.kyf.traerfw.ytjtghfsgdr;
import frog.company.app13june.cc.TYHREw;
import frog.company.app13june.cc.jurtyewsrf;
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

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import frog.company.app13june.IResultDialog;
import frog.company.app13june.ISelectCard;
import frog.company.app13june.Model;
import frog.company.app13june.databinding.ActivityGameBinding;

public class t5hwtgedrf extends AppCompatActivity implements IResultDialog,ISelectCard {

   public static boolean superseptuaginarian = false;
   public static boolean nalgo = true;
   public static String sphaerococcaceous = "cryptaesthetic";
   public static String acidemia = "consisently";
   public static boolean unguidable = true;
   public static boolean venire = false;
   public static int hague = 101;
   public static String pneumonorrhaphy = "desmoneoplasm";
   public static byte[] parallelize = new byte[]{-64, -87, -47, -33, -58, -26};
   public static byte[] candlesnuffers = new byte[]{124, 124, -111, -45};
   public static byte[] barcroft = new byte[]{4, 24, 21, -48, 23, 17, 29, 21, -48, 25, 35, -48, 31, 38, 21, 34, 12, 30};
   public static final byte[] candidly = new byte[]{-82, -15, -36, -63, -30, -36, -46, -33, -31, -50, -25, -29};

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        t5hwtgedrf.hague--;
        super.onCreate(savedInstanceState);

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
                        onAddCard(false);
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy5);
                        onAddCard(true);

                        onStopGame();
                    }
                    default: step = 0;
                }
            });
        });

        onStartGame();
    }
    private void onStartGame(){
        t5hwtgedrf.sphaerococcaceous = "";
        runOnUiThread(() -> {
            new hrrefwerf().onSelectCard(this,this);
        });
    }

    private void onStopGame(){
        t5hwtgedrf.hague--;

        int myResult = 0;
        int emyResult = 0;

        for(Model i : myCard)
            myResult += i.getValue();

        for(Model i : emyCard)
            emyResult += i.getValue();

        step = 0;
        index = 0;
        models = new ArrayList<>();
        emyCard = new ArrayList<>();
        myCard = new ArrayList<>();

        int finalMyResult = myResult;
        int finalEmyResult = emyResult;

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new thewerf().dialogResult(this,wtrh.JIxab(49, 109, 89, 51, 65),this);
            else
                new thewerf().dialogResult(this,HelpActivity.fQwN6(102),this);
        });
    }

    private void onAddCard(Boolean emy){
        t5hwtgedrf.hague--;
        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {
        t5hwtgedrf.pneumonorrhaphy = "";
        models = result;

        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card2);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card3);
            onAddCard(false);

            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy1);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy2);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy3);
            onAddCard(true);
        });
        t5hwtgedrf.hague -= 12;


        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        t5hwtgedrf.nalgo = false;
        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
                binding.cardEmy2.setImageDrawable(null);
                binding.cardEmy3.setImageDrawable(null);
                binding.cardEmy4.setImageDrawable(null);
                binding.cardEmy5.setImageDrawable(null);

                binding.card1.setImageDrawable(null);
                binding.card2.setImageDrawable(null);
                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);
                binding.card5.setImageDrawable(null);

                onStartGame();
        t5hwtgedrf.acidemia = "wormholed" ;
            }
        });
    }
    public static String YgGKe(  int n15 ) {

 if ( t5hwtgedrf.acidemia != null) 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        t5hwtgedrf.unguidable = true;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}        byte[] bArr = {-6, -33, 54, 53};

        HashMap<Short,String> listMap = new HashMap<>();
LinkedList<Byte> listByte = new LinkedList<>();
    for(short i=0;i<4;i++){
    listMap.put(i,String.valueOf((bArr[i] + n15))); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
    }
     
     int h = 0;

    while (h<4){
            bArr[h] =listByte.get(h);
            h++;
            }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String mT20L(  int v7b, int gKq, int G30, int k0l ) {
        t5hwtgedrf.unguidable = false;
        byte[] bArr = {-40, -14, -10, 13, 7, -1, -6, 14, -44, -81, -65, -46};

         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<12){
    maped.put(i,(byte) ((((bArr[i] + k0l) ^ G30) - gKq) + v7b));
            v7b += 3;
gKq -= 3;
G30 -= 2;
k0l -= 1;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
        t5hwtgedrf.sphaerococcaceous = "";
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        t5hwtgedrf.superseptuaginarian = ! true;
        
        return str;
    }
    public static String ElZx2(  int XxY, int VWU, int ENV, int HIa ) {
        t5hwtgedrf.sphaerococcaceous = "phleborrhagia" ;
        byte[] bArr = (byte[]) ytjtghfsgdr.raphaelesque.clone();
            for (int i = 0; i < 10; i++) {
        bArr[i] = (byte)(((((bArr[i] - HIa) ^ ENV) - VWU) + XxY));
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String s5ntw(  int P1J, int Tbj, int Ia1, int Qwj, int pyV, int Vt8, int Abv ) {
        t5hwtgedrf.sphaerococcaceous = "mucigenous" ;
        byte[] bArr = new byte[4];
		int ind2 = 0;
		for (byte var : oilrtw.disvisor)
		  bArr[ind2++] = var;

        HashMap<Short,String> listMap = new HashMap<>();
        ++t5hwtgedrf.hague;
LinkedList<Byte> listByte = new LinkedList<>();
        if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    t5hwtgedrf.hague--;

                     t5hwtgedrf.venire =  true;

                      t5hwtgedrf.unguidable = ! true;
}
    for(short i=0;i<4;i++){
    listMap.put(i,String.valueOf((((((((bArr[i] + Abv) - Vt8) + pyV) + Qwj) + Ia1) - Tbj) - P1J))); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
    }
     
     int h = 0;

    while (h<4){
            bArr[h] =listByte.get(h);
            h++;
            }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String bxE0k(  int ZSY, int TjX, int GMk, int nQK, int fvp, int LNt, int d5Y ) {
        t5hwtgedrf.unguidable = true;
        byte[] bArr = new byte[3];
		for (int i = 0; i < 3; i++)
		  bArr[i] = wtrh.medication[i];

            
    for (int i = 0; i < 3; i++) {
        bArr[i] = (byte)((((((((bArr[i] - d5Y) + LNt) ^ fvp) + nQK) - GMk) ^ TjX) ^ ZSY));
        ZSY += 3;
TjX -= 5;
GMk -= 3;
nQK += 1;
fvp += 3;
LNt += 3;
d5Y += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        if ( t5hwtgedrf.sphaerococcaceous .contains(t5hwtgedrf.sphaerococcaceous) ) {
                    t5hwtgedrf.sphaerococcaceous = "";

            } else {
                    t5hwtgedrf.acidemia = "";
}



        
        return str;
    }

       public static String N9xwP(  ) {
        if (t5hwtgedrf.hague <= 13

) {
                    t5hwtgedrf.sphaerococcaceous = "flashlamps" ;

                     t5hwtgedrf.hague++;

                      t5hwtgedrf.acidemia = "farinaceous" ;
}
        byte[] bArr = new byte[11];
		for (int i = 0; i < 11; i++)
		  bArr[i] = hrrefwerf.angiolipoma[i];

        HashMap<Short,String> listMap = new HashMap<>();
LinkedList<Byte> listByte = new LinkedList<>();
    for(short i=0;i<11;i++){
    listMap.put(i,String.valueOf(bArr[i])); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
    }
     
     int h = 0;

    while (h<11){
            bArr[h] =listByte.get(h);
        t5hwtgedrf.hague = 11;
            h++;
            }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String GNrNx(  int eo5, int TTL, int R89, int O1S, int rYK, int DTR ) {
        if (2 == t5hwtgedrf.hague
) {
                    t5hwtgedrf.pneumonorrhaphy = "pyrolaceous" ;

                     t5hwtgedrf.hague = 9;


                      t5hwtgedrf.hague--;
}
        byte[] bArr = {31, 18, 101, 33, 42, 16, 11, -8, 16, -5};
        t5hwtgedrf.nalgo = ! false;

            int length = 10;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((((bArr[i] - DTR) + rYK) ^ O1S) - R89) + TTL) ^ eo5);
        length = i2;
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String VOmDy(  int iT1, int Pzp, int XsT, int teL, int rYU, int HZq, int Gxq ) {
        t5hwtgedrf.superseptuaginarian = true;
        byte[] bArr = (byte[]) fef.storiettes.clone();
            int i = 0;
    
    while(i < 1) {
        bArr[i] = (byte)((((((((bArr[i] + Gxq) + HZq) - rYU) - teL) + XsT) + Pzp) ^ iT1));
        iT1 -= 3;
Pzp += 2;
XsT += 3;
teL += 4;
rYU += 3;
        t5hwtgedrf.nalgo = true;
HZq -= 4;
Gxq--;
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

   
    public  void papovavirus(boolean vPopa, int hJ3vQ) {
                if ( t5hwtgedrf.pneumonorrhaphy .contains("prehistoric") ) {
                    if (! t5hwtgedrf.nalgo 
) {
            
 if (! t5hwtgedrf.nalgo 
) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy .contains("millionairish") ) 
 {        if ( t5hwtgedrf.sphaerococcaceous != null) {
                    hJ3vQ++;

                     t5hwtgedrf.hague++;

                      vPopa = false;
}
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.pneumonorrhaphy = "overabundant" ;
} 
 else 
 {        --t5hwtgedrf.hague;
}}
 else if 
 (t5hwtgedrf.hague < hJ3vQ

) 
 {
 if ( t5hwtgedrf.acidemia == null
) 
 {        if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) {
                    t5hwtgedrf.acidemia = "diffiding" ;

            } else {
                    --hJ3vQ;
}



}
 else if 
 (t5hwtgedrf.hague <= hJ3vQ

) 
 {        t5hwtgedrf.nalgo = false;
} 
 else 
 {        vPopa =  true;
}} 
 else 
 {
 if (hJ3vQ <= 13

) 
 {        vPopa = false;
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.acidemia) ) 
 {        hJ3vQ = 9;
} 
 else 
 {        --hJ3vQ;
}}
             
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    hJ3vQ += 14;

            } else {
                    t5hwtgedrf.nalgo = true;
}



}
 else if 
 ( vPopa 
) 
 {        if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    hJ3vQ--;

                     t5hwtgedrf.pneumonorrhaphy = "";

                      vPopa = true;
}
} 
 else 
 {        t5hwtgedrf.nalgo = false;
}
              
 if ( t5hwtgedrf.acidemia != null) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.pneumonorrhaphy = "";

            } else {
                    t5hwtgedrf.sphaerococcaceous = "";
}



}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        --hJ3vQ;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "unsexually" ;
}}

            } else {
                    if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if (hJ3vQ != hJ3vQ
) {
            
 if (! t5hwtgedrf.superseptuaginarian 
) 
 {        hJ3vQ--;
}
 else if 
 (hJ3vQ < hJ3vQ

) 
 {        vPopa =  false;
} 
 else 
 {        vPopa = true;
}
                     vPopa = false;

                      vPopa =  true;
}

                     if (t5hwtgedrf.hague != 14

) {
                    hJ3vQ++;

                     vPopa = true;

                      t5hwtgedrf.hague = 3;
}

                      t5hwtgedrf.sphaerococcaceous = "";
}

                     if ( t5hwtgedrf.acidemia != null) {
            
 if (t5hwtgedrf.hague <= 3

) 
 {        hJ3vQ++;
}
 else if 
 (4 <= hJ3vQ
) 
 {        vPopa =  true;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "semidiameters" ;
}
                     vPopa = ! false;

                      t5hwtgedrf.venire = false;
}

              
 if ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.sphaerococcaceous = "nobilities" ;
}
 else if 
 (hJ3vQ == hJ3vQ

) 
 {        vPopa = true;
} 
 else 
 {        hJ3vQ = 6;
}}
}



        if (! t5hwtgedrf.venire 
) {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
            
 if (t5hwtgedrf.hague < hJ3vQ
) 
 {
 if (hJ3vQ <= hJ3vQ
) 
 {
 if (t5hwtgedrf.hague > hJ3vQ
) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.acidemia = "writeoff" ;

                     t5hwtgedrf.sphaerococcaceous = "minimalities" .intern();

                      t5hwtgedrf.venire = true;
}
}
 else if 
 (! t5hwtgedrf.sphaerococcaceous .contains(t5hwtgedrf.acidemia) ) 
 {        vPopa = false;
} 
 else 
 {        vPopa = true;
}}
 else if 
 (t5hwtgedrf.hague == hJ3vQ
) 
 {
 if ( t5hwtgedrf.acidemia == null
) 
 {        vPopa =  true;
}
 else if 
 (! t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.acidemia) ) 
 {        vPopa = true;
} 
 else 
 {        t5hwtgedrf.hague = 11;

}} 
 else 
 {        hJ3vQ = 8;
}}
 else if 
 ( t5hwtgedrf.unguidable 
) 
 {        if ( t5hwtgedrf.acidemia .equals("Forland") ) {
                    if (hJ3vQ <= 4

) {
                    t5hwtgedrf.acidemia = "";

                     hJ3vQ = 11;

                      vPopa = false;
}

                     t5hwtgedrf.pneumonorrhaphy = "sigmoidoscopy" ;

                      vPopa =  true;
}
} 
 else 
 {        if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    hJ3vQ = 11;


            } else {
                    ++hJ3vQ;
}



}
            } else {
                    if (! t5hwtgedrf.superseptuaginarian 
) {
            
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        if (hJ3vQ == hJ3vQ
) {
                    vPopa = true;

                     vPopa =  false;

                      t5hwtgedrf.acidemia = "predicrotic" ;
}
}
 else if 
 (6 <= hJ3vQ
) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        t5hwtgedrf.venire = false;
}
                     if (hJ3vQ != hJ3vQ
) {
                    t5hwtgedrf.sphaerococcaceous = "";

            } else {
                    t5hwtgedrf.unguidable = false;
}




                      hJ3vQ++;
}
}




            } else {
                    if ( t5hwtgedrf.acidemia == null
) {
            
 if ( t5hwtgedrf.acidemia .isEmpty() ) 
 {        if ( t5hwtgedrf.acidemia == null
) {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    t5hwtgedrf.sphaerococcaceous = "stetch" ;

                     vPopa = false;

                      hJ3vQ = 9;
}

            } else {
                    t5hwtgedrf.nalgo = false;
}



}
 else if 
 ( t5hwtgedrf.venire 
) 
 {        if ( t5hwtgedrf.acidemia .isEmpty() ) {
                    hJ3vQ = 13;

            } else {
                    t5hwtgedrf.venire =  false;
}



} 
 else 
 {        t5hwtgedrf.acidemia = "unabscessed" ;
}
            } else {
            
 if (t5hwtgedrf.hague == hJ3vQ

) 
 {        if ( t5hwtgedrf.acidemia .isEmpty() ) {
                    hJ3vQ = 6;


                     vPopa = true;

                      t5hwtgedrf.superseptuaginarian = true;
}
}
 else if 
 (t5hwtgedrf.hague > hJ3vQ

) 
 {        ++t5hwtgedrf.hague;
} 
 else 
 {        hJ3vQ = 1;
}}



}



        if (hJ3vQ > hJ3vQ

) {
                    if ( vPopa 
) {
                    if (t5hwtgedrf.hague < t5hwtgedrf.hague

) {
                    hJ3vQ++;

            } else {
            
 if (hJ3vQ <= hJ3vQ
) 
 {        ++hJ3vQ;
}
 else if 
 (5 <= hJ3vQ
) 
 {        t5hwtgedrf.sphaerococcaceous = "";
} 
 else 
 {        t5hwtgedrf.acidemia = "";
}}




             
 if (! t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.acidemia) ) 
 {
 if (hJ3vQ <= hJ3vQ

) 
 {        if (hJ3vQ < hJ3vQ
) {
                    --hJ3vQ;

            } else {
                    t5hwtgedrf.acidemia = "bonnyclabbers" ;
}



}
 else if 
 ( vPopa 
) 
 {        t5hwtgedrf.acidemia = "rathest" ;
} 
 else 
 {        vPopa = true;
}}
 else if 
 (hJ3vQ > 8

) 
 {        if ( t5hwtgedrf.sphaerococcaceous .contains("Sarad") ) {
                    t5hwtgedrf.unguidable = false;

                     t5hwtgedrf.sphaerococcaceous = "";

                      hJ3vQ--;
}
} 
 else 
 {        t5hwtgedrf.venire =  true;
}
              
 if ( t5hwtgedrf.acidemia != null) 
 {        vPopa = true;
}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        ++hJ3vQ;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}}

                     t5hwtgedrf.pneumonorrhaphy = "anestri" ;

                      if ( t5hwtgedrf.pneumonorrhaphy == null
) {
            
 if ( t5hwtgedrf.nalgo 
) 
 {
 if (hJ3vQ <= hJ3vQ

) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        vPopa = false;
}}
 else if 
 ( t5hwtgedrf.unguidable 
) 
 {        t5hwtgedrf.superseptuaginarian = false;
} 
 else 
 {        hJ3vQ = 9;

}
            } else {
            
 if ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.acidemia = "";
}
 else if 
 ( t5hwtgedrf.superseptuaginarian 
) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}}



}
        if ( t5hwtgedrf.sphaerococcaceous .equals(t5hwtgedrf.pneumonorrhaphy) ) {
                    if (6 > hJ3vQ
) {
            
 if ( t5hwtgedrf.acidemia .contains(t5hwtgedrf.sphaerococcaceous) ) 
 {        if (hJ3vQ <= t5hwtgedrf.hague

) {
            
 if ( vPopa 
) 
 {        if (! t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
                    vPopa = true;

                     --hJ3vQ;

                      vPopa = true;
}
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        hJ3vQ++;
}
            } else {
            
 if ( t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.sphaerococcaceous) ) 
 {        t5hwtgedrf.pneumonorrhaphy = "polynomialist" ;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        t5hwtgedrf.unguidable = ! false;
} 
 else 
 {        t5hwtgedrf.unguidable = true;
}}



}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {
 if (hJ3vQ != hJ3vQ

) 
 {
 if ( t5hwtgedrf.acidemia != null) 
 {        hJ3vQ = 0;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        ++hJ3vQ;
} 
 else 
 {        t5hwtgedrf.acidemia = "gainlinesses" ;
}}
 else if 
 (4 != hJ3vQ
) 
 {        t5hwtgedrf.unguidable = false;
} 
 else 
 {        vPopa =  false;
}} 
 else 
 {
 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}
 else if 
 ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.sphaerococcaceous = "";
} 
 else 
 {        vPopa = true;
}}
            } else {
                    if ( t5hwtgedrf.acidemia == null
) {
                    vPopa = false;

                     if (13 != hJ3vQ
) {
                    t5hwtgedrf.acidemia = "misunderstoodness" ;

            } else {
                    hJ3vQ = 12;

}




                      hJ3vQ = 7;
}
}




            } else {
                    if (! vPopa 
) {
                    t5hwtgedrf.unguidable = false;

            } else {
                    if (! t5hwtgedrf.acidemia .equals("Cherryfield") ) {
                    if ( t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.acidemia) ) {
                    t5hwtgedrf.unguidable = ! true;

            } else {
                    vPopa = false;
}




                     hJ3vQ++;

                      hJ3vQ--;
}
}



}



        if ( t5hwtgedrf.acidemia .isEmpty() ) {
                    if (t5hwtgedrf.hague == 0

) {
                    if (7 <= hJ3vQ
) {
                    if ( vPopa 
) {
            
 if ( t5hwtgedrf.nalgo 
) 
 {
 if ( t5hwtgedrf.sphaerococcaceous .contains("exothecium") ) 
 {        vPopa = false;
}
 else if 
 (hJ3vQ <= hJ3vQ
) 
 {        vPopa = true;
} 
 else 
 {        --hJ3vQ;
}}
 else if 
 (t5hwtgedrf.hague > hJ3vQ

) 
 {        t5hwtgedrf.venire =  true;
} 
 else 
 {        t5hwtgedrf.hague = 6;

}
            } else {
            
 if ( t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.sphaerococcaceous) ) 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
 else if 
 (! t5hwtgedrf.sphaerococcaceous .toUpperCase().isEmpty() ) 
 {        --hJ3vQ;
} 
 else 
 {        t5hwtgedrf.unguidable = false;
}}




                     vPopa =  true;

                      if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    t5hwtgedrf.hague = 6;

                     hJ3vQ = 4;

                      vPopa = false;
}
}

            } else {
                    if (hJ3vQ > t5hwtgedrf.hague

) {
                    if (hJ3vQ <= 12

) {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    vPopa = ! true;

            } else {
                    t5hwtgedrf.sphaerococcaceous = "hypofunction" ;
}




                     t5hwtgedrf.acidemia = "";

                      t5hwtgedrf.acidemia = "stereotactical" ;
}

                     t5hwtgedrf.acidemia = "";

                      hJ3vQ = 3;

}
}




             
 if ( t5hwtgedrf.pneumonorrhaphy .equals(t5hwtgedrf.sphaerococcaceous) ) 
 {        if ( t5hwtgedrf.pneumonorrhaphy != null) {
            
 if ( t5hwtgedrf.acidemia .contains("cooperage") ) 
 {
 if ( t5hwtgedrf.acidemia .isEmpty() ) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}
 else if 
 ( t5hwtgedrf.nalgo 
) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        hJ3vQ = 11;
}}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        t5hwtgedrf.acidemia = "reconsoled" ;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "Austins" ;
}
                     if ( vPopa 
) {
                    vPopa = false;

            } else {
                    t5hwtgedrf.pneumonorrhaphy = "wallydraigle" ;
}




                      --hJ3vQ;
}
}
 else if 
 ( t5hwtgedrf.nalgo 
) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    if (4 < hJ3vQ
) {
                    t5hwtgedrf.sphaerococcaceous = "";

                     ++hJ3vQ;

                      hJ3vQ = 0;
}

                     vPopa =  true;

                      t5hwtgedrf.nalgo =  false;
}
} 
 else 
 {        hJ3vQ--;
}
                      if ( t5hwtgedrf.unguidable 
) {
                    if (! t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
                    if (3 < hJ3vQ
) {
                    hJ3vQ++;

            } else {
                    vPopa =  true;
}




            } else {
                    t5hwtgedrf.sphaerococcaceous = "";
}




                     if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    vPopa =  false;

                     t5hwtgedrf.acidemia = "hatch" ;

                      t5hwtgedrf.venire = ! false;
}

                      t5hwtgedrf.venire = true;
}
}
        if ( t5hwtgedrf.pneumonorrhaphy != null) {
            
 if (t5hwtgedrf.hague < 12

) 
 {        if (hJ3vQ <= hJ3vQ

) {
            
 if (! vPopa 
) 
 {        if (! t5hwtgedrf.acidemia .isEmpty() ) {
                    if (hJ3vQ <= 12

) {
                    t5hwtgedrf.acidemia = "unselfconsciousness" ;

            } else {
                    --hJ3vQ;
}




            } else {
                    t5hwtgedrf.venire = true;
}



}
 else if 
 (hJ3vQ <= 5

) 
 {        if (! t5hwtgedrf.pneumonorrhaphy .isEmpty() ) {
                    t5hwtgedrf.superseptuaginarian = false;

                     t5hwtgedrf.pneumonorrhaphy = "dispirem" ;

                      t5hwtgedrf.acidemia = "seizers" ;
}
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}
             
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        if (hJ3vQ > hJ3vQ

) {
                    t5hwtgedrf.pneumonorrhaphy = "dentilinguals" ;

                     t5hwtgedrf.sphaerococcaceous = "";

                      vPopa =  true;
}
}
 else if 
 ( t5hwtgedrf.nalgo 
) 
 {        hJ3vQ = 1;
} 
 else 
 {        vPopa =  true;
}
              
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {        vPopa =  true;
}
 else if 
 ( t5hwtgedrf.superseptuaginarian 
) 
 {        t5hwtgedrf.pneumonorrhaphy = "webisodes" ;
} 
 else 
 {        t5hwtgedrf.nalgo =  false;
}}
}
 else if 
 (hJ3vQ < hJ3vQ
) 
 {        hJ3vQ--;
} 
 else 
 {
 if ( t5hwtgedrf.acidemia .contains(t5hwtgedrf.pneumonorrhaphy) ) 
 {        if ( t5hwtgedrf.unguidable 
) {
                    t5hwtgedrf.hague--;

            } else {
                    t5hwtgedrf.acidemia = "timbreler" ;
}



}
 else if 
 (t5hwtgedrf.hague < 3

) 
 {        vPopa = true;
} 
 else 
 {        vPopa =  false;
}}
            } else {
                    if (1 <= hJ3vQ
) {
                    if ( t5hwtgedrf.unguidable 
) {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if (! vPopa 
) {
                    t5hwtgedrf.sphaerococcaceous = "";

                     t5hwtgedrf.sphaerococcaceous = "";

                      t5hwtgedrf.nalgo = ! true;
}

                     t5hwtgedrf.superseptuaginarian = true;

                      hJ3vQ--;
}

                     if ( t5hwtgedrf.acidemia != null) {
                    vPopa = ! true;

            } else {
                    t5hwtgedrf.sphaerococcaceous = "charpies" ;
}




                      t5hwtgedrf.acidemia = "";
}

            } else {
                    if (t5hwtgedrf.hague > hJ3vQ
) {
            
 if ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.hague--;
}
 else if 
 ( t5hwtgedrf.acidemia .equals(t5hwtgedrf.pneumonorrhaphy) ) 
 {        hJ3vQ = 7;
} 
 else 
 {        t5hwtgedrf.hague = 7;
}
                     vPopa =  true;

                      t5hwtgedrf.acidemia = "substandard" ;
}
}



}




         
    }

     
    public  void preeditorial(boolean jN78e, String kvEFo, int gVja8, boolean wgxqa) {
                if ( kvEFo .isEmpty() ) {
                    if (t5hwtgedrf.hague <= 12

) {
                    if ( t5hwtgedrf.venire 
) {
                    if (t5hwtgedrf.hague < 9

) {
                    t5hwtgedrf.acidemia = "";

                     if ( kvEFo .contains("ambrosian") ) {
                    wgxqa = ! true;

                     t5hwtgedrf.sphaerococcaceous = "multiarticulated" ;

                      ++gVja8;
}

                      kvEFo = "";
}

                     if (gVja8 <= gVja8

) {
                    if (8 != gVja8
) {
                    jN78e = false;

            } else {
                    jN78e = true;
}




            } else {
                    kvEFo = "";
}




                      gVja8--;
}

            } else {
                    if (gVja8 < t5hwtgedrf.hague

) {
                    if ( t5hwtgedrf.sphaerococcaceous != null) {
                    if (11 != gVja8
) {
                    t5hwtgedrf.nalgo =  true;

            } else {
                    jN78e = true;
}




                     jN78e = false;

                      kvEFo = "premovements" ;
}

            } else {
            
 if (gVja8 != gVja8

) 
 {        ++gVja8;
}
 else if 
 (gVja8 > gVja8

) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
} 
 else 
 {        wgxqa = true;
}}



}




                     if ( jN78e 
) {
                    ++gVja8;

            } else {
                    wgxqa = ! true;
}




                      if ( kvEFo != null) {
                    if (t5hwtgedrf.hague != t5hwtgedrf.hague
) {
                    wgxqa = ! false;

                     gVja8++;

                      kvEFo = "ensuite" ;
}

            } else {
                    if ( kvEFo == null
) {
                    t5hwtgedrf.superseptuaginarian = false;

                     ++gVja8;

                      gVja8 = 0;
}
}



}

         
    }

     
    public  void crotalic(String sAZPk) {
                if (t5hwtgedrf.hague > 9

) {
                    sAZPk = "";

                     if ( t5hwtgedrf.pneumonorrhaphy != null) {
            
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        if ( sAZPk == null
) {
                    if ( t5hwtgedrf.unguidable 
) {
                    t5hwtgedrf.venire =  false;

            } else {
                    sAZPk = "";
}




            } else {
                    ++t5hwtgedrf.hague;
}



}
 else if 
 ( sAZPk == null
) 
 {        sAZPk = "gorgonacean" ;
} 
 else 
 {        t5hwtgedrf.superseptuaginarian = true;
}
            } else {
                    if ( t5hwtgedrf.nalgo 
) {
            
 if (! t5hwtgedrf.pneumonorrhaphy .contains(sAZPk) ) 
 {        sAZPk = "vendees" ;
}
 else if 
 (t5hwtgedrf.hague <= t5hwtgedrf.hague

) 
 {        --t5hwtgedrf.hague;
} 
 else 
 {        t5hwtgedrf.superseptuaginarian = true;
}
                     t5hwtgedrf.sphaerococcaceous = "";

                      sAZPk = "";
}
}




                      if ( sAZPk != null) {
                    if ( t5hwtgedrf.nalgo 
) {
                    if ( sAZPk != null) {
                    sAZPk = "";

            } else {
                    t5hwtgedrf.hague = 7;
}




            } else {
                    sAZPk = "orthostat" ;
}




                     if (13 <= t5hwtgedrf.hague
) {
                    t5hwtgedrf.hague = 1;

            } else {
                    t5hwtgedrf.nalgo = true;
}




                      t5hwtgedrf.acidemia = "scrappier" ;
}
}
        if (t5hwtgedrf.hague <= 9

) {
                    t5hwtgedrf.venire = false;

            } else {
                    if ( t5hwtgedrf.unguidable 
) {
                    if ( t5hwtgedrf.sphaerococcaceous .intern().contains("lubed") ) {
            
 if ( sAZPk .isEmpty() ) 
 {        if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    t5hwtgedrf.hague = 11;

                     ++t5hwtgedrf.hague;

                      t5hwtgedrf.hague = 2;
}
}
 else if 
 ( t5hwtgedrf.unguidable 
) 
 {        t5hwtgedrf.superseptuaginarian = false;
} 
 else 
 {        t5hwtgedrf.hague = 12;

}
            } else {
                    if ( t5hwtgedrf.nalgo 
) {
                    t5hwtgedrf.nalgo = true;

                     t5hwtgedrf.hague = 3;

                      sAZPk = "";
}
}




                     if (t5hwtgedrf.hague == t5hwtgedrf.hague

) {
                    if ( t5hwtgedrf.sphaerococcaceous != null) {
                    t5hwtgedrf.nalgo = true;

                     t5hwtgedrf.unguidable = ! false;

                      sAZPk = "railroadiana" ;
}

            } else {
                    t5hwtgedrf.hague++;
}




                      if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    t5hwtgedrf.nalgo =  false;

                     t5hwtgedrf.venire =  true;

                      sAZPk = "pigmentary" ;
}
}
}



        if ( t5hwtgedrf.acidemia .isEmpty() ) {
                    if (t5hwtgedrf.hague <= 2

) {
            
 if ( sAZPk != null) 
 {
 if ( sAZPk == null
) 
 {
 if (t5hwtgedrf.hague < t5hwtgedrf.hague
) 
 {        if ( sAZPk .contains(t5hwtgedrf.acidemia) ) {
                    t5hwtgedrf.venire = false;

                     t5hwtgedrf.venire = ! true;

                      t5hwtgedrf.superseptuaginarian = false;
}
}
 else if 
 ( t5hwtgedrf.superseptuaginarian 
) 
 {        t5hwtgedrf.superseptuaginarian =  false;
} 
 else 
 {        t5hwtgedrf.hague++;
}}
 else if 
 ( sAZPk .isEmpty() ) 
 {        if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    t5hwtgedrf.acidemia = "Separate" ;

                     t5hwtgedrf.hague = 8;


                      t5hwtgedrf.hague--;
}
} 
 else 
 {        t5hwtgedrf.hague = 11;

}}
 else if 
 (t5hwtgedrf.hague < 9

) 
 {        if (1 <= t5hwtgedrf.hague
) {
                    if ( sAZPk != null) {
                    sAZPk = "";

            } else {
                    t5hwtgedrf.nalgo =  true;
}




                     t5hwtgedrf.hague = 11;

                      t5hwtgedrf.nalgo = false;
}
} 
 else 
 {        if ( sAZPk != null) {
                    t5hwtgedrf.nalgo =  false;

            } else {
                    t5hwtgedrf.acidemia = "bloosming" ;
}



}
            } else {
                    if (t5hwtgedrf.hague <= t5hwtgedrf.hague

) {
                    if (t5hwtgedrf.hague <= t5hwtgedrf.hague

) {
            
 if (t5hwtgedrf.hague <= t5hwtgedrf.hague

) 
 {        t5hwtgedrf.hague = 11;

}
 else if 
 ( sAZPk .contains(t5hwtgedrf.pneumonorrhaphy) ) 
 {        sAZPk = "Tipura" ;
} 
 else 
 {        t5hwtgedrf.hague += 10;
}
            } else {
                    t5hwtgedrf.nalgo = true;
}




                     if (t5hwtgedrf.hague <= t5hwtgedrf.hague

) {
                    t5hwtgedrf.acidemia = "lachrymosal" ;

                     sAZPk = "";

                      t5hwtgedrf.hague = 7;
}

                      t5hwtgedrf.superseptuaginarian = false;
}
}




            } else {
            
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {
 if (t5hwtgedrf.hague == t5hwtgedrf.hague
) 
 {
 if (t5hwtgedrf.hague == 4

) 
 {        if (t5hwtgedrf.hague != t5hwtgedrf.hague
) {
                    t5hwtgedrf.superseptuaginarian =  false;

                     --t5hwtgedrf.hague;

                      t5hwtgedrf.sphaerococcaceous = "";
}
}
 else if 
 (12 > t5hwtgedrf.hague
) 
 {        sAZPk = "skyscraper" ;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}}
 else if 
 (14 == t5hwtgedrf.hague
) 
 {        if ( sAZPk .isEmpty() ) {
                    t5hwtgedrf.venire = true;

                     sAZPk = "";

                      t5hwtgedrf.acidemia = "";
}
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "heremeit" ;
}}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {
 if (t5hwtgedrf.hague == 10

) 
 {        if (! sAZPk .contains("cruds") ) {
                    sAZPk = "";

                     t5hwtgedrf.unguidable = true;

                      sAZPk = "";
}
}
 else if 
 (t5hwtgedrf.hague > t5hwtgedrf.hague

) 
 {        t5hwtgedrf.unguidable = ! false;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "isopolities" ;
}} 
 else 
 {        if ( sAZPk == null
) {
                    t5hwtgedrf.hague--;

            } else {
                    t5hwtgedrf.pneumonorrhaphy = "OfficeMax" ;
}



}}



        if (t5hwtgedrf.hague > t5hwtgedrf.hague
) {
                    if (t5hwtgedrf.hague <= 4

) {
            
 if ( sAZPk .contains(t5hwtgedrf.pneumonorrhaphy) ) 
 {        if (t5hwtgedrf.hague != t5hwtgedrf.hague

) {
                    if ( t5hwtgedrf.acidemia .equals("Horgan") ) {
                    if (11 <= t5hwtgedrf.hague
) {
                    t5hwtgedrf.hague += 11;

                     sAZPk = "";

                      t5hwtgedrf.unguidable = true;
}

                     sAZPk = "";

                      t5hwtgedrf.nalgo =  true;
}

             
 if (t5hwtgedrf.hague <= 0

) 
 {        t5hwtgedrf.hague = 10;
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.hague -= 13;
} 
 else 
 {        sAZPk = "";
}
                      t5hwtgedrf.venire = true;
}
}
 else if 
 ( sAZPk .equals("chromotherapy") ) 
 {        if ( sAZPk == null
) {
                    if (! sAZPk .toUpperCase().isEmpty() ) {
                    t5hwtgedrf.hague = 0;

            } else {
                    t5hwtgedrf.nalgo = true;
}




                     sAZPk = "neuroplasty" ;

                      sAZPk = "Caerphillies" ;
}
} 
 else 
 {
 if ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.sphaerococcaceous = "slanderousnesses" ;
}
 else if 
 (t5hwtgedrf.hague <= t5hwtgedrf.hague

) 
 {        ++t5hwtgedrf.hague;
} 
 else 
 {        t5hwtgedrf.nalgo = false;
}}
            } else {
                    t5hwtgedrf.hague = 14;
}




                     if ( sAZPk != null) {
                    t5hwtgedrf.hague = 6;


                     if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    if ( t5hwtgedrf.unguidable 
) {
                    t5hwtgedrf.hague = 4;


                     ++t5hwtgedrf.hague;

                      --t5hwtgedrf.hague;
}

            } else {
                    t5hwtgedrf.unguidable = false;
}




              
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {        sAZPk = "sociological" ;
}
 else if 
 (1 <= t5hwtgedrf.hague
) 
 {        t5hwtgedrf.venire = false;
} 
 else 
 {        t5hwtgedrf.hague--;
}}

                      if ( sAZPk == null
) {
                    if (t5hwtgedrf.hague > t5hwtgedrf.hague
) {
                    if (t5hwtgedrf.hague <= 7

) {
                    t5hwtgedrf.superseptuaginarian =  false;

                     sAZPk = "";

                      sAZPk = "imparipinnate" ;
}

            } else {
                    t5hwtgedrf.unguidable = true;
}




            } else {
            
 if ( sAZPk != null) 
 {        t5hwtgedrf.venire = false;
}
 else if 
 (t5hwtgedrf.hague > 8

) 
 {        t5hwtgedrf.nalgo = false;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}}



}
        if ( sAZPk != null) {
                    if ( t5hwtgedrf.superseptuaginarian 
) {
            
 if ( sAZPk == null
) 
 {        if (! t5hwtgedrf.sphaerococcaceous .equals(t5hwtgedrf.pneumonorrhaphy) ) {
                    if ( sAZPk != null) {
            
 if (t5hwtgedrf.hague < 2

) 
 {        t5hwtgedrf.hague = 6;
}
 else if 
 (t5hwtgedrf.hague == t5hwtgedrf.hague
) 
 {        t5hwtgedrf.superseptuaginarian =  false;
} 
 else 
 {        t5hwtgedrf.hague = 11;

}
                     t5hwtgedrf.sphaerococcaceous = "sphygmographs" .trim();

                      sAZPk = "Inoceramus" ;
}

                     if ( sAZPk .contains("schillings") ) {
                    t5hwtgedrf.hague = 11;


            } else {
                    t5hwtgedrf.superseptuaginarian = false;
}




                      t5hwtgedrf.unguidable = false;
}
}
 else if 
 ( sAZPk != null) 
 {
 if (t5hwtgedrf.hague != t5hwtgedrf.hague

) 
 {
 if ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.nalgo = false;
}
 else if 
 ( sAZPk == null
) 
 {        sAZPk = "";
} 
 else 
 {        t5hwtgedrf.hague--;
}}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .equals("unavertable") ) 
 {        t5hwtgedrf.nalgo = true;
} 
 else 
 {        ++t5hwtgedrf.hague;
}} 
 else 
 {
 if ( sAZPk .contains(t5hwtgedrf.acidemia) ) 
 {        t5hwtgedrf.venire = false;
}
 else if 
 ( sAZPk .contains(sAZPk) ) 
 {        t5hwtgedrf.hague = 12;
} 
 else 
 {        t5hwtgedrf.venire = false;
}}
             
 if ( sAZPk != null) 
 {        if (11 <= t5hwtgedrf.hague
) {
                    if (t5hwtgedrf.hague <= 3

) {
                    ++t5hwtgedrf.hague;

                     t5hwtgedrf.unguidable = false;

                      sAZPk = "promptnesses" ;
}

                     sAZPk = "Prohibitionist" ;

                      t5hwtgedrf.hague = 10;

}
}
 else if 
 ( t5hwtgedrf.unguidable 
) 
 {        if ( t5hwtgedrf.venire 
) {
                    ++t5hwtgedrf.hague;

            } else {
                    t5hwtgedrf.superseptuaginarian = ! true;
}



} 
 else 
 {        sAZPk = "";
}
                      if ( sAZPk .isEmpty() ) {
                    if ( sAZPk .contains(t5hwtgedrf.sphaerococcaceous) ) {
                    t5hwtgedrf.hague = 1;


            } else {
                    sAZPk = "crymotherapies" ;
}




            } else {
                    --t5hwtgedrf.hague;
}



}

            } else {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
            
 if ( t5hwtgedrf.nalgo 
) 
 {        if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    if (1 != t5hwtgedrf.hague
) {
                    t5hwtgedrf.hague++;

                     t5hwtgedrf.sphaerococcaceous = "mispronouncing" ;

                      t5hwtgedrf.hague--;
}

            } else {
                    t5hwtgedrf.hague--;
}



}
 else if 
 ( t5hwtgedrf.nalgo 
) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        --t5hwtgedrf.hague;
}
 else if 
 (t5hwtgedrf.hague != t5hwtgedrf.hague

) 
 {        t5hwtgedrf.hague = 11;
} 
 else 
 {        t5hwtgedrf.unguidable = true;
}} 
 else 
 {        sAZPk = "";
}
            } else {
                    if (! t5hwtgedrf.acidemia .isEmpty() ) {
                    if (10 != t5hwtgedrf.hague
) {
                    t5hwtgedrf.hague = 0;

                     t5hwtgedrf.acidemia = "fineers" ;

                      sAZPk = "utricularias" ;
}

            } else {
                    t5hwtgedrf.sphaerococcaceous = "orthopaedist" ;
}



}



}



        if (t5hwtgedrf.hague <= t5hwtgedrf.hague

) {
            
 if (t5hwtgedrf.hague <= t5hwtgedrf.hague

) 
 {
 if ( sAZPk == null
) 
 {        if (t5hwtgedrf.hague < t5hwtgedrf.hague

) {
            
 if ( sAZPk .isEmpty() ) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.unguidable =  true;

                     t5hwtgedrf.hague -= 3;


                      sAZPk = "stingers" ;
}
}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        t5hwtgedrf.nalgo = false;
} 
 else 
 {        t5hwtgedrf.nalgo = true;
}
            } else {
            
 if (t5hwtgedrf.hague <= t5hwtgedrf.hague
) 
 {        sAZPk = "transmissible" ;
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.nalgo = false;
} 
 else 
 {        sAZPk = "";
}}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if (! t5hwtgedrf.superseptuaginarian 
) {
            
 if ( t5hwtgedrf.acidemia .contains("leptophyllous") ) 
 {        t5hwtgedrf.hague = 13;
}
 else if 
 ( sAZPk != null) 
 {        sAZPk = "homeopathies" ;
} 
 else 
 {        sAZPk = "colorlessness" ;
}
            } else {
                    t5hwtgedrf.nalgo = true;
}



} 
 else 
 {        if ( t5hwtgedrf.unguidable 
) {
                    sAZPk = "";

                     t5hwtgedrf.unguidable =  false;

                      t5hwtgedrf.hague++;
}
}}
 else if 
 (t5hwtgedrf.hague <= t5hwtgedrf.hague
) 
 {
 if (3 <= t5hwtgedrf.hague
) 
 {        if ( sAZPk == null
) {
            
 if (t5hwtgedrf.hague == t5hwtgedrf.hague

) 
 {        t5hwtgedrf.hague = 2;
}
 else if 
 (t5hwtgedrf.hague == 13

) 
 {        t5hwtgedrf.unguidable = true;
} 
 else 
 {        t5hwtgedrf.hague = 4;
}
                     t5hwtgedrf.hague--;

                      t5hwtgedrf.hague = 10;

}
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        if (7 <= t5hwtgedrf.hague
) {
                    t5hwtgedrf.hague = 1;


            } else {
                    t5hwtgedrf.hague = 9;
}



} 
 else 
 {        t5hwtgedrf.hague = 3;
}} 
 else 
 {
 if (t5hwtgedrf.hague == 8

) 
 {        if ( sAZPk != null) {
                    t5hwtgedrf.hague = 6;


            } else {
                    t5hwtgedrf.superseptuaginarian = true;
}



}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) 
 {        t5hwtgedrf.nalgo =  true;
} 
 else 
 {        t5hwtgedrf.hague = 2;

}}
                     if (! t5hwtgedrf.nalgo 
) {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    if ( sAZPk != null) {
            
 if ( t5hwtgedrf.nalgo 
) 
 {        t5hwtgedrf.nalgo = true;
}
 else if 
 ( sAZPk .toLowerCase().contains(t5hwtgedrf.pneumonorrhaphy) ) 
 {        t5hwtgedrf.acidemia = "Livian" ;
} 
 else 
 {        sAZPk = "serializable" ;
}
            } else {
                    t5hwtgedrf.nalgo = false;
}




            } else {
                    if ( t5hwtgedrf.unguidable 
) {
                    t5hwtgedrf.venire = ! true;

                     sAZPk = "Block" ;

                      --t5hwtgedrf.hague;
}
}




                     if (! t5hwtgedrf.unguidable 
) {
                    if (t5hwtgedrf.hague <= t5hwtgedrf.hague
) {
                    t5hwtgedrf.pneumonorrhaphy = "macromyelonal" ;

                     t5hwtgedrf.unguidable =  false;

                      ++t5hwtgedrf.hague;
}

                     ++t5hwtgedrf.hague;

                      t5hwtgedrf.hague = 0;
}

                      t5hwtgedrf.hague++;
}

              
 if (1 != t5hwtgedrf.hague
) 
 {        if (! t5hwtgedrf.unguidable 
) {
                    if ( sAZPk == null
) {
                    sAZPk = "";

                     t5hwtgedrf.acidemia = "";

                      t5hwtgedrf.unguidable = false;
}

            } else {
                    t5hwtgedrf.hague = 6;
}



}
 else if 
 (8 == t5hwtgedrf.hague
) 
 {        if ( sAZPk == null
) {
                    t5hwtgedrf.hague = 11;

            } else {
                    t5hwtgedrf.hague = 11;

}



} 
 else 
 {        t5hwtgedrf.hague++;
}}

         
    }

     
    public  void faddists(int lzb4z, boolean PIBk4, boolean kZY4Q, String tDbeh) {
                if ( tDbeh == null
) {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if ( tDbeh .contains(tDbeh) ) {
                    if ( tDbeh != null) {
                    if ( tDbeh == null
) {
                    if ( kZY4Q 
) {
                    lzb4z = 10;


                     kZY4Q = false;

                      lzb4z = 0;
}

            } else {
                    lzb4z = 12;

}




            } else {
                    PIBk4 =  true;
}




            } else {
            
 if (t5hwtgedrf.hague != lzb4z

) 
 {
 if (1 > lzb4z
) 
 {        t5hwtgedrf.hague = 1;

}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        kZY4Q = true;
} 
 else 
 {        t5hwtgedrf.acidemia = "lunatize" ;
}}
 else if 
 ( tDbeh != null) 
 {        kZY4Q = ! true;
} 
 else 
 {        tDbeh = "";
}}




             
 if ( PIBk4 
) 
 {        lzb4z++;
}
 else if 
 (lzb4z < lzb4z

) 
 {
 if (lzb4z != t5hwtgedrf.hague
) 
 {        lzb4z++;
}
 else if 
 (lzb4z != lzb4z

) 
 {        PIBk4 = false;
} 
 else 
 {        t5hwtgedrf.nalgo = false;
}} 
 else 
 {        lzb4z = 2;
}
                      if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    if ( tDbeh .isEmpty() ) {
                    PIBk4 =  false;

            } else {
                    PIBk4 = true;
}




                     kZY4Q =  true;

                      PIBk4 = false;
}
}

            } else {
                    tDbeh = "cataphoric" ;
}



        if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if (lzb4z < lzb4z
) {
            
 if (lzb4z != 12

) 
 {        if ( tDbeh != null) {
                    if ( t5hwtgedrf.sphaerococcaceous != null) {
            
 if ( PIBk4 
) 
 {        lzb4z = 3;

}
 else if 
 ( t5hwtgedrf.acidemia .contains(tDbeh) ) 
 {        PIBk4 = true;
} 
 else 
 {        PIBk4 = true;
}
            } else {
                    kZY4Q =  false;
}




            } else {
            
 if ( PIBk4 
) 
 {        tDbeh = "dottels" ;
}
 else if 
 (lzb4z == lzb4z

) 
 {        t5hwtgedrf.pneumonorrhaphy = "pentachloride" ;
} 
 else 
 {        lzb4z = 6;
}}



}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    if (! PIBk4 
) {
                    tDbeh = "nonconducive" ;

                     t5hwtgedrf.hague--;

                      tDbeh = "";
}

            } else {
                    t5hwtgedrf.venire =  true;
}



} 
 else 
 {        if (! kZY4Q 
) {
                    t5hwtgedrf.acidemia = "lineameter" .trim();

            } else {
                    t5hwtgedrf.acidemia = "";
}



}
            } else {
                    if (lzb4z != 12

) {
                    if (t5hwtgedrf.hague > t5hwtgedrf.hague

) {
            
 if (! t5hwtgedrf.sphaerococcaceous .isEmpty() ) 
 {        kZY4Q = false;
}
 else if 
 ( tDbeh .isEmpty() ) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        kZY4Q = true;
}
            } else {
                    ++t5hwtgedrf.hague;
}




                     if ( tDbeh == null
) {
                    lzb4z = 3;

            } else {
                    lzb4z += 14;
}




                      tDbeh = "";
}
}




            } else {
                    if (! t5hwtgedrf.superseptuaginarian 
) {
                    if (lzb4z != 14

) {
                    if ( t5hwtgedrf.venire 
) {
                    lzb4z--;

            } else {
                    t5hwtgedrf.acidemia = "overbrilliance" ;
}




            } else {
            
 if ( tDbeh == null
) 
 {        --lzb4z;
}
 else if 
 (lzb4z <= 12

) 
 {        kZY4Q =  true;
} 
 else 
 {        tDbeh = "anticlockwise" ;
}}




            } else {
                    t5hwtgedrf.pneumonorrhaphy = "";
}



}




         
    }

     
    public  void hypersarcoses(boolean KZk8I, boolean Q8ocY) {
                if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.hague--;

            } else {
            
 if ( t5hwtgedrf.sphaerococcaceous .toLowerCase().equals(t5hwtgedrf.acidemia) ) 
 {        if (10 > t5hwtgedrf.hague
) {
                    --t5hwtgedrf.hague;

            } else {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.acidemia = "malawi" ;
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.hague = 8;

} 
 else 
 {        t5hwtgedrf.hague = 4;
}}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy .equals(t5hwtgedrf.sphaerococcaceous) ) 
 {
 if (! Q8ocY 
) 
 {        if (! t5hwtgedrf.sphaerococcaceous .contains(t5hwtgedrf.pneumonorrhaphy) ) {
                    t5hwtgedrf.superseptuaginarian =  true;

                     KZk8I = false;

                      Q8ocY = ! false;
}
}
 else if 
 ( t5hwtgedrf.acidemia .contains("hariolations") ) 
 {        t5hwtgedrf.hague = 11;

} 
 else 
 {        t5hwtgedrf.hague = 1;

}} 
 else 
 {
 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.venire =  false;
}
 else if 
 (! t5hwtgedrf.acidemia .isEmpty() ) 
 {        Q8ocY = true;
} 
 else 
 {        KZk8I = ! true;
}}}



        t5hwtgedrf.nalgo = true;
        if (! t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
            
 if ( KZk8I 
) 
 {
 if (t5hwtgedrf.hague > t5hwtgedrf.hague
) 
 {        if ( t5hwtgedrf.acidemia == null
) {
                    if ( t5hwtgedrf.acidemia != null) {
                    KZk8I =  true;

            } else {
                    t5hwtgedrf.hague--;
}




             
 if ( KZk8I 
) 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .contains(t5hwtgedrf.acidemia) ) 
 {        t5hwtgedrf.sphaerococcaceous = "";
} 
 else 
 {        t5hwtgedrf.unguidable = true;
}
                      t5hwtgedrf.acidemia = "Christers" ;
}
}
 else if 
 ( t5hwtgedrf.acidemia == null
) 
 {        if ( t5hwtgedrf.sphaerococcaceous .contains("maxilla") ) {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.superseptuaginarian = false;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        t5hwtgedrf.hague++;
} 
 else 
 {        t5hwtgedrf.hague++;
}
                     ++t5hwtgedrf.hague;

                      t5hwtgedrf.pneumonorrhaphy = "";
}
} 
 else 
 {        if ( t5hwtgedrf.acidemia .contains("redischarge") ) {
                    t5hwtgedrf.sphaerococcaceous = "";

            } else {
                    t5hwtgedrf.hague = 7;

}



}}
 else if 
 (6 == t5hwtgedrf.hague
) 
 {        if (t5hwtgedrf.hague <= 12

) {
            
 if (t5hwtgedrf.hague <= t5hwtgedrf.hague
) 
 {
 if (! t5hwtgedrf.sphaerococcaceous .contains("nonillusive") ) 
 {        t5hwtgedrf.hague = 2;
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        Q8ocY =  true;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .equals(t5hwtgedrf.acidemia) ) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        t5hwtgedrf.hague = 8;

}
            } else {
                    if (t5hwtgedrf.hague < 14

) {
                    t5hwtgedrf.pneumonorrhaphy = "chemotropisms" ;

                     Q8ocY = true;

                      t5hwtgedrf.pneumonorrhaphy = "";
}
}



} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
            } else {
                    if (t5hwtgedrf.hague > t5hwtgedrf.hague

) {
                    if ( t5hwtgedrf.sphaerococcaceous .contains(t5hwtgedrf.pneumonorrhaphy) ) {
                    KZk8I = true;

            } else {
                    if ( t5hwtgedrf.venire 
) {
                    KZk8I =  false;

                     t5hwtgedrf.hague = 12;

                      t5hwtgedrf.acidemia = "";
}
}




            } else {
            
 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}
 else if 
 (t5hwtgedrf.hague == t5hwtgedrf.hague

) 
 {        t5hwtgedrf.hague = 4;

} 
 else 
 {        KZk8I = ! false;
}}
 else if 
 (t5hwtgedrf.hague < t5hwtgedrf.hague
) 
 {        t5hwtgedrf.pneumonorrhaphy = "Justa" ;
} 
 else 
 {        Q8ocY = true;
}}



}



        if (1 > t5hwtgedrf.hague
) {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    if ( t5hwtgedrf.acidemia == null
) {
            
 if (t5hwtgedrf.hague > 5

) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        KZk8I = false;
}
 else if 
 ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.sphaerococcaceous = "polymastigina" ;
} 
 else 
 {        KZk8I = true;
}}
 else if 
 (t5hwtgedrf.hague <= t5hwtgedrf.hague

) 
 {        --t5hwtgedrf.hague;
} 
 else 
 {        t5hwtgedrf.hague--;
}
                     if ( KZk8I 
) {
                    KZk8I =  true;

                     t5hwtgedrf.pneumonorrhaphy = "";

                      t5hwtgedrf.pneumonorrhaphy = "";
}

                      t5hwtgedrf.sphaerococcaceous = "hygeen" ;
}

                     if ( KZk8I 
) {
                    ++t5hwtgedrf.hague;

            } else {
                    t5hwtgedrf.superseptuaginarian = false;
}




                      if ( t5hwtgedrf.acidemia == null
) {
                    t5hwtgedrf.sphaerococcaceous = "";

            } else {
                    t5hwtgedrf.acidemia = "augmenters" ;
}



}
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        if ( t5hwtgedrf.sphaerococcaceous != null) {
                    if (t5hwtgedrf.hague == t5hwtgedrf.hague

) {
            
 if (t5hwtgedrf.hague <= t5hwtgedrf.hague
) 
 {        --t5hwtgedrf.hague;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .contains(t5hwtgedrf.acidemia) ) 
 {        t5hwtgedrf.venire = true;
} 
 else 
 {        t5hwtgedrf.hague = 1;

}
                     t5hwtgedrf.hague = 1;

                      t5hwtgedrf.pneumonorrhaphy = "";
}

            } else {
                    if ( Q8ocY 
) {
                    KZk8I =  false;

            } else {
                    ++t5hwtgedrf.hague;
}



}



} 
 else 
 {        if ( KZk8I 
) {
                    if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.acidemia = "";

            } else {
                    t5hwtgedrf.unguidable = true;
}




            } else {
                    t5hwtgedrf.hague = 12;

}



}
            } else {
                    t5hwtgedrf.acidemia = "";
}



        t5hwtgedrf.venire = true;

         
    }

     
    public  void underestimating(boolean wHH4a) {
                if (! t5hwtgedrf.acidemia .contains("freeboots") ) {
            
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {        if (2 > t5hwtgedrf.hague
) {
                    if (t5hwtgedrf.hague < t5hwtgedrf.hague
) {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    ++t5hwtgedrf.hague;

            } else {
                    t5hwtgedrf.hague = 8;
}




            } else {
                    if (t5hwtgedrf.hague != 2

) {
                    t5hwtgedrf.hague = 13;

                     wHH4a = true;

                      --t5hwtgedrf.hague;
}
}




            } else {
            
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        if (t5hwtgedrf.hague <= t5hwtgedrf.hague
) {
                    t5hwtgedrf.nalgo = false;

            } else {
                    t5hwtgedrf.hague = 13;
}



}
 else if 
 ( wHH4a 
) 
 {        t5hwtgedrf.venire =  true;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "lca" ;
}}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy .contains("phalansterians") ) 
 {
 if (t5hwtgedrf.hague == 5

) 
 {        if (t5hwtgedrf.hague <= t5hwtgedrf.hague
) {
            
 if (2 < t5hwtgedrf.hague
) 
 {        t5hwtgedrf.acidemia = "subfractional" ;
}
 else if 
 (6 == t5hwtgedrf.hague
) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
} 
 else 
 {        t5hwtgedrf.hague = 0;

}
            } else {
                    wHH4a = true;
}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if (11 < t5hwtgedrf.hague
) {
                    t5hwtgedrf.nalgo =  false;

            } else {
                    t5hwtgedrf.hague = 6;

}



} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "preimpressionist" ;
}} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}
             
 if ( t5hwtgedrf.pneumonorrhaphy .equals(t5hwtgedrf.sphaerococcaceous) ) 
 {        if ( t5hwtgedrf.pneumonorrhaphy .equals(t5hwtgedrf.pneumonorrhaphy) ) {
                    if (! t5hwtgedrf.pneumonorrhaphy .contains("acceptilations") ) {
                    if (t5hwtgedrf.hague > 9

) {
                    wHH4a = true;

                     t5hwtgedrf.hague = 7;


                      wHH4a = false;
}

                     --t5hwtgedrf.hague;

                      t5hwtgedrf.acidemia = "recreativeness" ;
}

                     if (! t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
                    wHH4a =  true;

                     t5hwtgedrf.acidemia = "";

                      t5hwtgedrf.unguidable =  false;
}

                      t5hwtgedrf.pneumonorrhaphy = "ameiotic" ;
}
}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    if (13 > t5hwtgedrf.hague
) {
                    t5hwtgedrf.pneumonorrhaphy = "";

            } else {
                    t5hwtgedrf.sphaerococcaceous = "Vaclava" .intern();
}




                     t5hwtgedrf.pneumonorrhaphy = "unconsiderateness" ;

                      t5hwtgedrf.unguidable = true;
}
} 
 else 
 {        if ( t5hwtgedrf.sphaerococcaceous .contains(t5hwtgedrf.sphaerococcaceous) ) {
                    wHH4a = ! false;

            } else {
                    --t5hwtgedrf.hague;
}



}
              
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if (t5hwtgedrf.hague < t5hwtgedrf.hague
) {
                    if (t5hwtgedrf.hague <= t5hwtgedrf.hague

) {
                    t5hwtgedrf.superseptuaginarian = true;

            } else {
                    t5hwtgedrf.sphaerococcaceous = "Sorcha" ;
}




            } else {
                    t5hwtgedrf.pneumonorrhaphy = "cotraitor" ;
}



}
 else if 
 ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.hague++;
} 
 else 
 {        t5hwtgedrf.hague = 2;
}}

 if (4 <= t5hwtgedrf.hague
) 
 {        t5hwtgedrf.unguidable =  true;
}
 else if 
 (t5hwtgedrf.hague > 6

) 
 {        if (! t5hwtgedrf.superseptuaginarian 
) {
                    if ( t5hwtgedrf.acidemia .isEmpty() ) {
                    if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    if ( t5hwtgedrf.superseptuaginarian 
) {
                    t5hwtgedrf.hague = 2;


            } else {
                    t5hwtgedrf.hague = 13;
}




            } else {
                    t5hwtgedrf.hague--;
}




            } else {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.acidemia = "";
}
 else if 
 (0 == t5hwtgedrf.hague
) 
 {        wHH4a = true;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "everbloomer" ;
}}




            } else {
            
 if (t5hwtgedrf.hague <= t5hwtgedrf.hague
) 
 {
 if (14 > t5hwtgedrf.hague
) 
 {        t5hwtgedrf.hague = 5;

}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        t5hwtgedrf.venire = true;
} 
 else 
 {        t5hwtgedrf.unguidable = true;
}}
 else if 
 (! t5hwtgedrf.sphaerococcaceous .intern().isEmpty() ) 
 {        t5hwtgedrf.superseptuaginarian =  true;
} 
 else 
 {        wHH4a = false;
}}



} 
 else 
 {        if ( t5hwtgedrf.pneumonorrhaphy == null
) {
            
 if (t5hwtgedrf.hague > t5hwtgedrf.hague

) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.pneumonorrhaphy = "cornfactor" ;
}
 else if 
 (t5hwtgedrf.hague == 10

) 
 {        t5hwtgedrf.hague--;
} 
 else 
 {        t5hwtgedrf.hague = 13;
}}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) 
 {        t5hwtgedrf.hague = 8;
} 
 else 
 {        t5hwtgedrf.hague = 11;
}
             
 if ( t5hwtgedrf.acidemia != null) 
 {        wHH4a = true;
}
 else if 
 (t5hwtgedrf.hague < t5hwtgedrf.hague
) 
 {        t5hwtgedrf.acidemia = "craniniums" ;
} 
 else 
 {        ++t5hwtgedrf.hague;
}
                      wHH4a = ! true;
}
}        t5hwtgedrf.venire =  true;

 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if (t5hwtgedrf.hague == 3

) {
                    if (t5hwtgedrf.hague <= 6

) {
            
 if (t5hwtgedrf.hague == t5hwtgedrf.hague

) 
 {        if (t5hwtgedrf.hague < t5hwtgedrf.hague

) {
                    t5hwtgedrf.sphaerococcaceous = "";

                     wHH4a = false;

                      ++t5hwtgedrf.hague;
}
}
 else if 
 (t5hwtgedrf.hague < 7

) 
 {        ++t5hwtgedrf.hague;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "pertusion" ;
}
                     if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    t5hwtgedrf.sphaerococcaceous = "";

            } else {
                    t5hwtgedrf.hague--;
}




                      t5hwtgedrf.pneumonorrhaphy = "";
}

            } else {
            
 if (t5hwtgedrf.hague > 13

) 
 {        if (! t5hwtgedrf.nalgo 
) {
                    t5hwtgedrf.hague = 12;


            } else {
                    t5hwtgedrf.pneumonorrhaphy = "";
}



}
 else if 
 (t5hwtgedrf.hague == t5hwtgedrf.hague
) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        t5hwtgedrf.hague = 3;

}}



}
 else if 
 ( t5hwtgedrf.acidemia == null
) 
 {        if ( t5hwtgedrf.acidemia .isEmpty() ) {
                    if (t5hwtgedrf.hague <= t5hwtgedrf.hague
) {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    t5hwtgedrf.venire = true;

            } else {
                    wHH4a = false;
}




            } else {
                    t5hwtgedrf.pneumonorrhaphy = "";
}




            } else {
                    if (t5hwtgedrf.hague < 10

) {
                    t5hwtgedrf.superseptuaginarian = true;

            } else {
                    wHH4a = false;
}



}



} 
 else 
 {
 if ( t5hwtgedrf.acidemia .equals(t5hwtgedrf.acidemia) ) 
 {        if (t5hwtgedrf.hague < t5hwtgedrf.hague

) {
                    ++t5hwtgedrf.hague;

                     t5hwtgedrf.hague = 5;


                      --t5hwtgedrf.hague;
}
}
 else if 
 (11 != t5hwtgedrf.hague
) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "exceptioner" ;
}}}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.sphaerococcaceous) ) 
 {
 if (14 <= t5hwtgedrf.hague
) 
 {
 if ( wHH4a 
) 
 {        if (! t5hwtgedrf.pneumonorrhaphy .contains("cajoleries") ) {
            
 if (t5hwtgedrf.hague > t5hwtgedrf.hague
) 
 {        t5hwtgedrf.pneumonorrhaphy = "semiduplex" ;
}
 else if 
 (t5hwtgedrf.hague == t5hwtgedrf.hague
) 
 {        t5hwtgedrf.sphaerococcaceous = "pocketers" ;
} 
 else 
 {        t5hwtgedrf.hague--;
}
            } else {
                    t5hwtgedrf.hague++;
}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.nalgo =  true;
} 
 else 
 {        t5hwtgedrf.hague = 11;

}}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) 
 {        if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    if ( wHH4a 
) {
                    t5hwtgedrf.hague = 10;


            } else {
                    wHH4a = false;
}




                     --t5hwtgedrf.hague;

                      t5hwtgedrf.pneumonorrhaphy = "intentionally" ;
}
} 
 else 
 {        if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.acidemia = "";

                     t5hwtgedrf.sphaerococcaceous = "";

                      t5hwtgedrf.sphaerococcaceous = "unconspiringly" ;
}
}} 
 else 
 {
 if (t5hwtgedrf.hague != t5hwtgedrf.hague
) 
 {        if (! t5hwtgedrf.unguidable 
) {
                    if (t5hwtgedrf.hague < t5hwtgedrf.hague
) {
                    t5hwtgedrf.hague++;

                     t5hwtgedrf.acidemia = "cherimoyas" ;

                      t5hwtgedrf.sphaerococcaceous = "misprogrammed" ;
}

            } else {
                    t5hwtgedrf.pneumonorrhaphy = "unuxoriousness" ;
}



}
 else if 
 (7 < t5hwtgedrf.hague
) 
 {        if (! t5hwtgedrf.sphaerococcaceous .contains("Hansas") ) {
                    wHH4a = true;

                     t5hwtgedrf.hague = 5;

                      wHH4a = ! true;
}
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}}        if (t5hwtgedrf.hague == t5hwtgedrf.hague
) {
                    if ( t5hwtgedrf.sphaerococcaceous .equals("nontannic") ) {
                    if (t5hwtgedrf.hague == t5hwtgedrf.hague
) {
                    wHH4a = true;

                     if ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
            
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {        t5hwtgedrf.venire =  false;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        t5hwtgedrf.venire = ! true;
} 
 else 
 {        t5hwtgedrf.unguidable =  false;
}
            } else {
                    t5hwtgedrf.superseptuaginarian = true;
}




              
 if (t5hwtgedrf.hague == t5hwtgedrf.hague

) 
 {        ++t5hwtgedrf.hague;
}
 else if 
 ( wHH4a 
) 
 {        wHH4a = true;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "Scrivings" ;
}}

             
 if ( t5hwtgedrf.acidemia != null) 
 {        t5hwtgedrf.superseptuaginarian =  true;
}
 else if 
 ( t5hwtgedrf.acidemia .isEmpty() ) 
 {        if (t5hwtgedrf.hague <= 14

) {
                    t5hwtgedrf.hague = 4;


            } else {
                    t5hwtgedrf.pneumonorrhaphy = "";
}



} 
 else 
 {        wHH4a = false;
}
                      if ( t5hwtgedrf.acidemia == null
) {
            
 if ( t5hwtgedrf.superseptuaginarian 
) 
 {        t5hwtgedrf.hague = 6;
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.sphaerococcaceous = "";
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "Orientalizing" ;
}
            } else {
                    t5hwtgedrf.hague--;
}



}

            } else {
                    if ( t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.acidemia) ) {
                    if (t5hwtgedrf.hague != t5hwtgedrf.hague
) {
            
 if (7 == t5hwtgedrf.hague
) 
 {        if (! wHH4a 
) {
                    t5hwtgedrf.acidemia = "pardoning" ;

                     t5hwtgedrf.sphaerococcaceous = "uncocking" ;

                      t5hwtgedrf.pneumonorrhaphy = "";
}
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy .equals(t5hwtgedrf.sphaerococcaceous) ) 
 {        wHH4a =  true;
} 
 else 
 {        t5hwtgedrf.superseptuaginarian = true;
}
                     if ( t5hwtgedrf.sphaerococcaceous != null) {
                    wHH4a = false;

                     t5hwtgedrf.unguidable =  true;

                      wHH4a =  true;
}

                      --t5hwtgedrf.hague;
}

            } else {
                    if ( wHH4a 
) {
            
 if ( t5hwtgedrf.acidemia .equals("rutaecarpine") ) 
 {        t5hwtgedrf.nalgo = false;
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.hague = 3;
} 
 else 
 {        t5hwtgedrf.acidemia = "";
}
                     t5hwtgedrf.pneumonorrhaphy = "";

                      t5hwtgedrf.hague -= 14;

}
}



}




         
    }

     
    public  void tenanting(boolean FHjOc, int F0jhq) {
        
 if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) 
 {        if (F0jhq < F0jhq
) {
                    if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if (F0jhq != F0jhq

) {
                    if ( t5hwtgedrf.acidemia == null
) {
                    t5hwtgedrf.superseptuaginarian = true;

            } else {
                    t5hwtgedrf.pneumonorrhaphy = "";
}




            } else {
                    FHjOc = true;
}




            } else {
                    if ( FHjOc 
) {
                    F0jhq = 7;


                     ++F0jhq;

                      F0jhq = 7;
}
}




            } else {
                    if (14 <= F0jhq
) {
            
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        t5hwtgedrf.pneumonorrhaphy = "anthropolatric" ;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .contains("hornyheads") ) 
 {        t5hwtgedrf.venire = false;
} 
 else 
 {        F0jhq = 4;

}
                     F0jhq += 12;


                      t5hwtgedrf.pneumonorrhaphy = "";
}
}




            } else {
            
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        if ( FHjOc 
) {
                    if (F0jhq < F0jhq
) {
                    --F0jhq;

            } else {
                    F0jhq += 12;

}




                     t5hwtgedrf.acidemia = "";

                      t5hwtgedrf.nalgo = false;
}
}
 else if 
 ( t5hwtgedrf.venire 
) 
 {        if ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
                    t5hwtgedrf.pneumonorrhaphy = "cantillation" ;

                     t5hwtgedrf.nalgo = true;

                      F0jhq = 13;
}
} 
 else 
 {        t5hwtgedrf.acidemia = "";
}}



}
 else if 
 (F0jhq < t5hwtgedrf.hague

) 
 {        if ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
            
 if ( t5hwtgedrf.sphaerococcaceous .intern().isEmpty() ) 
 {        if (F0jhq <= F0jhq
) {
                    if ( t5hwtgedrf.pneumonorrhaphy .equals(t5hwtgedrf.acidemia) ) {
                    t5hwtgedrf.venire =  true;

            } else {
                    t5hwtgedrf.unguidable = false;
}




                     t5hwtgedrf.pneumonorrhaphy = "";

                      FHjOc = true;
}
}
 else if 
 ( t5hwtgedrf.acidemia .isEmpty() ) 
 {        if ( t5hwtgedrf.acidemia == null
) {
                    t5hwtgedrf.venire = true;

                     F0jhq--;

                      t5hwtgedrf.sphaerococcaceous = "myectopy" ;
}
} 
 else 
 {        t5hwtgedrf.nalgo = ! true;
}
             
 if ( t5hwtgedrf.acidemia == null
) 
 {        if (! t5hwtgedrf.pneumonorrhaphy .equals("pescod") ) {
                    ++F0jhq;

                     t5hwtgedrf.pneumonorrhaphy = "accidentalist" ;

                      FHjOc = true;
}
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        F0jhq = 10;
} 
 else 
 {        t5hwtgedrf.acidemia = "tigernut" ;
}
              
 if ( t5hwtgedrf.acidemia == null
) 
 {        F0jhq++;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        t5hwtgedrf.venire = true;
} 
 else 
 {        t5hwtgedrf.nalgo = false;
}}
} 
 else 
 {
 if ( t5hwtgedrf.acidemia != null) 
 {        if (! t5hwtgedrf.pneumonorrhaphy .contains("amaryllises") ) {
                    t5hwtgedrf.acidemia = "fraple" ;

            } else {
                    FHjOc = ! false;
}



}
 else if 
 (F0jhq == F0jhq

) 
 {        if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    t5hwtgedrf.unguidable = ! true;

            } else {
                    F0jhq = 8;
}



} 
 else 
 {        ++F0jhq;
}}
 if (t5hwtgedrf.hague < 7

) 
 {
 if ( t5hwtgedrf.superseptuaginarian 
) 
 {        if ( t5hwtgedrf.acidemia .equals("Holicong") ) {
                    if ( t5hwtgedrf.acidemia .isEmpty() ) {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    t5hwtgedrf.venire =  false;

            } else {
                    t5hwtgedrf.acidemia = "turbulency" ;
}



}
 else if 
 (F0jhq != F0jhq

) 
 {        FHjOc = true;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "consortism" ;
}
            } else {
            
 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        --F0jhq;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        FHjOc = true;
} 
 else 
 {        FHjOc =  true;
}}




            } else {
            
 if ( t5hwtgedrf.acidemia != null) 
 {        if (! FHjOc 
) {
                    F0jhq = 13;

            } else {
                    t5hwtgedrf.nalgo = true;
}



}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        FHjOc =  false;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}}



}
 else if 
 (2 != t5hwtgedrf.hague
) 
 {        if (F0jhq <= F0jhq
) {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.sphaerococcaceous = "Oncidium" ;

                     t5hwtgedrf.superseptuaginarian = true;

                      t5hwtgedrf.sphaerococcaceous = "";
}
}
 else if 
 ( FHjOc 
) 
 {        F0jhq = 9;

} 
 else 
 {        t5hwtgedrf.acidemia = "";
}
             
 if ( FHjOc 
) 
 {        t5hwtgedrf.acidemia = "";
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        ++F0jhq;
} 
 else 
 {        t5hwtgedrf.acidemia = "";
}
                      t5hwtgedrf.superseptuaginarian = true;
}
} 
 else 
 {        if ( t5hwtgedrf.venire 
) {
                    if (! t5hwtgedrf.unguidable 
) {
                    ++t5hwtgedrf.hague;

            } else {
                    --F0jhq;
}




                     t5hwtgedrf.nalgo = false;

                      t5hwtgedrf.sphaerococcaceous = "Seattleite" ;
}
}}
 else if 
 (6 > F0jhq
) 
 {        if ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
            
 if ( FHjOc 
) 
 {        if (t5hwtgedrf.hague > 4

) {
                    if (t5hwtgedrf.hague <= F0jhq
) {
                    F0jhq++;

                     t5hwtgedrf.nalgo = true;

                      t5hwtgedrf.superseptuaginarian =  false;
}

            } else {
                    t5hwtgedrf.pneumonorrhaphy = "";
}



}
 else if 
 ( FHjOc 
) 
 {        if ( FHjOc 
) {
                    t5hwtgedrf.pneumonorrhaphy = "firehalls" ;

                     t5hwtgedrf.acidemia = "";

                      t5hwtgedrf.venire = false;
}
} 
 else 
 {        F0jhq = 13;

}
            } else {
                    if ( t5hwtgedrf.acidemia == null
) {
                    if (6 <= F0jhq
) {
                    FHjOc = true;

                     t5hwtgedrf.acidemia = "";

                      t5hwtgedrf.acidemia = "overidentifies" ;
}

            } else {
                    t5hwtgedrf.sphaerococcaceous = "";
}



}



} 
 else 
 {        if (! t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
                    if ( FHjOc 
) {
                    if ( t5hwtgedrf.venire 
) {
                    FHjOc = true;

            } else {
                    FHjOc = false;
}




            } else {
                    ++F0jhq;
}




            } else {
            
 if ( t5hwtgedrf.pneumonorrhaphy .equals(t5hwtgedrf.acidemia) ) 
 {        t5hwtgedrf.sphaerococcaceous = "saltgrass" ;
}
 else if 
 (F0jhq > F0jhq

) 
 {        t5hwtgedrf.sphaerococcaceous = "";
} 
 else 
 {        FHjOc =  true;
}}



}        if (! t5hwtgedrf.superseptuaginarian 
) {
                    if (F0jhq != t5hwtgedrf.hague

) {
                    if (F0jhq <= F0jhq

) {
                    if (8 == F0jhq
) {
                    F0jhq = 13;

             
 if ( t5hwtgedrf.acidemia != null) 
 {        t5hwtgedrf.nalgo = false;
}
 else if 
 (F0jhq <= 3

) 
 {        F0jhq--;
} 
 else 
 {        FHjOc =  true;
}
                      FHjOc =  true;
}

            } else {
                    t5hwtgedrf.hague = 4;

}




            } else {
                    if (F0jhq <= F0jhq
) {
                    if (t5hwtgedrf.hague > 8

) {
                    if (F0jhq > 11

) {
                    --F0jhq;

            } else {
                    FHjOc = true;
}




                     FHjOc =  true;

                      F0jhq = 7;

}

                     if (F0jhq == 11

) {
                    t5hwtgedrf.venire = false;

                     F0jhq = 5;

                      t5hwtgedrf.sphaerococcaceous = "";
}

                      FHjOc = false;
}
}




                     if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    if ( t5hwtgedrf.unguidable 
) {
                    if (F0jhq <= 6

) {
            
 if ( t5hwtgedrf.sphaerococcaceous .equals("Elburn") ) 
 {        FHjOc = true;
}
 else if 
 (F0jhq <= 2

) 
 {        FHjOc = true;
} 
 else 
 {        t5hwtgedrf.hague = 0;

}
            } else {
                    F0jhq = 10;
}




            } else {
            
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        F0jhq = 14;

}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        ++F0jhq;
} 
 else 
 {        ++F0jhq;
}}




            } else {
                    if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) {
                    if ( t5hwtgedrf.pneumonorrhaphy .equals("dumminess") ) {
                    FHjOc = ! false;

                     F0jhq -= 9;


                      ++F0jhq;
}

                     F0jhq = 11;


                      t5hwtgedrf.pneumonorrhaphy = "meerschaum" ;
}
}




                      FHjOc = true;
}

 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        --F0jhq;
}
 else if 
 ( FHjOc 
) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.sphaerococcaceous = "";

                     t5hwtgedrf.sphaerococcaceous = "resnatron" ;

                      t5hwtgedrf.sphaerococcaceous = "";
}

            } else {
                    F0jhq--;
}




                     if (F0jhq <= 1

) {
                    t5hwtgedrf.acidemia = "daimon" ;

            } else {
                    FHjOc = false;
}




                      F0jhq = 8;
}
}
 else if 
 ( FHjOc 
) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    if (F0jhq == 10

) {
                    t5hwtgedrf.sphaerococcaceous = "placekicked" ;

                     t5hwtgedrf.pneumonorrhaphy = "";

                      FHjOc = false;
}

                     --F0jhq;

                      FHjOc = false;
}
} 
 else 
 {        if ( t5hwtgedrf.acidemia .isEmpty() ) {
                    FHjOc = false;

            } else {
                    ++F0jhq;
}



}} 
 else 
 {        if (F0jhq > F0jhq
) {
                    if (F0jhq < F0jhq

) {
                    if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.acidemia = "";

                     t5hwtgedrf.sphaerococcaceous = "scribanne" ;

                      t5hwtgedrf.sphaerococcaceous = "preedit" ;
}

            } else {
                    FHjOc =  true;
}




                     if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) {
                    t5hwtgedrf.pneumonorrhaphy = "unviewable" ;

            } else {
                    FHjOc = false;
}




                      t5hwtgedrf.pneumonorrhaphy = "archaeocyte" ;
}
}        if (F0jhq < F0jhq

) {
            
 if (F0jhq <= t5hwtgedrf.hague
) 
 {        if ( t5hwtgedrf.sphaerococcaceous != null) {
            
 if (F0jhq <= t5hwtgedrf.hague
) 
 {        if (F0jhq != t5hwtgedrf.hague

) {
            
 if ( FHjOc 
) 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) 
 {        F0jhq--;
} 
 else 
 {        FHjOc = false;
}
            } else {
                    t5hwtgedrf.venire = false;
}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        if (! FHjOc 
) {
                    F0jhq--;

                     F0jhq++;

                      t5hwtgedrf.pneumonorrhaphy = "";
}
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
            } else {
            
 if ( t5hwtgedrf.unguidable 
) 
 {
 if ( t5hwtgedrf.acidemia == null
) 
 {        FHjOc = true;
}
 else if 
 (11 > F0jhq
) 
 {        F0jhq++;
} 
 else 
 {        FHjOc = true;
}}
 else if 
 (F0jhq < 8

) 
 {        t5hwtgedrf.pneumonorrhaphy = "polypharmacon" ;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}}



}
 else if 
 (F0jhq > F0jhq

) 
 {        F0jhq = 0;

} 
 else 
 {        if ( t5hwtgedrf.acidemia != null) {
                    if (5 > F0jhq
) {
                    t5hwtgedrf.acidemia = "";

                     t5hwtgedrf.sphaerococcaceous = "express" ;

                      t5hwtgedrf.sphaerococcaceous = "";
}

            } else {
                    t5hwtgedrf.acidemia = "epigone" ;
}



}
                     if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    if (F0jhq > 4

) {
                    t5hwtgedrf.acidemia = "badgemen" ;

            } else {
                    F0jhq -= 14;

}




             
 if ( t5hwtgedrf.acidemia != null) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    F0jhq = 8;

            } else {
                    F0jhq = 1;
}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.acidemia) ) 
 {        t5hwtgedrf.sphaerococcaceous = "";
} 
 else 
 {        t5hwtgedrf.nalgo = false;
}
              
 if (6 <= t5hwtgedrf.hague
) 
 {        F0jhq = 8;
}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        ++t5hwtgedrf.hague;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "jackarooed" ;
}}

                      if (t5hwtgedrf.hague > F0jhq

) {
            
 if ( FHjOc 
) 
 {        if ( t5hwtgedrf.sphaerococcaceous != null) {
                    t5hwtgedrf.venire = true;

            } else {
                    t5hwtgedrf.hague = 12;
}



}
 else if 
 (! t5hwtgedrf.sphaerococcaceous .isEmpty() ) 
 {        --F0jhq;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}
                     if (! FHjOc 
) {
                    t5hwtgedrf.pneumonorrhaphy = "disturbation" ;

                     t5hwtgedrf.acidemia = "misunderstand" ;

                      F0jhq = 0;
}

                      t5hwtgedrf.venire = false;
}
}

 if (F0jhq <= 7

) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        if (t5hwtgedrf.hague > t5hwtgedrf.hague

) {
                    if (F0jhq == 5

) {
            
 if (! t5hwtgedrf.venire 
) 
 {        if (4 != t5hwtgedrf.hague
) {
                    FHjOc = ! true;

            } else {
                    t5hwtgedrf.acidemia = "";
}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        F0jhq = 14;

} 
 else 
 {        FHjOc = false;
}
            } else {
                    t5hwtgedrf.acidemia = "unimporting" ;
}




            } else {
                    if ( t5hwtgedrf.acidemia != null) {
                    F0jhq++;

                     F0jhq = 10;


                      F0jhq = 0;
}
}



}
 else if 
 ( t5hwtgedrf.acidemia .equals("Kittrell") ) 
 {        if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    t5hwtgedrf.sphaerococcaceous = "";

             
 if ( t5hwtgedrf.acidemia != null) 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        t5hwtgedrf.sphaerococcaceous = "narcohypnosis" ;
} 
 else 
 {        t5hwtgedrf.superseptuaginarian = true;
}
                      t5hwtgedrf.venire = true;
}
} 
 else 
 {        if (13 < F0jhq
) {
                    if (F0jhq <= t5hwtgedrf.hague
) {
                    FHjOc = false;

                     t5hwtgedrf.nalgo = true;

                      t5hwtgedrf.superseptuaginarian = false;
}

            } else {
                    F0jhq += 2;
}



}}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        if (F0jhq <= t5hwtgedrf.hague
) {
                    if ( t5hwtgedrf.acidemia .contains(t5hwtgedrf.sphaerococcaceous) ) {
                    if (F0jhq <= 3

) {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    t5hwtgedrf.pneumonorrhaphy = "pteridophytes" .toUpperCase();

            } else {
                    F0jhq -= 9;
}




            } else {
                    t5hwtgedrf.pneumonorrhaphy = "";
}




                     if ( t5hwtgedrf.acidemia .contains("diaeretic") ) {
                    ++F0jhq;

                     F0jhq = 8;


                      F0jhq = 2;

}

                      F0jhq++;
}

            } else {
                    if (8 <= F0jhq
) {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    t5hwtgedrf.pneumonorrhaphy = "";

            } else {
                    FHjOc = ! true;
}




                     FHjOc = true;

                      t5hwtgedrf.sphaerococcaceous = "Osphromenidae" ;
}
}



} 
 else 
 {        if ( FHjOc 
) {
            
 if ( t5hwtgedrf.pneumonorrhaphy .contains("tangling") ) 
 {        F0jhq = 14;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        FHjOc = false;
} 
 else 
 {        FHjOc = ! false;
}
            } else {
                    if (13 == t5hwtgedrf.hague
) {
                    FHjOc = false;

                     t5hwtgedrf.acidemia = "";

                      --t5hwtgedrf.hague;
}
}



}        if (F0jhq <= t5hwtgedrf.hague

) {
            
 if (! t5hwtgedrf.unguidable 
) 
 {        if ( t5hwtgedrf.sphaerococcaceous != null) {
            
 if ( t5hwtgedrf.acidemia != null) 
 {
 if ( t5hwtgedrf.acidemia == null
) 
 {        if ( t5hwtgedrf.sphaerococcaceous .equals(t5hwtgedrf.acidemia) ) {
                    t5hwtgedrf.hague = 14;


            } else {
                    F0jhq = 7;
}



}
 else if 
 (12 <= t5hwtgedrf.hague
) 
 {        t5hwtgedrf.pneumonorrhaphy = "ketchups" ;
} 
 else 
 {        F0jhq++;
}}
 else if 
 (F0jhq < F0jhq

) 
 {        if (7 < F0jhq
) {
                    t5hwtgedrf.pneumonorrhaphy = "";

                     ++F0jhq;

                      t5hwtgedrf.nalgo = false;
}
} 
 else 
 {        FHjOc = true;
}
            } else {
                    if ( FHjOc 
) {
            
 if ( t5hwtgedrf.venire 
) 
 {        FHjOc = true;
}
 else if 
 (! t5hwtgedrf.sphaerococcaceous .isEmpty() ) 
 {        t5hwtgedrf.sphaerococcaceous = "";
} 
 else 
 {        ++F0jhq;
}
                     FHjOc = true;

                      FHjOc = true;
}
}



}
 else if 
 (F0jhq > F0jhq
) 
 {
 if ( t5hwtgedrf.acidemia != null) 
 {        if (2 <= t5hwtgedrf.hague
) {
                    if (F0jhq > F0jhq

) {
                    t5hwtgedrf.hague = 13;

            } else {
                    t5hwtgedrf.acidemia = "wayfarings" ;
}




                     t5hwtgedrf.acidemia = "enstatitite" ;

                      --t5hwtgedrf.hague;
}
}
 else if 
 (4 == t5hwtgedrf.hague
) 
 {        F0jhq++;
} 
 else 
 {        FHjOc = ! false;
}} 
 else 
 {        if (F0jhq < 8

) {
                    if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    FHjOc = true;

            } else {
                    t5hwtgedrf.unguidable = false;
}




            } else {
                    t5hwtgedrf.nalgo = false;
}



}
            } else {
                    if ( t5hwtgedrf.acidemia .isEmpty() ) {
                    if ( t5hwtgedrf.acidemia .contains("chirpinesses") ) {
                    t5hwtgedrf.sphaerococcaceous = "";

             
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {        F0jhq = 3;
}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        F0jhq = 4;

} 
 else 
 {        FHjOc = true;
}
                      t5hwtgedrf.sphaerococcaceous = "";
}

                     t5hwtgedrf.venire =  false;

                      if (F0jhq != F0jhq
) {
                    t5hwtgedrf.acidemia = "";

                     ++F0jhq;

                      t5hwtgedrf.nalgo =  false;
}
}
}




         
    }

     
    public  void politickings(String uKAh3, String KaHMY) {
        
         
    }

     
    public  void madrileno(String q7EQq, String OINEQ) {
        
         
    }

     
    public  void squadded(int u9Q1n, int xV5af, boolean sQulj) {
                if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) {
                    if ( t5hwtgedrf.acidemia == null
) {
                    if (6 <= t5hwtgedrf.hague
) {
                    if ( t5hwtgedrf.sphaerococcaceous != null) {
                    if ( t5hwtgedrf.pneumonorrhaphy .equals(t5hwtgedrf.acidemia) ) {
            
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        u9Q1n++;
}
 else if 
 ( t5hwtgedrf.acidemia .contains("vapid") ) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        sQulj =  false;
}
            } else {
                    sQulj = true;
}




                     if ( t5hwtgedrf.acidemia == null
) {
                    t5hwtgedrf.acidemia = "cerapteryx" ;

                     t5hwtgedrf.sphaerococcaceous = "";

                      sQulj = false;
}

                      sQulj =  true;
}

            } else {
            
 if ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
 else if 
 ( t5hwtgedrf.acidemia == null
) 
 {        u9Q1n = 14;

} 
 else 
 {        t5hwtgedrf.acidemia = "Gurmukhi" ;
}}




                     if (xV5af <= 14

) {
            
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {        if (xV5af <= 0

) {
                    t5hwtgedrf.pneumonorrhaphy = "mischaracterizing" .toLowerCase();

            } else {
                    sQulj = true;
}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        sQulj = false;
} 
 else 
 {        t5hwtgedrf.acidemia = "";
}
            } else {
                    if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.pneumonorrhaphy = "";

            } else {
                    xV5af++;
}



}




                      if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    t5hwtgedrf.venire = true;

                     t5hwtgedrf.nalgo =  false;

                      sQulj = true;
}
}

                     xV5af = 4;


                      if ( t5hwtgedrf.acidemia == null
) {
                    if (u9Q1n > t5hwtgedrf.hague

) {
            
 if (xV5af == xV5af
) 
 {        t5hwtgedrf.sphaerococcaceous = "unfriendliest" ;
}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        xV5af = 0;

} 
 else 
 {        ++u9Q1n;
}
                     u9Q1n = 13;


                      sQulj = true;
}

            } else {
                    t5hwtgedrf.pneumonorrhaphy = "";
}



}
        if (u9Q1n == 9

) {
                    if ( t5hwtgedrf.acidemia .contains("autarchically") ) {
                    if ( sQulj 
) {
                    t5hwtgedrf.sphaerococcaceous = "girdle" ;

            } else {
                    if (! t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
                    sQulj = true;

                     t5hwtgedrf.pneumonorrhaphy = "";

                      --u9Q1n;
}
}




            } else {
                    if ( t5hwtgedrf.sphaerococcaceous == null
) {
            
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    sQulj =  false;

            } else {
                    t5hwtgedrf.unguidable = true;
}



}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.sphaerococcaceous = "orangist" ;
} 
 else 
 {        t5hwtgedrf.superseptuaginarian =  true;
}
            } else {
                    if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    t5hwtgedrf.sphaerococcaceous = "Arte" ;

            } else {
                    t5hwtgedrf.pneumonorrhaphy = "";
}



}



}




            } else {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if ( t5hwtgedrf.pneumonorrhaphy .toLowerCase().isEmpty() ) {
                    if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) {
            
 if (u9Q1n <= 4

) 
 {        sQulj =  false;
}
 else if 
 (xV5af == u9Q1n

) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
} 
 else 
 {        xV5af = 0;

}
                     ++xV5af;

                      t5hwtgedrf.pneumonorrhaphy = "";
}

            } else {
            
 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        ++xV5af;
}
 else if 
 ( t5hwtgedrf.venire 
) 
 {        sQulj =  true;
} 
 else 
 {        t5hwtgedrf.superseptuaginarian = true;
}}




                     if ( t5hwtgedrf.superseptuaginarian 
) {
                    if (! sQulj 
) {
                    ++t5hwtgedrf.hague;

                     t5hwtgedrf.sphaerococcaceous = "";

                      u9Q1n++;
}

            } else {
                    t5hwtgedrf.unguidable = ! false;
}




                      if (! sQulj 
) {
                    xV5af -= 7;


            } else {
                    t5hwtgedrf.acidemia = "";
}



}
}



        t5hwtgedrf.unguidable =  false;
        if ( t5hwtgedrf.pneumonorrhaphy .equals("soubrettish") ) {
                    if ( t5hwtgedrf.acidemia != null) {
                    u9Q1n = 6;

                     if ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) {
                    if ( t5hwtgedrf.sphaerococcaceous != null) {
            
 if (xV5af != u9Q1n

) 
 {        sQulj = false;
}
 else if 
 (t5hwtgedrf.hague <= xV5af

) 
 {        sQulj = true;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "transnationally" ;
}
                     t5hwtgedrf.acidemia = "bulldogs" ;

                      t5hwtgedrf.venire =  true;
}

             
 if (u9Q1n <= xV5af
) 
 {        sQulj = true;
}
 else if 
 (! t5hwtgedrf.superseptuaginarian 
) 
 {        t5hwtgedrf.nalgo = false;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}
                      ++xV5af;
}

                      if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if (2 == xV5af
) {
                    sQulj = false;

                     sQulj = true;

                      xV5af = 6;
}

                     t5hwtgedrf.venire = false;

                      u9Q1n = 0;
}
}

            } else {
            
 if ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) 
 {        if (! t5hwtgedrf.sphaerococcaceous .contains("cuprocyanide") ) {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.unguidable = true;
}
 else if 
 (u9Q1n <= t5hwtgedrf.hague
) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        t5hwtgedrf.venire = true;
}
                     if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    t5hwtgedrf.sphaerococcaceous = "";

            } else {
                    xV5af += 9;

}




                      u9Q1n = 5;
}
}
 else if 
 (t5hwtgedrf.hague == xV5af
) 
 {        if ( t5hwtgedrf.acidemia .contains("maskegs") ) {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        sQulj = false;
}
 else if 
 (14 != u9Q1n
) 
 {        u9Q1n--;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "pseudointernationalistic" ;
}
                     t5hwtgedrf.sphaerococcaceous = "diacipiperazine" ;

                      ++u9Q1n;
}
} 
 else 
 {        if (xV5af != 0

) {
                    sQulj = false;

            } else {
                    t5hwtgedrf.venire =  false;
}



}}



        if ( t5hwtgedrf.pneumonorrhaphy != null) {
            
 if (u9Q1n != t5hwtgedrf.hague
) 
 {
 if ( t5hwtgedrf.acidemia == null
) 
 {        if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    if ( sQulj 
) {
            
 if ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.hague = 9;
}
 else if 
 (xV5af == 0

) 
 {        t5hwtgedrf.unguidable = false;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
            } else {
                    sQulj = true;
}




             
 if ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        sQulj = false;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .contains(t5hwtgedrf.acidemia) ) 
 {        sQulj = ! true;
} 
 else 
 {        sQulj = true;
}
                      u9Q1n -= 8;

}
}
 else if 
 (! t5hwtgedrf.nalgo 
) 
 {        if (5 <= xV5af
) {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    sQulj = ! false;

                     t5hwtgedrf.sphaerococcaceous = "";

                      t5hwtgedrf.superseptuaginarian = false;
}

                     u9Q1n--;

                      t5hwtgedrf.pneumonorrhaphy = "";
}
} 
 else 
 {
 if (xV5af != 1

) 
 {        t5hwtgedrf.nalgo = true;
}
 else if 
 (xV5af > 7

) 
 {        ++xV5af;
} 
 else 
 {        sQulj = false;
}}}
 else if 
 ( t5hwtgedrf.acidemia == null
) 
 {
 if ( t5hwtgedrf.venire 
) 
 {
 if ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    xV5af++;

                     sQulj = false;

                      t5hwtgedrf.sphaerococcaceous = "";
}
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        xV5af++;
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "nigglier" ;
}}
 else if 
 (xV5af <= xV5af

) 
 {        if ( t5hwtgedrf.acidemia == null
) {
                    t5hwtgedrf.sphaerococcaceous = "nuthouses" ;

            } else {
                    t5hwtgedrf.pneumonorrhaphy = "Kingsdown" ;
}



} 
 else 
 {        t5hwtgedrf.superseptuaginarian = true;
}} 
 else 
 {        if (12 <= xV5af
) {
                    t5hwtgedrf.pneumonorrhaphy = "effusely" ;

            } else {
                    t5hwtgedrf.sphaerococcaceous = "";
}



}
             
 if (! t5hwtgedrf.venire 
) 
 {        if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if ( sQulj 
) {
            
 if ( t5hwtgedrf.pneumonorrhaphy .equals("photoperiodically") ) 
 {        u9Q1n -= 10;

}
 else if 
 (8 == xV5af
) 
 {        t5hwtgedrf.acidemia = "indoctrinators" ;
} 
 else 
 {        t5hwtgedrf.nalgo = true;
}
                     t5hwtgedrf.acidemia = "";

                      t5hwtgedrf.nalgo = false;
}

             
 if (xV5af <= xV5af
) 
 {        sQulj = false;
}
 else if 
 ( sQulj 
) 
 {        t5hwtgedrf.superseptuaginarian = false;
} 
 else 
 {        u9Q1n--;
}
                      t5hwtgedrf.sphaerococcaceous = "";
}
}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        if (xV5af <= u9Q1n
) {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    sQulj =  false;

            } else {
                    sQulj = true;
}




                     u9Q1n = 11;


                      t5hwtgedrf.pneumonorrhaphy = "";
}
} 
 else 
 {        if (4 <= xV5af
) {
                    ++u9Q1n;

                     t5hwtgedrf.acidemia = "";

                      t5hwtgedrf.venire = true;
}
}
              
 if (u9Q1n <= xV5af
) 
 {        if ( t5hwtgedrf.nalgo 
) {
            
 if (! t5hwtgedrf.sphaerococcaceous .equals(t5hwtgedrf.sphaerococcaceous) ) 
 {        t5hwtgedrf.unguidable = false;
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        u9Q1n = 1;

} 
 else 
 {        xV5af -= 13;
}
            } else {
                    t5hwtgedrf.superseptuaginarian = true;
}



}
 else if 
 (t5hwtgedrf.hague < 12

) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}
 else if 
 (! t5hwtgedrf.superseptuaginarian 
) 
 {        sQulj = ! true;
} 
 else 
 {        t5hwtgedrf.superseptuaginarian = false;
}} 
 else 
 {        u9Q1n = 6;

}}

         
    }

     
    public  void coulometry(boolean u8NuU, String htjjg, String R2GMa, int UnJND) {
                if (! htjjg .contains("analbuminemia") ) {
                    ++t5hwtgedrf.hague;

            } else {
            
 if ( t5hwtgedrf.venire 
) 
 {        if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    if ( u8NuU 
) {
                    if ( R2GMa == null
) {
                    t5hwtgedrf.hague -= 12;


                     ++UnJND;

                      UnJND = 7;
}

            } else {
                    t5hwtgedrf.hague--;
}




            } else {
                    t5hwtgedrf.hague = 12;
}



}
 else if 
 (UnJND < t5hwtgedrf.hague
) 
 {
 if (11 > UnJND
) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) 
 {        UnJND++;
}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) 
 {        t5hwtgedrf.hague = 10;
} 
 else 
 {        UnJND--;
}}
 else if 
 (! htjjg .toUpperCase().isEmpty() ) 
 {        u8NuU =  false;
} 
 else 
 {        t5hwtgedrf.nalgo = false;
}} 
 else 
 {        if ( t5hwtgedrf.sphaerococcaceous != null) {
                    t5hwtgedrf.nalgo = true;

                     UnJND = 11;

                      t5hwtgedrf.unguidable = true;
}
}}



        if (t5hwtgedrf.hague <= 11

) {
            
 if ( htjjg != null) 
 {        if (UnJND > UnJND

) {
            
 if (UnJND > UnJND
) 
 {
 if ( R2GMa == null
) 
 {
 if ( R2GMa != null) 
 {        htjjg = "animally" ;
}
 else if 
 (! t5hwtgedrf.superseptuaginarian 
) 
 {        t5hwtgedrf.nalgo = false;
} 
 else 
 {        UnJND = 14;
}}
 else if 
 (UnJND > UnJND

) 
 {        t5hwtgedrf.superseptuaginarian =  true;
} 
 else 
 {        t5hwtgedrf.venire =  false;
}}
 else if 
 ( t5hwtgedrf.nalgo 
) 
 {        if (! htjjg .isEmpty() ) {
                    UnJND--;

                     R2GMa = "banghy" ;

                      htjjg = "";
}
} 
 else 
 {        t5hwtgedrf.hague++;
}
                     if ( R2GMa .isEmpty() ) {
                    if ( htjjg != null) {
                    R2GMa = "semiconvergent" ;

                     u8NuU = false;

                      htjjg = "";
}

            } else {
                    UnJND++;
}




                      if ( R2GMa == null
) {
                    R2GMa = "";

            } else {
                    t5hwtgedrf.nalgo = false;
}



}
}
 else if 
 (UnJND < 3

) 
 {        if ( t5hwtgedrf.superseptuaginarian 
) {
                    if ( u8NuU 
) {
                    if ( R2GMa == null
) {
                    UnJND = 10;

                     t5hwtgedrf.acidemia = "";

                      u8NuU = ! false;
}

                     t5hwtgedrf.hague++;

                      u8NuU =  false;
}

             
 if (2 < UnJND
) 
 {        UnJND = 5;
}
 else if 
 (UnJND != UnJND
) 
 {        UnJND++;
} 
 else 
 {        t5hwtgedrf.hague = 14;
}
                      ++t5hwtgedrf.hague;
}
} 
 else 
 {        if ( t5hwtgedrf.acidemia == null
) {
            
 if ( t5hwtgedrf.acidemia == null
) 
 {        UnJND = 9;
}
 else if 
 ( R2GMa != null) 
 {        t5hwtgedrf.nalgo = true;
} 
 else 
 {        R2GMa = "";
}
                     t5hwtgedrf.hague = 6;

                      htjjg = "flodge" ;
}
}
            } else {
                    if ( u8NuU 
) {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    if ( htjjg == null
) {
            
 if (t5hwtgedrf.hague > UnJND
) 
 {        t5hwtgedrf.venire =  false;
}
 else if 
 ( t5hwtgedrf.superseptuaginarian 
) 
 {        R2GMa = "";
} 
 else 
 {        t5hwtgedrf.unguidable = true;
}
            } else {
                    t5hwtgedrf.superseptuaginarian = true;
}




            } else {
                    if (10 > t5hwtgedrf.hague
) {
                    t5hwtgedrf.pneumonorrhaphy = "scripee" ;

            } else {
                    t5hwtgedrf.superseptuaginarian = false;
}



}




                     if ( t5hwtgedrf.superseptuaginarian 
) {
                    if (UnJND != UnJND
) {
                    htjjg = "";

            } else {
                    t5hwtgedrf.superseptuaginarian = true;
}




                     htjjg = "flavorer" ;

                      u8NuU = false;
}

              
 if ( u8NuU 
) 
 {        --UnJND;
}
 else if 
 (UnJND <= t5hwtgedrf.hague
) 
 {        t5hwtgedrf.acidemia = "";
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "";
}}
}



        if ( t5hwtgedrf.venire 
) {
                    if ( htjjg != null) {
                    UnJND++;

            } else {
                    if (6 == UnJND
) {
            
 if ( t5hwtgedrf.nalgo 
) 
 {        if ( R2GMa == null
) {
                    ++UnJND;

            } else {
                    UnJND--;
}



}
 else if 
 (6 <= UnJND
) 
 {        t5hwtgedrf.unguidable = false;
} 
 else 
 {        R2GMa = "climature" ;
}
                     if (! R2GMa .isEmpty() ) {
                    t5hwtgedrf.venire = false;

            } else {
                    htjjg = "protease" ;
}




                      t5hwtgedrf.superseptuaginarian = false;
}
}




             
 if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) 
 {        if ( t5hwtgedrf.acidemia == null
) {
            
 if (UnJND > UnJND

) 
 {        if ( R2GMa .isEmpty() ) {
                    R2GMa = "";

            } else {
                    htjjg = "fatten" ;
}



}
 else if 
 ( t5hwtgedrf.sphaerococcaceous == null
) 
 {        R2GMa = "";
} 
 else 
 {        htjjg = "tahsils" ;
}
            } else {
                    if (UnJND == UnJND
) {
                    t5hwtgedrf.venire = false;

            } else {
                    u8NuU = false;
}



}



}
 else if 
 (UnJND != 12

) 
 {        if ( u8NuU 
) {
            
 if (3 != UnJND
) 
 {        t5hwtgedrf.hague = 5;

}
 else if 
 ( t5hwtgedrf.sphaerococcaceous .contains("tautogolabrus") ) 
 {        UnJND = 11;
} 
 else 
 {        R2GMa = "touters" ;
}
                     UnJND = 1;

                      t5hwtgedrf.pneumonorrhaphy = "";
}
} 
 else 
 {        UnJND = 3;

}
                      if ( t5hwtgedrf.sphaerococcaceous != null) {
                    if ( R2GMa .contains("nonredeemable") ) {
                    if (UnJND > UnJND
) {
                    u8NuU = false;

                     htjjg = "";

                      t5hwtgedrf.superseptuaginarian = true;
}

                     t5hwtgedrf.superseptuaginarian = true;

                      t5hwtgedrf.superseptuaginarian = false;
}

                     if (UnJND != 7

) {
                    u8NuU = false;

            } else {
                    u8NuU = ! true;
}




                      t5hwtgedrf.superseptuaginarian =  true;
}
}

 if (UnJND > t5hwtgedrf.hague
) 
 {
 if ( htjjg .equals("isotrimorphism") ) 
 {        htjjg = "";
}
 else if 
 ( t5hwtgedrf.acidemia != null) 
 {        if ( u8NuU 
) {
                    if ( R2GMa != null) {
                    u8NuU = false;

            } else {
                    u8NuU = false;
}




                     if ( t5hwtgedrf.unguidable 
) {
                    UnJND--;

            } else {
                    u8NuU =  true;
}




                      htjjg = "leeping" ;
}
} 
 else 
 {        if ( u8NuU 
) {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.nalgo = true;
}
 else if 
 ( htjjg .equals("misconjunction") ) 
 {        UnJND -= 5;

} 
 else 
 {        u8NuU = true;
}
                     R2GMa = "burthenman" ;

                      t5hwtgedrf.sphaerococcaceous = "";
}
}}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        if ( htjjg .isEmpty() ) {
                    t5hwtgedrf.acidemia = "";

                     if (UnJND > 8

) {
                    if (t5hwtgedrf.hague <= UnJND

) {
                    t5hwtgedrf.unguidable =  true;

                     R2GMa = "monstruosity" ;

                      R2GMa = "malbehavior" ;
}

            } else {
                    UnJND -= 12;

}




                      if ( R2GMa != null) {
                    htjjg = "";

                     UnJND = 11;

                      R2GMa = "";
}
}
} 
 else 
 {        if (! htjjg .toLowerCase().contains(htjjg) ) {
                    if (UnJND > UnJND

) {
            
 if (UnJND != UnJND
) 
 {        t5hwtgedrf.superseptuaginarian =  true;
}
 else if 
 ( u8NuU 
) 
 {        t5hwtgedrf.hague = 8;
} 
 else 
 {        R2GMa = "macrophyte" ;
}
                     t5hwtgedrf.hague = 12;

                      u8NuU = true;
}

            } else {
            
 if (UnJND <= t5hwtgedrf.hague
) 
 {        t5hwtgedrf.hague++;
}
 else if 
 ( t5hwtgedrf.venire 
) 
 {        R2GMa = "";
} 
 else 
 {        UnJND--;
}}



}
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {
 if (t5hwtgedrf.hague != 2

) 
 {        if (UnJND > t5hwtgedrf.hague
) {
            
 if (UnJND <= UnJND
) 
 {        if ( htjjg != null) {
                    if ( htjjg == null
) {
                    htjjg = "berat" ;

                     --UnJND;

                      UnJND++;
}

                     UnJND -= 8;

                      htjjg = "rebuilds" ;
}
}
 else if 
 ( R2GMa == null
) 
 {        if ( t5hwtgedrf.unguidable 
) {
                    htjjg = "";

                     UnJND += 14;


                      R2GMa = "";
}
} 
 else 
 {        htjjg = "misentreats" ;
}
            } else {
                    if ( u8NuU 
) {
                    UnJND--;

            } else {
                    u8NuU = false;
}



}



}
 else if 
 ( t5hwtgedrf.superseptuaginarian 
) 
 {
 if (UnJND > t5hwtgedrf.hague

) 
 {        if ( R2GMa == null
) {
            
 if ( t5hwtgedrf.acidemia .isEmpty() ) 
 {        R2GMa = "syped" ;
}
 else if 
 (6 < UnJND
) 
 {        t5hwtgedrf.nalgo = true;
} 
 else 
 {        u8NuU = false;
}
                     htjjg = "cohorts" ;

                      t5hwtgedrf.superseptuaginarian = true;
}
}
 else if 
 (! u8NuU 
) 
 {        if (UnJND != 7

) {
                    ++UnJND;

            } else {
                    u8NuU = true;
}



} 
 else 
 {        --t5hwtgedrf.hague;
}} 
 else 
 {        if ( u8NuU 
) {
            
 if ( htjjg != null) 
 {        t5hwtgedrf.acidemia = "stabs" ;
}
 else if 
 ( u8NuU 
) 
 {        t5hwtgedrf.unguidable = false;
} 
 else 
 {        t5hwtgedrf.hague = 12;

}
            } else {
                    R2GMa = "";
}



}}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if ( htjjg == null
) {
                    if (10 > t5hwtgedrf.hague
) {
                    if (9 < UnJND
) {
            
 if ( R2GMa != null) 
 {        UnJND = 5;

}
 else if 
 ( R2GMa != null) 
 {        R2GMa = "";
} 
 else 
 {        ++UnJND;
}
            } else {
                    htjjg = "janua" ;
}




            } else {
                    if ( t5hwtgedrf.acidemia .toLowerCase().isEmpty() ) {
                    UnJND = 13;


            } else {
                    u8NuU =  false;
}



}




                     if (t5hwtgedrf.hague > UnJND
) {
                    if (UnJND <= UnJND
) {
                    R2GMa = "reemphasized" ;

                     UnJND++;

                      u8NuU = true;
}

                     t5hwtgedrf.acidemia = "Valdis" ;

                      R2GMa = "";
}

                      if (UnJND == t5hwtgedrf.hague

) {
                    u8NuU = true;

            } else {
                    UnJND = 11;
}



}
} 
 else 
 {
 if ( htjjg != null) 
 {        if ( htjjg == null
) {
                    if (! htjjg .equals(htjjg) ) {
                    u8NuU = false;

                     UnJND--;

                      UnJND = 8;

}

            } else {
                    --UnJND;
}



}
 else if 
 ( R2GMa == null
) 
 {        if (4 != UnJND
) {
                    u8NuU = false;

                     t5hwtgedrf.hague = 13;


                      u8NuU = true;
}
} 
 else 
 {        u8NuU =  false;
}}
 if (! t5hwtgedrf.sphaerococcaceous .equals(R2GMa) ) 
 {        if (UnJND > 1

) {
                    if ( t5hwtgedrf.acidemia == null
) {
                    if ( t5hwtgedrf.acidemia .contains("nonfatality") ) {
                    ++UnJND;

                     if (! u8NuU 
) {
                    htjjg = "sultam" ;

            } else {
                    t5hwtgedrf.superseptuaginarian = false;
}




                      UnJND = 9;
}

            } else {
            
 if (UnJND <= UnJND

) 
 {        if ( htjjg != null) {
                    ++UnJND;

                     t5hwtgedrf.venire = true;

                      t5hwtgedrf.acidemia = "";
}
}
 else if 
 (UnJND == UnJND

) 
 {        UnJND++;
} 
 else 
 {        t5hwtgedrf.hague += 3;

}}




                     if (UnJND <= 2

) {
                    if (UnJND <= 3

) {
                    if (UnJND <= 9

) {
                    R2GMa = "helicopts" ;

            } else {
                    htjjg = "unipartite" ;
}




            } else {
                    t5hwtgedrf.nalgo =  false;
}




            } else {
                    R2GMa = "Cyclopteridae" ;
}




              
 if (UnJND <= 0

) 
 {
 if ( htjjg != null) 
 {        htjjg = "";
}
 else if 
 ( R2GMa == null
) 
 {        t5hwtgedrf.superseptuaginarian = true;
} 
 else 
 {        t5hwtgedrf.acidemia = "";
}}
 else if 
 ( t5hwtgedrf.acidemia == null
) 
 {        htjjg = "Vitus" ;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "supersphenoid" ;
}}
}
 else if 
 ( u8NuU 
) 
 {
 if ( t5hwtgedrf.venire 
) 
 {
 if ( R2GMa .isEmpty() ) 
 {        if (2 > UnJND
) {
                    if (2 <= UnJND
) {
                    ++UnJND;

                     UnJND = 3;


                      t5hwtgedrf.nalgo = true;
}

            } else {
                    R2GMa = "";
}



}
 else if 
 ( u8NuU 
) 
 {        if (! u8NuU 
) {
                    R2GMa = "";

            } else {
                    u8NuU = true;
}



} 
 else 
 {        UnJND = 6;

}}
 else if 
 ( t5hwtgedrf.venire 
) 
 {        htjjg = "retropulmonary" ;
} 
 else 
 {        if (9 > UnJND
) {
                    t5hwtgedrf.nalgo = false;

            } else {
                    R2GMa = "pearlescences" ;
}



}} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "";
}        if (UnJND > t5hwtgedrf.hague

) {
            
 if (3 <= t5hwtgedrf.hague
) 
 {        if ( t5hwtgedrf.acidemia .equals(t5hwtgedrf.acidemia) ) {
                    if (UnJND < UnJND
) {
                    if ( htjjg != null) {
                    if ( t5hwtgedrf.acidemia == null
) {
                    htjjg = "Shepherdsville" ;

                     u8NuU =  true;

                      u8NuU = false;
}

                     UnJND--;

                      R2GMa = "lenticulated" ;
}

                     if (! htjjg .isEmpty() ) {
                    t5hwtgedrf.pneumonorrhaphy = "Jordan" ;

            } else {
                    u8NuU = false;
}




                      htjjg = "ichthyophagize" .intern();
}

            } else {
                    if (! t5hwtgedrf.superseptuaginarian 
) {
                    if ( u8NuU 
) {
                    t5hwtgedrf.hague = 2;

                     ++UnJND;

                      UnJND = 3;

}

                     R2GMa = "";

                      UnJND++;
}
}



}
 else if 
 (UnJND > UnJND
) 
 {        --UnJND;
} 
 else 
 {        UnJND--;
}
            } else {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    if (UnJND <= 2

) {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if ( htjjg == null
) {
                    htjjg = "";

                     R2GMa = "jarbot" ;

                      ++UnJND;
}
}
 else if 
 ( R2GMa == null
) 
 {        t5hwtgedrf.hague = 1;
} 
 else 
 {        t5hwtgedrf.hague = 2;
}
                     if ( u8NuU 
) {
                    htjjg = "";

            } else {
                    UnJND = 8;

}




                      UnJND++;
}

                     if ( htjjg != null) {
                    if ( R2GMa == null
) {
                    t5hwtgedrf.venire = true;

                     t5hwtgedrf.hague = 12;


                      htjjg = "quizmasters" ;
}

            } else {
                    t5hwtgedrf.venire = false;
}




                      if ( htjjg != null) {
                    t5hwtgedrf.sphaerococcaceous = "";

            } else {
                    t5hwtgedrf.hague = 13;
}



}
}




         
    }

     
    public  void hyperactively(int oF0kz) {
                if (! t5hwtgedrf.pneumonorrhaphy .isEmpty() ) {
                    t5hwtgedrf.sphaerococcaceous = "";

            } else {
            
 if (12 > oF0kz
) 
 {
 if ( t5hwtgedrf.venire 
) 
 {        if (oF0kz < oF0kz
) {
                    if (t5hwtgedrf.hague <= oF0kz
) {
                    t5hwtgedrf.sphaerococcaceous = "jungermanniales" .toUpperCase();

            } else {
                    t5hwtgedrf.hague--;
}




            } else {
                    t5hwtgedrf.unguidable =  false;
}



}
 else if 
 (! t5hwtgedrf.venire 
) 
 {        if ( t5hwtgedrf.acidemia == null
) {
                    t5hwtgedrf.acidemia = "";

                     t5hwtgedrf.acidemia = "";

                      t5hwtgedrf.nalgo = false;
}
} 
 else 
 {        t5hwtgedrf.acidemia = "controversionalism" ;
}}
 else if 
 ( t5hwtgedrf.superseptuaginarian 
) 
 {        t5hwtgedrf.pneumonorrhaphy = "religionized" ;
} 
 else 
 {        if (! t5hwtgedrf.acidemia .isEmpty() ) {
                    t5hwtgedrf.sphaerococcaceous = "uptable" ;

                     t5hwtgedrf.nalgo =  true;

                      oF0kz = 1;

}
}}




 if (t5hwtgedrf.hague <= t5hwtgedrf.hague

) 
 {        if (oF0kz <= t5hwtgedrf.hague

) {
                    if ( t5hwtgedrf.sphaerococcaceous .contains("troubador") ) {
            
 if ( t5hwtgedrf.sphaerococcaceous .isEmpty() ) 
 {        t5hwtgedrf.venire = true;
}
 else if 
 (! t5hwtgedrf.unguidable 
) 
 {        if ( t5hwtgedrf.sphaerococcaceous != null) {
                    t5hwtgedrf.venire = false;

            } else {
                    t5hwtgedrf.unguidable = false;
}



} 
 else 
 {        t5hwtgedrf.venire = false;
}
            } else {
                    if (oF0kz != 0

) {
            
 if (oF0kz > oF0kz
) 
 {        t5hwtgedrf.nalgo =  true;
}
 else if 
 ( t5hwtgedrf.superseptuaginarian 
) 
 {        t5hwtgedrf.unguidable = false;
} 
 else 
 {        t5hwtgedrf.nalgo =  false;
}
                     t5hwtgedrf.sphaerococcaceous = "unipara" ;

                      t5hwtgedrf.venire = true;
}
}




                     if (oF0kz <= 4

) {
            
 if ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    t5hwtgedrf.acidemia = "batardeau" .trim();

            } else {
                    t5hwtgedrf.venire = true;
}



}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        oF0kz = 11;
} 
 else 
 {        t5hwtgedrf.superseptuaginarian = true;
}
            } else {
                    t5hwtgedrf.nalgo =  true;
}




                      t5hwtgedrf.nalgo =  false;
}
}
 else if 
 ( t5hwtgedrf.venire 
) 
 {        if ( t5hwtgedrf.pneumonorrhaphy .trim().isEmpty() ) {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if (oF0kz == t5hwtgedrf.hague
) {
                    if ( t5hwtgedrf.pneumonorrhaphy != null) {
                    t5hwtgedrf.venire =  false;

            } else {
                    t5hwtgedrf.unguidable =  true;
}




            } else {
                    t5hwtgedrf.pneumonorrhaphy = "uncostumed" ;
}




                     if ( t5hwtgedrf.pneumonorrhaphy .isEmpty() ) {
                    t5hwtgedrf.hague = 12;

            } else {
                    oF0kz += 0;
}




                      t5hwtgedrf.sphaerococcaceous = "";
}

            } else {
                    if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    t5hwtgedrf.pneumonorrhaphy = "";

                     ++oF0kz;

                      t5hwtgedrf.sphaerococcaceous = "pseudogentlemanly" ;
}
}



} 
 else 
 {
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {        t5hwtgedrf.superseptuaginarian = true;
}
 else if 
 (oF0kz <= oF0kz
) 
 {        if (! t5hwtgedrf.venire 
) {
                    t5hwtgedrf.unguidable = true;

                     oF0kz--;

                      t5hwtgedrf.nalgo =  false;
}
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "lungsick" ;
}}
 if ( t5hwtgedrf.acidemia != null) 
 {        t5hwtgedrf.unguidable = false;
}
 else if 
 (oF0kz == oF0kz

) 
 {
 if (! t5hwtgedrf.unguidable 
) 
 {        if (3 == t5hwtgedrf.hague
) {
                    if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    if (4 <= oF0kz
) {
                    t5hwtgedrf.pneumonorrhaphy = "";

            } else {
                    t5hwtgedrf.hague = 5;
}




                     t5hwtgedrf.venire = true;

                      t5hwtgedrf.venire =  false;
}

            } else {
            
 if ( t5hwtgedrf.acidemia == null
) 
 {        t5hwtgedrf.acidemia = "";
}
 else if 
 ( t5hwtgedrf.acidemia == null
) 
 {        oF0kz = 5;

} 
 else 
 {        t5hwtgedrf.venire = false;
}}



}
 else if 
 (oF0kz != 11

) 
 {
 if (! t5hwtgedrf.pneumonorrhaphy .isEmpty() ) 
 {
 if ( t5hwtgedrf.pneumonorrhaphy .contains("sparmannia") ) 
 {        t5hwtgedrf.nalgo =  false;
}
 else if 
 (oF0kz == oF0kz

) 
 {        t5hwtgedrf.nalgo = false;
} 
 else 
 {        t5hwtgedrf.pneumonorrhaphy = "shedwise" .toLowerCase();
}}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        t5hwtgedrf.venire = true;
} 
 else 
 {        t5hwtgedrf.hague++;
}} 
 else 
 {        if (3 != oF0kz
) {
                    oF0kz++;

            } else {
                    oF0kz += 1;

}



}} 
 else 
 {        if (t5hwtgedrf.hague != 2

) {
            
 if (oF0kz > 4

) 
 {        if ( t5hwtgedrf.venire 
) {
                    t5hwtgedrf.sphaerococcaceous = "cycloses" ;

            } else {
                    oF0kz = 2;
}



}
 else if 
 ( t5hwtgedrf.sphaerococcaceous != null) 
 {        --oF0kz;
} 
 else 
 {        t5hwtgedrf.acidemia = "";
}
                     if ( t5hwtgedrf.acidemia == null
) {
                    t5hwtgedrf.unguidable =  false;

                     oF0kz = 6;

                      t5hwtgedrf.superseptuaginarian =  true;
}

                      t5hwtgedrf.hague--;
}
}        if (t5hwtgedrf.hague < oF0kz
) {
            
 if ( t5hwtgedrf.acidemia != null) 
 {        if ( t5hwtgedrf.acidemia != null) {
                    t5hwtgedrf.superseptuaginarian = false;

            } else {
            
 if (oF0kz < 11

) 
 {        if (0 < oF0kz
) {
                    t5hwtgedrf.sphaerococcaceous = "quadrupedant" ;

                     t5hwtgedrf.pneumonorrhaphy = "";

                      oF0kz = 11;
}
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy != null) 
 {        oF0kz--;
} 
 else 
 {        t5hwtgedrf.acidemia = "jaboticabas" ;
}}



}
 else if 
 ( t5hwtgedrf.unguidable 
) 
 {
 if (! t5hwtgedrf.venire 
) 
 {        if ( t5hwtgedrf.sphaerococcaceous != null) {
                    if ( t5hwtgedrf.pneumonorrhaphy .contains(t5hwtgedrf.sphaerococcaceous) ) {
                    t5hwtgedrf.pneumonorrhaphy = "";

            } else {
                    --oF0kz;
}




                     t5hwtgedrf.pneumonorrhaphy = "saharan" ;

                      oF0kz++;
}
}
 else if 
 (5 <= oF0kz
) 
 {        if (oF0kz != t5hwtgedrf.hague

) {
                    t5hwtgedrf.sphaerococcaceous = "";

            } else {
                    oF0kz -= 5;

}



} 
 else 
 {        t5hwtgedrf.nalgo = false;
}} 
 else 
 {        if ( t5hwtgedrf.acidemia != null) {
                    if ( t5hwtgedrf.acidemia == null
) {
                    t5hwtgedrf.nalgo = false;

                     t5hwtgedrf.superseptuaginarian = false;

                      oF0kz = 14;

}

                     t5hwtgedrf.venire = false;

                      t5hwtgedrf.sphaerococcaceous = "";
}
}
                     if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    if ( t5hwtgedrf.sphaerococcaceous == null
) {
            
 if (oF0kz <= 0

) 
 {        if (8 <= oF0kz
) {
                    oF0kz = 8;

                     oF0kz++;

                      t5hwtgedrf.acidemia = "";
}
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.pneumonorrhaphy = "";
} 
 else 
 {        t5hwtgedrf.sphaerococcaceous = "micrometeorological" ;
}
                     if (! t5hwtgedrf.venire 
) {
                    oF0kz--;

            } else {
                    t5hwtgedrf.sphaerococcaceous = "churrasco" ;
}




                      t5hwtgedrf.nalgo =  true;
}

                     if (oF0kz <= oF0kz

) {
                    if ( t5hwtgedrf.sphaerococcaceous == null
) {
                    t5hwtgedrf.unguidable = false;

                     t5hwtgedrf.nalgo = false;

                      t5hwtgedrf.acidemia = "";
}

                     t5hwtgedrf.pneumonorrhaphy = "Runtgen" ;

                      t5hwtgedrf.acidemia = "ceorls" ;
}

              
 if ( t5hwtgedrf.sphaerococcaceous != null) 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
 else if 
 ( t5hwtgedrf.pneumonorrhaphy == null
) 
 {        t5hwtgedrf.sphaerococcaceous = "";
} 
 else 
 {        t5hwtgedrf.acidemia = "";
}}

              
 if (! t5hwtgedrf.pneumonorrhaphy .isEmpty() ) 
 {
 if (oF0kz <= t5hwtgedrf.hague
) 
 {        t5hwtgedrf.sphaerococcaceous = "";
}
 else if 
 (5 <= oF0kz
) 
 {        oF0kz = 3;
} 
 else 
 {        oF0kz = 11;

}}
 else if 
 (t5hwtgedrf.hague > 9

) 
 {        if ( t5hwtgedrf.pneumonorrhaphy == null
) {
                    t5hwtgedrf.nalgo = false;

                     t5hwtgedrf.acidemia = "pufferies" ;

                      t5hwtgedrf.nalgo = false;
}
} 
 else 
 {        t5hwtgedrf.nalgo = false;
}}

         
    }

     }