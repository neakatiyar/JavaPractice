import java.util.Scanner;

// boolean char  > int > long > float > double
public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Integer  value");
        while(sc.hasNext()){
            int s2= sc.nextInt();
            if(0 == s2){
                break;
            }
            System.out.println("Entered value is " +s2);
            System.out.println("Please enter Integer  value");
        }

    }


}
