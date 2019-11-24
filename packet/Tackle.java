package packet;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
    public Tackle(){super(Type.NORMAL,50,100);}
    protected void applyOppEffects(Pokemon p){
    p.addEffect(new Effect().stat(Stat.ATTACK, 1));


    }

}
