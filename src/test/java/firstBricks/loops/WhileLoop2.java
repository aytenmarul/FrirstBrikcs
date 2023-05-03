package firstBricks.loops;

public class WhileLoop2 {
    public static void main(String[] args) {
        //Verilen bir sayinin rakamlar toplamini hesaplayiniz
        int sayi = 1453;
        int birlerbasamagi = 0;
        int rakamlartoplami = 0;
        while (sayi != 0) {
            birlerbasamagi = sayi % 10;
            rakamlartoplami += birlerbasamagi;
            sayi /= 10;
        }
        System.out.println(rakamlartoplami);


//kullanicidan bir sayi aliniz ve bu sayinin asal sayi olup olmadigini konrol ediniz
        int sayi1 = 103;
        boolean asalsayi = false;
        for (int i = 2; i <= sayi1; i++) {
            if (sayi1 % i == 0) {
                asalsayi = true;
                break;
            }
            //  System.out.println(i);
        }
        System.out.println(asalsayi);
    }
    }

