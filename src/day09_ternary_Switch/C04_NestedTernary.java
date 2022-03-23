package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // verilen sayının pozitif mi negatif mi olduğunu kontrol edip
        // pozitif sayı ise tek veya çift
        // negatif sayii ise -100 den büyük veya küçük
        // olduğuunu belirten bir ternary çiziniz

        int sayı=-120;
        if (sayı>=0){

            if (sayı%2==0){
                System.out.println("sayı pozitif çift sayı");
            }else{
                System.out.println("sayı pozitif tek tam sayı");
            }

        }else{
            if (sayı<=-100){
                System.out.println("sayı  -100 den küçük negatif sayı");
            }else {
                System.out.println("sayı -100 den büyük negatif sayı");
            }

        }
       String sonuç=sayı>=100 ?
               (sayı%2==0?"pozitif çift sayı" : "pozitif tek sayı") :
                (sayı<-100? "-100 den küçük negatif sayı" : "-100 den büyük negatif sayı");
    }
}
