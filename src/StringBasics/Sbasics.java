package StringBasics;
import java.lang.String;

public class Sbasics {
    public static void main(String[] args) {
        String s1= "rst";
        String s2 ="rst";
        String s3 = new String("rst");
        String s4 = "ne";
        String s5 ="ha";
        String s6="neha";
        String s7= s4+s5;
        String s8 = "ne"+"ha";
        String s9 = s4+"ha";
        System.out.println(s9==s8);
        System.out.println(s7);
        System.out.println(s6==s7);
        System.out.println(s6==s8);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        s2= s2+"rst";
        System.out.println(s2);
    }
}
