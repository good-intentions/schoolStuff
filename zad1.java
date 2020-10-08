package projects08;
import java.util.Random;
public class zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] masif = new int[20];
		Random rand = new Random();
		for(int i=0; i<20; i++){
			masif[i] = rand.nextInt();
		}
        for(int pesho : masif){
        	System.out.println(pesho);
        }
	}

}
