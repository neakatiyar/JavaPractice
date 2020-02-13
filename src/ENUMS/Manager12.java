package ENUMS;

public class Manager12 {
    enum Month{

        Jan(31),Feb(29),Mar(31),Apr(30),May(31);
        int days;
        Month(int days){
            this.days=days;
        }
        int getDays(){
            return days;
        }
    }

    public static void main(String[] args) {
        Month m1 = Month.Feb;
        System.out.println(m1);
        Month m2 = Month.Mar;
        System.out.println(m2);
        System.out.println(m2.getDays());
        System.out.println(m2.days);
    }
}
