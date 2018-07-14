package com.volumefigure.simplefigure;

import com.volumefigure.abstractfigure.AbstractFigure;

public class Point extends AbstractFigure{
	
	private int startSize;
	
	public Point() {}
	
	public Point(int startSize){
		this.setStartSize(startSize);	
	}

	public int getStartSize() {
		return startSize;
	}

	public void setStartSize(int startSize) {
		if (startSize > 0) {
			this.startSize = startSize;
		} else {
			System.err.println("startSize can`t 0 or negative");
		}
	}
	
}
