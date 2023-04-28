package inheritance;
/*
상속
 - 부모, 자식 관계를 가지고 있다
 - 부모가 가지고 있는 코드를 그대로 물려받아 사용하는 것
 - extends를 사용하여 상속 받는다

*/
class Calc{
	public void calc() {
		System.out.println("계산기");
	}
}
class Computer extends Calc{
	public void computer() {
		System.out.println("컴퓨터");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
//		Calc c = new Calc();
//		c.calc();g,
		Computer pc = new Computer();
		pc.calc();
	}
}


