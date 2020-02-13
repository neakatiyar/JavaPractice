package polypack;

public class N {
    final int i=10;
}
class Man{
    public static void main(String[] args) {
        N obj=new N();
        System.out.println(obj.i);
        //obj.i=20;
        System.out.println(obj.i);
        P obj1= new P();
        System.out.println(obj1.i);
    }
}
class O{
    final int x=10;
    void test(){
        //x=10;
    }
}

class P{
    final int i=0;
}

class Q{
    final int i;
    Q(){
        i=10;
    }
}

class R{
    final int i;
    R(){
        i=10;
    }
    R(int j){
        i=20;
    }
}

class S{
    final int i;
    S(){
        i=10;
    }
    S(int i){
        this.i=20;
    }
}

class T{
    final int i;
    T(){
        i=20;
    }
    T(String s1){
        this();
    }
}

class U{
    final int i;
   {
        i=10;
    }

}

class W{
    static final int i=10;

    public static void main(String[] args) {
        //i=20;
    }
}

class Y{
    static final int i;
    static{
        i=20;
    }
}

class Z{
    static final int i=0;
    static{
        //i=0;
    }
}

interface A{
    int i=0;
}

interface B{
    String s1=null;
    int j=10;
}

