package chap03;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class AssertTest {

    @Test
    public void equalToFail1() {
        assertThat(new String[]{"a", "b"}, equalTo(new String[]{"a", "b"}));
    }

    @Test
    public void equalToFail2() {
        assertThat(Arrays.asList("a"), equalTo(Arrays.asList("a")));
    }

    @Test
    public void isTest() {
        String name = "my big fat acct";
        assertThat(name, is(equalTo("my big fat acct")));
    }

    @Test
    public void notTest() {
        String name = "my big fat acct";
        assertThat(name, not("plunderings"));
    }

    @Test
    public void nullTest() {
        String name = "my big fat acct";
        assertThat(name, is(not(nullValue())));
        assertThat(name, is(notNullValue()));
    }
}
