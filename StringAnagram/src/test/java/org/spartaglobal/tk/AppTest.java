package org.spartaglobal.tk;

/*import static org.junit.Assert.assertTrue;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    StringAnagram stringAnagram = new StringAnagram();

    @Test
    public void checkThatwordOneAndWordTwoAreAnagrams() {
        Assertions.assertTrue(stringAnagram.isAnagram("dog", "god"));
    }
    @Test
    public void checkOneLetterStringsWork() {
        Assertions.assertTrue(stringAnagram.isAnagram("h", "h"));
    }
    @Test
    public void checkThatword1AndWord2AreAnagrams() {
        Assertions.assertTrue(stringAnagram.isAnagram("downtime", "timedown"));
    }
    @Test
    public void checkThatOneWordIsConvertedToLowerCase() {
        Assertions.assertTrue(stringAnagram.isAnagram("Downtime", "timedown"));
    }
    @Test
    public void checkThatBothStringsAreConvertedToLowerCase() {
        Assertions.assertTrue(stringAnagram.isAnagram("Downtime", "TimeDown"));
    }

    @Test
    public void checkEmptyStringsWork() {
        Assertions.assertTrue(stringAnagram.isAnagram("", ""));
    }

    }
