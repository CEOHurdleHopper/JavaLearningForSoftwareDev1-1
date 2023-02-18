package MiniGame1;

import java.util.*;

public class Rooms extends Exit {

    private String roomNum;
    private String roomName;
    private ArrayList<String> description;
    private ArrayList<Exit> exits;
    boolean isVisited;

    public Rooms() {}
    public Rooms(String roomNum, String roomName, ArrayList<String> description, ArrayList<Exit> exits) {
        this.setRoomNum(roomNum);
        this.setRoomName(roomName);
        this.setDescription(description);
        this.setExits(exits);
        this.isVisited = false;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
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
        return "MiniGame1.Rooms [roomNum=" + roomNum + ", roomName=" + roomName + ", description=" + description + ", exits="
                + exits + ", isVisited=" + isVisited + "]";
    }


}
