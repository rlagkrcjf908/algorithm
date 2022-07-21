package w0720_family;

public class Father extends Family implements Job {
	public Father() {
		
	}
	public Father(String name) {
		super(name);
	}
	public String work() {
		return "나가서 일을한다";
	}
	@Override
	public String toString() {
		return "이름 : "+name+"\n"+work();
	}
	
}
