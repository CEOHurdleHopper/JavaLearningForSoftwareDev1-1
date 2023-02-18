package MiniGame1;
/*
How to win the game:
East,
East,
East,
South,
South,
East,
Then press q or type quit
 */

import java.io.*;
import java.util.*;

public class GameUI {

    public static void main(String[] args) {
        GameUI gui = new GameUI();
        Player p1 = new Player();
        Scanner input = new Scanner(System.in);
        String direction;
        Exit exit = new Exit();

        p1.setLocation(0);

        //The exact file location is needed for the game to run on each machine that runs this code
        ArrayList<Rooms> roomFileReader = gui.readFile("C:\\Users\\chidi\\IdeaProjects\\JavaLearningForSoftwareDev1\\src\\MiniGame1\\Rooms.txt");

        do {

            System.out.println(roomFileReader.get(p1.location).getRoomNum());

            if (roomFileReader.get(p1.location).isVisited) {
                System.out.println("You reach the " + roomFileReader.get(p1.location).getRoomName() + " again");
            } else {
                System.out.println("You remain in the " + roomFileReader.get(p1.location).getRoomName());
                roomFileReader.get(p1.location).setIsVisited(true);
            }
            System.out.println(roomFileReader.get(p1.location).getDescription());
            System.out.println(roomFileReader.get(p1.location).getExits());

            while (true) {
                System.out.println();
                direction = input.nextLine();

                if (gui.getNavigation().contains(direction.toLowerCase())) ;
                p1.movePlayer(direction, roomFileReader);
                break;
            }   if (direction.equalsIgnoreCase("quit") || direction.equalsIgnoreCase("q")) {
                System.out.println(("Game Over You WIN!!!"));
                break;
            }
        } while (true);
    }

    public ArrayList<Rooms> readFile(String filename) {
        ArrayList<Rooms> rooms = new ArrayList<>();

        File roomFile = new File(filename);

        try {
            Scanner readFile = new Scanner(roomFile);

            while (readFile.hasNext()) {

                String roomNum = readFile.nextLine();
                String roomName = readFile.nextLine();
                ArrayList<String> description = new ArrayList<String>();
                ArrayList<Exit> exits = new ArrayList<>();

                Rooms oneRoom = new Rooms(roomNum, roomName, description, exits);
                String line = readFile.nextLine();
                while (!line.equals("-----")) {
                    oneRoom.getDescription().add(line);
                    line = readFile.nextLine();
                }

                while (readFile.hasNextLine() && !(line = readFile.nextLine()).equals("-----")) {
                    String direction = line.split(" ")[0];
                    int destination = Integer.parseInt(line.split(" \n")[1]);
                    exits.add(new Exit(direction, destination));
                }

                oneRoom.setExits(exits);
                rooms.add(oneRoom);

            }
            readFile.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("This file, " + filename + ", could not be found. Please try again");
            fnfe.printStackTrace();
        }
        return rooms;
    }

    public ArrayList<String> getNavigation() {
        ArrayList<String> navigation = new ArrayList<>();

        navigation.add("north");
        navigation.add("south");
        navigation.add("east");
        navigation.add("west");

        return navigation;
    }

}
