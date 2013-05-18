package repeatedwords;

import java.util.ArrayList;

public class RepeatedWords {

    private ArrayList<String> repeatedWordsFound;

    public RepeatedWords() {
        repeatedWordsFound = new ArrayList<>();
    }

    public void find(String text, String text2) {
        String[] tokens = tokenizeString(text);
        for (int i = 0; i < tokens.length; i++) {
            findOcurrences(text2, tokens[i]);
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
        String delims = " ";
        String[] tokens = text.split(delims);
        return tokens;
    }

    public void findOcurrences(String text2, String tokens) {
        String line = text2;
        int ocurrences = 0;
        while (line.indexOf(tokens) > -1) {
            line = line.substring(line.indexOf(tokens) + 1, line.length());
            ocurrences++;
        }
        if (ocurrences > 0) {
            repeatedWordsFound.add(tokens);
        }
        line = text2;
    }
}
