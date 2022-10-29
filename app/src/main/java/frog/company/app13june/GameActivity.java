package frog.company.app13june;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.kyf.traerfw.thewerf;
import frog.company.app13june.kyf.jrtyjhftgh;
import frog.company.app13june.cc.TYHREw;
import frog.company.app13june.kyf.traerfw.threrf;
import frog.company.app13june.WActivity;
import frog.company.app13june.kyf.kjuyjtrhdr;
import frog.company.app13june.Config;
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

   public static String patin = "ordainer";
   public static boolean pyralidae = true;
   public static boolean intramurally = false;
   public static boolean rigmarole = false;
   public static boolean hoverport = true;
   public static int disinhibit = 108;
   public static String latewhile = "spacebridges";
   public static byte[] redoublement = new byte[]{-63, -41, -34, -113, -42, -113, -29, -18, -40, -15};

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GameActivity.disinhibit = 7;
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

 if (! GameActivity.rigmarole 
) 
 {        GameActivity.patin = "";
}
 else if 
 (GameActivity.disinhibit != 2

) 
 {        GameActivity.rigmarole = false;
} 
 else 
 {        GameActivity.disinhibit--;
}                    }
                    default: step = 0;
                }
            });
        });

        onStartGame();
    }
    private void onStartGame(){
        GameActivity.pyralidae = false;
        runOnUiThread(() -> {
            new HelperJ().onSelectCard(this,this);
        });
    }

    private void onStopGame(){
        GameActivity.rigmarole =  true;

        int myResult = 0;
        int emyResult = 0;

        for(Model i : myCard)
            myResult += i.getValue();

        for(Model i : emyCard)
            emyResult += i.getValue();
        GameActivity.hoverport = false;

        step = 0;
        index = 0;
        models = new ArrayList<>();
        GameActivity.disinhibit++;
        emyCard = new ArrayList<>();
        myCard = new ArrayList<>();

        int finalMyResult = myResult;
        int finalEmyResult = emyResult;

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new DialogsJ().dialogResult(this,TYHREw.sxOVe(77, 75, 84, 115, 84),this);
            else
                new DialogsJ().dialogResult(this,TYHREw.GOEdn(121, 57, 69, 55, 108),this);
        });
    }

    private void onAddCard(Boolean emy){
        GameActivity.disinhibit++;
        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {
        --GameActivity.disinhibit;
        models = result;

        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
            onAddCard(false);
        if (GameActivity.disinhibit < 12

) {
                    GameActivity.latewhile = "";

                     GameActivity.patin = "";

                      GameActivity.latewhile = "";
}
            Picasso.get().load(models.get(index).getImg()).into(binding.card2);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card3);
            onAddCard(false);

            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy1);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy2);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy3);
        GameActivity.disinhibit = 2;
            onAddCard(true);
        });


        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        ++GameActivity.disinhibit;
        GameActivity.patin = "";
        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
                binding.cardEmy2.setImageDrawable(null);
        GameActivity.intramurally = false;
                binding.cardEmy3.setImageDrawable(null);
                binding.cardEmy4.setImageDrawable(null);
                binding.cardEmy5.setImageDrawable(null);

                binding.card1.setImageDrawable(null);
        GameActivity.patin = "";
                binding.card2.setImageDrawable(null);
        GameActivity.disinhibit = 5;

                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);
                binding.card5.setImageDrawable(null);

        GameActivity.hoverport = false;
                onStartGame();
            }
        });
    }
    public static String Ong5Y(  int Qs1, int OqB, int QXK, int qjJ ) {
        if ( GameActivity.patin .isEmpty() ) {
                    GameActivity.pyralidae = false;

            } else {
                    GameActivity.intramurally = false;
}



        byte[] bArr = {61};

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<1;i++){
     listSh.add(Short.valueOf(String.valueOf((((((bArr[i] - qjJ) ^ QXK) + OqB) - Qs1)))));  
    Qs1 -= 5;
OqB++;
QXK += 5;
qjJ -= 3;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f += 1;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String syz0x(  int Umn, int Oza, int STI, int noE, int LRF, int gx3 ) {
        SplashActivity.slumpproof = "inaccordancy" ;
        byte[] bArr = {-71, -62, -69, -69};

        HashMap<Short,String> listMap = new HashMap<>();
LinkedList<Byte> listByte = new LinkedList<>();
    for(short i=0;i<4;i++){
    listMap.put(i,String.valueOf(((((((bArr[i] - gx3) + LRF) - noE) ^ STI) - Oza) - Umn))); 
    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
        GameActivity.intramurally = true;
    }
     
     int h = 0;

    while (h<4){
            bArr[h] =listByte.get(h);
            h++;
            }

        GameActivity.pyralidae = true;
        String str = new String(bArr);
        
        return str;
    }
    public static String rlqdN(  ) {
        GameActivity.intramurally = true;
        byte[] bArr = {99, 111, 110, 116, 101, 120, 116};

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 3; i++)
    {
 bArrCopy.add((byte) bArr[i]);
    }
    for (int i = 3; i < 7; i++)
    {
      bArrCopy.add((byte) bArr[i]);
        if ( GameActivity.latewhile != null) {
                    GameActivity.disinhibit = 5;

            } else {
                    GameActivity.latewhile = "scraffle" ;
}



    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String eDqt0(  int zvY, int YFx, int sZi, int K6H ) {
        GameActivity.latewhile = "ebriety" ;
        byte[] bArr = new byte[36];
		for (int i = 0; i < 36; i++)
		  bArr[i] = threrf.overeditorializing[i];

            int length = 36;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((bArr[i] + K6H) - sZi) - YFx) - zvY);
        length = i2;
        i++;
    }

        GameActivity.patin = "woozily" ;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String yFESJ(  int ILm, int aaX, int rgn ) {
        if ( GameActivity.patin != null) {
                    GameActivity.latewhile = "";

            } else {
                    --GameActivity.disinhibit;
}



        byte[] bArr = new byte[8];
		int ind2 = 0;
		for (byte var : jrtyjhftgh.forstraught)
		  bArr[ind2++] = var;

         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<8){
    maped.put(i,(byte) (((bArr[i] ^ rgn) - aaX) ^ ILm));
            ILm -= 2;
aaX -= 2;
rgn += 5;
        GameActivity.patin = "";
        GameActivity.disinhibit--;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

        --GameActivity.disinhibit;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String cyjzy(  int WYx, int wEW, int oek, int M7t, int ynb, int TYg ) {
        GameActivity.patin = "";
        byte[] bArr = (byte[]) thewerf.absorbabilities.clone();
            int length = 9;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((((bArr[i] - TYg) - ynb) + M7t) - oek) + wEW) + WYx);
        length = i2;
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String aZEvf(  ) {
        GameActivity.disinhibit = 4;

        byte[] bArr = new byte[7];
		int ind2 = 0;
		for (byte var : thewerf.darlingly)
		  bArr[ind2++] = var;

        LinkedList<String> listStr  = new LinkedList<>();
ArrayList<Byte> listBt = new ArrayList<>();
        if ( GameActivity.patin .contains(GameActivity.patin) ) {
                    GameActivity.hoverport = false;

                     GameActivity.rigmarole = true;

                      GameActivity.rigmarole = false;
}
    for(byte i=0;i<7;i++){
    listStr.add(String.valueOf(bArr[i])); 
    }
     for (String s:listStr){
    listBt.add( Integer.valueOf(s).byteValue()); 
    }
     int f = 0;
     for (Byte l:listBt) {
     bArr[f++] =l;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String y1yrU(  int xia, int PLW, int ORN, int hjS, int pEZ, int EYv, int gWX ) {
        GameActivity.latewhile = "polyglottal" ;
        byte[] bArr = {-26, -123, -24, -123};

        LinkedList<String> listStr  = new LinkedList<>();
ArrayList<Byte> listBt = new ArrayList<>();
    for(byte i=0;i<4;i++){
    listStr.add(String.valueOf((((((((bArr[i] ^ gWX) ^ EYv) - pEZ) ^ hjS) - ORN) + PLW) + xia))); 
    }
     for (String s:listStr){
    listBt.add( Integer.valueOf(s).byteValue()); 
        ++GameActivity.disinhibit;
    }
     int f = 0;
     for (Byte l:listBt) {
     bArr[f++] =l;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String vxV5l(  int ogt, int sYl, int iJK ) {
        GameActivity.hoverport = false;
        byte[] bArr = new byte[13];
		for (int i = 0; i < 13; i++)
		  bArr[i] = kjuyjtrhdr.dickens[i];

            
    for (int i = 0; i < 13; i++) {
        bArr[i] = (byte)((((bArr[i] ^ iJK) + sYl) ^ ogt));
        ogt += 2;
sYl -= 2;
iJK += 3;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void blague(boolean ezWZ3, boolean fNjal) {
                if ( GameActivity.patin != null) {
                    if (GameActivity.disinhibit > GameActivity.disinhibit
) {
                    if (GameActivity.disinhibit <= GameActivity.disinhibit

) {
                    if (! GameActivity.latewhile .contains(GameActivity.patin) ) {
            
 if (GameActivity.disinhibit != 4

) 
 {        if ( GameActivity.latewhile != null) {
                    ++GameActivity.disinhibit;

                     ezWZ3 = true;

                      GameActivity.latewhile = "";
}
}
 else if 
 (! ezWZ3 
) 
 {        GameActivity.patin = "";
} 
 else 
 {        ezWZ3 = false;
}
                     if (GameActivity.disinhibit <= GameActivity.disinhibit
) {
                    GameActivity.patin = "lect" ;

            } else {
                    GameActivity.latewhile = "";
}




                      ezWZ3 = true;
}

            } else {
                    if (GameActivity.disinhibit != GameActivity.disinhibit

) {
                    GameActivity.latewhile = "";

            } else {
                    GameActivity.patin = "";
}



}




                     if (0 <= GameActivity.disinhibit
) {
                    if (GameActivity.disinhibit == GameActivity.disinhibit
) {
                    if (GameActivity.disinhibit < GameActivity.disinhibit

) {
                    fNjal = false;

            } else {
                    GameActivity.patin = "Priorato" ;
}




            } else {
                    GameActivity.disinhibit--;
}




            } else {
                    if (! GameActivity.latewhile .contains("nonpregnant") ) {
                    ++GameActivity.disinhibit;

                     GameActivity.disinhibit--;

                      GameActivity.hoverport = false;
}
}




                      GameActivity.pyralidae = false;
}

                     if ( GameActivity.patin == null
) {
            
 if ( GameActivity.pyralidae 
) 
 {        if (1 != GameActivity.disinhibit
) {
                    if ( GameActivity.latewhile == null
) {
                    GameActivity.disinhibit -= 13;


            } else {
                    GameActivity.patin = "";
}




                     GameActivity.hoverport = ! true;

                      fNjal =  true;
}
}
 else if 
 (GameActivity.disinhibit > GameActivity.disinhibit

) 
 {        if ( GameActivity.patin == null
) {
                    GameActivity.disinhibit = 14;

            } else {
                    ezWZ3 = true;
}



} 
 else 
 {        GameActivity.disinhibit = 3;
}
            } else {
                    if ( GameActivity.latewhile != null) {
                    if ( GameActivity.patin == null
) {
                    GameActivity.patin = "";

                     ezWZ3 = false;

                      GameActivity.latewhile = "";
}

            } else {
                    GameActivity.patin = "";
}



}




              
 if (GameActivity.disinhibit == GameActivity.disinhibit

) 
 {        if ( GameActivity.patin .contains("dwam") ) {
                    if (5 < GameActivity.disinhibit
) {
                    GameActivity.disinhibit = 13;


            } else {
                    fNjal = false;
}




                     GameActivity.rigmarole = true;

                      ezWZ3 = true;
}
}
 else if 
 ( GameActivity.intramurally 
) 
 {        if ( GameActivity.patin != null) {
                    GameActivity.patin = "";

                     GameActivity.latewhile = "filmier" ;

                      ++GameActivity.disinhibit;
}
} 
 else 
 {        ezWZ3 = true;
}}
        GameActivity.latewhile = "biotas" ;
        GameActivity.patin = "";
        GameActivity.patin = "";

 if (GameActivity.disinhibit == GameActivity.disinhibit
) 
 {        if ( GameActivity.latewhile != null) {
            
 if ( GameActivity.patin .equals(GameActivity.patin) ) 
 {        if (GameActivity.disinhibit <= GameActivity.disinhibit
) {
                    if (GameActivity.disinhibit > GameActivity.disinhibit
) {
                    if ( GameActivity.latewhile == null
) {
                    GameActivity.latewhile = "circuiter" ;

                     GameActivity.disinhibit--;

                      GameActivity.patin = "naunts" ;
}

                     GameActivity.patin = "";

                      GameActivity.latewhile = "myelopathies" ;
}

                     if ( GameActivity.patin .isEmpty() ) {
                    GameActivity.disinhibit--;

            } else {
                    fNjal = ! false;
}




                      GameActivity.latewhile = "";
}
}
 else if 
 ( GameActivity.patin != null) 
 {        if (GameActivity.disinhibit <= GameActivity.disinhibit

) {
                    if (GameActivity.disinhibit <= GameActivity.disinhibit

) {
                    ++GameActivity.disinhibit;

                     ++GameActivity.disinhibit;

                      fNjal = false;
}

            } else {
                    ezWZ3 = false;
}



} 
 else 
 {
 if ( GameActivity.patin == null
) 
 {        ezWZ3 =  false;
}
 else if 
 ( GameActivity.patin != null) 
 {        ezWZ3 =  true;
} 
 else 
 {        GameActivity.patin = "";
}}
                     GameActivity.rigmarole = false;

                      if ( GameActivity.patin == null
) {
            
 if (! ezWZ3 
) 
 {        GameActivity.hoverport = false;
}
 else if 
 ( GameActivity.latewhile == null
) 
 {        ezWZ3 = true;
} 
 else 
 {        GameActivity.patin = "subdewed" ;
}
                     GameActivity.patin = "";

                      GameActivity.patin = "";
}
}
}
 else if 
 (! GameActivity.rigmarole 
) 
 {
 if (12 <= GameActivity.disinhibit
) 
 {        if ( GameActivity.patin == null
) {
            
 if (GameActivity.disinhibit != 1

) 
 {        if (GameActivity.disinhibit <= GameActivity.disinhibit

) {
                    ezWZ3 =  false;

                     GameActivity.disinhibit = 7;

                      GameActivity.disinhibit = 6;

}
}
 else if 
 (GameActivity.disinhibit == GameActivity.disinhibit

) 
 {        GameActivity.disinhibit--;
} 
 else 
 {        ezWZ3 =  false;
}
             
 if (GameActivity.disinhibit < GameActivity.disinhibit

) 
 {        fNjal = false;
}
 else if 
 ( GameActivity.latewhile != null) 
 {        GameActivity.latewhile = "";
} 
 else 
 {        GameActivity.patin = "";
}
                      GameActivity.patin = "";
}
}
 else if 
 ( ezWZ3 
) 
 {        if ( fNjal 
) {
                    if ( GameActivity.latewhile == null
) {
                    GameActivity.patin = "lifeleaf" ;

                     ++GameActivity.disinhibit;

                      GameActivity.disinhibit = 10;

}

            } else {
                    fNjal = true;
}



} 
 else 
 {
 if ( GameActivity.patin .equals("Provencal") ) 
 {        ezWZ3 = true;
}
 else if 
 (GameActivity.disinhibit != GameActivity.disinhibit
) 
 {        fNjal = false;
} 
 else 
 {        ezWZ3 = ! false;
}}} 
 else 
 {        if ( GameActivity.latewhile != null) {
            
 if ( ezWZ3 
) 
 {
 if ( GameActivity.patin != null) 
 {        --GameActivity.disinhibit;
}
 else if 
 ( GameActivity.latewhile != null) 
 {        ezWZ3 = true;
} 
 else 
 {        GameActivity.disinhibit = 4;

}}
 else if 
 (! GameActivity.rigmarole 
) 
 {        GameActivity.latewhile = "dicksonia" ;
} 
 else 
 {        ezWZ3 = true;
}
            } else {
            
 if (! ezWZ3 
) 
 {        GameActivity.patin = "oedipal" ;
}
 else if 
 (0 > GameActivity.disinhibit
) 
 {        GameActivity.patin = "";
} 
 else 
 {        ezWZ3 = true;
}}



}
         
    }

     
    public  void disyllabified(boolean qTt00, boolean EtTJo, int TrMVd, int jcD94) {
                if ( GameActivity.latewhile == null
) {
                    if (6 > GameActivity.disinhibit
) {
            
 if ( GameActivity.latewhile == null
) 
 {        if ( GameActivity.latewhile != null) {
                    if ( EtTJo 
) {
                    if (TrMVd <= jcD94

) {
                    qTt00 = false;

                     EtTJo = true;

                      TrMVd++;
}

            } else {
                    GameActivity.intramurally = ! false;
}




             
 if ( GameActivity.patin == null
) 
 {        GameActivity.patin = "bombilated" ;
}
 else if 
 (GameActivity.disinhibit > jcD94
) 
 {        ++jcD94;
} 
 else 
 {        GameActivity.latewhile = "Stilophora" ;
}
                      ++TrMVd;
}
}
 else if 
 ( GameActivity.patin != null) 
 {        if (0 == jcD94
) {
            
 if ( GameActivity.latewhile == null
) 
 {        GameActivity.hoverport = false;
}
 else if 
 (TrMVd <= 2

) 
 {        TrMVd = 9;

} 
 else 
 {        GameActivity.latewhile = "syndicateer" ;
}
                     ++jcD94;

                      GameActivity.pyralidae = true;
}
} 
 else 
 {        if ( qTt00 
) {
                    jcD94 = 9;


                     EtTJo = false;

                      EtTJo = true;
}
}
            } else {
            
 if (TrMVd != 7

) 
 {        qTt00 = true;
}
 else if 
 ( qTt00 
) 
 {        if ( GameActivity.latewhile .contains("fortifys") ) {
                    TrMVd = 11;


            } else {
                    TrMVd = 5;

}



} 
 else 
 {        qTt00 = true;
}}




             
 if ( EtTJo 
) 
 {        if (TrMVd == 14

) {
                    if ( GameActivity.patin .contains("recommunicate") ) {
                    if ( GameActivity.patin == null
) {
                    GameActivity.patin = "salvagers" ;

            } else {
                    EtTJo = ! false;
}




            } else {
                    --jcD94;
}




            } else {
                    if ( GameActivity.latewhile .contains("primosity") ) {
                    GameActivity.latewhile = "";

            } else {
                    GameActivity.latewhile = "nonroutines" .trim();
}



}



}
 else if 
 (GameActivity.disinhibit <= TrMVd

) 
 {        if (jcD94 != jcD94

) {
            
 if ( GameActivity.patin != null) 
 {        GameActivity.patin = "Niagaran" ;
}
 else if 
 ( GameActivity.patin == null
) 
 {        jcD94--;
} 
 else 
 {        TrMVd++;
}
            } else {
                    qTt00 =  true;
}



} 
 else 
 {        if (5 < GameActivity.disinhibit
) {
                    GameActivity.patin = "Savona" ;

            } else {
                    jcD94--;
}



}
                      if ( qTt00 
) {
                    if ( GameActivity.patin == null
) {
                    if (jcD94 != 12

) {
                    EtTJo = ! true;

            } else {
                    --TrMVd;
}




                     jcD94 = 13;


                      GameActivity.patin = "";
}

                     if ( GameActivity.latewhile .contains("cavings") ) {
                    GameActivity.latewhile = "";

                     GameActivity.latewhile = "";

                      GameActivity.latewhile = "";
}

                      GameActivity.latewhile = "cozenages" ;
}
}

         
    }

     
    public  void braininess(String Q3lLZ) {
                if (GameActivity.disinhibit == 5

) {
                    --GameActivity.disinhibit;

             
 if (6 <= GameActivity.disinhibit
) 
 {        if (1 != GameActivity.disinhibit
) {
            
 if ( GameActivity.rigmarole 
) 
 {
 if ( GameActivity.latewhile == null
) 
 {        GameActivity.pyralidae =  true;
}
 else if 
 ( Q3lLZ .isEmpty() ) 
 {        GameActivity.disinhibit = 0;

} 
 else 
 {        GameActivity.patin = "";
}}
 else if 
 (0 < GameActivity.disinhibit
) 
 {        GameActivity.disinhibit = 8;
} 
 else 
 {        Q3lLZ = "";
}
                     if (GameActivity.disinhibit > GameActivity.disinhibit

) {
                    GameActivity.rigmarole = false;

            } else {
                    GameActivity.rigmarole = false;
}




                      Q3lLZ = "";
}
}
 else if 
 ( GameActivity.intramurally 
) 
 {        if (GameActivity.disinhibit <= 9

) {
            
 if ( Q3lLZ == null
) 
 {        GameActivity.disinhibit = 14;
}
 else if 
 ( Q3lLZ == null
) 
 {        Q3lLZ = "Welcomed" ;
} 
 else 
 {        Q3lLZ = "";
}
            } else {
                    ++GameActivity.disinhibit;
}



} 
 else 
 {        if ( Q3lLZ != null) {
                    GameActivity.disinhibit = 3;


                     --GameActivity.disinhibit;

                      Q3lLZ = "";
}
}
              
 if ( GameActivity.patin .equals("melanogrammus") ) 
 {
 if ( GameActivity.pyralidae 
) 
 {        if (GameActivity.disinhibit == GameActivity.disinhibit

) {
                    GameActivity.disinhibit = 9;

                     --GameActivity.disinhibit;

                      GameActivity.latewhile = "";
}
}
 else if 
 ( Q3lLZ == null
) 
 {        GameActivity.latewhile = "";
} 
 else 
 {        GameActivity.hoverport = false;
}}
 else if 
 (8 > GameActivity.disinhibit
) 
 {        if ( Q3lLZ .equals(GameActivity.patin) ) {
                    GameActivity.disinhibit = 13;

                     GameActivity.latewhile = "";

                      GameActivity.disinhibit -= 13;

}
} 
 else 
 {        ++GameActivity.disinhibit;
}}
        if ( Q3lLZ == null
) {
                    if ( GameActivity.latewhile == null
) {
                    if (GameActivity.disinhibit < 0

) {
                    if (GameActivity.disinhibit < GameActivity.disinhibit

) {
                    if ( GameActivity.patin == null
) {
            
 if ( Q3lLZ != null) 
 {        GameActivity.disinhibit = 7;
}
 else if 
 ( GameActivity.patin != null) 
 {        GameActivity.patin = "";
} 
 else 
 {        GameActivity.pyralidae = true;
}
                     GameActivity.patin = "";

                      GameActivity.rigmarole = true;
}

            } else {
            
 if ( Q3lLZ == null
) 
 {        GameActivity.disinhibit = 8;

}
 else if 
 ( GameActivity.hoverport 
) 
 {        Q3lLZ = "debridement" ;
} 
 else 
 {        GameActivity.hoverport =  true;
}}




            } else {
                    if ( GameActivity.patin != null) {
            
 if (! GameActivity.rigmarole 
) 
 {        GameActivity.intramurally = false;
}
 else if 
 ( GameActivity.patin .isEmpty() ) 
 {        GameActivity.disinhibit = 9;
} 
 else 
 {        GameActivity.disinhibit = 11;
}
                     Q3lLZ = "";

                      GameActivity.disinhibit = 5;

}
}




            } else {
                    if (GameActivity.disinhibit > 11

) {
                    if (3 <= GameActivity.disinhibit
) {
                    if ( GameActivity.hoverport 
) {
                    GameActivity.rigmarole = false;

                     GameActivity.hoverport = ! true;

                      GameActivity.rigmarole = true;
}

            } else {
                    GameActivity.rigmarole =  false;
}




            } else {
            
 if ( Q3lLZ .contains(Q3lLZ) ) 
 {        GameActivity.hoverport =  false;
}
 else if 
 (! GameActivity.hoverport 
) 
 {        Q3lLZ = "conducted" ;
} 
 else 
 {        ++GameActivity.disinhibit;
}}



}




            } else {
                    if (8 <= GameActivity.disinhibit
) {
            
 if ( Q3lLZ == null
) 
 {        Q3lLZ = "cranioclasm" ;
}
 else if 
 ( Q3lLZ != null) 
 {
 if ( Q3lLZ == null
) 
 {        GameActivity.pyralidae =  true;
}
 else if 
 ( GameActivity.pyralidae 
) 
 {        GameActivity.disinhibit++;
} 
 else 
 {        GameActivity.pyralidae = false;
}} 
 else 
 {        GameActivity.intramurally = true;
}
                     GameActivity.rigmarole = false;

                      if (! GameActivity.intramurally 
) {
                    GameActivity.disinhibit = 12;

                     Q3lLZ = "";

                      Q3lLZ = "";
}
}
}



        if (GameActivity.disinhibit > GameActivity.disinhibit
) {
                    GameActivity.disinhibit = 10;

             
 if ( Q3lLZ .contains("florier") ) 
 {
 if ( GameActivity.hoverport 
) 
 {
 if ( Q3lLZ == null
) 
 {        if ( GameActivity.patin == null
) {
                    GameActivity.rigmarole = true;

            } else {
                    GameActivity.latewhile = "gymnasial" ;
}



}
 else if 
 (GameActivity.disinhibit < 4

) 
 {        GameActivity.disinhibit = 14;
} 
 else 
 {        GameActivity.disinhibit = 8;
}}
 else if 
 (GameActivity.disinhibit < GameActivity.disinhibit
) 
 {        if (14 <= GameActivity.disinhibit
) {
                    Q3lLZ = "";

            } else {
                    GameActivity.pyralidae = false;
}



} 
 else 
 {        GameActivity.pyralidae = true;
}}
 else if 
 (GameActivity.disinhibit == GameActivity.disinhibit
) 
 {
 if ( GameActivity.latewhile .isEmpty() ) 
 {        if ( Q3lLZ == null
) {
                    GameActivity.disinhibit = 9;


            } else {
                    GameActivity.hoverport = false;
}



}
 else if 
 (! GameActivity.patin .equals(Q3lLZ) ) 
 {        GameActivity.latewhile = "";
} 
 else 
 {        GameActivity.disinhibit++;
}} 
 else 
 {        if (GameActivity.disinhibit > GameActivity.disinhibit

) {
                    GameActivity.intramurally =  true;

            } else {
                    GameActivity.rigmarole = false;
}



}
                      if (! GameActivity.intramurally 
) {
                    if ( GameActivity.latewhile == null
) {
                    if ( Q3lLZ != null) {
                    GameActivity.hoverport = true;

            } else {
                    GameActivity.hoverport = false;
}




            } else {
                    GameActivity.hoverport = false;
}




                     if ( GameActivity.patin != null) {
                    GameActivity.hoverport =  true;

            } else {
                    GameActivity.hoverport =  true;
}




                      Q3lLZ = "deinotheriums" ;
}
}

         
    }

     
    public  void outwrestling(int fGPzU, boolean UO4Jw, String y17PN, String GKzFN) {
        
 if ( GKzFN .isEmpty() ) 
 {        if (! GameActivity.hoverport 
) {
                    if (! UO4Jw 
) {
                    if (! UO4Jw 
) {
                    if ( GKzFN != null) {
                    GameActivity.latewhile = "";

                     UO4Jw = false;

                      GameActivity.latewhile = "";
}

            } else {
                    if ( GKzFN .trim().contains("gonocyte") ) {
                    UO4Jw = false;

                     --fGPzU;

                      GameActivity.rigmarole = ! false;
}
}




             
 if ( GKzFN .equals(GKzFN) ) 
 {        if ( GKzFN .equals(GameActivity.patin) ) {
                    UO4Jw = true;

            } else {
                    fGPzU = 6;
}



}
 else if 
 (fGPzU <= fGPzU

) 
 {        UO4Jw = false;
} 
 else 
 {        GameActivity.disinhibit = 14;
}
                      if ( GameActivity.latewhile != null) {
                    UO4Jw = true;

            } else {
                    fGPzU--;
}



}

            } else {
            
 if ( GKzFN != null) 
 {        if (GameActivity.disinhibit != fGPzU

) {
                    if ( y17PN != null) {
                    --fGPzU;

                     ++fGPzU;

                      GKzFN = "cachimailla" ;
}

            } else {
                    UO4Jw = false;
}



}
 else if 
 (fGPzU != GameActivity.disinhibit

) 
 {        if (fGPzU == fGPzU

) {
                    ++fGPzU;

                     GameActivity.intramurally = true;

                      y17PN = "osphyomelitis" ;
}
} 
 else 
 {        y17PN = "";
}}



}
 else if 
 (GameActivity.disinhibit <= 1

) 
 {        if ( GKzFN != null) {
                    GKzFN = "";

                     GameActivity.intramurally = true;

              
 if ( GKzFN .equals(GameActivity.latewhile) ) 
 {        GameActivity.disinhibit = 1;
}
 else if 
 (! GKzFN .isEmpty() ) 
 {        GameActivity.disinhibit += 7;

} 
 else 
 {        GKzFN = "shorted" ;
}}
} 
 else 
 {
 if (GameActivity.disinhibit != 12

) 
 {        if (GameActivity.disinhibit <= 10

) {
            
 if ( UO4Jw 
) 
 {        y17PN = "";
}
 else if 
 ( y17PN != null) 
 {        GKzFN = "";
} 
 else 
 {        GameActivity.hoverport = false;
}
            } else {
                    GameActivity.rigmarole = false;
}



}
 else if 
 (13 < fGPzU
) 
 {
 if (fGPzU > fGPzU

) 
 {        GameActivity.patin = "oscule" ;
}
 else if 
 ( UO4Jw 
) 
 {        ++fGPzU;
} 
 else 
 {        GameActivity.intramurally =  true;
}} 
 else 
 {        y17PN = "integrabilities" ;
}}        if (fGPzU == GameActivity.disinhibit
) {
            
 if (fGPzU == fGPzU

) 
 {        if ( GameActivity.patin != null) {
            
 if (fGPzU < 6

) 
 {        if ( GKzFN == null
) {
            
 if ( GameActivity.latewhile == null
) 
 {        y17PN = "pyrolyzer" ;
}
 else if 
 ( UO4Jw 
) 
 {        GameActivity.intramurally = true;
} 
 else 
 {        GameActivity.hoverport = true;
}
                     y17PN = "";

                      GameActivity.pyralidae = false;
}
}
 else if 
 (13 <= fGPzU
) 
 {
 if (GameActivity.disinhibit > 4

) 
 {        GameActivity.rigmarole = ! true;
}
 else if 
 (! GameActivity.hoverport 
) 
 {        y17PN = "psychrophiles" ;
} 
 else 
 {        UO4Jw = true;
}} 
 else 
 {        fGPzU = 4;

}
            } else {
                    if (fGPzU <= 2

) {
                    if ( GameActivity.rigmarole 
) {
                    y17PN = "";

            } else {
                    UO4Jw = true;
}




            } else {
                    ++fGPzU;
}



}



}
 else if 
 ( y17PN .toUpperCase().equals(GKzFN) ) 
 {        if ( GKzFN == null
) {
                    if ( GameActivity.patin == null
) {
            
 if ( GKzFN != null) 
 {        y17PN = "metallurgist" ;
}
 else if 
 (fGPzU == fGPzU

) 
 {        UO4Jw =  true;
} 
 else 
 {        UO4Jw = false;
}
            } else {
                    GameActivity.hoverport = true;
}




            } else {
            
 if (GameActivity.disinhibit > 1

) 
 {        GKzFN = "";
}
 else if 
 (! GameActivity.intramurally 
) 
 {        fGPzU--;
} 
 else 
 {        fGPzU = 13;
}}



} 
 else 
 {
 if ( y17PN == null
) 
 {
 if ( UO4Jw 
) 
 {        fGPzU = 3;

}
 else if 
 ( y17PN == null
) 
 {        GKzFN = "Hassett" ;
} 
 else 
 {        --fGPzU;
}}
 else if 
 ( GKzFN != null) 
 {        ++fGPzU;
} 
 else 
 {        GKzFN = "";
}}
                     if ( GameActivity.latewhile .isEmpty() ) {
            
 if (fGPzU <= fGPzU
) 
 {
 if ( y17PN != null) 
 {        GKzFN = "";
}
 else if 
 ( GKzFN != null) 
 {        UO4Jw =  true;
} 
 else 
 {        GKzFN = "";
}}
 else if 
 ( GKzFN == null
) 
 {        if ( GKzFN != null) {
                    UO4Jw =  true;

            } else {
                    GKzFN = "";
}



} 
 else 
 {        --fGPzU;
}
                     if (GameActivity.disinhibit > fGPzU
) {
                    --fGPzU;

            } else {
                    GKzFN = "";
}




                      if ( GameActivity.hoverport 
) {
                    ++fGPzU;

                     GameActivity.rigmarole =  true;

                      GameActivity.intramurally = false;
}
}

                      if ( GameActivity.latewhile != null) {
                    if (GameActivity.disinhibit <= fGPzU

) {
            
 if ( GKzFN .equals(GKzFN) ) 
 {        fGPzU++;
}
 else if 
 (fGPzU < GameActivity.disinhibit
) 
 {        y17PN = "";
} 
 else 
 {        UO4Jw = false;
}
            } else {
                    GKzFN = "unbelief" .intern();
}




                     if (fGPzU != fGPzU
) {
                    GameActivity.disinhibit = 5;


                     y17PN = "demonomania" ;

                      UO4Jw = false;
}

                      GameActivity.disinhibit++;
}
}
        GameActivity.disinhibit = 10;

         
    }

     
    public  void sportsmanlike(boolean YnBvb, boolean OzLor) {
                GameActivity.hoverport = true;
        if (! GameActivity.rigmarole 
) {
                    if ( GameActivity.patin == null
) {
            
 if (GameActivity.disinhibit == GameActivity.disinhibit
) 
 {        if (10 < GameActivity.disinhibit
) {
                    if ( OzLor 
) {
                    if ( GameActivity.patin != null) {
                    YnBvb = false;

                     GameActivity.pyralidae =  true;

                      GameActivity.patin = "";
}

            } else {
                    OzLor = false;
}




            } else {
            
 if ( GameActivity.latewhile .equals("endomorphs") ) 
 {        GameActivity.patin = "";
}
 else if 
 (GameActivity.disinhibit > GameActivity.disinhibit

) 
 {        GameActivity.patin = "";
} 
 else 
 {        GameActivity.latewhile = "anoplotheroid" ;
}}



}
 else if 
 ( GameActivity.patin != null) 
 {
 if (GameActivity.disinhibit <= GameActivity.disinhibit

) 
 {        if (GameActivity.disinhibit > 14

) {
                    YnBvb = true;

                     GameActivity.disinhibit = 1;

                      GameActivity.latewhile = "satirizing" ;
}
}
 else if 
 ( YnBvb 
) 
 {        OzLor = true;
} 
 else 
 {        GameActivity.disinhibit = 12;
}} 
 else 
 {        if ( YnBvb 
) {
                    GameActivity.patin = "";

            } else {
                    GameActivity.latewhile = "retrocopulant" ;
}



}
             
 if ( OzLor 
) 
 {
 if ( GameActivity.patin .contains("photomurals") ) 
 {
 if (7 == GameActivity.disinhibit
) 
 {        GameActivity.latewhile = "";
}
 else if 
 ( GameActivity.latewhile != null) 
 {        GameActivity.latewhile = "cyproterones" ;
} 
 else 
 {        GameActivity.disinhibit = 7;

}}
 else if 
 ( GameActivity.patin .isEmpty() ) 
 {        GameActivity.patin = "";
} 
 else 
 {        GameActivity.patin = "";
}}
 else if 
 (! OzLor 
) 
 {
 if ( GameActivity.latewhile != null) 
 {        GameActivity.latewhile = "pooftah" ;
}
 else if 
 ( GameActivity.patin .equals("Blairites") ) 
 {        GameActivity.latewhile = "";
} 
 else 
 {        GameActivity.latewhile = "heptace" ;
}} 
 else 
 {        GameActivity.disinhibit--;
}
                      if (! YnBvb 
) {
            
 if (GameActivity.disinhibit > GameActivity.disinhibit
) 
 {        GameActivity.disinhibit = 0;
}
 else if 
 (! GameActivity.patin .toUpperCase().contains("undesignated") ) 
 {        GameActivity.rigmarole = false;
} 
 else 
 {        GameActivity.latewhile = "recalibration" ;
}
            } else {
                    GameActivity.intramurally = ! false;
}



}

            } else {
            
 if ( GameActivity.patin != null) 
 {        if ( GameActivity.latewhile == null
) {
                    YnBvb = false;

             
 if (GameActivity.disinhibit <= GameActivity.disinhibit

) 
 {        GameActivity.disinhibit = 3;

}
 else if 
 (GameActivity.disinhibit > GameActivity.disinhibit
) 
 {        GameActivity.latewhile = "priorate" ;
} 
 else 
 {        YnBvb = false;
}
                      GameActivity.disinhibit--;
}
}
 else if 
 ( GameActivity.latewhile == null
) 
 {        if (9 <= GameActivity.disinhibit
) {
                    if (GameActivity.disinhibit <= GameActivity.disinhibit
) {
                    YnBvb =  true;

            } else {
                    GameActivity.disinhibit += 0;

}




                     YnBvb = false;

                      GameActivity.latewhile = "";
}
} 
 else 
 {        if (GameActivity.disinhibit > GameActivity.disinhibit

) {
                    GameActivity.patin = "";

                     OzLor =  false;

                      GameActivity.latewhile = "";
}
}}



        if ( GameActivity.patin == null
) {
                    if (GameActivity.disinhibit != GameActivity.disinhibit

) {
            
 if (GameActivity.disinhibit > GameActivity.disinhibit

) 
 {
 if ( GameActivity.patin == null
) 
 {
 if (GameActivity.disinhibit != GameActivity.disinhibit

) 
 {        if ( GameActivity.latewhile != null) {
                    GameActivity.latewhile = "preactiveness" ;

                     GameActivity.latewhile = "";

                      GameActivity.patin = "goburra" ;
}
}
 else if 
 ( GameActivity.patin == null
) 
 {        --GameActivity.disinhibit;
} 
 else 
 {        GameActivity.latewhile = "unprolific" ;
}}
 else if 
 (GameActivity.disinhibit < GameActivity.disinhibit

) 
 {        if ( GameActivity.latewhile != null) {
                    ++GameActivity.disinhibit;

            } else {
                    GameActivity.disinhibit--;
}



} 
 else 
 {        OzLor = false;
}}
 else if 
 ( GameActivity.patin != null) 
 {
 if ( GameActivity.patin == null
) 
 {        if (GameActivity.disinhibit > 3

) {
                    GameActivity.disinhibit = 4;


            } else {
                    YnBvb = false;
}



}
 else if 
 (GameActivity.disinhibit < 0

) 
 {        GameActivity.rigmarole =  true;
} 
 else 
 {        GameActivity.patin = "droller" ;
}} 
 else 
 {        if (GameActivity.disinhibit < GameActivity.disinhibit
) {
                    GameActivity.latewhile = "coempts" .intern();

                     GameActivity.patin = "unincreasing" ;

                      GameActivity.latewhile = "";
}
}
            } else {
            
 if ( GameActivity.patin != null) 
 {        if (GameActivity.disinhibit > GameActivity.disinhibit
) {
                    if ( OzLor 
) {
                    ++GameActivity.disinhibit;

                     GameActivity.disinhibit -= 7;


                      GameActivity.rigmarole = true;
}

                     GameActivity.latewhile = "reaked" ;

                      OzLor = false;
}
}
 else if 
 (GameActivity.disinhibit <= 5

) 
 {        if ( GameActivity.patin .contains("palaeobotanically") ) {
                    GameActivity.disinhibit--;

            } else {
                    ++GameActivity.disinhibit;
}



} 
 else 
 {        OzLor =  true;
}}




            } else {
                    if (5 <= GameActivity.disinhibit
) {
                    if (2 > GameActivity.disinhibit
) {
                    if ( GameActivity.patin != null) {
                    if ( GameActivity.latewhile == null
) {
                    GameActivity.disinhibit = 3;


            } else {
                    YnBvb = false;
}




                     YnBvb =  false;

                      YnBvb = true;
}

             
 if ( YnBvb 
) 
 {        GameActivity.disinhibit -= 4;

}
 else if 
 (GameActivity.disinhibit != 8

) 
 {        YnBvb = true;
} 
 else 
 {        GameActivity.disinhibit = 4;

}
                      GameActivity.disinhibit--;
}

            } else {
            
 if (! GameActivity.patin .isEmpty() ) 
 {        if ( YnBvb 
) {
                    GameActivity.latewhile = "";

                     YnBvb = true;

                      GameActivity.patin = "parvenu" ;
}
}
 else if 
 ( GameActivity.patin .contains(GameActivity.patin) ) 
 {        GameActivity.disinhibit = 14;
} 
 else 
 {        YnBvb = false;
}}



}



        if ( GameActivity.patin != null) {
                    if (3 <= GameActivity.disinhibit
) {
                    GameActivity.pyralidae = false;

            } else {
                    if ( GameActivity.latewhile .equals("postfertilizations") ) {
            
 if (! GameActivity.patin .isEmpty() ) 
 {
 if ( GameActivity.latewhile .equals(GameActivity.latewhile) ) 
 {        YnBvb = true;
}
 else if 
 ( GameActivity.patin .isEmpty() ) 
 {        GameActivity.latewhile = "azobacter" ;
} 
 else 
 {        GameActivity.disinhibit--;
}}
 else if 
 (! OzLor 
) 
 {        GameActivity.disinhibit = 10;

} 
 else 
 {        OzLor =  true;
}
                     if ( GameActivity.latewhile != null) {
                    GameActivity.patin = "Rickart" ;

            } else {
                    GameActivity.patin = "";
}




                      GameActivity.patin = "plastotype" ;
}
}




                     if (GameActivity.disinhibit > GameActivity.disinhibit
) {
            
 if ( GameActivity.patin != null) 
 {
 if ( GameActivity.patin .contains("costectomies") ) 
 {
 if ( GameActivity.patin != null) 
 {        GameActivity.rigmarole =  true;
}
 else if 
 (12 == GameActivity.disinhibit
) 
 {        GameActivity.disinhibit = 13;

} 
 else 
 {        GameActivity.hoverport = true;
}}
 else if 
 ( GameActivity.patin == null
) 
 {        --GameActivity.disinhibit;
} 
 else 
 {        GameActivity.disinhibit = 8;
}}
 else if 
 (GameActivity.disinhibit <= GameActivity.disinhibit
) 
 {        if ( GameActivity.patin != null) {
                    GameActivity.disinhibit++;

                     YnBvb = true;

                      GameActivity.disinhibit = 1;
}
} 
 else 
 {        GameActivity.latewhile = "retag" ;
}
            } else {
                    if ( GameActivity.latewhile == null
) {
                    if ( GameActivity.latewhile .contains(GameActivity.patin) ) {
                    OzLor = true;

            } else {
                    GameActivity.disinhibit += 13;

}




            } else {
                    GameActivity.patin = "";
}



}




                      if ( GameActivity.rigmarole 
) {
            
 if ( GameActivity.patin == null
) 
 {        GameActivity.latewhile = "renforces" ;
}
 else if 
 ( GameActivity.patin != null) 
 {        GameActivity.disinhibit = 4;
} 
 else 
 {        GameActivity.pyralidae = ! true;
}
            } else {
            
 if ( GameActivity.hoverport 
) 
 {        OzLor = ! true;
}
 else if 
 ( GameActivity.latewhile == null
) 
 {        OzLor =  false;
} 
 else 
 {        YnBvb = false;
}}



}
        if (GameActivity.disinhibit <= GameActivity.disinhibit

) {
                    if (9 != GameActivity.disinhibit
) {
                    if ( GameActivity.patin == null
) {
            
 if ( GameActivity.latewhile != null) 
 {
 if ( GameActivity.latewhile != null) 
 {        if ( GameActivity.patin != null) {
                    OzLor = true;

                     GameActivity.patin = "zydecos" ;

                      GameActivity.latewhile = "Shawna" ;
}
}
 else if 
 (! GameActivity.latewhile .equals("disarticulations") ) 
 {        YnBvb =  false;
} 
 else 
 {        --GameActivity.disinhibit;
}}
 else if 
 ( OzLor 
) 
 {        if ( GameActivity.rigmarole 
) {
                    OzLor = true;

                     YnBvb =  false;

                      YnBvb =  true;
}
} 
 else 
 {        GameActivity.patin = "homologoumena" ;
}
            } else {
                    GameActivity.latewhile = "pannicular" ;
}




                     if (GameActivity.disinhibit != GameActivity.disinhibit
) {
            
 if ( GameActivity.latewhile != null) 
 {        if (! GameActivity.patin .contains(GameActivity.latewhile) ) {
                    GameActivity.latewhile = "amyluria" ;

            } else {
                    GameActivity.disinhibit--;
}



}
 else if 
 ( GameActivity.rigmarole 
) 
 {        GameActivity.disinhibit += 4;

} 
 else 
 {        GameActivity.patin = "";
}
            } else {
                    if (! GameActivity.latewhile .isEmpty() ) {
                    YnBvb = true;

                     YnBvb = true;

                      GameActivity.patin = "Rotarianism" ;
}
}




              
 if ( GameActivity.patin != null) 
 {        if (GameActivity.disinhibit <= 12

) {
                    GameActivity.latewhile = "";

                     GameActivity.patin = "unoffendingly" ;

                      GameActivity.disinhibit--;
}
}
 else if 
 (! GameActivity.patin .contains("forebless") ) 
 {        GameActivity.disinhibit--;
} 
 else 
 {        GameActivity.patin = "";
}}

            } else {
            
 if (GameActivity.disinhibit == 12

) 
 {
 if (GameActivity.disinhibit != GameActivity.disinhibit
) 
 {        if ( GameActivity.patin .equals("confirming") ) {
                    if (3 > GameActivity.disinhibit
) {
                    YnBvb = false;

                     GameActivity.latewhile = "";

                      GameActivity.rigmarole =  true;
}

            } else {
                    GameActivity.disinhibit = 7;

}



}
 else if 
 (GameActivity.disinhibit <= GameActivity.disinhibit

) 
 {        if ( GameActivity.latewhile != null) {
                    GameActivity.disinhibit = 9;


            } else {
                    YnBvb = false;
}



} 
 else 
 {        GameActivity.patin = "territorialisms" ;
}}
 else if 
 (! GameActivity.rigmarole 
) 
 {
 if (! GameActivity.patin .contains("linishers") ) 
 {
 if ( GameActivity.latewhile .contains("hypopharyngoscopy") ) 
 {        GameActivity.disinhibit = 0;

}
 else if 
 ( GameActivity.latewhile .equals("conduce") ) 
 {        GameActivity.hoverport =  false;
} 
 else 
 {        ++GameActivity.disinhibit;
}}
 else if 
 (GameActivity.disinhibit < GameActivity.disinhibit

) 
 {        GameActivity.latewhile = "";
} 
 else 
 {        --GameActivity.disinhibit;
}} 
 else 
 {        if (GameActivity.disinhibit != GameActivity.disinhibit
) {
                    GameActivity.patin = "serigraphs" ;

            } else {
                    GameActivity.disinhibit = 4;
}



}}



        GameActivity.patin = "";

         
    }

     
    public  void vicennial(int qmF3Z, boolean LSEO8, int j6cPN, int CxNMg) {
                if (qmF3Z <= j6cPN

) {
            
 if (j6cPN == j6cPN
) 
 {        if (3 < qmF3Z
) {
                    if (1 > qmF3Z
) {
                    if (14 > CxNMg
) {
                    if ( GameActivity.latewhile != null) {
                    qmF3Z = 10;

            } else {
                    GameActivity.intramurally = false;
}




            } else {
                    LSEO8 = false;
}




            } else {
                    qmF3Z--;
}




            } else {
                    if (j6cPN == 12

) {
            
 if (qmF3Z <= 5

) 
 {        GameActivity.patin = "licentiateship" ;
}
 else if 
 (qmF3Z < qmF3Z
) 
 {        GameActivity.latewhile = "allegoricalnesses" ;
} 
 else 
 {        GameActivity.pyralidae = false;
}
                     GameActivity.pyralidae =  false;

                      LSEO8 = true;
}
}



}
 else if 
 ( GameActivity.patin != null) 
 {        if ( GameActivity.patin == null
) {
            
 if (CxNMg != GameActivity.disinhibit
) 
 {        if ( GameActivity.patin == null
) {
                    j6cPN = 6;


                     GameActivity.latewhile = "";

                      GameActivity.patin = "instaurations" ;
}
}
 else if 
 (qmF3Z < 6

) 
 {        CxNMg = 3;

} 
 else 
 {        j6cPN = 2;
}
            } else {
                    if (j6cPN <= CxNMg

) {
                    --qmF3Z;

                     GameActivity.patin = "";

                      LSEO8 = false;
}
}



} 
 else 
 {
 if (GameActivity.disinhibit <= j6cPN

) 
 {        if ( GameActivity.latewhile == null
) {
                    ++qmF3Z;

                     GameActivity.latewhile = "";

                      GameActivity.latewhile = "";
}
}
 else if 
 (! GameActivity.latewhile .contains("aminogen") ) 
 {        LSEO8 = true;
} 
 else 
 {        GameActivity.patin = "Oannes" ;
}}
            } else {
                    if ( LSEO8 
) {
            
 if ( GameActivity.patin != null) 
 {
 if (! LSEO8 
) 
 {        if ( GameActivity.latewhile == null
) {
                    LSEO8 = false;

            } else {
                    GameActivity.patin = "";
}



}
 else if 
 ( GameActivity.latewhile == null
) 
 {        CxNMg = 4;
} 
 else 
 {        GameActivity.patin = "sostenente" ;
}}
 else if 
 ( GameActivity.latewhile == null
) 
 {
 if (qmF3Z < CxNMg
) 
 {        GameActivity.disinhibit = 2;

}
 else if 
 ( GameActivity.latewhile == null
) 
 {        LSEO8 = true;
} 
 else 
 {        qmF3Z = 2;
}} 
 else 
 {        CxNMg = 11;

}
                     if ( GameActivity.patin .isEmpty() ) {
            
 if ( GameActivity.latewhile != null) 
 {        ++j6cPN;
}
 else if 
 (14 == qmF3Z
) 
 {        --j6cPN;
} 
 else 
 {        GameActivity.patin = "spectrohelioscope" ;
}
            } else {
                    j6cPN = 7;
}




              
 if (5 <= CxNMg
) 
 {        j6cPN++;
}
 else if 
 ( GameActivity.latewhile == null
) 
 {        GameActivity.latewhile = "";
} 
 else 
 {        j6cPN = 1;

}}
}



        if (j6cPN == j6cPN

) {
                    if ( GameActivity.latewhile == null
) {
                    if ( LSEO8 
) {
            
 if (! GameActivity.patin .contains("antirationally") ) 
 {
 if (CxNMg == qmF3Z
) 
 {        if (CxNMg <= qmF3Z

) {
                    j6cPN--;

            } else {
                    GameActivity.pyralidae =  false;
}



}
 else if 
 (! GameActivity.intramurally 
) 
 {        GameActivity.patin = "";
} 
 else 
 {        GameActivity.patin = "complect" ;
}}
 else if 
 (qmF3Z <= 5

) 
 {        if ( GameActivity.patin == null
) {
                    GameActivity.patin = "";

                     LSEO8 =  true;

                      GameActivity.latewhile = "chagan" ;
}
} 
 else 
 {        GameActivity.latewhile = "zincid" ;
}
                     if (qmF3Z <= j6cPN

) {
            
 if ( GameActivity.latewhile == null
) 
 {        GameActivity.latewhile = "chokingly" ;
}
 else if 
 ( GameActivity.latewhile .isEmpty() ) 
 {        GameActivity.hoverport = false;
} 
 else 
 {        --j6cPN;
}
                     j6cPN -= 8;


                      LSEO8 = true;
}

              
 if (! GameActivity.latewhile .equals("cuirassed") ) 
 {        j6cPN = 9;

}
 else if 
 ( GameActivity.patin == null
) 
 {        GameActivity.patin = "";
} 
 else 
 {        GameActivity.intramurally = false;
}}

                     GameActivity.latewhile = "sestertius" ;

                      if (CxNMg <= CxNMg

) {
                    if (11 > qmF3Z
) {
                    GameActivity.latewhile = "";

                     LSEO8 =  true;

                      CxNMg--;
}

                     GameActivity.hoverport =  true;

                      GameActivity.latewhile = "anglophobia" ;
}
}

             
 if (! LSEO8 
) 
 {        if ( GameActivity.latewhile .equals("beaches") ) {
            
 if (qmF3Z < qmF3Z
) 
 {        if (7 <= qmF3Z
) {
                    LSEO8 = true;

                     CxNMg++;

                      --CxNMg;
}
}
 else if 
 (CxNMg < CxNMg

) 
 {        CxNMg = 1;
} 
 else 
 {        GameActivity.patin = "";
}
                     if ( GameActivity.patin != null) {
                    GameActivity.hoverport =  false;

                     LSEO8 =  false;

                      j6cPN = 14;
}

                      j6cPN = 14;
}
}
 else if 
 ( LSEO8 
) 
 {        if ( GameActivity.patin != null) {
                    if ( GameActivity.patin != null) {
                    GameActivity.pyralidae = false;

            } else {
                    GameActivity.latewhile = "Eglanteen" ;
}




            } else {
                    GameActivity.latewhile = "";
}



} 
 else 
 {
 if ( GameActivity.patin .isEmpty() ) 
 {        ++CxNMg;
}
 else if 
 ( GameActivity.latewhile .equals(GameActivity.latewhile) ) 
 {        CxNMg = 9;
} 
 else 
 {        CxNMg = 10;
}}
              
 if ( GameActivity.latewhile == null
) 
 {
 if ( GameActivity.latewhile != null) 
 {        if ( GameActivity.latewhile .isEmpty() ) {
                    LSEO8 = false;

            } else {
                    GameActivity.patin = "enterocholecystostomy" ;
}



}
 else if 
 ( GameActivity.patin != null) 
 {        LSEO8 = false;
} 
 else 
 {        GameActivity.patin = "toilless" ;
}}
 else if 
 ( GameActivity.patin == null
) 
 {        if (9 != j6cPN
) {
                    ++qmF3Z;

            } else {
                    GameActivity.intramurally = false;
}



} 
 else 
 {        LSEO8 = false;
}}

         
    }

     
    public  void nonsuggestively(boolean qa3Gj, int fWfr9, boolean WbfRF, String xmJcV) {
                if (3 == fWfr9
) {
                    if (fWfr9 == fWfr9
) {
                    GameActivity.latewhile = "";

            } else {
            
 if ( xmJcV != null) 
 {        xmJcV = "unadaptiveness" ;
}
 else if 
 ( qa3Gj 
) 
 {        if ( xmJcV == null
) {
                    GameActivity.patin = "grapplings" ;

            } else {
                    WbfRF = ! false;
}



} 
 else 
 {        ++fWfr9;
}}




            } else {
            
 if (GameActivity.disinhibit <= GameActivity.disinhibit

) 
 {        if (fWfr9 == fWfr9

) {
                    if (fWfr9 < 12

) {
                    if ( xmJcV != null) {
                    fWfr9 = 11;


            } else {
                    WbfRF = true;
}




                     GameActivity.patin = "numismatic" ;

                      xmJcV = "";
}

            } else {
            
 if ( xmJcV == null
) 
 {        GameActivity.latewhile = "";
}
 else if 
 ( WbfRF 
) 
 {        xmJcV = "";
} 
 else 
 {        fWfr9 = 5;
}}



}
 else if 
 (2 <= fWfr9
) 
 {        if ( GameActivity.latewhile != null) {
            
 if (5 <= GameActivity.disinhibit
) 
 {        qa3Gj =  true;
}
 else if 
 (! xmJcV .equals("denticle") ) 
 {        fWfr9 = 9;

} 
 else 
 {        fWfr9++;
}
            } else {
                    qa3Gj = false;
}



} 
 else 
 {
 if ( xmJcV != null) 
 {        WbfRF = false;
}
 else if 
 ( GameActivity.patin != null) 
 {        xmJcV = "";
} 
 else 
 {        xmJcV = "Emydea" ;
}}}



        if ( GameActivity.latewhile == null
) {
            
 if (fWfr9 <= 9

) 
 {        if (fWfr9 != 2

) {
            
 if ( xmJcV == null
) 
 {        if ( GameActivity.patin .toLowerCase().equals(xmJcV) ) {
            
 if ( xmJcV != null) 
 {        ++GameActivity.disinhibit;
}
 else if 
 (fWfr9 <= 2

) 
 {        fWfr9--;
} 
 else 
 {        GameActivity.latewhile = "ravison" ;
}
                     qa3Gj = true;

                      WbfRF = ! false;
}
}
 else if 
 ( GameActivity.intramurally 
) 
 {        if (9 <= fWfr9
) {
                    xmJcV = "";

                     fWfr9++;

                      ++fWfr9;
}
} 
 else 
 {        xmJcV = "unmanful" ;
}
            } else {
                    WbfRF = false;
}



}
 else if 
 (GameActivity.disinhibit != fWfr9

) 
 {        if ( xmJcV == null
) {
            
 if (fWfr9 < fWfr9
) 
 {        if ( xmJcV == null
) {
                    GameActivity.intramurally = true;

            } else {
                    GameActivity.pyralidae =  true;
}



}
 else if 
 ( xmJcV .contains("Lenrow") ) 
 {        --fWfr9;
} 
 else 
 {        GameActivity.intramurally = false;
}
                     if (fWfr9 < 6

) {
                    WbfRF = ! true;

            } else {
                    xmJcV = "";
}




                      fWfr9--;
}
} 
 else 
 {        if ( xmJcV != null) {
            
 if ( xmJcV == null
) 
 {        fWfr9 = 9;
}
 else if 
 (! GameActivity.latewhile .isEmpty() ) 
 {        fWfr9 += 0;
} 
 else 
 {        WbfRF = true;
}
            } else {
                    qa3Gj = false;
}



}
            } else {
                    if (GameActivity.disinhibit == fWfr9
) {
            
 if ( qa3Gj 
) 
 {
 if ( xmJcV == null
) 
 {        if ( GameActivity.latewhile != null) {
                    WbfRF = false;

            } else {
                    WbfRF = false;
}



}
 else if 
 ( xmJcV == null
) 
 {        xmJcV = "";
} 
 else 
 {        xmJcV = "dissertative" ;
}}
 else if 
 (fWfr9 == 0

) 
 {        if (fWfr9 != fWfr9

) {
                    fWfr9 = 3;

            } else {
                    fWfr9 = 4;

}



} 
 else 
 {        fWfr9++;
}
            } else {
            
 if ( GameActivity.latewhile .equals(GameActivity.patin) ) 
 {
 if ( xmJcV != null) 
 {        xmJcV = "Australanthropus" ;
}
 else if 
 ( xmJcV != null) 
 {        xmJcV = "unintroitive" ;
} 
 else 
 {        WbfRF = ! true;
}}
 else if 
 (fWfr9 <= 9

) 
 {        GameActivity.disinhibit = 14;
} 
 else 
 {        GameActivity.latewhile = "conical" ;
}}



}



        if (GameActivity.disinhibit <= 7

) {
                    if (12 != fWfr9
) {
                    if ( xmJcV != null) {
            
 if (fWfr9 > fWfr9

) 
 {
 if (! GameActivity.patin .isEmpty() ) 
 {        GameActivity.latewhile = "dentiroster" ;
}
 else if 
 ( xmJcV == null
) 
 {        fWfr9 = 11;

} 
 else 
 {        xmJcV = "";
}}
 else if 
 ( WbfRF 
) 
 {
 if (14 != fWfr9
) 
 {        fWfr9 -= 7;
}
 else if 
 (! qa3Gj 
) 
 {        fWfr9 = 12;

} 
 else 
 {        fWfr9 -= 11;
}} 
 else 
 {        qa3Gj = true;
}
             
 if (fWfr9 == GameActivity.disinhibit
) 
 {
 if ( GameActivity.patin .isEmpty() ) 
 {        GameActivity.rigmarole =  true;
}
 else if 
 ( xmJcV == null
) 
 {        GameActivity.pyralidae = true;
} 
 else 
 {        xmJcV = "";
}}
 else if 
 (fWfr9 != 10

) 
 {        fWfr9 += 13;

} 
 else 
 {        fWfr9 = 12;
}
                      if ( xmJcV != null) {
                    GameActivity.hoverport = ! true;

                     fWfr9 = 1;

                      xmJcV = "";
}
}

             
 if ( xmJcV != null) 
 {
 if (! GameActivity.latewhile .equals(xmJcV) ) 
 {        if ( GameActivity.latewhile .equals("unmellowed") ) {
                    qa3Gj =  false;

            } else {
                    xmJcV = "burglarious" ;
}



}
 else if 
 ( GameActivity.intramurally 
) 
 {        GameActivity.patin = "reinvigorators" ;
} 
 else 
 {        xmJcV = "elasticity" ;
}}
 else if 
 ( xmJcV != null) 
 {        if (fWfr9 < GameActivity.disinhibit
) {
                    GameActivity.latewhile = "";

            } else {
                    xmJcV = "";
}



} 
 else 
 {        fWfr9 += 0;

}
                      if (fWfr9 == 1

) {
            
 if ( xmJcV == null
) 
 {        GameActivity.latewhile = "";
}
 else if 
 (! xmJcV .contains(xmJcV) ) 
 {        xmJcV = "";
} 
 else 
 {        GameActivity.patin = "";
}
            } else {
                    fWfr9 = 3;

}



}

                     if ( xmJcV .isEmpty() ) {
                    if ( GameActivity.patin .contains("antiholiday") ) {
                    if (fWfr9 == fWfr9
) {
            
 if ( xmJcV != null) 
 {        fWfr9 = 11;
}
 else if 
 (fWfr9 <= 8

) 
 {        xmJcV = "habitancy" ;
} 
 else 
 {        WbfRF = ! true;
}
            } else {
                    fWfr9--;
}




            } else {
                    if ( WbfRF 
) {
                    fWfr9--;

                     xmJcV = "chemopsychiatric" ;

                      GameActivity.latewhile = "";
}
}




            } else {
            
 if (fWfr9 <= 5

) 
 {        if ( xmJcV == null
) {
                    xmJcV = "";

            } else {
                    GameActivity.rigmarole = true;
}



}
 else if 
 ( xmJcV != null) 
 {        qa3Gj = false;
} 
 else 
 {        GameActivity.patin = "";
}}




              
 if (fWfr9 < GameActivity.disinhibit
) 
 {        if ( GameActivity.patin != null) {
                    if ( GameActivity.latewhile == null
) {
                    GameActivity.disinhibit--;

                     WbfRF =  true;

                      fWfr9++;
}

            } else {
                    qa3Gj =  true;
}



}
 else if 
 ( GameActivity.pyralidae 
) 
 {        if (fWfr9 < fWfr9
) {
                    xmJcV = "";

            } else {
                    xmJcV = "";
}



} 
 else 
 {        GameActivity.patin = "";
}}

 if ( GameActivity.latewhile == null
) 
 {        if (GameActivity.disinhibit <= GameActivity.disinhibit

) {
                    if ( xmJcV == null
) {
            
 if ( WbfRF 
) 
 {
 if ( GameActivity.patin != null) 
 {        if (fWfr9 <= fWfr9
) {
                    WbfRF = true;

                     xmJcV = "drogues" ;

                      WbfRF =  true;
}
}
 else if 
 (2 == fWfr9
) 
 {        GameActivity.disinhibit = 13;

} 
 else 
 {        xmJcV = "";
}}
 else if 
 (5 == GameActivity.disinhibit
) 
 {        if ( xmJcV == null
) {
                    qa3Gj = true;

                     fWfr9 = 4;

                      fWfr9 = 0;

}
} 
 else 
 {        fWfr9++;
}
            } else {
                    if (GameActivity.disinhibit == fWfr9

) {
                    if ( xmJcV .contains("dacryagogue") ) {
                    WbfRF =  false;

            } else {
                    fWfr9 = 7;
}




            } else {
                    fWfr9 = 8;
}



}




            } else {
                    xmJcV = "";
}



}
 else if 
 ( xmJcV .isEmpty() ) 
 {        if ( GameActivity.patin .equals(GameActivity.patin) ) {
                    if ( GameActivity.patin != null) {
                    if (! GameActivity.hoverport 
) {
                    if ( xmJcV != null) {
                    xmJcV = "";

                     fWfr9--;

                      qa3Gj =  true;
}

            } else {
                    qa3Gj =  true;
}




                     if ( xmJcV .contains(xmJcV) ) {
                    fWfr9++;

                     GameActivity.pyralidae = true;

                      qa3Gj = true;
}

                      ++GameActivity.disinhibit;
}

            } else {
            
 if ( qa3Gj 
) 
 {        if ( GameActivity.patin .isEmpty() ) {
                    fWfr9++;

                     xmJcV = "Marasar" ;

                      GameActivity.latewhile = "";
}
}
 else if 
 ( GameActivity.latewhile == null
) 
 {        WbfRF = false;
} 
 else 
 {        fWfr9 += 5;

}}



} 
 else 
 {        if ( GameActivity.patin != null) {
                    if ( GameActivity.patin .isEmpty() ) {
                    if ( qa3Gj 
) {
                    fWfr9 = 7;


                     GameActivity.latewhile = "lionization" ;

                      qa3Gj = ! true;
}

            } else {
                    GameActivity.patin = "Dwamishes" ;
}




                     xmJcV = "";

                      xmJcV = "inaugurated" ;
}
}        if (9 == fWfr9
) {
                    if ( GameActivity.pyralidae 
) {
                    if ( GameActivity.latewhile .isEmpty() ) {
            
 if ( xmJcV != null) 
 {
 if ( xmJcV == null
) 
 {        if ( xmJcV != null) {
                    WbfRF = true;

            } else {
                    --GameActivity.disinhibit;
}



}
 else if 
 ( xmJcV == null
) 
 {        GameActivity.patin = "";
} 
 else 
 {        fWfr9++;
}}
 else if 
 ( xmJcV .equals(GameActivity.patin) ) 
 {
 if (GameActivity.disinhibit <= 14

) 
 {        xmJcV = "paleoentomologic" ;
}
 else if 
 (fWfr9 > 9

) 
 {        qa3Gj = true;
} 
 else 
 {        WbfRF = true;
}} 
 else 
 {        qa3Gj = true;
}
                     if ( GameActivity.patin .equals("undulation") ) {
            
 if ( GameActivity.rigmarole 
) 
 {        ++fWfr9;
}
 else if 
 ( xmJcV .contains("uninert") ) 
 {        WbfRF = true;
} 
 else 
 {        fWfr9 = 1;

}
                     xmJcV = "scoria" ;

                      xmJcV = "";
}

                      if ( GameActivity.intramurally 
) {
                    GameActivity.pyralidae = true;

            } else {
                    xmJcV = "counterirritation" ;
}



}

                     if (fWfr9 > fWfr9
) {
                    if ( xmJcV == null
) {
            
 if ( xmJcV != null) 
 {        qa3Gj = false;
}
 else if 
 ( xmJcV == null
) 
 {        xmJcV = "";
} 
 else 
 {        xmJcV = "";
}
                     GameActivity.latewhile = "semibaldness" ;

                      xmJcV = "objectative" ;
}

             
 if ( WbfRF 
) 
 {        qa3Gj = true;
}
 else if 
 (fWfr9 > fWfr9
) 
 {        WbfRF = true;
} 
 else 
 {        qa3Gj = ! false;
}
                      qa3Gj =  false;
}

                      xmJcV = "";
}

                     if ( xmJcV .isEmpty() ) {
                    if ( GameActivity.latewhile != null) {
                    if (! WbfRF 
) {
                    if (5 <= fWfr9
) {
                    WbfRF = false;

            } else {
                    fWfr9 = 11;
}




            } else {
                    xmJcV = "";
}




            } else {
                    if ( qa3Gj 
) {
                    GameActivity.rigmarole = true;

            } else {
                    qa3Gj = ! false;
}



}




            } else {
                    if ( xmJcV == null
) {
                    if ( xmJcV != null) {
                    WbfRF = false;

                     GameActivity.pyralidae = true;

                      WbfRF =  true;
}

                     fWfr9++;

                      qa3Gj = true;
}
}




                      if ( GameActivity.latewhile == null
) {
                    if ( xmJcV .equals("rapscallionly") ) {
                    if (GameActivity.disinhibit != GameActivity.disinhibit

) {
                    xmJcV = "Palomar" ;

            } else {
                    GameActivity.hoverport = true;
}




            } else {
                    qa3Gj = ! true;
}




                     if (fWfr9 != fWfr9
) {
                    GameActivity.latewhile = "";

            } else {
                    xmJcV = "surturbrands" ;
}




                      xmJcV = "improvabilities" ;
}
}
        if ( GameActivity.latewhile .isEmpty() ) {
                    if (GameActivity.disinhibit > fWfr9

) {
                    if (GameActivity.disinhibit == 8

) {
            
 if (fWfr9 < fWfr9

) 
 {        if ( GameActivity.latewhile == null
) {
                    xmJcV = "";

                     GameActivity.disinhibit = 5;


                      fWfr9 += 14;

}
}
 else if 
 (! GameActivity.rigmarole 
) 
 {
 if ( xmJcV == null
) 
 {        fWfr9 = 7;

}
 else if 
 ( GameActivity.patin == null
) 
 {        xmJcV = "gaunching" ;
} 
 else 
 {        fWfr9 = 1;

}} 
 else 
 {        qa3Gj = true;
}
                     if (fWfr9 <= 3

) {
                    if (! xmJcV .isEmpty() ) {
                    xmJcV = "pepperier" ;

                     xmJcV = "premonish" ;

                      GameActivity.disinhibit = 2;

}

                     GameActivity.latewhile = "chromotropic" ;

                      WbfRF = ! true;
}

              
 if ( xmJcV == null
) 
 {        xmJcV = "premillennialisms" ;
}
 else if 
 (! xmJcV .equals(xmJcV) ) 
 {        --fWfr9;
} 
 else 
 {        WbfRF = true;
}}

            } else {
                    if ( GameActivity.latewhile != null) {
            
 if (fWfr9 != fWfr9

) 
 {
 if ( xmJcV .isEmpty() ) 
 {        fWfr9 = 6;
}
 else if 
 ( xmJcV == null
) 
 {        WbfRF = false;
} 
 else 
 {        fWfr9 = 10;
}}
 else if 
 ( GameActivity.patin == null
) 
 {        GameActivity.intramurally = true;
} 
 else 
 {        qa3Gj = false;
}
             
 if (5 <= fWfr9
) 
 {        GameActivity.latewhile = "fulgurant" ;
}
 else if 
 ( xmJcV != null) 
 {        xmJcV = "";
} 
 else 
 {        fWfr9++;
}
                      qa3Gj = true;
}
}




            } else {
                    if (fWfr9 <= fWfr9

) {
                    if (GameActivity.disinhibit < fWfr9
) {
                    if ( WbfRF 
) {
                    if ( xmJcV != null) {
                    ++fWfr9;

                     fWfr9 = 8;

                      GameActivity.disinhibit = 5;

}

                     GameActivity.hoverport = false;

                      GameActivity.pyralidae = true;
}

            } else {
                    if (fWfr9 != 7

) {
                    qa3Gj = false;

                     WbfRF = false;

                      GameActivity.hoverport =  false;
}
}




                     if (fWfr9 > fWfr9

) {
                    xmJcV = "cenation" ;

                     xmJcV = "";

                      fWfr9 = 9;
}

              
 if ( GameActivity.latewhile .equals(GameActivity.patin) ) 
 {        xmJcV = "";
}
 else if 
 (14 <= fWfr9
) 
 {        xmJcV = "zoopathy" ;
} 
 else 
 {        WbfRF = true;
}}
}



        GameActivity.latewhile = "unglowing" ;

         
    }

     }