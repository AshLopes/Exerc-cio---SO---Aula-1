package prjTempoGasto;

import javax.swing.JOptionPane;

public class ViewTempoGasto {

	public static void main(String[] args) {
		Controler met = new Controler();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor que deseja calcular o tempo de preenchimento"));
		JOptionPane.showMessageDialog(null,  "O tempo (nanosegundos) utilizado para processar um vetor de : "+tamanho+" posições, é: "+ met.tempoGastoVet(tamanho));
	}

}
