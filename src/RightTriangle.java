public class RightTriangle {
    public static boolean isString(int a, int b, int c){
        return (a+b>c&&b+c>a&&c+a>b);
    }
    public static boolean isRight(int a, int b, int c){
        return (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)||Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)||Math.pow(c,2)+Math.pow(a,2)==Math.pow(b,2));
    }
}





