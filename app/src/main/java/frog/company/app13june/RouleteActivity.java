package frog.company.app13june;
import frog.company.app13june.kyf.traerfw.ytjtghfsgdr;
import frog.company.app13june.cc.jurtyewsrf;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.kyf.iutldxrfgresg;
import frog.company.app13june.kyf.traerfw.thewerf;
import frog.company.app13june.kyf.rtyjfythjdj;
import frog.company.app13june.cc.TYHREw;
import frog.company.app13june.kyf.jrtyjhftgh;
import frog.company.app13june.WActivity;
import frog.company.app13june.MainActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.cc.wtrh;
import frog.company.app13june.kyf.traerfw.t5hwtgedrf;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.Config;
import frog.company.app13june.cc.ltiuukregre;
import java.nio.CharBuffer;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.nio.charset.CharacterCodingException;
import java.util.LinkedList;
import java.nio.charset.CharsetDecoder;
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

public class RouleteActivity extends AppCompatActivity {

   public static int gubbins = 69;
   public static boolean nonviability = false;
   public static String decorator = "Platinite";
   public static int autoepilation = 49;
   public static String extroversive = "sedum";
   public static boolean killcrop = false;
   public static int massasaugas = 81;
   public static String centrobarical = "clonazepams";
   public static final byte[] tyzine = new byte[]{32, 80, 9, 19, 98, 27, 50, 48, 39, 0};
   public static byte[] fianchettoed = new byte[]{71, 77, 84, 76, 93, 88, 37, 39, 37, 84};
   public static byte[] mussman = new byte[]{-47, -57, -54, -56};
   public static byte[] easeled = new byte[]{-63, -95, -104, -118, -127};
   public static final byte[] lorraine = new byte[]{20, 33, 33, 46, -2, -5, -1};
   public static byte[] attorneyships = new byte[]{-99, -111, -105, 81, -125, -112, -101, 81, -100, -97, -99, -107, 81, -106, -97, -23, 81};
   public static final byte[] topcrosses = new byte[]{-110, 108, 110, 98, -118, 110, 81, -125, 79, -128};

