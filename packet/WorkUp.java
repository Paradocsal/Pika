package packet;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp(){super(Type.NORMAL,0,0);}
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.SPECIAL_ATTACK, 1);

    }
    protected String describe(){
        return ("WorkUp");
    }
}
