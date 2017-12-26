package com.math.volumeofbodies;

public class Volumes {
	public double cube (double a){				
		return a*a*a;
	}
	
	public double parallelepiped (double a, double b, double h){				
		return a*b*h;
	}
	
	public double prism3 (double a,double b, double h){
		double s = a*b;
		return s*h;
	}
}
