import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        String s = new String();
        String revStr = "";
        System.out.println("Enter the String");
        Scanner input = new Scanner(System.in);
        s= input.nextLine();
        char ch[] = s.toCharArray();
        for (int i =ch.length-1; i>=0;i--){

            revStr= revStr+ch[i];
        }
        if(s.equalsIgnoreCase( revStr)){
            System.out.println("The String is Palindrome");
        }
        else{
            System.out.println("the String is not palindrome");
        }

    }


}
