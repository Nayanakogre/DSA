//The program to find a frequency of number in an array
//frequency means how many times the given number is repeated in the array.

import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int Frequency=scn.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==Frequency)
            {
                count++;
            }
        }
        System.out.println("Frequency Of "+Frequency +" is : "+count);
    }
    
}
