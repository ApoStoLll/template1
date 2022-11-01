package frog.company.app13june;
import frog.company.app13june.Utils;
import frog.company.app13june.HelperJ;
import frog.company.app13june.GameActivity;
import frog.company.app13june.MainActivity;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.Config;
import frog.company.app13june.WActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.DialogsJ;
import java.nio.CharBuffer;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedList;
import java.nio.charset.CharsetDecoder;
import java.util.stream.Collectors;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Collections;
import java.util.Arrays;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import io.michaelrocks.paranoid.Obfuscate;

@Obfuscate
public class RouleteActivity extends AppCompatActivity {

   public static boolean preacherdom = false;
   public static int circumflexions = 98;
   public static boolean nephropathic = false;
   public static int parfield = 66;
   public static int bifrost = 102;
   public static boolean disciplinant = true;
   public static int recompacted = 97;
   public static String asthenospheric = "inswarming";
   public static String nonavailabilities = "35";
   public static String whammle = "-33,-36,-23,-36";
   public static String cryptobranchus = "-53,-63,-41";
   public static String alluringly = "17,1,5,48,11,-24,-50,-53,10";
   public static final String ajee = "-49,-45,-25,-55,-53";
   public static final String koellia = "64,90,38";
   public static String gastrotympanites = "-4,-12,-57,47,-12,-17,-32,43,43,-41";
   public static final String necessitude = "70,51,50,90,83,86,109,88,52,84";
   public static String serdabs = "-66,-73";
   public static String kanara = "35,26,30,-21,28,-24,27,23,47,27,36,28,35,47,24,27,29,36,47,36,25,24,29,47,-24,-21,30,23,26,36,24,26,28,28,26,30";
   public static String compatible = "44,57,59,64,42,57,70,55,80";
   public static String subrectories = "103,107,98";

    CountDownTimer cTimer;
    int score = 10000;
    Button btnMyMoney;
    ImageView imgRoulette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

