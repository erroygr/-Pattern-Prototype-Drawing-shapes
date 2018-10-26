package model;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape implements Cloneable {

    protected String type;


    public abstract void draw(GraphicsContext gr, Double poinX, Double poinY);


    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
