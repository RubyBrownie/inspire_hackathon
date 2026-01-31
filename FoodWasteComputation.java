import java.util.Scanner;

/**
 * 31 Jan 2026
 * Gavin & Patrick
 * 
 * Food Waste Computation, a program where input is calculated to
 * show the output and how much waste is produced
 */
public class FoodWasteComputation {
        /**
         * Scanner input to prompt users
         */
        public static Scanner input = new Scanner(System.in);

        public static int footTraffic; // number of customers
        public static double portionaSize; // weight of food per customer
        public static double foodPrepared; // food prepared in kg
        public static double foodWasted; // wasted food in kg
        public static double costPerKg; // cost per kg of that food
        public static double moneyLost; // food lost in money

        //gets the weight of the food as purchased
        public static void getFoodWeight(){

            System.out.println("Enter the number of customers: ");
            footTraffic = input.nextInt();

            System.out.println("Enter the weight of the food in kg per customer: ");
            portionaSize = input.nextDouble();

            foodPrepared = footTraffic * portionaSize;
        }

        //sums up the total food waste lost
        public static void computeTotalWaste(){
            System.out.println("Enter wasted food amount in kg:");
            foodWasted = input.nextDouble();
        }

        //converts the wasted weight into its corresponding price
        public static void convertWeightToPrice(){
            System.out.println("Enter cost per kg:");
            costPerKg = input.nextDouble();

            moneyLost = foodWasted * costPerKg;
        }

        // output the reports
        public static void formatting(){
            double wastePercent = 0;

            if (foodPrepared > 0) {
                wastePercent = (foodWasted / foodPrepared) * 100;
            }

            System.out.println("\n--- Food Waste Report ---");

            System.out.printf("Food prepared: %.2f kg\n", foodPrepared);
            System.out.printf("Food wasted: %.2f kg\n", foodWasted);
            System.out.printf("Waste percent: %.1f%%\n", wastePercent);
            System.out.printf("Money lost: $%.2f\n", moneyLost);

            System.out.println("--------------------------\n");

        }

    public static void main(String[] args){
        //While loop to add more food items in.
        while(true){
            getFoodWeight();
            computeTotalWaste();
            convertWeightToPrice();
            formatting();

            System.out.printf("Add another food item? (y/n): ");
            String again = input.next();

            if (again.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }

        System.out.println("Done.");
        input.close();
    }
}