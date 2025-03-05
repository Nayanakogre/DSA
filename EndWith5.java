import java.util.Scanner;

public class EndWith5 {

        public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n%10==5)
        {
            System.out.println("The is ended with 5");
        }
        else{
            System.out.println("The is not ended with 5");
        }
    }
}
