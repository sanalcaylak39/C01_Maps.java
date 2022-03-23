package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str="Java Öğrenmek Çok Zevkli";
        str. substring(0,4);

        //bir program yaparken kodlarımızın daha kısa ve anlaşılır olması için
        //sürekli kullanacağımız koda bloklarını hazır olarak bir yere koyar
        //ihtiyacımmız oldukça alıp kullanırız.

        //method'lar robotlara benzer
        //method oluşturmak bazen o methodun yapacağı işi yapmaktan
        //zor olabilir.
        //bir işlemi sadece bir kez yapacaksak method kullanmamıza gerek olmaayabilir
        //ancak özellikle çok kullanacağımız işlemler için
        //her seferinde yeniden aynı  kodları yazmak yerine
        //bu işlemi yapan hazır bir nethod oluşturmak daha pratiktir.

        // bazen bir class'in icerisinde cok uzun kodlar yazarsak
        // tum class'in anlasilmasi zorlasabilir
        // bunun yerine kod'un belli kisimlarini ayri method'lar olarak olusturup
        // main method icerisinden istedigimiz sekilde bu methodlari yonetebiliriz.
    }
}
