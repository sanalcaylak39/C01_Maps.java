package day23_multiDimensionallArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        int arr[]={3,5,7};
       // arr[3]=8; arrayde olmayan bir index e atama yapamayız.

        arr=new int[4];
        System.out.println(Arrays.toString(arr));

        int arrYeni[]= new int[5];

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        //bir arraye içinde hazır elemanların olduğu yeni bir
       // array atamak isterseniz bunu 1 2 3 şeklinde yazarak değil new int[3]diyerek olusturp
        //sonra değer atayarak yapabiliriz

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));

    }
}
