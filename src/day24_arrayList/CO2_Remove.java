package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class CO2_Remove {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();

        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oğuzhan");

        boolean sonuç=isimler.remove("oğuzhan");
        if(sonuç==true){
            System.out.println("istediğiniz isim silindi");
        }else {
            System.out.println("istediğiniz isim olmadığından silinmedi");
        }

        System.out.println(isimler.remove(1));
        System.out.println(isimler);

        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(1);
        sayılar.add(2);
        sayılar.add(3);
        sayılar.add(4);
        System.out.println(sayılar);

        //int sayı=4;
        //sayılar.remove(sayı);
        System.out.println(sayılar); //exception

        Integer sayı=4; //integer wrapper class ı kullnınca sayı obje oldu.çalıştı.
        sayılar.remove(sayı);
        System.out.println(sayılar);


    }
}
