package ie.murph.math.modulus;

import java.util.stream.IntStream;

public class ModulusFun
{
	public static void main(String[] arguments)
	{
		int number = 21;
		snapCrackleOrPop(number);
	}

	private static void snapCrackleOrPop(int number)
	{
		for(int iteraation = 3; iteraation < number; iteraation++)
		{
			if (iteraation % 3 == 0 && iteraation % 5 == 0)
			{
				System.out.println("Number: " + iteraation + " Pop");
			}
			else
				if (iteraation % 5 == 0)
				{
					System.out.println("Number: " + iteraation + " Snap");
				}
				else
					if (iteraation % 3 == 0)
					{
						System.out.println("Number: " + iteraation + " Crackle");
					}
					else
					{
						System.out.println(number);
					}
		}
	}
	
}
