import java.util.Scanner;

public class Unicode {
    public static void main(String args[])
    {
      


        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        char nextChar = (char) (ch + 1);
        char prevChar = (char) (ch - 1);
        
        System.out.println("Next character: " + nextChar);
        System.out.println("Previous character: " + prevChar);
        
        scanner.close();
    }
}

    