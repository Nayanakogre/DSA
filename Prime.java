import java.util.Scanner;

public class Prime
{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n<=1)
        {
            System.out.println("Not a prime number");
        }
        else if(n/1==n && n/n==1)
        {
            System.out.println("Yes this is a prime number");
        }
        else{
            System.out.println("Given number is not a prime number");
        }
    }
}