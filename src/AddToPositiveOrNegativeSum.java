import java.util.Scanner;

public class AddToPositiveOrNegativeSum {
    public static void main(String[]args) {

        Scanner J = new Scanner(System.in);
        int psum = 0;
        int nsum = 0;
        for (int i = 1; i <= 10; i++)        {
            System.out.println("Enter a number:");
            int num = J.nextInt();
            if (num>0){
                psum+= num;
            }
            if (num<0){
                nsum+= num;
            }
        }
        System.out.println("The sum of the positive numbers is "+psum);
        System.out.println("The sum of the negative numbers is "+nsum);
    }





}
