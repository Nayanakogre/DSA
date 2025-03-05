import java.util.Scanner;

public class AppleOrange {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int X=scn.nextInt();
        int apple=scn.nextInt();
        int orange=scn.nextInt();
        if(apple+orange>=X)
        {
            System.out.println("yes he can buy both orange and apple");
        }
        else
        {
            System.out.println("no!!! he can buy both orange and apple");
        }
    }
    
}
