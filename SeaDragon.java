public class SeaDragon extends FlyingHero{
    public SeaDragon(String name) {
        super(name);
    }
    
    @Override
    public void move() {
        System.out.println(name + " is gliding through the water and soaring through the clouds.");
    }
}