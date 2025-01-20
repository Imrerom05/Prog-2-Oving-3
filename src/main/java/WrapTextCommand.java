public class WrapTextCommand extends TextCommand {

    protected final String opening;
    protected final String end;

    public WrapTextCommand(String opening, String end) {
        this.opening = opening;
        this.end = end;
    }

    @Override
    public String execute(String text) {
        return opening + text + end;
    }

    public String getOpening() {
        return opening;
    }

    public String getEnd() {
        return end;
    }
    
}
