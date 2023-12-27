package com.example.task6.figure;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Rectangle extends Shape {
    double length, height;
    double x,y;

    public Rectangle(Color color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(color);
        gc.fillRect(x, y, length, height);
    }
}
