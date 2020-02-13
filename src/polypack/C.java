package polypack;

 class C {
    static  void test(){
         System.out.println("c-test");
     }
       void test1(){
         System.out.println("c-test");
     }
}
class D extends C{
     static void test(){
         System.out.println("d-test");
     }
      void test1(){
        System.out.println("c-test");
    }
}
class Manager{
     static void method(C c1){
         c1.test();
         c1.test1();
     }

    public static void main(String[] args) {
        C obj1= new C();
        D obj2= new D();
        method(obj1);
        method(obj2);
    }
}
