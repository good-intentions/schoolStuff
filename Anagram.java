package simeon;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String edno, dve;
		System.out.print("Enter a word ");
		edno = sc.next();
		System.out.print("Enter an anagram ");
		dve = sc.next();
		sc.close();
		
		boolean anagram = true;
		int length1 = edno.length();
		String kopie = dve;
		
		for( int i=0; i < length1; i++ ) {
			
			char vEdno = edno.charAt(i);
			if( vEdno > 'a' && vEdno < 'z' || vEdno > 'A' && vEdno < 'Z'  ) {
				
				int mqsto = kopie.indexOf(vEdno);
				if (mqsto== -1) {
					anagram = false ; 
					break;
				}else {
					kopie = kopie.substring(0, mqsto) + kopie.substring( mqsto+1);
					System.out.println(kopie);
				}
			}
		
		 }
		if(anagram) {
			int ostatuk = kopie.length();
			
			for( int i = 0; i<ostatuk; i++) {
				
				char current = kopie.charAt(i);
				if (current >= 'a' && current <= 'z' || current >= 'A' && current <= 'Z') {
						anagram = false;
						break;
			    }
		    }
	   }
		System.out.println( anagram? "is anagram" : "isn't an anagram");
	}
}
