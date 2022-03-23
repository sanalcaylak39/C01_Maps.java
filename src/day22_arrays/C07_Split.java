package day22_arrays;

import java.util.Arrays;

public class C07_Split {

    public static void main(String[] args) {
        String str="java gün geçtikçe güzelleşiyor";
        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println(kelimeler[1]);

        String geçtikçe[]=str.split("geçtikçe");
        System.out.println(Arrays.toString(geçtikçe));

        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));

    }
}
