package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen cemberin yarıçapını giriniz");
        double yarıçap= scan.nextDouble();

        System.out.println("girdiğiniz yarıçap:" + yarıçap);
        System.out.println("çemberin cevresi:" + 2*3.14*yarıçap);
        System.out.println("dairenin alanı:" + 3.14* yarıçap*yarıçap);

    }
}
