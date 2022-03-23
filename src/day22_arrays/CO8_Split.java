package day22_arrays;

import java.util.Arrays;

public class CO8_Split {
    public static void main(String[] args) {
        String cümle="nerede o 'hello world' yazdırmayan öğrenciler?";
        String harf="e";

        harfKaçKezKullanılmış(cümle,harf);
    }

    private static void harfKaçKezKullanılmış(String cümle, String harf) {
        int sayaç=0;
        String karakterler[]=cümle.split("");

        for (int i = 0; i < karakterler.length ; i++) {
            if (karakterler[i].equals(harf)){
                sayaç++;
            }

        }

        System.out.println("aradığınız "+ harf +" verilen cümlede "+sayaç+" adet kullanılmış");
    }
}
