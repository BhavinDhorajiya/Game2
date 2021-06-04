package ass3.mygame2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ItemCreationTest {
    ItemCreation itemCreation=new ItemCreation();
    @Test
    public void testCreateItems(){
        int expected=4;
        itemCreation.createItems();
        int actual=itemCreation.getNumberOfItems();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetItem(){
        Item expected=new Item("Magical Herb","To heal the warrior",0);
        Item actual=itemCreation.getItem("Magical Herb");
        assertEquals(expected,actual);
    }

}
