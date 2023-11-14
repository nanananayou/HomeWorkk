package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN
{

	public static void main(String[] args) throws IOException
	{
		int numm;
		for(int i = 0; i <= 1; i++) {
			
		numm = i;
		 System.out.println("하나의 문자를 입력하세요.");	
		 numm = System.in.read();
		// 0을 구하고 싶을 때 0의 아스키값인 48을 빼주면 된다.
		 String a = ((numm - 48)<=9 && (numm - 48) >= 0 ? "숫자입니다." : "숫자가 아닙니다.");
		 System.out.println(a);
		 
		// 엔터키를 눌러도 엔터값이 입력되기때문에 이 값을 없애줘야 합니다. 두 개 써줍시다.		
		// 엔터키를 누를때 아스키코드 13번 값이 입력이되고 개행이 될때 10번이 입력이 되기 때문.
		 System.in.read();
		 System.in.read();

		}
	}

}
