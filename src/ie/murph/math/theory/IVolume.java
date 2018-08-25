package ie.murph.math.theory;

public interface IVolume {
	
//	Equation: V = Math-Pi * d^3 / 6 		(d=diameter, diameter is twice the radius r of the sphere
//	Equation: V = Math-Pi * 4 * r^3 / 3 	(r=radius, diameter is twice the radius r of the sphere)
//	Volume is a three-dimensional space occupied by an object
//	Math link: https://www.grc.nasa.gov/WWW/k-12/airplane/volume.html
	
//	The diameter d is twice the radius r of the sphere
	
	//Constant variables used throughout the application
	public final static String WELCOME_TO_MATH_LEARNING = "\nWelcome to Math Learning GUI\n";
	public final static String VOLUME_EXPLAINED = "\nVolume is a three dimensional space occupied by an object\n";
	public final static String DIAMETER = "\nThe diameter d is twice the radius r of the sphere\n";
	public final static String CHOOSE_OBJECT = "\nChoose number beside Object which you want the Volume:"
									  + "\n1). Sphere"
									  + "\n2). Cube"
									  + "\n3). Cylinder"
									  + "\n4). Rectangular Prism";

}
