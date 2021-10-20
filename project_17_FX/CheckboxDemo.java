package project_17_FX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CheckboxDemo extends Application {

    CheckBox cbSmartphone;
    CheckBox cbTablet;
    CheckBox cbNotebook;
    CheckBox cbDesktop;

    Label response;
    Label selected;

    String computers;

    public static void main (String args[]){
        launch(args);
    }

    public void start (Stage myStage) {

        myStage.setTitle("Checkboxes' demonstration");

        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);

        Label heading = new Label("What computers are selected");

        response = new Label("");
        selected = new Label("");

        cbSmartphone = new CheckBox("SmartPhone");
            cbSmartphone.setAllowIndeterminate(true);
        cbNotebook = new CheckBox("Notebook");
        cbDesktop = new CheckBox("Desktop");
         cbDesktop.setAllowIndeterminate(true);
        cbTablet = new CheckBox("Tablet");

        cbSmartphone.setOnAction((ae) -> {
            if (cbSmartphone.isIndeterminate())
                response.setText("Smarthone state is indeterminate");
            else if(cbSmartphone.isSelected())
                response.setText("Smartphone was just selected");
            else
                response.setText("Smarthone was just cleared");


            showAll();
        });

        cbDesktop.setOnAction((ae) -> {
            if (cbDesktop.isIndeterminate())
                response.setText("Desktop state is indeterminate");
            else if(cbSmartphone.isSelected())
                response.setText("Desktop was just selected");
            else
                response.setText("Desktop was just cleared");

            showAll();
        });

        cbNotebook.setOnAction((ae) -> {
            if(cbNotebook.isSelected())
                response.setText("Notebook was just selected");
            else
                response.setText("Notebook was just cleared");

            showAll();
        });

        cbTablet.setOnAction((ae) -> {
            if(cbTablet.isSelected())
                response.setText("Tablet was just selected");
            else
                response.setText("Tablet was just cleared");

            showAll();
        });

        rootNode.getChildren().addAll(cbSmartphone, cbDesktop, cbNotebook, cbTablet, response, selected);

        myStage.show();

    }
    void showAll () {
        computers = "";
        if(cbSmartphone.isSelected()) computers = " Smartphone ";
        if(cbDesktop.isSelected()) computers += " Desktop ";
        if(cbNotebook.isSelected()) computers += " Notebook ";
        if(cbTablet.isSelected()) computers += " Tablet ";
        selected.setText("Computers selected: " + computers);
    }
}
