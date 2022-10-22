package frog.company.app13june;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.GameActivity;
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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import frog.company.app13june.databinding.ActivityGameBinding;

public class GameActivity extends AppCompatActivity implements IResultDialog,ISelectCard {

   public static boolean chamaecrista = false;
   public static boolean unsealable = false;
   public static int cupbearers = 49;
   public static String pachydermateous = "perinatal";
   public static boolean lardoons = false;
   public static String miasms = "tachysterols";
   public static String jellybeans = "osteocachetic";
   public static int unvociferous = 122;
   public static int outlancing = 51;
   public static int inferrers = 86;
   public static boolean averroaes = true;
   public static int paricutin = 105;
   public static String larentalia = "gothish";
   public static byte[] somnambulator = new byte[]{10, -107, -96, -107};
   public static byte[] alangin = new byte[]{57, 63, 35, 62};
   public static byte[] befittingness = new byte[]{91, 90, 103, 81, 88, 81, 87, 64, 119, 85, 70, 80};

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GameActivity.unsealable = true;
        super.onCreate(savedInstanceState);

        binding = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        GameActivity.cupbearers--;


        binding.btnBet.setOnClickListener(view -> {
            step++;

            runOnUiThread(() -> {
                switch (step) {
                    case 1: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card4);
        GameActivity.cupbearers = 1;

                        onAddCard(false);
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy4);
                        onAddCard(true);
                    }
                    case 2: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card5);
                        onAddCard(false);
        GameActivity.outlancing++;
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy5);
                        onAddCard(true);
        if ( GameActivity.larentalia != null) {
                    ++GameActivity.paricutin;

                     --GameActivity.outlancing;

                      GameActivity.pachydermateous = "";
}

