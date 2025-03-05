import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        
        int remainder=number%2;
        if(remainder==0)
        {
            System.out.println("Its a even number");
            System.out.println("And remainder is :"+remainder);

            

        }
        else
        {
            
            System.out.println("Its a odd number");
            System.out.println("And remainder is :"+remainder);
        }
    }
    
}
