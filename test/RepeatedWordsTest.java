
import junit.framework.Assert;
import org.junit.Test;
import repeatedwords.RepeatedWordsAnalyzer;

public class RepeatedWordsTest {

    @Test
    public void acordarme_ShouldBeRepeated() {
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        RepeatedWordsAnalyzer repeatedWords = new RepeatedWordsAnalyzer();
        repeatedWords.findRepeatedWords(text, text2);
        Assert.assertEquals(true, repeatedWords.isRepeated("acordarme"));
    }

    @Test
    public void de_ShouldBeRepeated() {
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        RepeatedWordsAnalyzer repeatedWords = new RepeatedWordsAnalyzer();
        repeatedWords.findRepeatedWords(text, text2);
        Assert.assertEquals(true, repeatedWords.isRepeated("de"));
    }

    @Test
    public void en_ShouldBeRepeated() {
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        RepeatedWordsAnalyzer repeatedWords = new RepeatedWordsAnalyzer();
        repeatedWords.findRepeatedWords(text, text2);
        Assert.assertEquals(true, repeatedWords.isRepeated("en"));
    }

    @Test
    public void lugar_ShouldBeRepeated() {
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        RepeatedWordsAnalyzer repeatedWords = new RepeatedWordsAnalyzer();
        repeatedWords.findRepeatedWords(text, text2);
        Assert.assertEquals(true, repeatedWords.isRepeated("lugar"));
    }

    @Test
    public void mucho_ShouldBeRepeated() {
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        RepeatedWordsAnalyzer repeatedWords = new RepeatedWordsAnalyzer();
        repeatedWords.findRepeatedWords(text, text2);
        Assert.assertEquals(true, repeatedWords.isRepeated("mucho"));
    }

    @Test
    public void no_ShouldBeRepeated() {
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        RepeatedWordsAnalyzer repeatedWords = new RepeatedWordsAnalyzer();
        repeatedWords.findRepeatedWords(text, text2);
        Assert.assertEquals(true, repeatedWords.isRepeated("no"));
    }

    @Test
    public void nombre_ShouldBeRepeated() {
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        RepeatedWordsAnalyzer repeatedWords = new RepeatedWordsAnalyzer();
        repeatedWords.findRepeatedWords(text, text2);
        Assert.assertEquals(true, repeatedWords.isRepeated("nombre"));
    }

    @Test
    public void tiempo_ShouldBeRepeated() {
        String text = "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        RepeatedWordsAnalyzer repeatedWords = new RepeatedWordsAnalyzer();
        repeatedWords.findRepeatedWords(text, text2);
        Assert.assertEquals(true, repeatedWords.isRepeated("tiempo"));
    }
}
