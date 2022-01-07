package week1.day2;

public class Calculator {
	
	public int add(int num1,int num2) {
	return num1+num2;
	
	}
	public double sub(double num1,double num2) {
		return num1-num2;
	}
	public double mul(double num1,double num2) {
		return num1*num2;
	}
	public int div(int num1,int num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
				int add = calc.add(20,30);
				double sub = calc.sub(122.35, 100.15);
				double mul = calc.mul(20, 30);
				int div = calc.div(100,2);
				
				System.out.println(add);
				System.out.println(sub);
				System.out.println(mul);
				System.out.println(div);
				 
		

	}

}
