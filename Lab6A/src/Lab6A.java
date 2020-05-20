	import java.util.Scanner;

	public class Lab6A {

	public static void main(String[] args) {

	System.out.print("How many conversions would you like to make: ");

	Scanner sc=new Scanner(System.in);

	int numberOfConversions=Integer.parseInt(sc.nextLine());

	

	for(int i=1;i<=numberOfConversions;i++) {

	System.out.println("\nConversion # "+i);

	int option=0;

	while(option<1||option>2) {

	System.out.print("\nTo convert from celsius to fahrenheit type 1\nTo convert from fahrenheit to celsius type 2: ");

	option=Integer.parseInt(sc.nextLine());

	}

	double temp;

	if(option==1) {

	System.out.print("\nEnter a celsius temperature: ");

	temp=Double.parseDouble(sc.nextLine());

	System.out.printf("The celsius temperature of %.1f degrees is equal to %.1f degrees fahrenheit.",temp, celsiusToFahrenheit(temp));

	}

	else {

	System.out.print("\nEnter a fahrenheit temperature: ");

	temp=Double.parseDouble(sc.nextLine());

	System.out.printf("The fahrenheit temperature of %.1f degrees is equal to %.1f degrees celsius",temp, fahrenheitToCelsius(temp));

	}

	}

	}

	public static double celsiusToFahrenheit(double cels) {

	return (9.0/5.0)*cels + 32;

	}

	public static double fahrenheitToCelsius(double fahr) {

	return ((fahr - 32)*5)/9;

	}

	}