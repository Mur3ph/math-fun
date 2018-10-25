package ie.murph.math.prime;

public class PrimeNumber
{
	public static void main(String[] arguments)
	{
		int number1 = 4, number2 = 7, number3 = 11, number4 = 32, number5 = 37;
		System.out.println("Is " + number1 + " a prime number: " + isPrime(number1));
		System.out.println("Is " + number2 + " a prime number: " + isPrime(number2));
		System.out.println("Is " + number3 + " a prime number: " + isPrime(number3));
		System.out.println("Is " + number4 + " a prime number: " + isPrime(number4));
		System.out.println("Is " + number5 + " a prime number: " + isPrime(number5));
	}

	private static boolean isPrime(int number)
	{
		for(int iteration = 2; iteration < number/2; iteration++)
		{
			if(iteration % number == 0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
}
