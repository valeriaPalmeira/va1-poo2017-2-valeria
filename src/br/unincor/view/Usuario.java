package br.unincor.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Nesta classe você deve tratar exceção
 * em todos os métodos que podem vir a lançar
 * exceções por entrada incorreta do usuário. 
 *
 */
public class Usuario {

	public void exibeMsg(String texto) {
		JOptionPane.showMessageDialog(null, texto, "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
	}

	public void exibeMsgErro(String texto) {
		JOptionPane.showMessageDialog(null, texto, "ERRO", JOptionPane.ERROR_MESSAGE);
	}

	/*public void exibeMsgDebug(String texto) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(new Date()) + " - [DEBUG] " + texto);
	}*/

	public Integer recebeInteiro(String texto) {
		try {
			String resposta = JOptionPane.showInputDialog(texto);
			Integer respostaConvertida = Integer.parseInt(resposta);
			return respostaConvertida;
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}

	public Long recebeLong(String texto) {
		try {
			String resposta = JOptionPane.showInputDialog(texto);
			Long respostaConvertida = Long.parseLong(resposta);
			return respostaConvertida;
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}

	public Double recebeDouble(String texto) {
		try {
			String resposta = JOptionPane.showInputDialog(texto);
			Double respostaConvertida = Double.parseDouble(resposta);
			return respostaConvertida;
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}
	public Float recebeFloat(String texto){
		try {
			String resposta = JOptionPane.showInputDialog(texto);
			Float respostaConvertida = Float.parseFloat(resposta);
			return respostaConvertida;
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}
	
	public Boolean recebeBoolean(String texto) {
		try {
			int resposta = JOptionPane.showConfirmDialog(null, texto);
			if(resposta == JOptionPane.YES_OPTION)
				return Boolean.TRUE;
			return Boolean.FALSE;
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}

	public String recebeTexto(String texto) {
		String resposta = JOptionPane.showInputDialog(texto);
		return resposta;
	}
}
