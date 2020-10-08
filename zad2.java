package projects08;

import javax.swing.JOptionPane;

public class zad2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] stoinost = new int [10];
         for(int i=0; i<10; i++){
        	
        	 String input1 = (String)JOptionPane.showInputDialog(null,
                   "Stoinost?",
                   null,
                   2,
                   null,
                   null,
                   "Type a number");
        	 stoinost[i]=  Integer.parseInt(input1);
         }
         int currentIndex = stoinost.length, temporaryValue, randomIndex;

         // While there remain elements to shuffle...
         while (0 != currentIndex) {

           // Pick a remaining element...
           randomIndex = (int) Math.floor(Math.random() * currentIndex);
           currentIndex -= 1;

           // And swap it with the current element.
           temporaryValue = stoinost[currentIndex];
           stoinost[currentIndex] = stoinost[randomIndex];
           stoinost[randomIndex] = temporaryValue;
         }

         for(int pesho : stoinost){
         	System.out.println(pesho);
         }
	}
}
