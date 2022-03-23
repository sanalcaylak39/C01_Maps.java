package day21_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr[]={"Ali", "veli","ayşe"};
        // arry içindeki elementlere ulasmak için index kullanılır.

        System.out.print(arr[0]);

        arr[1]="esila";

        int arr2[]= new int[4];
        System.out.print(arr2[1]);

        System.out.print(arr2);
        for (int i= 0; i < 4; i++) {
            System.out.print(arr2[i]);

            System.out.print(Arrays.toString(arr2));

            arr2[1]=11;
            arr2[3]=12;
            System.out.print(Arrays.toString(arr2));

            System.out.print(Arrays.toString(arr));

        }
    }





}
