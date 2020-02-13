package pack1;

public class A {
    private static int i;
     protected A(){
        System.out.println("From constructor");
    }
    protected static void test3(){
        System.out.println("From tes3 " +i);
    }
    private static void test1(){
        System.out.println("From test1:" +i);
    }
    static void test2(){
        System.out.println("From test2 :" +i);
    }
    public static void test4(){
        System.out.println("From test4 " +i);
        A obj = new A();
        obj.test5();
    }
    public void test5(){
        System.out.println("From test5");
    }

    public static void main(String[] args) {
        System.out.println("From main:" +i);
        test1();
        test2();
    }
}

