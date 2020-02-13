package OverridingPack;

 abstract class U {
      abstract void test1();
}
class V extends U{
     void test1(){
         System.out.println("test1");
     }
}
