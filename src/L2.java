class L2 extends K1{
    int test2(){
        System.out.println("test2");
        return 0;
    }

    int test3(double d) {
        System.out.println("test3");
        return 0;
    }

    public static void main(String[] args) {
        L2 l= new L2();
        l.test1();
        l.test2();
        l.test3(10.00);
        l.test4();
    }
}
