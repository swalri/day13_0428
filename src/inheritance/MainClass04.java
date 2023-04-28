package inheritance;

class A04 {
	public A04() {
		System.out.println("부모");
	}
}

class B04 extends A04 {
	public B04() {
		System.out.println("자식");
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		A04 a = new B04();
		B04 b = new B04();
	}
}
