package day12_StringManipulation;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyiminizi yazınız");
        String isimSoyisim= scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S", "*"));



    }
}
