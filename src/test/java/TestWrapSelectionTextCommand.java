import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestWrapSelectionTextCommand {
    @Test
    public void testWrapSelectionTextCommand() {
        WrapSelectionTextCommand wrapSelectionTextCommand = new WrapSelectionTextCommand("(", ")", "line1");
        assertEquals("line 0 (line1)", wrapSelectionTextCommand.execute("line 0 line1"));
    }
}
