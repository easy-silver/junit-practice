package chap03;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class AssertTest {

    @Test
    public void equalToFail1() {
        assertThat(new String[]{"a", "b"}, equalTo(new String[]{"a", "b"}));
    }

    @Test
    public void equalToFail2() {
        assertThat(Arrays.asList(new String[]{"a"}), equalTo(Arrays.asList(new String[]{"a"})));
    }
}
