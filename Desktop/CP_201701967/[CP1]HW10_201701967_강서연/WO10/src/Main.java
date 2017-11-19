import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	private static int inputScore() {
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		Student student = new Student();
		GPACounter counter = new GPACounter();

		System.out.println("> �� ���� (����, ���� ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
		int aScoreKorean = inputScore();
		student.setScoreKorean(aScoreKorean);
		int aScoreEnglish = inputScore();
		student.setScoreEnglish(aScoreEnglish);
		int aScoreComputer = inputScore();
		student.setScoreComputer(aScoreComputer);

		while (aScoreKorean >= 0 && aScoreEnglish >= 0 && aScoreComputer >= 0) {
			if (aScoreKorean > 100 || aScoreEnglish > 100 || aScoreComputer > 100) {
				System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			} else {

				student.printKorean();
				student.printEnglish();
				student.printComputer();
				student.gpa();
				
			}

			System.out.println("> �� ���� (����, ���� ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
			aScoreKorean = inputScore();
			student.setScoreKorean(aScoreKorean);
			aScoreEnglish = inputScore();
			student.setScoreEnglish(aScoreEnglish);
			aScoreComputer = inputScore();
			student.setScoreComputer(aScoreComputer);

		}

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		counter.printCount();
		System.out.println("���α׷��� �����մϴ�.");

	}

}
