package day23_multiDimensionallArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {


        Scanner scann=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle=scann.nextLine();
        String arr[]=cümle.split(" ");

        System.out.println("girdiğiniz cümledeki kelime sayısı:"+ arr.length);
    }



}
