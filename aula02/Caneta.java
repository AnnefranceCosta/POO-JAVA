package aula02;

public class Caneta {
		String modelo;
		String cor;
		float ponta;
		int carga;
		boolean tampada;
		void status() {
			System.out.println("Uma caneta "+ this.modelo + " de cor " + this.cor);
			System.out.println("Está tampada?"+ this.tampada);
			System.out.println("Qual a ponta dela? "+this.ponta);
		}
		void rabiscar() {
			if (this.tampada == true) {
				System.out.println("ERRO!! Caneta tampada.");
			}else {
				System.out.println("Pode rabiscar a vontade!");
			}
		}
		
		void tampar() {
			this.tampada = true;
			
		}
		
		void destampar() {
			this.tampada = false;
		}

}

