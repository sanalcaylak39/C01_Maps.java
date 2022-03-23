package day48_Çalışmalar;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin




        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayı giriniz");
        int sayı= scan.nextInt();

        System.out.println("İkinci sayı giriniz");
        int sayı2= scan.nextInt();

        int toplam=sayı + sayı2;
        System.out.println("toplam=" +toplam);
    }
}
