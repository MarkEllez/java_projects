package project_17_FX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class JavaFXLabelDemo extends Application {
    public static void main (String args[]){
        launch(args);
    }

    public void start (Stage myStage) {

        myStage.setTitle("Java Label Demo");

        //использование компонвоки для корневого узла (элемента)
        FlowPane rootNode = new FlowPane();

        //создание сцены
        Scene myScene = new Scene(rootNode, 300, 200);

        //добавление сцены на платформу
        myStage.setScene(myScene);

        Label myLabel = new Label("My first label");

        //
        rootNode.getChildren().add(myLabel);

        myStage.show();
    }
}
