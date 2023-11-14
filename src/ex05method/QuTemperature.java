package ex05method;

import java.util.Scanner;

public class QuTemperature
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("섭씨(Celsius)를 입력하세요.");
		double celsius = scanner.nextDouble();
		System.out.println("섭씨" + celsius + "의 화씨는 :" + Fahrenheit(celsius));
		System.out.println("화씨(Fahrenheit)를 입력하세요.");
		double fahrenheit = scanner.nextDouble();
		System.out.println("화씨" + fahrenheit + "의 섭씨는 :" + Celsius(fahrenheit));
		
		
	}
	
	static double Fahrenheit(double a) {
		double fah = 1.8 * a + 32;
		return fah;
	}
	
	static double Celsius(double b) {
		double cel = (b - 32) / 1.8;
		return cel;
	}
}
