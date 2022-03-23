package day18_NestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {
        int sayıAdedi=5;
        Scanner scan=new Scanner(System.in);

        int sayı=0;
        int toplam=0;

        for (int i = 1; i <=sayıAdedi ; i++) {
            System.out.println("lütfen bir sayı giriniz");
            sayı=scan.nextInt();
            toplam+=sayı;

        }
        System.out.println("girilen"+ sayıAdedi+ "sayının toplamı:"+toplam
        );

        //While ile yapalım
        sayı=0;
        toplam=0;
        int sayac=1;
        while (sayac<=sayıAdedi){
            System.out.println("lutfen bir sayı giriniz");
            sayı=scan.nextInt();
            toplam+=sayı;
            sayac++;
        }
        System.out.println("girilen"+sayıAdedi+"sayının toplamı:"+toplam);
    }
}
