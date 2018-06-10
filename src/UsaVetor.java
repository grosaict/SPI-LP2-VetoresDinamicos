import java.util.Random;
import java.util.Scanner;

public class UsaVetor {
	
	public static void main(String[] args) {
		
		int iteracoes, metodo, valor, iRand, tamanhoInicial = 4;
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
				valor = r.nextInt(200);
				System.out.print("InsIni ["+String.format("%04d", i)+"] "+String.format("%04d", valor)+" ");
				try{
					vetor.insereInicio(valor);
				}catch (ArrayIndexOutOfBoundsException e){
					System.err.print(e);
				}
				break;
			case 2:
				valor = r.nextInt(200);
				System.out.print("InsFim ["+String.format("%04d", i)+"] "+String.format("%04d", valor)+" ");
				try{
					vetor.insereFinal(valor);
				}catch (ArrayIndexOutOfBoundsException e){
					System.err.print(e);
				}
				break;
			case 3:
				valor = r.nextInt(200);
				System.out.print("InsPos ["+String.format("%04d", i)+"] "+String.format("%04d", valor)+" ");
				try{
					vetor.insere(valor, i);
				}catch (ArrayIndexOutOfBoundsException e){
					System.err.print(e);
				}
				break;
			case 4:
				System.out.print("RemIni ["+String.format("%04d", i)+"] N/A  ");
				try{
					vetor.removeInicio();
				}catch (ArrayIndexOutOfBoundsException e){
					System.err.print(e);
				}
				break;
			case 5:
				System.out.print("RemFim ["+String.format("%04d", i)+"] N/A  ");
				try{
					vetor.removeFinal();
				}catch (ArrayIndexOutOfBoundsException e){
					System.err.print(e);
				}
				break;
			case 6:
				iRand = r.nextInt(vetor.Capacity());
				System.out.print("RemPos ["+String.format("%04d", iRand)+"] N/A  ");
				try{
					vetor.remove(iRand);
				}catch (ArrayIndexOutOfBoundsException e){
					System.err.print(e);
				}
				break;
			default:
				System.out.print(metodo+" ");
			}
		}
		
		System.out.println("\n\n>>> VETOR <<<");
		ListaVetor(vetor);
	}
	
	public static void ListaVetor(Vetor vetor) {
		if (vetor.isEmpty()){
			System.out.println("Vetor vazio!!!");
		}else{
			for (int i=0; i<vetor.Size(); i++){
				System.out.println("["+String.format("%04d", i)+"] "+String.format("%04d", vetor.get(i)));
			}
		}	
	}
}
