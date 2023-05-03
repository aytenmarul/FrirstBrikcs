package firstBricks.loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
// asagidaki iki yontemde ayni sonucu verir
//Genelde while loopu kac kere calistiricagmzi bilmiyosak veya
// bir bitis degeri veya baslangic yoksa kullanilir
//
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }


        int s = 10;
        while (s < 100) {
            s++;
        }
        System.out.print(s + " ");
        System.out.println(" ");
//        //Soru1: Kullanicidan sayi aliniz bu sayilarin kactane oldugunu ve toplamini bulunuz
//        //eger 0 girerse iselmi sonlandiriniz
        Scanner scan = new Scanner(System.in);
        int girilenSayi = 10;
        int countOfsayi = 0;
        int toplami = 0;
        System.out.println("lutfen sayi giriniz");
        while (girilenSayi != 0) {

            girilenSayi = scan.nextInt();
            if (girilenSayi != 0) {
                countOfsayi++;
                toplami += girilenSayi;
            }
        }
        System.out.println("Girilen " + countOfsayi + " sayilarin toplami " + toplami);
        //Soru2 Kullanicidan sayi aliniz bu sayilarin kactane oldugunu ve toplamini bulunuz.
        //  eger toplami 500 esitse veya gecerse "it is enough " yazdirin
        double num = 0;
        double sum = 0;
        int count = 0;
        while (sum < 500) {
            System.out.println("lutfen double sayi giriniz ");
            num = scan.nextDouble();
            sum += num;
            count++;
        }
        System.out.println("Girilen " + count + " sayilarin toplami " + sum);


        //Soru3: kullanicidan bir sifre aliniz ilk karakteri kucuk harf son karakteride sayi olmalidir
        String sifre = "";
        boolean gecerliSifremi = false;
        int countSifre = 0;
        System.out.println("lutfen sifre giriniz");
        while (gecerliSifremi != true) {

            sifre = scan.nextLine();
            if (!(sifre.charAt(0) >= 'a') && sifre.charAt(0) <= 'z') {
                System.out.println("sifrenin ilk karakteri kucuk harf olmalidir ");
                countSifre++;
            }
            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
                System.out.println("sifrenin son karakteri rakam olmalidir ");
                countSifre++;
            }
            if (sifre.length() < 8) {
                System.out.println("sifre en az 8 karakterden olusmalidir");
                countSifre++;
            }
            if (countSifre == 0) {
                gecerliSifremi = true;
                System.out.println("sifreniz basari ile kaydedildi");
            }
        }

    }
}

