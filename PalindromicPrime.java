package simeon;

public class PalindromicPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2 + "\t");
		int count = 1;
		int number = 3;
		
		while(count < 120) {
			
			if (!isPalindrome(number) || !isPrime(number)) {
				number++;
				continue;
			}
			
			
			System.out.println(number + "\t");
			count++;
			number++;
			if(count%10 == 0) {
				System.out.println();
			}
			
		}
	}
	public static boolean isPrime(int aNumber) {
		int maxDivider = (int) Math.ceil(Math.sqrt(aNumber));
		boolean isPrime = true;
		for( int i = 2; i<=maxDivider; i++ ) {
			if (aNumber % i == 0) {
				isPrime = false;
				break;					
			}
		}
		return isPrime;
	}
	public static boolean isPalindrome(int aNumber) {
		int copyNumber = aNumber;
		int reversedNumber = 0;
		while(copyNumber != 0) { //12321
			int remainder = copyNumber % 10; //1
			reversedNumber = reversedNumber*10 + remainder; //1
			copyNumber /= 10; //1232
		}
		
		return aNumber == reversedNumber;
	}
}