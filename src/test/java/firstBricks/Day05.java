package firstBricks;

public class Day05 {
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
        int sayi1 = 5;
        System.out.println(sayi1);
        System.out.println(sayi1++);
        System.out.println("ikinci cagirdigimizda sayi1= " + sayi1);
        ////////////////////////////////////////////////
        System.out.println("tekrar cagiriyorum ++ opretoru basinda " + ++sayi1);
        System.out.println(sayi1);
        int sayi2 = 12;
        System.out.println(sayi2);
        System.out.println(++sayi2);
        System.out.println(sayi2++);
        System.out.println(sayi2);
        System.out.println(" ////////////////////////////////////////////////////////");
        int sayi3 = 17;
        System.out.println(sayi3--);
        System.out.println(sayi3); //burda sayimiz 16
        System.out.println(--sayi3);//  burda sayimiz artik 15
        System.out.println(++sayi3); //burda sayimiz
        System.out.println("////////////////////////////////////////////////");

        int sayi4 = 20;
        sayi4++;
        System.out.println(sayi4);
        //  sayi4++;
        System.out.println(sayi4++);
        // sayi4--;  // System.out.println(sayi4--);
        System.out.println("sayinin enson hali " + sayi4);
        System.out.println(--sayi4);
        System.out.println(--sayi4);
        System.out.println("///////////////////////////////////////");
        int num1 = 15;
        int num2 = 5;
        //  num1=num1+num2;
        //   num1+=num2;
        // num1=num1-num2;
        //   num1-=num2;
        // num1*=num2;
        num1 /= num2;
        System.out.println(num1);
        System.out.println(num2);
        //ornek
        System.out.println("////////////////////");
        int numBir = 9;
        int numIki = 7;
        numBir /= numIki;
        System.out.println(numBir);

//exercise
        int num1zehra = 7;
        int num2zehra = 9;
        num1zehra *= num2zehra;
        num1 /= num2;
        num1 -= num2;
        num1 += num2;
        System.out.println(num1zehra);
    }
//
//    String isim ="";
//    String soyisim="";
//    int oNumber= 111;
//    double diplomaNotu=4.5;
//    char sinif='8';
//    char sinifTuru='A';
//    float boyu=160.5f;
//    boolean ogranciMi=true;
//
//    double vucudKitle=boyu*boyu/kilo;
}











//        public int caughtSpeeding(int speed, boolean isBirthday) {
//            if(speed<=60)
//                return 0;
//
//            if else ((60<speed) && (speed<=80))
//            return 1;
//            boolean b = speed > 80;
//            if else (speed>80)
//            return 2;
//        }
//
//    }
//if (!(isBirthday)) {
//
//        if (speed <= 60)
//
//        return 0;
//
//        if (speed > 60 && speed <= 80)
//        return 1;
//
//        else
//
//        return 2;
//        } else if (speed <=65)
//
//        return 0;
//
//        else if (speed > 65 && speed <= 85)
//
//        return 1;
//
//        else
//
//        return 2;
//
//        }
