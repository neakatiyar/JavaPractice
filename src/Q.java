abstract class Q {
   /* Q(){
        System.out.println("Q constructor");
    }*/
     Q(int a){
        //this();
        System.out.println("parametersiZed constructor");
    }
    abstract void test1();
    abstract void test2();
    void test3(){
        System.out.println("test3");
    }
}

class R extends Q{
    R()
    {
        super(10);
        System.out.println("R constructor");
    }
    R(int a){
        this();
        System.out.println("r");
    }
    void test1(){
        System.out.println("test2");
    }
    void test2(){
        System.out.println("test3");
    }

    public static void main(String[] args) {
        R r = new R();
        r.test1();
        r.test2();
        r.test3();
    }
}
