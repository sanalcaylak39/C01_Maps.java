import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {

    public static void main(String[] args) {
        // kullanicidan aldiginiz 4 basamakli bir sayinin
        // basamaklardaki rakamlar toplamini bulunuz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz");
         int sayı=scan.nextInt();

         int rakam=0;
         int rakamlarToplamı=0;
         rakam=sayı%10;
         rakamlarToplamı+=rakam;
         sayı/=10;

         rakam= sayı%10;
         rakamlarToplamı+=rakam;

         rakam=sayı%10;
         rakamlarToplamı+=rakam;

         rakam=sayı%10;
         rakamlarToplamı+=rakam;

         rakam=sayı%10;
         rakamlarToplamı+=rakam;
        System.out.println("girdiğiniz sayının rakamlar toplamı" + rakamlarToplamı);
    }
}
