package firstBricks.ArraylerListler;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSorulari {
    public static void main(String[] args) {
        //Userdan tam sayi aliniz ve bu sayi tam bolenlerin listesini olustutunuz
        System.out.println(tambolenListesi(120));
    }

    public static List<Integer> tambolenListesi(int input){
        List<Integer> tambolenliste=new ArrayList<>();
        for (int i = 1; i <=input ; i++) {
            if (input % i == 0) {
                tambolenliste.add(i);
            }
        }
        return tambolenliste;
        }
    }

