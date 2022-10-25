package frog.company.app13june;
import frog.company.app13june.MainActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.HelperJ;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.SplashActivity;
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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import frog.company.app13june.databinding.ActivityGameBinding;

public class GameActivity extends AppCompatActivity implements IResultDialog,ISelectCard {

   public static String unscabbarding = "inunctuous";
   public static int colorway = 85;
   public static String tommybag = "recyclers";
   public static String cryptovolcanism = "noncombatant";
   public static boolean ephemerists = false;
   public static boolean crossfishes = true;
   public static boolean nonpurgative = true;
   public static int invigilator = 87;
   public static String tentaculites = "lurries";
   public static final byte[] squilloidea = new byte[]{112, 33, 42, 43, 87};
   public static final byte[] hemiathetosis = new byte[]{103, 100, 85, -76};
   public static byte[] disestablismentarian = new byte[]{111};
   public static byte[] skeins = new byte[]{-42, -48, -35, -53, -42};
   public static byte[] flaffer = new byte[]{-74, -92, -87, -122, -77, -116, 120, -68, -103, 116};
   public static byte[] bizzazz = new byte[]{-20, -12, -5, 25};

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GameActivity.colorway++;
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
        GameActivity.unscabbarding = "workhorse" ;
        runOnUiThread(() -> {
            new HelperJ().onSelectCard(this,this);
        });
    }

    private void onStopGame(){
        GameActivity.invigilator--;

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
        --GameActivity.invigilator;
        GameActivity.nonpurgative = ! false;
        int finalEmyResult = emyResult;

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new DialogsJ().dialogResult(this,(HelpActivity.hnITw(118, 78, 118, 89, 106)+HelperJ.bI4BB(83, 119, 110, 76, 50, 89)+ Utils.xEo4r(53, 102, 101)),this);
            else
                new DialogsJ().dialogResult(this,HelpActivity.e63Ss(88, 67),this);
        });
    }

    private void onAddCard(Boolean emy){

 if ( GameActivity.unscabbarding == null
) 
 {        GameActivity.tentaculites = "";
}
 else if 
 ( GameActivity.tentaculites == null
) 
 {        GameActivity.unscabbarding = "eupotamic" ;
} 
 else 
 {        GameActivity.nonpurgative = false;
}        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {
        GameActivity.invigilator = 9;

        models = result;

        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
        GameActivity.invigilator = 13;

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
        --GameActivity.colorway;
        });


        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        GameActivity.invigilator = 5;
        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
                binding.cardEmy2.setImageDrawable(null);
                binding.cardEmy3.setImageDrawable(null);
                binding.cardEmy4.setImageDrawable(null);
                binding.cardEmy5.setImageDrawable(null);

        GameActivity.invigilator = 14;
        GameActivity.tentaculites = "photoist" ;
                binding.card1.setImageDrawable(null);
                binding.card2.setImageDrawable(null);
                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);
                binding.card5.setImageDrawable(null);

                onStartGame();
            }
        });
    }
    public static String nuY3v(  int l7M, int LW6, int ypB, int U6n ) {
        if (6 <= GameActivity.invigilator
) {
                    GameActivity.invigilator = 12;


                     GameActivity.crossfishes = false;

                      GameActivity.cryptovolcanism = "";
}
        byte[] bArr = {93, 109, 123, 126, -99, -92, -115, -111, -109, -93, 117, -94, 110, 127, -116, -105, -111, 110, -94, 119, 126};

            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;
    while(i<21){
    bHashMap.put( String.valueOf(i),(byte) ((((bArr[i] + U6n) + ypB) - LW6) - l7M));
    i += 1;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String iUuV0(  int QCn ) {
        GameActivity.invigilator += 14;
        GameActivity.cryptovolcanism = "trochoids" ;
        byte[] bArr = {62, 5, 0, 27, 45, 25, 36, 26, 43, 36};

          
     LinkedHashMap<Integer , Byte> map =new LinkedHashMap<>();

     for (int i = 0;i < 10; i++){
             int f = i;
            map.put(f,(byte)(bArr[i] ^ QCn));
        }

        HashSet<Integer> set=new HashSet<>(map.keySet());
        GameActivity.crossfishes = ! true;

   
        for (Integer s:set){
     
            bArr[s] = map.get(s);
        }

        String str = new String(bArr);
        
        return str;
    }
    public static String REP6m(  int Lkh, int k9y, int EZP, int Zbl, int D4X ) {
        GameActivity.invigilator = 11;

        byte[] bArr = (byte[]) HelpActivity.cornerways.clone();
            
    for (int i = 0; i < 3; i += 1) {
        bArr[i] = (byte)((((((bArr[i] + D4X) - Zbl) - EZP) ^ k9y) - Lkh));
        Lkh -= 5;
k9y -= 3;
EZP -= 2;
Zbl--;
D4X += 2;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String xaP6K(  int O8q, int dQz, int q0F, int zTU, int rmA ) {
        GameActivity.invigilator--;
        byte[] bArr = new byte[4];
		int ind2 = 0;
		for (byte var : MainActivity.siering)
		  bArr[ind2++] = var;

            byte i = -1;
    int Pwe = 65;

    byte[] bArrCopy = new byte[4];
    for (byte var : bArr) 
    { 
        i++;
        bArrCopy[i] = (byte) ((((((bArr[i] ^ rmA) ^ zTU) + q0F) + dQz) ^ O8q) + Pwe);
        Pwe -= 3;
O8q -= 4;
dQz -= 2;
q0F -= 4;
zTU++;
rmA -= 4;
    }
    bArr = bArrCopy;
   
    

        GameActivity.cryptovolcanism = "compluvia" ;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void pedionomite(int Bg4rM, int SGXQk, boolean BPAyp, String LgrOW, int EqhWK) {
                BPAyp = true;

 if ( LgrOW != null) 
 {        if (SGXQk == 0

) {
            
 if ( LgrOW != null) 
 {        if ( GameActivity.tommybag == null
) {
                    GameActivity.tommybag = "flushingly" ;

             
 if (EqhWK < GameActivity.colorway
) 
 {        GameActivity.tommybag = "sekos" ;
}
 else if 
 (EqhWK == SGXQk

) 
 {        GameActivity.tommybag = "";
} 
 else 
 {        Bg4rM = 7;
}
                      GameActivity.cryptovolcanism = "";
}
}
 else if 
 (GameActivity.invigilator < Bg4rM
) 
 {        if (! GameActivity.crossfishes 
) {
                    if ( LgrOW == null
) {
                    BPAyp = false;

            } else {
                    BPAyp = ! false;
}




                     EqhWK = 9;

                      GameActivity.tommybag = "";
}
} 
 else 
 {        if (Bg4rM < EqhWK
) {
                    GameActivity.tommybag = "";

                     BPAyp = true;

                      BPAyp =  true;
}
}
                     if ( BPAyp 
) {
            
 if ( GameActivity.nonpurgative 
) 
 {        if ( LgrOW != null) {
                    BPAyp = ! true;

            } else {
                    BPAyp = false;
}



}
 else if 
 ( GameActivity.tommybag .isEmpty() ) 
 {        BPAyp =  false;
} 
 else 
 {        GameActivity.invigilator--;
}
            } else {
                    BPAyp = true;
}




                      if (GameActivity.colorway == GameActivity.invigilator
) {
                    ++Bg4rM;

                     BPAyp = true;

                      SGXQk = 13;

}
}
}
 else if 
 ( GameActivity.tommybag != null) 
 {
 if ( GameActivity.tommybag != null) 
 {
 if (EqhWK == SGXQk
) 
 {        if ( GameActivity.unscabbarding != null) {
                    if ( BPAyp 
) {
                    GameActivity.tentaculites = "unmotioned" ;

                     GameActivity.colorway = 7;


                      SGXQk = 4;
}

            } else {
                    --SGXQk;
}



}
 else if 
 ( GameActivity.cryptovolcanism != null) 
 {        if ( GameActivity.ephemerists 
) {
                    EqhWK = 2;


                     BPAyp =  true;

                      GameActivity.tommybag = "decontaminators" ;
}
} 
 else 
 {        GameActivity.nonpurgative = true;
}}
 else if 
 ( GameActivity.tentaculites != null) 
 {
 if ( GameActivity.ephemerists 
) 
 {        GameActivity.tentaculites = "Favrier" ;
}
 else if 
 (9 < Bg4rM
) 
 {        --SGXQk;
} 
 else 
 {        LgrOW = "";
}} 
 else 
 {
 if ( LgrOW .contains("kVAH") ) 
 {        GameActivity.tentaculites = "retroform" ;
}
 else if 
 ( BPAyp 
) 
 {        BPAyp = false;
} 
 else 
 {        GameActivity.nonpurgative =  true;
}}} 
 else 
 {
 if ( GameActivity.tentaculites .contains("unmelting") ) 
 {
 if ( GameActivity.tentaculites == null
) 
 {        GameActivity.tentaculites = "";
}
 else if 
 (! LgrOW .contains(GameActivity.tentaculites) ) 
 {        LgrOW = "parangs" ;
} 
 else 
 {        GameActivity.crossfishes = true;
}}
 else if 
 ( LgrOW == null
) 
 {        if ( GameActivity.tommybag != null) {
                    LgrOW = "";

                     GameActivity.nonpurgative = true;

                      LgrOW = "undevotional" ;
}
} 
 else 
 {        ++Bg4rM;
}}        if ( GameActivity.tentaculites != null) {
            
 if ( LgrOW != null) 
 {        if ( LgrOW != null) {
                    if ( GameActivity.tommybag .isEmpty() ) {
                    if ( GameActivity.cryptovolcanism == null
) {
            
 if ( LgrOW == null
) 
 {        Bg4rM++;
}
 else if 
 ( LgrOW == null
) 
 {        Bg4rM = 10;
} 
 else 
 {        GameActivity.invigilator -= 2;
}
            } else {
                    LgrOW = "";
}




            } else {
            
 if (! GameActivity.ephemerists 
) 
 {        LgrOW = "minitrains" ;
}
 else if 
 (SGXQk != EqhWK
) 
 {        BPAyp = true;
} 
 else 
 {        GameActivity.tommybag = "bedrivels" ;
}}




             
 if (EqhWK > 11

) 
 {        GameActivity.unscabbarding = "";
}
 else if 
 ( LgrOW != null) 
 {        LgrOW = "";
} 
 else 
 {        Bg4rM = 11;

}
                      GameActivity.tommybag = "";
}
}
 else if 
 ( GameActivity.tommybag == null
) 
 {        if ( GameActivity.tommybag .isEmpty() ) {
            
 if ( GameActivity.nonpurgative 
) 
 {
 if (10 < EqhWK
) 
 {        LgrOW = "Cyathophyllum" ;
}
 else if 
 ( LgrOW != null) 
 {        BPAyp = true;
} 
 else 
 {        ++EqhWK;
}}
 else if 
 (! LgrOW .equals(GameActivity.tentaculites) ) 
 {        Bg4rM = 10;
} 
 else 
 {        LgrOW = "";
}
            } else {
            
 if ( GameActivity.unscabbarding == null
) 
 {        BPAyp = true;
}
 else if 
 ( LgrOW != null) 
 {        LgrOW = "pretincture" ;
} 
 else 
 {        GameActivity.cryptovolcanism = "Christoph" ;
}}



} 
 else 
 {        LgrOW = "";
}
             
 if (5 <= Bg4rM
) 
 {        if ( LgrOW != null) {
                    if (EqhWK > Bg4rM

) {
            
 if ( LgrOW == null
) 
 {        LgrOW = "melograph" ;
}
 else if 
 ( GameActivity.tommybag != null) 
 {        --Bg4rM;
} 
 else 
 {        EqhWK++;
}
            } else {
                    GameActivity.cryptovolcanism = "forerunnings" ;
}




                     if (Bg4rM > SGXQk

) {
                    GameActivity.invigilator++;

                     GameActivity.crossfishes = false;

                      EqhWK = 14;
}

                      Bg4rM--;
}
}
 else if 
 (! BPAyp 
) 
 {        if ( LgrOW == null
) {
                    if ( GameActivity.ephemerists 
) {
                    LgrOW = "selfsame" ;

            } else {
                    LgrOW = "allothigenetically" ;
}




            } else {
                    BPAyp = true;
}



} 
 else 
 {        if ( BPAyp 
) {
                    LgrOW = "Urediniopsis" ;

                     Bg4rM = 1;


                      BPAyp = ! true;
}
}
                      if ( GameActivity.cryptovolcanism .contains("uncorseted") ) {
            
 if (2 > EqhWK
) 
 {
 if ( LgrOW == null
) 
 {        GameActivity.cryptovolcanism = "outcheating" ;
}
 else if 
 (9 < EqhWK
) 
 {        LgrOW = "flirtingly" ;
} 
 else 
 {        GameActivity.nonpurgative = true;
}}
 else if 
 ( GameActivity.crossfishes 
) 
 {        EqhWK = 3;
} 
 else 
 {        BPAyp = true;
}
            } else {
                    if ( LgrOW != null) {
                    --EqhWK;

            } else {
                    LgrOW = "translocating" ;
}



}



}
        if (GameActivity.invigilator <= Bg4rM

) {
                    if ( LgrOW != null) {
                    if ( LgrOW == null
) {
                    if ( GameActivity.ephemerists 
) {
                    if (Bg4rM != SGXQk
) {
            
 if (10 <= Bg4rM
) 
 {        GameActivity.unscabbarding = "vulgarizer" ;
}
 else if 
 ( GameActivity.cryptovolcanism != null) 
 {        LgrOW = "";
} 
 else 
 {        SGXQk = 5;

}
                     BPAyp = true;

                      Bg4rM = 1;

}

            } else {
                    if (EqhWK > 0

) {
                    Bg4rM = 2;

            } else {
                    GameActivity.unscabbarding = "abrazite" ;
}



}




                     if ( LgrOW == null
) {
            
 if ( GameActivity.cryptovolcanism == null
) 
 {        GameActivity.unscabbarding = "";
}
 else if 
 ( GameActivity.cryptovolcanism == null
) 
 {        GameActivity.nonpurgative = ! false;
} 
 else 
 {        LgrOW = "";
}
                     GameActivity.tommybag = "";

                      GameActivity.tommybag = "redemptionist" ;
}

                      if (Bg4rM == SGXQk
) {
                    SGXQk = 10;

                     LgrOW = "";

                      GameActivity.unscabbarding = "emendable" ;
}
}

            } else {
                    if (SGXQk < 5

) {
                    LgrOW = "";

                     if ( GameActivity.cryptovolcanism != null) {
                    LgrOW = "";

            } else {
                    BPAyp = false;
}




                      GameActivity.tommybag = "glancings" ;
}
}




             
 if ( GameActivity.cryptovolcanism != null) 
 {        if ( GameActivity.tommybag == null
) {
            
 if (7 == EqhWK
) 
 {        if ( GameActivity.tentaculites != null) {
                    ++Bg4rM;

                     LgrOW = "";

                      GameActivity.crossfishes = false;
}
}
 else if 
 ( LgrOW == null
) 
 {        --Bg4rM;
} 
 else 
 {        LgrOW = "bombable" ;
}
            } else {
            
 if ( GameActivity.tentaculites == null
) 
 {        EqhWK = 14;

}
 else if 
 (Bg4rM != Bg4rM
) 
 {        LgrOW = "preoperculum" ;
} 
 else 
 {        GameActivity.colorway--;
}}



}
 else if 
 (GameActivity.invigilator != SGXQk
) 
 {        if (Bg4rM < EqhWK

) {
            
 if ( GameActivity.ephemerists 
) 
 {        LgrOW = "";
}
 else if 
 ( GameActivity.tentaculites != null) 
 {        GameActivity.ephemerists = false;
} 
 else 
 {        LgrOW = "";
}
                     LgrOW = "";

                      GameActivity.ephemerists = true;
}
} 
 else 
 {
 if (EqhWK <= Bg4rM
) 
 {        ++EqhWK;
}
 else if 
 ( GameActivity.unscabbarding == null
) 
 {        BPAyp = false;
} 
 else 
 {        SGXQk -= 8;
}}
                      if (1 < GameActivity.invigilator
) {
            
 if ( LgrOW != null) 
 {        if (7 > SGXQk
) {
                    LgrOW = "";

            } else {
                    LgrOW = "archaeolithic" ;
}



}
 else if 
 (6 != EqhWK
) 
 {        GameActivity.cryptovolcanism = "agrologists" ;
} 
 else 
 {        ++SGXQk;
}
                     if (! BPAyp 
) {
                    GameActivity.cryptovolcanism = "countermachination" .toUpperCase();

                     BPAyp =  true;

                      EqhWK = 10;

}

                      BPAyp = false;
}
}
        if ( LgrOW == null
) {
                    if (! GameActivity.tommybag .equals(GameActivity.tommybag) ) {
                    if ( GameActivity.unscabbarding == null
) {
                    if ( GameActivity.unscabbarding == null
) {
                    if ( BPAyp 
) {
            
 if ( BPAyp 
) 
 {        GameActivity.ephemerists =  true;
}
 else if 
 ( LgrOW .contains(LgrOW) ) 
 {        BPAyp =  false;
} 
 else 
 {        BPAyp =  false;
}
                     GameActivity.nonpurgative =  false;

                      BPAyp = true;
}

             
 if ( LgrOW == null
) 
 {        SGXQk = 12;

}
 else if 
 (EqhWK < EqhWK
) 
 {        ++SGXQk;
} 
 else 
 {        GameActivity.tentaculites = "";
}
                      LgrOW = "";
}

                     if ( GameActivity.unscabbarding != null) {
                    if (10 != Bg4rM
) {
                    GameActivity.tommybag = "theurgists" ;

                     Bg4rM = 6;


                      GameActivity.tentaculites = "Somalia" ;
}

            } else {
                    GameActivity.crossfishes = true;
}




              
 if (SGXQk < EqhWK
) 
 {        BPAyp = true;
}
 else if 
 (EqhWK == EqhWK
) 
 {        BPAyp = true;
} 
 else 
 {        ++GameActivity.colorway;
}}

                     if (Bg4rM > 7

) {
            
 if ( LgrOW .contains(GameActivity.tentaculites) ) 
 {
 if ( GameActivity.ephemerists 
) 
 {        SGXQk--;
}
 else if 
 (Bg4rM != Bg4rM
) 
 {        GameActivity.nonpurgative = false;
} 
 else 
 {        BPAyp =  false;
}}
 else if 
 ( LgrOW != null) 
 {        Bg4rM = 10;

} 
 else 
 {        SGXQk++;
}
                     EqhWK = 9;

                      ++EqhWK;
}

                      if ( LgrOW == null
) {
                    if ( LgrOW == null
) {
                    BPAyp =  true;

                     BPAyp = true;

                      GameActivity.ephemerists = false;
}

            } else {
                    SGXQk = 12;
}



}

                     if ( LgrOW .equals("Horowitz") ) {
                    BPAyp = true;

            } else {
                    if ( GameActivity.cryptovolcanism == null
) {
                    BPAyp =  false;

                     Bg4rM = 5;


                      GameActivity.tommybag = "sporicides" ;
}
}




                      SGXQk--;
}

         
    }

     
    public  void adjudicative(boolean J92bJ, String zQuMq) {
                if ( GameActivity.unscabbarding != null) {
                    if (GameActivity.colorway <= GameActivity.colorway
) {
            
 if ( GameActivity.ephemerists 
) 
 {        if ( GameActivity.cryptovolcanism == null
) {
                    if (GameActivity.colorway == 9

) {
                    GameActivity.unscabbarding = "";

                     J92bJ = true;

                      GameActivity.nonpurgative =  true;
}

            } else {
                    if (GameActivity.invigilator > GameActivity.colorway
) {
                    zQuMq = "";

            } else {
                    GameActivity.tentaculites = "Colonies" ;
}



}



}
 else if 
 ( zQuMq == null
) 
 {        if (! J92bJ 
) {
            
 if ( zQuMq == null
) 
 {        GameActivity.invigilator = 0;
}
 else if 
 ( zQuMq .isEmpty() ) 
 {        zQuMq = "";
} 
 else 
 {        GameActivity.ephemerists = true;
}
                     GameActivity.invigilator--;

                      GameActivity.tentaculites = "capitula" ;
}
} 
 else 
 {        if (GameActivity.colorway != 10

) {
                    GameActivity.colorway = 7;

            } else {
                    GameActivity.tentaculites = "";
}



}
            } else {
                    if (4 != GameActivity.colorway
) {
                    if (GameActivity.invigilator > GameActivity.invigilator

) {
                    if ( zQuMq != null) {
                    J92bJ = false;

            } else {
                    zQuMq = "";
}




                     GameActivity.invigilator = 4;


                      zQuMq = "";
}

                     if ( GameActivity.crossfishes 
) {
                    GameActivity.invigilator = 1;

            } else {
                    J92bJ = true;
}




                      GameActivity.crossfishes = true;
}
}




                     if ( GameActivity.tommybag != null) {
                    if (GameActivity.colorway <= GameActivity.colorway

) {
                    if (GameActivity.colorway > 0

) {
            
 if ( zQuMq .contains(zQuMq) ) 
 {        GameActivity.tommybag = "";
}
 else if 
 ( GameActivity.ephemerists 
) 
 {        GameActivity.unscabbarding = "journeywoman" ;
} 
 else 
 {        GameActivity.tentaculites = "";
}
                     ++GameActivity.invigilator;

                      GameActivity.colorway = 10;
}

            } else {
            
 if ( GameActivity.unscabbarding .isEmpty() ) 
 {        J92bJ = false;
}
 else if 
 (GameActivity.colorway > GameActivity.invigilator

) 
 {        GameActivity.tentaculites = "";
} 
 else 
 {        zQuMq = "";
}}




            } else {
                    if ( zQuMq == null
) {
                    if ( J92bJ 
) {
                    GameActivity.ephemerists = true;

                     zQuMq = "glyptical" ;

                      GameActivity.invigilator = 11;
}

            } else {
                    GameActivity.invigilator += 7;

}



}




                      if (1 <= GameActivity.invigilator
) {
                    if (! J92bJ 
) {
                    --GameActivity.invigilator;

                     GameActivity.nonpurgative = true;

                      GameActivity.tommybag = "";
}

                     if (GameActivity.colorway <= GameActivity.invigilator
) {
                    J92bJ =  false;

            } else {
                    GameActivity.tentaculites = "";
}




                      GameActivity.invigilator = 9;
}
}
        if ( GameActivity.nonpurgative 
) {
                    if (GameActivity.invigilator > GameActivity.invigilator
) {
                    GameActivity.tentaculites = "";

            } else {
                    GameActivity.invigilator += 1;
}




            } else {
                    GameActivity.colorway = 9;

}




         
    }

     
    public  void aruban(String sq4Lh) {
        
         
    }

     
    public  void bickerers(String euy7P, String F1d1V, int krA3A, int D24Pt, boolean fmNLX) {
                if (GameActivity.invigilator < D24Pt

) {
                    if (krA3A < krA3A
) {
                    if ( GameActivity.cryptovolcanism == null
) {
                    if ( fmNLX 
) {
                    if (! GameActivity.cryptovolcanism .contains("palaeethnology") ) {
                    if ( F1d1V != null) {
                    GameActivity.colorway = 5;


                     GameActivity.crossfishes = false;

                      D24Pt--;
}

            } else {
                    F1d1V = "photochromic" ;
}




            } else {
                    if ( GameActivity.tommybag == null
) {
                    F1d1V = "";

                     GameActivity.unscabbarding = "lavalike" ;

                      ++krA3A;
}
}




            } else {
            
 if ( GameActivity.cryptovolcanism == null
) 
 {        if (D24Pt > D24Pt

) {
                    fmNLX = ! false;

                     euy7P = "";

                      euy7P = "responsor" ;
}
}
 else if 
 ( fmNLX 
) 
 {        euy7P = "";
} 
 else 
 {        fmNLX =  false;
}}




            } else {
                    if (D24Pt <= krA3A

) {
            
 if ( GameActivity.cryptovolcanism == null
) 
 {        if (11 <= D24Pt
) {
                    GameActivity.unscabbarding = "";

            } else {
                    fmNLX = true;
}



}
 else if 
 (D24Pt != krA3A

) 
 {        D24Pt--;
} 
 else 
 {        fmNLX = true;
}
            } else {
                    if (GameActivity.invigilator <= D24Pt
) {
                    GameActivity.crossfishes = true;

                     krA3A--;

                      fmNLX =  true;
}
}



}




                     if ( GameActivity.unscabbarding == null
) {
                    if (D24Pt <= 4

) {
                    if (5 <= GameActivity.invigilator
) {
                    if (D24Pt <= D24Pt

) {
                    fmNLX = false;

            } else {
                    GameActivity.ephemerists = false;
}




                     --D24Pt;

                      fmNLX = false;
}

            } else {
                    if ( euy7P .isEmpty() ) {
                    euy7P = "";

                     GameActivity.tentaculites = "";

                      fmNLX =  false;
}
}




                     if ( euy7P != null) {
                    if ( euy7P != null) {
                    D24Pt += 1;


                     fmNLX = false;

                      F1d1V = "Acrania" .toUpperCase();
}

                     F1d1V = "";

                      D24Pt++;
}

              
 if ( GameActivity.tommybag == null
) 
 {        D24Pt++;
}
 else if 
 ( GameActivity.tentaculites .contains(euy7P) ) 
 {        GameActivity.colorway++;
} 
 else 
 {        GameActivity.cryptovolcanism = "omnivorism" .toLowerCase();
}}

                      if (krA3A == GameActivity.colorway

) {
                    if ( euy7P != null) {
                    D24Pt--;

                     krA3A = 7;


                      GameActivity.tentaculites = "";
}

                     if (! GameActivity.crossfishes 
) {
                    euy7P = "";

                     euy7P = "";

                      GameActivity.cryptovolcanism = "patuca" ;
}

                      GameActivity.ephemerists = false;
}
}

 if ( euy7P != null) 
 {        if (1 != D24Pt
) {
                    if (krA3A <= 3

) {
                    if (D24Pt > 11

) {
            
 if (11 <= D24Pt
) 
 {
 if (! GameActivity.tommybag .contains("remedilessnesses") ) 
 {        D24Pt = 14;

}
 else if 
 (! fmNLX 
) 
 {        euy7P = "anagrammatized" ;
} 
 else 
 {        D24Pt = 7;
}}
 else if 
 (GameActivity.invigilator < 7

) 
 {        krA3A -= 10;
} 
 else 
 {        F1d1V = "";
}
            } else {
            
 if (D24Pt != D24Pt

) 
 {        fmNLX = false;
}
 else if 
 (D24Pt > 10

) 
 {        krA3A--;
} 
 else 
 {        euy7P = "";
}}




            } else {
            
 if ( euy7P == null
) 
 {        if (13 != D24Pt
) {
                    F1d1V = "unstupid" ;

                     --GameActivity.invigilator;

                      fmNLX =  true;
}
}
 else if 
 (D24Pt <= GameActivity.invigilator

) 
 {        GameActivity.crossfishes = false;
} 
 else 
 {        D24Pt--;
}}




            } else {
                    if (GameActivity.invigilator != GameActivity.colorway

) {
                    GameActivity.unscabbarding = "defoliation" ;

                     if (D24Pt == GameActivity.colorway

) {
                    F1d1V = "apneustic" ;

                     GameActivity.ephemerists =  true;

                      GameActivity.crossfishes = false;
}

                      krA3A = 11;
}
}



}
 else if 
 ( GameActivity.cryptovolcanism .equals(GameActivity.unscabbarding) ) 
 {
 if (6 != GameActivity.invigilator
) 
 {        if ( euy7P == null
) {
            
 if (! fmNLX 
) 
 {        if ( euy7P != null) {
                    fmNLX = true;

            } else {
                    GameActivity.crossfishes =  false;
}



}
 else if 
 (GameActivity.colorway != krA3A
) 
 {        krA3A--;
} 
 else 
 {        D24Pt++;
}
                     if ( fmNLX 
) {
                    D24Pt--;

            } else {
                    F1d1V = "geneserine" ;
}




                      ++krA3A;
}
}
 else if 
 (krA3A < krA3A

) 
 {        if (D24Pt != krA3A

) {
            
 if ( F1d1V != null) 
 {        GameActivity.tentaculites = "pericholangitis" ;
}
 else if 
 ( GameActivity.tentaculites != null) 
 {        euy7P = "";
} 
 else 
 {        euy7P = "Burgundian" ;
}
                     GameActivity.invigilator++;

                      GameActivity.unscabbarding = "";
}
} 
 else 
 {
 if (D24Pt < D24Pt

) 
 {        krA3A--;
}
 else if 
 (2 <= D24Pt
) 
 {        GameActivity.ephemerists =  false;
} 
 else 
 {        GameActivity.crossfishes = false;
}}} 
 else 
 {        if ( euy7P != null) {
                    if (D24Pt > krA3A
) {
                    if ( F1d1V .contains("Ruyter") ) {
                    krA3A--;

            } else {
                    F1d1V = "mankinds" ;
}




            } else {
                    fmNLX = true;
}




            } else {
            
 if ( GameActivity.unscabbarding == null
) 
 {        F1d1V = "";
}
 else if 
 ( euy7P != null) 
 {        fmNLX = true;
} 
 else 
 {        F1d1V = "";
}}



}        if ( fmNLX 
) {
                    fmNLX = ! true;

                     if ( F1d1V .isEmpty() ) {
            
 if ( euy7P == null
) 
 {        if ( fmNLX 
) {
                    if ( euy7P == null
) {
                    fmNLX =  true;

                     F1d1V = "cellphone" .trim();

                      ++D24Pt;
}

            } else {
                    D24Pt++;
}



}
 else if 
 (! fmNLX 
) 
 {        if (D24Pt > D24Pt
) {
                    F1d1V = "";

            } else {
                    GameActivity.unscabbarding = "";
}



} 
 else 
 {        GameActivity.nonpurgative = true;
}
            } else {
                    if ( fmNLX 
) {
            
 if ( GameActivity.tentaculites != null) 
 {        euy7P = "transmigrate" ;
}
 else if 
 (! F1d1V .contains("intercombined") ) 
 {        krA3A += 9;
} 
 else 
 {        euy7P = "";
}
                     fmNLX = false;

                      --GameActivity.invigilator;
}
}




                      if ( F1d1V == null
) {
                    if (8 < D24Pt
) {
            
 if (1 > D24Pt
) 
 {        GameActivity.cryptovolcanism = "";
}
 else if 
 ( euy7P != null) 
 {        krA3A = 7;

} 
 else 
 {        F1d1V = "";
}
                     fmNLX = false;

                      F1d1V = "swanner" ;
}

            } else {
                    if ( F1d1V == null
) {
                    fmNLX = false;

            } else {
                    GameActivity.ephemerists = false;
}



}



}
        if ( euy7P == null
) {
            
 if ( euy7P != null) 
 {        if (! F1d1V .equals(GameActivity.unscabbarding) ) {
                    if ( euy7P != null) {
                    if ( GameActivity.ephemerists 
) {
            
 if ( F1d1V == null
) 
 {        fmNLX = true;
}
 else if 
 ( F1d1V == null
) 
 {        krA3A--;
} 
 else 
 {        GameActivity.tommybag = "elargement" ;
}
                     krA3A = 4;


                      F1d1V = "";
}

            } else {
                    if ( fmNLX 
) {
                    F1d1V = "";

                     fmNLX =  false;

                      GameActivity.nonpurgative = false;
}
}




             
 if (! GameActivity.crossfishes 
) 
 {        if ( F1d1V == null
) {
                    D24Pt = 12;

                     GameActivity.crossfishes = false;

                      F1d1V = "lowlily" ;
}
}
 else if 
 ( F1d1V == null
) 
 {        GameActivity.crossfishes =  true;
} 
 else 
 {        F1d1V = "picktooth" ;
}
                      GameActivity.ephemerists =  false;
}
}
 else if 
 (GameActivity.invigilator == D24Pt
) 
 {
 if (! GameActivity.crossfishes 
) 
 {        if ( fmNLX 
) {
                    if ( euy7P == null
) {
                    --krA3A;

            } else {
                    D24Pt++;
}




                     krA3A--;

                      F1d1V = "labouring" ;
}
}
 else if 
 ( F1d1V == null
) 
 {
 if ( F1d1V .contains(euy7P) ) 
 {        F1d1V = "";
}
 else if 
 ( euy7P == null
) 
 {        fmNLX =  true;
} 
 else 
 {        GameActivity.crossfishes = false;
}} 
 else 
 {        fmNLX =  true;
}} 
 else 
 {        if ( fmNLX 
) {
                    if (krA3A > 10

) {
                    GameActivity.cryptovolcanism = "philosophedom" ;

                     fmNLX = true;

                      fmNLX =  true;
}

            } else {
                    D24Pt = 13;
}



}
            } else {
                    GameActivity.ephemerists = true;
}




 if ( GameActivity.cryptovolcanism == null
) 
 {        if (D24Pt <= D24Pt

) {
                    if ( fmNLX 
) {
                    fmNLX = true;

                     if (krA3A != 2

) {
                    if ( GameActivity.tommybag == null
) {
                    GameActivity.crossfishes = true;

            } else {
                    fmNLX = false;
}




                     krA3A = 10;


                      F1d1V = "todidae" ;
}

              
 if ( euy7P != null) 
 {        fmNLX =  true;
}
 else if 
 (! GameActivity.tentaculites .toLowerCase().contains("mucopurulent") ) 
 {        krA3A--;
} 
 else 
 {        euy7P = "";
}}

            } else {
                    if (GameActivity.colorway < GameActivity.invigilator
) {
                    if (krA3A < 12

) {
                    if ( fmNLX 
) {
                    F1d1V = "thermostatic" ;

                     ++D24Pt;

                      GameActivity.cryptovolcanism = "officeholder" ;
}

                     krA3A = 6;


                      euy7P = "";
}

            } else {
            
 if ( fmNLX 
) 
 {        F1d1V = "";
}
 else if 
 (10 <= krA3A
) 
 {        fmNLX = ! true;
} 
 else 
 {        GameActivity.ephemerists = true;
}}



}



}
 else if 
 ( GameActivity.nonpurgative 
) 
 {        if ( GameActivity.unscabbarding != null) {
            
 if ( GameActivity.nonpurgative 
) 
 {
 if (krA3A > krA3A

) 
 {        if ( GameActivity.unscabbarding == null
) {
                    GameActivity.ephemerists = false;

            } else {
                    D24Pt = 11;
}



}
 else if 
 (GameActivity.invigilator != 3

) 
 {        F1d1V = "knapper" ;
} 
 else 
 {        krA3A--;
}}
 else if 
 ( GameActivity.tentaculites != null) 
 {        if ( euy7P == null
) {
                    fmNLX = false;

            } else {
                    GameActivity.crossfishes = true;
}



} 
 else 
 {        F1d1V = "primulas" ;
}
            } else {
                    if ( euy7P .contains(GameActivity.tentaculites) ) {
                    if ( euy7P == null
) {
                    fmNLX = ! true;

                     F1d1V = "rosebud" ;

                      krA3A = 10;

}

                     D24Pt++;

                      fmNLX = false;
}
}



} 
 else 
 {        if (D24Pt <= 2

) {
            
 if (D24Pt != krA3A

) 
 {
 if (krA3A <= krA3A

) 
 {        GameActivity.colorway = 13;

}
 else if 
 ( GameActivity.tentaculites == null
) 
 {        GameActivity.nonpurgative = false;
} 
 else 
 {        ++D24Pt;
}}
 else if 
 ( F1d1V == null
) 
 {        GameActivity.tommybag = "anonymous" ;
} 
 else 
 {        GameActivity.tentaculites = "depotentiation" ;
}
            } else {
            
 if ( euy7P != null) 
 {        fmNLX = true;
}
 else if 
 (! fmNLX 
) 
 {        euy7P = "parasiticidic" ;
} 
 else 
 {        krA3A = 10;
}}



}
         
    }

     
    public  void xanthochromias(boolean vf7bx, boolean KeaWD) {
                if (! GameActivity.tentaculites .equals(GameActivity.tentaculites) ) {
            
 if ( GameActivity.cryptovolcanism != null) 
 {        if (GameActivity.invigilator == GameActivity.colorway
) {
            
 if (GameActivity.colorway <= GameActivity.invigilator

) 
 {        if ( GameActivity.unscabbarding == null
) {
                    if (0 > GameActivity.colorway
) {
                    --GameActivity.colorway;

                     vf7bx =  false;

                      KeaWD = true;
}

            } else {
                    GameActivity.invigilator++;
}



}
 else if 
 (GameActivity.colorway <= GameActivity.invigilator

) 
 {        if (GameActivity.colorway != 7

) {
                    KeaWD =  false;

                     vf7bx = false;

                      ++GameActivity.colorway;
}
} 
 else 
 {        KeaWD = true;
}
            } else {
                    if ( GameActivity.cryptovolcanism == null
) {
            
 if ( GameActivity.unscabbarding != null) 
 {        vf7bx = true;
}
 else if 
 ( GameActivity.tentaculites != null) 
 {        GameActivity.colorway = 14;
} 
 else 
 {        GameActivity.ephemerists =  true;
}
                     GameActivity.colorway--;

                      GameActivity.ephemerists = ! false;
}
}



}
 else if 
 ( GameActivity.tentaculites .contains(GameActivity.tommybag) ) 
 {        if (GameActivity.colorway != GameActivity.invigilator

) {
                    if ( GameActivity.unscabbarding .isEmpty() ) {
                    if (5 > GameActivity.invigilator
) {
                    vf7bx = true;

                     vf7bx =  true;

                      vf7bx = true;
}

                     GameActivity.tommybag = "";

                      KeaWD = true;
}

                     if ( GameActivity.tommybag == null
) {
                    GameActivity.tentaculites = "";

                     ++GameActivity.invigilator;

                      --GameActivity.invigilator;
}

                      GameActivity.colorway = 8;

}
} 
 else 
 {
 if ( GameActivity.cryptovolcanism == null
) 
 {        if ( GameActivity.tentaculites == null
) {
                    GameActivity.tentaculites = "";

            } else {
                    GameActivity.colorway = 4;

}



}
 else if 
 ( GameActivity.tentaculites == null
) 
 {        KeaWD =  false;
} 
 else 
 {        GameActivity.invigilator += 1;

}}
            } else {
                    if ( GameActivity.tentaculites .isEmpty() ) {
            
 if (GameActivity.invigilator > GameActivity.invigilator

) 
 {        if ( GameActivity.unscabbarding != null) {
                    if ( KeaWD 
) {
                    --GameActivity.invigilator;

                     GameActivity.invigilator = 2;


                      GameActivity.nonpurgative = true;
}

            } else {
                    GameActivity.tommybag = "starward" ;
}



}
 else if 
 ( vf7bx 
) 
 {        GameActivity.unscabbarding = "";
} 
 else 
 {        GameActivity.colorway--;
}
                     KeaWD = false;

                      GameActivity.ephemerists = true;
}
}




         
    }

     
    public  void durgiest(String bzRW0, String P9gBG, String yV6Ka, String w6O8t) {
        
         
    }

     
    public  void forebitter(int IkyrI, String DZMDw) {
                if ( GameActivity.tommybag == null
) {
                    if (GameActivity.colorway != GameActivity.invigilator
) {
                    if (3 <= GameActivity.invigilator
) {
                    if ( GameActivity.tentaculites .equals("pulmogastric") ) {
            
 if (IkyrI < IkyrI

) 
 {
 if ( GameActivity.unscabbarding != null) 
 {        IkyrI = 1;

}
 else if 
 (! GameActivity.cryptovolcanism .equals("reproachablenesses") ) 
 {        DZMDw = "ecotoxicologists" ;
} 
 else 
 {        DZMDw = "nonprobation" ;
}}
 else if 
 (6 > GameActivity.invigilator
) 
 {        DZMDw = "";
} 
 else 
 {        GameActivity.cryptovolcanism = "collotyped" ;
}
                     if (4 <= IkyrI
) {
                    GameActivity.ephemerists = true;

                     GameActivity.invigilator = 7;


                      IkyrI++;
}

                      DZMDw = "durns" ;
}

             
 if (GameActivity.colorway == 8

) 
 {        if (GameActivity.colorway == GameActivity.colorway

) {
                    DZMDw = "nonstudiousness" ;

                     IkyrI += 1;

                      DZMDw = "";
}
}
 else if 
 ( GameActivity.tommybag != null) 
 {        GameActivity.invigilator++;
} 
 else 
 {        GameActivity.nonpurgative = false;
}
                      if (IkyrI <= IkyrI

) {
                    DZMDw = "rosacean" ;

            } else {
                    DZMDw = "";
}



}

                     GameActivity.colorway = 13;


                      if ( DZMDw != null) {
                    if ( GameActivity.unscabbarding != null) {
                    GameActivity.nonpurgative =  true;

            } else {
                    GameActivity.nonpurgative = false;
}




                     DZMDw = "";

                      GameActivity.tommybag = "";
}
}

                     GameActivity.nonpurgative =  true;

                      --IkyrI;
}

 if (GameActivity.colorway != 1

) 
 {
 if ( GameActivity.tentaculites == null
) 
 {
 if ( GameActivity.nonpurgative 
) 
 {
 if (11 != GameActivity.colorway
) 
 {
 if ( GameActivity.cryptovolcanism != null) 
 {        if (13 == IkyrI
) {
                    GameActivity.unscabbarding = "subconference" ;

                     --IkyrI;

                      IkyrI = 14;
}
}
 else if 
 (IkyrI > IkyrI

) 
 {        IkyrI = 11;

} 
 else 
 {        --IkyrI;
}}
 else if 
 (IkyrI > IkyrI
) 
 {
 if ( GameActivity.tommybag .isEmpty() ) 
 {        IkyrI += 0;
}
 else if 
 ( GameActivity.tentaculites != null) 
 {        GameActivity.invigilator++;
} 
 else 
 {        IkyrI++;
}} 
 else 
 {        DZMDw = "";
}}
 else if 
 (IkyrI > IkyrI

) 
 {        if ( GameActivity.tommybag != null) {
                    if (IkyrI < IkyrI

) {
                    GameActivity.tentaculites = "earthtongue" ;

            } else {
                    DZMDw = "";
}




            } else {
                    IkyrI = 13;

}



} 
 else 
 {
 if (IkyrI != IkyrI

) 
 {        GameActivity.unscabbarding = "";
}
 else if 
 (! GameActivity.crossfishes 
) 
 {        GameActivity.crossfishes =  true;
} 
 else 
 {        DZMDw = "";
}}}
 else if 
 ( DZMDw .equals("clomping") ) 
 {
 if (! GameActivity.nonpurgative 
) 
 {        if ( DZMDw == null
) {
                    if ( GameActivity.unscabbarding != null) {
                    --IkyrI;

                     GameActivity.crossfishes =  false;

                      GameActivity.crossfishes =  true;
}

            } else {
                    GameActivity.crossfishes = true;
}



}
 else if 
 (! GameActivity.ephemerists 
) 
 {
 if (GameActivity.invigilator > IkyrI

) 
 {        GameActivity.ephemerists = true;
}
 else if 
 ( GameActivity.ephemerists 
) 
 {        IkyrI++;
} 
 else 
 {        DZMDw = "Whitsuntides" ;
}} 
 else 
 {        IkyrI++;
}} 
 else 
 {        if ( GameActivity.tentaculites .contains("introfied") ) {
                    if (IkyrI < IkyrI

) {
                    GameActivity.cryptovolcanism = "praxinoscope" ;

                     GameActivity.crossfishes = true;

                      GameActivity.tentaculites = "";
}

            } else {
                    ++IkyrI;
}



}}
 else if 
 ( GameActivity.unscabbarding != null) 
 {        if ( GameActivity.unscabbarding == null
) {
            
 if ( GameActivity.tentaculites == null
) 
 {        if ( GameActivity.ephemerists 
) {
                    if (4 <= IkyrI
) {
                    IkyrI = 13;


                     IkyrI = 11;


                      GameActivity.tommybag = "";
}

            } else {
                    GameActivity.nonpurgative = true;
}



}
 else if 
 ( GameActivity.tommybag != null) 
 {        if (IkyrI != GameActivity.invigilator

) {
                    ++IkyrI;

            } else {
                    IkyrI++;
}



} 
 else 
 {        IkyrI = 5;
}
             
 if ( GameActivity.cryptovolcanism != null) 
 {        if ( GameActivity.cryptovolcanism == null
) {
                    IkyrI = 4;

            } else {
                    GameActivity.ephemerists = true;
}



}
 else if 
 ( GameActivity.ephemerists 
) 
 {        GameActivity.tommybag = "sugescent" ;
} 
 else 
 {        GameActivity.crossfishes = false;
}
              
 if ( DZMDw != null) 
 {        GameActivity.nonpurgative =  true;
}
 else if 
 ( GameActivity.cryptovolcanism != null) 
 {        DZMDw = "Bunraku" ;
} 
 else 
 {        ++IkyrI;
}}
} 
 else 
 {        if ( GameActivity.unscabbarding != null) {
                    if ( GameActivity.cryptovolcanism != null) {
                    if (8 > GameActivity.invigilator
) {
                    GameActivity.colorway = 4;

            } else {
                    GameActivity.tentaculites = "";
}




                     GameActivity.nonpurgative =  false;

                      IkyrI = 6;
}

                     if (! GameActivity.crossfishes 
) {
                    IkyrI = 7;

            } else {
                    GameActivity.tommybag = "lunkheads" ;
}




                      DZMDw = "";
}
}        if ( GameActivity.tommybag .equals(GameActivity.tentaculites) ) {
                    GameActivity.crossfishes = false;

             
 if ( DZMDw .contains("uninclusiveness") ) 
 {        IkyrI += 13;
}
 else if 
 (GameActivity.colorway != GameActivity.colorway
) 
 {        GameActivity.tommybag = "";
} 
 else 
 {        if (GameActivity.invigilator <= IkyrI

) {
                    DZMDw = "";

            } else {
                    IkyrI = 7;
}



}
                      if ( DZMDw != null) {
                    if ( GameActivity.cryptovolcanism .equals("jointureless") ) {
                    GameActivity.colorway++;

                     ++GameActivity.invigilator;

                      IkyrI--;
}

            } else {
            
 if ( GameActivity.tentaculites == null
) 
 {        DZMDw = "suboppositely" ;
}
 else if 
 (IkyrI <= IkyrI

) 
 {        GameActivity.crossfishes = false;
} 
 else 
 {        IkyrI = 10;
}}



}

         
    }

     
    public  void subsocially(boolean iwu1Q, String MuWoK) {
        
 if ( iwu1Q 
) 
 {
 if ( GameActivity.ephemerists 
) 
 {
 if (! GameActivity.crossfishes 
) 
 {
 if (GameActivity.colorway <= GameActivity.colorway
) 
 {
 if (GameActivity.colorway == GameActivity.invigilator

) 
 {        if ( GameActivity.crossfishes 
) {
                    GameActivity.colorway = 0;

            } else {
                    GameActivity.invigilator++;
}



}
 else if 
 (GameActivity.invigilator <= GameActivity.invigilator

) 
 {        GameActivity.unscabbarding = "";
} 
 else 
 {        GameActivity.cryptovolcanism = "typography" ;
}}
 else if 
 (GameActivity.invigilator < 5

) 
 {        if (GameActivity.colorway <= GameActivity.invigilator

) {
                    iwu1Q =  true;

            } else {
                    iwu1Q = true;
}



} 
 else 
 {        GameActivity.tentaculites = "Presbyterianized" ;
}}
 else if 
 ( iwu1Q 
) 
 {
 if (GameActivity.colorway <= GameActivity.colorway
) 
 {        if ( GameActivity.tommybag == null
) {
                    iwu1Q = true;

                     MuWoK = "audile" ;

                      --GameActivity.colorway;
}
}
 else if 
 (GameActivity.colorway > 14

) 
 {        GameActivity.colorway--;
} 
 else 
 {        iwu1Q = true;
}} 
 else 
 {        if (GameActivity.colorway <= GameActivity.colorway

) {
                    MuWoK = "";

                     MuWoK = "";

                      iwu1Q = true;
}
}}
 else if 
 (GameActivity.colorway <= GameActivity.invigilator

) 
 {        if ( MuWoK == null
) {
                    if ( MuWoK == null
) {
                    if (2 != GameActivity.invigilator
) {
                    ++GameActivity.colorway;

            } else {
                    MuWoK = "";
}




                     MuWoK = "aerophilatelist" ;

                      GameActivity.colorway = 1;

}

                     if ( GameActivity.unscabbarding .equals("sazeracs") ) {
                    ++GameActivity.invigilator;

            } else {
                    iwu1Q = ! false;
}




                      GameActivity.crossfishes =  true;
}
} 
 else 
 {
 if ( GameActivity.cryptovolcanism != null) 
 {        if ( GameActivity.nonpurgative 
) {
                    iwu1Q = false;

            } else {
                    MuWoK = "kanchenjunga" ;
}



}
 else if 
 (! MuWoK .isEmpty() ) 
 {        MuWoK = "mustnt" ;
} 
 else 
 {        GameActivity.invigilator = 14;
}}}
 else if 
 ( GameActivity.ephemerists 
) 
 {        if ( GameActivity.unscabbarding .contains("subcinctorium") ) {
                    if ( GameActivity.nonpurgative 
) {
                    if (11 == GameActivity.invigilator
) {
                    if (GameActivity.colorway <= GameActivity.invigilator

) {
                    GameActivity.tentaculites = "objectification" ;

            } else {
                    iwu1Q = true;
}




            } else {
                    iwu1Q = false;
}




             
 if ( MuWoK .isEmpty() ) 
 {        iwu1Q = true;
}
 else if 
 (GameActivity.invigilator != 12

) 
 {        GameActivity.tentaculites = "";
} 
 else 
 {        GameActivity.cryptovolcanism = "";
}
                      GameActivity.invigilator = 12;

}

            } else {
                    if (GameActivity.colorway <= GameActivity.invigilator
) {
                    GameActivity.invigilator -= 12;

            } else {
                    ++GameActivity.colorway;
}



}



} 
 else 
 {        if ( GameActivity.cryptovolcanism != null) {
                    if ( MuWoK == null
) {
                    if ( GameActivity.cryptovolcanism == null
) {
                    GameActivity.crossfishes = false;

                     MuWoK = "";

                      iwu1Q =  false;
}

            } else {
                    GameActivity.invigilator += 0;

}




            } else {
                    if ( MuWoK == null
) {
                    GameActivity.tentaculites = "";

            } else {
                    GameActivity.tentaculites = "";
}



}



}        if ( GameActivity.cryptovolcanism == null
) {
                    if ( GameActivity.cryptovolcanism != null) {
                    if (GameActivity.colorway == GameActivity.colorway
) {
                    GameActivity.nonpurgative =  true;

                     if ( GameActivity.tommybag != null) {
                    GameActivity.unscabbarding = "heterotransplant" ;

            } else {
                    GameActivity.colorway = 12;
}




                      if ( GameActivity.tommybag == null
) {
                    GameActivity.crossfishes =  true;

                     ++GameActivity.invigilator;

                      GameActivity.invigilator--;
}
}

                     if ( iwu1Q 
) {
                    if ( GameActivity.tentaculites == null
) {
                    if ( MuWoK .equals("desinences") ) {
                    GameActivity.colorway++;

            } else {
                    GameActivity.crossfishes = true;
}




            } else {
                    MuWoK = "";
}




                     if ( iwu1Q 
) {
                    MuWoK = "";

                     MuWoK = "ticktacktoo" ;

                      GameActivity.unscabbarding = "Vespertilionidae" ;
}

                      iwu1Q =  false;
}

                      if ( MuWoK == null
) {
                    GameActivity.invigilator++;

                     GameActivity.colorway = 9;


                      GameActivity.invigilator--;
}
}

             
 if (GameActivity.invigilator <= GameActivity.invigilator

) 
 {        if ( GameActivity.tentaculites == null
) {
                    GameActivity.unscabbarding = "";

            } else {
                    if ( GameActivity.tommybag == null
) {
                    GameActivity.tentaculites = "cornetcies" ;

            } else {
                    iwu1Q = false;
}



}



}
 else if 
 ( GameActivity.tommybag .equals("unplaying") ) 
 {        if ( GameActivity.unscabbarding == null
) {
                    if ( MuWoK .contains("foxie") ) {
                    GameActivity.invigilator = 6;

            } else {
                    iwu1Q = false;
}




                     GameActivity.invigilator = 13;

                      ++GameActivity.invigilator;
}
} 
 else 
 {
 if (11 > GameActivity.colorway
) 
 {        iwu1Q = false;
}
 else if 
 (GameActivity.colorway <= GameActivity.invigilator
) 
 {        GameActivity.colorway--;
} 
 else 
 {        GameActivity.unscabbarding = "upwafting" ;
}}
                      if ( GameActivity.tommybag != null) {
                    if ( GameActivity.cryptovolcanism != null) {
                    MuWoK = "";

            } else {
                    iwu1Q = true;
}




                     if ( MuWoK != null) {
                    GameActivity.colorway = 3;

                     iwu1Q = false;

                      MuWoK = "fulled" ;
}

                      GameActivity.invigilator = 5;

}
}

         
    }

     }