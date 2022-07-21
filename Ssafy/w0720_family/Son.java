package w0720_family;

public class Son extends Family implements Job{
	public Son() {
		
	}
	public Son(String name) {
		super(name);
	}
	public String work() {
		return "공부를 한다";
	}
	@Override
	public String toString() {
		return "이름 : "+name+"\n"+work();
	}
}
