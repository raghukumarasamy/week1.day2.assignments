package week1.day2.assignments;

public class Calculator2 {

	public static void main(String[] args) {

		int num1 = 25;
		int num2 = 5;
		int num3 = 10;
		double num4 = 1.1D;
		double num5 = 2.2D;
		float num6 = 5.55F;
		float num7 = 3.33F;

		calculator1 calc1 = new calculator1();

		calc1.addition(num1, num2, num3);
		calc1.substraction(num1, num2, num3);
		calc1.multiplication(num4, num5, num3);
		calc1.division(num6, num7, num3);

	}

}
