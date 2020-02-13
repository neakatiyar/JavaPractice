class L1{
    static{
        System.out.println("L-SIB");
    }
    L1(){
        System.out.println("L1()");
    }
    {
        System.out.println("L_IIB");
    }
}
class M {
    static{
        System.out.println("M-SIB");
    }
    M(){
        System.out.println("M()");
    }
    {
        System.out.println("M-IIB");
    }
    M(int i){
        L2 obj= new L2();
        System.out.println("M(int)");
    }

    public static void main(String[] args) {
        System.out.println("main begins");
        M m1 = new M();
        System.out.println("-----");
        M m2= new M(90);
        System.out.println("---------");
        System.out.println("main ends");
    }
}
