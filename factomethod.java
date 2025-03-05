import java.util.Scanner;

public class factomethod {

    private static int facto(int n){
        int res=1;
        for(int i=1;i<=n;i++){
        res=res*i;
        }
        return res;
    }
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number to calculate factorial number");
    int n=scan.nextInt();
    System.out.println("the factorial of " +n +" is "+facto(n));
}
    
}
