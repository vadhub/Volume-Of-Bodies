package com.volumefigure.numberaea;

import com.volumefigure.interfacefigure.IFigureArea;

public class AreaCircle implements IFigureArea{
	private double pi;
	
	public AreaCircle() {}
	
	public AreaCircle(double pi) {
		this.pi = pi;
	}	

	@Override
	public double areaThreeVariable(double width, double leight, double radius) {return 0;}
	
	@Override
	public double areaOneVariable(double diagonal) {return 0;}
	
	@Override
	public double areaTwoVariable(double radius, double pi) {		
		return pi*(radius*radius);
	}	
	
	public double getPi() {
		return pi;
	}
	
	public void setPi(double pi) {
		if(pi == 3.14||pi == 3.141||pi == Math.PI||pi == 3){
			this.pi = pi;
		}else{
			System.err.println("Sorry but number PI can`t "+pi);
		}
		
	}	
	
}
