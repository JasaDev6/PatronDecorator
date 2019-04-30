package Juego;

public class Madera extends DecoratorArma{

	public Madera(Guerrero decoratedGuerrero) {
		super(decoratedGuerrero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void dibujar() {
		decoratedGuerrero.dibujar();
		setMaderaArma(decoratedGuerrero);
	}

	private void setMaderaArma(Guerrero decoratedGuerrero) {
		// TODO Auto-generated method stub
		System.out.println("Arma Tipo: Madera");
	}

}
