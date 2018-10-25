package ie.murph.math.prime;

import java.util.stream.IntStream;

public class PrimeNumber
{
	public static void main(String[] arguments)
	{
		int number1 = 4, number2 = 7, number3 = 11, number4 = 32, number5 = 37;
		
		System.out.println("\nJava 7\n");
		System.out.println("Is " + number1 + " a prime number: " + isPrime(number1));
		System.out.println("Is " + number2 + " a prime number: " + isPrime(number2));
		System.out.println("Is " + number3 + " a prime number: " + isPrime(number3));
		System.out.println("Is " + number4 + " a prime number: " + isPrime(number4));
		System.out.println("Is " + number5 + " a prime number: " + isPrime(number5));
		
		System.out.println("\nJava 8\n");
		System.out.println("Is " + number1 + " a prime number: " + isPrimeFunctionalStyleJava8(number1));
		System.out.println("Is " + number2 + " a prime number: " + isPrimeFunctionalStyleJava8(number2));
		System.out.println("Is " + number3 + " a prime number: " + isPrimeFunctionalStyleJava8(number3));
		System.out.println("Is " + number4 + " a prime number: " + isPrimeFunctionalStyleJava8(number4));
		System.out.println("Is " + number5 + " a prime number: " + isPrimeFunctionalStyleJava8(number5));
	}

	private static boolean isPrime(int number)
	{
		if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
		for(int iteration = 3; iteration * iteration < number/2; iteration++)
		{
			if(number % iteration == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrimeFunctionalStyleJava8(int number) {
	    return number > 1 && 
	            IntStream.rangeClosed(2, (int) Math.sqrt(number))
	                .noneMatch(i -> number % i == 0);
	}
}
