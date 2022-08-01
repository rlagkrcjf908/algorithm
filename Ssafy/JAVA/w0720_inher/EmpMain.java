package w0720_inher;

public class EmpMain {
	public static void main(String[] args) {
		Emp ob1 = new Emp("이순신", "010-1111-1111");
		System.out.println(ob1);
		
		EmpScore ob2 = new EmpScore("강호동", "010-1111-1111", 75.3, 'C');
		System.out.println(ob2);
	}
}
