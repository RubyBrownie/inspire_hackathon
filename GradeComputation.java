/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HobbyProjects;
import java.util.Scanner;

/**
 * @since 2024 
 * @author Patrick A. 
 */
public class GradeComputation {
    /**
     * Scanner input used to prompt users to enter doubles in the following methods.
     */   
public static Scanner input = new Scanner(System.in);
 

public static int getNumberOfCourses (){
    System.out.println("Enter the number of courses whose grades you are entering (do not enter in words): ");
    int numberOfCourses = input.nextInt();
   
    
    return numberOfCourses;
}//End of getNumberOfCourses


   

    /**
     * Assigns a letter grade given a grade.
     * @param grade- a double representing an academic grade
     * @return - the equivalent letter grade the double academic grade
     */
    public static String assignGrade(double grade){
        String letterGrade;
        letterGrade = "";
    if (grade >= 90)
        letterGrade = "A+";
    else if (grade >=86)
        letterGrade = "C+";
    else if (grade >=80)
        letterGrade = "A-";
    else if (grade >=79)
        letterGrade = "B+";
    else if (grade >=76)
        letterGrade = "B";
    else if (grade >=72)
        letterGrade = "B-";
    else if (grade >=69)
        letterGrade = "C+";
    else if (grade >=60)
        letterGrade = "C";
    else if (grade >=50)
        letterGrade = "D";
    else
        letterGrade = "F";
    
        return letterGrade;
    }//End of assignGrade
    /**
     * A no-parameter method that prompts the user to enter academic grades and 
     * returns an array (of n elements) of doubles containing the grades.
     * @return An array of doubles representing a set of grades.
     */
    public static double [] getGrades (){
        int numberOfCourses = getNumberOfCourses();
        double [] grades = new double[numberOfCourses];
        System.out.println("Enter the following grades. Only enter numbers. \n");
       for (int i =0; i< grades.length; i++){
           System.out.printf("Enter grade from course%d: ",i+1);
           grades[i]=input.nextDouble();
       }
        return grades;
    }//End of getGrades
    /**
     * A method that computes the average grade.
     * @param grades An array containing double elements representing 
     * numerical academic grades
     * @return a double representing the average of the grades.
     */
    public static double computeAverage(double [] grades){
    double [] setOfGrades = grades;
    double total;
    double average;
    total = 0;
    average = 0;
    for (int gradeN = 0; gradeN<setOfGrades.length; gradeN++){
        total += setOfGrades[gradeN];
    }
    average = total/ setOfGrades.length;
return average;
    }//End of computeAverage
    
    public static void main(String[] args) {
        double [] grades;
        double average;
        
        grades = getGrades();
        average = computeAverage(grades);
       System.out.print("Grades: ");
       for (int i = 0; i<grades.length; i++)
           System.out.print(grades[i]+", ");
       System.out.print("\n");
       System.out.println("Student average: "+average);
       System.out.println("Student gpa letter: "+assignGrade(average));
      
       
    }//End of main
    
}//End of class
