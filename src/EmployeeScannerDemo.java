import java.util.Scanner;

public class EmployeeScannerDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the name");
        String name = sc.nextLine();
        System.out.println("Enter the gender");
        char gender = sc.next().charAt(0);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the mobilenum");
        long mobileNumb = sc.nextLong();
        System.out.println("Enter the gpa");
        //double gpa = sc.nextDouble();
        sc.nextLine();
        double gpa = Double.parseDouble(sc.nextLine());
        //sc.nextLine();
        System.out.println("ENter the fathers name");
        String fathersName = sc.nextLine();

        System.out.println("ENter the mothers name");
        String mName = sc.nextLine();

        System.out.println(" name" + name);
        System.out.println(" gender" + gender);
        System.out.println(" age" + age);
        System.out.println(" mobilenumb" + mobileNumb);
        System.out.println("gpa" + gpa);
        System.out.println("fathersname" + fathersName) ;
        System.out.println("mName" + mName);
    }
}
