import java.util.Scanner;

public class UseOfElseIf {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n%3==0 && n%5==0)
        {
            System.out.println("Hello World");
        }
        if(n%3==0)
        {
            System.err.println("Hello");
        }
        else if(n%5==0)
        {
            System.out.println("World");
        }
         
    }
    
}
