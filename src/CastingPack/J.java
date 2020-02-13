package CastingPack;

 class J {
     public static void main(String[] args) {
         byte a =10;
         short b=20;
         int c=10;
         long d=20;
         float f = 20;
         double g = 20.09;
         //a=b;
         b=a;
         d=c;
         g=f;
     }
}
class K{
     static int test(long x){
         return (int)x;
     }

    public static void main(String[] args) {
        int i=10;
        byte b =(byte)test(i);
        System.out.println("done");
    }
}

class L{
    public static void main(String[] args) {
        double d=20;
        int i = (int)d;
        System.out.println("done");
    }
}
