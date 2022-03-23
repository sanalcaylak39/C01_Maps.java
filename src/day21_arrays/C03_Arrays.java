package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[]; //değer ataması yapmadık ama kabul etti.

        arr=new int[6];
        System.out.println(Arrays.toString(arr));
        // kullanmamıza izin vermez atama yapmazsak.
        System.out.print(arr.length);
        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=i;

        }
        System.out.print(Arrays.toString(arr));


        System.out.println(arr.length-1);


    }
}
