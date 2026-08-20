public class SwimmingHero extends Hero {
    public SwimmingHero(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println( "I am gliding through the water.");
    }
}
