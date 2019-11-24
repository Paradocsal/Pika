package packet;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){ super(Type.GROUND, 60,100); }
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPEED, (int) (p.getStat(Stat.SPEED) - 1)));

    }
    protected String describe(){
        return ("Bulldoze");
    }
}
