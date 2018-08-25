package ie.murph.math;

import ie.murph.math.theory.EVolume;
import ie.murph.math.theory.IVolume;
import ie.murph.math.volume.SphereVolume;

public class RunVolume {
	
	public static void  main(String[] args)
	{
		System.out.println(EVolume.VOLUME_EXPLAINED.toString() + " " + IVolume.DIAMETER);
		System.out.println(SphereVolume.getVolumeViaDiameter(10));
		System.out.println(SphereVolume.getVolumeViaRadius(5));
	}
	
}
