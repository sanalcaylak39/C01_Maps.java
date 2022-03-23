package day04_dataCasting_İncerement;

import java.util.Scanner;

public class C01_Scanner {


public static void main(String[] args) {
    //Kullanıcıdan ismini alıp isminin bas harfini yazdırın

    Scanner scan = new Scanner(System.in);
    System.out.println("Lütfen isminizi giriniz...");
      char ilkHarf= scan.next().charAt(0);
    System.out.println(" Girdiğiniz İsmin ilk harfi:" + ilkHarf);
}
}
