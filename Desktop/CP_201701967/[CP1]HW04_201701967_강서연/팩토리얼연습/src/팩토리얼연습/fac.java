package ���丮�󿬽�;

import java.util.Scanner;

public class fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int fact = 0;
		int i;

		System.out.println("Factorial�� ����Ͻðڽ��ϱ�?");
		System.out.println("����Ϸ��� 'Y'�� ġ�ʽÿ�.");
		char userAnswer= scanner.next().charAt(0);

		while (userAnswer=='Y'){


			System.out.println("N���� �Է��Ͻÿ�. ");
			int givenN= scanner.nextInt();

			if (givenN<0){
				System.out.println("�Է��� �����̹Ƿ�, Factorial ���� ����� �� �����ϴ�.");
			}

			else{
				System.out.println(givenN+"Factorial ���� ����Ϸ��� �մϴ�.");

				if (givenN==0){
					fact=1;}

				else{
					fact=1;
					i=2;
					while(i<=givenN) {

						fact= fact*i;
						i=i+1;
					}
					System.out.println(givenN+"Factorial�� ����"+ fact+"�Դϴ�.");

				}

				System.out.println("Factorial�� �ٽ� ����Ͻðڽ��ϱ�?");
				System.out.println("����Ϸ��� 'Y'�� ġ�ʽÿ�.");
				userAnswer= scanner.next().charAt(0);


				System.out.println("���α׷��� �����մϴ�.");

			}
			
		}

		scanner.close();
	}


}


