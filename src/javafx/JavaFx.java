package javafx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jcarrero
 */
public class JavaFx extends Application {  //Siempre debe haber una clase que extienda de application

    @Override

    public void start(Stage primaryStage) throws FileNotFoundException {

        primaryStage.setTitle("ShowGridPane");
        /*Button button1 = new Button ("Number1");
        Button button2 = new Button ("Number2");
        
       
        
        VBox vbox = new VBox(); //Pone los botones en orientacion vertical
        
        Label label1 = new Label("Search"); 
        
        
        
       // hbox.getChildren().add(label1);  //Otra forma de añadir componentes en la forma horizontal
        
        FileInputStream input = new FileInputStream ("icon.png"); 
        
        
        
        Image image = new Image (input);
        Button boton = new Button("Volver", new ImageView(image)); // Para crear un boton con imagen
        
        Label label2 = new Label ("Search", new ImageView(image)); //Poner un incono

        
         HBox hbox = new HBox(); //Pone los botones en orientacion horizontal
         
        hbox.getChildren().add(label2);
        
        hbox.getChildren().add(boton);
        
        /*vbox.getChildren().add(hbox);
        vbox.getChildren().add(button1);
        vbox.getChildren().add(button2);*/

 /*
        // Para crear una tabla
        TableView table = new TableView();
        table.setEditable(true);
        TableColumn firstNameCol = new TableColumn ("First name");
        TableColumn lastNameCol = new TableColumn ("Last name");
        TableColumn emailCol = new TableColumn ("Email");
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        
        hbox.getChildren().add(table);
         */
 
 /*
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("First Name"), 0, 0);
        pane.add(new TextField(),0,0, 1, 0);
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name:"), 0, 2);  //El primer numero es columna y el segundo la fila
        pane.add(new TextField(), 1, 2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);*/
 
        GridPane pane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(20);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(30);
        pane.getColumnConstraints().addAll(col1,col2,col1,col2);
        Label text = new Label("Enter Adress");
        pane.add(text, 0, 0 , 4, 1); // Cuanto expande en columna y cuanto en fila
        GridPane.setHalignment(text, HPos.CENTER);
        Label direccion = new Label ("Direccion");
        pane.add(direccion, 0, 1 , 1, 1); //Columna 0, fila 1 y colspan 1
        GridPane.setHalignment(direccion, HPos.RIGHT);
        
        TextField txtDireccion = new TextField();
        pane.add(txtDireccion, 1, 1 , 4, 1);
        Label direccion2 = new Label("Direccion2");
        TextField txtDireccion2 = new TextField();
        GridPane.setHalignment(direccion2, HPos.RIGHT);
        pane.add(direccion2, 2, 2 , 4, 2);
        pane.add(txtDireccion2, 1, 2 , 4, 2);
        
        
        
       

        Scene scene = new Scene(pane, 500, 250);  //El primero es el ancho y el segundo la altura

        /*HBox fila1 = new HBox();
        fila1.getChildren().add(button1);*/
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
