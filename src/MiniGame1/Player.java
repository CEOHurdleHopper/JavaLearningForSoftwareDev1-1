package MiniGame1;

public class Player {

    private boolean  isAlive;
    private int location;
    public Player() {}

    public Player(boolean isAlive, int location) {
        this.setIsAlive(isAlive);
        this.setLocation(location);
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }


}
