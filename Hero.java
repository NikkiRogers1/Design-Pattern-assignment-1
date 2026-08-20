public class Hero { 
    protected String name;

    public Hero(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    public static void main(String[] args) {
        Hero  hero = new Hero("Generic Hero");
        hero.move();

        Hero flyingHero = new FlyingHero("Flying Hero");
        flyingHero.move();      

        Hero swimmingHero = new SwimmingHero("Swimming Hero");
        swimmingHero.move();
        Hero seaDragon = new SeaDragon("Sea Dragon");
        seaDragon.move();

    }
}