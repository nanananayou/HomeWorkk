package ex04controlstatement;

public class QuPyramid02
{
	public static void main(String[] args)
	{
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
//		int i = 1;
//		int j = 5;
//		do {
//			System.out.print("*");
//			if(i + j == 6) {
//				continue;
//			}
//			i++;
//		}while(i <= 5);
		
		int i = 1;
		do {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
				if(i + j == 6) {
					break;
				}
			}
			i++;
			System.out.println();
		} while(i <= 5);

		
		// 방법 2
		int i3 = 1;
		do {
			for(int j = 1; j <= 6 - i3; j++) {
				System.out.print("*");
			}
			System.out.println();
			i3++;
		}while(i3 <= 5);
	}

}
