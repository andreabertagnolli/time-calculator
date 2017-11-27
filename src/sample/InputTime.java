package sample;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class InputTime {
    private final List<Integer> time;

    public InputTime(String text) {
        this.time = Arrays.stream(text.split(":")).map(Integer::valueOf).collect(toList());
    }

    public Integer hours() {
        return time.size() == 3 ? time.get(0) : 0;
    }

    public Integer minutes() {
        return time.size() > 1 ? time.get(time.size() - 2) : 0;
    }

    public Integer seconds() {
        return time.get(time.size() - 1);
    }
}
