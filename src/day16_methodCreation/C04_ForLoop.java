package day16_methodCreation;

public class C04_ForLoop {

    public static void main(String[] args) {
        //verilen stringi tersten yazdıran bir kod oluşturunuz

        String str="valla bu java çok zevkli";

        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.substring(i,i+1));

        }
    }
}

