package ex04controlstatement;

public class Qu3Or7Sum
{

//	하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 
//	삼항연산자를 이용하여 구현하시오.	
//	(System.in.read()를 사용하세요)

	public static void main(String[] args)
	{
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			if(i % 3 == 0 || i % 7 == 0) {
				sum += i;
			}if(i % 3 == 0 && i % 7 == 0) {
				sum -= i;
			}
			System.out.println(i + "번째 sum = " + sum);
			i++;
		}
		System.out.println("최종 합은 : " + sum);

	}

}
