package firstBricks;

import java.util.Arrays;

public class IT {


    public static void main(String[] args) {


        System.out.println(countYZ("feyz derya heavy"));

        int[] nums = {9, 12, 7, 3, 8};
        System.out.println(bigDiff(new int[]{9, 12, 7, 3, 8}));
        System.out.println(sum13(new int[]{1, 3, 13, 2, 3, 5, 13, 2, 4}));

        //Soru1:
//1.yol
        int[] arr = {1, 2, 3, 4};  // output [1, 3, 6, 10]
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int localsum = 0;
            for (int j = 0; j <= i; j++) {
                localsum += arr[j];
            }
            result[i] = localsum;
        }
        System.out.println(Arrays.toString(result));

// 2.yol
//    int[] arr = {1, 2, 3, 4}; // output [1, 3, 6, 10]
//    int[] result = new int[arr.length];
//        for (int i = 1; i < arr.length; i++) {
//        arr[i] = arr[i - 1] + arr[i];
//    }
//        System.out.println(Arrays.toString(arr));
//    }
//
    }
    //Soru2 : verilen kelimelrin sonu y veya zile bitiyosa kactane kelime var oyle yazdir
//            "feyz derya heavy" >>> mesela burda 2 tane var
    public static int countYZ(String str) {

        int len = str.length();

        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {

                if (i < len - 1 && !Character.isLetter(str.charAt(i + 1)))
                    count++;

                else if (i == len - 1)
                    count++;

            }
        }
        return count;
    }

        //    Soru 3  Bu soru codingBat te var
//    verilen bir arradeki elamanlarin maximum olani ile minumum olaninin arasindaki fark kactir
//    yazdirin bununla ilgili bir method yapin
            public static int bigDiff(int [] nums) {
              //    int[] nums = {9, 12, 7, 3, 8};
        int max = nums[0];
            int min = nums[0];
            for (int i = 0; i < nums.length; i++) {
                int currentNumber = nums[i];
                if (currentNumber > max)
                    max = currentNumber;
                else if (currentNumber < min)
                    min = currentNumber;
            }
            return max - min; //12-3>9

        }
  //      soru 4 Bu soru codingbat te var 13 ten onceki sayilari topla 13 u ve ondan bi sonraki elemani toplmaya alma
        public static int sum13(int []nums){
int sum=0;
            for (int i = 0; i < nums.length; i++) {
                int currentnumber=nums[i];
                if(currentnumber==13){
                    i++;
                    continue;
                }else{
                    sum+=nums[i];
                }
            }
            return sum;
        }
//        Soru 5 verilen arrayde duzeni bozan duplicate hangisi
//    onu bul ikinci ayni deger yerine olmasi gereken sira hangisi olmaliydi onu bul
public static int[] duzeniBozaniBul(int[] arr1){
        //mesela[1,2,2,4] >>[1,2,3,4]
//int [] arr={1,2,2,4};

    for (int i = 1; i <= arr1.length; i++) {
       int counter=0;
        for (int j = 0; j <arr1.length; j++) {
            if (i == arr1[j]) {
                counter++;
            }
           // return arr1;
        }
        int dup=0;
        int mis=0;
            if(counter==2){
                dup=i;
            }
            if(counter==0){
                mis=i;
            }
        }

    return arr1;
}




}
