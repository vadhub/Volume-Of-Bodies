package com.volume.figure;

import com.math.volumeofbodies.Figure;
import com.math.volumeofbodies.IFigureArea;
import com.math.volumeofbodies.IVolume;

public class Parallelepiped extends Figure implements IFigureArea, IVolume {

	public Parallelepiped(double sideA, double sideB, double hight,	double angle, double diagonal, double areas) {
		super(sideA, sideB, angle, diagonal, areas, hight);

	}

	@Override
	public double volume(double h, double area) {

		area = area(this.sideA, this.sideB, this.hight, this.angle,	this.diagonal);

		return h * area;
	}

	@Override
	public double area(double a, double b, double h, double angle,
			double diagonal) {
		return a * b;
	}

}
