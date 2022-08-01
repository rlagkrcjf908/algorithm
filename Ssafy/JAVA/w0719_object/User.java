package w0719_object;


public class User {
	public String name;
	public int k;
	public int e;
	public int m;
	public void setUser(String name, int k, int e, int m) {
		this.name = name;
		this.k = k;
		this.e = e;
		this.m = m;
	}
	public int getTotal() {
		return k+e+m;
	}
	public String getUser() {
		//return "나의 이름은 " +name+"이고 총점은"+getTotal()+"입니다.";
		return String.format("나의 이름은 %s 이고 총점은 %d 입니다.", name,this.getTotal());
	}
}

