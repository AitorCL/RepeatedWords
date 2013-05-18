

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RepeatedWordsTest {
    
    @Test
    public void howManyWords(){
        String text =  "en un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo";
        String text2 = "ponte en mi lugar, no tengo mucho tiempo para acordarme de tu nombre";
        String Solution[];
        RepeatedWords repeatedWords = new RepeatedWords();
        Solution = repeatedWord.find(text,text2);
        
    }
}
