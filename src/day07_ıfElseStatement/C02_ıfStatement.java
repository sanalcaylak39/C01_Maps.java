package day07_ıfElseStatement;

public class C02_ıfStatement {
    public static void main(String[] args) {


        int a=10;
        int b= 20;

        if (a>b && b<100) {
            System.out.println("isteğiniz gerçekleşecek");

        }

        if (a<0) System.out.println("suslu parantez olmazsa sadece bir satır çalışır");

        // bir ıf cümlesinin daha anlaşılır olmasını isityorsanız ıf body sini süslü parantez içine yazmalısınız.
        // ilk noktalı virgülde if cümlesi biter.

        // 24 üncü satırdaki kod 15. satırdaki kod false olsada çalışır
        System.out.println("ikinci satırda çalıştı");


    }
}
