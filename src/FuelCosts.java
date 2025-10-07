import java.util.Scanner;

public class FuelCosts
{
    public static void   main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0; // size of the tank in gallons
        double mpg = 0.0;      // miles per gallon
        double pricePerGal = 0.0;  // price per gallon
        double miles100Cost = 0.0; // cost to drive 100 miles
        double fullTankDistance = 0.0; // cost to fill the tank

        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter the tank size of the gas in gallons: ");
            if (in.hasNextDouble()) {
                tankSize = in.nextDouble();
                in.nextLine();  // Clear the newline from the buffer
                if (tankSize <= 0)
                {
                    System.out.println("Tank size must be greater than zero. Please try again.");
                } else
                {
                    done = true;
                }
            }
        else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        } while (!done);



    }

}
