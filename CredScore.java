import java.util.Scanner;

public class CredScore {
    public static void main(String args[])

    {
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        if(number<=750)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
    
}
