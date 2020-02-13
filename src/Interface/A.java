package Interface;
interface A{
    abstract void test1();
      static void test2(){
         System.out.println("test2");
    }
    default void test4(){
        System.out.println("test4");
    }
    public void test3();
    /*void test2(){
        System.out.println("test2");
    }*/
}
class B implements A{
    public void test1(){
        System.out.println("test1");
    }

    public void test3(){
        System.out.println("test3");
    }

    public static void main(String[] args) {
        A.test2();
    }
}
