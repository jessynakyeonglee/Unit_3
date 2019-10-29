public class DiscriminantAndRoots {
      public static String DARmethod(int a, int b, int c){
        if (Math.pow(b,2)-4*a*c>0)
            return a+"x^2 + "+b+"x + "+c+" has 2 real roots";
        else if (Math.pow(b,2)-4*a*c==0)
            return a+"x^2 + "+b+"x + "+c+" has 1 real root";
        else
            return a + "x^2 + " + b + "x + " + c + " has 2 imaginary roots";

    }

    public static void main(String[]args) {
        System.out.print(DARmethod(1,4,4));
        System.out.print(DARmethod(1,2,3));
        System.out.print(DARmethod(1,5,6));
    }
}
