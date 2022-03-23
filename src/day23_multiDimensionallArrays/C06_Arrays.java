package day23_multiDimensionallArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,2};
        int eklenecekElement=1;

       arr=arrayeelemanekle(arr,eklenecekElement);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayeelemanekle(int[] arr, int eklenecekElement) {
    int yeniArray[]=new int[arr.length +1];

        for (int i = 0; i < arr.length ; i++) {
            yeniArray[i]=arr[i];

        }

    yeniArray[yeniArray.length-1]=eklenecekElement;
    return yeniArray;
    }
}
