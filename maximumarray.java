import java.util.Scanner;
public class maximumarray {

    

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
            int max=maxarray(arr);
            System.out.println(max);
            int min=minarray(arr);
            System.out.println(min);
        
        
    }
    public static int maxarray(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int minarray(int arr[])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]<min)
        {
            min=arr[i];
        }
    }
    return min;
    }
}
    