package inheritance;

import java.util.ArrayList;

class A02 extends ArrayList<String>{
	
}
public class MainClass02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.add("1111");
		System.out.println(a.get(0));
	}
}


