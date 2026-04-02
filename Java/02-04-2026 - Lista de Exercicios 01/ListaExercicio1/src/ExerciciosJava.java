import java.util.Scanner;

public class ExerciciosJava {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        //exercicio6();
        //exercicio7();
        //exercicio8();
        //exercicio9();
        //exercicio10();
        //exercicio11();
        //exercicio12();
        //exercicio13();
        //exercicio14();
        //exercicio15();
        //exercicio16();
        //desafio1();
        //desafio2();

    }

    // Nível 1

    public static void exercicio1() {

        int numero = 10;

        System.out.println("Exercício 1");
        System.out.println("Valor: " + numero);
        System.out.println();
    }

    public static void exercicio2() {

        String nome = "João";
        int idade = 20;
        double altura = 1.75;

        System.out.println("Exercício 2");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println();
    }

    public static void exercicio3() {

        int num1 = 10;
        int num2 = 5;

        int soma = num1 + num2;

        System.out.println("Exercício 3");
        System.out.println("Resultado da soma: " + soma);
        System.out.println();
    }

    public static void exercicio4() {

        double preco = 59.90;

        System.out.println("Exercício 4");
        System.out.println("Preço do produto: R$ " + preco);
        System.out.println();
    }

    // Nível 2

    public static void exercicio5() {

        System.out.println("Exercício 5");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Bem-vindo, " + nome + "!");
        System.out.println();
    }

    public static void exercicio6() {

        System.out.println("Exercício 6");

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        int futuraIdade = idade + 10;

        System.out.println("Daqui a 10 anos você terá " + futuraIdade + " anos.");
        System.out.println();
    }

    public static void exercicio7() {

        System.out.println("Exercício 7");

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("Soma: " + soma);
        System.out.println();
    }

    public static void exercicio8() {

        System.out.println("Exercício 8");

        System.out.print("Digite um número decimal: ");
        double numero = sc.nextDouble();

        double dobro = numero * 2;

        System.out.println("Dobro: " + dobro);
        System.out.println();
    }

    // Nível 3

    public static void exercicio9() {

        System.out.println("Exercício 9");

        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();

        double desconto = valor * 0.10;
        double valorFinal = valor - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
        System.out.println();
    }

    public static void exercicio10() {

        System.out.println("Exercício 10");

        System.out.print("Digite a largura: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double area = largura * altura;

        System.out.println("Área do retângulo: " + area);
        System.out.println();
    }

    public static void exercicio11() {

        System.out.println("Exercício 11");

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média: " + media);
        System.out.println();
    }

    public static void exercicio12() {

        System.out.println("Exercício 12");

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        double aumento = salario * 0.15;
        double novoSalario = salario + aumento;

        System.out.println("Novo salário: R$ " + novoSalario);
        System.out.println();
    }

    // Nível 4

    public static void exercicio13() {

        System.out.println("Exercício 13");

        sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos!");
        System.out.println();
    }

    public static void exercicio14() {

        System.out.println("Exercício 14");

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
        System.out.println();
    }

    public static void exercicio15() {

        System.out.println("Exercício 15");

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println();
    }

    public static void exercicio16() {

        System.out.println("Exercício 16");

        System.out.print("Digite as horas trabalhadas: ");
        double horas = sc.nextDouble();

        System.out.print("Digite o valor por hora: ");
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;

        System.out.println("Salário total: R$ " + salario);
        System.out.println();
    }

    // Desafios

    public static void desafio1() {

        System.out.println("Desafio 1");

        sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println(nome + ", a média é: " + media);
        System.out.println();
    }

    public static void desafio2() {

        System.out.println("Desafio 2");

        sc.nextLine();

        System.out.print("Digite o nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double total = preco * quantidade;

        System.out.println("Produto: " + produto);
        System.out.println("Valor total da compra: R$ " + total);
        System.out.println();
    }
}