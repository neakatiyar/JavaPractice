package ENUMS;

public class Manager9 {
    enum E{
        c1,c2,c3,c4;
        E(){
            System.out.println("constructor E()");
        }
    }

    public static void main(String[] args) {
        E e1= E.c1;
        E e2= E.c4;
        System.out.println(e1+" " +e2);
    }
}
