package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Listeden─░stenmeyenElementSilme {

    public static void main(String[] args) {
        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=7;

        istenemeyenElementiSilveYazd─▒r(arr,istenmeyenEleman);


    }

    public static void istenemeyenElementiSilveYazd─▒r(int[] arr, int istenmeyenEleman) {
        List<Integer>yeniList=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] !=istenmeyenEleman){
                yeniList.add(arr[i]);
            }

        }

        System.out.println(yeniList);
    }
}
