package Pokemons;

import packet.Bulldoze;
import packet.Rest;
import packet.Swagger;
import packet.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gastrodon extends Pokemon {
    public Gastrodon(String name, int i){
        super(name, i);
        this.setType(Type.WATER,Type.GROUND);
        this.setStats(111,83,68,92,82,39);
        this.addMove(new Swagger());
        this.addMove(new Bulldoze());
        this.addMove(new Rest());
        this.addMove(new WorkUp());
    }

}
