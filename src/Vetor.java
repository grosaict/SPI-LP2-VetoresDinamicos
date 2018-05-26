
public class Vetor {

	private int [] vetor;
	private int capacity;
	private int size = 0;
	
	public Vetor (int tamanhoInicial){
		this.capacity = tamanhoInicial;
		this.vetor = new int[tamanhoInicial];
	}
	
	public void insereFinal(int valor){
		if (this.capacity <= this.size){
			aumentaVetor();
		}
		setVetor(this.size, valor);
		this.size++;
	}
	
	public void insereInicio(int valor){
		insere(1, valor);
	}
	
	public void insere(int indice, int valor){
		if (indiceValido(indice)){
			if (this.capacity <= this.size){
				aumentaVetor();
			}
			/* reposiciona os valores do vetor desde a maior posição utilizada
			 * até a posição seguinte ao que se deseja incluir o novo valor
			 */
			for (int i=(this.size-1); i>=(indice-1); i--){ 
				setVetor(i+1, getVetor(i));
			}
			setVetor(indice-1, valor);
			this.size++;
		}
	}
	
	private boolean indiceValido(int indice) {
		if (indice >= 1 && indice <= (this.size+1)){
			return true;
		}else{
			System.err.println("Posição inexistente!!!");
			return false;
		}
	}

	public int get(int indice){
		return vetor[indice];
	}
	
	public void set(int indice, int valor){
		
	}
	
	public void removeFinal(){
		
	}
	
	public void removeInicio(){
		
	}
	
	public void remove(int indice){
		
	}
	
	private void aumentaVetor() {
		this.capacity *= 2;
		int [] novoVetor = new int [this.capacity];
		for (int i=0; i<this.size; i++){
			novoVetor[i] = this.vetor[i];
		}
		this.vetor = novoVetor;
		
	}
	
	public void ListaVetor() {
		if (isEmpty()){
			System.err.println("Vetor vazio!!!");
		}else{
			for (int i=0; i<this.size; i++){
				System.out.println("["+(i+1)+"] "+this.vetor[i]);
			}
		}	
	}
	
	public int getVetor(int indice) {
		return this.vetor[indice];
	}

	public void setVetor(int indice, int valor) {
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
