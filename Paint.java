package simeon;


import java.util.Scanner;

public class Paint {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's the height of the room?");
		double height = sc.nextDouble();
		System.out.println("What's the length of the room?");
		double length = sc.nextDouble();
		System.out.println("What's the width of the room?");
		double width = sc.nextDouble();
		sc.close();
		double areaOfTheWalls = 2 * height * length + 2 * height * width + width * length;
		int fiveLiterBucket = (int)areaOfTheWalls / 140;
		int oneLiterBucket = ((int)areaOfTheWalls % 140) / 30;
		if (((int)areaOfTheWalls % 140) % 30 != 0)
			oneLiterBucket++;
		if (fiveLiterBucket * 15 + oneLiterBucket * 4 < (fiveLiterBucket + 1) * 15)
			System.out.println("For the painting of " + areaOfTheWalls + 
					" square meters you are going to need " + fiveLiterBucket + " 5-liter buckets and " + 
					oneLiterBucket + " 1-liter buckets. It will cost you " + 
					(fiveLiterBucket * 15 + oneLiterBucket * 4) + " dollars.");
		else
			System.out.println("For the painting of " + areaOfTheWalls + 
					" square meters you are going to need " + (fiveLiterBucket + 1) + " 5-liter buckets. It will cost you " + 
					((fiveLiterBucket + 1) * 15) + " dollars.");
	}
}