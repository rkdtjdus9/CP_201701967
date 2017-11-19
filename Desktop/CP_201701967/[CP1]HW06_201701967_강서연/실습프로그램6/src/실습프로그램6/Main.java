package 실습프로그램6;

import java.util.Scanner;

public class Main {

	public static void printAsterisks (int n) {
		int i=0;
		while(i<n){
			System.out.print("*");
			i++;
		}
		System.out.println();
	}
	
	private static int inputNumber(){
		Scanner scanner = new Scanner(System.in);	
		int n;
		n = scanner.nextInt();
		return n;

	}
	
	private static double  mySine (double x) { 
		double  xSquare = x * x ;
		double  currentTerm = x ;
		int  n = 2 ;
		double sineValue = currentTerm ;
		while ( Math.abs(currentTerm) >= 0.000001 ) { 
			currentTerm = - currentTerm * xSquare / (double) ( n*(n+1) ) ;
			sineValue = sineValue + currentTerm ;
			n = n + 2 ;
			}
		return  sineValue ;
		}

	
	public static void main(String[] args) {

		int n = 1;
		
		
		
		while(n < 180){
		
			double x;
			double y;
			int numberOfAsterisks;
			
			x = (double) n * (3.141592 / 180.0) ; 
			y = mySine(x);
			numberOfAsterisks = (int) (( y * 40.0) + 0.5 ) ;
			
			
			if(n>=1 && n<=9){
				System.out.print("sine(00"+n+"도):");
			}
			else if(n>=10 && n<=99){
				System.out.print("sine(0"+n+"도):");
			}
			else{
				System.out.print("sine("+n+"도):");
			}
			
			
			printAsterisks(numberOfAsterisks);
			//System.out.println();
			//System.out.print("양의 정수 (종료하려면 음수)를 입력하시오: ");
			n= n +5;

			
		}
		
		//System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
	}

}
