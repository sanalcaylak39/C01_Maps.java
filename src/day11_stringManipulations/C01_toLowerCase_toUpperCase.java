package day11_stringManipulations;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {

    public static void main(String[] args) {

        String str= "java güzeldir";
        // String methodlarını arka arkaya kullanabilirz.
        // ikinci kelimenin ilk harfini küçük yazdıralım.

        //str.charAt(5)
         // böyle yazdığımızda sonuç string değil char olacaktır.
        // dolasıyla string de yapmak ist tüm değiş.önce yapıp sonra charAt kullanmalıyız.

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }
}
