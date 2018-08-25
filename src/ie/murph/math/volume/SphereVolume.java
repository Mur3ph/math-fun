package ie.murph.math.volume;


public final class SphereVolume {
	
	private final static double MATH_PI = 3.14159;
	private final static int POWER_OF_THREE = 3;
	
	private SphereVolume() {}
	
	private static int calculatePowerOfDiameter(int diameter)
	{
		int total = diameter;
		for(int iteration = 1; iteration < POWER_OF_THREE; iteration++)
		{
			total = total * diameter;
		}
		return total;
	}
	
	public static int calculatePowerOfRadius(int radius)
	{
		int total = radius;
		for(int iteration = 1; iteration < POWER_OF_THREE; iteration++)
		{
			total = total * radius;
		}
		return total;
	}
	
	public static double getVolumeViaDiameter(int diameter)
	{
		
		return MATH_PI * calculatePowerOfDiameter(diameter) / 6;
	}
	
	public static double getVolumeViaRadius(int diameter)
	{
		
		return MATH_PI * 4 * calculatePowerOfRadius(diameter) / 3;
	}
}
