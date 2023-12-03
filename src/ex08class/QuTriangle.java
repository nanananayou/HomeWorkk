package ex08class;

class Triangle{
	double x, y;
	
	void init(double x, double y) {
		this.x = x;
		this.y = y;
	}
	void setBottom(double x) {
		this.x = x;
	}
	void setHeight(double y) {
		this.y = y;
	}
	double getArea() {
		return x * y * 0.5;
	}
	
}

public class QuTriangle
{

	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17);
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);
		t.setHeight(14);
		System.out.println("삼각형의 넓이 : " + t.getArea());

	}

}
