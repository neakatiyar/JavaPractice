package ENUMS;

public class Manager7 {
    enum CC{
       A,B,C,D;
    }
    public static void main(String[] args) {
        CC s1= CC.B;
        switch (s1){
            case A:
                System.out.println("in a");
                break;
            case B:
                System.out.println("in b");
                break;
            case C:
                System.out.println("in c");
                break;
            case D:
                System.out.println("in d");
                break;
        }


    }
}
