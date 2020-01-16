public class PrimeNumber {
    public static void main(String[] args) {
        // boolean value=isPrime(3);
        // System.out.println("it is " +value);
       printPrime(1, 100);

    }

    //check the number is prime
    public static boolean isPrime(int num) {
        boolean numberPrimem = true;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                System.out.println("The number is not  prime");
                numberPrimem = false;
            }
        }
        return numberPrimem;
    }

    //print the prime number between the range

    public static void printPrime(int min, int max) {
      for( int i=min;i<max;i++){
          printIfNumberPrime(i);
      }
    }

    public static void  printIfNumberPrime(int number){
        boolean numberPrime = true;
        for(int i = 2 ; i <number ; i++){
            if(number % i == 0){
                numberPrime = false;
                break;
            }
        }
        if(numberPrime){
            System.out.println("number is prime" + number);
        }
    }
}
