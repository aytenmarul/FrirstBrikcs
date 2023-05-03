package firstBricks;

public class Day08 {
    public static void main(String[] args) {
        //               0123
        String dersadi ="Bugun pazartesi";

        System.out.println(dersadi.charAt(7));   // Sira numrasini verip hangi harfse yazdirir.a
        System.out.println(dersadi.indexOf( 'z')); // verilen harfin sira numarasi yani indexini verir.8
        System.out.println(dersadi.toUpperCase()); ///hepsini buyuk harfle yazdirir.BUGUN PAZARTESI
        System.out.println(dersadi.toLowerCase()); //hepsini kucuk harfle yazdirir.bugun pazartesi


//
////        logical operator:
//           or is used ||    >>> veya icin ||
//          5 == 5  >>>> true
//          5 != 5  >>>>
//         !(5 == 5) >>>>>false
////        !true >>> false
////
//        1 tane true yeter sonucun true olmasi icin
//        true || false >>>> true
//        true || true >>>>  true
//        false || true >>>> true
//        false || false >>> false
//
int sayi =5;
int sayi2=10;
        System.out.println(sayi==sayi2 || sayi!=sayi2);
        System.out.println(sayi!=sayi2 || sayi!=sayi2);
        System.out.println(sayi==sayi2 || sayi==sayi2);
//          and is used &&   >>> ve icin de &&
  //       ikiside true olunca yada false olunca sonuc true olur
//        true && true >>>> true
//        true && false >>>>  false
//        false && true >>>> false
//        false && false >>>>true
        System.out.println("///////////////////////////////////");
                int num1=8;
                int num2=13;
        System.out.println(num1>num2 && num2>num1);
        System.out.println(num1!=num2 && (num2-5==num1) && num2<num1);
        System.out.println(num1*2==num2);
        System.out.println( "BOLME ISLEMI:"+ num2/2);
        System.out.println(num2/2<num1);



    }
}

