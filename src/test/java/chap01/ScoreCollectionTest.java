package chap01;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOfTwoNumbers() {
        //준비(arrange)
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        //실행(act)
        int actualResult = collection.arithmeticMean();

        //단언(assert)
        assertThat(actualResult, equalTo(6));
    }

}