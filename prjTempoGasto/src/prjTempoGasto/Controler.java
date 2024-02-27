package prjTempoGasto;

public class Controler {
	
	public double tempoGastoVet(int tamanho) 
	{
		int[] vet = new int[tamanho];
		
		double tempoinicial = System.nanoTime();
		for (int i = 0; i < tamanho; i++) 
		{
			vet[i] = 0;
		}
		double tempofinal = System.nanoTime();
		double tempototal = tempofinal - tempoinicial;
		//double tempototal1 = (tempototal / Math.pow(10, 9));
		
		return tempototal;
	}
	
}
