public class Particle {
    private String color;
    private String sprite;

    public Particle(String color, String sprite) {
        this.color = color;
        this.sprite = sprite;
    }

    public Particle() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public String getColor() {
        return color;
    }

    public String getSprite() {
        return sprite;
    }
}
