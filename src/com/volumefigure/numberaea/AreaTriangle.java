package com.volumefigure.numberaea;

import com.volumefigure.interfacefigure.IFigureArea;

public class AreaTriangle implements IFigureArea{

	public AreaTriangle() {}
	
	@Override
	public double areaTwoVariable(double leight, double height) {
		return 0.5*height*leight;
	}

	@Override
	public double areaThreeVariable(double width, double leight, double radius) {return 0;}

	@Override
	public double areaOneVariable(double radius) {return 0;}
}
