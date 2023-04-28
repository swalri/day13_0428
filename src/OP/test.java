package OP;

import java.util.Scanner;

//공기청정기
class acmain {
	public void acmain() {
		System.out.println("공기청정기");
	}

	// 예약
	public void timeset() {
		System.out.print("예약 시간을 설정합니다");
		System.out.print("시간을 입력해주세요 ");
	}

	// 전기
	public void ele() {
		System.out.print("전원을 키시겠습니까?");
	}

	// 냄새제거
	public void sm() {
		System.out.print("냄새제거를 실시합니다");
	}
}

class kmin extends acmain {
	// 에어컨 기능
	public void air() {
		System.out.println("에어컨 기능을 실시합니다");
	}
}

class gmin extends acmain {
	// 가습 기능
	public void sup() {
		System.out.println("가습기를 실시합니다");
	}
}

class smin extends acmain {
	// 제습기 기능
	public void sop() {
		System.out.println("제습기능을 실시합니다");
	}
}

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("1. kmin");
		System.out.println("2. gmin");
		System.out.println("3. smin");
		num = scan.nextInt();
		switch(num) {
		case 1:
			kmin k = new kmin();
			k.air();
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}//switch
	}//main
}
