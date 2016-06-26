import java.util.Scanner;
public class ComputeBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weight =input.nextDouble();
		
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInkilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInkilograms / (heightInMeters * heightInMeters);
		
		System.out.println("Your BMI is " + bmi);
		if (bmi < 16)
			System.out.println("You are seriously underweight");
		else if (bmi <18)
			System.out.println("You are underweight");
		else if (bmi < 24)
			System.out.println("You are nourmal weight");
		else if (bmi < 29)
			System.out.println("You are overweight");
		else if (bmi < 35)
			System.out.println("You are seriously overweight");
		else
			System.out.println("You are gravely overweight");
	}

}
