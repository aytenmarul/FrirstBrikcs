package firstBricks;

public class Day17 {
    public static void main(String[] args) {
        int sayi = 5;
        int sayi2 = 6;
        System.out.println(sayi);
        System.out.println(sayi2);
//// 1 den basla 20 ye kadar git 20 dahil
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
//        // 2 den basla 20 ye kadar git 20 dahil 2 serli git
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        // 1 den basla 20 ye kadar git 20 dahil  3 erli artirarak git
        for (int i = 5; i <= 50; i = i + 3) {
            System.out.print(i + " ");

        }
//        System.out.println(" ");
//        // 1 den basla 20 ye kadar git 20 dahil degil 3 erli artirarak git
//        for (int i = 2; i <20 ; i+=3) {
//            System.out.print(i +" ");
//
//        }
        System.out.println(" ");
        for (int i = 10; i > 0; i = i - 2) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
        for (int i = 1; i <= 300; i++) {
            //"5 ebolunen sayilar : "
//            if (i % 5 == 0) {
//                System.out.print(i + " ");
//            }
//         //   "7 ye bolunen sayilar: "
//            //System.out.println(" ");
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
//            //5 ve 7 ye tam bolunenler
//            if(i % 5 == 0 && i%7==0){
//                System.out.print(i+" ");
//
        }
//        }
        System.out.println(" ");
        int baslamaSayisi = 7;
        int bitissayisi = 90;
        for (int i = baslamaSayisi; i <= bitissayisi; i += 9) {
            System.out.print(i + " ");
        }
        System.out.println("");
// dikkat sonsuz loop hafizayi zorlar
        for (int i = 0; i > 5; i++) {
            System.out.print(i + " ");
        }
//SORU 4
// 5 factoriyeli bulunuz
        int num = 5;
        int factoriyelSonuc = 1;
        for (int i = num; i >= 1; i = i - 1) {
            factoriyelSonuc = factoriyelSonuc * i; //5*4*3*2*1=120
        }
        System.out.println(factoriyelSonuc);
        System.out.println(" ");
    }

}