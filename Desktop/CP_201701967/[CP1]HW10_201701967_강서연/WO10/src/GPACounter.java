public class GPACounter {

	Student student = new Student();
	
	private int _numberOfGPA3;
	private int _numberOfGPA2;
	private int _numberOfGPA1;
	private int _numberOfGPA0;
	
	public GPACounter () // ������
	{
	this._numberOfGPA3 = 0 ;
	this._numberOfGPA2 = 0 ;
	this._numberOfGPA1 = 0 ;
	this._numberOfGPA0= 0 ;
	}
	
	public void count (double aGPA){
		aGPA = student.gpa();
		if (aGPA>=3.0){
			this._numberOfGPA3 ++;
		}
		else if (aGPA>=2.0){
			this._numberOfGPA2 ++;
		}
		else if (aGPA>=1.0){
			this._numberOfGPA1 ++;
		}
		else{
			this._numberOfGPA0++;
		}
	
	}
	
	public int numberOfGPA3(){
		return this._numberOfGPA3;
	}
	
	public int numberOfGPA2(){
		return this._numberOfGPA2;
	}
	public int numberOfGPA1(){
		return this._numberOfGPA1;
	}
	
	public int numberOfGPA0(){
		return this._numberOfGPA0;
	}
	
	public void printCount (){
		System.out.println("��������� 3.0 �̻��� �л��� "+ this._numberOfGPA3 +" ���Դϴ�");
		System.out.println("��������� 2.0 �̻��� �л��� "+ this.numberOfGPA2() +" ���Դϴ�");
		System.out.println("��������� 1.0 �̻��� �л��� "+ this.numberOfGPA1() +" ���Դϴ�");
		System.out.println("��������� 1.0 �̸��� �л��� "+ this.numberOfGPA0() +" ���Դϴ�");
		
	}
	
}
