package day07_ıfElseStatement;

import java.util.Scanner;

public class C03_tekÇiftSayı {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Luften bir tam sayı giriniz");
        int sayı= scan.nextInt();

        if (sayı%2==0) {
            System.out.println("girilen sayı cift sayıdır");
        }

        if (sayı%2!=0) {
            System.out.println("girilen sayı tek sayıdır");
        }

         //  normlade bir sayı ya tektir ya çifttir, üçüncü bir durum yoktur.
        // o zaman tek veya çift olmasını ayrı iki if ile değil
        //if else ile tek statement'da yapmak daha güzel olur.
        //======if else ile çözüm===

        if (sayı%2==0){
            System.out.println("girdiğiniz sayı çift sayıdır");
        }else {
            System.out.println("girdiğiniz sayı tek sayıdır");
        }
    }

}
