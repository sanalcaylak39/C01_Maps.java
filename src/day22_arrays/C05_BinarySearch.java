package day22_arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,5,6,1,9,45,25,4,9,0};

        int istenenSayı=5;

        istenenSayıVarMı(arr,istenenSayı);
    }

    public static void istenenSayıVarMı(int[] arr, int istenenSayı) {
        boolean sonuç=false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenenSayı){
                sonuç=true;
                break;
            }

        }
        System.out.println("true");
    }
}
