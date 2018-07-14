package com.volumefigure.convertors;

public class Convertor {

	private double size;

	public Convertor(double size) {
		this.setSize(size);
	}

	public double convertTo(String size1, String sizeTo) {
		String summ_Size1_And_SizeTo = size1 + sizeTo;
		
		switch (summ_Size1_And_SizeTo) {
		case "CentimetreMillimetre":
			return convertCentimetreToMillimetre(size);

		case "MillimetreCentimetre":
			return convertMillimetreToCentimetre(size);

		case "CentimetreDecimetre":
			return convertCentimetreToDecimetre(size);

		case "DecimetreCentimetre":
			return convertDecimetreToCentimetre(size);

		case "CentimetreMetre":
			return convertCentimetreToMetre(size);

		case "MetreCentimetre":
			return convertMetreToCentimetre(size);

		default:
			System.err.println("Sory we don`t find: "+size1+" "+sizeTo);
		}
		return size;
	}

	private double convertMillimetreToCentimetre(double size) {
		size = size * 10;
		return size;
	}

	private double convertCentimetreToMillimetre(double size) {
		size = size / 10;
		return size;
	}

	private double convertCentimetreToDecimetre(double size) {
		size = size * 10;
		return size;
	}

	private double convertDecimetreToCentimetre(double size) {
		size = size / 10;
		return size;
	}

	private double convertCentimetreToMetre(double size) {
		size = size / 100;
		return size;
	}

	private double convertMetreToCentimetre(double size) {
		size = size * 100;
		return size;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		if (size > 0) {
			this.size = size;
		} else {
			System.out.println("size can`t negative");
		}
	}
}
