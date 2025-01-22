import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCapitalizeSelectionTextCommand {
    
    @Test
    public void testExecute() {
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("text one");
        assertEquals("Text one boat Text one text", command.execute("text one boat text one text"));
    }
    
}
