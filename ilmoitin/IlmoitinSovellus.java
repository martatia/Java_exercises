package ilmoitin;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IlmoitinSovellus extends Application{
    @Override
    public void start(Stage ikkuna) {
        VBox tekstit = new VBox();
        TextField Teksti = new TextField();
        Button nappi = new Button("Päivitä");
        Label lab = new Label();
        tekstit.getChildren().add(Teksti);
        tekstit.getChildren().add(nappi);
        tekstit.getChildren().add(lab);
        nappi.setOnAction((event) -> {
        lab.setText(Teksti.getText());
    });

Scene nakyma = new Scene(tekstit);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }
}