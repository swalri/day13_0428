package singleton;

class A03 {
	private static A03 a;
	int num;
	private A03() {
		System.out.println(num+" 생성자 실행");
	}

	public static A03 getInStance() {
//		System.out.println(a);
		if(a==null) {
			a = new A03();
		}		
		return a;
	}

}

public class MainClass03 {
	public static void main(String[] args) {
		A03 a01 = A03.getInStance();
		A03 a02 = A03.getInStance();
		A03 a03 = A03.getInStance();
		System.out.println("===============");
		a01.num = 100;
		a02.num = 200;
		a03.num = 300;
		System.out.println(a01.num+" : "+a01);
		System.out.println(a02.num+" : "+a02);
		System.out.println(a03.num+" : "+a03);
	}
}
