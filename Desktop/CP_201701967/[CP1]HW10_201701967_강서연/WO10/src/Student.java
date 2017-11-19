public class Student {

	private int _scoreKorean ;
	private int _scoreEnglish;
	private int _scoreComputer;

	
	
	public Student() {
		this._scoreKorean = 0;
		this._scoreEnglish = 0;
		this._scoreComputer = 0;
	}

	public void setScoreKorean(int aScore) {
		this._scoreKorean = aScore;
	}

	public int scoreKorean() {
		return this._scoreKorean;
	}

	public void printKorean(){
		System.out.println("[��  ��] ����: " + this.scoreKorean() + ", ����: " + this.score2Grade(this._scoreKorean) + ", ����: "
						+ this.grade2Point(this.score2Grade(this._scoreKorean)));
	}
	

	public void setScoreEnglish(int aScore) {
		this._scoreEnglish = aScore;
	}

	public int scoreEnglish() {
		return this._scoreEnglish;
	}
	
	public void printEnglish(){
		System.out.println("[��   ��] ����: " + this.scoreEnglish() + ", ����: " + this.score2Grade(this._scoreEnglish) + ", ����: "
						+ this.grade2Point(this.score2Grade(this._scoreEnglish)));
	}


	public void setScoreComputer(int aScore) {
		this._scoreComputer = aScore;
	}

	public int scoreComputer() {
		return this._scoreComputer;
	}
	
	public void printComputer(){
		System.out.println("[��ǻ��] ����: " + this.scoreComputer() + ", ����: " + this.score2Grade(this._scoreComputer) + ", ����: "
						+ this.grade2Point(this.score2Grade(this._scoreComputer)));
	}


	private char score2Grade(int aScore) {
		if (aScore >= 90) {
			return 'A';
		} else if (aScore >= 80) {
			return 'B';
		} else if (aScore >= 70) {
			return 'C';
		} else if (aScore >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	

	private double grade2Point(char aGrade) {
		char currentGrade = aGrade;
		switch (currentGrade) {
		case 'A':
			return 4.0;
		case 'B':
			return 3.0;
		case 'C':
			return 2.0;
		case 'D':
			return 1.0;
		default:
			return 0.0; // case ��F��
		}
	
	}
	
	
	
	public double gpa(){
		double gpaPoint;
		double gradePointKorean, gradePointEnglish, gradePointComputer ;
		gradePointKorean = this.grade2Point(this.score2Grade(this._scoreKorean));
		gradePointEnglish = this.grade2Point(this.score2Grade(this._scoreEnglish));
		gradePointComputer = this.grade2Point(this.score2Grade(this._scoreComputer));
				
		gpaPoint = (gradePointKorean + gradePointEnglish + gradePointComputer) / 3.0;
		
		System.out.println("�� �л��� ��������� "+ gpaPoint + "�Դϴ�.");
		
		return gpaPoint;
	}

	
}
