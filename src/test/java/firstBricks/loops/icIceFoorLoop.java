package firstBricks.loops;

public class icIceFoorLoop {
    public static void main(String[] args) {


        //bundan sonraki ornekler ic ice loop
        //mesela belirli araliktaki iki sayilarinin carpimlarini bulalim
        int ilksayi=5;
        int sonsayi=3;
        for (int i = 1; i <ilksayi ; i++) {
            for (int j = 1; j <sonsayi ; j++) {
                System.out.print(i*j +" ");
            }
        }
        System.out.println(" ");
        // Bu sekli elde edin
        //* * * * * *
        //* * * * * *
        //* * * * * *
        //* * * * * *


        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print("*"+ " ");

            }
            System.out.println(" ");

        }
        // Bu sekli elde edin
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *


        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+ " ");

            }
            System.out.println(" ");

        }





    }
}
