package Pokemons;

import packet.SweetScent;
import packet.Tackle;
import packet.TakeDown;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Solgaleo extends Pokemon {
    public Solgaleo(String name, int i){
        super(name, i);
        this.setStats(137,137,107,113,89,97);
        this.setType(Type.PSYCHIC,Type.STEEL);
        this.addMove(new TakeDown());
        this.addMove(new Tackle());
        this.addMove(new SweetScent());
    }


}
