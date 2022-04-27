public class Carro {
	double combustivel;
	double reservatorio;
	double distanciaPercorrida;
	
	Carro (double combustivel, double reservatorio, double distanciaPercorrida){
		this.combustivel = combustivel;
		this.reservatorio = reservatorio;
		this.distanciaPercorrida = distanciaPercorrida;
	}

	boolean movimentarCarro(double distanciaPercorrida) {
		double combustivelGasto = distanciaPercorrida / combustivel;
		if(combustivelGasto < combustivel) {
			this.distanciaPercorrida = this.getDistancia() + distanciaPercorrida;
			this.combustivel = this.getCombustivel() - combustivelGasto;
			return true;
		}else {
			return false;
		}
	}

	private double getCombustivel() {
		// TODO Auto-generated method stub
		return this.combustivel;
	}

	private double getDistancia() {
		// TODO Auto-generated method stub
		return this.distanciaPercorrida;
	}
	
	void abastece(double totalCombustivel) {
		this.combustivel = this.getCombustivel() + totalCombustivel;
	}
}
