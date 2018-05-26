
public class UsaVetor {
	
	public static void main(String[] args) {
		
		int tamanhoInicial = 4;
		Vetor vetor = new Vetor(tamanhoInicial);
		
		vetor.insere(1, 5000);
		vetor.insereFinal(10);
		vetor.insereFinal(5);
		vetor.insereFinal(12);
		vetor.insereInicio(200);
		vetor.insere(5, 1000);

		
		vetor.ListaVetor();
		
	}

}
