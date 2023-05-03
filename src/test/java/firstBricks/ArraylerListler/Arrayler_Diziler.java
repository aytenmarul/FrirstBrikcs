package firstBricks.ArraylerListler;

import java.util.Arrays;

public class Arrayler_Diziler {

    /* Array non primitive data type  String gibi
    Primitive -> char, boolean ,short long,double....
    Her bir array object her eleman objecttir
    data turu ne ise onu yazmak zorundayiz
     int num=10;
     burda 10 nun yanina baska degerler ekleyemeyiz ama arrayler bir dizidir
     1 den fazla ekleyebilirz
     int [] num
     yazdigimizda java 1 den fazla deger eklicegimizi anlar
     int [] arr=[5];
     5 eleman ekleyebilriz arrayin uzunlugu sabittir ne verirsek oyle kalir.
     data turu ve length basta belirlenir
     int [] array={1,3,5,6,7};
     eger icine eleman yazdirmadan cagirirsak default yani sistemde
      data turu ne kaydetilmisse eleamnlarin yerine onu yazdirir
      System.out.println(Arrays.toString(names));
           System.out.println(arr);
     */
    public static void main(String[] args) {


        int[] dizi = new int[6];
        dizi= new int[]{1, 32, 2, 14};
        System.out.println(Arrays.toString(dizi));// Arrays.toString method bize arrayi console yazdirir
        System.out.println(dizi);// hashcode verir buda referans numarsidir

               //             0 ,1,2,3,4,5,6,7, 8
        int[] dizi2=new int[]{12,3,7,8,9,1,2,11,10};
        System.out.println(dizi2.length); //arrayin kac elemanli oldugunu bize verir
        System.out.println(dizi2[3]); //index sirasina gore elemanin ne oldugunu bize verir
        System.out.println(dizi2[0]);// ilk index deki sayiyi bize verir
        System.out.println(dizi2[8]);//sonuncu elemani bize yazdiri 10
        System.out.println(dizi2[dizi2.length-1]);//buda sonuncu elamani bize yazdir
       //   System.out.println(dizi2[9]);//ArrayIndexOutOfBoundsException
      //  System.out.println(dizi2[15]);
        System.out.println(dizi2[dizi2.length/2]);
      // [3,1,4] //conselada pi sayisini nasil gorebiliriz?
        int [] piSayisi=new int[]{3,1,4};
        //System.out.println(piSayisi); ///hashcode
        System.out.println(Arrays.toString(piSayisi));
      //[02,20,2023]

int[] tarih=new int[]{02,20,2023};
        System.out.println(Arrays.toString(tarih));

String[] names=new String[]{"zehra","said","rana","ayten"};
        System.out.println(names.length); //4 elamanli bir array
        System.out.println(names[0]); //zehra
       //  System.out.println(names[4]); //exception
        System.out.println(names[names.length-1]);  //names[4-1]>>>>names[3]
        System.out.println(names[3]);







       //                                     0            1     2      3
      //                               0  1  2  3 4
        int[][] array = new int[][]{{4, 1, 2, 3,8}, {2, 3}, {4}, {1, 2, 3, 6}};
        System.out.println(array.length); //4 elemanlidir

        System.out.println(array[0].length); //  5 elemanlidir



        System.out.println(array[1].length); //2 elemanlidri

        System.out.println(array[0][0]); //4
        System.out.println(array[0][1]); // 1
        System.out.println(array.length);
   //                                                             0                    1              2             3
    //                                               0            1        2         0     1        0      1        0
        String [] [] buzdolabi=new  String[][]{{"domates","salatailk","limon"},{"elma","muz"},{"yogut","sut"},{"recel"}};
        System.out.println(buzdolabi[0][0]);//domates
        System.out.println(buzdolabi[1][1]); //muz
        System.out.println(buzdolabi[2][0]);//yogurt
        System.out.println(buzdolabi[3][0]); //recel
       // System.out.println(buzdolabi[3][1]);  //exeption aliriz

























    }
}
