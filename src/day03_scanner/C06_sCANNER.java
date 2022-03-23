package day03_scanner;

import java.util.Scanner;

public class C06_sCANNER {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println( "Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("İsim-soyisim" + isim+" " + soyisim);

    }
}
