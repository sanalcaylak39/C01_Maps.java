package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C05_ListiTekrarsızYap {
    public static void main(String[] args) {

        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(6);
        sayılar.add(1);
        sayılar.add(7);
sayılar=tekrarsızListeOluştur(sayılar);

    }

    public static List<Integer> tekrarsızListeOluştur(List<Integer> sayılar) {
        List<Integer> tekrarsızList=new ArrayList<>();
        for (int i = 0; i < sayılar.size() ; i++) {
            if(!tekrarsızList.contains(sayılar.get(i))){
                tekrarsızList.add(sayılar.get(i));
            }

        }
        return tekrarsızList;

    }

}
