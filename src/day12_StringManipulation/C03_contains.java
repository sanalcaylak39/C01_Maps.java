package day12_StringManipulation;

public class C03_contains {

    public static void main(String[] args) {

        String email= "saat@hotmail.com";
        String arananMetin= "@gmail.com";
        if (!email.contains(arananMetin)) {

            System.out.println("lutfen gmail adresi yazınız");
        }


    }
}
