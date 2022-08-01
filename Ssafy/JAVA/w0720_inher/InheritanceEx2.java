package w0720_inher;


class ParentEx{

	public ParentEx()/*extends Object*/ {
		/*super();*/
		System.out.println("parent class");
	}
	
}
class ChildEx extends ParentEx{
	public ChildEx() {
		/*super();*/
		System.out.println("Child class");
	}
}
public class InheritanceEx2 {
	public static void main(String[] args) {
		new ChildEx();
	}
	
}
