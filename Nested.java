package simeon;

import java.util.Scanner;

public class Nested {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = in.nextInt();
        int lines2 = lines;
        while(lines>=1) {
        	
        	for( int j = lines2 - lines; j>0 ; j--) {
        		System.out.print(" " + " ");
        	}
            for(int i = 1; i<=lines; i++){
                System.out.print("*" + " ");
            }
            System.out.println();
            lines--;
        }
        in.close();
    }

}