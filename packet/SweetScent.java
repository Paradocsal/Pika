package packet;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove {
    public SweetScent(){super(Type.NORMAL,0,100);}
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.EVASION, (int) (p.getStat(Stat.EVASION))- 1));

    }
    protected String describe(){
       return ("SweetScent");
    }
}
