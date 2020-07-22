package Shapes;

import java.util.Scanner;

/**
 * This class performs calculations on a triangle.
 * It includes 2 methods for calculating area and circumference of an iso triangle
 * @author u180512 / Sami Bedrani
 * Version 1.0 12 Feb 2020
 */
public class Iso_Angled_Triangle {
	public static void main(String args[]) {
		/** 
		 * Main method asks user to input base, side and height
		 * Then prints the area and circumference of corresponding iso triangle
		 * Takes in needed attributes
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		double base = sc.nextDouble();
		System.out.println("Enter another side");
		double a = sc.nextDouble();
		System.out.println("Enter the perpendicular height");
		double height = sc.nextDouble();
		
		/**
		 * Calls methods and prints results 
		 * @param base height side
		 * @return area circumference
		 */
		System.out.println("The area is "+area(base,height));
		System.out.println("The circumference is "+circumference(base,a));

	}
	
	/**
	 * 
	 * @param base
	 * @param height
	 * @return area
	 * Uses formulas to calculate area.
	 */

	public static double area(double base, double height)
	{
		return .5*base*height;
	}
	/**
	 * 
	 * @param base
	 * @param a
	 * @return circumference
	 *  Uses formulas to calculate circumference.
	 */

	public static double circumference(double base, double a)
	{
		return base+(2*a);
	}

}
