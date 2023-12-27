package com.example.task6.figure;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public abstract class Shape {
    protected Color color;
    public Shape(Color color){
        this.color = color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void setXY(double x, double y);
    public abstract String toString();
    public abstract void draw(GraphicsContext gc, double x, double y);
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
