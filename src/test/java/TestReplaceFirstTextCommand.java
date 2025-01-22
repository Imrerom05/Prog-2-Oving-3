import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestReplaceFirstTextCommand {
    
    @Test
    public void testExecute() {
        ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("a", "b");
        assertEquals("lbbrador", command.execute("labrador"));
    }
}
