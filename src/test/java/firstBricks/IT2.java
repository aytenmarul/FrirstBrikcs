package firstBricks;

public class IT2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 4};

        int dup = -1;
        int mis = -1;

        //int [] arr={1,2,2,4};

        for (int i = 1; i < arr1.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (i == arr1[j]) {
                    counter++;
                }
                // return arr1;


                if (counter == 2) {
                    dup = i;
                } else if (counter == 0) {
                    mis = i;
                }

                // System.out.println(arr1);
            }


        }
        //System.out.println(dup);
     //   System.out.println(mis);
        //System.out.println(duzeniBozaniBul(arr1));
        duzeniBozaniBul(arr1);
    }


    public static int[] duzeniBozaniBul(int[] arr1) {
       // int[] arr1 = {1, 2, 2, 4};

        int dup = -1;
        int mis = -1;

        //int [] arr={1,2,2,4};

        for (int i = 1; i < arr1.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (i == arr1[j]) {
                    counter++;
                }
                // return arr1;


                if (counter == 2) {
                    dup = i;
                } else if (counter == 0) {
                    mis = i;
                }

                // System.out.println(arr1);
            }


        }
        System.out.println(dup);
        System.out.println(mis);


        return arr1;
    }
}