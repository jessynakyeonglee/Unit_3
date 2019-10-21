import java.util.Scanner;

public class NumericComparisons {

    public static void main(String[]args) {

        System.out.print("Enter the number: ");
        Scanner NC = new Scanner(System.in);
        int num = NC.nextInt();
        System.out.println(isOdd(num));

    }
        public static boolean isOdd(int num1) { return num1 % 2 == 1 ;}
        public static boolean isEven(int num1) { return num1 % 2 == 0 ;}
        public static boolean isZero(int num1) { return num1 == 0 ;}
        public static boolean isPostive(int num1) { return num1 > 0 ;}
        public static boolean isNegative(int num1) { return num1 < 0 ;}
        public static boolean isNonnegative(int num1) { return num1 >= 0 ;}
        public static boolean isNonpositive(int num1) { return num1 <= 0 ;}



    }

