package firstBricks;

public class MethodOlustur {
    public static void main(String[] args) {
        System.out.println(AsalsayiMi(46));
        DuzenleCumle(5,9);

    }
    public static String AsalsayiMi( int num) {
        String result = "";
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                result = "asal degildir";
                break;
            }
            if (!result.equals("asaldegildir")) {
                result = "asaldir";
            }
        }
            return result;

    }
    public static void DuzenleCumle(int BaslamaIndex, int Bitisindex){
String input="Bir ornek cumle giriniz";
    if(BaslamaIndex>Bitisindex){
        System.out.println("baslama indexi bitis indexinden buyuk olamaz");
    }else if(Bitisindex>input.length()-1){
        System.out.println("siniri asti");
    }else {
        for (int i = BaslamaIndex; i < Bitisindex; i++) {
            System.out.print(input.charAt(i));
        }
    }
    }
}
