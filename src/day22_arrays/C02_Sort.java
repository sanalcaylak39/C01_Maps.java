package day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,8,45,25,4,9,0};

        Arrays.sort(arr);

        System.out.println("Array deki en küçük sayı:" + arr[0]);
        System.out.println("Array deki en büyük sayı:"+ arr[arr.length-1]);
    }



}
