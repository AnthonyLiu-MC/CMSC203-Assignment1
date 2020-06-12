/*********************************************
 *  Anthony Liu 
 *  CMSC203 
 * 	Assignment 1 - WindChill Calculator
 *  06/21/2020
 *  
 *  Takes input from user and calculates Wind Chill
 *********************************************/
import java.util.Scanner;	// Import scanner

public class WindChill {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Initialize scanner

		System.out.println("Wind Chill Calculator\n"); //Heading

		System.out.print("Please enter the temperature in Fahrenheit" + " (must be >=-45 and <=40): "); //Asks user for temp
		final double tempF = scan.nextDouble(); 														//Sets and initialize input to windSpeed

		System.out.print("Please enter the wind speed (must be >=5 and <=60): ");  //Asks user for windspeed
		final double windSpeed = scan.nextDouble();	 							   //Sets and initialize input to windSpeed

		final double windChill = 35.74 + 0.6215 * tempF - 35.75 * Math.pow(windSpeed, 0.16)		//Initialize and calculate windChill
				+ 0.4275 * tempF * Math.pow(windSpeed, 0.16);

		System.out.println();																	
		System.out.println("Wind chill temperature: " + windChill + " degrees Fahrenheit");  // Prints out windChill
		System.out.println();
		System.out.print("Programmer: Anthony Liu");		//Prints out programmer name

		scan.close();		//Close scanner

	}

}
