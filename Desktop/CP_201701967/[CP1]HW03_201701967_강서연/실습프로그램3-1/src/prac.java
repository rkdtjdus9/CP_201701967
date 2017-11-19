import java.util.Scanner;
public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner=new Scanner(System.in);
		
		double  a, b, c ;
		double  determinant ;
		double  x1, x2 ;
		
		System.out.println("2차항의 계수는");
		a = myScanner.nextDouble();
		
		System.out.println("1차항의 계수는");
		b = myScanner.nextDouble();
		
		System.out.println("상수는");
		c = myScanner.nextDouble() ;
		
		determinant=b*b-4*a*c;
		System.out.println ("a=" + a + "b=" + b +"c=" + c) ;
		
		determinant = b*b - 4.0*a*c ;
		if ((determinant > -0.000001) && (determinant < 0.000001)){
		x1 = (-b + Math.sqrt(determinant)) / (2.0*a) ;
		x2 = (-b - Math.sqrt(determinant)) / (2.0*a) ;
		System.out.println("The solution is either"+x1+"  or  "+x2) ;
		}
		else if(determinant >0){
			x1 = (-b + Math.sqrt(determinant)) / (2.0*a) ;
			x2 = (-b - Math.sqrt(determinant)) / (2.0*a) ;
			System.out.println("The solution is either"+x1+"  or  "+x2) ;
		}
		else if (determinant<0){
			System.out.println("실근이 존재하지 않습니다.");
		
			
		}
	
		myScanner.close();
	}
	

}
