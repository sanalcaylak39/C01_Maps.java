package day48_Çalışmalar;

public class C04_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int arr[] = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;
tpmethod(arr,istenenToplam);

    }

    private static void tpmethod(int[] arr, int istenenToplam) {
      for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + "ve" + arr[j] + "toplamı:" +istenenToplam);
                }

            }

        }
    }
}