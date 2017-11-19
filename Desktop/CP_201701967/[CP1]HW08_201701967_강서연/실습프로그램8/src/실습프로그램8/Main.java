package �ǽ����α׷�8;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	private static int inputScore(){
		
		int scoreScanner;
		scoreScanner = scanner.nextInt();
		return scoreScanner;
	
	}
	
	private static final int MAX_SIZE = 100 ;
	
	public static void main(String[] args) {	

		int numberOfStudents=0;
		int score_korean ;
		int score_computer;
		int[] scoreskorean= new int[MAX_SIZE];
		int[] scorescomputer= new int[MAX_SIZE];
		double average;
		double classAverage = 0;
		double sumAverage = 0;
		int aboveAverage=0;
		double[] averages = new double[MAX_SIZE];
		int count=0;
		
		System.out.print(">�� ����(����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�:");
		score_korean = inputScore();
		score_computer = inputScore();
		
		while((score_korean >=0) && (score_computer>=0)){
			if((score_korean>100) || (score_computer>100)){
				System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else{
				scoreskorean[numberOfStudents] = score_korean;
				scorescomputer[numberOfStudents] = score_computer;
				average= (score_korean+score_computer) / 2 ;
				averages[numberOfStudents] = average;
				
				
				sumAverage = sumAverage + average;
				numberOfStudents++;
				classAverage = (double)sumAverage/(double)numberOfStudents;
				
				
				
			}
			
			System.out.print(">�� ����(����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�:");
				score_korean = inputScore();
				score_computer = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+" ���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		while(count<numberOfStudents){
			System.out.println("["+count+"] "+scoreskorean[count]+" "+scorescomputer[count]+" (��� "+averages[count]+")");
			count++;
			
		}
		
		
		count=0;
		while(count<numberOfStudents){
			if ((double)averages[count]>=classAverage){
				aboveAverage++;
			}
			count++;
		}
		
		System.out.println();
		System.out.println("�б� ����� "+classAverage+" �Դϴ�.");
		System.out.println("��� �̻��� �л��� ���� "+aboveAverage+" ���Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
		
		
		
	}

}
