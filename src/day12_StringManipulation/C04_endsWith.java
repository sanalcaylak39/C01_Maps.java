package day12_StringManipulation;

public class C04_endsWith {

    public static void main(String[] args) {

        String email="saat@gamil.com";
        String arananMetin= "@gmail.com";
        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)){
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazımı kontrol edin");
        }
    }
}
