import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
       String s = new String("Neha is hot");
       int length =getLength(s);
        System.out.println("the string is "+ length );
      /* String s2 = "Animesh is devil";

       //  Scanner input = new Scanner(System.in);
        //s = input.nextLine();
        System.out.println("the string is "+ s);
        System.out.println("the string is "+ s2);
        System.out.println("the length of th estring s is " + s.length());*/
    }

    public static int getLength(String s){
        int ctr =0;
        char ch[] = s.toCharArray();

        for(int i=0;i<ch.length;i++) {
            ctr++;
        }
        return ctr;
    }

}
