package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarınYeriniDeğiştirme {
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

        int ilkİndex=2;
        int ikinciIndex=5;
        sayılar=swapElements(sayılar,ilkİndex,ikinciIndex);

    }

    private static List<Integer> swapElements(List<Integer> sayılar, int ilkİndex, int ikinciIndex) {

        return sayılar;
    }
}
