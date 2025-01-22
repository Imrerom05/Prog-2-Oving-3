import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestScript {

    @Test
    public void testScript() {
        TextCommand[] textCommands = new TextCommand[] {
            new CapitalizeSelectionTextCommand("hello"),
            new WrapLinesTextCommand("(", ")"),
            new ReplaceFirstTextCommand("world", "planet")
        };
        Script script = new Script(textCommands);
        String text = "hello world\nhello world";
        String expected = "(Hello planet)\n(Hello world)";
        assertEquals(expected, script.execute(text));
    }
    
}
