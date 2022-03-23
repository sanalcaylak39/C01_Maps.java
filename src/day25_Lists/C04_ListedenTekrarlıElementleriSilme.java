package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarlıElementleriSilme {
    public static void main(String[] args) {
        //verilen bir listede tekrar eden sayıları sadece bir kez yazdıran bir method olusturun

        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Integer> sayılar= new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(6);
        sayılar.add(1);
        sayılar.add(7);

        tekrarsızListeOlustur(sayılar);
        System.out.println(sayılar);

    }

    public static void tekrarsızListeOlustur(List<Integer> sayılar) {

        List<Integer> tekrarsızList=new ArrayList<>();
        for (int i = 0; i < sayılar.size() ; i++) {
            if(!tekrarsızList.contains(sayılar.get(i))){
                tekrarsızList.add(sayılar.get(i));
            }

        }
        System.out.println(tekrarsızList);
    }
}
