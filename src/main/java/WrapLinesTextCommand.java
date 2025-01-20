public class WrapLinesTextCommand extends WrapTextCommand {
    
    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    @Override
    public String execute(String text) {
        return super.execute(text.replace("\n", end + "\n" + opening));
            }
    
}
