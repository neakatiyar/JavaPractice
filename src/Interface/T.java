package Interface;

interface T {
        void test1();
}
interface U{
    void test2();
}
interface V extends U,T{
    void test3();
}
class W implements V{

    @Override
    public void test1() {
        System.out.println("test1");
    }

    @Override
    public void test2() {
        System.out.println("test2");
    }

    @Override
    public void test3() {
        System.out.println("test3");
    }
}
