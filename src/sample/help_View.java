package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.sound.sampled.Line;

public class help_View {

    //help window

    public static void info_Page() {
        Stage stage_2 = new Stage();
        AnchorPane anchorPane_1 = new AnchorPane();
        anchorPane_1.setStyle("-fx-background-image:url('download.png')");

        Label Info = new Label("You want Help?");
        Info.setLayoutX(200);
        Info.setLayoutY(10);
        Info.setId("helpbtn");


        Label Info_1 = new Label("How do you calculate ?\n\n" +
                "Leave a Text Field empty and click calculate  if you want to calculate\n that specific criteria. The answer will also be shown in  the given space\n below(Empty text field)\n the calculate button. ");
        Info_1.setLayoutX(20);
        Info_1.setLayoutY(50);
        Info_1.setMinWidth(470);
        Info_1.setId("helpbtn");





        Label Info_2 = new Label("Can I only calculate one value at a time?\n\n" +
                "Sadly this application only supports, to  only calculate one value at a time. ");
        Info_2.setLayoutX(20.0);
        Info_2.setLayoutY(200);
        Info_2.setMinWidth(470);
        Info_2.setId("helpbtn");





        Label Info_3 = new Label(" All calculation are done with" +
                " 'general' equations and may or may\n not be exact " +
                "to your needs.  ");
        Info_3.setLayoutX(20.0);
        Info_3.setLayoutY(280.0);
        Info_3.setMinWidth(470);
        Info_3.setId("helpbtn");


        Label Info_4 = new Label("1.Only one space can be left empty\n" +
                "2. interest rates is only calculated in compound calculator  ");
        Info_4.setLayoutX(20.0);
        Info_4.setLayoutY(330.0);
        Info_4.setMinWidth(470);
        Info_4.setId("helpbtn");




        Label Info_5 = new Label("For anymore further " +
                "clarification contact us via  email." +
                "Email given below  ");
        Info_5.setLayoutX(20.0);
        Info_5.setLayoutY(400.0);
        Info_5.setMinWidth(470);
        Info_5.setId("helpbtn");


        Label Info_6 = new Label(" Email: Financecalc@Gmail.com");
        Info_6.setLayoutX(20.0);
        Info_6.setLayoutY(455.0);
        Info_6.setMinWidth(470);
        Info_6.setId("helpbtn");


        Pane root_3 = new Pane();
        root_3.getChildren().add(Info);
        root_3.getChildren().add(Info_1);
        root_3.getChildren().add(Info_2);
        root_3.getChildren().add(Info_3);
        root_3.getChildren().add(Info_4);
        root_3.getChildren().add(Info_5);
        root_3.getChildren().add(Info_6);


        anchorPane_1.getChildren().add(root_3);


        Scene root3 = new Scene(anchorPane_1, 500, 500);
        anchorPane_1.getStylesheets().add(Main.class.getResource("css_style.css").toExternalForm());
        stage_2.setScene(root3);
        stage_2.show();


    }



}