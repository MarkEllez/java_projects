package project_17_FX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;


public class ListViewDemo extends  Application {
    Label response;

    public static void main (String args[]){
        launch(args);
    }

    public void start (Stage myStage) {
        myStage.setTitle("ListView Demo");

        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 400, 300);

        myStage.setScene(myScene);

        response = new Label("Select Computer Type");

        //создать объект типа ObservableList для списка
        ObservableList<String> computerTypes = FXCollections.observableArrayList("Smartphone", "Tablet", "Notebook", "Desktop");

        //создать объект ListView
        ListView<String> lvComputers = new ListView<>(computerTypes);


        lvComputers.setPrefSize(250, 120);

        //получение модели выбора для списка
        MultipleSelectionModel<String> lvSelModel = lvComputers.getSelectionModel();

        //использование анонимного внутреннего класса
        lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                response.setText("Computer is selected: " + newValue);
            }
        });

        rootNode.getChildren().addAll(response, lvComputers);

        myStage.show();
    }
}
