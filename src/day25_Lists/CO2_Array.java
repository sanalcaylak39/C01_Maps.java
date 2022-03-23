package day25_Lists;

import java.util.Arrays;

public class CO2_Array {
    public static void main(String[] args) {
        //verilen bir array dan istenene elementi silip
        //kalanları yeni bir array olarak yazdıran bir method olusturun
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int istenmeyenElement = 3;
        istenmeyenElementiSil(arr, istenmeyenElement);
    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenElement) {

        //istenmeyen element sayısını bulalım
        int sayaç = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenmeyenElement) {
                sayaç++;
            }

        }
        int arrYeni[] = new int[arr.length - sayaç];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyenElement) {
                arrYeni[index]=arr[i];
                index++;


            }
        }

    }
}
