package br.com.usjt.exercicio9.item1;

public class Slot_10 implements Slot {
	private Slot slot;
	private String slotName;
	
	public Slot_10() {
		slotName = "R$ 00,10";
	}
	
	@Override
	public double process(int moeda) {
		if(moeda == 10) {
			return 0.1;
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
