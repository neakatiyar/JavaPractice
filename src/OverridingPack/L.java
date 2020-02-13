package OverridingPack;

 class L {
    void test(){
        System.out.println("test()");
    }
}
class M extends L{
     int test1(){
         System.out.println("test1");
         return 10;
     }
}
 class Man{
     public static void main(String[] args) {
         M obj= new M();
         obj.test1();
         obj.test();
     }
 }