package day11_stringManipulations;

import java.util.Scanner;

public class C03_equalsIgnorCase {

    public static void main(String[] args) {

        //kullanıcıya derse katılıp katılmak istemedğini sorun
        //evet derse, cevabını ve "derse katılımınız alınmıştır" yazdırın
        // hayır derse cevabını ve "

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katılmak isterseniz ? \nEvet veya Hayır yazınız");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız :" + cevap + "derse katılımız onaylanmıştır");
        }
        else if (cevap.equalsIgnoreCase("hayır")){
            System.out.println("cevabınız:" +cevap+ "sonrası derse bekleriz");
        }
        else {
            System.out.println("lutfen evet veya hayır yazınız");
        }
    }
}
