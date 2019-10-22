import java.util.Scanner;

public class NumericComparisons {

    public static void main(String[]args) {

        System.out.println("Enter the number: ");
        System.out.println("Enter another number: ");
        Scanner NC = new Scanner(System.in);
        int num = NC.nextInt();
        int num2 = NC.nextInt();
        System.out.println(isOdd(num));
        System.out.println(isEven(num));
        System.out.println(isZero(num));
        System.out.println(isPostive(num));
        System.out.println(isNegative(num));
        System.out.println(isNonnegative(num));
        System.out.println(isNonpositive(num));
        System.out.println(isFactor(num,num2));
        System.out.println(isMultiple(num,num2));

    }
        public static boolean isOdd(int num1) { return num1 % 2 == 1 ;}
        public static boolean isEven(int num1) { return num1 % 2 == 0 ;}
        public static boolean isZero(int num1) { return num1 == 0 ;}
        public static boolean isPostive(int num1) { return num1 > 0 ;}
        public static boolean isNegative(int num1) { return num1 < 0 ;}
        public static boolean isNonnegative(int num1) { return num1 >= 0 ;}
        public static boolean isNonpositive(int num1) { return num1 <= 0 ;}
        public static boolean isFactor(int num1,int num2) { return num2%num1 == 0 ;}
        public static boolean isMultiple(int num1,int num2) { return num1%num2 == 0 ;}




    }

