import java.util.Scanner;
public class CalculatorBrain {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		float num1 = console.nextFloat();
		System.out.println("Enter the second value: ");
		float num2 = console.nextFloat();
		add(num1, num2);
		subtract(num1, num2);
		multiply(num1, num2);
		divide(num1, num2);
		console.close();

	}//main

	public static void add(float first, float second) {
		System.out.print("The addition is: ");
		System.out.println(first + second);
	}//addition
	
	public static void subtract(float first, float second) {
		System.out.print("The subtraction is: ");
		System.out.println(first - second);
	}//subtraction
	
	public static void multiply(float first, float second) {
		System.out.print("The multiplication  is: ");
		System.out.println(first * second);
	}//multiplication
	
	public static void divide(float first, float second) {
		System.out.print("The division is: ");
		System.out.println(first / second);
	}//division
		
}//class CalculatorBrain
