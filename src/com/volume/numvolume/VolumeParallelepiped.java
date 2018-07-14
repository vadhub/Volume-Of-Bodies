package com.volume.numvolume;

import com.volumefigure.interfacefigure.IVolume;

public class VolumeParallelepiped implements IVolume{
	public VolumeParallelepiped() {}	

	@Override
	public double volume(double h, double area) {
		return h*area;
	}

}
