public class ShareDigit {
    public static boolean SDmethod(int num1,int num2){
        if(num1/10==num2/10)
            return true;
            if(num1/10==num2%10)
                return true;
                if(num1%10==num2/10)
                return true;
                if(num1%10==num2%10)
                    return true;
                else
                    return false;
    }
    public static void main(String[]args){
        System.out.println(SDmethod(12,23));
        System.out.println(SDmethod(12,43));
        System.out.print(SDmethod(12,44));
    }
}
