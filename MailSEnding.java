import java.util.Scanner;

public class MailSEnding {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enetr value for 'a' either 0 or 1");
        int a=scn.nextInt();
        System.out.println("enter value for 'b' either 0 or 1");
        int b=scn.nextInt();
        if(a==0)
        {
            System.out.println("www.practise.in");
        }
        else if(b==0)
        {
            System.out.println("www.compitetion.in");
        }
        else
        {
            System.out.println("www.discuss.in");
        }
    }
    
}
