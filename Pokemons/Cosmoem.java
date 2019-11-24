package Pokemons;

import packet.Tackle;
import packet.TakeDown;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cosmoem extends Pokemon {
    public Cosmoem(String name, int i) {
        super(name, i);
        this.setType(Type.PSYCHIC);
        this.setStats(43, 29, 131, 29, 131, 37);
        this.addMove(new Tackle());
        this.addMove(new TakeDown());


    }


}