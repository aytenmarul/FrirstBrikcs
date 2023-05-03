package firstBricks;

import java.util.Arrays;

public class Day24 {
    public static void main(String[] args) {


        //                                                     0                 1              2             3


        //                                         0            1        2         0        1        0      1        0
        String[][] buzdolabi = new String[][]{{"domates", "salatailk", "limon"}, {"elma", "muz"}, {"yogut", "sut"}, {"recel"}};


        System.out.println("buzdolabinin elamn sayisi+ " + buzdolabi.length);  //  buzdolabi kac katdan olusuyo 4 elemanlidir


        System.out.println("buzdolabinin ilk katinin elamn sayisi" + buzdolabi[0].length); //  0. indexinde (1.katinda ) kac eleman var  3 elamanlidir

        System.out.println(buzdolabi[0][0]);
        System.out.println("buzdolabinin ilk katinin elamn sayisi=" + buzdolabi[1].length); //1. indexinde (2.katinda )kac elaman var  2 elamanlidir
        System.out.println(buzdolabi[1][0]); // elma
        System.out.println(buzdolabi[1][1]); //muz
        System.out.println(buzdolabi[3].length);
        System.out.println(buzdolabi[buzdolabi.length - 1].length);

        int[][] array = new int[][]{{4, 1, 2, 3}, {2, 3}, {4}};
        System.out.println(array.length); // 3 katli
        System.out.println(array[0].length);// 4 odali
        System.out.println(array[1].length); //2 odali

        //   System.out.println(Arrays.toString(array)); //multi dimentions arrayler toString() ile print edilmez
        System.out.println("multi array result=" + Arrays.deepToString(array));


        //Soru5  verilen tek katli bir array deki elemanlri toplamini bulunuz

        int[] array2 = {5, 2, 34, 1, 6, 2, 4, 3, 7};//
        int gecicitoplam = 0;

///soru1
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array2[i] + 2;
        }
        System.out.println("her eleman 2 artsin = "+ Arrays.toString(array2));
        System.out.println("///////////////////////////////////////////////////");
 //soru 2
        //array2.length-1 >>>> 9-1 8. indexi arar
        for (int i = 0; i <= array2.length-1; i++) {
            gecicitoplam = gecicitoplam + array2[i];  // 5+2+34 =41
        }
        System.out.println("arraydeki elemanlrin toplami = " + gecicitoplam);


       // soru 3


        if(array2[0]==array2[array2.length-1]){
            System.out.println("ilk ve son index esittir");
        }

        System.out.println("array2 deki elamnlari yazdir "+ Arrays.toString(array2));

    }
}























































