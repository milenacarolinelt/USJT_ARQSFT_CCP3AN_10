package br.com.usjt.exercicio9.item1;

public class Slot_50 implements Slot {
	private Slot slot;
	private String slotName;
	
	public Slot_50() {
		slotName = "R$ 00,50";
	}
	
	@Override
	public double process(int moeda) {
		if(moeda == 50) {
			return 0.5;
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
