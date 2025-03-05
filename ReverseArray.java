import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int[] array=new int[n];

        for(int i=0;i<n;i++)
        {
            array[i]=scn.nextInt();
        }
        int i=0;
        int j=n-1;
        while (i<j) {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
            
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(array[k] +" ");
        }

    }
}
