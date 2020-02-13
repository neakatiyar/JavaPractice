package ENUMS;

public class Manager14 {
    enum R{
        Con1,Con2,Con3{
            void test(){
                System.out.println("enum test");
            }},Con4;
        void test(){
            System.out.println("test");
        }
    }

    public static void main(String[] args) {
        R r1= R.Con1;
        R r2=R.Con3;
        R r3= R.Con4;
        r1.test();
        r2.test();
        r3.test();
    }
}
