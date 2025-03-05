import java.util.Scanner;

public class iterativeFactorial {
    public static void main(String[] args) {

        Scanner facto=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=facto.nextInt();
        int res=1;
        
        for(int i=1;i<=number;i++)
        {
            res*=i;
         
        }
        System.out.println("the factorial of "+number +" "+"is" +" "+res);

        
    }
    
}
