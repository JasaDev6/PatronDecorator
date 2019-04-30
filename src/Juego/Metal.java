package Juego;

public class Metal extends DecoratorArma{

	public Metal(Guerrero decoratedGuerrero) {
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
		System.out.println("Arma Tipo: Metal");
	}

}
