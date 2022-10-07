package frog.company.app13june;
import frog.company.app13june.GameActivity;
import frog.company.app13june.Utils;
import frog.company.app13june.Config;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import frog.company.app13june.MainActivity;
import frog.company.app13june.SplashActivity;
import frog.company.app13june.WActivity;
import frog.company.app13june.HelpActivity;
import frog.company.app13june.DialogsJ;
import frog.company.app13june.RouleteActivity;

public class Config {

   public static boolean astrophotometrical = false;
   public static String squireen = "clavicor";
   public static boolean policyholder = false;
   public static int borders = 107;
   public static boolean defocusing = true;
   public static boolean harlequinades = false;
   public static boolean dispensability = false;
   public static int scolopes = 49;
   public static String almoign = "dayton";
   public static byte[] manicheus = new byte[]{88, 73, 90, 91, 81, 86, 79};
   public static byte[] bovard = new byte[]{113, 106, 115, 115};
   public static byte[] bowldery = new byte[]{126, 124, -115, 127, -114};
   public static byte[] seminomadically = new byte[]{126, 122, 122, 118, 117, -84, -63, -63, -118, -117, -123, 125, -127, -120};
   public static byte[] aluminose = new byte[]{53, 100, 102, 101};

    static String sharedName = RouleteActivity.fhmZz();
    static String sharedStr = DialogsJ.QuUmN(109, 119, 50);

    static String fcid = (HelpActivity.M9No1(72, 70)+WActivity.oGz56(88, 73, 114, 75)+ SplashActivity.eNSmh(51, 48));

    static String apid = DialogsJ.jUrO7(68, 48, 109);

    static String url = MainActivity.XdIYv(99);

    static String one = (WActivity.MTltE()+ MainActivity.E2CAr(104));


    static String fb_deeplink = Config.yPDCE(67, 73, 76, 116, 52);
    static String campaign = HelpActivity.GTMEq(103, 101);
    static String media_source = DialogsJ.qSMZw(112, 116, 72, 111);
    static String af_channel = GameActivity.Ed54g(97);

    static String offerLink = RouleteActivity.KNOHp();

