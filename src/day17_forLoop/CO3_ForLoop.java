package day17_forLoop;

public class CO3_ForLoop {

    public static void main(String[] args) {



      int başlangıç=15;
      int bitiş=30;
      for (int i=başlangıç; i<=bitiş; i++){
          if (i<bitiş){
              System.out.print(i+ " ,");
          }else{
              System.out.print(i);
          }
      }
    }

}
