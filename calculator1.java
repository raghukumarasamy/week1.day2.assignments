package week1.day2.assignments;

public class calculator1 {

	public int addition(int num1, int num2, int num3) {
		int add = num1 + num2 + num3;
		System.out.println("Addiiton of "+num1+" + "+num2+" + "+num3+ " is: "+add);
		return add;
	}

	public int substraction(int num1, int num2, int sub) {
		sub = num1 - num2;
		System.out.println("Substarction of "+num1+" - "+num2+" is: "+sub);
		return sub;
	}

	public double multiplication(double num1, double num2, double mul) {
		mul = num1 * num2;
		System.out.println("Multiplication of "+num1+"*"+num2+" is: "+mul);
		return mul;
	}

	public float division(float num1, float num2, float div) {
		div = num1 / num2;
		System.out.println("Division of "+num1+"/"+num2+" is: "+div);
		return div;
	}

	public static void main(String[] args) {
		

		
		

	}
}
