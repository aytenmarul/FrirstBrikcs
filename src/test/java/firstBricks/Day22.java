package firstBricks;

public class Day22 {
    // asagidaki iki yontemde ayni sonucu verir
//Genelde while loopu kac kere calistiricagmzi bilmiyosak veya
// bir bitis degeri veya baslangic yoksa kullanilir
//
    public static void main(String[] args) {

        for (int i = 10; i < 100; i++) {
            System.out.print(i + " "); //10
        }
        System.out.println(" ");
        ////////////////////////////
        int i = 9;
        while (i < 100) {
            i++; ///10
            System.out.print(i + " "); // 10
        }

        System.out.println(" ");
        ///////////////////////////////
        for (int k = 0; k < 20; k =k+5) {   //  k+=5     0=0+5  >5    5=5+5 > 10
            System.out.print(k + " ");
        }
        System.out.println("");
        int k=0;
        while (k<20){
            k=k+5;  //5
            System.out.print(k+" "); //5
        }

        System.out.println("");
        for (int j = 5; j >=0; j--) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        for (int j = 10; j > 0; j=j-2) {
            System.out.println(j+" ");
        }
        System.out.println(" ");

//        //Example
        int sonuc = 1;  //gecici
        for (int m = 1; m < 5; m++) {  //1x2x3x4

            sonuc=sonuc* m;  /// 1x1 1>>>> 1=1x2 >>>2 2=2x3>>> 6 6=6x4>>>24

        }
        System.out.print(sonuc);

        // 5 factoriyeli bulunuz

        System.out.println("");
        //////////////////////////////////////////
        int sonuc2 = 1;   //simdilik sonuc
        int num = 5;
        int num2= 1;
        for (int l = num; l >= num2; l--) {  //5x4x3x2x1
            sonuc2 =sonuc2*l;
        }
        System.out.println(sonuc2);
    }

}













////SORU 4
//// 5 factoriyeli bulunuz
//        int num = 5;
//
//        int fact = 1;
//        for (int i = num; i >= 1; i--) {
//            fact *= i;
//        }
//        System.out.println(fact);
//    }





////kullanicidan bir sayi aliniz ve bu sayinin asal sayi olup olmadigini konrol ediniz
//        int sayi1 = 103;
//        boolean asalsayi = false;
//        for (int i = 2; i <= sayi1; i++) {
//            if (sayi1 % i == 0) {
//                asalsayi = true;
//                break;
//            }
//            //  System.out.println(i);
//        }
//        System.out.println(asalsayi);
//    }
