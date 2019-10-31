import java.util.Scanner;
/**
 * Interacts with the user, Accepts user criteria and arranges for search
 *
 * @author (Kurt Mueller)
 * @version (10/27/19)
 */
public class HouseListTester
{
    public static void main(String[] args){
        //set up the HouseList object
        HouseList avaliableHours = new HouseList("houses.txt");
        //instance variables
        int maxP, minP, maxA, minA, minB, maxB = 0;
        //set up scanner
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter your house criteria below to begin your search.");
        System.out.print("Minimum price: ");
        minP = stdin.nextInt();        
        System.out.print("Maximum price: ");
        maxP = stdin.nextInt();
        System.out.print("Minimum area: ");
        minA = stdin.nextInt();        
        System.out.print("Maximum area: ");
        maxA = stdin.nextInt();
        System.out.print("Minimum number of bathrooms: ");
        minB = stdin.nextInt();
        System.out.print("Maximum number of bathrooms: ");
        maxB = stdin.nextInt();

        //make new criteria object
        Criteria c = new Criteria(minP, maxP, minA, maxA, minB, maxB);
        //print out houses
        
        //-----------------------------------------------------------------------------------
        /**
         * test for criteria input working
         */
        // System.out.println("\nYou entered the following:");
        // System.out.println("MaxP: "+c.getMaximumPrice());
        // System.out.println("MinP: "+c.getMinimumPrice());
        // System.out.println("MaxA: "+c.getMaximumArea());
        // System.out.println("MinA: "+c.getMinimumArea());
        // System.out.println("MaxB: "+c.getMaximumNumberOfBedrooms());
        // System.out.println("MinB: "+c.getMinimumNumberOfBedrooms());
        //-----------------------------------------------------------------------------------
        
        System.out.println(avaliableHours.printHouses(c));
        
        
        
    }
}
