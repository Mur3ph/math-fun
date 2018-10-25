package ie.murph.math.fibonacci;

public class MyFibonacci
{
	public static void main(String[] arguments)
	{
		int digit = 5;
		int fibi = fibonacciSequenece(digit);
		System.out.println("Fibonacci of: " + digit + " is " + fibi);
	}

	private static int fibonacciSequenece(int n)
	{
		if(n < 2)
		{
			return n;
		}
		else
		{
			return fibonacciSequenece(n-1) + fibonacciSequenece(n-2);
		}
	}
}
