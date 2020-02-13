package polypack;

public class Manager4 {
    static{
        System.out.println("manager4-sib");
    }

    public static void main(String[] args) {
        System.out.println("manager4-main");
    }
}
class Manager5 extends Manager4{
    static{
        System.out.println("manager5-sib");
    }
}
class Manager6{
    static{
        System.out.println("manager-6-sib");
    }

    public static void main(String[] args) {
        System.out.println("mainager6-main");
        Manager4.main(args);
        System.out.println("maianger6-main");
    }
}
class Manager7{
    static {
        System.out.println("manager7-sib");
    }
    public static void main(String[] args) {
        System.out.println("manager7-main");
        Manager5.main(args);
        System.out.println("-------");
        Manager4.main(args);
        System.out.println("-----------");
    }
}
