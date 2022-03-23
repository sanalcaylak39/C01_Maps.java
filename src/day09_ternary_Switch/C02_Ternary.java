package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {
        // ternary ile yapılan tüm işlemler ternary ile yapılabilir.
        // tercih sebebi basit olmasıdır. Ternary içerisinde komleks kodlar olmaz.
        // sadece sonuç veya bizi sonuca götüren basit işlemler olabilir.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen pozıtif bir tam sayı giriniz");
        int sayı= scan.nextInt();

        if (sayı%2==0){
            System.out.println("çift sayı");
        }else {
            System.out.println("sayı tek");
        }

        System.out.println(sayı%2==0 ? "sayı çift" : "sayı tek");
    }
}
