package com.math.volumeofbodies;

public class Volumes implements IVolumes {

	@Override
	public double cube(double a) {
		return a*a*a;
	}

	@Override
	public double aprallelepiped(double a, double b, double h) {
		return a*b*h;
	}

	@Override
	public double prism() {
		return 0;
	}
	// public double cube (double a){
	// return a*a*a;
	// }
	//
	// public double aprallelepiped (double a, double b, double h){
	// return a*b*h;
	// }
	//
	// public double prism3 (double a,double b, double h){
	// double s = a*b;
	// return s*h;
	// }
}
