import java.util.Scanner;

import java.util.Arrays;

public class VetoresExercicios {

	public static void main(String[] args) {
		// Ex1();
		// Ex2();
		// Ex3();
		// Ex4();
		 Ex5();
		// Ex6();

	}

	static void Ex1() {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira o " + (i + 1) + " numero");
			numeros[i] = sc.nextInt();
		}

		System.out.println("");

		for (int n : numeros) {
			System.out.println(n * 2);
		}
	}

	static void Ex2() {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira o " + (i + 1) + " número.");
			numeros[i] = sc.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " é par.");
			} else {
				System.out.println(numeros[i] + " é impar.");
			}
		}
	}

	static void Ex3() {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira o " + (i + 1) + " número!");
			numeros[i] = sc.nextInt();
		}

		System.out.println("");

		for (int i = 9; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

	}

	static void Ex4() {

		Scanner sc = new Scanner(System.in);

		int numeros[] = new int[15];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira o " + (i + 1) + " número!");
			numeros[i] = sc.nextInt();
		}

		int maior = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}

		System.out.println("");

		System.out.println("Maior número: " + maior);
		System.out.println("Posições: ");

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == maior) {
				System.out.println(i + " ");
			}
		}

	}

	static void Ex5() {

		Scanner sc = new Scanner(System.in);

		int numeros[] = new int[8];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira o " + (i + 1) + " número!");
			numeros[i] = sc.nextInt();
		}

		System.out.println("");

		Arrays.sort(numeros);
		//for (int i = 0; i < numeros.length; i++) {
		for (int i = numeros.length - 1; i >= 0 ; i--) {
			System.out.println(numeros[i] + " ");
		}

	}

	static void Ex6() {

		Scanner sc = new Scanner(System.in);

		double soma = 0;
		double numeros[] = new double[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insira o " + (i + 1) + " número!");
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}

		System.out.println("");

		double media = soma / numeros.length;
		System.out.println("A média dos números é " + media);
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > media) {
				System.out.println("Números acima da média.");
				System.out.println(numeros[i] + "");
			} else {
				System.out.println("Não possui números acima da média.");
			}

		}
	}
}