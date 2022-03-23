package day11_stringManipulations;
import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1= "Java bir başka güzel";
        // istersek char olarak verdigimiz
        // bir harfin indexini bize dondurur
        System.out.println(str1.indexOf('J'));
        // istersek bir harf ya da metin olarak verdigimiz String'in
        // indexini dondurur

        System.out.println(str1.indexOf("J"));
    }
}
