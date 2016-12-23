package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon
{
	public Charmander(String nickName, PokemonType type, int cp) 
	{
		super(nickName, type, cp);
	}

	@Override
	public void attack()
	{
		System.out.println("Ember¡K");		
	}
	
}
