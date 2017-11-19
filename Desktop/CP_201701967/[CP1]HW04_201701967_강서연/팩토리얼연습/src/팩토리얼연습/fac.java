package 팩토리얼연습;

import java.util.Scanner;

public class fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int fact = 0;
		int i;

		System.out.println("Factorial을 계산하시겠습니까?");
		System.out.println("계산하려면 'Y'를 치십시오.");
		char userAnswer= scanner.next().charAt(0);

		while (userAnswer=='Y'){


			System.out.println("N값을 입력하시오. ");
			int givenN= scanner.nextInt();

			if (givenN<0){
				System.out.println("입력이 음수이므로, Factorial 값을 계산할 수 없습니다.");
			}

			else{
				System.out.println(givenN+"Factorial 값을 계산하려고 합니다.");

				if (givenN==0){
					fact=1;}

				else{
					fact=1;
					i=2;
					while(i<=givenN) {

						fact= fact*i;
						i=i+1;
					}
					System.out.println(givenN+"Factorial의 값은"+ fact+"입니다.");

				}

				System.out.println("Factorial을 다시 계산하시겠습니까?");
				System.out.println("계산하려면 'Y'를 치십시오.");
				userAnswer= scanner.next().charAt(0);


				System.out.println("프로그램을 종료합니다.");

			}
			
		}

		scanner.close();
	}


}


