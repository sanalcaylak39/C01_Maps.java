package day10_switch_StringManipulation;

public class C07_MethodCreation {

    public static void main(String[] args) {
       hoşgeldinizYazdır();

    }

    public static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiğiniz için teşekkür ederiz");
    }

    public static void hoşgeldinizYazdır() {
        System.out.println("hoşgeldiniz");
        stringyazdır("böyle de olur");
    }

    public static void stringyazdır(String str) {
        System.out.println(str);
       kapanmaMethodu();
    }
}
