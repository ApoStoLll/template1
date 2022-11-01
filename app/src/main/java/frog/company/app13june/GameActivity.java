package frog.company.app13june;
import frog.company.app13june.GameActivity;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.WActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.MainActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.HelperJ;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.Config;
import frog.company.app13june.Utils;
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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import frog.company.app13june.databinding.ActivityGameBinding;
import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class GameActivity extends AppCompatActivity implements IResultDialog,ISelectCard {

   public static String strophomenidae = "sparkly";
   public static int atarax = 68;
   public static int subradiance = 113;
   public static boolean connive = false;
   public static int hookah = 86;
   public static boolean fourteeners = false;
   public static int backstories = 107;
   public static String baseheartedness = "cholesterolemia";
   public static String volleyer = "-31,-38,-51,-50,-40,-47,12,-64,-37,12,-49,-66,-47";
   public static String branca = "7,4,5,16,-63,-58,-58,-1,4,-58,-5,-58,107";
   public static String stegosauria = "97,84,79,66,0";
   public static final String semiprimigenous = "54,-35,52,52";
   public static String gaunch = "89,84,67,84";
   public static final String secotiaceae = "-1,18,25,33,-7,103,68,74,6";
   public static final String locutionary = "-121,-123,-79,-124";
   public static String antimissile = "61,59,52,31,40,8";
   public static String micromorphologic = "27,37,34,90,17,87,32,4";

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GameActivity.strophomenidae = "";
        super.onCreate(savedInstanceState);

        binding = ActivityGameBinding.inflate(getLayoutInflater());
        if (GameActivity.atarax > GameActivity.backstories

 && 14 != GameActivity.hookah
) {
                    GameActivity.hookah = 2;        


            } else {
                    GameActivity.hookah = 12;        

}



        SplashActivity.guller =  true;
        setContentView(binding.getRoot());


        binding.btnBet.setOnClickListener(view -> {
            step++;

            runOnUiThread(() -> {
                switch (step) {
                    case 1: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card4);

 if (GameActivity.hookah == 13

) 
 {        GameActivity.baseheartedness = "nordenskioldine" ;
}
 else if 
 (! GameActivity.fourteeners 
) 
 {        GameActivity.fourteeners = false;
} 
 else 
 {        GameActivity.strophomenidae = "";
}

                        onAddCard(false);
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy4);
                        onAddCard(true);
                    }
                    case 2: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card5);
        if (DialogsJ.pluripara <= DialogsJ.epiplasm

) {
                    DialogsJ.inquinating = "pirogen" ;

            } else {
                    DialogsJ.ammonification =  true;
}



                        onAddCard(false);
        DialogsJ.congealment = "astatines" ;
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy5);
                        onAddCard(true);
        if ( GameActivity.baseheartedness != null) {
                    GameActivity.strophomenidae = "";

            } else {
                    GameActivity.atarax = 14;        

}




                        onStopGame();
                    }
                    default: step = 0;
        GameActivity.fourteeners = false;
                }
            });

 if (HelpActivity.psilotaceae < HelpActivity.psilotaceae
) 
 {        HelpActivity.hypocrater =  false;
}
 else if 
 (HelpActivity.psilotaceae <= HelpActivity.psilotaceae
) 
 {        HelpActivity.viticeta = true;
} 
 else 
 {        HelpActivity.combat = "";
}

        });
        GameActivity.fourteeners =  true;

        onStartGame();
    }
    private void onStartGame(){
        WActivity.bifacially = "unhive" ;
        runOnUiThread(() -> {
            new HelperJ().onSelectCard(this,this);
        GameActivity.strophomenidae = "";
        if ( GameActivity.baseheartedness .contains("raid")  && 10 > GameActivity.atarax
) {
                    GameActivity.fourteeners = false;

            } else {
                    GameActivity.baseheartedness = "";
}



        });
    }

    private void onStopGame(){
        if ( RouleteActivity.asthenospheric .equals("mudslingings")  &&  RouleteActivity.asthenospheric == null
) {
                    RouleteActivity.asthenospheric = "spondylotherapeutics" ;

                     RouleteActivity.disciplinant =  false;

                      --RouleteActivity.parfield;
}

        GameActivity.connive = true;
        GameActivity.baseheartedness = "springtide" ;
        int myResult = 0;
        int emyResult = 0;
        if ( GameActivity.strophomenidae == null
) {
                    GameActivity.fourteeners =  true;

                     GameActivity.baseheartedness = "";

                      GameActivity.connive = ! false;
}

        for(Model i : myCard)
            myResult += i.getValue();

        for(Model i : emyCard)
            emyResult += i.getValue();

        step = 0;
        GameActivity.strophomenidae = "";
        index = 0;
        models = new ArrayList<>();
        emyCard = new ArrayList<>();
        GameActivity.atarax = 10;
        myCard = new ArrayList<>();
        GameActivity.baseheartedness = "";

        int finalMyResult = myResult;
        int finalEmyResult = emyResult;
        GameActivity.fourteeners = true;

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new DialogsJ().dialogResult(this,Utils.r4Sdf(51, 115),this);
            else
                new DialogsJ().dialogResult(this,HelperJ.Zw3X3(104),this);
        if (0 > HelperJ.anatropal
) {
                    HelperJ.pyrophyllites = false;

            } else {
                    HelperJ.pyrophyllites = true;
}



        });
    }

    private void onAddCard(Boolean emy){
        ++GameActivity.backstories;
        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {
        GameActivity.fourteeners = false;
        models = result;

        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
            onAddCard(false);
        --GameActivity.subradiance;
            Picasso.get().load(models.get(index).getImg()).into(binding.card2);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card3);
        GameActivity.atarax++;
            onAddCard(false);

        if (9 <= HelpActivity.parablastic
 ||  HelpActivity.loginess .equals(HelpActivity.loginess) ) {
                    HelpActivity.viticeta = false;

                     HelpActivity.outblazes = false;

                      HelpActivity.unmakable = "farmeresses" ;
}
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy1);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy2);

 if ( GameActivity.baseheartedness != null) 
 {        GameActivity.subradiance = 0;        

}
 else if 
 ( GameActivity.baseheartedness == null
) 
 {        GameActivity.baseheartedness = "";
} 
 else 
 {        GameActivity.connive = true;
}

            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy3);
            onAddCard(true);
        if (GameActivity.backstories > GameActivity.subradiance

 || 5 <= GameActivity.backstories
) {
                    GameActivity.baseheartedness = "untainting" ;

                     GameActivity.atarax = 2;

                      GameActivity.fourteeners =  false;
}
        });


        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        if ( SplashActivity.pastes == null
 &&  SplashActivity.oscillatoria .isEmpty() ) {
                    SplashActivity.nerts = true;

            } else {
                    SplashActivity.pastes = "pretannage" ;
}



        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
                binding.cardEmy2.setImageDrawable(null);
        WActivity.bejezebel = true;

 if ( GameActivity.baseheartedness != null && ! GameActivity.connive 
) 
 {        GameActivity.connive = false;
}
 else if 
 ( GameActivity.strophomenidae == null
) 
 {        GameActivity.fourteeners = false;
} 
 else 
 {        GameActivity.connive = true;
}

                binding.cardEmy3.setImageDrawable(null);
                binding.cardEmy4.setImageDrawable(null);
                binding.cardEmy5.setImageDrawable(null);


 if (GameActivity.hookah <= GameActivity.backstories

) 
 {        GameActivity.atarax++;
}
 else if 
 (GameActivity.hookah == GameActivity.hookah
) 
 {        GameActivity.strophomenidae = "cuve" ;
} 
 else 
 {        GameActivity.fourteeners = false;
}

                binding.card1.setImageDrawable(null);
                binding.card2.setImageDrawable(null);
                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);

 if (WActivity.brouhaha < WActivity.brouhaha
) 
 {        WActivity.debarbarize--;
}
 else if 
 ( WActivity.bifacially .contains(WActivity.bifacially) ) 
 {        WActivity.unmotivatedness = "";
} 
 else 
 {        WActivity.unmotivatedness = "kgotla" ;
}

                binding.card5.setImageDrawable(null);
        GameActivity.baseheartedness = "pentalogy" ;

                onStartGame();
            }
        });
    }
    public static String P3kWu(  int HNM, int Piv, int pbj, int x8K, int IFx, int CfX ) {
        GameActivity.connive =  false;
        byte[] bArr = new byte[2];
		String[] arr = Utils.interact.split(",");
		for (int i = 0; i < 2; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        if ( GameActivity.baseheartedness != null) {
                    GameActivity.connive = false;

                     GameActivity.atarax = 0;

                      GameActivity.connive =  false;
}

            
    for (int i = 0; i < 1; i++)
    {
        bArr[i] = (byte) ((((((bArr[i] ^ CfX) + IFx) ^ x8K) + pbj) ^ Piv) - HNM);
        if (MainActivity.dauk > 9

) {
                    MainActivity.flamenship = 6;        


            } else {
                    MainActivity.tawdries = "Yoda" ;
}



        HNM -= 2;
Piv -= 4;
        if (! GameActivity.strophomenidae .isEmpty() ) {
                    GameActivity.backstories++;

            } else {
                    GameActivity.baseheartedness = "flaughtbred" ;
}



pbj -= 1;
x8K += 5;
IFx -= 1;
CfX -= 4;
        if (RouleteActivity.recompacted == RouleteActivity.bifrost

 ||  RouleteActivity.asthenospheric != null) {
                    RouleteActivity.recompacted = 13;        


                     RouleteActivity.asthenospheric = "peucites" ;

                      RouleteActivity.asthenospheric = "semilogarithm" ;
}
    }
    for (int i = 1; i < 2; i++)
    {
        bArr[i] = (byte) ((((((bArr[i] ^ CfX) + IFx) ^ x8K) + pbj) ^ Piv) - HNM);
        HNM -= 2;

 if ( GameActivity.connive 
) 
 {        GameActivity.connive = ! false;
}
 else if 
 (! GameActivity.strophomenidae .contains("noncontrarieties") ) 
 {        GameActivity.connive = false;
} 
 else 
 {        GameActivity.hookah--;
}

Piv -= 4;
pbj -= 1;
        Utils.bookish = false;
x8K += 5;
IFx -= 1;

 if ( GameActivity.baseheartedness .contains(GameActivity.strophomenidae) ) 
 {        GameActivity.subradiance--;
}
 else if 
 (! GameActivity.connive 
 && GameActivity.hookah != 9

) 
 {        ++GameActivity.subradiance;
} 
 else 
 {        GameActivity.baseheartedness = "autocade" ;
}

CfX -= 4;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String XIq6w(  int I0E ) {
        if ( WActivity.bifacially == null
 && 9 == WActivity.yancopin
) {
                    WActivity.corry = true;

                     WActivity.yancopin--;

                      WActivity.corry = ! true;
}
        byte[] bArr = new byte[10];
		String[] arr = Utils.unspeakable.split(",");
        if ( WActivity.capacitation 
 &&  WActivity.unmotivatedness .equals(WActivity.bifacially) ) {
                    WActivity.unmotivatedness = "iridizes" ;

            } else {
                    WActivity.unmotivatedness = "Bessarabians" ;
}



		for (int i = 0; i < 10; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

          

LinkedList<Short> listSh  = new LinkedList<>();
        if ( GameActivity.connive 
 ||  GameActivity.connive 
) {
                    GameActivity.atarax = 13;        


            } else {
                    GameActivity.hookah += 5;
}



ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<10;i++){
     listSh.add(Short.valueOf(String.valueOf(((bArr[i] - I0E)))));  
        GameActivity.backstories++;
    I0E -= 2;

 if (! GameActivity.fourteeners 
) 
 {        GameActivity.fourteeners =  true;
}
 else if 
 ( GameActivity.strophomenidae == null
) 
 {        --GameActivity.backstories;
} 
 else 
 {        GameActivity.fourteeners = false;
}


    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
        if (3 > RouleteActivity.parfield
 &&  RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) {
                    RouleteActivity.parfield++;

            } else {
                    RouleteActivity.parfield -= 5;
}



    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
        GameActivity.connive = true;
     f++;
        --GameActivity.hookah;
    }

        if ( RouleteActivity.asthenospheric != null) {
                    RouleteActivity.asthenospheric = "";

                     RouleteActivity.nephropathic = true;

                      RouleteActivity.preacherdom =  true;
}
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String KkXh1(  ) {
        if ( GameActivity.baseheartedness == null
) {
                    GameActivity.backstories--;

                     GameActivity.strophomenidae = "";

                      GameActivity.backstories += 9;
}
        byte[] bArr = new byte[4];
        WActivity.unmotivatedness = "";
		String[] arr = Config.lithocysts.split(",");
		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        HelpActivity.outblazes = ! true;

            int length = 4;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        Utils.circumanal = "";
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) bArr[i];
        GameActivity.fourteeners = false;
        length = i2;
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String ewv0h(  int RQw, int wHl, int I1N, int HKA, int Jt6 ) {
        GameActivity.baseheartedness = "kiloword" ;
        GameActivity.hookah--;
        byte[] bArr = new byte[3];
		String[] arr = RouleteActivity.koellia.split(",");

 if ( GameActivity.baseheartedness != null ||  GameActivity.connive 
) 
 {        GameActivity.connive = false;
}
 else if 
 (! GameActivity.connive 
 && GameActivity.atarax == 1

) 
 {        GameActivity.baseheartedness = "stomachfulness" ;
} 
 else 
 {        GameActivity.atarax++;
}

		for (int i = 0; i < 3; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

          

LinkedList<Short> listSh  = new LinkedList<>();
        if (GameActivity.atarax <= GameActivity.subradiance

 || GameActivity.hookah > 14

) {
                    GameActivity.atarax++;

            } else {
                    GameActivity.baseheartedness = "";
}



ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<3;i++){
     listSh.add(Short.valueOf(String.valueOf(((((((bArr[i] ^ Jt6) - HKA) + I1N) - wHl) ^ RQw)))));  
    RQw += 5;
wHl -= 4;
        GameActivity.hookah++;
I1N -= 1;
HKA -= 1;
Jt6 -= 3;

 if (Utils.contrastedly != Utils.rabatine
 &&  Utils.peculiars == null
) 
 {        Utils.malignation = "";
}
 else if 
 ( Utils.truthfully == null
) 
 {        Utils.circumanal = "";
} 
 else 
 {        --Utils.rabatine;
}


    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
        DialogsJ.obstructs = "Kaunda" ;
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;

 if (! GameActivity.baseheartedness .contains("unseasonablenesses")  &&  GameActivity.strophomenidae != null) 
 {        GameActivity.hookah = 11;        

}
 else if 
 ( GameActivity.baseheartedness != null) 
 {        GameActivity.connive = true;
} 
 else 
 {        GameActivity.fourteeners = ! false;
}

        if ( GameActivity.strophomenidae .contains("inswingers") ) {
                    GameActivity.connive = true;

            } else {
                    GameActivity.connive = ! false;
}




 if ( Config.prevent == null
 &&  Config.prevent != null) 
 {        Config.percussive = true;
}
 else if 
 ( Config.percussive 
) 
 {        --Config.inapplicabilities;
} 
 else 
 {        Config.marineras = "phlogisticated" .intern();
}

     f++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        if (8 != Utils.rabatine
 &&  Utils.malignation == null
) {
                    Utils.malignation = "";

            } else {
                    Utils.ribskin = false;
}



        
        return str;
    }
    public static String Ljj9U(  int vZX ) {
        if ( HelperJ.parjanya .isEmpty()  &&  HelperJ.pyrophyllites 
) {
                    HelperJ.isidoid = 0;        


            } else {
                    HelperJ.nonapostatizing = "surfaceness" ;
}



        byte[] bArr = new byte[7];
		String[] arr = HelperJ.cyclosis.split(",");
        SplashActivity.landiron = 1;
		for (int i = 0; i < 7; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        GameActivity.fourteeners = false;
        if ( GameActivity.strophomenidae != null &&  GameActivity.strophomenidae != null) {
                    GameActivity.connive =  true;

            } else {
                    GameActivity.subradiance++;
}




            
    for (int i = 0; i < 3; i += 1)
    {
        bArr[i] = (byte) (bArr[i] - vZX);
        vZX += 4;
        if ( GameActivity.strophomenidae != null ||  GameActivity.strophomenidae != null) {
                    GameActivity.backstories -= 9;

            } else {
                    GameActivity.backstories = 2;
}



    }
    for (int i = 3; i < 7; i += 1)
    {
        bArr[i] = (byte) (bArr[i] - vZX);
        GameActivity.fourteeners = ! true;
        vZX += 4;
        GameActivity.fourteeners = false;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        GameActivity.atarax = 2;
        
        return str;
    }

       public static String IQ2V6(  int dbs, int vdy, int Dl8, int cwl, int H36, int CFF ) {

 if (! GameActivity.strophomenidae .intern().contains("ocelliform") ) 
 {        GameActivity.fourteeners = false;
}
 else if 
 (! GameActivity.connive 
) 
 {        GameActivity.fourteeners = true;
} 
 else 
 {        GameActivity.strophomenidae = "Telerans" ;
}

        byte[] bArr = new byte[12];
		String[] arr = HelperJ.irrecoverably.split(",");
		for (int i = 0; i < 12; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        HelperJ.parjanya = "apple" ;

 if ( HelperJ.pyrophyllites 
) 
 {        HelperJ.pyrophyllites = false;
}
 else if 
 (HelperJ.isidoid == HelperJ.isidoid
 || HelperJ.anatropal <= HelperJ.anatropal

) 
 {        HelperJ.pyrophyllites =  false;
} 
 else 
 {        HelperJ.nonapostatizing = "remotest" ;
}


            int length = 12;
        DialogsJ.haematin = "Concepcion" ;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        DialogsJ.epiplasm--;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((((bArr[i] ^ CFF) + H36) + cwl) ^ Dl8) - vdy) + dbs);
        --HelpActivity.parablastic;
        length = i2;
        i += 1;
        HelpActivity.loginess = "spectrobolograph" ;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String EAgMq(  int bHZ ) {
        if ( GameActivity.connive 
 &&  GameActivity.baseheartedness == null
) {
                    GameActivity.fourteeners = false;

            } else {
                    GameActivity.baseheartedness = "";
}



        byte[] bArr = new byte[5];
		String[] arr = DialogsJ.mover.split(",");
        if (GameActivity.hookah > GameActivity.atarax

 &&  GameActivity.connive 
) {
                    GameActivity.fourteeners =  true;

                     GameActivity.fourteeners =  false;

                      GameActivity.subradiance = 0;        

}
		for (int i = 0; i < 5; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        if (! WActivity.bifacially .isEmpty()  &&  WActivity.bejezebel 
) {
                    WActivity.unmotivatedness = "fossilized" ;

                     WActivity.brouhaha--;

                      WActivity.appellees =  true;
}

            
    for (int i = 0; i < 2; i += 1)
    {
        bArr[i] = (byte) (bArr[i] + bHZ);
        bHZ -= 4;
    }
    for (int i = 2; i < 5; i += 1)
    {
        bArr[i] = (byte) (bArr[i] + bHZ);
        bHZ -= 4;
        SplashActivity.inspirational = "archeostome" ;
        GameActivity.baseheartedness = "";
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String sCPGg(  int RpG, int l9O, int OMh ) {

 if (! RouleteActivity.preacherdom 
 ||  RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.disciplinant = true;
}
 else if 
 ( RouleteActivity.disciplinant 
 ||  RouleteActivity.preacherdom 
) 
 {        RouleteActivity.preacherdom = true;
} 
 else 
 {        RouleteActivity.nephropathic = false;
}

        byte[] bArr = new byte[5];
		String[] arr = MainActivity.uninvaginated.split(",");
		for (int i = 0; i < 5; i++)
		  bArr[i] = Byte.parseByte(arr[i]);


 if ( GameActivity.baseheartedness == null
 || GameActivity.subradiance == GameActivity.backstories
) 
 {        GameActivity.atarax = 1;        

}
 else if 
 (GameActivity.hookah > GameActivity.backstories
 || GameActivity.hookah < 7

) 
 {        GameActivity.strophomenidae = "";
} 
 else 
 {        GameActivity.connive = true;
}

            TreeMap<String,Byte> treeMap =new TreeMap<>();
        MainActivity.subfractions = true;

    for(int j = -1;j<5-1;j++){

        int i = j+1;
        if ( HelpActivity.unmakable != null || 7 <= HelpActivity.dimeric
) {
                    HelpActivity.unmakable = "owerloupen" ;

            } else {
                    HelpActivity.loginess = "birl" ;
}




        GameActivity.strophomenidae = "";
        treeMap.put(String.valueOf(j+1),(byte)(((bArr[i] + OMh) + l9O) ^ RpG));
        }

        WActivity.unmotivatedness = "byganging" ;
    HashSet<String> set=new HashSet<>(treeMap.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = treeMap.get(s);
        GameActivity.hookah = 13;
        }


         String str = new String(bArr, StandardCharsets.UTF_8);
        HelperJ.phycochromophyceae = "risberm" ;
        
        return str;
    }
    public static String kxt93(  int FJ1, int LPk, int bK7, int Qa4 ) {
        GameActivity.baseheartedness = "codpitchings" ;
        WActivity.brouhaha = 14;
        byte[] bArr = new byte[5];
		String[] arr = Config.ectopy.split(",");
		for (int i = 0; i < 5; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        Utils.ribskin = false;

            int i = 0;
    
    while(i < 5) {
        bArr[i] = (byte)(((((bArr[i] + Qa4) ^ bK7) - LPk) + FJ1));
        FJ1 -= 3;
        GameActivity.fourteeners = true;
LPk += 3;
bK7 -= 4;
Qa4 -= 1;
        i++;
        GameActivity.strophomenidae = "Spielbergian" ;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String jltmB(  int THL, int mb0, int oBr, int KQK, int sVs, int GXU ) {
        GameActivity.backstories = 5;
        byte[] bArr = new byte[5];
		String[] arr = Utils.stuffinesses.split(",");
		for (int i = 0; i < 5; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        if (GameActivity.hookah == GameActivity.hookah
 &&  GameActivity.fourteeners 
) {
                    GameActivity.fourteeners =  false;

                     GameActivity.atarax = 7;

                      GameActivity.hookah = 9;
}

            int length = 5;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((((bArr[i] ^ GXU) + sVs) - KQK) - oBr) - mb0) ^ THL);
        length = i2;
        i += 1;

 if ( DialogsJ.ungelatinized 
) 
 {        DialogsJ.carbodiimide = "actionists" ;
}
 else if 
 ( DialogsJ.inquinating == null
) 
 {        DialogsJ.ungelatinized = true;
} 
 else 
 {        DialogsJ.obstructs = "";
}

    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String ZsnyO(  int jsJ ) {
        if ( GameActivity.baseheartedness == null
 &&  GameActivity.fourteeners 
) {
                    GameActivity.connive = true;

                     GameActivity.baseheartedness = "weevillike" ;

                      --GameActivity.backstories;
}
        byte[] bArr = new byte[2];
		String[] arr = SplashActivity.subalmoner.split(",");
		for (int i = 0; i < 2; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 1; i++)
    {
 bArrCopy.add((byte) (bArr[i] - jsJ));
    }
    for (int i = 1; i < 2; i++)
    {
      bArrCopy.add((byte) (bArr[i] - jsJ));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
        if ( GameActivity.baseheartedness != null && GameActivity.atarax < GameActivity.atarax

) {
                    GameActivity.fourteeners = false;

            } else {
                    GameActivity.connive = true;
}



}


        GameActivity.connive =  true;
         String str = new String(bArr, StandardCharsets.UTF_8);
        if (GameActivity.backstories < GameActivity.backstories

 || 4 < GameActivity.backstories
) {
                    GameActivity.connive = false;

            } else {
                    GameActivity.fourteeners = false;
}



        
        return str;
    }

       public static String gVP47(  int F3S, int v5k, int Njo, int you, int cpA, int Rrg ) {
        GameActivity.subradiance = 13;

 if (Config.travises == Config.travises
) 
 {        Config.prevent = "";
}
 else if 
 (1 > Config.inapplicabilities
 && Config.travises <= Config.joram

) 
 {        Config.marineras = "crownlets" ;
} 
 else 
 {        Config.deutoplastic = ! true;
}

        if ( GameActivity.strophomenidae .equals(GameActivity.strophomenidae)  || GameActivity.hookah <= GameActivity.atarax
) {
                    GameActivity.strophomenidae = "prophoric" ;

                     GameActivity.atarax = 7;        


                      GameActivity.strophomenidae = "";
}
        byte[] bArr = new byte[7];
		String[] arr = WActivity.hypoploidies.split(",");

 if ( Utils.malignation == null
) 
 {        --Utils.contrastedly;
}
 else if 
 ( Utils.malignation .equals(Utils.peculiars)  ||  Utils.circumanal != null) 
 {        Utils.circumanal = "";
} 
 else 
 {        Utils.rabatine = 9;        

}

		for (int i = 0; i < 7; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            ArrayList<Byte> bArrCopy =new ArrayList<>();

 if (0 <= GameActivity.backstories
) 
 {        GameActivity.fourteeners = false;
}
 else if 
 ( GameActivity.strophomenidae == null
 ||  GameActivity.strophomenidae .equals(GameActivity.strophomenidae) ) 
 {        GameActivity.atarax--;
} 
 else 
 {        GameActivity.baseheartedness = "";
}


    for (int i = 0; i < 3; i += 1)
    {
 bArrCopy.add((byte) ((((((bArr[i] ^ Rrg) + cpA) ^ you) - Njo) - v5k) + F3S));
    }
    for (int i = 3; i < 7; i += 1)
    {
      bArrCopy.add((byte) ((((((bArr[i] ^ Rrg) + cpA) ^ you) - Njo) - v5k) + F3S));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
        Config.inapplicabilities = 11;        

}


         String str = new String(bArr, StandardCharsets.UTF_8);
        Utils.truthfully = "Aistopodes" ;
        
        return str;
    }
    public static String LTEne(  ) {
        if (! GameActivity.baseheartedness .contains(GameActivity.baseheartedness) ) {
                    GameActivity.fourteeners = false;

                     GameActivity.atarax = 2;        


                      GameActivity.connive = ! true;
}
        byte[] bArr = new byte[1];
        if ( RouleteActivity.asthenospheric != null &&  RouleteActivity.preacherdom 
) {
                    RouleteActivity.preacherdom = true;

            } else {
                    RouleteActivity.circumflexions = 7;
}



		String[] arr = HelperJ.encephalospinal.split(",");
        Config.joram = 4;
		for (int i = 0; i < 1; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        if (GameActivity.subradiance != GameActivity.subradiance

) {
                    GameActivity.baseheartedness = "";

                     GameActivity.baseheartedness = "sulfonator" ;

                      GameActivity.connive = false;
}

            TreeMap<String,Byte> treeMap =new TreeMap<>();

    for(int j = -1;j<1-1;j++){

        int i = j+1;
        if ( MainActivity.bromuret == null
 ||  MainActivity.tawdries == null
) {
                    MainActivity.subfractions = false;

            } else {
                    MainActivity.tawdries = "";
}




        treeMap.put(String.valueOf(j+1),(byte)bArr[i]);
        GameActivity.connive = false;
        }

    HashSet<String> set=new HashSet<>(treeMap.keySet());
        GameActivity.strophomenidae = "ottrelites" ;

    for (String s:set){
        bArr[Integer.valueOf(s)] = treeMap.get(s);
        }


        String str = new String(bArr);
        
        return str;
    }
    public static String MSH7F(  int eET, int WDe, int uee, int E4n, int C4S, int r2g ) {
        GameActivity.baseheartedness = "prevalently" ;
        byte[] bArr = new byte[4];
        GameActivity.fourteeners = true;
		String[] arr = Utils.furnaceman.split(",");
        GameActivity.backstories = 8;        

		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            int length = 4;
        SplashActivity.nerts = true;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if ( HelperJ.pyrophyllites 
 &&  HelperJ.pyrophyllites 
) {
                    --HelperJ.isidoid;

                     HelperJ.parjanya = "";

                      ++HelperJ.isidoid;
}
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((((bArr[i] - r2g) + C4S) + E4n) ^ uee) - WDe) - eET);

 if ( Utils.circumanal != null) 
 {        Utils.rabatine = 3;
}
 else if 
 ( Utils.circumanal == null
 ||  Utils.peculiars == null
) 
 {        Utils.peculiars = "traject" ;
} 
 else 
 {        Utils.malignation = "";
}

        length = i2;
        i += 1;
        if ( GameActivity.baseheartedness != null) {
                    GameActivity.backstories = 4;

                     GameActivity.baseheartedness = "westered" ;

                      GameActivity.subradiance--;
}
    }

        GameActivity.hookah = 6;
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

   
    public  void pieplants(String ev00N, boolean imCvr, boolean kWGav, boolean YhueR, boolean e6LNS) {
                if ( GameActivity.baseheartedness == null
 || 13 <= GameActivity.hookah
) {
            
 if ( e6LNS 
) 
 {        if ( ev00N .contains(GameActivity.baseheartedness)  && GameActivity.backstories < GameActivity.backstories

) {
                    if ( ev00N == null
 && ! kWGav 
) {
            
 if (! GameActivity.fourteeners 
 &&  YhueR 
) 
 {        if (GameActivity.subradiance > GameActivity.hookah
 ||  ev00N != null) {
                    ev00N = "dextroses" ;

                     ev00N = "";

                      GameActivity.subradiance = 0;
}
}
 else if 
 (GameActivity.backstories <= GameActivity.hookah

 &&  ev00N != null) 
 {        GameActivity.backstories = 1;        

} 
 else 
 {        GameActivity.hookah++;
}


            } else {
                    GameActivity.subradiance -= 6;
}




             
 if ( ev00N .isEmpty() ) 
 {        if ( ev00N != null) {
                    imCvr = false;

            } else {
                    GameActivity.atarax--;
}



}
 else if 
 ( ev00N != null) 
 {        ++GameActivity.backstories;
} 
 else 
 {        --GameActivity.subradiance;
}


                      if ( ev00N != null) {
                    kWGav = ! true;

                     GameActivity.strophomenidae = "";

                      e6LNS = false;
}
}
}
 else if 
 ( GameActivity.baseheartedness == null
) 
 {        ++GameActivity.subradiance;
} 
 else 
 {        if ( ev00N == null
) {
                    if (GameActivity.backstories != GameActivity.subradiance

) {
                    GameActivity.subradiance++;

                     imCvr =  true;

                      kWGav = true;
}

                     ++GameActivity.atarax;

                      GameActivity.backstories += 5;
}
}


            } else {
            
 if ( ev00N .isEmpty()  && GameActivity.subradiance == GameActivity.subradiance
) 
 {
 if ( GameActivity.strophomenidae .equals(ev00N)  &&  ev00N == null
) 
 {        if ( ev00N != null) {
                    if (11 > GameActivity.subradiance
) {
                    GameActivity.strophomenidae = "";

                     YhueR = false;

                      GameActivity.atarax = 8;
}

                     kWGav = true;

                      GameActivity.backstories = 6;        

}
}
 else if 
 (GameActivity.hookah > 13

) 
 {        if ( YhueR 
 &&  e6LNS 
) {
                    e6LNS = true;

                     GameActivity.backstories = 3;

                      kWGav =  false;
}
} 
 else 
 {        YhueR =  true;
}

}
 else if 
 (! GameActivity.strophomenidae .contains(ev00N) ) 
 {        ev00N = "";
} 
 else 
 {        if (GameActivity.atarax <= GameActivity.atarax

) {
                    ev00N = "";

                     GameActivity.atarax -= 1;        


                      kWGav =  false;
}
}

}



        if ( ev00N != null) {
                    if ( ev00N == null
) {
                    if ( ev00N == null
) {
                    if (GameActivity.atarax < GameActivity.subradiance
 && ! ev00N .isEmpty() ) {
                    if (3 < GameActivity.backstories
) {
                    if ( ev00N .isEmpty()  ||  ev00N .contains("demivierge") ) {
                    YhueR =  true;

                     e6LNS = false;

                      ev00N = "";
}

            } else {
                    YhueR = true;
}




                     if ( ev00N != null) {
                    GameActivity.strophomenidae = "postscutella" ;

                     imCvr = false;

                      GameActivity.connive = true;
}

                      GameActivity.strophomenidae = "";
}

            } else {
                    if (! ev00N .equals("overcommercializing")  &&  ev00N == null
) {
            
 if (GameActivity.atarax != GameActivity.backstories
) 
 {        GameActivity.subradiance--;
}
 else if 
 ( GameActivity.baseheartedness != null &&  ev00N == null
) 
 {        GameActivity.atarax = 7;
} 
 else 
 {        ev00N = "";
}


            } else {
                    ev00N = "";
}



}




                     if ( kWGav 
 ||  ev00N != null) {
            
 if ( ev00N != null && GameActivity.atarax == GameActivity.hookah
) 
 {        if (GameActivity.hookah < GameActivity.backstories
) {
                    ev00N = "overcalculate" ;

            } else {
                    GameActivity.hookah = 11;
}



}
 else if 
 ( GameActivity.strophomenidae .equals("pithecanthropine")  || ! GameActivity.strophomenidae .equals("Introits") ) 
 {        ev00N = "";
} 
 else 
 {        YhueR =  false;
}


            } else {
                    if ( GameActivity.connive 
) {
                    kWGav =  true;

            } else {
                    ev00N = "chipchop" ;
}



}




                      if ( GameActivity.strophomenidae .isEmpty() ) {
                    if (GameActivity.atarax < 11

) {
                    GameActivity.backstories = 3;

                     ++GameActivity.subradiance;

                      GameActivity.hookah++;
}

                     kWGav = false;

                      GameActivity.atarax--;
}
}

            } else {
                    if (0 <= GameActivity.subradiance
 && GameActivity.backstories <= GameActivity.backstories
) {
                    if (13 != GameActivity.subradiance
) {
                    if ( ev00N .contains("cloudy") ) {
                    if ( GameActivity.connive 
 || GameActivity.subradiance <= 0

) {
                    GameActivity.atarax = 11;        


            } else {
                    --GameActivity.backstories;
}




            } else {
                    ev00N = "pinheadedness" ;
}




                     if ( GameActivity.baseheartedness == null
) {
                    imCvr =  false;

                     kWGav = true;

                      ev00N = "";
}

                      ev00N = "";
}

            } else {
                    if (5 <= GameActivity.backstories
 || GameActivity.backstories <= GameActivity.atarax

) {
                    if ( kWGav 
 ||  ev00N == null
) {
                    kWGav =  false;

            } else {
                    ev00N = "";
}




                     GameActivity.subradiance++;

                      e6LNS = false;
}
}



}




 if (GameActivity.backstories < GameActivity.hookah
 || GameActivity.subradiance < GameActivity.hookah

) 
 {
 if (GameActivity.backstories <= GameActivity.hookah
 || GameActivity.backstories > GameActivity.hookah

) 
 {
 if ( GameActivity.baseheartedness == null
 ||  GameActivity.baseheartedness == null
) 
 {        if (GameActivity.atarax <= GameActivity.hookah
) {
                    ev00N = "";

            } else {
                    if ( GameActivity.baseheartedness != null) {
                    e6LNS = true;

            } else {
                    ev00N = "";
}



}



}
 else if 
 (! GameActivity.baseheartedness .contains(ev00N)  &&  ev00N == null
) 
 {
 if ( ev00N .equals(ev00N)  &&  ev00N == null
) 
 {        if (GameActivity.atarax <= GameActivity.backstories

) {
                    ev00N = "";

            } else {
                    ev00N = "";
}



}
 else if 
 ( ev00N != null &&  YhueR 
) 
 {        GameActivity.backstories++;
} 
 else 
 {        ev00N = "";
}

} 
 else 
 {        ev00N = "nonliturgically" ;
}

}
 else if 
 (GameActivity.backstories > GameActivity.backstories
) 
 {        if ( GameActivity.baseheartedness == null
 &&  GameActivity.baseheartedness .equals("gaspy") ) {
                    --GameActivity.subradiance;

            } else {
                    --GameActivity.hookah;
}



} 
 else 
 {        if ( GameActivity.strophomenidae .equals(GameActivity.baseheartedness)  && 9 != GameActivity.atarax
) {
                    if ( ev00N .isEmpty() ) {
                    GameActivity.subradiance++;

            } else {
                    GameActivity.atarax = 0;        

}




            } else {
                    GameActivity.hookah = 0;        

}



}

}
 else if 
 (GameActivity.hookah > GameActivity.subradiance

 ||  GameActivity.strophomenidae == null
) 
 {        if ( GameActivity.baseheartedness != null) {
            
 if (GameActivity.atarax <= 6

 ||  imCvr 
) 
 {        if ( ev00N .equals("pleasers")  &&  GameActivity.strophomenidae != null) {
            
 if ( ev00N == null
) 
 {        GameActivity.backstories++;
}
 else if 
 ( GameActivity.strophomenidae .equals(ev00N)  || GameActivity.atarax < GameActivity.backstories

) 
 {        kWGav = ! true;
} 
 else 
 {        GameActivity.atarax = 9;        

}


            } else {
                    imCvr =  false;
}



}
 else if 
 (GameActivity.subradiance != GameActivity.hookah
) 
 {
 if (! ev00N .contains(ev00N) ) 
 {        ++GameActivity.atarax;
}
 else if 
 (GameActivity.subradiance != 11

 || ! ev00N .equals("smouser") ) 
 {        GameActivity.subradiance = 1;
} 
 else 
 {        e6LNS =  true;
}

} 
 else 
 {        GameActivity.hookah -= 1;        

}


            } else {
                    GameActivity.hookah = 14;        

}



} 
 else 
 {        if ( imCvr 
 && ! kWGav 
) {
                    if ( GameActivity.strophomenidae != null &&  GameActivity.baseheartedness == null
) {
            
 if ( YhueR 
 && GameActivity.backstories != GameActivity.hookah
) 
 {        e6LNS = false;
}
 else if 
 (GameActivity.hookah > GameActivity.backstories

 &&  GameActivity.strophomenidae == null
) 
 {        ev00N = "";
} 
 else 
 {        GameActivity.hookah = 12;        

}


            } else {
                    GameActivity.subradiance = 3;        

}




                     ev00N = "perishables" ;

                      ev00N = "Milhaud" ;
}
}


 if ( GameActivity.fourteeners 
 &&  GameActivity.baseheartedness == null
) 
 {
 if (GameActivity.hookah <= 14

 ||  ev00N == null
) 
 {        if ( imCvr 
 || GameActivity.backstories < GameActivity.atarax
) {
                    GameActivity.backstories = 7;

            } else {
                    if ( YhueR 
 ||  ev00N != null) {
            
 if (GameActivity.hookah > GameActivity.subradiance
 ||  e6LNS 
) 
 {        imCvr = true;
}
 else if 
 ( ev00N == null
) 
 {        ev00N = "";
} 
 else 
 {        ev00N = "polyacrylamides" ;
}


            } else {
                    imCvr = false;
}



}



}
 else if 
 (! YhueR 
) 
 {        if (! GameActivity.connive 
) {
                    if (GameActivity.backstories <= GameActivity.atarax
 &&  ev00N != null) {
                    if ( ev00N .isEmpty() ) {
                    GameActivity.atarax = 9;        


                     GameActivity.hookah = 8;

                      GameActivity.baseheartedness = "";
}

            } else {
                    --GameActivity.hookah;
}




            } else {
                    if ( GameActivity.strophomenidae == null
) {
                    ev00N = "unbonneting" ;

            } else {
                    ev00N = "distastefulnesses" ;
}



}



} 
 else 
 {        if (GameActivity.subradiance != GameActivity.subradiance

) {
            
 if ( GameActivity.fourteeners 
) 
 {        ev00N = "";
}
 else if 
 (! YhueR 
 &&  GameActivity.strophomenidae != null) 
 {        ++GameActivity.subradiance;
} 
 else 
 {        ev00N = "";
}


                     ev00N = "";

                      GameActivity.backstories--;
}
}

}
 else if 
 (6 <= GameActivity.atarax
 &&  ev00N .contains("cyniatria") ) 
 {
 if ( GameActivity.fourteeners 
) 
 {        imCvr = true;
}
 else if 
 ( GameActivity.baseheartedness == null
 && ! e6LNS 
) 
 {        if ( ev00N != null) {
            
 if ( GameActivity.baseheartedness != null) 
 {        GameActivity.subradiance += 8;
}
 else if 
 ( GameActivity.connive 
 || 12 <= GameActivity.subradiance
) 
 {        ev00N = "";
} 
 else 
 {        GameActivity.hookah--;
}


            } else {
                    GameActivity.atarax = 8;        

}



} 
 else 
 {
 if ( GameActivity.baseheartedness .equals("Coccothraustes")  && GameActivity.atarax <= 5

) 
 {        ++GameActivity.backstories;
}
 else if 
 ( e6LNS 
) 
 {        YhueR =  false;
} 
 else 
 {        imCvr = ! true;
}

}

} 
 else 
 {
 if (GameActivity.hookah != GameActivity.atarax

) 
 {
 if ( ev00N != null &&  ev00N != null) 
 {
 if ( ev00N .equals("bunchberries")  ||  ev00N == null
) 
 {        ev00N = "";
}
 else if 
 ( YhueR 
 ||  ev00N != null) 
 {        imCvr = true;
} 
 else 
 {        ev00N = "scarceness" ;
}

}
 else if 
 ( ev00N .isEmpty()  ||  GameActivity.baseheartedness == null
) 
 {        imCvr = false;
} 
 else 
 {        ev00N = "corivalry" ;
}

}
 else if 
 ( GameActivity.baseheartedness .isEmpty() ) 
 {        if ( ev00N != null && 4 < GameActivity.backstories
) {
                    ev00N = "";

                     ++GameActivity.subradiance;

                      GameActivity.backstories--;
}
} 
 else 
 {        GameActivity.atarax++;
}

}


 if (! imCvr 
) 
 {        GameActivity.atarax = 8;        

}
 else if 
 ( ev00N .isEmpty()  || GameActivity.atarax != GameActivity.hookah

) 
 {        if (GameActivity.hookah != GameActivity.backstories

) {
                    if (GameActivity.hookah <= GameActivity.subradiance
) {
                    if ( ev00N .isEmpty()  &&  GameActivity.baseheartedness .isEmpty() ) {
            
 if (! ev00N .isEmpty() ) 
 {        imCvr =  true;
}
 else if 
 ( imCvr 
) 
 {        e6LNS = true;
} 
 else 
 {        ev00N = "";
}


            } else {
                    GameActivity.strophomenidae = "";
}




                     GameActivity.hookah = 12;

                      imCvr =  true;
}

            } else {
                    if ( kWGav 
 && ! kWGav 
) {
            
 if (GameActivity.backstories != 8

) 
 {        ev00N = "";
}
 else if 
 ( ev00N .isEmpty() ) 
 {        YhueR =  false;
} 
 else 
 {        ev00N = "Keisterville" ;
}


            } else {
                    e6LNS = ! true;
}



}



} 
 else 
 {        kWGav =  false;
}

        if (! kWGav 
 ||  imCvr 
) {
            
 if (GameActivity.backstories <= 12

) 
 {        GameActivity.backstories = 7;        

}
 else if 
 ( GameActivity.baseheartedness != null) 
 {        if ( GameActivity.baseheartedness == null
) {
            
 if ( GameActivity.strophomenidae != null ||  e6LNS 
) 
 {
 if ( ev00N != null || GameActivity.subradiance <= GameActivity.atarax

) 
 {        e6LNS =  true;
}
 else if 
 ( ev00N .contains(ev00N)  && 10 != GameActivity.backstories
) 
 {        GameActivity.backstories = 0;        

} 
 else 
 {        ev00N = "viridescences" .trim();
}

}
 else if 
 (GameActivity.backstories <= GameActivity.subradiance

 &&  ev00N .contains(GameActivity.baseheartedness) ) 
 {        GameActivity.subradiance = 5;
} 
 else 
 {        GameActivity.hookah = 14;
}


                     if ( ev00N != null && ! GameActivity.fourteeners 
) {
                    GameActivity.subradiance += 6;        


                     kWGav =  false;

                      ev00N = "Antons" ;
}

                      GameActivity.strophomenidae = "";
}
} 
 else 
 {        GameActivity.hookah = 14;        

}


                     if ( GameActivity.strophomenidae != null) {
                    if ( GameActivity.baseheartedness != null) {
                    if (GameActivity.atarax > GameActivity.hookah
 &&  ev00N != null) {
                    if (GameActivity.backstories <= GameActivity.atarax

) {
                    ev00N = "";

                     GameActivity.subradiance += 2;

                      GameActivity.hookah--;
}

                     GameActivity.hookah = 12;        


                      ev00N = "";
}

            } else {
                    if (! GameActivity.strophomenidae .isEmpty()  && ! GameActivity.strophomenidae .contains(ev00N) ) {
                    GameActivity.atarax--;

            } else {
                    GameActivity.strophomenidae = "Ustilaginoidea" ;
}



}




             
 if (0 != GameActivity.atarax
) 
 {
 if ( ev00N != null && ! GameActivity.connive 
) 
 {        YhueR = false;
}
 else if 
 (GameActivity.hookah <= 12

 &&  ev00N != null) 
 {        GameActivity.baseheartedness = "";
} 
 else 
 {        ev00N = "Hoodsport" ;
}

}
 else if 
 ( ev00N != null &&  GameActivity.baseheartedness .contains("radioecological") ) 
 {        GameActivity.atarax--;
} 
 else 
 {        ev00N = "synacmic" ;
}


              
 if ( ev00N != null) 
 {        ev00N = "lignifying" ;
}
 else if 
 ( ev00N .contains(ev00N)  &&  GameActivity.strophomenidae != null) 
 {        e6LNS = false;
} 
 else 
 {        ++GameActivity.atarax;
}

}

                      if ( e6LNS 
 ||  e6LNS 
) {
            
 if ( imCvr 
) 
 {        if (10 > GameActivity.subradiance
) {
                    kWGav =  false;

                     GameActivity.atarax++;

                      imCvr = true;
}
}
 else if 
 ( kWGav 
 ||  YhueR 
) 
 {        ev00N = "redolences" ;
} 
 else 
 {        YhueR = false;
}


                     if (GameActivity.subradiance < 14

 &&  GameActivity.strophomenidae != null) {
                    GameActivity.fourteeners = true;

            } else {
                    GameActivity.backstories += 1;        

}




                      ev00N = "whittrets" ;
}
}

         
    }

     
    public  void archfriend(int f8YFx, String kNrcI) {
                if (f8YFx <= GameActivity.subradiance
 && GameActivity.atarax > GameActivity.subradiance

) {
            
 if ( kNrcI != null &&  GameActivity.strophomenidae == null
) 
 {        if (f8YFx <= f8YFx

) {
                    if ( GameActivity.fourteeners 
 ||  kNrcI != null) {
                    if (14 == f8YFx
 &&  GameActivity.connive 
) {
                    if ( kNrcI == null
) {
                    f8YFx = 12;        


            } else {
                    f8YFx--;
}




                     GameActivity.fourteeners = true;

                      GameActivity.baseheartedness = "nonsubstitutional" ;
}

                     if ( kNrcI == null
) {
                    kNrcI = "";

            } else {
                    GameActivity.baseheartedness = "lackland" ;
}




                      kNrcI = "declinational" ;
}

                     if (GameActivity.backstories > GameActivity.atarax

 &&  GameActivity.connive 
) {
            
 if ( GameActivity.connive 
 && ! kNrcI .contains(kNrcI) ) 
 {        kNrcI = "Xyris" ;
}
 else if 
 ( kNrcI == null
 && GameActivity.subradiance <= f8YFx

) 
 {        kNrcI = "Waldensianism" ;
} 
 else 
 {        GameActivity.baseheartedness = "snortle" ;
}


            } else {
                    GameActivity.hookah--;
}




                      if ( kNrcI == null
) {
                    kNrcI = "";

            } else {
                    f8YFx = 12;        

}



}
}
 else if 
 ( GameActivity.strophomenidae == null
 && 3 <= GameActivity.atarax
) 
 {        if ( kNrcI .isEmpty()  ||  GameActivity.strophomenidae .contains("estrogenically") ) {
            
 if ( kNrcI == null
) 
 {        if ( GameActivity.fourteeners 
) {
                    ++GameActivity.backstories;

            } else {
                    GameActivity.hookah--;
}



}
 else if 
 (! GameActivity.fourteeners 
 &&  GameActivity.baseheartedness == null
) 
 {        GameActivity.baseheartedness = "";
} 
 else 
 {        f8YFx += 12;
}


            } else {
                    if (f8YFx != 1

 ||  GameActivity.baseheartedness != null) {
                    GameActivity.fourteeners = true;

                     GameActivity.baseheartedness = "";

                      kNrcI = "";
}
}



} 
 else 
 {        if ( kNrcI .isEmpty() ) {
            
 if (GameActivity.atarax > 9

) 
 {        kNrcI = "";
}
 else if 
 ( GameActivity.connive 
) 
 {        kNrcI = "preferabilities" ;
} 
 else 
 {        GameActivity.strophomenidae = "angiohyalinosis" ;
}


            } else {
                    GameActivity.fourteeners = false;
}



}


            } else {
                    if ( kNrcI != null) {
                    if (10 < GameActivity.hookah
) {
            
 if ( kNrcI == null
 &&  kNrcI == null
) 
 {        if (f8YFx != GameActivity.subradiance
 || ! GameActivity.fourteeners 
) {
                    GameActivity.connive = true;

                     GameActivity.backstories--;

                      kNrcI = "";
}
}
 else if 
 (GameActivity.hookah > GameActivity.subradiance
 && GameActivity.subradiance != 11

) 
 {        GameActivity.connive = false;
} 
 else 
 {        f8YFx = 7;        

}


                     GameActivity.connive = false;

                      GameActivity.baseheartedness = "untupped" ;
}

            } else {
            
 if (! GameActivity.strophomenidae .contains(kNrcI) ) 
 {        if ( kNrcI != null &&  GameActivity.baseheartedness == null
) {
                    GameActivity.connive =  false;

                     f8YFx -= 13;        


                      GameActivity.fourteeners = true;
}
}
 else if 
 ( kNrcI != null && f8YFx == f8YFx

) 
 {        GameActivity.fourteeners =  true;
} 
 else 
 {        GameActivity.connive =  false;
}

}



}




 if ( kNrcI != null || GameActivity.atarax <= GameActivity.hookah

) 
 {
 if (GameActivity.atarax <= 8

) 
 {        if ( GameActivity.connive 
 ||  GameActivity.fourteeners 
) {
                    if ( GameActivity.baseheartedness .contains("ethynylation") ) {
                    if ( kNrcI == null
 &&  kNrcI == null
) {
                    if ( GameActivity.strophomenidae == null
 || GameActivity.subradiance != f8YFx

) {
                    GameActivity.baseheartedness = "necropsy" ;

            } else {
                    kNrcI = "Lenoxdale" .toUpperCase();
}




            } else {
                    GameActivity.strophomenidae = "";
}




            } else {
                    if (f8YFx > f8YFx

) {
                    kNrcI = "unavoidable" ;

                     kNrcI = "teleseme" ;

                      kNrcI = "Rosanna" ;
}
}




            } else {
                    GameActivity.atarax += 8;
}



}
 else if 
 ( kNrcI == null
 ||  GameActivity.connive 
) 
 {
 if ( kNrcI != null) 
 {        if (GameActivity.backstories < f8YFx

) {
            
 if ( GameActivity.strophomenidae == null
 &&  GameActivity.fourteeners 
) 
 {        kNrcI = "lipsticked" ;
}
 else if 
 (f8YFx == GameActivity.hookah
 &&  GameActivity.strophomenidae .equals(kNrcI) ) 
 {        kNrcI = "";
} 
 else 
 {        GameActivity.strophomenidae = "";
}


                     GameActivity.fourteeners = true;

                      GameActivity.backstories = 10;        

}
}
 else if 
 ( kNrcI .contains(kNrcI)  &&  kNrcI == null
) 
 {        if (0 < GameActivity.subradiance
 ||  kNrcI != null) {
                    GameActivity.baseheartedness = "lout" ;

                     GameActivity.connive = true;

                      GameActivity.atarax = 10;
}
} 
 else 
 {        GameActivity.strophomenidae = "";
}

} 
 else 
 {        if ( kNrcI .isEmpty() ) {
            
 if ( kNrcI != null) 
 {        ++f8YFx;
}
 else if 
 ( kNrcI != null || GameActivity.subradiance == GameActivity.subradiance
) 
 {        kNrcI = "ginzos" ;
} 
 else 
 {        GameActivity.connive = false;
}


            } else {
                    f8YFx = 1;        

}



}

}
 else if 
 ( GameActivity.fourteeners 
) 
 {        if ( kNrcI != null &&  GameActivity.fourteeners 
) {
            
 if ( GameActivity.strophomenidae .contains("intersubjective") ) 
 {        f8YFx++;
}
 else if 
 ( GameActivity.fourteeners 
 && 13 != GameActivity.hookah
) 
 {        if (f8YFx == GameActivity.backstories
 &&  kNrcI == null
) {
                    GameActivity.atarax = 8;        


                     GameActivity.backstories = 14;

                      kNrcI = "";
}
} 
 else 
 {        GameActivity.hookah = 7;
}


             
 if (GameActivity.hookah == 12

) 
 {
 if (GameActivity.atarax <= f8YFx
) 
 {        --f8YFx;
}
 else if 
 ( kNrcI .isEmpty() ) 
 {        GameActivity.strophomenidae = "schemozzle" ;
} 
 else 
 {        f8YFx--;
}

}
 else if 
 (! GameActivity.baseheartedness .contains("syngnathous")  || ! GameActivity.connive 
) 
 {        GameActivity.strophomenidae = "overdeveloping" ;
} 
 else 
 {        kNrcI = "";
}


                      if ( kNrcI == null
 &&  kNrcI .equals("avoiders") ) {
                    GameActivity.connive = false;

            } else {
                    GameActivity.strophomenidae = "";
}



}
} 
 else 
 {
 if (11 <= GameActivity.subradiance
) 
 {        if ( GameActivity.baseheartedness != null) {
                    if (! GameActivity.fourteeners 
 ||  GameActivity.strophomenidae == null
) {
                    GameActivity.atarax = 14;

            } else {
                    kNrcI = "burseraceae" ;
}




                     GameActivity.baseheartedness = "dyspepsies" ;

                      GameActivity.connive =  true;
}
}
 else if 
 ( GameActivity.connive 
) 
 {        if ( GameActivity.strophomenidae .contains(GameActivity.baseheartedness)  ||  kNrcI == null
) {
                    GameActivity.fourteeners = false;

            } else {
                    GameActivity.fourteeners = false;
}



} 
 else 
 {        GameActivity.subradiance += 3;        

}

}

        if ( GameActivity.baseheartedness != null && GameActivity.subradiance <= GameActivity.atarax

) {
                    if (GameActivity.backstories < 3

 ||  GameActivity.baseheartedness != null) {
                    if ( kNrcI .intern().equals(GameActivity.strophomenidae)  ||  GameActivity.baseheartedness != null) {
                    if ( kNrcI != null ||  GameActivity.strophomenidae .equals("chromism") ) {
                    if (0 <= f8YFx
 || f8YFx < GameActivity.hookah

) {
                    if ( GameActivity.strophomenidae .equals(kNrcI) ) {
                    GameActivity.connive =  true;

                     kNrcI = "";

                      kNrcI = "";
}

            } else {
                    GameActivity.fourteeners =  false;
}




                     ++f8YFx;

                      GameActivity.connive =  true;
}

                     f8YFx = 3;

              
 if ( kNrcI .equals(kNrcI) ) 
 {        GameActivity.fourteeners = true;
}
 else if 
 ( GameActivity.baseheartedness == null
 &&  GameActivity.strophomenidae != null) 
 {        GameActivity.baseheartedness = "muticate" .intern();
} 
 else 
 {        kNrcI = "";
}

}

            } else {
                    if ( kNrcI == null
 && ! GameActivity.fourteeners 
) {
                    GameActivity.connive = true;

             
 if ( kNrcI .isEmpty()  ||  GameActivity.strophomenidae != null) 
 {        GameActivity.connive = false;
}
 else if 
 ( kNrcI != null) 
 {        GameActivity.atarax = 0;
} 
 else 
 {        kNrcI = "";
}


                      kNrcI = "";
}
}




            } else {
                    if (GameActivity.atarax <= f8YFx
 && GameActivity.hookah == 1

) {
                    if (GameActivity.hookah <= 3

) {
                    if ( kNrcI .equals("babirusas") ) {
                    if (GameActivity.backstories != 8

) {
                    kNrcI = "hypersensitizes" ;

            } else {
                    GameActivity.fourteeners =  true;
}




                     GameActivity.strophomenidae = "triliths" ;

                      --GameActivity.hookah;
}

            } else {
            
 if (! kNrcI .contains("overthrusts")  ||  kNrcI != null) 
 {        GameActivity.connive =  true;
}
 else if 
 ( kNrcI .contains(kNrcI) ) 
 {        GameActivity.connive = true;
} 
 else 
 {        GameActivity.baseheartedness = "";
}

}




                     f8YFx = 5;        


              
 if ( GameActivity.baseheartedness == null
 &&  GameActivity.strophomenidae .isEmpty() ) 
 {        GameActivity.strophomenidae = "";
}
 else if 
 (! GameActivity.connive 
 ||  kNrcI .isEmpty() ) 
 {        GameActivity.fourteeners =  true;
} 
 else 
 {        GameActivity.fourteeners = false;
}

}
}



        if ( GameActivity.fourteeners 
 || 6 <= GameActivity.backstories
) {
                    if (GameActivity.hookah == GameActivity.atarax

 &&  GameActivity.strophomenidae .equals(GameActivity.strophomenidae) ) {
            
 if ( GameActivity.baseheartedness != null) 
 {
 if ( GameActivity.fourteeners 
 ||  kNrcI == null
) 
 {        if (GameActivity.atarax > 5

 || f8YFx <= GameActivity.hookah
) {
                    GameActivity.connive =  true;

            } else {
                    --GameActivity.hookah;
}



}
 else if 
 ( kNrcI .trim().equals("kukupa")  && GameActivity.hookah < GameActivity.atarax
) 
 {
 if ( kNrcI != null ||  GameActivity.strophomenidae == null
) 
 {        GameActivity.connive = true;
}
 else if 
 (! kNrcI .contains("decitizenising") ) 
 {        GameActivity.connive =  true;
} 
 else 
 {        GameActivity.fourteeners =  true;
}

} 
 else 
 {        GameActivity.strophomenidae = "gamesmanships" ;
}

}
 else if 
 ( GameActivity.baseheartedness .contains(kNrcI) ) 
 {        GameActivity.connive = false;
} 
 else 
 {        GameActivity.connive =  false;
}


            } else {
                    if (! kNrcI .isEmpty() ) {
                    if ( kNrcI != null) {
                    if (GameActivity.hookah > GameActivity.hookah

 &&  kNrcI .equals("unfrizzy") ) {
                    GameActivity.fourteeners = false;

            } else {
                    kNrcI = "";
}




                     f8YFx = 1;        


                      GameActivity.connive =  true;
}

            } else {
            
 if ( GameActivity.baseheartedness != null) 
 {        GameActivity.fourteeners = false;
}
 else if 
 ( kNrcI != null && f8YFx <= f8YFx
) 
 {        f8YFx = 13;
} 
 else 
 {        GameActivity.baseheartedness = "";
}

}



}




                     if (f8YFx <= GameActivity.subradiance
 ||  kNrcI != null) {
                    kNrcI = "";

            } else {
                    if (! GameActivity.fourteeners 
) {
            
 if ( kNrcI == null
) 
 {        GameActivity.subradiance = 10;        

}
 else if 
 ( kNrcI == null
 && f8YFx > GameActivity.subradiance
) 
 {        GameActivity.connive = true;
} 
 else 
 {        kNrcI = "Pasteur" ;
}


                     GameActivity.fourteeners = false;

                      GameActivity.atarax = 10;
}
}




                      if (GameActivity.hookah <= GameActivity.subradiance
) {
                    if ( kNrcI == null
) {
                    if ( GameActivity.baseheartedness != null) {
                    f8YFx--;

                     GameActivity.fourteeners = ! true;

                      kNrcI = "concertist" .intern();
}

                     GameActivity.hookah += 14;        


                      kNrcI = "embourgeoisements" ;
}

                     if (! GameActivity.connive 
) {
                    GameActivity.connive = false;

            } else {
                    GameActivity.strophomenidae = "unblocked" ;
}




                      f8YFx--;
}
}

         
    }

     
    public  void grandfatherless(boolean OMrPU, int cMK8p, String m1o0C, boolean x3RPK) {
        
 if (GameActivity.subradiance <= GameActivity.subradiance

 ||  GameActivity.strophomenidae .isEmpty() ) 
 {
 if (GameActivity.hookah <= GameActivity.hookah
) 
 {        if (8 == cMK8p
) {
                    if ( m1o0C == null
 &&  x3RPK 
) {
                    if (3 <= cMK8p
 || 6 != GameActivity.subradiance
) {
                    if ( GameActivity.strophomenidae != null) {
                    GameActivity.backstories++;

            } else {
                    OMrPU =  false;
}




            } else {
                    cMK8p = 1;        

}




                     if (cMK8p != GameActivity.atarax
) {
                    m1o0C = "";

                     GameActivity.atarax++;

                      GameActivity.baseheartedness = "";
}

                      GameActivity.fourteeners =  false;
}

            } else {
                    GameActivity.atarax = 4;
}



}
 else if 
 ( m1o0C .contains("prescreened") ) 
 {        if ( m1o0C == null
) {
                    if ( x3RPK 
 &&  GameActivity.baseheartedness == null
) {
                    if ( m1o0C .contains(GameActivity.strophomenidae)  ||  m1o0C .isEmpty() ) {
                    m1o0C = "";

            } else {
                    OMrPU = ! false;
}




                     m1o0C = "";

                      --cMK8p;
}

                     if (cMK8p <= GameActivity.atarax

) {
                    GameActivity.baseheartedness = "";

                     OMrPU = true;

                      x3RPK = false;
}

                      cMK8p -= 11;
}
} 
 else 
 {        if (cMK8p <= GameActivity.subradiance

 &&  GameActivity.baseheartedness == null
) {
                    GameActivity.atarax--;

            } else {
                    cMK8p--;
}



}

}
 else if 
 (! GameActivity.strophomenidae .contains("pseudepisematic")  ||  GameActivity.baseheartedness != null) 
 {        if ( OMrPU 
 || GameActivity.atarax <= cMK8p

) {
            
 if ( OMrPU 
 && 7 != cMK8p
) 
 {        if (! x3RPK 
 && GameActivity.hookah == 1

) {
                    if ( GameActivity.strophomenidae != null) {
                    OMrPU = false;

            } else {
                    m1o0C = "propaedeutics" ;
}




                     m1o0C = "";

                      m1o0C = "Grubbs" ;
}
}
 else if 
 ( m1o0C == null
 ||  m1o0C .isEmpty() ) 
 {        if ( OMrPU 
 || cMK8p < 6

) {
                    GameActivity.subradiance--;

                     GameActivity.baseheartedness = "";

                      OMrPU = true;
}
} 
 else 
 {        GameActivity.strophomenidae = "";
}


            } else {
                    if (cMK8p != GameActivity.backstories

) {
                    if ( x3RPK 
 || ! GameActivity.strophomenidae .contains(GameActivity.strophomenidae) ) {
                    x3RPK = false;

                     x3RPK = true;

                      x3RPK =  false;
}

            } else {
                    GameActivity.strophomenidae = "";
}



}



} 
 else 
 {
 if ( m1o0C != null) 
 {
 if ( GameActivity.strophomenidae .isEmpty()  ||  m1o0C != null) 
 {        if (cMK8p <= 2

 && GameActivity.hookah <= 7

) {
                    cMK8p = 13;        


                     GameActivity.fourteeners = true;

                      GameActivity.fourteeners = false;
}
}
 else if 
 (cMK8p == cMK8p

 &&  m1o0C .equals(m1o0C) ) 
 {        GameActivity.connive = true;
} 
 else 
 {        --GameActivity.hookah;
}

}
 else if 
 (cMK8p != cMK8p
 ||  GameActivity.fourteeners 
) 
 {
 if ( x3RPK 
) 
 {        x3RPK =  true;
}
 else if 
 (cMK8p > 9

) 
 {        cMK8p = 8;        

} 
 else 
 {        m1o0C = "";
}

} 
 else 
 {        m1o0C = "";
}

}


 if (9 < cMK8p
) 
 {        if ( m1o0C != null || cMK8p <= cMK8p

) {
                    if ( x3RPK 
 &&  GameActivity.strophomenidae .equals("Dasylirion") ) {
            
 if (! m1o0C .isEmpty()  &&  m1o0C != null) 
 {
 if ( m1o0C != null) 
 {        if ( GameActivity.strophomenidae == null
) {
                    m1o0C = "";

            } else {
                    GameActivity.backstories = 4;
}



}
 else if 
 (cMK8p < 7

) 
 {        GameActivity.baseheartedness = "";
} 
 else 
 {        x3RPK = false;
}

}
 else if 
 ( GameActivity.baseheartedness == null
 &&  x3RPK 
) 
 {        if ( GameActivity.baseheartedness == null
) {
                    ++cMK8p;

                     OMrPU = false;

                      x3RPK = false;
}
} 
 else 
 {        GameActivity.baseheartedness = "metachromatisms" ;
}


            } else {
            
 if ( GameActivity.strophomenidae == null
) 
 {
 if (GameActivity.subradiance > cMK8p
 && 10 == cMK8p
) 
 {        x3RPK = false;
}
 else if 
 ( m1o0C .isEmpty()  || GameActivity.backstories < GameActivity.hookah
) 
 {        GameActivity.connive = true;
} 
 else 
 {        m1o0C = "";
}

}
 else if 
 ( m1o0C != null) 
 {        GameActivity.connive = false;
} 
 else 
 {        cMK8p--;
}

}




            } else {
            
 if ( m1o0C == null
) 
 {
 if ( GameActivity.strophomenidae .equals("hegemonistic")  || GameActivity.hookah < cMK8p

) 
 {
 if (cMK8p == GameActivity.atarax
 &&  m1o0C == null
) 
 {        m1o0C = "sliphorn" ;
}
 else if 
 (! m1o0C .equals("trinomial") ) 
 {        x3RPK =  false;
} 
 else 
 {        x3RPK = false;
}

}
 else if 
 (cMK8p == 6

) 
 {        GameActivity.fourteeners = false;
} 
 else 
 {        m1o0C = "";
}

}
 else if 
 (! m1o0C .contains("beseechings")  &&  x3RPK 
) 
 {        if ( GameActivity.fourteeners 
 && cMK8p <= 10

) {
                    OMrPU = false;

                     cMK8p--;

                      cMK8p = 2;        

}
} 
 else 
 {        m1o0C = "";
}

}



}
 else if 
 ( m1o0C != null &&  GameActivity.fourteeners 
) 
 {        if ( GameActivity.baseheartedness .equals("Daucus") ) {
                    if ( x3RPK 
 || cMK8p <= GameActivity.atarax
) {
            
 if (cMK8p != cMK8p
 || 12 != GameActivity.subradiance
) 
 {        if (0 > GameActivity.atarax
) {
                    m1o0C = "";

                     GameActivity.hookah = 0;        


                      m1o0C = "Oologah" ;
}
}
 else if 
 ( GameActivity.baseheartedness .equals("massa") ) 
 {        m1o0C = "";
} 
 else 
 {        OMrPU =  true;
}


                     if ( m1o0C .contains("windjammers") ) {
                    cMK8p = 0;

            } else {
                    OMrPU = true;
}




                      m1o0C = "";
}

                     if ( m1o0C == null
 ||  OMrPU 
) {
                    GameActivity.hookah = 9;        


            } else {
                    m1o0C = "";
}




              
 if ( OMrPU 
 && 8 == cMK8p
) 
 {        m1o0C = "echappes" ;
}
 else if 
 (! m1o0C .contains(GameActivity.strophomenidae) ) 
 {        OMrPU = false;
} 
 else 
 {        GameActivity.connive =  true;
}

}
} 
 else 
 {
 if ( GameActivity.strophomenidae .contains(m1o0C)  ||  GameActivity.fourteeners 
) 
 {        if (9 > GameActivity.hookah
 && GameActivity.subradiance < 3

) {
                    if ( OMrPU 
 ||  m1o0C == null
) {
                    x3RPK = true;

                     --GameActivity.hookah;

                      x3RPK = true;
}

            } else {
                    --cMK8p;
}



}
 else if 
 ( GameActivity.connive 
) 
 {        if (GameActivity.hookah > cMK8p
) {
                    OMrPU = false;

                     x3RPK = false;

                      cMK8p = 2;
}
} 
 else 
 {        GameActivity.connive =  true;
}

}


 if (14 <= GameActivity.backstories
) 
 {        if ( GameActivity.strophomenidae == null
 ||  GameActivity.strophomenidae == null
) {
                    if (! OMrPU 
) {
                    if ( GameActivity.strophomenidae == null
 &&  m1o0C == null
) {
                    if ( GameActivity.strophomenidae == null
) {
                    cMK8p = 4;

                     GameActivity.hookah = 12;        


                      GameActivity.atarax = 0;        

}

             
 if (2 <= cMK8p
) 
 {        x3RPK =  true;
}
 else if 
 ( m1o0C == null
 ||  OMrPU 
) 
 {        m1o0C = "rampageousness" ;
} 
 else 
 {        GameActivity.fourteeners = true;
}


                      cMK8p = 9;        

}

                     if (GameActivity.subradiance < 13

 && GameActivity.subradiance <= GameActivity.hookah

) {
                    if ( m1o0C == null
 ||  m1o0C .equals(m1o0C) ) {
                    GameActivity.backstories = 8;

            } else {
                    OMrPU = true;
}




            } else {
                    OMrPU = false;
}




                      if ( GameActivity.fourteeners 
 ||  m1o0C != null) {
                    GameActivity.backstories = 12;

            } else {
                    cMK8p++;
}



}

            } else {
                    if ( GameActivity.strophomenidae == null
) {
            
 if ( m1o0C != null && GameActivity.hookah <= GameActivity.backstories
) 
 {
 if (cMK8p > cMK8p

 && ! m1o0C .contains("epitheliulia") ) 
 {        m1o0C = "congealability" ;
}
 else if 
 ( GameActivity.fourteeners 
 || ! m1o0C .equals("mudtrack") ) 
 {        GameActivity.hookah = 6;        

} 
 else 
 {        OMrPU =  true;
}

}
 else if 
 ( m1o0C == null
 &&  OMrPU 
) 
 {        GameActivity.connive = false;
} 
 else 
 {        m1o0C = "";
}


            } else {
                    if (! m1o0C .equals("unhumorousness") ) {
                    GameActivity.hookah--;

            } else {
                    GameActivity.fourteeners = ! true;
}



}



}



}
 else if 
 (cMK8p < GameActivity.subradiance
) 
 {        if ( GameActivity.baseheartedness == null
) {
                    if (GameActivity.subradiance == GameActivity.hookah
) {
                    if ( m1o0C == null
) {
                    GameActivity.atarax = 7;

                     m1o0C = "uncumulative" ;

                      x3RPK = false;
}

                     if ( GameActivity.strophomenidae == null
) {
                    m1o0C = "";

                     x3RPK = false;

                      x3RPK = false;
}

                      --cMK8p;
}

            } else {
                    if ( m1o0C == null
 || ! GameActivity.strophomenidae .contains(GameActivity.baseheartedness) ) {
                    if ( x3RPK 
 || cMK8p <= 11

) {
                    m1o0C = "";

                     GameActivity.backstories = 1;

                      cMK8p = 1;
}

                     GameActivity.hookah += 8;

                      cMK8p--;
}
}



} 
 else 
 {        if ( m1o0C != null && 13 <= GameActivity.subradiance
) {
                    if ( m1o0C == null
) {
                    if (! GameActivity.fourteeners 
 &&  m1o0C .isEmpty() ) {
                    GameActivity.baseheartedness = "";

                     ++GameActivity.atarax;

                      GameActivity.baseheartedness = "pyknoses" ;
}

            } else {
                    x3RPK = false;
}




            } else {
                    if (GameActivity.hookah <= GameActivity.subradiance

 ||  OMrPU 
) {
                    x3RPK = true;

            } else {
                    GameActivity.strophomenidae = "tactilities" .toUpperCase();
}



}



}


         
    }

     
    public  void noninterdependency(int f9csD, String cjVN7, int ZmRqw, String fiJNR) {
                if ( GameActivity.fourteeners 
) {
                    f9csD--;

            } else {
                    if ( fiJNR != null || f9csD > GameActivity.backstories
) {
                    if ( GameActivity.strophomenidae != null) {
                    if (f9csD <= 14

 || GameActivity.subradiance <= 6

) {
                    if (! GameActivity.fourteeners 
 && f9csD <= GameActivity.subradiance
) {
                    fiJNR = "";

            } else {
                    GameActivity.fourteeners =  false;
}




            } else {
                    GameActivity.baseheartedness = "uncounselable" ;
}




             
 if (1 <= GameActivity.backstories
) 
 {        GameActivity.fourteeners =  true;
}
 else if 
 ( cjVN7 == null
) 
 {        GameActivity.hookah = 3;        

} 
 else 
 {        fiJNR = "";
}


                      GameActivity.connive = false;
}

            } else {
                    if (5 > f9csD
) {
                    if (14 <= ZmRqw
) {
                    fiJNR = "overboiled" ;

            } else {
                    GameActivity.backstories = 10;        

}




            } else {
                    cjVN7 = "ti" ;
}



}



}




 if ( fiJNR .equals(fiJNR)  || GameActivity.subradiance != f9csD

) 
 {
 if (! fiJNR .contains("altitudinarian")  || 13 < GameActivity.hookah
) 
 {
 if ( cjVN7 .equals(cjVN7)  || f9csD > ZmRqw

) 
 {        if (! cjVN7 .contains(GameActivity.strophomenidae) ) {
            
 if ( GameActivity.fourteeners 
) 
 {        if ( GameActivity.strophomenidae != null) {
                    fiJNR = "trisubstituted" ;

                     fiJNR = "Craniata" ;

                      GameActivity.fourteeners = true;
}
}
 else if 
 (f9csD > f9csD

) 
 {        GameActivity.fourteeners = true;
} 
 else 
 {        GameActivity.fourteeners = true;
}


            } else {
                    if (GameActivity.backstories < f9csD

 ||  GameActivity.strophomenidae .contains("Leitman") ) {
                    ZmRqw--;

                     f9csD--;

                      GameActivity.connive = false;
}
}



}
 else if 
 (ZmRqw != f9csD
 || GameActivity.backstories <= 0

) 
 {        if (ZmRqw == f9csD
) {
                    if (ZmRqw <= f9csD

) {
                    fiJNR = "";

                     f9csD = 12;

                      fiJNR = "electrokinetics" ;
}

            } else {
                    GameActivity.fourteeners =  true;
}



} 
 else 
 {        if (ZmRqw != 9

 ||  fiJNR .isEmpty() ) {
                    cjVN7 = "";

            } else {
                    cjVN7 = "";
}



}

}
 else if 
 ( GameActivity.connive 
 && GameActivity.hookah <= ZmRqw
) 
 {
 if ( GameActivity.strophomenidae == null
 || f9csD <= GameActivity.hookah
) 
 {        cjVN7 = "horological" ;
}
 else if 
 ( fiJNR != null) 
 {
 if ( fiJNR != null &&  fiJNR == null
) 
 {        GameActivity.fourteeners = false;
}
 else if 
 (! fiJNR .isEmpty()  && GameActivity.atarax > ZmRqw

) 
 {        GameActivity.strophomenidae = "lopstick" ;
} 
 else 
 {        cjVN7 = "";
}

} 
 else 
 {        ++ZmRqw;
}

} 
 else 
 {        fiJNR = "misseeming" ;
}

}
 else if 
 ( GameActivity.baseheartedness != null ||  fiJNR != null) 
 {
 if ( GameActivity.baseheartedness == null
) 
 {
 if (! GameActivity.connive 
 &&  cjVN7 != null) 
 {        fiJNR = "aluminosity" ;
}
 else if 
 (ZmRqw != GameActivity.hookah

 &&  fiJNR .isEmpty() ) 
 {        if (! GameActivity.connive 
) {
                    ZmRqw -= 4;        


            } else {
                    f9csD = 5;
}



} 
 else 
 {        --ZmRqw;
}

}
 else if 
 ( GameActivity.fourteeners 
) 
 {
 if ( GameActivity.connive 
) 
 {        if ( fiJNR != null ||  GameActivity.fourteeners 
) {
                    GameActivity.connive = true;

                     fiJNR = "";

                      GameActivity.fourteeners = true;
}
}
 else if 
 ( GameActivity.connive 
 &&  fiJNR == null
) 
 {        ++GameActivity.atarax;
} 
 else 
 {        cjVN7 = "";
}

} 
 else 
 {        GameActivity.fourteeners = ! true;
}

} 
 else 
 {        GameActivity.hookah--;
}

        if ( fiJNR != null ||  cjVN7 != null) {
                    if (ZmRqw <= GameActivity.backstories
 || 1 > f9csD
) {
                    if ( GameActivity.fourteeners 
) {
            
 if ( fiJNR .isEmpty() ) 
 {        if ( cjVN7 == null
 &&  GameActivity.connive 
) {
                    fiJNR = "subsonic" ;

            } else {
                    GameActivity.fourteeners = true;
}



}
 else if 
 (! GameActivity.connive 
 &&  fiJNR == null
) 
 {
 if ( GameActivity.fourteeners 
) 
 {        --ZmRqw;
}
 else if 
 (! GameActivity.fourteeners 
 &&  fiJNR == null
) 
 {        fiJNR = "cururo" ;
} 
 else 
 {        cjVN7 = "comical" ;
}

} 
 else 
 {        ZmRqw += 14;
}


            } else {
                    if ( GameActivity.fourteeners 
) {
                    if (GameActivity.atarax <= 1

 && GameActivity.subradiance == 9

) {
                    GameActivity.atarax++;

                     ZmRqw = 1;        


                      ++GameActivity.atarax;
}

            } else {
                    GameActivity.fourteeners = true;
}



}




                     if ( fiJNR != null) {
                    cjVN7 = "";

            } else {
            
 if (! GameActivity.fourteeners 
 &&  fiJNR == null
) 
 {        ZmRqw += 9;        

}
 else if 
 ( fiJNR != null) 
 {        GameActivity.connive = false;
} 
 else 
 {        GameActivity.fourteeners =  false;
}

}




                      if (GameActivity.backstories != GameActivity.atarax

) {
            
 if ( GameActivity.baseheartedness != null &&  GameActivity.fourteeners 
) 
 {        GameActivity.connive =  true;
}
 else if 
 (! GameActivity.fourteeners 
) 
 {        GameActivity.subradiance = 0;
} 
 else 
 {        GameActivity.connive = false;
}


            } else {
                    f9csD = 5;
}



}

             
 if (GameActivity.backstories == 13

 ||  GameActivity.connive 
) 
 {
 if ( GameActivity.strophomenidae == null
) 
 {        if (7 == ZmRqw
) {
                    if ( cjVN7 != null &&  cjVN7 .contains(fiJNR) ) {
                    GameActivity.strophomenidae = "";

                     GameActivity.hookah++;

                      GameActivity.connive = false;
}

            } else {
                    GameActivity.baseheartedness = "polyphylly" ;
}



}
 else if 
 ( cjVN7 == null
 || 8 > ZmRqw
) 
 {        if ( fiJNR != null &&  cjVN7 != null) {
                    ZmRqw = 6;

                     ++GameActivity.backstories;

                      GameActivity.connive = true;
}
} 
 else 
 {        GameActivity.connive = true;
}

}
 else if 
 ( fiJNR != null ||  fiJNR == null
) 
 {        GameActivity.fourteeners = false;
} 
 else 
 {        if ( GameActivity.fourteeners 
 && GameActivity.atarax > ZmRqw
) {
                    f9csD--;

                     GameActivity.fourteeners = true;

                      GameActivity.atarax++;
}
}


                      if (! GameActivity.connive 
) {
                    ++f9csD;

                     if ( GameActivity.baseheartedness == null
 &&  GameActivity.fourteeners 
) {
                    fiJNR = "";

                     cjVN7 = "";

                      cjVN7 = "Atlanta" ;
}

                      ZmRqw = 3;        

}
}

 if ( cjVN7 != null && f9csD <= GameActivity.backstories
) 
 {        if (1 < f9csD
) {
                    if (GameActivity.subradiance <= 13

) {
                    if ( GameActivity.connive 
 || f9csD != f9csD

) {
            
 if ( cjVN7 == null
 && GameActivity.subradiance <= ZmRqw
) 
 {
 if ( cjVN7 != null) 
 {        fiJNR = "";
}
 else if 
 ( fiJNR .isEmpty()  &&  cjVN7 .contains(fiJNR) ) 
 {        --f9csD;
} 
 else 
 {        cjVN7 = "Beyoglu" ;
}

}
 else if 
 (! fiJNR .contains(fiJNR)  &&  fiJNR != null) 
 {        GameActivity.fourteeners = false;
} 
 else 
 {        f9csD--;
}


                     GameActivity.strophomenidae = "oncidium" ;

                      GameActivity.connive = false;
}

             
 if ( GameActivity.connive 
 && ! fiJNR .isEmpty() ) 
 {        if ( GameActivity.baseheartedness == null
) {
                    ZmRqw = 13;        


                     ZmRqw = 1;        


                      f9csD = 9;        

}
}
 else if 
 (f9csD < 0

 &&  cjVN7 .isEmpty() ) 
 {        cjVN7 = "footstones" ;
} 
 else 
 {        cjVN7 = "grapplement" ;
}


                      if (ZmRqw == 0

) {
                    cjVN7 = "";

            } else {
                    ZmRqw = 5;        

}



}

            } else {
                    if (f9csD > 5

) {
                    if (GameActivity.atarax <= GameActivity.atarax

) {
                    if ( cjVN7 != null) {
                    cjVN7 = "";

                     GameActivity.fourteeners = false;

                      GameActivity.fourteeners =  false;
}

            } else {
                    ZmRqw++;
}




             
 if (f9csD > ZmRqw

 || ZmRqw <= GameActivity.atarax
) 
 {        fiJNR = "anapestic" ;
}
 else if 
 ( fiJNR == null
) 
 {        GameActivity.connive = true;
} 
 else 
 {        GameActivity.connive = true;
}


                      ZmRqw = 14;        

}
}



}
 else if 
 ( GameActivity.fourteeners 
) 
 {
 if ( GameActivity.connive 
) 
 {        if ( fiJNR != null) {
                    if (ZmRqw <= GameActivity.backstories

) {
                    GameActivity.fourteeners = false;

                     ++f9csD;

                      GameActivity.atarax = 6;        

}

                     cjVN7 = "";

                      fiJNR = "";
}
}
 else if 
 ( cjVN7 == null
) 
 {        GameActivity.fourteeners =  true;
} 
 else 
 {        if (! GameActivity.connive 
 ||  fiJNR .isEmpty() ) {
                    fiJNR = "pelecaniformes" ;

                     GameActivity.connive = false;

                      GameActivity.fourteeners =  false;
}
}

} 
 else 
 {
 if ( fiJNR != null && ZmRqw == ZmRqw

) 
 {        f9csD = 3;        

}
 else if 
 (GameActivity.hookah > 13

 &&  GameActivity.strophomenidae != null) 
 {        if (f9csD != 13

 ||  fiJNR .isEmpty() ) {
                    cjVN7 = "";

            } else {
                    fiJNR = "hullooing" ;
}



} 
 else 
 {        ZmRqw = 3;
}

}


         
    }

     
    public  void superstimulating(String Pxram) {
        
 if ( GameActivity.baseheartedness == null
 ||  Pxram != null) 
 {        if (! Pxram .equals(GameActivity.baseheartedness) ) {
                    if ( GameActivity.baseheartedness == null
) {
            
 if ( GameActivity.strophomenidae == null
 &&  GameActivity.fourteeners 
) 
 {        if ( GameActivity.baseheartedness .isEmpty()  || GameActivity.hookah < GameActivity.backstories
) {
                    if ( Pxram == null
) {
                    Pxram = "hyperlethal" ;

                     GameActivity.fourteeners = true;

                      GameActivity.fourteeners =  false;
}

            } else {
                    GameActivity.hookah = 4;
}



}
 else if 
 (! Pxram .equals(Pxram)  &&  GameActivity.baseheartedness == null
) 
 {
 if (6 <= GameActivity.atarax
 && GameActivity.subradiance != 8

) 
 {        Pxram = "";
}
 else if 
 (6 == GameActivity.backstories
) 
 {        GameActivity.connive = ! false;
} 
 else 
 {        GameActivity.atarax++;
}

} 
 else 
 {        GameActivity.fourteeners = true;
}


            } else {
            
 if (GameActivity.hookah <= 4

 ||  GameActivity.baseheartedness == null
) 
 {
 if (GameActivity.subradiance <= 2

) 
 {        GameActivity.connive = false;
}
 else if 
 ( GameActivity.connive 
 && GameActivity.backstories != GameActivity.subradiance
) 
 {        GameActivity.connive =  true;
} 
 else 
 {        Pxram = "";
}

}
 else if 
 (GameActivity.backstories != GameActivity.hookah

 &&  Pxram != null) 
 {        GameActivity.subradiance = 2;        

} 
 else 
 {        GameActivity.subradiance = 4;        

}

}




            } else {
            
 if (GameActivity.atarax != GameActivity.subradiance

) 
 {
 if (0 > GameActivity.hookah
) 
 {        if ( Pxram != null && GameActivity.atarax != GameActivity.hookah

) {
                    GameActivity.fourteeners = true;

            } else {
                    GameActivity.connive = true;
}



}
 else if 
 (GameActivity.hookah > 4

 ||  Pxram == null
) 
 {        GameActivity.subradiance = 11;        

} 
 else 
 {        ++GameActivity.backstories;
}

}
 else if 
 (GameActivity.backstories > GameActivity.hookah

) 
 {
 if (! Pxram .contains(GameActivity.strophomenidae) ) 
 {        GameActivity.connive = true;
}
 else if 
 ( GameActivity.fourteeners 
) 
 {        GameActivity.backstories = 9;        

} 
 else 
 {        Pxram = "antirailwayist" ;
}

} 
 else 
 {        GameActivity.connive = false;
}

}



}
 else if 
 ( Pxram .contains("expropriations") ) 
 {        --GameActivity.backstories;
} 
 else 
 {        GameActivity.atarax = 6;
}

        if ( GameActivity.connive 
 ||  GameActivity.fourteeners 
) {
                    if ( GameActivity.strophomenidae != null) {
            
 if (GameActivity.atarax == GameActivity.hookah

) 
 {
 if ( GameActivity.fourteeners 
 ||  GameActivity.connive 
) 
 {        if (9 != GameActivity.backstories
) {
                    if ( Pxram == null
) {
                    GameActivity.fourteeners = false;

                     GameActivity.hookah--;

                      ++GameActivity.backstories;
}

            } else {
                    GameActivity.fourteeners = false;
}



}
 else if 
 (GameActivity.atarax <= 13

) 
 {        if (! GameActivity.connive 
 ||  Pxram == null
) {
                    GameActivity.fourteeners = true;

                     --GameActivity.atarax;

                      GameActivity.fourteeners = true;
}
} 
 else 
 {        GameActivity.subradiance = 5;        

}

}
 else if 
 ( GameActivity.baseheartedness .contains("maatjes") ) 
 {        if ( GameActivity.connive 
) {
                    if ( GameActivity.fourteeners 
 &&  Pxram .contains("bourgeois") ) {
                    Pxram = "";

            } else {
                    GameActivity.hookah -= 6;
}




                     GameActivity.fourteeners = true;

                      GameActivity.fourteeners = true;
}
} 
 else 
 {
 if (GameActivity.subradiance <= 11

) 
 {        GameActivity.strophomenidae = "";
}
 else if 
 ( Pxram != null) 
 {        --GameActivity.backstories;
} 
 else 
 {        GameActivity.connive =  false;
}

}


            } else {
                    if (GameActivity.atarax <= GameActivity.subradiance

 ||  GameActivity.fourteeners 
) {
                    if (GameActivity.backstories != GameActivity.subradiance
 || GameActivity.subradiance < GameActivity.subradiance

) {
                    if (GameActivity.hookah == 7

) {
                    Pxram = "";

                     GameActivity.baseheartedness = "";

                      Pxram = "tillering" ;
}

                     GameActivity.connive = false;

                      Pxram = "";
}

             
 if (GameActivity.subradiance != GameActivity.subradiance
) 
 {        GameActivity.subradiance--;
}
 else if 
 (GameActivity.subradiance <= 13

) 
 {        GameActivity.fourteeners = true;
} 
 else 
 {        GameActivity.hookah = 0;        

}


                      GameActivity.backstories += 0;
}
}




            } else {
                    if (GameActivity.hookah < 7

 && ! GameActivity.baseheartedness .contains("mayflower") ) {
                    if (GameActivity.atarax <= GameActivity.hookah
 && GameActivity.atarax < 13

) {
                    if (GameActivity.hookah <= GameActivity.hookah
 && ! GameActivity.fourteeners 
) {
                    if (8 <= GameActivity.hookah
) {
                    Pxram = "acceptingly" ;

                     GameActivity.connive = ! false;

                      GameActivity.connive =  false;
}

            } else {
                    Pxram = "";
}




                     if ( Pxram == null
 ||  Pxram != null) {
                    GameActivity.fourteeners = false;

                     GameActivity.hookah += 0;

                      Pxram = "";
}

                      GameActivity.connive = ! false;
}

             
 if ( GameActivity.connive 
) 
 {        if (! Pxram .equals(Pxram)  &&  GameActivity.fourteeners 
) {
                    GameActivity.fourteeners = false;

            } else {
                    GameActivity.strophomenidae = "";
}



}
 else if 
 (! GameActivity.fourteeners 
 &&  GameActivity.strophomenidae != null) 
 {        Pxram = "Artemisia" ;
} 
 else 
 {        GameActivity.baseheartedness = "psychologize" ;
}


              
 if ( GameActivity.fourteeners 
) 
 {        Pxram = "overglazing" ;
}
 else if 
 ( Pxram != null) 
 {        Pxram = "Fluvanna" ;
} 
 else 
 {        Pxram = "";
}

}
}



        if ( GameActivity.baseheartedness != null ||  Pxram == null
) {
            
 if ( Pxram == null
 ||  GameActivity.baseheartedness == null
) 
 {        if ( GameActivity.baseheartedness == null
 &&  Pxram != null) {
                    if ( GameActivity.strophomenidae != null && GameActivity.atarax < GameActivity.backstories

) {
            
 if (! Pxram .equals(Pxram)  || GameActivity.backstories == 3

) 
 {        if (GameActivity.subradiance == 12

 && GameActivity.subradiance > 12

) {
                    GameActivity.fourteeners = false;

                     GameActivity.connive = true;

                      Pxram = "";
}
}
 else if 
 ( Pxram != null) 
 {        GameActivity.fourteeners =  true;
} 
 else 
 {        Pxram = "paralyzers" ;
}


            } else {
                    if (GameActivity.hookah <= GameActivity.atarax
) {
                    GameActivity.hookah = 2;

                     GameActivity.atarax = 3;        


                      Pxram = "bushmen" ;
}
}




                     if (GameActivity.hookah != GameActivity.atarax
) {
            
 if ( GameActivity.strophomenidae != null && GameActivity.backstories <= GameActivity.subradiance

) 
 {        GameActivity.strophomenidae = "";
}
 else if 
 (13 != GameActivity.subradiance
 && 1 != GameActivity.hookah
) 
 {        GameActivity.atarax = 6;        

} 
 else 
 {        GameActivity.fourteeners = true;
}


                     GameActivity.strophomenidae = "";

                      GameActivity.fourteeners = true;
}

                      if (! Pxram .contains(GameActivity.baseheartedness) ) {
                    GameActivity.hookah = 5;

                     Pxram = "";

                      --GameActivity.hookah;
}
}
}
 else if 
 ( Pxram != null && GameActivity.backstories < 10

) 
 {        if ( Pxram .equals("Helbonia") ) {
                    Pxram = "";

            } else {
                    if ( GameActivity.fourteeners 
 &&  GameActivity.fourteeners 
) {
                    --GameActivity.atarax;

                     --GameActivity.atarax;

                      Pxram = "";
}
}



} 
 else 
 {        if (GameActivity.hookah <= GameActivity.hookah

 || 2 != GameActivity.hookah
) {
                    GameActivity.subradiance -= 7;

                     GameActivity.backstories++;

                      GameActivity.hookah = 12;        

}
}


            } else {
                    if ( GameActivity.baseheartedness == null
) {
                    if (GameActivity.subradiance != 11

 &&  Pxram .isEmpty() ) {
                    if ( Pxram == null
) {
            
 if (GameActivity.hookah <= 9

) 
 {        GameActivity.connive = false;
}
 else if 
 ( Pxram != null && ! GameActivity.strophomenidae .contains(GameActivity.strophomenidae) ) 
 {        GameActivity.connive =  true;
} 
 else 
 {        GameActivity.connive = false;
}


                     Pxram = "menthaceous" ;

                      --GameActivity.subradiance;
}

                     if ( Pxram .contains(GameActivity.baseheartedness) ) {
                    GameActivity.subradiance = 7;        


            } else {
                    Pxram = "";
}




                      Pxram = "";
}

            } else {
                    if ( GameActivity.baseheartedness .equals(GameActivity.baseheartedness) ) {
                    if ( GameActivity.baseheartedness == null
) {
                    GameActivity.strophomenidae = "";

                     GameActivity.fourteeners = false;

                      Pxram = "Neumayer" ;
}

                     GameActivity.strophomenidae = "Quiddist" ;

                      GameActivity.fourteeners = true;
}
}



}




         
    }

     
    public  void paddockstool(int S4gmX, String u3BvY, String nifD3, int Hvok8) {
        
 if ( GameActivity.baseheartedness != null || GameActivity.atarax <= S4gmX

) 
 {
 if (S4gmX <= 11

) 
 {
 if ( GameActivity.baseheartedness == null
) 
 {        if (8 <= Hvok8
 &&  nifD3 != null) {
                    if ( GameActivity.fourteeners 
 ||  u3BvY .contains("Descombes") ) {
                    if (! nifD3 .contains("dereliction")  || Hvok8 != 9

) {
                    --Hvok8;

                     --Hvok8;

                      GameActivity.atarax++;
}

            } else {
                    GameActivity.fourteeners = ! false;
}




                     if ( nifD3 == null
 && ! u3BvY .contains(nifD3) ) {
                    GameActivity.connive = true;

                     u3BvY = "unscolding" ;

                      GameActivity.connive = false;
}

                      GameActivity.connive = true;
}
}
 else if 
 ( GameActivity.fourteeners 
) 
 {
 if ( GameActivity.connive 
) 
 {        if (6 > GameActivity.backstories
) {
                    GameActivity.fourteeners = ! true;

            } else {
                    GameActivity.fourteeners =  true;
}



}
 else if 
 (Hvok8 <= 10

 &&  nifD3 != null) 
 {        GameActivity.hookah++;
} 
 else 
 {        GameActivity.strophomenidae = "pakistan" ;
}

} 
 else 
 {        if ( GameActivity.strophomenidae == null
 &&  nifD3 .equals("inferiorness") ) {
                    nifD3 = "nonpartisan" ;

            } else {
                    u3BvY = "";
}



}

}
 else if 
 ( u3BvY .isEmpty() ) 
 {        if ( GameActivity.strophomenidae .equals(GameActivity.strophomenidae) ) {
                    if ( u3BvY != null && GameActivity.subradiance == GameActivity.atarax
) {
            
 if ( GameActivity.baseheartedness != null) 
 {        GameActivity.fourteeners = ! true;
}
 else if 
 (! nifD3 .isEmpty()  ||  u3BvY != null) 
 {        u3BvY = "";
} 
 else 
 {        Hvok8 += 14;        

}


            } else {
                    nifD3 = "pourparlers" ;
}




            } else {
                    if (S4gmX != Hvok8
 ||  u3BvY != null) {
                    GameActivity.fourteeners = true;

            } else {
                    nifD3 = "";
}



}



} 
 else 
 {        if (Hvok8 != S4gmX

) {
                    if (! u3BvY .equals("skat")  &&  nifD3 .contains("courtlets") ) {
                    GameActivity.connive = false;

            } else {
                    GameActivity.strophomenidae = "unmaker" ;
}




            } else {
                    GameActivity.fourteeners = ! true;
}



}

}
 else if 
 ( nifD3 == null
 ||  GameActivity.baseheartedness == null
) 
 {        GameActivity.fourteeners = true;
} 
 else 
 {        if ( nifD3 != null) {
                    if ( nifD3 != null ||  u3BvY == null
) {
                    S4gmX--;

            } else {
                    GameActivity.connive =  true;
}




            } else {
            
 if ( GameActivity.baseheartedness .contains("nonaerating")  && S4gmX <= GameActivity.backstories

) 
 {        nifD3 = "";
}
 else if 
 ( nifD3 .contains("breislakite")  || GameActivity.subradiance <= GameActivity.subradiance

) 
 {        GameActivity.fourteeners = true;
} 
 else 
 {        GameActivity.baseheartedness = "eschynite" ;
}

}



}

        if ( u3BvY == null
 || ! GameActivity.baseheartedness .equals("Weyanoke") ) {
                    GameActivity.connive = false;

             
 if (GameActivity.hookah == 7

 ||  GameActivity.baseheartedness == null
) 
 {        if ( u3BvY == null
 &&  nifD3 == null
) {
                    if ( u3BvY .equals(u3BvY)  || 4 != GameActivity.subradiance
) {
                    if ( u3BvY != null || Hvok8 < Hvok8

) {
                    Hvok8--;

            } else {
                    S4gmX = 1;
}




            } else {
                    GameActivity.connive = false;
}




            } else {
            
 if (! nifD3 .isEmpty()  ||  u3BvY == null
) 
 {        u3BvY = "";
}
 else if 
 (! u3BvY .contains(nifD3)  &&  GameActivity.baseheartedness .trim().isEmpty() ) 
 {        GameActivity.connive = true;
} 
 else 
 {        --S4gmX;
}

}



}
 else if 
 ( u3BvY == null
) 
 {
 if ( GameActivity.strophomenidae == null
 && S4gmX != 8

) 
 {
 if (7 == GameActivity.hookah
) 
 {        GameActivity.connive = true;
}
 else if 
 (! GameActivity.connive 
) 
 {        ++Hvok8;
} 
 else 
 {        S4gmX++;
}

}
 else if 
 ( nifD3 .contains("Loomis")  &&  nifD3 == null
) 
 {        GameActivity.connive =  false;
} 
 else 
 {        GameActivity.connive =  true;
}

} 
 else 
 {
 if ( GameActivity.baseheartedness == null
) 
 {        GameActivity.fourteeners = true;
}
 else if 
 (GameActivity.subradiance <= GameActivity.atarax
) 
 {        Hvok8 = 3;
} 
 else 
 {        Hvok8 = 2;
}

}


              
 if (GameActivity.atarax == GameActivity.atarax
) 
 {
 if ( nifD3 .contains("ganglioneuroma") ) 
 {        if (S4gmX < 0

) {
                    GameActivity.fourteeners = false;

            } else {
                    u3BvY = "";
}



}
 else if 
 ( u3BvY == null
) 
 {        GameActivity.connive = false;
} 
 else 
 {        GameActivity.backstories++;
}

}
 else if 
 ( nifD3 == null
 &&  u3BvY .contains("pursuingly") ) 
 {        if ( nifD3 == null
 ||  GameActivity.fourteeners 
) {
                    GameActivity.subradiance++;

            } else {
                    nifD3 = "";
}



} 
 else 
 {        GameActivity.subradiance = 0;        

}

}
        if ( GameActivity.baseheartedness != null || Hvok8 > GameActivity.backstories
) {
            
 if (GameActivity.atarax <= 13

) 
 {        if (GameActivity.subradiance != GameActivity.backstories
 && GameActivity.backstories <= Hvok8

) {
                    if (GameActivity.hookah != S4gmX

) {
                    if (! GameActivity.fourteeners 
 &&  GameActivity.strophomenidae .equals("unmoveably") ) {
            
 if ( GameActivity.connive 
) 
 {        GameActivity.fourteeners = false;
}
 else if 
 ( GameActivity.fourteeners 
) 
 {        GameActivity.fourteeners =  true;
} 
 else 
 {        nifD3 = "";
}


            } else {
                    u3BvY = "";
}




            } else {
            
 if ( GameActivity.fourteeners 
) 
 {        GameActivity.fourteeners =  true;
}
 else if 
 ( GameActivity.strophomenidae == null
) 
 {        GameActivity.connive = true;
} 
 else 
 {        GameActivity.atarax = 10;
}

}




                     if (S4gmX != S4gmX

) {
                    if ( GameActivity.fourteeners 
) {
                    S4gmX--;

            } else {
                    u3BvY = "stabilitate" ;
}




                     nifD3 = "selamin" ;

                      GameActivity.connive =  false;
}

              
 if ( nifD3 .isEmpty()  &&  u3BvY .equals("lacunes") ) 
 {        u3BvY = "reentrant" ;
}
 else if 
 ( GameActivity.fourteeners 
 || 4 != Hvok8
) 
 {        GameActivity.subradiance -= 0;
} 
 else 
 {        GameActivity.connive = true;
}

}
}
 else if 
 ( nifD3 != null &&  GameActivity.baseheartedness == null
) 
 {
 if ( u3BvY == null
) 
 {
 if ( u3BvY != null) 
 {
 if (S4gmX == GameActivity.hookah
) 
 {        GameActivity.fourteeners = false;
}
 else if 
 (0 > S4gmX
) 
 {        GameActivity.strophomenidae = "";
} 
 else 
 {        GameActivity.connive = false;
}

}
 else if 
 ( nifD3 != null) 
 {        GameActivity.connive = true;
} 
 else 
 {        --S4gmX;
}

}
 else if 
 ( GameActivity.connive 
 &&  u3BvY == null
) 
 {        if (S4gmX > GameActivity.atarax
) {
                    u3BvY = "";

            } else {
                    nifD3 = "";
}



} 
 else 
 {        u3BvY = "";
}

} 
 else 
 {        if (! GameActivity.fourteeners 
) {
                    if (S4gmX < GameActivity.atarax
) {
                    S4gmX++;

                     nifD3 = "";

                      u3BvY = "Sparus" ;
}

                     GameActivity.connive = false;

                      nifD3 = "Huzvaresh" ;
}
}


                     if (S4gmX != Hvok8

 &&  GameActivity.connive 
) {
            
 if (GameActivity.backstories == GameActivity.atarax
) 
 {        if ( GameActivity.connive 
 ||  nifD3 .contains("skippund") ) {
                    if ( nifD3 != null ||  GameActivity.baseheartedness != null) {
                    GameActivity.atarax = 11;        


                     GameActivity.connive = ! true;

                      GameActivity.connive = false;
}

                     nifD3 = "fortravail" ;

                      GameActivity.baseheartedness = "";
}
}
 else if 
 (GameActivity.hookah != 0

) 
 {
 if ( nifD3 == null
) 
 {        u3BvY = "linish" ;
}
 else if 
 ( u3BvY != null) 
 {        GameActivity.connive =  false;
} 
 else 
 {        GameActivity.connive =  false;
}

} 
 else 
 {        nifD3 = "gunnen" ;
}


            } else {
            
 if ( u3BvY == null
 &&  nifD3 == null
) 
 {        if ( GameActivity.connive 
 && GameActivity.subradiance <= 0

) {
                    GameActivity.connive =  false;

                     GameActivity.connive =  false;

                      u3BvY = "foundational" ;
}
}
 else if 
 (2 > GameActivity.hookah
 &&  u3BvY != null) 
 {        GameActivity.baseheartedness = "";
} 
 else 
 {        GameActivity.connive = false;
}

}




              
 if (GameActivity.subradiance > 13

 && GameActivity.subradiance == Hvok8
) 
 {        if (GameActivity.atarax <= GameActivity.atarax
 &&  u3BvY == null
) {
                    if (! GameActivity.connive 
) {
                    GameActivity.connive = false;

            } else {
                    GameActivity.connive = true;
}




            } else {
                    nifD3 = "";
}



}
 else if 
 ( GameActivity.baseheartedness != null) 
 {
 if ( u3BvY != null && ! u3BvY .isEmpty() ) 
 {        u3BvY = "";
}
 else if 
 ( nifD3 == null
) 
 {        S4gmX = 12;
} 
 else 
 {        Hvok8 = 8;        

}

} 
 else 
 {        GameActivity.fourteeners = ! false;
}

}
        if (S4gmX < GameActivity.hookah
) {
                    if (! GameActivity.baseheartedness .toUpperCase().contains("dermatitides") ) {
                    S4gmX += 11;        


                     if (9 != GameActivity.atarax
 &&  u3BvY .isEmpty() ) {
                    GameActivity.atarax++;

                     if (Hvok8 <= GameActivity.hookah
) {
                    GameActivity.backstories = 3;        


            } else {
                    Hvok8++;
}




                      u3BvY = "Loretta" .trim();
}

                      if (GameActivity.backstories > 12

) {
                    if (10 > S4gmX
 ||  u3BvY != null) {
                    S4gmX += 7;        


            } else {
                    GameActivity.connive =  false;
}




                     GameActivity.strophomenidae = "foramination" ;

                      GameActivity.connive =  false;
}
}

            } else {
            
 if ( GameActivity.baseheartedness != null &&  u3BvY == null
) 
 {        if ( u3BvY != null) {
                    if (5 != Hvok8
) {
                    if ( nifD3 == null
 &&  u3BvY .equals("maltster") ) {
                    GameActivity.connive = true;

            } else {
                    Hvok8--;
}




                     nifD3 = "";

                      nifD3 = "condensator" ;
}

             
 if ( u3BvY == null
) 
 {        nifD3 = "";
}
 else if 
 ( u3BvY != null || Hvok8 > GameActivity.hookah
) 
 {        S4gmX--;
} 
 else 
 {        nifD3 = "";
}


                      nifD3 = "neuralgy" ;
}
}
 else if 
 ( GameActivity.baseheartedness != null) 
 {        if ( u3BvY == null
) {
            
 if ( nifD3 == null
 && S4gmX <= 11

) 
 {        S4gmX = 3;
}
 else if 
 (S4gmX < Hvok8
) 
 {        u3BvY = "";
} 
 else 
 {        u3BvY = "noveboracensis" ;
}


            } else {
                    S4gmX++;
}



} 
 else 
 {        if ( GameActivity.connive 
) {
                    S4gmX -= 2;        


            } else {
                    GameActivity.subradiance = 10;        

}



}

}



        if (9 == S4gmX
) {
                    if ( GameActivity.connive 
 && GameActivity.subradiance <= GameActivity.atarax

) {
                    nifD3 = "Capraesque" ;

                     if ( nifD3 != null ||  u3BvY == null
) {
                    if ( u3BvY .equals(nifD3)  ||  u3BvY == null
) {
            
 if ( GameActivity.strophomenidae == null
) 
 {        GameActivity.baseheartedness = "elops" ;
}
 else if 
 (Hvok8 == GameActivity.hookah
) 
 {        S4gmX++;
} 
 else 
 {        nifD3 = "misseat" ;
}


                     GameActivity.fourteeners = true;

                      u3BvY = "propagatress" .intern();
}

            } else {
            
 if (8 <= GameActivity.atarax
) 
 {        GameActivity.fourteeners = false;
}
 else if 
 ( nifD3 == null
) 
 {        Hvok8++;
} 
 else 
 {        GameActivity.fourteeners = false;
}

}




                      if (GameActivity.subradiance == S4gmX
) {
                    if (Hvok8 <= 10

 &&  nifD3 != null) {
                    nifD3 = "";

                     GameActivity.strophomenidae = "";

                      u3BvY = "pockweed" ;
}

                     GameActivity.connive =  false;

                      GameActivity.subradiance = 7;        

}
}

            } else {
                    if (! GameActivity.connive 
 ||  GameActivity.connive 
) {
                    if ( GameActivity.fourteeners 
) {
            
 if (! GameActivity.strophomenidae .equals("truncocolumella") ) 
 {        if ( u3BvY .equals("potholders") ) {
                    GameActivity.fourteeners = ! false;

            } else {
                    GameActivity.hookah++;
}



}
 else if 
 (S4gmX == 5

) 
 {        nifD3 = "";
} 
 else 
 {        nifD3 = "";
}


                     ++GameActivity.subradiance;

                      GameActivity.fourteeners = false;
}

                     if (S4gmX <= GameActivity.hookah
) {
            
 if ( GameActivity.fourteeners 
 && Hvok8 <= Hvok8
) 
 {        Hvok8 = 5;
}
 else if 
 ( GameActivity.baseheartedness == null
 ||  GameActivity.baseheartedness == null
) 
 {        GameActivity.connive =  true;
} 
 else 
 {        GameActivity.baseheartedness = "unmortalize" ;
}


            } else {
                    GameActivity.hookah--;
}




                      if (GameActivity.subradiance == GameActivity.subradiance
 &&  GameActivity.connive 
) {
                    GameActivity.connive =  false;

                     S4gmX -= 13;        


                      ++S4gmX;
}
}
}



        if (GameActivity.subradiance <= 14

 ||  nifD3 != null) {
                    if ( nifD3 == null
 && ! GameActivity.fourteeners 
) {
                    if ( GameActivity.baseheartedness != null &&  GameActivity.fourteeners 
) {
                    if ( nifD3 != null &&  GameActivity.fourteeners 
) {
                    if ( u3BvY != null) {
            
 if ( nifD3 != null || S4gmX < Hvok8

) 
 {        u3BvY = "";
}
 else if 
 ( GameActivity.fourteeners 
 ||  nifD3 != null) 
 {        GameActivity.connive = true;
} 
 else 
 {        nifD3 = "transvaluating" ;
}


                     u3BvY = "Ptolemaian" .toUpperCase();

                      GameActivity.connive = false;
}

            } else {
            
 if ( GameActivity.fourteeners 
 && ! u3BvY .intern().isEmpty() ) 
 {        u3BvY = "";
}
 else if 
 (S4gmX > 12

) 
 {        GameActivity.strophomenidae = "dubnium" ;
} 
 else 
 {        GameActivity.backstories = 5;        

}

}




                     if ( u3BvY == null
 &&  nifD3 .isEmpty() ) {
                    u3BvY = "monocyanogen" .toUpperCase();

                     nifD3 = "";

                      u3BvY = "hydroceles" ;
}

                      if (! GameActivity.connive 
) {
                    GameActivity.fourteeners =  false;

                     GameActivity.strophomenidae = "";

                      --GameActivity.backstories;
}
}

            } else {
                    u3BvY = "";
}




            } else {
                    if (5 > Hvok8
 &&  u3BvY .contains(nifD3) ) {
            
 if ( nifD3 .equals("venefically") ) 
 {        if (S4gmX < GameActivity.subradiance
) {
            
 if ( nifD3 != null) 
 {        u3BvY = "coccobacilli" ;
}
 else if 
 ( u3BvY != null) 
 {        GameActivity.connive = true;
} 
 else 
 {        u3BvY = "";
}


                     Hvok8++;

                      GameActivity.fourteeners = false;
}
}
 else if 
 ( u3BvY == null
 &&  nifD3 != null) 
 {        GameActivity.connive =  false;
} 
 else 
 {        nifD3 = "";
}


            } else {
                    if ( u3BvY != null && GameActivity.atarax != S4gmX
) {
            
 if (GameActivity.atarax == S4gmX

 &&  u3BvY == null
) 
 {        GameActivity.connive = true;
}
 else if 
 ( GameActivity.fourteeners 
) 
 {        u3BvY = "";
} 
 else 
 {        u3BvY = "";
}


                     GameActivity.fourteeners = false;

                      GameActivity.connive =  true;
}
}



}



        if ( GameActivity.baseheartedness .contains(GameActivity.strophomenidae)  ||  u3BvY != null) {
                    if ( GameActivity.baseheartedness != null) {
            
 if (0 == S4gmX
 ||  u3BvY == null
) 
 {        if ( nifD3 .contains("chipchop") ) {
                    GameActivity.fourteeners = true;

            } else {
                    if ( nifD3 != null) {
                    GameActivity.connive = false;

                     GameActivity.connive = false;

                      Hvok8 = 11;
}
}



}
 else if 
 ( GameActivity.connive 
) 
 {        if ( GameActivity.fourteeners 
 &&  GameActivity.connive 
) {
                    if ( u3BvY .contains("essaying") ) {
                    S4gmX += 11;

                     u3BvY = "";

                      GameActivity.connive = false;
}

                     nifD3 = "Parseeisms" ;

                      S4gmX--;
}
} 
 else 
 {        if ( u3BvY != null) {
                    GameActivity.subradiance = 5;        


            } else {
                    --GameActivity.hookah;
}



}


            } else {
                    GameActivity.backstories -= 11;        

}




            } else {
                    if ( u3BvY != null && 11 != Hvok8
) {
            
 if (! GameActivity.fourteeners 
) 
 {        if (GameActivity.hookah > S4gmX
) {
            
 if ( GameActivity.fourteeners 
) 
 {        GameActivity.atarax = 10;        

}
 else if 
 ( u3BvY == null
) 
 {        GameActivity.connive = false;
} 
 else 
 {        GameActivity.hookah++;
}


                     u3BvY = "pistes" ;

                      nifD3 = "ungulata" ;
}
}
 else if 
 ( nifD3 == null
) 
 {
 if ( nifD3 != null || GameActivity.backstories != 6

) 
 {        GameActivity.connive = true;
}
 else if 
 (GameActivity.backstories > GameActivity.hookah

) 
 {        Hvok8 = 11;        

} 
 else 
 {        GameActivity.fourteeners =  false;
}

} 
 else 
 {        nifD3 = "";
}


                     nifD3 = "semifigurativeness" .trim();

                      if ( GameActivity.fourteeners 
 && S4gmX > GameActivity.backstories

) {
                    GameActivity.baseheartedness = "Mukri" ;

            } else {
                    GameActivity.fourteeners = true;
}



}
}




         
    }

     
    public  void hallucinogens(boolean aYSvT) {
                if ( GameActivity.strophomenidae .equals("discontinuous")  && 4 != GameActivity.subradiance
) {
                    if ( GameActivity.baseheartedness .equals(GameActivity.strophomenidae) ) {
                    if (GameActivity.hookah <= GameActivity.hookah

) {
                    if ( GameActivity.baseheartedness != null) {
                    if (GameActivity.atarax < GameActivity.hookah

 &&  GameActivity.strophomenidae .isEmpty() ) {
            
 if (GameActivity.atarax <= GameActivity.backstories
) 
 {        aYSvT =  true;
}
 else if 
 ( GameActivity.baseheartedness .isEmpty() ) 
 {        GameActivity.baseheartedness = "azobenzil" ;
} 
 else 
 {        aYSvT = true;
}


                     aYSvT = true;

                      ++GameActivity.atarax;
}

                     if ( GameActivity.strophomenidae .equals(GameActivity.strophomenidae)  ||  GameActivity.connive 
) {
                    aYSvT = true;

                     aYSvT = true;

                      GameActivity.baseheartedness = "";
}

                      ++GameActivity.backstories;
}

            } else {
            
 if (GameActivity.backstories <= 10

) 
 {        if ( aYSvT 
) {
                    GameActivity.baseheartedness = "";

                     GameActivity.backstories = 11;

                      GameActivity.connive = false;
}
}
 else if 
 ( GameActivity.strophomenidae == null
 &&  GameActivity.strophomenidae == null
) 
 {        GameActivity.strophomenidae = "gargol" ;
} 
 else 
 {        GameActivity.hookah++;
}

}




                     GameActivity.atarax = 0;

                      if ( GameActivity.strophomenidae == null
) {
                    if ( GameActivity.strophomenidae == null
) {
                    GameActivity.subradiance--;

            } else {
                    GameActivity.baseheartedness = "";
}




                     GameActivity.baseheartedness = "Xyleborus" ;

                      GameActivity.strophomenidae = "";
}
}

                     if ( GameActivity.baseheartedness != null || GameActivity.atarax == GameActivity.subradiance

) {
                    if (6 <= GameActivity.hookah
 || 8 <= GameActivity.hookah
) {
                    if ( GameActivity.strophomenidae != null &&  GameActivity.baseheartedness != null) {
            
 if ( GameActivity.strophomenidae != null) 
 {        GameActivity.atarax = 10;        

}
 else if 
 ( GameActivity.baseheartedness == null
) 
 {        --GameActivity.hookah;
} 
 else 
 {        GameActivity.baseheartedness = "aspheterizing" ;
}


                     aYSvT = false;

                      GameActivity.strophomenidae = "Icelander" ;
}

            } else {
                    if (! GameActivity.strophomenidae .contains(GameActivity.strophomenidae) ) {
                    GameActivity.strophomenidae = "";

                     GameActivity.subradiance--;

                      aYSvT =  true;
}
}




            } else {
            
 if ( GameActivity.connive 
) 
 {        if (GameActivity.hookah <= 14

 ||  GameActivity.connive 
) {
                    GameActivity.backstories = 10;

                     GameActivity.baseheartedness = "";

                      aYSvT = ! true;
}
}
 else if 
 (1 != GameActivity.backstories
) 
 {        GameActivity.subradiance--;
} 
 else 
 {        GameActivity.atarax = 14;
}

}




                      if (GameActivity.subradiance != GameActivity.atarax

 && ! GameActivity.fourteeners 
) {
            
 if (GameActivity.atarax == 9

 || GameActivity.subradiance <= GameActivity.subradiance

) 
 {
 if ( GameActivity.baseheartedness == null
) 
 {        aYSvT = false;
}
 else if 
 ( GameActivity.strophomenidae != null || GameActivity.backstories <= 9

) 
 {        GameActivity.subradiance = 2;        

} 
 else 
 {        aYSvT = ! false;
}

}
 else if 
 ( GameActivity.strophomenidae != null &&  GameActivity.strophomenidae == null
) 
 {        ++GameActivity.subradiance;
} 
 else 
 {        aYSvT = true;
}


                     if (GameActivity.hookah == GameActivity.backstories
) {
                    GameActivity.strophomenidae = "dayshifts" ;

                     GameActivity.hookah--;

                      GameActivity.baseheartedness = "colonialnesses" ;
}

                      GameActivity.strophomenidae = "";
}
}

         
    }

     
    public  void rescramble() {
        
         
    }

     }