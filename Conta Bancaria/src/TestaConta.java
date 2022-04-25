
public class TestaConta {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Annefrance Costa");
		
		if(conta1.depositaConta(100)) {
			System.out.println("O deposito para " + conta1.titular + " foi realizado com sucesso!");
		}else {
			System.out.println("O dep�sito para " + conta1.titular + "N�O foi realizado!");
		}
		System.out.println("Saldo "+ conta1.getSaldo());
	
	
		if(conta1.sacaConta(-500)) {
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente ou valor do saque negativo!");
		}
		
		System.out.println("Saldo "+ conta1.getSaldo());
		
		ContaBancaria conta2 = new ContaBancaria(500);
		
		if(conta1.transfere(conta2, 60)) {
			System.out.println("Transfer�ncia efetuada com sucesso!!");
		}else {
			System.out.println("Transfer�ncia N�O foi efetuada!!");
		}
		
		System.out.println("Saldo conta 1 " + conta1.getSaldo());
		System.out.println("Saldo conta 2 " + conta2.getSaldo());

	}
}
