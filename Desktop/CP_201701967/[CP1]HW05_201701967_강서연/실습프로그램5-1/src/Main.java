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
		
		System.out.println("성적을 입력하시오: ");
		score= scanner.nextInt();
		while (score>=0){
			if(score>100){
				System.out.println("오류:100이 넘는 성적이 입력되었습니다.");
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
				
				System.out.println("(성적: "+score+" 등급: "+grade+")");
				
			}
			
			
			count=count+1;
			total=total+score;
			
			System.out.println("성적을 입력하시오:");
			score=scanner.nextInt();
			
		}
		
		System.out.println("성적입력을 종료합니다.");
		
		scanner.close();
		
		average = (double) total / (double) count ;
		
		System.out.println("학생수는 "+count+"명 입니다.");
		System.out.println("A는 "+  counta +"명 입니다.");
		System.out.println("B는 "+  countb +"명 입니다.");
		System.out.println("C는 "+  countc +"명 입니다.");
		System.out.println("D는 "+  countd +"명 입니다.");
		System.out.println("F는 "+  countf +"명 입니다.");
		System.out.println("평균은 "+average+" 입니다.");

	}

}
