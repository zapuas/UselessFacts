package javafxhelloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFxHelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Totally Useless Facts");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Totally Useless Facts");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);


        Button btn = new Button("#1");
        Button btn2 = new Button("#2");
        Button btn3 = new Button("#3");
        Button btn4 = new Button("#4");
        Button btn5 = new Button("#5");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        hbBtn.getChildren().add(btn2);
        hbBtn.getChildren().add(btn3);
        hbBtn.getChildren().add(btn4);
        hbBtn.getChildren().add(btn5);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("A Boeing 747s wingspan is longer than the Wrights brother's first flight!");
            }

        }
        );
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.MIDNIGHTBLUE);
                actiontarget.setText("The plastic things on the end of shoelaces are called aglets.");
            }

        }
        );
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.MEDIUMVIOLETRED);
                actiontarget.setText("The highest point in Pennsylvania is lower than the lowest point in Colorado.");
            }

        }
        );
        
        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.MAGENTA);
                actiontarget.setText("The glue on Israeli postage is certified kosher.");
            }

        }
        );

        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.TOMATO);
                actiontarget.setText("The ZIP in 'ZIPcode' means Zoning Improvement Plan.");
            }

        }
        );
        Scene scene = new Scene(grid, 450, 170);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
