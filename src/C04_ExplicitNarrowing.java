public class C04_ExplicitNarrowing {


    public static void main(String[] args) {

        int sayı1=879;
        double sayı2=10;

        double sayı3= sayı1/sayı2;
        System.out.println(sayı3);

        int sayı4= (int) (sayı1/sayı2);

        System.out.println(sayı4);
    }
}
