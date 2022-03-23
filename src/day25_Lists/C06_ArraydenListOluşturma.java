package day25_Lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOluşturma {
    public static void main(String[] args) {
        String arr[]={"A", "B" , "C"};
       List<String> arraydenList= Arrays.asList(arr);

       //arraydenList.add("J");
        System.out.println("12.satırda list:"+arraydenList);
        //arrayden liste çevirince yeni listin uzunluğunu değiştiremeyiz
        //add, remove, clear gibi methodlar çalıştımak ist, exceptıon olusur.

        arr[1]="F";
        System.out.println("17satırda list:"+ Arrays.toString(arr));
        System.out.println("18.satırda list" + arraydenList);

        arraydenList.set(0,"Y");
        System.out.println("21.satırda list:"+arraydenList);
        System.out.println(Arrays.toString(arr));

    }
}
