package firstBricks;

public class Day21 {
    public static void main(String[] args) {
    /*    soru1
        Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
        sortaSum(3, 4) → 7
        sortaSum(9, 4) → 20
        sortaSum(10, 11) → 21
     */
        int a = 2;
        int b = 3;
        int sum = a + b;
        if(sum>=10 && sum<=19){
            System.out.println(20);
        }else{
            System.out.println(sum);
        }

     /*
        Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
        teenSum(3, 4) → 7
        teenSum(10, 13) → 19
        teenSum(13, 2) → 19
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
            return 19;
        else return sum;

      */
        int sayi1=3;
        int sayi2=5;
        if((sayi1>13 && sayi1<19)&&(sayi2>13 &&sayi2<19)){
            System.out.println(19);
        }
        System.out.println(sayi1+sayi2);


/*
        You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
        redTicket(2, 2, 2) → 10
        redTicket(2, 2, 1) → 0
        redTicket(0, 0, 0) → 5
        public int redTicket(int a, int b, int c) {
  if(a==2 && b==2&& c==2)
  return 10;
  if(a==b && c==b && a!=2)
  return 5;
  if(b!=a && c!=a)
  return 1;
  return 0;
}int
 */
        int num1=1;
        int num2=2;
        int num3=2;
        if(num1==2&& num2==2 &&num3==2) {
            System.out.println(10);
        }
       if(num1==num2 && num2==num3 && num3!=2 ) {
           System.out.println(5);
       }
if(num2!=num1&& num3!=num1){
    System.out.println(1);
}
        System.out.println(0);
        }

    }


