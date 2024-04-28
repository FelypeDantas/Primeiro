package controller;

public class Tabela {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100) + 1;
		}
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter=0; counter < vetor.length; counter++) {
			System.out.printf("%5d%8d%n", counter, vetor[counter]);
		}

	}

}
