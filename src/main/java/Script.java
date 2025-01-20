public class Script {
    private final TextCommand[] textCommands;

    public Script(TextCommand[] textCommands) {
        this.textCommands = textCommands;
    }

    public String execute(String text) {
        for (TextCommand textCommand : textCommands) {
            text = textCommand.execute(text);
        }
        return text;
    }
}
