package day21_arrays;

import java.util.Arrays;

public class C04_ArraysÇalışma {

    public static void main(String[] args) {
        //Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir
       // program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

      int arry1[]={1,2,3};
        arry1[0]=2;
        arry1[1]=3;
        arry1[2]=1;
        System.out.println(Arrays.toString(arry1));

    }
}
