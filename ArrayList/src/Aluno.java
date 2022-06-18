
public class Aluno {
	
	int matricula;
	double nota;
	
	Aluno(int m, double n){
		this.matricula = m;
		this.nota = n;
	}
	
	String situacao(){
		if (this.nota >= 60) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}

}
