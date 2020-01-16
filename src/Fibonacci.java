public class Fibonacci {
    public static void main(String[] args) {
       int x= getfib(3);
        System.out.println(x);
    }

    /*public static int getfib(int num) {
        int a = 0, b = 1, c = 0;
        if (num == 0) {
            return a;
        }
        for (int i = 1; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }*/
    public static int getfib(int num) {
      int  f[]=new int [num+2];
       f[0]=0;
       f[1]=1;
       for(int i=2;i<=num;i++){
           f[i]=f[i-1]+f[i-2];
       }
 return f[num];
    }
}
