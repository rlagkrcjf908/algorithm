package w0719_object;

public class ConstructorEx2 {
	public ConstructorEx2() {
		this("ABC",100);
		System.out.println("default constructor");
	}
	public ConstructorEx2(String s) {
		this();
	System.out.println(s + "constructor");

	}
	public ConstructorEx2(String s, int i) {
		System.out.println(s + " " + i + "constructor");
	}
	public static void main(String[] args) {
	new ConstructorEx2("ABC");
}
}
/*
ABC 100constructor
default constructor
ABCconstructor
*/

//-------------------------------------------

/*
 public class ConstructorEx2 {
	public ConstructorEx2() {
		System.out.println("default constructor");
	}
	public ConstructorEx2(String s) {
		this();
		System.out.println(s + "constructor");

	}
	public ConstructorEx2(String s, int i) {
		this(s); // or this("ABC");
		System.out.println(s + " " + i + "constructor");
	}
	public static void main(String[] args) {
	new ConstructorEx2("ABC", 100);
}
}
*/