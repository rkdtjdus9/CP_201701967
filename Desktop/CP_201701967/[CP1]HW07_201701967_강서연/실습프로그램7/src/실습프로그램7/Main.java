package 실습프로그램7;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	private static int inputScore() {
	
		int n;
		n = scanner.nextInt();
		return n;
	}

	private static char score2Grade(int aScore) {

		char grade;

		if (aScore >= 90 && aScore <= 100) {
			grade = 'A';
		} else if (aScore >= 80 && aScore <= 89) {
			grade = 'B';
		} else if (aScore >= 70 && aScore <= 79) {
			grade = 'C';
		} else if (aScore >= 60 && aScore <= 69) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;

	}

	private static double grade2Point(char aGrade) {

		double nGrade;

		if (aGrade == 'A') {
			nGrade = 4.0;
		} else if (aGrade == 'B') {
			nGrade = 3.0;
		} else if (aGrade == 'C') {
			nGrade = 2.0;
		} else if (aGrade == 'D') {
			nGrade = 1.0;
		} else {
			nGrade = 0.0;
		}
		return nGrade;

	}

	private static double calcGPA(double koreanpoint, double englishpoint, double computerpoint) {

		double gpa = (koreanpoint + englishpoint + computerpoint) / 3;

		return gpa;

	}

	public static void main(String[] args) {

		int koreanScore;
		int englishScore;
		int computerScore;
		int count4 = 0;
		int count3 = 0;
		int count2 = 0;
		int count1 = 0;
		int count0 = 0;
		

		System.out.print("> 세 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력합니다: ");
		koreanScore = inputScore();
		englishScore = inputScore();
		computerScore = inputScore();

		while ((koreanScore >= 0) && (englishScore >= 0) && (computerScore >= 0)) {
			if ((koreanScore > 100) || (englishScore > 100) || (computerScore > 100)) {

				System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닙니다.");
			}

			else {

				char koreangrade = score2Grade(koreanScore);
				double koreanpoint = grade2Point(koreangrade);
				System.out
						.println("[국  어] 점수: " + koreanScore + ", 학점: " + koreangrade + ", 평점 : " + koreanpoint + ")");

				char englishgrade = score2Grade(englishScore);
				double englishpoint = grade2Point(englishgrade);
				System.out.println(
						"[영  어] 점수: " + englishScore + ", 학점: " + englishgrade + ", 평점 : " + englishpoint + ")");

				char computergrade = score2Grade(computerScore);
				double computerpoint = grade2Point(computergrade);
				System.out.println(
						"[컴퓨터] 점수: " + computerScore + ", 학점: " + computergrade + ", 평점 : " + computerpoint + ")");

				System.out.println("이 학생의 평균평점은 " + calcGPA(koreanpoint, englishpoint, computerpoint) + "입니다.");

				

				if (calcGPA(koreanpoint, englishpoint, computerpoint) >= 4.0) {
					count4++;
				} else if (calcGPA(koreanpoint, englishpoint, computerpoint) >= 3.0
					
						&& calcGPA(koreanpoint, englishpoint, computerpoint) < 4.0) {
					count3++;
				} else if (calcGPA(koreanpoint, englishpoint, computerpoint) >= 2.0
						&& calcGPA(koreanpoint, englishpoint, computerpoint) < 3.0) {
					count2++;
				} else if (calcGPA(koreanpoint, englishpoint, computerpoint) >= 1.0
						&& calcGPA(koreanpoint, englishpoint, computerpoint) < 2.0) {
					count1++;
				} else {
					count0++;
				}
				

			}

			System.out.print("> 세 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력합니다: ");
			koreanScore = inputScore();
			englishScore = inputScore();
			computerScore = inputScore();
		}

		System.out.println("음의 정수가 입력되어 프로그램을 종료합니다.");
		
		System.out.println("평균평점이 4.0 이상인 학생은 "+count4+"명 입니다.");
		System.out.println("평균평점이 3.0 이상 4.0미만인 학생은 "+count3+"명 입니다.");
		System.out.println("평균평점이 2.0 이상 3.0미만인 학생은 "+count2+"명 입니다.");
		System.out.println("평균평점이 1.0 이상 2.0미만인 학생은 "+count1+"명 입니다.");
		System.out.println("평균평점이 1.0 미만인 학생은 "+count0+"명 입니다.");
		System.out.println("프로그램을 종료합니다.");

	}

}
