package Pokemons;

import packet.Bulldoze;
import packet.Rest;
import packet.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shellos extends Pokemon{

    public Shellos(String name, int i) {
        super(name, i);
        this.setType(Type.WATER);
        this.setStats(76,48,48,57,62,34);
        this.addMove(new Bulldoze());
        this.addMove(new Swagger());
        this.addMove(new Rest());

    }





}

