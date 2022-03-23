package day24_arrayList;

import day23_multiDimensionallArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        int arr[]={ };
        C06_Arrays obje=new C06_Arrays();
        arr = C06_Arrays.arrayeelemanekle(arr,5);
        System.out.println(Arrays.toString(arr));

        arr=C06_Arrays.arrayeelemanekle(arr,3);

        System.out.println(Arrays.toString(arr));

        List<Integer>sayılarList=new ArrayList<>();
        System.out.println(sayılarList);
        sayılarList.add(5);
        sayılarList.add(3);
        sayılarList.add(0,7);
        sayılarList.add(2,7);
        System.out.println(sayılarList);

    }
}
