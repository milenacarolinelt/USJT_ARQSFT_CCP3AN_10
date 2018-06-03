package br.com.usjt.exercicio8.item2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Agregador extends Noticiario implements ConsomeNoticia{	
	List<Noticia> lista = new ArrayList<Noticia>();

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		NumberFormat format = new DecimalFormat("#00");;
		System.out.println("Noticia: " + textoNoticia + " Data: " + format.format(dia) + "/" + format.format(mes) + " Tópico: " + topico);
	}

	@Override
	public void inscreve(String textoNoticia, int dia, int mes, String topico) {
		if(lista.size() < 10) {
			lista.add(new Noticia(textoNoticia, dia, mes, topico));	
		}else if(lista.size() == 10) {
			for (Noticia noticia : lista) {
				notificaNoticia(noticia.getNoticia(), noticia.getDia(), noticia.getMes(), noticia.getTopico());
			}
		}
	}

}
