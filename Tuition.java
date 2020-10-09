package simeon;

public class Tuition {

	public static void main(String[] args) {
		int current = 10000 ;
        
        for(int i=0; i<10; i++) {
        	System.out.println("Godina" + (i+1) + " Tuition = " + current);
        	current*= 1.06;
        	
        }
        int sum=0;
        for (int i = 0; i<4;i++) {
        	sum+= current;
        	current*= 1.06;
        } System.out.println("Za 4 godini " + sum);
	}

}
