import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr=new int[n];
    

        for(int i=0;i<arr.length;i++)
        {
             arr[i]=scn.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && i%2==0)
            {
            System.out.print(arr[i] +" ");
            }

        }
        
        int flag=0;
        for(int i=0;i<arr.length;i++)
    {
        
             if(flag<arr[i])
             {
                
                flag=arr[i];
                

            }
        }
        System.out.println(flag);
    }
}
    

