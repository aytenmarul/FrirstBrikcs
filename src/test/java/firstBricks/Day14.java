package firstBricks;

public class Day14 {
    public static void main(String[] args) {
        String email = "ranayalcin@gmail";
        if (!email.contains("@")) {
            System.out.println("gecersiz email");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("emailde hata var");
        } else {
            System.out.println("tebrikler emailiniz basariyla kaydedildi");
        }
        String name = "melike ";

        System.out.println(name.startsWith("m")); // true// verilen harfin verya kelime ile  baslayip baslamaamsina gore true veya false verir

        System.out.println(name.endsWith("ke "));//true
        System.out.println(name.contains("l")); //true
        System.out.println(name.contains(""));// true
        System.out.println(name.contains(" ")); //true
        System.out.println(name.contains("y")); // bulundurup bulundurmamasina gore true veya false verir
        System.out.println(name.toUpperCase()); // verilen degrein hepsini buyuk harfle yazdirir
        System.out.println(name.charAt(5));// verilen sira numarasinin hangi karaktere denk geldigini verir
        //System.out.println(name.charAt(12));//verilen limit disinda charkter arattigimiz icin
        //System.out.println(name.charAt('j'));//verilen stringde aradanan harf yoksa exception
        System.out.println(name.indexOf('j')); // verilen harfin indexini yani sirasini bize hangi sirada oldugunu verir
        //Eger yoksa -1 verir


//        System.out.println(name.indexOf("said"));
        System.out.println(name.indexOf(""));// "" hiclik yani biz herhangi bi yere bi karakter ekleyebilirmiyiz
//        // ilk hiclik nerdedir ?
        System.out.println(name.startsWith(""));//true
        System.out.println(name.startsWith(" ")); //falsean harf p yi arayalim var mi
        String str2 = "Java nin kurallarini ogreniyoruz";
        String str3 = "java";
        int num1 = 5;
        String str4 = "phyton";
        boolean havagunesli = true;
        System.out.println(str2.contains(str3));
        System.out.println(str2.toLowerCase().contains(str3));
        System.out.println(str3.concat(" Said"));
        System.out.println(str3.concat(str3));
        // System.out.println(str2.concat(havagunesli)); //concat methodu diger data turlrini kabul etmez string gerekli
        String ders = "biology";
        System.out.println(ders.length() - 1);
        System.out.println(ders.length() - 2);
        System.out.println(ders.length() - 3);
        System.out.println(ders.substring(0, 3));
        System.out.println(ders.substring(3, 5));
        System.out.println(ders.substring(1));
        System.out.println(ders.substring(1, ders.length() - 2));
        System.out.println(ders.isEmpty());
       // System.out.println(ders.);

    }
}

