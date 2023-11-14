package ex05method;

import java.util.Scanner;

public class QuSimpleOperation
{

	public static void main(String[] args)
	{
		int num1, num2, small, big;
		Scanner scanner = new Scanner(System.in);
		System.out.println("0 이상의 양의 정수를 입력하세요");
		num1 = scanner.nextInt();
		System.out.println("0 이상의 양의 정수를 입력하세요");
		num2 = scanner.nextInt();
		if(num1 > num2) {
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		arithmetic(big, small);
		
	}

	static void arithmetic(int a, int b) {
		int plus = a + b;
		int minus = a - b;
		int multiply = a * b;
		int divide1 = a / b;
		int divide2 = a % b;
		System.out.println("덧셈결과 >> " + plus);
		System.out.println("뺄셈결과 >> " + minus);
		System.out.println("곱셈결과 >> " + multiply);
		System.out.println("나눗셈 몫 >> " + divide1);
		System.out.println("나눗셈 나머지 >> " + divide2);
	}
}
