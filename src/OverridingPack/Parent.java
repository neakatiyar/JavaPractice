package OverridingPack;

class Parent {
    Parent(){
        System.out.println("Parent()");
    }
    void test1(){
        System.out.println("test1-parent");
    }
    int i=20;
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("child()");
    }
    Child(int i){
        this();
        System.out.println("child(int)");
    }
    void test2(){
        this.test1();
        super.test1();
        System.out.println("test2-child");
    }
    void test1(){
        System.out.println("child-test1");
        System.out.println(this.i);
        System.out.println(super.i);
    }
}
class Manag{
    public static void main(String[] args) {
        Child c1= new Child();
        c1.test1();
        c1.test2();
        System.out.println("-----------");
        Child c2= new Child(10);
        c2.test1();
        c2.test2();
        System.out.println("----------");
    }
}
