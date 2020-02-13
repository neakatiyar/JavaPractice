class K {
    K(){
        System.out.println("K()");
    }
    {
        System.out.println("K-IIB");
    }
}
class L extends K{
    L(){
        System.out.println("L()");
    }
    {
        System.out.println("L-IIB");
    }
}

public class Manager{
    public static void main(String[] args) {
        K k1= new K();
        System.out.println("---------");
        L l1= new L();
        System.out.println("------");
    }
}
