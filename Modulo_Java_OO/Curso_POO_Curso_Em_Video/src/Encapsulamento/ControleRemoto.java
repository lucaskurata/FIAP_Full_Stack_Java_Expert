package Encapsulamento;

public class ControleRemoto implements Controle{

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto(int volume, boolean ligado, boolean tocando) {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	private int getVolume() {
		return this.volume;
	}
	
	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado()  {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
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
		System.out.println("A TV está ligada? " + this.isLigado());
		System.out.println("A TV está tocando? " + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 1; i <= this.getVolume(); i+=10) {
			System.out.println("|");
		}		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu... ");
		
	}

	@Override
	public void maisVolume() {
		if(this.isLigado() && this.getVolume() < 100){
			this.setVolume(this.getVolume() + 10);
		}else {
			System.out.println("Volume não suportado e/ou TV desligada");
		}
	}

	@Override
	public void menosVolume() {
		if(this.isLigado() && this.getVolume() >= 10) {
			this.setVolume(this.getVolume() - 10);
		}else {
			System.out.println("Volume não suportado e/ou TV desligada");
		}		
	}

	@Override
	public void ligarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}		
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}		
	}

	@Override
	public void play() {
		if(this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}		
	}

	@Override
	public void pause() {
		if(this.isLigado() && (this.isTocando())) {
			this.setTocando(false);
		}		
	} 	
	
}
