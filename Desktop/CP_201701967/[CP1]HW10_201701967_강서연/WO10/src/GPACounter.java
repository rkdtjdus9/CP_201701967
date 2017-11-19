public class GPACounter {

	Student student = new Student();
	
	private int _numberOfGPA3;
	private int _numberOfGPA2;
	private int _numberOfGPA1;
	private int _numberOfGPA0;
	
	public GPACounter () // 생성자
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
		System.out.println("평균평점이 3.0 이상인 학생은 "+ this._numberOfGPA3 +" 명입니다");
		System.out.println("평균평점이 2.0 이상인 학생은 "+ this.numberOfGPA2() +" 명입니다");
		System.out.println("평균평점이 1.0 이상인 학생은 "+ this.numberOfGPA1() +" 명입니다");
		System.out.println("평균평점이 1.0 미만인 학생은 "+ this.numberOfGPA0() +" 명입니다");
		
	}
	
}
