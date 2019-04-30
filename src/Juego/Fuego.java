package Juego;

public class Fuego extends DecoratorArma{

	public Fuego(Guerrero decoratedGuerrero) {
		super(decoratedGuerrero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void dibujar() {
		decoratedGuerrero.dibujar();
		setMetalArma(decoratedGuerrero);
	}

	private void setMetalArma(Guerrero decoratedGuerrero) {
		// TODO Auto-generated method stub
		System.out.println("Arma Tipo: Fuego");
	}

}
