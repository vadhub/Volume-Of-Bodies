package com.volume.figure;

import com.math.volumeofbodies.Figure;
import com.math.volumeofbodies.IFigureArea;
import com.math.volumeofbodies.IVolume;

public class Cube extends Figure implements IVolume, IFigureArea {	
	
	@Override
	public double area(double a, double b, double h, double angle, double diagonal) {		
		return a*a;
	}
		
	@Override
	public double volume(double h) {
		double s = area(this.sideA,this.sideA,0,0,0);						
		return s*h;
	}
	
	
}
