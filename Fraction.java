public class Fraction{
	
	private int denum;
	private int num; 

	public Fraction(){
		this.denum = 0;
		this.num = 0;
	}

	public Fraction(int denum, int num){
		this.denum = denum;
		this.num = num;
	}

	public int get_denum(){
		return denum;
	}

	public int get_num(){
		return num;
	}

	public void set_denum(int denum){
		this.denum = denum;
	}

	public void set_num(int num){
		this.num = num;
	}


	public String To_String(){
		return "this fraction have "+num+" / "+denum+" like number";
	}
}