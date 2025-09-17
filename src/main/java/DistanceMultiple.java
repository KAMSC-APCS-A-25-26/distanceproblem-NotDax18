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


public class DistanceMultiple {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dax Robinson\nAPCS-A\nLewis 2.8 Distance Program");
        System.out.println();

        // Prompt for the number of runs
        System.out.print("Enter number of runs: ");
        int numRuns = scan.nextInt();
        System.out.println();
        scan.nextLine();

        for (int i = 1; i <= numRuns; i++)
        {
            // Prompt for (x1,y1)
            System.out.print("Enter (x1,y1): ");
            String point = scan.nextLine().trim();
            point = point.replace("(","").replace(")","");
            String[] coordinate = point.split(",");
            double x1 = Double.parseDouble(coordinate[0].trim());
            double y1 = Double.parseDouble(coordinate[1].trim());

            // Prompt for (x2,y2)
            System.out.print("Enter (x2,y2): ");
            String point2 = scan.nextLine().trim();
            point2 = point2.replace("(","").replace(")","");
            String[] coordanite2 = point2.split(",");
            double x2 = Double.parseDouble(coordanite2[0].trim());
            double y2 = Double.parseDouble(coordanite2[1].trim());

            // Calculate the distance
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // Print the distance
            System.out.println("Distance: " + distance);
            System.out.println();
        }
    }

}