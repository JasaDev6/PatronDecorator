package Juego;

public abstract class DecoratorArma implements Guerrero{
	
	protected Guerrero decoratedGuerrero;
	
	public DecoratorArma(Guerrero decoratedGuerrero) {
		this.decoratedGuerrero = decoratedGuerrero;
	}
	
	public void dibujar() {
		decoratedGuerrero.dibujar();
	}
}
