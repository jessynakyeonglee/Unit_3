public class TrickyDice {
    public static void main(String[]args){

    }
    public static int regularRoll(){
        int num = (int)(Math.random()*6+1);
        return num;
    }
    public static int trickyRoll(){
        int num = (int)(Math.random()*100+1);
        if (num<=20)
            return 1;
        else if (num<=36)
            return 2;
        else if (num<=52)
            return 3;
        else if (num<=68)
            return 4;
        else if (num<=84)
            return 5;
        else
            return 6;

    }

}
