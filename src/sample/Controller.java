package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import model.*;

public class Controller {

    @FXML
    public ListView combo_sha;
    @FXML
    public Canvas can;

    ObservableList<Shape> items;


    public void initialize() {

        Square square =new Square();
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        items = FXCollections.observableArrayList (circle,square,rectangle,triangle);
        combo_sha.setItems(items);
    }


    public void addShape(MouseEvent x) {

        GraphicsContext gr = can.getGraphicsContext2D();
        combo_sha.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int a = combo_sha.getSelectionModel().getSelectedIndex();

        Shape new_figure = (Shape) items.get(a).clone();
        new_figure.draw(gr, x.getX(), x.getY());
    }


    public void cleanCan(){
        GraphicsContext gr = can.getGraphicsContext2D();
        gr.clearRect(0, 0, 548, 244);
    }
}
