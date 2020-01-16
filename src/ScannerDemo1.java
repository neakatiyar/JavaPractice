import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to add ");
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                sum = sum + n;
            }
        }
        System.out.println("the sum of the numbers are " + sum);
    }
}
