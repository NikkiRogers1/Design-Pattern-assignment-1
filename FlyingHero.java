public class FlyingHero extends Hero {
    public FlyingHero(String name) {
    super(name);
    }   
    @Override   
    public void move() {
        System.out.println("I am soaring through the clouds!");
    }
}
