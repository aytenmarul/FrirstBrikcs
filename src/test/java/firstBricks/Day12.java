package firstBricks;

public class Day12 {
    public static void main(String[] args) {


   //     String dersadi = "Bugun pazartesi 12. haftadayiz";
////
////        System.out.println(dersadi.charAt(9));   // Sira numrasini verip hangi harfse yazdirir.a
////        System.out.println(dersadi.indexOf('a')); // verilen harfin sira numarasi yani indexini verir.8
////        System.out.println(dersadi.toUpperCase()); ///hepsini buyuk harfle yazdirir.BUGUN PAZARTESI
////        System.out.println(dersadi.toLowerCase()); //hepsini kucuk harfle yazdirir.bugun pazartesi
////        System.out.println("u harfi var mi ?" + dersadi.contains("u")); //true
////        System.out.println("k harfi var mi ?" + dersadi.contains("k")); //false
////        System.out.println(dersadi.contains("ucak"));
////        System.out.println(dersadi.contains("Bugunpazartesi")); //false
////        System.out.println(dersadi.startsWith("Bugun pazartesi"));
////       System.out.println(dersadi.startsWith("pazartesi"));
////        System.out.println(dersadi.endsWith("z"));
////        System.out.println(dersadi.endsWith("yiz"));
////        System.out.println(dersadi.endsWith("9. haftadayiz"));
//
//  //      System.out.println(dersadi.equals("Bugun pazartesi 12. haftadayiz"));
//
        String name = "zehra";
        String name2 = "zehra";
        String name3 = new String("zehra");
        System.out.println(name.equals(name2));
        System.out.println(name == name2);
        System.out.println(name3 == name2);
        System.out.println(name3.equals(name2));
        if (name.equals(name2)) {
            System.out.println("bu isimler esittir");
        }
        //ornek 1
        int sayi1 = 70;
        if (sayi1 % 7 == 0) {
            System.out.println("bu sayi 7 nin katidir ");
        } else if (sayi1 % 15 == 0 && sayi1 % 20 == 0) {
            System.out.println("sayi1 hem 15 ve 20 ye bolunur");
        } else if (sayi1 % 3 == 0) {
            System.out.println("sayi1 3 un katidir");
        }
//ornek 2
        int ogrencininNotu = 120;

        if (ogrencininNotu < 45) {
            System.out.println("Ogrenci dersten gecememistir");
        } else if (ogrencininNotu < 55) {
            System.out.println("Ogrenci dersten 2 ile gecmistir ");
        } else if (ogrencininNotu < 70) {
            System.out.println("Ogrenci dersten 3 ile gecmistir ");
        } else if (ogrencininNotu < 85) {
            System.out.println("Ogrenci dersi 4 ile gecmistir");
        } else if (ogrencininNotu <= 100) {
            System.out.println("ogrenci dersi 5 ile gecmitir ");
            System.out.println("tebrikler ");
        } else {
            System.out.println("Girilen not gecersizdir ");
        }

//ornek 3
        int gun = 13;
        if (gun == 1) {
            System.out.println("pazartesi");
        } else if (gun == 2) {
            System.out.println("sali");
        } else if (gun == 3) {
            System.out.println("carsamba");
        } else if (gun == 4) {
            System.out.println("persembe");
        } else if (gun == 5) {
            System.out.println("cuma");
        } else if (gun == 6) {
            System.out.println("cumartesi");
        } else if (gun == 7) {
            System.out.println("pazar");
        } else
            System.out.println("boyle gun sayisi yok haftada 7 gun vardir");

    }
}