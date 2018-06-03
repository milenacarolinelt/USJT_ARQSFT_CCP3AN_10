package br.com.usjt.exercicio8.item1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NoticiarioAssina extends Noticiario implements ConsomeNoticia{

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		NumberFormat format = new DecimalFormat("#00");;
		System.out.println("Noticia: " + textoNoticia);
		System.out.println("Data: " + format.format(dia) + "/" + format.format(mes));
		System.out.println("Tópico: " + topico);
	}
}
