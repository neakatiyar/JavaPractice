public class ArrayPractice {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 525};
        ArrayPractice.add(arr);
        ArrayPractice.evenadd(arr);
        int index = ArrayPractice.findElement(arr, 10);
        System.out.println(index);
        int index2 = ArrayPractice.findElement(arr, 100);
        System.out.println(index2);
        int index3= ArrayPractice.maxarr(arr);
        System.out.println(index3);
        int index4= ArrayPractice.minarr(arr , 2);
        System.out.println(index4);

    }

    public static int add(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }
        System.out.println("total of the array is " + sum);

        return sum;

    }

    public static int evenadd(int arr[]) {
        int evensum = 0;
        int s = 0;
        // 1,2,3,4,5,6,7,8,9,10,11
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                s = s + arr[i];
            }

            //evensum=evensum+arr[i+2];
        }
        System.out.println("total of the array is " + s);
        return s;
    }

    //if the element is present in the array then print the location of the element
    //int arr[]={1,2,3,4,5,6,7,8,9,10,12,525};
    public static int findElement(int arr[], int eleToFind) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {

            if (eleToFind == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    //find the max num in array in this case ans is 525
    //int arr[]={1,2,3,4,5,6,7,8,9,10,12,525};
    public static int maxarr(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }
    //find the min num in array in this case ans is 1
    //int arr[]={1,2,3,4,5,6,7,8,9,10,12,525};
    public static int minarr(int arr[] , int n) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

}
