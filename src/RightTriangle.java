import java.util.Scanner;

public class RightTriangle {
    public static boolean isTriangle(int a, int b, int c){
        return (a+b>c&&b+c>a&&c+a>b);
    }
    public static boolean isRight(int a, int b, int c){
        return (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)||Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)||Math.pow(c,2)+Math.pow(a,2)==Math.pow(b,2));
    }
    public static void main(String[]args){
        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle: ");
        int a = triangle.nextInt();
        int b = triangle.nextInt();
        int c = triangle.nextInt();
        if (isTriangle(a,b,c)&&isRight(a,b,c)) {
            System.out.println("The side lengths of " + a + ", " + b + ", and " + c + " form a right triangle.");
        }
            else if (isTriangle(a,b,c)||isRight(a,b,c)){
                System.out.println("The side lengths of " + a + ", " + b + ", and " + c + " do not form a triangle, but it is not a right triangle");
        }
            else if (!isTriangle(a,b,c))
                System.out.println("The side lengths of " + a + ", " + b + ", and " + c + " do not form a triangle.");

    }
}





