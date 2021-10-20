package project_17_FX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;


public class JavaFXButtonDemo extends Application {
    public static void main (String args[]){
        launch(args);
    }

    public void start (Stage myStage) {
        myStage.setTitle("It is a simple stage");

        Label response;

        FlowPane rootNode = new FlowPane(10, 10);

        //центрирование эклементов на платформе, Pos - это перечисление, содержащее список констант выравнивания
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);

        response = new Label("");

        Button Up = new Button("Up");
        Button Down = new Button("Down");


        //EventHandler - анонимный внутренний класс
        Up.setOnAction(new EventHandler <ActionEvent>(){
            public void handle (ActionEvent ae) {
                response.setText("You pressed Up");
            }
        });

        //Вместо анонимного внутреннего класса можно использовать лямбда-выражение
        //Up.setOnAction((ae) -> response.setText("You pressed Up"));

        Down.setOnAction(new EventHandler <ActionEvent>(){
            public void handle (ActionEvent ae) {
                response.setText("You pressed down");
            }
        });

        rootNode.getChildren().addAll(response, Up, Down);

        myStage.show();


    }

}
