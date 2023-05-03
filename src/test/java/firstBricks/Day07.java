package firstBricks;

import java.util.Scanner;

public class Day07 {
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

        Scanner verilendeger =new Scanner(System.in);


        System.out.println("lutfen adinizi giriniz");
        String isim = verilendeger.nextLine();

        System.out.println("lutfen soyadinizi giriniz");
        String soyad = verilendeger.next();

        System.out.println("Ogrencimisiniz ?");
        boolean ogrenci = verilendeger.nextBoolean();

        System.out.println("Eger ogrenciyseniz sinifinizi giriniz");
        int sinif = verilendeger.nextInt();

        System.out.println("Lutfen sinifinizin turunu giriniz");
        char tur = verilendeger.next().charAt(0);

        System.out.println("lutfen boyunuzu yaziniznz");
        double boyu=verilendeger.nextDouble();

        System.out.println(isim + " " + soyad + " " + ogrenci + " "+sinif + " "+ tur +" " +boyu);


    }
}
