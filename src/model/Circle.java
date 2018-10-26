package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    @Override
   public void draw(GraphicsContext gr, Double poinX, Double poinY) {
        gr.setFill(Color.BLUE);
        gr.fillOval(poinX,poinY,60,60);
      //  System.out.println("Рисуем Circle");
    }
//КРУГ
    public Circle(){
        type="Circle";
    }

    public String toString(){
        return "Circle";
    }
}
