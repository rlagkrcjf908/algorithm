package w0720_family;

public class Family {
	String name;
	public Family() {
		
	}
	public Family(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "이름 : " +name+"\n";
	}
	
}
