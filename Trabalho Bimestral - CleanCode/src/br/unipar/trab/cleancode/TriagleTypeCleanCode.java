package br.unipar.trab.cleancode;

import java.util.Scanner;

public class TriagleTypeCleanCode {
	public static void main(String[] args) {
		TriagleTypeCleanCode execute = new TriagleTypeCleanCode();
//		System.out.println("ESSE PROGRAMA VERIFICA OS TIPOS DE TRIANGULOS FORMADOS ATRAVÉS DAS MEDIDAS INFORMADAS");
		
		execute.execute();
	}
	
	//VAR DECLARATION SECTION
	int n1, n2, n3, a1, a2, a3, op;
	String result, verifiedSideType, verifiedAngleType, output;
	//-----------------------
	
	//********** INICIO DO ALGORITMO ************
	void execute() {
		Scanner opt = new Scanner(System.in); 
		
		System.out.println("Por favor, escolha uma opção de verificação: ");
		System.out.println("Digite 1 para verificar o tipo de triângulo segundo as medidas dos lados");
		System.out.println("Digite 2 para verificar o tipo de triângulo segundo as medidas dos angulos");
		System.out.println("Digite 3 para verificar o tipo de triângulo segundo as medidas dos lados e dos angulos");
		op = opt.nextInt();
		option(op);
		
	}
	
	//ESCOLHA DE CALCULO PELO USUARIO
	void option(int option) {
		//INPUTS VAR DECLARATION
		Scanner side1 = new Scanner(System.in);
		Scanner side2 = new Scanner(System.in);
		Scanner side3 = new Scanner(System.in);
		Scanner angle1 = new Scanner(System.in);
		Scanner angle2 = new Scanner(System.in);
		Scanner angle3 = new Scanner(System.in);
		//--------------------------------------
		
		switch (op) { //ESCOLHENDO VERIFICAR TIPO POR:
			case 1: //1: MEDIDAS DE LADOS;
				System.out.println("Informe a medida dos lados: ");
				n1 = side1.nextInt();
				n2 = side2.nextInt();
				n3 = side3.nextInt();
				System.out.println(output());
				System.out.println(typeBySideMeasures());
				break;
			case 2: //2: MEDIDAs DE ÂNGULOS;
				System.out.println("Informe a medida dos ângulos");
				a1 = angle1.nextInt();
				a2 = angle2.nextInt();
				a3 = angle3.nextInt();
				System.out.println(output());
				System.out.println(typeByAngleMeasures());
				break;
			case 3: //3: UNIÃO DAS DUAS OPÇÕES ANTERIORES
				System.out.println("Informe a medida dos lados em seguida a medida dos ângulos");
				n1 = side1.nextInt();
				n2 = side2.nextInt();
				n3 = side3.nextInt();
				a1 = angle1.nextInt();
				a2 = angle2.nextInt();
				a3 = angle3.nextInt();
				System.out.println(output());
				System.out.println(typeBySideAngleMeasures());
				break;
		}
		
	}
	
	//OPTION 1 - 
	//VERIFICANDO TIPO DE ACORDO COM MEDIDAS DE LADOS**
	String typeBySideMeasures() {
		if (n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2) { 
		if (escaleno() == true) {return "Escaleno";}
		if (isoceles() == true) {return "Isóceles";}
		if (equilatero() == true) {return "Equilátero";}
		}
		return "Não é possível formar triângulo com as medidas informadas";
	}
	
	Boolean escaleno() {
		if (n1 != n2 && n2 != n3 && n3 != n1) {return true;}
		return false;
	}
	
	Boolean isoceles() {
		if 
		(   //se houver dois lado iguais e um lado diferente
			n1 != n2 && n1 != n3 && n3 == n2 ||
			n2 != n3 && n2 != n1 && n1 == n3 ||
			n3 != n1 && n3 != n2 && n1 == n2
		) {return true;}
		return false;
	}
	
	Boolean equilatero() {
		if (n1 == n2 && n1 == n3) {return true;}
		return false;
	}
	//---**
	
	//OPTION 2 - 
	//VERIFICANDO TIPO DE ACORDO COM MEDIDAS DE ANGULOS**
		String typeByAngleMeasures() {
			if (a1 + a2 + a3 == 180) {
			if (acutangulo() == true) {return "Acutângulo";}
			if (retangulo() == true) {return "Retângulo";}
			if (obtusangulo() == true) {return "Obtusângulo";}
			}
			return "Não foi possível formar triângulo com as medidas informadas";
		}
		
		Boolean acutangulo() {
			if (a1 < 90 && a2 < 90 && a3 < 90) {return true;}
			return false;
		}
		
		Boolean retangulo() {
			if (a1 == 90 || a2 == 90 || a3 == 90) {return true;}
			return false;
		}
		
		Boolean obtusangulo() {
			if (a1 > 90 || a2 < 90 && a3 < 90) {return true;}
			return false;
		}
		//---**
		
		//OPTION 3 -
		//VERIFICANDO TIPO DE ACORDO COM MEDIDAS DE LADOS E ANGULOS**
		String typeBySideAngleMeasures() {
			result = typeBySideMeasures() + typeByAngleMeasures();
			return result;
		}
		
		//MAIN OUTPUT 
		String output() {
			return "O triângulo formado por essas medidas é do tipo: ";
		}	
		
		//************* FIM DO ALGORITMO ********************
}
