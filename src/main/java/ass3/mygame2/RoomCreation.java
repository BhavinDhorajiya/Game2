package ass3.mygame2;


import java.util.ArrayList;

public class RoomCreation {

    private ArrayList<Room> allRoomInGame = new ArrayList();

    private ItemCreation itemCreation;

    public RoomCreation() {
        itemCreation = new ItemCreation();
        createRooms();
    }
    
    
    private void createRooms() {

        Room castle, kitchen, frontGate,livingRoom;

        castle = new Room("castle", "You are at the castle", false);
        kitchen = new Room("kitchen", "The kitchen door has a shape of a heart", false);
        frontGate = new Room("frontGate", "There is a giant ogre", true);
        livingRoom = new Room("LivingRoom", "The Warrior rests", false);
        

        castle.setExit("east", kitchen);
        castle.setExit("south", frontGate);
        frontGate.setExit("north", castle);
        kitchen.setExit("west",livingRoom);
        livingRoom.setExit("north",castle);

        castle.addItemInRoom(itemCreation.getItem("excaliburSword"));
        castle.addItemInRoom(itemCreation.getItem("key"));
        kitchen.addItemInRoom(itemCreation.getItem("frontGateKey"));
        livingRoom.addItemInRoom(itemCreation.getItem("Magical Herb"));

        allRoomInGame.add(castle);
        allRoomInGame.add(frontGate);
        allRoomInGame.add(kitchen);

    }

    public Room getRoom(String stringRoom) {
        Room roomToReturn = null;
        for (Room room : allRoomInGame) {
            if (room.getName().contains(stringRoom)) {
                roomToReturn = room;
            }
        }
        return roomToReturn;
    }

}
