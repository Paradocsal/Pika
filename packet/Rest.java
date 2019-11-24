package packet;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest () { super(Type.PSYCHIC, 0, 100); }
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().condition(Status.SLEEP));
        p.addEffect(new Effect().stat(Stat.HP, (int) p.getStat(Stat.HP)).turns(2));


    }
    protected String describe(){
        return ("Rest");
    }

}
