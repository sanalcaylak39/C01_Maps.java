package day12_StringManipulation;

public class C05_replace {

    public static void main(String[] args) {

        String str= "Bugün ne çok şey öğrendik";
        // bu cümlede boşluk dışındaki karakter sayısını bulunuz

        System.out.println(" space hariç karakter sayısı: " + str.replace(" ", "").length());
        // atama yapılmadığı sürece orjınal string kalıcı olarak değişmez
        // sadece o satır için değişiklik yapılıp sonu. yazdırılır.

        System.out.println("orjinal str karakter sayısı:" +str.length());
       str=str.replace("bugün", "yarın");
       str=str.replace("öğrendik", "öğreneceğiz");

        System.out.println("kalıcı değişiklikten sonra:" + str);
        str.replace("ne çok" , "ne az");
        System.out.println( str);

        }
}
