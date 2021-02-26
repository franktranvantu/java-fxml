package sample;

import javafx.scene.control.Button;

public class Controller {

    public Button button;

    public void handleClick() {
        System.out.println("You clicked");
        button.setText("Click me again");
    }
}
