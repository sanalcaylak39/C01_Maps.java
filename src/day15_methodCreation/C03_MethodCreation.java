package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        int harfSayısı = kelime.length();

        if (harfSayısı < 3) {
            System.out.println("kelime çok kısa");

        } else if (harfSayısı == 3) {
            üçharfitersineçevir(kelime);
        } else if (harfSayısı == 4) {
            dortharfitersineçevir(kelime);
        } else if (harfSayısı == 5) {
            beşharfitersineçevir(kelime);
        } else {
            System.out.println("kelime çok uzun");
        }

    }
//1-method oluşturmak için method adını yazarız
    // 2-method'a giderken götürmem gereken variable varsa bunu method'a götürmeliyim.

    private static void beşharfitersineçevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiğiniz kelimedeki harf sayısı:"+ kelime.length());
        System.out.println("kelimenin tersten yazılısı:" +tersKelime);


    }

    private static void dortharfitersineçevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiğiniz kelimedeki harf sayısı:"+ kelime.length());
        System.out.println("kelimenin tersten yazılısı:" +tersKelime);

    }

    private static void üçharfitersineçevir(String kelime) {
       String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("girdiğiniz kelimedeki harf sayısı:"+ kelime.length());
        System.out.println("kelimenin tersten yazılısı:" +tersKelime);


    }
    }

