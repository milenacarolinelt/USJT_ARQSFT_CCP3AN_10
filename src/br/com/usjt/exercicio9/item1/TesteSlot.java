package br.com.usjt.exercicio9.item1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class TesteSlot {
	Slot slot05, slot10, slot25, slot50, slot100;
	double valorTotal;
	double valorAlimento;
	
	public TesteSlot() {
		slot05 = new Slot_05();
		slot10 = new Slot_10();
		slot25 = new Slot_25();
		slot50 = new Slot_50();
		slot100 = new Slot_100();
		
		slot05.setSlot(slot10);
		slot10.setSlot(slot25);
		slot25.setSlot(slot50);
		slot50.setSlot(slot100);
		valorTotal = 0;
		valorAlimento = 0;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorAlimento() {
		return valorAlimento;
	}

	public void setValorAlimento(double valorAlimento) {
		this.valorAlimento = valorAlimento;
	}

	public void inserirMoeda(int value) {
		if(getValorAlimento() > 0){
			double valor = getValorTotal();
			setValorTotal(valor + slot05.process(value));
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		NumberFormat format = new DecimalFormat("#0.00");
		TesteSlot main = new TesteSlot();
		ALIMENTO alimento = ALIMENTO.BEBIDA;
		main.setValorAlimento(alimento.getValue());
		System.out.println("Total à pagar: R$" + format.format(alimento.getValue()));
		while(main.getValorAlimento() > main.getValorTotal()) {
			System.out.println("Escolha uma moeda:");
		    System.out.println("Apertar 1 : R$ 0,05");
		    System.out.println("Apertar 2 : R$ 0,10");
		    System.out.println("Apertar 3 : R$ 0,25");
		    System.out.println("Apertar 4 : R$ 0,50");
		    System.out.println("Apertar 5 : R$ 1,00");
		    int opcao = Integer.parseInt(scanner.nextLine());
		    switch (opcao) {
				case 1:
					main.inserirMoeda(5);
					break;
				case 2:
					main.inserirMoeda(10);
					break;
				case 3:
					main.inserirMoeda(25);
					break;
				case 4:
					main.inserirMoeda(50);
					break;
				case 5:
					main.inserirMoeda(100);
					break;
				default:
					break;
			}
			System.out.println("Total inserido: R$" + format.format(main.getValorTotal()));
			double troco = main.getValorTotal() - main.getValorAlimento();
			if(troco > 0)
				System.out.println("Total do troco: R$" + format.format(troco));	
		}
	}
}
