import java.util.Scanner;

public class CovertingCelciusToFharnheat {
    public static  void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enetr the celcius");
        double celcius=scn.nextDouble();
        double farhnheat=(celcius*9/5)+32;
        System.out.println("The Farhnheat is :"+farhnheat);
        
    }
    
}
