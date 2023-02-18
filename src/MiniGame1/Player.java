package MiniGame1;

import java.util.ArrayList;

public class Player {

    private String name;
    int location;
    public Player() {}

    public Player(String name, int location) {
        this.setName(name);
        this.setLocation(location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void movePlayer(String direction, ArrayList<Rooms> room){
        ArrayList<Exit> exits = room.get(location).getExits();
        direction = direction.toLowerCase();

        for (Exit exit : exits) {
            if (exit.getDirection().equalsIgnoreCase(direction)) {
                setLocation(exit.getDestination());
            }
        }
    }


}
