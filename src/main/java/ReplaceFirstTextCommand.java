public class ReplaceFirstTextCommand extends TextCommand {

    private final String target;
    private final String replacement;

    public ReplaceFirstTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    @Override
    public String execute(String text) {
        return text.replaceFirst(target, replacement);
    }
    
}
