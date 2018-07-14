package com.volumefigure.figureplanimetry;
import com.volumefigure.numberaea.AreaCircle;
import com.volumefigure.simplefigure.Line;

public class Circle extends Line{
	
	private String name;
	
	private AreaCircle areaCircle = new AreaCircle();
	public Circle() {}
	
	public Circle(String name,double pi, double radius) {
		this.name = name;
		this.setRadius(radius);		
		areaCircle.setPi(pi);
	}
	
	@Override
	public double areaStandart(){
		System.out.println(" "+name);
		System.out.println("Radius: "+dataOut(getRadius()));
		System.out.println("Number PI: "+dataOut(areaCircle.getPi()));
		return this.areaCircle.areaTwoVariable(this.getRadius(), areaCircle.getPi());	
		
	}
	
	private double dataOut(double data){
		return data;
	}
}
