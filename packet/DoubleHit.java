package packet;


import ru.ifmo.se.pokemon.*;

public class DoubleHit extends SpecialMove {
    public DoubleHit () {super(Type.NORMAL,35,90,1,2);}
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP,(int) Math.round(p.getStat(Stat.ATTACK)));
        p.setMod(Stat.HP,(int) Math.round(p.getStat(Stat.ATTACK)));





    }
}
