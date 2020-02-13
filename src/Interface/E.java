package Interface;

public class  E  implements A{

    @Override
    public void test1() {
        System.out.println("test1");
    }

    @Override
    public void test3() {
        System.out.println("test3");
    }

    public static void main(String[] args) {
        E obj = new E();
        obj.test1();
        obj.test3();
        obj.test4();
    }
}
