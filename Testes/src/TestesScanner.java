import java.util.Scanner;

public class TestesScanner {

	public static void main(String[] args) {
		
		/*
		Scanner soma = new Scanner(System.in);
		
		System.out.println("Digite aqui o primeiro n�mero: ");
		float numero1 = soma.nextFloat();
		
		System.out.println("Digite aqui o segundo n�mero: ");
		float numero2 = soma.nextFloat();
		
		float somatorio = numero1 + numero2;
		
		System.out.println("A soma de "+numero1+" mais "+numero2+" � igual a "+somatorio);
		*/
		
		Scanner saudacao = new Scanner(System.in);
		System.out.println("Digite aqui seu nome: ");
		String nome = saudacao.next();
		
		System.out.println("Ol� "+nome+", � um prazer ter voc� aqui!!");
		
	}
}