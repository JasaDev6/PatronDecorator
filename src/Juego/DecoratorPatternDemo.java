package Juego;

public class DecoratorPatternDemo{
	
	public static void main(String[] args) {
		Guerrero infanteria = new Infanteria();
		
		Guerrero madera = new Madera(new Infanteria());
		
		Guerrero metal = new Metal(new Arquero());
		System.out.println("\nTipo de Guerrero:");
		infanteria.dibujar();
		
		System.out.println("\nGuerrero con armadura:");
		madera.dibujar();
		System.out.println("\nGuerrero con armadura:");
		metal.dibujar();
	}
}
