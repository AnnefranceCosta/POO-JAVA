package aula5;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float real;
	private boolean status;

	public ContaBanco() {
		real = 0;
		status = false;

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getReal() {
		return real;
	}

	public void setReal(float real) {
		this.real = real;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(tipo) {
		setTipo(tipo);
		setStatus(true);
		if (tipo == "cc") {
			real = 50;
		}else {
			real = 150;
		}

	}

	public void fecharConta() {
		if(real > 0) {
			System.out.println("Conta com dinheriro!!");
		}else if(real < 0) {
			System.out.println("Conta em débito!");
		}else {
			setStatus(false);
		}

	}

	public void depositar(real v) {
		if (status == true) {
			real = real + v;
		}else {
			System.out.println("Impossível depositar!");
		}

	}

	public void sacar(real v) {
		if(status == true) {
			if (real > v) {
				real = real - v;
			}
		}
	}

	public void pagarMensal() { 
		var float v;
		if (tipo == "cc") {
			v = 12;
		}else if(tipo == "cp") {
			v = 20;
		}else {
			
		}

	}

}
