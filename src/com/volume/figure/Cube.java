package com.volume.figure;

import com.math.volumeofbodies.Figure;
import com.math.volumeofbodies.IFigureArea;
import com.math.volumeofbodies.IVolume;

public class Cube extends Figure implements IVolume, IFigureArea {

	public Cube(double sideA, double sideB, double hight, double angle, double diagonal, double areas) {
		super(sideA, sideB, angle, diagonal, areas, hight);
	}

	@Override
	public double area(double a, double b, double h, double angle, double diagonal) {
		return a * a;
	}

	@Override
	public double volume(double h, double area) {
		area = area(this.sideA, this.sideB, 0, 0, 0);
		return area * h;
	}

}
