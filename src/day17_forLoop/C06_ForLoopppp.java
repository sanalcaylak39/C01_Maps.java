package day17_forLoop;

public class C06_ForLoopppp {

    public static void main(String[] args) {
        char ilkHarf='m';
        char sonHarf='t';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i+" ");

        }

        double başlangıç=10;
        double bitiş=20;
        double artış=0.2;

        for (double i = başlangıç; i <=bitiş ; i+=artış) {
            System.out.println(i+" ");
        }
    }
}
