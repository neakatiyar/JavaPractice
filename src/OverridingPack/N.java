package OverridingPack;

abstract class N {
    abstract int test1();
}
class O extends N{
    int test1(){
       return 0;
    }
}
