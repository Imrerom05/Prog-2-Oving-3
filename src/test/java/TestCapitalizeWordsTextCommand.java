import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCapitalizeWordsTextCommand {
    
    @Test
    public void testExecute() {
        CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
        assertEquals("Hello World", command.execute("hello world"));
    }
    
}
