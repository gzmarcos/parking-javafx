package br.org.catolicasc.parking;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
    primaryStage.setTitle("Example");
    primaryStage.setScene(new Scene(root, 300, 275));
    primaryStage.show();
  }


  public static void main(String[] args) {

    Car a = new Car();
    a.setModel("Teste");
    a.setColor("azul");
    a.setPlate("ASD-9633");

    System.out.println(a.getColor());
    System.out.println(a.getModel());
    System.out.println(a.getPlate());

    launch(args);
  }
}
