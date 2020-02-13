package OverridingPack;

 class XX {
     void test(){
         System.out.println("x-test()");
     }
}
class YY extends XX{
     void test(){
         System.out.println("y-test");
         super.test();
         super.test();
     }
}
class Mana{
    public static void main(String[] args) {
        YY y1= new YY();
        y1.test();
    }
}
