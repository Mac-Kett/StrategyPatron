package strategy;

public class Main {

	public static void main(String[] args) {
		double num1 = 10;
		double num2 = 3;
		
		Context context = new Context(new OperationAdd());
		System.out.println((int)num1 + " + " + (int)num2 + " = " + context.doOperation(num1, num2));
		
		Context context1 = new Context(new OperationSubstract());
		System.out.println((int)num1 + " + " + (int)num2 + " = " + context.doOperation(num1, num2));
		
		Context context2 = new Context(new OperationMultiply());
		System.out.println((int)num1 + " + " + (int)num2 + " = " + context.doOperation(num1, num2));
		
		Context context3 = new Context(new OperationDivision());
		System.out.println((int)num1 + " + " + (int)num2 + " = " + context.doOperation(num1, num2));
		
		Context context4 = new Context(new OperationModule());
		System.out.println((int)num1 + " + " + (int)num2 + " = " + context.doOperation(num1, num2));
	}
}
