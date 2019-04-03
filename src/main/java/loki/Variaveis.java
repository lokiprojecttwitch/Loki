package loki;

import javax.swing.JOptionPane;

public class Variaveis {

	private String nomeUsuario;
	private String senhaUsuario;
	private String url;

	

	public String getSenhaUsuario() {
		this.senhaUsuario = JOptionPane.showInputDialog("Insira sua senha: ");
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
