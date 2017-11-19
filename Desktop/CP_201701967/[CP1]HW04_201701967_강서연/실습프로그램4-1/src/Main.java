import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner=new Scanner(System.in);

		double  a, b, c ;
		double  determinant ;
		double  x1, x2 ;

		System.out.println("이차방정식을 풀겠습니까? ");
		System.out.print("풀고자 하면 Y를 입력하시오. ");
		char userAnswer = aScanner.next().charAt(0);

		while (userAnswer == 'Y') {

			System.out.println("2차항의 계수는");
			a = aScanner.nextDouble();

			System.out.println("1차항의 계수는");
			b = aScanner.nextDouble();

			System.out.println("상수는");
			c = aScanner.nextDouble() ;

			determinant=b*b-4*a*c;
			System.out.println ("a=" + a + "b=" + b +"c=" + c) ;

			determinant = b*b - 4.0*a*c ;
			if ((determinant > -0.000001) && (determinant < 0.000001)){
				x1 = (-b + Math.sqrt(determinant)) / (2.0*a) ;
				x2 = (-b - Math.sqrt(determinant)) / (2.0*a) ;
				System.out.println("The solution is either"+x1+"  or  "+x2) ;}

			else if(determinant >0){
				x1 = (-b + Math.sqrt(determinant)) / (2.0*a) ;
				x2 = (-b - Math.sqrt(determinant)) / (2.0*a) ;
				System.out.println("The solution is either"+x1+"  or  "+x2) ;}

			else if (determinant<0){
				System.out.println("실근이 존재하지 않습니다.");}
			
			System.out.println("이차방정식을 다시 계산하시겠습니까?");
			System.out.println("계산하려면 'Y'를 치십시오.");
			userAnswer= aScanner.next().charAt(0);




		}

		System.out.println("프로그램을 종료합니다.");

		aScanner.close();

	}

}
