package projects08;

import javax.swing.JOptionPane;

public class zad3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] stoinost = new int [10];
         for(int i=0; i<10; i++){
        	
        	 String input = (String)JOptionPane.showInputDialog(null,
                   "Stoinost?",
                   null,
                   2,
                   null,
                   null,
                   "Type a number");
        	 stoinost[i]=  Integer.parseInt(input);
         }
//         int currentIndex = stoinost.length, temporaryValue;
//         temporaryValue = stoinost[currentIndex];
//         
         int current = stoinost[0];
         for(int i =0; i<9; i++ ){
        	 stoinost[i]= stoinost[i+1];
         }
         stoinost[9]= current;
	
	   for(int i=0; i<10; i++){
	     System.out.print(stoinost[i]+ " ");
	   }
	} 
}
