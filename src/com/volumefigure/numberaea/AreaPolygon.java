package com.volumefigure.numberaea;

import com.volumefigure.interfacefigure.IFigureArea;

public class AreaPolygon implements IFigureArea{
	public AreaPolygon() {}

	@Override
	public double areaOneVariable(double a) {
		return 0;
	}

	@Override
	public double areaTwoVariable(double radius, double halvePirimetr) {
		return radius*halvePirimetr;
	}

	@Override
	public double areaThreeVariable(double radius, double side, double numSide) {
		double ex = halvePirimetr(side, (int) numSide);
		return radius*ex;
	}
	
	protected double halvePirimetr(double side, int numSide){
		return (side*numSide)/2;		
	}
	
}
