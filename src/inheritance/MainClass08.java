package inheritance;
class A08{
	public void a() {
		System.out.println("aaa");
	}
}
class B08 extends A08{
	public void b() {
		System.out.println("bbb");
	}
}
class C08 extends B08{
	public void c() {
		System.out.println("ccc");
	}
}
public class MainClass08 {
	public static void main(String[] args) {
		C08 c = new C08();
		c.a();
		c.b();
		c.c();
		
	}
}


