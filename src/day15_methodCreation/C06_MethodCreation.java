package day15_methodCreation;

public class C06_MethodCreation {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        //ikisini toplayan bir method oluşturun.

        ikiSayıTopla(25,50);

        C04.dortharfitersineçevir("sema");
    }
     // BİR method'u olusturmak çalışması için yeterli değildir.
    // method ancak çağırılırsa çalışır.

    private static void ikiSayıTopla(int a, int b) {
        System.out.println("verilen iki sayının toplamı:"+ (a+b));
    }
}

