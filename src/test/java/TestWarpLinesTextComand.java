import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestWarpLinesTextComand {
    @Test
    public void testWrapLinesTextCommand() {
        WrapLinesTextCommand wrapLinesTextCommand = new WrapLinesTextCommand("(", ")");
        assertEquals("(line1)\n(line2)\n(line3)", wrapLinesTextCommand.execute("line1\nline2\nline3"));
    }
    
    @Test
    public void testReplaceFirstTextCommand() {
        ReplaceFirstTextCommand replaceFirstTextCommand = new ReplaceFirstTextCommand("line", "row");
        assertEquals("row1\nline2\nline3", replaceFirstTextCommand.execute("line1\nline2\nline3"));
    }
    
    @Test
    public void testScript() {
        TextCommand[] textCommands = new TextCommand[] {
            new WrapLinesTextCommand("(", ")"),
            new ReplaceFirstTextCommand("line", "row")
        };
        Script script = new Script(textCommands);
        assertEquals("(row1)\n(row2)\n(row3)", script.execute("line1\nline2\nline3"));
    }
    
}
