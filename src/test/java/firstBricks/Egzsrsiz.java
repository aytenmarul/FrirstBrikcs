package firstBricks;

import java.util.Scanner;

public class Egzsrsiz {
    public static void main(String[] args) {
/*
        byte verilcekDeger1=scan.nextByte();
        short velicekDeger2=scan.nextShort();
        long verilecekDeger3= scan.nextLong();
        int verilecekDeger4=scan.nextInt();
        double verilecekDeger5=scan.nextDouble();
        boolean verilecekDeger6=scan.nextBoolean();
       ***** char verilecekDeger7=scan.next().charAt(0);

 */

//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("lutfen adinizi giriniz");
//        String isim = scan.nextLine();
//        System.out.println("lutfen soyadinizi giriniz");
//        String soyad = scan.next();
//        System.out.println("Ogrencimisiniz ?");
//        boolean ogrenci = scan.nextBoolean();
//        System.out.println("Eger ogrenciyseniz sinifinizi giriniz");
//        int sinif = scan.nextInt();
//        System.out.println("Lutfen sinifinizin turunu giriniz");
//        char tur = scan.next().charAt(0);
//        System.out.println(isim + " " + soyad + " " + ogrenci + " "+sinif + " "+ tur);
//

        //primitive data type does not have methods object has methods


        /////////////////////////////////////////////////////////////

//        logical operator:
//        or is used ||
//        and is used &&
//
//        5 == 5 >>> > true
//        5 != 5 >>> false
//        !(5 == 5) >>>>>false
//        !true >>> false
//
//        int sayi1 = 20;
//        int sayi2 = 15;
//
//        System.out.println(sayi1==sayi2);
//        System.out.println(sayi1>sayi2);
//        System.out.println(sayi2>sayi1);
//        System.out.println(sayi1>sayi2 || sayi2<sayi1);
//        System.out.println(sayi1>sayi2 && sayi2<sayi1);
//
//        1 tane true yeter sonucun true olmasi icin
//        true || false >>>> true
//        true || true >>>>  true
//        false || true >>>> true
//        false || false >>> false
//
//         ikiside true olunca yada false olunca sonuc true olur
//        true || true >>>> true
//        true || false >>>>  false
//        false || true >>>> false
//        false || false >>>>true


//        System.out.println(dersadi.contains("pava"));
//        System.out.println("??????????????????");
//        System.out.println(dersadi==dersadi2);
//        System.out.println(dersadi.equalsIgnoreCase(dersadi2));
//        System.out.println(" //////////////////////////////////////////");
//        System.out.println(dersadi.equalsIgnoreCase(String.valueOf(dersadi.startsWith("bugun"))));
        //      if statements bagimsiz if ler
//        int a = 7;
//        int b = 12;
//        if (b < a) {
//            System.out.println("a buyuktur b den ");
//        }
//
//        if (b > a) {
//            System.out.println("b buyuktur a dan ");
//        }
//
//        if (b == a) {
//            System.out.println("b esittir a ");
//        }
//        if (b < 50) {
//            System.out.println("b buyuktur a dan ");
//        }
//        if (b > 50) {
//            System.out.println("b buyuktur a dan ");
//        }
//
//        if (b == a + 5) {
//            System.out.println("b buyuktur a dan ");
//        }
//            oy kullanma
//            emekli olma ornekleri
//

        ////////////////////////////////////////////////////////
//        int a = 5;
//        int b = 10;
//        boolean sonuc = b > a;
//        if (sonuc) {
//            System.out.println("b a dan buyuktur");
//        }
//        sonuc = a < 15;
//        if (sonuc) {
//            System.out.println("a 15 den kucuk");
//        }
/////////////////////////////////////////////

        int sayis = 3;
        int us = 5;
       //   hesapla(sayis,us);


//    public static void hesapla(int sayis,int us) {
//        int sonuc = 1;
//        while (us > 0) {
//            sonuc *= sayis;
//            us--;
//        }
//        System.out.println(sonuc +" degrei");
//    }
/////////////////////////////////////////////////////////////
       // bir sayinin rakamlar toplamini bulma
        int sayim=1453;
        int birelerbasmagi=0;
        int rakamtoplami=0;


       while (sayim!=0) {
           birelerbasmagi = sayim % 10;
           rakamtoplami += birelerbasmagi;
           sayim /= 10;
       }
        System.out.println(rakamtoplami);
        ////////////////////////////////////////////////////////
        int sayi5=10;
        int toplam=0;
        while(sayi5<=12){
            toplam +=sayi5;
            sayi5++;
        }
        System.out.println(toplam);
        //////////////////////////////////////////////////
        int sayi6=10;
        int toplam2=0;
        do{
            toplam=toplam+sayi5;
        sayi5++;
        }
        while (sayi5<=12);

}



    }

