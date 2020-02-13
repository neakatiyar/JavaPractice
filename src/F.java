 class F extends E {
    void test1(){
        System.out.println("test1");
    }

     public static void main(String[] args) {
         F f1= new F();
         f1.test1();
         f1.test2();
         System.out.println("done");
     }
}

abstract class E{
    abstract void test1();
    void test2(){
        System.out.println("test2");
    }
}
