package ex05method;

public class isPrimeNumber
{

	public static void main(String[] args)
	{
		System.out.println(isPrimeNumber(6));
		for(int i = 2; i <= 100; i++) {
			if(isPrimeNumber(i) == true) {
				System.out.println(i);
			}
			
		}
	}
	
	
	static boolean isPrimeNumber(int a) {
		int i;
		if(a < 1) {
			return false;
		}
		else {
			for(i = 2; i <= a; i++) {
				if(a % i == 0) {
					break;
				}	
				
			}
			if(a == i) {
				return true;
			}
		}
	
		
		return false;
    }
}
