

import java.util.*;

public class Rooms extends Exit{

    private int roomNum;
    private String roomName;
    private String description;
    private ArrayList<Exit> exits;
    private boolean isVisited;

    public Rooms(int roomNum, String roomName, String description, boolean isVisited, ArrayList<Exit> exits) {
        this.setRoomNum(roomNum);
        this.setRoomName(roomName);
        this.setDescription(description);
        this.setExits(exits);
        this.setIsVisited(isVisited);
    }

    public Rooms() {}

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public void setExits(ArrayList<Exit> exits) {
        this.exits = exits;
    }

    public boolean getIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }


    @Override
    public String toString() {
        return "Rooms [roomNum=" + roomNum + ", roomName=" + roomName + ", description=" + description + ", exits="
                + exits + ", isVisited=" + isVisited + "]";
    }


}
