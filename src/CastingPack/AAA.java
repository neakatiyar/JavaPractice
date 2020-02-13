package CastingPack;

class AAA {
    int i;
    void test1(){
        System.out.println("test1");
    }
}
class BBB extends AAA{
    int j;
    void test2(){
        System.out.println("test2");
    }
}

class Manage{
    public static void main(String[] args) {
        AAA a1= new AAA();
        a1.test1();
        a1.i=10;
        System.out.println(a1.i);
        BBB b1= new BBB();
        b1.test1();
        b1.i=10;
        b1.test2();
        b1.j=20;
        System.out.println(b1.i);
        System.out.println(b1.j);
    }
}

class Manage2{
    public static void main(String[] args) {
        AAA a1= new BBB();
        a1.i=10;
        a1.test1();
        //a1.j=20;
        //a1.test2();
        BBB b1= (BBB)a1;
        System.out.println("done");
    }
}
