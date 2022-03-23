package day07_ıfElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C07_HatfanınGünleriİfElseİf {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gün ismini yazınız");
        String gunİsmi=scan.next().toLowerCase();

        if (gunİsmi.equals("pazar") || gunİsmi.equals("cumartesi")){
            System.out.println("girdiğiniz gün hafta sonu");

        }else if(gunİsmi.equals("pazartesi")|| gunİsmi.equals("salı")|| gunİsmi.equals("çarşamba")||
                gunİsmi.equals("perşembe")|| gunİsmi.equals("cuma")){
            System.out.println("girdiğiniz gün hafta içi");

        } else {
            System.out.println("lutfen geçerli bir gün giriniz");
        }
        // else ile bitiyorsa olasılıklardan bir tanesi mutlaka çalışır.
        //java ilk bulduğu true'a ait sonucu yazdırır.
        //veya kalan şartlara bakar
        // if else if cümleleri else ile bitmese de çalışır
        //ıf le bitince bu durumda sadece bir olasılık çalışır veya hiçbir işlem çalışmaz
    }

}
