package firstBricks.loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        //do nun bodysi kesin 1 kez calislir while in body si ise kosul saglanirsa calisir if deki gibi
        //verilen sayiya gore islemi yapiniz
        int sayi=10;
        int toplam=0;
        do{
            toplam+=sayi;
            sayi++;
        }while(sayi<=12);
        System.out.println(toplam);
    //Soru2 Kullanicidan bir sayi isteyin ve bu sayinin
        int input=144;
        int ilkHali=1;
do{
    if(ilkHali*ilkHali==input) {
        System.out.println("true");
        break;
    }
ilkHali++;
}while (ilkHali*ilkHali<=input);
//if(count==0){
//    System.out.println("false");
//}

    }
}
