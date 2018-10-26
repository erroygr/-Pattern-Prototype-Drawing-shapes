package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {
    @Override
    public void draw(GraphicsContext gr, Double poinX, Double poinY) {
        gr.setFill(Color.BLACK);
        gr.fillPolygon(new double[]{poinX, poinX+50,poinX-20},
                new double[]{poinY,poinY+50,poinY+75},3
        );
    }


    public Triangle(){
        type="Triangle";
    }

    public String toString(){
        return "Triangle";
    }
}
