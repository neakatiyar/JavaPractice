package CastingPack;

public class Manager1 {
    public static void main(String[] args) {
        AA a1 = new AA();
        BB b1 = new BB();
        CC c1 = new CC();
        DD d1 = new DD();
        EE e1 = new EE();
        FF f1 = new FF();
        System.out.println("done");
    }
}

class AA {
}

class BB extends AA {
}

class CC extends BB {
}

class DD extends CC {
}

class EE extends DD {
}

class FF extends EE {
}

class Manager2 {
    public static void main(String[] args) {
        AA a1 = new AA();
        AA a2 = a1;
        BB b1 = new BB();
        BB b2 = b1;
        CC c1 = null;
        CC c2 = c1;
        DD d1, d2;
        d1 = d2 = new DD();
        EE e1, e2 = new EE();
        e1 = e2;
        FF f1, f2 = null;
        f1 = f2;
        System.out.println("done");
    }
}

class Mananger4 {
    public static void main(String[] args) {

            EE e1 = new EE();
            test(e1);
    }
    static void test(CC c1){
    }
}

class Manager6{
    static DD test(){
        FF f1= new FF();
        return f1;
    }
    public static void main(String[] args) {
        BB b1= new BB();
        System.out.println("done");
    }
}

class Manager7{
    static BB test1(EE e1){
        return test2(e1);
    }
    static CC test2(DD d1){
        return d1;
    }
    public static void main(String[] args) {
        FF f1 = new FF();
        AA a1 = test1(f1);
        System.out.println("done");

    }
}
class Manager8{
    public static void main(String[] args) {
        {
            AA a1= new CC();
            BB b1= (BB)a1;//explicit downcasting
            System.out.println("done");
        }
    }
}

class Manager9{
    public static void main(String[] args) {
        DD d1= new FF();
        EE e1= (EE)d1;
        System.out.println("test1");
    }
}

class Manager10{
    public static void main(String[] args) {
        EE e1= new FF();
        test((FF)e1);
        System.out.println("done");
    }
    static void test(FF f1){
        System.out.println("test(ff)");
    }
}

class Manager11{
    public static void main(String[] args) {
        AA a1= new AA();
        BB b1= (BB)a1;
    }
}

class Manager12{
    public static void main(String[] args) {
        {
            BB b1= new DD();
            CC c1=(CC) b1;
            DD d1= (DD)c1;
            System.out.println("done");
        }
    }
}

class Manager14{
    public static void main(String[] args) {
        BB b1= new EE();
        CC c1= (CC)b1;
        DD d1= (DD)b1;
        EE e1= (EE)b1;
        //FF f1= (FF)b1;
    }
}

class Manager15{
    public static void main(String[] args) {
        AA a1= new BB();
        System.out.println(a1 instanceof  AA);
        System.out.println(a1 instanceof  BB);
        System.out.println(a1 instanceof  CC);
        System.out.println(a1 instanceof  DD);

    }
}

class Manager17{
    public static void main(String[] args) {
        AA a1= new CC();
        if(a1 instanceof AA){
            AA a2= a1;
            System.out.println(1);
        }
        if(a1 instanceof BB){
            BB b2= (BB)a1;
            System.out.println(2);
        }
        if(a1 instanceof CC){
            CC c2= (CC)a1;
            System.out.println(3);
        }
    }
}