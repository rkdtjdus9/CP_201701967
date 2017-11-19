
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

		System.out.print(">������ �Է��Ͻÿ�: ");
		score = inputScore();

		while (score >= 0) {
			if (score > 100) {
				System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴմϴ�.");
			} 
			else {
				scores[numberOfStudents] = score;

				numberOfStudents++;
				average = calcAverage(scores, numberOfStudents);

			}

			System.out.print(">������ �Է��Ͻÿ�: ");
			score = inputScore();

		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� " + numberOfStudents + " ���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� " + average + " �Դϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");

	
		while (count < numberOfStudents) {
			if ((double) scores[count] >= average) {
				System.out.println("[" + count + "] " + scores[count] + " (����̻��Դϴ�)");
				aboveAverage++;
			} else {
				System.out.println("[" + count + "] " + scores[count] + " (��չ̸��Դϴ�)");
			}
			count++;
		}
		
		System.out.println("��� �̻��� �л����� " + aboveAverage + " �� �Դϴ�.");
		System.out.println();
		System.out.println("�ְ����� "+calcMax(scores, numberOfStudents)+" ���Դϴ�");
		System.out.println("�������� "+calcMin(scores, numberOfStudents)+" ���Դϴ�");
		System.out.println();
		System.out.println("�������� ������ �����ϴ�.");
		selectionSort(scores, numberOfStudents);
		count=0;
		while(count< numberOfStudents){
			System.out.println("["+count+"] "+ scores[count] );
			count++;
		}
		
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");

	}

}
