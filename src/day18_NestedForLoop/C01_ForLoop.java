package day18_NestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        int input=9;

        int faktoriyel=1;

        for (int i = input; i >=1 ; i--) {
            faktoriyel*=i;

        }
        System.out.println(input+"! ="+ faktoriyel);
    }


}
