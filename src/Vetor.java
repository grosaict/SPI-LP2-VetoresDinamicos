
public class Vetor {

	private int [] vetor;
	private int capacity;
	private int size = 0;
	
	public void Vetor (int tamanhoInicial){
		this.capacity = tamanhoInicial;
		this.vetor = new int[tamanhoInicial];
	}
	
	public int Size(){
		return this.size;
	}
	
	public int Capacity(){
		return this.capacity;
	}
}
