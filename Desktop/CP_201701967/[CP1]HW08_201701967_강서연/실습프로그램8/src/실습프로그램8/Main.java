package 실습프로그램8;

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
		
		System.out.print(">두 과목(국어, 컴퓨터)의 점수를 차례로 입력하시오:");
		score_korean = inputScore();
		score_computer = inputScore();
		
		while((score_korean >=0) && (score_computer>=0)){
			if((score_korean>100) || (score_computer>100)){
				System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닙니다.");
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
			
			System.out.print(">두 과목(국어, 컴퓨터)의 점수를 차례로 입력하시오:");
				score_korean = inputScore();
				score_computer = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+" 명의 성적이 입력되었습니다.");
		System.out.println();
		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		while(count<numberOfStudents){
			System.out.println("["+count+"] "+scoreskorean[count]+" "+scorescomputer[count]+" (평균 "+averages[count]+")");
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
		System.out.println("학급 평균은 "+classAverage+" 입니다.");
		System.out.println("평균 이상인 학생의 수는 "+aboveAverage+" 명입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
		
		
	}

}
