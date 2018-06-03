package br.com.usjt.exercicio9.item1;

public class Slot_100 implements Slot{
	private Slot slot;
	private String slotName;
	
	public Slot_100() {
		slotName = "R$ 1,00";
	}
	
	@Override
	public double process(int moeda) {
		if(moeda == 100) {
			return 1;
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
