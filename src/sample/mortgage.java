package sample;



import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.text.DecimalFormat;

import static javafx.application.Application.launch;

public   class mortgage {

    //creating a public button used in a different method in the same class


    public static Button calc = new Button("Calculate");

    /*creating variables as boolean's(public) so its more easier to handle when
     * the variable is used in a place where a private variables cant access be
     * eg- diff methods or separate {}
     */


    public static Boolean  Answer_TFValid = false;
    public static Boolean I_D_TFValid = false;
    public static Boolean  M_P_TFValid = false;
    public static Boolean  I_R_TFValid = false;
    public static Boolean  N_O_Y_TFValid = false;
    public static Boolean  I_L_TFValid = false;
    public static Boolean F_V_TFValid = false;







//fifth class mortgage calculator

    public static void fifth_page() {


        Stage stage1 = new Stage();


        AnchorPane anchorPane = new AnchorPane();

        /* giving a background image to the "background" of the calculator
         * or otherwise known as giving a image background image to the whole anchorpane
         */

        anchorPane.setStyle("-fx-background-image:url('download.png')");


        stage1.setTitle("Mortgage calculator ");
        //creating a toolbar
        ToolBar NavigationBar = new ToolBar();
        NavigationBar.setLayoutX(320);
        NavigationBar.setLayoutY(10);
        //giving css file

        NavigationBar.setId("animation");

        /* creating 3 button's named NavigationBar1,
         * NavigationBar2, NavigationBar3 for the tool bar
         * giving css file to each button
         */

        Button NavigationBar1 = new Button ("Compound");
        NavigationBar1.setId("animation");
        NavigationBar.getItems().add(NavigationBar1);

        Button NavigationBar2 = new Button ("Savings");
        NavigationBar2.setId("animation");
        NavigationBar.getItems().add(NavigationBar2);

        Button NavigationBar3 = new Button ("Loan");
        NavigationBar3.setId("animation");
        NavigationBar.getItems().add(NavigationBar3);

        /*each button opens a specific window and the classname.methodname
         * is given to locate and open the respective window
         */



        NavigationBar1.setOnAction(actionEvent -> {
            compoundbtn.second_page();

        });NavigationBar2.setOnAction(actionEvent -> {
            savingsbtn.third_page();

        });NavigationBar3.setOnAction(actionEvent -> {
            loanbtn.fourth_page();

        });

        /* creating label and naming it
         *sizing and positioning the label
         * adding css file to it
         */


        Label compound = new Label("Mortgage calculator");
        compound.setLayoutX(10.0);
        compound.setLayoutY(10.0);
        compound.setMinWidth(300);
        compound.setMinHeight(80);
        compound.setId("Button_Label");

        /* creating button and naming it
         *sizing and positioning the label
         * adding css file to it
         */



        Button support = new Button("HELP");
        support.setLayoutX(370);
        support.setLayoutY(60);
        support.setId("animation");
        /*setting an action to open an new window(help_View)
         *when help button is clicked
         */

        support.setOnAction(actionEvent -> {
            help_View.info_Page();


        });

        /* the same process it used till the answer text is created
         *creating labels and naming it
         * positioning the labels
         * adding css file to it
         * creating a textfields
         * positioning the textfields
         * adding css file to it
         * giving it a user-prompt(disappears once)
         * user starts typing(.setPromptText)
         *  text colour for the prompt in textField
         *.setStyle("-fx-prompt-text-fill: black");
         * make sure the user prompts shows in this case
         * .setFocusTraversable(false);
         * text colour for the letters in label
         * .setStyle("-fx-text-fill: white");
         */


//..........................................................................................................//
        Label Initial_Loan = new Label("Loan amount or\nIf (house price=loan) price of home: ");
        TextField I_L = new TextField();
        I_L.setPromptText("LKR");
        I_L.setStyle("-fx-prompt-text-fill: black");
        I_L.setFocusTraversable(false);

        Initial_Loan.setLayoutX(39.0);
        Initial_Loan.setLayoutY(102.0);
        I_L.setId("Curve");
        Initial_Loan.setStyle("-fx-text-fill: white");

        I_L.setLayoutX(300.0);
        I_L.setLayoutY(109.0);


        Label NO_OF_YEARS = new Label("duration(yearly))/ no.of.payments: ");
        TextField N_O_Y = new TextField();
        N_O_Y.setPromptText(" years");
        N_O_Y.setStyle("-fx-prompt-text-fill: black");
        N_O_Y.setFocusTraversable(false);
        NO_OF_YEARS.setLayoutX(39.0);
        NO_OF_YEARS.setLayoutY(179.0);
        N_O_Y.setId("Curve");
        NO_OF_YEARS.setStyle("-fx-text-fill: white");

        N_O_Y.setLayoutX(300.0);
        N_O_Y.setLayoutY(185.0);


        Label Payment = new Label(" Monthly Payment: ");
        TextField M_P = new TextField();
        M_P.setPromptText("LKR");
        M_P.setStyle("-fx-prompt-text-fill: black");
        M_P.setFocusTraversable(false);

        Payment.setLayoutX(39.0);
        Payment.setLayoutY(250.0);
        M_P.setId("Curve");
        Payment.setStyle("-fx-text-fill: white");

        M_P.setLayoutX(300.0);
        M_P.setLayoutY(257.0);



        Label Interest_Rates = new Label("Interest Rates(yearly): ");
        TextField I_R = new TextField();
        I_R.setPromptText("%");
        I_R.setStyle("-fx-prompt-text-fill: black");
        Interest_Rates.setLayoutX(39.0);
        Interest_Rates.setLayoutY(314.0);
        I_R.setId("Curve");
        Interest_Rates.setStyle("-fx-text-fill: white");

        I_R.setLayoutX(300.0);
        I_R.setLayoutY(314.0);


        Label Future_Value = new Label("Future Value:");
        TextField F_V = new TextField();
        F_V.setPromptText("LKR");
        F_V.setStyle("-fx-prompt-text-fill: black");
        F_V.setFocusTraversable(false);
        Future_Value.setLayoutX(39.0);
        Future_Value.setLayoutY(385.0);
        F_V.setId("Curve");
        Future_Value.setStyle("-fx-text-fill: white");

        F_V.setLayoutX(300.0);
        F_V.setLayoutY(385.0);

//positioning the calc button made as public at the top
        calc.setLayoutX(300.0);
        calc.setLayoutY(430.0);
        calc.setMinWidth(100);
        //giving it a css file
        calc.setId("animation");
        // back button being created
        //positioning

        Button Back = new Button("Go back");
        Back.setLayoutX(40);
        Back.setLayoutY(430);
        //css file
        Back.setId("animation");


        Back.setOnAction(actionEvent -> {
            stage1.close();
        });

        TextField Answer = new TextField();
        Answer.setPromptText("Answer");
        Answer.setStyle("-fx-prompt-text-fill: black");
        Answer.setFocusTraversable(false);
        Answer.setLayoutX(300);
        Answer.setLayoutY(470);
        Answer.setId("Curve");

        //......................................................................//

        /* this process checks which elements empty with help
         *of method calc_compound, assigns answer correctly
         */



        calc.setOnAction(event -> {

            calc_Mortgage(M_P,F_V, I_L, I_R, N_O_Y);
            if (no == 1) {
                F_V.setText(rn12);
                Answer.setText(rn12);
            } else if (no == 2) {
                M_P.setText(rn12);
                Answer.setText(rn12);

            } else if (no == 3) {
                I_L.setText(rn12);
                Answer.setText(rn12);

            } else if (no == 4) {
                N_O_Y.setText(rn12);
                Answer.setText(rn12+ "years");


            }


        });

        // button to clear all content in textfields

        Button Clear = new Button("Clear All");
        Clear.setLayoutX(40);
        Clear.setLayoutY(470);
        Clear.setId("animation");

        Clear.setOnAction(ActionEvent ->{

            I_L.clear();
            I_R.clear();
            N_O_Y.clear();
            F_V.clear();
            M_P.clear();
            Answer.clear();



        });

        //creating keyboard
        // 1. creating buttons
        //2.creating boolean variable for each textfield
        /*3.(.setOnMouseClicked) is used to see what textfield is clicked and if so set
         *thats boolean variable representing that textfield as true and everything else
         * as false. repeate for all textfields
         */
        // assinging a number to each textfield
        //putting it in a grid pain to display it more nicely and orderly

//...................................................................................................................//



        AnchorPane pane1 = new AnchorPane();


        Button btn0 = new Button("0");
        btn0.setId("keyboard");
        btn0.setMinWidth(70);
        btn0.setMinHeight(70);


        Button btn1 = new Button("1");
        btn1.setId("keyboard");
        btn1.setMinWidth(70);
        btn1.setMinHeight(70);
        Button btn2 = new Button("2");
        btn2.setId("keyboard");
        btn2.setMinWidth(70);
        btn2.setMinHeight(70);
        Button btn3 = new Button("3");
        btn3.setId("keyboard");
        btn3.setMinWidth(70);
        btn3.setMinHeight(70);
        Button btn4 = new Button("4");
        btn4.setId("keyboard");
        btn4.setMinWidth(70);
        btn4.setMinHeight(70);
        Button btn5 = new Button("5");
        btn5.setId("keyboard");
        btn5.setMinWidth(70);
        btn5.setMinHeight(70);
        Button btn6 = new Button("6");
        btn6.setId("keyboard");
        btn6.setMinWidth(70);
        btn6.setMinHeight(70);
        Button btn7 = new Button("7");
        btn7.setId("keyboard");
        btn7.setMinWidth(70);
        btn7.setMinHeight(70);
        Button btn8 = new Button("8");
        btn8.setId("keyboard");
        btn8.setMinWidth(70);
        btn8.setMinHeight(70);
        Button btn9 = new Button("9");
        btn9.setId("keyboard");
        btn9.setMinWidth(70);
        btn9.setMinHeight(70);
        Button btndot = new Button(".");
        btndot.setId("keyboard");
        btndot.setMinWidth(70);
        btndot.setMinHeight(70);





        I_L.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {


                Answer_TFValid = false;
                I_D_TFValid = false;
                M_P_TFValid = false;
                I_R_TFValid = false;
                N_O_Y_TFValid = false;
                I_L_TFValid = true;
                F_V_TFValid = false;

            }
        });





        F_V.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {

                Answer_TFValid = false;
                I_D_TFValid = false;
                M_P_TFValid = false;
                I_R_TFValid = false;
                N_O_Y_TFValid = false;
                I_L_TFValid = false;
                F_V_TFValid = true;

            }
        });


        Answer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {


                Answer_TFValid = true;
                I_D_TFValid = false;
                M_P_TFValid = false;
                I_R_TFValid = false;
                N_O_Y_TFValid = false;
                I_L_TFValid = false;
                F_V_TFValid = false;


            }
        });


        I_R.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {


                Answer_TFValid = false;
                I_D_TFValid = false;
                M_P_TFValid = false;
                I_R_TFValid = true;
                N_O_Y_TFValid = false;
                I_L_TFValid = false;
                F_V_TFValid = false;


            }
        });


        M_P.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {

                Answer_TFValid = false;
                I_D_TFValid = false;
                M_P_TFValid = true;
                I_R_TFValid = false;
                N_O_Y_TFValid = false;
                I_L_TFValid = false;
                F_V_TFValid = false;


            }
        });



        N_O_Y.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {

                Answer_TFValid = false;
                I_D_TFValid = false;
                M_P_TFValid = false;
                I_R_TFValid = false;
                N_O_Y_TFValid = true;
                I_L_TFValid = false;
                F_V_TFValid = false;


            }
        });


        btn0.setOnAction(ActionEvent -> {


            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "0");
            } else if (I_L_TFValid == true) {
                I_L.setText(I_L.getText() + "0");
            } else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + "0");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + "0");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + "0");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + "0");
            }

        });


        btn1.setOnAction(ActionEvent -> {


            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "1");

            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + "1");
            } else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + "1");
            } else if (I_R_TFValid == true) {


                I_R.setText(I_R.getText() + "1");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + "1");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + "1");
            }


        });

        btn2.setOnAction(ActionEvent -> {


            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "2");

            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + "2");
            } else if (N_O_Y_TFValid == true) {


                N_O_Y.setText(N_O_Y.getText() + "2");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + "2");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + "2");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + "2");
            }


        });

        btn3.setOnAction(ActionEvent -> {


            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "3");
            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + "3");
            }  else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + "3");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + "3");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + "3");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + "3");
            }

        });

        btn4.setOnAction(ActionEvent -> {

            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "4");

            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + "4");
            }  else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + "4");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + "4");
            } else if (M_P_TFValid == true) {
                M_P.setText(M_P.getText() + "4");
            } else if (Answer_TFValid == true) {

                Answer.setText(Answer.getText() + "4");
            }


        });

        btn5.setOnAction(ActionEvent -> {


            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "5");

            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + "5");
            }
            else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + "5");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + "5");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + "5");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + "5");
            }

        });

        btn6.setOnAction(ActionEvent -> {


            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "6");

            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + "6");
            } else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + "6");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + "6");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + "6");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + "6");
            }


        });
        btn7.setOnAction(ActionEvent -> {

            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "7");

            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + "7");


            } else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + "7");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + "7");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + "7");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + "7");
            }


        });

        btn8.setOnAction(ActionEvent -> {


            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "8");

            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + "8");
            } else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + "8");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + "8");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + "8");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + "8");
            }


        });

        btn9.setOnAction(ActionEvent -> {

            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + "9");

            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + "9");
            } else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + "9");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + "9");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + "9");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + "9");
            }

        });

        btndot.setOnAction(ActionEvent -> {


            if (F_V_TFValid == true) {

                F_V.setText(F_V.getText() + ".");

            } else if (I_L_TFValid == true) {

                I_L.setText(I_L.getText() + ".");
            } else if (N_O_Y_TFValid == true) {

                N_O_Y.setText(N_O_Y.getText() + ".");
            } else if (I_R_TFValid == true) {

                I_R.setText(I_R.getText() + ".");
            } else if (M_P_TFValid == true) {

                M_P.setText(M_P.getText() + ".");
            } else if (Answer_TFValid == true) {
                Answer.setText(Answer.getText() + ".");
            }

        });






        GridPane gpane1 = new GridPane();
        gpane1.setLayoutX(600);
        gpane1.setLayoutY(100);
        gpane1.setMinSize(100, 100);
        gpane1.add(btn7, 0, 0, 1, 1);
        gpane1.add(btn8, 1, 0, 1, 1);
        gpane1.add(btn9, 2, 0, 1, 1);
        gpane1.add(btn4, 0, 1, 1, 1);
        gpane1.add(btn5, 1, 1, 1, 1);
        gpane1.add(btn6, 2, 1, 1, 1);
        gpane1.add(btn3, 0, 2, 1, 1);
        gpane1.add(btn2, 1, 2, 1, 1);
        gpane1.add(btn1, 2, 2, 1, 1);
        gpane1.add(btn0, 0, 3, 1, 1);
        gpane1.add(btndot, 1, 3, 1, 1);
        pane1.getChildren().add(gpane1);



        //..................................................................................................................//

