import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		int score;
		int count=0;
		int total=0;
		double average;
		
		int counta=0;
		int countb=0;
		int countc=0;
		int countd=0;
		int countf=0;
		
		System.out.println("������ �Է��Ͻÿ�: ");
		score= scanner.nextInt();
		while (score>=0){
			if(score>100){
				System.out.println("����:100�� �Ѵ� ������ �ԷµǾ����ϴ�.");
			}
			else {
				
				char grade;
				
				
				
				if(score >= 90 && score <= 100){
					grade='A';
					counta=counta+1;
				}
				else if (score >= 80 && score <= 89) {
					grade = 'B' ; 
					countb=countb+1;
				}
				else if (score >= 70 && score <= 79) {
					grade = 'C' ; 
					countc=countc+1;
				}
				else if (score >= 60 && score <= 69) {
					grade = 'D' ; 
					countd=countd+1;
				}
				else {
					grade = 'F' ; 
					countf=countf+1;
				}
				
				System.out.println("(����: "+score+" ���: "+grade+")");
				
			}
			
			
			count=count+1;
			total=total+score;
			
			System.out.println("������ �Է��Ͻÿ�:");
			score=scanner.nextInt();
			
		}
		
		System.out.println("�����Է��� �����մϴ�.");
		
		scanner.close();
		
		average = (double) total / (double) count ;
		
		System.out.println("�л����� "+count+"�� �Դϴ�.");
		System.out.println("A�� "+  counta +"�� �Դϴ�.");
		System.out.println("B�� "+  countb +"�� �Դϴ�.");
		System.out.println("C�� "+  countc +"�� �Դϴ�.");
		System.out.println("D�� "+  countd +"�� �Դϴ�.");
		System.out.println("F�� "+  countf +"�� �Դϴ�.");
		System.out.println("����� "+average+" �Դϴ�.");

	}

}
