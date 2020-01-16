public class SumofDigits {

    public static void main(String[] args) {
        getSumOfDigits(123);
    }

    public static void getSumOfDigits(int num) {
        int k = num;
        int temp = 0, j = 0;
        while (k % 10 != 0) {

            j = k % 10;
            temp = temp + j;
            k = k / 10;
        }
        System.out.println("the sum of the  digits is " + temp);
    }
}
