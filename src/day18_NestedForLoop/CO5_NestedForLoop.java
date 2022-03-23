package day18_NestedForLoop;

public class CO5_NestedForLoop {

    public static void main(String[] args) {
        char input='L';
        for (char i = 'A'; i <=input ; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println(" ");
        }
    }
}
