package br.com.usjt.exercicio8.item1;

public class NoticiarioAssina implements ConsomeNoticia{
	private final Noticiario observer;

	public NoticiarioAssina(Noticiario observer) {
		this.observer = observer;
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		// TODO Auto-generated method stub
		
	}

}
