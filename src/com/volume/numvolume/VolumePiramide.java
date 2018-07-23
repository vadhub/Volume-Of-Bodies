package com.volume.numvolume;

import com.volumefigure.interfacefigure.IVolume;

public class VolumePiramide implements IVolume{

	@Override
	public double volume(double h, double area) {
		double volumeP = (h*area)/3;
		return volumeP;
	}
	
}
