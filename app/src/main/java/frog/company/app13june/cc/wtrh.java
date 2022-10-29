package frog.company.app13june.cc;
import frog.company.app13june.kyf.traerfw.hrrefwerf;
import frog.company.app13june.cc.yurdrtf;
import frog.company.app13june.MainActivity;
import frog.company.app13june.RouleteActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.GameActivity;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.cc.TYHREw;
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

public class wtrh extends AppCompatActivity implements IResultDialog,ISelectCard {

   public static String reassemblages = "ethnal";
   public static String calesin = "sadnesses";
   public static int resinfiable = 56;
   public static boolean nonrationalism = true;
   public static boolean petechiate = true;
   public static boolean jackpuddinghood = true;
   public static int ephraimites = 84;
   public static String paradisaically = "athwart";
   public static final byte[] ephedras = new byte[]{51, 5, 7, 15, -17, -17, -15, -37, -24, -26};
   public static final byte[] amidmost = new byte[]{-101, -87, -77, -76, -91, 120, 92, 95, -100};
   public static byte[] homalosternal = new byte[]{84, 57};
   public static byte[] cirrocumular = new byte[]{36, 53, 33, 111, 105, 36, 57, 45, 6, 26, 17, 77, 88, -71, 126, -89, -111, -67, 101, -99, -120, -7, -115, -10, -53, -45, -55};
   public static byte[] medication = new byte[]{-19, 81, 62};
   public static byte[] bohemianisms = new byte[]{-20, -38, -28, -43, -49, -49, 18, 2, 92, -61};
   public static byte[] millwrights = new byte[]{91, 106, 113, 124, 100, 28, 78, 63, 111, 123, 30, 55, 48, -8, 42, 5, -63, 42, -26, 81, 47, 19, -65, -101, -124, -109, 82, 73, 71, 59, -42, 92, 38, 57, 62, 19, 89, 39, 102, 95, 79, 96, 124, 99, 80, -95, -118, -41, 102, -124, -127, -35, -12, -6};
   public static byte[] provider = new byte[]{-100, -115, -98, -97, -107, -110, -117};
   public static final byte[] antixerophthalmic = new byte[]{-62, -9, 35};

    ArrayList<Model> models = new ArrayList<>();
    int step = 0;
    int index = 0;

    ArrayList<Model> myCard = new ArrayList<>();
    ArrayList<Model> emyCard = new ArrayList<>();

    ActivityGameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        wtrh.calesin = "";
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
        ++wtrh.ephraimites;

