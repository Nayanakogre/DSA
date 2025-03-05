import java.util.Scanner;
public class CommonFactorOf2Number 
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        printCommonFactors(n,m);
            }
        
            public static void printCommonFactors(int n, int m) {
                //int count=0;
                for(int i=n;i>=1;i--)
                {
                    if(n%i==0 && m%i==0)
                    {
                        System.out.print(i +"");
                        //when we wa t print first 2 number
                        //count++;
                        //if(count==2)
                        
                           // break;
                        //}
                        
                    }
                }
                
            }




    