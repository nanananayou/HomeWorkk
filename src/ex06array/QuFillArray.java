package ex06array;

import java.util.Scanner;

public class QuFillArray
{

	public static void main(String[] args)
	{
		
//		길이가 10인 배열을 선언한 후 총 10개의 정수를 
//		입력받아 순서대로 저장한다. (첫번째배열)
//		그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 
//		짝수는 배열의 끝에서부터 채워나간다.(두번째배열)
		
		// 첫번째 배열
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%2d째의 정수를 입력하세요: %3d", i + 1, array[i]);
			System.out.println();
		}
		System.out.println("순서대로 입력한 결과");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		// 두번째 배열
		System.out.println();
		int[] array2 = new int[10];
		
		int cnt = 0;
		for(int j = 0; j < array2.length; j++) {
			
			if(array[j] % 2 == 0) {
				array2[9 - cnt] = array[j];
				cnt++; // 짝수의 개수
			}
			else {
				array2[j - cnt] = array[j]; 
			}
			
	    }
		System.out.println("홀수/짝수 구분 결과");
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		
		
	}

}
