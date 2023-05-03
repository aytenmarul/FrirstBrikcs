package firstBricks;

public class Day19 {
    public static void main(String[] args) {
        //Soru 1
        // Lutfen console da su ifadeyiz yazdiriniz>>>>>>   Hello Zehra !
        String name = " Melike";
        System.out.println("Hello " + name + "!");

/*   Soru2
        Given an "ilkkelime" string length 4, such as "<<>>", and a word,
        return a new string where the word is in the middle of the out string, e.g.
        "<<word>>".
                Note:use str.substring(i, j) to extract the String starting at index i and going up to but not
        including index j.

                             ilk     ikinci
                makeOutWord("<<>>", "Yay") →"<<Yay>>"
        makeOutWord("<<>>", "WooHoo") →"<<WooHoo>>"
        makeOutWord("[[]]", "word") →"[[word]]"
*/             //   0123
        String ilkkelime = "<<>>";
        String ikincikelime = "merhaba";
        //Ra Merhaba na
        System.out.println(ilkkelime.substring(0, 2) + ikincikelime + ilkkelime.substring(2, 4));



        /*
        soru 3
        Given a string of even length, return the first half.So the string "WooHoo" yields "Woo".
                firstHalf("WooHoo") →"Woo"
        firstHalf("HelloThere") →"Hello"
        firstHalf("abcdef") →"abc"

*/
        String kelime2 = "Gunaydin";
        int yarim = kelime2.length() / 2;
        System.out.println(kelime2.substring(0, yarim));
        System.out.println("bakalim kemelinin yarisi neresi: "+ yarim);

/* Soru 4
        Given a string,return a version without the first and last char,so "Hello" yields "ell".
                The string length will be at least 2.
           //       01234
        withoutEnd("Hello") →"ell"
        withoutEnd("java") →"av"
        withoutEnd("coding") →"odin"

*/
        String renk = "mavi";
        int sonucarakterinuzunlgu = renk.length() - 1;// 4-1
        System.out.println(renk.substring(1, renk.length() - 1)); //av
        System.out.println(renk.substring(1, 3)); //av


        //   System.out.println(kelime.substring(1,kelime.length()-1));
/*
        Given a string of even length, return a string made of the middle two chars,
                so the string "string" yields "ri". The string length will be at least 2.
        middleTwo("string") → "ri"
        middleTwo("code") → "od"
        middleTwo("Practice") → "ct"
         return str.substring(str.length()/2-1,str.length()/2+1);
*/
        String word = "marmelat";
        int medium = word.length() / 2; //  8/2=4     4-1,4+1
        System.out.println(word.substring(medium - 1, medium + 1));   //me
        System.out.println(word.substring(3, 5));    //me
        System.out.println(word.charAt(5));

//        //Kullanicidan bir cumle aliniz ve bu cumleyi tersten yazdiriniz
//        String input = "bir ";
//        String result = "";
//        for (int i = input.length() - 1; i >= 0; i--) {
//           result += input.charAt(i);
//
//        }
//        System.out.println(result);
        String kelimem = "notebook";  //koobeton
        String tersi = "";
        for (int i = kelimem.length() - 1; i >= 0; i--) {
            tersi = tersi + kelimem.charAt(i);  //k o o b e t o n
        }
        System.out.println(tersi);

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
//

    }
}

























