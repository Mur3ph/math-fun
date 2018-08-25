package ie.murph.math.theory;

public enum EVolume {
	
//	Equation: V = Math-Pi * d^3 / 6 		(d=diameter, diameter is twice the radius r of the sphere
//	Equation: V = Math-Pi * 4 * r^3 / 3 	(r=radius, diameter is twice the radius r of the sphere)
//	Volume is a three-dimensional space occupied by an object
//	Math link: https://www.grc.nasa.gov/WWW/k-12/airplane/volume.html
	
	VOLUME_EXPLAINED("\nVolume is a three dimensional space occupied by an object\n"),
	DIAMETER("\nThe diameter d is twice the radius r of the sphere\n");
	
	private final String text;

    private EVolume(final String text) 
    {
        this.text = text;
    }

    @Override
    public String toString() 
    {
        return this.text;
    }
	
}
