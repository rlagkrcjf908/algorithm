package w0720_family;

public class Mother extends Family implements Job {
	public Mother() {
		
	}
	public Mother(String name) {
		super(name);

	}
	public String work() {
		return "집안일을 한다";
	}
	@Override
	public String toString() {
		return "이름 : "+name+"\n"+work();
	}
}
