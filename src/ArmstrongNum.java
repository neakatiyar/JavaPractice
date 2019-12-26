public class ArmstrongNum {

    public static void main(String[] args) {

        ArmstrongNum armstro = new ArmstrongNum();
        int value=getArmstrong(1,1000);

    }

    //153
    public static boolean isNumArmstrng(int num) {
        int digits = 0, digitSum = 0;
        int tempNumber = num;
        int len = ArmstrongNum.length(num);

        if (tempNumber != 0) {
            while (tempNumber != 0) {
                digits = tempNumber % 10;
                tempNumber = tempNumber / 10;
                digitSum = digitSum + power(digits, len);
            }
        }
        if (digitSum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static int length(int num) {
        int length = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            length++;
        }
        return length;
    }

    //function to calculate the power of the num
    public static int power(int num, int pow) {
        int temp = num;
        while (pow != 1) {
            temp = temp * num;
            pow--;
        }
        return temp;
    }
//  print the armstrong number  within the range
    public static int  getArmstrong(int min, int max) {
        int i=0;
        boolean  getValue;
        for ( i = min; i < max; i++) {
            getValue = isNumArmstrng(i);
            if(getValue)
            {
                System.out.println(i + " is armstrong");
            }
            else{
                System.out.println(i + " is not armstrong");
            }
        }
        return i;
    }
}

