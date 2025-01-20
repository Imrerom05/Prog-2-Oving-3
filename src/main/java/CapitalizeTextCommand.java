public class CapitalizeTextCommand extends TextCommand {

    @Override
    public String execute(String text) {

        return (Character.toUpperCase(text.charAt(0)) + text.substring(1));
    }
}
