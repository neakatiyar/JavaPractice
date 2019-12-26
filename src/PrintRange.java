public class PrintRange {
    public static void main(String[] args) {
        getRange(100,500);
    }
    public static int getRange(int min, int max){
        int i;
        for(i=min;i<=max;i++){

            System.out.println(i);
        }
        return i;
    }
}
