package day07_ıfElseStatement;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("luften yasınızı giriniz");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else {
            System.out.println("emekli olamazsın");
            System.out.println(65-yas + "sene daha çalışmalısın");
        }
        //ıf else statement larda iki durumdan sadece ve sadece biri çalışır
        // ikisinin birden çalışma ====> yok ve çalışmama ihtimali yoktur====> yok

    }
}
