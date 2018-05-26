
public class Vetor {

	private int [] vetor;
	private int capacity;
	private int size = 0;
	
	public Vetor (int tamanhoInicial){
		this.capacity = tamanhoInicial;
		this.vetor = new int[tamanhoInicial];
	}
	
	public void insereFinal(int valor){
		insere(this.size, valor);
	}
	
	public void insereInicio(int valor){
		insere(0, valor);
	}
	
	public void insere(int indice, int valor){
		if (indiceValido(indice, 0)){
			if (this.capacity <= this.size){
				aumentaVetor();
			}
			/* reposiciona os valores do vetor desde a maior posi��o utilizada
			 * at� a posi��o seguinte ao que se deseja incluir o novo valor
			 */
			for (int i=this.size; i>indice; i--){ 
				set(i, get(i-1));
			}
			set(indice, valor);
			this.size++;
		}
	}
	
	public void removeFinal(){
		remove(this.size-1);
	}
	
	public void removeInicio(){
		remove(0);
	}
	
	public void remove(int indice){
		if (indiceValido(indice, 1)){
			/* reposiciona os valores do vetor desde a posi��o a excluir
			 * at� a �ltima posi��o
			 */
			for (int i=indice; i<this.size; i++){ 
				set(i, get(i+1));
			}
			this.size--;
		}
	}
	
	private boolean indiceValido(int indice, int operacao) {
		String msg = "Posi��o inexistente!!!";
		/* operacao:
		 * 		0 = incluir (permite inclus�o no final do vetor)
		 * 		1 = excluir
		 */
		switch (operacao){
		case 0:
			if (indice >= 0 && indice <= this.size){
				return true;
			}
		case 1:
			if (isEmpty()){
				msg = "Vetor vazio!!!";
			}else{
				if (indice >= 0 && indice < this.size){
					return true;
				}
			}
		}
		System.err.println(msg);
		return false;
	}
	
	private void aumentaVetor() {
		this.capacity *= 2;
		int [] novoVetor = new int [this.capacity];
		for (int i=0; i<this.size; i++){
			novoVetor[i] = get(i);
		}
		this.vetor = novoVetor;
	}
	
	public void ListaVetor() {
		if (isEmpty()){
			System.err.println("Vetor vazio!!!");
		}else{
			for (int i=0; i<this.size; i++){
				System.out.println("["+i+"] "+this.vetor[i]);
			}
		}	
	}
	
	private int get(int indice) {
		return this.vetor[indice];
	}

	private void set(int indice, int valor) {
		this.vetor[indice] = valor;
	}
	
	public int Size(){
		return this.size;
	}
	
	public int Capacity(){
		return this.capacity;
	}
	
	public boolean isEmpty(){
		if (this.size > 0){
			return false;
		}else{
			return true;
		}
	}

}
