import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double radius=scn.nextInt();
        double pie=3.142;
        double area=pie*radius*radius;
        System.out.println("The Area Of a Circle is :"+area);

    }
    
}
