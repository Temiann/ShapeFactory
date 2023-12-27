package com.example.task6.figure;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape{
    double radius;
    double x,y;

    public Circle(Color color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle";
    }
    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        gc.fillOval(x,y,radius, radius);
    }
}
