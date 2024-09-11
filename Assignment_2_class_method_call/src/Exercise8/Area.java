package Exercise8;

// This demonstrate to calculate area

public class Area {
	
	double getArea(double x, double y) {
		return x * y;
	}

	public static void main(String[] args) {
		Area area = new Area();
		double z = area.getArea(10.2, 23.4);
		System.out.println(z);
	}

}
