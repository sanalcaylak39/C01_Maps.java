public class C02_SwapVeriables {

    public static void main(String[] args) {

        int sayı1=10;
        int sayı2=20;
        System.out.println("Swap'dan önce sayı1: " +sayı1 +" , sayı2: " + sayı2);

        int temp=sayı1;
        sayı1=sayı2;
        sayı2=temp;
        System.out.println("Swap'tan sonra sayı1:"+sayı1+ ",sayı2:" +sayı2);


    }
}
