package frog.company.app13june;
import frog.company.app13june.Utils;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.Config;
import frog.company.app13june.WActivity;
import frog.company.app13june.GameActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.MainActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.HelperJ;
import frog.company.app13june.HelpActivity;
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

   public static boolean aventails = false;
   public static int rebarbarization = 115;
   public static String orphic = "nonmystically";
   public static int churchmanships = 81;
   public static String schleswig = "postproductions";
   public static int levitate = 85;
   public static String antihierarchic = "protanomalous";
   public static String siclari = "overblaze";
   public static boolean ghastly = true;
   public static boolean teleports = true;
   public static int enrages = 122;
   public static String modellings = "antireservationist";
   public static byte[] overfalling = new byte[]{-119, 114, -106, -115, 109, 109, 103, 102, 119, 68, 92, 71, 113, 121, 106, 2, 119, 17};
   public static byte[] comfiture = new byte[]{-46, -12, -103, -17, 0, -7};
   public static byte[] ageratina = new byte[]{99, 105, 66, 118, 122, 71, -124, -60, -59, -117, -127, -56, 96, -90};
   public static byte[] donahue = new byte[]{124, 121};
   public static final byte[] orra = new byte[]{-29, -28, 127, -72, 127, -54, 17, -53};

    CountDownTimer cTimer;
    int score = 10000;
    Button btnMyMoney;
    ImageView imgRoulette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RouleteActivity.orphic = "";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulete);

        btnMyMoney = findViewById(R.id.btnMyMoney);
        btnMyMoney.setText(String.format(DialogsJ.isZpD(80, 77),score));

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> onBackPressed());

        imgRoulette = findViewById(R.id.imgRoulette);

        Button btnTwist = findViewById(R.id.btnTwist);
        RouleteActivity.enrages += 14;

        btnTwist.setOnClickListener(view -> {
            startGame();
        });
    }

    @Override
    protected void onResume() {
        RouleteActivity.ghastly =  true;
        super.onResume();
        score = new Utils().onGetScore(this);
        btnMyMoney.setText(String.format(MainActivity.mk3Or(70, 90, 78),score));
    }

    private void startGame(){
        RouleteActivity.ghastly =  false;
        if(cTimer == null) {
            new Utils().onSetScore(this,score);
            btnMyMoney.setText(String.format((SplashActivity.N7Jxa(83, 85, 54, 66, 48, 88, 81)+GameActivity.REP6m(121, 51, 76, 115, 88)+ HelpActivity.oTlFS(122, 100)),score));

            startTimer();
        }else
            Toast.makeText(this,(WActivity.Zcmeu(106)+ Config.y9wek(118, 56, 56, 101)),Toast.LENGTH_SHORT).show();
    }

    private void startTimer() {
        RouleteActivity.ghastly = false;
        Random rnd = new Random();

        RouleteActivity.ghastly = false;
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
        if (! RouleteActivity.orphic .contains("unappreciably") ) {
                    --RouleteActivity.levitate;

                     ++RouleteActivity.levitate;

                      RouleteActivity.enrages++;
}
        int[] resultArray = new int[]{200,400,1000,700,400,300,10000,600,400,800,1000,200,100,400,500,900,200};


        while(true){
            if(imgRoulette.getRotation() > 360)
                imgRoulette.setRotation(imgRoulette.getRotation() - 360);
            else
                break;
        }

        int res = (int)(imgRoulette.getRotation()  / 22.5);

        Toast.makeText(this,RouleteActivity.P8Fps(78, 120, 84, 100, 97),Toast.LENGTH_SHORT).show();
        score += resultArray[res];
        new Utils().onSetScore(this,score);

        btnMyMoney.setText(String.format((SplashActivity.Kz8RH(113, 80, 81)),score));
    }
    public static String SJgvH(  int C7M, int bBc, int VO7, int i1h, int IXs ) {
        RouleteActivity.modellings = "";
        byte[] bArr = {-40, -90, -33, -23, -115, -88, -5, -51, -42, 3};

            int drF = 117;

    for (int i = 0; i < 10; i++) {
        bArr[i] = (byte)(((((((bArr[i] - IXs) - i1h) + VO7) + drF) - bBc) ^ C7M));
        C7M++;
bBc--;
drF -= 5;
        if ( RouleteActivity.antihierarchic != null) {
                    RouleteActivity.rebarbarization--;

            } else {
                    RouleteActivity.schleswig = "";
}



VO7 += 1;
i1h -= 3;
IXs += 4;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String gBm8R(  int cBH, int gTm, int Dbg, int S9E, int JOu, int dyC ) {
        RouleteActivity.ghastly = false;
        byte[] bArr = new byte[5];
		for (int i = 0; i < 5; i++)
		  bArr[i] = HelperJ.bronchotyphoid[i];
        RouleteActivity.orphic = "decreers" ;

            byte i = -1;
    int pqJ = 53;
    byte[] bArrCopy = new byte[5];
    for (byte var : bArr) 
    { 
        i++;
        bArrCopy[i] = (byte) (((((((bArr[i] - pqJ) - dyC) ^ JOu) - S9E) - Dbg) - gTm) + cBH);
        cBH += 5;
gTm += 1;
Dbg--;
S9E += 5;
JOu += 5;
dyC += 5;
pqJ++;
    }
    bArr = bArrCopy;
        RouleteActivity.antihierarchic = "Henan" ;
   
    

        String str = new String(bArr);
        
        return str;
    }
    public static String P8Fps(  int vY3, int lOR, int Akp, int gmC, int RUt ) {

 if ( RouleteActivity.aventails 
) 
 {        ++RouleteActivity.rebarbarization;
}
 else if 
 (RouleteActivity.enrages != RouleteActivity.enrages
) 
 {        RouleteActivity.schleswig = "";
} 
 else 
 {        RouleteActivity.antihierarchic = "";
}        byte[] bArr = (byte[]) HelperJ.nonneutrality.clone();
            int i = 0;
    while(i < 39) {
        bArr[i] = (byte)((((((((bArr[i] ^ RUt) - gmC) - Akp) + 55) - 105) ^ lOR) - vY3));
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String gRAT4(  int rYR, int quJ, int h4n ) {
        RouleteActivity.antihierarchic = "headcounts" ;
        RouleteActivity.churchmanships++;
        byte[] bArr = new byte[8];
		for (int i = 0; i < 8; i++)
		  bArr[i] = SplashActivity.plethysmography[i];

            
    for (int i = 0; i < 8; i += 1) {
        bArr[i] = (byte)((((bArr[i] ^ h4n) + quJ) ^ rYR));
        rYR -= 3;
quJ -= 3;
h4n += 2;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String eJMOU(  int duo, int Vpr, int K1s, int yPz, int cT4, int Q03 ) {
        RouleteActivity.orphic = "indagates" ;
        byte[] bArr = {-91, -93, -92, -108};

            byte[] bArrCopy = new byte[4];
    byte i = -1;
    for (byte var : bArr) 
    { 
        i += 1;
        bArrCopy[i] = (byte) ((((((bArr[i] - Q03) - cT4) + yPz) ^ K1s) ^ Vpr) + duo);
    }
    bArr = bArrCopy;

         String str = new String(bArr, StandardCharsets.UTF_8);
        RouleteActivity.aventails = false;
        RouleteActivity.antihierarchic = "";
        
        return str;
    }

       public static String E1LtP(  int uEd, int kTn, int kFm ) {
        RouleteActivity.modellings = "";
        byte[] bArr = (byte[]) HelpActivity.trespassory.clone();
            int i = 0;
    while(i < 7) {
        bArr[i] = (byte)(((((bArr[i] - kFm) - kTn) + uEd) + 88));
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String IUPlg(  int pDn, int JTx, int aKa ) {
        RouleteActivity.modellings = "";
        byte[] bArr = new byte[6];
		int ind2 = 0;
		for (byte var : RouleteActivity.comfiture)
		  bArr[ind2++] = var;

            int lAg = 74;

    for (int i = 0; i < 6; i += 1) {
        bArr[i] = (byte)(((((bArr[i] + aKa) - JTx) ^ lAg) - pDn));
        pDn--;
lAg -= 4;
JTx -= 2;
aKa++;
        RouleteActivity.rebarbarization = 4;

    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String rHKpB(  int mNx, int ceL, int YIY, int Wpa, int X76, int boY, int NKH ) {
        if (RouleteActivity.rebarbarization != RouleteActivity.levitate

) {
                    RouleteActivity.schleswig = "nonspectacularly" ;

            } else {
                    RouleteActivity.antihierarchic = "cerebromeningeal" ;
}



        byte[] bArr = {47, 24, -49, -64, -68, -49, 64, -118, -71, 70, 13, -96, 103};

            TreeMap<Integer,Byte> treeMap =new TreeMap<>();
         

    int i = 0;
    for(int j = -1;j<13-1;j++){
        

        treeMap.put(i,(byte)(((((((bArr[i] + NKH) ^ boY) ^ X76) + Wpa) + YIY) ^ ceL) - mNx));
        i++;
        RouleteActivity.levitate = 9;
        mNx -= 5;
ceL--;
YIY += 4;
Wpa++;
X76--;
boY += 5;
NKH += 3;

        }

        if ( RouleteActivity.orphic == null
) {
                    --RouleteActivity.levitate;

                     RouleteActivity.enrages--;

                      RouleteActivity.teleports = false;
}
    HashSet<Integer> set=new HashSet<>(treeMap.keySet());

    for (Integer s:set){
        bArr[s] = treeMap.get(s);
        }


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String wBviM(  int JjP, int kQE, int re1, int eSY ) {
        RouleteActivity.modellings = "invasively" ;
        byte[] bArr = {-65, -80, -57};

            TreeMap<Integer,Byte> treeMap =new TreeMap<>();
        RouleteActivity.aventails = false;
         int UhU = 54;


    int i = 0;
    for(int j = -1;j<3-1;j++){
        

        treeMap.put(i,(byte)(((((bArr[i] ^ eSY) ^ re1) + kQE) + JjP) - UhU));
        i++;
        UhU -= 4;
JjP += 3;
kQE++;
re1--;
eSY += 3;

        }

    HashSet<Integer> set=new HashSet<>(treeMap.keySet());

    for (Integer s:set){
        bArr[s] = treeMap.get(s);
        }


        String str = new String(bArr);
        
        return str;
    }

    public  void sawer(String uusA7) {
        
         
    }

     
    public  void trappistine(boolean ASSsS, boolean vpQDa) {
                if ( RouleteActivity.antihierarchic .isEmpty() ) {
                    if (! ASSsS 
) {
            
 if ( ASSsS 
) 
 {        if (RouleteActivity.rebarbarization <= RouleteActivity.enrages
) {
                    RouleteActivity.ghastly =  true;

             
 if (11 == RouleteActivity.rebarbarization
) 
 {        vpQDa = true;
}
 else if 
 (RouleteActivity.churchmanships <= 12

) 
 {        RouleteActivity.antihierarchic = "";
} 
 else 
 {        vpQDa =  false;
}
                      RouleteActivity.modellings = "";
}
}
 else if 
 (RouleteActivity.churchmanships < RouleteActivity.levitate
) 
 {        if ( RouleteActivity.schleswig != null) {
                    if (! ASSsS 
) {
                    RouleteActivity.churchmanships = 12;


                     RouleteActivity.teleports = false;

                      vpQDa = true;
}

                     RouleteActivity.teleports = false;

                      RouleteActivity.rebarbarization = 7;

}
} 
 else 
 {        if ( RouleteActivity.modellings .isEmpty() ) {
                    RouleteActivity.teleports = false;

                     RouleteActivity.orphic = "circling" ;

                      RouleteActivity.rebarbarization -= 12;

}
}
            } else {
                    if ( RouleteActivity.orphic != null) {
            
 if (! RouleteActivity.antihierarchic .equals(RouleteActivity.modellings) ) 
 {
 if ( RouleteActivity.siclari == null
) 
 {        RouleteActivity.schleswig = "";
}
 else if 
 ( ASSsS 
) 
 {        RouleteActivity.schleswig = "deliriousness" ;
} 
 else 
 {        vpQDa = false;
}}
 else if 
 (RouleteActivity.churchmanships <= RouleteActivity.enrages
) 
 {        --RouleteActivity.churchmanships;
} 
 else 
 {        RouleteActivity.ghastly = ! true;
}
                     if ( RouleteActivity.schleswig == null
) {
                    RouleteActivity.modellings = "";

            } else {
                    RouleteActivity.schleswig = "playsomeness" ;
}




                      RouleteActivity.enrages = 12;

}
}




            } else {
                    if (5 < RouleteActivity.levitate
) {
                    RouleteActivity.enrages = 4;


                     vpQDa = true;

              
 if (RouleteActivity.rebarbarization <= RouleteActivity.churchmanships

) 
 {        RouleteActivity.rebarbarization++;
}
 else if 
 ( RouleteActivity.antihierarchic == null
) 
 {        RouleteActivity.orphic = "nebulosus" ;
} 
 else 
 {        RouleteActivity.churchmanships = 9;
}}
}



        if (! RouleteActivity.orphic .contains("hyalinizing") ) {
                    if ( RouleteActivity.orphic == null
) {
                    if ( RouleteActivity.modellings != null) {
                    if ( vpQDa 
) {
                    if ( RouleteActivity.antihierarchic .contains(RouleteActivity.schleswig) ) {
                    if ( vpQDa 
) {
                    RouleteActivity.modellings = "schizorhinal" ;

                     --RouleteActivity.churchmanships;

                      ++RouleteActivity.levitate;
}

            } else {
                    RouleteActivity.siclari = "";
}




                     RouleteActivity.churchmanships = 14;


                      RouleteActivity.levitate--;
}

            } else {
            
 if ( ASSsS 
) 
 {        RouleteActivity.teleports = false;
}
 else if 
 (RouleteActivity.rebarbarization <= RouleteActivity.enrages

) 
 {        RouleteActivity.modellings = "";
} 
 else 
 {        vpQDa = false;
}}




            } else {
                    if (RouleteActivity.rebarbarization == RouleteActivity.rebarbarization

) {
                    if ( RouleteActivity.schleswig == null
) {
                    if ( RouleteActivity.antihierarchic == null
) {
                    RouleteActivity.enrages--;

                     RouleteActivity.levitate += 2;

                      ASSsS = true;
}

            } else {
                    RouleteActivity.ghastly = true;
}




            } else {
                    if (! RouleteActivity.modellings .equals("monties") ) {
                    ASSsS = true;

            } else {
                    RouleteActivity.orphic = "";
}



}



}




                     if (RouleteActivity.rebarbarization < RouleteActivity.churchmanships
) {
                    if ( vpQDa 
) {
                    if (13 <= RouleteActivity.levitate
) {
                    ASSsS = false;

                     RouleteActivity.enrages++;

                      RouleteActivity.antihierarchic = "";
}

            } else {
            
 if ( RouleteActivity.teleports 
) 
 {        RouleteActivity.enrages = 4;
}
 else if 
 (4 != RouleteActivity.enrages
) 
 {        RouleteActivity.siclari = "superexpress" .toUpperCase();
} 
 else 
 {        RouleteActivity.enrages += 11;

}}




            } else {
                    if ( RouleteActivity.antihierarchic .contains("oviboses") ) {
                    ASSsS = true;

            } else {
                    RouleteActivity.schleswig = "antileft" ;
}



}




                      if (2 == RouleteActivity.enrages
) {
                    if ( RouleteActivity.siclari == null
) {
                    RouleteActivity.schleswig = "revelant" ;

            } else {
                    RouleteActivity.enrages++;
}




            } else {
                    if (RouleteActivity.rebarbarization != RouleteActivity.enrages

) {
                    RouleteActivity.ghastly =  true;

            } else {
                    RouleteActivity.modellings = "overpert" ;
}



}



}

 if (RouleteActivity.rebarbarization != 4

) 
 {
 if ( RouleteActivity.modellings == null
) 
 {
 if ( RouleteActivity.modellings .contains("safen") ) 
 {
 if ( RouleteActivity.orphic == null
) 
 {        RouleteActivity.ghastly = true;
}
 else if 
 ( vpQDa 
) 
 {        if (RouleteActivity.rebarbarization > RouleteActivity.levitate

) {
                    RouleteActivity.enrages++;

                     vpQDa = false;

                      RouleteActivity.orphic = "indemonstrably" ;
}
} 
 else 
 {        RouleteActivity.siclari = "";
}}
 else if 
 ( RouleteActivity.teleports 
) 
 {        if ( RouleteActivity.antihierarchic != null) {
            
 if ( RouleteActivity.antihierarchic == null
) 
 {        RouleteActivity.schleswig = "calceamentums" ;
}
 else if 
 (7 < RouleteActivity.churchmanships
) 
 {        RouleteActivity.orphic = "pulsers" ;
} 
 else 
 {        RouleteActivity.rebarbarization = 10;
}
            } else {
                    RouleteActivity.enrages--;
}



} 
 else 
 {        if ( RouleteActivity.schleswig == null
) {
                    RouleteActivity.churchmanships = 6;

            } else {
                    RouleteActivity.rebarbarization++;
}



}}
 else if 
 (12 > RouleteActivity.enrages
) 
 {
 if (! vpQDa 
) 
 {        if (! RouleteActivity.aventails 
) {
                    if (RouleteActivity.enrages <= 12

) {
                    RouleteActivity.antihierarchic = "";

                     RouleteActivity.rebarbarization = 1;


                      RouleteActivity.orphic = "";
}

            } else {
                    ++RouleteActivity.levitate;
}



}
 else if 
 ( RouleteActivity.modellings != null) 
 {        if (RouleteActivity.churchmanships <= RouleteActivity.churchmanships

) {
                    RouleteActivity.enrages++;

                     RouleteActivity.modellings = "refamiliarization" ;

                      ++RouleteActivity.levitate;
}
} 
 else 
 {        RouleteActivity.modellings = "windores" ;
}} 
 else 
 {        if ( RouleteActivity.modellings != null) {
                    if (! RouleteActivity.ghastly 
) {
                    RouleteActivity.churchmanships++;

                     RouleteActivity.siclari = "Verla" ;

                      RouleteActivity.antihierarchic = "Herbart" ;
}

                     RouleteActivity.modellings = "synthesism" ;

                      RouleteActivity.schleswig = "";
}
}}
 else if 
 ( RouleteActivity.antihierarchic != null) 
 {
 if (RouleteActivity.enrages == RouleteActivity.enrages
) 
 {
 if ( RouleteActivity.antihierarchic != null) 
 {        if ( RouleteActivity.schleswig == null
) {
                    if (RouleteActivity.rebarbarization < RouleteActivity.levitate

) {
                    ASSsS =  true;

                     RouleteActivity.modellings = "";

                      RouleteActivity.antihierarchic = "diaspirin" ;
}

            } else {
                    RouleteActivity.rebarbarization++;
}



}
 else if 
 (7 != RouleteActivity.rebarbarization
) 
 {        if ( vpQDa 
) {
                    RouleteActivity.churchmanships--;

            } else {
                    ASSsS = true;
}



} 
 else 
 {        vpQDa =  false;
}}
 else if 
 (RouleteActivity.churchmanships <= RouleteActivity.enrages
) 
 {        if (RouleteActivity.enrages <= 2

) {
                    if ( ASSsS 
) {
                    RouleteActivity.orphic = "";

            } else {
                    RouleteActivity.teleports =  true;
}




                     ASSsS = false;

                      RouleteActivity.aventails = true;
}
} 
 else 
 {        if (! RouleteActivity.ghastly 
) {
                    ASSsS = true;

            } else {
                    RouleteActivity.levitate = 0;

}



}} 
 else 
 {        if (RouleteActivity.churchmanships != RouleteActivity.churchmanships
) {
                    if (RouleteActivity.levitate <= 2

) {
            
 if (3 != RouleteActivity.rebarbarization
) 
 {        --RouleteActivity.rebarbarization;
}
 else if 
 (14 > RouleteActivity.churchmanships
) 
 {        RouleteActivity.rebarbarization = 0;

} 
 else 
 {        RouleteActivity.aventails = true;
}
                     RouleteActivity.levitate++;

                      RouleteActivity.antihierarchic = "";
}

            } else {
                    if (RouleteActivity.enrages <= RouleteActivity.levitate
) {
                    RouleteActivity.siclari = "spitz" ;

                     RouleteActivity.levitate = 14;

                      RouleteActivity.orphic = "nonconjugate" ;
}
}



}
 if ( RouleteActivity.ghastly 
) 
 {        if (RouleteActivity.enrages != 13

) {
            
 if ( RouleteActivity.modellings == null
) 
 {        if ( RouleteActivity.antihierarchic != null) {
                    if ( RouleteActivity.antihierarchic == null
) {
                    if ( RouleteActivity.modellings == null
) {
                    RouleteActivity.churchmanships = 13;


                     RouleteActivity.enrages++;

                      RouleteActivity.levitate = 10;
}

            } else {
                    RouleteActivity.antihierarchic = "";
}




             
 if (RouleteActivity.levitate > RouleteActivity.rebarbarization

) 
 {        RouleteActivity.churchmanships++;
}
 else if 
 (RouleteActivity.levitate != 6

) 
 {        RouleteActivity.rebarbarization--;
} 
 else 
 {        RouleteActivity.orphic = "hydrophobias" ;
}
                      RouleteActivity.rebarbarization = 8;

}
}
 else if 
 ( RouleteActivity.schleswig == null
) 
 {        if ( RouleteActivity.siclari == null
) {
            
 if ( RouleteActivity.antihierarchic != null) 
 {        RouleteActivity.levitate++;
}
 else if 
 ( RouleteActivity.siclari != null) 
 {        RouleteActivity.aventails = false;
} 
 else 
 {        ASSsS = false;
}
            } else {
                    RouleteActivity.churchmanships -= 0;

}



} 
 else 
 {        if (RouleteActivity.churchmanships <= RouleteActivity.churchmanships
) {
                    --RouleteActivity.enrages;

            } else {
                    RouleteActivity.levitate = 9;

}



}
            } else {
            
 if (RouleteActivity.churchmanships == RouleteActivity.rebarbarization
) 
 {
 if ( RouleteActivity.antihierarchic == null
) 
 {        if ( RouleteActivity.modellings .toUpperCase().isEmpty() ) {
                    vpQDa = true;

            } else {
                    ++RouleteActivity.churchmanships;
}



}
 else if 
 ( RouleteActivity.orphic .equals("earthmovings") ) 
 {        RouleteActivity.levitate += 4;
} 
 else 
 {        RouleteActivity.enrages++;
}}
 else if 
 (RouleteActivity.levitate < 1

) 
 {        if (RouleteActivity.enrages > RouleteActivity.churchmanships
) {
                    RouleteActivity.churchmanships = 0;


                     RouleteActivity.aventails = ! true;

                      ASSsS = true;
}
} 
 else 
 {        RouleteActivity.antihierarchic = "";
}}



}
 else if 
 ( RouleteActivity.siclari == null
) 
 {        if (RouleteActivity.rebarbarization > RouleteActivity.rebarbarization
) {
                    if (RouleteActivity.rebarbarization == RouleteActivity.levitate
) {
                    if ( RouleteActivity.modellings == null
) {
            
 if (RouleteActivity.levitate <= 10

) 
 {        vpQDa =  true;
}
 else if 
 ( RouleteActivity.schleswig != null) 
 {        RouleteActivity.rebarbarization = 9;

} 
 else 
 {        RouleteActivity.modellings = "spiraculate" ;
}
            } else {
                    ++RouleteActivity.rebarbarization;
}




            } else {
                    if ( RouleteActivity.orphic != null) {
                    RouleteActivity.orphic = "snuffly" ;

                     ++RouleteActivity.churchmanships;

                      ASSsS =  true;
}
}




             
 if ( RouleteActivity.antihierarchic .toLowerCase().equals(RouleteActivity.schleswig) ) 
 {        if ( RouleteActivity.schleswig .contains(RouleteActivity.schleswig) ) {
                    RouleteActivity.rebarbarization++;

                     RouleteActivity.siclari = "";

                      RouleteActivity.rebarbarization--;
}
}
 else if 
 (! ASSsS 
) 
 {        RouleteActivity.aventails =  true;
} 
 else 
 {        RouleteActivity.aventails =  false;
}
              
 if (4 < RouleteActivity.enrages
) 
 {        ASSsS = true;
}
 else if 
 ( RouleteActivity.schleswig == null
) 
 {        RouleteActivity.modellings = "decelerometers" ;
} 
 else 
 {        RouleteActivity.rebarbarization = 10;

}}
} 
 else 
 {
 if (9 == RouleteActivity.enrages
) 
 {        if ( RouleteActivity.schleswig .isEmpty() ) {
                    ASSsS =  true;

            } else {
                    RouleteActivity.siclari = "curtations" ;
}



}
 else if 
 (11 < RouleteActivity.enrages
) 
 {        if (RouleteActivity.churchmanships != 5

) {
                    RouleteActivity.ghastly = false;

            } else {
                    vpQDa = true;
}



} 
 else 
 {        RouleteActivity.enrages = 7;

}}
 if ( RouleteActivity.orphic == null
) 
 {        if (RouleteActivity.churchmanships == RouleteActivity.churchmanships
) {
                    if (! vpQDa 
) {
                    if ( ASSsS 
) {
                    if (! vpQDa 
) {
                    if ( RouleteActivity.schleswig != null) {
                    RouleteActivity.antihierarchic = "involvedly" ;

                     RouleteActivity.rebarbarization--;

                      ASSsS = false;
}

                     --RouleteActivity.churchmanships;

                      RouleteActivity.modellings = "tracheids" ;
}

                     if ( RouleteActivity.siclari != null) {
                    RouleteActivity.siclari = "liquors" ;

                     RouleteActivity.modellings = "gloryless" ;

                      RouleteActivity.churchmanships--;
}

                      ASSsS =  true;
}

                     if ( RouleteActivity.modellings == null
) {
                    if ( RouleteActivity.ghastly 
) {
                    RouleteActivity.orphic = "tintie" ;

            } else {
                    vpQDa =  true;
}




                     ASSsS =  true;

                      RouleteActivity.siclari = "";
}

                      ASSsS =  false;
}

                     if (12 <= RouleteActivity.enrages
) {
                    if ( RouleteActivity.ghastly 
) {
                    RouleteActivity.orphic = "";

            } else {
                    ASSsS = true;
}




            } else {
                    if (RouleteActivity.levitate <= RouleteActivity.levitate
) {
                    RouleteActivity.levitate = 13;

                     RouleteActivity.orphic = "nonappealability" ;

                      RouleteActivity.aventails = ! true;
}
}




                      if (RouleteActivity.rebarbarization == RouleteActivity.enrages
) {
                    if ( RouleteActivity.modellings == null
) {
                    RouleteActivity.schleswig = "";

                     RouleteActivity.churchmanships = 11;


                      RouleteActivity.schleswig = "";
}

            } else {
                    RouleteActivity.antihierarchic = "";
}



}
}
 else if 
 (9 != RouleteActivity.rebarbarization
) 
 {        if (! RouleteActivity.siclari .equals("burps") ) {
                    if ( RouleteActivity.orphic .isEmpty() ) {
                    RouleteActivity.levitate++;

                     if ( RouleteActivity.orphic != null) {
                    RouleteActivity.teleports = false;

            } else {
                    RouleteActivity.enrages--;
}




                      ASSsS = true;
}

            } else {
                    RouleteActivity.enrages = 10;
}



} 
 else 
 {
 if ( RouleteActivity.orphic != null) 
 {
 if ( RouleteActivity.ghastly 
) 
 {        if (RouleteActivity.churchmanships != 12

) {
                    RouleteActivity.rebarbarization--;

                     RouleteActivity.schleswig = "";

                      RouleteActivity.aventails = false;
}
}
 else if 
 ( RouleteActivity.antihierarchic == null
) 
 {        RouleteActivity.orphic = "";
} 
 else 
 {        ASSsS = true;
}}
 else if 
 ( RouleteActivity.teleports 
) 
 {        if (RouleteActivity.levitate > RouleteActivity.enrages
) {
                    RouleteActivity.levitate = 14;

                     RouleteActivity.levitate = 3;

                      RouleteActivity.teleports = true;
}
} 
 else 
 {        RouleteActivity.orphic = "";
}}        if ( RouleteActivity.modellings == null
) {
            
 if (RouleteActivity.levitate > 6

) 
 {        if ( RouleteActivity.antihierarchic == null
) {
                    if ( RouleteActivity.siclari .equals("vestigiary") ) {
                    if ( RouleteActivity.orphic != null) {
                    RouleteActivity.orphic = "monodrame" ;

                     vpQDa = true;

                      RouleteActivity.ghastly = false;
}

                     if (! RouleteActivity.teleports 
) {
                    vpQDa = false;

            } else {
                    ASSsS = true;
}




                      RouleteActivity.antihierarchic = "";
}

             
 if (! RouleteActivity.antihierarchic .isEmpty() ) 
 {        if (RouleteActivity.levitate <= 7

) {
                    RouleteActivity.enrages = 8;


                     RouleteActivity.modellings = "";

                      RouleteActivity.rebarbarization++;
}
}
 else if 
 ( RouleteActivity.siclari != null) 
 {        RouleteActivity.teleports = true;
} 
 else 
 {        RouleteActivity.churchmanships = 9;
}
              
 if (RouleteActivity.enrages != RouleteActivity.enrages
) 
 {        RouleteActivity.churchmanships = 3;
}
 else if 
 ( RouleteActivity.antihierarchic == null
) 
 {        RouleteActivity.churchmanships -= 13;

} 
 else 
 {        RouleteActivity.aventails = ! false;
}}
}
 else if 
 (RouleteActivity.levitate <= RouleteActivity.churchmanships
) 
 {        if (! RouleteActivity.ghastly 
) {
                    if ( RouleteActivity.orphic .contains(RouleteActivity.siclari) ) {
                    if (RouleteActivity.enrages < 3

) {
                    RouleteActivity.rebarbarization = 8;

            } else {
                    RouleteActivity.churchmanships = 8;

}




            } else {
                    RouleteActivity.aventails = ! false;
}




            } else {
                    if ( RouleteActivity.siclari != null) {
                    RouleteActivity.modellings = "";

            } else {
                    --RouleteActivity.churchmanships;
}



}



} 
 else 
 {        if (8 <= RouleteActivity.enrages
) {
                    if ( RouleteActivity.orphic != null) {
                    RouleteActivity.schleswig = "upcoiling" ;

                     RouleteActivity.churchmanships = 9;


                      RouleteActivity.levitate = 1;

}

            } else {
                    --RouleteActivity.levitate;
}



}
                     if (RouleteActivity.rebarbarization <= RouleteActivity.churchmanships

) {
                    if (RouleteActivity.rebarbarization < 4

) {
                    if (RouleteActivity.enrages <= RouleteActivity.churchmanships
) {
                    if (! RouleteActivity.antihierarchic .contains(RouleteActivity.siclari) ) {
                    RouleteActivity.orphic = "";

                     RouleteActivity.siclari = "";

                      RouleteActivity.levitate--;
}

            } else {
                    RouleteActivity.schleswig = "";
}




            } else {
                    RouleteActivity.schleswig = "";
}




                     RouleteActivity.modellings = "kakotopia" ;

                      if (RouleteActivity.churchmanships < 5

) {
                    RouleteActivity.churchmanships = 14;


            } else {
                    vpQDa = true;
}



}

              
 if ( RouleteActivity.antihierarchic == null
) 
 {        RouleteActivity.orphic = "homeless" ;
}
 else if 
 (! vpQDa 
) 
 {        if (RouleteActivity.churchmanships != RouleteActivity.rebarbarization

) {
                    vpQDa =  true;

                     RouleteActivity.rebarbarization = 14;


                      ++RouleteActivity.churchmanships;
}
} 
 else 
 {        RouleteActivity.enrages = 13;
}}
        if (RouleteActivity.levitate <= RouleteActivity.levitate

) {
            
 if (RouleteActivity.levitate <= RouleteActivity.rebarbarization
) 
 {
 if ( RouleteActivity.modellings == null
) 
 {
 if ( RouleteActivity.orphic == null
) 
 {        RouleteActivity.schleswig = "censitaire" ;
}
 else if 
 ( RouleteActivity.orphic .contains("Zanesfield") ) 
 {        if (11 <= RouleteActivity.churchmanships
) {
                    RouleteActivity.levitate++;

            } else {
                    RouleteActivity.antihierarchic = "circumcision" .toLowerCase();
}



} 
 else 
 {        RouleteActivity.aventails = false;
}}
 else if 
 ( vpQDa 
) 
 {        if ( RouleteActivity.antihierarchic != null) {
                    RouleteActivity.modellings = "shawled" ;

            } else {
                    vpQDa = false;
}



} 
 else 
 {        if ( ASSsS 
) {
                    RouleteActivity.orphic = "";

                     RouleteActivity.rebarbarization = 13;

                      ASSsS = false;
}
}}
 else if 
 ( RouleteActivity.modellings == null
) 
 {        if (RouleteActivity.levitate > RouleteActivity.churchmanships

) {
                    if (RouleteActivity.rebarbarization != RouleteActivity.enrages
) {
                    if ( RouleteActivity.teleports 
) {
                    vpQDa =  false;

            } else {
                    ASSsS =  true;
}




                     RouleteActivity.rebarbarization++;

                      RouleteActivity.aventails =  true;
}

                     if ( RouleteActivity.modellings == null
) {
                    RouleteActivity.churchmanships--;

                     RouleteActivity.antihierarchic = "pentaerythritol" ;

                      RouleteActivity.orphic = "";
}

                      ++RouleteActivity.enrages;
}
} 
 else 
 {        if ( vpQDa 
) {
                    RouleteActivity.schleswig = "";

                     RouleteActivity.siclari = "";

                      RouleteActivity.schleswig = "";
}
}
            } else {
                    if (0 != RouleteActivity.rebarbarization
) {
                    if ( RouleteActivity.siclari == null
) {
                    if (RouleteActivity.levitate <= RouleteActivity.levitate
) {
                    if ( ASSsS 
) {
                    RouleteActivity.modellings = "";

            } else {
                    vpQDa = true;
}




                     RouleteActivity.schleswig = "dissentiently" ;

                      RouleteActivity.enrages--;
}

            } else {
            
 if ( RouleteActivity.modellings == null
) 
 {        RouleteActivity.levitate = 6;

}
 else if 
 ( RouleteActivity.orphic == null
) 
 {        RouleteActivity.teleports =  true;
} 
 else 
 {        vpQDa = false;
}}




            } else {
                    if (RouleteActivity.levitate < RouleteActivity.rebarbarization
) {
                    if ( RouleteActivity.antihierarchic .equals(RouleteActivity.siclari) ) {
                    RouleteActivity.teleports = true;

            } else {
                    --RouleteActivity.enrages;
}




                     RouleteActivity.orphic = "fucoxanthine" ;

                      RouleteActivity.rebarbarization -= 9;
}
}



}




         
    }

     
    public  void subfigures(boolean EecHo, boolean MxuB7, boolean tApET, boolean MjGJn, int h74gM) {
                if (RouleteActivity.enrages <= RouleteActivity.churchmanships
) {
            
 if (1 < RouleteActivity.rebarbarization
) 
 {
 if ( EecHo 
) 
 {        if (RouleteActivity.churchmanships != h74gM

) {
                    if (1 == h74gM
) {
                    if ( RouleteActivity.schleswig .equals(RouleteActivity.schleswig) ) {
                    RouleteActivity.antihierarchic = "catechutannic" ;

                     RouleteActivity.ghastly = false;

                      RouleteActivity.churchmanships = 6;
}

                     tApET = false;

                      MjGJn =  true;
}

            } else {
                    if ( RouleteActivity.orphic == null
) {
                    RouleteActivity.siclari = "stickled" ;

            } else {
                    RouleteActivity.modellings = "";
}



}



}
 else if 
 (5 != h74gM
) 
 {        tApET = false;
} 
 else 
 {        RouleteActivity.orphic = "";
}}
 else if 
 (RouleteActivity.enrages != 7

) 
 {        if (RouleteActivity.enrages > RouleteActivity.enrages

) {
                    RouleteActivity.modellings = "";

            } else {
                    if (10 != RouleteActivity.churchmanships
) {
                    MjGJn =  true;

            } else {
                    MxuB7 = false;
}



}



} 
 else 
 {        if ( RouleteActivity.schleswig != null) {
                    if (5 == RouleteActivity.enrages
) {
                    EecHo =  false;

            } else {
                    MjGJn = true;
}




            } else {
                    h74gM++;
}



}
                     if ( RouleteActivity.schleswig == null
) {
                    if ( RouleteActivity.orphic == null
) {
                    if (h74gM < h74gM

) {
                    if (RouleteActivity.rebarbarization <= h74gM

) {
                    RouleteActivity.orphic = "overneutralization" ;

                     RouleteActivity.modellings = "prosodics" ;

                      EecHo = ! false;
}

                     RouleteActivity.antihierarchic = "";

                      RouleteActivity.schleswig = "psychoanalysts" ;
}

            } else {
                    RouleteActivity.ghastly = true;
}




             
 if (h74gM <= h74gM
) 
 {        if ( RouleteActivity.siclari != null) {
                    RouleteActivity.modellings = "";

            } else {
                    RouleteActivity.churchmanships = 8;
}



}
 else if 
 (14 == h74gM
) 
 {        RouleteActivity.siclari = "";
} 
 else 
 {        RouleteActivity.modellings = "cucuy" ;
}
              
 if ( tApET 
) 
 {        RouleteActivity.schleswig = "effectualnesses" ;
}
 else if 
 ( RouleteActivity.orphic .isEmpty() ) 
 {        MjGJn = ! false;
} 
 else 
 {        RouleteActivity.schleswig = "";
}}

              
 if (2 != h74gM
) 
 {        if ( RouleteActivity.orphic == null
) {
                    if ( RouleteActivity.orphic == null
) {
                    MxuB7 = true;

                     RouleteActivity.modellings = "";

                      RouleteActivity.schleswig = "";
}

                     h74gM = 12;


                      MjGJn =  true;
}
}
 else if 
 ( MxuB7 
) 
 {        if ( RouleteActivity.orphic == null
) {
                    EecHo = false;

            } else {
                    MjGJn = true;
}



} 
 else 
 {        tApET = ! false;
}}
        if (12 == h74gM
) {
                    if (0 < RouleteActivity.churchmanships
) {
                    if (! RouleteActivity.antihierarchic .contains(RouleteActivity.orphic) ) {
            
 if ( RouleteActivity.siclari .isEmpty() ) 
 {        RouleteActivity.siclari = "agonizer" ;
}
 else if 
 ( RouleteActivity.schleswig .contains(RouleteActivity.siclari) ) 
 {        if ( RouleteActivity.orphic .contains("bougies") ) {
                    h74gM++;

                     h74gM = 1;


                      RouleteActivity.siclari = "paleomammalogy" ;
}
} 
 else 
 {        RouleteActivity.antihierarchic = "";
}
                     h74gM = 10;

                      if (h74gM <= 3

) {
                    ++RouleteActivity.levitate;

            } else {
                    RouleteActivity.levitate--;
}



}

                     if (h74gM != RouleteActivity.rebarbarization

) {
                    if ( RouleteActivity.orphic == null
) {
            
 if ( RouleteActivity.siclari == null
) 
 {        ++h74gM;
}
 else if 
 ( RouleteActivity.antihierarchic .contains(RouleteActivity.antihierarchic) ) 
 {        RouleteActivity.modellings = "Osiride" ;
} 
 else 
 {        RouleteActivity.ghastly = true;
}
                     MxuB7 = true;

                      MjGJn = true;
}

             
 if ( RouleteActivity.orphic .isEmpty() ) 
 {        MjGJn = false;
}
 else if 
 ( RouleteActivity.antihierarchic .equals(RouleteActivity.modellings) ) 
 {        RouleteActivity.enrages = 3;

} 
 else 
 {        MxuB7 =  true;
}
                      h74gM--;
}

                      if (11 <= h74gM
) {
                    RouleteActivity.siclari = "";

                     RouleteActivity.churchmanships++;

                      RouleteActivity.siclari = "booklists" ;
}
}

            } else {
                    if ( RouleteActivity.modellings .equals(RouleteActivity.antihierarchic) ) {
            
 if (RouleteActivity.rebarbarization > RouleteActivity.rebarbarization
) 
 {
 if (RouleteActivity.rebarbarization <= 5

) 
 {        if (RouleteActivity.levitate > h74gM

) {
                    --RouleteActivity.levitate;

            } else {
                    MjGJn = false;
}



}
 else if 
 ( RouleteActivity.schleswig == null
) 
 {        tApET = ! true;
} 
 else 
 {        RouleteActivity.orphic = "unperturbedness" ;
}}
 else if 
 ( MjGJn 
) 
 {        h74gM = 11;
} 
 else 
 {        RouleteActivity.levitate = 2;

}
            } else {
                    if ( EecHo 
) {
                    RouleteActivity.modellings = "Jotham" ;

            } else {
                    h74gM = 4;

}



}



}



        if (h74gM == 0

) {
                    if (RouleteActivity.rebarbarization == RouleteActivity.rebarbarization
) {
                    if (RouleteActivity.rebarbarization == 13

) {
                    if (! MxuB7 
) {
                    if ( MjGJn 
) {
            
 if (RouleteActivity.churchmanships == h74gM
) 
 {        MxuB7 = true;
}
 else if 
 ( EecHo 
) 
 {        ++RouleteActivity.rebarbarization;
} 
 else 
 {        RouleteActivity.ghastly =  true;
}
                     tApET = false;

                      ++h74gM;
}

            } else {
                    MjGJn = true;
}




            } else {
                    if ( RouleteActivity.orphic .equals("awarrant") ) {
                    if ( MjGJn 
) {
                    h74gM--;

                     ++h74gM;

                      RouleteActivity.siclari = "unshapedness" ;
}

            } else {
                    h74gM++;
}



}




            } else {
            
 if (! RouleteActivity.siclari .contains(RouleteActivity.siclari) ) 
 {        if ( tApET 
) {
            
 if ( MxuB7 
) 
 {        RouleteActivity.siclari = "trombiculidae" ;
}
 else if 
 ( RouleteActivity.schleswig .contains("marx") ) 
 {        EecHo = true;
} 
 else 
 {        MxuB7 = false;
}
                     MxuB7 = false;

                      RouleteActivity.ghastly = false;
}
}
 else if 
 ( EecHo 
) 
 {        RouleteActivity.siclari = "lapstrakes" ;
} 
 else 
 {        --h74gM;
}}




            } else {
                    if (RouleteActivity.churchmanships <= RouleteActivity.rebarbarization
) {
                    if ( RouleteActivity.antihierarchic .isEmpty() ) {
                    if ( RouleteActivity.orphic .contains("megalops") ) {
                    if ( RouleteActivity.modellings == null
) {
                    RouleteActivity.orphic = "";

                     tApET = false;

                      RouleteActivity.enrages = 10;
}

            } else {
                    RouleteActivity.orphic = "Slatedale" ;
}




            } else {
                    if ( RouleteActivity.siclari != null) {
                    RouleteActivity.levitate++;

                     h74gM = 12;


                      RouleteActivity.aventails =  true;
}
}




             
 if ( RouleteActivity.orphic == null
) 
 {        if ( RouleteActivity.modellings .equals(RouleteActivity.antihierarchic) ) {
                    RouleteActivity.orphic = "pimpling" ;

            } else {
                    RouleteActivity.teleports = false;
}



}
 else if 
 ( MxuB7 
) 
 {        MxuB7 =  true;
} 
 else 
 {        h74gM--;
}
              
 if ( RouleteActivity.modellings .isEmpty() ) 
 {        RouleteActivity.rebarbarization--;
}
 else if 
 ( RouleteActivity.schleswig != null) 
 {        RouleteActivity.orphic = "chiffchaff" ;
} 
 else 
 {        h74gM++;
}}
}



        if ( RouleteActivity.aventails 
) {
                    if ( MjGJn 
) {
            
 if ( tApET 
) 
 {        if ( RouleteActivity.schleswig != null) {
                    if ( RouleteActivity.siclari != null) {
                    if ( EecHo 
) {
                    MjGJn = false;

            } else {
                    RouleteActivity.levitate++;
}




            } else {
                    h74gM = 14;
}




            } else {
                    --RouleteActivity.enrages;
}



}
 else if 
 ( RouleteActivity.antihierarchic != null) 
 {        if (! RouleteActivity.orphic .contains(RouleteActivity.schleswig) ) {
                    if ( RouleteActivity.antihierarchic != null) {
                    h74gM = 0;


            } else {
                    RouleteActivity.siclari = "";
}




                     RouleteActivity.schleswig = "isoseismic" ;

                      h74gM = 11;

}
} 
 else 
 {        if (h74gM < h74gM

) {
                    tApET = true;

            } else {
                    RouleteActivity.orphic = "";
}



}
             
 if (! RouleteActivity.modellings .equals(RouleteActivity.orphic) ) 
 {        RouleteActivity.teleports = false;
}
 else if 
 ( RouleteActivity.schleswig == null
) 
 {        if ( RouleteActivity.antihierarchic .equals(RouleteActivity.modellings) ) {
                    MxuB7 = true;

            } else {
                    RouleteActivity.orphic = "glimmering" ;
}



} 
 else 
 {        h74gM = 6;
}
              
 if (RouleteActivity.churchmanships != 8

) 
 {        tApET = ! false;
}
 else if 
 ( RouleteActivity.schleswig == null
) 
 {        RouleteActivity.antihierarchic = "";
} 
 else 
 {        ++RouleteActivity.rebarbarization;
}}

             
 if ( RouleteActivity.schleswig != null) 
 {        if ( RouleteActivity.schleswig .isEmpty() ) {
                    RouleteActivity.enrages = 6;


            } else {
                    if (7 > h74gM
) {
                    RouleteActivity.orphic = "reshaper" ;

                     RouleteActivity.antihierarchic = "";

                      tApET = false;
}
}



}
 else if 
 ( RouleteActivity.modellings != null) 
 {        if ( RouleteActivity.modellings == null
) {
                    if (! RouleteActivity.siclari .contains("interminated") ) {
                    RouleteActivity.ghastly =  false;

            } else {
                    RouleteActivity.antihierarchic = "unsharpening" ;
}




                     RouleteActivity.modellings = "maurikigusaris" ;

                      RouleteActivity.orphic = "";
}
} 
 else 
 {        if ( RouleteActivity.schleswig != null) {
                    RouleteActivity.siclari = "";

            } else {
                    h74gM++;
}



}
                      if ( RouleteActivity.antihierarchic .contains(RouleteActivity.antihierarchic) ) {
                    if ( RouleteActivity.orphic == null
) {
                    if (! RouleteActivity.aventails 
) {
                    RouleteActivity.levitate = 9;


                     h74gM++;

                      h74gM = 12;
}

                     RouleteActivity.teleports =  false;

                      tApET = false;
}

            } else {
                    if (h74gM < h74gM
) {
                    MxuB7 = true;

            } else {
                    EecHo = true;
}



}



}
        if (0 > RouleteActivity.levitate
) {
                    if ( RouleteActivity.orphic != null) {
                    if (RouleteActivity.levitate != 9

) {
                    if (! RouleteActivity.siclari .isEmpty() ) {
                    RouleteActivity.orphic = "carbonizers" ;

                     if (RouleteActivity.churchmanships <= h74gM
) {
                    h74gM = 14;

                     RouleteActivity.schleswig = "";

                      MxuB7 =  false;
}

                      RouleteActivity.orphic = "";
}

             
 if ( RouleteActivity.modellings .contains("biometeorologists") ) 
 {        if (! RouleteActivity.orphic .contains(RouleteActivity.modellings) ) {
                    MxuB7 = true;

            } else {
                    h74gM -= 7;
}



}
 else if 
 (! tApET 
) 
 {        RouleteActivity.siclari = "interlotted" ;
} 
 else 
 {        RouleteActivity.antihierarchic = "";
}
                      if (12 != RouleteActivity.churchmanships
) {
                    EecHo = false;

                     RouleteActivity.antihierarchic = "";

                      tApET = true;
}
}

             
 if ( RouleteActivity.antihierarchic .equals(RouleteActivity.modellings) ) 
 {        if ( RouleteActivity.modellings .isEmpty() ) {
                    RouleteActivity.schleswig = "";

            } else {
                    ++RouleteActivity.rebarbarization;
}



}
 else if 
 (! RouleteActivity.orphic .toLowerCase().isEmpty() ) 
 {
 if ( EecHo 
) 
 {        MjGJn = ! false;
}
 else if 
 (h74gM < h74gM
) 
 {        EecHo = false;
} 
 else 
 {        RouleteActivity.antihierarchic = "reentranced" ;
}} 
 else 
 {        RouleteActivity.modellings = "attle" ;
}
                      if ( RouleteActivity.schleswig != null) {
            
 if (0 != RouleteActivity.enrages
) 
 {        ++RouleteActivity.levitate;
}
 else if 
 (RouleteActivity.levitate == 6

) 
 {        h74gM = 9;
} 
 else 
 {        tApET = false;
}
                     EecHo = true;

                      --h74gM;
}
}

                     RouleteActivity.rebarbarization = 2;


              
 if ( RouleteActivity.siclari != null) 
 {        if ( RouleteActivity.orphic != null) {
                    if (RouleteActivity.churchmanships <= RouleteActivity.enrages

) {
                    RouleteActivity.levitate--;

            } else {
                    RouleteActivity.schleswig = "";
}




                     h74gM = 14;


                      tApET =  true;
}
}
 else if 
 ( RouleteActivity.modellings == null
) 
 {        if ( RouleteActivity.antihierarchic != null) {
                    RouleteActivity.ghastly = true;

                     RouleteActivity.siclari = "";

                      RouleteActivity.orphic = "";
}
} 
 else 
 {        h74gM = 2;
}}

         
    }

     
    public  void filamentule(int z4Veo, boolean mbZZk, String kppE0) {
                RouleteActivity.teleports = false;

 if (5 < RouleteActivity.enrages
) 
 {        if ( mbZZk 
) {
                    if ( RouleteActivity.modellings == null
) {
            
 if (RouleteActivity.levitate > z4Veo
) 
 {        if ( RouleteActivity.teleports 
) {
            
 if ( RouleteActivity.antihierarchic != null) 
 {        RouleteActivity.levitate++;
}
 else if 
 (RouleteActivity.levitate > z4Veo

) 
 {        RouleteActivity.schleswig = "";
} 
 else 
 {        kppE0 = "";
}
            } else {
                    z4Veo = 2;
}



}
 else if 
 (RouleteActivity.churchmanships <= z4Veo
) 
 {        if ( RouleteActivity.schleswig != null) {
                    kppE0 = "";

            } else {
                    RouleteActivity.ghastly = true;
}



} 
 else 
 {        RouleteActivity.teleports = false;
}
            } else {
                    if ( RouleteActivity.schleswig .equals("humanistical") ) {
                    if (z4Veo < z4Veo

) {
                    kppE0 = "";

            } else {
                    kppE0 = "";
}




                     --z4Veo;

                      mbZZk = ! false;
}
}




                     RouleteActivity.antihierarchic = "reprint" ;

                      if (z4Veo == 8

) {
                    if ( RouleteActivity.schleswig != null) {
                    ++RouleteActivity.levitate;

            } else {
                    z4Veo--;
}




                     mbZZk = false;

                      mbZZk = false;
}
}
}
 else if 
 (! RouleteActivity.schleswig .isEmpty() ) 
 {        RouleteActivity.churchmanships = 11;
} 
 else 
 {        if ( kppE0 == null
) {
                    mbZZk = false;

                     if (RouleteActivity.churchmanships <= 11

) {
                    z4Veo = 8;


                     z4Veo--;

                      mbZZk = false;
}

                      mbZZk = true;
}
}        if ( RouleteActivity.antihierarchic == null
) {
                    mbZZk = false;

             
 if (RouleteActivity.levitate > z4Veo

) 
 {        kppE0 = "toothstick" ;
}
 else if 
 ( RouleteActivity.modellings != null) 
 {        --z4Veo;
} 
 else 
 {        if ( kppE0 != null) {
                    --z4Veo;

                     RouleteActivity.ghastly = true;

                      mbZZk = true;
}
}
              
 if (RouleteActivity.levitate > 7

) 
 {        if ( RouleteActivity.aventails 
) {
                    if ( RouleteActivity.antihierarchic .isEmpty() ) {
                    ++RouleteActivity.enrages;

            } else {
                    RouleteActivity.modellings = "conversancies" ;
}




            } else {
                    z4Veo = 4;

}



}
 else if 
 ( RouleteActivity.aventails 
) 
 {        if ( kppE0 != null) {
                    RouleteActivity.levitate = 10;

                     RouleteActivity.modellings = "skunkdom" ;

                      kppE0 = "midlegs" ;
}
} 
 else 
 {        mbZZk = false;
}}

 if (RouleteActivity.churchmanships == RouleteActivity.enrages
) 
 {
 if ( RouleteActivity.aventails 
) 
 {        if (1 < z4Veo
) {
                    if ( mbZZk 
) {
            
 if (RouleteActivity.enrages == z4Veo
) 
 {        if (! mbZZk 
) {
                    RouleteActivity.modellings = "";

                     kppE0 = "deforming" ;

                      mbZZk =  true;
}
}
 else if 
 ( RouleteActivity.antihierarchic == null
) 
 {        RouleteActivity.levitate = 0;
} 
 else 
 {        kppE0 = "multiplexity" ;
}
                     RouleteActivity.siclari = "";

                      --RouleteActivity.rebarbarization;
}

            } else {
                    if (z4Veo < z4Veo

) {
            
 if ( kppE0 .contains("Equisetum") ) 
 {        mbZZk = false;
}
 else if 
 ( RouleteActivity.modellings .equals("disprince") ) 
 {        mbZZk =  false;
} 
 else 
 {        mbZZk = false;
}
                     kppE0 = "rechromatograph" ;

                      --z4Veo;
}
}



}
 else if 
 ( RouleteActivity.antihierarchic == null
) 
 {        if ( mbZZk 
) {
                    if ( RouleteActivity.modellings .isEmpty() ) {
                    mbZZk = true;

            } else {
                    kppE0 = "";
}




             
 if (z4Veo <= z4Veo

) 
 {        z4Veo++;
}
 else if 
 ( RouleteActivity.schleswig .trim().isEmpty() ) 
 {        RouleteActivity.rebarbarization++;
} 
 else 
 {        mbZZk = false;
}
                      kppE0 = "";
}
} 
 else 
 {        RouleteActivity.ghastly = true;
}}
 else if 
 (6 < z4Veo
) 
 {        if ( RouleteActivity.modellings == null
) {
                    if ( RouleteActivity.antihierarchic .contains("Ellenville") ) {
                    if ( RouleteActivity.antihierarchic != null) {
                    if ( RouleteActivity.schleswig != null) {
                    kppE0 = "gangplanks" ;

                     mbZZk = ! true;

                      kppE0 = "cofound" ;
}

                     mbZZk = true;

                      kppE0 = "Buttzville" ;
}

            } else {
            
 if (z4Veo < 14

) 
 {        kppE0 = "Vincenzo" ;
}
 else if 
 (! RouleteActivity.orphic .isEmpty() ) 
 {        RouleteActivity.ghastly =  false;
} 
 else 
 {        kppE0 = "entozoologically" ;
}}




                     if (RouleteActivity.churchmanships > RouleteActivity.levitate
) {
            
 if (! kppE0 .contains("recross") ) 
 {        mbZZk = true;
}
 else if 
 (1 == z4Veo
) 
 {        mbZZk = false;
} 
 else 
 {        kppE0 = "areasoner" ;
}
            } else {
                    RouleteActivity.ghastly = true;
}




                      if ( RouleteActivity.siclari != null) {
                    mbZZk =  true;

            } else {
                    mbZZk = ! false;
}



}
} 
 else 
 {        RouleteActivity.ghastly = true;
}        if ( RouleteActivity.schleswig .contains("stoutest") ) {
            
 if (RouleteActivity.churchmanships <= 10

) 
 {        if ( RouleteActivity.antihierarchic != null) {
                    if (! kppE0 .isEmpty() ) {
                    if ( RouleteActivity.siclari == null
) {
                    if ( kppE0 != null) {
                    kppE0 = "individuates" ;

            } else {
                    RouleteActivity.modellings = "";
}




                     mbZZk = false;

                      RouleteActivity.rebarbarization = 0;

}

                     RouleteActivity.levitate = 11;


                      kppE0 = "";
}

            } else {
            
 if (RouleteActivity.rebarbarization <= 6

) 
 {        if (z4Veo != RouleteActivity.rebarbarization
) {
                    z4Veo++;

                     ++z4Veo;

                      RouleteActivity.schleswig = "underleased" ;
}
}
 else if 
 ( RouleteActivity.orphic == null
) 
 {        RouleteActivity.antihierarchic = "nonimmanently" ;
} 
 else 
 {        RouleteActivity.aventails = true;
}}



}
 else if 
 ( RouleteActivity.modellings != null) 
 {        if ( RouleteActivity.siclari .isEmpty() ) {
                    if (z4Veo != RouleteActivity.churchmanships
) {
                    if (! RouleteActivity.aventails 
) {
                    mbZZk =  false;

                     mbZZk = false;

                      z4Veo = 14;
}

                     ++z4Veo;

                      RouleteActivity.aventails = false;
}

             
 if ( mbZZk 
) 
 {        RouleteActivity.orphic = "frigidity" ;
}
 else if 
 (z4Veo <= z4Veo

) 
 {        mbZZk = false;
} 
 else 
 {        z4Veo = 8;

}
                      RouleteActivity.schleswig = "";
}
} 
 else 
 {        z4Veo++;
}
             
 if (z4Veo <= RouleteActivity.levitate

) 
 {
 if (6 <= RouleteActivity.levitate
) 
 {        if (RouleteActivity.churchmanships < RouleteActivity.levitate

) {
                    mbZZk = false;

                     ++z4Veo;

                      RouleteActivity.siclari = "";
}
}
 else if 
 (z4Veo != 4

) 
 {        if ( RouleteActivity.schleswig == null
) {
                    kppE0 = "";

                     kppE0 = "";

                      RouleteActivity.levitate++;
}
} 
 else 
 {        RouleteActivity.modellings = "";
}}
 else if 
 (! mbZZk 
) 
 {        if (z4Veo == z4Veo
) {
                    if ( RouleteActivity.siclari == null
) {
                    mbZZk = true;

            } else {
                    RouleteActivity.enrages = 9;
}




            } else {
                    RouleteActivity.orphic = "ironists" ;
}



} 
 else 
 {        if ( kppE0 == null
) {
                    kppE0 = "AGR" ;

                     RouleteActivity.enrages--;

                      RouleteActivity.teleports = false;
}
}
                      if ( RouleteActivity.schleswig .isEmpty() ) {
                    if ( RouleteActivity.modellings != null) {
                    if ( kppE0 != null) {
                    RouleteActivity.enrages = 14;


            } else {
                    z4Veo = 8;
}




            } else {
                    mbZZk = ! false;
}




            } else {
                    ++z4Veo;
}



}

 if (RouleteActivity.levitate <= RouleteActivity.levitate
) 
 {
 if ( mbZZk 
) 
 {        if (z4Veo < z4Veo

) {
                    if (z4Veo != z4Veo
) {
                    if ( RouleteActivity.antihierarchic .toLowerCase().equals("vampirism") ) {
                    if ( RouleteActivity.antihierarchic != null) {
                    kppE0 = "";

                     z4Veo++;

                      z4Veo = 7;
}

            } else {
                    z4Veo--;
}




             
 if ( mbZZk 
) 
 {        RouleteActivity.levitate--;
}
 else if 
 ( kppE0 != null) 
 {        z4Veo = 8;

} 
 else 
 {        RouleteActivity.schleswig = "donation" ;
}
                      z4Veo = 5;

}

                     if ( mbZZk 
) {
            
 if ( RouleteActivity.schleswig .trim().contains(kppE0) ) 
 {        mbZZk = false;
}
 else if 
 (z4Veo < 14

) 
 {        kppE0 = "Screven" ;
} 
 else 
 {        kppE0 = "";
}
            } else {
                    kppE0 = "";
}




              
 if ( kppE0 != null) 
 {        RouleteActivity.antihierarchic = "semidictatorial" ;
}
 else if 
 ( RouleteActivity.schleswig .equals("cripple") ) 
 {        RouleteActivity.rebarbarization += 4;
} 
 else 
 {        RouleteActivity.churchmanships = 0;

}}
}
 else if 
 (z4Veo == z4Veo

) 
 {        RouleteActivity.siclari = "";
} 
 else 
 {        if (! kppE0 .isEmpty() ) {
                    if ( RouleteActivity.antihierarchic != null) {
                    RouleteActivity.churchmanships = 13;


                     mbZZk = false;

                      ++z4Veo;
}

                     --RouleteActivity.rebarbarization;

                      kppE0 = "";
}
}}
 else if 
 ( kppE0 == null
) 
 {        if ( RouleteActivity.modellings == null
) {
            
 if ( RouleteActivity.schleswig == null
) 
 {        if (z4Veo > RouleteActivity.rebarbarization

) {
                    if (! RouleteActivity.ghastly 
) {
                    RouleteActivity.antihierarchic = "flrie" ;

            } else {
                    mbZZk =  false;
}




                     mbZZk = ! true;

                      mbZZk =  true;
}
}
 else if 
 ( kppE0 .contains(RouleteActivity.schleswig) ) 
 {        if (! kppE0 .contains(kppE0) ) {
                    mbZZk = ! false;

                     mbZZk = true;

                      z4Veo = 2;

}
} 
 else 
 {        RouleteActivity.antihierarchic = "Pellian" ;
}
                     if (! kppE0 .equals(RouleteActivity.orphic) ) {
                    if ( RouleteActivity.ghastly 
) {
                    mbZZk = false;

                     --RouleteActivity.churchmanships;

                      RouleteActivity.aventails = false;
}

                     z4Veo = 9;


                      z4Veo = 13;
}

              
 if (z4Veo == RouleteActivity.churchmanships

) 
 {        RouleteActivity.aventails = true;
}
 else if 
 ( mbZZk 
) 
 {        kppE0 = "isothermobathic" ;
} 
 else 
 {        RouleteActivity.siclari = "rhapsodomancy" ;
}}
} 
 else 
 {        if (11 != z4Veo
) {
            
 if (! RouleteActivity.antihierarchic .equals(RouleteActivity.modellings) ) 
 {
 if ( kppE0 != null) 
 {        kppE0 = "dribblers" ;
}
 else if 
 (RouleteActivity.rebarbarization <= RouleteActivity.enrages
) 
 {        RouleteActivity.aventails = true;
} 
 else 
 {        RouleteActivity.levitate--;
}}
 else if 
 (! RouleteActivity.teleports 
) 
 {        --z4Veo;
} 
 else 
 {        RouleteActivity.rebarbarization = 1;

}
                     if ( mbZZk 
) {
                    RouleteActivity.teleports = false;

            } else {
                    RouleteActivity.enrages--;
}




                      z4Veo = 3;

}
}
         
    }

     
    public  void heterandrous(int iAQka, int uyhcO) {
        
 if ( RouleteActivity.siclari != null) 
 {        if (iAQka > 8

) {
            
 if (uyhcO != RouleteActivity.churchmanships

) 
 {        if ( RouleteActivity.antihierarchic == null
) {
            
 if ( RouleteActivity.ghastly 
) 
 {        if ( RouleteActivity.orphic .contains(RouleteActivity.orphic) ) {
                    iAQka = 8;

            } else {
                    RouleteActivity.modellings = "";
}



}
 else if 
 (! RouleteActivity.ghastly 
) 
 {        RouleteActivity.siclari = "hammermen" ;
} 
 else 
 {        RouleteActivity.orphic = "headstrongly" ;
}
            } else {
                    if (uyhcO > iAQka
) {
                    RouleteActivity.siclari = "";

            } else {
                    RouleteActivity.aventails = ! false;
}



}



}
 else if 
 (uyhcO != iAQka
) 
 {        if ( RouleteActivity.siclari .equals(RouleteActivity.schleswig) ) {
                    RouleteActivity.siclari = "spleenishness" ;

            } else {
                    RouleteActivity.teleports = true;
}



} 
 else 
 {
 if (2 > iAQka
) 
 {        RouleteActivity.ghastly = false;
}
 else if 
 ( RouleteActivity.modellings != null) 
 {        RouleteActivity.orphic = "thelytonic" ;
} 
 else 
 {        RouleteActivity.teleports = ! false;
}}
            } else {
            
 if (3 == iAQka
) 
 {        RouleteActivity.orphic = "";
}
 else if 
 ( RouleteActivity.teleports 
) 
 {        if ( RouleteActivity.antihierarchic == null
) {
                    RouleteActivity.orphic = "felts" ;

                     RouleteActivity.orphic = "Freedom" ;

                      RouleteActivity.ghastly =  true;
}
} 
 else 
 {        RouleteActivity.orphic = "";
}}



}
 else if 
 ( RouleteActivity.aventails 
) 
 {
 if ( RouleteActivity.orphic .isEmpty() ) 
 {        RouleteActivity.siclari = "scientificophilosophical" ;
}
 else if 
 ( RouleteActivity.modellings != null) 
 {        if ( RouleteActivity.schleswig != null) {
                    if ( RouleteActivity.schleswig == null
) {
                    RouleteActivity.teleports = false;

                     RouleteActivity.orphic = "thymectomizing" ;

                      ++iAQka;
}

            } else {
                    RouleteActivity.antihierarchic = "Krieg" ;
}



} 
 else 
 {        if (RouleteActivity.levitate <= RouleteActivity.levitate

) {
                    RouleteActivity.ghastly = true;

                     uyhcO = 8;


                      RouleteActivity.siclari = "wooralis" ;
}
}} 
 else 
 {        RouleteActivity.churchmanships += 10;

}        if ( RouleteActivity.ghastly 
) {
                    uyhcO = 9;

             
 if (uyhcO > iAQka
) 
 {        if (14 == uyhcO
) {
                    if (iAQka <= RouleteActivity.levitate
) {
                    if ( RouleteActivity.modellings == null
) {
                    RouleteActivity.ghastly = false;

            } else {
                    RouleteActivity.ghastly = true;
}




                     --uyhcO;

                      RouleteActivity.aventails = false;
}

                     if (iAQka < 8

) {
                    RouleteActivity.ghastly = false;

                     RouleteActivity.ghastly = false;

                      RouleteActivity.orphic = "";
}

                      --iAQka;
}
}
 else if 
 (iAQka != 1

) 
 {
 if ( RouleteActivity.antihierarchic != null) 
 {
 if ( RouleteActivity.modellings == null
) 
 {        RouleteActivity.modellings = "";
}
 else if 
 (uyhcO <= 1

) 
 {        ++uyhcO;
} 
 else 
 {        uyhcO++;
}}
 else if 
 (RouleteActivity.enrages <= 6

) 
 {        uyhcO++;
} 
 else 
 {        iAQka = 0;

}} 
 else 
 {
 if (RouleteActivity.churchmanships < 13

) 
 {        uyhcO -= 12;
}
 else if 
 ( RouleteActivity.antihierarchic != null) 
 {        uyhcO = 3;
} 
 else 
 {        RouleteActivity.siclari = "";
}}
              
 if ( RouleteActivity.orphic != null) 
 {
 if (uyhcO == 9

) 
 {
 if ( RouleteActivity.modellings .equals(RouleteActivity.antihierarchic) ) 
 {        RouleteActivity.siclari = "deutonymph" ;
}
 else if 
 (8 == iAQka
) 
 {        RouleteActivity.levitate = 4;

} 
 else 
 {        RouleteActivity.schleswig = "rebeguile" ;
}}
 else if 
 ( RouleteActivity.siclari != null) 
 {        RouleteActivity.ghastly = false;
} 
 else 
 {        uyhcO++;
}}
 else if 
 ( RouleteActivity.modellings .contains(RouleteActivity.schleswig) ) 
 {
 if (iAQka <= uyhcO

) 
 {        ++uyhcO;
}
 else if 
 ( RouleteActivity.teleports 
) 
 {        ++uyhcO;
} 
 else 
 {        RouleteActivity.ghastly = false;
}} 
 else 
 {        RouleteActivity.siclari = "";
}}
        if ( RouleteActivity.orphic == null
) {
                    RouleteActivity.aventails =  true;

            } else {
            
 if (RouleteActivity.levitate != RouleteActivity.churchmanships
) 
 {
 if ( RouleteActivity.modellings .contains(RouleteActivity.schleswig) ) 
 {
 if ( RouleteActivity.aventails 
) 
 {        --RouleteActivity.enrages;
}
 else if 
 (RouleteActivity.rebarbarization <= iAQka

) 
 {        RouleteActivity.siclari = "impressa" ;
} 
 else 
 {        RouleteActivity.siclari = "";
}}
 else if 
 ( RouleteActivity.antihierarchic != null) 
 {        if ( RouleteActivity.orphic != null) {
                    RouleteActivity.levitate = 13;

                     RouleteActivity.siclari = "";

                      RouleteActivity.rebarbarization++;
}
} 
 else 
 {        RouleteActivity.orphic = "trilingual" ;
}}
 else if 
 (uyhcO <= RouleteActivity.rebarbarization
) 
 {        RouleteActivity.siclari = "";
} 
 else 
 {        if (RouleteActivity.churchmanships != iAQka
) {
                    iAQka = 11;


            } else {
                    RouleteActivity.aventails = true;
}



}}



        RouleteActivity.antihierarchic = "moronism" ;
        if ( RouleteActivity.ghastly 
) {
            
 if ( RouleteActivity.antihierarchic != null) 
 {        if ( RouleteActivity.modellings .isEmpty() ) {
                    RouleteActivity.schleswig = "Xicaque" ;

            } else {
            
 if (! RouleteActivity.siclari .contains("gossameriness") ) 
 {        if ( RouleteActivity.modellings .equals("polygroove") ) {
                    RouleteActivity.schleswig = "synosteoses" ;

            } else {
                    --RouleteActivity.enrages;
}



}
 else if 
 (RouleteActivity.rebarbarization != 4

) 
 {        RouleteActivity.teleports = false;
} 
 else 
 {        RouleteActivity.siclari = "Hornitos" ;
}}



}
 else if 
 ( RouleteActivity.teleports 
) 
 {        if (iAQka == 0

) {
                    if ( RouleteActivity.aventails 
) {
                    if (uyhcO <= 13

) {
                    RouleteActivity.schleswig = "";

            } else {
                    RouleteActivity.teleports =  false;
}




            } else {
                    RouleteActivity.modellings = "";
}




            } else {
                    uyhcO = 10;
}



} 
 else 
 {        if ( RouleteActivity.siclari != null) {
            
 if ( RouleteActivity.modellings .isEmpty() ) 
 {        RouleteActivity.aventails =  false;
}
 else if 
 ( RouleteActivity.siclari .isEmpty() ) 
 {        RouleteActivity.aventails =  true;
} 
 else 
 {        RouleteActivity.aventails = false;
}
            } else {
                    RouleteActivity.aventails = false;
}



}
            } else {
            
 if (RouleteActivity.rebarbarization == 3

) 
 {        if (RouleteActivity.levitate <= iAQka

) {
            
 if ( RouleteActivity.siclari != null) 
 {        if (! RouleteActivity.aventails 
) {
                    iAQka = 7;

                     uyhcO = 5;

                      RouleteActivity.antihierarchic = "";
}
}
 else if 
 ( RouleteActivity.siclari != null) 
 {        RouleteActivity.teleports =  false;
} 
 else 
 {        RouleteActivity.siclari = "Blighty" ;
}
            } else {
                    if ( RouleteActivity.aventails 
) {
                    iAQka = 9;


                     RouleteActivity.antihierarchic = "vivat" ;

                      RouleteActivity.modellings = "";
}
}



}
 else if 
 ( RouleteActivity.modellings == null
) 
 {        if ( RouleteActivity.modellings == null
) {
                    if (RouleteActivity.churchmanships <= 2

) {
                    iAQka = 10;


                     RouleteActivity.modellings = "";

                      RouleteActivity.siclari = "";
}

            } else {
                    RouleteActivity.teleports = true;
}



} 
 else 
 {
 if ( RouleteActivity.schleswig != null) 
 {        RouleteActivity.schleswig = "undomesticating" ;
}
 else if 
 (iAQka > RouleteActivity.churchmanships

) 
 {        RouleteActivity.antihierarchic = "intellectualistic" ;
} 
 else 
 {        iAQka = 1;
}}}



        if ( RouleteActivity.teleports 
) {
                    if ( RouleteActivity.teleports 
) {
            
 if ( RouleteActivity.modellings == null
) 
 {
 if ( RouleteActivity.antihierarchic == null
) 
 {        if (1 <= iAQka
) {
                    if ( RouleteActivity.antihierarchic != null) {
                    ++uyhcO;

            } else {
                    RouleteActivity.ghastly =  false;
}




                     RouleteActivity.modellings = "";

                      RouleteActivity.orphic = "undergirded" ;
}
}
 else if 
 (uyhcO != uyhcO
) 
 {
 if (RouleteActivity.enrages > iAQka
) 
 {        RouleteActivity.siclari = "agapornis" ;
}
 else if 
 (uyhcO < 3

) 
 {        RouleteActivity.ghastly =  false;
} 
 else 
 {        iAQka = 3;
}} 
 else 
 {        iAQka--;
}}
 else if 
 ( RouleteActivity.modellings .contains("reusableness") ) 
 {        if ( RouleteActivity.ghastly 
) {
                    if (! RouleteActivity.antihierarchic .equals(RouleteActivity.antihierarchic) ) {
                    iAQka++;

                     RouleteActivity.schleswig = "";

                      iAQka--;
}

            } else {
                    RouleteActivity.aventails =  false;
}



} 
 else 
 {        if ( RouleteActivity.aventails 
) {
                    RouleteActivity.teleports =  true;

                     RouleteActivity.antihierarchic = "malodor" ;

                      RouleteActivity.orphic = "";
}
}
                     if ( RouleteActivity.modellings != null) {
                    if ( RouleteActivity.ghastly 
) {
            
 if ( RouleteActivity.antihierarchic != null) 
 {        RouleteActivity.siclari = "";
}
 else if 
 (RouleteActivity.rebarbarization <= 14

) 
 {        ++uyhcO;
} 
 else 
 {        uyhcO = 3;

}
                     RouleteActivity.aventails = true;

                      RouleteActivity.ghastly = true;
}

             
 if ( RouleteActivity.ghastly 
) 
 {        RouleteActivity.orphic = "hyacine" ;
}
 else if 
 ( RouleteActivity.orphic .isEmpty() ) 
 {        RouleteActivity.modellings = "brachymetropia" ;
} 
 else 
 {        RouleteActivity.aventails = true;
}
                      RouleteActivity.aventails = true;
}

                      if ( RouleteActivity.antihierarchic == null
) {
            
 if ( RouleteActivity.antihierarchic != null) 
 {        RouleteActivity.aventails = true;
}
 else if 
 ( RouleteActivity.orphic == null
) 
 {        RouleteActivity.teleports = false;
} 
 else 
 {        iAQka--;
}
            } else {
                    RouleteActivity.antihierarchic = "landfill" ;
}



}

             
 if ( RouleteActivity.orphic != null) 
 {
 if (3 <= uyhcO
) 
 {        if ( RouleteActivity.schleswig == null
) {
                    RouleteActivity.modellings = "masculinists" ;

            } else {
                    RouleteActivity.antihierarchic = "metacymene" ;
}



}
 else if 
 ( RouleteActivity.orphic .isEmpty() ) 
 {        if ( RouleteActivity.siclari == null
) {
                    RouleteActivity.antihierarchic = "";

                     iAQka = 0;

                      ++RouleteActivity.enrages;
}
} 
 else 
 {        RouleteActivity.ghastly = true;
}}
 else if 
 (iAQka > 7

) 
 {        if ( RouleteActivity.antihierarchic .intern().equals("lacrimators") ) {
                    if (! RouleteActivity.antihierarchic .contains("unparenthetical") ) {
                    RouleteActivity.enrages = 2;


            } else {
                    RouleteActivity.ghastly = true;
}




            } else {
                    RouleteActivity.antihierarchic = "Davita" ;
}



} 
 else 
 {        if ( RouleteActivity.modellings != null) {
                    RouleteActivity.modellings = "anaglyptics" ;

                     uyhcO--;

                      RouleteActivity.teleports = true;
}
}
                      if ( RouleteActivity.orphic .contains(RouleteActivity.siclari) ) {
                    if (RouleteActivity.levitate < 14

) {
            
 if (iAQka < iAQka

) 
 {        RouleteActivity.aventails = false;
}
 else if 
 (iAQka <= RouleteActivity.enrages
) 
 {        RouleteActivity.aventails =  false;
} 
 else 
 {        --uyhcO;
}
                     iAQka = 8;

                      RouleteActivity.teleports = false;
}

             
 if ( RouleteActivity.orphic != null) 
 {        RouleteActivity.siclari = "";
}
 else if 
 (9 != uyhcO
) 
 {        RouleteActivity.modellings = "sulfadiazines" ;
} 
 else 
 {        RouleteActivity.teleports = false;
}
                      RouleteActivity.siclari = "noncertainties" ;
}
}

 if (iAQka == 1

) 
 {        RouleteActivity.ghastly = ! false;
}
 else if 
 (RouleteActivity.enrages > 5

) 
 {        if ( RouleteActivity.siclari == null
) {
                    if (0 <= iAQka
) {
                    if ( RouleteActivity.antihierarchic == null
) {
                    if ( RouleteActivity.aventails 
) {
                    iAQka = 4;

                     uyhcO = 11;

                      RouleteActivity.teleports = true;
}

            } else {
                    RouleteActivity.modellings = "axstone" ;
}




            } else {
                    if ( RouleteActivity.schleswig == null
) {
                    RouleteActivity.teleports = false;

            } else {
                    uyhcO += 10;
}



}




                     if (! RouleteActivity.aventails 
) {
                    if (uyhcO < RouleteActivity.rebarbarization

) {
                    RouleteActivity.ghastly =  false;

            } else {
                    uyhcO -= 9;
}




            } else {
                    RouleteActivity.siclari = "";
}




                      if ( RouleteActivity.modellings != null) {
                    RouleteActivity.rebarbarization = 11;


                     RouleteActivity.siclari = "";

                      RouleteActivity.levitate--;
}
}
} 
 else 
 {        if (iAQka != uyhcO

) {
                    if ( RouleteActivity.antihierarchic == null
) {
                    --uyhcO;

                     iAQka = 11;

                      uyhcO++;
}

            } else {
            
 if ( RouleteActivity.orphic != null) 
 {        RouleteActivity.ghastly = false;
}
 else if 
 ( RouleteActivity.aventails 
) 
 {        --uyhcO;
} 
 else 
 {        iAQka = 10;
}}



}
         
    }

     
    public  void miscibility(boolean Kdu6j, boolean yzsQ6, String iIrml, String NBZAh) {
                if (RouleteActivity.enrages > RouleteActivity.rebarbarization
) {
                    if ( RouleteActivity.ghastly 
) {
                    if ( yzsQ6 
) {
            
 if (RouleteActivity.levitate <= RouleteActivity.levitate

) 
 {        if (! RouleteActivity.ghastly 
) {
            
 if ( NBZAh == null
) 
 {        yzsQ6 =  true;
}
 else if 
 (11 != RouleteActivity.rebarbarization
) 
 {        RouleteActivity.ghastly = true;
} 
 else 
 {        Kdu6j = ! true;
}
                     RouleteActivity.siclari = "";

                      RouleteActivity.rebarbarization = 11;

}
}
 else if 
 ( RouleteActivity.antihierarchic .equals("gelatinations") ) 
 {        if ( iIrml != null) {
                    iIrml = "";

                     yzsQ6 =  true;

                      RouleteActivity.enrages++;
}
} 
 else 
 {        RouleteActivity.orphic = "";
}
             
 if (! RouleteActivity.aventails 
) 
 {        if ( RouleteActivity.siclari != null) {
                    RouleteActivity.ghastly = ! true;

            } else {
                    yzsQ6 = true;
}



}
 else if 
 (! RouleteActivity.schleswig .toLowerCase().contains(iIrml) ) 
 {        yzsQ6 = false;
} 
 else 
 {        NBZAh = "idant" ;
}
                      if ( NBZAh != null) {
                    RouleteActivity.orphic = "jingled" ;

                     --RouleteActivity.enrages;

                      NBZAh = "";
}
}

                     if ( NBZAh == null
) {
                    if ( NBZAh .equals("veracious") ) {
                    if (RouleteActivity.enrages == RouleteActivity.churchmanships
) {
                    RouleteActivity.churchmanships = 13;


            } else {
                    yzsQ6 =  false;
}




                     Kdu6j = true;

                      NBZAh = "spermogenesis" ;
}

            } else {
                    if ( iIrml == null
) {
                    RouleteActivity.enrages = 4;

            } else {
                    RouleteActivity.rebarbarization++;
}



}




                      if (RouleteActivity.levitate <= RouleteActivity.levitate

) {
                    if ( RouleteActivity.antihierarchic != null) {
                    iIrml = "";

                     NBZAh = "hooty" ;

                      RouleteActivity.rebarbarization++;
}

                     RouleteActivity.siclari = "";

                      NBZAh = "dovehouse" .toUpperCase();
}
}

            } else {
                    if ( RouleteActivity.siclari != null) {
                    if ( RouleteActivity.ghastly 
) {
            
 if ( iIrml .equals("phosphorite") ) 
 {
 if (RouleteActivity.levitate == 3

) 
 {        yzsQ6 =  false;
}
 else if 
 (RouleteActivity.levitate != RouleteActivity.enrages

) 
 {        RouleteActivity.levitate--;
} 
 else 
 {        RouleteActivity.rebarbarization = 8;
}}
 else if 
 (! iIrml .equals("clabbering") ) 
 {        iIrml = "arsines" ;
} 
 else 
 {        --RouleteActivity.levitate;
}
             
 if ( RouleteActivity.aventails 
) 
 {        yzsQ6 = true;
}
 else if 
 (RouleteActivity.levitate < 8

) 
 {        NBZAh = "";
} 
 else 
 {        Kdu6j = true;
}
                      RouleteActivity.enrages -= 0;
}

                     if ( RouleteActivity.modellings != null) {
            
 if ( iIrml == null
) 
 {        --RouleteActivity.rebarbarization;
}
 else if 
 ( iIrml .isEmpty() ) 
 {        yzsQ6 = true;
} 
 else 
 {        RouleteActivity.enrages = 1;

}
            } else {
                    Kdu6j =  false;
}




                      if ( NBZAh .contains("megalopsia") ) {
                    yzsQ6 = false;

                     iIrml = "Krasner" ;

                      RouleteActivity.churchmanships += 2;
}
}
}




 if (RouleteActivity.enrages <= RouleteActivity.enrages
) 
 {
 if ( iIrml != null) 
 {        if ( RouleteActivity.ghastly 
) {
                    RouleteActivity.orphic = "";

            } else {
                    if ( Kdu6j 
) {
                    if ( iIrml .contains("fumarases") ) {
                    --RouleteActivity.rebarbarization;

                     RouleteActivity.churchmanships -= 12;


                      RouleteActivity.antihierarchic = "";
}

                     Kdu6j = true;

                      NBZAh = "";
}
}



}
 else if 
 (RouleteActivity.rebarbarization > RouleteActivity.levitate
) 
 {        if (! yzsQ6 
) {
                    if ( RouleteActivity.siclari != null) {
                    if (RouleteActivity.rebarbarization <= RouleteActivity.churchmanships

) {
                    RouleteActivity.levitate = 4;


            } else {
                    yzsQ6 = true;
}




            } else {
                    RouleteActivity.siclari = "";
}




            } else {
                    if (RouleteActivity.rebarbarization < RouleteActivity.levitate

) {
                    yzsQ6 = false;

            } else {
                    Kdu6j = true;
}



}



} 
 else 
 {        if (RouleteActivity.churchmanships == 12

) {
            
 if ( NBZAh != null) 
 {        yzsQ6 = true;
}
 else if 
 (! iIrml .equals(NBZAh) ) 
 {        NBZAh = "scrivened" ;
} 
 else 
 {        NBZAh = "";
}
            } else {
                    Kdu6j = false;
}



}}
 else if 
 ( RouleteActivity.schleswig == null
) 
 {
 if (5 > RouleteActivity.levitate
) 
 {        if ( RouleteActivity.schleswig != null) {
                    if ( RouleteActivity.modellings .isEmpty() ) {
                    if (RouleteActivity.churchmanships == RouleteActivity.enrages

) {
                    RouleteActivity.churchmanships = 5;

            } else {
                    RouleteActivity.churchmanships = 8;

}




                     RouleteActivity.enrages += 8;


                      RouleteActivity.ghastly = ! false;
}

                     if ( NBZAh == null
) {
                    Kdu6j =  false;

                     Kdu6j =  false;

                      RouleteActivity.antihierarchic = "";
}

                      iIrml = "";
}
}
 else if 
 (3 <= RouleteActivity.enrages
) 
 {        if ( RouleteActivity.modellings == null
) {
            
 if ( iIrml .contains("humanitian") ) 
 {        RouleteActivity.rebarbarization = 13;
}
 else if 
 ( RouleteActivity.antihierarchic != null) 
 {        RouleteActivity.orphic = "holosteous" ;
} 
 else 
 {        yzsQ6 = false;
}
            } else {
                    RouleteActivity.orphic = "budgerigar" ;
}



} 
 else 
 {        if ( RouleteActivity.orphic == null
) {
                    NBZAh = "";

            } else {
                    Kdu6j = ! false;
}



}} 
 else 
 {
 if (8 <= RouleteActivity.rebarbarization
) 
 {        Kdu6j = false;
}
 else if 
 (9 > RouleteActivity.rebarbarization
) 
 {        if ( yzsQ6 
) {
                    RouleteActivity.enrages++;

                     NBZAh = "";

                      RouleteActivity.rebarbarization--;
}
} 
 else 
 {        RouleteActivity.antihierarchic = "biogeographies" ;
}}        if ( iIrml == null
) {
                    if ( iIrml == null
) {
            
 if ( NBZAh .equals("whippletree") ) 
 {        if (12 != RouleteActivity.enrages
) {
                    if ( NBZAh != null) {
            
 if ( RouleteActivity.siclari != null) 
 {        RouleteActivity.enrages -= 10;
}
 else if 
 ( iIrml .contains("vitiferous") ) 
 {        iIrml = "yoof" ;
} 
 else 
 {        RouleteActivity.schleswig = "";
}
                     iIrml = "";

                      NBZAh = "contemptuousnesses" ;
}

            } else {
                    if (11 <= RouleteActivity.churchmanships
) {
                    yzsQ6 =  true;

                     RouleteActivity.rebarbarization = 8;


                      RouleteActivity.levitate -= 14;

}
}



}
 else if 
 ( RouleteActivity.orphic != null) 
 {        if ( iIrml == null
) {
                    if ( RouleteActivity.orphic != null) {
                    RouleteActivity.rebarbarization = 13;


                     yzsQ6 = false;

                      iIrml = "";
}

            } else {
                    Kdu6j =  true;
}



} 
 else 
 {
 if ( RouleteActivity.antihierarchic .isEmpty() ) 
 {        RouleteActivity.rebarbarization--;
}
 else if 
 ( iIrml == null
) 
 {        ++RouleteActivity.levitate;
} 
 else 
 {        RouleteActivity.churchmanships--;
}}
            } else {
                    if (RouleteActivity.levitate < 14

) {
                    if ( iIrml == null
) {
            
 if ( NBZAh == null
) 
 {        ++RouleteActivity.enrages;
}
 else if 
 ( iIrml != null) 
 {        ++RouleteActivity.levitate;
} 
 else 
 {        iIrml = "straplike" ;
}
                     RouleteActivity.levitate++;

                      yzsQ6 = false;
}

            } else {
            
 if ( RouleteActivity.ghastly 
) 
 {        Kdu6j = true;
}
 else if 
 (2 <= RouleteActivity.churchmanships
) 
 {        RouleteActivity.schleswig = "";
} 
 else 
 {        RouleteActivity.teleports = true;
}}



}




            } else {
            
 if ( RouleteActivity.aventails 
) 
 {        if ( RouleteActivity.modellings != null) {
            
 if (! NBZAh .isEmpty() ) 
 {        if ( RouleteActivity.schleswig .isEmpty() ) {
                    NBZAh = "uncaused" ;

            } else {
                    yzsQ6 =  true;
}



}
 else if 
 (RouleteActivity.rebarbarization <= RouleteActivity.rebarbarization
) 
 {        RouleteActivity.teleports = false;
} 
 else 
 {        iIrml = "";
}
                     iIrml = "sulfonations" ;

                      ++RouleteActivity.enrages;
}
}
 else if 
 ( RouleteActivity.aventails 
) 
 {        if ( iIrml .contains(NBZAh) ) {
                    if ( RouleteActivity.modellings == null
) {
                    yzsQ6 = false;

            } else {
                    NBZAh = "monoenergetic" ;
}




            } else {
                    RouleteActivity.enrages += 1;

}



} 
 else 
 {
 if (! Kdu6j 
) 
 {        RouleteActivity.schleswig = "";
}
 else if 
 (8 <= RouleteActivity.levitate
) 
 {        RouleteActivity.enrages = 5;
} 
 else 
 {        RouleteActivity.rebarbarization = 0;

}}}




 if ( RouleteActivity.aventails 
) 
 {        if ( RouleteActivity.aventails 
) {
                    if (! RouleteActivity.ghastly 
) {
                    if (! Kdu6j 
) {
            
 if (RouleteActivity.churchmanships == RouleteActivity.churchmanships
) 
 {        Kdu6j =  false;
}
 else if 
 ( Kdu6j 
) 
 {        RouleteActivity.enrages--;
} 
 else 
 {        NBZAh = "Ransell" ;
}
             
 if (RouleteActivity.churchmanships <= RouleteActivity.rebarbarization

) 
 {        RouleteActivity.aventails =  false;
}
 else if 
 ( iIrml == null
) 
 {        Kdu6j = false;
} 
 else 
 {        iIrml = "";
}
                      RouleteActivity.modellings = "spacinesses" ;
}

            } else {
            
 if ( RouleteActivity.siclari != null) 
 {        if ( NBZAh == null
) {
                    iIrml = "";

                     RouleteActivity.levitate = 5;


                      RouleteActivity.rebarbarization = 10;

}
}
 else if 
 ( RouleteActivity.antihierarchic != null) 
 {        RouleteActivity.enrages = 12;
} 
 else 
 {        Kdu6j = false;
}}




                     if ( NBZAh .contains(NBZAh) ) {
                    if ( NBZAh .isEmpty() ) {
                    if (RouleteActivity.rebarbarization > RouleteActivity.levitate
) {
                    --RouleteActivity.rebarbarization;

                     iIrml = "minisurveys" ;

                      RouleteActivity.rebarbarization = 2;
}

                     yzsQ6 = false;

                      iIrml = "";
}

            } else {
            
 if ( NBZAh == null
) 
 {        RouleteActivity.orphic = "immunocompromised" ;
}
 else if 
 (RouleteActivity.churchmanships != 1

) 
 {        Kdu6j = false;
} 
 else 
 {        yzsQ6 = false;
}}




              
 if (RouleteActivity.enrages != RouleteActivity.churchmanships

) 
 {        yzsQ6 =  false;
}
 else if 
 ( yzsQ6 
) 
 {        yzsQ6 = true;
} 
 else 
 {        RouleteActivity.schleswig = "";
}}
}
 else if 
 ( iIrml != null) 
 {
 if (RouleteActivity.levitate > RouleteActivity.churchmanships
) 
 {        if ( RouleteActivity.antihierarchic != null) {
            
 if ( NBZAh .contains("admittance") ) 
 {        if ( yzsQ6 
) {
                    Kdu6j = true;

                     Kdu6j = true;

                      RouleteActivity.schleswig = "";
}
}
 else if 
 ( NBZAh != null) 
 {        RouleteActivity.siclari = "redargutive" ;
} 
 else 
 {        Kdu6j = true;
}
            } else {
                    Kdu6j =  true;
}



}
 else if 
 (12 == RouleteActivity.enrages
) 
 {        if (RouleteActivity.churchmanships < RouleteActivity.levitate
) {
            
 if ( yzsQ6 
) 
 {        RouleteActivity.rebarbarization = 11;
}
 else if 
 (! yzsQ6 
) 
 {        Kdu6j =  true;
} 
 else 
 {        iIrml = "liquorishness" ;
}
            } else {
                    RouleteActivity.churchmanships = 14;
}



} 
 else 
 {        if (RouleteActivity.enrages <= RouleteActivity.levitate

) {
                    NBZAh = "";

                     --RouleteActivity.levitate;

                      RouleteActivity.enrages = 8;

}
}} 
 else 
 {
 if (RouleteActivity.churchmanships == RouleteActivity.rebarbarization
) 
 {
 if (4 <= RouleteActivity.churchmanships
) 
 {        if ( RouleteActivity.schleswig == null
) {
                    RouleteActivity.aventails = true;

                     RouleteActivity.rebarbarization = 6;

                      --RouleteActivity.rebarbarization;
}
}
 else if 
 (! RouleteActivity.modellings .contains("chaneling") ) 
 {        ++RouleteActivity.rebarbarization;
} 
 else 
 {        RouleteActivity.enrages = 0;

}}
 else if 
 (RouleteActivity.enrages > RouleteActivity.rebarbarization
) 
 {        if ( RouleteActivity.siclari .toLowerCase().equals(RouleteActivity.modellings) ) {
                    RouleteActivity.aventails = true;

                     NBZAh = "unbereaven" ;

                      RouleteActivity.levitate++;
}
} 
 else 
 {        RouleteActivity.aventails = false;
}}
 if ( RouleteActivity.siclari == null
) 
 {        if ( RouleteActivity.siclari != null) {
            
 if ( NBZAh == null
) 
 {        if (10 != RouleteActivity.churchmanships
) {
            
 if (RouleteActivity.levitate <= 14

) 
 {
 if (12 <= RouleteActivity.enrages
) 
 {        yzsQ6 =  true;
}
 else if 
 ( NBZAh != null) 
 {        --RouleteActivity.churchmanships;
} 
 else 
 {        Kdu6j = true;
}}
 else if 
 ( NBZAh == null
) 
 {        yzsQ6 = false;
} 
 else 
 {        Kdu6j = true;
}
            } else {
                    if (! iIrml .contains(iIrml) ) {
                    RouleteActivity.ghastly = false;

                     RouleteActivity.ghastly =  false;

                      RouleteActivity.levitate--;
}
}



}
 else if 
 ( Kdu6j 
) 
 {        if ( RouleteActivity.antihierarchic != null) {
                    if (RouleteActivity.enrages <= RouleteActivity.enrages

) {
                    Kdu6j = true;

            } else {
                    ++RouleteActivity.rebarbarization;
}




                     RouleteActivity.siclari = "";

                      --RouleteActivity.churchmanships;
}
} 
 else 
 {        if ( iIrml == null
) {
                    NBZAh = "";

            } else {
                    iIrml = "";
}



}
            } else {
            
 if ( RouleteActivity.antihierarchic != null) 
 {        if ( iIrml != null) {
            
 if ( RouleteActivity.modellings .isEmpty() ) 
 {        NBZAh = "";
}
 else if 
 ( Kdu6j 
) 
 {        RouleteActivity.teleports = true;
} 
 else 
 {        NBZAh = "crooning" ;
}
                     Kdu6j = true;

                      --RouleteActivity.enrages;
}
}
 else if 
 (! Kdu6j 
) 
 {
 if ( iIrml .isEmpty() ) 
 {        iIrml = "unprejudice" ;
}
 else if 
 ( iIrml == null
) 
 {        yzsQ6 = true;
} 
 else 
 {        yzsQ6 =  false;
}} 
 else 
 {        RouleteActivity.antihierarchic = "Lzen" .toUpperCase();
}}



}
 else if 
 ( RouleteActivity.siclari == null
) 
 {        if (5 != RouleteActivity.rebarbarization
) {
                    if (RouleteActivity.levitate <= RouleteActivity.enrages
) {
                    if ( RouleteActivity.siclari == null
) {
            
 if ( NBZAh != null) 
 {        NBZAh = "Lisboan" ;
}
 else if 
 (RouleteActivity.rebarbarization != RouleteActivity.rebarbarization

) 
 {        RouleteActivity.aventails =  true;
} 
 else 
 {        Kdu6j = ! true;
}
                     NBZAh = "";

                      RouleteActivity.ghastly =  false;
}

            } else {
                    if (RouleteActivity.enrages < 1

) {
                    RouleteActivity.rebarbarization = 12;


            } else {
                    RouleteActivity.churchmanships = 4;
}



}




             
 if (RouleteActivity.churchmanships <= 1

) 
 {        if ( RouleteActivity.teleports 
) {
                    RouleteActivity.teleports = false;

                     yzsQ6 = true;

                      iIrml = "genevrettes" ;
}
}
 else if 
 (RouleteActivity.rebarbarization > 11

) 
 {        ++RouleteActivity.rebarbarization;
} 
 else 
 {        ++RouleteActivity.churchmanships;
}
              
 if ( iIrml .equals("Coltrane") ) 
 {        yzsQ6 =  true;
}
 else if 
 ( RouleteActivity.modellings .equals("cutaneal") ) 
 {        NBZAh = "Cartland" ;
} 
 else 
 {        RouleteActivity.levitate--;
}}
} 
 else 
 {
 if ( RouleteActivity.antihierarchic != null) 
 {        RouleteActivity.churchmanships = 8;
}
 else if 
 ( yzsQ6 
) 
 {        if (! Kdu6j 
) {
                    yzsQ6 = true;

            } else {
                    yzsQ6 = true;
}



} 
 else 
 {        RouleteActivity.levitate = 11;
}}        if ( NBZAh == null
) {
            
 if (RouleteActivity.enrages == 5

) 
 {        if ( RouleteActivity.modellings == null
) {
                    if ( Kdu6j 
) {
                    if (RouleteActivity.enrages <= 11

) {
                    if ( NBZAh .contains("reillustrate") ) {
                    RouleteActivity.orphic = "";

                     RouleteActivity.antihierarchic = "";

                      yzsQ6 = false;
}

                     ++RouleteActivity.levitate;

                      iIrml = "";
}

            } else {
            
 if ( Kdu6j 
) 
 {        RouleteActivity.churchmanships = 8;

}
 else if 
 ( iIrml != null) 
 {        RouleteActivity.churchmanships++;
} 
 else 
 {        RouleteActivity.levitate = 3;
}}




            } else {
            
 if (! Kdu6j 
) 
 {        if ( NBZAh == null
) {
                    yzsQ6 =  true;

                     yzsQ6 = true;

                      RouleteActivity.teleports = ! false;
}
}
 else if 
 ( RouleteActivity.siclari == null
) 
 {        RouleteActivity.aventails = false;
} 
 else 
 {        RouleteActivity.antihierarchic = "urostomy" ;
}}



}
 else if 
 (9 <= RouleteActivity.churchmanships
) 
 {        if ( iIrml != null) {
                    if ( NBZAh .contains(RouleteActivity.schleswig) ) {
                    if ( iIrml != null) {
                    RouleteActivity.rebarbarization = 4;

            } else {
                    Kdu6j =  false;
}




            } else {
                    --RouleteActivity.enrages;
}




             
 if ( RouleteActivity.antihierarchic != null) 
 {        RouleteActivity.levitate = 4;

}
 else if 
 (1 < RouleteActivity.rebarbarization
) 
 {        RouleteActivity.antihierarchic = "";
} 
 else 
 {        Kdu6j = true;
}
                      NBZAh = "";
}
} 
 else 
 {        if ( iIrml == null
) {
                    RouleteActivity.levitate--;

            } else {
                    iIrml = "";
}



}
            } else {
            
 if ( Kdu6j 
) 
 {        if ( NBZAh != null) {
            
 if ( RouleteActivity.schleswig .toLowerCase().isEmpty() ) 
 {        if ( yzsQ6 
) {
                    iIrml = "profederation" ;

                     iIrml = "";

                      --RouleteActivity.levitate;
}
}
 else if 
 ( iIrml .equals(RouleteActivity.schleswig) ) 
 {        RouleteActivity.churchmanships--;
} 
 else 
 {        --RouleteActivity.churchmanships;
}
             
 if ( RouleteActivity.schleswig .intern().equals(NBZAh) ) 
 {        --RouleteActivity.churchmanships;
}
 else if 
 ( RouleteActivity.modellings .equals(RouleteActivity.siclari) ) 
 {        RouleteActivity.enrages = 9;
} 
 else 
 {        RouleteActivity.siclari = "deftness" ;
}
                      RouleteActivity.churchmanships = 13;

}
}
 else if 
 (10 <= RouleteActivity.enrages
) 
 {        if ( yzsQ6 
) {
                    if ( iIrml != null) {
                    RouleteActivity.churchmanships++;

                     Kdu6j = true;

                      --RouleteActivity.enrages;
}

            } else {
                    RouleteActivity.schleswig = "pyoptysis" ;
}



} 
 else 
 {        ++RouleteActivity.enrages;
}}




         
    }

     
    public  void ophthalmologically(String b183W, boolean ZLfMm, int KioYL, String Ljey9, boolean aQykt) {
                ZLfMm = false;
        if ( RouleteActivity.antihierarchic != null) {
            
 if ( ZLfMm 
) 
 {        if ( RouleteActivity.antihierarchic == null
) {
                    b183W = "";

            } else {
                    if ( RouleteActivity.antihierarchic != null) {
                    if ( RouleteActivity.modellings != null) {
                    b183W = "";

            } else {
                    RouleteActivity.teleports = false;
}




                     ZLfMm = ! true;

                      RouleteActivity.teleports =  true;
}
}



}
 else if 
 (2 < KioYL
) 
 {
 if ( Ljey9 != null) 
 {        if ( RouleteActivity.antihierarchic != null) {
                    if (7 != KioYL
) {
                    b183W = "";

            } else {
                    aQykt = true;
}




                     RouleteActivity.modellings = "technol" ;

                      ZLfMm = false;
}
}
 else if 
 ( RouleteActivity.antihierarchic != null) 
 {
 if ( b183W == null
) 
 {        RouleteActivity.ghastly = false;
}
 else if 
 ( ZLfMm 
) 
 {        KioYL--;
} 
 else 
 {        RouleteActivity.enrages = 9;
}} 
 else 
 {        RouleteActivity.teleports = true;
}} 
 else 
 {        if ( b183W != null) {
                    if (2 <= KioYL
) {
                    Ljey9 = "Meliphagidae" ;

                     KioYL--;

                      KioYL--;
}

                     ZLfMm = false;

                      Ljey9 = "";
}
}
             
 if ( b183W != null) 
 {        KioYL = 5;
}
 else if 
 ( RouleteActivity.modellings .contains(RouleteActivity.siclari) ) 
 {
 if (RouleteActivity.churchmanships == RouleteActivity.levitate

) 
 {
 if (KioYL == RouleteActivity.enrages

) 
 {        --RouleteActivity.levitate;
}
 else if 
 ( b183W != null) 
 {        RouleteActivity.modellings = "invaginated" ;
} 
 else 
 {        RouleteActivity.ghastly = false;
}}
 else if 
 (RouleteActivity.levitate != RouleteActivity.enrages

) 
 {        Ljey9 = "";
} 
 else 
 {        b183W = "outroars" ;
}} 
 else 
 {        if (KioYL > RouleteActivity.enrages
) {
                    RouleteActivity.rebarbarization++;

            } else {
                    ZLfMm = false;
}



}
              
 if (RouleteActivity.rebarbarization != 4

) 
 {
 if (! RouleteActivity.antihierarchic .isEmpty() ) 
 {        if ( aQykt 
) {
                    --RouleteActivity.churchmanships;

                     RouleteActivity.siclari = "";

                      ++KioYL;
}
}
 else if 
 (! RouleteActivity.orphic .contains("inamorata") ) 
 {        ZLfMm =  false;
} 
 else 
 {        RouleteActivity.rebarbarization = 0;

}}
 else if 
 ( Ljey9 .contains(RouleteActivity.orphic) ) 
 {        if ( b183W == null
) {
                    Ljey9 = "";

                     ZLfMm = ! true;

                      ZLfMm = true;
}
} 
 else 
 {        RouleteActivity.levitate++;
}}

         
    }

     }