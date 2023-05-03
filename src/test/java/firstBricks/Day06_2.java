package firstBricks;

public class Day06_2 {
    public static void main(String[] args) {

        //Methodlarla matematikte 4 islem
        toplama(21,7);
        toplama(23,78);
        toplama(12,54);
        cikarma(76,34);
        bolme(80,4);
        carpma(15,9);
    }

    public static void toplama(int sayi1,int sayi2){
        int sayiToplma= sayi1+sayi2;
        System.out.println(sayiToplma);
    }
    public static void cikarma(int sayi1,int sayi2) {
        int sayiToplma = sayi1 - sayi2;
        System.out.println(sayiToplma);
    }
    public static void carpma(int sayi1,int sayi2) {
        int sayiToplma = sayi1 * sayi2;
        System.out.println(sayiToplma);
    }
    public static void bolme (int sayi1,int sayi2) {
        int sayiToplma = sayi1/ sayi2;
        System.out.println(sayiToplma);
    }
    }

