import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner=new Scanner(System.in);

		double  a, b, c ;
		double  determinant ;
		double  x1, x2 ;

		System.out.println("������������ Ǯ�ڽ��ϱ�? ");
		System.out.print("Ǯ���� �ϸ� Y�� �Է��Ͻÿ�. ");
		char userAnswer = aScanner.next().charAt(0);

		while (userAnswer == 'Y') {

			System.out.println("2������ �����");
			a = aScanner.nextDouble();

			System.out.println("1������ �����");
			b = aScanner.nextDouble();

			System.out.println("�����");
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
				System.out.println("�Ǳ��� �������� �ʽ��ϴ�.");}
			
			System.out.println("������������ �ٽ� ����Ͻðڽ��ϱ�?");
			System.out.println("����Ϸ��� 'Y'�� ġ�ʽÿ�.");
			userAnswer= aScanner.next().charAt(0);




		}

		System.out.println("���α׷��� �����մϴ�.");

		aScanner.close();

	}

}
