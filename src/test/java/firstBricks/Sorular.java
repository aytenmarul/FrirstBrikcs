package firstBricks;

public class Sorular {
    public static void main(String[] args) {

        String str="Bu1gun3 cok gu2zel4 kaydik9";
        System.out.println(str.replace('u','e'));
        System.out.println(str.replace("u",""));
        System.out.println(str.replace("kaydik","kaydilar"));
        System.out.println(str.replace('u','e').replace("ay","iy"));
        System.out.println(str.replaceFirst("B","n"));
        // rakamlari cikarttir \\d ile
        // sadece rakamlari yazdirir \\D ile
        // Space olamayan herseyi sil \\S
        // space i sil \\s
        // yanyana birden fazla spaceleri sil \\s+
        // harf veya rakamlari sil \\w
        // harf veya rakam olmayan herseyi sil \\W
        System.out.println(str.replaceAll("\\d","")); //Bugun cok guzel kaydik
        System.out.println(str.replaceAll("\\D","")); //13249

        //SORU1
        //kullanicinin girdgi metinde
       // harf disindaki karakterleri temizleyin spaceleri silmeyin

        String input = "jav2a cok guze8lmid3ir@";
        input = input.replaceAll("\\d", ""); // java cok guzelmidir@
        input = input.replace(" ", "5"); //java5cok5guzelmidir@
        input = input.replaceAll("\\W", ""); //java5cok5guzelmidir
        input = input.replace("5", " "); //
        System.out.println(input);
        System.out.println(input.repeat(2));

//SORU 2
        /*
        cumlede ev geciyorsa "sweat home "
        is varsa " calisma guzeldir"
        hem ev hem is varsa "evde iste lazim

*/
        String str1= "Eve geldim isler birikmis";
        if(str1.contains("ev")){
            System.out.println("sweat home");
        }else if(str1.contains("is")) {
            System.out.println(" calisma guzeldir");
        }else if(str1.contains("is")&& str1.contains("Ev")) {
            System.out.println(" evde iste lazim");
        }
       //SORU3
/*
        kullanicidan bir sifre isteyin sonra sartlari konrol edin
        tum eksiklikleri soyleyin tum sartlar saglanirsa "sifre basari ile kaydedildi " desin
        - ilk harf kucuk harf olmali
        -son karakter rakam olmali
        -sifrede bosluk olmamali
        -uzunlugu en az 10 olmali
                */
        String sifre = "aUNUbhxgs9";
        int flag = 0;
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf buyuk olmamali");
            flag++;
        }

        if (!(sifre.length() >= 10)) {
            System.out.println("sifre en az 10 haneli olmalidir");
            flag++;
        }
        if (sifre.contains(" ")) {
            System.out.println("bosluk olmamali");
            flag++;
        }
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("sifrenin son karakteri rakam olmalidir");
            flag++;
        }
        if (flag == 0) {
            System.out.println("sifreniz basarili kaydedildi");
        }

//SORU 4
// 5 factoriyeli bulunuz
        int num = 5;

        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        System.out.println(fact);

        for (int i = 0; i < 100; i++){
            fact += i;
    }
System.out.println(fact);
}








}
