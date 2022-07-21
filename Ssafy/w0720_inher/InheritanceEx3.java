package w0720_inher;


class Branch{
	public Branch() {
		System.out.println("default Branch constructor");
	}
    public Branch(String s, int i) {
    	this();
    	System.out.println(s + " " + i + " "+ "Branch constructor");
	}
}

class Leaf extends Branch{
	public Leaf() {
		this("ABC");
		System.out.println("default Leaf constructor");
		
	}
	
    public Leaf(String s) {
		super(s, 10);
    	System.out.println(s+" Leaf constructor");
    	
    }
}

public class InheritanceEx3 {
	public static void main(String[] args) {
		new Leaf();
	}
}
/*
 default Leaf Constuctor
 ABC Leaf Constuctor
 ABC 10 Branch Cinstuctor
 default Leaf Constuctor
 */

//--------------------------------------------------------------------------------------
/*
class Branch{
	public Branch() {
		System.out.println("default Branch constructor");
	}
	public Branch(String s) {
		this();
		System.out.println(s + " Branch constructor");
	}
}

class Leaf extends Branch{
	public Leaf(String s) {
		super(s);
		System.out.println(s + " Leaf constructor");
	}
}

public class InheritanceEx3 {
	public static void main(String[] args) {
		new Leaf("가나다");
	}
}
*/