import java.util.Scanner;

public class VowelPalindrome {
    public static void main(String[] args) {
        String s = "";
        String s2 = "";
        String output = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String " );
        s = input.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                    ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                output = output + ch[i];
            }
        }
        char[] ch2 = output.toCharArray();

        for (int i = ch2.length - 1; i >= 0; i--) {
            s2 = s2 + ch2[i];
        }
        System.out.println("the string is " + s2);
        if (s2.equalsIgnoreCase(output)) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
