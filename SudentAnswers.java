package simeon;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SudentAnswers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         final int questions = 10;
         System.out.println("Number of students?");
         int students = sc.nextInt();
        // System.out.println(students);
         char [][] answer = new char [students] [questions];
         for(int i=0; i <students; i++){
        	 String rand = (String)JOptionPane.showInputDialog(null,
                     "Student " + (i+1) + "?",
                     null,
                     2,
                     null,
                     null,
                     "Enter your answers (without leaving empty spaces)");
        	 for( int j=0 ; j<questions; j++){
        		 answer [i][j] = rand.charAt(j);
        		 
        	 }
         }
         char[] key = new char[questions];
         System.out.println("Write the key (without leaving empty spaces)!");
         String key2 = sc.next();
         for (int i=0; i<questions; i++){
        	 key[i] = key2.charAt(i);
         }
         for(int i=0; i< students; i++){
        	 int score = 0;
        	 for(int j=0; j< questions; j++){
        		 if(answer[i][j]== key[j]) score++;
        	 }
        	 System.out.println("Student "+ i+1 + "'s score is " + (int) score/questions*100 + "%" );
         }
         
         
       sc.close();
	}

}
