package repeatedwords;

import java.util.ArrayList;

public class WordsAnalyzer {

    private ArrayList<String> repeatedWordsFound;

    public WordsAnalyzer() {
        repeatedWordsFound = new ArrayList<>();
    }

    public void findRepeatedWords(String lineOne, String lineTwo) {
        String[] tokens = tokenizeString(lineOne);
        for (String actualToken : tokens) {
            findOcurrences(lineTwo, actualToken);
        }
    }

    public boolean isRepeated(String word) {
        return repeatedWordsFound.contains(word);
    }

    public String[] tokenizeString(String text) {
        return text.split("[ .,?!]+");
    }

    public void findOcurrences(String lineTwo, String tokens) {
        if (lineTwo.contains(tokens)) {
            updateOcurrencesList(tokens);
        }
    }

    public void updateOcurrencesList(String tokens) {
        if ((!repeatedWordsFound.contains(tokens))) {
            repeatedWordsFound.add(tokens);
        }
    }
}
