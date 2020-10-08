package simeon;

import javax.swing.JOptionPane;

public class MultiPlanetaryWeight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weightOnEarth = (String) JOptionPane.showInputDialog(null, "What is your weight? (on Earth)", null, 3);
		double weight = Double.parseDouble(weightOnEarth);
		String [] acceptableValues = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		String planet = (String) JOptionPane.showInputDialog(null, 
				"Choose a planet. The console will show you your weight there.", null, 3, null, acceptableValues, 0);
		double weightOnADifferentPlanet = 0;
		switch (planet){
		case "Mercury" :
			weightOnADifferentPlanet = 0.38 * weight;
			break;
		case "Venus" :
			weightOnADifferentPlanet = 0.91 * weight;
			break;
		case "Mars" :
			weightOnADifferentPlanet = 0.38 * weight;
			break;
		case "Jupiter" :
			weightOnADifferentPlanet = 2.36 * weight;
			break;
		case "Saturn" :
			weightOnADifferentPlanet = 0.92 * weight;
			break;
		case "Uranus" :
			weightOnADifferentPlanet = 0.89 * weight;
			break;
		case "Neptune" :
			weightOnADifferentPlanet = 1.13 * weight;
			break;
		}
		System.out.println("Your weight on " + planet + " is " 
		+ (int)(weightOnADifferentPlanet*100)/100.0 + " kg.");
	}
}
