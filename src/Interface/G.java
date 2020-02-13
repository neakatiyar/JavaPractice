package Interface;

interface G {
     void test1();
     int test2();
     void test3(int i);
}
interface I{
    void test4();
}
class J extends H implements G,I{

}

class H implements G,I{

    @Override
    public void test1() {
        System.out.println("test1");
    }

    @Override
    public int test2() {
        System.out.println("test2");
        return 0;
    }

    @Override
    public void test3(int i) {
        System.out.println("tes3");
    }

    public static void main(String[] args) {
        H obj= new H();
        obj.test1();
        obj.test2();
        obj.test3(10);
    }

    @Override
    public void test4() {
        System.out.println("test4");
    }
}
