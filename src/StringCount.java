import java.util.Scanner;
public class StringCount {
    public static void main(String[] args) {

        String s = new String();
        int count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        s = input.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            count=count+1;
        }
        System.out.println("the count of the string is "+ count);
    }
}
