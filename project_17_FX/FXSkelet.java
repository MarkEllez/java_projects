package project_17_FX;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;

import java.awt.*;

public class FXSkelet extends Application {

    public static void main (String args[]){
        System.out.println("Launching of JavaFX application");

        launch(args);   //запуск приложения
    }

    public void init() {
        System.out.println("В теле метода init()");
    }

    public void start(Stage myStage) {
        System.out.println("Body of the method Start");

        myStage.setTitle("The frame for the app");

        //Корневой узел
        FlowPane rootNode = new FlowPane();

        //Создание сцены
        Scene scene = new Scene(rootNode, 300, 200);

        //Установить сцену на платформе
        myStage.setScene(scene);

        myStage.show();
    }

    public void stop() {
        System.out.println("In the body of the method Stop");
    }

}
