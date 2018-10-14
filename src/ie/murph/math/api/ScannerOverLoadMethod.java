package ie.murph.math.api;

import java.util.Scanner;

public class ScannerOverLoadMethod {
	
	private final Scanner M_SCANNER = new Scanner(System.in);
	
	public byte scannerType(byte type) {
        System.out.println(type + " is an byte");
        return this.M_SCANNER.nextByte();
    }
	
	public int scannerType(int type) {
        System.out.println(type + " is an int");
        return this.M_SCANNER.nextInt();
    }
	
	public float scannerType(float type) {
        System.out.println(type + " is an float");
        return this.M_SCANNER.nextFloat();
    }
	
	public double scannerType(double type) {
		System.out.println(type + " is an double");
        return this.M_SCANNER.nextDouble();
    }
	
	public void scannerType(char type) {
        System.out.println(type + " is an char");
    }
	
	public String scannerType(String type) {
		System.out.println(type + " is an string");
        return this.M_SCANNER.nextLine();
    }

}
