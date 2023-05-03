package singleton;
/*
싱글톤
 - 하나의 객체를 만들어 공유해서 사용하는 것
*/

class A01{
	int num;
	static int cnt;
	public A01() {
		cnt++;
		num++;
		System.out.println(cnt+"객체 생성"+num);
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		A01 a = new A01();
		A01 a1 = new A01();
		A01 a2 = new A01();
		a.num = 100;
		a1.num = 200;
		a2.num = 300;
		System.out.println("01 : "+a.num+" : "+a+" : "+a.cnt);
		System.out.println("02 : "+a1.num+" : "+a1+" : "+a1.cnt);
		System.out.println("03 : "+a2.num+" : "+a2+" : "+a2.cnt);
	}
}


