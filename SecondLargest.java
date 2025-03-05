import java.util.Scanner;
public class SecondLargest {
public static void main(String[] args)
{
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the value for n:");
    int n=scn.nextInt();
    System.out.println("Enter the array elements");
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=scn.nextInt();
    }
    int firstlarge=0;
    int secondlarge=0;
    for(int i=0;i<arr.length;i++)
    {
        
            if(arr[i]>firstlarge)
            {
              secondlarge=firstlarge;
              firstlarge=arr[i];

            }
            else{
                if(arr[i]>secondlarge)
                {
                    secondlarge=arr[i];
                }
            }
        }
        System.out.println("The Second largest number is :"+secondlarge);
}

    
}
