package controller;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		//Importe de Scanner 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int number2 = scanner.nextInt();
		
		int sum = number1 + number2;
		
		System.out.println("A soma é: " + sum);

	}

}
