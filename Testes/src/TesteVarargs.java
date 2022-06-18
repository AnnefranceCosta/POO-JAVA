public class TesteVarargs {
	public static void main(String[] args) {
		TesteVarargs est = new TesteVarargs();

		// passando quantidade variável de parâmetros
		System.out.println(est.media());
		System.out.println(est.media(1));
		System.out.println(est.media(1, 2));
		System.out.println(est.media(1, 2, 3));
		System.out.println(est.media(1, 2, 3, 4));

		// passando um vetor
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(est.media(numeros));
	}

	public float media(int... numeros) {
		if (numeros.length == 0) {// se não passou parâmetros
			return 0;
		}
		float soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		return soma / numeros.length;
	}
}