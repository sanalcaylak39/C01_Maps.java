package day48_Çalışmalar;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi dirin

        // next() only can read the first word
        // nextLine() can read the whole line
        Scanner scan=new Scanner(System.in);
        System.out.println("lülfetn isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("lütfen memleketinizi giriniz");
        String memleket=scan.nextLine();

        System.out.println("konumunuzu giriniz");
        String konum= scan.next();

        System.out.println("yaşınızı giriniz");
        int yaş= scan.nextInt();

        System.out.println("boyunuzu giriniz");
        double boy= scan.nextDouble();

        System.out.println("yaşadğınız" +konum +"u seyiyor musunuz true/false" );
        boolean seviyorMu= scan.hasNextBoolean();

        System.out.println("isim=" + isim);
        System.out.println("memleket=" +memleket);
        System.out.println("konum=" + konum);
        System.out.println("yaş=" + yaş);
        System.out.println("boy=" + boy);
        System.out.println("yasadiginiz yeri seviyor musunuz = " + seviyorMu);



    }

}
