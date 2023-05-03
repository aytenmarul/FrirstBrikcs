package firstBricks;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();


        if(sayi1>100){
            System.out.println("sayi1 100 den buyuktur ");
        }

        if(sayi1%2 == 0){
            System.out.println("sayi1 cift sayidir");
        }
        if(sayi1%2 != 0){
            System.out.println("sayi1 tektir");
        }
        if(sayi2%5==0){
            System.out.println("sayi2 5 in katidir ");
        }
        if (sayi1%3==sayi2%5){
            System.out.println("iki sayida 15 e bolunur");
        }
        boolean sonuc=sayi2>sayi1;


        if(sonuc){
            System.out.println("sayi2 buyuktur sayi1 den ");
        }

        String isim="inci";

if (isim.contains("i")){
    System.out.println("isimin icinde i harfi vardir");
}
if (!isim.contains("n")){
    System.out.println("isimde n harfi yoktur");

}
        System.out.println("lutfen usgen icin kenar uzunlugu giriniz ");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();
        if (kenar1 <= 0 || kenar2 <= 0 || kenar3 <= 0) {
            System.out.println("verilen deger ucgen olusturmaz");
        } else if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("eskanear ucgendir");
        } else
            System.out.println("eskenar ucgen degildir");
    }

}
