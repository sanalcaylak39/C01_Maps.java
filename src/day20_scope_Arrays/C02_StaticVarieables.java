package day20_scope_Arrays;

public class C02_StaticVarieables {

    //instance variable objeye bağlıdır. her obje farklı değer alabilir.
    //son değerini bulmak için sadece o objeyi dikkate alırız
    //öğrenc iöğretmen
    //static variableler ise class variable olarak tanımlanır
    //bütün class üyeleri için aynıdır.değeri değişirse herkes için değişir.
    //okul müdür ismi

    static String okulİsmi="yıldız koleji";
    static int okulNo;
    static boolean okulAçıkMı;

    public static void main(String[] args) {
        System.out.println(okulİsmi);
        System.out.println(okulNo);
        okulNo=102;
        System.out.println(okulNo);

        staticMethod();

        System.out.println(okulNo);
    }
    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);

    }
}
