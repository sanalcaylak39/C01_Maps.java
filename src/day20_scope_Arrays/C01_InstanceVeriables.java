package day20_scope_Arrays;

public class C01_InstanceVeriables {

    int sayı;
    String branşİsmi="java";
    boolean okuldaMı;

    public static void main(String[] args) {
        //sayı=10; sayı veriable'ı static olmadığı için main moethod da kullanılamaz.
        C01_InstanceVeriables obj1=new C01_InstanceVeriables();
        System.out.println(obj1.sayı);//0

        obj1.sayı=10;
        System.out.println(obj1.sayı);

        obj1.branşİsmi="sql";
        System.out.println(obj1.okuldaMı);

        C01_InstanceVeriables obj2=new C01_InstanceVeriables();
        System.out.println(obj2.sayı);
        System.out.println(obj2.branşİsmi);

        obj1.okuldaMı=true;
        System.out.println(obj2.okuldaMı);


    }

}
