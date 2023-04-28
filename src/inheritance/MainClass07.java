package inheritance;

import java.util.ArrayList;

class A07 extends ArrayList<String>{
	public void test() {
		System.out.println("부모 test");
	}
}
class B07 extends A07{
	public void bbb() {
		System.out.println("자식 bbb");
		super.test();//부모
		this.test();//자식
	}
	public void test() {
		System.out.println("자식 test");
	}
}
public class MainClass07 {
	public static void main(String[] args) {
		B07 b = new B07();
		b.bbb();
		
		
	}
}


