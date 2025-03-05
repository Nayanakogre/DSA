//program to find the factors and total count of factors and checking given number is prime or not


import java.util.Scanner;
public class FactorsandPrime {
    public static void main(String argss[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                //this will print all factors for a given number
                //System.out.println(i);
                count++;
            }
        }
        //This will print the total number factors for given number
        //System.out.println(count);

        //and this for checking given number is prime or not
        //condition for prime is the number should divide by and itself
        //then count is only 2
        if(count==2)
        {
    System.out.println("This is a prime number");
        }
        else{
            System.out.println("This is not a prime number");
        }
    }
    
}
