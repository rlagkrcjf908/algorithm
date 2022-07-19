package w0719_inher;

public class BankAccount {
	private int year;
	private String name;
	private int money;
	private static double rate;
	
	public BankAccount(int year, String name, int money, double r) {
		super();
		this.year = year;
		this.name = name;
		this.money = money;
		rate=r;
	}
	public static void setRate(double r) {
		if(r<0.02 || r>0.12) {
			System.out.println("금리 확인 바람");
			System.exit(0);
		}
		rate = r;
	}// static 관련으로 변경하려면 함수도 static 작성
	public void view() {
		System.out.println(year+"\t"+name+"\t"+money+"\t"+rate);
	}
}
