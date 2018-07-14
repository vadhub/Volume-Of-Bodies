package com.volumefigure.numberaea;

import com.volumefigure.interfacefigure.IFigureArea;

public class AreaRectangle implements IFigureArea{	
	
	public AreaRectangle() {}
			
	

	@Override
	public double areaThreeVariable(double width, double leight, double radius) {return 0;}
	
	@Override
	public double areaTwoVariable(double leight, double width) {
		return leight*width;	
	}
	
	@Override
	public double areaOneVariable(double diagonal) {return 0;}
	
}
