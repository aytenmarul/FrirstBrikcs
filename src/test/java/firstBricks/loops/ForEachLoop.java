package firstBricks.loops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
int [] arr2={1,3,5,7,9};
int toplam=0;
// For loopla elementleri topla
//        for (int i = 0; i <= arr2.length; i++) {
//            toplam += i;
//        }
//        System.out.println(toplam);
        //burda da for eachle elementleri topla
for(int each:arr2){
    toplam+=each;

}
        System.out.print(toplam);
        System.out.println(" ");
      //Userdan isimleri alin ve uzunlugu cift sayi olanlarin ilk yarisini
      //eger ismin uzunlugu tek sayi ise ikinci yarisini alip yazdirin
      String[] arr={"ali","osman","huseyin","ahmet","mehmet"};
        List<String> yenilist=new ArrayList<>();
        for(String each:arr){
            if(each.length()%2==0){
               yenilist.add(each.substring(0,each.length()/2));
            }else{
                yenilist.add(each.substring(each.length()/2,each.length()));
            }
       //     yenilist.add(each);
        }
            System.out.println(yenilist);

        }

}
