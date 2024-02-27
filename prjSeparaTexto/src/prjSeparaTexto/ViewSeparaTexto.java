package prjSeparaTexto;

import javax.swing.JOptionPane;

public class ViewSeparaTexto {

	public static void main(String[] args) {
		Controler met = new Controler();
		String texto = JOptionPane.showInputDialog("Digite o texto que deseja separar");
		JOptionPane.showMessageDialog(null, "Seu texto possui "+met.qtdePartesTexto(texto)+" partes");

	}

}
