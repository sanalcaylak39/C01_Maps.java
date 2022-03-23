package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class CO3_Set {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();

        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oğuzhan");
        System.out.println(isimler);
        isimler.set(0, "seçkin");
        System.out.println(isimler);

        List<String>logListesi=new ArrayList<>();
        logListesi.add(isimler.set(2,"cosmos"));
        System.out.println(logListesi);
        System.out.println(isimler);
    }

}
