package sample;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalTime;

import static javafx.scene.AccessibleAction.FIRE;

public class Controller {

    private LocalTime total = LocalTime.of(0, 0);

    private final TextField input = new TextField("");
    private final Button add = new Button("Add");
    private final Label result = new Label(total.toString());

    Controller() {
        input.setOnAction(it -> add.executeAccessibleAction(FIRE));

        add.setOnAction(actionEvent -> {
            final InputTime inputTime = new InputTime(input.getText());

            total = total.plusHours(inputTime.hours())
                    .plusMinutes(inputTime.minutes())
                    .plusSeconds(inputTime.seconds());

            result.setText(total.toString());
            input.setText("");
        });
    }

    Node input() {
        return input;
    }

    Node add() {
        return add;
    }

    Node result() {
        return result;
    }
}
