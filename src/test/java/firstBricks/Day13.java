package firstBricks;

import java.util.Locale;

public class Day13 {
    public static void main(String[] args) {


//        for (int i = 0; i < name.length() ; i++) {
//            System.out.println(name);
//        }

        //            0123456
        String name ="melike ";
        String name2="zehra";
        System.out.println(name.startsWith("me"));// verilen harfin verya kelime ile  baslayip baslamaamsina gore true veya false verir
        System.out.println(name.endsWith("ke "));
        System.out.println(name.contains("l"));
        System.out.println(name.contains("y")); // bulundurup bulundurmamasina gore true veya false verir
        System.out.println(name.toUpperCase()); // verilen degrein hepsini buyuk harfle yazdirir
        System.out.println(name.charAt(5));// verilen sira numarasinin hangi karaktere denk geldigini verir
        System.out.println(name.indexOf('i')); // verilen harfin indexini yani sirasini bize hangi sirada oldugunu verir
        //Eger yoksa -1 verir
        System.out.println(name.equals(name2)); //iki degeri karsilastirir
        System.out.println(name.length());// verilen degerin uzunlugunu hesaplar
        // name.length()-1, name.length()-2 ,name.length()-3
        System.out.println(name);
        System.out.println(name.trim()); // bastaki ve sondaki boslugu yazdirmaz
        System.out.println(name.concat("demirturk"));
        System.out.println(name);
        System.out.println("///////////////////////////////////");
        name="said";


        String name1 =new String("said");
      System.out.println(name1);
       System.out.println(name);
       System.out.println(name==name1);// hafizdaki iki ayri bolme ayni ismi bize verir
        System.out.println(name.equals(name1));// iki ayri bolme ayni verilen degere mi sahip


//        System.out.println(name.indexOf('i'));
//        System.out.println(name.indexOf("said"));
//        System.out.println(name.indexOf(""));// "" hiclik yani biz herhangi bi yere bi karakter ekleyebilirmiyiz
//        // ilk hiclik nerdedir ?
//        System.out.println(name.startsWith(""));
//        System.out.println(name.contains(""));
//        System.out.println(name.contains(" "));
//       /// System.out.println(name.charAt(21)); //21 tane karakter yoksa
//        System.out.println(name.charAt('k')); //bide olmayan harf p yi arayalim var mi
//        String str2="Javanin kurallarini ogreniyoruz";
//        String str3="java";
//        System.out.println(str2.contains(str3));
//        System.out.println(str2.isEmpty());
//        boolean havaGunesli=true;
//        int mesafe=25;
//        System.out.println(str2.concat(havaGunesli));
//        System.out.println(str2.concat(mesafe));
   //     str.substring(0);



    }
}
