package ass3.mygame2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RoomCreationTest {
    RoomCreation roomCreation=new RoomCreation();

    @Test
    public void testRoomCreation(){
        int expected=4;
        int actual=roomCreation.getNumberOfRooms();
        assertEquals(expected,actual);
    }
    @Test
    public void testGetRoom(){
        Room expected=new Room("castle", "You are at the castle", false);
        Room actual=roomCreation.getRoom("castle");
        assertEquals(expected,actual);
    }

    @Test
    public void testGetRoomFailure(){
        Room expected=new Room("castle", "You are at the castle", false);
        Room actual=roomCreation.getRoom("hallway");
        assertNotEquals(expected,actual);
    }
}
