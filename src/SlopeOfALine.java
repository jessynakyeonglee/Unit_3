import java.util.Scanner;

public class SlopeOfALine {
    public static void main(String[] args) {
        System.out.println("Enter x1: ");
        System.out.println("Enter y1: ");
        System.out.println("Enter x2: ");
        System.out.println("Enter y2: ");
        Scanner SOL = new Scanner(System.in);
        int X1 = SOL.nextInt();
        int Y1 = SOL.nextInt();
        int X2 = SOL.nextInt();
        int Y2 = SOL.nextInt();
        System.out.println(slope(X1, Y1, X2, Y2));
    }

    public static String slope(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return "The line is a vertical line and the slope is undefined.";
        } else {
            return "The line defined by the points (" + x1 + "," + x2 + ") and (" + y1 + "," + y2 + ") has a slope of " + (double)(y2 - y1) / (x2 - x1);


        }
    }
}