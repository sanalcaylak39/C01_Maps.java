package day23_multiDimensionallArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaç elementli bir Array istediğnizi yazın");

        int uzunluk=scan.nextInt();

        int arr[]=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array için  "+(i+1) +". elemanı giriniz");
       arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
