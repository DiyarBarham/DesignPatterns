public class MovingParticle extends Particle{
    private String coords;
    private String vector;
    private int speed;
    private Particle particle;

    public MovingParticle(String coords, String vector, int speed) {
        super();
        this.coords = coords;
        this.vector = vector;
        this.speed = speed;
    }

    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public String getVector() {
        return vector;
    }

    public void setVector(String vector) {
        this.vector = vector;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Particle getParticle() {
        return particle;
    }

    public void setParticle(Particle particle) {
        this.particle = particle;
    }

    @Override
    public String toString() {
        return "MovingParticle{" +
                "coords='" + coords + '\'' +
                ", vector='" + vector + '\'' +
                ", speed=" + speed +
                ", particle=" + particle +
                '}';
    }
}
