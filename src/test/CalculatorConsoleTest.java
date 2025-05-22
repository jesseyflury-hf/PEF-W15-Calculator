package test;

import calculator.Calculator;

public class CalculatorConsoleTest {

	public static void main(String[] args) {
		Calculator c = new Calculator(10.9, 5.3);
		
		double sum = c.sum();
		double prod = c.mult();
		double div = c.div();
		System.out.println("Summe: " + sum);
		System.out.println("Produkt: " + prod);
		System.out.println("Division: " + div);
	}
}
