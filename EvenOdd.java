// first 10 even/odd number
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n*2;i++)
        {
           // if(i%2==0)
            if((i%2==0))
            {
            System.out.println(i);
            }
        }
    }
    
}
