package OverridingPack;

class C {
    void test1(){
        System.out.println("done");
    }
    int test1(int i){
        System.out.println("test1 defined");
        return 10;
    }
}

class D{
    static void test(){
        System.out.println("done");
    }
    public int test(int i) {
        return 20;
    }
}


