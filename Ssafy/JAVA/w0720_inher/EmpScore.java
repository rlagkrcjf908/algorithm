package w0720_inher;

public class EmpScore extends Emp{
	private double score;
	private char grade;
	
	public EmpScore() {
		super();
	}
	
	public EmpScore(String name, String phone, double score, char grade) {
		super(name, phone);
		this.grade = grade;
		this.score = score;
	}

	@Override
	public String toString() {
		return super.toString()+"나의 점수는" + score+"이고 학점은"+grade+"이다";
	}
	
	
			
}
