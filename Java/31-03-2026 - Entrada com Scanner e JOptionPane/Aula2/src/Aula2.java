import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aula2 {
	public static void main(String[] args) {
		//entradaComScanner();
		entradaComJoptionPane();
	}
	
	static void entradaComJoptionPane() {
	  // JOptionPane.showMessageDialog(null, "ola mundo");
		String nome;
		nome = JOptionPane.showInputDialog("Informe seu nome");
		System.out.println("olá " + nome);
		JOptionPane.showMessageDialog(null, "olá " + nome);
		
	}
	
	static void entradaComScanner() {
        Scanner entradaUser = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = entradaUser.nextLine();

		int idade;
		System.out.print("Informe idade: ");
		idade = entradaUser.nextInt();
		
		float altura;
		System.out.print("Informe altura: ");
		altura = entradaUser.nextFloat();
		
		System.out.println("hello " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
	}
}
