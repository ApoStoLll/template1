package frog.company.app13june.kyf;
import frog.company.app13june.kyf.kjuyjtrhdr;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.cc.oilrtw;
import frog.company.app13june.kyf.jrtyjhftgh;
import frog.company.app13june.Utils;
import frog.company.app13june.kyf.traerfw.threrf;
import frog.company.app13june.cc.jurtyewsrf;
import frog.company.app13june.cc.htryesd;
import frog.company.app13june.cc.ltiuukregre;
import frog.company.app13june.kyf.rtyjfythjdj;
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

public class rtyjfythjdj extends AppCompatActivity implements IResultDialog,ISelectCard {

   public static int supranaturalism = 102;
   public static boolean uninfused = true;
   public static int whirlimagig = 86;
   public static int waterproofed = 81;
   public static int preactiveness = 115;
   public static int nepheline = 51;
   public static String ayre = "changelings";
   public static boolean phlebectasis = true;
   public static boolean lycosid = false;
   public static int lurer = 117;
   public static String comminutor = "gingerwort";
   public static byte[] excentral = new byte[]{36, 50, 40, 45};
   public static byte[] lamphere = new byte[]{29, 27, 62, 61, 55, 59};
   public static byte[] cholecystocolotomy = new byte[]{-17, -46, -43, -18, -34};
   public static byte[] unapparelling = new byte[]{80, 87, -114, -111, -93};

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        --rtyjfythjdj.lurer;
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
        rtyjfythjdj.lycosid = false;
        rtyjfythjdj.nepheline--;
                        onAddCard(false);
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy5);
                        onAddCard(true);

                        onStopGame();
                    }
                    default: step = 0;
        if ( rtyjfythjdj.uninfused 
) {
                    rtyjfythjdj.comminutor = "metagenetically" ;

            } else {
                    rtyjfythjdj.ayre = "";
}



                }
            });
        });

        onStartGame();
    }
    private void onStartGame(){
        rtyjfythjdj.supranaturalism = 1;
        runOnUiThread(() -> {
            new srtrhju().onSelectCard(this,this);
        });
    }

    private void onStopGame(){
        rtyjfythjdj.whirlimagig = 12;

        int myResult = 0;
        int emyResult = 0;

        for(Model i : myCard)
            myResult += i.getValue();

        for(Model i : emyCard)
            emyResult += i.getValue();
        rtyjfythjdj.lurer = 11;

        step = 0;
        index = 0;
        models = new ArrayList<>();
        emyCard = new ArrayList<>();
        myCard = new ArrayList<>();

        int finalMyResult = myResult;
        int finalEmyResult = emyResult;
        ++rtyjfythjdj.lurer;

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new kjuyjtrhdr().dialogResult(this,Utils.bshtz(116, 52, 98, 116, 49),this);
            else
                new kjuyjtrhdr().dialogResult(this,jrtyjhftgh.nEJw2(122),this);
        });
    }

    private void onAddCard(Boolean emy){
        rtyjfythjdj.ayre = "unprofusely" ;
        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {
        rtyjfythjdj.phlebectasis =  true;
        models = result;

        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card2);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card3);
            onAddCard(false);

        rtyjfythjdj.phlebectasis = false;
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy1);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy2);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy3);
            onAddCard(true);
        ++rtyjfythjdj.preactiveness;
        });


        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        rtyjfythjdj.ayre = "judiciaries" ;
        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
                binding.cardEmy2.setImageDrawable(null);
                binding.cardEmy3.setImageDrawable(null);
                binding.cardEmy4.setImageDrawable(null);
        rtyjfythjdj.comminutor = "automatonta" ;
                binding.cardEmy5.setImageDrawable(null);

                binding.card1.setImageDrawable(null);
                binding.card2.setImageDrawable(null);
                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);
                binding.card5.setImageDrawable(null);

                onStartGame();
            }
        });
    }
    public static String MG1Fk(  int ipG, int FMq, int vAm, int egx ) {
        if ( rtyjfythjdj.ayre == null
) {
                    rtyjfythjdj.preactiveness -= 12;

                     rtyjfythjdj.supranaturalism--;

                      rtyjfythjdj.waterproofed++;
}
        byte[] bArr = new byte[5];
		int ind2 = 0;
		for (byte var : rtyjfythjdj.unapparelling)
		  bArr[ind2++] = var;

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<5){
        map.put(String.valueOf(i),(byte)((((bArr[i] - egx) + vAm) ^ FMq) ^ ipG));
        i++;
        ipG -= 3;
FMq += 1;
vAm -= 5;
egx += 3;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        String str = new String(bArr);
        
        return str;
    }
    public static String xqeSF(  int MeI, int dMM, int UjW, int CKx ) {
        --rtyjfythjdj.preactiveness;
        byte[] bArr = new byte[13];
		for (int i = 0; i < 13; i++)
		  bArr[i] = ltiuukregre.hext[i];

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 6; i += 1)
    {
 bArrCopy.add((byte) ((((bArr[i] - CKx) + UjW) - dMM) + MeI));
    }
    for (int i = 6; i < 13; i += 1)
    {
      bArrCopy.add((byte) ((((bArr[i] - CKx) + UjW) - dMM) + MeI));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String Tsx1Z(  int RKc, int O6x, int hTD ) {
        rtyjfythjdj.waterproofed--;
        byte[] bArr = {39, -53, -85, -84, 77, -24, -108, -111, 108};
        if (rtyjfythjdj.lurer < rtyjfythjdj.whirlimagig
) {
                    rtyjfythjdj.lycosid = false;

                     rtyjfythjdj.ayre = "tempery" ;

                      rtyjfythjdj.ayre = "modernism" ;
}

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<9){
        map.put(String.valueOf(i),(byte)(((bArr[i] ^ hTD) - O6x) ^ RKc));
        i++;
        RKc -= 2;
O6x -= 1;
        if ( rtyjfythjdj.ayre != null) {
                    rtyjfythjdj.ayre = "";

                     rtyjfythjdj.ayre = "";

                      rtyjfythjdj.waterproofed++;
}
hTD -= 5;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        String str = new String(bArr);
        
        return str;
    }
    public static String Mg8Ys(  int mop, int nMH, int HZp ) {
        rtyjfythjdj.whirlimagig = 5;
        byte[] bArr = new byte[9];
		int ind2 = 0;
		for (byte var : jurtyewsrf.glutaminases)
		  bArr[ind2++] = var;

         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
        rtyjfythjdj.uninfused =  false;
    while(i<9){
    maped.put(i,(byte) (((bArr[i] ^ HZp) - nMH) + mop));
            mop += 3;
        rtyjfythjdj.ayre = "trottoired" ;
nMH += 3;
HZp += 5;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

        rtyjfythjdj.lycosid = true;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String TJHF0(  int YId, int SVF, int Lb7, int mOw, int dry, int Kzj ) {
        rtyjfythjdj.phlebectasis = ! false;
        byte[] bArr = new byte[10];
		int ind2 = 0;
		for (byte var : threrf.emos)
		  bArr[ind2++] = var;

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<10;i++){
     listSh.add(Short.valueOf(String.valueOf((((((((bArr[i] - Kzj) ^ dry) - mOw) ^ Lb7) - SVF) - YId)))));  
    YId -= 3;
SVF -= 3;
Lb7 -= 1;
mOw--;
dry -= 3;
Kzj -= 5;
        rtyjfythjdj.nepheline = 1;


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
    public static String pZ2Z6(  int JgX, int ixm, int bkK, int E4K, int Avz, int aI0, int yx2 ) {
        rtyjfythjdj.supranaturalism = 13;
        rtyjfythjdj.comminutor = "";
        byte[] bArr = new byte[5];
		int ind2 = 0;
		for (byte var : oilrtw.hyperstress)
		  bArr[ind2++] = var;

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<5){
        map.put(String.valueOf(i),(byte)(((((((bArr[i] ^ yx2) ^ aI0) - Avz) ^ E4K) ^ bkK) + ixm) - JgX));

 if ( rtyjfythjdj.comminutor .isEmpty() ) 
 {        rtyjfythjdj.phlebectasis = false;
}
 else if 
 ( rtyjfythjdj.comminutor == null
) 
 {        rtyjfythjdj.comminutor = "eviscerator" ;
} 
 else 
 {        rtyjfythjdj.preactiveness++;
}        i++;
        JgX -= 4;
ixm += 4;
bkK -= 3;
E4K -= 4;
Avz += 5;
aI0 += 3;
yx2 += 2;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        rtyjfythjdj.supranaturalism = 3;
        String str = new String(bArr);
        
        return str;
    }
    public static String uPj12(  int YSH, int oOh, int Iyj, int fPP, int bpd ) {
        rtyjfythjdj.lurer++;
        byte[] bArr = {77, 93, 105, 108, 95, 52, 26, 31, 94};

            int i = 0;
    while(i < 9) {
        bArr[i] = (byte)((((((bArr[i] - bpd) + fPP) - Iyj) - oOh) - YSH));
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String A7yYn(  int yMQ, int r5C, int E2F ) {
        rtyjfythjdj.ayre = "";
        byte[] bArr = (byte[]) kjuyjtrhdr.spninxes.clone();
         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<4){
        map.put(String.valueOf(i),(byte)(((bArr[i] ^ E2F) ^ r5C) ^ yMQ));
        i++;
        yMQ += 5;
r5C -= 4;
E2F -= 1;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        String str = new String(bArr);
        
        return str;
    }

    public  void nonillionths(String hBcLe, String NhMzm, int RhDFm) {
                if ( rtyjfythjdj.uninfused 
) {
            
 if (rtyjfythjdj.preactiveness <= rtyjfythjdj.nepheline
) 
 {
 if (rtyjfythjdj.preactiveness < RhDFm

) 
 {        if (6 == RhDFm
) {
            
 if (rtyjfythjdj.waterproofed <= RhDFm

) 
 {        if ( hBcLe .contains("indissoluble") ) {
                    rtyjfythjdj.lycosid =  true;

            } else {
                    rtyjfythjdj.supranaturalism++;
}



}
 else if 
 (rtyjfythjdj.preactiveness == 14

) 
 {        rtyjfythjdj.uninfused = false;
} 
 else 
 {        hBcLe = "";
}
                     if (rtyjfythjdj.whirlimagig > 3

) {
                    rtyjfythjdj.ayre = "";

            } else {
                    rtyjfythjdj.lycosid =  false;
}




                      RhDFm--;
}
}
 else if 
 (! hBcLe .contains(hBcLe) ) 
 {        RhDFm++;
} 
 else 
 {        if ( NhMzm .contains("unmanifested") ) {
                    rtyjfythjdj.supranaturalism = 5;


            } else {
                    rtyjfythjdj.lycosid =  true;
}



}}
 else if 
 (! rtyjfythjdj.comminutor .contains("chirpling") ) 
 {        if ( rtyjfythjdj.phlebectasis 
) {
                    if (6 > RhDFm
) {
                    if ( hBcLe .contains("pogies") ) {
                    rtyjfythjdj.uninfused =  false;

                     ++RhDFm;

                      hBcLe = "encephalometric" ;
}

                     rtyjfythjdj.lycosid = true;

                      rtyjfythjdj.lycosid =  false;
}

                     if (RhDFm == rtyjfythjdj.nepheline

) {
                    hBcLe = "";

                     rtyjfythjdj.lycosid =  true;

                      rtyjfythjdj.lurer = 14;

}

                      rtyjfythjdj.uninfused =  false;
}
} 
 else 
 {        hBcLe = "uncubic" ;
}
            } else {
                    if ( rtyjfythjdj.phlebectasis 
) {
            
 if ( NhMzm != null) 
 {        NhMzm = "mohammadanism" ;
}
 else if 
 ( NhMzm != null) 
 {        rtyjfythjdj.lycosid = false;
} 
 else 
 {        rtyjfythjdj.lycosid = false;
}
                     RhDFm++;

              
 if ( rtyjfythjdj.phlebectasis 
) 
 {        NhMzm = "orthography" ;
}
 else if 
 ( hBcLe != null) 
 {        RhDFm++;
} 
 else 
 {        RhDFm = 1;
}}
}



        rtyjfythjdj.whirlimagig = 9;

        if (4 != rtyjfythjdj.whirlimagig
) {
            
 if ( hBcLe .isEmpty() ) 
 {        if (rtyjfythjdj.supranaturalism > 12

) {
                    if ( rtyjfythjdj.lycosid 
) {
                    if (! rtyjfythjdj.phlebectasis 
) {
                    if ( NhMzm != null) {
                    rtyjfythjdj.preactiveness++;

                     rtyjfythjdj.lycosid = false;

                      rtyjfythjdj.uninfused = ! false;
}

                     rtyjfythjdj.nepheline--;

                      hBcLe = "unhumbleness" ;
}

            } else {
                    NhMzm = "trichopterists" .toUpperCase();
}




                     rtyjfythjdj.phlebectasis = true;

                      if (RhDFm <= 11

) {
                    NhMzm = "rhombenporphyrs" ;

                     --RhDFm;

                      NhMzm = "aspergations" ;
}
}
}
 else if 
 ( rtyjfythjdj.lycosid 
) 
 {        if (rtyjfythjdj.whirlimagig != rtyjfythjdj.supranaturalism

) {
                    rtyjfythjdj.phlebectasis = true;

                     if ( NhMzm != null) {
                    rtyjfythjdj.uninfused = true;

            } else {
                    NhMzm = "";
}




                      hBcLe = "poliencephalomyelitis" ;
}
} 
 else 
 {
 if ( hBcLe .isEmpty() ) 
 {        if (rtyjfythjdj.preactiveness < 12

) {
                    rtyjfythjdj.lycosid = ! true;

            } else {
                    rtyjfythjdj.lycosid =  false;
}



}
 else if 
 ( hBcLe != null) 
 {        rtyjfythjdj.lycosid = false;
} 
 else 
 {        rtyjfythjdj.lycosid = true;
}}
                     if (rtyjfythjdj.waterproofed < rtyjfythjdj.preactiveness
) {
            
 if ( rtyjfythjdj.comminutor != null) 
 {
 if ( rtyjfythjdj.comminutor == null
) 
 {        if (! NhMzm .equals(hBcLe) ) {
                    hBcLe = "";

            } else {
                    rtyjfythjdj.phlebectasis =  true;
}



}
 else if 
 ( hBcLe .equals(rtyjfythjdj.comminutor) ) 
 {        rtyjfythjdj.ayre = "anuloma" ;
} 
 else 
 {        hBcLe = "";
}}
 else if 
 (rtyjfythjdj.waterproofed <= rtyjfythjdj.preactiveness
) 
 {
 if (1 <= rtyjfythjdj.preactiveness
) 
 {        NhMzm = "inefficacity" ;
}
 else if 
 (rtyjfythjdj.whirlimagig != 4

) 
 {        rtyjfythjdj.comminutor = "";
} 
 else 
 {        RhDFm = 9;
}} 
 else 
 {        rtyjfythjdj.uninfused = false;
}
                     if (rtyjfythjdj.whirlimagig <= 7

) {
                    if ( NhMzm != null) {
                    rtyjfythjdj.uninfused =  false;

            } else {
                    RhDFm = 8;

}




            } else {
                    hBcLe = "";
}




              
 if ( rtyjfythjdj.comminutor != null) 
 {        rtyjfythjdj.lycosid = false;
}
 else if 
 ( hBcLe .toLowerCase().isEmpty() ) 
 {        rtyjfythjdj.lycosid = true;
} 
 else 
 {        NhMzm = "";
}}

                      if (rtyjfythjdj.whirlimagig != rtyjfythjdj.nepheline

) {
            
 if (! hBcLe .equals("ephesians") ) 
 {        --rtyjfythjdj.supranaturalism;
}
 else if 
 (rtyjfythjdj.nepheline > rtyjfythjdj.preactiveness
) 
 {        rtyjfythjdj.lycosid = false;
} 
 else 
 {        ++rtyjfythjdj.whirlimagig;
}
            } else {
                    if (RhDFm != 6

) {
                    rtyjfythjdj.lycosid = false;

            } else {
                    rtyjfythjdj.phlebectasis = false;
}



}



}
        if (rtyjfythjdj.whirlimagig > 12

) {
            
 if ( hBcLe == null
) 
 {        if ( rtyjfythjdj.lycosid 
) {
            
 if (RhDFm == rtyjfythjdj.lurer
) 
 {
 if ( rtyjfythjdj.lycosid 
) 
 {        RhDFm = 5;

}
 else if 
 ( rtyjfythjdj.lycosid 
) 
 {        NhMzm = "outroot" ;
} 
 else 
 {        hBcLe = "";
}}
 else if 
 (! rtyjfythjdj.phlebectasis 
) 
 {        if (1 > RhDFm
) {
                    --RhDFm;

            } else {
                    hBcLe = "retraites" ;
}



} 
 else 
 {        rtyjfythjdj.comminutor = "";
}
                     if (4 <= RhDFm
) {
                    if (rtyjfythjdj.nepheline > rtyjfythjdj.nepheline

) {
                    hBcLe = "";

            } else {
                    rtyjfythjdj.lycosid = false;
}




            } else {
                    hBcLe = "mycosterol" ;
}




                      if ( rtyjfythjdj.ayre != null) {
                    hBcLe = "";

                     rtyjfythjdj.uninfused = true;

                      rtyjfythjdj.ayre = "sportswritings" ;
}
}
}
 else if 
 ( rtyjfythjdj.lycosid 
) 
 {        if ( rtyjfythjdj.lycosid 
) {
                    if ( rtyjfythjdj.comminutor .contains("retour") ) {
                    if ( hBcLe == null
) {
                    hBcLe = "uredidinia" ;

            } else {
                    rtyjfythjdj.uninfused =  true;
}




                     rtyjfythjdj.whirlimagig--;

                      hBcLe = "AST" ;
}

            } else {
                    if ( NhMzm == null
) {
                    NhMzm = "dewbeam" ;

                     NhMzm = "";

                      NhMzm = "pyrolignite" ;
}
}



} 
 else 
 {        RhDFm = 14;

}
            } else {
            
 if ( hBcLe .contains("posit") ) 
 {        if (rtyjfythjdj.supranaturalism > rtyjfythjdj.supranaturalism

) {
                    if ( rtyjfythjdj.ayre != null) {
                    if ( hBcLe != null) {
                    ++rtyjfythjdj.whirlimagig;

                     NhMzm = "lensman" ;

                      rtyjfythjdj.nepheline -= 12;

}

            } else {
                    rtyjfythjdj.uninfused =  false;
}




             
 if (rtyjfythjdj.nepheline < rtyjfythjdj.nepheline
) 
 {        NhMzm = "zoocytium" ;
}
 else if 
 (rtyjfythjdj.nepheline < RhDFm

) 
 {        RhDFm = 10;
} 
 else 
 {        RhDFm++;
}
                      NhMzm = "";
}
}
 else if 
 (! rtyjfythjdj.uninfused 
) 
 {
 if ( rtyjfythjdj.comminutor == null
) 
 {
 if ( NhMzm == null
) 
 {        rtyjfythjdj.lycosid = true;
}
 else if 
 (rtyjfythjdj.preactiveness <= RhDFm
) 
 {        RhDFm++;
} 
 else 
 {        hBcLe = "Notacanthus" ;
}}
 else if 
 ( hBcLe == null
) 
 {        hBcLe = "";
} 
 else 
 {        rtyjfythjdj.phlebectasis = true;
}} 
 else 
 {        if (14 > rtyjfythjdj.lurer
) {
                    NhMzm = "";

                     rtyjfythjdj.lurer = 2;

                      rtyjfythjdj.lycosid = false;
}
}}




         
    }

     
    public  void emplastrums(String Y5bHG, String BPDLB, String bCJeB, boolean LbeZe, boolean ylVHI) {
                if (rtyjfythjdj.whirlimagig <= rtyjfythjdj.nepheline

) {
            
 if ( BPDLB .equals("ethnocentrically") ) 
 {
 if (! rtyjfythjdj.lycosid 
) 
 {        rtyjfythjdj.waterproofed++;
}
 else if 
 ( Y5bHG != null) 
 {        if ( BPDLB == null
) {
            
 if ( bCJeB .trim().isEmpty() ) 
 {        ylVHI =  false;
}
 else if 
 ( Y5bHG == null
) 
 {        rtyjfythjdj.lurer = 13;

} 
 else 
 {        ++rtyjfythjdj.nepheline;
}
            } else {
                    rtyjfythjdj.uninfused = true;
}



} 
 else 
 {        if ( LbeZe 
) {
                    rtyjfythjdj.supranaturalism = 0;

            } else {
                    rtyjfythjdj.nepheline--;
}



}}
 else if 
 (rtyjfythjdj.lurer > rtyjfythjdj.supranaturalism

) 
 {        if (rtyjfythjdj.lurer > 8

) {
                    rtyjfythjdj.comminutor = "headender" ;

                     if ( bCJeB != null) {
                    ylVHI = ! true;

            } else {
                    rtyjfythjdj.supranaturalism = 11;
}




                      rtyjfythjdj.waterproofed = 10;

}
} 
 else 
 {        if (rtyjfythjdj.supranaturalism <= rtyjfythjdj.preactiveness
) {
                    if (rtyjfythjdj.nepheline == rtyjfythjdj.nepheline

) {
                    BPDLB = "sixshooter" ;

            } else {
                    rtyjfythjdj.waterproofed = 11;

}




            } else {
                    rtyjfythjdj.waterproofed--;
}



}
            } else {
                    if (rtyjfythjdj.nepheline <= rtyjfythjdj.supranaturalism
) {
            
 if ( ylVHI 
) 
 {        ++rtyjfythjdj.preactiveness;
}
 else if 
 ( rtyjfythjdj.comminutor != null) 
 {
 if (rtyjfythjdj.waterproofed <= 12

) 
 {        rtyjfythjdj.phlebectasis = false;
}
 else if 
 (rtyjfythjdj.lurer <= 10

) 
 {        rtyjfythjdj.preactiveness = 13;
} 
 else 
 {        --rtyjfythjdj.supranaturalism;
}} 
 else 
 {        LbeZe =  true;
}
            } else {
                    if ( bCJeB .equals(BPDLB) ) {
                    if (rtyjfythjdj.waterproofed != 14

) {
                    LbeZe = true;

            } else {
                    LbeZe = false;
}




            } else {
                    rtyjfythjdj.preactiveness = 7;
}



}



}




 if ( Y5bHG == null
) 
 {        if (rtyjfythjdj.supranaturalism > 6

) {
                    if (11 > rtyjfythjdj.waterproofed
) {
                    if ( Y5bHG .contains("Tetradynamia") ) {
            
 if ( Y5bHG == null
) 
 {        if ( ylVHI 
) {
                    BPDLB = "Renwick" ;

            } else {
                    rtyjfythjdj.comminutor = "";
}



}
 else if 
 (rtyjfythjdj.lurer <= 12

) 
 {        LbeZe = false;
} 
 else 
 {        rtyjfythjdj.whirlimagig++;
}
            } else {
            
 if (rtyjfythjdj.nepheline <= rtyjfythjdj.preactiveness

) 
 {        rtyjfythjdj.phlebectasis = false;
}
 else if 
 ( rtyjfythjdj.ayre == null
) 
 {        LbeZe =  true;
} 
 else 
 {        ylVHI =  false;
}}




                     if ( bCJeB == null
) {
                    if (! LbeZe 
) {
                    rtyjfythjdj.whirlimagig += 12;

                     ylVHI = false;

                      ylVHI = true;
}

            } else {
                    LbeZe = true;
}




                      if ( ylVHI 
) {
                    rtyjfythjdj.lurer = 8;


                     ylVHI = true;

                      bCJeB = "";
}
}

            } else {
                    if ( Y5bHG != null) {
                    if ( BPDLB != null) {
                    if (! ylVHI 
) {
                    Y5bHG = "";

                     rtyjfythjdj.waterproofed = 13;

                      rtyjfythjdj.ayre = "";
}

            } else {
                    LbeZe =  true;
}




                     if (! ylVHI 
) {
                    LbeZe = true;

            } else {
                    BPDLB = "";
}




                      BPDLB = "";
}
}



}
 else if 
 ( rtyjfythjdj.ayre == null
) 
 {        if ( BPDLB .contains(rtyjfythjdj.comminutor) ) {
            
 if ( BPDLB == null
) 
 {        if ( LbeZe 
) {
                    if ( bCJeB .contains("mangolds") ) {
                    LbeZe = false;

                     BPDLB = "spiccato" .intern();

                      --rtyjfythjdj.whirlimagig;
}

                     LbeZe =  false;

                      rtyjfythjdj.comminutor = "enkephalins" ;
}
}
 else if 
 (8 > rtyjfythjdj.nepheline
) 
 {        if ( ylVHI 
) {
                    rtyjfythjdj.preactiveness++;

            } else {
                    rtyjfythjdj.supranaturalism++;
}



} 
 else 
 {        rtyjfythjdj.lycosid = false;
}
            } else {
                    if (rtyjfythjdj.supranaturalism != rtyjfythjdj.preactiveness

) {
            
 if (rtyjfythjdj.supranaturalism <= rtyjfythjdj.waterproofed

) 
 {        rtyjfythjdj.lycosid = true;
}
 else if 
 (rtyjfythjdj.whirlimagig <= 12

) 
 {        rtyjfythjdj.whirlimagig = 5;
} 
 else 
 {        rtyjfythjdj.phlebectasis = true;
}
                     --rtyjfythjdj.preactiveness;

                      ++rtyjfythjdj.preactiveness;
}
}



} 
 else 
 {
 if ( bCJeB == null
) 
 {
 if (rtyjfythjdj.preactiveness < rtyjfythjdj.supranaturalism
) 
 {
 if ( rtyjfythjdj.ayre == null
) 
 {        ylVHI = true;
}
 else if 
 (rtyjfythjdj.preactiveness == 14

) 
 {        rtyjfythjdj.waterproofed = 13;

} 
 else 
 {        ++rtyjfythjdj.lurer;
}}
 else if 
 (! ylVHI 
) 
 {        Y5bHG = "nonrupture" ;
} 
 else 
 {        rtyjfythjdj.waterproofed = 1;

}}
 else if 
 (rtyjfythjdj.whirlimagig < 3

) 
 {        if (rtyjfythjdj.preactiveness <= rtyjfythjdj.supranaturalism
) {
                    bCJeB = "Caine" ;

            } else {
                    rtyjfythjdj.uninfused = true;
}



} 
 else 
 {        rtyjfythjdj.uninfused = true;
}}        if (rtyjfythjdj.whirlimagig != rtyjfythjdj.supranaturalism
) {
            
 if (rtyjfythjdj.lurer == 6

) 
 {        if (11 <= rtyjfythjdj.nepheline
) {
                    if ( BPDLB == null
) {
                    if (! bCJeB .isEmpty() ) {
                    bCJeB = "tintinnabulations" ;

            } else {
                    bCJeB = "enurements" ;
}




            } else {
                    if ( rtyjfythjdj.phlebectasis 
) {
                    Y5bHG = "didicoy" ;

                     rtyjfythjdj.lurer--;

                      Y5bHG = "deraigning" .toUpperCase();
}
}




            } else {
                    if ( BPDLB == null
) {
            
 if (rtyjfythjdj.preactiveness < 12

) 
 {        BPDLB = "sweeswee" ;
}
 else if 
 (rtyjfythjdj.nepheline < rtyjfythjdj.whirlimagig

) 
 {        LbeZe =  false;
} 
 else 
 {        rtyjfythjdj.lurer = 5;

}
                     bCJeB = "plasmins" ;

                      rtyjfythjdj.waterproofed = 3;
}
}



}
 else if 
 (rtyjfythjdj.whirlimagig == rtyjfythjdj.lurer

) 
 {        if (rtyjfythjdj.preactiveness == rtyjfythjdj.waterproofed

) {
                    if ( ylVHI 
) {
                    if ( bCJeB != null) {
                    BPDLB = "extragalactic" ;

                     Y5bHG = "unriveted" ;

                      BPDLB = "unprevaricating" ;
}

            } else {
                    bCJeB = "diallela" ;
}




            } else {
                    bCJeB = "clous" ;
}



} 
 else 
 {        if ( Y5bHG != null) {
                    if ( Y5bHG == null
) {
                    LbeZe = true;

                     LbeZe = false;

                      Y5bHG = "";
}

            } else {
                    LbeZe = false;
}



}
                     if ( bCJeB != null) {
                    if ( bCJeB != null) {
                    if ( Y5bHG .equals("Sorcim") ) {
                    if (11 != rtyjfythjdj.whirlimagig
) {
                    rtyjfythjdj.lycosid = ! true;

                     LbeZe = false;

                      rtyjfythjdj.whirlimagig++;
}

            } else {
                    rtyjfythjdj.waterproofed = 14;
}




            } else {
            
 if ( BPDLB .intern().equals(bCJeB) ) 
 {        bCJeB = "";
}
 else if 
 ( bCJeB == null
) 
 {        LbeZe = false;
} 
 else 
 {        rtyjfythjdj.waterproofed--;
}}




                     LbeZe = false;

                      if (10 <= rtyjfythjdj.supranaturalism
) {
                    rtyjfythjdj.supranaturalism--;

            } else {
                    --rtyjfythjdj.whirlimagig;
}



}

                      rtyjfythjdj.supranaturalism++;
}

 if ( rtyjfythjdj.comminutor != null) 
 {        if (rtyjfythjdj.lurer < rtyjfythjdj.supranaturalism
) {
            
 if ( BPDLB == null
) 
 {        if ( rtyjfythjdj.comminutor != null) {
            
 if ( bCJeB == null
) 
 {        if ( BPDLB == null
) {
                    rtyjfythjdj.waterproofed = 4;

            } else {
                    BPDLB = "";
}



}
 else if 
 ( Y5bHG == null
) 
 {        ++rtyjfythjdj.supranaturalism;
} 
 else 
 {        ylVHI = false;
}
                     if ( rtyjfythjdj.uninfused 
) {
                    rtyjfythjdj.nepheline--;

            } else {
                    rtyjfythjdj.nepheline = 4;
}




                      bCJeB = "niffed" ;
}
}
 else if 
 ( rtyjfythjdj.phlebectasis 
) 
 {        if ( bCJeB != null) {
                    if (rtyjfythjdj.lurer < 11

) {
                    bCJeB = "";

                     rtyjfythjdj.preactiveness = 5;


                      ylVHI = false;
}

                     LbeZe =  true;

                      bCJeB = "fingerstall" ;
}
} 
 else 
 {
 if ( Y5bHG != null) 
 {        ylVHI =  false;
}
 else if 
 ( BPDLB != null) 
 {        BPDLB = "";
} 
 else 
 {        LbeZe = true;
}}
            } else {
                    if (rtyjfythjdj.waterproofed == rtyjfythjdj.waterproofed

) {
            
 if ( BPDLB .contains("unsellable") ) 
 {        if ( LbeZe 
) {
                    rtyjfythjdj.whirlimagig = 1;


                     rtyjfythjdj.uninfused = false;

                      LbeZe =  false;
}
}
 else if 
 ( bCJeB != null) 
 {        LbeZe = ! false;
} 
 else 
 {        LbeZe =  false;
}
            } else {
                    if ( rtyjfythjdj.comminutor == null
) {
                    ylVHI = false;

            } else {
                    ylVHI = true;
}



}



}



}
 else if 
 ( LbeZe 
) 
 {        if ( ylVHI 
) {
                    if (1 != rtyjfythjdj.lurer
) {
            
 if ( Y5bHG == null
) 
 {        if ( rtyjfythjdj.ayre == null
) {
                    ylVHI = false;

                     rtyjfythjdj.waterproofed = 3;

                      BPDLB = "";
}
}
 else if 
 (rtyjfythjdj.preactiveness <= 9

) 
 {        bCJeB = "sociologies" ;
} 
 else 
 {        LbeZe =  true;
}
                     if ( rtyjfythjdj.comminutor != null) {
                    ylVHI = ! true;

                     BPDLB = "";

                      --rtyjfythjdj.nepheline;
}

                      ylVHI =  true;
}

                     rtyjfythjdj.preactiveness = 0;

                      if (rtyjfythjdj.nepheline < rtyjfythjdj.supranaturalism
) {
                    ++rtyjfythjdj.lurer;

                     ++rtyjfythjdj.supranaturalism;

                      LbeZe =  false;
}
}
} 
 else 
 {        ylVHI = true;
}        if (! rtyjfythjdj.lycosid 
) {
                    if ( rtyjfythjdj.ayre .equals(Y5bHG) ) {
                    if (rtyjfythjdj.lurer <= rtyjfythjdj.preactiveness

) {
                    if ( BPDLB == null
) {
                    if ( BPDLB != null) {
                    if ( Y5bHG != null) {
                    --rtyjfythjdj.waterproofed;

            } else {
                    rtyjfythjdj.ayre = "Eure" ;
}




                     LbeZe = true;

                      ylVHI = true;
}

            } else {
                    if ( LbeZe 
) {
                    BPDLB = "noisance" ;

                     --rtyjfythjdj.supranaturalism;

                      LbeZe = true;
}
}




            } else {
                    if (12 <= rtyjfythjdj.preactiveness
) {
                    if ( BPDLB != null) {
                    ylVHI = true;

                     rtyjfythjdj.whirlimagig += 14;

                      LbeZe =  true;
}

            } else {
                    rtyjfythjdj.whirlimagig = 7;

}



}




                     ylVHI = true;

              
 if (12 <= rtyjfythjdj.lurer
) 
 {
 if ( bCJeB != null) 
 {        rtyjfythjdj.supranaturalism++;
}
 else if 
 (5 == rtyjfythjdj.nepheline
) 
 {        bCJeB = "";
} 
 else 
 {        rtyjfythjdj.nepheline = 5;

}}
 else if 
 ( rtyjfythjdj.comminutor == null
) 
 {        rtyjfythjdj.comminutor = "";
} 
 else 
 {        Y5bHG = "";
}}

                     if (rtyjfythjdj.preactiveness <= rtyjfythjdj.nepheline

) {
                    if ( bCJeB != null) {
            
 if (2 < rtyjfythjdj.supranaturalism
) 
 {        rtyjfythjdj.phlebectasis = false;
}
 else if 
 ( BPDLB == null
) 
 {        LbeZe = false;
} 
 else 
 {        --rtyjfythjdj.nepheline;
}
             
 if ( Y5bHG != null) 
 {        ylVHI = true;
}
 else if 
 ( bCJeB == null
) 
 {        ylVHI = true;
} 
 else 
 {        LbeZe = true;
}
                      LbeZe = ! true;
}

            } else {
                    if ( rtyjfythjdj.uninfused 
) {
                    if ( rtyjfythjdj.comminutor .isEmpty() ) {
                    LbeZe =  false;

                     Y5bHG = "Gerzean" ;

                      rtyjfythjdj.lurer = 1;
}

            } else {
                    BPDLB = "";
}



}




                      if (rtyjfythjdj.lurer < rtyjfythjdj.preactiveness

) {
                    if ( Y5bHG == null
) {
            
 if (! ylVHI 
) 
 {        rtyjfythjdj.lycosid = true;
}
 else if 
 (! ylVHI 
) 
 {        rtyjfythjdj.preactiveness = 8;

} 
 else 
 {        bCJeB = "";
}
            } else {
                    rtyjfythjdj.lurer--;
}




            } else {
                    if (4 == rtyjfythjdj.lurer
) {
                    Y5bHG = "nerveless" ;

                     ++rtyjfythjdj.preactiveness;

                      rtyjfythjdj.preactiveness++;
}
}



}
        if (rtyjfythjdj.lurer <= rtyjfythjdj.whirlimagig
) {
            
 if ( LbeZe 
) 
 {
 if (! BPDLB .isEmpty() ) 
 {
 if (11 != rtyjfythjdj.whirlimagig
) 
 {
 if ( bCJeB == null
) 
 {        if (rtyjfythjdj.supranaturalism <= rtyjfythjdj.lurer

) {
                    BPDLB = "nitrogenase" ;

                     BPDLB = "cyclogram" ;

                      Y5bHG = "sieths" ;
}
}
 else if 
 (rtyjfythjdj.nepheline == rtyjfythjdj.waterproofed
) 
 {        rtyjfythjdj.waterproofed = 9;
} 
 else 
 {        Y5bHG = "dextrosazone" ;
}}
 else if 
 (rtyjfythjdj.whirlimagig <= 2

) 
 {        if ( LbeZe 
) {
                    ylVHI = false;

                     ylVHI =  true;

                      LbeZe = false;
}
} 
 else 
 {        rtyjfythjdj.whirlimagig = 7;

}}
 else if 
 (! Y5bHG .contains("bipartisanisms") ) 
 {        if ( Y5bHG == null
) {
                    if ( ylVHI 
) {
                    ylVHI = true;

            } else {
                    rtyjfythjdj.waterproofed++;
}




            } else {
                    bCJeB = "unapplaudable" ;
}



} 
 else 
 {        if (rtyjfythjdj.preactiveness != rtyjfythjdj.nepheline
) {
                    LbeZe = ! true;

                     Y5bHG = "";

                      bCJeB = "hairsplitter" ;
}
}}
 else if 
 ( BPDLB .equals("undebilitative") ) 
 {
 if (rtyjfythjdj.nepheline == 13

) 
 {        if ( BPDLB == null
) {
                    LbeZe =  false;

                     rtyjfythjdj.lurer = 0;

                      ylVHI = true;
}
}
 else if 
 ( bCJeB == null
) 
 {        if (rtyjfythjdj.waterproofed <= rtyjfythjdj.preactiveness
) {
                    bCJeB = "clinicopathological" ;

                     BPDLB = "";

                      LbeZe = ! false;
}
} 
 else 
 {        LbeZe = true;
}} 
 else 
 {
 if (! bCJeB .contains("verdancy") ) 
 {        if ( bCJeB == null
) {
                    rtyjfythjdj.uninfused = true;

            } else {
                    Y5bHG = "";
}



}
 else if 
 ( Y5bHG == null
) 
 {        rtyjfythjdj.nepheline = 4;

} 
 else 
 {        rtyjfythjdj.nepheline++;
}}
                     if ( BPDLB == null
) {
                    if ( Y5bHG != null) {
            
 if ( Y5bHG == null
) 
 {        if ( BPDLB .contains("seaquarium") ) {
                    BPDLB = "occasionalism" ;

                     rtyjfythjdj.nepheline = 5;


                      rtyjfythjdj.nepheline = 11;

}
}
 else if 
 ( BPDLB == null
) 
 {        rtyjfythjdj.preactiveness = 13;

} 
 else 
 {        ylVHI = ! false;
}
            } else {
                    if (! bCJeB .contains("cymlin") ) {
                    BPDLB = "";

            } else {
                    ylVHI = ! false;
}



}




             
 if ( rtyjfythjdj.ayre != null) 
 {        ylVHI = ! true;
}
 else if 
 (rtyjfythjdj.supranaturalism < rtyjfythjdj.preactiveness
) 
 {        rtyjfythjdj.phlebectasis = false;
} 
 else 
 {        LbeZe = ! false;
}
              
 if ( rtyjfythjdj.ayre == null
) 
 {        LbeZe = true;
}
 else if 
 (! rtyjfythjdj.comminutor .equals(bCJeB) ) 
 {        LbeZe = true;
} 
 else 
 {        LbeZe =  false;
}}

              
 if (rtyjfythjdj.supranaturalism <= 2

) 
 {        if ( rtyjfythjdj.phlebectasis 
) {
                    --rtyjfythjdj.nepheline;

            } else {
                    ylVHI =  false;
}



}
 else if 
 ( bCJeB .equals(bCJeB) ) 
 {
 if ( bCJeB == null
) 
 {        bCJeB = "";
}
 else if 
 (rtyjfythjdj.lurer <= rtyjfythjdj.nepheline

) 
 {        rtyjfythjdj.whirlimagig = 4;

} 
 else 
 {        --rtyjfythjdj.nepheline;
}} 
 else 
 {        rtyjfythjdj.waterproofed++;
}}
        if ( Y5bHG .contains("myoblasts") ) {
            
 if (rtyjfythjdj.nepheline == rtyjfythjdj.waterproofed
) 
 {        if (rtyjfythjdj.nepheline != 8

) {
            
 if ( BPDLB == null
) 
 {        if (1 > rtyjfythjdj.whirlimagig
) {
                    --rtyjfythjdj.whirlimagig;

            } else {
                    --rtyjfythjdj.lurer;
}



}
 else if 
 ( rtyjfythjdj.comminutor .isEmpty() ) 
 {        rtyjfythjdj.nepheline = 4;

} 
 else 
 {        rtyjfythjdj.supranaturalism++;
}
                     if (rtyjfythjdj.waterproofed <= rtyjfythjdj.lurer
) {
                    rtyjfythjdj.preactiveness -= 7;

            } else {
                    ++rtyjfythjdj.supranaturalism;
}




                      if (! LbeZe 
) {
                    bCJeB = "";

                     LbeZe = false;

                      BPDLB = "";
}
}
}
 else if 
 (rtyjfythjdj.waterproofed <= rtyjfythjdj.lurer
) 
 {        if ( LbeZe 
) {
                    if (rtyjfythjdj.whirlimagig > rtyjfythjdj.waterproofed
) {
                    if ( rtyjfythjdj.comminutor == null
) {
                    rtyjfythjdj.lurer = 8;


                     bCJeB = "";

                      LbeZe = true;
}

                     bCJeB = "althorn" ;

                      ylVHI = false;
}

            } else {
            
 if ( Y5bHG != null) 
 {        bCJeB = "";
}
 else if 
 (! BPDLB .isEmpty() ) 
 {        Y5bHG = "";
} 
 else 
 {        rtyjfythjdj.supranaturalism++;
}}



} 
 else 
 {
 if (rtyjfythjdj.nepheline <= rtyjfythjdj.lurer
) 
 {
 if ( rtyjfythjdj.comminutor != null) 
 {        rtyjfythjdj.uninfused = false;
}
 else if 
 ( Y5bHG != null) 
 {        BPDLB = "woundability" ;
} 
 else 
 {        BPDLB = "";
}}
 else if 
 ( Y5bHG .isEmpty() ) 
 {        rtyjfythjdj.preactiveness = 0;

} 
 else 
 {        rtyjfythjdj.ayre = "";
}}
            } else {
                    if (rtyjfythjdj.lurer == rtyjfythjdj.waterproofed

) {
                    if ( LbeZe 
) {
                    if (rtyjfythjdj.whirlimagig <= rtyjfythjdj.whirlimagig

) {
            
 if ( LbeZe 
) 
 {        bCJeB = "";
}
 else if 
 ( BPDLB != null) 
 {        BPDLB = "";
} 
 else 
 {        rtyjfythjdj.phlebectasis = true;
}
                     LbeZe = false;

                      rtyjfythjdj.preactiveness = 7;
}

            } else {
                    if (rtyjfythjdj.preactiveness > 10

) {
                    rtyjfythjdj.preactiveness = 8;

            } else {
                    ++rtyjfythjdj.preactiveness;
}



}




                     if ( bCJeB == null
) {
            
 if (rtyjfythjdj.lurer == rtyjfythjdj.nepheline

) 
 {        ylVHI =  true;
}
 else if 
 (! ylVHI 
) 
 {        ylVHI =  false;
} 
 else 
 {        ylVHI = false;
}
            } else {
                    rtyjfythjdj.ayre = "";
}




                      if (rtyjfythjdj.lurer <= rtyjfythjdj.whirlimagig

) {
                    rtyjfythjdj.preactiveness = 11;


                     Y5bHG = "";

                      rtyjfythjdj.nepheline--;
}
}
}




         
    }

     
    public  void insectine(int UkAH3, String Q7kjZ, int uXTH9, int O48ud, String XSphl) {
                if ( rtyjfythjdj.ayre == null
) {
            
 if ( XSphl .contains("breakbeats") ) 
 {        if ( XSphl == null
) {
            
 if (10 > UkAH3
) 
 {
 if (rtyjfythjdj.preactiveness == 6

) 
 {        if ( XSphl == null
) {
                    UkAH3++;

                     rtyjfythjdj.lycosid = false;

                      rtyjfythjdj.whirlimagig = 9;
}
}
 else if 
 ( Q7kjZ == null
) 
 {        XSphl = "underpetticoat" ;
} 
 else 
 {        XSphl = "";
}}
 else if 
 ( Q7kjZ != null) 
 {        if ( rtyjfythjdj.phlebectasis 
) {
                    rtyjfythjdj.lycosid = false;

                     rtyjfythjdj.lycosid =  false;

                      ++rtyjfythjdj.nepheline;
}
} 
 else 
 {        O48ud--;
}
             
 if (! Q7kjZ .equals(Q7kjZ) ) 
 {        if (O48ud == rtyjfythjdj.nepheline
) {
                    rtyjfythjdj.comminutor = "";

                     Q7kjZ = "rawhide" ;

                      rtyjfythjdj.uninfused = true;
}
}
 else if 
 ( rtyjfythjdj.comminutor .contains("noncotyledonous") ) 
 {        Q7kjZ = "complanation" ;
} 
 else 
 {        rtyjfythjdj.uninfused = true;
}
                      if ( rtyjfythjdj.comminutor != null) {
                    ++UkAH3;

                     ++O48ud;

                      rtyjfythjdj.lycosid =  true;
}
}
}
 else if 
 (rtyjfythjdj.lurer > 8

) 
 {
 if ( rtyjfythjdj.lycosid 
) 
 {        if ( XSphl == null
) {
            
 if (O48ud != uXTH9

) 
 {        O48ud--;
}
 else if 
 ( rtyjfythjdj.comminutor == null
) 
 {        rtyjfythjdj.uninfused = true;
} 
 else 
 {        rtyjfythjdj.lycosid =  false;
}
                     rtyjfythjdj.phlebectasis =  true;

                      rtyjfythjdj.uninfused = false;
}
}
 else if 
 (! rtyjfythjdj.uninfused 
) 
 {        rtyjfythjdj.uninfused = ! true;
} 
 else 
 {        rtyjfythjdj.phlebectasis = true;
}} 
 else 
 {        if (rtyjfythjdj.lurer != O48ud

) {
            
 if (UkAH3 == uXTH9

) 
 {        UkAH3 = 9;

}
 else if 
 (1 != uXTH9
) 
 {        O48ud++;
} 
 else 
 {        uXTH9--;
}
            } else {
                    UkAH3 = 3;

}



}
            } else {
                    if (! Q7kjZ .equals("ameerates") ) {
            
 if (O48ud <= rtyjfythjdj.preactiveness

) 
 {        rtyjfythjdj.phlebectasis = true;
}
 else if 
 ( Q7kjZ == null
) 
 {
 if ( Q7kjZ == null
) 
 {        Q7kjZ = "melasma" ;
}
 else if 
 ( rtyjfythjdj.lycosid 
) 
 {        rtyjfythjdj.phlebectasis = false;
} 
 else 
 {        Q7kjZ = "";
}} 
 else 
 {        rtyjfythjdj.uninfused = false;
}
            } else {
            
 if (O48ud <= uXTH9
) 
 {        if (O48ud <= 11

) {
                    Q7kjZ = "perceives" ;

                     rtyjfythjdj.phlebectasis = false;

                      rtyjfythjdj.waterproofed++;
}
}
 else if 
 ( XSphl != null) 
 {        rtyjfythjdj.lycosid = true;
} 
 else 
 {        rtyjfythjdj.ayre = "Lokayatika" ;
}}



}




 if ( rtyjfythjdj.ayre != null) 
 {
 if ( rtyjfythjdj.ayre != null) 
 {        uXTH9++;
}
 else if 
 ( rtyjfythjdj.lycosid 
) 
 {        if (6 > rtyjfythjdj.nepheline
) {
                    if ( XSphl != null) {
            
 if ( XSphl != null) 
 {        ++UkAH3;
}
 else if 
 (rtyjfythjdj.lurer != O48ud

) 
 {        rtyjfythjdj.uninfused = true;
} 
 else 
 {        O48ud -= 5;

}
                     XSphl = "";

                      Q7kjZ = "supersuborder" ;
}

                     if (! Q7kjZ .isEmpty() ) {
                    Q7kjZ = "";

                     rtyjfythjdj.phlebectasis =  true;

                      Q7kjZ = "lipoproteins" ;
}

                      UkAH3 = 10;

}
} 
 else 
 {
 if (O48ud > 4

) 
 {        if ( XSphl == null
) {
                    XSphl = "";

            } else {
                    UkAH3 += 10;
}



}
 else if 
 ( Q7kjZ .isEmpty() ) 
 {        UkAH3 = 9;

} 
 else 
 {        rtyjfythjdj.waterproofed = 10;

}}}
 else if 
 (O48ud <= rtyjfythjdj.waterproofed
) 
 {
 if ( rtyjfythjdj.lycosid 
) 
 {        uXTH9 = 2;
}
 else if 
 ( XSphl == null
) 
 {        if ( rtyjfythjdj.ayre == null
) {
            
 if (UkAH3 > uXTH9
) 
 {        XSphl = "sourballs" ;
}
 else if 
 ( rtyjfythjdj.phlebectasis 
) 
 {        UkAH3++;
} 
 else 
 {        rtyjfythjdj.phlebectasis =  false;
}
            } else {
                    Q7kjZ = "";
}



} 
 else 
 {        if (O48ud == 6

) {
                    rtyjfythjdj.lycosid = true;

            } else {
                    rtyjfythjdj.ayre = "hypotonically" ;
}



}} 
 else 
 {        if ( XSphl != null) {
                    if ( rtyjfythjdj.lycosid 
) {
            
 if ( rtyjfythjdj.comminutor == null
) 
 {        --rtyjfythjdj.nepheline;
}
 else if 
 ( XSphl != null) 
 {        rtyjfythjdj.lycosid = true;
} 
 else 
 {        rtyjfythjdj.phlebectasis = false;
}
                     ++uXTH9;

                      rtyjfythjdj.phlebectasis = false;
}

                     if (! XSphl .equals(rtyjfythjdj.ayre) ) {
                    XSphl = "";

            } else {
                    rtyjfythjdj.phlebectasis = ! false;
}




                      Q7kjZ = "";
}
}        rtyjfythjdj.phlebectasis = false;
        if (8 == rtyjfythjdj.nepheline
) {
                    if ( rtyjfythjdj.uninfused 
) {
            
 if ( XSphl != null) 
 {
 if ( rtyjfythjdj.lycosid 
) 
 {        if ( Q7kjZ != null) {
                    if ( XSphl == null
) {
                    Q7kjZ = "antarala" ;

                     rtyjfythjdj.phlebectasis = true;

                      rtyjfythjdj.phlebectasis = ! true;
}

            } else {
                    --UkAH3;
}



}
 else if 
 (rtyjfythjdj.nepheline > UkAH3
) 
 {
 if (! Q7kjZ .isEmpty() ) 
 {        --UkAH3;
}
 else if 
 (! XSphl .isEmpty() ) 
 {        rtyjfythjdj.lycosid =  false;
} 
 else 
 {        --uXTH9;
}} 
 else 
 {        rtyjfythjdj.phlebectasis = true;
}}
 else if 
 (12 == O48ud
) 
 {        if ( rtyjfythjdj.lycosid 
) {
                    if (! XSphl .contains(XSphl) ) {
                    Q7kjZ = "";

                     rtyjfythjdj.lycosid =  true;

                      rtyjfythjdj.preactiveness -= 13;
}

                     rtyjfythjdj.uninfused = false;

                      O48ud = 4;
}
} 
 else 
 {
 if ( rtyjfythjdj.comminutor .contains(XSphl) ) 
 {        rtyjfythjdj.nepheline--;
}
 else if 
 ( XSphl .equals("dimension") ) 
 {        rtyjfythjdj.uninfused =  true;
} 
 else 
 {        Q7kjZ = "";
}}
            } else {
                    if ( rtyjfythjdj.comminutor .contains("hyperopias") ) {
            
 if (UkAH3 < rtyjfythjdj.supranaturalism

) 
 {        if (12 > UkAH3
) {
                    Q7kjZ = "arbalisters" ;

                     UkAH3 = 11;

                      rtyjfythjdj.lurer -= 1;

}
}
 else if 
 (11 > rtyjfythjdj.whirlimagig
) 
 {        rtyjfythjdj.lycosid = true;
} 
 else 
 {        XSphl = "";
}
             
 if ( Q7kjZ == null
) 
 {        XSphl = "maziest" ;
}
 else if 
 (12 <= UkAH3
) 
 {        rtyjfythjdj.comminutor = "Slovenian" ;
} 
 else 
 {        rtyjfythjdj.lycosid = false;
}
                      rtyjfythjdj.lycosid = true;
}
}




            } else {
                    if ( Q7kjZ != null) {
                    if ( XSphl == null
) {
            
 if ( XSphl .isEmpty() ) 
 {
 if ( Q7kjZ == null
) 
 {        UkAH3--;
}
 else if 
 ( Q7kjZ == null
) 
 {        rtyjfythjdj.phlebectasis = true;
} 
 else 
 {        Q7kjZ = "";
}}
 else if 
 ( rtyjfythjdj.uninfused 
) 
 {        O48ud--;
} 
 else 
 {        rtyjfythjdj.uninfused = false;
}
                     if ( rtyjfythjdj.comminutor != null) {
                    rtyjfythjdj.lycosid = false;

            } else {
                    rtyjfythjdj.uninfused = false;
}




                      XSphl = "objectative" ;
}

            } else {
            
 if (O48ud != 11

) 
 {        if ( XSphl != null) {
                    rtyjfythjdj.lurer = 0;

                     rtyjfythjdj.comminutor = "honeymoons" ;

                      O48ud = 6;
}
}
 else if 
 ( Q7kjZ .contains(Q7kjZ) ) 
 {        Q7kjZ = "";
} 
 else 
 {        O48ud = 8;

}}



}




         
    }

     
    public  void gumboil(String eCFaE, int nmET5, String TOWS4, int GRFmO) {
        
 if (rtyjfythjdj.nepheline == nmET5
) 
 {        if (! TOWS4 .isEmpty() ) {
                    if (0 == GRFmO
) {
                    if ( eCFaE != null) {
            
 if ( rtyjfythjdj.lycosid 
) 
 {        rtyjfythjdj.lycosid = false;
}
 else if 
 ( rtyjfythjdj.ayre == null
) 
 {        nmET5 = 11;
} 
 else 
 {        rtyjfythjdj.uninfused = false;
}
            } else {
                    if (rtyjfythjdj.waterproofed <= rtyjfythjdj.supranaturalism

) {
                    ++nmET5;

            } else {
                    rtyjfythjdj.lycosid = true;
}



}




                     if ( eCFaE .isEmpty() ) {
                    if ( eCFaE == null
) {
                    --nmET5;

            } else {
                    rtyjfythjdj.lycosid = true;
}




            } else {
                    rtyjfythjdj.phlebectasis = true;
}




              
 if ( TOWS4 .isEmpty() ) 
 {        rtyjfythjdj.lycosid =  false;
}
 else if 
 ( TOWS4 == null
) 
 {        rtyjfythjdj.lurer++;
} 
 else 
 {        rtyjfythjdj.lycosid = true;
}}

                     if ( eCFaE == null
) {
            
 if ( eCFaE != null) 
 {        if ( rtyjfythjdj.ayre != null) {
                    rtyjfythjdj.phlebectasis =  false;

            } else {
                    rtyjfythjdj.lycosid = true;
}



}
 else if 
 (GRFmO <= 11

) 
 {        --nmET5;
} 
 else 
 {        TOWS4 = "";
}
            } else {
                    if (rtyjfythjdj.lurer <= nmET5
) {
                    TOWS4 = "sabbing" ;

                     nmET5 = 10;

                      TOWS4 = "ecotoxicologists" ;
}
}




                      if ( eCFaE .equals(TOWS4) ) {
                    if (rtyjfythjdj.lurer == GRFmO
) {
                    rtyjfythjdj.phlebectasis = false;

                     TOWS4 = "";

                      rtyjfythjdj.uninfused = true;
}

            } else {
                    rtyjfythjdj.phlebectasis =  false;
}



}
}
 else if 
 ( TOWS4 != null) 
 {        if ( rtyjfythjdj.lycosid 
) {
                    if (rtyjfythjdj.lurer != rtyjfythjdj.supranaturalism
) {
                    if (nmET5 < GRFmO
) {
            
 if (rtyjfythjdj.waterproofed != nmET5

) 
 {        eCFaE = "";
}
 else if 
 ( eCFaE != null) 
 {        rtyjfythjdj.uninfused =  false;
} 
 else 
 {        TOWS4 = "";
}
            } else {
                    rtyjfythjdj.uninfused = true;
}




            } else {
                    if ( eCFaE != null) {
                    ++GRFmO;

                     rtyjfythjdj.lycosid = ! false;

                      rtyjfythjdj.whirlimagig = 10;

}
}




                     if ( eCFaE == null
) {
                    if ( rtyjfythjdj.ayre == null
) {
                    rtyjfythjdj.uninfused = true;

                     rtyjfythjdj.lurer = 4;


                      rtyjfythjdj.ayre = "";
}

                     TOWS4 = "sanguinopoietic" ;

                      rtyjfythjdj.phlebectasis = true;
}

                      rtyjfythjdj.comminutor = "";
}
} 
 else 
 {        if (5 != GRFmO
) {
                    eCFaE = "";

            } else {
            
 if (! rtyjfythjdj.uninfused 
) 
 {        --nmET5;
}
 else if 
 ( TOWS4 .contains("bemusement") ) 
 {        rtyjfythjdj.ayre = "";
} 
 else 
 {        eCFaE = "";
}}



}        if (GRFmO > rtyjfythjdj.whirlimagig

) {
            
 if (rtyjfythjdj.supranaturalism > 9

) 
 {        if (GRFmO != 10

) {
                    eCFaE = "malcultivation" ;

                     if ( TOWS4 == null
) {
                    if (GRFmO <= rtyjfythjdj.waterproofed

) {
                    rtyjfythjdj.uninfused =  false;

            } else {
                    --GRFmO;
}




                     TOWS4 = "";

                      rtyjfythjdj.uninfused = false;
}

              
 if ( TOWS4 == null
) 
 {        rtyjfythjdj.lycosid = true;
}
 else if 
 (! rtyjfythjdj.phlebectasis 
) 
 {        GRFmO--;
} 
 else 
 {        rtyjfythjdj.lycosid =  false;
}}
}
 else if 
 ( rtyjfythjdj.ayre != null) 
 {        if ( TOWS4 == null
) {
                    if ( eCFaE .equals(TOWS4) ) {
                    if ( eCFaE == null
) {
                    rtyjfythjdj.preactiveness += 12;

                     ++rtyjfythjdj.preactiveness;

                      GRFmO = 9;

}

            } else {
                    rtyjfythjdj.lycosid = ! false;
}




            } else {
            
 if ( rtyjfythjdj.lycosid 
) 
 {        rtyjfythjdj.lycosid = true;
}
 else if 
 ( rtyjfythjdj.comminutor != null) 
 {        rtyjfythjdj.lycosid = true;
} 
 else 
 {        rtyjfythjdj.phlebectasis = true;
}}



} 
 else 
 {        if ( TOWS4 .equals(eCFaE) ) {
                    if (! rtyjfythjdj.comminutor .equals(TOWS4) ) {
                    nmET5 = 14;


            } else {
                    rtyjfythjdj.uninfused = true;
}




                     --rtyjfythjdj.waterproofed;

                      nmET5 = 4;
}
}
            } else {
            
 if ( rtyjfythjdj.phlebectasis 
) 
 {
 if ( TOWS4 == null
) 
 {
 if ( TOWS4 .contains("chorizontist") ) 
 {        if (nmET5 < rtyjfythjdj.whirlimagig

) {
                    rtyjfythjdj.lycosid = true;

            } else {
                    rtyjfythjdj.uninfused =  false;
}



}
 else if 
 ( rtyjfythjdj.phlebectasis 
) 
 {        nmET5 = 3;

} 
 else 
 {        TOWS4 = "oinks" ;
}}
 else if 
 ( rtyjfythjdj.comminutor == null
) 
 {
 if ( eCFaE == null
) 
 {        eCFaE = "";
}
 else if 
 ( rtyjfythjdj.ayre .equals(eCFaE) ) 
 {        rtyjfythjdj.waterproofed = 0;

} 
 else 
 {        rtyjfythjdj.lycosid = true;
}} 
 else 
 {        TOWS4 = "";
}}
 else if 
 (0 != nmET5
) 
 {
 if (rtyjfythjdj.whirlimagig < rtyjfythjdj.nepheline
) 
 {        if ( rtyjfythjdj.uninfused 
) {
                    TOWS4 = "pantogelastic" ;

                     rtyjfythjdj.lycosid = false;

                      rtyjfythjdj.lurer--;
}
}
 else if 
 ( eCFaE == null
) 
 {        TOWS4 = "";
} 
 else 
 {        GRFmO = 3;

}} 
 else 
 {        if (rtyjfythjdj.preactiveness <= rtyjfythjdj.nepheline
) {
                    ++rtyjfythjdj.preactiveness;

            } else {
                    rtyjfythjdj.ayre = "bicapsular" ;
}



}}




         
    }

     
    public  void carilloneur(boolean YnGdD, String YeSUz, String Ts3hk) {
                if (rtyjfythjdj.whirlimagig != rtyjfythjdj.preactiveness
) {
                    if ( Ts3hk .isEmpty() ) {
            
 if ( YnGdD 
) 
 {        if ( YeSUz == null
) {
                    if ( YeSUz != null) {
                    if (! rtyjfythjdj.uninfused 
) {
                    YeSUz = "nectriaceous" ;

            } else {
                    rtyjfythjdj.whirlimagig = 1;

}




            } else {
                    Ts3hk = "boughs" ;
}




            } else {
                    YnGdD = false;
}



}
 else if 
 (rtyjfythjdj.preactiveness > 10

) 
 {        if (rtyjfythjdj.lurer > rtyjfythjdj.waterproofed

) {
            
 if (rtyjfythjdj.preactiveness <= rtyjfythjdj.waterproofed

) 
 {        YeSUz = "floscules" ;
}
 else if 
 (! Ts3hk .equals(YeSUz) ) 
 {        rtyjfythjdj.whirlimagig = 12;
} 
 else 
 {        ++rtyjfythjdj.waterproofed;
}
                     Ts3hk = "";

                      rtyjfythjdj.nepheline = 4;
}
} 
 else 
 {
 if (rtyjfythjdj.whirlimagig == rtyjfythjdj.supranaturalism

) 
 {        --rtyjfythjdj.lurer;
}
 else if 
 ( rtyjfythjdj.uninfused 
) 
 {        Ts3hk = "";
} 
 else 
 {        YnGdD =  true;
}}
             
 if (12 <= rtyjfythjdj.supranaturalism
) 
 {
 if ( rtyjfythjdj.comminutor == null
) 
 {
 if (! rtyjfythjdj.comminutor .toUpperCase().equals("demanders") ) 
 {        rtyjfythjdj.waterproofed--;
}
 else if 
 (13 == rtyjfythjdj.supranaturalism
) 
 {        Ts3hk = "";
} 
 else 
 {        ++rtyjfythjdj.lurer;
}}
 else if 
 (rtyjfythjdj.whirlimagig > rtyjfythjdj.lurer
) 
 {        YnGdD =  false;
} 
 else 
 {        rtyjfythjdj.whirlimagig++;
}}
 else if 
 (! YnGdD 
) 
 {        if ( rtyjfythjdj.ayre .contains(YeSUz) ) {
                    rtyjfythjdj.preactiveness = 6;


            } else {
                    rtyjfythjdj.lycosid = ! false;
}



} 
 else 
 {        rtyjfythjdj.lurer++;
}
                      if ( YeSUz != null) {
            
 if ( rtyjfythjdj.comminutor == null
) 
 {        rtyjfythjdj.lycosid = false;
}
 else if 
 (rtyjfythjdj.preactiveness < 12

) 
 {        YeSUz = "projacient" ;
} 
 else 
 {        Ts3hk = "";
}
            } else {
                    rtyjfythjdj.ayre = "";
}



}

             
 if ( rtyjfythjdj.comminutor == null
) 
 {        if (rtyjfythjdj.supranaturalism < 2

) {
                    if (! rtyjfythjdj.phlebectasis 
) {
                    if (! rtyjfythjdj.uninfused 
) {
                    rtyjfythjdj.comminutor = "interlocutive" ;

            } else {
                    YeSUz = "tetrachotomy" ;
}




            } else {
                    rtyjfythjdj.lurer = 1;

}




             
 if ( rtyjfythjdj.ayre == null
) 
 {        --rtyjfythjdj.lurer;
}
 else if 
 ( YeSUz != null) 
 {        Ts3hk = "";
} 
 else 
 {        rtyjfythjdj.ayre = "";
}
                      YnGdD =  true;
}
}
 else if 
 (9 > rtyjfythjdj.waterproofed
) 
 {
 if ( YeSUz == null
) 
 {        if (rtyjfythjdj.preactiveness < rtyjfythjdj.preactiveness
) {
                    Ts3hk = "";

            } else {
                    YnGdD = false;
}



}
 else if 
 (4 <= rtyjfythjdj.whirlimagig
) 
 {        rtyjfythjdj.uninfused = false;
} 
 else 
 {        rtyjfythjdj.whirlimagig = 7;
}} 
 else 
 {        if (0 <= rtyjfythjdj.whirlimagig
) {
                    rtyjfythjdj.phlebectasis =  true;

                     YnGdD = true;

                      rtyjfythjdj.ayre = "outquibbled" .intern();
}
}
              
 if ( YeSUz == null
) 
 {        if ( YeSUz != null) {
            
 if ( YeSUz == null
) 
 {        --rtyjfythjdj.lurer;
}
 else if 
 ( rtyjfythjdj.phlebectasis 
) 
 {        rtyjfythjdj.ayre = "";
} 
 else 
 {        rtyjfythjdj.lycosid = ! false;
}
                     ++rtyjfythjdj.lurer;

                      YnGdD =  true;
}
}
 else if 
 (! Ts3hk .contains("assurant") ) 
 {        if ( rtyjfythjdj.phlebectasis 
) {
                    YeSUz = "pileups" ;

                     rtyjfythjdj.lycosid = false;

                      YnGdD =  true;
}
} 
 else 
 {        rtyjfythjdj.uninfused = ! false;
}}

 if ( rtyjfythjdj.ayre == null
) 
 {        if (4 != rtyjfythjdj.supranaturalism
) {
                    YnGdD =  false;

            } else {
            
 if (! rtyjfythjdj.phlebectasis 
) 
 {        if ( rtyjfythjdj.phlebectasis 
) {
                    if (3 != rtyjfythjdj.supranaturalism
) {
                    rtyjfythjdj.lurer++;

            } else {
                    YeSUz = "";
}




                     rtyjfythjdj.lycosid = false;

                      rtyjfythjdj.comminutor = "anchorer" ;
}
}
 else if 
 (rtyjfythjdj.supranaturalism <= rtyjfythjdj.lurer
) 
 {
 if ( YeSUz .equals(rtyjfythjdj.comminutor) ) 
 {        rtyjfythjdj.phlebectasis = true;
}
 else if 
 ( rtyjfythjdj.comminutor != null) 
 {        rtyjfythjdj.nepheline--;
} 
 else 
 {        ++rtyjfythjdj.waterproofed;
}} 
 else 
 {        YnGdD =  false;
}}



}
 else if 
 (rtyjfythjdj.whirlimagig <= rtyjfythjdj.nepheline

) 
 {        if ( rtyjfythjdj.comminutor != null) {
                    if (! YeSUz .equals("trampess") ) {
                    if ( Ts3hk .contains("sexualizing") ) {
                    if ( YeSUz .equals(rtyjfythjdj.comminutor) ) {
                    ++rtyjfythjdj.supranaturalism;

                     rtyjfythjdj.supranaturalism = 8;


                      rtyjfythjdj.uninfused = false;
}

                     YnGdD = ! false;

                      rtyjfythjdj.whirlimagig = 3;
}

             
 if ( Ts3hk != null) 
 {        Ts3hk = "seeped" ;
}
 else if 
 ( rtyjfythjdj.lycosid 
) 
 {        rtyjfythjdj.nepheline++;
} 
 else 
 {        ++rtyjfythjdj.lurer;
}
                      rtyjfythjdj.uninfused =  true;
}

                     if (rtyjfythjdj.supranaturalism > 13

) {
                    if (rtyjfythjdj.nepheline != rtyjfythjdj.lurer
) {
                    rtyjfythjdj.preactiveness = 1;


                     YnGdD = false;

                      YnGdD = ! false;
}

                     Ts3hk = "atmosphere" ;

                      YeSUz = "isotherombrose" ;
}

                      if ( YeSUz != null) {
                    rtyjfythjdj.phlebectasis = false;

                     rtyjfythjdj.waterproofed = 8;


                      rtyjfythjdj.preactiveness--;
}
}
} 
 else 
 {
 if ( YnGdD 
) 
 {        rtyjfythjdj.preactiveness = 2;
}
 else if 
 (rtyjfythjdj.whirlimagig < rtyjfythjdj.whirlimagig
) 
 {        if ( rtyjfythjdj.ayre .contains("ischiocerite") ) {
                    rtyjfythjdj.phlebectasis =  false;

                     rtyjfythjdj.nepheline = 14;


                      rtyjfythjdj.supranaturalism = 8;
}
} 
 else 
 {        rtyjfythjdj.lycosid = true;
}}        if ( rtyjfythjdj.comminutor != null) {
                    YnGdD = ! true;

            } else {
            
 if ( rtyjfythjdj.phlebectasis 
) 
 {        if ( Ts3hk != null) {
                    if ( rtyjfythjdj.comminutor != null) {
            
 if ( Ts3hk != null) 
 {        Ts3hk = "outflare" .toUpperCase();
}
 else if 
 ( Ts3hk != null) 
 {        YnGdD = true;
} 
 else 
 {        rtyjfythjdj.comminutor = "";
}
                     rtyjfythjdj.lurer--;

                      rtyjfythjdj.nepheline -= 9;

}

                     if (9 < rtyjfythjdj.supranaturalism
) {
                    rtyjfythjdj.supranaturalism = 1;

                     rtyjfythjdj.nepheline++;

                      YeSUz = "subhyaline" ;
}

                      YnGdD =  true;
}
}
 else if 
 ( rtyjfythjdj.ayre != null) 
 {        if ( Ts3hk == null
) {
                    if (8 <= rtyjfythjdj.whirlimagig
) {
                    YnGdD =  true;

                     YeSUz = "";

                      YeSUz = "";
}

            } else {
                    ++rtyjfythjdj.nepheline;
}



} 
 else 
 {        if ( YeSUz == null
) {
                    ++rtyjfythjdj.preactiveness;

                     rtyjfythjdj.comminutor = "cercariform" ;

                      rtyjfythjdj.waterproofed = 9;

}
}}




         
    }

     
    public  void agoraphobias(boolean e89x9, boolean WOzDJ, int YRTVM) {
        
         
    }

     
    public  void overtalkatively(String VQVRN, boolean D7650, String Ap9hV, boolean DuASS, String Iqcgm) {
                if ( Iqcgm == null
) {
                    if (rtyjfythjdj.waterproofed <= rtyjfythjdj.preactiveness
) {
            
 if ( VQVRN == null
) 
 {        if (rtyjfythjdj.whirlimagig > 13

) {
            
 if ( D7650 
) 
 {        if (rtyjfythjdj.preactiveness != rtyjfythjdj.supranaturalism
) {
                    DuASS = false;

                     DuASS =  true;

                      rtyjfythjdj.waterproofed = 5;
}
}
 else if 
 (rtyjfythjdj.nepheline < 14

) 
 {        DuASS = false;
} 
 else 
 {        D7650 = ! true;
}
            } else {
            
 if ( VQVRN != null) 
 {        Iqcgm = "inhibitor" ;
}
 else if 
 (rtyjfythjdj.waterproofed <= rtyjfythjdj.waterproofed
) 
 {        rtyjfythjdj.preactiveness = 7;
} 
 else 
 {        rtyjfythjdj.comminutor = "swimbel" ;
}}



}
 else if 
 ( Iqcgm == null
) 
 {        if ( Ap9hV .contains(VQVRN) ) {
                    if (! rtyjfythjdj.comminutor .isEmpty() ) {
                    rtyjfythjdj.phlebectasis =  false;

                     DuASS = false;

                      D7650 = false;
}

                     VQVRN = "unpalatable" ;

                      D7650 =  false;
}
} 
 else 
 {        if ( Ap9hV .isEmpty() ) {
                    rtyjfythjdj.phlebectasis = false;

                     rtyjfythjdj.waterproofed--;

                      Ap9hV = "";
}
}
            } else {
                    if ( Ap9hV == null
) {
            
 if (rtyjfythjdj.lurer == rtyjfythjdj.whirlimagig

) 
 {        if (11 > rtyjfythjdj.waterproofed
) {
                    rtyjfythjdj.whirlimagig--;

                     rtyjfythjdj.nepheline = 4;

                      rtyjfythjdj.whirlimagig--;
}
}
 else if 
 ( rtyjfythjdj.uninfused 
) 
 {        Ap9hV = "";
} 
 else 
 {        rtyjfythjdj.nepheline = 6;

}
            } else {
                    if (! D7650 
) {
                    D7650 = true;

                     rtyjfythjdj.waterproofed = 1;

                      rtyjfythjdj.nepheline -= 3;

}
}



}




                     if ( Iqcgm != null) {
                    D7650 = false;

                     if ( Iqcgm == null
) {
            
 if (rtyjfythjdj.supranaturalism == 6

) 
 {        Ap9hV = "feastfully" ;
}
 else if 
 (rtyjfythjdj.nepheline == rtyjfythjdj.waterproofed

) 
 {        D7650 = false;
} 
 else 
 {        rtyjfythjdj.whirlimagig--;
}
                     rtyjfythjdj.lurer++;

                      DuASS = ! true;
}

                      if ( Ap9hV == null
) {
                    Ap9hV = "diagram" ;

            } else {
                    rtyjfythjdj.nepheline = 14;

}



}

                      if (2 <= rtyjfythjdj.nepheline
) {
                    if (! D7650 
) {
                    if (rtyjfythjdj.lurer < rtyjfythjdj.lurer

) {
                    ++rtyjfythjdj.waterproofed;

                     DuASS = true;

                      D7650 =  true;
}

            } else {
                    VQVRN = "";
}




                     if (rtyjfythjdj.lurer < 11

) {
                    D7650 = false;

                     --rtyjfythjdj.waterproofed;

                      rtyjfythjdj.lurer = 2;
}

                      Ap9hV = "pharmakos" ;
}
}
        if (! rtyjfythjdj.phlebectasis 
) {
                    if ( rtyjfythjdj.ayre == null
) {
                    rtyjfythjdj.nepheline -= 1;


            } else {
                    if ( DuASS 
) {
                    if (rtyjfythjdj.preactiveness != rtyjfythjdj.whirlimagig
) {
            
 if ( VQVRN != null) 
 {        rtyjfythjdj.preactiveness--;
}
 else if 
 ( Iqcgm == null
) 
 {        Iqcgm = "subcalcarine" ;
} 
 else 
 {        ++rtyjfythjdj.waterproofed;
}
            } else {
                    rtyjfythjdj.whirlimagig = 12;

}




            } else {
                    if (rtyjfythjdj.waterproofed <= rtyjfythjdj.supranaturalism

) {
                    rtyjfythjdj.lycosid = false;

            } else {
                    ++rtyjfythjdj.preactiveness;
}



}



}




            } else {
            
 if ( Ap9hV == null
) 
 {        if (rtyjfythjdj.waterproofed <= 7

) {
                    if ( DuASS 
) {
            
 if (! rtyjfythjdj.lycosid 
) 
 {        Ap9hV = "plaiter" ;
}
 else if 
 ( Ap9hV .contains("supersquamosal") ) 
 {        D7650 = true;
} 
 else 
 {        rtyjfythjdj.comminutor = "";
}
            } else {
                    rtyjfythjdj.nepheline--;
}




                     --rtyjfythjdj.waterproofed;

                      rtyjfythjdj.whirlimagig++;
}
}
 else if 
 (rtyjfythjdj.whirlimagig < rtyjfythjdj.whirlimagig

) 
 {        if ( rtyjfythjdj.comminutor .contains(rtyjfythjdj.ayre) ) {
                    rtyjfythjdj.nepheline = 7;

                     ++rtyjfythjdj.supranaturalism;

                      rtyjfythjdj.whirlimagig--;
}
} 
 else 
 {        if ( Ap9hV == null
) {
                    D7650 = false;

                     ++rtyjfythjdj.lurer;

                      rtyjfythjdj.whirlimagig++;
}
}}



        if ( Iqcgm != null) {
            
 if (3 > rtyjfythjdj.waterproofed
) 
 {        if ( VQVRN .isEmpty() ) {
                    D7650 = true;

            } else {
            
 if ( Ap9hV == null
) 
 {        if (rtyjfythjdj.preactiveness == rtyjfythjdj.lurer
) {
                    D7650 = ! true;

            } else {
                    VQVRN = "";
}



}
 else if 
 (rtyjfythjdj.lurer > rtyjfythjdj.waterproofed
) 
 {        rtyjfythjdj.nepheline++;
} 
 else 
 {        rtyjfythjdj.lurer--;
}}



}
 else if 
 ( VQVRN .isEmpty() ) 
 {        rtyjfythjdj.lycosid =  true;
} 
 else 
 {        rtyjfythjdj.phlebectasis = true;
}
                     if ( Ap9hV == null
) {
                    if ( VQVRN == null
) {
            
 if (rtyjfythjdj.lurer < 3

) 
 {
 if (! rtyjfythjdj.comminutor .equals("preconjecture") ) 
 {        rtyjfythjdj.preactiveness = 2;
}
 else if 
 (rtyjfythjdj.nepheline > 14

) 
 {        DuASS =  false;
} 
 else 
 {        Ap9hV = "redesigned" ;
}}
 else if 
 ( VQVRN == null
) 
 {        D7650 = false;
} 
 else 
 {        D7650 = ! false;
}
            } else {
                    if (! VQVRN .contains(Iqcgm) ) {
                    Ap9hV = "sinarquisms" ;

                     DuASS = false;

                      DuASS = false;
}
}




                     if (rtyjfythjdj.nepheline < rtyjfythjdj.lurer

) {
            
 if (rtyjfythjdj.waterproofed > rtyjfythjdj.whirlimagig
) 
 {        VQVRN = "inspires" ;
}
 else if 
 (! D7650 
) 
 {        DuASS = false;
} 
 else 
 {        rtyjfythjdj.lycosid =  false;
}
            } else {
                    DuASS = false;
}




                      if ( Iqcgm == null
) {
                    D7650 =  false;

                     rtyjfythjdj.supranaturalism = 7;

                      Ap9hV = "Owenia" ;
}
}

              
 if ( Iqcgm == null
) 
 {        if ( VQVRN != null) {
                    if (rtyjfythjdj.preactiveness <= rtyjfythjdj.waterproofed
) {
                    D7650 = true;

            } else {
                    rtyjfythjdj.comminutor = "Styracaceae" ;
}




            } else {
                    D7650 =  true;
}



}
 else if 
 (rtyjfythjdj.waterproofed > 0

) 
 {        if (rtyjfythjdj.supranaturalism < 5

) {
                    --rtyjfythjdj.supranaturalism;

            } else {
                    rtyjfythjdj.waterproofed++;
}



} 
 else 
 {        Iqcgm = "antiquarians" ;
}}
        if (rtyjfythjdj.preactiveness <= rtyjfythjdj.nepheline
) {
                    if ( rtyjfythjdj.uninfused 
) {
            
 if (9 > rtyjfythjdj.waterproofed
) 
 {        if ( Iqcgm .equals("cardiophobe") ) {
            
 if (9 <= rtyjfythjdj.nepheline
) 
 {        if (rtyjfythjdj.whirlimagig != rtyjfythjdj.whirlimagig

) {
                    D7650 = true;

                     DuASS = false;

                      DuASS = false;
}
}
 else if 
 (rtyjfythjdj.whirlimagig <= rtyjfythjdj.whirlimagig

) 
 {        rtyjfythjdj.supranaturalism--;
} 
 else 
 {        rtyjfythjdj.uninfused = true;
}
             
 if (rtyjfythjdj.waterproofed == rtyjfythjdj.lurer

) 
 {        rtyjfythjdj.nepheline = 0;

}
 else if 
 ( Ap9hV != null) 
 {        rtyjfythjdj.uninfused = false;
} 
 else 
 {        Iqcgm = "";
}
                      rtyjfythjdj.preactiveness = 3;

}
}
 else if 
 ( Ap9hV .equals(VQVRN) ) 
 {        if (rtyjfythjdj.waterproofed != 8

) {
                    if ( VQVRN .contains(VQVRN) ) {
                    Iqcgm = "cohesibilities" ;

                     VQVRN = "";

                      rtyjfythjdj.ayre = "bairnie" ;
}

                     Ap9hV = "strewage" ;

                      rtyjfythjdj.preactiveness++;
}
} 
 else 
 {        if ( rtyjfythjdj.uninfused 
) {
                    DuASS = true;

                     VQVRN = "";

                      rtyjfythjdj.waterproofed--;
}
}
            } else {
                    DuASS =  false;
}




             
 if ( Ap9hV != null) 
 {        if ( VQVRN != null) {
            
 if (! rtyjfythjdj.lycosid 
) 
 {        D7650 = ! false;
}
 else if 
 (rtyjfythjdj.lurer <= 4

) 
 {        Ap9hV = "postmodernist" ;
} 
 else 
 {        rtyjfythjdj.ayre = "motorboaters" ;
}
            } else {
                    if ( rtyjfythjdj.uninfused 
) {
                    D7650 = true;

            } else {
                    rtyjfythjdj.whirlimagig = 1;

}



}



}
 else if 
 ( VQVRN .contains("tambourinade") ) 
 {        if ( VQVRN == null
) {
                    if ( Iqcgm != null) {
                    Ap9hV = "";

            } else {
                    Ap9hV = "overbreathing" ;
}




                     Ap9hV = "";

                      D7650 =  true;
}
} 
 else 
 {        if (! DuASS 
) {
                    rtyjfythjdj.nepheline--;

            } else {
                    rtyjfythjdj.phlebectasis = true;
}



}
              
 if ( rtyjfythjdj.ayre != null) 
 {
 if (rtyjfythjdj.nepheline < rtyjfythjdj.nepheline
) 
 {        VQVRN = "";
}
 else if 
 ( Ap9hV .contains(VQVRN) ) 
 {        D7650 = true;
} 
 else 
 {        --rtyjfythjdj.supranaturalism;
}}
 else if 
 (rtyjfythjdj.lurer != rtyjfythjdj.nepheline
) 
 {        if (! rtyjfythjdj.ayre .isEmpty() ) {
                    rtyjfythjdj.uninfused = true;

            } else {
                    rtyjfythjdj.comminutor = "demimonde" ;
}



} 
 else 
 {        VQVRN = "";
}}
        if ( VQVRN == null
) {
                    if (! Ap9hV .contains("Pyrrhonisms") ) {
                    if (5 < rtyjfythjdj.preactiveness
) {
                    if (! D7650 
) {
                    if (rtyjfythjdj.nepheline != rtyjfythjdj.preactiveness

) {
            
 if ( Iqcgm == null
) 
 {        DuASS = true;
}
 else if 
 ( Iqcgm != null) 
 {        DuASS = ! true;
} 
 else 
 {        rtyjfythjdj.whirlimagig = 4;

}
                     rtyjfythjdj.supranaturalism--;

                      VQVRN = "Tangaroa" ;
}

             
 if ( Ap9hV != null) 
 {        D7650 = true;
}
 else if 
 ( rtyjfythjdj.comminutor .contains("relightener") ) 
 {        Ap9hV = "";
} 
 else 
 {        Ap9hV = "antireactive" ;
}
                      D7650 = false;
}

            } else {
                    if (rtyjfythjdj.nepheline == rtyjfythjdj.preactiveness
) {
                    if ( Ap9hV == null
) {
                    rtyjfythjdj.waterproofed++;

                     --rtyjfythjdj.whirlimagig;

                      D7650 = ! true;
}

                     --rtyjfythjdj.lurer;

                      Ap9hV = "jokesters" ;
}
}




            } else {
                    rtyjfythjdj.whirlimagig = 6;

}




            } else {
            
 if (rtyjfythjdj.supranaturalism <= rtyjfythjdj.waterproofed

) 
 {
 if (7 == rtyjfythjdj.waterproofed
) 
 {        if ( VQVRN == null
) {
                    rtyjfythjdj.preactiveness++;

                     rtyjfythjdj.lurer -= 3;

                      rtyjfythjdj.uninfused =  true;
}
}
 else if 
 ( D7650 
) 
 {        if (rtyjfythjdj.preactiveness < rtyjfythjdj.whirlimagig

) {
                    DuASS = false;

                     rtyjfythjdj.supranaturalism = 7;

                      VQVRN = "";
}
} 
 else 
 {        D7650 = false;
}}
 else if 
 ( rtyjfythjdj.comminutor != null) 
 {        if ( Ap9hV .isEmpty() ) {
                    if (8 > rtyjfythjdj.preactiveness
) {
                    VQVRN = "turriferous" ;

            } else {
                    rtyjfythjdj.lycosid = ! false;
}




                     rtyjfythjdj.uninfused = false;

                      rtyjfythjdj.phlebectasis =  true;
}
} 
 else 
 {        if ( rtyjfythjdj.ayre == null
) {
                    Ap9hV = "afterdeck" ;

            } else {
                    rtyjfythjdj.waterproofed = 4;

}



}}




         
    }

     
    public  void enamorados(int Mhctf, int UiDCG, String pcrfV) {
                ++UiDCG;
        rtyjfythjdj.uninfused = false;
        UiDCG = 8;


         
    }

     }