package day23_multiDimensionallArrays;

public class C08_MDArrays {
    public static void main(String[] args) {
        int arry[][]={ {1,2,1}, {4,5}, {6}};


        int çarpım=1;
        for (int i = 0; i < arry.length; i++) {
            çarpım *=arry[i][arry[i].length-1];

        }
        System.out.println("son elementlerin çaprımı:"+ çarpım);
    }
}
