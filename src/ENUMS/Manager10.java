package ENUMS;

public class Manager10 {
    enum D{
        D1(90),D2(20),D3(10);
        D(int i){
            System.out.println("D(int)");
        }
    }

    public static void main(String[] args) {
        D d1=D.D2;
        System.out.println(d1);
    }
}
