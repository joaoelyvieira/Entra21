import java.util.Scanner;

public class ListaExercicio2 {

	public static void main(String[] args) {
		// nivelBasico();
		// nivelIntermediario();
		// nivelAvancado();
		// nivelDesafio();

	}

	static void nivelBasico() {

		Scanner sc = new Scanner(System.in);

		// 1.
		int x;
		System.out.println("Insira um número inteiro: ");
		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é impar.");
		}

		// 2.
		double a;
		double b;
		System.out.println("Insira o primeiro número: ");
		a = sc.nextDouble();
		System.out.println("Insira o segundo número: ");
		b = sc.nextDouble();

		if (a > b) {
			System.out.println(a + " é maior que " + b);
		} else {
			System.out.println(b + " é maior que " + a);
		}

		// 3.
		double c;
		System.out.println("Digite um número: ");
		c = sc.nextDouble();

		if (c < 0) {
			System.out.println(c + " é um número negativo!");
		} else if (c == 0) {
			System.out.println("O número é igual a 0!");
		} else {
			System.out.println(c + " é um número positivo!");
		}

		// 4.

		double nota;
		System.out.println("Insira a sua nota: ");
		nota = sc.nextDouble();

		if (nota >= 6 && nota <= 10) {
			System.out.println("Aprovado!");
		} else if (nota < 6 && nota >= 0) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Nota invalida!");
		}

		// 5.
		int idade;
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();

		if (idade >= 16) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você não pode votar!");
		}

	}

	static void nivelIntermediario() {

		Scanner sc = new Scanner(System.in);

		// 6.
		int a;
		int b;
		int c;
		System.out.println("Insira o primeiro numero: ");
		a = sc.nextInt();
		System.out.println("Insira o segundo numero: ");
		b = sc.nextInt();
		System.out.println("Insira o terceiro numero: ");
		c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " é o maior número.");
		} else if (b > a && b > c) {
			System.out.println(b + " é o maior número.");
		} else {
			System.out.println(c + " é o maior número.");
		}

		// 7.

		double nota;
		System.out.println("Insira a sua nota: ");
		nota = sc.nextDouble();

		if (nota >= 0 && nota <= 4) {
			System.out.println("Insuficiente!");
		} else if (nota >= 5 && nota <= 6) {
			System.out.println("Regular!");
		} else if (nota >= 7 && nota <= 8) {
			System.out.println("Bom!");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Excelente!");
		} else {
			System.out.println("Nota invalida!");
		}

		// 8.

		System.out.print("Digite o primeiro lado: ");
		double x = sc.nextDouble();

		System.out.print("Digite o segundo lado: ");
		double y = sc.nextDouble();

		System.out.print("Digite o terceiro lado: ");
		double z = sc.nextDouble();

		if (x + y > z && x + z > y && y + z > x) {
			System.out.println("Triângulo válido.");
		} else {
			System.out.println("Não forma um triângulo.");
		}

		// 9.

		System.out.print("Digite o primeiro lado: ");
		double lado1 = sc.nextDouble();
		System.out.print("Digite o segundo lado: ");
		double lado2 = sc.nextDouble();
		System.out.print("Digite o terceiro lado: ");
		double lado3 = sc.nextDouble();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero.");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triângulo Isósceles.");
		} else {
			System.out.println("Triângulo Escaleno.");
		}

		// 10.

		String usuario;
		String senha;
		String usuarioPadrao = "admin";
		String senhaPadrao = "1234";

		System.out.print("Digite o usuário: ");
		usuario = sc.nextLine();
		System.out.print("Digite a senha: ");
		senha = sc.nextLine();

		if (usuario.equals(usuarioPadrao) && senha.equals(senhaPadrao)) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}

	}

	static void nivelAvancado() {

		Scanner sc = new Scanner(System.in);

		// 11.

		int ano;
		System.out.print("Digite um ano: ");
		ano = sc.nextInt();

		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println(ano + " é um ano bissexto.");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}

		// 12.

		double num1, num2;
		char operacao;

		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();

		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();

		System.out.print("Digite a operação (+, -, *, /): ");
		operacao = sc.next().charAt(0);

		if (operacao == '+') {
			System.out.println("Resultado: " + (num1 + num2));
		} else if (operacao == '-') {
			System.out.println("Resultado: " + (num1 - num2));
		} else if (operacao == '*') {
			System.out.println("Resultado: " + (num1 * num2));
		} else if (operacao == '/') {
			if (num2 != 0) {
				System.out.println("Resultado: " + (num1 / num2));
			} else {
				System.out.println("Não é possível dividir um número por zero!");
			}
		} else {
			System.out.println("Operação inválida!");
		}

		// 13.

		double salario;
		System.out.print("Digite o salário: ");
		salario = sc.nextDouble();

		if (salario <= 2000) {
			System.out.println("Isento de imposto.");
		} else if (salario > 2000 && salario <= 3000) {
			System.out.println("Imposto: " + (salario * 0.08));
		} else if (salario > 3000 && salario <= 4500) {
			System.out.println("Imposto: " + (salario * 0.18));
		} else {
			System.out.println("Imposto: " + (salario * 0.28));
		}

		// 14.

		double valorCompra;
		System.out.print("Digite o valor da compra: ");
		valorCompra = sc.nextDouble();

		if (valorCompra <= 100) {
			System.out.println("Valor final da compra: " + valorCompra);
		} else if (valorCompra > 100 && valorCompra <= 500) {
			System.out.println("Você ganhou 10% de desconto! Valor final da compra: " + (valorCompra * 0.9));
		} else {
			System.out.println("Você ganhou 20% de desconto! Valor final da compra: " + (valorCompra * 0.8));
		}

		// 15.

		int idade;
		System.out.print("Insira a idade: ");
		idade = sc.nextInt();

		if (idade >= 0 && idade <= 12) {
			System.out.println("Criança");
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("Adolescente");
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Adulto");
		} else if (idade >= 60) {
			System.out.println("Idoso");
		} else {
			System.out.println("Idade inválida!");
		}

	}

	static void nivelDesafio() {

		Scanner sc = new Scanner(System.in);

		// 16.

		double nota1, nota2, nota3;
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 6) {
			System.out.println("Parabéns, você foi Aprovado! Média final: " + media);
		} else if (media >= 5 && media < 6) {
			System.out.println("Você está de Recuperação! Média final: " + media);
		} else {
			System.out.println("Infelizmente você foi Reprovado! Média Final: " + media);
		}

		// 17.

		double salario;
		double valorParcela;

		System.out.print("Digite o seu salário: ");
		salario = sc.nextDouble();
		System.out.print("Digite o valor da parcela: ");
		valorParcela = sc.nextDouble();

		if (valorParcela <= salario * 0.3) {
			System.out.println("Empréstimo aprovado!");
		} else {
			System.out.println("Empréstimo negado! O valor da parcela excede 30% do seu salário.");
		}

		// 18.

		int numero;
		int numeroSecreto = 5;
		System.out.println("Insira um número: ");
		numero = sc.nextInt();

		if (numero < numeroSecreto) {
			System.out.println("Maior");
			numero = sc.nextInt();
		} else if (numero > numeroSecreto) {
			System.out.println("Menor");
			numero = sc.nextInt();
		} else {
			System.out.println("Numero Correto!");
		}

		// 19.

		double peso;
		double altura;

		System.out.print("Digite o seu peso (kg): ");
		peso = sc.nextDouble();
		System.out.print("Digite a sua altura (m): ");
		altura = sc.nextDouble();

		double imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Baixo peso. IMC: " + imc);
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso adequado. IMC: " + imc);
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso. IMC: " + imc);
		} else {
			System.out.println("Obesidade. IMC: " + imc);
		}

		// 20.

		String usuario;
		String senha;
		String usuarioPadrao = "admin";
		String senhaPadrao = "1234";

		int tentativas = 0;

		while (tentativas < 3) {
			System.out.print("Digite o usuário: ");
			usuario = sc.nextLine();
			System.out.print("Digite a senha: ");
			senha = sc.nextLine();

			if (usuario.equals(usuarioPadrao) && senha.equals(senhaPadrao)) {
				System.out.println("Acesso permitido!");
				break;
			} else {
				tentativas++;
				System.out.println("Acesso negado! Tentativa " + tentativas + " de 3.");
			}
		}

	}

}
