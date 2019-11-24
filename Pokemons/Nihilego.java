package Pokemons;

import packet.SweetScent;
import packet.Tackle;
import packet.TakeDown;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nihilego extends Pokemon {
    public Nihilego(String name, int i){
        super(name, i);
        this.setStats(109,53,47,127,131,103);
        this.setType(Type.POISON,Type.ROCK);
        this.addMove(new TakeDown());
        this.addMove(new Tackle());
        this.addMove(new SweetScent());
    }

}
