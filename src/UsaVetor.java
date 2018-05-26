import java.util.Random;
import java.util.Scanner;

public class UsaVetor {
	
	public static void main(String[] args) {
		
		int iteracoes, metodo, tamanhoInicial = 4;
		Vetor vetor = new Vetor(tamanhoInicial);
		
		Scanner l = new Scanner(System.in);
		Random r = new Random();
		
		//incicializa com 200 posições
		for (int i=0;i<200;i++){
			vetor.insereFinal(i+3000);
		}
		
		System.out.println("\nInforme a quantidade de iterações para testagem: ");
		iteracoes = l.nextInt();

		System.out.print(">ITER< SIZE CPTY OPERAC [INDI] VALOR/MENSAGEM");
		for (int i=0;i<iteracoes;i++){
			metodo = r.nextInt(6)+1;
			System.out.print("\n>"+String.format("%04d", (i+1))+"< "+String.format("%04d", vetor.Size())+" "+String.format("%04d", vetor.Capacity())+" ");
			switch (metodo){
			case 1:
				System.out.print("InsIni ");
				vetor.insereInicio(i);
				break;
			case 2:
				System.out.print("InsFim ");
				vetor.insereFinal(i);
				break;
			case 3:
				System.out.print("InsPos ");
				vetor.insere(r.nextInt(200), i);
				break;
			case 4:
				System.out.print("RemIni ");
				vetor.removeInicio();
				break;
			case 5:
				System.out.print("RemFim ");
				vetor.removeFinal();
				break;
			case 6:
				System.out.print("RemPos ");
				vetor.remove(r.nextInt(vetor.Capacity()));
				break;
			default:
				System.out.print(metodo+" ");
			}
		}
		
		System.out.println("\n\n>>> VETOR <<<");
		vetor.ListaVetor();
	}
}
