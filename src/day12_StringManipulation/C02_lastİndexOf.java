package day12_StringManipulation;

import java.io.PrintStream;

public class C02_lastİndexOf {

    public static void main(String[] args) {
        String cumle= "Java ogren yeni bir program ile yeni bir sayfa aç";
        String kelime="yeni";

        int ilkKullanım=cumle.indexOf(kelime);

        int sonKullanım=cumle.lastIndexOf(kelime);

        if (ilkKullanım==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (ilkKullanım==sonKullanım){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }
       String str= "Eclipse";
        System.out.println(str.lastIndexOf("p",4)); // 4dahil
    }
}
