package Quiz.scoreClass;

public class Score {
	String name;
	int kor, eng, com ,total;
	double avg;
	char grade;
	
	
	public Score(int kor, int eng, int com) { //생성자함수
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}
	
	
	public Score(int total, char grade) { //생성자함수
		
		switch(total/30) {
		case 10: case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		case 5: grade='E'; break;
		default : grade='F';
		}
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public void setK(int kor1) { kor = kor1; }
	public int getK() { return kor; }
	
	public void setE(int eng1) {eng = eng1;}
	public int getE() {return eng;}
	
	public void setC(int com1) {com = com1;}
	public int getC() {return com;}
	
	public void setT(int tot) {total = tot;}
	public int getT() {return total;}
	
	public void setA(double avg1) {avg = (double)avg1/3;}
	public double getA() { return avg;}
	
	public void setG(char gde) {grade = gde;}
	public char getG() {return grade;}
	
	
	
	
	
	public void disp() {
		System.out.print("\n***********"+name+"의 성적표********\n");
		System.out.print("kor = "+kor+"\teng = "+eng+"\tcom = "+com+"\n");
		System.out.printf("총점은 %d,\t평균은 %.2f,\t성적은 %c",total, avg, grade );
	}
	
	

}
