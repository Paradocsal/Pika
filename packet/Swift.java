package packet;

import ru.ifmo.se.pokemon.*;

public class Swift extends SpecialMove {
    public Swift(){super(Type.NORMAL,60,100);}
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ACCURACY, 100));


    }
    protected String describe(){
        return ("Swift");
    }
}
