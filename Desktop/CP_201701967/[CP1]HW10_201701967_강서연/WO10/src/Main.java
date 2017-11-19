import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	private static int inputScore() {
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		Student student = new Student();
		GPACounter counter = new GPACounter();

		System.out.println("> 세 과목 (국어, 영어 컴퓨터)의 점수를 차례로 입력하시오 : ");
		int aScoreKorean = inputScore();
		student.setScoreKorean(aScoreKorean);
		int aScoreEnglish = inputScore();
		student.setScoreEnglish(aScoreEnglish);
		int aScoreComputer = inputScore();
		student.setScoreComputer(aScoreComputer);

		while (aScoreKorean >= 0 && aScoreEnglish >= 0 && aScoreComputer >= 0) {
			if (aScoreKorean > 100 || aScoreEnglish > 100 || aScoreComputer > 100) {
				System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			} else {

				student.printKorean();
				student.printEnglish();
				student.printComputer();
				student.gpa();
				
			}

			System.out.println("> 세 과목 (국어, 영어 컴퓨터)의 점수를 차례로 입력하시오 : ");
			aScoreKorean = inputScore();
			student.setScoreKorean(aScoreKorean);
			aScoreEnglish = inputScore();
			student.setScoreEnglish(aScoreEnglish);
			aScoreComputer = inputScore();
			student.setScoreComputer(aScoreComputer);

		}

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		counter.printCount();
		System.out.println("프로그램을 종료합니다.");

	}

}
