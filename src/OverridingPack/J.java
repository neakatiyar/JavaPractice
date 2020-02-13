package OverridingPack;

abstract  class J {
    abstract void test(int i);{
    }
}
class K extends J{
    void test(){
        System.out.println("test()");
    }
    void test(int i){
        System.out.println("test(int)");
    }
}
