package OverridingPack;

class A {
    void test1(int i){
        System.out.println("test1(int i)");
    }
    int test1(){
        System.out.println("test1");
        return 10;
    }
    public void test1(double d){
        System.out.println("test1(double)");
    }

}

class B {
    public static void main(String[] args) {
        A a1= new A();
        a1.test1();
        a1.test1(10);
        a1.test1(2.3);
    }
}
