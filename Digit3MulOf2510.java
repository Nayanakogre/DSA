import java.util.Scanner;

public class Digit3MulOf2510
{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        if((number>=100 && number<=999)
        && (number%2==0)
        && (number%5==0)
        && (number%2==0))
        {
            System.out.println("Yess!! this is three digit and multiple of 2,5,10");
        }
        else{
            System.out.println("No!! this is not three digit and multiple of 2,5,10");
        }
    }
}