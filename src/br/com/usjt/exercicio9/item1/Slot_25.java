package br.com.usjt.exercicio9.item1;

public class Slot_25 implements Slot {
	private Slot slot;
	private String slotName;
	
	public Slot_25() {
		slotName = "R$ 00,25";
	}
	
	@Override
	public double process(int moeda) {
		if(moeda == 25) {
			return 0.25;
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
