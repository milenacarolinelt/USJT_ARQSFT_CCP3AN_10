package br.com.usjt.exercicio8.item2;

public class Noticia {
	private String noticia;
	private int dia;
	private int mes;
	private String topico;
	
	public Noticia(String noticia, int dia, int mes, String topico) {
		super();
		this.noticia = noticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;
	}
	
	public Noticia() {}
	
	public String getNoticia() {
		return noticia;
	}
	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getTopico() {
		return topico;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}	
}
