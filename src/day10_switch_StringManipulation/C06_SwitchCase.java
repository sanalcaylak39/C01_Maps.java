package day10_switch_StringManipulation;

import java.util.Scanner;


public class C06_SwitchCase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen kaçıncı ay olduğunu girirniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
            break;
            default:
                System.out.println("lütfen geçerli bir ay numarası giriniz");

        }

    }
}
