package inheritance;

import java.util.ArrayList;

class A03 {
	ArrayList<String> arr;

	public A03() {
		arr = new ArrayList<>();
	}

	public ArrayList<String> getArr() {
		return arr;
	}

	public void setArr(ArrayList<String> arr) {
		this.arr = arr;
	}

}

public class MainClass03 {
	public static void main(String[] args) {
		A03 a = new A03();
		a.arr.add("afasdf");
		System.out.println(a.arr.get(0));
	}
}
