package controleRemoto;

public class ControleRemoto implements Controlador {
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//metodos construtor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = true;
	}
	
	//metodos especiais
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}
	@Override
	public void desligar() {
		this.setLigado(false);
		
	}
	@Override
	public void abrirMenu() {
		System.out.println("ligado: "+ this.getLigado());
		System.out.println("tocando: " + this.getTocando());
		System.out.println("volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("/");
		}
		
	}
	@Override
	public void fecharMenu() {
		System.out.println("fechando menu");
		
	}
	@Override
	public void maisvolume() {
		if (this.getLigado()) {
			this.setVolume(getVolume() + 5);
		}
		
	}
	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
		
	}
	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
			}
		}
		
	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}
	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}
	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
	
	

	

}
