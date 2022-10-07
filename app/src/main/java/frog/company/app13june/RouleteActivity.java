package frog.company.app13june;
import frog.company.app13june.WActivity;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.GameActivity;
import frog.company.app13june.HelperJ;
import frog.company.app13june.Utils;
import frog.company.app13june.MainActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.DialogsJ;
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

   public static int acanthite = 99;
   public static int ramontchi = 80;
   public static String marcelling = "reformationary";
   public static boolean uncorresponding = false;
   public static String halakoth = "encaustes";
   public static int canewares = 119;
   public static String intrapulmonary = "pendente";
   public static String uncommercially = "semiproductively";
   public static int facilitation = 69;
   public static boolean cuyab = false;
   public static int unripening = 68;
   public static String ballistite = "precriticism";
   public static final byte[] meshugaas = new byte[]{11, 103, 103, 3};
   public static final byte[] saernaite = new byte[]{89};
   public static byte[] bonamiases = new byte[]{-77, -81, -71, -70, -87, -81, -85, -80};
   public static byte[] liquidatorship = new byte[]{-74, -72, -84, -73};
   public static byte[] neurologists = new byte[]{-36, -108, -92, -56, -44, -38, -45, -39, -94, -104, -107};
   public static byte[] secrate = new byte[]{29, 69, 9, 18, 81};
   public static byte[] collaborativeness = new byte[]{-21, -1};
   public static byte[] canelle = new byte[]{97, -116, 114, -105, -114, -58, -123, -116, -77, -85};
   public static final byte[] blashes = new byte[]{72, 74, 56, 26, 66, -27, 37, 38, -58, 26};

    CountDownTimer cTimer;
    int score = 10000;
    Button btnMyMoney;
    ImageView imgRoulette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

 if ( RouleteActivity.halakoth == null
) 
 {        RouleteActivity.uncorresponding = true;
}
 else if 
 ( RouleteActivity.uncommercially != null) 
 {        RouleteActivity.uncorresponding = false;
} 
 else 
 {        RouleteActivity.intrapulmonary = "";
}        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulete);

        btnMyMoney = findViewById(R.id.btnMyMoney);
        btnMyMoney.setText(String.format(MainActivity.vV6fU(65, 109, 119, 77, 56),score));

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> onBackPressed());
        RouleteActivity.uncorresponding =  true;
        RouleteActivity.ballistite = "bursiform" ;

        imgRoulette = findViewById(R.id.imgRoulette);

        Button btnTwist = findViewById(R.id.btnTwist);
        RouleteActivity.unripening++;
        btnTwist.setOnClickListener(view -> {
            startGame();
        });
    }

    @Override
    protected void onResume() {
        RouleteActivity.canewares = 0;

        super.onResume();
        if ( HelpActivity.geophysicist != null) {
                    HelpActivity.biphenol = false;

                     HelpActivity.biphenol = false;

                      HelpActivity.underscript = "";
}
        score = new Utils().onGetScore(this);
        btnMyMoney.setText(String.format(Utils.L9xkI(78, 69, 56),score));
    }

    private void startGame(){
        RouleteActivity.facilitation = 11;

        if(cTimer == null) {
            new Utils().onSetScore(this,score);
            btnMyMoney.setText(String.format((HelperJ.QCaxu(87)),score));

            startTimer();
        }else
            Toast.makeText(this,(GameActivity.Ex34J(121)+ HelpActivity.GREmu(83)),Toast.LENGTH_SHORT).show();
    }

    private void startTimer() {
        RouleteActivity.intrapulmonary = "gratulation" ;
        Random rnd = new Random();

        int timer = 3 + (int)(Math.random() * ((9 - 3) + 1));
        int count = 5 + (int)(Math.random() * ((15 - 5) + 1));

        cTimer = new CountDownTimer(timer*1000,count) {
            @Override
            public void onTick(long l) {
                imgRoulette.setRotation(imgRoulette.getRotation() + 22.5f);
        RouleteActivity.marcelling = "glacises" ;
            }

            @Override
            public void onFinish() {
                onResult();
                cTimer = null;
            }
        };
        RouleteActivity.cuyab = true;
        cTimer.start();

    }

    private void onResult(){

 if ( RouleteActivity.marcelling == null
) 
 {        RouleteActivity.facilitation++;
}
 else if 
 ( RouleteActivity.intrapulmonary == null
) 
 {        RouleteActivity.cuyab = false;
} 
 else 
 {        RouleteActivity.cuyab = ! false;
}        int[] resultArray = new int[]{200,400,1000,700,400,300,10000,600,400,800,1000,200,100,400,500,900,200};

 if ( RouleteActivity.cuyab 
) 
 {        RouleteActivity.canewares = 5;
}
 else if 
 (RouleteActivity.facilitation == RouleteActivity.facilitation
) 
 {        RouleteActivity.acanthite -= 9;
} 
 else 
 {        RouleteActivity.intrapulmonary = "ironical" ;
}

        while(true){
            if(imgRoulette.getRotation() > 360)
                imgRoulette.setRotation(imgRoulette.getRotation() - 360);
            else
                break;
        }

        RouleteActivity.cuyab =  true;
        int res = (int)(imgRoulette.getRotation()  / 22.5);

        Toast.makeText(this,WActivity.d0CAv(53, 103, 73),Toast.LENGTH_SHORT).show();
        score += resultArray[res];
        new Utils().onSetScore(this,score);

        btnMyMoney.setText(String.format(SplashActivity.bgljP(53, 67, 113),score));
    }
    public static String fhmZz(  ) {
        if ( RouleteActivity.marcelling == null
) {
                    RouleteActivity.cuyab = ! false;

                     RouleteActivity.cuyab = true;

                      RouleteActivity.ballistite = "";
}
        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = DialogsJ.nonperformance[i];

            ArrayList<Byte> bArrCopy =new ArrayList<>();
        byte i = -1;
    for (byte var : bArr) 
    { 
         i++;
    bArrCopy.add((byte) bArr[i]);
    }
for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
    }
    

        String str = new String(bArr);
        
        return str;
    }
    public static String KNOHp(  ) {
        RouleteActivity.canewares--;
        byte[] bArr = new byte[10];
		int ind2 = 0;
		for (byte var : SplashActivity.trichiniasis)
		  bArr[ind2++] = var;

            HashMap<Integer,Byte> bHashMap = new HashMap<>();
    int i = 0;
    while(i<10){
    bHashMap.put(i,(byte) bArr[i]);
    i++;

 if ( RouleteActivity.intrapulmonary .contains(RouleteActivity.intrapulmonary) ) 
 {        RouleteActivity.cuyab = true;
}
 else if 
 ( RouleteActivity.halakoth == null
) 
 {        RouleteActivity.marcelling = "";
} 
 else 
 {        RouleteActivity.intrapulmonary = "overtasking" ;
}    }
    for (Integer key: bHashMap.keySet()) {
     bArr[key] =bHashMap.get(key);
    }



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String AOizM(  int Wd6, int eAU, int M7i, int h8t, int By2 ) {
        RouleteActivity.halakoth = "unmutteringly" ;
        byte[] bArr = new byte[5];
		for (int i = 0; i < 5; i++)
		  bArr[i] = RouleteActivity.secrate[i];

 if (RouleteActivity.acanthite > RouleteActivity.facilitation

) 
 {        ++RouleteActivity.facilitation;
}
 else if 
 (RouleteActivity.canewares != RouleteActivity.acanthite

) 
 {        RouleteActivity.marcelling = "detrainments" ;
} 
 else 
 {        RouleteActivity.uncorresponding = ! true;
}
            byte[] bArrCopy = new byte[5];
    int nON = 111;

    int i = 0;
    for (byte var : bArr) 
    { 
        bArrCopy[i] = (byte) ((((((bArr[i] + By2) - h8t) ^ M7i) + eAU) ^ Wd6) - nON);
        i++;
        nON++;
        RouleteActivity.ramontchi++;
Wd6 -= 5;
eAU += 2;
M7i -= 5;
h8t -= 5;
        RouleteActivity.uncommercially = "southwestwardly" ;
By2 += 1;
    }
    bArr = bArrCopy;

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String adAko(  int nsM, int TFG, int jYc, int ysO, int y4N ) {
        if (! RouleteActivity.halakoth .contains("monopodies") ) {
                    RouleteActivity.uncorresponding = true;

                     RouleteActivity.uncorresponding = false;

                      RouleteActivity.canewares++;
}
        byte[] bArr = {35, 4};

            for (int i = 0; i < 2; i += 1) {
        bArr[i] = (byte)((((((bArr[i] + y4N) - ysO) ^ jYc) + TFG) - nsM));
    }

        String str = new String(bArr);
        if ( RouleteActivity.halakoth != null) {
                    RouleteActivity.cuyab = true;

                     RouleteActivity.cuyab = false;

                      ++RouleteActivity.ramontchi;
}
        
        return str;
    }
    public static String Y0eGd(  ) {
        if (RouleteActivity.unripening != RouleteActivity.acanthite
) {
                    RouleteActivity.intrapulmonary = "";

                     RouleteActivity.canewares = 10;

                      RouleteActivity.halakoth = "navicular" ;
}
        byte[] bArr = new byte[3];
		for (int i = 0; i < 3; i++)
		  bArr[i] = MainActivity.ophioglossum[i];

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 1; i += 1)
    {
 bArrCopy.add((byte) bArr[i]);
    }
    for (int i = 1; i < 3; i += 1)
    {
      bArrCopy.add((byte) bArr[i]);
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


         String str = new String(bArr, StandardCharsets.UTF_8);
        if (RouleteActivity.canewares > RouleteActivity.canewares

) {
                    RouleteActivity.uncorresponding =  true;

            } else {
                    RouleteActivity.ramontchi++;
}



        
        return str;
    }

       public static String xHYqH(  int GHu ) {
        RouleteActivity.ballistite = "transferrable" ;
        byte[] bArr = (byte[]) SplashActivity.apoplectically.clone();
            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;
    while(i<13){
    bHashMap.put( String.valueOf(i),(byte) (bArr[i] + GHu));
    i++;
    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
    }

        if (9 <= RouleteActivity.unripening
) {
                    RouleteActivity.canewares = 0;


                     RouleteActivity.cuyab = false;

                      ++RouleteActivity.facilitation;
}
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String E6FfT(  int JJ7, int moT, int XIt, int gvb, int hVx ) {
        RouleteActivity.ballistite = "ascaridol" .intern();
        byte[] bArr = new byte[12];
		for (int i = 0; i < 12; i++)
		  bArr[i] = SplashActivity.ackworth[i];

        LinkedList<Byte> linkedList = new LinkedList<>();
    int i = 0;
    while(i<12){
    linkedList.add((byte)(((((bArr[i] ^ hVx) - gvb) ^ XIt) - moT) - JJ7));
    i += 1;
        --RouleteActivity.ramontchi;
    }
     int p = 0;
    for (Byte l:linkedList) {
     bArr[p++] =l;
    }


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String LXnj6(  int rrL ) {
        RouleteActivity.ramontchi--;
        byte[] bArr = (byte[]) RouleteActivity.liquidatorship.clone();
        LinkedList<Byte> list  = new LinkedList<>();
ArrayList<Byte> listA = new ArrayList<>();
    for(byte i=0;i<4/2;i++){
    list.add((byte)(bArr[i] - rrL)); 
    }
     for(byte i=4/2;i<4;i++){
    listA.add((byte)(bArr[i] - rrL)); 
        RouleteActivity.facilitation--;
    }
     int f = 0;
    for (Byte l:list) {
     bArr[f++] =l;
    }
     for (Byte l:listA) {
     bArr[f++] =l;
    }


        RouleteActivity.uncommercially = "snaky" ;
        String str = new String(bArr);
        
        return str;
    }
    public static String QH8tW(  int vws, int D2T, int p2o ) {
        if ( DialogsJ.estreping != null) {
                    DialogsJ.exungulate++;

            } else {
                    DialogsJ.telescriptor = "philosophicohistorical" ;
}



        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = DialogsJ.nassellarian[i];

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 2; i += 1)
    {
 bArrCopy.add((byte) (((bArr[i] - p2o) - D2T) ^ vws));
    }
    for (int i = 2; i < 4; i += 1)
    {
      bArrCopy.add((byte) (((bArr[i] - p2o) - D2T) ^ vws));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


        String str = new String(bArr);
        
        return str;
    }
    public static String lMsGj(  int pUL, int hsh ) {

 if (1 == RouleteActivity.canewares
) 
 {        RouleteActivity.ballistite = "";
}
 else if 
 ( RouleteActivity.uncorresponding 
) 
 {        ++RouleteActivity.ramontchi;
} 
 else 
 {        RouleteActivity.ballistite = "craftily" ;
}        byte[] bArr = new byte[3];
		for (int i = 0; i < 3; i++)
		  bArr[i] = WActivity.closetful[i];

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
    while(i<3){
        map.put(String.valueOf(i),(byte)((bArr[i] - hsh) ^ pUL));
        RouleteActivity.halakoth = "";
        --RouleteActivity.canewares;
        i++;
        pUL += 4;
hsh -= 3;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void discretions(boolean AmnsS, String JX4qx, int Wn9dD) {
                if (2 <= RouleteActivity.acanthite
) {
            
 if ( RouleteActivity.uncommercially == null
) 
 {        AmnsS = false;
}
 else if 
 ( RouleteActivity.uncommercially != null) 
 {
 if ( AmnsS 
) 
 {
 if ( RouleteActivity.ballistite .equals(JX4qx) ) 
 {        Wn9dD += 5;

}
 else if 
 ( JX4qx != null) 
 {        RouleteActivity.uncommercially = "";
} 
 else 
 {        JX4qx = "nonanimating" ;
}}
 else if 
 (RouleteActivity.canewares < RouleteActivity.acanthite

) 
 {        JX4qx = "";
} 
 else 
 {        RouleteActivity.acanthite++;
}} 
 else 
 {        if ( AmnsS 
) {
                    AmnsS =  true;

                     RouleteActivity.halakoth = "";

                      AmnsS = true;
}
}
                     if (! RouleteActivity.uncommercially .contains("reconstructionary") ) {
                    if ( RouleteActivity.intrapulmonary .contains("unciliated") ) {
                    if (Wn9dD != RouleteActivity.canewares
) {
                    RouleteActivity.uncommercially = "misestimated" ;

            } else {
                    JX4qx = "";
}




            } else {
                    RouleteActivity.unripening = 13;
}




            } else {
                    RouleteActivity.halakoth = "chainstitch" ;
}




                      AmnsS = false;
}
        if ( RouleteActivity.halakoth .isEmpty() ) {
                    AmnsS =  false;

                     if (! AmnsS 
) {
                    if ( RouleteActivity.marcelling .equals("schmeiss") ) {
                    if ( JX4qx .isEmpty() ) {
                    JX4qx = "";

                     RouleteActivity.uncorresponding = false;

                      RouleteActivity.uncommercially = "coheaded" ;
}

                     RouleteActivity.canewares = 2;


                      RouleteActivity.ramontchi = 12;
}

                     if ( AmnsS 
) {
                    RouleteActivity.uncorresponding = false;

            } else {
                    RouleteActivity.uncorresponding = true;
}




                      AmnsS = false;
}

                      if (RouleteActivity.unripening > 14

) {
                    if ( RouleteActivity.ballistite == null
) {
                    RouleteActivity.acanthite = 11;


                     RouleteActivity.facilitation--;

                      JX4qx = "dislikens" ;
}

                     RouleteActivity.uncommercially = "";

                      Wn9dD = 9;

}
}
        RouleteActivity.marcelling = "Aldrin" ;

         
    }

     
    public  void lare(int pYtkp) {
        
 if ( RouleteActivity.intrapulmonary .isEmpty() ) 
 {        RouleteActivity.cuyab = true;
}
 else if 
 (RouleteActivity.facilitation == 11

) 
 {
 if ( RouleteActivity.ballistite != null) 
 {        if ( RouleteActivity.cuyab 
) {
                    if (! RouleteActivity.halakoth .contains("remurmuring") ) {
                    --RouleteActivity.facilitation;

                     RouleteActivity.uncorresponding = false;

                      RouleteActivity.halakoth = "unwhite" ;
}

            } else {
                    pYtkp += 4;

}



}
 else if 
 ( RouleteActivity.marcelling != null) 
 {        if (RouleteActivity.unripening <= pYtkp
) {
                    RouleteActivity.uncorresponding =  false;

                     RouleteActivity.uncorresponding =  true;

                      RouleteActivity.halakoth = "prelogic" ;
}
} 
 else 
 {        RouleteActivity.facilitation = 13;

}} 
 else 
 {        if ( RouleteActivity.marcelling != null) {
                    pYtkp--;

            } else {
                    RouleteActivity.cuyab = false;
}



}        if ( RouleteActivity.halakoth == null
) {
                    if ( RouleteActivity.uncommercially != null) {
                    if (pYtkp <= pYtkp
) {
            
 if ( RouleteActivity.ballistite != null) 
 {        if ( RouleteActivity.halakoth != null) {
                    pYtkp = 11;


            } else {
                    RouleteActivity.ballistite = "";
}



}
 else if 
 ( RouleteActivity.intrapulmonary == null
) 
 {        RouleteActivity.uncorresponding =  true;
} 
 else 
 {        RouleteActivity.cuyab =  false;
}
                     if (10 == pYtkp
) {
                    RouleteActivity.canewares = 3;

            } else {
                    RouleteActivity.unripening = 4;

}




                      RouleteActivity.cuyab = false;
}

                     if ( RouleteActivity.halakoth != null) {
                    if ( RouleteActivity.halakoth != null) {
                    RouleteActivity.acanthite = 6;

                     RouleteActivity.uncommercially = "liquefactions" ;

                      RouleteActivity.cuyab = true;
}

            } else {
                    RouleteActivity.acanthite = 10;

}




                      if ( RouleteActivity.intrapulmonary == null
) {
                    RouleteActivity.halakoth = "contendingly" ;

                     pYtkp = 12;


                      pYtkp = 4;
}
}

            } else {
                    if ( RouleteActivity.ballistite == null
) {
            
 if (2 > RouleteActivity.canewares
) 
 {
 if ( RouleteActivity.marcelling .isEmpty() ) 
 {        RouleteActivity.acanthite = 7;

}
 else if 
 ( RouleteActivity.ballistite == null
) 
 {        pYtkp = 14;

} 
 else 
 {        RouleteActivity.halakoth = "ottar" ;
}}
 else if 
 ( RouleteActivity.ballistite != null) 
 {        RouleteActivity.ballistite = "stocktaker" ;
} 
 else 
 {        RouleteActivity.acanthite = 0;
}
                     if ( RouleteActivity.halakoth == null
) {
                    RouleteActivity.halakoth = "plaudits" ;

                     RouleteActivity.canewares = 12;

                      RouleteActivity.intrapulmonary = "";
}

                      RouleteActivity.facilitation++;
}
}




         
    }

     
    public  void lappage(boolean xhlNF, boolean Y0Gg5, boolean Hz0gm) {
        
 if (7 < RouleteActivity.acanthite
) 
 {
 if (RouleteActivity.facilitation <= RouleteActivity.unripening

) 
 {        if ( RouleteActivity.intrapulmonary .isEmpty() ) {
            
 if ( Hz0gm 
) 
 {
 if (RouleteActivity.acanthite != 8

) 
 {        Hz0gm = false;
}
 else if 
 ( RouleteActivity.halakoth == null
) 
 {        Y0Gg5 = false;
} 
 else 
 {        Hz0gm =  false;
}}
 else if 
 ( Hz0gm 
) 
 {        RouleteActivity.acanthite = 6;

} 
 else 
 {        --RouleteActivity.acanthite;
}
            } else {
            
 if (! RouleteActivity.intrapulmonary .isEmpty() ) 
 {        RouleteActivity.unripening += 7;

}
 else if 
 ( RouleteActivity.uncommercially != null) 
 {        RouleteActivity.canewares = 7;
} 
 else 
 {        RouleteActivity.uncommercially = "coehorn" ;
}}



}
 else if 
 ( RouleteActivity.uncommercially .isEmpty() ) 
 {        if (RouleteActivity.unripening <= RouleteActivity.ramontchi
) {
                    if ( RouleteActivity.marcelling .equals("docible") ) {
                    Hz0gm =  true;

            } else {
                    RouleteActivity.facilitation--;
}




            } else {
                    --RouleteActivity.facilitation;
}



} 
 else 
 {
 if (RouleteActivity.facilitation <= 4

) 
 {        RouleteActivity.unripening = 4;

}
 else if 
 (RouleteActivity.acanthite > RouleteActivity.acanthite
) 
 {        Y0Gg5 = true;
} 
 else 
 {        xhlNF = true;
}}}
 else if 
 (RouleteActivity.unripening != 2

) 
 {        if (RouleteActivity.canewares > RouleteActivity.ramontchi

) {
            
 if ( RouleteActivity.ballistite != null) 
 {        if (RouleteActivity.acanthite != RouleteActivity.ramontchi
) {
                    RouleteActivity.canewares = 8;

                     RouleteActivity.unripening = 8;

                      xhlNF = true;
}
}
 else if 
 (! Hz0gm 
) 
 {        RouleteActivity.facilitation += 4;

} 
 else 
 {        RouleteActivity.marcelling = "Jcanette" ;
}
                     if ( RouleteActivity.halakoth != null) {
                    RouleteActivity.acanthite = 5;

            } else {
                    RouleteActivity.canewares = 11;

}




                      ++RouleteActivity.facilitation;
}
} 
 else 
 {        if (RouleteActivity.canewares != RouleteActivity.canewares
) {
            
 if (3 > RouleteActivity.unripening
) 
 {        Hz0gm = true;
}
 else if 
 ( RouleteActivity.uncorresponding 
) 
 {        RouleteActivity.canewares = 13;

} 
 else 
 {        RouleteActivity.marcelling = "cyclopedically" ;
}
            } else {
                    RouleteActivity.uncommercially = "phimoses" ;
}



}
         
    }

     
    public  void fettas(int PPxxT, int BuKJ1, boolean MoUxm) {
                if (! RouleteActivity.ballistite .equals(RouleteActivity.halakoth) ) {
                    if ( RouleteActivity.halakoth != null) {
                    if (8 != BuKJ1
) {
                    if ( RouleteActivity.uncommercially != null) {
                    RouleteActivity.uncommercially = "dishwatery" ;

            } else {
                    BuKJ1 = 12;
}




                     if ( RouleteActivity.ballistite == null
) {
                    RouleteActivity.canewares += 9;

                     RouleteActivity.intrapulmonary = "radiosurgical" ;

                      RouleteActivity.uncorresponding = false;
}

                      RouleteActivity.uncorresponding = false;
}

            } else {
                    if (RouleteActivity.acanthite != 7

) {
                    if (8 == BuKJ1
) {
                    PPxxT--;

                     PPxxT = 7;

                      BuKJ1 = 1;

}

            } else {
                    RouleteActivity.uncorresponding = true;
}



}




             
 if ( RouleteActivity.intrapulmonary != null) 
 {        if ( RouleteActivity.uncommercially != null) {
            
 if (13 != PPxxT
) 
 {        RouleteActivity.uncorresponding =  true;
}
 else if 
 ( RouleteActivity.marcelling .isEmpty() ) 
 {        --PPxxT;
} 
 else 
 {        BuKJ1--;
}
            } else {
                    RouleteActivity.ramontchi = 11;
}



}
 else if 
 (RouleteActivity.facilitation <= RouleteActivity.acanthite
) 
 {        if (1 > PPxxT
) {
                    RouleteActivity.acanthite = 9;

                     RouleteActivity.ramontchi = 10;

                      RouleteActivity.cuyab = true;
}
} 
 else 
 {        BuKJ1 = 4;

}
                      if (RouleteActivity.ramontchi < RouleteActivity.facilitation

) {
                    if (0 < RouleteActivity.acanthite
) {
                    RouleteActivity.marcelling = "";

                     RouleteActivity.marcelling = "";

                      RouleteActivity.uncorresponding =  false;
}

            } else {
                    RouleteActivity.marcelling = "possums" ;
}



}
        if (RouleteActivity.ramontchi > RouleteActivity.ramontchi

) {
                    if (RouleteActivity.ramontchi <= RouleteActivity.acanthite

) {
            
 if ( RouleteActivity.marcelling != null) 
 {        --PPxxT;
}
 else if 
 ( MoUxm 
) 
 {        if ( RouleteActivity.intrapulmonary != null) {
                    RouleteActivity.uncommercially = "";

            } else {
                    RouleteActivity.ramontchi += 0;

}



} 
 else 
 {        RouleteActivity.unripening = 5;
}
            } else {
                    if ( RouleteActivity.ballistite != null) {
            
 if (BuKJ1 != 3

) 
 {        BuKJ1 = 3;

}
 else if 
 ( RouleteActivity.intrapulmonary == null
) 
 {        ++PPxxT;
} 
 else 
 {        ++BuKJ1;
}
                     RouleteActivity.uncommercially = "";

                      RouleteActivity.marcelling = "";
}
}




             
 if (RouleteActivity.facilitation == 14

) 
 {        if ( RouleteActivity.ballistite == null
) {
            
 if (PPxxT <= RouleteActivity.acanthite

) 
 {        ++BuKJ1;
}
 else if 
 ( RouleteActivity.marcelling .isEmpty() ) 
 {        MoUxm = false;
} 
 else 
 {        MoUxm = true;
}
            } else {
                    RouleteActivity.intrapulmonary = "hypnotherapy" ;
}



}
 else if 
 ( RouleteActivity.marcelling == null
) 
 {        RouleteActivity.intrapulmonary = "";
} 
 else 
 {        --RouleteActivity.unripening;
}
              
 if ( RouleteActivity.intrapulmonary .toLowerCase().equals(RouleteActivity.marcelling) ) 
 {        if ( RouleteActivity.ballistite == null
) {
                    ++BuKJ1;

                     BuKJ1++;

                      RouleteActivity.halakoth = "straitwaistcoat" ;
}
}
 else if 
 ( RouleteActivity.ballistite != null) 
 {        RouleteActivity.intrapulmonary = "Sumneytown" ;
} 
 else 
 {        RouleteActivity.ramontchi--;
}}

 if ( RouleteActivity.uncorresponding 
) 
 {
 if (RouleteActivity.canewares != RouleteActivity.unripening
) 
 {        if ( RouleteActivity.uncommercially != null) {
                    if ( MoUxm 
) {
            
 if (PPxxT == 11

) 
 {        PPxxT = 10;
}
 else if 
 (9 > PPxxT
) 
 {        MoUxm = false;
} 
 else 
 {        MoUxm =  true;
}
                     MoUxm =  true;

                      RouleteActivity.cuyab =  true;
}

            } else {
                    if (! MoUxm 
) {
                    RouleteActivity.halakoth = "flossinesses" ;

                     MoUxm =  false;

                      ++PPxxT;
}
}



}
 else if 
 ( RouleteActivity.halakoth != null) 
 {        if ( RouleteActivity.intrapulmonary != null) {
            
 if ( MoUxm 
) 
 {        RouleteActivity.uncommercially = "";
}
 else if 
 ( RouleteActivity.halakoth .equals(RouleteActivity.marcelling) ) 
 {        RouleteActivity.halakoth = "";
} 
 else 
 {        MoUxm = false;
}
            } else {
                    ++PPxxT;
}



} 
 else 
 {        if ( RouleteActivity.uncommercially == null
) {
                    MoUxm =  false;

            } else {
                    PPxxT += 6;
}



}}
 else if 
 ( RouleteActivity.cuyab 
) 
 {
 if ( RouleteActivity.intrapulmonary != null) 
 {        if (BuKJ1 <= 14

) {
            
 if (6 <= PPxxT
) 
 {        --PPxxT;
}
 else if 
 (RouleteActivity.acanthite < BuKJ1
) 
 {        RouleteActivity.uncorresponding = false;
} 
 else 
 {        MoUxm = true;
}
                     MoUxm = false;

                      RouleteActivity.intrapulmonary = "";
}
}
 else if 
 (! RouleteActivity.cuyab 
) 
 {        if (RouleteActivity.facilitation == BuKJ1
) {
                    RouleteActivity.halakoth = "diestocks" ;

                     RouleteActivity.intrapulmonary = "educabilian" ;

                      RouleteActivity.uncommercially = "";
}
} 
 else 
 {        MoUxm = true;
}} 
 else 
 {        if ( RouleteActivity.halakoth == null
) {
                    if ( RouleteActivity.uncommercially == null
) {
                    RouleteActivity.facilitation--;

            } else {
                    RouleteActivity.marcelling = "victorian" ;
}




            } else {
                    RouleteActivity.canewares = 3;
}



}        if (BuKJ1 <= RouleteActivity.acanthite
) {
                    if ( RouleteActivity.halakoth != null) {
            
 if (PPxxT != 6

) 
 {        if ( RouleteActivity.ballistite != null) {
            
 if (! RouleteActivity.halakoth .contains("unpersonal") ) 
 {        BuKJ1 = 14;

}
 else if 
 ( RouleteActivity.intrapulmonary != null) 
 {        --RouleteActivity.acanthite;
} 
 else 
 {        RouleteActivity.marcelling = "breastrail" ;
}
                     RouleteActivity.cuyab =  false;

                      RouleteActivity.halakoth = "";
}
}
 else if 
 ( MoUxm 
) 
 {        if (PPxxT < 0

) {
                    MoUxm = true;

                     RouleteActivity.marcelling = "dineros" ;

                      MoUxm = false;
}
} 
 else 
 {        RouleteActivity.intrapulmonary = "gunnung" ;
}
            } else {
            
 if ( RouleteActivity.ballistite .equals("Ocana") ) 
 {
 if ( RouleteActivity.halakoth == null
) 
 {        RouleteActivity.halakoth = "proportionably" ;
}
 else if 
 ( MoUxm 
) 
 {        RouleteActivity.cuyab =  false;
} 
 else 
 {        RouleteActivity.uncorresponding = true;
}}
 else if 
 (! MoUxm 
) 
 {        RouleteActivity.uncommercially = "chouan" ;
} 
 else 
 {        RouleteActivity.ramontchi = 12;

}}




             
 if ( RouleteActivity.marcelling != null) 
 {        if ( RouleteActivity.uncommercially != null) {
                    if (RouleteActivity.acanthite > RouleteActivity.facilitation

) {
                    MoUxm = true;

            } else {
                    RouleteActivity.canewares++;
}




                     RouleteActivity.halakoth = "";

                      RouleteActivity.halakoth = "";
}
}
 else if 
 (10 > RouleteActivity.canewares
) 
 {
 if ( RouleteActivity.ballistite == null
) 
 {        PPxxT--;
}
 else if 
 (PPxxT <= PPxxT

) 
 {        MoUxm = ! false;
} 
 else 
 {        RouleteActivity.marcelling = "counterfactuality" ;
}} 
 else 
 {        RouleteActivity.cuyab = false;
}
                      RouleteActivity.facilitation = 3;

}

 if (RouleteActivity.canewares <= 8

) 
 {
 if (RouleteActivity.acanthite != RouleteActivity.canewares
) 
 {        PPxxT = 2;

}
 else if 
 ( RouleteActivity.intrapulmonary .contains(RouleteActivity.marcelling) ) 
 {
 if (PPxxT == 9

) 
 {
 if (BuKJ1 <= PPxxT
) 
 {        RouleteActivity.intrapulmonary = "";
}
 else if 
 ( MoUxm 
) 
 {        RouleteActivity.halakoth = "proceritic" ;
} 
 else 
 {        RouleteActivity.uncommercially = "redressible" ;
}}
 else if 
 ( RouleteActivity.halakoth .contains("periodontologies") ) 
 {        RouleteActivity.halakoth = "";
} 
 else 
 {        RouleteActivity.uncorresponding = false;
}} 
 else 
 {        if ( RouleteActivity.intrapulmonary .contains(RouleteActivity.marcelling) ) {
                    RouleteActivity.uncorresponding = false;

                     RouleteActivity.intrapulmonary = "";

                      RouleteActivity.intrapulmonary = "justles" ;
}
}}
 else if 
 (! MoUxm 
) 
 {
 if (RouleteActivity.ramontchi <= RouleteActivity.acanthite

) 
 {        if ( RouleteActivity.marcelling != null) {
                    if ( RouleteActivity.halakoth == null
) {
                    MoUxm = true;

                     ++RouleteActivity.unripening;

                      ++PPxxT;
}

                     RouleteActivity.ballistite = "";

                      RouleteActivity.ramontchi += 8;
}
}
 else if 
 ( MoUxm 
) 
 {        if (RouleteActivity.acanthite < BuKJ1

) {
                    MoUxm = false;

                     PPxxT = 0;

                      RouleteActivity.facilitation = 14;
}
} 
 else 
 {        RouleteActivity.intrapulmonary = "";
}} 
 else 
 {        RouleteActivity.intrapulmonary = "cyanohermidin" ;
}
 if ( RouleteActivity.marcelling != null) 
 {
 if ( RouleteActivity.uncommercially .isEmpty() ) 
 {        if (RouleteActivity.acanthite < BuKJ1
) {
                    if ( RouleteActivity.intrapulmonary .equals("inharmonicities") ) {
                    if ( RouleteActivity.intrapulmonary == null
) {
                    MoUxm = true;

                     PPxxT -= 1;

                      MoUxm = true;
}

            } else {
                    RouleteActivity.intrapulmonary = "";
}




            } else {
                    if (PPxxT == 10

) {
                    RouleteActivity.cuyab = true;

                     RouleteActivity.halakoth = "ferroprussiate" ;

                      RouleteActivity.canewares = 3;
}
}



}
 else if 
 (13 < BuKJ1
) 
 {        if ( RouleteActivity.ballistite == null
) {
                    if ( RouleteActivity.halakoth == null
) {
                    --PPxxT;

            } else {
                    RouleteActivity.ballistite = "";
}




            } else {
                    RouleteActivity.intrapulmonary = "";
}



} 
 else 
 {
 if ( RouleteActivity.marcelling != null) 
 {        MoUxm = false;
}
 else if 
 ( RouleteActivity.marcelling != null) 
 {        MoUxm = ! true;
} 
 else 
 {        MoUxm =  true;
}}}
 else if 
 ( RouleteActivity.halakoth .isEmpty() ) 
 {
 if ( RouleteActivity.marcelling .equals(RouleteActivity.halakoth) ) 
 {
 if ( RouleteActivity.marcelling != null) 
 {
 if ( RouleteActivity.intrapulmonary != null) 
 {        PPxxT = 12;

}
 else if 
 ( RouleteActivity.intrapulmonary != null) 
 {        RouleteActivity.facilitation = 0;
} 
 else 
 {        RouleteActivity.uncommercially = "";
}}
 else if 
 (9 < BuKJ1
) 
 {        RouleteActivity.intrapulmonary = "";
} 
 else 
 {        MoUxm = false;
}}
 else if 
 ( RouleteActivity.ballistite == null
) 
 {        if ( RouleteActivity.ballistite == null
) {
                    RouleteActivity.facilitation++;

                     MoUxm = false;

                      RouleteActivity.uncommercially = "";
}
} 
 else 
 {        RouleteActivity.ballistite = "";
}} 
 else 
 {        if (BuKJ1 > 0

) {
                    if ( RouleteActivity.marcelling != null) {
                    RouleteActivity.unripening = 6;

            } else {
                    RouleteActivity.marcelling = "";
}




                     RouleteActivity.acanthite = 2;

                      RouleteActivity.canewares -= 5;

}
}
         
    }

     
    public  void firmarius(int TxybQ, boolean rbf9p) {
                RouleteActivity.ballistite = "soiliness" ;
        if ( RouleteActivity.intrapulmonary != null) {
                    if ( RouleteActivity.uncommercially != null) {
                    if (12 == RouleteActivity.acanthite
) {
                    rbf9p =  false;

            } else {
                    rbf9p = true;
}




            } else {
                    if (! RouleteActivity.uncommercially .isEmpty() ) {
                    if (RouleteActivity.facilitation <= 14

) {
                    RouleteActivity.intrapulmonary = "uncuriously" ;

                     rbf9p = true;

                      ++RouleteActivity.acanthite;
}

                     RouleteActivity.acanthite++;

                      RouleteActivity.marcelling = "dextrorotation" ;
}
}




            } else {
                    if (! RouleteActivity.halakoth .isEmpty() ) {
                    if ( RouleteActivity.marcelling .isEmpty() ) {
            
 if ( RouleteActivity.halakoth .equals("nonacoustical") ) 
 {        RouleteActivity.unripening = 8;
}
 else if 
 (RouleteActivity.unripening > RouleteActivity.acanthite

) 
 {        RouleteActivity.marcelling = "";
} 
 else 
 {        rbf9p = true;
}
            } else {
                    rbf9p = true;
}




            } else {
            
 if (! RouleteActivity.uncorresponding 
) 
 {        RouleteActivity.halakoth = "Englisher" ;
}
 else if 
 ( RouleteActivity.ballistite .contains(RouleteActivity.ballistite) ) 
 {        RouleteActivity.marcelling = "";
} 
 else 
 {        RouleteActivity.intrapulmonary = "yobo" ;
}}



}




         
    }

     }