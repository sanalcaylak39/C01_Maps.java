package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in); // eşitliğin sağında yeni bir scanner oluşturulur
                                              // ve oluşturulan bu scanner scan variable'na assign edilir.
                                              // scan variable' nin ismidir.
        //2.adım : Kullanıcıdan istediğimiz degeri vermesi için açıklayıcı bir bilgi yazdırın.

        System.out.println("Lütfen isminizi giriniz");

       // String kullanıcıİsmi=scan.next(); // sadece ilk kelimeyi alır (ilk space'e kadar olan bölümü alır)

        String kullanıcıİsmi= scan.nextLine(); // satıt sonuna kadar girilen tüm değerleri alır.
        System.out.println("Kullanıcının girdiği isim :" + kullanıcıİsmi);




    }
}
