
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1;
		
		while(n<=180){
			double x;
			double y;
			
			x = (double) n * (3.141592 / 180.0) ; 
			y = Math.sin(x);
			
			System.out.println("Sine("+n+"��) �� "+y+" �Դϴ�.");
			
			n=n+1;
		}
		
	}

}
