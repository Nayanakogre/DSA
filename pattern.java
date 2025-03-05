import java.util.Scanner;

public class pattern {


    // the thing is to remember matrix and indexes i,j,i=n-1 , j=n-1 ,i=n/2,j=n/2
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the star count");
        int n=scn.nextInt();
        int i;
        int j;
        // for letter 0
        for( i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                if( i==0  && j!=0 && j!=n-1
                ||j==0 && i!=0 && i!=n-1
                ||j==n-1 && i>0 && i!=n-1
                ||i==n-1 && j>0 && j!=n-1) 
                
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");


        // for letter A
        for( i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                if( i==0  && j!=0 && j!=n-1
                ||j==0 && i!=0 
                ||j==n-1 && i>0 
                ||i==n/2)
                
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");

        // for letter B
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 && j>0 && j!=n-1
                ||i==n-1 && j>0 && j!=n-1
                ||j==0 && i>0 && i!=n-1
                ||j==n-1 && i>0 && i!=n-1
                || i==n/2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
      System.out.println("-------------------------------------------");
    

    //   for letter C
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i==0 && j>0 && j!=n-1
            ||j==0 && i>0 && i!=n-1
            ||i==n-1 && j>0 && j!=n-1 )
            {
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println("-----------------------------------------------");

    // for letter D
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i==0 && j!=n-1
            ||i==n-1 && j!=n-1
            ||j==0
            ||j==n-1 && i>0 && i!=n-1)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println("-------------------------------------------------");

    // for letter E
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i==0
            ||j==0
            ||i==n-1
            ||i==n/2)
            {
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println("-------------------------------------");

    // for letter F
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i==0
            ||j==0
            
            ||i==n/2)
            {
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println("-------------------------------------");

    // for letter H
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(j==0
            ||j==n-1
            ||i==n/2
            )
            {
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println("-------------------------------------");

    // for letter I
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(
            i==0
            ||i==n-1
            ||j==n/2)
            {
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println("-------------------------------------");

    // for letter J
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if (i == 0 
            || j == n / 2 
            || (i == n - 1 && j <= j/2))
            {
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println("-------------------------------------");
}
}








