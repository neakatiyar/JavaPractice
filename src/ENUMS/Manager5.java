package ENUMS;

public class Manager5 {
    enum B{
        CON1,CON2,CON3,CON4;
    }

    public static void main(String[] args) {
        B b[]=B.values();
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    }

