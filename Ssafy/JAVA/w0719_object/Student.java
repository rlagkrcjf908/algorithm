package w0719_object;
/*
클래스명 : Student
-name:String
-kor:int
-mat:int
-eng:int

+Student()
+Student(name:String,kor:int,mat:int,eng:int)
+setter&getter  
+toString():String

+getTotal():int              <---- kor+eng+mat 를 리턴
+getAvg():double             <---- getTotal()를 3으로 나누어서 평균을 구한후 리턴
+getGrade():char             <---- getAvg()를 이용해서 A,B,C,D,F학점을 구해서 리턴
                                   90점이상 'A', 80점 이상 'B', 70점 이상 'C', 60점 이상 'D', 나머지 'F'
*/
public class Student {
	public String name;
	public int kor;
	public int mat;
	public int eng;
	
	public Student() {
		
	}
	public Student(String name, int kor, int mat, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return name + "의 점수는 " + getTotal() +"점 이며, 평균은 " + getAvg() 
	           +"이고 학점은 " + getGrade() +"입니다";
	}
	
	public int getTotal() {
		return kor + mat + eng;
	}
	
	public double getAvg() {
		return getTotal()/3;
	}
	public char getGrade() {
		if(getAvg()>=90) {
			return 'A';
		}
		else if(getAvg()>=80) {
			return 'B';
		}
		else if(getAvg()>=80) {
			return 'C';
		}
		else if(getAvg()>=80) {
			return 'D';
		}
		else{
			return 'F';
		}
	}

}
