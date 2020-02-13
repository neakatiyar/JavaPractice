package CastingPack;

 class H {
     public static void main(String[] args) {
         double d=10.9;
         int i =(int)d;
         System.out.println(d);
         System.out.println(i);
     }
}
class I{
    public static void main(String[] args) {
        long x=100;
        test((int)x);
        System.out.println("done");
    }
    static void test(int i){

    }
}
