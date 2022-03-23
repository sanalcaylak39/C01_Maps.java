package day09_ternary_Switch;

public class C03_Ternary {

    public static void main(String[] args) {

        int sayı=1400;

        String sonuç = sayı>=100 ? "sayı 3 basamaklı veya daha büyük" : "sayı negatif veya 3 basamaktan küçük";

        // ternary bize sonuç döndürdüğü için ya bunu direk yazdırmalıyız ya da
        // sonucun data türüne uygun bir veriableye atama yapabiliriz.

        System.out.println("girdiğiniz sayı analizi:"+ sonuç);

    }
}
