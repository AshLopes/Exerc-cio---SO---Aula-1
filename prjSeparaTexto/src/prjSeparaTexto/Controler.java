package prjSeparaTexto;

public class Controler {
	public int qtdePartesTexto (String texto) 
	{
		String[] vetPalavras = texto.split(";");
		int tamanhoTexto = 0;
		
		for (int i=0; i < vetPalavras.length; i++) 
		{
			tamanhoTexto ++;
		}
		return tamanhoTexto;
	}
}
