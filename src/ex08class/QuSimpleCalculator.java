package ex08class;

class CalculatorEx{
	int cnt1, cnt2, cnt3, cnt4, cnt5;
	double x, y;
	public void init() {
		cnt1 = 0;
		cnt2 = 0;
		cnt3 = 0;
		cnt4 = 0;
	}
	public double add(double x, double y) {
		this.x = x;
		this.y = y;
		cnt1++;
		return x + y;
	}
	public double min(double x, double y) {
		cnt2++;
		return x - y;
	}
	public double mul(double x, double y) {
		cnt3++;
		return x * y;
	}
	public double div(double x, double y) {
		cnt4++;
		return x / y;
	}
	public void showOpCount() {
		System.out.println("덧셈횟수 : " + cnt1);
		System.out.println("뺄셈횟수 : " + cnt2);
		System.out.println("곱셈횟수 : " + cnt3);
		System.out.println("나눗셈횟수 : " + cnt4);
	}
}

public class QuSimpleCalculator
{

	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1,  2));
		System.out.println("10.5 - 5.5 =" + cal.min(10.5, 5.5));
		System.out.println("4.0 * 5.0 =" + cal.mul(4.0, 5.0));
		System.out.println("100 / 25 =" + cal.div(100, 25));
		System.out.println("10.0 * 3.0 =" + cal.mul(10.0, 3.0));
		cal.showOpCount();
	}

}
