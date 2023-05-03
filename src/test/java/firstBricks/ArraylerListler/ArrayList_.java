package firstBricks.ArraylerListler;

import firstBricks.loops.tanidiklarim;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_   {
    public static void main(String[] args) {

       ArrayList<Integer> sayilarListesi=new ArrayList<>();

   System.out.println("sayilar listesinin icini goster=" +sayilarListesi);
        //add() listeye eleman eklerken tek tek cagilir
        sayilarListesi.add(12);
        sayilarListesi.add(5);
        sayilarListesi.add(9);
        sayilarListesi.add(145);
        sayilarListesi.add(0);
        System.out.println("listeye sayilar  eklendikten sonra= " +sayilarListesi);
        sayilarListesi.add(7);
        System.out.println("listede kac tane sayi var="+ sayilarListesi.size());
        sayilarListesi.remove(9); //elamani siler
        System.out.println("listede kac tane sayi var="+ sayilarListesi.size());
        System.out.println(sayilarListesi);
        System.out.println("3.indexteki elemani getir ="+ sayilarListesi.get(3));//elamni getirir
        sayilarListesi.add(1,8);
        System.out.println(sayilarListesi);
       System.out.println("verilen sayi listede var mi = "+ sayilarListesi.contains(9));
    }
}
