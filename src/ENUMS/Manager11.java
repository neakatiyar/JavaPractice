package ENUMS;

public class Manager11 {
    enum Test{
        G(),S("String"),T(1909);
        Test(){
            System.out.println("default consturtcor");
        }
        Test(String s1){
            System.out.println("parameterised ");
        }
        Test(int i){
            System.out.println("number");
        }
    }

    public static void main(String[] args) {
        Test t1=Test.G;
        Test t2 =Test.T;
        Test t3 = Test.S;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
