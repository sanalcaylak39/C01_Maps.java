package day12_StringManipulation;

public interface C01_indexOf {

    public static void main(String[] args) {
     String cumle= "Java ogren yeni bir program ile yeni bir sayfa aç";
     String kelime="Java";

     int ilkKullanım=cumle.indexOf(kelime);

     int ikinciKullanım=cumle.indexOf(kelime, ilkKullanım+1);

      if (ilkKullanım==(-1)){
          System.out.println("girilen kelime cümlede  kullanılmamış");
      }

        else if (ikinciKullanım==(-1)){
          System.out.println("girilen kelime cümlede 1 kez kullanılmış");
      }
        else {
          System.out.println("girilen kelime birden fazla kullanılmış");
      }
    }
}
