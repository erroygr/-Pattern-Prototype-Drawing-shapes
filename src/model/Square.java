package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {
    @Override
  public   void draw(GraphicsContext gr, Double poinX, Double poinY) {
        gr.setFill(Color.GREEN);
        gr.fillPolygon(new double[]{poinX, poinX+50,poinX+50,poinX},
                new double[]{poinY,poinY,poinY+50,poinY+50},4
        );
        //System.out.println("Рисуем Square");
    }

    //КВАДРАТ
    public Square(){
        type="Square";
    }

    public String toString(){
        return "Square";
    }
}
