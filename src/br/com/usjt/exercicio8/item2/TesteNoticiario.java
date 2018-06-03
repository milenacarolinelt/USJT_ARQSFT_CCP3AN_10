package br.com.usjt.exercicio8.item2;

public class TesteNoticiario {
	public static void main(String[] args) {
		NoticiarioAssina assina = new NoticiarioAssina();
		assina.notificaNoticia("Eu morri!", 03, 06, "Morte");
		
		System.out.println("-------- Publicador");
		Publicador publicador = new Publicador();
		publicador.inscreve("A morte da minha alma", 03, 06, "Morte");
		
		System.out.println("-------- Agregador");
		Agregador agregador = new Agregador();
		agregador.inscreve("Friends é maravilhoso!", 03, 06, "Série");
		agregador.inscreve("Chorando.", 03, 06, "Tristeza");
		agregador.inscreve("To com sono", 03, 06, "Sono");
		agregador.inscreve("123", 03, 06, "Morte");
		agregador.inscreve("Chorando2!", 03, 06, "Morte");
		agregador.inscreve("Friends é maravilhoso!", 03, 06, "Série");
		agregador.inscreve("Eu morri3!", 03, 06, "Morte");
		agregador.inscreve("Eu morri4!", 03, 06, "Morte");
		agregador.inscreve("Friends é maravilhoso!", 03, 06, "Série");
		agregador.inscreve("Eu morri6!", 03, 06, "Morte");
		agregador.inscreve("Friends é maravilhoso!", 03, 06, "Série");
	}
}