// assinging all labels/textfields/buttons,etc onto the ancherpane
        Pane root_2 = new Pane();

        root_2.getChildren().add(pane1);

        root_2.getChildren().add(Payment);
        root_2.getChildren().add(M_P);

        root_2.getChildren().add(NavigationBar);


        root_2.getChildren().add(calc);

        root_2.getChildren().add(Clear);

        root_2.getChildren().add(support);

        root_2.getChildren().add(Back);

        root_2.getChildren().add(Answer);

        root_2.getChildren().add(compound);

        root_2.getChildren().add(Initial_Loan);
        root_2.getChildren().add(I_L);


        root_2.getChildren().add(NO_OF_YEARS);
        root_2.getChildren().add(N_O_Y);

        root_2.getChildren().add(Interest_Rates);
        root_2.getChildren().add(I_R);

        root_2.getChildren().add(Future_Value);
        root_2.getChildren().add(F_V);

        anchorPane.getChildren().add(root_2);

        Scene root3 = new Scene(anchorPane, 900, 700);
        stage1.setScene(root3);
        anchorPane.getStylesheets().add(Main.class.getResource("css_style.css").toExternalForm());


        stage1.show();
    }
    // variable to hold values for the calculation
    public static Double rn1;
    public static Double rn2;
    public static Double rn3;
    public static Double rn4;
    public static Double rn5;
    public static Double rn6;
    public static Double rn7;
    public static Double rn8;
    public static Double rn9;
    public static Double rn10;
    public static Double rn11;
    public static String rn12;


    public static int no = 0;

    //second method used for the calcualtion


    public static void calc_Mortgage(TextField M_P, TextField F_V, TextField I_L, TextField I_R, TextField N_O_Y) {
        String m = M_P.getText();
        String p = I_L.getText();
        String a = F_V.getText();
        String r = I_R.getText();
        String t = N_O_Y.getText();//years
        String n = "12"; // months

        DecimalFormat df = new DecimalFormat("0.00");

        // if condition see see what textfield is empty and not, to what should be calculated and not

        // calculate Future value
        if (!M_P.getText().equals("") && !I_L.getText().equals("") && !I_R.getText().equals("") && !N_O_Y.getText().equals("")) {




            rn12="0";
            no = 1;


            //monthly  Payment
        } else if (!I_R.getText().equals("") && !I_L.getText().equals("") && !F_V.getText().equals("") && !N_O_Y.getText().equals("")) {
            Double A = Double.parseDouble(a);
            Double R = Double.parseDouble(r);
            R = (R / (100*12));
            Double P = Double.parseDouble(p);
            Double N = Double.parseDouble(n);
            Double T = Double.parseDouble(t);
            N=(T*N);


            rn1=(1+R);
            rn2=Math.pow(rn1,-N);
            rn3=(1-rn2);
            rn4=(P*R);
            rn5=(rn4/rn3);
            rn12=df.format(rn5);
            no=2;



            // initial loan
        } else if (!M_P.getText().equals("") && !I_R.getText().equals("") && !F_V.getText().equals("") && !N_O_Y.getText().equals("")) {
            Double N = Double.parseDouble(n);
            Double T = Double.parseDouble(t);
            N=(T*N);

            Double M = Double.parseDouble(m);
            Double R = Double.parseDouble(r);
            Double A = Double.parseDouble(a);

            rn1=(R / (100*12));
            rn2=(1+rn1 );
            rn3=Math.pow(rn2,-N);
            rn4=(1-rn3);
            rn5=(M/rn1);
            rn6=rn5*rn4;
            rn12=df.format(rn6);
            no=3;




            //no.of.payments
        } else if (!M_P.getText().equals("") && !I_L.getText().equals("") && !I_R.getText().equals("") && !F_V.getText().equals("")) {
            Double R = Double.parseDouble(r);
            R = (R / (100*12));
            Double A = Double.parseDouble(a);
            Double P = Double.parseDouble(p);
            Double M = Double.parseDouble(m);


            rn1 = Math.log10(1+R);
            rn2=((R*P)/M);
            rn3 =1-rn2;
            rn4=Math.log10(rn3);
            rn5=Math.log10(rn1);
            rn6=(rn4/rn5);
            rn7=(12/rn6);
            rn12=df.format(rn7);
            no=4;


        }


    }
}