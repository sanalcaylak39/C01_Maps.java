package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.

    String inpute="java";
    palindromeKontrolEt(inpute);

    }

    private static void palindromeKontrolEt(String inpute) {
        String terstenİmput="";
        for (int i=inpute.length()-1; i>=0; i--){
            terstenİmput+=inpute.charAt(i);
        }
        System.out.println("girdiğiniz kelimenin tersten yazılısı:"+ terstenİmput);
   if (inpute.equalsIgnoreCase(terstenİmput)){
       System.out.println("girdiğiniz kelime palindrome");
   }else {
       System.out.println("girdiğiniz kelime palindrome değil");
   }

    }

}
