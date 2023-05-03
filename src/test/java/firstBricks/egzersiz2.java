package firstBricks;

import java.util.Scanner;

public class egzersiz2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        if (s1 > 500) {
            System.out.println("ilk sayi 500 den buyuktur");
        }
        if (s2 % 2 == 0) {
            System.out.println("ikinci sayi cifttir");
        }
        if (s2 % 2 != 0) {
            System.out.println("ikinci sayi tektir");
        }
        boolean sart = s1 > s2;
        if (sart) {
            System.out.println("1.sayi 2.sayidan buyuktur ");

        }

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        if(kenar1==kenar2 && kenar3==kenar2){
            System.out.println("butun kenarlar esitse ucgendir");
        }
        else {
            System.out.println("degilse eskenar degildir");
        }

        int ogrencininNotu=48;
        if(ogrencininNotu<45){
            System.out.println("Ogrenci dersten gecememistir");
        }
        else if(ogrencininNotu<55){
            System.out.println("Ogrenci dersten gecer ile gecmistir ");
        }else if(ogrencininNotu<70){
            System.out.println("Ogrenci dersten orta ile gecmistir ");
        }else if(ogrencininNotu<85){
            System.out.println("Ogrenci dersi iyi ile gecmistir");
        }else if(ogrencininNotu<=100){
            System.out.println("ogrenci dersi pekiyi ile gecmitir ");
            System.out.println("tebrikler ");
        }else {
            System.out.println("Girilen not gecersizdir ");
        }

    }
}