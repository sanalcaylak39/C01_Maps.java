package day17_forLoop;

public class CO7_ForLoop {
    public static void main(String[] args) {
        // Kullanicidan 100’den kucuk bir tamsayi isteyin.//
        // 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        // Sayi 3’un kati ise sayi yerine "Java" yazdirin.
        // Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
        // Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin.

    int sayı=60;
    for (int i=1; i<=60; i++){
        if (i%3==0){
            System.out.print(" java ");
        }else if (i%5==0){
            System.out.print("güzeldir");
        }else if (i%3==0 && i%5==0){
            System.out.print("java güzeldir");
        }else {
            System.out.print(i +" ");
        }


    }

    }
}
