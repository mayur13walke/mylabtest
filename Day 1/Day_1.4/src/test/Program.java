package test;

public class Program {
	public static void main(String[] args) {
		int num1 = Integer.parseInt( args[ 0 ] );
	
		float num2 = Float.parseFloat( args[ 1 ] );
		
		double num3 = Double.parseDouble( args[ 2 ] );
		
		double result =  num1 + num2 + num3;
		System.out.println("Result	:	"+result);
	}
	public static void main6(String[] args) {
		String a = "10";
		int num1 = Integer.parseInt(a);
		
		String b = "20.1f";
		float num2 = Float.parseFloat(b);
		
		String c = "30.2d";
		double num3 = Double.parseDouble(c);
		
		double result =  num1 + num2 + num3;
		System.out.println("Result	:	"+result);
	}
	public static void main5(String[] args) {
		String strNumber = "125";
		int number = Integer.parseInt(strNumber);
		System.out.println("Number	:	"+number);
	}
	public static void main4(String[] args) {
		//int number;
		//System.out.println("Number	:	"+number); //Error
	}
	public static void main3(String[] args) {
		int number;
		number = 10;	//Assignment
		System.out.println("Number	:	"+number);
	}
	public static void main2(String[] args) {
		int number = 10;	//Initialization
		System.out.println("Number	:	"+number);
	}
	public static void main1(String[] args) {
		String str = "Hello Dac";
		System.out.println("Message : "+str);
	}
}
