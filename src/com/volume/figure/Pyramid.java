package com.volume.figure;

import com.math.volumeofbodies.AbstactFigure;
import com.math.volumeofbodies.IFigureArea;
import com.math.volumeofbodies.IVolume;

public class Pyramid extends AbstactFigure implements IVolume, IFigureArea{

	public Pyramid(double sideA, double sideB, double hight, double angle, double diagonal, double areas) {
		super(sideA, sideB, hight, angle, diagonal, areas);	
	}

	@Override
	public double area(double a, double b, double h, double angle,double diagonal) {		
		return a*b;
	}

	@Override
	public double volume(double h, double area) {
		h = hight;				
		return (area(sideA,sideB,0,0,0)*h)/3;
	}

}
