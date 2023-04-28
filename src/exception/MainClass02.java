package exception;

public class MainClass02 {
	public static void main(String[] args) {
		int num=2;
		while(true) {
			System.out.println("실행");
			try {
				System.out.println(10/num);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("0으로는 나눌수 없음");
				break;
			}
			num--;
		}
	}
}


