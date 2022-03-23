package day15_methodCreation;

import java.util.Scanner;

public class C02_methodCreation {

    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String kelime= scan.next();
        String tersKelime="";

        if (kelime.length()<3) {
            System.out.println("kelime çok kısa");
        }else if (kelime.length()<=5) {
            if (kelime.length()==3) {
                tersKelime=kelime.substring(2)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }else if (kelime.length()==4) {

                tersKelime=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }else {
                tersKelime=kelime.substring(4)+
                        kelime.substring(3,4)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }
            System.out.println("girdiğiniz kelimedeki harf sayısı:"+ kelime.length());
            System.out.println("kelimenin tersten yazılısı:" +tersKelime);


        }else {
            System.out.println("kelime çok uzun");
        }
    }
}
