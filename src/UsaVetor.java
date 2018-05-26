
public class UsaVetor {
	
	public static void main(String[] args) {
		
		int tamanhoInicial = 4;
		Vetor vetor = new Vetor(tamanhoInicial);
		
		System.out.println("INCLUSÕES");
		
		vetor.insereFinal(11);
		vetor.insereFinal(22);
		vetor.insereInicio(222);
		vetor.insereFinal(33);
		vetor.insere(0, 1111);
		vetor.insereFinal(44);
		vetor.insere(3, 2222);
		vetor.insereFinal(55);
		vetor.insere(3, 3333);
		
		vetor.ListaVetor();
		
		System.out.println("\nEXCLUSÃO INÍCIO");
		vetor.removeInicio();
		vetor.ListaVetor();
		
		System.out.println("\nEXCLUSÃO FINAL");
		vetor.removeFinal();
		vetor.ListaVetor();
		
		System.out.println("\nEXCLUSÃO POSIÇÃO");
		vetor.remove(3);
		vetor.ListaVetor();
		
	}

}
