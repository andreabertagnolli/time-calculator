package sample;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class InputTimeTest {

    @Test
    void hours_minutes_and_seconds() {
        final InputTime inputTime = new InputTime("12:1:41");

        assertThat(inputTime.hours(), is(12));
        assertThat(inputTime.minutes(), is(1));
        assertThat(inputTime.seconds(), is(41));
    }

    @Test
    void minutes_and_seconds() {
        final InputTime inputTime = new InputTime("21:25");

        assertThat(inputTime.hours(), is(0));
        assertThat(inputTime.minutes(), is(21));
        assertThat(inputTime.seconds(), is(25));
    }

    @Test
    void seconds() {
        final InputTime inputTime = new InputTime("36");

        assertThat(inputTime.hours(), is(0));
        assertThat(inputTime.minutes(), is(0));
        assertThat(inputTime.seconds(), is(36));
    }
}