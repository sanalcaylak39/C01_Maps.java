package day07_ıfElseStatement;

import java.util.Scanner;

public class C05_IfElseHafttanınGünleri {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gün ismini yazınız");
        String gunİsmi= scan.next().toUpperCase();

        if (gunİsmi.equals("PAZAR") || gunİsmi.equals("CUMARTESİ")){
            System.out.println("girdiğiniz gün hafta sonu");
        } else {
            System.out.println("girdiğiniz gün hafta içi");
        }
    }
}
