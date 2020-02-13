package ENUMS;

public class Manager13 {
    enum P{
        CON1,CON2;
        static int i=10;
        int j=1;
    }

    public static void main(String[] args) {
        P p1= P.CON1;
        P p2= P.CON2;
        System.out.println(p1.i);
        System.out.println(p1.j);
        p1.i=20;
        p1.j=100;
        System.out.println(p2.i);
        System.out.println(p2.j);
        p2.i=30;
        p2.j=300;
        System.out.println(p1.i);
        System.out.println(p1.j);
        System.out.println(p2.i);
        System.out.println(p2.j);
    }
}
