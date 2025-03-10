// Genes
// People in Chefland have three different eye colors, namely brown, blue, and green. green is the rarest of the eye colors whereas brown is most common.

// The eye color of the child of two people is most likely to be the most common eye color between them.

// You are given two characters denoting the eye colors of two people in Chefland. The character R denotes bRown color, B denotes Blue color, and G denotes Green color.

// Determine the most likely eye color of their child. (Print R, B or G denoting bRown, Blue or Green respectively).

// Please see the sample test cases below for explained examples.

// Input Format
// The first (and only) line of input contains two space-separated characters, the eye colors of the parents.
// Output Format
// Print a single character denoting the most likely eye color of the child. (Print R, B or G denoting brown, blue or green respectively).

// Constraints
// The input contains two space-separated characters
// Each character in the input is one among {R, B, G}.
// Subtasks
// Sample 1:
// Input
// Output
// R B
// R
// Explanation:
// The two people have brown and blue eyes and brown is the most common. Therefore, their child will most likely have brown eyes.

// Sample 2:
// Input
// Output
// B B
// B
// Explanation:
// Both parents have blue eyes, therefore their child will most likely have blue eyes

// Sample 3:
// Input
// Output
// G B
// B
// Explanation:
// The parents have green and blue eyes, out of which blue is more common than green, therefore the child will most likely have blue eyes.

import java.util.Scanner;

public class EyeColor {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter father Eye Color");
        char father=scn.next().charAt(0);
        System.out.println("Enter Mother Eye Color");
        char mother=scn.next().charAt(0);
        if(father=='R'|| mother=='R')
        {
            System.out.println("Child Eye Color :Brown");
        }
        else if(father=='G' && mother=='G')
        {
          System.out.println("Eye color of Child :Green");  
        }
        else if(father=='B' || mother=='G')
        {
            System.out.println("Child Eye Color :Blue");
        }
        else if (father=='G' || mother=='B') {
            System.out.println("Child Eye Color :Blue");
        }
        
    }
    
}
