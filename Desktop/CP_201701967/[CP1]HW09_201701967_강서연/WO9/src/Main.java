
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	private static int inputScore() {

		int scoreScanner;
		scoreScanner = scanner.nextInt();
		return scoreScanner;

	}

	private static final int MAX_SIZE = 100;

	private static double calcAverage(int[] elements, int aSize) {
		int i = 0;
		int sum = 0;
		double average;
		while (i <= aSize) {
			sum = sum + elements[i];
			i++;
		}
		average = (double) sum / (double) (aSize);
		return average;

	}

	private static void selectionSort(int[] elements, int aSize) {

		int lastLoc = aSize - 1;
		int maxLoc;
		int maxValue;
		int selectionLoc = 0;
		int curLoc;
		while (selectionLoc < lastLoc) {
			maxLoc = selectionLoc;
			maxValue = elements[maxLoc];
			curLoc = selectionLoc + 1;
			while(curLoc<=lastLoc){
				if(elements[curLoc] >= maxValue){
					maxLoc=curLoc;
					maxValue = elements[maxLoc];
				}
				curLoc++;
			}
			elements[maxLoc]=elements[selectionLoc];
			elements[selectionLoc] = maxValue;
			
			selectionLoc++;
		}
	}

	private static int calcMin (int[] elements, int aSize) {
		int i = 1;
		int min= elements[0] ;
		while (i<aSize){
			if(min>elements[i]){
				min = elements[i];
			}
			i++;
		}
		return min;
	}

	private static int calcMax(int[] elements, int aSize) {
		int i = 1;
		int max= elements[0] ;
		while (i<aSize){
			if(max<elements[i]){
				max = elements[i];
			}
			i++;
		}
		return max;

	}

	public static void main(String[] args) {

		int numberOfStudents = 0;
		int score;
		int[] scores = new int[MAX_SIZE];
		double average = 0;
		//double[] averages = new double[MAX_SIZE];
		int count = 0;
		int aboveAverage = 0;

		System.out.print(">점수를 입력하시오: ");
		score = inputScore();

		while (score >= 0) {
			if (score > 100) {
				System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닙니다.");
			} 
			else {
				scores[numberOfStudents] = score;

				numberOfStudents++;
				average = calcAverage(scores, numberOfStudents);

			}

			System.out.print(">점수를 입력하시오: ");
			score = inputScore();

		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 " + numberOfStudents + " 명의 성적이 입력되었습니다.");
		System.out.println("평균은 " + average + " 입니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");

	
		while (count < numberOfStudents) {
			if ((double) scores[count] >= average) {
				System.out.println("[" + count + "] " + scores[count] + " (평균이상입니다)");
				aboveAverage++;
			} else {
				System.out.println("[" + count + "] " + scores[count] + " (평균미만입니다)");
			}
			count++;
		}
		
		System.out.println("평균 이상인 학생수는 " + aboveAverage + " 명 입니다.");
		System.out.println();
		System.out.println("최고점은 "+calcMax(scores, numberOfStudents)+" 점입니다");
		System.out.println("최저점은 "+calcMin(scores, numberOfStudents)+" 점입니다");
		System.out.println();
		System.out.println("성적순은 다음과 같습니다.");
		selectionSort(scores, numberOfStudents);
		count=0;
		while(count< numberOfStudents){
			System.out.println("["+count+"] "+ scores[count] );
			count++;
		}
		
		System.out.println();
		System.out.println("프로그램을 종료합니다.");

	}

}
