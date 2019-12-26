public class Swap {
    public static void main(String[] args) {
    swapValueTemp();
    swapValue();
    }
    //Using temp Variable
    public static void swapValueTemp(){
        int temp=0,a=5,b=7;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a " +a);
        System.out.println("Value of b " +b);
    }
    //Without Using temp Variable
    public static void swapValue(){
        int a=15,b=7;
         a=a+b;
         b=a-b;
        System.out.println(b);
         a=a-b;
        System.out.println(a);

    }

}
