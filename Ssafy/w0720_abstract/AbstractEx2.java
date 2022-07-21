package w0720_abstract;


abstract class Shape{
	abstract public void draw();
	abstract public void erase();
}
//------------------------------------------------------------------------
class Rectangle extends Shape{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
	}

	@Override
	public void erase() {
		System.out.println("사각형을 지운다");

	}
	
}
//------------------------------------------------------------------------
class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");

	}

	@Override
	public void erase() {
		System.out.println("삼각형을 지운다");

	}
	
}
//------------------------------------------------------------------------
public class AbstractEx2 {
	public static void main(String[] args) {
		Shape ob = new Triangle();
		ob.draw();
		ob.erase();
		
		ob = new Rectangle();
		ob.draw();
		ob.erase();
	}
}
