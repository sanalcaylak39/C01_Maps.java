package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        List<Double>sayılar=new ArrayList<>();
        sayılar.add(1.0);
        sayılar.add(3.0);
        sayılar.add(5.0);
        sayılar.add(3.0);
        sayılar.add(5.0);
        sayılar.add(6.0);
        sayılar.add(1.0);
        sayılar.add(7.0);
        //ortalamayı bul

        double ortalama=0.0;
        double toplam=0.0;
        for (int i = 0; i < sayılar.size() ; i++) {
            toplam+= sayılar.get(i);

        }
        //ortalamanın üstünde olanları bir liste at
        ortalama=toplam/ sayılar.size();
        System.out.println(ortalama);
List<Double>ortalamanınüstündekiler=new ArrayList<>();

        for (int i = 0;  i< sayılar.size() ; i++) {
            if (sayılar.get(i) > ortalama) {
                ortalamanınüstündekiler.add(sayılar.get(i));

            }

        }
        System.out.println(ortalamanınüstündekiler);
    }
}

