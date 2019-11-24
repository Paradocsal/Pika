package packet;
import ru.ifmo.se.pokemon.*;


public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 90);
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        p.addEffect(new Effect().condition(Status.PARALYZE));

    }
    protected String describe(){
        return ("Swagger");
    }




}
