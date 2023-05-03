package firstBricks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Day09 {
    public static void main(String[] args) {
        String dersadi ="Bugun pazartesi 9. haftadayiz";

        System.out.println(dersadi.charAt(7));   // Sira numrasini verip hangi harfse yazdirir.a
        System.out.println(dersadi.indexOf( 'z')); // verilen harfin sira numarasi yani indexini verir.8
        System.out.println(dersadi.toUpperCase()); ///hepsini buyuk harfle yazdirir.BUGUN PAZARTESI
        System.out.println(dersadi.toLowerCase()); //hepsini kucuk harfle yazdirir.bugun pazartesi
        System.out.println("u harfi var mi ?"+ dersadi.contains("u"));
        System.out.println("k harfi var mi ?"+ dersadi.contains("k"));
        System.out.println(dersadi.contains("ucak"));
        System.out.println(dersadi.contains("Bugunpazartesi"));
        System.out.println(dersadi.startsWith("Bugun pazartesi"));
        System.out.println(dersadi.startsWith("pazartesi"));
        System.out.println(dersadi.endsWith("z"));
        System.out.println(dersadi.endsWith("yiz"));
        System.out.println(dersadi.endsWith("9. haftadayiz"));

        System.out.println("???????????????????????????????????");
        int sayi1=5;
       int sayi2=15;
        if (sayi1 < 10) {
            System.out.println("sayi1 buyuk degildir 10 dan");
        }
        if (sayi1 == sayi2) {
            System.out.println("bu sayilar esittir");
        }
        if (sayi1 < sayi2) {
            System.out.println("sayi1 kucuktur sayi2 den ");
        }
        if (sayi1!=sayi2){
            System.out.println("bu sayilar esit degildir");

        }
        if (sayi1+10==sayi2){
            System.out.println("sayi2 sayi1 den 10 fazladir");
        }
        if(sayi1*3==sayi2){
            System.out.println("sayi2 sayi1 in 3 katidir");
        }
        System.out.println("============================================");

        int oykullanmayasi=10;

        if(oykullanmayasi>=18){
            System.out.println("oy kullanabilir");
        }
        if (oykullanmayasi<18){
            System.out.println("oy kullamaz");
        }
        System.out.println("/////////////////////");


        int emeklilikyasi=50;

        if(emeklilikyasi<60){
            System.out.println("60 yasini beklemeli");
        }else if(emeklilikyasi>45){
            System.out.println("emekli olabilir");
        }else if(emeklilikyasi==60){
            System.out.println("5 yil daha calismali");
        }
    }



}
