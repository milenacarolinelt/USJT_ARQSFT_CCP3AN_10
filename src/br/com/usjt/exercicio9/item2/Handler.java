package br.com.usjt.exercicio9.item2;

public class Handler {
	private Handler handler;
	private String numero;
	private long lastTime;
	
	public Handler(String numero) {
		this.numero = numero;
	}

	public void handleRequest() {
		long time = System.currentTimeMillis();
		if (time - this.lastTime < 200) {
			if(this.handler != null) {
				this.handler.handleRequest();
			}else {
				System.out.println("Handler Indiponivel");
			}
		}else {
			this.lastTime = time;
			System.out.println("Handler " + numero);
		}
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
