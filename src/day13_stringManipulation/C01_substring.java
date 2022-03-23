package day13_stringManipulation;

public class C01_substring {

    public static void main(String[] args) {
        String str= "Java ile IT çok güzel";
        System.out.println(str.substring(5));
        // Mehmet hoca ile IT çok güzel

        System.out.println(str.replace("Java","Mehmet hoca"));

        System.out.println(str.substring(9));

        // 2 parametre yazmak gerekirse str.substring(başlangıçIndexi,bitişIndexi)

        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,1));
        String harf=str.substring(5,6);
        System.out.println(harf);

        str="Java geçtikçe güzelleşiyor.";
        System.out.println(str.substring(7,7));
           // java soldan sağa okur.

        System.out.println(str.substring(5,2));
        //bitiş ındex'i başlangıç ındex'inden büyük olamaz.


    }

}
