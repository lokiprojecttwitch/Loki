package loki;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Variaveis {

	private String nomeUsuario;
	private String senhaUsuario;
	private String url;

	

	public String getSenhaUsuario() {
		JPasswordField password = new JPasswordField(10);
		password.setEchoChar('*'); 
		JLabel rotulo = new JLabel("Insira a senha do usuario:");
		JPanel entUsuario = new JPanel();
		entUsuario.add(rotulo);
		entUsuario.add(password);
		JOptionPane.showMessageDialog(null, entUsuario, "Entrada", JOptionPane.PLAIN_MESSAGE);
		String senha = password.getText();
		this.senhaUsuario = senha;
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getUrl() {
		this.url = JOptionPane.showInputDialog("Insira a URL do seu canal desejado: ");
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getNomeUsuario() {
		this.nomeUsuario = JOptionPane.showInputDialog("Insira seu nome de usuário: ");
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
}
