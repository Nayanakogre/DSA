public class PatternOfG
{
    public static void main(String args[])
    {
        int n=15;
        int i;
        int j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 && j>0 && j!=n-1
                ||j==0 && i>0 && i!=n-1
                ||i==n-1 && j<n/2 && j>0
                ||i==3*n/4 && j>n/2 && j<n-1 
                 ||j==n/2 && i>3*n/4 && i<n-1
                 || j==n-1 && i>3*n/4
                 ||j==n-1 && i>0 && i<n/4)
                {
                    System.out.print("  *");
                }
                else{
                    System.out.print("   ");
                }


                }
                
            for(j=0;j<n;j++)
            {
                if(i==0 && j>0 && j!=n-1
                ||j==0 && i>0 && i!=n-1
                ||i==n-1 && j<n/2 && j>0
                ||i==3*n/4 && j>n/2 && j<n-1 
                 ||j==n/2 && i>3*n/4 && i<n-1
                 || j==n-1 && i>3*n/4
                 ||j==n-1 && i>0 && i<n/4)
                {
                    System.out.print("  *");
                }
                else{
                    System.out.print("   ");
                }
                 }
                System.out.println();
            }
        }
    }

