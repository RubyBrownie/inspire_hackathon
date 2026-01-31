
package HobbyProjects;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @since 2026
 * @authors 
 */
public class FoodWasteComputation {
  /**
  * Scanner input used to prompt users to enter doubles in the following methods.
  */   
public static Scanner input = new Scanner(System.in);
public static ArrayList<Double> Storage = new ArrayList<Double>();

//gets the weight of the food as purchased
public static void getFoodWeight(){
    System.out.println("Enter the weight of the food: ");
}
//sums up the total food waste lost
public static void computeTotalWaste(){}

//converts the wasted weight into its corresponding price
public static void convertWeightToPrice(){}





//MAYBE HAVE A WHILE LOOP SO WE CAN HAVE A PROGRAM THAT ALLOWS US TO ADD MORE FOOD ITEMS IN IT
public static void main(String[] args){
    
    while(true){
        
        getFoodWeight();
        computeTotalWaste();
        convertWeightToPrice();
        //arraylist to constantly add costs into it
        Storage.add(0.0);
        
    }
        }
}

 
