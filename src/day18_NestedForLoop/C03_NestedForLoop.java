package day18_NestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        int input=5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }

}
// nested for loop ya dikdörtgen vyea üçgen formatında olabilir
//dikdörtgen istediğimizde iki loop için bağımsız point belirleriz.