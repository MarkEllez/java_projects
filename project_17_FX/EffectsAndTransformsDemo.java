package project_17_FX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.transform.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;

import java.awt.geom.RoundRectangle2D;

public class EffectsAndTransformsDemo extends Application {

    double angle = 0.0;
    double scaleFactor = 0.4;
    double blurVal = 1.0;

    Reflection reflection = new Reflection();
    BoxBlur blur = new BoxBlur(1, 1, 1 );
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);

    Button btnRotate = new Button("Rotate");
    Button btnBlur = new Button("Blur off");
    Button btnScale = new Button("Scale");

    Label reflect = new Label("Reflection Adds Visual Sparkle");

    public static void main (String args[]){
        launch(args);
    }

    public void start (Stage myStage) {
        myStage.setTitle("Effects and Transforms Demo");

        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);

        //добавить поворот для кнопки
        btnRotate.getTransforms().add(rotate);

        btnScale.getTransforms().add(scale);

        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);

        //кнопки btnRotate, btnBlur, btnScale
        btnRotate.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent ae){
                angle += 15.0;

                rotate.setAngle(angle);
                rotate.setPivotX(btnRotate.getWidth()/2);
                rotate.setPivotY(btnRotate.getHeight()/2);
            }
        });


        btnScale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                scaleFactor += 0.1;

                if (scaleFactor == 2.0)
                    scaleFactor = 0.4;

                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }
        });

        btnBlur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                blurVal += 0.1;

                if (blurVal == 10.0){
                    blurVal = 1.0;
                    btnBlur.setEffect(null);    //удаление эффекта размытия
                    btnBlur.setText("Blur off");
                }
                else {
                    blurVal++;
                    btnBlur.setEffect(blur);
                    btnBlur.setText("Blur on");
                }

                blur.setWidth(blurVal);
                blur.setHeight(blurVal);
            }
        });

        rootNode.getChildren().addAll(btnBlur, btnRotate, btnScale, reflect);

        myStage.show();
    }
}
