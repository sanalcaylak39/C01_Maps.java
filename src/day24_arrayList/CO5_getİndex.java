package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class CO5_getİndex {
    public static void main(String[] args) {
        List<Integer>sayılarList=new ArrayList<>();
        sayılarList.add(5);
        sayılarList.add(3);
        sayılarList.get(1);
        sayılarList.add(0,7);
        sayılarList.add(2,7);
        System.out.println(sayılarList.get(1));
        System.out.println(sayılarList);
    }
}
