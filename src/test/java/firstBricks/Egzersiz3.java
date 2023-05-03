package firstBricks;

public class Egzersiz3 {
    public static void main(String[] args) {



        String email ="leylaayse@gmail.cor";
        if(!email.contains("@")){
            System.out.println("gecersiz email");
        }else if(!email.contains("@gmail.com")){ ///belki bundan sonrada harf eklenip biseyler yazmis olabilir
            System.out.println("yazim yanlsi var");
        }else if(!email.endsWith("@gmail.com")){
            System.out.println("lutfen email adresini dogru giriniz ");

        }else{
            System.out.println("emailiniz basari bir sekilde kaydedildi");
        }

    }
}
