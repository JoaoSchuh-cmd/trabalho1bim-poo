package br.unipar.trab.cleancode;

import java.util.Scanner;

public class CalculatorCleanCode {
	
	public static void main(String[] args) {
		CalculatorCleanCode calculator = new CalculatorCleanCode();
		calculator.calculate();
	}
	
	// VAR DECLARATION SECTION
	double result, number1, number2;
	String operator;
	// ---;

	// CALCULATE METHOD
	void calculate() { 
		
		Scanner sn1 = new Scanner(System.in);
		Scanner sn2 = new Scanner(System.in);
		Scanner sop = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		number1 = sn1.nextDouble();
		System.out.println("Digite um operador: ");
		operator = sop.next();
		//VEFICICADOR DE RA�Z QUADRADA
		if ("raiz".equals(operator)) {source(); System.out.println(result);} 
		//OUTROS OPERADORES
		else {
			System.out.println("Digite outro n�mero: ");
			number2 = sn2.nextDouble();
			
			if ("+".equals(operator)) {sum();}
			if ("-".equals(operator)) {sub();}
			if ("/".equals(operator)) {div();}
			if ("*".equals(operator)) {mul();}
			if ("%".equals(operator)) {perc();}
			
			System.out.println(result);
		}
	}
		//SOMA
		double sum() {
			result = number1 + number2;
			return result;
		}
		//SUBTRA��O
		double sub() {
			return result = number1 - number2;
		} 
		//DIVIS�O
		double div() {
			return result = number1 / number2;
		} 
		//MULTIPLICA��O
		double mul() {
			return result = number1 * number2;
		} 
		//PORCENTAGEM
		double perc() {
			return result = (number1 / 100) * number2;
		}
		//RA�Z QUADRADA
		double source() {
			return result = Math.sqrt(number1);
		} 
	}
