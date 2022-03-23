package day13_stringManipulation;

import com.sun.jdi.IntegerValue;

public class C02_substring {
    public static void main(String[] args) {
        //1-48 of 104 result for nutella
        //bu araama sonucundaki bulunan sonuç sayısı 100'den çok ise super
        // az ise "az sonuç bulundu"
        String str="1-48 of 104 result for \"nutella\"";

        int ilkSpace=str.indexOf(" ");
        int ikinciSpace= str.indexOf(" ",ilkSpace+1);
        int üçüncüSpace=str.indexOf(" ", ikinciSpace+1);

        String aramaSonuçSayısıStr=str.substring( ikinciSpace+1,üçüncüSpace);
         int aramaSonuçSayısıInt= Integer.valueOf(aramaSonuçSayısıStr);

         if (aramaSonuçSayısıInt>100){
             System.out.println("super");
         }else {
             System.out.println("az sonuç bulundu");
         }


    }
}
