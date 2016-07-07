public class Student{
	private int math;
	private int prog;

	public void setScore(int math, int prog){
		this.math = math;
		this.prog = prog;
	}

	public double getAverage(){
		return (math+prog)/2.0;
	}

	public boolean isPass(){
		if(math >= 60 && prog >= 60){
			return true;
		}else{
			return false;
		}

	}
}