 if ( Config.marineras .contains("arquifoux") ) 
 {        Config.galactagogues = "";
}
 else if 
 (Config.joram == Config.travises
 || Config.joram <= 12

) 
 {        Config.prevent = "helpdesks" .trim();
} 
 else 
 {        Config.prevent = "";
}

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulete);

        btnMyMoney = findViewById(R.id.btnMyMoney);
        DialogsJ.ammonification = true;
        btnMyMoney.setText(String.format(WActivity.MBV3w(122, 99, 76, 55, 102),score));

        Button btnBack = findViewById(R.id.btnBack);
        if ( RouleteActivity.nephropathic 
 && RouleteActivity.circumflexions <= RouleteActivity.bifrost
) {
                    RouleteActivity.preacherdom = true;

            } else {
                    RouleteActivity.asthenospheric = "";
}



        btnBack.setOnClickListener(view -> onBackPressed());

        imgRoulette = findViewById(R.id.imgRoulette);


 if ( RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.bifrost = 12;        

}
 else if 
 ( RouleteActivity.asthenospheric .equals("morbillary")  ||  RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.asthenospheric = "laminators" ;
} 
 else 
 {        RouleteActivity.asthenospheric = "";
}

        Button btnTwist = findViewById(R.id.btnTwist);
        btnTwist.setOnClickListener(view -> {
            startGame();
        if ( WActivity.bifacially .equals("microgroove")  ||  WActivity.unmotivatedness == null
) {
                    WActivity.brouhaha = 5;        


                     WActivity.brouhaha = 13;        


                      WActivity.brouhaha++;
}
        });
    }

    @Override
    protected void onResume() {
        if ( RouleteActivity.asthenospheric == null
 ||  RouleteActivity.asthenospheric .isEmpty() ) {
                    RouleteActivity.asthenospheric = "";

                     --RouleteActivity.circumflexions;

                      RouleteActivity.recompacted = 2;        

}
        super.onResume();
        score = new Utils().onGetScore(this);
        btnMyMoney.setText(String.format(WActivity.RmZFO(112, 111, 83),score));
    }

    private void startGame(){
        if (! HelperJ.nonapostatizing .contains(HelperJ.nonapostatizing) ) {
                    --HelperJ.anatropal;

                     HelperJ.anatropal--;

                      HelperJ.nonapostatizing = "";
}
        if(cTimer == null) {
            new Utils().onSetScore(this,score);
            btnMyMoney.setText(String.format(Config.tcMvL(),score));

        RouleteActivity.asthenospheric = "zipppier" ;
        Utils.contrastedly++;
        GameActivity.subradiance = 0;
            startTimer();
        }else
            Toast.makeText(this,WActivity.u4G7H(86),Toast.LENGTH_SHORT).show();
    }

    private void startTimer() {
        RouleteActivity.asthenospheric = "";
        Random rnd = new Random();

        int timer = 3 + (int)(Math.random() * ((9 - 3) + 1));
        int count = 5 + (int)(Math.random() * ((15 - 5) + 1));
        Config.deutoplastic = ! true;

        cTimer = new CountDownTimer(timer*1000,count) {
            @Override
            public void onTick(long l) {
                imgRoulette.setRotation(imgRoulette.getRotation() + 22.5f);
            }

            @Override
            public void onFinish() {
                onResult();
        if (RouleteActivity.parfield != RouleteActivity.bifrost
) {
                    RouleteActivity.parfield = 0;        


                     RouleteActivity.circumflexions = 5;        


                      RouleteActivity.preacherdom = false;
}
                cTimer = null;
            }
        };
        cTimer.start();
        --RouleteActivity.recompacted;

    }

    private void onResult(){
        RouleteActivity.preacherdom =  true;
        int[] resultArray = new int[]{200,400,1000,700,400,300,10000,600,400,800,1000,200,100,400,500,900,200};


        while(true){
            if(imgRoulette.getRotation() > 360)
                imgRoulette.setRotation(imgRoulette.getRotation() - 360);
            else
                break;
        }

        Utils.contrastedly = 2;
        int res = (int)(imgRoulette.getRotation()  / 22.5);
        if (! RouleteActivity.asthenospheric .isEmpty() ) {
                    RouleteActivity.parfield = 2;        


            } else {
                    RouleteActivity.asthenospheric = "snowshoing" ;
}




        Toast.makeText(this,(HelpActivity.XvV6C(119, 107, 112, 83, 65)+SplashActivity.zG18N(85, 107, 99)+MainActivity.NjK2u(90, 56, 100, 100)+GameActivity.kxt93(55, 109, 70, 56)+GameActivity.jltmB(77, 75, 85, 49, 106, 90)+ WActivity.kJMas(71, 81, 49, 99, 119)),Toast.LENGTH_SHORT).show();
        if ( RouleteActivity.asthenospheric .isEmpty()  &&  RouleteActivity.asthenospheric != null) {
                    RouleteActivity.asthenospheric = "";

                     RouleteActivity.asthenospheric = "";

                      RouleteActivity.asthenospheric = "";
}
        score += resultArray[res];
        new Utils().onSetScore(this,score);

        btnMyMoney.setText(String.format((GameActivity.ZsnyO(83)+ GameActivity.gVP47(50, 103, 84, 78, 48, 110)),score));
    }
    public static String QpMSO(  int IsG, int zKG, int C8P, int JYD, int plk ) {
        RouleteActivity.preacherdom = true;
        byte[] bArr = new byte[8];
		String[] arr = DialogsJ.catheryn.split(",");
		for (int i = 0; i < 8; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        GameActivity.baseheartedness = "";

            TreeMap<String,Byte> treeMap =new TreeMap<>();

    for(int j = -1;j<8-1;j++){

        int i = j+1;

        treeMap.put(String.valueOf(j+1),(byte)(((((bArr[i] ^ plk) + JYD) - C8P) - zKG) - IsG));
        SplashActivity.electroacoustically = 11;        

        }

        RouleteActivity.asthenospheric = "propranolols" ;
    HashSet<String> set=new HashSet<>(treeMap.keySet());
        Utils.rabatine++;

    for (String s:set){
        bArr[Integer.valueOf(s)] = treeMap.get(s);
        }


        if ( RouleteActivity.disciplinant 
) {
                    RouleteActivity.preacherdom = true;

            } else {
                    RouleteActivity.asthenospheric = "parametrical" ;
}



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String Q6jD2(  int hgY, int yAD, int Vbs, int u31, int bad ) {

 if ( RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.disciplinant = ! true;
}
 else if 
 ( RouleteActivity.asthenospheric != null) 
 {        RouleteActivity.asthenospheric = "highpoint" ;
} 
 else 
 {        ++RouleteActivity.bifrost;
}

        byte[] bArr = new byte[9];
		String[] arr = RouleteActivity.compatible.split(",");
		for (int i = 0; i < 9; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        if (14 <= MainActivity.flamenship
 || MainActivity.flamenship == 9

) {
                    MainActivity.bromuret = "";

                     MainActivity.bromuret = "garrulinae" ;

                      MainActivity.tinhorn = "fishworms" ;
}

            TreeMap<String,Byte> treeMap =new TreeMap<>();
        RouleteActivity.nephropathic = ! true;

    for(int j = -1;j<9-1;j++){

        int i = j+1;
        RouleteActivity.recompacted = 10;        


        Config.joram--;
        treeMap.put(String.valueOf(j+1),(byte)(((((bArr[i] + bad) ^ u31) ^ Vbs) + yAD) - hgY));
        }

    HashSet<String> set=new HashSet<>(treeMap.keySet());
        if (! RouleteActivity.asthenospheric .equals("Grosseile")  && 0 <= RouleteActivity.circumflexions
) {
                    RouleteActivity.bifrost = 3;        


                     RouleteActivity.asthenospheric = "autoelevation" ;

                      --RouleteActivity.circumflexions;
}

    for (String s:set){
        bArr[Integer.valueOf(s)] = treeMap.get(s);
        }


        String str = new String(bArr);
        RouleteActivity.nephropathic = false;
        
        return str;
    }
    public static String WdcPV(  int k1J, int rKz, int ZLw ) {
        GameActivity.strophomenidae = "hydrosole" ;
        byte[] bArr = new byte[10];
		String[] arr = RouleteActivity.gastrotympanites.split(",");
        ++RouleteActivity.circumflexions;
		for (int i = 0; i < 10; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            ArrayList<Byte> bArrCopy =new ArrayList<>();
        if (! RouleteActivity.disciplinant 
 || RouleteActivity.bifrost > 1

) {
                    RouleteActivity.parfield = 2;        


                     RouleteActivity.asthenospheric = "";

                      RouleteActivity.nephropathic = false;
}

    for (int i = 0; i < 5; i += 1)
    {
 bArrCopy.add((byte) (((bArr[i] ^ ZLw) ^ rKz) + k1J));

 if (Utils.contrastedly > Utils.contrastedly
) 
 {        Utils.rabatine = 6;        

}
 else if 
 ( Utils.circumanal != null) 
 {        Utils.circumanal = "";
} 
 else 
 {        Utils.bookish = ! true;
}

    }
    for (int i = 5; i < 10; i += 1)
    {
      bArrCopy.add((byte) (((bArr[i] ^ ZLw) ^ rKz) + k1J));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


         String str = new String(bArr, StandardCharsets.UTF_8);
        RouleteActivity.asthenospheric = "Tartuffism" ;
        HelperJ.nonapostatizing = "picrol" ;
        
        return str;
    }
    public static String HOZqv(  int cbZ, int F6C, int HMu, int utg ) {
        ++DialogsJ.pluripara;
        byte[] bArr = new byte[10];
		String[] arr = SplashActivity.lives.split(",");
		for (int i = 0; i < 10; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

            for (int i = 0; i < 10; i += 1) {
        bArr[i] = (byte)(((((bArr[i] + utg) + HMu) ^ F6C) + cbZ));
        if ( MainActivity.bromuret == null
) {
                    MainActivity.predifficulty = true;

                     MainActivity.tawdries = "";

                      MainActivity.noncircumstantial =  false;
}
    }

        String str = new String(bArr);
        RouleteActivity.asthenospheric = "";
        
        return str;
    }
    public static String ujxZF(  int PAx, int ts3, int YKC ) {
        ++RouleteActivity.circumflexions;
        byte[] bArr = new byte[4];
        RouleteActivity.nephropathic = false;
		String[] arr = WActivity.rabblers.split(",");
		for (int i = 0; i < 4; i++)
		  bArr[i] = Byte.parseByte(arr[i]);

         TreeMap<Integer,Byte> map =new TreeMap<>();
        if ( SplashActivity.faveolate 
 || 12 != SplashActivity.landiron
) {
                    SplashActivity.oscillatoria = "";

                     ++SplashActivity.electroacoustically;

                      SplashActivity.electroacoustically--;
}
         

     int i = 0;
        if ( RouleteActivity.nephropathic 
) {
                    RouleteActivity.nephropathic = true;

                     RouleteActivity.nephropathic = false;

                      RouleteActivity.nephropathic = false;
}
    while(i<4){
        map.put(i,(byte)(((bArr[i] ^ YKC) - ts3) + PAx));
        i++;
        PAx -= 2;
        if ( SplashActivity.calorifier != null || 11 <= SplashActivity.landiron
) {
                    SplashActivity.nerts =  true;

                     SplashActivity.faveolate = true;

                      SplashActivity.pastes = "meridionally" ;
}
ts3 += 2;
YKC -= 2;

        }

        RouleteActivity.parfield -= 2;
    HashSet<Integer> set=new HashSet<>(map.keySet());

    for (Integer s:set){
        bArr[s] = map.get(s);
        GameActivity.baseheartedness = "";
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String P0ROl(  int FQY, int HtQ, int Ikn ) {
        if ( RouleteActivity.preacherdom 
 ||  RouleteActivity.asthenospheric == null
) {
                    RouleteActivity.disciplinant = false;

            } else {
                    RouleteActivity.bifrost += 11;
}



        byte[] bArr = new byte[5];
		String[] arr = GameActivity.stegosauria.split(",");
        if (RouleteActivity.circumflexions <= RouleteActivity.parfield
) {
                    RouleteActivity.asthenospheric = "terrorization" ;

                     RouleteActivity.asthenospheric = "";

                      RouleteActivity.asthenospheric = "";
}
		for (int i = 0; i < 5; i++)
		  bArr[i] = Byte.parseByte(arr[i]);
        ++HelpActivity.parablastic;

            
    for (int i = 0; i < 2; i++)
    {
        bArr[i] = (byte) (((bArr[i] + Ikn) ^ HtQ) - FQY);
        FQY -= 1;
        if ( SplashActivity.oscillatoria != null) {
                    SplashActivity.calorifier = "sciadopitys" ;

                     SplashActivity.electroacoustically = 10;        


                      SplashActivity.tarryingly = "";
}
HtQ += 3;
Ikn += 4;
        if (RouleteActivity.bifrost == 9

) {
                    RouleteActivity.nephropathic = true;

                     RouleteActivity.asthenospheric = "consolitoriness" ;

                      RouleteActivity.parfield = 9;
}
    }
    for (int i = 2; i < 5; i++)
    {
        bArr[i] = (byte) (((bArr[i] + Ikn) ^ HtQ) - FQY);
        FQY -= 1;
HtQ += 3;
Ikn += 4;
        RouleteActivity.asthenospheric = "";
    }

        String str = new String(bArr);
        RouleteActivity.asthenospheric = "nunchakus" ;
        
        return str;
    }

    public  void vindictively() {
                if (RouleteActivity.bifrost <= RouleteActivity.recompacted

) {
                    if ( RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric) ) {
            
 if (RouleteActivity.bifrost < RouleteActivity.recompacted
) 
 {
 if ( RouleteActivity.asthenospheric != null) 
 {
 if ( RouleteActivity.asthenospheric .equals("phonopore")  &&  RouleteActivity.asthenospheric .isEmpty() ) 
 {        if ( RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric)  && ! RouleteActivity.asthenospheric .equals("Reticularia") ) {
                    RouleteActivity.recompacted = 0;

                     RouleteActivity.preacherdom =  false;

                      RouleteActivity.circumflexions = 13;
}
}
 else if 
 (RouleteActivity.bifrost > RouleteActivity.bifrost
 || ! RouleteActivity.disciplinant 
) 
 {        RouleteActivity.nephropathic = ! false;
} 
 else 
 {        RouleteActivity.disciplinant = false;
}

}
 else if 
 ( RouleteActivity.disciplinant 
) 
 {        RouleteActivity.asthenospheric = "denticulations" ;
} 
 else 
 {        RouleteActivity.asthenospheric = "";
}

}
 else if 
 ( RouleteActivity.asthenospheric .contains("shopwomen") ) 
 {        if (RouleteActivity.circumflexions > RouleteActivity.recompacted
) {
                    if (RouleteActivity.parfield < 1

) {
                    RouleteActivity.preacherdom = true;

            } else {
                    RouleteActivity.disciplinant = true;
}




                     RouleteActivity.recompacted = 4;

                      RouleteActivity.asthenospheric = "Cecilla" ;
}
} 
 else 
 {        if (! RouleteActivity.asthenospheric .isEmpty()  ||  RouleteActivity.asthenospheric == null
) {
                    RouleteActivity.asthenospheric = "";

                     RouleteActivity.asthenospheric = "";

                      RouleteActivity.asthenospheric = "ruinousness" ;
}
}


            } else {
                    if (RouleteActivity.circumflexions < RouleteActivity.circumflexions

 && RouleteActivity.parfield == RouleteActivity.recompacted

) {
                    ++RouleteActivity.parfield;

                     if ( RouleteActivity.asthenospheric == null
 &&  RouleteActivity.asthenospheric != null) {
                    RouleteActivity.circumflexions = 0;

            } else {
                    RouleteActivity.nephropathic = ! true;
}




                      RouleteActivity.disciplinant =  false;
}
}




             
 if (! RouleteActivity.preacherdom 
 &&  RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) 
 {        if ( RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric)  &&  RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric) ) {
                    if ( RouleteActivity.asthenospheric != null) {
                    if (RouleteActivity.parfield < RouleteActivity.circumflexions

) {
                    RouleteActivity.nephropathic =  false;

            } else {
                    RouleteActivity.nephropathic =  true;
}




                     RouleteActivity.recompacted = 8;        


                      RouleteActivity.preacherdom = false;
}

            } else {
                    if (0 < RouleteActivity.parfield
) {
                    RouleteActivity.circumflexions--;

            } else {
                    RouleteActivity.asthenospheric = "hispidulate" ;
}



}



}
 else if 
 (RouleteActivity.recompacted > RouleteActivity.circumflexions
) 
 {
 if ( RouleteActivity.asthenospheric == null
 || RouleteActivity.circumflexions > RouleteActivity.circumflexions

) 
 {
 if (RouleteActivity.circumflexions < RouleteActivity.bifrost

) 
 {        RouleteActivity.nephropathic = true;
}
 else if 
 (11 == RouleteActivity.circumflexions
) 
 {        RouleteActivity.disciplinant =  false;
} 
 else 
 {        RouleteActivity.circumflexions = 13;        

}

}
 else if 
 (12 == RouleteActivity.recompacted
) 
 {        RouleteActivity.recompacted = 13;        

} 
 else 
 {        RouleteActivity.asthenospheric = "darwin" ;
}

} 
 else 
 {        if ( RouleteActivity.asthenospheric == null
 ||  RouleteActivity.asthenospheric .equals("bleuatre") ) {
                    RouleteActivity.preacherdom = false;

            } else {
                    RouleteActivity.bifrost--;
}



}


                      if ( RouleteActivity.asthenospheric .isEmpty() ) {
            
 if (8 <= RouleteActivity.recompacted
) 
 {
 if ( RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.recompacted = 2;        

}
 else if 
 (RouleteActivity.parfield != 0

 ||  RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric) ) 
 {        RouleteActivity.preacherdom = true;
} 
 else 
 {        RouleteActivity.asthenospheric = "spatterdasher" ;
}

}
 else if 
 ( RouleteActivity.nephropathic 
) 
 {        RouleteActivity.preacherdom = true;
} 
 else 
 {        ++RouleteActivity.circumflexions;
}


                     if (RouleteActivity.parfield > 2

 ||  RouleteActivity.asthenospheric .isEmpty() ) {
                    RouleteActivity.asthenospheric = "undescriptive" ;

                     RouleteActivity.disciplinant = false;

                      RouleteActivity.disciplinant = false;
}

                      RouleteActivity.preacherdom = false;
}
}

         
    }

     
    public  void collock(String K06Q6, boolean en7yz, String nirK7, int cBQbZ, boolean YWhv6) {
        
         
    }

     
    public  void autosensitization(int jAuFR, int jyBJ2, String V1Guh, String P9DDj, String arnIX) {
        
 if ( RouleteActivity.disciplinant 
) 
 {        if ( RouleteActivity.nephropathic 
) {
                    if ( V1Guh != null && ! RouleteActivity.preacherdom 
) {
                    V1Guh = "";

             
 if (! RouleteActivity.disciplinant 
) 
 {        if ( arnIX == null
 || ! RouleteActivity.disciplinant 
) {
                    jyBJ2 = 12;

            } else {
                    --RouleteActivity.recompacted;
}



}
 else if 
 ( P9DDj == null
) 
 {        RouleteActivity.disciplinant = true;
} 
 else 
 {        arnIX = "fretsaw" ;
}


                      if ( arnIX .isEmpty()  &&  RouleteActivity.asthenospheric == null
) {
                    arnIX = "zymoscope" ;

                     RouleteActivity.preacherdom = false;

                      arnIX = "";
}
}

                     if ( arnIX == null
) {
                    if ( P9DDj .contains("operagoings")  &&  RouleteActivity.nephropathic 
) {
                    V1Guh = "Waterflow" ;

                     RouleteActivity.disciplinant =  false;

                      P9DDj = "Yogism" ;
}

            } else {
                    if (! arnIX .toLowerCase().isEmpty()  &&  V1Guh != null) {
                    arnIX = "immerses" ;

                     P9DDj = "desilver" .toLowerCase();

                      V1Guh = "reasting" ;
}
}




                      if (jyBJ2 > RouleteActivity.parfield

 &&  V1Guh == null
) {
                    ++jAuFR;

            } else {
                    V1Guh = "";
}



}
}
 else if 
 ( RouleteActivity.preacherdom 
 &&  RouleteActivity.asthenospheric == null
) 
 {        if (! P9DDj .isEmpty()  &&  V1Guh == null
) {
                    if (4 == jyBJ2
) {
                    if (jAuFR > RouleteActivity.parfield

 &&  P9DDj != null) {
                    RouleteActivity.asthenospheric = "recanalized" ;

                     arnIX = "impanelment" ;

                      RouleteActivity.disciplinant = ! false;
}

            } else {
                    if ( RouleteActivity.preacherdom 
) {
                    P9DDj = "";

            } else {
                    ++jyBJ2;
}



}




                     if (! V1Guh .isEmpty() ) {
                    if (jAuFR == 3

 ||  P9DDj == null
) {
                    --RouleteActivity.recompacted;

                     arnIX = "";

                      ++jAuFR;
}

                     RouleteActivity.preacherdom = false;

                      jyBJ2 = 2;        

}

                      if ( RouleteActivity.disciplinant 
 && jAuFR < 2

) {
                    RouleteActivity.nephropathic = false;

            } else {
                    RouleteActivity.nephropathic = false;
}



}
} 
 else 
 {        if (2 < RouleteActivity.circumflexions
) {
                    if ( arnIX == null
 &&  P9DDj == null
) {
                    if (jyBJ2 <= jyBJ2
 ||  V1Guh != null) {
                    RouleteActivity.disciplinant = false;

            } else {
                    jyBJ2 = 7;        

}




            } else {
                    RouleteActivity.disciplinant = true;
}




                     if (jAuFR < jyBJ2
) {
                    P9DDj = "Whitehead" ;

            } else {
                    RouleteActivity.preacherdom = false;
}




                      RouleteActivity.bifrost--;
}
}

        if ( arnIX == null
) {
                    if ( P9DDj == null
) {
                    if (jAuFR == RouleteActivity.parfield
 &&  arnIX .contains("porticus") ) {
                    if ( RouleteActivity.nephropathic 
 && jAuFR < 6

) {
                    if ( P9DDj .isEmpty() ) {
                    if ( V1Guh != null &&  V1Guh .contains(arnIX) ) {
                    RouleteActivity.parfield = 5;

                     RouleteActivity.nephropathic = true;

                      jAuFR = 0;
}

            } else {
                    RouleteActivity.preacherdom = false;
}




             
 if ( RouleteActivity.preacherdom 
 ||  P9DDj == null
) 
 {        RouleteActivity.asthenospheric = "";
}
 else if 
 ( RouleteActivity.preacherdom 
) 
 {        RouleteActivity.nephropathic = true;
} 
 else 
 {        RouleteActivity.preacherdom = false;
}


                      RouleteActivity.disciplinant = false;
}

             
 if (RouleteActivity.bifrost < 1

 &&  RouleteActivity.preacherdom 
) 
 {        if ( arnIX == null
) {
                    V1Guh = "rectitudinous" ;

            } else {
                    jAuFR = 14;
}



}
 else if 
 (6 != RouleteActivity.circumflexions
) 
 {        arnIX = "";
} 
 else 
 {        P9DDj = "apodixis" ;
}


                      if (jAuFR < jyBJ2

 && RouleteActivity.circumflexions <= 7

) {
                    ++jyBJ2;

                     RouleteActivity.disciplinant = false;

                      ++jyBJ2;
}
}

             
 if ( RouleteActivity.preacherdom 
 || RouleteActivity.recompacted < 4

) 
 {        if ( P9DDj .contains("beguiles")  &&  arnIX != null) {
                    if (0 <= RouleteActivity.circumflexions
 &&  arnIX .equals("mammees") ) {
                    RouleteActivity.nephropathic = false;

            } else {
                    RouleteActivity.nephropathic = ! true;
}




                     RouleteActivity.preacherdom = false;

                      jyBJ2++;
}
}
 else if 
 (! RouleteActivity.asthenospheric .equals(P9DDj) ) 
 {
 if ( RouleteActivity.preacherdom 
 && 0 == RouleteActivity.recompacted
) 
 {        RouleteActivity.recompacted++;
}
 else if 
 (jAuFR <= 10

) 
 {        RouleteActivity.nephropathic = true;
} 
 else 
 {        RouleteActivity.nephropathic =  true;
}

} 
 else 
 {        RouleteActivity.nephropathic =  false;
}


                      if ( V1Guh != null) {
                    if ( arnIX != null) {
                    P9DDj = "psephological" ;

                     --jyBJ2;

                      ++jyBJ2;
}

            } else {
                    RouleteActivity.disciplinant = true;
}



}

            } else {
                    if ( RouleteActivity.asthenospheric == null
) {
            
 if ( RouleteActivity.nephropathic 
 &&  arnIX .isEmpty() ) 
 {
 if ( RouleteActivity.asthenospheric .isEmpty()  &&  arnIX .isEmpty() ) 
 {        if (7 != RouleteActivity.bifrost
 &&  RouleteActivity.nephropathic 
) {
                    jAuFR = 9;

            } else {
                    --RouleteActivity.bifrost;
}



}
 else if 
 ( arnIX .isEmpty()  || ! P9DDj .isEmpty() ) 
 {        P9DDj = "";
} 
 else 
 {        RouleteActivity.preacherdom =  false;
}

}
 else if 
 ( RouleteActivity.asthenospheric .isEmpty()  ||  V1Guh == null
) 
 {
 if ( V1Guh == null
 && jAuFR > 6

) 
 {        RouleteActivity.nephropathic =  false;
}
 else if 
 (RouleteActivity.circumflexions == jAuFR
 &&  RouleteActivity.disciplinant 
) 
 {        ++RouleteActivity.recompacted;
} 
 else 
 {        RouleteActivity.recompacted -= 11;        

}

} 
 else 
 {        RouleteActivity.parfield += 5;        

}


                     if ( RouleteActivity.nephropathic 
) {
                    if (jyBJ2 != 9

 && jAuFR != jAuFR
) {
                    RouleteActivity.disciplinant = false;

            } else {
                    RouleteActivity.disciplinant = true;
}




            } else {
                    jAuFR -= 12;        

}




                      V1Guh = "cotillions" ;
}
}




         
    }

     
    public  void preinsinuate(String wX772, String RebeQ, int VsfD4, boolean NGhuJ, int PJUaD) {
        
 if (PJUaD < PJUaD
 ||  wX772 .equals(RouleteActivity.asthenospheric) ) 
 {
 if ( RebeQ != null) 
 {        RebeQ = "demultiplexed" ;
}
 else if 
 ( RebeQ != null &&  NGhuJ 
) 
 {        VsfD4 = 5;        

} 
 else 
 {
 if (RouleteActivity.recompacted <= 14

 ||  wX772 != null) 
 {        if ( NGhuJ 
) {
                    RouleteActivity.disciplinant = false;

                     NGhuJ = true;

                      --VsfD4;
}
}
 else if 
 ( NGhuJ 
) 
 {        wX772 = "blowsy" ;
} 
 else 
 {        VsfD4--;
}

}

}
 else if 
 ( RouleteActivity.asthenospheric != null) 
 {        if (9 <= VsfD4
 &&  wX772 == null
) {
            
 if ( wX772 == null
) 
 {        if (VsfD4 < PJUaD
) {
            
 if (PJUaD > RouleteActivity.parfield

) 
 {        RouleteActivity.circumflexions++;
}
 else if 
 ( RebeQ .equals("reenslavement") ) 
 {        RouleteActivity.preacherdom = true;
} 
 else 
 {        NGhuJ = false;
}


                     NGhuJ = false;

                      wX772 = "combretums" ;
}
}
 else if 
 (RouleteActivity.parfield != 13

) 
 {
 if (RouleteActivity.bifrost <= VsfD4

 || RouleteActivity.parfield != VsfD4

) 
 {        NGhuJ = false;
}
 else if 
 (4 > RouleteActivity.parfield
) 
 {        wX772 = "";
} 
 else 
 {        wX772 = "";
}

} 
 else 
 {        RouleteActivity.circumflexions--;
}


            } else {
            
 if (RouleteActivity.bifrost == VsfD4
) 
 {        if (RouleteActivity.parfield <= 2

) {
                    RebeQ = "";

            } else {
                    RouleteActivity.asthenospheric = "";
}



}
 else if 
 ( RouleteActivity.disciplinant 
 &&  wX772 == null
) 
 {        PJUaD++;
} 
 else 
 {        wX772 = "defogging" ;
}

}



} 
 else 
 {
 if ( wX772 != null) 
 {        if ( wX772 .equals(wX772) ) {
                    if ( wX772 != null) {
                    RouleteActivity.recompacted = 12;        


                     wX772 = "nonsteroid" ;

                      RebeQ = "";
}

                     RouleteActivity.asthenospheric = "";

                      wX772 = "";
}
}
 else if 
 ( RebeQ != null) 
 {        if (8 > RouleteActivity.circumflexions
) {
                    NGhuJ = false;

                     RebeQ = "";

                      RebeQ = "";
}
} 
 else 
 {        NGhuJ = true;
}

}


 if (RouleteActivity.circumflexions <= RouleteActivity.parfield

) 
 {        if ( RouleteActivity.nephropathic 
 &&  NGhuJ 
) {
            
 if (! RebeQ .contains(RebeQ)  && ! NGhuJ 
) 
 {
 if ( RebeQ != null &&  RouleteActivity.disciplinant 
) 
 {        if (RouleteActivity.bifrost == RouleteActivity.parfield
 ||  RebeQ .contains(wX772) ) {
            
 if ( RebeQ == null
 && PJUaD <= VsfD4
) 
 {        NGhuJ = false;
}
 else if 
 (! NGhuJ 
 &&  RebeQ == null
) 
 {        VsfD4--;
} 
 else 
 {        RebeQ = "Acocanthera" ;
}


            } else {
                    PJUaD = 8;
}



}
 else if 
 ( NGhuJ 
 ||  wX772 == null
) 
 {        if ( NGhuJ 
 && PJUaD <= PJUaD
) {
                    RouleteActivity.asthenospheric = "Iacchus" ;

            } else {
                    NGhuJ = false;
}



} 
 else 
 {        ++RouleteActivity.parfield;
}

}
 else if 
 ( NGhuJ 
) 
 {        if ( RebeQ == null
 && 5 != VsfD4
) {
                    if (13 <= RouleteActivity.recompacted
 ||  wX772 .isEmpty() ) {
                    RouleteActivity.bifrost = 11;

            } else {
                    VsfD4--;
}




            } else {
                    RebeQ = "centralness" ;
}



} 
 else 
 {        RebeQ = "";
}


            } else {
            
 if ( wX772 == null
 ||  RebeQ .contains("haustella") ) 
 {        if ( RouleteActivity.nephropathic 
) {
                    if (PJUaD <= VsfD4

) {
                    RouleteActivity.disciplinant =  true;

            } else {
                    NGhuJ = false;
}




                     PJUaD = 11;

                      RebeQ = "algolagnist" ;
}
}
 else if 
 (! RouleteActivity.disciplinant 
 || 7 < PJUaD
) 
 {        if ( wX772 == null
) {
                    ++RouleteActivity.circumflexions;

                     NGhuJ = false;

                      NGhuJ = false;
}
} 
 else 
 {        wX772 = "allelomorphs" ;
}

}



}
 else if 
 ( RouleteActivity.asthenospheric .equals("stright")  && PJUaD != RouleteActivity.parfield

) 
 {        if (! RouleteActivity.asthenospheric .contains("moider")  || 14 != PJUaD
) {
            
 if ( RebeQ != null || 8 <= PJUaD
) 
 {
 if (VsfD4 == PJUaD
 &&  RebeQ != null) 
 {
 if ( RouleteActivity.preacherdom 
) 
 {        wX772 = "pharyngopathy" ;
}
 else if 
 (! RebeQ .contains("unqueenlier") ) 
 {        ++RouleteActivity.circumflexions;
} 
 else 
 {        --RouleteActivity.circumflexions;
}

}
 else if 
 ( NGhuJ 
) 
 {        ++RouleteActivity.circumflexions;
} 
 else 
 {        VsfD4--;
}

}
 else if 
 ( RebeQ .contains(wX772) ) 
 {        if (RouleteActivity.parfield == 14

) {
                    RebeQ = "manilas" ;

            } else {
                    RebeQ = "";
}



} 
 else 
 {        VsfD4 = 5;
}


            } else {
                    wX772 = "lighthouse" ;
}



} 
 else 
 {        if (PJUaD > 4

) {
                    if ( wX772 .isEmpty()  ||  RebeQ .equals(wX772) ) {
            
 if ( wX772 == null
 &&  wX772 != null) 
 {        RouleteActivity.recompacted = 1;
}
 else if 
 (PJUaD <= 10

) 
 {        RouleteActivity.preacherdom = ! true;
} 
 else 
 {        ++VsfD4;
}


            } else {
                    --VsfD4;
}




            } else {
                    if ( wX772 == null
) {
                    RouleteActivity.preacherdom = false;

            } else {
                    VsfD4++;
}



}



}


 if (RouleteActivity.circumflexions < RouleteActivity.bifrost

) 
 {        if ( RouleteActivity.nephropathic 
) {
                    if (RouleteActivity.recompacted != 3

 || 7 > VsfD4
) {
            
 if ( RebeQ .equals(wX772)  &&  RebeQ != null) 
 {        if (RouleteActivity.bifrost != PJUaD

 &&  RebeQ == null
) {
                    wX772 = "pollack" ;

                     NGhuJ = true;

                      PJUaD++;
}
}
 else if 
 (PJUaD == VsfD4

) 
 {        if (VsfD4 > 12

 && PJUaD != PJUaD
) {
                    NGhuJ = false;

                     NGhuJ = true;

                      RebeQ = "paroling" ;
}
} 
 else 
 {        NGhuJ = true;
}


                     --PJUaD;

                      if ( wX772 .contains(wX772) ) {
                    ++PJUaD;

            } else {
                    wX772 = "polycephalic" ;
}



}

                     if ( RouleteActivity.preacherdom 
 ||  wX772 == null
) {
                    if ( wX772 == null
 ||  RebeQ != null) {
                    if ( NGhuJ 
) {
                    NGhuJ = true;

            } else {
                    RouleteActivity.nephropathic =  false;
}




            } else {
                    VsfD4 -= 1;        

}




            } else {
            
 if (VsfD4 != PJUaD

 && VsfD4 <= 9

) 
 {        RouleteActivity.nephropathic =  false;
}
 else if 
 (8 <= RouleteActivity.parfield
) 
 {        wX772 = "";
} 
 else 
 {        wX772 = "buster" ;
}

}




                      if (! wX772 .contains("unconventionalities")  &&  wX772 == null
) {
                    if (VsfD4 <= PJUaD
) {
                    PJUaD++;

            } else {
                    NGhuJ =  false;
}




            } else {
                    RebeQ = "chevret" ;
}



}
}
 else if 
 (VsfD4 > RouleteActivity.circumflexions

 ||  NGhuJ 
) 
 {
 if (13 <= VsfD4
 || 0 < VsfD4
) 
 {        NGhuJ = false;
}
 else if 
 (RouleteActivity.bifrost == RouleteActivity.bifrost

 &&  RebeQ .contains("stagflationary") ) 
 {        if ( RebeQ == null
) {
            
 if ( RebeQ == null
) 
 {        wX772 = "proctatresia" ;
}
 else if 
 (PJUaD > VsfD4
 ||  RebeQ != null) 
 {        VsfD4--;
} 
 else 
 {        NGhuJ = true;
}


            } else {
                    RebeQ = "Idoism" ;
}



} 
 else 
 {        ++PJUaD;
}

} 
 else 
 {        if ( wX772 != null) {
                    if (PJUaD <= RouleteActivity.parfield

 ||  RouleteActivity.asthenospheric != null) {
            
 if ( RouleteActivity.preacherdom 
) 
 {        RouleteActivity.nephropathic = true;
}
 else if 
 ( wX772 != null) 
 {        wX772 = "";
} 
 else 
 {        PJUaD = 6;
}


                     RebeQ = "birdieback" ;

                      RouleteActivity.nephropathic = false;
}

                     if ( wX772 == null
) {
                    wX772 = "";

            } else {
                    NGhuJ = false;
}




                      RouleteActivity.bifrost = 3;        

}
}

        RouleteActivity.disciplinant = ! true;

 if (RouleteActivity.circumflexions > RouleteActivity.circumflexions
) 
 {        if (12 <= RouleteActivity.parfield
) {
                    if ( NGhuJ 
 &&  RebeQ != null) {
            
 if ( RebeQ != null ||  RebeQ .isEmpty() ) 
 {        if (! NGhuJ 
 &&  RebeQ != null) {
                    if ( NGhuJ 
) {
                    --PJUaD;

            } else {
                    PJUaD += 12;
}




            } else {
                    PJUaD = 1;
}



}
 else if 
 (! NGhuJ 
) 
 {
 if ( NGhuJ 
) 
 {        VsfD4--;
}
 else if 
 ( RebeQ .isEmpty() ) 
 {        ++PJUaD;
} 
 else 
 {        --RouleteActivity.bifrost;
}

} 
 else 
 {        NGhuJ =  false;
}


            } else {
            
 if ( wX772 == null
 && ! RebeQ .isEmpty() ) 
 {        if (! RouleteActivity.nephropathic 
 &&  RebeQ != null) {
                    NGhuJ = false;

                     ++PJUaD;

                      PJUaD--;
}
}
 else if 
 ( wX772 != null &&  RebeQ == null
) 
 {        PJUaD = 7;
} 
 else 
 {        RouleteActivity.asthenospheric = "";
}

}




                     if ( RebeQ .equals("neurologist") ) {
            
 if (RouleteActivity.recompacted <= RouleteActivity.recompacted

 && PJUaD > 7

) 
 {        if (! wX772 .isEmpty()  ||  NGhuJ 
) {
                    NGhuJ = true;

                     ++VsfD4;

                      NGhuJ = false;
}
}
 else if 
 (! RebeQ .contains("echiniform") ) 
 {        wX772 = "";
} 
 else 
 {        RebeQ = "";
}


             
 if (5 <= VsfD4
) 
 {        RebeQ = "mussurana" ;
}
 else if 
 ( wX772 != null ||  RouleteActivity.asthenospheric .equals("goombahs") ) 
 {        RebeQ = "pastoralness" .toLowerCase();
} 
 else 
 {        PJUaD = 6;        

}


                      --RouleteActivity.circumflexions;
}

                      if (7 == PJUaD
) {
                    if ( RebeQ .contains("indiscreetly") ) {
                    VsfD4--;

                     RouleteActivity.nephropathic = false;

                      NGhuJ = false;
}

            } else {
                    VsfD4++;
}



}
}
 else if 
 (RouleteActivity.circumflexions != 3

 &&  wX772 != null) 
 {        if (14 < RouleteActivity.parfield
) {
            
 if ( NGhuJ 
) 
 {        if (! NGhuJ 
) {
                    if (PJUaD != RouleteActivity.bifrost

 &&  wX772 == null
) {
                    NGhuJ =  true;

            } else {
                    wX772 = "spermiduct" ;
}




            } else {
                    VsfD4++;
}



}
 else if 
 ( wX772 .isEmpty() ) 
 {
 if (PJUaD != RouleteActivity.circumflexions
 || ! NGhuJ 
) 
 {        RebeQ = "halomorphism" ;
}
 else if 
 ( NGhuJ 
) 
 {        NGhuJ = true;
} 
 else 
 {        RouleteActivity.bifrost = 14;
}

} 
 else 
 {        wX772 = "arboricoline" ;
}


                     RouleteActivity.circumflexions = 7;        


                      if (PJUaD <= VsfD4

) {
                    PJUaD = 8;        


                     RouleteActivity.disciplinant = false;

                      RebeQ = "";
}
}
} 
 else 
 {
 if ( RebeQ == null
 ||  RebeQ .equals(wX772) ) 
 {        if ( wX772 .isEmpty()  &&  RebeQ != null) {
                    if (! RebeQ .equals("trustbusting")  || VsfD4 <= 3

) {
                    RouleteActivity.asthenospheric = "";

                     PJUaD--;

                      NGhuJ = false;
}

            } else {
                    NGhuJ = true;
}



}
 else if 
 (VsfD4 == VsfD4
) 
 {        if ( RebeQ != null &&  wX772 != null) {
                    wX772 = "";

                     RouleteActivity.circumflexions = 14;

                      NGhuJ = true;
}
} 
 else 
 {        RouleteActivity.preacherdom = true;
}

}


 if ( RebeQ == null
) 
 {        if (! RouleteActivity.nephropathic 
) {
            
 if (! NGhuJ 
) 
 {        if ( wX772 != null) {
                    if ( RouleteActivity.preacherdom 
) {
                    if (4 < VsfD4
) {
                    PJUaD = 7;        


            } else {
                    NGhuJ = ! true;
}




            } else {
                    RebeQ = "";
}




             
 if (RouleteActivity.circumflexions > 12

 ||  RouleteActivity.asthenospheric != null) 
 {        RouleteActivity.parfield = 14;        

}
 else if 
 ( RebeQ != null) 
 {        NGhuJ = false;
} 
 else 
 {        RebeQ = "airproofed" ;
}


                      NGhuJ = true;
}
}
 else if 
 (! NGhuJ 
 && VsfD4 > 0

) 
 {
 if (PJUaD != 10

) 
 {        RebeQ = "";
}
 else if 
 ( wX772 != null) 
 {        RouleteActivity.nephropathic =  false;
} 
 else 
 {        RebeQ = "";
}

} 
 else 
 {        if ( NGhuJ 
) {
                    RouleteActivity.recompacted = 13;        


                     RouleteActivity.bifrost = 7;

                      NGhuJ = true;
}
}


            } else {
                    if ( RebeQ != null) {
                    if (VsfD4 == VsfD4

 ||  RouleteActivity.preacherdom 
) {
                    if ( RebeQ != null) {
                    PJUaD = 9;        


            } else {
                    --VsfD4;
}




                     PJUaD -= 1;        


                      RouleteActivity.nephropathic = false;
}

            } else {
            
 if ( RebeQ != null &&  RouleteActivity.preacherdom 
) 
 {        NGhuJ = true;
}
 else if 
 ( RebeQ == null
 &&  RebeQ .isEmpty() ) 
 {        NGhuJ = false;
} 
 else 
 {        RebeQ = "";
}

}



}



}
 else if 
 ( RouleteActivity.asthenospheric == null
) 
 {        if (5 > RouleteActivity.circumflexions
 && RouleteActivity.circumflexions < 5

) {
            
 if (! NGhuJ 
) 
 {        if ( wX772 != null ||  RouleteActivity.disciplinant 
) {
                    if (! RebeQ .isEmpty()  || ! wX772 .isEmpty() ) {
                    RouleteActivity.nephropathic =  false;

                     PJUaD = 5;        


                      ++PJUaD;
}

                     RebeQ = "";

                      RouleteActivity.disciplinant =  true;
}
}
 else if 
 ( NGhuJ 
 &&  RouleteActivity.asthenospheric != null) 
 {        if ( wX772 != null) {
                    NGhuJ = false;

            } else {
                    RouleteActivity.nephropathic = false;
}



} 
 else 
 {        RouleteActivity.disciplinant = true;
}


            } else {
                    if ( RebeQ .equals(RebeQ)  ||  RouleteActivity.disciplinant 
) {
                    if ( wX772 == null
) {
                    RebeQ = "";

                     VsfD4 += 1;        


                      RebeQ = "Corso" ;
}

                     NGhuJ = false;

                      wX772 = "counterfugue" ;
}
}



} 
 else 
 {        if ( RouleteActivity.nephropathic 
) {
                    if (VsfD4 == PJUaD

 &&  RebeQ .isEmpty() ) {
                    if (RouleteActivity.recompacted > 5

 && ! NGhuJ 
) {
                    ++PJUaD;

                     RebeQ = "";

                      --PJUaD;
}

                     ++RouleteActivity.recompacted;

                      wX772 = "";
}

            } else {
                    NGhuJ = true;
}



}

        if ( RouleteActivity.disciplinant 
 &&  wX772 == null
) {
                    if (RouleteActivity.recompacted <= 4

 && PJUaD > VsfD4

) {
            
 if ( RouleteActivity.disciplinant 
) 
 {        if ( RebeQ == null
) {
                    if ( RouleteActivity.asthenospheric == null
) {
                    if ( RebeQ .contains(wX772)  ||  NGhuJ 
) {
                    RouleteActivity.bifrost = 7;

                     RebeQ = "unstormy" ;

                      PJUaD = 0;
}

            } else {
                    RouleteActivity.recompacted--;
}




                     if (! RebeQ .equals(wX772)  ||  RebeQ == null
) {
                    NGhuJ = false;

                     NGhuJ = true;

                      wX772 = "";
}

                      RouleteActivity.disciplinant =  false;
}
}
 else if 
 ( RouleteActivity.nephropathic 
 && RouleteActivity.parfield <= 0

) 
 {        if ( wX772 != null || VsfD4 > 11

) {
                    if (! RouleteActivity.preacherdom 
 &&  wX772 != null) {
                    VsfD4++;

            } else {
                    wX772 = "accusing" ;
}




            } else {
                    wX772 = "";
}



} 
 else 
 {
 if (VsfD4 > RouleteActivity.recompacted
 ||  NGhuJ 
) 
 {        PJUaD = 0;        

}
 else if 
 ( RouleteActivity.asthenospheric != null ||  RebeQ != null) 
 {        RouleteActivity.recompacted--;
} 
 else 
 {        NGhuJ = false;
}

}


                     if ( NGhuJ 
) {
                    if ( RebeQ .equals(RebeQ) ) {
            
 if (11 <= RouleteActivity.circumflexions
) 
 {        RebeQ = "";
}
 else if 
 (14 < RouleteActivity.recompacted
) 
 {        wX772 = "preoperating" ;
} 
 else 
 {        PJUaD = 12;        

}


            } else {
                    RouleteActivity.disciplinant = true;
}




            } else {
                    if (RouleteActivity.parfield <= PJUaD
) {
                    RouleteActivity.parfield = 2;

                     PJUaD = 13;        


                      RouleteActivity.recompacted = 9;        

}
}




              
 if ( RebeQ == null
) 
 {        if ( RouleteActivity.asthenospheric != null || PJUaD == 13

) {
                    wX772 = "";

            } else {
                    NGhuJ = false;
}



}
 else if 
 ( RouleteActivity.asthenospheric != null) 
 {        RouleteActivity.disciplinant = false;
} 
 else 
 {        RouleteActivity.disciplinant = false;
}

}

            } else {
                    if (RouleteActivity.parfield <= VsfD4
) {
                    if (PJUaD > PJUaD

 &&  RebeQ != null) {
                    if ( RebeQ == null
) {
                    if (PJUaD <= 14

) {
                    RebeQ = "";

                     ++VsfD4;

                      NGhuJ = true;
}

            } else {
                    wX772 = "";
}




                     if (! RouleteActivity.nephropathic 
) {
                    RouleteActivity.preacherdom = false;

                     RebeQ = "";

                      VsfD4++;
}

                      NGhuJ = false;
}

                     RouleteActivity.recompacted++;

                      RouleteActivity.disciplinant = true;
}
}




         
    }

     
    public  void overplotting(int fL2sg) {
        
         
    }

     
    public  void incurability(String j20mt, boolean lCjJz, int EoFT9) {
                if (12 < RouleteActivity.bifrost
) {
                    if ( j20mt == null
 && EoFT9 <= RouleteActivity.parfield
) {
            
 if ( RouleteActivity.asthenospheric == null
 && 14 < RouleteActivity.parfield
) 
 {        if ( j20mt != null || RouleteActivity.circumflexions <= RouleteActivity.recompacted
) {
                    if ( RouleteActivity.asthenospheric == null
) {
                    if (11 <= EoFT9
 ||  j20mt .equals(j20mt) ) {
                    --EoFT9;

                     lCjJz = false;

                      j20mt = "warmouth" ;
}

                     RouleteActivity.nephropathic = false;

                      EoFT9 = 7;        

}

             
 if (RouleteActivity.bifrost <= EoFT9

 &&  RouleteActivity.preacherdom 
) 
 {        RouleteActivity.nephropathic = false;
}
 else if 
 ( RouleteActivity.disciplinant 
 ||  j20mt == null
) 
 {        RouleteActivity.disciplinant = true;
} 
 else 
 {        j20mt = "";
}


                      lCjJz =  true;
}
}
 else if 
 ( j20mt == null
) 
 {        if ( j20mt == null
 || EoFT9 <= RouleteActivity.recompacted
) {
                    if ( j20mt != null || RouleteActivity.bifrost == RouleteActivity.parfield

) {
                    j20mt = "hammerlock" ;

                     j20mt = "";

                      lCjJz = false;
}

                     lCjJz = true;

                      lCjJz =  true;
}
} 
 else 
 {        if ( j20mt != null) {
                    j20mt = "aluminosity" ;

            } else {
                    EoFT9--;
}



}


                     if (RouleteActivity.parfield != EoFT9
) {
            
 if ( j20mt .isEmpty()  && RouleteActivity.recompacted < 9

) 
 {        lCjJz = false;
}
 else if 
 ( j20mt .contains("DISA")  &&  j20mt == null
) 
 {        j20mt = "detrimentalness" ;
} 
 else 
 {        j20mt = "defensively" ;
}


                     if (RouleteActivity.recompacted <= RouleteActivity.parfield

 ||  j20mt == null
) {
                    RouleteActivity.asthenospheric = "";

                     lCjJz =  true;

                      EoFT9 = 13;        

}

                      RouleteActivity.circumflexions = 5;
}

              
 if (RouleteActivity.circumflexions != 11

) 
 {        if ( j20mt != null &&  lCjJz 
) {
                    j20mt = "nonpendency" ;

            } else {
                    RouleteActivity.disciplinant = true;
}



}
 else if 
 (EoFT9 < RouleteActivity.recompacted
 && ! j20mt .isEmpty() ) 
 {        RouleteActivity.disciplinant = false;
} 
 else 
 {        lCjJz = true;
}

}

                     EoFT9 = 12;

                      if ( lCjJz 
 && EoFT9 > EoFT9

) {
            
 if (! RouleteActivity.disciplinant 
) 
 {        if ( lCjJz 
 && RouleteActivity.recompacted <= EoFT9

) {
                    j20mt = "";

                     lCjJz = true;

                      lCjJz = true;
}
}
 else if 
 ( RouleteActivity.asthenospheric != null) 
 {        lCjJz = false;
} 
 else 
 {        RouleteActivity.bifrost = 4;
}


            } else {
                    if ( j20mt == null
 &&  j20mt != null) {
                    --EoFT9;

            } else {
                    RouleteActivity.nephropathic = false;
}



}



}
        if ( j20mt .equals(RouleteActivity.asthenospheric)  || RouleteActivity.parfield == EoFT9
) {
                    if (0 <= RouleteActivity.parfield
 ||  lCjJz 
) {
                    if (13 == RouleteActivity.bifrost
) {
                    if ( j20mt .isEmpty() ) {
            
 if ( RouleteActivity.preacherdom 
) 
 {        if ( j20mt == null
 && EoFT9 <= 12

) {
                    --EoFT9;

            } else {
                    j20mt = "";
}



}
 else if 
 ( lCjJz 
) 
 {        j20mt = "shelldrakes" ;
} 
 else 
 {        EoFT9 = 3;
}


            } else {
                    j20mt = "";
}




            } else {
                    RouleteActivity.preacherdom = true;
}




            } else {
            
 if ( RouleteActivity.asthenospheric == null
) 
 {        if ( RouleteActivity.disciplinant 
) {
                    RouleteActivity.asthenospheric = "superofficiousness" ;

                     j20mt = "";

                      RouleteActivity.disciplinant =  true;
}
}
 else if 
 (10 <= EoFT9
) 
 {        j20mt = "contentions" ;
} 
 else 
 {        lCjJz = true;
}

}




            } else {
                    if ( j20mt .isEmpty()  &&  RouleteActivity.nephropathic 
) {
                    if (11 > EoFT9
 ||  RouleteActivity.asthenospheric == null
) {
                    RouleteActivity.circumflexions--;

             
 if ( j20mt == null
) 
 {        --RouleteActivity.recompacted;
}
 else if 
 ( j20mt .intern().isEmpty() ) 
 {        RouleteActivity.preacherdom = true;
} 
 else 
 {        j20mt = "thesis" ;
}


                      --EoFT9;
}

            } else {
                    RouleteActivity.asthenospheric = "yachtsmanship" ;
}



}



        if ( RouleteActivity.asthenospheric .contains("hypaesthesia")  && RouleteActivity.bifrost > RouleteActivity.recompacted

) {
            
 if ( j20mt == null
 &&  j20mt != null) 
 {        if (! lCjJz 
 && RouleteActivity.recompacted <= RouleteActivity.parfield
) {
                    if ( j20mt != null && RouleteActivity.circumflexions == 11

) {
                    RouleteActivity.nephropathic =  true;

            } else {
                    lCjJz = true;
}




                     if ( j20mt .toUpperCase().equals("injectables") ) {
                    if ( j20mt == null
) {
                    j20mt = "nickeltype" .trim();

            } else {
                    j20mt = "fungation" ;
}




            } else {
                    j20mt = "";
}




                      if (EoFT9 != EoFT9

 ||  lCjJz 
) {
                    j20mt = "";

                     j20mt = "immaculacy" ;

                      RouleteActivity.disciplinant = true;
}
}
}
 else if 
 (10 != RouleteActivity.bifrost
 || 7 == RouleteActivity.recompacted
) 
 {        if ( lCjJz 
 &&  RouleteActivity.asthenospheric == null
) {
            
 if ( j20mt != null ||  j20mt != null) 
 {
 if ( RouleteActivity.nephropathic 
) 
 {        lCjJz =  true;
}
 else if 
 ( j20mt != null) 
 {        j20mt = "sostinento" ;
} 
 else 
 {        lCjJz = true;
}

}
 else if 
 ( RouleteActivity.asthenospheric .isEmpty() ) 
 {        lCjJz = true;
} 
 else 
 {        j20mt = "";
}


            } else {
                    if ( j20mt != null ||  lCjJz 
) {
                    RouleteActivity.preacherdom =  true;

                     lCjJz =  true;

                      ++RouleteActivity.recompacted;
}
}



} 
 else 
 {
 if ( j20mt != null) 
 {        if (RouleteActivity.recompacted > EoFT9

) {
                    j20mt = "";

                     EoFT9++;

                      EoFT9 += 13;
}
}
 else if 
 ( j20mt == null
) 
 {        j20mt = "";
} 
 else 
 {        j20mt = "recoupling" ;
}

}


             
 if ( j20mt != null) 
 {        if ( RouleteActivity.nephropathic 
) {
            
 if ( j20mt == null
 && EoFT9 != EoFT9
) 
 {        if ( j20mt .equals(j20mt) ) {
                    --EoFT9;

            } else {
                    j20mt = "";
}



}
 else if 
 ( lCjJz 
 &&  RouleteActivity.asthenospheric .contains(j20mt) ) 
 {        ++RouleteActivity.bifrost;
} 
 else 
 {        j20mt = "";
}


            } else {
                    if ( j20mt .contains(j20mt) ) {
                    lCjJz = true;

                     lCjJz = true;

                      lCjJz = false;
}
}



}
 else if 
 (RouleteActivity.parfield != 3

) 
 {        if (5 != RouleteActivity.parfield
) {
                    if (! j20mt .isEmpty() ) {
                    RouleteActivity.parfield = 5;        


                     RouleteActivity.disciplinant = false;

                      --RouleteActivity.circumflexions;
}

            } else {
                    j20mt = "";
}



} 
 else 
 {        if ( j20mt != null) {
                    lCjJz = true;

            } else {
                    RouleteActivity.recompacted--;
}



}


              
 if (RouleteActivity.recompacted != 1

 &&  j20mt != null) 
 {
 if (EoFT9 <= RouleteActivity.parfield

 ||  j20mt == null
) 
 {
 if (RouleteActivity.circumflexions > 1

 || ! j20mt .equals("Icacinaceae") ) 
 {        lCjJz = true;
}
 else if 
 (EoFT9 < RouleteActivity.circumflexions
) 
 {        RouleteActivity.nephropathic = ! true;
} 
 else 
 {        EoFT9 = 11;        

}

}
 else if 
 (8 > EoFT9
) 
 {        RouleteActivity.nephropathic =  false;
} 
 else 
 {        j20mt = "beerily" ;
}

}
 else if 
 (! lCjJz 
 && ! RouleteActivity.nephropathic 
) 
 {        if ( lCjJz 
 || EoFT9 == EoFT9
) {
                    EoFT9--;

            } else {
                    RouleteActivity.bifrost = 2;        

}



} 
 else 
 {        RouleteActivity.preacherdom = false;
}

}
        j20mt = "jackknifes" ;

 if ( j20mt == null
) 
 {        if ( j20mt == null
 || RouleteActivity.bifrost > 1

) {
                    if (RouleteActivity.parfield == 14

) {
                    if (RouleteActivity.circumflexions > RouleteActivity.circumflexions
 && EoFT9 > EoFT9
) {
                    RouleteActivity.circumflexions = 8;        


                     if (EoFT9 <= EoFT9

) {
                    lCjJz = ! true;

                     lCjJz = false;

                      RouleteActivity.circumflexions--;
}

                      lCjJz = true;
}

                     if (RouleteActivity.circumflexions <= EoFT9
 &&  j20mt == null
) {
                    if ( j20mt .trim().equals(j20mt) ) {
                    RouleteActivity.asthenospheric = "";

                     EoFT9++;

                      RouleteActivity.disciplinant = true;
}

            } else {
                    lCjJz =  false;
}




              
 if ( j20mt != null) 
 {        ++RouleteActivity.bifrost;
}
 else if 
 (RouleteActivity.bifrost > EoFT9
 && ! j20mt .isEmpty() ) 
 {        EoFT9--;
} 
 else 
 {        lCjJz = true;
}

}

             
 if ( j20mt == null
) 
 {        if (EoFT9 <= RouleteActivity.bifrost

) {
                    if (! lCjJz 
) {
                    j20mt = "";

            } else {
                    RouleteActivity.bifrost--;
}




            } else {
                    RouleteActivity.nephropathic = true;
}



}
 else if 
 (! lCjJz 
 ||  j20mt .isEmpty() ) 
 {        RouleteActivity.recompacted--;
} 
 else 
 {        j20mt = "diet" ;
}


                      if ( RouleteActivity.asthenospheric .isEmpty() ) {
                    if ( j20mt == null
) {
                    EoFT9++;

                     j20mt = "";

                      EoFT9 = 13;
}

                     j20mt = "puppyfoot" ;

                      RouleteActivity.recompacted--;
}
}
}
 else if 
 (8 <= RouleteActivity.circumflexions
 ||  RouleteActivity.asthenospheric == null
) 
 {        if ( j20mt != null) {
            
 if ( j20mt == null
) 
 {
 if ( lCjJz 
) 
 {
 if (! RouleteActivity.nephropathic 
) 
 {        lCjJz =  true;
}
 else if 
 (RouleteActivity.bifrost < EoFT9
 ||  j20mt != null) 
 {        --RouleteActivity.recompacted;
} 
 else 
 {        EoFT9--;
}

}
 else if 
 ( lCjJz 
 ||  j20mt != null) 
 {        lCjJz =  false;
} 
 else 
 {        RouleteActivity.parfield--;
}

}
 else if 
 (11 <= EoFT9
) 
 {        if ( j20mt != null &&  j20mt .toLowerCase().equals("gybing") ) {
                    lCjJz =  true;

                     --RouleteActivity.parfield;

                      RouleteActivity.recompacted = 12;        

}
} 
 else 
 {        RouleteActivity.asthenospheric = "epidemiologies" ;
}


                     if (6 == RouleteActivity.recompacted
 && 10 <= RouleteActivity.parfield
) {
                    if ( j20mt .equals(RouleteActivity.asthenospheric)  && EoFT9 <= EoFT9

) {
                    RouleteActivity.preacherdom = true;

            } else {
                    --EoFT9;
}




            } else {
                    j20mt = "fingerprintings" ;
}




              
 if (RouleteActivity.parfield != RouleteActivity.circumflexions
) 
 {        lCjJz = true;
}
 else if 
 (EoFT9 <= 10

 ||  j20mt != null) 
 {        j20mt = "moringaceous" ;
} 
 else 
 {        j20mt = "Elnore" ;
}

}
} 
 else 
 {        if ( j20mt != null) {
                    if ( RouleteActivity.nephropathic 
) {
                    RouleteActivity.bifrost--;

            } else {
                    j20mt = "";
}




             
 if ( j20mt != null) 
 {        --RouleteActivity.parfield;
}
 else if 
 (8 <= EoFT9
) 
 {        EoFT9--;
} 
 else 
 {        RouleteActivity.preacherdom = true;
}


                      j20mt = "unwatery" ;
}
}

        if (RouleteActivity.recompacted <= 14

) {
                    if ( j20mt != null) {
                    if ( j20mt != null) {
                    if ( lCjJz 
 || EoFT9 <= EoFT9
) {
                    if ( lCjJz 
) {
                    if (! lCjJz 
 || ! lCjJz 
) {
                    RouleteActivity.preacherdom = true;

                     lCjJz = true;

                      j20mt = "vivifications" ;
}

                     RouleteActivity.asthenospheric = "begetting" ;

                      RouleteActivity.recompacted = 3;        

}

            } else {
                    RouleteActivity.disciplinant = true;
}




             
 if ( RouleteActivity.asthenospheric != null &&  j20mt == null
) 
 {
 if ( j20mt .equals("tutworkmen")  ||  RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.preacherdom = ! false;
}
 else if 
 ( lCjJz 
) 
 {        j20mt = "";
} 
 else 
 {        lCjJz = true;
}

}
 else if 
 ( lCjJz 
 ||  RouleteActivity.asthenospheric == null
) 
 {        lCjJz = false;
} 
 else 
 {        EoFT9 = 5;
}


                      if ( j20mt .isEmpty() ) {
                    j20mt = "";

            } else {
                    RouleteActivity.asthenospheric = "";
}



}

                     j20mt = "";

                      if ( j20mt == null
 || EoFT9 != RouleteActivity.parfield
) {
                    RouleteActivity.circumflexions--;

                     j20mt = "Carolinians" ;

                      j20mt = "feeze" ;
}
}

                     j20mt = "";

                      if ( j20mt .isEmpty()  || RouleteActivity.circumflexions == 5

) {
            
 if (5 > EoFT9
 && EoFT9 <= EoFT9
) 
 {        if (EoFT9 > RouleteActivity.recompacted
) {
                    j20mt = "";

            } else {
                    EoFT9--;
}



}
 else if 
 ( j20mt .contains("stalkoes")  &&  RouleteActivity.asthenospheric .equals("purse") ) 
 {        RouleteActivity.parfield = 0;
} 
 else 
 {        ++EoFT9;
}


            } else {
                    if (RouleteActivity.circumflexions < RouleteActivity.parfield

) {
                    j20mt = "";

            } else {
                    j20mt = "Lucinidae" ;
}



}



}

         
    }

     
    public  void zonally(boolean Z42lE, int yunj3) {
                if (13 <= RouleteActivity.parfield
 || ! RouleteActivity.preacherdom 
) {
            
 if ( RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) 
 {        if ( RouleteActivity.nephropathic 
 && 14 > yunj3
) {
            
 if (14 > yunj3
 && yunj3 <= RouleteActivity.recompacted
) 
 {        if ( RouleteActivity.asthenospheric == null
 ||  RouleteActivity.asthenospheric != null) {
                    if ( RouleteActivity.asthenospheric != null ||  RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) {
                    RouleteActivity.asthenospheric = "musicologically" ;

            } else {
                    ++RouleteActivity.recompacted;
}




                     yunj3 = 4;        


                      --RouleteActivity.circumflexions;
}
}
 else if 
 (RouleteActivity.recompacted != yunj3
) 
 {        if (yunj3 < 4

 || yunj3 <= yunj3
) {
                    Z42lE = true;

                     RouleteActivity.disciplinant =  false;

                      yunj3 += 9;        

}
} 
 else 
 {        Z42lE = false;
}


            } else {
                    if ( RouleteActivity.preacherdom 
 && yunj3 == RouleteActivity.parfield

) {
                    if (RouleteActivity.circumflexions != yunj3
 &&  RouleteActivity.asthenospheric == null
) {
                    RouleteActivity.asthenospheric = "allurement" .toLowerCase();

                     yunj3++;

                      RouleteActivity.asthenospheric = "";
}

                     ++yunj3;

                      RouleteActivity.asthenospheric = "Sindis" ;
}
}



}
 else if 
 (yunj3 > yunj3
) 
 {        if ( Z42lE 
 ||  RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) {
                    if ( RouleteActivity.asthenospheric != null) {
                    if ( RouleteActivity.asthenospheric != null) {
                    RouleteActivity.circumflexions = 7;        


            } else {
                    yunj3 = 13;        

}




            } else {
                    --RouleteActivity.parfield;
}




                     ++yunj3;

                      RouleteActivity.asthenospheric = "";
}
} 
 else 
 {
 if (RouleteActivity.bifrost < 10

 &&  RouleteActivity.asthenospheric != null) 
 {
 if ( RouleteActivity.asthenospheric != null) 
 {        RouleteActivity.nephropathic = true;
}
 else if 
 (yunj3 < yunj3
 &&  RouleteActivity.asthenospheric == null
) 
 {        Z42lE =  false;
} 
 else 
 {        RouleteActivity.disciplinant =  true;
}

}
 else if 
 (RouleteActivity.circumflexions <= 3

) 
 {        yunj3 = 12;
} 
 else 
 {        ++yunj3;
}

}


            } else {
            
 if ( RouleteActivity.asthenospheric == null
) 
 {        if (RouleteActivity.recompacted > yunj3

 || 0 <= yunj3
) {
            
 if ( RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.asthenospheric = "Dev" ;
}
 else if 
 (yunj3 != yunj3

 || yunj3 != 4

) 
 {        RouleteActivity.disciplinant =  false;
} 
 else 
 {        RouleteActivity.nephropathic = ! true;
}


             
 if ( RouleteActivity.disciplinant 
) 
 {        RouleteActivity.parfield++;
}
 else if 
 (yunj3 != yunj3
 &&  RouleteActivity.asthenospheric == null
) 
 {        yunj3 = 2;        

} 
 else 
 {        yunj3 = 2;        

}


                      RouleteActivity.circumflexions = 14;
}
}
 else if 
 ( RouleteActivity.asthenospheric == null
) 
 {        if (yunj3 < 4

) {
            
 if ( Z42lE 
 &&  RouleteActivity.asthenospheric == null
) 
 {        Z42lE = false;
}
 else if 
 ( RouleteActivity.asthenospheric == null
) 
 {        yunj3--;
} 
 else 
 {        RouleteActivity.recompacted += 11;
}


            } else {
                    RouleteActivity.disciplinant = true;
}



} 
 else 
 {        if ( RouleteActivity.nephropathic 
) {
                    yunj3++;

            } else {
                    RouleteActivity.asthenospheric = "";
}



}

}



        if (yunj3 <= RouleteActivity.recompacted
) {
                    if ( RouleteActivity.asthenospheric != null || 11 <= yunj3
) {
            
 if ( RouleteActivity.asthenospheric != null ||  RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric) ) 
 {        if (yunj3 <= yunj3

) {
            
 if ( RouleteActivity.asthenospheric != null) 
 {        if ( Z42lE 
 ||  Z42lE 
) {
                    RouleteActivity.nephropathic = false;

            } else {
                    Z42lE = false;
}



}
 else if 
 (yunj3 <= RouleteActivity.recompacted

) 
 {        yunj3 = 11;
} 
 else 
 {        Z42lE =  true;
}


            } else {
            
 if ( RouleteActivity.asthenospheric == null
 ||  RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.asthenospheric = "";
}
 else if 
 ( RouleteActivity.asthenospheric == null
 && yunj3 == 14

) 
 {        Z42lE = true;
} 
 else 
 {        Z42lE = true;
}

}



}
 else if 
 ( RouleteActivity.asthenospheric .isEmpty()  ||  RouleteActivity.nephropathic 
) 
 {
 if (yunj3 <= yunj3
 && RouleteActivity.bifrost == RouleteActivity.recompacted

) 
 {        RouleteActivity.bifrost = 6;        

}
 else if 
 (RouleteActivity.circumflexions < 0

 &&  RouleteActivity.asthenospheric .equals("erotology") ) 
 {        Z42lE = true;
} 
 else 
 {        RouleteActivity.asthenospheric = "";
}

} 
 else 
 {        if ( Z42lE 
 &&  RouleteActivity.asthenospheric .contains("damocles") ) {
                    Z42lE =  false;

                     RouleteActivity.parfield = 7;        


                      RouleteActivity.nephropathic = false;
}
}


            } else {
                    if ( RouleteActivity.nephropathic 
 ||  RouleteActivity.preacherdom 
) {
            
 if ( RouleteActivity.disciplinant 
 && RouleteActivity.parfield > RouleteActivity.parfield
) 
 {        if ( RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric) ) {
                    Z42lE =  true;

                     yunj3 = 3;        


                      yunj3--;
}
}
 else if 
 (10 <= yunj3
 || ! RouleteActivity.asthenospheric .isEmpty() ) 
 {        RouleteActivity.parfield++;
} 
 else 
 {        RouleteActivity.asthenospheric = "Pompilus" ;
}


             
 if ( Z42lE 
 ||  RouleteActivity.asthenospheric != null) 
 {        yunj3 = 10;
}
 else if 
 ( RouleteActivity.disciplinant 
) 
 {        RouleteActivity.nephropathic =  true;
} 
 else 
 {        RouleteActivity.asthenospheric = "";
}


                      RouleteActivity.circumflexions = 3;
}
}




                     if (RouleteActivity.bifrost == yunj3

 &&  RouleteActivity.asthenospheric == null
) {
            
 if (RouleteActivity.recompacted != RouleteActivity.recompacted

) 
 {        if (! Z42lE 
 ||  RouleteActivity.asthenospheric == null
) {
                    if ( RouleteActivity.asthenospheric == null
 && yunj3 != yunj3
) {
                    RouleteActivity.parfield = 9;

                     Z42lE = ! true;

                      yunj3++;
}

                     yunj3 = 5;        


                      Z42lE = false;
}
}
 else if 
 ( RouleteActivity.asthenospheric == null
 &&  RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric) ) 
 {
 if ( Z42lE 
 &&  RouleteActivity.preacherdom 
) 
 {        ++RouleteActivity.recompacted;
}
 else if 
 (! RouleteActivity.disciplinant 
) 
 {        RouleteActivity.asthenospheric = "unconverted" ;
} 
 else 
 {        RouleteActivity.disciplinant = true;
}

} 
 else 
 {        RouleteActivity.asthenospheric = "";
}


             
 if ( RouleteActivity.asthenospheric == null
 ||  RouleteActivity.asthenospheric == null
) 
 {
 if (11 == RouleteActivity.circumflexions
 &&  RouleteActivity.preacherdom 
) 
 {        Z42lE = false;
}
 else if 
 ( RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric)  ||  RouleteActivity.asthenospheric != null) 
 {        Z42lE = true;
} 
 else 
 {        Z42lE = true;
}

}
 else if 
 (! RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric) ) 
 {        yunj3 = 1;
} 
 else 
 {        --RouleteActivity.recompacted;
}


                      if ( RouleteActivity.disciplinant 
 ||  RouleteActivity.asthenospheric == null
) {
                    RouleteActivity.asthenospheric = "monotropaceae" .toLowerCase();

                     RouleteActivity.asthenospheric = "";

                      RouleteActivity.asthenospheric = "";
}
}

              
 if ( RouleteActivity.asthenospheric != null &&  RouleteActivity.asthenospheric .equals("gardening") ) 
 {        if (RouleteActivity.recompacted != yunj3

) {
                    if (! Z42lE 
) {
                    RouleteActivity.asthenospheric = "";

            } else {
                    RouleteActivity.circumflexions += 8;        

}




                     Z42lE = false;

                      yunj3 = 8;        

}
}
 else if 
 (8 <= yunj3
) 
 {        if ( RouleteActivity.asthenospheric .isEmpty()  || ! RouleteActivity.nephropathic 
) {
                    RouleteActivity.asthenospheric = "navigating" ;

                     Z42lE =  false;

                      RouleteActivity.parfield = 2;
}
} 
 else 
 {        Z42lE = true;
}

}
        RouleteActivity.asthenospheric = "";
        if ( RouleteActivity.asthenospheric == null
 && 1 < RouleteActivity.recompacted
) {
                    Z42lE = false;

                     --yunj3;

                      if (RouleteActivity.recompacted != 4

) {
                    if (yunj3 > yunj3
) {
                    yunj3 = 10;        


            } else {
                    yunj3 = 9;
}




                     if (10 != yunj3
 ||  RouleteActivity.asthenospheric .isEmpty() ) {
                    RouleteActivity.asthenospheric = "";

            } else {
                    RouleteActivity.bifrost = 11;
}




                      RouleteActivity.asthenospheric = "";
}
}
        if (RouleteActivity.parfield <= RouleteActivity.circumflexions

 &&  RouleteActivity.asthenospheric == null
) {
            
 if ( RouleteActivity.asthenospheric == null
) 
 {
 if ( RouleteActivity.asthenospheric != null || ! Z42lE 
) 
 {        if ( RouleteActivity.asthenospheric != null || yunj3 <= RouleteActivity.bifrost

) {
                    if ( RouleteActivity.preacherdom 
 &&  RouleteActivity.asthenospheric == null
) {
            
 if (yunj3 < 11

 && 2 > RouleteActivity.recompacted
) 
 {        RouleteActivity.recompacted++;
}
 else if 
 ( RouleteActivity.asthenospheric == null
) 
 {        yunj3 = 6;
} 
 else 
 {        yunj3 = 12;
}


                     RouleteActivity.asthenospheric = "";

                      yunj3--;
}

            } else {
                    if (7 == RouleteActivity.recompacted
) {
                    Z42lE = false;

            } else {
                    RouleteActivity.disciplinant =  true;
}



}



}
 else if 
 ( RouleteActivity.asthenospheric .contains("misadventure")  ||  RouleteActivity.asthenospheric != null) 
 {        RouleteActivity.asthenospheric = "throwings" ;
} 
 else 
 {        if (yunj3 <= RouleteActivity.parfield
 &&  RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric) ) {
                    Z42lE = true;

            } else {
                    RouleteActivity.parfield -= 6;
}



}

}
 else if 
 ( RouleteActivity.nephropathic 
) 
 {        if ( RouleteActivity.asthenospheric != null && RouleteActivity.recompacted < RouleteActivity.parfield
) {
                    if ( RouleteActivity.asthenospheric == null
) {
            
 if ( RouleteActivity.asthenospheric .isEmpty()  ||  RouleteActivity.preacherdom 
) 
 {        RouleteActivity.disciplinant =  true;
}
 else if 
 (yunj3 == RouleteActivity.parfield
 || 12 != yunj3
) 
 {        RouleteActivity.disciplinant = true;
} 
 else 
 {        Z42lE = false;
}


                     Z42lE = true;

                      RouleteActivity.preacherdom = false;
}

                     if ( Z42lE 
) {
                    RouleteActivity.nephropathic = ! false;

            } else {
                    ++yunj3;
}




                      RouleteActivity.asthenospheric = "captivative" ;
}
} 
 else 
 {
 if ( RouleteActivity.asthenospheric .isEmpty()  || yunj3 <= RouleteActivity.parfield
) 
 {        if (! RouleteActivity.preacherdom 
 ||  RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) {
                    RouleteActivity.asthenospheric = "";

            } else {
                    RouleteActivity.asthenospheric = "hypsometries" ;
}



}
 else if 
 ( RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric)  &&  RouleteActivity.asthenospheric != null) 
 {        RouleteActivity.preacherdom =  true;
} 
 else 
 {        RouleteActivity.asthenospheric = "";
}

}


                     if ( RouleteActivity.asthenospheric == null
) {
            
 if ( RouleteActivity.asthenospheric != null) 
 {
 if (! RouleteActivity.asthenospheric .contains("borrowers")  ||  RouleteActivity.asthenospheric .contains("shriekings") ) 
 {
 if (5 <= yunj3
 &&  RouleteActivity.asthenospheric .isEmpty() ) 
 {        Z42lE = true;
}
 else if 
 (RouleteActivity.circumflexions == RouleteActivity.bifrost
) 
 {        --yunj3;
} 
 else 
 {        RouleteActivity.asthenospheric = "forerunnership" ;
}

}
 else if 
 (! RouleteActivity.asthenospheric .equals(RouleteActivity.asthenospheric)  &&  RouleteActivity.asthenospheric != null) 
 {        yunj3 = 3;        

} 
 else 
 {        yunj3++;
}

}
 else if 
 ( RouleteActivity.asthenospheric .isEmpty() ) 
 {
 if ( RouleteActivity.asthenospheric == null
 && 9 != RouleteActivity.parfield
) 
 {        yunj3 = 5;
}
 else if 
 ( RouleteActivity.disciplinant 
) 
 {        yunj3--;
} 
 else 
 {        RouleteActivity.asthenospheric = "";
}

} 
 else 
 {        ++yunj3;
}


             
 if ( RouleteActivity.asthenospheric == null
 &&  RouleteActivity.asthenospheric != null) 
 {        if (RouleteActivity.recompacted != yunj3

) {
                    RouleteActivity.recompacted++;

                     Z42lE = ! true;

                      RouleteActivity.asthenospheric = "unholiday" ;
}
}
 else if 
 ( RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) 
 {        Z42lE =  true;
} 
 else 
 {        yunj3 = 9;
}


                      if ( RouleteActivity.asthenospheric != null) {
                    RouleteActivity.asthenospheric = "";

                     RouleteActivity.asthenospheric = "administratively" ;

                      ++yunj3;
}
}

                      if (RouleteActivity.circumflexions != 4

 || yunj3 > RouleteActivity.recompacted
) {
                    if (RouleteActivity.parfield != RouleteActivity.bifrost
 && yunj3 < 0

) {
            
 if (5 == RouleteActivity.circumflexions
 && 14 <= yunj3
) 
 {        RouleteActivity.nephropathic = true;
}
 else if 
 ( Z42lE 
) 
 {        RouleteActivity.recompacted = 9;
} 
 else 
 {        RouleteActivity.asthenospheric = "";
}


            } else {
                    RouleteActivity.disciplinant = true;
}




                     if (RouleteActivity.recompacted != 12

 || RouleteActivity.parfield > yunj3
) {
                    yunj3 += 10;

            } else {
                    RouleteActivity.circumflexions = 5;
}




                      ++RouleteActivity.circumflexions;
}
}

 if ( RouleteActivity.asthenospheric == null
 &&  RouleteActivity.asthenospheric == null
) 
 {        if ( RouleteActivity.asthenospheric != null ||  RouleteActivity.asthenospheric == null
) {
                    if ( RouleteActivity.asthenospheric != null) {
                    if ( RouleteActivity.preacherdom 
 && ! Z42lE 
) {
                    if ( RouleteActivity.asthenospheric != null) {
            
 if ( RouleteActivity.asthenospheric != null) 
 {        yunj3 = 13;
}
 else if 
 (! RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric)  ||  RouleteActivity.asthenospheric == null
) 
 {        yunj3 = 12;        

} 
 else 
 {        yunj3 = 2;
}


            } else {
                    yunj3 = 11;        

}




             
 if (5 != RouleteActivity.bifrost
 &&  RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) 
 {        RouleteActivity.nephropathic = true;
}
 else if 
 (yunj3 <= 14

 &&  RouleteActivity.asthenospheric != null) 
 {        yunj3 = 12;
} 
 else 
 {        Z42lE =  false;
}


                      RouleteActivity.asthenospheric = "";
}

             
 if (yunj3 != 7

 || yunj3 > yunj3

) 
 {
 if ( Z42lE 
) 
 {        RouleteActivity.asthenospheric = "bovids" ;
}
 else if 
 ( Z42lE 
) 
 {        ++yunj3;
} 
 else 
 {        ++yunj3;
}

}
 else if 
 ( Z42lE 
 ||  RouleteActivity.preacherdom 
) 
 {        RouleteActivity.asthenospheric = "slaveholders" ;
} 
 else 
 {        yunj3 = 11;        

}


              
 if (yunj3 == 2

 || ! RouleteActivity.asthenospheric .equals("Lepidodendraceae") ) 
 {        RouleteActivity.parfield++;
}
 else if 
 ( RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.recompacted = 0;
} 
 else 
 {        RouleteActivity.asthenospheric = "";
}

}

                     RouleteActivity.circumflexions = 1;        


                      if ( RouleteActivity.asthenospheric .isEmpty() ) {
                    if (yunj3 < RouleteActivity.circumflexions

) {
                    Z42lE = false;

            } else {
                    RouleteActivity.asthenospheric = "";
}




            } else {
                    RouleteActivity.asthenospheric = "";
}



}
}
 else if 
 ( RouleteActivity.asthenospheric != null || 10 > RouleteActivity.parfield
) 
 {        if ( RouleteActivity.asthenospheric == null
 &&  RouleteActivity.asthenospheric == null
) {
                    if ( RouleteActivity.asthenospheric != null && RouleteActivity.recompacted < 9

) {
                    if ( RouleteActivity.asthenospheric != null ||  Z42lE 
) {
                    if ( RouleteActivity.asthenospheric == null
 ||  RouleteActivity.nephropathic 
) {
                    RouleteActivity.asthenospheric = "";

            } else {
                    RouleteActivity.asthenospheric = "";
}




            } else {
                    ++yunj3;
}




             
 if (3 <= yunj3
) 
 {        RouleteActivity.asthenospheric = "";
}
 else if 
 ( Z42lE 
 || yunj3 <= RouleteActivity.circumflexions

) 
 {        RouleteActivity.preacherdom = false;
} 
 else 
 {        RouleteActivity.parfield = 11;
}


                      RouleteActivity.asthenospheric = "";
}

            } else {
                    if ( RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric)  || ! RouleteActivity.asthenospheric .isEmpty() ) {
            
 if ( RouleteActivity.asthenospheric == null
 &&  RouleteActivity.asthenospheric != null) 
 {        yunj3 += 13;
}
 else if 
 ( RouleteActivity.nephropathic 
) 
 {        RouleteActivity.asthenospheric = "";
} 
 else 
 {        yunj3--;
}


            } else {
                    RouleteActivity.nephropathic = true;
}



}



} 
 else 
 {
 if (RouleteActivity.circumflexions <= 3

 &&  RouleteActivity.preacherdom 
) 
 {
 if (12 == yunj3
 &&  RouleteActivity.preacherdom 
) 
 {
 if ( RouleteActivity.asthenospheric .intern().contains(RouleteActivity.asthenospheric)  &&  RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.asthenospheric = "";
}
 else if 
 ( RouleteActivity.asthenospheric != null) 
 {        RouleteActivity.asthenospheric = "humidifies" ;
} 
 else 
 {        RouleteActivity.recompacted++;
}

}
 else if 
 ( RouleteActivity.asthenospheric == null
) 
 {        RouleteActivity.asthenospheric = "";
} 
 else 
 {        RouleteActivity.bifrost = 3;        

}

}
 else if 
 ( RouleteActivity.asthenospheric != null) 
 {        if ( RouleteActivity.asthenospheric == null
 &&  RouleteActivity.asthenospheric .contains(RouleteActivity.asthenospheric) ) {
                    RouleteActivity.asthenospheric = "";

                     RouleteActivity.recompacted += 8;

                      RouleteActivity.bifrost = 7;        

}
} 
 else 
 {        Z42lE = true;
}

}


         
    }

     }