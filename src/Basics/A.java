package Basics;

public class A {
    int i;
    static int j;
    void test(){
        System.out.println("test");
    }
    static void test2(){
        System.out.println("test2");
    }
    public static void main(String[] args) {
        System.out.println(j);
        System.out.println(A.j);
      //  System.out.println(i);
        A obj= new A();
        System.out.println(obj.i);
        obj.test();
        A.test2();
        test2();
    }
}
class B{

}
