package exception;

import java.util.Scanner;

/*
예외 종류
 - 강제 예외 : throw
 - 예외 전가 : throws
 - 예외 처리 : try, catch
 - 예외 처리 목적
   - 프로그램을 꺼지지 않게 만든다
 - 예외 처리는 예외적인 상황을 처리하는 것
 */
public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x=0,y=0,result=0;
		System.out.print("두 수를 입력 : ");
		
		try {
			try {
				x = scan.nextInt();
				y = scan.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수만 입력");
			}
			result  = x/y;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0으로는 나눌수없음");
		}
		System.out.println("결과 : "+result);
		
	}
}


