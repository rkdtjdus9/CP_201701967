import java.util.Scanner;

public class pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenN;
		int count=1;
		int sum=0;
		
		Scanner myScanner = new Scanner(System.in);
		
		givenN = myScanner.nextInt();
		
		while(count<=givenN){
			sum = sum + count;
			System.out.println("1���� "+count+"������ ����"+sum);
			count = count + 1;
		}
		
		myScanner.close();
	}

}
