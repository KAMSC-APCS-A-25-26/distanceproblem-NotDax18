/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 *
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DistanceMultiple
{
    public static void main(String[] args)
    {
// Signature
        //System.out.println("Dax Robinson\nAPCS-A\nLewis Artithmetic 2.8\n");

// Create scanner
        Scanner scan = new Scanner(System.in);

// Prompt for number of runs
        System.out.print("Enter number of runs: ");
        int numRuns = scan.nextInt();
        scan.nextLine();
        System.out.println("");

        for(int i = 0; i < numRuns; i++)
        {
// Prompt for coordinates
            System.out.print("Enter coordinates: ");
            String input = scan.nextLine();

// Regex to match numbers inside parentheses
            Pattern pattern = Pattern.compile("\\(([^,]+),\\s*([^\\)]+)\\)\\s*\\(([^,]+),\\s*([^\\)]+)\\)");
            Matcher matcher = pattern.matcher(input);
            matcher.matches();

//
            double x1 = Double.parseDouble(matcher.group(1).trim());
            double y1 = Double.parseDouble(matcher.group(2).trim());
            double x2 = Double.parseDouble(matcher.group(3).trim());
            double y2 = Double.parseDouble(matcher.group(4).trim());

// Input points into the distance formula and output the distance
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("Total distance: " + distance);
            System.out.println("");
        }
    }
}
