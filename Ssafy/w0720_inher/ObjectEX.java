package w0720_inher;
//자바에서 생략가능한 것들 

class Exam{
	public String str = " Hello";

	public void view() {
		System.out.println(str);
	}
	
}
public class ObjectEX {
	public static void main(String[] args) {
		new Exam().view();
	}
}

//-------------------------------------------------------------------
/*
// 자바에서 생략가능한 것들 
 * 
import java.lang.String;
import java.lang.System;
class Exam extends Object{
	public String str = " Hello";
	
	public Exam() {
		super();
	}
	public void view() {
		System.out.println(this.str.toString());
	}
	
}
public class ObjectEX {
	public static void main(String[] args) {
		Exam ob = new Exam();
		ob.view();
	}
}
*/