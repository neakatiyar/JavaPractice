import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        String s = new String();
        System.out.println("Enter the String");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int ctr=0;
            for(int j=0;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    ctr++;
                }
            }
            System.out.println("occurence of word " + ch[i] +" is " + ctr);
            //ctr=0;
        }

    }
}