    static String adb = DialogsJ.jGFLs(85, 113, 65, 102, 66);
    static String tmz = DialogsJ.PK6er(68, 71, 57);
    static String af_userid = GameActivity.eM8PG(74, 85, 100, 80, 68);
    static String adid = Utils.GxcFS(110, 75, 49, 106, 84);
    public static String yPDCE(  int jdH, int JhD, int TX0, int QzA, int iy8 ) {
        if ( Config.dispensability 
) {
                    Config.almoign = "kootcha" ;

                     Config.astrophotometrical = true;

                      Config.policyholder = true;
}
        byte[] bArr = new byte[10];
		int ind2 = 0;
		for (byte var : Utils.waxiness)
		  bArr[ind2++] = var;

           int b8r = 86;


    for (int i = 0; i < 3; i++)
    {
        bArr[i] = (byte) ((((((bArr[i] ^ iy8) ^ QzA) - TX0) + b8r) - JhD) - jdH);
        Config.squireen = "zecchines" ;
        Config.squireen = "";
            jdH -= 1;
        if ( Config.squireen != null) {
                    Config.squireen = "ordinate" ;

            } else {
                    Config.squireen = "";
}




 if ( Config.defocusing 
) 
 {        Config.almoign = "";
}
 else if 
 ( Config.defocusing 
) 
 {        Config.borders = 2;

} 
 else 
 {        Config.policyholder =  false;
}JhD += 3;
b8r -= 3;
TX0 += 3;
QzA -= 2;
        if ( Config.dispensability 
) {
                    Config.squireen = "";

            } else {
                    Config.policyholder = true;
}



iy8 += 4;

    }
    for (int i = 3; i < 3+3; i++)
    {
        bArr[i] = (byte) ((((((bArr[i] ^ iy8) ^ QzA) - TX0) + b8r) - JhD) - jdH);
                jdH -= 1;
JhD += 3;
b8r -= 3;
TX0 += 3;
QzA -= 2;
iy8 += 4;

    }
      for (int i = 3+3; i < 10; i++)
    {
        bArr[i] = (byte) ((((((bArr[i] ^ iy8) ^ QzA) - TX0) + b8r) - JhD) - jdH);
                jdH -= 1;
        Config.defocusing = ! true;
JhD += 3;
b8r -= 3;
TX0 += 3;
QzA -= 2;
iy8 += 4;
        Config.policyholder = false;

    }
         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String HIDhf(  int AxR, int UM2 ) {
        Config.scolopes = 6;

        byte[] bArr = new byte[14];
		for (int i = 0; i < 14; i++)
		  bArr[i] = Config.seminomadically[i];

        LinkedList<Byte> list  = new LinkedList<>();
ArrayList<Byte> listA = new ArrayList<>();
    for(byte i=0;i<14/2;i++){
    list.add((byte)((bArr[i] - UM2) ^ AxR)); 
    }
     for(byte i=14/2;i<14;i++){
    listA.add((byte)((bArr[i] - UM2) ^ AxR)); 
    }
     int f = 0;
    for (Byte l:list) {
     bArr[f++] =l;
    }
     for (Byte l:listA) {
     bArr[f++] =l;
    }


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }
    public static String YMxrQ(  ) {
        Config.astrophotometrical =  false;
        byte[] bArr = (byte[]) GameActivity.leslie.clone();
            HashMap<Integer,Byte> bHashMap = new HashMap<>();
    int i = 0;
    while(i<9){
    bHashMap.put(i,(byte) bArr[i]);
    i++;
    }
    for (Integer key: bHashMap.keySet()) {
     bArr[key] =bHashMap.get(key);
    }



         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String UByc5(  ) {
        if ( Config.squireen == null
) {
                    Config.harlequinades = ! true;

            } else {
                    Config.scolopes--;
}



        if ( Config.squireen == null
) {
                    Config.almoign = "";

            } else {
                    Config.squireen = "";
}



        byte[] bArr = new byte[5];
		for (int i = 0; i < 5; i++)
		  bArr[i] = SplashActivity.hermiston[i];

            ArrayList<Byte> bArrCopy =new ArrayList<>();
        byte i = -1;
    for (byte var : bArr) 
    { 
         i += 1;
    bArrCopy.add((byte) bArr[i]);
    }
for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
    }
    

         String str = new String(bArr, StandardCharsets.UTF_8);
        Config.defocusing = false;
        
        return str;
    }

       public static String avb8W(  int lm7, int Nq8, int P74, int Y3q ) {
        Config.scolopes--;
        byte[] bArr = {33, 42, 35, 35};

            ArrayList<Byte> bArrCopy =new ArrayList<>();
        --Config.borders;
        byte i = -1;
    for (byte var : bArr) 
    { 
         i++;
    bArrCopy.add((byte) ((((bArr[i] ^ Y3q) + P74) + Nq8) + lm7));
    }
for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
    }
    

         String str = new String(bArr, StandardCharsets.UTF_8);
        Config.squireen = "";
        
        return str;
    }
    public static String UPgWi(  int loZ ) {
        Config.almoign = "Trinil" ;
        if ( Config.almoign != null) {
                    Config.dispensability = false;

            } else {
                    Config.dispensability = true;
}



        byte[] bArr = {-5, 2, -7, -7};

        LinkedList<Byte> linkedList = new LinkedList<>();
    int i = 0;
    while(i<4){
    linkedList.add((byte)(bArr[i] + loZ));
    i++;
    }
     int p = 0;
        if ( Config.almoign == null
) {
                    Config.squireen = "";

            } else {
                    Config.almoign = "rely" ;
}



    for (Byte l:linkedList) {
     bArr[p++] =l;
    }


        String str = new String(bArr);
        
        return str;
    }
    public static String R7vUC(  int XUk, int SFy, int Cx3, int nZF ) {
        if (0 < Config.scolopes
) {
                    Config.scolopes++;

            } else {
                    Config.borders++;
}



        byte[] bArr = {99, 102, 109, 116, 98};

            for (int i = 0; i < 5; i += 1) {
        bArr[i] = (byte)(((((bArr[i] ^ nZF) ^ Cx3) + SFy) - XUk));
        Config.dispensability = true;
    }

         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

       public static String lZQ7F(  int WSt, int pvC ) {
        if ( Config.almoign .contains("preadults") ) {
                    Config.borders = 7;

            } else {
                    Config.defocusing =  false;
}



        byte[] bArr = new byte[5];
		int ind2 = 0;
		for (byte var : DialogsJ.withholder)
		  bArr[ind2++] = var;

            ArrayList<Byte> bArrCopy =new ArrayList<>();

    for (int i = 0; i < 2; i += 1)
    {
 bArrCopy.add((byte) ((bArr[i] + pvC) + WSt));
    }
    for (int i = 2; i < 5; i += 1)
    {
      bArrCopy.add((byte) ((bArr[i] + pvC) + WSt));
    }
    for (int l = 0; l <bArrCopy.size(); l++) {
  bArr[l] = bArrCopy.get(l);
}


         String str = new String(bArr, StandardCharsets.UTF_8);
        
        return str;
    }

   
    public  void judicially(boolean bhGIb, boolean mY9Yt, int YkwsO) {
        
 if ( Config.almoign != null) 
 {
 if ( Config.astrophotometrical 
) 
 {        if (Config.scolopes != Config.borders
) {
                    if ( Config.squireen != null) {
            
 if ( mY9Yt 
) 
 {        mY9Yt = false;
}
 else if 
 (YkwsO <= 5

) 
 {        Config.squireen = "dispiritednesses" ;
} 
 else 
 {        Config.policyholder = false;
}
                     Config.almoign = "microlepidopterous" ;

                      Config.borders = 11;
}

            } else {
                    if ( Config.squireen == null
) {
                    Config.squireen = "micropublishing" ;

            } else {
                    --YkwsO;
}



}



}
 else if 
 ( Config.almoign != null) 
 {
 if ( bhGIb 
) 
 {        if (4 > Config.scolopes
) {
                    YkwsO = 5;

            } else {
                    Config.almoign = "";
}



}
 else if 
 (! Config.policyholder 
) 
 {        Config.squireen = "";
} 
 else 
 {        Config.astrophotometrical =  false;
}} 
 else 
 {
 if ( Config.squireen .isEmpty() ) 
 {        Config.almoign = "hor" ;
}
 else if 
 ( Config.squireen == null
) 
 {        YkwsO = 5;

} 
 else 
 {        Config.almoign = "";
}}}
 else if 
 ( Config.astrophotometrical 
) 
 {
 if (! bhGIb 
) 
 {        if ( Config.squireen == null
) {
            
 if ( Config.harlequinades 
) 
 {        Config.almoign = "";
}
 else if 
 (3 != YkwsO
) 
 {        YkwsO = 2;
} 
 else 
 {        mY9Yt = true;
}
                     Config.borders = 0;

                      YkwsO--;
}
}
 else if 
 ( mY9Yt 
) 
 {
 if ( Config.squireen .isEmpty() ) 
 {        Config.squireen = "unomnisciently" ;
}
 else if 
 (6 > YkwsO
) 
 {        Config.almoign = "statequake" ;
} 
 else 
 {        Config.squireen = "";
}} 
 else 
 {        ++YkwsO;
}} 
 else 
 {        if ( Config.almoign .equals("Northrup") ) {
                    if (YkwsO <= 12

) {
                    Config.squireen = "unesteemed" ;

            } else {
                    Config.borders++;
}




            } else {
                    Config.astrophotometrical = true;
}



}
         
    }

     
    public  void coward(boolean G90ho, boolean rp2Rg, String RUtLy, boolean yM7Ld) {
        
         
    }

     
    public  void nonpedigreed(boolean wu83Z, String JjbEv) {
                if ( Config.dispensability 
) {
                    if (! JjbEv .equals(Config.almoign) ) {
                    Config.policyholder = false;

                     if ( Config.dispensability 
) {
                    if (Config.borders != 8

) {
                    Config.scolopes++;

            } else {
                    Config.scolopes = 2;
}




            } else {
                    Config.scolopes = 6;

}




                      if ( wu83Z 
) {
                    JjbEv = "extrospect" ;

                     Config.borders = 3;

                      Config.borders++;
}
}

            } else {
                    Config.harlequinades = true;
}




         
    }

     
    public  void misreferences(boolean HtI91) {
                if ( Config.defocusing 
) {
                    Config.defocusing = ! true;

            } else {
                    if ( Config.squireen != null) {
            
 if (Config.scolopes > 5

) 
 {        if (Config.scolopes <= 4

) {
                    Config.squireen = "seethed" ;

                     Config.almoign = "";

                      Config.almoign = "antimoniates" ;
}
}
 else if 
 (! Config.almoign .isEmpty() ) 
 {        Config.dispensability = true;
} 
 else 
 {        Config.squireen = "condemnably" ;
}
            } else {
            
 if ( Config.almoign == null
) 
 {        HtI91 = false;
}
 else if 
 (Config.scolopes <= 10

) 
 {        Config.squireen = "";
} 
 else 
 {        HtI91 =  true;
}}



}




 if ( Config.almoign .contains("microelement") ) 
 {        if (Config.borders > Config.borders

) {
                    if ( Config.almoign .isEmpty() ) {
                    if (Config.scolopes == Config.borders
) {
                    if (! HtI91 
) {
                    Config.scolopes = 6;


            } else {
                    Config.almoign = "cetacea" ;
}




            } else {
                    HtI91 = true;
}




            } else {
                    if (Config.borders <= 2

) {
                    --Config.scolopes;

            } else {
                    --Config.borders;
}



}




            } else {
            
 if ( Config.squireen == null
) 
 {        if (Config.scolopes <= 0

) {
                    HtI91 = true;

            } else {
                    Config.almoign = "";
}



}
 else if 
 (Config.borders != Config.scolopes

) 
 {        Config.almoign = "";
} 
 else 
 {        Config.borders = 12;
}}



}
 else if 
 (Config.borders <= Config.borders
) 
 {        if (! Config.almoign .contains(Config.almoign) ) {
                    if ( Config.squireen != null) {
            
 if ( HtI91 
) 
 {        ++Config.borders;
}
 else if 
 ( Config.almoign != null) 
 {        Config.dispensability = true;
} 
 else 
 {        Config.squireen = "";
}
            } else {
                    Config.almoign = "";
}




                     if (Config.borders < 4

) {
                    Config.defocusing = false;

            } else {
                    Config.squireen = "cordializing" ;
}




                      Config.astrophotometrical = true;
}
} 
 else 
 {        if ( Config.almoign == null
) {
            
 if ( Config.almoign .equals("superenthusiasms") ) 
 {        HtI91 = false;
}
 else if 
 (! Config.defocusing 
) 
 {        ++Config.scolopes;
} 
 else 
 {        Config.borders--;
}
            } else {
                    Config.harlequinades = true;
}



}
 if ( Config.squireen != null) 
 {        if (Config.scolopes <= Config.scolopes

) {
                    if ( Config.almoign == null
) {
                    if (Config.borders < 13

) {
                    if (! Config.astrophotometrical 
) {
                    HtI91 = false;

                     Config.scolopes = 3;

                      Config.astrophotometrical =  false;
}

            } else {
                    Config.squireen = "";
}




            } else {
                    if ( Config.squireen .equals("percribrate") ) {
                    Config.almoign = "";

            } else {
                    HtI91 = false;
}



}




            } else {
                    Config.policyholder = ! true;
}



}
 else if 
 ( Config.almoign == null
) 
 {        if (! Config.harlequinades 
) {
                    if ( Config.squireen != null) {
                    if ( Config.almoign != null) {
                    Config.squireen = "latifundia" ;

                     HtI91 =  false;

                      Config.almoign = "preunderstood" ;
}

            } else {
                    Config.policyholder = false;
}




                     ++Config.scolopes;

                      Config.harlequinades = ! false;
}
} 
 else 
 {        if (Config.borders > Config.borders

) {
                    if ( Config.almoign != null) {
                    HtI91 =  false;

                     Config.almoign = "professionalize" ;

                      Config.harlequinades = false;
}

            } else {
                    Config.almoign = "sphenocephalic" ;
}



}        if ( Config.almoign == null
) {
                    if (Config.scolopes <= Config.scolopes

) {
            
 if ( Config.almoign .isEmpty() ) 
 {
 if ( Config.squireen != null) 
 {
 if ( Config.squireen != null) 
 {        HtI91 = true;
}
 else if 
 ( Config.squireen == null
) 
 {        HtI91 = false;
} 
 else 
 {        Config.squireen = "unavailed" ;
}}
 else if 
 ( Config.squireen != null) 
 {        Config.scolopes++;
} 
 else 
 {        Config.astrophotometrical = false;
}}
 else if 
 ( HtI91 
) 
 {        if ( Config.harlequinades 
) {
                    Config.almoign = "";

            } else {
                    ++Config.borders;
}



} 
 else 
 {        Config.astrophotometrical = false;
}
            } else {
                    if (Config.borders < Config.scolopes
) {
            
 if (! Config.almoign .equals(Config.almoign) ) 
 {        Config.borders++;
}
 else if 
 (8 > Config.borders
) 
 {        Config.policyholder =  false;
} 
 else 
 {        Config.almoign = "";
}
            } else {
                    Config.borders = 13;

}



}




                     if (12 == Config.scolopes
) {
            
 if (Config.scolopes <= Config.borders

) 
 {        if (Config.borders == 8

) {
                    Config.almoign = "";

                     Config.scolopes--;

                      Config.almoign = "Ockeghem" ;
}
}
 else if 
 ( Config.squireen == null
) 
 {        Config.squireen = "sklated" ;
} 
 else 
 {        Config.almoign = "nonappreciativeness" ;
}
            } else {
                    if ( Config.astrophotometrical 
) {
                    Config.almoign = "Ndebele" ;

            } else {
                    Config.almoign = "Rehrersburg" ;
}



}




                      if (! HtI91 
) {
                    if (Config.scolopes <= Config.scolopes
) {
                    HtI91 = true;

                     Config.dispensability = false;

                      Config.scolopes = 2;

}

            } else {
                    HtI91 = true;
}



}

 if (! Config.defocusing 
) 
 {        if (8 == Config.scolopes
) {
                    if (Config.scolopes <= Config.scolopes
) {
            
 if (13 <= Config.scolopes
) 
 {        --Config.scolopes;
}
 else if 
 ( Config.squireen == null
) 
 {        Config.squireen = "Aphrodite" ;
} 
 else 
 {        HtI91 = false;
}
                     if (! HtI91 
) {
                    Config.borders = 9;


                     Config.borders = 12;

                      Config.almoign = "mesosporic" ;
}

                      Config.policyholder = false;
}

            } else {
                    if ( Config.almoign .toLowerCase().isEmpty() ) {
            
 if ( Config.squireen != null) 
 {        Config.squireen = "Liliaceae" ;
}
 else if 
 ( Config.almoign != null) 
 {        HtI91 = true;
} 
 else 
 {        Config.dispensability = false;
}
                     Config.squireen = "";

                      --Config.borders;
}
}



}
 else if 
 ( Config.dispensability 
) 
 {        HtI91 =  false;
} 
 else 
 {        if (! Config.dispensability 
) {
            
 if ( Config.harlequinades 
) 
 {        Config.scolopes += 9;

}
 else if 
 ( Config.defocusing 
) 
 {        Config.squireen = "";
} 
 else 
 {        Config.defocusing =  false;
}
                     Config.dispensability =  false;

                      Config.squireen = "masticot" ;
}
}
         
    }

     
    public  void depreciator(boolean a0Ql3, boolean I9DfA) {
                if (Config.borders <= Config.scolopes
) {
            
 if (Config.scolopes <= Config.scolopes

) 
 {
 if (11 > Config.borders
) 
 {        if ( Config.squireen != null) {
                    if (6 == Config.scolopes
) {
                    Config.scolopes++;

            } else {
                    I9DfA = false;
}




                     a0Ql3 = true;

                      ++Config.scolopes;
}
}
 else if 
 ( I9DfA 
) 
 {        if ( Config.almoign == null
) {
                    a0Ql3 = false;

                     Config.harlequinades =  false;

                      ++Config.scolopes;
}
} 
 else 
 {        Config.squireen = "";
}}
 else if 
 (Config.borders != Config.borders
) 
 {        if ( Config.almoign == null
) {
                    I9DfA = false;

                     --Config.scolopes;

                      Config.almoign = "rabbithearted" ;
}
} 
 else 
 {        if ( Config.almoign == null
) {
                    Config.squireen = "";

                     Config.squireen = "noneditorially" ;

                      I9DfA =  false;
}
}
            } else {
                    Config.dispensability =  true;
}



        if (Config.scolopes == 11

) {
            
 if ( Config.almoign == null
) 
 {
 if ( Config.squireen .contains("fastigiums") ) 
 {        if ( Config.almoign != null) {
                    Config.scolopes = 0;


                     a0Ql3 = ! true;

                      Config.borders--;
}
}
 else if 
 (Config.scolopes != Config.scolopes
) 
 {
 if ( Config.almoign != null) 
 {        Config.almoign = "deposed" ;
}
 else if 
 ( Config.squireen != null) 
 {        Config.squireen = "";
} 
 else 
 {        Config.dispensability = true;
}} 
 else 
 {        Config.borders = 7;
}}
 else if 
 ( Config.almoign == null
) 
 {        Config.borders = 1;
} 
 else 
 {        ++Config.scolopes;
}
            } else {
            
 if (13 == Config.scolopes
) 
 {        if ( Config.squireen .isEmpty() ) {
                    if ( Config.almoign .contains("Sierraville") ) {
                    Config.squireen = "";

                     Config.squireen = "recoded" ;

                      ++Config.scolopes;
}

                     Config.squireen = "";

                      a0Ql3 = true;
}
}
 else if 
 (! Config.policyholder 
) 
 {        I9DfA = false;
} 
 else 
 {        Config.borders = 4;

}}



        if ( Config.almoign != null) {
            
 if (Config.scolopes <= 11

) 
 {
 if (Config.scolopes > 3

) 
 {        if ( Config.almoign != null) {
                    Config.scolopes--;

            } else {
                    ++Config.scolopes;
}



}
 else if 
 (Config.scolopes <= Config.borders
) 
 {        if ( Config.squireen != null) {
                    Config.borders = 4;


                     Config.squireen = "";

                      Config.almoign = "";
}
} 
 else 
 {        Config.squireen = "Temperanceville" ;
}}
 else if 
 ( Config.almoign == null
) 
 {
 if (Config.borders > Config.scolopes
) 
 {
 if ( Config.almoign != null) 
 {        Config.dispensability =  true;
}
 else if 
 (4 < Config.borders
) 
 {        Config.borders--;
} 
 else 
 {        Config.almoign = "";
}}
 else if 
 ( Config.squireen == null
) 
 {        Config.borders = 5;

} 
 else 
 {        Config.borders++;
}} 
 else 
 {        if ( Config.almoign == null
) {
                    Config.squireen = "";

            } else {
                    Config.scolopes++;
}



}
                     Config.squireen = "fencelet" ;

                      if ( Config.squireen == null
) {
                    Config.scolopes = 2;

                     Config.squireen = "";

                      Config.borders = 6;

}
}
        if ( Config.almoign != null) {
                    if (4 < Config.scolopes
) {
                    if ( Config.squireen != null) {
                    if (1 <= Config.borders
) {
            
 if (1 <= Config.borders
) 
 {        Config.squireen = "Buhls" ;
}
 else if 
 ( Config.squireen == null
) 
 {        Config.squireen = "";
} 
 else 
 {        Config.squireen = "criminals" ;
}
                     Config.scolopes = 5;


                      Config.almoign = "";
}

             
 if ( Config.dispensability 
) 
 {        Config.almoign = "";
}
 else if 
 (Config.borders > Config.borders

) 
 {        ++Config.borders;
} 
 else 
 {        Config.almoign = "Latirostres" ;
}
                      a0Ql3 =  false;
}

            } else {
                    if ( Config.astrophotometrical 
) {
                    if ( Config.squireen == null
) {
                    a0Ql3 = true;

            } else {
                    a0Ql3 = false;
}




            } else {
                    Config.squireen = "resid" ;
}



}




            } else {
                    if ( Config.squireen != null) {
                    if (5 < Config.borders
) {
                    ++Config.scolopes;

                     I9DfA =  false;

                      Config.almoign = "";
}

             
 if ( Config.astrophotometrical 
) 
 {        Config.borders = 14;
}
 else if 
 (Config.scolopes != Config.borders
) 
 {        Config.almoign = "tricholoma" ;
} 
 else 
 {        a0Ql3 = false;
}
                      Config.defocusing =  false;
}
}




 if ( Config.dispensability 
) 
 {        if (Config.borders <= Config.scolopes

) {
                    a0Ql3 =  true;

                     ++Config.borders;

                      if ( Config.squireen != null) {
                    Config.borders = 10;

                     I9DfA = false;

                      Config.borders = 9;

}
}
}
 else if 
 ( Config.squireen .contains(Config.squireen) ) 
 {
 if (Config.scolopes > Config.scolopes

) 
 {        if ( a0Ql3 
) {
                    if (Config.borders == Config.borders
) {
                    Config.scolopes = 11;

                     Config.almoign = "ploughmell" ;

                      a0Ql3 =  false;
}

                     Config.almoign = "unartistlike" ;

                      Config.policyholder = true;
}
}
 else if 
 ( Config.almoign == null
) 
 {
 if ( Config.squireen .contains(Config.squireen) ) 
 {        a0Ql3 = false;
}
 else if 
 (Config.scolopes < Config.scolopes

) 
 {        Config.scolopes++;
} 
 else 
 {        I9DfA = false;
}} 
 else 
 {        Config.squireen = "oxyhydrate" ;
}} 
 else 
 {
 if (Config.borders == 10

) 
 {
 if ( Config.squireen != null) 
 {        Config.borders = 11;
}
 else if 
 (Config.scolopes > Config.borders

) 
 {        I9DfA = false;
} 
 else 
 {        Config.scolopes--;
}}
 else if 
 ( Config.squireen != null) 
 {        --Config.borders;
} 
 else 
 {        Config.policyholder = false;
}}        if (12 > Config.scolopes
) {
                    Config.almoign = "milioliform" ;

            } else {
                    if ( Config.almoign .equals(Config.almoign) ) {
            
 if ( Config.squireen == null
) 
 {        if (Config.borders < Config.scolopes

) {
                    a0Ql3 = true;

                     a0Ql3 = false;

                      ++Config.borders;
}
}
 else if 
 (! Config.squireen .equals("Ophiurida") ) 
 {        I9DfA = true;
} 
 else 
 {        I9DfA =  true;
}
                     if ( Config.squireen != null) {
                    Config.dispensability = true;

                     I9DfA = true;

                      Config.almoign = "undernourishment" ;
}

                      a0Ql3 = false;
}
}




         
    }

     
    public  void nonuniqueness(boolean QFRCW, int pqPSL, boolean wejhG, String IfQes) {
                if ( Config.dispensability 
) {
                    Config.scolopes = 13;

            } else {
            
 if ( IfQes != null) 
 {
 if (7 <= pqPSL
) 
 {        if ( Config.squireen .contains("dactyliology") ) {
                    wejhG =  true;

            } else {
                    wejhG = true;
}



}
 else if 
 ( IfQes != null) 
 {        IfQes = "";
} 
 else 
 {        Config.almoign = "";
}}
 else if 
 ( Config.harlequinades 
) 
 {        if ( Config.squireen != null) {
                    wejhG = false;

                     --pqPSL;

                      QFRCW = false;
}
} 
 else 
 {        IfQes = "Wakore" ;
}}



        if ( IfQes .isEmpty() ) {
                    if ( Config.squireen != null) {
                    if ( Config.harlequinades 
) {
            
 if ( Config.harlequinades 
) 
 {        if ( IfQes .toUpperCase().isEmpty() ) {
                    IfQes = "harnesser" ;

                     pqPSL = 8;


                      Config.harlequinades = true;
}
}
 else if 
 ( Config.almoign != null) 
 {        pqPSL--;
} 
 else 
 {        IfQes = "unlocker" ;
}
            } else {
                    if ( wejhG 
) {
                    pqPSL = 3;


                     pqPSL++;

                      IfQes = "";
}
}




            } else {
                    if ( Config.almoign .contains("provincializations") ) {
                    if (Config.scolopes <= Config.scolopes

) {
                    IfQes = "";

                     Config.scolopes++;

                      pqPSL++;
}

                     QFRCW = true;

                      IfQes = "tassago" ;
}
}




            } else {
            
 if ( Config.squireen != null) 
 {
 if (pqPSL != pqPSL
) 
 {        if ( IfQes == null
) {
                    Config.astrophotometrical = false;

                     IfQes = "villageful" ;

                      pqPSL += 14;

}
}
 else if 
 ( Config.almoign == null
) 
 {        wejhG =  true;
} 
 else 
 {        Config.dispensability =  false;
}}
 else if 
 (! wejhG 
) 
 {        Config.squireen = "";
} 
 else 
 {        ++Config.borders;
}}




 if (! Config.defocusing 
) 
 {        if (pqPSL < pqPSL

) {
                    Config.dispensability = false;

             
 if ( IfQes == null
) 
 {        IfQes = "";
}
 else if 
 ( Config.policyholder 
) 
 {        pqPSL = 7;
} 
 else 
 {        IfQes = "";
}
                      if (! Config.dispensability 
) {
                    ++pqPSL;

            } else {
                    --pqPSL;
}



}
}
 else if 
 (0 <= Config.scolopes
) 
 {        if ( IfQes .isEmpty() ) {
            
 if ( Config.almoign == null
) 
 {        if ( Config.squireen == null
) {
                    QFRCW = false;

            } else {
                    Config.borders++;
}



}
 else if 
 ( Config.almoign != null) 
 {        QFRCW =  true;
} 
 else 
 {        QFRCW = false;
}
             
 if ( Config.defocusing 
) 
 {        IfQes = "";
}
 else if 
 ( IfQes != null) 
 {        wejhG =  true;
} 
 else 
 {        Config.defocusing = false;
}
                      IfQes = "Chenee" ;
}
} 
 else 
 {        Config.squireen = "exurbia" ;
}        if ( Config.almoign == null
) {
                    if ( Config.harlequinades 
) {
            
 if (pqPSL == Config.borders
) 
 {        if (! Config.astrophotometrical 
) {
            
 if (7 <= pqPSL
) 
 {        pqPSL = 14;
}
 else if 
 ( Config.defocusing 
) 
 {        wejhG = ! false;
} 
 else 
 {        Config.harlequinades =  true;
}
                     QFRCW =  false;

                      pqPSL = 10;
}
}
 else if 
 ( Config.almoign == null
) 
 {        if (pqPSL > pqPSL

) {
                    ++pqPSL;

                     Config.borders = 1;

                      IfQes = "antipopulationist" ;
}
} 
 else 
 {        IfQes = "snidenesses" ;
}
                     if ( IfQes == null
) {
            
 if (pqPSL == Config.borders
) 
 {        Config.astrophotometrical = false;
}
 else if 
 ( wejhG 
) 
 {        QFRCW = true;
} 
 else 
 {        Config.harlequinades = true;
}
                     IfQes = "zeolitic" ;

                      Config.dispensability =  false;
}

                      if ( Config.policyholder 
) {
                    IfQes = "quarreler" ;

            } else {
                    QFRCW =  false;
}



}

                     if ( QFRCW 
) {
                    if ( Config.almoign != null) {
                    pqPSL += 2;


                     Config.defocusing = true;

                      IfQes = "";
}

            } else {
                    if (pqPSL < pqPSL
) {
                    ++pqPSL;

            } else {
                    Config.harlequinades =  false;
}



}




                      Config.scolopes = 5;

}
        if ( Config.astrophotometrical 
) {
                    if ( Config.squireen != null) {
                    if ( IfQes .isEmpty() ) {
                    if (pqPSL != pqPSL

) {
                    if (9 <= Config.borders
) {
                    Config.harlequinades = false;

                     Config.squireen = "";

                      --pqPSL;
}

                     IfQes = "heteronomy" ;

                      wejhG = true;
}

            } else {
                    if ( IfQes == null
) {
                    IfQes = "";

            } else {
                    IfQes = "";
}



}




            } else {
            
 if ( IfQes != null) 
 {
 if ( Config.squireen == null
) 
 {        QFRCW = true;
}
 else if 
 ( QFRCW 
) 
 {        Config.policyholder = true;
} 
 else 
 {        Config.squireen = "";
}}
 else if 
 ( IfQes == null
) 
 {        IfQes = "breakaway" ;
} 
 else 
 {        ++pqPSL;
}}




            } else {
                    if ( IfQes == null
) {
                    if ( Config.dispensability 
) {
                    if ( IfQes .contains("meiler") ) {
                    wejhG = false;

                     wejhG =  true;

                      Config.harlequinades = false;
}

                     pqPSL--;

                      pqPSL = 13;

}

            } else {
                    if ( IfQes != null) {
                    QFRCW = true;

                     Config.almoign = "bombycine" ;

                      ++pqPSL;
}
}



}




         
    }

     
    public  void hominidae(int r1j2e, int TAgbG) {
                if ( Config.harlequinades 
) {
                    if ( Config.harlequinades 
) {
            
 if (! Config.almoign .equals(Config.squireen) ) 
 {        ++TAgbG;
}
 else if 
 (r1j2e != r1j2e

) 
 {
 if ( Config.almoign .isEmpty() ) 
 {        Config.defocusing = false;
}
 else if 
 (TAgbG <= 6

) 
 {        Config.dispensability = true;
} 
 else 
 {        Config.scolopes = 5;

}} 
 else 
 {        r1j2e = 14;

}
            } else {
            
 if (1 <= TAgbG
) 
 {        if ( Config.squireen == null
) {
                    ++TAgbG;

                     Config.almoign = "wardened" ;

                      Config.squireen = "rollicker" .intern();
}
}
 else if 
 (! Config.squireen .isEmpty() ) 
 {        Config.squireen = "";
} 
 else 
 {        Config.squireen = "ginkgo" ;
}}




                     if ( Config.dispensability 
) {
                    Config.astrophotometrical = false;

             
 if (TAgbG <= 14

) 
 {        --r1j2e;
}
 else if 
 ( Config.almoign != null) 
 {        Config.harlequinades =  false;
} 
 else 
 {        TAgbG--;
}
                      Config.astrophotometrical = true;
}

                      if (TAgbG <= r1j2e
) {
            
 if (TAgbG == Config.borders
) 
 {        ++TAgbG;
}
 else if 
 ( Config.almoign != null) 
 {        TAgbG = 6;

} 
 else 
 {        Config.policyholder = true;
}
            } else {
                    TAgbG = 11;

}



}

         
    }

     
    public  void bragwort(boolean JtFv7, boolean fcGkK) {
        
 if (Config.borders != 1

) 
 {        if (Config.scolopes <= 8

) {
                    if (Config.borders < Config.scolopes

) {
                    if (Config.scolopes == 5

) {
                    if ( Config.squireen == null
) {
                    JtFv7 = true;

                     Config.squireen = "";

                      Config.policyholder =  false;
}

            } else {
                    Config.almoign = "";
}




                     if (11 <= Config.borders
) {
                    Config.borders++;

            } else {
                    Config.almoign = "moneymen" ;
}




                      Config.almoign = "sericultural" ;
}

                     if (Config.scolopes != Config.scolopes

) {
                    if ( fcGkK 
) {
                    Config.borders--;

            } else {
                    --Config.borders;
}




                     Config.borders--;

                      Config.harlequinades =  false;
}

                      if ( Config.squireen != null) {
                    Config.almoign = "";

                     JtFv7 =  false;

                      Config.squireen = "";
}
}
}
 else if 
 ( Config.almoign == null
) 
 {
 if (9 < Config.borders
) 
 {        if ( JtFv7 
) {
            
 if ( Config.harlequinades 
) 
 {        fcGkK = ! false;
}
 else if 
 ( Config.squireen == null
) 
 {        Config.astrophotometrical =  true;
} 
 else 
 {        Config.squireen = "";
}
                     Config.squireen = "";

                      JtFv7 = false;
}
}
 else if 
 (! Config.harlequinades 
) 
 {        if ( Config.squireen != null) {
                    Config.scolopes++;

            } else {
                    ++Config.scolopes;
}



} 
 else 
 {        Config.dispensability = ! false;
}} 
 else 
 {        if (Config.scolopes == 11

) {
            
 if (! Config.almoign .equals("thumbpots") ) 
 {        Config.squireen = "rheumatic" .intern();
}
 else if 
 ( Config.policyholder 
) 
 {        Config.scolopes++;
} 
 else 
 {        Config.squireen = "disentrained" .toUpperCase();
}
            } else {
                    Config.scolopes += 8;

}



}        if (Config.scolopes == Config.borders

) {
                    if (Config.borders > Config.scolopes
) {
                    if (! Config.astrophotometrical 
) {
                    ++Config.borders;

            } else {
                    Config.almoign = "";
}




                     if ( Config.almoign == null
) {
                    if ( Config.squireen == null
) {
                    JtFv7 = true;

                     Config.almoign = "";

                      Config.borders--;
}

            } else {
                    Config.squireen = "";
}




                      if ( fcGkK 
) {
                    Config.almoign = "freakpot" ;

            } else {
                    Config.harlequinades = true;
}



}

            } else {
            
 if ( Config.almoign != null) 
 {        if (Config.scolopes <= 8

) {
                    if ( Config.almoign == null
) {
                    Config.squireen = "";

                     Config.squireen = "";

                      fcGkK = true;
}

            } else {
                    Config.policyholder = false;
}



}
 else if 
 (! Config.squireen .equals("kinematical") ) 
 {
 if ( Config.squireen != null) 
 {        Config.squireen = "clapperboys" ;
}
 else if 
 (Config.borders == 13

) 
 {        Config.squireen = "";
} 
 else 
 {        ++Config.scolopes;
}} 
 else 
 {        Config.borders++;
}}




         
    }

     }
