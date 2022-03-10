package calculadora.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {
	
	public Botao(String texto, Color cor) {
		setText(texto);
		setFont(new Font("counter", Font.PLAIN, 20));
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.white);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	
		
	}

}
