package controller;

public class InitArray {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter=0; counter < vetor.length; counter++) {
			System.out.printf("%5d%8d%n", counter, vetor[counter]);
		}

	}

}