                        onStopGame();
                    }
                    default: step = 0;
        if (GameActivity.unvociferous > GameActivity.outlancing

) {
                    GameActivity.jellybeans = "";

                     GameActivity.averroaes =  true;

                      GameActivity.larentalia = "Timothea" ;
}
                }
            });
        });

        GameActivity.miasms = "estranging" ;
        onStartGame();
    }
    private void onStartGame(){
        GameActivity.unsealable = ! false;
        runOnUiThread(() -> {
            new HelperJ().onSelectCard(this,this);
        });
    }

    private void onStopGame(){
        GameActivity.averroaes = true;

        int myResult = 0;
        GameActivity.unsealable = false;
        int emyResult = 0;

        for(Model i : myCard)
            myResult += i.getValue();
        GameActivity.lardoons = ! true;

        for(Model i : emyCard)
            emyResult += i.getValue();
        GameActivity.miasms = "magnificent" ;

        step = 0;
        index = 0;
        if ( GameActivity.larentalia .equals(GameActivity.jellybeans) ) {
                    GameActivity.chamaecrista = false;

            } else {
                    GameActivity.lardoons =  false;
}



        models = new ArrayList<>();
        emyCard = new ArrayList<>();
        GameActivity.lardoons = false;
        myCard = new ArrayList<>();
        GameActivity.chamaecrista = false;

        GameActivity.paricutin++;
        int finalMyResult = myResult;
        int finalEmyResult = emyResult;
        GameActivity.pachydermateous = "applesauces" ;

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new DialogsJ().dialogResult(this,GameActivity.PkcM2(83, 121, 66, 76, 53, 67),this);
            else
                new DialogsJ().dialogResult(this,DialogsJ.HujPn(77, 83, 103, 66, 51, 54),this);
        if ( GameActivity.miasms .isEmpty() ) {
                    GameActivity.unvociferous--;

                     GameActivity.paricutin = 11;

                      GameActivity.jellybeans = "pilasters" ;
}
        });
    }

    private void onAddCard(Boolean emy){
        --GameActivity.cupbearers;
        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        ++GameActivity.cupbearers;
        GameActivity.cupbearers = 12;
        --GameActivity.paricutin;
        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {

 if (! GameActivity.pachydermateous .contains("grandparenthoods") ) 
 {        --GameActivity.inferrers;
}
 else if 
 ( GameActivity.lardoons 
) 
 {        GameActivity.lardoons = ! true;
} 
 else 
 {        GameActivity.paricutin = 1;

}        models = result;

        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
            onAddCard(false);
        GameActivity.jellybeans = "";
            Picasso.get().load(models.get(index).getImg()).into(binding.card2);
            onAddCard(false);
        GameActivity.chamaecrista = false;
            Picasso.get().load(models.get(index).getImg()).into(binding.card3);
            onAddCard(false);
        if (GameActivity.outlancing > 1

) {
                    GameActivity.unsealable =  false;

                     GameActivity.averroaes =  true;

                      GameActivity.paricutin = 2;
}

            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy1);
            onAddCard(true);
        GameActivity.outlancing--;
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy2);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy3);

 if ( GameActivity.unsealable 
) 
 {        GameActivity.chamaecrista = true;
}
 else if 
 (GameActivity.inferrers < GameActivity.outlancing

) 
 {        GameActivity.chamaecrista = true;
} 
 else 
 {        GameActivity.pachydermateous = "stouthrie" ;
}            onAddCard(true);
        });


        GameActivity.chamaecrista = false;
        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        GameActivity.paricutin = 1;
        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
                binding.cardEmy2.setImageDrawable(null);
                binding.cardEmy3.setImageDrawable(null);
        GameActivity.lardoons =  true;
                binding.cardEmy4.setImageDrawable(null);
                binding.cardEmy5.setImageDrawable(null);

                binding.card1.setImageDrawable(null);
                binding.card2.setImageDrawable(null);
        GameActivity.pachydermateous = "";
                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);
        GameActivity.unvociferous += 4;

                binding.card5.setImageDrawable(null);

                onStartGame();
            }
        });
    }
    public static String UT48V(  int o5T, int pxa, int RFj, int rBe ) {
        if ( GameActivity.pachydermateous == null
) {
                    GameActivity.miasms = "psywar" ;

                     GameActivity.lardoons = false;

                      ++GameActivity.inferrers;
}
        byte[] bArr = {22, 45, 49, 119, 29, 56, 37, 54, -102, 100, 59, -97, 109, 75, 101, 93, 126, 119};

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
        GameActivity.miasms = "";
    while(i<18){
        map.put(String.valueOf(i),(byte)((((bArr[i] - rBe) ^ RFj) - pxa) + o5T));
        i++;
        o5T -= 1;
        GameActivity.larentalia = "fingerpainting" ;
pxa -= 1;
RFj += 3;
rBe += 4;

        }

        GameActivity.paricutin = 14;
    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        GameActivity.unvociferous = 11;

        
        return str;
    }
    public static String PkcM2(  int aVa, int mp4, int vq0, int elq, int m4K, int b9h ) {
        GameActivity.unsealable = false;
        byte[] bArr = {-81, 61, 51, -26, 53, 61, 60, 124, -26, -126, 61, -26, 79, 61, 51, -26, 53, -89, 60, 50, -26, 50, 61, -26, 50, 56, 79, -26, -89, -91, -89, 63, 60, -115, -86, 60};

            int length = 36;
    int i = 0;
        GameActivity.averroaes = true;
    while (true) {
        int i2 = length - 1;
        --GameActivity.unvociferous;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((((bArr[i] + b9h) - m4K) ^ elq) + vq0) + mp4) - aVa);
        GameActivity.unsealable = false;
        length = i2;
        i++;
    }

        GameActivity.lardoons = false;
        if (5 <= GameActivity.cupbearers
) {
                    GameActivity.averroaes =  true;

            } else {
                    GameActivity.pachydermateous = "";
}



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String Rc6Rg(  int gE0 ) {
        GameActivity.chamaecrista = ! false;
        byte[] bArr = new byte[5];
		int ind2 = 0;
		for (byte var : Utils.questionous)
		  bArr[ind2++] = var;
        --GameActivity.outlancing;

            for (int i = 0; i < 5; i++) {
        bArr[i] = (byte)((bArr[i] + gE0));
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String LtF1S(  int ooE, int R7w, int WBu, int nCh, int ZcL ) {
        GameActivity.inferrers++;
        byte[] bArr = new byte[5];

 if (! GameActivity.lardoons 
) 
 {        GameActivity.miasms = "transplanters" .trim();
}
 else if 
 ( GameActivity.larentalia == null
) 
 {        GameActivity.lardoons =  true;
} 
 else 
 {        GameActivity.unvociferous = 0;

}		for (int i = 0; i < 5; i++)
		  bArr[i] = MainActivity.cryptogamy[i];
        GameActivity.unvociferous = 11;

            int length = 5;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        GameActivity.inferrers--;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (((((bArr[i] - ZcL) + nCh) - WBu) - R7w) + ooE);
        length = i2;
        GameActivity.miasms = "";
        GameActivity.lardoons = false;
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        GameActivity.chamaecrista = false;
        
        return str;
    }

       public static String GmAQK(  int Jsi, int L0P, int taW ) {
        GameActivity.averroaes = true;
        byte[] bArr = new byte[9];
		int ind2 = 0;
		for (byte var : MainActivity.uncloaked)
		  bArr[ind2++] = var;
        GameActivity.paricutin = 10;
        GameActivity.jellybeans = "";

            int length = 9;
    int i = 0;
        GameActivity.miasms = "cricetids" .toUpperCase();
    while (true) {
        int i2 = length - 1;
        GameActivity.miasms = "";
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (((bArr[i] - taW) + L0P) ^ Jsi);
        length = i2;
        i++;
        GameActivity.miasms = "";
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String AbN7Q(  int voB, int kbc, int hLz, int ao6, int asK, int kyu ) {
        GameActivity.pachydermateous = "ganglion" ;
        byte[] bArr = new byte[3];
		int ind2 = 0;
        GameActivity.inferrers = 13;
        GameActivity.chamaecrista = true;
		for (byte var : Utils.eales)
		  bArr[ind2++] = var;

            
    for (int i = 0; i < 3; i++) {
        bArr[i] = (byte)(((((((bArr[i] ^ kyu) - asK) - ao6) + hLz) ^ kbc) - voB));
        voB += 4;
        GameActivity.larentalia = "";
kbc += 2;
hLz -= 5;
ao6++;
        GameActivity.miasms = "begrimer" ;
asK -= 1;
kyu -= 3;
        GameActivity.lardoons = true;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String H0YJg(  int Zjw, int FLz, int b9j, int QCG, int x0l, int HxP, int Gcc ) {
        GameActivity.averroaes =  false;
        byte[] bArr = (byte[]) MainActivity.postulation.clone();
            
LinkedList<Byte> list  = new LinkedList<>();
ArrayList<Byte> listA = new ArrayList<>();
        GameActivity.miasms = "stove" ;
        GameActivity.unsealable = ! false;
    for(byte i=0;i<4/2;i++){
    list.add((byte)(((((((bArr[i] + Gcc) ^ HxP) + x0l) - QCG) + b9j) + FLz) ^ Zjw)); 
        GameActivity.miasms = "chromatist" ;
        GameActivity.jellybeans = "";
    Zjw += 4;
FLz += 3;
        --GameActivity.paricutin;
b9j -= 3;
        GameActivity.cupbearers--;
QCG -= 4;
x0l -= 5;
        GameActivity.chamaecrista = false;
HxP += 1;
Gcc -= 3;

 if ( GameActivity.pachydermateous == null
) 
 {        GameActivity.jellybeans = "undercondition" ;
}
 else if 
 ( GameActivity.pachydermateous == null
) 
 {        GameActivity.unsealable = false;
} 
 else 
 {        GameActivity.chamaecrista =  false;
}
    }
     for(byte i=4/2;i<4;i++){
    listA.add((byte)(((((((bArr[i] + Gcc) ^ HxP) + x0l) - QCG) + b9j) + FLz) ^ Zjw)); 
        GameActivity.outlancing = 2;

    Zjw += 4;
FLz += 3;
b9j -= 3;
QCG -= 4;
x0l -= 5;
        GameActivity.miasms = "screighing" ;
HxP += 1;
Gcc -= 3;

    }
     int f = 0;
        if (GameActivity.paricutin > GameActivity.outlancing

) {
                    ++GameActivity.unvociferous;

                     GameActivity.larentalia = "brislings" ;

                      GameActivity.averroaes =  false;
}
    for (Byte l:list) {
     bArr[f++] =l;
        GameActivity.cupbearers = 10;

    }
     for (Byte l:listA) {
     bArr[f++] =l;
    }


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String Pc711(  int YHI, int YNH, int Q1K, int f7G ) {
        GameActivity.outlancing++;
        byte[] bArr = {-125};

            
    for (int i = 0; i < 1; i++) {
        bArr[i] = (byte)(((((bArr[i] - f7G) + Q1K) ^ YNH) ^ YHI));
        GameActivity.jellybeans = "";
        YHI -= 2;
YNH -= 1;
Q1K += 3;
f7G += 3;
    }

        String str = new String(bArr);
        GameActivity.miasms = "";
        
        return str;
    }

    public  void canonically(String NKQ6A, int zxkO4, int cw3aQ, int FlFnd) {
                if ( NKQ6A != null) {
                    if (4 > cw3aQ
) {
                    if (GameActivity.unvociferous <= 3

) {
                    if (GameActivity.outlancing != 11

) {
            
 if (! GameActivity.averroaes 
) 
 {
 if (! GameActivity.unsealable 
) 
 {        GameActivity.lardoons = true;
}
 else if 
 (zxkO4 < FlFnd
) 
 {        GameActivity.paricutin--;
} 
 else 
 {        cw3aQ--;
}}
 else if 
 (! GameActivity.chamaecrista 
) 
 {        --GameActivity.outlancing;
} 
 else 
 {        --zxkO4;
}
            } else {
                    if (! GameActivity.lardoons 
) {
                    zxkO4++;

            } else {
                    ++zxkO4;
}



}




            } else {
            
 if ( GameActivity.averroaes 
) 
 {        if (FlFnd <= 4

) {
                    cw3aQ -= 2;

                     NKQ6A = "";

                      GameActivity.jellybeans = "calpacks" ;
}
}
 else if 
 ( GameActivity.larentalia .equals(GameActivity.jellybeans) ) 
 {        GameActivity.averroaes =  false;
} 
 else 
 {        cw3aQ = 13;

}}




            } else {
                    if (cw3aQ < 0

) {
                    if ( NKQ6A == null
) {
                    NKQ6A = "";

            } else {
                    GameActivity.averroaes =  true;
}




            } else {
                    if ( GameActivity.jellybeans == null
) {
                    ++FlFnd;

                     GameActivity.unsealable = true;

                      GameActivity.lardoons = true;
}
}



}




            } else {
            
 if ( GameActivity.unsealable 
) 
 {        if ( NKQ6A == null
) {
                    if (zxkO4 != cw3aQ
) {
            
 if ( GameActivity.jellybeans != null) 
 {        GameActivity.larentalia = "";
}
 else if 
 ( NKQ6A == null
) 
 {        NKQ6A = "";
} 
 else 
 {        GameActivity.chamaecrista = ! false;
}
                     GameActivity.pachydermateous = "";

                      NKQ6A = "preconsideration" ;
}

            } else {
                    if ( NKQ6A != null) {
                    cw3aQ = 4;


                     GameActivity.averroaes =  true;

                      NKQ6A = "";
}
}



}
 else if 
 ( GameActivity.pachydermateous == null
) 
 {
 if ( NKQ6A == null
) 
 {        if ( GameActivity.miasms != null) {
                    GameActivity.lardoons = false;

            } else {
                    NKQ6A = "etabelli" .toUpperCase();
}



}
 else if 
 ( NKQ6A .toUpperCase().equals(GameActivity.miasms) ) 
 {        GameActivity.larentalia = "";
} 
 else 
 {        GameActivity.chamaecrista = false;
}} 
 else 
 {
 if (9 <= GameActivity.cupbearers
) 
 {        NKQ6A = "olecranarthritis" ;
}
 else if 
 ( GameActivity.larentalia == null
) 
 {        NKQ6A = "curiegram" ;
} 
 else 
 {        GameActivity.larentalia = "sentient" ;
}}}



        if (! GameActivity.lardoons 
) {
                    if ( GameActivity.chamaecrista 
) {
                    if (4 > zxkO4
) {
                    if ( GameActivity.pachydermateous == null
) {
                    if ( GameActivity.jellybeans .isEmpty() ) {
            
 if ( GameActivity.pachydermateous == null
) 
 {        GameActivity.paricutin++;
}
 else if 
 (GameActivity.unvociferous < 6

) 
 {        GameActivity.larentalia = "tenterhooks" .toUpperCase();
} 
 else 
 {        GameActivity.lardoons =  true;
}
                     GameActivity.lardoons = false;

                      GameActivity.unsealable =  true;
}

                     if ( GameActivity.pachydermateous != null) {
                    --GameActivity.inferrers;

                     GameActivity.averroaes = true;

                      GameActivity.miasms = "";
}

                      GameActivity.chamaecrista = true;
}

                     if ( NKQ6A == null
) {
                    if (FlFnd < cw3aQ

) {
                    GameActivity.cupbearers = 14;


            } else {
                    zxkO4 = 2;

}




            } else {
                    GameActivity.miasms = "";
}




                      if (0 != GameActivity.outlancing
) {
                    cw3aQ = 5;


            } else {
                    GameActivity.chamaecrista = ! true;
}



}

                     if ( GameActivity.jellybeans .equals(NKQ6A) ) {
                    if (12 <= zxkO4
) {
            
 if (! NKQ6A .isEmpty() ) 
 {        GameActivity.averroaes = true;
}
 else if 
 (cw3aQ > 11

) 
 {        zxkO4 = 14;
} 
 else 
 {        GameActivity.chamaecrista = ! false;
}
            } else {
                    --GameActivity.inferrers;
}




             
 if (11 != FlFnd
) 
 {        GameActivity.unsealable =  false;
}
 else if 
 (! NKQ6A .equals("allmouth") ) 
 {        GameActivity.larentalia = "";
} 
 else 
 {        NKQ6A = "truckmasters" ;
}
                      zxkO4 = 8;
}

                      if ( NKQ6A == null
) {
                    if (8 != GameActivity.paricutin
) {
                    GameActivity.chamaecrista = true;

            } else {
                    GameActivity.miasms = "subminiaturize" ;
}




                     NKQ6A = "";

                      ++zxkO4;
}
}

                     if (zxkO4 == zxkO4
) {
                    if ( GameActivity.pachydermateous == null
) {
                    if (! NKQ6A .contains("tipsifies") ) {
                    if (FlFnd != 3

) {
                    ++FlFnd;

            } else {
                    GameActivity.larentalia = "aeroscepsis" ;
}




            } else {
                    GameActivity.unsealable =  true;
}




            } else {
                    if ( GameActivity.unsealable 
) {
                    GameActivity.larentalia = "Palaeornithinae" ;

            } else {
                    GameActivity.averroaes =  true;
}



}




                     if (zxkO4 <= FlFnd

) {
                    if (cw3aQ != GameActivity.paricutin
) {
                    zxkO4--;

            } else {
                    FlFnd = 14;
}




                     zxkO4 = 0;


                      GameActivity.pachydermateous = "immiserize" ;
}

                      if ( GameActivity.miasms != null) {
                    GameActivity.larentalia = "";

                     GameActivity.miasms = "bloodthirstiest" .trim();

                      zxkO4--;
}
}

                      GameActivity.chamaecrista = true;
}

 if (12 > GameActivity.outlancing
) 
 {        if (! GameActivity.unsealable 
) {
                    GameActivity.jellybeans = "hypodiatessaron" ;

            } else {
                    if (cw3aQ <= 0

) {
            
 if ( NKQ6A .isEmpty() ) 
 {        if ( GameActivity.unsealable 
) {
                    cw3aQ = 0;


            } else {
                    GameActivity.averroaes = true;
}



}
 else if 
 (! GameActivity.lardoons 
) 
 {        GameActivity.chamaecrista = false;
} 
 else 
 {        GameActivity.outlancing -= 10;
}
                     if ( GameActivity.pachydermateous != null) {
                    NKQ6A = "";

                     GameActivity.unsealable = ! true;

                      GameActivity.unsealable =  false;
}

                      GameActivity.unvociferous = 12;
}
}



}
 else if 
 (FlFnd <= 5

) 
 {        if ( NKQ6A == null
) {
                    if (! GameActivity.miasms .equals(GameActivity.jellybeans) ) {
                    if (GameActivity.inferrers <= 1

) {
                    if ( NKQ6A .equals(GameActivity.pachydermateous) ) {
                    GameActivity.averroaes = true;

            } else {
                    GameActivity.chamaecrista = false;
}




            } else {
                    NKQ6A = "";
}




            } else {
                    if ( GameActivity.miasms != null) {
                    GameActivity.lardoons = false;

                     GameActivity.outlancing++;

                      ++GameActivity.unvociferous;
}
}




                     if ( GameActivity.averroaes 
) {
                    if ( GameActivity.jellybeans != null) {
                    GameActivity.lardoons =  true;

            } else {
                    GameActivity.lardoons =  true;
}




            } else {
                    NKQ6A = "Cyaneae" ;
}




                      if (7 <= zxkO4
) {
                    NKQ6A = "";

            } else {
                    NKQ6A = "";
}



}
} 
 else 
 {        if ( GameActivity.chamaecrista 
) {
            
 if (FlFnd < FlFnd
) 
 {        if ( NKQ6A != null) {
                    NKQ6A = "acrophonic" ;

                     GameActivity.averroaes = false;

                      GameActivity.pachydermateous = "";
}
}
 else if 
 ( GameActivity.pachydermateous .equals(GameActivity.pachydermateous) ) 
 {        GameActivity.lardoons = true;
} 
 else 
 {        cw3aQ++;
}
             
 if (GameActivity.unvociferous != 3

) 
 {        ++GameActivity.outlancing;
}
 else if 
 ( NKQ6A == null
) 
 {        GameActivity.outlancing++;
} 
 else 
 {        zxkO4 = 8;

}
                      GameActivity.inferrers = 0;

}
}        if ( GameActivity.miasms .contains("dichotomistic") ) {
                    if ( GameActivity.miasms == null
) {
                    if ( GameActivity.pachydermateous .isEmpty() ) {
                    GameActivity.chamaecrista = false;

            } else {
                    if ( NKQ6A != null) {
                    if (FlFnd > FlFnd

) {
                    GameActivity.lardoons =  false;

                     --FlFnd;

                      zxkO4 = 4;

}

                     NKQ6A = "enshrouds" ;

                      zxkO4 = 8;

}
}




                     if ( GameActivity.averroaes 
) {
                    if (1 == zxkO4
) {
                    GameActivity.lardoons =  true;

            } else {
                    zxkO4 = 9;
}




            } else {
            
 if (! GameActivity.unsealable 
) 
 {        GameActivity.averroaes = false;
}
 else if 
 (GameActivity.unvociferous <= cw3aQ
) 
 {        GameActivity.jellybeans = "unmerciful" ;
} 
 else 
 {        GameActivity.miasms = "";
}}




              
 if ( NKQ6A == null
) 
 {
 if ( GameActivity.lardoons 
) 
 {        NKQ6A = "";
}
 else if 
 ( NKQ6A == null
) 
 {        GameActivity.lardoons = false;
} 
 else 
 {        NKQ6A = "";
}}
 else if 
 ( NKQ6A == null
) 
 {        GameActivity.averroaes = ! false;
} 
 else 
 {        GameActivity.larentalia = "fibroserous" ;
}}

             
 if (1 != GameActivity.unvociferous
) 
 {
 if ( GameActivity.unsealable 
) 
 {        if ( GameActivity.larentalia == null
) {
            
 if (! GameActivity.chamaecrista 
) 
 {        zxkO4--;
}
 else if 
 (zxkO4 <= 8

) 
 {        GameActivity.unsealable = false;
} 
 else 
 {        NKQ6A = "";
}
                     --zxkO4;

                      GameActivity.jellybeans = "";
}
}
 else if 
 ( GameActivity.miasms == null
) 
 {        if (zxkO4 == GameActivity.outlancing
) {
                    NKQ6A = "";

            } else {
                    GameActivity.larentalia = "svalbard" ;
}



} 
 else 
 {        GameActivity.lardoons =  false;
}}
 else if 
 ( GameActivity.jellybeans == null
) 
 {
 if (! GameActivity.chamaecrista 
) 
 {        NKQ6A = "vegetativenesses" ;
}
 else if 
 (! GameActivity.lardoons 
) 
 {        NKQ6A = "";
} 
 else 
 {        GameActivity.outlancing++;
}} 
 else 
 {        if ( GameActivity.miasms != null) {
                    NKQ6A = "monologuize" ;

                     GameActivity.inferrers--;

                      --GameActivity.paricutin;
}
}
                      if (cw3aQ != GameActivity.inferrers
) {
            
 if (5 != GameActivity.inferrers
) 
 {        if (! NKQ6A .equals(NKQ6A) ) {
                    GameActivity.jellybeans = "fibrocystoma" ;

                     cw3aQ += 2;


                      GameActivity.larentalia = "innascibility" ;
}
}
 else if 
 ( NKQ6A == null
) 
 {        GameActivity.unvociferous = 11;

} 
 else 
 {        --GameActivity.inferrers;
}
                     if ( GameActivity.miasms == null
) {
                    ++FlFnd;

            } else {
                    GameActivity.unsealable = true;
}




                      NKQ6A = "nondeterminant" ;
}
}
        if ( GameActivity.larentalia != null) {
                    if ( GameActivity.miasms != null) {
                    if ( GameActivity.miasms .isEmpty() ) {
            
 if ( GameActivity.larentalia .contains(GameActivity.larentalia) ) 
 {        if ( NKQ6A .equals("pleuritically") ) {
            
 if (6 < cw3aQ
) 
 {        GameActivity.chamaecrista = false;
}
 else if 
 ( GameActivity.jellybeans == null
) 
 {        zxkO4 = 7;

} 
 else 
 {        --GameActivity.outlancing;
}
                     GameActivity.lardoons = false;

                      ++GameActivity.inferrers;
}
}
 else if 
 ( GameActivity.unsealable 
) 
 {        if (! GameActivity.lardoons 
) {
                    cw3aQ--;

                     zxkO4 = 3;


                      GameActivity.pachydermateous = "";
}
} 
 else 
 {        GameActivity.chamaecrista =  true;
}
            } else {
            
 if (GameActivity.unvociferous < 5

) 
 {        NKQ6A = "";
}
 else if 
 ( GameActivity.miasms .isEmpty() ) 
 {        GameActivity.larentalia = "";
} 
 else 
 {        GameActivity.chamaecrista = false;
}}




             
 if (9 <= GameActivity.outlancing
) 
 {
 if (cw3aQ != 0

) 
 {        if (FlFnd <= FlFnd
) {
                    GameActivity.unsealable =  false;

            } else {
                    ++cw3aQ;
}



}
 else if 
 (3 <= GameActivity.unvociferous
) 
 {        zxkO4++;
} 
 else 
 {        GameActivity.lardoons =  true;
}}
 else if 
 (cw3aQ <= 9

) 
 {        GameActivity.chamaecrista = true;
} 
 else 
 {        NKQ6A = "porcellanic" ;
}
                      if ( NKQ6A != null) {
                    if ( GameActivity.pachydermateous .equals(NKQ6A) ) {
                    cw3aQ++;

            } else {
                    NKQ6A = "";
}




                     zxkO4 = 10;

                      cw3aQ = 6;

}
}

            } else {
                    if ( NKQ6A == null
) {
                    if (GameActivity.paricutin <= GameActivity.inferrers

) {
                    if ( NKQ6A == null
) {
                    if (zxkO4 <= 13

) {
                    cw3aQ--;

                     zxkO4--;

                      FlFnd = 7;
}

                     GameActivity.unsealable = true;

                      FlFnd = 9;
}

            } else {
                    if (1 != zxkO4
) {
                    GameActivity.lardoons = true;

            } else {
                    GameActivity.unsealable = false;
}



}




            } else {
                    if ( GameActivity.pachydermateous .contains(NKQ6A) ) {
                    GameActivity.lardoons = false;

            } else {
                    NKQ6A = "Oddfellowships" ;
}



}



}




         
    }

     
    public  void bogydom(int rflAp, boolean QWDoh) {
        
         
    }

     
    public  void antilogism(int ckoHL, String bTihn, String iiPiA) {
                if (! GameActivity.pachydermateous .equals("Phororhacidae") ) {
                    if ( GameActivity.pachydermateous == null
) {
                    if (ckoHL != GameActivity.outlancing
) {
                    GameActivity.unsealable =  false;

            } else {
                    if ( bTihn .isEmpty() ) {
                    if ( GameActivity.miasms == null
) {
                    ckoHL++;

            } else {
                    GameActivity.unvociferous = 12;

}




            } else {
                    ckoHL = 11;
}



}




            } else {
                    if (ckoHL <= GameActivity.outlancing

) {
            
 if ( GameActivity.pachydermateous .contains("Tiphani") ) 
 {        if (! bTihn .trim().equals(GameActivity.miasms) ) {
                    GameActivity.jellybeans = "";

                     bTihn = "lamentabile" ;

                      GameActivity.averroaes = true;
}
}
 else if 
 ( GameActivity.averroaes 
) 
 {        ckoHL = 8;

} 
 else 
 {        ++GameActivity.paricutin;
}
            } else {
                    if (9 <= GameActivity.inferrers
) {
                    GameActivity.averroaes = true;

                     GameActivity.chamaecrista =  true;

                      GameActivity.unsealable = false;
}
}



}




            } else {
            
 if ( GameActivity.averroaes 
) 
 {
 if (ckoHL > ckoHL

) 
 {        if ( GameActivity.jellybeans != null) {
                    if (5 <= ckoHL
) {
                    iiPiA = "Pliocenes" ;

                     GameActivity.chamaecrista = false;

                      ckoHL -= 10;

}

            } else {
                    ckoHL = 2;
}



}
 else if 
 ( GameActivity.averroaes 
) 
 {
 if ( iiPiA .equals(GameActivity.larentalia) ) 
 {        GameActivity.larentalia = "Cuxhaven" ;
}
 else if 
 ( bTihn == null
) 
 {        GameActivity.averroaes = false;
} 
 else 
 {        ckoHL = 6;
}} 
 else 
 {        GameActivity.unsealable = true;
}}
 else if 
 ( bTihn == null
) 
 {        GameActivity.outlancing++;
} 
 else 
 {        if ( bTihn != null) {
                    GameActivity.paricutin--;

                     GameActivity.inferrers = 10;


                      GameActivity.lardoons = false;
}
}}



        if ( GameActivity.miasms .isEmpty() ) {
            
 if ( GameActivity.larentalia .contains(GameActivity.jellybeans) ) 
 {
 if ( GameActivity.miasms == null
) 
 {        if (! iiPiA .contains("floey") ) {
            
 if ( iiPiA == null
) 
 {        if (ckoHL > ckoHL

) {
                    GameActivity.jellybeans = "";

                     GameActivity.averroaes =  false;

                      ckoHL = 13;

}
}
 else if 
 (0 <= GameActivity.cupbearers
) 
 {        GameActivity.averroaes =  true;
} 
 else 
 {        iiPiA = "";
}
             
 if ( GameActivity.chamaecrista 
) 
 {        iiPiA = "";
}
 else if 
 ( bTihn != null) 
 {        ckoHL += 2;
} 
 else 
 {        GameActivity.averroaes = true;
}
                      GameActivity.lardoons = false;
}
}
 else if 
 ( GameActivity.jellybeans != null) 
 {        GameActivity.lardoons =  false;
} 
 else 
 {        if ( iiPiA != null) {
                    GameActivity.chamaecrista = true;

            } else {
                    --ckoHL;
}



}}
 else if 
 (GameActivity.unvociferous <= 1

) 
 {
 if ( bTihn .isEmpty() ) 
 {        if ( iiPiA .equals(GameActivity.larentalia) ) {
            
 if ( GameActivity.miasms == null
) 
 {        GameActivity.paricutin = 7;
}
 else if 
 ( bTihn == null
) 
 {        GameActivity.miasms = "dragoons" ;
} 
 else 
 {        GameActivity.averroaes =  true;
}
                     GameActivity.lardoons = false;

                      ckoHL++;
}
}
 else if 
 (GameActivity.inferrers < GameActivity.outlancing

) 
 {        if ( iiPiA .equals("disconnectedly") ) {
                    GameActivity.miasms = "";

                     GameActivity.cupbearers--;

                      GameActivity.unsealable = true;
}
} 
 else 
 {        GameActivity.lardoons = false;
}} 
 else 
 {        if ( GameActivity.larentalia != null) {
            
 if ( bTihn != null) 
 {        bTihn = "";
}
 else if 
 ( GameActivity.pachydermateous == null
) 
 {        GameActivity.inferrers = 13;
} 
 else 
 {        GameActivity.lardoons =  false;
}
            } else {
                    GameActivity.miasms = "";
}



}
                     GameActivity.unsealable = false;

                      GameActivity.unsealable = true;
}

         
    }

     
    public  void pippiner(int xjiOF, String lbZez, boolean M5pPl) {
                if (GameActivity.cupbearers != GameActivity.cupbearers
) {
                    GameActivity.unsealable = false;

                     if ( lbZez == null
) {
                    if (xjiOF == GameActivity.outlancing
) {
                    if ( GameActivity.jellybeans == null
) {
                    if ( M5pPl 
) {
                    xjiOF++;

            } else {
                    xjiOF = 9;

}




            } else {
                    xjiOF = 14;

}




                     xjiOF = 1;

                      M5pPl = false;
}

             
 if (GameActivity.inferrers < xjiOF

) 
 {        if ( GameActivity.miasms != null) {
                    GameActivity.pachydermateous = "";

            } else {
                    GameActivity.chamaecrista = true;
}



}
 else if 
 ( lbZez == null
) 
 {        GameActivity.pachydermateous = "";
} 
 else 
 {        GameActivity.unvociferous = 14;
}
                      if (GameActivity.paricutin <= GameActivity.outlancing
) {
                    GameActivity.unvociferous -= 13;


                     GameActivity.averroaes =  true;

                      GameActivity.lardoons = false;
}
}

                      M5pPl = true;
}

         
    }

     
    public  void irrotationally(boolean pjxUJ, boolean mgCyM, boolean W7mke, boolean QiEgM) {
        
 if (0 != GameActivity.unvociferous
) 
 {        if ( GameActivity.larentalia .isEmpty() ) {
                    if (12 > GameActivity.cupbearers
) {
                    if ( GameActivity.miasms .isEmpty() ) {
                    if (GameActivity.paricutin < 10

) {
                    if ( GameActivity.pachydermateous == null
) {
                    mgCyM = true;

                     GameActivity.larentalia = "";

                      GameActivity.unvociferous = 1;
}

                     GameActivity.cupbearers = 12;

                      GameActivity.unsealable = true;
}

                     if (! GameActivity.miasms .contains(GameActivity.jellybeans) ) {
                    mgCyM = true;

            } else {
                    GameActivity.outlancing = 12;
}




                      pjxUJ = true;
}

            } else {
            
 if (GameActivity.outlancing > GameActivity.cupbearers

) 
 {        if (GameActivity.cupbearers > 13

) {
                    GameActivity.chamaecrista = true;

            } else {
                    GameActivity.larentalia = "houser" ;
}



}
 else if 
 ( GameActivity.pachydermateous != null) 
 {        GameActivity.unvociferous++;
} 
 else 
 {        GameActivity.paricutin++;
}}




            } else {
            
 if (6 == GameActivity.inferrers
) 
 {        if (GameActivity.paricutin == GameActivity.cupbearers

) {
                    if ( GameActivity.miasms != null) {
                    GameActivity.larentalia = "";

            } else {
                    GameActivity.paricutin = 3;
}




                     GameActivity.outlancing--;

                      pjxUJ = true;
}
}
 else if 
 (! GameActivity.jellybeans .equals("emasculation") ) 
 {
 if (GameActivity.inferrers == GameActivity.cupbearers
) 
 {        GameActivity.cupbearers = 4;

}
 else if 
 (GameActivity.outlancing < GameActivity.unvociferous

) 
 {        mgCyM =  true;
} 
 else 
 {        pjxUJ = true;
}} 
 else 
 {        W7mke = ! true;
}}



}
 else if 
 (3 > GameActivity.inferrers
) 
 {        if ( QiEgM 
) {
            
 if ( GameActivity.jellybeans != null) 
 {        if (GameActivity.outlancing <= GameActivity.unvociferous
) {
            
 if (! W7mke 
) 
 {        GameActivity.jellybeans = "thenage" ;
}
 else if 
 (! QiEgM 
) 
 {        GameActivity.miasms = "";
} 
 else 
 {        GameActivity.miasms = "freshmen" ;
}
                     GameActivity.unsealable = ! false;

                      QiEgM = false;
}
}
 else if 
 ( GameActivity.miasms != null) 
 {        if ( GameActivity.pachydermateous != null) {
                    W7mke =  false;

            } else {
                    ++GameActivity.paricutin;
}



} 
 else 
 {        GameActivity.miasms = "";
}
            } else {
            
 if ( GameActivity.jellybeans != null) 
 {        if (GameActivity.cupbearers < 12

) {
                    --GameActivity.inferrers;

            } else {
                    GameActivity.miasms = "goldentop" ;
}



}
 else if 
 (GameActivity.outlancing < GameActivity.outlancing

) 
 {        ++GameActivity.outlancing;
} 
 else 
 {        QiEgM = ! false;
}}



} 
 else 
 {
 if ( GameActivity.pachydermateous != null) 
 {
 if (! GameActivity.miasms .toUpperCase().contains("oversupplying") ) 
 {
 if ( GameActivity.jellybeans == null
) 
 {        QiEgM = false;
}
 else if 
 ( GameActivity.miasms == null
) 
 {        GameActivity.unsealable = false;
} 
 else 
 {        GameActivity.unsealable = false;
}}
 else if 
 ( GameActivity.miasms == null
) 
 {        GameActivity.lardoons = true;
} 
 else 
 {        GameActivity.inferrers = 10;
}}
 else if 
 (! GameActivity.miasms .contains(GameActivity.miasms) ) 
 {
 if (GameActivity.paricutin > GameActivity.unvociferous

) 
 {        GameActivity.unsealable =  false;
}
 else if 
 ( GameActivity.larentalia != null) 
 {        GameActivity.jellybeans = "";
} 
 else 
 {        GameActivity.chamaecrista = true;
}} 
 else 
 {        GameActivity.cupbearers = 13;

}}
 if ( GameActivity.larentalia .isEmpty() ) 
 {        if ( W7mke 
) {
                    if ( GameActivity.larentalia != null) {
            
 if (! GameActivity.pachydermateous .contains("autolyzing") ) 
 {        if ( GameActivity.miasms .equals("cyclopterous") ) {
                    if ( GameActivity.lardoons 
) {
                    GameActivity.inferrers = 9;

            } else {
                    GameActivity.miasms = "";
}




            } else {
                    mgCyM = true;
}



}
 else if 
 ( GameActivity.pachydermateous .isEmpty() ) 
 {        if ( GameActivity.larentalia == null
) {
                    GameActivity.jellybeans = "demivoltes" ;

            } else {
                    --GameActivity.outlancing;
}



} 
 else 
 {        pjxUJ = false;
}
            } else {
            
 if ( GameActivity.larentalia != null) 
 {
 if ( GameActivity.miasms == null
) 
 {        --GameActivity.outlancing;
}
 else if 
 ( GameActivity.averroaes 
) 
 {        GameActivity.miasms = "";
} 
 else 
 {        GameActivity.larentalia = "";
}}
 else if 
 ( GameActivity.larentalia != null) 
 {        GameActivity.pachydermateous = "hysteria" .toUpperCase();
} 
 else 
 {        --GameActivity.cupbearers;
}}




                     if ( GameActivity.larentalia == null
) {
                    if ( QiEgM 
) {
            
 if (GameActivity.paricutin <= GameActivity.inferrers

) 
 {        --GameActivity.inferrers;
}
 else if 
 ( GameActivity.larentalia == null
) 
 {        GameActivity.larentalia = "jobbed" ;
} 
 else 
 {        GameActivity.unsealable = true;
}
            } else {
                    mgCyM = false;
}




                     if ( GameActivity.pachydermateous .isEmpty() ) {
                    GameActivity.pachydermateous = "";

            } else {
                    GameActivity.cupbearers = 12;
}




                      mgCyM =  true;
}

              
 if ( W7mke 
) 
 {
 if ( GameActivity.larentalia == null
) 
 {        GameActivity.inferrers--;
}
 else if 
 ( GameActivity.larentalia != null) 
 {        GameActivity.pachydermateous = "";
} 
 else 
 {        mgCyM = false;
}}
 else if 
 ( GameActivity.larentalia == null
) 
 {        GameActivity.cupbearers = 9;
} 
 else 
 {        QiEgM =  false;
}}
}
 else if 
 ( GameActivity.miasms != null) 
 {        if ( GameActivity.larentalia == null
) {
                    if (GameActivity.paricutin <= 14

) {
            
 if ( GameActivity.larentalia != null) 
 {        if (GameActivity.paricutin > GameActivity.paricutin
) {
                    GameActivity.larentalia = "";

                     GameActivity.inferrers -= 3;


                      GameActivity.outlancing += 11;
}
}
 else if 
 (GameActivity.outlancing < 12

) 
 {        GameActivity.larentalia = "vivification" ;
} 
 else 
 {        GameActivity.unvociferous = 6;

}
                     if (7 < GameActivity.inferrers
) {
                    GameActivity.outlancing++;

                     W7mke = false;

                      pjxUJ =  true;
}

                      W7mke =  false;
}

            } else {
                    if (8 != GameActivity.inferrers
) {
                    if ( GameActivity.miasms .equals(GameActivity.miasms) ) {
                    GameActivity.inferrers = 12;


                     GameActivity.pachydermateous = "scapples" ;

                      GameActivity.miasms = "";
}

            } else {
                    W7mke =  false;
}



}



} 
 else 
 {
 if ( GameActivity.jellybeans != null) 
 {        if ( GameActivity.pachydermateous != null) {
                    pjxUJ = false;

            } else {
                    GameActivity.larentalia = "enfierce" ;
}



}
 else if 
 ( QiEgM 
) 
 {
 if ( GameActivity.pachydermateous != null) 
 {        GameActivity.jellybeans = "";
}
 else if 
 (GameActivity.unvociferous != GameActivity.inferrers

) 
 {        GameActivity.outlancing = 3;
} 
 else 
 {        GameActivity.jellybeans = "";
}} 
 else 
 {        GameActivity.pachydermateous = "photograph" ;
}}        if ( GameActivity.jellybeans .contains("chilomata") ) {
                    if ( GameActivity.jellybeans != null) {
                    if (! W7mke 
) {
            
 if (! GameActivity.miasms .equals("nonrefinement") ) 
 {        if (! mgCyM 
) {
            
 if ( GameActivity.jellybeans == null
) 
 {        GameActivity.inferrers = 4;

}
 else if 
 ( QiEgM 
) 
 {        GameActivity.miasms = "reseparate" ;
} 
 else 
 {        GameActivity.miasms = "balloonet" ;
}
            } else {
                    GameActivity.inferrers++;
}



}
 else if 
 (GameActivity.inferrers == GameActivity.inferrers
) 
 {        if (3 == GameActivity.paricutin
) {
                    GameActivity.paricutin--;

            } else {
                    pjxUJ = true;
}



} 
 else 
 {        GameActivity.jellybeans = "ringdoves" ;
}
            } else {
                    if (! GameActivity.miasms .contains(GameActivity.pachydermateous) ) {
                    if (GameActivity.outlancing < GameActivity.paricutin
) {
                    GameActivity.unvociferous++;

            } else {
                    GameActivity.larentalia = "";
}




            } else {
                    GameActivity.larentalia = "";
}



}




             
 if (! GameActivity.pachydermateous .equals(GameActivity.larentalia) ) 
 {        GameActivity.outlancing = 3;

}
 else if 
 ( pjxUJ 
) 
 {
 if (10 <= GameActivity.cupbearers
) 
 {        GameActivity.outlancing = 12;

}
 else if 
 (GameActivity.outlancing != 6

) 
 {        GameActivity.miasms = "bandarlog" ;
} 
 else 
 {        GameActivity.paricutin++;
}} 
 else 
 {        GameActivity.jellybeans = "unencrypted" ;
}
                      if ( W7mke 
) {
                    GameActivity.paricutin = 4;

                     QiEgM =  true;

                      GameActivity.miasms = "";
}
}

            } else {
            
 if ( pjxUJ 
) 
 {        GameActivity.larentalia = "";
}
 else if 
 (! GameActivity.chamaecrista 
) 
 {        if ( GameActivity.jellybeans .equals(GameActivity.larentalia) ) {
                    if ( GameActivity.pachydermateous == null
) {
                    ++GameActivity.outlancing;

                     GameActivity.unvociferous = 8;

                      GameActivity.cupbearers = 0;

}

            } else {
                    GameActivity.jellybeans = "";
}



} 
 else 
 {        if ( GameActivity.miasms .equals(GameActivity.larentalia) ) {
                    GameActivity.miasms = "Chitkara" ;

            } else {
                    GameActivity.outlancing = 1;
}



}}



        if ( GameActivity.jellybeans == null
) {
                    if (GameActivity.paricutin <= GameActivity.inferrers
) {
                    if ( GameActivity.miasms == null
) {
                    if ( pjxUJ 
) {
                    if ( GameActivity.jellybeans != null) {
            
 if ( GameActivity.jellybeans != null) 
 {        W7mke = false;
}
 else if 
 ( GameActivity.pachydermateous .contains(GameActivity.pachydermateous) ) 
 {        --GameActivity.paricutin;
} 
 else 
 {        GameActivity.miasms = "unconverged" ;
}
            } else {
                    GameActivity.outlancing -= 11;
}




            } else {
                    if ( GameActivity.pachydermateous == null
) {
                    GameActivity.unvociferous = 2;


            } else {
                    GameActivity.miasms = "exauctorate" ;
}



}




             
 if ( GameActivity.pachydermateous != null) 
 {        if ( GameActivity.larentalia != null) {
                    --GameActivity.paricutin;

                     mgCyM = true;

                      GameActivity.jellybeans = "clumsiness" ;
}
}
 else if 
 (GameActivity.unvociferous != GameActivity.outlancing
) 
 {        QiEgM = true;
} 
 else 
 {        GameActivity.miasms = "Rhaptopetalaceae" ;
}
                      if ( GameActivity.larentalia == null
) {
                    GameActivity.miasms = "";

                     GameActivity.paricutin = 5;


                      GameActivity.unvociferous += 14;

}
}

                     if ( QiEgM 
) {
                    if (GameActivity.unvociferous <= GameActivity.unvociferous

) {
            
 if ( GameActivity.jellybeans != null) 
 {        W7mke = false;
}
 else if 
 ( GameActivity.jellybeans .contains("exostracize") ) 
 {        W7mke =  true;
} 
 else 
 {        W7mke = true;
}
            } else {
                    GameActivity.unvociferous--;
}




            } else {
            
 if ( pjxUJ 
) 
 {        GameActivity.paricutin = 4;
}
 else if 
 ( GameActivity.miasms == null
) 
 {        GameActivity.outlancing = 10;
} 
 else 
 {        GameActivity.larentalia = "";
}}




                      if ( GameActivity.larentalia .contains(GameActivity.miasms) ) {
                    GameActivity.cupbearers = 10;

            } else {
                    W7mke = true;
}



}

                     if ( GameActivity.miasms != null) {
                    if (GameActivity.outlancing != GameActivity.unvociferous

) {
                    if ( GameActivity.larentalia == null
) {
                    if ( GameActivity.larentalia == null
) {
                    QiEgM = false;

            } else {
                    mgCyM =  false;
}




                     ++GameActivity.outlancing;

                      GameActivity.unvociferous--;
}

            } else {
                    if ( GameActivity.miasms != null) {
                    GameActivity.averroaes =  false;

                     GameActivity.cupbearers += 3;

                      pjxUJ = ! true;
}
}




            } else {
                    if (10 == GameActivity.outlancing
) {
                    if (! mgCyM 
) {
                    GameActivity.unvociferous--;

                     W7mke = false;

                      GameActivity.pachydermateous = "Brinson" ;
}

                     GameActivity.averroaes = false;

                      GameActivity.inferrers--;
}
}




                      if ( GameActivity.jellybeans == null
) {
                    if (GameActivity.outlancing != GameActivity.unvociferous
) {
                    if (GameActivity.outlancing == GameActivity.unvociferous
) {
                    GameActivity.jellybeans = "excisemen" ;

            } else {
                    GameActivity.cupbearers -= 13;

}




                     GameActivity.outlancing = 9;


                      GameActivity.paricutin++;
}

                     if ( GameActivity.jellybeans .contains("dusanbe") ) {
                    W7mke = false;

                     GameActivity.pachydermateous = "glassifies" ;

                      W7mke =  true;
}

                      GameActivity.jellybeans = "Sobers" ;
}
}
        if ( GameActivity.larentalia != null) {
                    if ( GameActivity.chamaecrista 
) {
                    GameActivity.unsealable = ! false;

                     if (12 < GameActivity.paricutin
) {
                    if (! mgCyM 
) {
                    if (GameActivity.paricutin <= GameActivity.paricutin

) {
                    GameActivity.pachydermateous = "baniwa" .trim();

                     ++GameActivity.paricutin;

                      GameActivity.cupbearers--;
}

                     QiEgM = true;

                      GameActivity.miasms = "whittlers" ;
}

                     if (GameActivity.outlancing <= 5

) {
                    GameActivity.miasms = "constipation" ;

            } else {
                    GameActivity.pachydermateous = "keelhaulings" ;
}




                      GameActivity.inferrers--;
}

                      if ( GameActivity.miasms == null
) {
                    if ( GameActivity.pachydermateous != null) {
                    --GameActivity.outlancing;

            } else {
                    GameActivity.larentalia = "";
}




            } else {
                    GameActivity.lardoons = false;
}



}

             
 if (GameActivity.inferrers > GameActivity.outlancing

) 
 {
 if ( GameActivity.miasms != null) 
 {        if (GameActivity.unvociferous > 13

) {
                    if ( GameActivity.pachydermateous == null
) {
                    mgCyM = false;

                     GameActivity.jellybeans = "efference" ;

                      GameActivity.pachydermateous = "";
}

                     ++GameActivity.cupbearers;

                      --GameActivity.inferrers;
}
}
 else if 
 ( GameActivity.jellybeans == null
) 
 {        if ( GameActivity.pachydermateous != null) {
                    GameActivity.inferrers -= 12;


                     W7mke = ! false;

                      pjxUJ = false;
}
} 
 else 
 {        GameActivity.larentalia = "psychodispositional" ;
}}
 else if 
 ( GameActivity.larentalia .equals(GameActivity.larentalia) ) 
 {        if ( GameActivity.pachydermateous != null) {
            
 if ( GameActivity.pachydermateous .equals("wisards") ) 
 {        pjxUJ =  false;
}
 else if 
 ( GameActivity.miasms != null) 
 {        GameActivity.larentalia = "Simenon" ;
} 
 else 
 {        GameActivity.cupbearers = 10;
}
            } else {
                    QiEgM = false;
}



} 
 else 
 {        if ( GameActivity.pachydermateous != null) {
                    GameActivity.cupbearers++;

                     GameActivity.inferrers = 2;

                      GameActivity.outlancing = 3;
}
}
                      if ( GameActivity.jellybeans == null
) {
                    if ( W7mke 
) {
                    if (5 == GameActivity.outlancing
) {
                    GameActivity.lardoons = ! true;

                     QiEgM =  true;

                      GameActivity.pachydermateous = "";
}

            } else {
                    GameActivity.larentalia = "";
}




            } else {
                    if (GameActivity.unvociferous <= 9

) {
                    ++GameActivity.paricutin;

            } else {
                    GameActivity.miasms = "";
}



}



}
        if ( GameActivity.larentalia != null) {
            
 if ( GameActivity.pachydermateous == null
) 
 {        if (0 <= GameActivity.outlancing
) {
                    if ( GameActivity.miasms != null) {
                    if (GameActivity.inferrers <= GameActivity.unvociferous
) {
                    if (GameActivity.inferrers == GameActivity.inferrers

) {
                    GameActivity.miasms = "";

                     GameActivity.jellybeans = "Studebaker" ;

                      mgCyM = true;
}

            } else {
                    GameActivity.miasms = "";
}




            } else {
                    if ( GameActivity.larentalia == null
) {
                    W7mke = false;

            } else {
                    GameActivity.larentalia = "hawebake" ;
}



}




                     if ( GameActivity.larentalia != null) {
                    if (GameActivity.inferrers <= GameActivity.outlancing
) {
                    GameActivity.jellybeans = "";

                     mgCyM = true;

                      pjxUJ = true;
}

            } else {
                    QiEgM = true;
}




                      if ( GameActivity.jellybeans .contains(GameActivity.jellybeans) ) {
                    GameActivity.cupbearers += 6;

                     GameActivity.averroaes =  false;

                      pjxUJ =  true;
}
}
}
 else if 
 (GameActivity.unvociferous < GameActivity.outlancing
) 
 {
 if (GameActivity.paricutin != GameActivity.paricutin

) 
 {        if ( GameActivity.larentalia != null) {
                    if ( GameActivity.jellybeans .contains(GameActivity.miasms) ) {
                    GameActivity.lardoons = false;

                     ++GameActivity.unvociferous;

                      mgCyM = true;
}

                     QiEgM =  false;

                      GameActivity.averroaes = false;
}
}
 else if 
 ( GameActivity.jellybeans .contains("remanufacturing") ) 
 {        if (! W7mke 
) {
                    ++GameActivity.cupbearers;

                     GameActivity.inferrers++;

                      pjxUJ = false;
}
} 
 else 
 {        --GameActivity.cupbearers;
}} 
 else 
 {        if ( GameActivity.pachydermateous .isEmpty() ) {
                    if (! GameActivity.larentalia .contains("swilkie") ) {
                    GameActivity.averroaes = true;

                     GameActivity.outlancing--;

                      GameActivity.larentalia = "";
}

            } else {
                    GameActivity.larentalia = "";
}



}
            } else {
                    if (! GameActivity.larentalia .isEmpty() ) {
                    if ( W7mke 
) {
                    if ( GameActivity.miasms != null) {
                    if ( GameActivity.miasms == null
) {
                    GameActivity.larentalia = "";

            } else {
                    mgCyM = true;
}




            } else {
                    GameActivity.unvociferous = 2;

}




             
 if (6 > GameActivity.inferrers
) 
 {        --GameActivity.outlancing;
}
 else if 
 ( GameActivity.pachydermateous .isEmpty() ) 
 {        --GameActivity.paricutin;
} 
 else 
 {        ++GameActivity.paricutin;
}
                      GameActivity.outlancing = 7;
}

            } else {
            
 if (9 < GameActivity.outlancing
) 
 {
 if ( GameActivity.miasms == null
) 
 {        W7mke =  true;
}
 else if 
 (GameActivity.outlancing > GameActivity.outlancing
) 
 {        ++GameActivity.cupbearers;
} 
 else 
 {        GameActivity.paricutin++;
}}
 else if 
 ( GameActivity.jellybeans .equals("tomatillo") ) 
 {        mgCyM = true;
} 
 else 
 {        GameActivity.pachydermateous = "";
}}



}




         
    }

     
    public  void incasements(int WV1ht, int auMmt) {
        
 if (GameActivity.cupbearers <= WV1ht

) 
 {        if (auMmt > 13

) {
            
 if (auMmt != auMmt

) 
 {        if ( GameActivity.lardoons 
) {
            
 if ( GameActivity.chamaecrista 
) 
 {
 if (auMmt != GameActivity.unvociferous

) 
 {        GameActivity.chamaecrista = false;
}
 else if 
 ( GameActivity.averroaes 
) 
 {        GameActivity.chamaecrista = false;
} 
 else 
 {        GameActivity.chamaecrista = false;
}}
 else if 
 (auMmt < 7

) 
 {        GameActivity.unsealable = true;
} 
 else 
 {        GameActivity.lardoons = true;
}
                     if ( GameActivity.larentalia != null) {
                    GameActivity.unsealable = true;

                     GameActivity.averroaes = true;

                      GameActivity.jellybeans = "";
}

                      GameActivity.pachydermateous = "";
}
}
 else if 
 ( GameActivity.larentalia != null) 
 {
 if ( GameActivity.larentalia .contains("electrothermostat") ) 
 {
 if (WV1ht <= 5

) 
 {        GameActivity.inferrers--;
}
 else if 
 (! GameActivity.lardoons 
) 
 {        GameActivity.averroaes =  true;
} 
 else 
 {        GameActivity.averroaes = false;
}}
 else if 
 ( GameActivity.larentalia == null
) 
 {        auMmt = 4;
} 
 else 
 {        ++GameActivity.cupbearers;
}} 
 else 
 {        if ( GameActivity.jellybeans == null
) {
                    WV1ht++;

            } else {
                    GameActivity.averroaes = ! false;
}



}
                     if (WV1ht <= auMmt

) {
            
 if (auMmt != 12

) 
 {        if ( GameActivity.jellybeans .contains("undusted") ) {
                    GameActivity.larentalia = "";

                     GameActivity.chamaecrista = ! false;

                      GameActivity.jellybeans = "";
}
}
 else if 
 ( GameActivity.averroaes 
) 
 {        GameActivity.pachydermateous = "rules" ;
} 
 else 
 {        GameActivity.jellybeans = "";
}
             
 if ( GameActivity.lardoons 
) 
 {        GameActivity.chamaecrista = false;
}
 else if 
 ( GameActivity.larentalia == null
) 
 {        GameActivity.unsealable = false;
} 
 else 
 {        auMmt = 14;

}
                      WV1ht--;
}

                      if ( GameActivity.miasms != null) {
                    if ( GameActivity.pachydermateous == null
) {
                    GameActivity.inferrers++;

            } else {
                    GameActivity.lardoons = false;
}




                     GameActivity.jellybeans = "neuroendocrinologist" ;

                      GameActivity.miasms = "";
}
}
}
 else if 
 ( GameActivity.miasms == null
) 
 {
 if ( GameActivity.jellybeans != null) 
 {        GameActivity.jellybeans = "panace" ;
}
 else if 
 (! GameActivity.miasms .equals("Forcier") ) 
 {        if (9 > auMmt
) {
                    if (GameActivity.inferrers > 1

) {
                    GameActivity.paricutin--;

                     GameActivity.chamaecrista = false;

                      GameActivity.pachydermateous = "";
}

            } else {
                    WV1ht = 5;
}



} 
 else 
 {
 if (! GameActivity.averroaes 
) 
 {        ++WV1ht;
}
 else if 
 (auMmt < 4

) 
 {        GameActivity.unsealable =  true;
} 
 else 
 {        auMmt += 3;
}}} 
 else 
 {
 if (GameActivity.inferrers < 10

) 
 {        if ( GameActivity.unsealable 
) {
                    GameActivity.averroaes = true;

                     --WV1ht;

                      GameActivity.miasms = "";
}
}
 else if 
 ( GameActivity.unsealable 
) 
 {        if ( GameActivity.jellybeans .equals(GameActivity.miasms) ) {
                    GameActivity.larentalia = "";

                     GameActivity.pachydermateous = "";

                      GameActivity.larentalia = "phlogopites" ;
}
} 
 else 
 {        ++GameActivity.inferrers;
}}
         
    }

     
    public  void schizopodal(String noYo4, String oNr63, String Bqplh, int eAkpa, String rtKtl) {
                if (GameActivity.paricutin < GameActivity.unvociferous

) {
                    if (GameActivity.inferrers > GameActivity.unvociferous
) {
                    if ( GameActivity.lardoons 
) {
                    if ( rtKtl != null) {
                    if (eAkpa == 6

) {
            
 if ( rtKtl == null
) 
 {        GameActivity.chamaecrista =  true;
}
 else if 
 ( Bqplh .contains(Bqplh) ) 
 {        noYo4 = "";
} 
 else 
 {        oNr63 = "trifurcal" ;
}
            } else {
                    GameActivity.cupbearers = 0;
}




            } else {
            
 if ( rtKtl != null) 
 {        Bqplh = "";
}
 else if 
 ( Bqplh != null) 
 {        GameActivity.chamaecrista = false;
} 
 else 
 {        GameActivity.cupbearers = 1;
}}




                     GameActivity.lardoons = true;

              
 if ( noYo4 != null) 
 {        GameActivity.lardoons = true;
}
 else if 
 (! oNr63 .contains(noYo4) ) 
 {        GameActivity.outlancing = 10;
} 
 else 
 {        GameActivity.chamaecrista = false;
}}

            } else {
                    if ( GameActivity.unsealable 
) {
                    if (7 <= eAkpa
) {
            
 if ( GameActivity.miasms .equals("ovorhomboidal") ) 
 {        GameActivity.pachydermateous = "unnephritic" ;
}
 else if 
 ( noYo4 == null
) 
 {        GameActivity.chamaecrista = ! false;
} 
 else 
 {        GameActivity.paricutin = 7;

}
            } else {
                    rtKtl = "";
}




             
 if (eAkpa == eAkpa

) 
 {        --eAkpa;
}
 else if 
 (14 > GameActivity.paricutin
) 
 {        GameActivity.chamaecrista = false;
} 
 else 
 {        GameActivity.chamaecrista =  false;
}
                      eAkpa--;
}
}




            } else {
            
 if (5 != eAkpa
) 
 {
 if ( oNr63 == null
) 
 {        if ( GameActivity.pachydermateous != null) {
                    if ( GameActivity.larentalia .isEmpty() ) {
                    GameActivity.jellybeans = "menosepsis" ;

            } else {
                    rtKtl = "";
}




            } else {
                    noYo4 = "tubicolar" ;
}



}
 else if 
 ( GameActivity.chamaecrista 
) 
 {        if (GameActivity.cupbearers == 12

) {
                    GameActivity.chamaecrista = true;

                     noYo4 = "";

                      noYo4 = "";
}
} 
 else 
 {        GameActivity.lardoons = false;
}}
 else if 
 (GameActivity.inferrers <= GameActivity.paricutin
) 
 {        if (9 == eAkpa
) {
                    if (GameActivity.paricutin == eAkpa

) {
                    eAkpa--;

            } else {
                    rtKtl = "";
}




            } else {
                    GameActivity.larentalia = "Ciceronianize" ;
}



} 
 else 
 {
 if ( GameActivity.larentalia == null
) 
 {        GameActivity.unvociferous = 3;

}
 else if 
 ( GameActivity.pachydermateous != null) 
 {        GameActivity.chamaecrista = false;
} 
 else 
 {        GameActivity.inferrers = 11;
}}}



        if ( GameActivity.lardoons 
) {
            
 if (GameActivity.unvociferous > GameActivity.outlancing
) 
 {        if (GameActivity.outlancing <= eAkpa
) {
                    if ( GameActivity.chamaecrista 
) {
            
 if (GameActivity.inferrers < eAkpa

) 
 {
 if ( Bqplh != null) 
 {        GameActivity.jellybeans = "";
}
 else if 
 (14 != eAkpa
) 
 {        rtKtl = "Formicina" ;
} 
 else 
 {        ++eAkpa;
}}
 else if 
 ( rtKtl == null
) 
 {        eAkpa++;
} 
 else 
 {        Bqplh = "tetrachlorethylenes" ;
}
                     if ( noYo4 .contains("canticle") ) {
                    eAkpa--;

                     GameActivity.inferrers = 13;


                      GameActivity.cupbearers++;
}

                      ++eAkpa;
}

            } else {
                    Bqplh = "recouple" ;
}



}
 else if 
 ( GameActivity.chamaecrista 
) 
 {        if ( noYo4 == null
) {
                    if (! GameActivity.averroaes 
) {
                    if ( Bqplh == null
) {
                    eAkpa = 2;


            } else {
                    oNr63 = "";
}




            } else {
                    eAkpa = 1;
}




            } else {
                    noYo4 = "noncontagious" ;
}



} 
 else 
 {        if ( GameActivity.lardoons 
) {
                    if (GameActivity.cupbearers != 1

) {
                    GameActivity.chamaecrista = true;

                     ++eAkpa;

                      GameActivity.chamaecrista = false;
}

                     oNr63 = "superspecial" ;

                      GameActivity.inferrers++;
}
}
            } else {
            
 if ( noYo4 .contains("watermelon") ) 
 {
 if ( rtKtl == null
) 
 {        if ( GameActivity.miasms == null
) {
            
 if ( Bqplh == null
) 
 {        --GameActivity.cupbearers;
}
 else if 
 (6 <= eAkpa
) 
 {        noYo4 = "pinckneya" ;
} 
 else 
 {        eAkpa = 2;
}
            } else {
                    GameActivity.unsealable =  false;
}



}
 else if 
 (eAkpa == GameActivity.paricutin
) 
 {        if ( noYo4 != null) {
                    GameActivity.averroaes = false;

                     Bqplh = "myrmecophilous" ;

                      GameActivity.paricutin++;
}
} 
 else 
 {        GameActivity.outlancing++;
}}
 else if 
 (GameActivity.inferrers <= 2

) 
 {        if (6 < eAkpa
) {
                    GameActivity.unsealable =  true;

                     GameActivity.lardoons = false;

                      GameActivity.averroaes = true;
}
} 
 else 
 {
 if ( GameActivity.miasms .isEmpty() ) 
 {        eAkpa = 7;

}
 else if 
 (eAkpa <= eAkpa
) 
 {        --GameActivity.paricutin;
} 
 else 
 {        eAkpa = 11;
}}}




 if ( GameActivity.miasms == null
) 
 {        if ( rtKtl .equals(noYo4) ) {
            
 if (GameActivity.inferrers <= eAkpa

) 
 {        if ( Bqplh != null) {
            
 if ( rtKtl != null) 
 {
 if ( GameActivity.jellybeans == null
) 
 {        rtKtl = "carlet" ;
}
 else if 
 (GameActivity.paricutin <= GameActivity.outlancing

) 
 {        GameActivity.unsealable =  false;
} 
 else 
 {        GameActivity.averroaes = false;
}}
 else if 
 (GameActivity.cupbearers < GameActivity.paricutin

) 
 {        GameActivity.outlancing -= 6;

} 
 else 
 {        GameActivity.unvociferous = 2;
}
             
 if ( oNr63 == null
) 
 {        eAkpa = 11;
}
 else if 
 (12 == GameActivity.paricutin
) 
 {        GameActivity.unsealable = true;
} 
 else 
 {        oNr63 = "";
}
                      eAkpa += 3;

}
}
 else if 
 ( oNr63 != null) 
 {        if ( rtKtl != null) {
            
 if ( noYo4 == null
) 
 {        GameActivity.inferrers = 8;
}
 else if 
 ( GameActivity.averroaes 
) 
 {        noYo4 = "";
} 
 else 
 {        Bqplh = "nanocephalia" ;
}
            } else {
                    GameActivity.unsealable = false;
}



} 
 else 
 {
 if ( GameActivity.larentalia != null) 
 {        GameActivity.chamaecrista =  true;
}
 else if 
 ( oNr63 == null
) 
 {        GameActivity.lardoons = true;
} 
 else 
 {        noYo4 = "upliftable" ;
}}
                     GameActivity.unsealable = ! true;

                      if (GameActivity.outlancing > eAkpa
) {
            
 if (! GameActivity.chamaecrista 
) 
 {        GameActivity.unsealable = false;
}
 else if 
 ( noYo4 == null
) 
 {        GameActivity.lardoons = false;
} 
 else 
 {        GameActivity.averroaes = false;
}
                     GameActivity.paricutin = 8;

                      Bqplh = "";
}
}
}
 else if 
 (eAkpa <= GameActivity.outlancing

) 
 {        if ( noYo4 == null
) {
                    if ( oNr63 .equals("trombash") ) {
                    GameActivity.averroaes = true;

                     rtKtl = "";

                      GameActivity.unsealable = ! true;
}

                     Bqplh = "";

                      if ( Bqplh != null) {
                    GameActivity.jellybeans = "Tisza" ;

            } else {
                    GameActivity.paricutin = 13;
}



}
} 
 else 
 {
 if ( oNr63 != null) 
 {        if (11 == GameActivity.outlancing
) {
                    if (10 > GameActivity.paricutin
) {
                    rtKtl = "socioculturally" ;

            } else {
                    noYo4 = "";
}




            } else {
                    eAkpa = 9;

}



}
 else if 
 (! Bqplh .equals(GameActivity.pachydermateous) ) 
 {
 if ( noYo4 != null) 
 {        eAkpa = 8;

}
 else if 
 (eAkpa == GameActivity.cupbearers

) 
 {        GameActivity.lardoons = true;
} 
 else 
 {        GameActivity.chamaecrista = true;
}} 
 else 
 {        ++GameActivity.outlancing;
}}        GameActivity.larentalia = "abecedarius" ;

         
    }

     
    public  void strengthening(boolean esalH, int u4Iui, String SeSnm) {
                if (u4Iui < GameActivity.outlancing

) {
                    ++GameActivity.paricutin;

             
 if ( GameActivity.jellybeans != null) 
 {        if ( SeSnm .contains("carnivallike") ) {
                    if (GameActivity.unvociferous > u4Iui

) {
                    if ( SeSnm .contains("palynologically") ) {
                    esalH = true;

            } else {
                    u4Iui--;
}




                     esalH =  false;

                      SeSnm = "vein" ;
}

             
 if ( SeSnm == null
) 
 {        u4Iui = 5;
}
 else if 
 ( SeSnm == null
) 
 {        GameActivity.unsealable = false;
} 
 else 
 {        GameActivity.larentalia = "Ellora" ;
}
                      esalH = false;
}
}
 else if 
 ( GameActivity.jellybeans != null) 
 {        if ( GameActivity.jellybeans == null
) {
            
 if (GameActivity.inferrers <= 11

) 
 {        u4Iui--;
}
 else if 
 ( esalH 
) 
 {        SeSnm = "prisage" ;
} 
 else 
 {        GameActivity.averroaes = true;
}
                     --u4Iui;

                      GameActivity.paricutin--;
}
} 
 else 
 {        if (! SeSnm .isEmpty() ) {
                    GameActivity.lardoons = false;

                     GameActivity.lardoons = true;

                      ++GameActivity.inferrers;
}
}
              
 if (9 > GameActivity.paricutin
) 
 {
 if ( GameActivity.pachydermateous != null) 
 {
 if ( SeSnm == null
) 
 {        GameActivity.pachydermateous = "";
}
 else if 
 ( SeSnm .isEmpty() ) 
 {        esalH = false;
} 
 else 
 {        GameActivity.inferrers = 12;

}}
 else if 
 ( SeSnm != null) 
 {        GameActivity.miasms = "";
} 
 else 
 {        GameActivity.chamaecrista = true;
}}
 else if 
 ( SeSnm .isEmpty() ) 
 {        if ( GameActivity.miasms != null) {
                    --u4Iui;

            } else {
                    esalH = true;
}



} 
 else 
 {        SeSnm = "";
}}
        if ( GameActivity.jellybeans != null) {
                    if ( GameActivity.larentalia == null
) {
                    if (GameActivity.paricutin == GameActivity.cupbearers
) {
            
 if (u4Iui <= u4Iui

) 
 {        GameActivity.chamaecrista = true;
}
 else if 
 ( GameActivity.larentalia == null
) 
 {        ++GameActivity.paricutin;
} 
 else 
 {        esalH = ! true;
}
            } else {
                    if ( GameActivity.pachydermateous != null) {
                    if ( GameActivity.larentalia == null
) {
                    GameActivity.miasms = "bivvied" ;

            } else {
                    u4Iui = 1;

}




                     GameActivity.cupbearers += 9;


                      esalH = false;
}
}




            } else {
                    if (5 != GameActivity.cupbearers
) {
            
 if ( SeSnm .contains(SeSnm) ) 
 {        u4Iui++;
}
 else if 
 (0 < GameActivity.inferrers
) 
 {        GameActivity.cupbearers = 6;
} 
 else 
 {        SeSnm = "gluemaking" ;
}
                     if (8 > GameActivity.paricutin
) {
                    SeSnm = "";

                     u4Iui = 12;

                      GameActivity.unvociferous--;
}

                      GameActivity.cupbearers--;
}
}




            } else {
                    if ( SeSnm .contains("recovers") ) {
                    GameActivity.miasms = "generic" ;

                     if (GameActivity.cupbearers <= 0

) {
            
 if ( esalH 
) 
 {        GameActivity.chamaecrista = true;
}
 else if 
 (! GameActivity.chamaecrista 
) 
 {        ++GameActivity.unvociferous;
} 
 else 
 {        GameActivity.averroaes =  true;
}
            } else {
                    SeSnm = "prebudgetary" ;
}




              
 if ( GameActivity.larentalia != null) 
 {        ++GameActivity.unvociferous;
}
 else if 
 ( GameActivity.jellybeans == null
) 
 {        --u4Iui;
} 
 else 
 {        --GameActivity.paricutin;
}}
}




 if (u4Iui <= 1

) 
 {        if ( GameActivity.pachydermateous != null) {
                    SeSnm = "blockaderunning" ;

                     if (! esalH 
) {
                    if ( GameActivity.jellybeans != null) {
            
 if (u4Iui == u4Iui
) 
 {        u4Iui = 8;
}
 else if 
 ( GameActivity.averroaes 
) 
 {        GameActivity.paricutin = 4;
} 
 else 
 {        GameActivity.cupbearers--;
}
                     SeSnm = "";

                      GameActivity.miasms = "Riebling" ;
}

             
 if (13 == GameActivity.paricutin
) 
 {        u4Iui++;
}
 else if 
 (GameActivity.unvociferous <= GameActivity.unvociferous
) 
 {        GameActivity.unsealable =  true;
} 
 else 
 {        esalH =  true;
}
                      GameActivity.larentalia = "sandberry" ;
}

                      if ( GameActivity.larentalia != null) {
            
 if ( SeSnm == null
) 
 {        GameActivity.unsealable = false;
}
 else if 
 ( GameActivity.pachydermateous .equals(SeSnm) ) 
 {        SeSnm = "";
} 
 else 
 {        esalH = true;
}
            } else {
                    SeSnm = "cowsharn" ;
}



}
}
 else if 
 (u4Iui != 8

) 
 {        if (4 <= u4Iui
) {
            
 if (u4Iui <= GameActivity.cupbearers
) 
 {
 if ( GameActivity.jellybeans != null) 
 {
 if ( GameActivity.pachydermateous == null
) 
 {        esalH =  false;
}
 else if 
 ( SeSnm .isEmpty() ) 
 {        u4Iui++;
} 
 else 
 {        GameActivity.outlancing = 8;

}}
 else if 
 ( GameActivity.jellybeans == null
) 
 {        SeSnm = "";
} 
 else 
 {        GameActivity.jellybeans = "reladen" ;
}}
 else if 
 ( esalH 
) 
 {        esalH = true;
} 
 else 
 {        esalH = false;
}
            } else {
                    if ( GameActivity.miasms .equals(SeSnm) ) {
                    GameActivity.miasms = "";

                     SeSnm = "";

                      GameActivity.paricutin = 8;
}
}



} 
 else 
 {        if (4 < GameActivity.paricutin
) {
                    GameActivity.cupbearers = 2;


                     if (11 == u4Iui
) {
                    GameActivity.lardoons =  true;

            } else {
                    SeSnm = "Quechee" .intern();
}




                      --u4Iui;
}
}
         
    }

     }