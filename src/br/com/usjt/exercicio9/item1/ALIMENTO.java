package br.com.usjt.exercicio9.item1;

public enum ALIMENTO {
	BEBIDA(1.00), SALGADINHO(2.50), BOLACHA(5.55);

    private final double value;
    
    ALIMENTO(double value) { 
    	this.value = value;
    }
    
    public double getValue() { 
    	return value;
    }
}
