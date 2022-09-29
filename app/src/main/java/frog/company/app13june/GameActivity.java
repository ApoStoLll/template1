package frog.company.app13june;
import frog.company.app13june.GameActivity;
import frog.company.app13june.HelperJ;
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
import frog.company.app13june.DialogsJ;
import frog.company.app13june.Utils;
import frog.company.app13june.Client;
import frog.company.app13june.RouleteActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import frog.company.app13june.databinding.ActivityGameBinding;

public class GameActivity extends AppCompatActivity implements IResultDialog,ISelectCard {

   public static int fractionlet = 65;
   public static int constrainable = 87;
   public static boolean barrelwise = true;
   public static int stithies = 122;
   public static String syriarch = "cluttery";
   public static boolean sedberry = false;
   public static String becrowd = "shewer";
   public static String tartare = "elecampane";
   public static boolean windowsill = true;
   public static boolean acquisitions = true;
   public static int transmissometers = 89;
   public static String guildhall = "interresponsible";
   public static byte[] goatees = new byte[]{37, 30, 17, 18, 28, 21};
   public static byte[] intercrystallize = new byte[]{15, 13, 16, 0};
   public static byte[] unvaporousness = new byte[]{27, 27, 30};
   public static byte[] trebles = new byte[]{-71, -109, -72, -64};
   public static byte[] disassimilate = new byte[]{39, 35, 38, 59};
   public static byte[] winterhain = new byte[]{88, 119, 86, 101, 81, 77, 82, 75, 88, 107};

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GameActivity.stithies = 3;

        super.onCreate(savedInstanceState);
        GameActivity.transmissometers++;

