package day08_ıfElseStatement;

import java.util.Scanner;

public class C04_Emeklilik{
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi yazınız" +
                "\nkadın ise K \nerkek için E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("luften yaşınızı giriniz");
        double yaş = scan.nextDouble();

        if (cinsiyet == 'K') {

            if (yaş<0 || yaş>120 ){
                System.out.println("lutfen girdiğiniz yaş değerini kontrol edin");
            }else if (yaş<60){
                System.out.println("emekli olamazsın \n"+ (60-yaş) + "yıl çalışman gerekir" );
            }else{
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet == 'E') {
            if (yaş<0 || yaş>120 ){
                System.out.println("lutfen girdiğiniz yaş değerini kontrol edin");
            }else if (yaş<65){
                System.out.println("emekli olamazsın \n"+ (65-yaş) + "yıl çalışman gerekir" );
            }else{
                System.out.println("emekli olabilirsin");
            }


        }else {
            System.out.println("lütfen cinsiyet için geçerli bir harf giriniz");
        }

    }
}



