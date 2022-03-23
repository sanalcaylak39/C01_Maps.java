package day10_switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        //String de herhangi bir karakteri almak istediğimizde o harfin
        // index'ini kullanarak
        // str.charAt (istenen index) yazabiliriz.

        String str="Java Cok Güzel";
        // J yi yazdıralım
        System.out.println(str.charAt(0));

        System.out.println("" +str.charAt(2)+str.charAt(3));

        System.out.println(""+ str.toLowerCase().charAt(5)+""+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));
        // son karakteri yazdır.
        // srting de 14 harf var, son harfin indexi 14-1

        System.out.println(str.charAt(14-1)); // uzunluk -1

        // eger uzunluğu index olarak girersek
        // java calıstıktan sonra hata verir

        System.out.println(str.charAt(14));



    }






}
