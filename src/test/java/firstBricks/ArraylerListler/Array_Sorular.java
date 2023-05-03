package firstBricks.ArraylerListler;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sorular {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayolustur()));

        int [] arr={2,3,4,1,6};
        System.out.println("her elaman 2 arttirilmistir" +Arrays.toString(elementleri2Arttir(arr)));
        int [] arr1={2,3,-5,4,1,6,-2,-3,-9,2,3};
        System.out.println("verilen elemanlrin pzozotif olanlarini toplayiniz : "+Arrays.toString(pzotiveTopla(arr1)));
        System.out.println(elamanAra(arr1,2));
       enUzunEnKisa();
       elamnlriTopla();
    }

    //Soru5  verilen tek katli bir array deki elemanlri toplamini bulunuz
    public static int elamnlriTopla() {
        int[] array = {1, 2, 34, 1};
        int toplam = 0;
        for (int i = 0; i <array.length ; i++) {
            toplam +=array[i];
        }
        System.out.println("arraydeki elemanlrin toplami"+toplam);
return toplam;
    }

    //     Soru 1 Verilen int arraydeki tum elemanlrini 2 arttirn ve bize return yapin
    public static int[] elementleri2Arttir(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+2;
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
//Soru 2 verilen arraydeki pzitif elemanlri bulunuz
  public static int [] pzotiveTopla(int []arr1){
      int topla=0;
        for (int i = 0; i < arr1.length; i++) {
          if(arr1[i]>0){
              topla+=arr1[i];
          }
      }
     // System.out.println(Arrays.toString(new int[]{topla}));
        return new int[]{topla};
  }  
  //Soru 3verilen arrayde istenilen elamanin var olup olmadigini konrol edin if there is count them
    public static boolean elamanAra(int[]arr, int arananEleman) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananEleman) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Aranan elaman yoktur");
        } else {
            System.out.println("Aranan " + arananEleman + " arrayde " + count + " kere kullanilmistir");
        }

        return false;
    }
    //soru4 kullanicidan arrayin length ni alin ve elamanlri yazdirip dondurun
    public static int[] arrayolustur (){
        System.out.println("lutfen array icin uzunluk giriniz :");
        Scanner scan=new Scanner(System.in);
        int length= scan.nextInt();
        int [] birArray=new int[length];
        for (int i = 0; i < length; i++) {
            birArray[i]=scan.nextInt();
        }
        return birArray;
    }
   // Soru 5 verirlen bir string arrayde en uzun ve en kisa kelimelri bulunuz
    public static void enUzunEnKisa(){
        String [] arr={"ayten","selim","mehmet","mehmetcan","john"};
        String enkisa=arr[0];
        String enuzun=arr[0];
        for (int i = 0; i <arr.length ; i++) {
if(arr[i].length()>enuzun.length()){
    enuzun=arr[i];
}
if(arr[i].length()<enkisa.length()){
    enkisa=arr[i];
}
        }
        System.out.println("En uzun isim "+enuzun);
        System.out.println("En kisa isim "+enkisa);

    }
    
}
