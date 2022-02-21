package aula03;

public class Caneta {
		public String modelo;
		public String cor;
		private float ponta;
		protected int carga;
		private boolean tampada;
		public void status() {
			System.out.println("Uma caneta "+ this.modelo + " de cor " + this.cor);
			System.out.println("Está tampada?"+ this.tampada);
			System.out.println("Qual a ponta dela? "+this.ponta);
			System.out.println("Qual é a carga dela? "+this.carga);
		}
		public void rabiscar() {
			if (this.tampada == true) {
				System.out.println("ERRO!! Caneta tampada.");
			}else {
				System.out.println("Pode rabiscar a vontade!");
			}
		}
		
		public void tampar() {
			this.tampada = true;
			
		}
		
		public void destampar() {
			this.tampada = false;
		}

}

