package inheritance;
class A05{
	public A05(int num) {
		System.out.println(num+" : 생성자");
	}
}
class B05 extends A05{
	public B05(int i) {
		super(i);//부모에게 넘겨주는 값
		System.out.println("자식");
	}
	
}
public class MainClass05 {
	public static void main(String[] args) {
		A05 a = new A05(100);
		A05 b = new B05(40);
		B05 bb = new B05(100);
	}
}


