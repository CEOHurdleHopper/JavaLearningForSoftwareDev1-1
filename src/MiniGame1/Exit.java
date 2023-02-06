package MiniGame1;

public class Exit {

    private String direction;
    private int destination;

    public Exit() {}

    public Exit(String direction, int destination) {
        this.setDirection(direction);
        this.setDestination(destination);
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "MiniGame1.Exit [direction=" + direction + ", destination=" + destination + "]";
    }



}
