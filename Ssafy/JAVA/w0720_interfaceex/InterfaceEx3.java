package w0720_interfaceex;
/* class와 interface를 이용하여 성적처리
 * 클래스명 : User
 *  -name:String
 *  +User()
 *  +User(name:String)
 *  +toString():String    --> "이름 : 홍길동" 를  리턴
 *  
 *  인터페이스명 : Score
 *  +sol:int           // 초깃값:20
 *  +getScore():int    // 맞은수 * sol을 리턴
 *  
 *  인터페이스명 : Print
 *  +toPaint():String
 *  
 *  [출력화면]
 *  이름 : 홍길동
 *  점수 : 60점
 */
class User {
	private String name;
	public User() {
		
	}
	public User(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return  name;
	}
	
	
}
interface Score{
	 public int sol = 20;
	 int getScore();
}
interface Print{
	 String toPaint();
	
}
public class InterfaceEx3 extends User implements Score,Print {
	int s; // 맞은수

	public InterfaceEx3(String string, int i) {
		super(string);
		this.s=i;
	}

	public static void main(String[] args) {
		InterfaceEx3 ob = new InterfaceEx3("홍길동", 3);
		System.out.println(ob.toPaint());
	}

	@Override
	public String toPaint() {
		return "이름 : " + toString()+ "\n점수 : " + getScore();
	}

	@Override
	public int getScore() {
		return sol*s;
	}

}
