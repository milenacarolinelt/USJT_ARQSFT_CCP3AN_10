package br.com.usjt.exercicio8.item2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Publicador extends Noticiario implements ConsomeNoticia{

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		NumberFormat format = new DecimalFormat("#00");;
		System.out.println("Noticia: " + textoNoticia + " Data: " + format.format(dia) + "/" + format.format(mes) + " Tópico: " + topico);
	}

	@Override
	public void inscreve(String textoNoticia, int dia, int mes, String topico) {
		notificaNoticia(textoNoticia, dia, mes, topico);
	}

}
