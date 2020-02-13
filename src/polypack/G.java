package polypack;

public class G {
    public static void main(String[] args) {
        int i=0;
        final int j=1;
        System.out.println(i);
        System.out.println(j);
        i=10;
        //j=1;
        System.out.println(i);
        System.out.println(j);
    }
}

class H{
    public static void main(String[] args) {
        final int i=10;
        //i++;
        System.out.println(i);
    }
}

class I{
    public static void main(String[] args) {
        final int[] x= new int[2];
        x[0]=0;
        x[1]=1;
        //x = new int[3];
        System.out.println(x[0]);
        System.out.println(x[1]);
    }
}
class J
{
    int i;

    public static void main(String[] args) {
        {
            final J j1= new J();
            j1.i=20;
            System.out.println("done");
        }
    }
}

class HH{
    int i;

    public static void main(String[] args) {
        final HH h1= new HH();
        //h1 = new HH();
        //h1= null;
        System.out.println("done");
    }
}

class K{
    K(int i,final int j){
        i=20;
        //j=20;
    }
}

abstract class L{
    public static void main(String[] args) {
        System.out.println("done");
    }
}

abstract class M{
    abstract void test1();
}


