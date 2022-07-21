package w0720_inher;
// 오버로딩 : 같은이름의 메서드를 여러번 구현하는 것 메서드의 이름을 절약할 수 있다
public class OverloadEx {
	int a=20;
	int b=15;
	public int max() {
		return(a > b) ? a : b;
	}
	public int max(int a, int b) {
		return(a > b) ? a : b;
	}
	public char max(char a, char b) {
		return(a > b) ? a : b;
	}
	public static void main(String[] args) {
		OverloadEx ob = new OverloadEx();
		System.out.println("큰 수 :" + ob.max());
		System.out.println("큰 수 :" + ob.max(30, 50));
		System.out.println("큰 수 :" + ob.max('Z', 'B'));

	}
}
