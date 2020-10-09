package simeon;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = in.nextInt();
        while(lines>=1) {
            for(int i = lines; i > 1; i--){
                System.out.print(i + " ");
            }
            for(int i = 1; i <= lines; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            lines--;
        }
        in.close();
    }

}