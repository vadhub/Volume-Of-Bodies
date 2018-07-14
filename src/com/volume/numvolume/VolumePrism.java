package com.volume.numvolume;

import com.volumefigure.interfacefigure.IVolume;

public class VolumePrism implements IVolume{
	
	public VolumePrism() {}

	@Override
	public double volume(double h, double area) {		
		return h*area;
	}
	
}
