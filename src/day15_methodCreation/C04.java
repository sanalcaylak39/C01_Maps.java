package day15_methodCreation;

public class C04 {
    public static void beşharfitersineçevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiğiniz kelimedeki harf sayısı:"+ kelime.length());
        System.out.println("kelimenin tersten yazılısı:" +tersKelime);


    }

    public static void dortharfitersineçevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiğiniz kelimedeki harf sayısı:"+ kelime.length());
        System.out.println("kelimenin tersten yazılısı:" +tersKelime);

    }

    public static void üçharfitersineçevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("girdiğiniz kelimedeki harf sayısı:"+ kelime.length());
        System.out.println("kelimenin tersten yazılısı:" +tersKelime);


    }
}

