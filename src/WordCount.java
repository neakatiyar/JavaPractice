import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String input = "";
        int ctr = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        input = s.nextLine();
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                ctr = ctr + 1;
            }

        }
        System.out.println("the count of the words " + (ctr+1));
    }
}
