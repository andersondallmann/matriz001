package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de linhas da matriz: ");
		int m = sc.nextInt();
		System.out.println("Quantidade de colunas da matriz: ");
		int n = sc.nextInt();

		int matriz[][] = new int[m][n]; // instacia a matriz conforme as entradas

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}

		}

		System.out.println("Digite um número existente na matriz: ");
		int number = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (number == matriz[i][j]) {
					System.out.print("Position: " + i + ", " + j + ":");

					// IF Verifica se COLUNA é maior que zero, se sim,
					// imprime o valor na sua esquerda

					if (j > 0) {
						System.out.println();
						System.out.println("Left: " + matriz[i][j - 1]);
					}

					// IF Verifica se LINHA maior que zero, se sim,
					// imprime o valor acima

					if (i > 0) {
						System.out.println();
						System.out.println("Up: " + matriz[i - 1][j]);
					}

					// IF Verifica se LINHA é menor que o tamanho da matriz(linha), se sim,
					// imprime o valor abaixo

					if (i < matriz.length-1) {
						System.out.println();
						System.out.println("Down: " + matriz[i + 1][j]);
					}

					// IF Verifica se COLUNA é menor que o tamanho da matriz(coluna), se sim,
					// imprime o valor na sua direita

					if (j < matriz[i].length-1) {
						System.out.println();
						System.out.println("Right: " + matriz[i][j + 1]);
					}

					System.out.println();
				}

			}
		}
		sc.close();
	}

}
