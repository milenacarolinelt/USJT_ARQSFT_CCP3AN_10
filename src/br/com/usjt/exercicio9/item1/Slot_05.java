package br.com.usjt.exercicio9.item1;

public class Slot_05 implements Slot {
	private Slot slot;
	private String slotName;
	
	public Slot_05() {
		slotName = "R$ 00,05";
	}
	
	@Override
	public double process(int moeda) {
		if(moeda == 5) {
			return 0.05;
		}else if(slot != null) {
			return slot.process(moeda);
		}
		return 0;
	}

	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	@Override
	public String getSlot() {
		return slotName;
	}

}
