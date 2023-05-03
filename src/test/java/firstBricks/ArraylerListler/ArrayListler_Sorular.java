package firstBricks.ArraylerListler;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListler_Sorular {
    //contains() verilen harf ,keilme veya sayilari bulunup bulunmamasina gore true veya false verir
    // add() element ekler
    //get()  indexi verirp arattiriyoruz
    // set() update etmek icin kullanilir indexi ve vericegimiz elementi vermemiz gerekiyor
    public static void main(String[] args) {

//        arrayYanlizbirKereyazdir();
//        ArraydenListeEkle();
//        uclerinHepsiniSil();
        NotlistesiOltur();
        List<Double>notlar = NotlistesiOltur();
        raporlaNotlari(notlar);
    }



    public static List<String> ArraydenListeEkle() {
        List<String> liste = new ArrayList<>();
        String[] harfler = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < harfler.length; i++) {
            liste.add(harfler[i]);
        }
        System.out.println(liste);
        //contains() verilen harf ,keilme veya sayilari bulunup bulunmamasina gore true veya false verir
        System.out.println(liste.contains("ayten "));
        // set() update etmek icin kullanilir indexi ve vericegimiz elementi vermemiz gerekiyor
        liste.set(1,"o");
        System.out.println(liste);
        liste.remove(2); //2.indexi kaldirir listeden
        return liste;
    }
    //Verilen arrayde tekrarlanan sayilari 1 kere yazdirin
    public static List<Integer> arrayYanlizbirKereyazdir() {
        List<Integer> list = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5, 3, 1, 4, 3, 1, 2, 9};
        for (int i = 0; i < arr.length; i++) {

            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println("Yanliz 1 kere yazilicak butun elementler"+list);
        return list;
    }
    //verilen listdeki butun 3 leri siliniz
    public static List<Integer> uclerinHepsiniSil(){
        Integer removeElement=3;
        Integer removeIkincielement=2;
        List <Integer> list =new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5, 3, 1, 4, 3, 1, 2, 9};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            list.remove(removeElement);
            //.IndexOutOfBoundsException aliriz olmayan indexi arattigimizda
           // list.remove(20);

        }
        while (list.contains(removeIkincielement)){
            list.remove(removeIkincielement);
        }
        System.out.println(list);
        //clear() bu methodla listenin icini bosaltir temizler console da bos array goruruz[]
        list.clear();
        System.out.println(list);
        return list;
    }
    //userdan isimler aliniz listeleyiniz Q ye basinca listeyi yazdirin
public static List<String> listeOlturIsimAlip() {
    List<String> isimler = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String girilenisim = "";
    System.out.println("lutfen userdan isim aliniz bitirmek istiyorsaniz Q ye basiniz");
    girilenisim = scanner.nextLine();
    if (!girilenisim.equalsIgnoreCase("q")) {
        isimler.add(girilenisim);
    }
    System.out.println("isimlerden olusan liste:"+ isimler);
    return isimler;
}
    public static List<Double> NotlistesiOltur() {
        List<Double> notlar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Double girilenNot = 0.0;
        while (girilenNot <= 100) {
            System.out.println("lutfen userdan notlari aliniz bitirmek istiyorsaniz 100 den buyuk bir sayi giriniz"
            );
            girilenNot = scanner.nextDouble();

        if (girilenNot <= 100) {
            notlar.add(girilenNot);
        }
    }
        System.out.println(notlar);
        return notlar;
    }
    public static List<Double> raporlaNotlari(List<Double>notlar){
        int ogrenciSayisi=notlar.size();
        double notlarToplami=0.0;
        double NotOrtalmasi=0.0;
        int ortalmaUstundekiOgrenci=0;
        for (int i = 0; i < notlar.size(); i++) {
            notlarToplami +=notlar.get(i); //toplamini verir butun notlarin
        }
        NotOrtalmasi=notlarToplami/notlar.size();
        for (int i = 0; i < notlar.size() ; i++) {
            if(notlar.get(i)>NotOrtalmasi){
                ortalmaUstundekiOgrenci++;
        }
            System.out.println("girilen Not sayisi:"+ogrenciSayisi+
                    "\nGirilen notlarin ortalamasi:"+ NotOrtalmasi+
                    "\nOrtalamanin ustundeki ogrenci sayisi"+ortalmaUstundekiOgrenci);
        }
        return notlar;
    }
}