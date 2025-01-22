import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestReplaceTextCommand {

    @Test
    public void testExecute() {
        ReplaceTextCommand command = new ReplaceTextCommand("a", "b");
        assertEquals("lbbrbdor", command.execute("labrador"));
    }
    
}
