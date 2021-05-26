package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
// mian class
public class Main extends Application {



    static Stage stage;

    @Override
   // 1st method(main/primary)
    public void start(Stage primaryStage){

        //naming the tab *top left corner of the tab*
        primaryStage.setTitle("FINANCE CALCULATOR");
        // creating 2 pains
        Pane Main_Pain= new Pane();
        Pane Pane_1 = new Pane();


        // creating a label with text "Finance Calculator"
        Label Heading = new Label("Finance Calculator ");
        // positioning the label
        Heading.setLayoutX(26.0);
        Heading.setLayoutY(23.0);
        Heading.setMinWidth(575);
        // inserting css file to the pain
        Pane_1.setId("labels");




        // placing label into its own pane
        Pane_1.getChildren().add(Heading);
        // pane 2
        Pane Pane_2= new Pane();

        /*creating button to open compound calculator and button
        * name is compound calculator
         */
        Button Go_to_comp= new Button("Compound Calculator ");
        // positioning the button and sizing
        Go_to_comp.setLayoutX(263.0);
        Go_to_comp.setLayoutY(94.0);
        Go_to_comp.setMinWidth(200);
        // inserting css file
        Go_to_comp.setId("buttons");
        //setting an action on the button to complete when clicked
        Go_to_comp.setOnAction(actionEvent -> {
            // open compoundbtn class and go to method(secondPage)
            compoundbtn.second_page();

        });








        /*creating button to go to savings calculator.
        * calculator button name is saving's calculator
        */
        Button Go_to_saving= new Button("saving's Calculator");
        // positioning and sizing the buttons
        Go_to_saving.setLayoutX(263.0);
        Go_to_saving.setLayoutY(158.0);
        Go_to_saving.setMinWidth(200);
        // css file insert
        Go_to_saving.setId("buttons");
        //setting an action to do once clicked
        Go_to_saving.setOnAction(actionEvent -> {
            //go to class=savingsbtn and method= third_page
            savingsbtn.third_page();

        });



        /*creating button to open loan class
        *name of button is loan calculator
        */
        Button Go_to_loan= new Button("loan Calculator");
        // positioning and sizing
        Go_to_loan.setLayoutX(263.0);
        Go_to_loan.setLayoutY(217.0);
        Go_to_loan.setMinWidth(200);
        // css file insert
        Go_to_loan.setId("buttons");
        // an action to be done when Go_to_loan is clicked
        Go_to_loan.setOnAction(actionEvent -> {
            //class = laonbtn, method is fourth_page
            loanbtn.fourth_page();
        });

        /* create button to go to mortgage calculator
        * name of button is mortgage calculator
        */
        Button Go_to_mort= new Button("mortgage Calculator");
        // positioning and sizing
        Go_to_mort.setLayoutX(263.0);
        Go_to_mort.setLayoutY(275.0);
        Go_to_mort.setMinWidth(200);
        //css file
        Go_to_mort.setId("buttons");
        // an action to be done when button Go_to_mort is clicked
        Go_to_mort.setOnAction(actionEvent -> {
            mortgage.fifth_page();

        });





        Pane root = new Pane();

       // adding buttons and label into the child(root)
        root.getChildren().add(Go_to_comp);
        root.getChildren().add(Go_to_saving);
        root.getChildren().add(Go_to_loan);
        root.getChildren().add(Go_to_mort);
        //adding the child pains into the main pane(one pain)
        Pane_2.getChildren().add(root);
        Main_Pain.getChildren().add(Pane_1);
        Main_Pain.getChildren().add(Pane_2);

        // adding the main pain into the scene
        Scene scene = new Scene(Main_Pain, 600, 400 );
        //setting scene as primary sage(main class from the rest)
        primaryStage.setScene(scene);
        // assigning css into the pain
        scene.getStylesheets().add(getClass().getResource("css_style.css").toExternalForm());
        //shows or display's stage onto the display
        primaryStage.show();


    }







    public static void main(String[] args) {
        launch(args);
    }
}