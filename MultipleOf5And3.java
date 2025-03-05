import java.util.Scanner;

public class MultipleOf5And3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        if(number%3==0 && number%5==0)
        {
            System.out.println("Yes this number is multple of 5 and 3");
        }
        else{
            System.out.println("This not multiple of 5 and 3");
        }
    }
    
}
