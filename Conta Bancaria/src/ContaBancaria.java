
public class ContaBancaria {

	String titular;
	double saldo;

	public ContaBancaria(String nome) {
		this.titular = nome;
	}

	public ContaBancaria(double valor) {
		this.saldo = valor;		
	}

	public ContaBancaria(int i) {
		// TODO Auto-generated constructor stub
	}

	double getSaldo() {
		return this.saldo;
	}

	boolean depositaConta(double d) {
		if(d > 0) {
		saldo = this.saldo + d;
		return true;
		}else{
		return false;
	}
}
	boolean sacaConta(double s) {
		if(saldo >= s && s >0) {
			this.saldo = this.saldo - s;
			return true;
		}else {
			return false;
		}
	}
	
	boolean transfere (ContaBancaria destino, double valor) {
		if(this.sacaConta(valor) && destino.depositaConta(valor)) {
				return true;
		}
		
		return false;
	}
}
