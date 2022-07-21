package w0720_interfaceex;
//인터페이스------------------------------------------------------
interface Flyable{
	 public void fly();
}

interface Cryable{
	public void cry();
}

class Eagle implements Flyable, Cryable{

	@Override
	public void fly() {
		System.out.println("독수리는 날아다닙니다");
		cry();
	}

		@Override
		public void cry() {
			System.out.println("캬악~~~캬악~~~");
		}
		
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		new Eagle().fly();
	}
}
/*//추상클래스------------------------------------------------------
abstract class Flyable{
	abstract public void fly();
}

abstract class Cryable{
	abstract public void cry();
}

class Eagle extends Flyable{

	@Override
	public void fly() {
		System.out.println("독수리는 날아다닙니다");
		new CryableEx().cry();
	}
	//중첩클래스(inner class) 클래스 안에서 또 다른 클래스를 정의하는 것 
	class CryableEx extends Cryable{

		@Override
		public void cry() {
			System.out.println("캬악~~~캬악~~~");
		}
		
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		new Eagle().fly();
	}
}
*/