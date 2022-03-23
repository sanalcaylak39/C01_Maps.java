package day05_matematikselİşlemler;

public class C01_Preincerementpost {
    public static void main(String[] args) {

        int sayı=10;
        sayı++;
        System.out.println(sayı); //11

        sayı++;
        System.out.println("pre-incerementten önce" + sayı); //12

        System.out.println("Pre-increment satırında" + ++sayı); //13
        System.out.println("Pre-incrementten sonra" + sayı); //13

        System.out.println("post-increment satırında" + sayı++); //13
        System.out.println("post-incerement sartırından sonra" +sayı); //14




    }
}
