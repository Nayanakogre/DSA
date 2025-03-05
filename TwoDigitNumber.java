import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        if((number>=10 && number<=99)
        || (number>=-99 && number<=-10))
        {
            System.out.println("This number is Two digit number");
        }
        else{
            System.err.println("This number is not two digit number");
        }
    }
}