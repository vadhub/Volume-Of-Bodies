package com.volumefigure.convertors;

public class ConvertorSinAngls {
	
	private int angle;
	
	public ConvertorSinAngls(int angle){
		this.angle = angle;		
	}

	public double converTo(){		
		return convertorSinAngls(angle);
	}

	private double convertorSinAngls(int angle){
		switch (angle) {
		case 0:	
			return 0;

		case 30:
			return 0.5;

		case 45:
			return 0.7;

		case 60:
			return 0.86;

		case 90:
			return 1;

		default:
			System.err.println("Sorry we can`t find is angle: "+angle);
		}
		return 0/0;
		
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		if(angle>0){
		this.angle = angle;
		}else{
			System.err.println("angle can`t negative");
		}
	}

}
