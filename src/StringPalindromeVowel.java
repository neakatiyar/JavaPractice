import java.util.Scanner;

public class StringPalindromeVowel {
    public static void main(String[] args) {
        String s = "";
        String s2 = "";
        String output = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        s = input.nextLine(); //nitin
        char[] ch = s.toCharArray();
        for (int i = 0; i <= ch.length -1; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'
                    || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {

            } else {
                s2 = s2 + ch[i];
            }
        }
        char ch2[] = s2.toCharArray();
        for (int i = ch2.length - 1; i >= 0; i--) {
            output = output + ch2[i];
        }
        if (output.equalsIgnoreCase(s2)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
