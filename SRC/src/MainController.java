import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;



public class MainController {
    public Button withFly;
    public Button noFly;

    public void withFlyBtn(ActionEvent actionEvent) {
    }

    public void noFlyBtn(ActionEvent actionEvent) {
        System.out.println("you cliked me");
        Canvas canvas = new Canvas(610,910);

    }
}
