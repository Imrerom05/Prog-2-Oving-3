import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestWarpLinesTextComand {
    @Test
    public void testWrapLinesTextCommand() {
        WrapLinesTextCommand wrapLinesTextCommand = new WrapLinesTextCommand("(", ")");
        assertEquals("(line1)\n(line2)\n(line3)", wrapLinesTextCommand.execute("line1\nline2\nline3"));
    }
}
