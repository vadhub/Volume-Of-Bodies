package com.volumefigure.abstractfigure;

public abstract class AbstractFigure {
	
	private String name;
	private double numbersOfSides;
	private double height;
	private double angle;
	private double diagonal;
	private double radius;
	private double width;
	private double area;
	
	public AbstractFigure() {}

	public AbstractFigure(double width, double hight) {
		this.setHight(hight);
		this.setWidth(width);
	}

	public AbstractFigure(double numbersOfSides, double hight, double angle, double diagonal, double radius, double side) {
		this.setAngle(angle);
		this.setDiagonal(diagonal);
		this.setNumbersOfSides(numbersOfSides);
		this.setHight(hight);
		this.setRadius(radius);
		this.setWidth(side);
	}

	public AbstractFigure(double radius) {
		this.setHight(height);
		this.setRadius(radius);
	}

	public AbstractFigure(double numbersOfSides, double angle, double radius) {
		this.setRadius(radius);
		this.setAngle(angle);
		this.setNumbersOfSides(numbersOfSides);
	}

	public AbstractFigure(double side, double diagonal, double angle, double numbersOfSides) {
		this.setWidth(side);
		this.setAngle(angle);
		this.setDiagonal(diagonal);
		this.setNumbersOfSides(numbersOfSides);
	}

	public double getNumbersOfSides() {
		return numbersOfSides;
	}

	public void setNumbersOfSides(double numbersOfSides) {
		if (numbersOfSides > 0) {
			this.numbersOfSides = numbersOfSides;
		} else {
			System.err.println("numbers side can`t 0 or negative");
		}
	}

	public double getHight() {
		return height;
	}

	public void setHight(double hight) {
		if (hight > 0) {
			this.height = hight;
		} else {
			System.err.println("hight can`t 0 or negative");
		}
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		if (angle > 0) {
			this.angle = angle;
		} else {
			System.err.println("angle can`t 0 or negative");
		}
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		if (diagonal > 0) {
			this.diagonal = diagonal;
		} else {
			System.err.println("diagonal can`t 0 or negative");
		}
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.err.println("radius can`t 0 or negative");
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		} else {
			System.err.println("width can`t 0 or negative");
		}
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		if(area>0){
		this.area = area;
		}else{
			System.err.println("Area can`t negative");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(!name.isEmpty()){
			this.name = name;
		}else{
			System.err.println("Name can`t empty");
		}		
	}
}
