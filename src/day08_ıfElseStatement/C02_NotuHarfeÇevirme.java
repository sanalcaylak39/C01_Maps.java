package day08_ıfElseStatement;

import java.util.Scanner;

public class C02_NotuHarfeÇevirme {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double notSayı= scan.nextDouble();

        if (notSayı<0 || notSayı>100){
            System.out.println("lutfen geçerli not giriniz");
        } else if (notSayı<50){
            System.out.println("notunuz D");
        }else if (notSayı>=50 && notSayı<60){
            System.out.println("notunuz C");
        }else if (notSayı>=60 && notSayı<80){
            System.out.println("notunuz B");
        }else {
            System.out.println("notunuz A");
        }
    }
        }