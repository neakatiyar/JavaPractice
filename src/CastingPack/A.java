package CastingPack;

 class A {
     public static void main(String[] args) {
         int i=10;
         double d=i;
         System.out.println("done");
     }
}

class B{
    public static void main(String[] args) {
        byte b =10;
        int i = b;
        double d= i;
        float f= b;
        long l=i;
        System.out.println("done");
    }
}

class C{
    public static void main(String[] args) {
        int i=10;
        test(i);
    }
    static void test(double d){
        System.out.println("test(double)");
    }
}

class D{
    public static void main(String[] args) {
        int i=test();
        System.out.println("done");
    }
    static byte test(){
        return 10;
    }
}

class F{
     static long test(){
         int i=10;
         return i;
     }

    public static void main(String[] args) {
        double d = test();
        System.out.println("done");
    }
}

class G{
     static float test1(short s){
         return test1(s);
     }
 static long test2(int i){
         return i;
 }
    public static void main(String[] args) {
        byte b=10;
        double d = test1(b);
        System.out.println("done");
    }
 }