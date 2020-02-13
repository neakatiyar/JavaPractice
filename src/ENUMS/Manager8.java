package ENUMS;
enum D{
    CON1,CON2,CON3,CON4;
}

public class Manager8 {
    public static void main(String[] args) {
        D d1= D.valueOf("CON4");
        D d2= D.valueOf("CON2");
        System.out.println(d1 +" " +d2);
    }
}
