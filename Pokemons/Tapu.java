package Pokemons;

import packet.DoubleHit;
import packet.Rest;
import packet.Scald;
import packet.Swift;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tapu extends Pokemon {

    public Tapu(String name, int i ){
        super(name, i);
        this.setStats(70,130,115,85,95,75);
        this.setType(Type.GRASS,Type.FAIRY);
        this.addMove(new Swift());
        this.addMove(new Rest());
        this.addMove(new Scald());
        this.addMove(new DoubleHit());







    }



}
