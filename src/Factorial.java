public class Factorial {


    public static void main(String[] args) { System.out.println(factOf(7));
    }

    public static int factOf(int num) {
        int sum = 1;
        for (int i = num; i >= 1; i--) {
            sum = sum * i;
        }
        return sum;
    }
}
