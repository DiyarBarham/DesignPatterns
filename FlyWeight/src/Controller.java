public class Controller {
    public static void main (String[] args){
        ParticlesFactory factory = new ParticlesFactory();

        MovingParticle m1 = factory.newParticle("1", "11", 111, "red", "r");
        MovingParticle m2 = factory.newParticle("2", "22", 222, "red", "r");
        MovingParticle m3 = factory.newParticle("3", "33", 333, "blue", "b");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        factory.printList();
    }
}
