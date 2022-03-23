package day_14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {


        String str= "  Siz ne derseniz deyin, Java bildiğini okur.  ";

        str=str.trim(); // atama yaptık str a.
        // (str.trim olursa boşluksuz yazmaz
        System.out.println(str);
        System.out.println(str.length());
    }
}

