package ENUMS;

class Manager6 {
    enum B {
        CON1,CON2,CON3;
    }

    public static void main(String[] args) {
        B b1= B.CON1;
        System.out.println(b1.ordinal());
        B b2= B.CON3;
        System.out.println(b2.ordinal());
    }
}
