
import junit.framework.Assert;
import org.junit.Test;
import repeatedwords.WordsAnalyzer;

public class WordsAnalyzerTest {

    @Test
    public void acordarme_ShouldBeRepeated() {
        String lineOne = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String lineTwo = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        WordsAnalyzer repeatedWords = new WordsAnalyzer();
        repeatedWords.findRepeatedWords(lineOne, lineTwo);
        Assert.assertTrue(repeatedWords.isRepeated("acordarme"));
    }

    @Test
    public void de_ShouldBeRepeated() {
        String lineOne = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String lineTwo = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        WordsAnalyzer repeatedWords = new WordsAnalyzer();
        repeatedWords.findRepeatedWords(lineOne, lineTwo);
        Assert.assertTrue(repeatedWords.isRepeated("de"));
    }

    @Test
    public void en_ShouldBeRepeated() {
        String lineOne = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String lineTwo = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        WordsAnalyzer repeatedWords = new WordsAnalyzer();
        repeatedWords.findRepeatedWords(lineOne, lineTwo);
        Assert.assertTrue(repeatedWords.isRepeated("en"));
    }

    @Test
    public void lugar_ShouldBeRepeated() {
        String lineOne = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String lineTwo = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        WordsAnalyzer repeatedWords = new WordsAnalyzer();
        repeatedWords.findRepeatedWords(lineOne, lineTwo);
        Assert.assertTrue(repeatedWords.isRepeated("lugar"));
    }

    @Test
    public void mucho_ShouldBeRepeated() {
        String lineOne = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String lineTwo = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        WordsAnalyzer repeatedWords = new WordsAnalyzer();
        repeatedWords.findRepeatedWords(lineOne, lineTwo);
        Assert.assertTrue(repeatedWords.isRepeated("mucho"));
    }

    @Test
    public void no_ShouldBeRepeated() {
        String lineOne = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String lineTwo = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        WordsAnalyzer repeatedWords = new WordsAnalyzer();
        repeatedWords.findRepeatedWords(lineOne, lineTwo);
        Assert.assertTrue(repeatedWords.isRepeated("no"));
    }

    @Test
    public void nombre_ShouldBeRepeated() {
        String lineOne = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String lineTwo = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        WordsAnalyzer repeatedWords = new WordsAnalyzer();
        repeatedWords.findRepeatedWords(lineOne, lineTwo);
        Assert.assertTrue(repeatedWords.isRepeated("nombre"));
    }

    @Test
    public void tiempo_ShouldBeRepeated() {
        String lineOne = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String lineTwo = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        WordsAnalyzer repeatedWords = new WordsAnalyzer();
        repeatedWords.findRepeatedWords(lineOne, lineTwo);
        Assert.assertTrue(repeatedWords.isRepeated("tiempo"));
    }

    @Test
    public void Kansas_ShouldNotBeRepeated() {
        String lineOne = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String lineTwo = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        WordsAnalyzer repeatedWords = new WordsAnalyzer();
        repeatedWords.findRepeatedWords(lineOne, lineTwo);
        Assert.assertFalse(repeatedWords.isRepeated("Kansas"));
    }
}