 if (GameActivity.transmissometers != 8

) 
 {        GameActivity.sedberry = true;
}
 else if 
 ( GameActivity.syriarch == null
) 
 {        GameActivity.sedberry = ! false;
} 
 else 
 {        GameActivity.acquisitions =  true;
        if ( GameActivity.guildhall != null) {
                    GameActivity.tartare = "Kavaic" ;

                     GameActivity.tartare = "";

                      GameActivity.tartare = "pyracene" ;
}
}
        binding = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnBet.setOnClickListener(view -> {
            step++;
        GameActivity.syriarch = "interwrapped" ;

            runOnUiThread(() -> {
                switch (step) {
                    case 1: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card4);
                        onAddCard(false);
        GameActivity.windowsill = false;
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy4);
                        onAddCard(true);
        GameActivity.tartare = "";
                    }
                    case 2: {
                        Picasso.get().load(models.get(index).getImg()).into(binding.card5);
                        onAddCard(false);
                        Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy5);
                        onAddCard(true);
        GameActivity.windowsill =  true;

                        onStopGame();
                    }
                    default: step = 0;
                }
            });
        });

        GameActivity.becrowd = "presbyterianizing" ;
        onStartGame();
    }
    private void onStartGame(){
        GameActivity.windowsill = false;
        GameActivity.guildhall = "";
        runOnUiThread(() -> {
            new HelperJ().onSelectCard(this,this);
        });
    }

    private void onStopGame(){
        GameActivity.becrowd = "";
        Client.nonzealousness = 5;


        int myResult = 0;
        GameActivity.sedberry = false;
        int emyResult = 0;
        GameActivity.fractionlet = 13;


        for(Model i : myCard)
            myResult += i.getValue();
        GameActivity.barrelwise = ! true;
        GameActivity.becrowd = "rug" ;

        for(Model i : emyCard)
            emyResult += i.getValue();
        if ( GameActivity.acquisitions 
) {
                    GameActivity.constrainable -= 8;


            } else {
                    GameActivity.guildhall = "Nichiren" ;
}





 if ( GameActivity.becrowd == null
) 
 {        GameActivity.barrelwise = false;
}
 else if 
 ( GameActivity.tartare .isEmpty() ) 
 {        GameActivity.sedberry = true;
} 
 else 
 {        --GameActivity.constrainable;
}        step = 0;
        index = 0;
        models = new ArrayList<>();
        emyCard = new ArrayList<>();
        GameActivity.constrainable++;

 if ( GameActivity.syriarch == null
) 
 {        GameActivity.windowsill = true;
}
 else if 
 ( GameActivity.tartare .equals("pyonephrosis") ) 
 {        GameActivity.transmissometers = 8;
} 
 else 
 {        GameActivity.acquisitions = true;
}        myCard = new ArrayList<>();

        int finalMyResult = myResult;
        int finalEmyResult = emyResult;

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new DialogsJ().dialogResult(this,RouleteActivity.MgZi2(79, 70, 72),this);
            else
                new DialogsJ().dialogResult(this,(Client.YZd5P(66)+Utils.oV81P(105, 69, 87, 66, 52, 70)+DialogsJ.juDxJ(79, 122)+ Utils.QAK9A(48, 98, 79, 74, 48)),this);
        });
    }

    private void onAddCard(Boolean emy){
        if (! GameActivity.syriarch .contains("irreplaceability") ) {
                    GameActivity.fractionlet++;

                     GameActivity.syriarch = "towaway" ;

                      --GameActivity.stithies;
}
        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        if (10 != GameActivity.constrainable
) {
                    GameActivity.acquisitions =  false;

            } else {
                    GameActivity.becrowd = "backlogging" ;
}



        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {
        --GameActivity.fractionlet;
        models = result;
        if ( GameActivity.becrowd .contains("lupeol") ) {
                    GameActivity.windowsill =  true;

            } else {
                    GameActivity.sedberry =  true;
}




        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
            onAddCard(false);
            Picasso.get().load(models.get(index).getImg()).into(binding.card2);
            onAddCard(false);
        GameActivity.becrowd = "pannel" ;
            Picasso.get().load(models.get(index).getImg()).into(binding.card3);
            onAddCard(false);

            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy1);
            onAddCard(true);
        GameActivity.tartare = "";
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy2);
            onAddCard(true);
            Picasso.get().load(models.get(index).getImg()).into(binding.cardEmy3);
            onAddCard(true);
        if ( GameActivity.guildhall != null) {
                    GameActivity.guildhall = "";

                     GameActivity.fractionlet = 5;

                      GameActivity.stithies += 9;
}
        });


        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        GameActivity.barrelwise = true;
        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
                binding.cardEmy2.setImageDrawable(null);
                binding.cardEmy3.setImageDrawable(null);
        GameActivity.sedberry =  true;
                binding.cardEmy4.setImageDrawable(null);
                binding.cardEmy5.setImageDrawable(null);
        GameActivity.becrowd = "";

                binding.card1.setImageDrawable(null);
                binding.card2.setImageDrawable(null);
                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);
        GameActivity.stithies = 0;

                binding.card5.setImageDrawable(null);

                onStartGame();
            }
        });
    }
    public static String AY9nA(  int cze, int K9C ) {
        if ( GameActivity.syriarch .isEmpty() ) {
                    GameActivity.windowsill = false;

            } else {
                    GameActivity.acquisitions = true;
}



        byte[] bArr = new byte[7];
		for (int i = 0; i < 7; i++)
		  bArr[i] = Utils.jayuya[i];

         
       TreeMap<String,Byte> map =new TreeMap<>();
        GameActivity.acquisitions = false;
    int i = 0;
    while(i<7){
        map.put(String.valueOf(i),(byte)((bArr[i] + K9C) ^ cze));
        i++;
        cze += 3;
K9C -= 2;
        GameActivity.acquisitions = false;

        }

    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }

        String str = new String(bArr);
        
        return str;
    }
    public static String WUcxC(  int BX1, int JRt, int QP3, int u8w ) {
        GameActivity.acquisitions = true;
        GameActivity.windowsill = true;
        byte[] bArr = new byte[7];
		for (int i = 0; i < 7; i++)
		  bArr[i] = Utils.basiophitic[i];

         
       TreeMap<String,Byte> map =new TreeMap<>();
    int i = 0;
        GameActivity.tartare = "paynims" ;
    while(i<7){
        map.put(String.valueOf(i),(byte)((((bArr[i] ^ u8w) + QP3) ^ JRt) ^ BX1));
        GameActivity.syriarch = "ingathers" ;
        i++;
        BX1 += 4;
JRt += 3;
QP3 += 5;
        GameActivity.tartare = "scullionship" ;
u8w -= 3;

        }

        if ( GameActivity.becrowd == null
) {
                    GameActivity.becrowd = "neuropathic" ;

            } else {
                    GameActivity.barrelwise = true;
}



    HashSet<String> set=new HashSet<>(map.keySet());

    for (String s:set){
        bArr[Integer.valueOf(s)] = map.get(s);
        }


 if ( GameActivity.windowsill 
) 
 {        GameActivity.barrelwise = false;
}
 else if 
 (GameActivity.transmissometers > GameActivity.constrainable

) 
 {        GameActivity.windowsill = true;
} 
 else 
 {        GameActivity.becrowd = "ammonoid" ;
}        String str = new String(bArr);
        
        return str;
    }
    public static String s83Rp(  int yMU, int fTe ) {
        if (9 < GameActivity.transmissometers
) {
                    GameActivity.syriarch = "";

                     GameActivity.tartare = "";

                      GameActivity.sedberry = true;
}
        byte[] bArr = new byte[5];
		for (int i = 0; i < 5; i++)
		  bArr[i] = DialogsJ.floroscope[i];

            for (int i = bArr.length - 1; i >= 0; i--) 
    {
        bArr[i] = (byte) ((bArr[i] + fTe) - yMU);
        GameActivity.tartare = "toponeurosis" ;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String xGwHv(  int Ess ) {
        GameActivity.stithies = 1;

        byte[] bArr = (byte[]) HelperJ.editorialized.clone();
            int length = 9;
    
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) (bArr[i] ^ Ess);
        length = i2;
        GameActivity.guildhall = "radioanaphylaxis" ;
        Ess += 1;
        i++;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String yPelU(  int em0 ) {
        GameActivity.barrelwise =  false;
        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = GameActivity.disassimilate[i];

        HashMap<Short,String> listMap = new HashMap<>();
LinkedList<Byte> listByte = new LinkedList<>();
    for(short i=0;i<4;i++){
    listMap.put(i,String.valueOf((bArr[i] ^ em0))); 
        if ( GameActivity.guildhall == null
) {
                    GameActivity.windowsill = false;

            } else {
                    GameActivity.tartare = "";
}



    }
      for (Short key: listMap.keySet()) {
listByte.add( Integer.valueOf(listMap.get(key)).byteValue());     
    }
     
     int h = 0;

    while (h<4){
            bArr[h] =listByte.get(h);
            h++;
            }


 if ( GameActivity.sedberry 
) 
 {        GameActivity.tartare = "mistype" ;
}
 else if 
 (5 != GameActivity.constrainable
) 
 {        GameActivity.transmissometers--;
} 
 else 
 {        GameActivity.syriarch = "";
}         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String Qy6Of(  int BQB, int LmQ, int HUJ, int XLY ) {
        GameActivity.acquisitions = false;
        byte[] bArr = {50, 2, 22, 19, 12, 27, 65, 76, 13};

            int length = 9;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        GameActivity.syriarch = "conventuals" ;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((bArr[i] - XLY) - HUJ) ^ LmQ) + BQB);
        if ( GameActivity.guildhall .intern().contains("nonrefracting") ) {
                    GameActivity.stithies = 3;

            } else {
                    ++GameActivity.stithies;
}



        GameActivity.barrelwise = true;
        length = i2;
        i++;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String a36Uo(  int Csg, int nZA, int D18, int F2V, int FWx, int iw7 ) {
        if ( GameActivity.guildhall .intern().equals(GameActivity.becrowd) ) {
                    GameActivity.becrowd = "";

                     GameActivity.syriarch = "tridacnidae" ;

                      GameActivity.transmissometers++;
}
        byte[] bArr = new byte[4];
		for (int i = 0; i < 4; i++)
		  bArr[i] = GameActivity.trebles[i];

         TreeMap<Integer,Byte> map =new TreeMap<>();
         

     int i = 0;
        GameActivity.becrowd = "astatizer" ;
    while(i<4){
        map.put(i,(byte)((((((bArr[i] - iw7) ^ FWx) ^ F2V) - D18) - nZA) - Csg));
        i++;
        Csg += 1;
        if (GameActivity.stithies > GameActivity.constrainable

) {
                    GameActivity.guildhall = "";

            } else {
                    GameActivity.guildhall = "pragmatist" .toLowerCase();
}



nZA -= 4;
        GameActivity.acquisitions = true;
D18 -= 2;
F2V += 3;
FWx -= 4;
iw7 -= 5;
        if ( GameActivity.becrowd == null
) {
                    GameActivity.barrelwise = true;

                     GameActivity.tartare = "";

                      GameActivity.guildhall = "pedatinerved" ;
}

        }

        GameActivity.tartare = "";
        GameActivity.syriarch = "veligerous" ;
    HashSet<Integer> set=new HashSet<>(map.keySet());

    for (Integer s:set){
        bArr[s] = map.get(s);
        }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String oU3tU(  int FtM ) {
        if (GameActivity.transmissometers <= GameActivity.stithies

) {
                    GameActivity.fractionlet++;

                     ++GameActivity.fractionlet;

                      --GameActivity.stithies;
}
        byte[] bArr = {23, 31, 30, 19, 27, 37, 9, 21, 15, 8, 25, 31};

            for (int i = bArr.length - 1; i >= 0; i--) 
    {
        bArr[i] = (byte) (bArr[i] ^ FtM);
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        GameActivity.sedberry =  true;
        
        return str;
    }
    public static String RItPz(  int yHh, int g3y, int jCr ) {
        GameActivity.guildhall = "postpyloric" ;
        GameActivity.transmissometers = 6;
        byte[] bArr = new byte[3];
		for (int i = 0; i < 3; i++)
		  bArr[i] = DialogsJ.preternaturality[i];

            HashMap<String,Byte> bHashMap = new HashMap<>();
    int i = 0;
        GameActivity.becrowd = "Mahometry" ;
    while(i<3){
    bHashMap.put( String.valueOf(i),(byte) (((bArr[i] - jCr) + g3y) + yHh));
    i++;

 if (GameActivity.stithies == 0

) 
 {        GameActivity.stithies--;
}
 else if 
 ( GameActivity.becrowd != null) 
 {        GameActivity.transmissometers++;
} 
 else 
 {        GameActivity.acquisitions = true;
}    }
    
    for (String key: bHashMap.keySet()) {
     bArr[Integer.valueOf(key)] =bHashMap.get(key);
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        if (GameActivity.stithies <= GameActivity.constrainable

) {
                    GameActivity.fractionlet = 6;


                     GameActivity.syriarch = "shackles" ;

                      GameActivity.syriarch = "";
}
        
        return str;
    }

    public  void epididymovasostomy(int laTs3, boolean skCVF) {
        
         
    }

     
    public  void nyctipelagic(boolean dlIH1, String O785c, boolean Zrulv) {
                if (GameActivity.stithies != GameActivity.constrainable

) {
                    if (! O785c .equals(GameActivity.becrowd) ) {
                    if (GameActivity.stithies <= GameActivity.transmissometers

) {
                    if (! GameActivity.windowsill 
) {
                    --GameActivity.stithies;

            } else {
                    GameActivity.constrainable = 7;

}




                     Zrulv = true;

                      Zrulv =  false;
}

            } else {
                    if (GameActivity.stithies <= GameActivity.transmissometers

) {
                    GameActivity.fractionlet = 7;


                     dlIH1 = true;

                      Zrulv = true;
}
}




            } else {
            
 if ( GameActivity.guildhall .equals(GameActivity.guildhall) ) 
 {        if (1 <= GameActivity.transmissometers
) {
                    GameActivity.guildhall = "";

                     GameActivity.stithies--;

                      dlIH1 =  false;
}
}
 else if 
 ( GameActivity.guildhall != null) 
 {        O785c = "lithuanian" ;
} 
 else 
 {        GameActivity.sedberry = false;
}}




         
    }

     
    public  void sauchs(int az6gZ, int sK2ov) {
                if ( GameActivity.becrowd != null) {
                    if (! GameActivity.windowsill 
) {
                    if ( GameActivity.becrowd != null) {
                    if (9 > sK2ov
) {
                    GameActivity.barrelwise =  true;

                     GameActivity.becrowd = "";

                      GameActivity.sedberry = false;
}

            } else {
                    GameActivity.windowsill = false;
}




            } else {
                    if ( GameActivity.syriarch .equals("parathormones") ) {
                    GameActivity.tartare = "";

                     ++az6gZ;

                      GameActivity.acquisitions = false;
}
}




            } else {
                    if (! GameActivity.becrowd .equals("bacteroid") ) {
            
 if (GameActivity.stithies > az6gZ

) 
 {        GameActivity.sedberry =  false;
}
 else if 
 ( GameActivity.guildhall .isEmpty() ) 
 {        --sK2ov;
} 
 else 
 {        GameActivity.becrowd = "Christingles" ;
}
            } else {
                    GameActivity.becrowd = "Bernette" ;
}



}




 if ( GameActivity.syriarch .equals("Pitcairnia") ) 
 {        if (sK2ov == 1

) {
                    if ( GameActivity.guildhall != null) {
            
 if ( GameActivity.guildhall != null) 
 {        ++az6gZ;
}
 else if 
 ( GameActivity.guildhall != null) 
 {        az6gZ = 0;
} 
 else 
 {        GameActivity.windowsill = ! false;
}
                     GameActivity.fractionlet = 13;


                      GameActivity.sedberry =  true;
}

                     if (8 != sK2ov
) {
                    GameActivity.sedberry =  false;

                     GameActivity.guildhall = "scopulae" ;

                      GameActivity.sedberry = true;
}

                      ++az6gZ;
}
}
 else if 
 ( GameActivity.acquisitions 
) 
 {        if ( GameActivity.syriarch == null
) {
                    if (5 <= az6gZ
) {
                    GameActivity.barrelwise = true;

            } else {
                    ++GameActivity.fractionlet;
}




            } else {
                    ++az6gZ;
}



} 
 else 
 {        GameActivity.windowsill = false;
}
 if (GameActivity.stithies < sK2ov
) 
 {        if ( GameActivity.tartare != null) {
                    if ( GameActivity.becrowd == null
) {
                    if ( GameActivity.acquisitions 
) {
                    GameActivity.windowsill = true;

                     GameActivity.syriarch = "triphones" ;

                      az6gZ = 3;
}

            } else {
                    GameActivity.acquisitions = true;
}




                     if ( GameActivity.guildhall .contains("stricture") ) {
                    GameActivity.becrowd = "histiophoroid" ;

                     GameActivity.tartare = "";

                      GameActivity.windowsill = ! false;
}

                      GameActivity.stithies--;
}
}
 else if 
 (0 <= GameActivity.constrainable
) 
 {        if (sK2ov <= GameActivity.stithies

) {
                    GameActivity.guildhall = "";

            } else {
                    sK2ov = 1;

}



} 
 else 
 {        if ( GameActivity.guildhall == null
) {
                    GameActivity.syriarch = "uranometrical" ;

            } else {
                    GameActivity.tartare = "";
}



}
 if ( GameActivity.sedberry 
) 
 {
 if ( GameActivity.barrelwise 
) 
 {        if ( GameActivity.becrowd != null) {
                    if ( GameActivity.tartare != null) {
                    GameActivity.acquisitions = ! true;

            } else {
                    GameActivity.becrowd = "counterincentive" ;
}




                     GameActivity.syriarch = "countenancer" ;

                      sK2ov = 1;

}
}
 else if 
 ( GameActivity.syriarch != null) 
 {
 if (sK2ov < GameActivity.transmissometers

) 
 {        GameActivity.syriarch = "";
}
 else if 
 (sK2ov != GameActivity.transmissometers
) 
 {        az6gZ--;
} 
 else 
 {        GameActivity.tartare = "";
}} 
 else 
 {        az6gZ -= 3;

}}
 else if 
 (GameActivity.constrainable > GameActivity.fractionlet

) 
 {        if (sK2ov < sK2ov

) {
            
 if (3 <= sK2ov
) 
 {        GameActivity.sedberry =  false;
}
 else if 
 (GameActivity.fractionlet < az6gZ
) 
 {        GameActivity.stithies++;
} 
 else 
 {        GameActivity.syriarch = "";
}
            } else {
                    GameActivity.barrelwise = ! false;
}



} 
 else 
 {
 if (! GameActivity.guildhall .contains("Misses") ) 
 {        GameActivity.sedberry = true;
}
 else if 
 ( GameActivity.barrelwise 
) 
 {        GameActivity.acquisitions = ! true;
} 
 else 
 {        GameActivity.guildhall = "traceableness" ;
}}        if ( GameActivity.syriarch != null) {
                    if ( GameActivity.guildhall != null) {
                    if ( GameActivity.tartare == null
) {
                    if ( GameActivity.guildhall == null
) {
                    GameActivity.tartare = "prisal" ;

                     GameActivity.windowsill = true;

                      GameActivity.fractionlet--;
}

                     az6gZ++;

                      GameActivity.guildhall = "philocatholic" ;
}

             
 if ( GameActivity.syriarch .isEmpty() ) 
 {        GameActivity.guildhall = "EPW" ;
}
 else if 
 ( GameActivity.becrowd .contains("subprehensility") ) 
 {        az6gZ = 11;
} 
 else 
 {        az6gZ = 9;
}
                      GameActivity.barrelwise = true;
}

                     if ( GameActivity.syriarch != null) {
            
 if ( GameActivity.syriarch == null
) 
 {        GameActivity.sedberry =  true;
}
 else if 
 ( GameActivity.syriarch != null) 
 {        GameActivity.tartare = "";
} 
 else 
 {        GameActivity.fractionlet = 9;
}
            } else {
                    GameActivity.guildhall = "balminesses" ;
}




                      if (az6gZ == az6gZ
) {
                    GameActivity.fractionlet++;

                     GameActivity.windowsill = false;

                      sK2ov++;
}
}

         
    }

     
    public  void smethe(boolean H3BHU) {
                GameActivity.barrelwise = false;
        GameActivity.windowsill = true;
        if (GameActivity.transmissometers != GameActivity.stithies
) {
                    if (GameActivity.constrainable < 3

) {
            
 if ( GameActivity.tartare .isEmpty() ) 
 {        if ( GameActivity.syriarch .isEmpty() ) {
                    ++GameActivity.stithies;

            } else {
                    GameActivity.guildhall = "";
}



}
 else if 
 (GameActivity.stithies > GameActivity.fractionlet

) 
 {        GameActivity.syriarch = "Watergates" .toLowerCase();
} 
 else 
 {        GameActivity.fractionlet = 3;

}
                     if ( GameActivity.syriarch != null) {
                    H3BHU =  false;

            } else {
                    GameActivity.guildhall = "";
}




                      GameActivity.becrowd = "smectitic" ;
}

            } else {
                    GameActivity.fractionlet = 6;

}




 if ( GameActivity.barrelwise 
) 
 {        if (! GameActivity.becrowd .equals(GameActivity.tartare) ) {
            
 if ( GameActivity.guildhall .contains(GameActivity.becrowd) ) 
 {
 if ( H3BHU 
) 
 {        GameActivity.transmissometers = 11;

}
 else if 
 ( GameActivity.barrelwise 
) 
 {        GameActivity.acquisitions = true;
} 
 else 
 {        H3BHU = true;
}}
 else if 
 (! GameActivity.syriarch .equals(GameActivity.becrowd) ) 
 {        GameActivity.syriarch = "";
} 
 else 
 {        GameActivity.syriarch = "overboastfulness" ;
}
             
 if (GameActivity.stithies == 10

) 
 {        GameActivity.barrelwise =  false;
}
 else if 
 ( GameActivity.windowsill 
) 
 {        GameActivity.sedberry = true;
} 
 else 
 {        GameActivity.becrowd = "";
}
                      H3BHU = ! true;
}
}
 else if 
 ( GameActivity.guildhall == null
) 
 {
 if ( GameActivity.tartare != null) 
 {        if ( GameActivity.tartare .isEmpty() ) {
                    H3BHU =  true;

                     GameActivity.transmissometers = 13;

                      H3BHU = false;
}
}
 else if 
 ( GameActivity.syriarch == null
) 
 {        H3BHU =  true;
} 
 else 
 {        GameActivity.sedberry = false;
}} 
 else 
 {
 if ( GameActivity.syriarch == null
) 
 {        GameActivity.acquisitions = true;
}
 else if 
 (GameActivity.constrainable <= GameActivity.constrainable

) 
 {        GameActivity.syriarch = "";
} 
 else 
 {        GameActivity.syriarch = "Smithton" ;
}}
 if ( GameActivity.syriarch .isEmpty() ) 
 {        if ( GameActivity.guildhall != null) {
                    if ( GameActivity.guildhall != null) {
                    if (GameActivity.constrainable <= GameActivity.transmissometers
) {
                    GameActivity.guildhall = "";

                     H3BHU =  true;

                      GameActivity.guildhall = "incorruptive" ;
}

            } else {
                    --GameActivity.stithies;
}




            } else {
            
 if (GameActivity.constrainable < GameActivity.transmissometers
) 
 {        GameActivity.acquisitions =  false;
}
 else if 
 ( H3BHU 
) 
 {        --GameActivity.transmissometers;
} 
 else 
 {        H3BHU = ! false;
}}



}
 else if 
 (GameActivity.transmissometers > GameActivity.transmissometers
) 
 {        if ( GameActivity.syriarch != null) {
            
 if (GameActivity.fractionlet <= GameActivity.fractionlet
) 
 {        GameActivity.syriarch = "camerist" ;
}
 else if 
 ( GameActivity.guildhall == null
) 
 {        GameActivity.fractionlet++;
} 
 else 
 {        --GameActivity.stithies;
}
            } else {
                    GameActivity.barrelwise = true;
}



} 
 else 
 {        if ( GameActivity.syriarch == null
) {
                    GameActivity.sedberry = true;

                     GameActivity.windowsill = true;

                      GameActivity.transmissometers++;
}
}        if ( GameActivity.becrowd == null
) {
                    GameActivity.fractionlet = 12;

                     if (6 != GameActivity.stithies
) {
                    if ( GameActivity.becrowd == null
) {
                    GameActivity.becrowd = "";

            } else {
                    GameActivity.syriarch = "";
}




            } else {
                    GameActivity.fractionlet++;
}




                      GameActivity.stithies = 13;

}

         
    }

     
    public  void acture(int gQctg, boolean q9w0v, int QqWmC) {
        
 if (! GameActivity.guildhall .equals("Thomastown") ) 
 {
 if (10 <= GameActivity.transmissometers
) 
 {        if ( GameActivity.acquisitions 
) {
                    if ( GameActivity.sedberry 
) {
                    GameActivity.tartare = "condescensions" ;

                     GameActivity.tartare = "";

                      --QqWmC;
}

                     GameActivity.sedberry = true;

                      GameActivity.barrelwise = true;
}
}
 else if 
 (8 == GameActivity.fractionlet
) 
 {        if ( GameActivity.syriarch != null) {
                    q9w0v = true;

                     GameActivity.syriarch = "";

                      gQctg--;
}
} 
 else 
 {        GameActivity.constrainable = 2;
}}
 else if 
 (GameActivity.transmissometers <= 1

) 
 {
 if ( GameActivity.becrowd != null) 
 {        if (3 < gQctg
) {
                    q9w0v = false;

                     q9w0v = ! false;

                      q9w0v = ! true;
}
}
 else if 
 ( GameActivity.guildhall .equals("frontlines") ) 
 {        gQctg = 3;

} 
 else 
 {        q9w0v =  false;
}} 
 else 
 {        GameActivity.becrowd = "";
}
         
    }

     
    public  void calendarization(boolean TFoSZ, String eWxRU) {
                if (! eWxRU .contains("spumiferous") ) {
                    if (GameActivity.constrainable > GameActivity.constrainable

) {
                    GameActivity.windowsill = false;

                     if (GameActivity.stithies > 5

) {
                    eWxRU = "lactifying" .intern();

                     GameActivity.becrowd = "";

                      GameActivity.barrelwise = false;
}

                      TFoSZ = true;
}

                     if (GameActivity.stithies > GameActivity.transmissometers
) {
                    if (GameActivity.fractionlet <= 9

) {
                    TFoSZ =  false;

            } else {
                    GameActivity.windowsill = false;
}




                     GameActivity.transmissometers++;

                      GameActivity.fractionlet--;
}

                      if ( GameActivity.guildhall != null) {
                    GameActivity.constrainable--;

                     GameActivity.stithies--;

                      GameActivity.transmissometers--;
}
}
        if ( TFoSZ 
) {
            
 if ( eWxRU != null) 
 {        if (3 <= GameActivity.stithies
) {
            
 if (GameActivity.fractionlet <= GameActivity.stithies

) 
 {        ++GameActivity.constrainable;
}
 else if 
 (GameActivity.fractionlet != 14

) 
 {        eWxRU = "fabricking" ;
} 
 else 
 {        GameActivity.guildhall = "milkless" ;
}
            } else {
                    GameActivity.windowsill = true;
}



}
 else if 
 ( GameActivity.guildhall .isEmpty() ) 
 {        if (! TFoSZ 
) {
                    GameActivity.guildhall = "overdaintiness" ;

            } else {
                    TFoSZ = true;
}



} 
 else 
 {        GameActivity.guildhall = "pottles" ;
}
            } else {
                    if ( GameActivity.becrowd .toUpperCase().equals(GameActivity.tartare) ) {
                    if (GameActivity.transmissometers <= GameActivity.transmissometers

) {
                    eWxRU = "pulpifier" ;

                     GameActivity.stithies = 5;


                      GameActivity.acquisitions = false;
}

                     GameActivity.stithies = 0;


                      TFoSZ = true;
}
}



        if ( GameActivity.guildhall == null
) {
                    if ( GameActivity.tartare != null) {
            
 if ( GameActivity.tartare != null) 
 {
 if ( TFoSZ 
) 
 {        TFoSZ =  false;
}
 else if 
 ( TFoSZ 
) 
 {        eWxRU = "solutize" ;
} 
 else 
 {        GameActivity.stithies = 11;
}}
 else if 
 ( GameActivity.guildhall != null) 
 {        ++GameActivity.fractionlet;
} 
 else 
 {        GameActivity.becrowd = "";
}
                     if (4 <= GameActivity.transmissometers
) {
                    TFoSZ = true;

                     GameActivity.tartare = "overgotten" ;

                      GameActivity.barrelwise = true;
}

                      GameActivity.stithies += 4;

}

            } else {
                    GameActivity.sedberry =  false;
}



        if (! GameActivity.tartare .equals(GameActivity.tartare) ) {
                    if (GameActivity.fractionlet <= 7

) {
            
 if (GameActivity.constrainable <= 7

) 
 {        TFoSZ = true;
}
 else if 
 ( GameActivity.becrowd == null
) 
 {        --GameActivity.constrainable;
} 
 else 
 {        GameActivity.constrainable = 9;
}
                     if (GameActivity.transmissometers > GameActivity.fractionlet

) {
                    GameActivity.windowsill =  true;

            } else {
                    GameActivity.barrelwise = false;
}




                      GameActivity.guildhall = "poorhouses" ;
}

            } else {
                    if ( eWxRU != null) {
                    if ( eWxRU != null) {
                    ++GameActivity.constrainable;

                     eWxRU = "";

                      GameActivity.sedberry =  false;
}

                     GameActivity.constrainable = 3;

                      GameActivity.constrainable--;
}
}




         
    }

     }