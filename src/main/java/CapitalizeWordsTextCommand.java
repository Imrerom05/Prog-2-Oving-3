public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

    @Override
    public String execute(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(super.execute(word)).append(" ");
        }
        return result.toString().trim();
    }
    
}
