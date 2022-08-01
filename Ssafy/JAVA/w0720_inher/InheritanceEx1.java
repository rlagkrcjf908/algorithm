package w0720_inher;

class SuperEx{
	public void view() {
		System.out.println("view1 method");
	}
}

class SubEx extends SuperEx{
	public void view() {
		super.view();
		System.out.println("view2 method");
	}
	
}
public class InheritanceEx1 {
	public static void main(String[] args) {
//		SubEx ob = new SubEx();
//		ob.view();
		
		new SubEx().view();
	
	}
}
//-------------------------------------------------------------------
/*
class SuperEx{
	public void view1() {
		System.out.println("view1 method");
	}
}

class SubEx extends SuperEx{
	public void view2() {
		System.out.println("view2 method");
	}
	
}
public class InheritanceEx1 {
	public static void main(String[] args) {
		SubEx ob = new SubEx();
		ob.view1();
		ob.view2();
	}
}
// 상속으로 인해서 자식 클래스에 있던 부모클래스 내용을 사용할 수 있습니다. 
*/