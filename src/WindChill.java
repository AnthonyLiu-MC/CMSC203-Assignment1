
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Wind Chill Calculator\n");

		System.out.print("Enter the temperature in Fahrenheit" + " (must be >=-45 and <=40): ");
		final double tempF = scan.nextDouble();

		System.out.print("Enter the wind speed (must be >=5 and <=60): ");
		final double windSpeed = scan.nextDouble();

		final double windChill = 35.74 + 0.6215 * tempF - 35.75 * Math.pow(windSpeed, 0.16)
				+ 0.4275 * tempF * Math.pow(windSpeed, 0.16);

		System.out.println();
		System.out.println("Wind chill temperature: " + windChill + " degrees Fahrenheit");
		System.out.println();
		System.out.print("Programmer: Anthony Liu");

		scan.close();

	}

}
