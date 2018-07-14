package com.volumefigure.fgurestereometry;


import com.volume.numvolume.VolumeParallelepiped;
import com.volumefigure.abstractfigure.AbstractFigure;

public class Parallelepiped extends AbstractFigure{	
	
	private VolumeParallelepiped volume = new VolumeParallelepiped();
	
	public Parallelepiped() {}
		
	public Parallelepiped(String name, double area, double height) {
		setName(name);
		setHight(height);
		setArea(area);
	}
	
	public double volumeStandart(){
		System.out.println("     "+getName());
		return volume.volume(getHight(), getArea());
	}
}
