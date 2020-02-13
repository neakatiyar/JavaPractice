public class Manager7 {
    static{
        System.out.println("Manager7-sib");
    }

    public static void main(String[] args) {
        System.out.println("Manager-7 main begins");
        Manager5.test();
        System.out.println("---------");
        Manager4.main(args);
        System.out.println("Manager-7 ends");
    }
}
