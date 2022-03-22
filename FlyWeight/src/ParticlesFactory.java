import java.util.ArrayList;
import java.util.List;

public class ParticlesFactory {
    private static List<Particle> ls = new ArrayList<Particle>();

    public static MovingParticle newParticle(String coords, String vector, int speed, String color, String sprite) {
        MovingParticle p = new MovingParticle(coords, vector, speed);

        for (Particle particle :
                ls) {
            if (particle.getColor().equals(color) && particle.getSprite().equals(sprite)) {
                p.setParticle(particle);
                break;
            }
        }
        if (p.getParticle() == null){
            Particle particle = new Particle(color, sprite);
            ls.add(particle);
            p.setParticle(particle);
        }
        return p;
    }
    
    public void printList(){
        for (Particle p :
                ls) {
            System.out.println("Color: "+p.getColor()+"\n Sprite: "+p.getSprite());
        }
    }
}