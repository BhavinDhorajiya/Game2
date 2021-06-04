package ass3.mygame2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PlayerTest {
    Player player=new Player();
    @Test
    public void testAddItem(){
        Item item = new Item("gun","this is a gun", 0);
        player.addItemInventory(item);
        Item expected=player.getPlayerItem("gun");
    }
}
