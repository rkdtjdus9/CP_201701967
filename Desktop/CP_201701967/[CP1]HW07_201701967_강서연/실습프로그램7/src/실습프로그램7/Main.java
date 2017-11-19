package �ǽ����α׷�7;

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
		

		System.out.print("> �� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��մϴ�: ");
		koreanScore = inputScore();
		englishScore = inputScore();
		computerScore = inputScore();

		while ((koreanScore >= 0) && (englishScore >= 0) && (computerScore >= 0)) {
			if ((koreanScore > 100) || (englishScore > 100) || (computerScore > 100)) {

				System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴմϴ�.");
			}

			else {

				char koreangrade = score2Grade(koreanScore);
				double koreanpoint = grade2Point(koreangrade);
				System.out
						.println("[��  ��] ����: " + koreanScore + ", ����: " + koreangrade + ", ���� : " + koreanpoint + ")");

				char englishgrade = score2Grade(englishScore);
				double englishpoint = grade2Point(englishgrade);
				System.out.println(
						"[��  ��] ����: " + englishScore + ", ����: " + englishgrade + ", ���� : " + englishpoint + ")");

				char computergrade = score2Grade(computerScore);
				double computerpoint = grade2Point(computergrade);
				System.out.println(
						"[��ǻ��] ����: " + computerScore + ", ����: " + computergrade + ", ���� : " + computerpoint + ")");

				System.out.println("�� �л��� ��������� " + calcGPA(koreanpoint, englishpoint, computerpoint) + "�Դϴ�.");

				

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

			System.out.print("> �� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��մϴ�: ");
			koreanScore = inputScore();
			englishScore = inputScore();
			computerScore = inputScore();
		}

		System.out.println("���� ������ �ԷµǾ� ���α׷��� �����մϴ�.");
		
		System.out.println("��������� 4.0 �̻��� �л��� "+count4+"�� �Դϴ�.");
		System.out.println("��������� 3.0 �̻� 4.0�̸��� �л��� "+count3+"�� �Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0�̸��� �л��� "+count2+"�� �Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0�̸��� �л��� "+count1+"�� �Դϴ�.");
		System.out.println("��������� 1.0 �̸��� �л��� "+count0+"�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
