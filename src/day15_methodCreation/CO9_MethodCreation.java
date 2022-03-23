package day15_methodCreation;

public class CO9_MethodCreation {

    public static void main(String[] args) {

        String isim="yasemin yalçın";
        String soyisim="yalçın";
        String kKno="1234567890128795";

         String gizlenmişİsimSoyisim=isimSoyisimGizle(isim,soyisim);

        System.out.println(gizlenmişİsimSoyisim);
        String gizlenmişKrediKartıNO=krediKartıGizle(kKno);

        System.out.println(gizlenmişKrediKartıNO);
    }

    public static String krediKartıGizle(String kKno) {
        String yenikKNo="**** **** ****" + kKno.substring(12);

        return yenikKNo;

    }

    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniİsim=isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyİsim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");
        return yeniİsim+" "+yeniSoyİsim;



    }
}
