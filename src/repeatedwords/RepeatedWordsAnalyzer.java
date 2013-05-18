package repeatedwords;

import java.util.ArrayList;

public class RepeatedWordsAnalyzer {

    private ArrayList<String> repeatedWordsFound;

    public RepeatedWordsAnalyzer() {
        repeatedWordsFound = new ArrayList<>();
    }

    public void findRepeatedWords(String lineOne, String lineTwo) {
        String[] tokens = tokenizeString(lineOne);
        for (int i = 0; i < tokens.length; i++) {
            findOcurrences(lineTwo, tokens[i]);
        }
    }

    public boolean isRepeated(String word) {
        for (String actualWord : repeatedWordsFound) {
            if (actualWord.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public String[] tokenizeString(String text) {
        String delims = "[ .,?!]+";
        String[] tokens = text.split(delims);
        return tokens;
    }

    public void findOcurrences(String lineTwo, String tokens) {
        int ocurrences = 0;
        while (lineTwo.indexOf(tokens) > -1) {
            lineTwo = lineTwo.substring(lineTwo.indexOf(tokens) + 1, lineTwo.length());
            ocurrences++;
        }
        updateOcurrences(ocurrences, tokens);
    }

    public void updateOcurrences(int ocurrences, String tokens) {
        if (ocurrences > 0) {
            repeatedWordsFound.add(tokens);
        }
    }
}
