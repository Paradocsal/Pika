package packet;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {

    public Scald() { super(Type.WATER, 80, 100); }


    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().condition(Status.BURN).chance(0.3));

    }
    protected String describe(){
        return ("Scald");

    }
}