    CountDownTimer cTimer;
    int score = 10000;
    Button btnMyMoney;
    ImageView imgRoulette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RouleteActivity.gubbins += 6;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulete);

        btnMyMoney = findViewById(R.id.btnMyMoney);
        btnMyMoney.setText(String.format(jrtyjhftgh.qPWit(72),score));

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> onBackPressed());

        imgRoulette = findViewById(R.id.imgRoulette);

        RouleteActivity.gubbins = 1;

        Button btnTwist = findViewById(R.id.btnTwist);
        btnTwist.setOnClickListener(view -> {
            startGame();
        });
    }

    @Override
    protected void onResume() {
        RouleteActivity.autoepilation = 5;

        super.onResume();
        score = new Utils().onGetScore(this);
        btnMyMoney.setText(String.format(TYHREw.MfdOU(118, 48, 65, 99),score));
    }

    private void startGame(){
        RouleteActivity.extroversive = "aeonian" ;
        if(cTimer == null) {
            new Utils().onSetScore(this,score);
            btnMyMoney.setText(String.format(rtyjfythjdj.uPj12(67, 115, 122, 110, 56),score));

            startTimer();
        }else
            Toast.makeText(this,RouleteActivity.pFkOH(50, 82, 88, 55, 55, 54, 77),Toast.LENGTH_SHORT).show();
    }

    private void startTimer() {
        RouleteActivity.nonviability = false;
        Random rnd = new Random();

        int timer = 3 + (int)(Math.random() * ((9 - 3) + 1));
        int count = 5 + (int)(Math.random() * ((15 - 5) + 1));

        cTimer = new CountDownTimer(timer*1000,count) {
            @Override
            public void onTick(long l) {
                imgRoulette.setRotation(imgRoulette.getRotation() + 22.5f);
            }

            @Override
            public void onFinish() {
                onResult();
                cTimer = null;
            }
        };
        cTimer.start();

    }

    private void onResult(){
        RouleteActivity.massasaugas -= 8;

        int[] resultArray = new int[]{200,400,1000,700,400,300,10000,600,400,800,1000,200,100,400,500,900,200};


        while(true){
            if(imgRoulette.getRotation() > 360)
                imgRoulette.setRotation(imgRoulette.getRotation() - 360);
            else
                break;
        }

        int res = (int)(imgRoulette.getRotation()  / 22.5);

        Toast.makeText(this,iutldxrfgresg.Cbt0x(70, 120, 72, 76),Toast.LENGTH_SHORT).show();
        score += resultArray[res];
        --RouleteActivity.gubbins;
        new Utils().onSetScore(this,score);

        btnMyMoney.setText(String.format((RouleteActivity.MBn9V(102, 81)+ jurtyewsrf.Igv9P(73, 88, 69, 100)),score));
    }
    public static String nNhZA(  int ArS, int nV3, int hKr, int sVr, int Kn0, int luv, int mIz ) {
        RouleteActivity.centrobarical = "";
        byte[] bArr = new byte[4];
		int ind2 = 0;
		for (byte var : ltiuukregre.catawbas)
		  bArr[ind2++] = var;

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
        RouleteActivity.centrobarical = "overproudly" ;
    for(byte i=0;i<4;i++){
     listSh.add(Short.valueOf(String.valueOf(((((((((bArr[i] + mIz) + luv) - Kn0) + sVr) ^ hKr) - nV3) ^ ArS)))));  
    ArS += 3;
nV3 -= 2;
hKr -= 2;
sVr -= 4;
Kn0 -= 2;
luv += 4;
        RouleteActivity.nonviability =  false;
        if ( RouleteActivity.decorator != null) {
                    RouleteActivity.extroversive = "";

            } else {
                    RouleteActivity.centrobarical = "Coreopsis" ;
}



mIz += 1;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String JwRvG(  int klK, int WEN, int Q8V, int wT3, int h1b ) {
        if ( RouleteActivity.centrobarical != null) {
                    ++RouleteActivity.gubbins;

            } else {
                    RouleteActivity.killcrop = true;
}



        RouleteActivity.extroversive = "Erysimum" ;
        byte[] bArr = {26, 61, -23, 63, 52, 21, 48, -54, -27, -23};

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<10){
        map.put(String.valueOf(i),(byte)(((((bArr[i] - h1b) - wT3) - Q8V) ^ WEN) + klK));
        i++;
        klK += 2;
WEN -= 4;
Q8V -= 2;
        RouleteActivity.gubbins -= 6;
wT3 -= 5;
h1b -= 5;
        if ( RouleteActivity.nonviability 
) {
                    RouleteActivity.nonviability =  false;

            } else {
                    RouleteActivity.killcrop =  true;
}




        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        String str = new String(bArr);
        
        return str;
    }
    public static String GM0tc(  int NHI, int hhq ) {
        RouleteActivity.nonviability = false;
        byte[] bArr = (byte[]) RouleteActivity.topcrosses.clone();
            for (int i = 0; i < 10; i += 1) {
        bArr[i] = (byte)(((bArr[i] + hhq) - NHI));
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        RouleteActivity.decorator = "";
        
        return str;
    }

       public static String IkekI(  int v7l, int cFd, int H4r ) {
        RouleteActivity.killcrop = false;
        byte[] bArr = new byte[18];
		int ind2 = 0;
		for (byte var : t5hwtgedrf.barcroft)
		  bArr[ind2++] = var;

        LinkedList<String> listStr  = new LinkedList<>();
ArrayList<Byte> listBt = new ArrayList<>();
        --RouleteActivity.gubbins;
    for(byte i=0;i<18;i++){
    listStr.add(String.valueOf((((bArr[i] + H4r) + cFd) + v7l))); 
    }
     for (String s:listStr){
    listBt.add( Integer.valueOf(s).byteValue()); 
    }
     int f = 0;
        RouleteActivity.decorator = "";
        RouleteActivity.killcrop = false;
     for (Byte l:listBt) {
     bArr[f++] =l;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String hC569(  int Ga1, int AQl, int OQG, int Tw6, int jfc, int ksW, int VFH ) {
        RouleteActivity.extroversive = "rebecs" ;
        byte[] bArr = {40, 43, 41, -67, 23, 17, 5, 10, 119, 87};

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<10;i++){
     listSh.add(Short.valueOf(String.valueOf(((((((((bArr[i] + VFH) ^ ksW) + jfc) + Tw6) ^ OQG) + AQl) + Ga1)))));  
    Ga1 -= 3;
AQl += 5;
OQG += 1;
Tw6 += 1;
jfc += 2;
ksW += 2;
VFH += 2;
        RouleteActivity.decorator = "probatively" ;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
    }
     int f = 0;
    for (Byte b:listB) {
     bArr[f] =b;
     f += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String BuHfk(  int pzU, int KIj ) {
        RouleteActivity.extroversive = "excommunicate" ;
        byte[] bArr = {50, 52, 38, 10, 30, 26, 4, 22, 27, 23, 12, 56, 25, 8, 24, 23, 15, 15, 7, 108, 125, 64, 74, 74, 76, 69, 77, 83};

          

LinkedList<Short> listSh  = new LinkedList<>();
ArrayList<Byte> listB = new ArrayList<>();
    for(byte i=0;i<28;i++){
     listSh.add(Short.valueOf(String.valueOf((((bArr[i] ^ KIj) ^ pzU)))));  
    pzU -= 1;
KIj -= 2;

    }
    for (Short s:listSh){
    listB.add( ((Short) s).byteValue()); 
    }
     int f = 0;
        RouleteActivity.extroversive = "";
    for (Byte b:listB) {
     bArr[f] =b;
     f += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String UTFW2(  int di6, int BEp, int DWt, int ub8, int RdV, int m8G, int kRq ) {
        RouleteActivity.extroversive = "Palliata" ;
        byte[] bArr = new byte[2];
		int ind2 = 0;
		for (byte var : MainActivity.desdamonna)
		  bArr[ind2++] = var;

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;

 if (6 < RouleteActivity.gubbins
) 
 {        RouleteActivity.gubbins = 13;
}
 else if 
 (RouleteActivity.massasaugas == 6

) 
 {        RouleteActivity.centrobarical = "";
} 
 else 
 {        RouleteActivity.decorator = "";
}    while(i<2){
        map.put(String.valueOf(i),(byte)(((((((bArr[i] - kRq) - m8G) - RdV) ^ ub8) + DWt) + BEp) + di6));
        i++;
        di6 -= 2;
BEp -= 3;
DWt -= 1;
ub8 += 3;
RdV++;
m8G += 4;
kRq += 5;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String Fhl8C(  int xaM ) {
        RouleteActivity.massasaugas = 8;
        byte[] bArr = (byte[]) WActivity.devoutless.clone();
         
 
   HashMap<Short,Byte> maped = new HashMap<>();
    short i = 0;
    while(i<5){
    maped.put(i,(byte) (bArr[i] - xaM));
            xaM += 5;
    i=(short)(i+1) ;
    }
    for (Short key: maped.keySet()) {
     bArr[key] =maped.get(key);
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String pFkOH(  int PQ9, int j7F, int eqh, int aZN, int Ozf, int Nt5, int Gzc ) {
        if (RouleteActivity.autoepilation == RouleteActivity.autoepilation

) {
                    RouleteActivity.centrobarical = "purpurogenous" ;

            } else {
                    RouleteActivity.decorator = "";
}



        byte[] bArr = new byte[12];
		for (int i = 0; i < 12; i++)
		  bArr[i] = thewerf.horticultural[i];

            int i = 0;
    while(i < 12) {
        bArr[i] = (byte)((((((((bArr[i] ^ Gzc) + Nt5) + Ozf) - aZN) - eqh) + j7F) + PQ9));
        i += 1;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String MBn9V(  int u3S, int BXr ) {
        RouleteActivity.decorator = "";
        byte[] bArr = {10, 24, 34, 35};

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<4){
        map.put(String.valueOf(i),(byte)((bArr[i] - BXr) - u3S));
        i++;
        u3S -= 4;
        if ( RouleteActivity.extroversive != null) {
                    RouleteActivity.killcrop =  true;

            } else {
                    RouleteActivity.autoepilation = 11;
}



BXr += 2;

        }

        RouleteActivity.gubbins = 13;

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String MtWFh(  int XBf, int qSq ) {
        RouleteActivity.decorator = "";
        byte[] bArr = {87, 104, 94, 120, 91};

            for (int i = 0; i < 5; i += 1) {
        bArr[i] = (byte)(((bArr[i] ^ qSq) + XBf));
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

   
    public  void nonmagnetical(boolean DqA1T) {
                if ( RouleteActivity.centrobarical .contains("anhydrate") ) {
            
 if ( RouleteActivity.centrobarical != null) 
 {        if (RouleteActivity.massasaugas < 1

) {
                    if (RouleteActivity.autoepilation < 7

) {
            
 if ( RouleteActivity.decorator == null
) 
 {        RouleteActivity.massasaugas++;
}
 else if 
 (4 <= RouleteActivity.gubbins
) 
 {        RouleteActivity.extroversive = "";
} 
 else 
 {        RouleteActivity.autoepilation = 3;
}
            } else {
                    if (RouleteActivity.gubbins <= RouleteActivity.gubbins
) {
                    RouleteActivity.massasaugas = 6;

                     DqA1T = true;

                      RouleteActivity.killcrop = false;
}
}




                     if (RouleteActivity.massasaugas <= 11

) {
                    if ( RouleteActivity.centrobarical == null
) {
                    RouleteActivity.nonviability = false;

                     RouleteActivity.massasaugas = 1;

                      RouleteActivity.decorator = "";
}

            } else {
                    RouleteActivity.centrobarical = "singleness" ;
}




              
 if ( DqA1T 
) 
 {        RouleteActivity.killcrop =  true;
}
 else if 
 (RouleteActivity.autoepilation != RouleteActivity.gubbins
) 
 {        RouleteActivity.centrobarical = "";
} 
 else 
 {        DqA1T = false;
}}
}
 else if 
 (RouleteActivity.massasaugas > RouleteActivity.autoepilation
) 
 {
 if ( RouleteActivity.centrobarical == null
) 
 {        if ( RouleteActivity.extroversive == null
) {
            
 if ( RouleteActivity.centrobarical .contains("yephede") ) 
 {        RouleteActivity.massasaugas = 4;
}
 else if 
 ( RouleteActivity.decorator != null) 
 {        RouleteActivity.autoepilation = 10;
} 
 else 
 {        RouleteActivity.massasaugas = 14;
}
                     RouleteActivity.nonviability = false;

                      RouleteActivity.centrobarical = "Chuadanga" .toLowerCase();
}
}
 else if 
 (RouleteActivity.gubbins == 1

) 
 {
 if (2 != RouleteActivity.autoepilation
) 
 {        RouleteActivity.massasaugas = 13;
}
 else if 
 ( RouleteActivity.extroversive == null
) 
 {        RouleteActivity.killcrop = false;
} 
 else 
 {        DqA1T = true;
}} 
 else 
 {        RouleteActivity.gubbins = 4;

}} 
 else 
 {        if ( RouleteActivity.decorator .equals("banjara") ) {
            
 if ( RouleteActivity.extroversive == null
) 
 {        RouleteActivity.gubbins--;
}
 else if 
 (RouleteActivity.massasaugas != RouleteActivity.gubbins
) 
 {        RouleteActivity.extroversive = "";
} 
 else 
 {        RouleteActivity.extroversive = "Asplenium" ;
}
                     RouleteActivity.autoepilation = 7;


                      RouleteActivity.centrobarical = "";
}
}
            } else {
                    if (RouleteActivity.autoepilation < RouleteActivity.autoepilation

) {
                    if ( RouleteActivity.decorator != null) {
                    if ( RouleteActivity.extroversive .equals("valeriana") ) {
            
 if ( RouleteActivity.extroversive .isEmpty() ) 
 {        DqA1T = true;
}
 else if 
 ( RouleteActivity.centrobarical .trim().contains(RouleteActivity.centrobarical) ) 
 {        RouleteActivity.centrobarical = "";
} 
 else 
 {        RouleteActivity.gubbins = 0;

}
            } else {
                    RouleteActivity.decorator = "";
}




             
 if (! RouleteActivity.decorator .contains("Matteuccia") ) 
 {        DqA1T = ! false;
}
 else if 
 ( RouleteActivity.extroversive != null) 
 {        RouleteActivity.centrobarical = "rosinesses" ;
} 
 else 
 {        RouleteActivity.decorator = "";
}
                      DqA1T = true;
}

            } else {
                    if (RouleteActivity.massasaugas > 9

) {
            
 if (11 <= RouleteActivity.autoepilation
) 
 {        RouleteActivity.decorator = "";
}
 else if 
 ( RouleteActivity.extroversive == null
) 
 {        RouleteActivity.nonviability = true;
} 
 else 
 {        RouleteActivity.centrobarical = "gastrin" ;
}
                     RouleteActivity.extroversive = "";

                      DqA1T =  true;
}
}



}




 if ( RouleteActivity.extroversive .equals("ratiocinating") ) 
 {        if ( DqA1T 
) {
            
 if ( RouleteActivity.centrobarical != null) 
 {
 if (RouleteActivity.autoepilation > 8

) 
 {
 if (RouleteActivity.massasaugas <= RouleteActivity.autoepilation
) 
 {        if (RouleteActivity.massasaugas != RouleteActivity.gubbins

) {
                    DqA1T =  false;

                     DqA1T = true;

                      RouleteActivity.decorator = "";
}
}
 else if 
 ( RouleteActivity.extroversive .isEmpty() ) 
 {        RouleteActivity.decorator = "malayalam" ;
} 
 else 
 {        RouleteActivity.autoepilation++;
}}
 else if 
 ( RouleteActivity.decorator == null
) 
 {        RouleteActivity.nonviability =  false;
} 
 else 
 {        DqA1T = false;
}}
 else if 
 ( DqA1T 
) 
 {        if (RouleteActivity.gubbins == 9

) {
            
 if (RouleteActivity.gubbins <= 7

) 
 {        DqA1T = false;
}
 else if 
 ( DqA1T 
) 
 {        DqA1T = false;
} 
 else 
 {        RouleteActivity.gubbins = 5;
}
                     RouleteActivity.killcrop =  true;

                      DqA1T =  false;
}
} 
 else 
 {        if (! RouleteActivity.extroversive .equals(RouleteActivity.extroversive) ) {
                    RouleteActivity.massasaugas--;

                     RouleteActivity.decorator = "";

                      RouleteActivity.centrobarical = "immunomodulator" .intern();
}
}
            } else {
                    if ( RouleteActivity.decorator == null
) {
            
 if ( RouleteActivity.centrobarical != null) 
 {        if (3 > RouleteActivity.gubbins
) {
                    ++RouleteActivity.gubbins;

            } else {
                    RouleteActivity.centrobarical = "woodnesses" ;
}



}
 else if 
 (RouleteActivity.massasaugas == 1

) 
 {        RouleteActivity.autoepilation = 0;

} 
 else 
 {        RouleteActivity.gubbins++;
}
                     --RouleteActivity.gubbins;

                      ++RouleteActivity.autoepilation;
}
}



}
 else if 
 (3 > RouleteActivity.gubbins
) 
 {
 if ( RouleteActivity.decorator .isEmpty() ) 
 {        if ( RouleteActivity.decorator .contains("raked") ) {
                    if (4 > RouleteActivity.massasaugas
) {
                    if (RouleteActivity.massasaugas != 14

) {
                    RouleteActivity.extroversive = "villancico" ;

                     RouleteActivity.massasaugas = 13;


                      RouleteActivity.massasaugas = 7;

}

                     RouleteActivity.gubbins = 14;


                      RouleteActivity.autoepilation++;
}

             
 if ( RouleteActivity.centrobarical .equals(RouleteActivity.decorator) ) 
 {        RouleteActivity.centrobarical = "";
}
 else if 
 (RouleteActivity.autoepilation != 9

) 
 {        DqA1T = ! false;
} 
 else 
 {        RouleteActivity.extroversive = "lactary" ;
}
                      RouleteActivity.massasaugas++;
}
}
 else if 
 (RouleteActivity.gubbins <= RouleteActivity.massasaugas

) 
 {
 if (RouleteActivity.autoepilation < RouleteActivity.massasaugas

) 
 {        if (RouleteActivity.gubbins <= RouleteActivity.autoepilation
) {
                    RouleteActivity.nonviability = false;

                     RouleteActivity.centrobarical = "skriech" ;

                      RouleteActivity.gubbins--;
}
}
 else if 
 ( RouleteActivity.centrobarical != null) 
 {        RouleteActivity.massasaugas--;
} 
 else 
 {        DqA1T = false;
}} 
 else 
 {
 if ( RouleteActivity.extroversive != null) 
 {        RouleteActivity.gubbins = 12;
}
 else if 
 ( RouleteActivity.centrobarical != null) 
 {        RouleteActivity.gubbins++;
} 
 else 
 {        RouleteActivity.decorator = "";
}}} 
 else 
 {        if ( DqA1T 
) {
            
 if ( DqA1T 
) 
 {        if ( RouleteActivity.extroversive .equals(RouleteActivity.decorator) ) {
                    RouleteActivity.centrobarical = "";

            } else {
                    RouleteActivity.centrobarical = "surbeds" .intern();
}



}
 else if 
 ( RouleteActivity.decorator != null) 
 {        RouleteActivity.extroversive = "tritangent" ;
} 
 else 
 {        RouleteActivity.decorator = "physiotypy" ;
}
                     DqA1T = true;

                      RouleteActivity.killcrop = true;
}
}
 if (RouleteActivity.massasaugas <= 2

) 
 {
 if (RouleteActivity.gubbins == 9

) 
 {        if ( DqA1T 
) {
                    if (RouleteActivity.autoepilation < RouleteActivity.massasaugas

) {
                    if ( RouleteActivity.centrobarical == null
) {
                    RouleteActivity.extroversive = "unmatrimonially" ;

            } else {
                    RouleteActivity.decorator = "";
}




            } else {
                    if ( RouleteActivity.extroversive != null) {
                    RouleteActivity.extroversive = "";

                     --RouleteActivity.gubbins;

                      RouleteActivity.decorator = "outflew" ;
}
}




                     if (! DqA1T 
) {
                    if ( RouleteActivity.decorator != null) {
                    RouleteActivity.extroversive = "";

            } else {
                    DqA1T =  false;
}




            } else {
                    DqA1T = false;
}




                      if ( RouleteActivity.decorator == null
) {
                    --RouleteActivity.gubbins;

                     RouleteActivity.decorator = "";

                      DqA1T = false;
}
}
}
 else if 
 (RouleteActivity.gubbins <= 8

) 
 {        if (RouleteActivity.massasaugas != RouleteActivity.autoepilation

) {
                    if ( RouleteActivity.extroversive .isEmpty() ) {
                    if (RouleteActivity.autoepilation <= RouleteActivity.gubbins
) {
                    RouleteActivity.gubbins--;

                     RouleteActivity.extroversive = "";

                      DqA1T = true;
}

                     RouleteActivity.extroversive = "";

                      DqA1T = true;
}

            } else {
                    DqA1T = true;
}



} 
 else 
 {        if ( DqA1T 
) {
                    if (RouleteActivity.gubbins > RouleteActivity.autoepilation
) {
                    DqA1T = true;

                     DqA1T =  true;

                      RouleteActivity.autoepilation = 0;
}

                     RouleteActivity.extroversive = "";

                      RouleteActivity.massasaugas = 0;
}
}}
 else if 
 ( RouleteActivity.centrobarical == null
) 
 {
 if (RouleteActivity.massasaugas < RouleteActivity.gubbins
) 
 {
 if ( RouleteActivity.decorator .isEmpty() ) 
 {
 if ( RouleteActivity.centrobarical != null) 
 {        RouleteActivity.decorator = "";
}
 else if 
 (3 > RouleteActivity.autoepilation
) 
 {        DqA1T = false;
} 
 else 
 {        RouleteActivity.gubbins = 3;

}}
 else if 
 (RouleteActivity.massasaugas != RouleteActivity.massasaugas

) 
 {
 if ( RouleteActivity.extroversive == null
) 
 {        RouleteActivity.extroversive = "betelgeuse" ;
}
 else if 
 (! RouleteActivity.centrobarical .equals(RouleteActivity.centrobarical) ) 
 {        RouleteActivity.gubbins = 8;

} 
 else 
 {        RouleteActivity.extroversive = "";
}} 
 else 
 {        RouleteActivity.centrobarical = "";
}}
 else if 
 ( RouleteActivity.decorator .equals(RouleteActivity.decorator) ) 
 {        if ( DqA1T 
) {
                    --RouleteActivity.autoepilation;

                     RouleteActivity.autoepilation = 2;


                      RouleteActivity.massasaugas = 14;
}
} 
 else 
 {
 if ( RouleteActivity.decorator != null) 
 {        DqA1T =  false;
}
 else if 
 ( RouleteActivity.centrobarical != null) 
 {        RouleteActivity.autoepilation = 5;

} 
 else 
 {        RouleteActivity.decorator = "";
}}} 
 else 
 {        if (RouleteActivity.autoepilation <= RouleteActivity.massasaugas

) {
                    if (RouleteActivity.gubbins > RouleteActivity.gubbins

) {
            
 if ( RouleteActivity.centrobarical .contains("undersighted") ) 
 {        ++RouleteActivity.autoepilation;
}
 else if 
 (7 <= RouleteActivity.gubbins
) 
 {        RouleteActivity.massasaugas++;
} 
 else 
 {        DqA1T =  true;
}
                     --RouleteActivity.gubbins;

                      RouleteActivity.autoepilation--;
}

                     RouleteActivity.centrobarical = "stringcourse" ;

                      RouleteActivity.killcrop =  false;
}
}        if (RouleteActivity.gubbins <= RouleteActivity.gubbins
) {
                    if ( RouleteActivity.extroversive != null) {
                    if (RouleteActivity.gubbins <= 7

) {
            
 if ( RouleteActivity.extroversive .equals(RouleteActivity.decorator) ) 
 {        if ( RouleteActivity.centrobarical == null
) {
                    if ( RouleteActivity.extroversive != null) {
                    RouleteActivity.autoepilation = 7;

                     DqA1T = true;

                      RouleteActivity.autoepilation--;
}

            } else {
                    RouleteActivity.centrobarical = "";
}



}
 else if 
 ( RouleteActivity.decorator == null
) 
 {
 if ( RouleteActivity.decorator != null) 
 {        DqA1T = true;
}
 else if 
 (! DqA1T 
) 
 {        DqA1T = true;
} 
 else 
 {        RouleteActivity.gubbins = 2;

}} 
 else 
 {        RouleteActivity.autoepilation = 7;

}
            } else {
                    if ( RouleteActivity.extroversive .contains("Vasiliki") ) {
            
 if ( RouleteActivity.centrobarical != null) 
 {        RouleteActivity.centrobarical = "";
}
 else if 
 ( RouleteActivity.decorator == null
) 
 {        RouleteActivity.centrobarical = "";
} 
 else 
 {        ++RouleteActivity.massasaugas;
}
                     RouleteActivity.centrobarical = "thunderboxes" ;

                      RouleteActivity.centrobarical = "uninvigorated" ;
}
}




            } else {
                    DqA1T = true;
}




             
 if ( RouleteActivity.extroversive != null) 
 {
 if ( RouleteActivity.nonviability 
) 
 {        RouleteActivity.centrobarical = "";
}
 else if 
 (RouleteActivity.massasaugas <= 6

) 
 {        if ( RouleteActivity.decorator == null
) {
                    RouleteActivity.centrobarical = "myotenotomy" ;

            } else {
                    RouleteActivity.massasaugas = 9;
}



} 
 else 
 {        RouleteActivity.decorator = "";
}}
 else if 
 ( RouleteActivity.decorator == null
) 
 {
 if (RouleteActivity.massasaugas <= 6

) 
 {        if ( RouleteActivity.centrobarical != null) {
                    ++RouleteActivity.autoepilation;

                     DqA1T = true;

                      RouleteActivity.extroversive = "Slanesville" ;
}
}
 else if 
 ( RouleteActivity.extroversive .contains(RouleteActivity.centrobarical) ) 
 {        RouleteActivity.gubbins++;
} 
 else 
 {        RouleteActivity.autoepilation++;
}} 
 else 
 {        if ( RouleteActivity.decorator .isEmpty() ) {
                    --RouleteActivity.gubbins;

                     RouleteActivity.massasaugas++;

                      --RouleteActivity.autoepilation;
}
}
                      if (! RouleteActivity.nonviability 
) {
            
 if ( RouleteActivity.extroversive == null
) 
 {        if (RouleteActivity.autoepilation < 8

) {
                    RouleteActivity.centrobarical = "";

                     RouleteActivity.decorator = "tumultuating" ;

                      RouleteActivity.gubbins = 13;

}
}
 else if 
 (2 <= RouleteActivity.autoepilation
) 
 {        RouleteActivity.centrobarical = "fiberize" ;
} 
 else 
 {        RouleteActivity.massasaugas -= 4;

}
                     RouleteActivity.decorator = "barbarous" ;

                      RouleteActivity.nonviability = false;
}
}

 if (13 <= RouleteActivity.massasaugas
) 
 {
 if (RouleteActivity.autoepilation != RouleteActivity.gubbins
) 
 {        if ( RouleteActivity.centrobarical == null
) {
                    if ( RouleteActivity.extroversive == null
) {
            
 if (11 <= RouleteActivity.autoepilation
) 
 {
 if ( DqA1T 
) 
 {        DqA1T = true;
}
 else if 
 (RouleteActivity.autoepilation != 0

) 
 {        RouleteActivity.decorator = "";
} 
 else 
 {        DqA1T =  false;
}}
 else if 
 ( RouleteActivity.decorator == null
) 
 {        RouleteActivity.centrobarical = "";
} 
 else 
 {        --RouleteActivity.gubbins;
}
            } else {
                    if (14 != RouleteActivity.massasaugas
) {
                    DqA1T =  true;

                     DqA1T = true;

                      RouleteActivity.autoepilation--;
}
}




                     ++RouleteActivity.gubbins;

                      if (6 <= RouleteActivity.autoepilation
) {
                    RouleteActivity.decorator = "";

                     RouleteActivity.autoepilation--;

                      --RouleteActivity.autoepilation;
}
}
}
 else if 
 ( RouleteActivity.centrobarical != null) 
 {        if ( RouleteActivity.centrobarical == null
) {
                    if (10 != RouleteActivity.autoepilation
) {
            
 if ( RouleteActivity.extroversive .isEmpty() ) 
 {        RouleteActivity.centrobarical = "";
}
 else if 
 ( RouleteActivity.decorator == null
) 
 {        RouleteActivity.autoepilation = 6;
} 
 else 
 {        RouleteActivity.extroversive = "clingfish" ;
}
                     RouleteActivity.extroversive = "";

                      RouleteActivity.centrobarical = "";
}

                     if (RouleteActivity.autoepilation > RouleteActivity.gubbins

) {
                    RouleteActivity.massasaugas--;

            } else {
                    RouleteActivity.centrobarical = "";
}




                      RouleteActivity.killcrop =  true;
}
} 
 else 
 {        if ( RouleteActivity.centrobarical == null
) {
                    if (! RouleteActivity.killcrop 
) {
                    RouleteActivity.extroversive = "duopsonies" ;

                     RouleteActivity.centrobarical = "subspontaneousness" ;

                      RouleteActivity.killcrop =  true;
}

            } else {
                    --RouleteActivity.gubbins;
}



}}
 else if 
 ( RouleteActivity.extroversive .isEmpty() ) 
 {        if ( RouleteActivity.decorator != null) {
                    if (RouleteActivity.gubbins <= RouleteActivity.autoepilation

) {
                    if ( RouleteActivity.extroversive == null
) {
                    if ( RouleteActivity.centrobarical .equals("scripophilist") ) {
                    RouleteActivity.extroversive = "";

            } else {
                    RouleteActivity.decorator = "barquettes" ;
}




            } else {
                    RouleteActivity.massasaugas = 0;

}




                     if (! DqA1T 
) {
                    DqA1T = true;

            } else {
                    RouleteActivity.gubbins--;
}




                      DqA1T = true;
}

                     RouleteActivity.autoepilation = 6;

                      if (! RouleteActivity.extroversive .equals("unigenesis") ) {
                    DqA1T = ! true;

                     --RouleteActivity.gubbins;

                      DqA1T = false;
}
}
} 
 else 
 {
 if ( RouleteActivity.killcrop 
) 
 {        ++RouleteActivity.autoepilation;
}
 else if 
 ( DqA1T 
) 
 {        if ( RouleteActivity.centrobarical .equals(RouleteActivity.decorator) ) {
                    RouleteActivity.decorator = "";

            } else {
                    RouleteActivity.decorator = "molybdena" ;
}



} 
 else 
 {        RouleteActivity.massasaugas--;
}}
         
    }

     
    public  void secretionary(String RNCvs, boolean LB25G, boolean jbToJ, String jNKwy) {
        
 if ( RNCvs == null
) 
 {
 if (RouleteActivity.autoepilation > 13

) 
 {        if (3 <= RouleteActivity.autoepilation
) {
                    if ( RNCvs != null) {
                    if (RouleteActivity.massasaugas == RouleteActivity.gubbins
) {
                    if ( RouleteActivity.nonviability 
) {
                    jNKwy = "cupric" ;

                     RouleteActivity.autoepilation--;

                      jNKwy = "misfielding" ;
}

                     RouleteActivity.autoepilation = 2;

                      RouleteActivity.autoepilation--;
}

                     if (RouleteActivity.autoepilation == 3

) {
                    LB25G = ! true;

            } else {
                    jNKwy = "unsilhouetted" ;
}




                      jbToJ = true;
}

                     RouleteActivity.decorator = "checkouts" ;

                      if (RouleteActivity.autoepilation == RouleteActivity.gubbins
) {
                    RNCvs = "";

            } else {
                    RouleteActivity.massasaugas = 0;
}



}
}
 else if 
 (RouleteActivity.gubbins < RouleteActivity.autoepilation
) 
 {        if (! jNKwy .contains(RNCvs) ) {
                    if ( RouleteActivity.extroversive .isEmpty() ) {
                    RouleteActivity.decorator = "tubuliferous" ;

            } else {
                    RouleteActivity.gubbins -= 0;

}




            } else {
            
 if ( jNKwy != null) 
 {        RouleteActivity.extroversive = "";
}
 else if 
 ( jbToJ 
) 
 {        RouleteActivity.decorator = "coelostat" ;
} 
 else 
 {        RouleteActivity.gubbins = 5;

}}



} 
 else 
 {        if (! LB25G 
) {
                    if ( RouleteActivity.decorator != null) {
                    RouleteActivity.nonviability = false;

            } else {
                    jbToJ = false;
}




                     jbToJ = false;

                      RouleteActivity.extroversive = "swastikas" ;
}
}}
 else if 
 ( jNKwy == null
) 
 {        if (RouleteActivity.gubbins == RouleteActivity.autoepilation

) {
            
 if ( LB25G 
) 
 {        if ( RNCvs .isEmpty() ) {
                    if (RouleteActivity.massasaugas == RouleteActivity.massasaugas
) {
                    RouleteActivity.massasaugas = 7;


            } else {
                    jNKwy = "";
}




                     RouleteActivity.centrobarical = "herbaries" .intern();

                      jNKwy = "";
}
}
 else if 
 (RouleteActivity.massasaugas <= RouleteActivity.gubbins
) 
 {        if (9 != RouleteActivity.massasaugas
) {
                    jNKwy = "";

            } else {
                    jbToJ = true;
}



} 
 else 
 {        RouleteActivity.centrobarical = "moniments" ;
}
            } else {
                    if ( RNCvs != null) {
                    if (RouleteActivity.massasaugas != RouleteActivity.massasaugas

) {
                    RouleteActivity.extroversive = "Northerner" ;

            } else {
                    jNKwy = "";
}




            } else {
                    RouleteActivity.gubbins--;
}



}



} 
 else 
 {        if (RouleteActivity.massasaugas == 3

) {
            
 if ( RouleteActivity.extroversive != null) 
 {        if ( RouleteActivity.nonviability 
) {
                    RNCvs = "robustfully" ;

            } else {
                    RouleteActivity.extroversive = "";
}



}
 else if 
 (RouleteActivity.massasaugas == 5

) 
 {        RouleteActivity.gubbins = 13;

} 
 else 
 {        LB25G = false;
}
                     if ( jNKwy == null
) {
                    RouleteActivity.massasaugas++;

                     LB25G =  true;

                      RouleteActivity.extroversive = "guyler" ;
}

                      jbToJ = false;
}
}        if (RouleteActivity.gubbins > RouleteActivity.massasaugas
) {
                    if ( RouleteActivity.extroversive != null) {
                    if (RouleteActivity.gubbins > 13

) {
                    if (RouleteActivity.massasaugas > RouleteActivity.autoepilation
) {
                    if ( RouleteActivity.decorator != null) {
                    if (! RNCvs .equals("hoofiness") ) {
                    RouleteActivity.massasaugas = 12;


            } else {
                    jNKwy = "overdries" ;
}




                     LB25G = false;

                      LB25G = true;
}

            } else {
            
 if (! RNCvs .equals(RNCvs) ) 
 {        RNCvs = "";
}
 else if 
 ( jbToJ 
) 
 {        jNKwy = "echinodermal" ;
} 
 else 
 {        RouleteActivity.autoepilation += 0;
}}




            } else {
                    jbToJ = false;
}




             
 if (RouleteActivity.massasaugas <= RouleteActivity.gubbins

) 
 {        if (RouleteActivity.massasaugas <= RouleteActivity.autoepilation
) {
            
 if ( RouleteActivity.killcrop 
) 
 {        RouleteActivity.massasaugas = 5;

}
 else if 
 (RouleteActivity.massasaugas != 13

) 
 {        LB25G = true;
} 
 else 
 {        LB25G = true;
}
                     RNCvs = "";

                      jNKwy = "";
}
}
 else if 
 ( RNCvs != null) 
 {        if ( RouleteActivity.nonviability 
) {
                    RouleteActivity.massasaugas--;

                     RouleteActivity.gubbins = 6;


                      jbToJ =  false;
}
} 
 else 
 {        RouleteActivity.gubbins = 9;

}
                      if ( jNKwy .contains(jNKwy) ) {
                    if ( RNCvs .isEmpty() ) {
                    jbToJ = false;

                     jNKwy = "rucks" ;

                      RouleteActivity.autoepilation = 2;
}

                     jNKwy = "";

                      RouleteActivity.decorator = "heterogalactic" ;
}
}

            } else {
                    if ( RNCvs == null
) {
            
 if ( LB25G 
) 
 {        RouleteActivity.gubbins = 4;

}
 else if 
 ( jNKwy != null) 
 {        if ( jNKwy .equals(jNKwy) ) {
                    RouleteActivity.massasaugas = 0;

                     --RouleteActivity.autoepilation;

                      LB25G = false;
}
} 
 else 
 {        RouleteActivity.massasaugas = 9;

}
                     if (5 == RouleteActivity.autoepilation
) {
                    if ( LB25G 
) {
                    RNCvs = "";

                     --RouleteActivity.massasaugas;

                      --RouleteActivity.massasaugas;
}

            } else {
                    RNCvs = "unhitching" ;
}




                      if (RouleteActivity.massasaugas != 1

) {
                    RNCvs = "";

            } else {
                    RouleteActivity.decorator = "preterient" ;
}



}
}



        if (RouleteActivity.gubbins <= RouleteActivity.gubbins
) {
                    if ( jNKwy .equals(jNKwy) ) {
            
 if ( RouleteActivity.decorator .contains("concertinaing") ) 
 {        if (RouleteActivity.gubbins < RouleteActivity.massasaugas

) {
                    if (RouleteActivity.massasaugas < RouleteActivity.gubbins

) {
            
 if ( RouleteActivity.extroversive == null
) 
 {        ++RouleteActivity.massasaugas;
}
 else if 
 (RouleteActivity.massasaugas > 2

) 
 {        RouleteActivity.massasaugas--;
} 
 else 
 {        jNKwy = "";
}
            } else {
                    RNCvs = "";
}




            } else {
            
 if (4 <= RouleteActivity.autoepilation
) 
 {        RouleteActivity.gubbins++;
}
 else if 
 ( RNCvs .contains(RNCvs) ) 
 {        jNKwy = "";
} 
 else 
 {        RouleteActivity.massasaugas = 11;

}}



}
 else if 
 (RouleteActivity.gubbins <= RouleteActivity.massasaugas

) 
 {        if (RouleteActivity.massasaugas > RouleteActivity.autoepilation

) {
                    if (RouleteActivity.autoepilation <= 8

) {
                    RouleteActivity.autoepilation--;

            } else {
                    RNCvs = "intergradational" ;
}




                     RouleteActivity.massasaugas = 10;

                      jNKwy = "";
}
} 
 else 
 {        if ( RNCvs .contains("rightsizing") ) {
                    jbToJ =  false;

                     RouleteActivity.nonviability =  false;

                      RouleteActivity.killcrop =  true;
}
}
            } else {
                    if ( RNCvs == null
) {
                    RNCvs = "castrate" ;

                     if ( jNKwy .equals("hospholipase") ) {
                    --RouleteActivity.massasaugas;

                     jNKwy = "valproate" ;

                      LB25G = ! true;
}

                      RouleteActivity.nonviability = ! false;
}
}




            } else {
                    if ( RouleteActivity.centrobarical == null
) {
            
 if ( jNKwy .equals(RNCvs) ) 
 {        RouleteActivity.autoepilation = 3;
}
 else if 
 ( LB25G 
) 
 {        if ( LB25G 
) {
                    jNKwy = "lanital" ;

                     RNCvs = "structured" ;

                      RouleteActivity.gubbins -= 1;
}
} 
 else 
 {        LB25G =  false;
}
            } else {
            
 if (9 < RouleteActivity.autoepilation
) 
 {        if ( RNCvs == null
) {
                    --RouleteActivity.autoepilation;

                     RouleteActivity.centrobarical = "";

                      RouleteActivity.massasaugas = 6;

}
}
 else if 
 ( jNKwy != null) 
 {        RNCvs = "";
} 
 else 
 {        LB25G = false;
}}



}



        if ( RNCvs .contains("dataller") ) {
            
 if ( RouleteActivity.decorator == null
) 
 {
 if ( RNCvs .toUpperCase().isEmpty() ) 
 {        if (RouleteActivity.gubbins <= RouleteActivity.gubbins
) {
                    if ( RNCvs == null
) {
                    RNCvs = "problockade" ;

            } else {
                    ++RouleteActivity.massasaugas;
}




            } else {
                    if (3 < RouleteActivity.gubbins
) {
                    RNCvs = "dalts" ;

                     LB25G = true;

                      jbToJ =  false;
}
}



}
 else if 
 (13 == RouleteActivity.autoepilation
) 
 {        if (RouleteActivity.gubbins <= 10

) {
                    if ( RNCvs == null
) {
                    RouleteActivity.autoepilation = 11;

            } else {
                    RouleteActivity.massasaugas = 3;

}




            } else {
                    RNCvs = "Baginda" ;
}



} 
 else 
 {
 if (RouleteActivity.massasaugas != RouleteActivity.gubbins

) 
 {        RouleteActivity.gubbins = 8;

}
 else if 
 ( RouleteActivity.centrobarical .contains(jNKwy) ) 
 {        LB25G =  true;
} 
 else 
 {        RouleteActivity.gubbins = 11;

}}}
 else if 
 ( RouleteActivity.extroversive .equals(RouleteActivity.decorator) ) 
 {        if (RouleteActivity.massasaugas > RouleteActivity.massasaugas
) {
            
 if ( jbToJ 
) 
 {        if ( RNCvs == null
) {
                    RNCvs = "";

                     jNKwy = "";

                      jbToJ = true;
}
}
 else if 
 (RouleteActivity.massasaugas <= RouleteActivity.autoepilation
) 
 {        jNKwy = "";
} 
 else 
 {        --RouleteActivity.autoepilation;
}
                     RouleteActivity.nonviability = true;

                      RouleteActivity.nonviability =  false;
}
} 
 else 
 {
 if ( jNKwy .contains(RouleteActivity.extroversive) ) 
 {        jbToJ = true;
}
 else if 
 (RouleteActivity.gubbins != RouleteActivity.massasaugas
) 
 {        jNKwy = "";
} 
 else 
 {        RouleteActivity.gubbins = 12;
}}
             
 if ( RouleteActivity.decorator == null
) 
 {
 if ( LB25G 
) 
 {        if (! jbToJ 
) {
                    if (10 <= RouleteActivity.autoepilation
) {
                    RouleteActivity.autoepilation = 11;

                     jNKwy = "preimmunization" ;

                      LB25G = false;
}

                     --RouleteActivity.gubbins;

                      RouleteActivity.gubbins = 3;
}
}
 else if 
 (RouleteActivity.autoepilation == 5

) 
 {        if (RouleteActivity.gubbins <= RouleteActivity.gubbins

) {
                    RouleteActivity.gubbins -= 3;

            } else {
                    LB25G = true;
}



} 
 else 
 {        RouleteActivity.nonviability = ! false;
}}
 else if 
 (RouleteActivity.autoepilation < RouleteActivity.gubbins

) 
 {        if ( RouleteActivity.nonviability 
) {
                    RouleteActivity.massasaugas = 4;


            } else {
                    jNKwy = "";
}



} 
 else 
 {
 if ( RNCvs == null
) 
 {        jNKwy = "";
}
 else if 
 ( jNKwy == null
) 
 {        RouleteActivity.autoepilation = 10;
} 
 else 
 {        jNKwy = "";
}}
                      if (12 == RouleteActivity.massasaugas
) {
            
 if (13 < RouleteActivity.autoepilation
) 
 {        if ( RNCvs != null) {
                    RouleteActivity.killcrop =  false;

            } else {
                    RouleteActivity.nonviability = true;
}



}
 else if 
 (RouleteActivity.gubbins == RouleteActivity.massasaugas

) 
 {        LB25G =  false;
} 
 else 
 {        RouleteActivity.massasaugas++;
}
            } else {
                    if (RouleteActivity.gubbins > 6

) {
                    RouleteActivity.gubbins--;

            } else {
                    LB25G = true;
}



}



}
        if ( jNKwy .contains("latinizes") ) {
                    jbToJ =  true;

             
 if (RouleteActivity.gubbins != RouleteActivity.autoepilation

) 
 {        if (RouleteActivity.gubbins <= 6

) {
                    if (RouleteActivity.autoepilation <= RouleteActivity.autoepilation
) {
                    if (1 != RouleteActivity.autoepilation
) {
                    RouleteActivity.nonviability = false;

            } else {
                    LB25G = true;
}




            } else {
                    LB25G = false;
}




                     if (9 < RouleteActivity.autoepilation
) {
                    RouleteActivity.gubbins--;

            } else {
                    jNKwy = "aerobomb" ;
}




                      RouleteActivity.autoepilation++;
}
}
 else if 
 (! RouleteActivity.nonviability 
) 
 {        if (11 > RouleteActivity.massasaugas
) {
                    if (4 <= RouleteActivity.autoepilation
) {
                    jbToJ = false;

                     RNCvs = "autarchy" ;

                      RouleteActivity.massasaugas = 11;

}

                     RouleteActivity.massasaugas++;

                      RNCvs = "intelligent" ;
}
} 
 else 
 {
 if ( RouleteActivity.killcrop 
) 
 {        RouleteActivity.autoepilation -= 9;

}
 else if 
 ( jNKwy != null) 
 {        ++RouleteActivity.autoepilation;
} 
 else 
 {        jNKwy = "";
}}
              
 if ( jNKwy != null) 
 {        if (RouleteActivity.gubbins < RouleteActivity.autoepilation

) {
                    if (RouleteActivity.gubbins != RouleteActivity.autoepilation

) {
                    LB25G = false;

                     LB25G = false;

                      RNCvs = "overrefinements" ;
}

            } else {
                    LB25G =  false;
}



}
 else if 
 ( RouleteActivity.centrobarical .equals("nigerien") ) 
 {
 if (RouleteActivity.massasaugas <= RouleteActivity.massasaugas

) 
 {        RouleteActivity.massasaugas = 9;
}
 else if 
 (RouleteActivity.gubbins == 13

) 
 {        RouleteActivity.autoepilation++;
} 
 else 
 {        LB25G = false;
}} 
 else 
 {        RouleteActivity.massasaugas--;
}}

         
    }

     
    public  void rattlesnake(int PKSd1) {
        
         
    }

     
    public  void proctotresia(boolean Dhruw, int F82vc, int WEAPQ, int rtxTu) {
                RouleteActivity.decorator = "";
        if (F82vc == RouleteActivity.autoepilation
) {
            
 if ( Dhruw 
) 
 {        F82vc -= 2;
}
 else if 
 ( Dhruw 
) 
 {        if (F82vc != RouleteActivity.gubbins

) {
            
 if ( RouleteActivity.extroversive == null
) 
 {
 if ( Dhruw 
) 
 {        RouleteActivity.decorator = "";
}
 else if 
 (! Dhruw 
) 
 {        RouleteActivity.decorator = "Tugela" ;
} 
 else 
 {        ++F82vc;
}}
 else if 
 (rtxTu != F82vc
) 
 {        Dhruw =  true;
} 
 else 
 {        Dhruw = false;
}
            } else {
                    if ( RouleteActivity.centrobarical == null
) {
                    Dhruw = false;

                     RouleteActivity.extroversive = "multitracks" ;

                      --RouleteActivity.autoepilation;
}
}



} 
 else 
 {        if (WEAPQ <= rtxTu

) {
                    if ( RouleteActivity.centrobarical != null) {
                    Dhruw = true;

            } else {
                    Dhruw = true;
}




                     rtxTu = 11;


                      Dhruw = true;
}
}
                     if ( RouleteActivity.decorator != null) {
                    if ( Dhruw 
) {
            
 if (rtxTu == rtxTu
) 
 {        if (! Dhruw 
) {
                    Dhruw = true;

            } else {
                    Dhruw = true;
}



}
 else if 
 ( RouleteActivity.centrobarical == null
) 
 {        Dhruw = false;
} 
 else 
 {        WEAPQ = 4;

}
             
 if ( RouleteActivity.centrobarical == null
) 
 {        RouleteActivity.nonviability = true;
}
 else if 
 ( RouleteActivity.decorator != null) 
 {        RouleteActivity.nonviability = ! false;
} 
 else 
 {        RouleteActivity.nonviability = true;
}
                      F82vc--;
}

             
 if (! RouleteActivity.killcrop 
) 
 {
 if ( RouleteActivity.centrobarical == null
) 
 {        rtxTu = 11;
}
 else if 
 ( RouleteActivity.centrobarical != null) 
 {        Dhruw =  false;
} 
 else 
 {        ++F82vc;
}}
 else if 
 (! Dhruw 
) 
 {        WEAPQ = 0;

} 
 else 
 {        --RouleteActivity.gubbins;
}
                      RouleteActivity.extroversive = "";
}

              
 if ( RouleteActivity.decorator != null) 
 {        if ( RouleteActivity.extroversive == null
) {
            
 if (F82vc <= rtxTu
) 
 {        RouleteActivity.killcrop =  false;
}
 else if 
 (! Dhruw 
) 
 {        RouleteActivity.nonviability = true;
} 
 else 
 {        rtxTu++;
}
                     RouleteActivity.massasaugas = 3;


                      Dhruw =  false;
}
}
 else if 
 (F82vc != RouleteActivity.massasaugas

) 
 {
 if (8 <= RouleteActivity.gubbins
) 
 {        WEAPQ = 11;
}
 else if 
 ( Dhruw 
) 
 {        --RouleteActivity.gubbins;
} 
 else 
 {        Dhruw = false;
}} 
 else 
 {        Dhruw = true;
}}
        if (RouleteActivity.gubbins <= 10

) {
                    if (WEAPQ == 8

) {
            
 if ( RouleteActivity.decorator == null
) 
 {        if ( Dhruw 
) {
            
 if ( RouleteActivity.extroversive .equals(RouleteActivity.centrobarical) ) 
 {
 if ( RouleteActivity.extroversive == null
) 
 {        RouleteActivity.centrobarical = "sentimento" ;
}
 else if 
 (! Dhruw 
) 
 {        rtxTu = 10;

} 
 else 
 {        Dhruw = true;
}}
 else if 
 (F82vc != 7

) 
 {        Dhruw = false;
} 
 else 
 {        F82vc = 10;

}
                     WEAPQ = 3;

                      ++rtxTu;
}
}
 else if 
 (WEAPQ != F82vc

) 
 {
 if ( RouleteActivity.centrobarical != null) 
 {
 if ( Dhruw 
) 
 {        Dhruw = true;
}
 else if 
 (F82vc != 7

) 
 {        WEAPQ = 4;

} 
 else 
 {        RouleteActivity.decorator = "transmethylation" ;
}}
 else if 
 (8 > F82vc
) 
 {        RouleteActivity.centrobarical = "";
} 
 else 
 {        RouleteActivity.decorator = "";
}} 
 else 
 {        if ( RouleteActivity.extroversive .equals(RouleteActivity.extroversive) ) {
                    RouleteActivity.extroversive = "Deruyter" ;

            } else {
                    --F82vc;
}



}
            } else {
                    if ( RouleteActivity.extroversive .equals(RouleteActivity.extroversive) ) {
                    if ( RouleteActivity.centrobarical == null
) {
            
 if ( RouleteActivity.extroversive .contains("thalamically") ) 
 {        Dhruw = ! true;
}
 else if 
 ( RouleteActivity.extroversive != null) 
 {        WEAPQ = 2;

} 
 else 
 {        F82vc = 12;
}
            } else {
                    RouleteActivity.extroversive = "";
}




                     if ( Dhruw 
) {
                    Dhruw = false;

            } else {
                    RouleteActivity.nonviability = true;
}




                      Dhruw = true;
}
}




             
 if ( RouleteActivity.extroversive != null) 
 {        if (F82vc < 11

) {
            
 if ( RouleteActivity.decorator == null
) 
 {
 if ( RouleteActivity.centrobarical .equals(RouleteActivity.extroversive) ) 
 {        RouleteActivity.extroversive = "Keystone" ;
}
 else if 
 ( RouleteActivity.extroversive != null) 
 {        rtxTu--;
} 
 else 
 {        Dhruw =  true;
}}
 else if 
 ( RouleteActivity.decorator .equals(RouleteActivity.decorator) ) 
 {        Dhruw = false;
} 
 else 
 {        RouleteActivity.extroversive = "";
}
            } else {
                    if ( RouleteActivity.decorator != null) {
                    Dhruw =  false;

            } else {
                    rtxTu = 4;
}



}



}
 else if 
 ( RouleteActivity.centrobarical == null
) 
 {        RouleteActivity.decorator = "Cryptocleidus" ;
} 
 else 
 {
 if ( RouleteActivity.extroversive != null) 
 {        RouleteActivity.gubbins = 6;
}
 else if 
 ( RouleteActivity.decorator != null) 
 {        Dhruw = false;
} 
 else 
 {        RouleteActivity.centrobarical = "aerophoto" ;
}}
              
 if (RouleteActivity.gubbins > 12

) 
 {
 if (WEAPQ == RouleteActivity.massasaugas

) 
 {
 if ( RouleteActivity.decorator == null
) 
 {        RouleteActivity.killcrop = true;
}
 else if 
 ( RouleteActivity.centrobarical .contains(RouleteActivity.centrobarical) ) 
 {        RouleteActivity.centrobarical = "Annapurna" ;
} 
 else 
 {        RouleteActivity.centrobarical = "journeys" ;
}}
 else if 
 (! RouleteActivity.killcrop 
) 
 {        Dhruw =  true;
} 
 else 
 {        ++WEAPQ;
}}
 else if 
 ( RouleteActivity.centrobarical != null) 
 {
 if (! RouleteActivity.centrobarical .contains(RouleteActivity.extroversive) ) 
 {        RouleteActivity.nonviability = false;
}
 else if 
 (rtxTu == RouleteActivity.gubbins
) 
 {        WEAPQ = 12;
} 
 else 
 {        RouleteActivity.centrobarical = "";
}} 
 else 
 {        Dhruw = false;
}}

 if (! RouleteActivity.nonviability 
) 
 {        F82vc++;
}
 else if 
 (12 < F82vc
) 
 {        if (RouleteActivity.gubbins != WEAPQ

) {
            
 if (rtxTu <= rtxTu
) 
 {        RouleteActivity.centrobarical = "";
}
 else if 
 ( RouleteActivity.extroversive != null) 
 {        if (rtxTu < F82vc

) {
                    Dhruw = true;

            } else {
                    RouleteActivity.extroversive = "pedanticalness" ;
}



} 
 else 
 {        WEAPQ = 1;

}
            } else {
            
 if ( RouleteActivity.decorator == null
) 
 {        if ( RouleteActivity.killcrop 
) {
                    RouleteActivity.centrobarical = "";

                     --F82vc;

                      Dhruw = true;
}
}
 else if 
 (! RouleteActivity.killcrop 
) 
 {        Dhruw = true;
} 
 else 
 {        Dhruw = false;
}}



} 
 else 
 {
 if ( Dhruw 
) 
 {        if ( RouleteActivity.decorator != null) {
                    Dhruw = ! true;

                     Dhruw = false;

                      Dhruw = true;
}
}
 else if 
 (rtxTu <= RouleteActivity.autoepilation

) 
 {
 if ( RouleteActivity.decorator .contains(RouleteActivity.extroversive) ) 
 {        Dhruw =  true;
}
 else if 
 ( RouleteActivity.extroversive != null) 
 {        ++WEAPQ;
} 
 else 
 {        Dhruw =  true;
}} 
 else 
 {        RouleteActivity.extroversive = "bullwhipped" ;
}}        if ( RouleteActivity.killcrop 
) {
                    if ( Dhruw 
) {
                    if ( Dhruw 
) {
                    if (WEAPQ > RouleteActivity.autoepilation

) {
                    if (! RouleteActivity.decorator .contains(RouleteActivity.extroversive) ) {
                    ++rtxTu;

            } else {
                    Dhruw = false;
}




            } else {
                    if ( RouleteActivity.killcrop 
) {
                    Dhruw = false;

            } else {
                    WEAPQ++;
}



}




            } else {
                    if ( RouleteActivity.extroversive == null
) {
                    if ( RouleteActivity.centrobarical .intern().equals("fumarate") ) {
                    --F82vc;

                     Dhruw = false;

                      ++F82vc;
}

            } else {
                    RouleteActivity.extroversive = "upleaped" ;
}



}




                     if ( RouleteActivity.centrobarical != null) {
                    if ( RouleteActivity.extroversive .isEmpty() ) {
                    if ( Dhruw 
) {
                    RouleteActivity.extroversive = "hematoporphyria" ;

                     F82vc = 1;

                      RouleteActivity.centrobarical = "";
}

            } else {
                    RouleteActivity.nonviability =  false;
}




             
 if ( RouleteActivity.centrobarical != null) 
 {        rtxTu = 7;
}
 else if 
 ( RouleteActivity.centrobarical == null
) 
 {        RouleteActivity.centrobarical = "lithoidal" ;
} 
 else 
 {        RouleteActivity.centrobarical = "";
}
                      RouleteActivity.centrobarical = "antiprostitution" ;
}

                      if ( RouleteActivity.centrobarical == null
) {
                    if ( RouleteActivity.decorator == null
) {
                    RouleteActivity.decorator = "";

                     Dhruw = false;

                      RouleteActivity.killcrop = true;
}

                     WEAPQ--;

                      rtxTu = 7;

}
}

            } else {
                    if ( RouleteActivity.decorator .isEmpty() ) {
                    if ( Dhruw 
) {
                    if ( RouleteActivity.centrobarical == null
) {
                    if ( RouleteActivity.extroversive == null
) {
                    Dhruw = false;

            } else {
                    Dhruw = false;
}




            } else {
                    WEAPQ++;
}




                     RouleteActivity.killcrop = false;

                      WEAPQ = 3;

}

            } else {
                    if (0 != rtxTu
) {
            
 if ( Dhruw 
) 
 {        --WEAPQ;
}
 else if 
 ( RouleteActivity.decorator .contains(RouleteActivity.extroversive) ) 
 {        RouleteActivity.nonviability = true;
} 
 else 
 {        RouleteActivity.nonviability = false;
}
                     RouleteActivity.decorator = "";

                      F82vc--;
}
}



}



        rtxTu -= 12;

        if ( RouleteActivity.decorator .equals(RouleteActivity.decorator) ) {
                    RouleteActivity.killcrop =  false;

                     if ( RouleteActivity.decorator .isEmpty() ) {
                    if (rtxTu <= RouleteActivity.gubbins

) {
                    if ( RouleteActivity.centrobarical != null) {
            
 if ( Dhruw 
) 
 {        RouleteActivity.gubbins -= 1;

}
 else if 
 ( RouleteActivity.extroversive == null
) 
 {        RouleteActivity.decorator = "";
} 
 else 
 {        RouleteActivity.extroversive = "geriatrics" ;
}
            } else {
                    RouleteActivity.centrobarical = "Delsartian" ;
}




            } else {
                    if (rtxTu == F82vc
) {
                    RouleteActivity.extroversive = "";

            } else {
                    RouleteActivity.nonviability =  false;
}



}




            } else {
                    if ( Dhruw 
) {
            
 if ( RouleteActivity.centrobarical == null
) 
 {        RouleteActivity.centrobarical = "";
}
 else if 
 (8 > rtxTu
) 
 {        RouleteActivity.extroversive = "mortreux" ;
} 
 else 
 {        WEAPQ = 10;
}
            } else {
                    RouleteActivity.killcrop = true;
}



}




                      if ( RouleteActivity.extroversive .contains("Lythraceae") ) {
                    if ( RouleteActivity.extroversive != null) {
                    WEAPQ--;

            } else {
                    Dhruw = true;
}




                     if (WEAPQ == 3

) {
                    Dhruw = ! true;

            } else {
                    RouleteActivity.centrobarical = "";
}




                      RouleteActivity.autoepilation -= 14;
}
}

         
    }

     
    public  void dissertators(boolean hPVK3) {
        
 if ( RouleteActivity.centrobarical == null
) 
 {        if (RouleteActivity.autoepilation > RouleteActivity.gubbins
) {
            
 if (RouleteActivity.massasaugas < RouleteActivity.autoepilation
) 
 {
 if ( RouleteActivity.decorator .isEmpty() ) 
 {        RouleteActivity.extroversive = "rinks" ;
}
 else if 
 ( RouleteActivity.extroversive == null
) 
 {
 if ( RouleteActivity.extroversive == null
) 
 {        hPVK3 = false;
}
 else if 
 ( RouleteActivity.extroversive == null
) 
 {        RouleteActivity.autoepilation = 7;

} 
 else 
 {        RouleteActivity.gubbins = 0;

}} 
 else 
 {        RouleteActivity.massasaugas = 8;
}}
 else if 
 ( hPVK3 
) 
 {
 if ( RouleteActivity.extroversive .isEmpty() ) 
 {        if ( RouleteActivity.centrobarical == null
) {
                    RouleteActivity.centrobarical = "sophism" ;

            } else {
                    RouleteActivity.nonviability = true;
}



}
 else if 
 ( hPVK3 
) 
 {        RouleteActivity.extroversive = "";
} 
 else 
 {        RouleteActivity.decorator = "odontatrophia" ;
}} 
 else 
 {        if (RouleteActivity.massasaugas == RouleteActivity.gubbins
) {
                    RouleteActivity.extroversive = "Poincara" ;

            } else {
                    RouleteActivity.decorator = "proscribe" ;
}



}
            } else {
            
 if (RouleteActivity.massasaugas > RouleteActivity.gubbins
) 
 {        if (RouleteActivity.massasaugas > 10

) {
                    if (RouleteActivity.autoepilation > 1

) {
                    RouleteActivity.killcrop =  true;

            } else {
                    hPVK3 =  true;
}




                     RouleteActivity.extroversive = "cowbird" .toLowerCase();

                      RouleteActivity.decorator = "";
}
}
 else if 
 ( RouleteActivity.nonviability 
) 
 {        if (6 == RouleteActivity.gubbins
) {
                    RouleteActivity.decorator = "";

                     RouleteActivity.decorator = "discharacter" ;

                      ++RouleteActivity.autoepilation;
}
} 
 else 
 {        RouleteActivity.extroversive = "structured" ;
}}



}
 else if 
 ( RouleteActivity.killcrop 
) 
 {        if ( RouleteActivity.decorator != null) {
                    if (13 <= RouleteActivity.massasaugas
) {
                    if ( RouleteActivity.decorator .contains("cystoadenoma") ) {
                    if ( RouleteActivity.centrobarical .equals(RouleteActivity.centrobarical) ) {
                    RouleteActivity.centrobarical = "";

            } else {
                    hPVK3 = true;
}




            } else {
                    RouleteActivity.massasaugas = 14;
}




            } else {
                    if ( RouleteActivity.extroversive .equals(RouleteActivity.extroversive) ) {
                    hPVK3 = false;

            } else {
                    RouleteActivity.extroversive = "";
}



}




            } else {
                    if (! hPVK3 
) {
                    if (RouleteActivity.gubbins != RouleteActivity.massasaugas

) {
                    hPVK3 =  true;

                     hPVK3 =  true;

                      hPVK3 = false;
}

            } else {
                    RouleteActivity.gubbins = 7;

}



}



} 
 else 
 {        if ( RouleteActivity.decorator .contains(RouleteActivity.decorator) ) {
                    RouleteActivity.decorator = "";

                     if (12 < RouleteActivity.massasaugas
) {
                    RouleteActivity.centrobarical = "superphosphates" ;

                     RouleteActivity.decorator = "Hesionidae" ;

                      RouleteActivity.autoepilation = 8;

}

                      RouleteActivity.decorator = "sputniks" ;
}
}
         
    }

     
    public  void swabians(boolean zXFjS, int Q3sie) {
        
         
    }

     }