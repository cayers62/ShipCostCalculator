import javax.swing.*;
import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Psuedocode for the program
        // class Shipping Rates
        //       main{}//Start
        //Variable Declarations
        //num price = 0
        //ship = num * .02
        //total = ship + num
        //Input of the cost
        //output "What is the total purchase price: "
        //input = price
        //if num >= 100 then
        //output "Your total cost including shipping is: ' + num
        //output  "Your total cost of shipping is: 0"
        //else
        //output "Your total cost including shipping is: " + total
        //output "Your total cost of shipping is: " + ship
        //end if
        //return{}//End Stop
        //end class

        //Declaration of Variables
        double price = 0;
        final double SHIP_RATE = .02 * price;
        final double TOTAL_COST = SHIP_RATE + price;
        String trash = "";

        //User input statements

        System.out.print("Enter the price of an item: ");

        if (in.hasNextDouble())
        {

            //Safe to read in double
            price = in.nextDouble();
            in.nextLine(); //Clearing new line from buffer


        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your input is invalid try again." + trash);
        }
        if(in.hasNextDouble());
        {
            final boolean b = price >= 100;
           System.out.println("Your ship rate is 0 and your totat cost " + price);

         System.out.println("Your shipping rate is $"+SHIP_RATE+ "your total cost is $"+ TOTAL_COST);


        }





    }
}








