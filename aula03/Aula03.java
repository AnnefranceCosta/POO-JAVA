package aula03;

import aula03.Caneta;

public class Aula03 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Hidrogr�fica";
		//c1.ponta = 0.3f;
		c1.carga = 80;
		//c1.tampada = false;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		
		
		
	}

}
