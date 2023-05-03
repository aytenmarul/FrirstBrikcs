package firstBricks;

public class Day04 {
  /*

    1.konu  artirma azaltma opretorleriyle sayiyi azlatma ve arttirma yapicaz bunun icin ++(artirma) ,--(azaltma) operatorlerini gorucez
    ++ ile gosterilir tek + ile islem gerceklesmez , ++ demek sadece 1 arttir demek
    eger sayi dan once ++ konulursa once arttir sonra yazdir demektir >>su sekilde   ++sayi
    yok eger sayi1 den sonra ++ konulursa once yazdir console da degisiklik yapmadan ,bi daha ki sefere cagirdginda sayi 1 arttir demek>> su sekilde sayi++
    -- ile de sayi 1 deger azalir.
    Tek - ile islemi gerceklestiremeyiz iki kez -- olmali
    +sayi1 ve sayi1+ diye yazmayiz tek + yazarsak hata verir ve
    -sayi ve sayi1- de yazamayiz tek - yazarsakta hata verir

    */

    public static void main(String[] args) {
        //   ornek 1
        int sayi1 = 12;
        System.out.println(sayi1);
        System.out.println("Eger ++ yi sayi1 in basina koyarsam: " + ++sayi1);
        System.out.println("artik console da sayimizin degeri 1 defa artmistir sayimiz artik 12 degil 13 tur");
        System.out.println(++sayi1 + " = yeni sayimiz 14 tur cunku tekrar artirma operatoru koydugum icin sayi 1 artar ");
     /*
        ornek 2
       Eger ++ yi sayi2 in sonuna koyarsak deger degismez ilk cagirdigimda ,
       bi daha ki sefer sayi2 yi cagirirsak opertorsuz 1 artmis olrak yazdiricak console da
*/
        int sayi2 = 7;
        System.out.println(sayi2);
        System.out.println("Eger ++ yi sayi2 in sonuna koyarsak deger degismez ilk cagirmada  yine: " + sayi2++);
        System.out.println("yeni sayi2 miz artik 7 degil 1 artmistir = " + sayi2 + " olmustur 2.cagirmamizda gorduk");
        System.out.println(sayi2++ + " dir sayimiz yine cunku bu asamada arttirsada goremiyoruz  "); //bu satirda sayi degismez tekrar sayinin kendisini cagirirsak 1 artmis olrak karsimiza gelicek
        System.out.println(sayi2 +" sayimiz 1 artti artik bu asamada gorebiliyorz ");
        //ornek 3
        int sayi3 = 21;
        System.out.println(sayi3);
        System.out.println("Eger -- yi sayi3 un basina koyarsak: " + --sayi3 + " olur");
        System.out.println("Artik console da sayimizin degeri 1 sayi azalmistir sayimiz artik 21 degil 20 dir");
        System.out.println(--sayi3 + " = yeni sayimizdir  cunku tekrar azaltma operatoru koydugum icin deger 1 defa daha azalir  ");
        //ornek 4
        int sayi4 = 45;
        System.out.println(sayi4);
        System.out.println("Eger -- yi sayi4 un sonuna koyarsak deger degismez ilk cagirmada yine: " + sayi4--);
        System.out.println("yeni sayi4 muz  artik 45 degil 1 artmistir = " + sayi4 + " olmustur 2.cagirmamizda gorduk");
        System.out.println(sayi4--); //bu satirda sayi degismez ayni gorucez console da, tekrar sayinin kendisini cagirirsak 1 azalmis olrak karsimiza gelicek
        System.out.println(sayi4);



    }

}
