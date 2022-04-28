public class Imc {
	double peso;
	double altura;
	
	Imc (double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}

	double indiceCorporal() {
		double imc = (altura*altura)/peso;
		
		if (imc < 16) {
			System.out.println("Baixo peso muito grave");
		}else if (imc >= 16 && imc <= 16.99) {
			System.out.println("Baixo peso grave");
		}else if (imc >= 17 && imc <= 18.49) {
			System.out.println("Baixo peso");
		}else if (imc >= 18.50 && imc <= 24.99) {
			System.out.println("Peso normal");
		}else if(imc >= 25 && imc <= 29.99) {
			System.out.println("Sobrepeso");
		}else if(imc >= 30 && imc <= 34.99) {
			System.out.println("Obesidade grau I");
		}else if(imc >= 35 && imc <= 39.99) {
			System.out.println("Obesidade grau II");
		}else {
			System.out.println("Obesidade grau III");
		}
			return imc;		
}
}
