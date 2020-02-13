 class H  extends G{
    void test2(){
        System.out.println("test2");
    }
    void test4(){
        System.out.println("test4");
    }

     public static void main(String[] args) {
         H h1= new H();
         h1.test2();
         h1.test4();
         h1.test1();
         h1.test3();
     }
}
abstract class G{
    void test1(){
        System.out.println("test1");
    }
    abstract void test2();
    void test3(){
        System.out.println("test3");
    }
    abstract void test4();
}
