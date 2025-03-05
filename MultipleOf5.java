import java.util.Scanner;

public class MultipleOf5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        if(number%5==0)
        {
            System.err.println("YES!! Multiple of 5");
        }
        else{
            System.out.println("No !! Its Not not multiple of 5");
        }
    }
    
}