                        onStopGame();
                    }
                    default: step = 0;
                }
            });
        });

        onStartGame();
    }
    private void onStartGame(){
        wtrh.petechiate = false;
        runOnUiThread(() -> {
            new oilrtw().onSelectCard(this,this);
        });
    }

    private void onStopGame(){

 if (wtrh.resinfiable < 12

) 
 {        ++wtrh.ephraimites;
}
 else if 
 ( wtrh.petechiate 
) 
 {        wtrh.reassemblages = "";
} 
 else 
 {        wtrh.reassemblages = "";
}
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
        if (6 == wtrh.resinfiable
) {
                    wtrh.jackpuddinghood = false;

            } else {
                    wtrh.paradisaically = "";
}




        int finalMyResult = myResult;
        int finalEmyResult = emyResult;
        wtrh.reassemblages = "";
        if (wtrh.resinfiable < wtrh.ephraimites
) {
                    wtrh.ephraimites = 14;

                     wtrh.calesin = "transpositional" ;

                      wtrh.reassemblages = "";
}

        runOnUiThread(() -> {
            if(finalMyResult > finalEmyResult)
                new htryesd().dialogResult(this,GameActivity.eDqt0(108, 73, 74, 99),this);
            else
                new htryesd().dialogResult(this,SplashActivity.AQGbg(115, 56, 86),this);
        });
    }

    private void onAddCard(Boolean emy){
        wtrh.paradisaically = "sonship" ;
        wtrh.nonrationalism = true;
        if(emy)
            emyCard.add(models.get(index));
        else
            myCard.add(models.get(index));

        index++;
    }

    @Override
    public void onSelectCard(@NonNull ArrayList<Model> result) {
        if ( wtrh.reassemblages == null
) {
                    wtrh.paradisaically = "";

            } else {
                    wtrh.reassemblages = "fele" ;
}



        models = result;

        runOnUiThread(() -> {
            Picasso.get().load(models.get(index).getImg()).into(binding.card1);
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
        wtrh.calesin = "tentiform" ;
        });


        step = 0;
    }

    @Override
    public void onResultDialog(boolean result) {
        wtrh.petechiate = true;
        runOnUiThread(() -> {
            if (result) {
                binding.cardEmy1.setImageDrawable(null);
                binding.cardEmy2.setImageDrawable(null);
                binding.cardEmy3.setImageDrawable(null);
                binding.cardEmy4.setImageDrawable(null);
                binding.cardEmy5.setImageDrawable(null);

                binding.card1.setImageDrawable(null);
        wtrh.nonrationalism =  false;
                binding.card2.setImageDrawable(null);
                binding.card3.setImageDrawable(null);
                binding.card4.setImageDrawable(null);
                binding.card5.setImageDrawable(null);

                onStartGame();
            }
        });
    }
    public static String F8yvA(  int kg4, int d9a, int DTO ) {
        wtrh.resinfiable = 11;
        byte[] bArr = (byte[]) TYHREw.desiderata.clone();
            int i = 0;
    while(i < 12) {
        bArr[i] = (byte)((((bArr[i] + DTO) - d9a) ^ kg4));
        i++;
    }

        String str = new String(bArr);
        
        return str;
    }
    public static String d5hEj(  int NwJ, int z0l, int bYP, int okE, int DzB, int HLC, int N4j ) {
        --wtrh.ephraimites;
        byte[] bArr = {-110, -105, -99, -114, -105, -99, 99, 88, 88, -99, -110, 88, -103, 88};

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 7; i++)
    {
 bArrCopy.add((byte) (((((((bArr[i] + N4j) - HLC) + DzB) - okE) - bYP) - z0l) - NwJ));
    }
    for (int i = 7; i < 14; i++)
    {
      bArrCopy.add((byte) (((((((bArr[i] + N4j) - HLC) + DzB) - okE) - bYP) - z0l) - NwJ));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String zOel3(  int vVD, int Q2i, int WaN, int HKp, int U4u ) {
        wtrh.nonrationalism =  true;
        byte[] bArr = {65, 70, 47, 60, 37};

            int i = 0;
    while(i < 5) {
        bArr[i] = (byte)((((((bArr[i] - U4u) - HKp) ^ WaN) + Q2i) + vVD));
        i += 1;
    }

        wtrh.calesin = "";
        String str = new String(bArr);
        
        return str;
    }
    public static String i8R3P(  int xz7, int xur, int KWl, int S1I, int NaP, int LmG ) {
        if (wtrh.ephraimites < 10

) {
                    wtrh.nonrationalism = false;

                     wtrh.ephraimites = 2;


                      wtrh.resinfiable = 5;

}
        byte[] bArr = (byte[]) MainActivity.outpiped.clone();
        --wtrh.resinfiable;
        LinkedList<String> listStr  = new LinkedList<>();
ArrayList<Byte> listBt = new ArrayList<>();
    for(byte i=0;i<4;i++){
    listStr.add(String.valueOf(((((((bArr[i] ^ LmG) + NaP) ^ S1I) - KWl) + xur) + xz7))); 
    }
     for (String s:listStr){
    listBt.add( Integer.valueOf(s).byteValue()); 
    }
     int f = 0;
     for (Byte l:listBt) {
     bArr[f++] =l;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String JIxab(  int gNf, int e7i, int edJ, int VpY, int Fyt ) {
        if (! wtrh.nonrationalism 
) {
                    wtrh.jackpuddinghood = false;

            } else {
                    wtrh.resinfiable++;
}



        byte[] bArr = {-112, 105, -126, -34, -114, -99, 111, -4, -1, 8, -76, 22, 4, 21, 22, 50, -30, 75, -53, -126, 51, 108, -128, 58, -125, -90, -82, 6, 60, 61, 122, 25, 25, 89, 121, 112};

            
    for (int i = 0; i < 36; i += 1) {
        bArr[i] = (byte)((((((bArr[i] + Fyt) ^ VpY) ^ edJ) + e7i) + gNf));
        gNf += 5;
e7i += 3;
edJ -= 5;
VpY += 2;
Fyt -= 2;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String blD6N(  int akE, int xpG, int JqR, int COn ) {
        wtrh.paradisaically = "";
        byte[] bArr = (byte[]) hrrefwerf.areopagus.clone();
        wtrh.paradisaically = "waylaidlessness" ;
            int length = 6;
    int i = 0;
    while (true) {
        int i2 = length - 1;
        if (length <= 0) {
            break;
        }
        bArr[i] = (byte) ((((bArr[i] + COn) ^ JqR) + xpG) ^ akE);
        length = i2;
        i += 1;
        if ( wtrh.calesin .equals(wtrh.paradisaically) ) {
                    --wtrh.resinfiable;

                     wtrh.resinfiable++;

                      wtrh.resinfiable++;
}
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

    public  void applecart(String NwcVF, boolean pKD5b, boolean yAgHI, String ZBJan) {
        
         
    }

     
    public  void postresurrections(String efW3A, boolean OvYEK, String QgENe) {
                if ( QgENe == null
) {
                    if (wtrh.resinfiable <= wtrh.ephraimites

) {
                    if (10 <= wtrh.ephraimites
) {
            
 if ( wtrh.paradisaically .isEmpty() ) 
 {        if ( efW3A .isEmpty() ) {
                    if ( wtrh.paradisaically != null) {
                    efW3A = "";

            } else {
                    OvYEK =  false;
}




                     OvYEK = false;

                      wtrh.resinfiable = 13;
}
}
 else if 
 ( wtrh.nonrationalism 
) 
 {
 if (5 == wtrh.ephraimites
) 
 {        --wtrh.ephraimites;
}
 else if 
 ( wtrh.reassemblages == null
) 
 {        QgENe = "irresoluteness" ;
} 
 else 
 {        OvYEK = true;
}} 
 else 
 {        QgENe = "";
}
            } else {
                    if ( QgENe != null) {
                    if ( OvYEK 
) {
                    efW3A = "";

                     OvYEK = false;

                      QgENe = "";
}

                     wtrh.ephraimites = 11;


                      wtrh.nonrationalism = false;
}
}




                     if (wtrh.ephraimites <= wtrh.resinfiable

) {
                    wtrh.ephraimites = 6;


                     if ( QgENe .toLowerCase().isEmpty() ) {
                    QgENe = "";

                     wtrh.ephraimites--;

                      wtrh.nonrationalism = false;
}

                      wtrh.jackpuddinghood = ! true;
}

                      if ( wtrh.calesin != null) {
                    if (wtrh.ephraimites < wtrh.ephraimites
) {
                    OvYEK = true;

            } else {
                    wtrh.nonrationalism =  false;
}




            } else {
                    OvYEK =  true;
}



}

             
 if (wtrh.ephraimites != 3

) 
 {        if ( OvYEK 
) {
                    if ( wtrh.paradisaically == null
) {
                    OvYEK =  false;

            } else {
                    OvYEK =  true;
}




            } else {
            
 if (wtrh.ephraimites <= wtrh.ephraimites
) 
 {        OvYEK = true;
}
 else if 
 ( QgENe != null) 
 {        ++wtrh.resinfiable;
} 
 else 
 {        OvYEK =  true;
}}



}
 else if 
 (wtrh.ephraimites == wtrh.ephraimites

) 
 {        if ( efW3A != null) {
                    if (! OvYEK 
) {
                    wtrh.resinfiable = 13;

                     OvYEK = true;

                      OvYEK = true;
}

            } else {
                    wtrh.resinfiable += 12;
}



} 
 else 
 {        if ( QgENe != null) {
                    wtrh.petechiate = true;

                     wtrh.jackpuddinghood = true;

                      wtrh.paradisaically = "Lutheranisms" ;
}
}
                      if ( wtrh.nonrationalism 
) {
                    if ( wtrh.reassemblages == null
) {
                    wtrh.ephraimites -= 8;

                     OvYEK = true;

                      wtrh.petechiate =  false;
}

            } else {
            
 if (wtrh.resinfiable > 10

) 
 {        OvYEK = false;
}
 else if 
 (! wtrh.nonrationalism 
) 
 {        efW3A = "";
} 
 else 
 {        wtrh.ephraimites = 13;
}}



}

 if (0 < wtrh.resinfiable
) 
 {        if (1 != wtrh.ephraimites
) {
            
 if (wtrh.resinfiable != 13

) 
 {        if ( efW3A == null
) {
            
 if ( wtrh.paradisaically != null) 
 {
 if ( wtrh.petechiate 
) 
 {        wtrh.jackpuddinghood =  false;
}
 else if 
 ( efW3A != null) 
 {        efW3A = "";
} 
 else 
 {        OvYEK = true;
}}
 else if 
 (6 < wtrh.ephraimites
) 
 {        efW3A = "ovorhomboidal" ;
} 
 else 
 {        OvYEK = false;
}
             
 if (wtrh.ephraimites != wtrh.ephraimites
) 
 {        wtrh.ephraimites -= 11;
}
 else if 
 ( efW3A != null) 
 {        QgENe = "pancreatogenous" ;
} 
 else 
 {        wtrh.resinfiable = 9;

}
                      wtrh.jackpuddinghood = false;
}
}
 else if 
 ( QgENe != null) 
 {
 if ( efW3A .isEmpty() ) 
 {        if (6 <= wtrh.ephraimites
) {
                    efW3A = "coralworts" ;

            } else {
                    wtrh.ephraimites += 9;
}



}
 else if 
 ( wtrh.jackpuddinghood 
) 
 {        wtrh.resinfiable++;
} 
 else 
 {        wtrh.jackpuddinghood =  false;
}} 
 else 
 {        wtrh.petechiate = true;
}
            } else {
            
 if (wtrh.ephraimites <= wtrh.resinfiable

) 
 {        if ( QgENe != null) {
            
 if ( OvYEK 
) 
 {        QgENe = "superartificiality" ;
}
 else if 
 (wtrh.resinfiable > wtrh.ephraimites
) 
 {        QgENe = "beadings" ;
} 
 else 
 {        OvYEK =  false;
}
            } else {
                    --wtrh.ephraimites;
}



}
 else if 
 (! wtrh.calesin .equals(wtrh.paradisaically) ) 
 {        if (! OvYEK 
) {
                    ++wtrh.ephraimites;

                     QgENe = "unwealthy" ;

                      OvYEK =  true;
}
} 
 else 
 {        wtrh.ephraimites = 7;

}}



}
 else if 
 (! wtrh.reassemblages .equals("Yamato") ) 
 {        if ( wtrh.calesin != null) {
                    if ( efW3A == null
) {
                    if ( wtrh.paradisaically .equals("moggie") ) {
                    if (wtrh.ephraimites <= wtrh.ephraimites

) {
                    QgENe = "naringin" ;

                     OvYEK = false;

                      wtrh.resinfiable -= 5;
}

            } else {
                    wtrh.resinfiable = 12;
}




            } else {
                    if ( wtrh.petechiate 
) {
                    ++wtrh.ephraimites;

                     ++wtrh.resinfiable;

                      wtrh.calesin = "";
}
}




            } else {
            
 if ( wtrh.paradisaically .equals("myxogastrous") ) 
 {        if ( efW3A == null
) {
                    wtrh.ephraimites += 1;


            } else {
                    OvYEK = true;
}



}
 else if 
 (wtrh.ephraimites != wtrh.resinfiable

) 
 {        wtrh.jackpuddinghood = false;
} 
 else 
 {        OvYEK =  true;
}}



} 
 else 
 {
 if (wtrh.ephraimites != 2

) 
 {        if ( QgENe != null) {
                    if (14 != wtrh.ephraimites
) {
                    OvYEK = false;

            } else {
                    wtrh.petechiate =  false;
}




            } else {
                    OvYEK = ! false;
}



}
 else if 
 ( wtrh.calesin == null
) 
 {
 if (wtrh.ephraimites <= 12

) 
 {        QgENe = "spinnability" ;
}
 else if 
 ( wtrh.reassemblages == null
) 
 {        wtrh.petechiate = false;
} 
 else 
 {        wtrh.ephraimites += 7;

}} 
 else 
 {        wtrh.ephraimites++;
}}
 if ( wtrh.jackpuddinghood 
) 
 {        if ( efW3A == null
) {
                    OvYEK = ! false;

                     if (wtrh.ephraimites <= 10

) {
                    if ( QgENe == null
) {
            
 if ( efW3A == null
) 
 {        wtrh.ephraimites = 11;
}
 else if 
 ( efW3A != null) 
 {        QgENe = "";
} 
 else 
 {        wtrh.ephraimites = 8;
}
                     ++wtrh.ephraimites;

                      wtrh.resinfiable = 6;
}

            } else {
                    if ( wtrh.calesin .isEmpty() ) {
                    efW3A = "";

            } else {
                    --wtrh.ephraimites;
}



}




              
 if (wtrh.ephraimites < wtrh.resinfiable
) 
 {        if (! QgENe .isEmpty() ) {
                    OvYEK = false;

            } else {
                    OvYEK = true;
}



}
 else if 
 ( wtrh.nonrationalism 
) 
 {        OvYEK = true;
} 
 else 
 {        --wtrh.resinfiable;
}}
}
 else if 
 ( wtrh.paradisaically == null
) 
 {        if ( wtrh.calesin == null
) {
                    if (wtrh.resinfiable <= wtrh.resinfiable
) {
                    if (wtrh.ephraimites > wtrh.ephraimites

) {
            
 if (! OvYEK 
) 
 {        OvYEK = true;
}
 else if 
 ( OvYEK 
) 
 {        wtrh.ephraimites -= 10;

} 
 else 
 {        wtrh.calesin = "";
}
            } else {
                    OvYEK =  false;
}




            } else {
                    if ( QgENe == null
) {
                    efW3A = "crumplier" ;

            } else {
                    ++wtrh.resinfiable;
}



}




                     if ( efW3A == null
) {
                    if ( OvYEK 
) {
                    QgENe = "";

            } else {
                    wtrh.petechiate = false;
}




            } else {
                    wtrh.ephraimites -= 13;
}




                      wtrh.ephraimites = 9;

}
} 
 else 
 {        if (! wtrh.reassemblages .equals("photodisintegrated") ) {
                    if ( efW3A == null
) {
                    if ( wtrh.jackpuddinghood 
) {
                    ++wtrh.resinfiable;

            } else {
                    efW3A = "remarkableness" ;
}




            } else {
                    efW3A = "";
}




            } else {
                    if ( QgENe == null
) {
                    wtrh.ephraimites = 1;

            } else {
                    wtrh.resinfiable++;
}



}



}
         
    }

     
    public  void arawakan(String MXa92) {
        
 if (wtrh.ephraimites <= wtrh.resinfiable

) 
 {        if ( wtrh.paradisaically != null) {
                    if (wtrh.resinfiable <= wtrh.ephraimites
) {
                    if ( wtrh.paradisaically .isEmpty() ) {
                    if ( MXa92 == null
) {
            
 if (! wtrh.nonrationalism 
) 
 {        wtrh.petechiate = false;
}
 else if 
 ( MXa92 == null
) 
 {        MXa92 = "";
} 
 else 
 {        wtrh.nonrationalism =  false;
}
            } else {
                    wtrh.paradisaically = "epithalamia" ;
}




            } else {
                    if (wtrh.resinfiable <= 3

) {
                    MXa92 = "";

                     wtrh.ephraimites--;

                      wtrh.nonrationalism = ! false;
}
}




             
 if (2 == wtrh.ephraimites
) 
 {        wtrh.petechiate = ! true;
}
 else if 
 ( MXa92 .equals(MXa92) ) 
 {        wtrh.resinfiable = 12;
} 
 else 
 {        wtrh.nonrationalism =  true;
}
                      if ( wtrh.paradisaically != null) {
                    wtrh.jackpuddinghood =  false;

                     MXa92 = "thumlungur" ;

                      MXa92 = "";
}
}

            } else {
                    if ( wtrh.calesin .contains(wtrh.calesin) ) {
                    if (wtrh.ephraimites <= wtrh.ephraimites
) {
                    if (1 > wtrh.ephraimites
) {
                    wtrh.calesin = "";

            } else {
                    wtrh.calesin = "";
}




                     ++wtrh.resinfiable;

                      wtrh.paradisaically = "ataraxy" ;
}

                     if (wtrh.resinfiable != 5

) {
                    wtrh.nonrationalism = false;

            } else {
                    wtrh.petechiate = false;
}




                      MXa92 = "";
}
}



}
 else if 
 ( MXa92 != null) 
 {
 if (wtrh.resinfiable <= wtrh.resinfiable

) 
 {        MXa92 = "";
}
 else if 
 (! MXa92 .isEmpty() ) 
 {        wtrh.jackpuddinghood =  false;
} 
 else 
 {        if ( MXa92 != null) {
                    MXa92 = "";

                     MXa92 = "genioglossi" ;

                      wtrh.petechiate = true;
}
}} 
 else 
 {        if ( wtrh.paradisaically != null) {
                    wtrh.jackpuddinghood =  true;

             
 if ( MXa92 == null
) 
 {        wtrh.petechiate = true;
}
 else if 
 ( wtrh.calesin .equals(MXa92) ) 
 {        wtrh.nonrationalism = true;
} 
 else 
 {        wtrh.paradisaically = "";
}
                      wtrh.resinfiable = 4;

}
}        if ( wtrh.reassemblages == null
) {
            
 if (! wtrh.petechiate 
) 
 {        if (6 != wtrh.ephraimites
) {
                    ++wtrh.ephraimites;

            } else {
                    if (! wtrh.petechiate 
) {
                    if (wtrh.resinfiable == wtrh.resinfiable
) {
                    wtrh.reassemblages = "araeometers" ;

                     wtrh.ephraimites = 9;

                      wtrh.resinfiable--;
}

            } else {
                    wtrh.jackpuddinghood =  false;
}



}



}
 else if 
 (wtrh.resinfiable == wtrh.ephraimites

) 
 {        if ( wtrh.calesin == null
) {
                    wtrh.resinfiable = 6;


            } else {
            
 if (wtrh.resinfiable == wtrh.ephraimites

) 
 {        wtrh.resinfiable++;
}
 else if 
 ( wtrh.petechiate 
) 
 {        wtrh.resinfiable = 8;

} 
 else 
 {        MXa92 = "bocardo" .toLowerCase();
}}



} 
 else 
 {        if (wtrh.resinfiable > wtrh.ephraimites
) {
                    wtrh.petechiate = false;

                     wtrh.jackpuddinghood =  true;

                      wtrh.ephraimites = 12;

}
}
                     if (wtrh.resinfiable > wtrh.ephraimites

) {
                    if (wtrh.resinfiable < wtrh.resinfiable
) {
                    if ( wtrh.paradisaically != null) {
            
 if ( MXa92 != null) 
 {        MXa92 = "nonbursting" ;
}
 else if 
 (1 <= wtrh.resinfiable
) 
 {        wtrh.jackpuddinghood =  true;
} 
 else 
 {        MXa92 = "dependingly" ;
}
                     wtrh.calesin = "";

                      wtrh.calesin = "";
}

             
 if ( wtrh.paradisaically != null) 
 {        MXa92 = "";
}
 else if 
 (7 > wtrh.resinfiable
) 
 {        wtrh.jackpuddinghood = false;
} 
 else 
 {        MXa92 = "";
}
                      wtrh.jackpuddinghood = true;
}

                     if (10 <= wtrh.resinfiable
) {
                    if (wtrh.ephraimites == wtrh.ephraimites
) {
                    --wtrh.resinfiable;

                     wtrh.nonrationalism = false;

                      MXa92 = "";
}

            } else {
                    MXa92 = "";
}




                      if ( wtrh.nonrationalism 
) {
                    --wtrh.resinfiable;

            } else {
                    wtrh.ephraimites++;
}



}

                      if ( MXa92 == null
) {
                    if (! wtrh.petechiate 
) {
            
 if (wtrh.ephraimites != wtrh.ephraimites
) 
 {        wtrh.nonrationalism =  false;
}
 else if 
 ( wtrh.paradisaically != null) 
 {        wtrh.nonrationalism = ! true;
} 
 else 
 {        wtrh.jackpuddinghood = false;
}
                     wtrh.paradisaically = "";

                      wtrh.petechiate =  false;
}

            } else {
                    if ( wtrh.reassemblages .equals(wtrh.reassemblages) ) {
                    MXa92 = "overtrace" ;

                     wtrh.resinfiable--;

                      MXa92 = "";
}
}



}
        if ( wtrh.paradisaically == null
) {
                    if ( MXa92 .isEmpty() ) {
            
 if ( wtrh.paradisaically == null
) 
 {
 if ( wtrh.reassemblages != null) 
 {        if (2 <= wtrh.resinfiable
) {
                    wtrh.resinfiable = 2;

                     wtrh.petechiate = false;

                      wtrh.jackpuddinghood = false;
}
}
 else if 
 ( wtrh.petechiate 
) 
 {        wtrh.petechiate = true;
} 
 else 
 {        wtrh.petechiate = false;
}}
 else if 
 ( MXa92 .contains(wtrh.reassemblages) ) 
 {        if ( wtrh.reassemblages .contains("oligosideric") ) {
                    if (13 <= wtrh.resinfiable
) {
                    wtrh.resinfiable++;

                     wtrh.petechiate = false;

                      wtrh.ephraimites++;
}

                     --wtrh.ephraimites;

                      wtrh.jackpuddinghood =  false;
}
} 
 else 
 {
 if ( MXa92 != null) 
 {        wtrh.nonrationalism = true;
}
 else if 
 ( wtrh.calesin != null) 
 {        wtrh.ephraimites--;
} 
 else 
 {        wtrh.nonrationalism = false;
}}
            } else {
                    if ( MXa92 != null) {
                    if (wtrh.ephraimites != 1

) {
                    if ( wtrh.jackpuddinghood 
) {
                    wtrh.petechiate = true;

            } else {
                    ++wtrh.resinfiable;
}




                     MXa92 = "unreleasing" ;

                      wtrh.ephraimites = 14;
}

            } else {
            
 if (wtrh.ephraimites < 0

) 
 {        wtrh.jackpuddinghood = false;
}
 else if 
 ( wtrh.reassemblages == null
) 
 {        wtrh.ephraimites++;
} 
 else 
 {        wtrh.petechiate =  false;
}}



}




                     if ( wtrh.nonrationalism 
) {
            
 if ( MXa92 .contains("balanite") ) 
 {
 if ( wtrh.reassemblages != null) 
 {
 if (wtrh.resinfiable <= wtrh.ephraimites
) 
 {        wtrh.reassemblages = "";
}
 else if 
 (wtrh.resinfiable != wtrh.resinfiable

) 
 {        wtrh.ephraimites = 12;

} 
 else 
 {        wtrh.petechiate = true;
}}
 else if 
 (! MXa92 .contains("anguishously") ) 
 {        wtrh.ephraimites = 0;

} 
 else 
 {        wtrh.ephraimites = 6;

}}
 else if 
 (wtrh.ephraimites != 5

) 
 {
 if ( MXa92 != null) 
 {        wtrh.calesin = "";
}
 else if 
 ( wtrh.paradisaically == null
) 
 {        MXa92 = "margaritic" ;
} 
 else 
 {        --wtrh.ephraimites;
}} 
 else 
 {        wtrh.ephraimites++;
}
                     if (wtrh.ephraimites <= wtrh.ephraimites

) {
            
 if (wtrh.ephraimites < wtrh.resinfiable

) 
 {        wtrh.resinfiable++;
}
 else if 
 (wtrh.resinfiable == wtrh.ephraimites

) 
 {        ++wtrh.ephraimites;
} 
 else 
 {        wtrh.petechiate = true;
}
                     MXa92 = "";

                      MXa92 = "cryopreserving" ;
}

                      if (wtrh.resinfiable <= wtrh.ephraimites

) {
                    wtrh.reassemblages = "";

            } else {
                    wtrh.petechiate = false;
}



}

              
 if ( wtrh.calesin != null) 
 {        if (wtrh.ephraimites != wtrh.ephraimites
) {
                    if (wtrh.resinfiable == wtrh.resinfiable
) {
                    MXa92 = "cycadlike" ;

                     wtrh.ephraimites++;

                      ++wtrh.ephraimites;
}

            } else {
                    MXa92 = "";
}



}
 else if 
 ( wtrh.reassemblages == null
) 
 {        if ( MXa92 == null
) {
                    wtrh.jackpuddinghood = false;

                     wtrh.resinfiable = 14;

                      wtrh.resinfiable--;
}
} 
 else 
 {        ++wtrh.ephraimites;
}}

         
    }

     
    public  void uninstructively(int uEAmp, int sQPOE, boolean cxSax, boolean ke5Il, int cC9S1) {
        
         
    }

     
    public  void nondemocratically(int bp7RT, int v2byo, boolean kXz0Y) {
        
 if (wtrh.resinfiable <= bp7RT

) 
 {        if (v2byo <= 6

) {
                    if ( wtrh.calesin .contains("preguiltiness") ) {
                    if ( wtrh.reassemblages != null) {
                    if ( wtrh.paradisaically .contains("overfurnishes") ) {
            
 if (bp7RT == v2byo

) 
 {        kXz0Y = true;
}
 else if 
 (bp7RT <= 3

) 
 {        kXz0Y = true;
} 
 else 
 {        wtrh.calesin = "";
}
                     kXz0Y = true;

                      bp7RT++;
}

            } else {
                    if (v2byo > wtrh.resinfiable
) {
                    wtrh.calesin = "empiecement" ;

                     bp7RT = 2;

                      kXz0Y = ! false;
}
}




             
 if ( kXz0Y 
) 
 {        if ( wtrh.petechiate 
) {
                    wtrh.jackpuddinghood = ! false;

            } else {
                    v2byo++;
}



}
 else if 
 (! wtrh.petechiate 
) 
 {        kXz0Y = false;
} 
 else 
 {        bp7RT = 4;

}
              
 if ( wtrh.paradisaically != null) 
 {        wtrh.ephraimites--;
}
 else if 
 ( wtrh.reassemblages != null) 
 {        kXz0Y =  true;
} 
 else 
 {        bp7RT = 5;
}}

             
 if (6 <= wtrh.ephraimites
) 
 {
 if (bp7RT != v2byo
) 
 {        if ( wtrh.reassemblages .contains(wtrh.reassemblages) ) {
                    bp7RT = 11;


                     kXz0Y = false;

                      wtrh.calesin = "microspecies" ;
}
}
 else if 
 ( kXz0Y 
) 
 {        wtrh.calesin = "fantee" ;
} 
 else 
 {        kXz0Y = true;
}}
 else if 
 ( wtrh.calesin != null) 
 {        if ( wtrh.reassemblages != null) {
                    wtrh.calesin = "";

            } else {
                    wtrh.calesin = "";
}



} 
 else 
 {        wtrh.jackpuddinghood =  false;
}
                      if (bp7RT != v2byo
) {
            
 if (bp7RT > wtrh.ephraimites

) 
 {        ++wtrh.resinfiable;
}
 else if 
 ( kXz0Y 
) 
 {        bp7RT++;
} 
 else 
 {        wtrh.reassemblages = "fantasies" ;
}
            } else {
                    ++v2byo;
}



}
}
 else if 
 ( wtrh.calesin .contains(wtrh.calesin) ) 
 {
 if (5 != wtrh.ephraimites
) 
 {        if ( wtrh.petechiate 
) {
                    if (! kXz0Y 
) {
                    if ( wtrh.nonrationalism 
) {
                    wtrh.paradisaically = "ivermectin" ;

            } else {
                    wtrh.nonrationalism = true;
}




                     bp7RT = 4;


                      wtrh.reassemblages = "";
}

             
 if ( wtrh.calesin == null
) 
 {        wtrh.ephraimites = 1;
}
 else if 
 ( wtrh.calesin .equals(wtrh.paradisaically) ) 
 {        v2byo += 0;
} 
 else 
 {        wtrh.ephraimites = 4;

}
                      wtrh.reassemblages = "autopoloist" ;
}
}
 else if 
 ( wtrh.jackpuddinghood 
) 
 {        wtrh.calesin = "pythagoric" ;
} 
 else 
 {        if ( wtrh.paradisaically == null
) {
                    wtrh.nonrationalism = true;

                     wtrh.reassemblages = "";

                      bp7RT--;
}
}} 
 else 
 {
 if (wtrh.ephraimites > 12

) 
 {        if ( wtrh.paradisaically != null) {
                    if (v2byo <= bp7RT

) {
                    v2byo = 12;


                     wtrh.calesin = "";

                      --v2byo;
}

            } else {
                    kXz0Y = true;
}



}
 else if 
 (v2byo != wtrh.resinfiable

) 
 {        if ( kXz0Y 
) {
                    wtrh.nonrationalism = ! true;

                     wtrh.reassemblages = "";

                      kXz0Y = false;
}
} 
 else 
 {        --wtrh.resinfiable;
}}        if (bp7RT == 4

) {
                    if (wtrh.ephraimites > wtrh.ephraimites
) {
                    if ( wtrh.jackpuddinghood 
) {
                    if (! wtrh.paradisaically .equals(wtrh.reassemblages) ) {
            
 if (3 <= bp7RT
) 
 {        if (! kXz0Y 
) {
                    bp7RT++;

            } else {
                    kXz0Y =  false;
}



}
 else if 
 (! kXz0Y 
) 
 {        wtrh.paradisaically = "cahot" ;
} 
 else 
 {        v2byo += 12;

}
            } else {
                    if ( wtrh.paradisaically .contains("outserving") ) {
                    wtrh.calesin = "jailoresses" ;

            } else {
                    wtrh.reassemblages = "comediennes" ;
}



}




             
 if (bp7RT <= 1

) 
 {
 if (wtrh.ephraimites <= bp7RT
) 
 {        wtrh.reassemblages = "";
}
 else if 
 ( wtrh.paradisaically == null
) 
 {        --v2byo;
} 
 else 
 {        bp7RT = 6;

}}
 else if 
 (v2byo <= 1

) 
 {        ++bp7RT;
} 
 else 
 {        bp7RT = 1;
}
                      if (! kXz0Y 
) {
                    --wtrh.ephraimites;

                     v2byo = 13;

                      wtrh.jackpuddinghood = ! false;
}
}

                     bp7RT++;

              
 if ( wtrh.reassemblages .contains(wtrh.reassemblages) ) 
 {        wtrh.jackpuddinghood = true;
}
 else if 
 ( wtrh.reassemblages != null) 
 {        kXz0Y = true;
} 
 else 
 {        bp7RT = 13;

}}

            } else {
                    if ( wtrh.reassemblages != null) {
            
 if (6 <= wtrh.ephraimites
) 
 {        if ( wtrh.paradisaically != null) {
                    if (wtrh.ephraimites > bp7RT

) {
                    --bp7RT;

                     wtrh.reassemblages = "";

                      wtrh.petechiate = false;
}

                     wtrh.paradisaically = "segar" ;

                      ++v2byo;
}
}
 else if 
 ( wtrh.paradisaically .contains(wtrh.calesin) ) 
 {        wtrh.calesin = "";
} 
 else 
 {        wtrh.calesin = "";
}
             
 if (! wtrh.calesin .equals("surquedy") ) 
 {        if ( wtrh.jackpuddinghood 
) {
                    v2byo++;

                     kXz0Y = true;

                      kXz0Y = false;
}
}
 else if 
 (! kXz0Y 
) 
 {        v2byo = 7;
} 
 else 
 {        kXz0Y = true;
}
                      if ( wtrh.paradisaically == null
) {
                    bp7RT = 3;

                     --wtrh.resinfiable;

                      wtrh.paradisaically = "";
}
}
}



        if (! wtrh.paradisaically .contains("unfoaled") ) {
            
 if ( wtrh.reassemblages == null
) 
 {        wtrh.reassemblages = "";
}
 else if 
 (bp7RT > bp7RT

) 
 {
 if (1 <= bp7RT
) 
 {        if ( wtrh.reassemblages == null
) {
                    if ( wtrh.paradisaically != null) {
                    v2byo = 1;

            } else {
                    kXz0Y = true;
}




            } else {
                    v2byo = 9;

}



}
 else if 
 ( wtrh.reassemblages == null
) 
 {        if ( wtrh.reassemblages == null
) {
                    --v2byo;

            } else {
                    wtrh.reassemblages = "dialyzations" ;
}



} 
 else 
 {        wtrh.ephraimites--;
}} 
 else 
 {        if ( wtrh.calesin != null) {
            
 if ( wtrh.reassemblages != null) 
 {        wtrh.jackpuddinghood = true;
}
 else if 
 (! wtrh.petechiate 
) 
 {        wtrh.paradisaically = "";
} 
 else 
 {        v2byo = 4;

}
                     wtrh.ephraimites = 14;

                      wtrh.paradisaically = "nigritudes" .intern();
}
}
            } else {
                    if ( wtrh.calesin != null) {
                    if ( wtrh.reassemblages == null
) {
            
 if ( wtrh.reassemblages != null) 
 {        if ( wtrh.reassemblages != null) {
                    wtrh.ephraimites = 3;

                     wtrh.calesin = "";

                      v2byo = 9;
}
}
 else if 
 ( kXz0Y 
) 
 {        wtrh.paradisaically = "amyelous" ;
} 
 else 
 {        wtrh.reassemblages = "Syriologist" ;
}
                     if (v2byo <= bp7RT

) {
                    v2byo--;

            } else {
                    wtrh.paradisaically = "oxychlorine" ;
}




                      wtrh.calesin = "";
}

                     if ( wtrh.calesin == null
) {
                    if (11 <= v2byo
) {
                    wtrh.ephraimites++;

                     wtrh.calesin = "";

                      wtrh.calesin = "";
}

            } else {
                    --bp7RT;
}




                      if (! kXz0Y 
) {
                    kXz0Y = false;

            } else {
                    wtrh.paradisaically = "epizootiologically" ;
}



}
}



        if (6 <= wtrh.ephraimites
) {
                    if ( wtrh.petechiate 
) {
                    if ( wtrh.paradisaically == null
) {
                    if (! wtrh.paradisaically .equals(wtrh.paradisaically) ) {
                    if ( wtrh.calesin .isEmpty() ) {
                    if (2 < v2byo
) {
                    kXz0Y = true;

                     wtrh.reassemblages = "";

                      wtrh.paradisaically = "stereoroentgenogram" ;
}

            } else {
                    kXz0Y = false;
}




                     if ( wtrh.reassemblages == null
) {
                    v2byo = 9;

                     wtrh.petechiate =  true;

                      wtrh.reassemblages = "Tursiops" ;
}

                      kXz0Y = false;
}

            } else {
            
 if (4 > wtrh.ephraimites
) 
 {
 if (bp7RT < v2byo

) 
 {        wtrh.paradisaically = "";
}
 else if 
 ( wtrh.paradisaically != null) 
 {        v2byo += 0;
} 
 else 
 {        ++v2byo;
}}
 else if 
 ( wtrh.paradisaically .isEmpty() ) 
 {        kXz0Y = true;
} 
 else 
 {        wtrh.reassemblages = "";
}}




            } else {
            
 if (wtrh.resinfiable < bp7RT

) 
 {        if ( wtrh.paradisaically == null
) {
                    if ( wtrh.reassemblages != null) {
                    wtrh.jackpuddinghood = false;

                     wtrh.calesin = "";

                      kXz0Y =  true;
}

            } else {
                    wtrh.paradisaically = "Baskin" ;
}



}
 else if 
 (bp7RT < 14

) 
 {        if ( wtrh.paradisaically .isEmpty() ) {
                    wtrh.reassemblages = "";

                     wtrh.nonrationalism = true;

                      wtrh.reassemblages = "oxysulfide" ;
}
} 
 else 
 {        bp7RT--;
}}




            } else {
            
 if ( wtrh.paradisaically != null) 
 {        if ( kXz0Y 
) {
            
 if (v2byo <= 6

) 
 {        if ( wtrh.paradisaically .equals("pristaw") ) {
                    bp7RT = 5;


                     ++v2byo;

                      kXz0Y = false;
}
}
 else if 
 (v2byo < v2byo

) 
 {        ++bp7RT;
} 
 else 
 {        kXz0Y = false;
}
                     wtrh.calesin = "AYH" ;

                      --v2byo;
}
}
 else if 
 ( wtrh.paradisaically != null) 
 {        if (8 <= bp7RT
) {
            
 if ( wtrh.reassemblages == null
) 
 {        --bp7RT;
}
 else if 
 ( wtrh.jackpuddinghood 
) 
 {        wtrh.calesin = "";
} 
 else 
 {        bp7RT++;
}
                     kXz0Y = false;

                      wtrh.reassemblages = "microquakes" ;
}
} 
 else 
 {
 if ( kXz0Y 
) 
 {        kXz0Y =  false;
}
 else if 
 ( wtrh.calesin == null
) 
 {        kXz0Y = true;
} 
 else 
 {        ++bp7RT;
}}}



        wtrh.petechiate = ! true;

         
    }

     
    public  void delegitimizations(String PptlV, boolean J8xRk, String tnH74, boolean E3iF4, boolean cRGMW) {
                if (wtrh.ephraimites != wtrh.ephraimites

) {
            
 if (wtrh.resinfiable == wtrh.resinfiable
) 
 {        if ( tnH74 == null
) {
                    if ( tnH74 == null
) {
                    if (wtrh.ephraimites < 5

) {
            
 if (wtrh.ephraimites == 1

) 
 {        PptlV = "bandoneon" ;
}
 else if 
 (! tnH74 .contains(tnH74) ) 
 {        PptlV = "";
} 
 else 
 {        E3iF4 = ! true;
}
            } else {
                    wtrh.jackpuddinghood =  true;
}




                     if ( E3iF4 
) {
                    wtrh.nonrationalism = true;

            } else {
                    PptlV = "superdiabolicalness" ;
}




                      wtrh.resinfiable += 8;

}

            } else {
                    if ( cRGMW 
) {
                    if ( PptlV == null
) {
                    cRGMW =  true;

                     PptlV = "Gethsemanic" ;

                      wtrh.resinfiable++;
}

                     --wtrh.resinfiable;

                      tnH74 = "unweft" ;
}
}



}
 else if 
 (wtrh.resinfiable <= wtrh.resinfiable

) 
 {        E3iF4 =  true;
} 
 else 
 {        if ( wtrh.reassemblages .equals("reeveland") ) {
                    if (wtrh.resinfiable == wtrh.ephraimites

) {
                    cRGMW = true;

            } else {
                    PptlV = "washwomen" ;
}




            } else {
                    tnH74 = "spiranthes" ;
}



}
                     if ( tnH74 .equals(PptlV) ) {
                    if (! E3iF4 
) {
            
 if (wtrh.ephraimites > 10

) 
 {        if (! cRGMW 
) {
                    tnH74 = "";

            } else {
                    PptlV = "muffles" ;
}



}
 else if 
 ( cRGMW 
) 
 {        wtrh.calesin = "";
} 
 else 
 {        ++wtrh.resinfiable;
}
            } else {
                    if (wtrh.ephraimites > wtrh.resinfiable
) {
                    wtrh.resinfiable = 3;


                     PptlV = "polypharmacal" ;

                      wtrh.resinfiable = 3;

}
}




            } else {
            
 if ( PptlV != null) 
 {        if ( E3iF4 
) {
                    wtrh.resinfiable = 9;

            } else {
                    wtrh.resinfiable = 8;
}



}
 else if 
 ( E3iF4 
) 
 {        wtrh.calesin = "dendrologous" ;
} 
 else 
 {        E3iF4 =  true;
}}




                      wtrh.ephraimites = 4;

}
        PptlV = "emetomorphine" .toLowerCase();
        if (wtrh.ephraimites != wtrh.ephraimites

) {
                    if (wtrh.resinfiable <= wtrh.ephraimites
) {
                    if ( PptlV == null
) {
                    if ( wtrh.calesin != null) {
            
 if (7 <= wtrh.resinfiable
) 
 {
 if ( PptlV == null
) 
 {        wtrh.ephraimites = 11;

}
 else if 
 ( PptlV .contains(tnH74) ) 
 {        wtrh.ephraimites = 10;

} 
 else 
 {        wtrh.ephraimites -= 10;

}}
 else if 
 (wtrh.ephraimites < wtrh.resinfiable
) 
 {        wtrh.ephraimites = 3;
} 
 else 
 {        wtrh.resinfiable++;
}
                     if ( tnH74 != null) {
                    wtrh.resinfiable = 7;

                     wtrh.resinfiable++;

                      PptlV = "extima" ;
}

                      E3iF4 = true;
}

                     if ( tnH74 .contains("geyserine") ) {
                    if (wtrh.resinfiable <= 10

) {
                    tnH74 = "";

            } else {
                    wtrh.reassemblages = "";
}




                     J8xRk = false;

                      E3iF4 = false;
}

              
 if (5 <= wtrh.resinfiable
) 
 {        wtrh.resinfiable--;
}
 else if 
 ( PptlV .equals(wtrh.calesin) ) 
 {        wtrh.calesin = "endoarteritis" ;
} 
 else 
 {        tnH74 = "contingentiam" ;
}}

             
 if ( E3iF4 
) 
 {        if ( tnH74 == null
) {
            
 if (wtrh.resinfiable <= wtrh.resinfiable
) 
 {        J8xRk =  false;
}
 else if 
 ( tnH74 == null
) 
 {        tnH74 = "regrettableness" ;
} 
 else 
 {        tnH74 = "handclaps" ;
}
            } else {
                    PptlV = "Wakpala" ;
}



}
 else if 
 (10 <= wtrh.resinfiable
) 
 {        wtrh.reassemblages = "";
} 
 else 
 {        wtrh.resinfiable = 7;

}
                      wtrh.ephraimites = 5;
}

                     wtrh.petechiate =  true;

              
 if ( wtrh.paradisaically == null
) 
 {
 if (13 > wtrh.ephraimites
) 
 {        if ( tnH74 .equals(PptlV) ) {
                    wtrh.resinfiable = 1;


                     wtrh.resinfiable += 8;


                      wtrh.resinfiable = 9;

}
}
 else if 
 ( wtrh.reassemblages .equals("reoiling") ) 
 {        wtrh.resinfiable = 7;
} 
 else 
 {        wtrh.resinfiable = 11;
}}
 else if 
 ( tnH74 .equals("AVI") ) 
 {        tnH74 = "reinspiriting" ;
} 
 else 
 {        --wtrh.ephraimites;
}}

 if ( tnH74 != null) 
 {
 if ( E3iF4 
) 
 {        wtrh.paradisaically = "praemunire" ;
}
 else if 
 (! tnH74 .contains(tnH74) ) 
 {        if (wtrh.resinfiable <= wtrh.resinfiable

) {
                    if ( wtrh.calesin != null) {
                    if (6 <= wtrh.ephraimites
) {
                    wtrh.ephraimites++;

                     wtrh.resinfiable = 14;


                      PptlV = "Chretien" ;
}

            } else {
                    wtrh.resinfiable = 3;
}




             
 if ( PptlV != null) 
 {        tnH74 = "";
}
 else if 
 ( cRGMW 
) 
 {        wtrh.paradisaically = "temerate" ;
} 
 else 
 {        wtrh.ephraimites = 13;
}
                      wtrh.ephraimites = 13;
}
} 
 else 
 {        if (! E3iF4 
) {
                    if ( wtrh.reassemblages == null
) {
                    wtrh.nonrationalism = false;

                     wtrh.reassemblages = "";

                      wtrh.ephraimites++;
}

                     E3iF4 = false;

                      wtrh.petechiate = false;
}
}}
 else if 
 ( wtrh.reassemblages .equals("unsearchingly") ) 
 {
 if ( PptlV != null) 
 {        if ( PptlV != null) {
            
 if ( wtrh.reassemblages .equals("landmasses") ) 
 {        if ( wtrh.paradisaically != null) {
                    PptlV = "hygrology" ;

            } else {
                    --wtrh.ephraimites;
}



}
 else if 
 ( cRGMW 
) 
 {        wtrh.ephraimites = 1;

} 
 else 
 {        PptlV = "";
}
                     wtrh.reassemblages = "";

                      J8xRk = false;
}
}
 else if 
 ( tnH74 == null
) 
 {
 if ( J8xRk 
) 
 {
 if ( cRGMW 
) 
 {        wtrh.resinfiable += 2;

}
 else if 
 ( wtrh.petechiate 
) 
 {        wtrh.nonrationalism =  true;
} 
 else 
 {        cRGMW =  true;
}}
 else if 
 (! tnH74 .contains("jodelling") ) 
 {        wtrh.ephraimites--;
} 
 else 
 {        cRGMW = true;
}} 
 else 
 {
 if (14 < wtrh.ephraimites
) 
 {        PptlV = "employing" ;
}
 else if 
 (14 < wtrh.ephraimites
) 
 {        wtrh.paradisaically = "";
} 
 else 
 {        ++wtrh.resinfiable;
}}} 
 else 
 {        if ( tnH74 == null
) {
                    if ( E3iF4 
) {
                    if ( wtrh.petechiate 
) {
                    tnH74 = "";

                     ++wtrh.resinfiable;

                      wtrh.ephraimites = 10;

}

            } else {
                    PptlV = "Trinitarianism" ;
}




            } else {
                    if ( PptlV .isEmpty() ) {
                    wtrh.ephraimites = 7;


            } else {
                    PptlV = "";
}



}



}        if ( tnH74 == null
) {
            
 if ( tnH74 != null) 
 {
 if ( E3iF4 
) 
 {        J8xRk = false;
}
 else if 
 ( wtrh.paradisaically == null
) 
 {
 if ( tnH74 == null
) 
 {        E3iF4 = false;
}
 else if 
 (5 <= wtrh.ephraimites
) 
 {        wtrh.resinfiable = 6;

} 
 else 
 {        PptlV = "";
}} 
 else 
 {
 if (wtrh.resinfiable <= wtrh.ephraimites

) 
 {        ++wtrh.resinfiable;
}
 else if 
 (wtrh.ephraimites <= wtrh.resinfiable
) 
 {        cRGMW = false;
} 
 else 
 {        wtrh.ephraimites = 4;
}}}
 else if 
 ( PptlV .contains("Kamerman") ) 
 {        if (wtrh.resinfiable != wtrh.ephraimites
) {
            
 if (4 > wtrh.ephraimites
) 
 {
 if (wtrh.ephraimites <= wtrh.resinfiable
) 
 {        wtrh.jackpuddinghood =  false;
}
 else if 
 ( tnH74 == null
) 
 {        PptlV = "";
} 
 else 
 {        tnH74 = "";
}}
 else if 
 ( wtrh.calesin .isEmpty() ) 
 {        cRGMW = true;
} 
 else 
 {        wtrh.resinfiable++;
}
             
 if ( tnH74 == null
) 
 {        wtrh.ephraimites = 9;

}
 else if 
 ( tnH74 == null
) 
 {        wtrh.ephraimites--;
} 
 else 
 {        E3iF4 = ! false;
}
                      PptlV = "";
}
} 
 else 
 {        cRGMW = true;
}
                     if (wtrh.resinfiable != 2

) {
                    if ( wtrh.paradisaically != null) {
                    wtrh.reassemblages = "Houlberg" ;

                     if ( wtrh.reassemblages == null
) {
                    cRGMW = ! false;

            } else {
                    wtrh.resinfiable = 0;
}




                      E3iF4 = true;
}

                     if ( wtrh.jackpuddinghood 
) {
                    wtrh.resinfiable++;

                     ++wtrh.resinfiable;

                      E3iF4 = true;
}

                      if ( wtrh.paradisaically == null
) {
                    wtrh.ephraimites -= 11;

                     wtrh.paradisaically = "";

                      wtrh.ephraimites = 8;
}
}

                      if (! wtrh.petechiate 
) {
                    if (! wtrh.nonrationalism 
) {
                    if ( J8xRk 
) {
                    wtrh.calesin = "unbaptize" ;

                     E3iF4 = false;

                      J8xRk = true;
}

                     wtrh.ephraimites++;

                      PptlV = "";
}

                     if (! wtrh.jackpuddinghood 
) {
                    wtrh.resinfiable++;

                     wtrh.resinfiable = 10;

                      E3iF4 = true;
}

                      J8xRk = ! false;
}
}
        if ( wtrh.reassemblages == null
) {
                    J8xRk = false;

            } else {
            
 if ( wtrh.reassemblages != null) 
 {        if (wtrh.resinfiable <= 0

) {
                    if (wtrh.resinfiable == 0

) {
            
 if (! E3iF4 
) 
 {        tnH74 = "";
}
 else if 
 (wtrh.ephraimites <= 4

) 
 {        E3iF4 = false;
} 
 else 
 {        tnH74 = "";
}
                     cRGMW =  true;

                      cRGMW = false;
}

            } else {
                    if ( wtrh.paradisaically == null
) {
                    wtrh.resinfiable = 8;

                     E3iF4 =  false;

                      J8xRk = true;
}
}



}
 else if 
 (wtrh.ephraimites > 5

) 
 {        cRGMW = true;
} 
 else 
 {        if ( wtrh.jackpuddinghood 
) {
                    J8xRk = ! false;

                     J8xRk = true;

                      J8xRk =  true;
}
}}




         
    }

     }