package simeon;

import java.util.Scanner;

public class FinalExamExemption {
    public static void main(String[] args) {
   	 double averageGrade;
   	 int missedClasses;
   	 Scanner reader = new Scanner(System.in);
   	 System.out.println("This program will determine if you can get out of the final exam.");
   	 System.out.println("Please answer the following questions.");
   	 System.out.println("What is your average in the class?");
   	 averageGrade = reader.nextDouble();
   	 System.out.println("How class lectures have you missed?");
   	 missedClasses = reader.nextInt();
   	if (averageGrade >= 90 && missedClasses <= 3 || averageGrade >= 80 && missedClasses == 0) 
  		 System.out.println("Congratulations! You are exempt from the final exam.");
  	 else
  		 System.out.println("You are not exempt from the final exam.");
    }
}
