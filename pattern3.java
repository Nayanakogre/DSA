public class pattern3 {
    public static void main(String args[])
    {
        int n=9;
        int i;
        int j;

        for( i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j==n/2 || i-j==n/2 || j-i==n/2 || i+j==n+n/2-1 )
                {
                    System.out.print("  *");
                }
                else{
                    System.out.print("  .");
                }
            }
            System.out.println();
        }
    }
    
}
