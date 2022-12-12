package amitoz.ass3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;



public class Ass3controller {

    @FXML
    private ColorPicker colorOptions;

    @FXML
    private TextField examineeName;

    @FXML
    private Pane AvailableSpot1;

    @FXML
    private Pane AvailableSpot2;

    @FXML
    private Pane AvailableSpot3;

    @FXML
    private Pane AvailableSpot4;

    @FXML
    private Pane AvailableSpot5;

    @FXML
    private Pane AvailableSpot6;

    @FXML
    private Pane AvailableSpot7;

    @FXML
    private Pane AvailableSpot8;

    @FXML
    private Pane AvailableSpot9;
    @FXML
    private Text examinee1;

    @FXML
    private Text examinee2;

    @FXML
    private Text examinee3;

    @FXML
    private Text examinee4;

    @FXML
    private Text examinee5;

    @FXML
    private Text examinee6;
    @FXML
    private Label errorMessage;

    @FXML
    private Text examinee7;

    @FXML
    private Text examinee8;

    @FXML
    private Text examinee9;


    ArrayList<Integer> arrlist = new ArrayList<Integer>(10);

    int Ginti=0;
    int eof=0;


    int randomFunction(int randomnum){

        while(true){
            Random rand = new Random();
            int max = 9;
            int min = 1;
            int range = max - min + 1;
            int ran = (int) (Math.random() * range) + min;

            if(arrlist.contains(ran)){
                continue;
            }else{
                arrlist.add(ran);
                return ran;

            }
        }
    }


    @FXML
    void onAddexaminee(ActionEvent event) {
        Random rand = new Random();
        int error=0;
        String name=examineeName.getText();
        Color color= colorOptions.getValue();
        if(Ginti==9){
            errorMessage.setVisible(true);
            errorMessage.setText("ALL SEATS TAKEN!! NO MORE");
        }
        int randomnum= rand.nextInt(1,10);

        int randomNum = randomFunction(randomnum);



        if(examinee1.getText().compareTo(name)==0||examinee2.getText().compareTo(name)==0||examinee3.getText().equals(name)
                ||examinee4.getText().equals(name)||examinee5.getText().equals(name)||examinee6.getText().equals(name)||
                examinee7.getText().equals(name)||examinee8.getText().equals(name)||examinee9.getText().equals(name)){
            error=1;

            arrlist.remove(arrlist.indexOf(randomNum));
        }

        if(color.toString().equals("0xffffffff"))
            error=2;
        if(AvailableSpot1.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(AvailableSpot2.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(AvailableSpot3.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(AvailableSpot4.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(AvailableSpot5.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(AvailableSpot6.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(AvailableSpot7.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(AvailableSpot8.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;
        if(AvailableSpot9.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            error=2;

        if(name.isEmpty()){
            error=6;
            errorMessage.setText("Please enter name");
            errorMessage.setVisible(true);
            arrlist.remove(randomNum);
            arrlist.remove(arrlist.indexOf(randomNum));

        }
        if(error==0){
            Ginti++;
            if(randomNum==1){
                errorMessage.setVisible(false);
                AvailableSpot1.setStyle("-fx-background-color: #" +color.toString().substring(2));
                examinee1.setText(name);
                examinee1.setVisible(true);

                if(Ginti==9){
                    errorMessage.setVisible(true);
                    errorMessage.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==2){
                errorMessage.setVisible(false);
                AvailableSpot2.setStyle("-fx-background-color: #" +color.toString().substring(2));
                examinee2.setText(name);
                examinee2.setVisible(true);
                if(Ginti==9){
                    errorMessage.setVisible(true);
                    errorMessage.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==3){
                errorMessage.setVisible(false);
                AvailableSpot3.setStyle("-fx-background-color: #" +color.toString().substring(2));
                examinee3.setText(name);
                examinee3.setVisible(true);

                if(Ginti==9){
                    errorMessage.setVisible(true);
                    errorMessage.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==4){
                errorMessage.setVisible(false);
                AvailableSpot4.setStyle("-fx-background-color: #" +color.toString().substring(2));
                examinee4.setText(name);
                examinee4.setVisible(true);
                if(Ginti==9){
                    errorMessage.setVisible(true);
                    errorMessage.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==5){
                errorMessage.setVisible(false);
                AvailableSpot5.setStyle("-fx-background-color: #" +color.toString().substring(2));
                examinee5.setText(name);
                examinee5.setVisible(true);
                if(Ginti==9){
                    errorMessage.setVisible(true);
                    errorMessage.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==6){
                errorMessage.setVisible(false);
                AvailableSpot6.setStyle("-fx-background-color: #" +color.toString().substring(2));
                examinee6.setText(name);
                examinee6.setVisible(true);
                if(Ginti==9){
                    errorMessage.setVisible(true);
                    errorMessage.setText("CONGRATULATIONS! SEATS TAKEN");eof=20;

                }

            }
            if(randomNum==7){
                errorMessage.setVisible(false);
                AvailableSpot7.setStyle("-fx-background-color: #" +color.toString().substring(2));
                examinee7.setText(name);
                examinee7.setVisible(true);
                if(Ginti==9){
                    errorMessage.setVisible(true);
                    errorMessage.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==8){
                errorMessage.setVisible(false);
                AvailableSpot8.setStyle("-fx-background-color: #" +color.toString().substring(2));
                examinee8.setText(name);
                examinee8.setVisible(true);
                if(Ginti==9){
                    errorMessage.setVisible(true);
                    errorMessage.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }

            }
            if(randomNum==9){
                errorMessage.setVisible(false);
                AvailableSpot9.setStyle("-fx-background-color: #" +color.toString().substring(2));
                examinee9.setText(name);
                examinee9.setVisible(true);
                if(Ginti==9){
                    errorMessage.setVisible(true);
                    errorMessage.setText("CONGRATULATIONS! SEATS TAKEN");
                    eof=20;
                }
            }
        }

        else if(error==1) {
            errorMessage.setText("examinee NAME TAKEN!!");
            errorMessage.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            errorMessage.setVisible(true);
//            arrlist.remove(randomNum);
            arrlist.remove((Integer) randomNum);

        }
        else if(error==2) {
            errorMessage.setText("INVALID COLOR");
            errorMessage.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            errorMessage.setVisible(true);
//            arrlist.remove(randomNum);
            arrlist.remove(arrlist.indexOf(randomNum));

        }
        else {
            errorMessage.setVisible(false);
            errorMessage.setText("SEATS ARE FULL!!");
            errorMessage.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            errorMessage.setVisible(true);
        }
    }
    @FXML
    void initialize(){
        examinee1.setVisible(false);
        examinee3.setVisible(false);
        examinee2.setVisible(false);
        examinee4.setVisible(false);
        examinee5.setVisible(false);
        examinee6.setVisible(false);
        examinee7.setVisible(false);
        examinee8.setVisible(false);
        examinee9.setVisible(false);
        errorMessage.setVisible(false);
    }


}