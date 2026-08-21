public class Hero { 
    protected String name;
    private MovementStrategy movementStrategy;
    

    public Hero(String name, MovementStrategy movementStrategy) {
        this.name = name;
        this.movementStrategy = movementStrategy;
    }


    public void performMove() {
        movementStrategy.move();
    }

}