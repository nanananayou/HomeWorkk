package ex05method;

import java.util.Scanner;

public class QuCircleCalculator
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요:");
		double r = scanner.nextDouble();
		
		System.out.printf("원의 넓이(" + r + ") :" + circleArea(r));
		System.out.println();
		System.out.printf("원의 둘레(" + r + ") :" + circleRound(r));
		
	}
	
	static double circleArea(double radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	static double circleRound(double radius) {
		double round = 2 * 3.14 * radius;
		return round;
	}
}
