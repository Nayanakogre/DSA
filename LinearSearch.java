//program to find index of given number else it will print -1
//This is so called Linear Search

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int number=scn.nextInt();
        int index=LinearSearch.findElement(arr, number);
        System.out.println(index);

    }
                
            
        
            private static int findElement(int arr[],int number) {
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]==number)
                    {
                        System.out.println(i);
                    }
                }
                return -1;
            
            }
    
}
