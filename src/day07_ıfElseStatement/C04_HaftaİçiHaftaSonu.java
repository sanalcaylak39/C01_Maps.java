package day07_ıfElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaİçiHaftaSonu {

    public static void main(String[] args) {
      // gün pazar veya cumartesi ise ===> hafta sonu
        // pazartesi salı çarşamba perşembe cuma ise===> hafta içi

        // String case sensitive dir.
        // pazar Pazar PaZar hep farklı kelimelerdir.
        // bu durumda string methodlarından yard. alırız.

        Scanner scan= new Scanner(System.in);
        System.out.println("luften gün ismini yazınız");
        String gunİsmi= scan.next().toLowerCase(); // kullanıcı nasıl girerse girsin biz küçük harf görürüz.
        if (gunİsmi.equals("cumartesi")|| gunİsmi.equals("pazar")) {
            System.out.println("girdiğiniz gün hafta sonu");

        }

        if (gunİsmi.equals("pazartesi")|| gunİsmi.equals("salı")|| gunİsmi.equals("çarşamba")||
                gunİsmi.equals("perşembe")|| gunİsmi.equals("cuma")){
            System.out.println("girdiğiniz gün hafta içi");
        }
        // equals string ifadelerde tavsiye edilmez. beklediğimizden farklı sonuç verir.

    }
}
