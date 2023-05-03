package firstBricks.ArraylerListler;

import java.util.Arrays;


public class ArrayMultiDimention {
    public static void main(String[] args) {
        int[][] array = {{4, 1, 2, 3}, {2, 3}, {4}, {1, 2, 3, 6}};
        System.out.println(array.length);
        System.out.println(array[1].length);
        //  System.out.println(array[4].length); //exception
        // System.out.println(array[3]);  //referans number yani hashcode verir
        System.out.println(Arrays.toString(array[3]));
        System.out.println(Arrays.deepToString(array)); ///butun elemanlri yazdirin
        System.out.println(elamnlriToplamiBul(array));
        ciftsayilar();
        enuzunKelime();
        multidimentionCarpimi();
        sonElemntler();
        SameIndexTopla();
        TekKatElemanlriToplami();
    }

    public static int elamnlriToplamiBul(int[][] array) {
        //int [][] array={{4,1,2,3},{2,3},{4},{1,2,3,6}};
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                toplam +=array[i][j];
            }
        }
        System.out.println("iki katli arraydeki elamnlarin toplami");
       return toplam;

    }
// Soru2 verilen multidimention arrayde ki en uzun elemnt hangisidir
    public static String enuzunKelime(){
        String [][] arr={{"ilker","ayse"},{"huseyin"},{"mehmetcan selim"}};
        String enuzunKelime=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
if(arr[i][j].length()>enuzunKelime.length()){
    enuzunKelime=arr[i][j];
}

            }
        }
        System.out.println("en uzun kelime:"+enuzunKelime);
return enuzunKelime;
    }
    //Soru 3 multi dimention bir arraydeki cift sayilar kac tanedir
    public  static int ciftsayilar(){
        int [][] arr={{2,4,3,6,7},{0,1}};
        int ciftCount=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2==0){
                    ciftCount++;
                }
            }
        }
        System.out.println("kac tane cift eleman vardir? "+ ciftCount);
        return ciftCount;
    }
    public static int multidimentionCarpimi(){
        int [][] arr={{1,2,3,5,7},{2,1,4,5}};
        int carpim=1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim *=arr[i][j];
            }
        }
        System.out.println("elemenltlerin carpmi "+ carpim);
        return carpim;
    }
    //multi dimention arraydeki son elemanlri toplamini toplayan bir method yaziniz
    public static int sonElemntler(){
        int [][] arr={{1,2,4,5,6},{1,2,3,},{1,2,3}};
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam +=arr[i][arr[i].length-1];
        }
        System.out.println("son elemanlri toplami "+toplam);
        return toplam;
    }
    //Verilen Multidiemention arraydeki ayni indexdeki elamnlri toplayiniz mesela [0] +[0]
    public static int[] SameIndexTopla(){
        int [][] arr={{1,2,3},{1,2,4,8}};
        int ortakindex=arr[0].length<arr[1].length? arr[0].length:arr[1].length;
        int [] ortakindexArrToplami=new int[ortakindex];
        for (int i = 0; i < ortakindexArrToplami.length; i++) {
            ortakindexArrToplami[i]=arr[0][i]+arr[1][i];
        }
        System.out.println("ortak indexlerin toplami"+ Arrays.toString(ortakindexArrToplami));
        return ortakindexArrToplami;
    }
    //multi dimention bir arraydeki birinci katindaki elemanlrin toplamini aliniz
    public  static int[] TekKatElemanlriToplami(){
        int [][] array={{1,2,3,4},{2,3,4},{1,2,5}};
        int [] output=new int[array.length];
        int innerArrayToplami=0;
        for (int i = 0; i < array.length; i++) {
            innerArrayToplami=0;
            for (int j = 0; j < array[i].length; j++) {
                innerArrayToplami += array[i][j];
            }
            output[i]=innerArrayToplami;
            }
        System.out.println("Inner array elemanlri toplami :"+ Arrays.toString(output));
            return output;
        }
    }

